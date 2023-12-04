// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package com.helium.grpc;

public interface region_params_req_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.region_params_req_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.helium.region region = 1;</code>
   * @return The enum numeric value on the wire for region.
   */
  int getRegionValue();
  /**
   * <code>.helium.region region = 1;</code>
   * @return The region.
   */
  region getRegion();

  /**
   * <pre>
   *&#47; sig from a key known to the config service
   * </pre>
   *
   * <code>bytes signature = 2;</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();

  /**
   * <pre>
   * pubkey binary of the signing keypair
   * </pre>
   *
   * <code>bytes signer = 3;</code>
   * @return The signer.
   */
  com.google.protobuf.ByteString getSigner();
}