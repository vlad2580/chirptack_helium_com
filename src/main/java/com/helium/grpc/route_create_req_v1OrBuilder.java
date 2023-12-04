// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package com.helium.grpc;

public interface route_create_req_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.route_create_req_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 oui = 1;</code>
   * @return The oui.
   */
  long getOui();

  /**
   * <code>.helium.iot_config.route_v1 route = 2;</code>
   * @return Whether the route field is set.
   */
  boolean hasRoute();
  /**
   * <code>.helium.iot_config.route_v1 route = 2;</code>
   * @return The route.
   */
  route_v1 getRoute();
  /**
   * <code>.helium.iot_config.route_v1 route = 2;</code>
   */
  route_v1OrBuilder getRouteOrBuilder();

  /**
   * <pre>
   * in milliseconds since unix epoch
   * </pre>
   *
   * <code>uint64 timestamp = 3;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>bytes signature = 4;</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();

  /**
   * <pre>
   * pubkey binary of the signing keypair
   * </pre>
   *
   * <code>bytes signer = 5;</code>
   * @return The signer.
   */
  com.google.protobuf.ByteString getSigner();
}
