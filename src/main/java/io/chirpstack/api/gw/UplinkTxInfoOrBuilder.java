// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gw/gw.proto

package io.chirpstack.api.gw;

public interface UplinkTxInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gw.UplinkTxInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Frequency (Hz).
   * </pre>
   *
   * <code>uint32 frequency = 1;</code>
   * @return The frequency.
   */
  int getFrequency();

  /**
   * <pre>
   * Modulation.
   * </pre>
   *
   * <code>.gw.Modulation modulation = 2;</code>
   * @return Whether the modulation field is set.
   */
  boolean hasModulation();
  /**
   * <pre>
   * Modulation.
   * </pre>
   *
   * <code>.gw.Modulation modulation = 2;</code>
   * @return The modulation.
   */
  Modulation getModulation();
  /**
   * <pre>
   * Modulation.
   * </pre>
   *
   * <code>.gw.Modulation modulation = 2;</code>
   */
  ModulationOrBuilder getModulationOrBuilder();
}
