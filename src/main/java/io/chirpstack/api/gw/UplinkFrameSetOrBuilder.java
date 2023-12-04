// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gw/gw.proto

package io.chirpstack.api.gw;

public interface UplinkFrameSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gw.UplinkFrameSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * PHYPayload.
   * </pre>
   *
   * <code>bytes phy_payload = 1;</code>
   * @return The phyPayload.
   */
  com.google.protobuf.ByteString getPhyPayload();

  /**
   * <pre>
   * TX meta-data.
   * </pre>
   *
   * <code>.gw.UplinkTxInfo tx_info = 2;</code>
   * @return Whether the txInfo field is set.
   */
  boolean hasTxInfo();
  /**
   * <pre>
   * TX meta-data.
   * </pre>
   *
   * <code>.gw.UplinkTxInfo tx_info = 2;</code>
   * @return The txInfo.
   */
  UplinkTxInfo getTxInfo();
  /**
   * <pre>
   * TX meta-data.
   * </pre>
   *
   * <code>.gw.UplinkTxInfo tx_info = 2;</code>
   */
  UplinkTxInfoOrBuilder getTxInfoOrBuilder();

  /**
   * <pre>
   * RX meta-data set.
   * </pre>
   *
   * <code>repeated .gw.UplinkRxInfo rx_info = 3;</code>
   */
  java.util.List<UplinkRxInfo>
      getRxInfoList();
  /**
   * <pre>
   * RX meta-data set.
   * </pre>
   *
   * <code>repeated .gw.UplinkRxInfo rx_info = 3;</code>
   */
  UplinkRxInfo getRxInfo(int index);
  /**
   * <pre>
   * RX meta-data set.
   * </pre>
   *
   * <code>repeated .gw.UplinkRxInfo rx_info = 3;</code>
   */
  int getRxInfoCount();
  /**
   * <pre>
   * RX meta-data set.
   * </pre>
   *
   * <code>repeated .gw.UplinkRxInfo rx_info = 3;</code>
   */
  java.util.List<? extends UplinkRxInfoOrBuilder>
      getRxInfoOrBuilderList();
  /**
   * <pre>
   * RX meta-data set.
   * </pre>
   *
   * <code>repeated .gw.UplinkRxInfo rx_info = 3;</code>
   */
  UplinkRxInfoOrBuilder getRxInfoOrBuilder(
      int index);
}
