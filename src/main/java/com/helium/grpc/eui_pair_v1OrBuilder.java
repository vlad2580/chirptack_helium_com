// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package com.helium.grpc;

public interface eui_pair_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.eui_pair_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string route_id = 1;</code>
   * @return The routeId.
   */
  String getRouteId();
  /**
   * <code>string route_id = 1;</code>
   * @return The bytes for routeId.
   */
  com.google.protobuf.ByteString
      getRouteIdBytes();

  /**
   * <code>uint64 app_eui = 2;</code>
   * @return The appEui.
   */
  long getAppEui();

  /**
   * <code>uint64 dev_eui = 3;</code>
   * @return The devEui.
   */
  long getDevEui();
}
