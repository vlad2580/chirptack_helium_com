// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package com.helium.grpc;

public interface gateway_info_stream_res_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.gateway_info_stream_res_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; Timestamp of response
   * </pre>
   *
   * <code>uint64 timestamp = 1;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <pre>
   *&#47; batch of gateways
   * </pre>
   *
   * <code>repeated .helium.iot_config.gateway_info gateways = 2;</code>
   */
  java.util.List<gateway_info>
      getGatewaysList();
  /**
   * <pre>
   *&#47; batch of gateways
   * </pre>
   *
   * <code>repeated .helium.iot_config.gateway_info gateways = 2;</code>
   */
  gateway_info getGateways(int index);
  /**
   * <pre>
   *&#47; batch of gateways
   * </pre>
   *
   * <code>repeated .helium.iot_config.gateway_info gateways = 2;</code>
   */
  int getGatewaysCount();
  /**
   * <pre>
   *&#47; batch of gateways
   * </pre>
   *
   * <code>repeated .helium.iot_config.gateway_info gateways = 2;</code>
   */
  java.util.List<? extends gateway_infoOrBuilder>
      getGatewaysOrBuilderList();
  /**
   * <pre>
   *&#47; batch of gateways
   * </pre>
   *
   * <code>repeated .helium.iot_config.gateway_info gateways = 2;</code>
   */
  gateway_infoOrBuilder getGatewaysOrBuilder(
      int index);

  /**
   * <pre>
   *&#47; sig from the config service
   * </pre>
   *
   * <code>bytes signature = 3;</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();

  /**
   * <pre>
   * pubkey binary of the signing keypair
   * </pre>
   *
   * <code>bytes signer = 4;</code>
   * @return The signer.
   */
  com.google.protobuf.ByteString getSigner();
}
