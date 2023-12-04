// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/tenant.proto

package io.chirpstack.restapi;

public interface TenantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.Tenant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Tenant ID (UUID).
   * Note: this value will be automatically generated on create.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  String getId();
  /**
   * <pre>
   * Tenant ID (UUID).
   * Note: this value will be automatically generated on create.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Tenant name,
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  String getName();
  /**
   * <pre>
   * Tenant name,
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Tenant description.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  String getDescription();
  /**
   * <pre>
   * Tenant description.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Can the tenant create and "own" Gateways?
   * </pre>
   *
   * <code>bool can_have_gateways = 4;</code>
   * @return The canHaveGateways.
   */
  boolean getCanHaveGateways();

  /**
   * <pre>
   * Max. gateway count for tenant.
   * When set to 0, the tenant can have unlimited gateways.
   * </pre>
   *
   * <code>uint32 max_gateway_count = 5;</code>
   * @return The maxGatewayCount.
   */
  int getMaxGatewayCount();

  /**
   * <pre>
   * Max. device count for tenant.
   * When set to 0, the tenant can have unlimited devices.
   * </pre>
   *
   * <code>uint32 max_device_count = 6;</code>
   * @return The maxDeviceCount.
   */
  int getMaxDeviceCount();

  /**
   * <pre>
   * Private gateways.
   * Gateways under this tenant are private.
   * </pre>
   *
   * <code>bool private_gateways = 7;</code>
   * @return The privateGateways.
   */
  boolean getPrivateGateways();
}
