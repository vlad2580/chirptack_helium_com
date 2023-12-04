// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package com.helium.grpc;

public interface admin_load_region_res_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.admin_load_region_res_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unix epoch timestamp in seconds
   * </pre>
   *
   * <code>uint64 timestamp = 1;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <pre>
   * pubkey binary of the signing keypair
   * </pre>
   *
   * <code>bytes signer = 2;</code>
   * @return The signer.
   */
  com.google.protobuf.ByteString getSigner();

  /**
   * <pre>
   * Signature over the response by the config service
   * </pre>
   *
   * <code>bytes signature = 3;</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();
}
