package com.didiglobal.thriftmock.server;

import org.apache.thrift.TBase;

import java.util.function.Function;

public interface MockServer {

  void start();
  void stop();
  void setExpectReturn(String methodName, TBase result);
  void setExpectReturn(String methodName, TBase result, int delay);
  void setExpectReturn(String methodName, TBase args, Function<TBase, TBase> mockResultFunction);

}
