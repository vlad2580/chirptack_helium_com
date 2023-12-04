// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

package io.chirpstack.api;

/**
 * Protobuf enum {@code common.MacVersion}
 */
public enum MacVersion
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LORAWAN_1_0_0 = 0;</code>
   */
  LORAWAN_1_0_0(0),
  /**
   * <code>LORAWAN_1_0_1 = 1;</code>
   */
  LORAWAN_1_0_1(1),
  /**
   * <code>LORAWAN_1_0_2 = 2;</code>
   */
  LORAWAN_1_0_2(2),
  /**
   * <code>LORAWAN_1_0_3 = 3;</code>
   */
  LORAWAN_1_0_3(3),
  /**
   * <code>LORAWAN_1_0_4 = 4;</code>
   */
  LORAWAN_1_0_4(4),
  /**
   * <code>LORAWAN_1_1_0 = 5;</code>
   */
  LORAWAN_1_1_0(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LORAWAN_1_0_0 = 0;</code>
   */
  public static final int LORAWAN_1_0_0_VALUE = 0;
  /**
   * <code>LORAWAN_1_0_1 = 1;</code>
   */
  public static final int LORAWAN_1_0_1_VALUE = 1;
  /**
   * <code>LORAWAN_1_0_2 = 2;</code>
   */
  public static final int LORAWAN_1_0_2_VALUE = 2;
  /**
   * <code>LORAWAN_1_0_3 = 3;</code>
   */
  public static final int LORAWAN_1_0_3_VALUE = 3;
  /**
   * <code>LORAWAN_1_0_4 = 4;</code>
   */
  public static final int LORAWAN_1_0_4_VALUE = 4;
  /**
   * <code>LORAWAN_1_1_0 = 5;</code>
   */
  public static final int LORAWAN_1_1_0_VALUE = 5;


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
  public static MacVersion valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MacVersion forNumber(int value) {
    switch (value) {
      case 0: return LORAWAN_1_0_0;
      case 1: return LORAWAN_1_0_1;
      case 2: return LORAWAN_1_0_2;
      case 3: return LORAWAN_1_0_3;
      case 4: return LORAWAN_1_0_4;
      case 5: return LORAWAN_1_1_0;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MacVersion>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MacVersion> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MacVersion>() {
          public MacVersion findValueByNumber(int number) {
            return MacVersion.forNumber(number);
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
    return CommonProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final MacVersion[] VALUES = values();

  public static MacVersion valueOf(
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

  private MacVersion(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:common.MacVersion)
}
