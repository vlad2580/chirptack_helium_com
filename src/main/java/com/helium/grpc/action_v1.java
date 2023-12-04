// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package com.helium.grpc;

/**
 * Protobuf enum {@code helium.iot_config.action_v1}
 */
public enum action_v1
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>add = 0;</code>
   */
  add(0),
  /**
   * <code>remove = 1;</code>
   */
  remove(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>add = 0;</code>
   */
  public static final int add_VALUE = 0;
  /**
   * <code>remove = 1;</code>
   */
  public static final int remove_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static action_v1 valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static action_v1 forNumber(int value) {
    switch (value) {
      case 0: return add;
      case 1: return remove;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<action_v1>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      action_v1> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<action_v1>() {
          public action_v1 findValueByNumber(int number) {
            return action_v1.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return IotConfig.getDescriptor().getEnumTypes().get(0);
  }

  private static final action_v1[] VALUES = values();

  public static action_v1 valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private action_v1(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:helium.iot_config.action_v1)
}

