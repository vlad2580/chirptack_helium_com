// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: integration/integration.proto

package io.chirpstack.api.as.integration;

public final class IntegrationProto {
  private IntegrationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_integration_DeviceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_integration_DeviceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_integration_DeviceInfo_TagsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_integration_DeviceInfo_TagsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_integration_UplinkEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_integration_UplinkEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_integration_JoinEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_integration_JoinEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_integration_AckEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_integration_AckEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_integration_TxAckEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_integration_TxAckEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_integration_LogEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_integration_LogEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_integration_LogEvent_ContextEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_integration_LogEvent_ContextEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_integration_StatusEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_integration_StatusEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_integration_LocationEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_integration_LocationEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_integration_IntegrationEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_integration_IntegrationEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_integration_DownlinkCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_integration_DownlinkCommand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\035integration/integration.proto\022\013integra" +
      "tion\032\023common/common.proto\032\013gw/gw.proto\032\037" +
      "google/protobuf/timestamp.proto\032\034google/" +
      "protobuf/struct.proto\"\242\002\n\nDeviceInfo\022\021\n\t" +
      "tenant_id\030\001 \001(\t\022\023\n\013tenant_name\030\002 \001(\t\022\026\n\016" +
      "application_id\030\003 \001(\t\022\030\n\020application_name" +
      "\030\004 \001(\t\022\031\n\021device_profile_id\030\005 \001(\t\022\033\n\023dev" +
      "ice_profile_name\030\006 \001(\t\022\023\n\013device_name\030\007 " +
      "\001(\t\022\017\n\007dev_eui\030\010 \001(\t\022/\n\004tags\030\t \003(\0132!.int" +
      "egration.DeviceInfo.TagsEntry\032+\n\tTagsEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\331\002\n\013U" +
      "plinkEvent\022\030\n\020deduplication_id\030\001 \001(\t\022(\n\004" +
      "time\030\002 \001(\0132\032.google.protobuf.Timestamp\022," +
      "\n\013device_info\030\003 \001(\0132\027.integration.Device" +
      "Info\022\020\n\010dev_addr\030\004 \001(\t\022\013\n\003adr\030\005 \001(\010\022\n\n\002d" +
      "r\030\006 \001(\r\022\r\n\005f_cnt\030\007 \001(\r\022\016\n\006f_port\030\010 \001(\r\022\021" +
      "\n\tconfirmed\030\t \001(\010\022\014\n\004data\030\n \001(\014\022\'\n\006objec" +
      "t\030\013 \001(\0132\027.google.protobuf.Struct\022!\n\007rx_i" +
      "nfo\030\014 \003(\0132\020.gw.UplinkRxInfo\022!\n\007tx_info\030\r" +
      " \001(\0132\020.gw.UplinkTxInfo\"\217\001\n\tJoinEvent\022\030\n\020" +
      "deduplication_id\030\001 \001(\t\022(\n\004time\030\002 \001(\0132\032.g" +
      "oogle.protobuf.Timestamp\022,\n\013device_info\030" +
      "\003 \001(\0132\027.integration.DeviceInfo\022\020\n\010dev_ad" +
      "dr\030\004 \001(\t\"\275\001\n\010AckEvent\022\030\n\020deduplication_i" +
      "d\030\001 \001(\t\022(\n\004time\030\002 \001(\0132\032.google.protobuf." +
      "Timestamp\022,\n\013device_info\030\003 \001(\0132\027.integra" +
      "tion.DeviceInfo\022\025\n\rqueue_item_id\030\004 \001(\t\022\024" +
      "\n\014acknowledged\030\005 \001(\010\022\022\n\nf_cnt_down\030\006 \001(\r" +
      "\"\335\001\n\nTxAckEvent\022\023\n\013downlink_id\030\001 \001(\r\022(\n\004" +
      "time\030\002 \001(\0132\032.google.protobuf.Timestamp\022," +
      "\n\013device_info\030\003 \001(\0132\027.integration.Device" +
      "Info\022\025\n\rqueue_item_id\030\004 \001(\t\022\022\n\nf_cnt_dow" +
      "n\030\005 \001(\r\022\022\n\ngateway_id\030\006 \001(\t\022#\n\007tx_info\030\007" +
      " \001(\0132\022.gw.DownlinkTxInfo\"\246\002\n\010LogEvent\022(\n" +
      "\004time\030\001 \001(\0132\032.google.protobuf.Timestamp\022" +
      ",\n\013device_info\030\002 \001(\0132\027.integration.Devic" +
      "eInfo\022$\n\005level\030\003 \001(\0162\025.integration.LogLe" +
      "vel\022\"\n\004code\030\004 \001(\0162\024.integration.LogCode\022" +
      "\023\n\013description\030\005 \001(\t\0223\n\007context\030\006 \003(\0132\"." +
      "integration.LogEvent.ContextEntry\032.\n\014Con" +
      "textEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001\"\350\001\n\013StatusEvent\022\030\n\020deduplication_id\030\001 " +
      "\001(\t\022(\n\004time\030\002 \001(\0132\032.google.protobuf.Time" +
      "stamp\022,\n\013device_info\030\003 \001(\0132\027.integration" +
      ".DeviceInfo\022\016\n\006margin\030\005 \001(\005\022\035\n\025external_" +
      "power_source\030\006 \001(\010\022!\n\031battery_level_unav" +
      "ailable\030\007 \001(\010\022\025\n\rbattery_level\030\010 \001(\002\"\245\001\n" +
      "\rLocationEvent\022\030\n\020deduplication_id\030\001 \001(\t" +
      "\022(\n\004time\030\002 \001(\0132\032.google.protobuf.Timesta" +
      "mp\022,\n\013device_info\030\003 \001(\0132\027.integration.De" +
      "viceInfo\022\"\n\010location\030\004 \001(\0132\020.common.Loca" +
      "tion\"\333\001\n\020IntegrationEvent\022\030\n\020deduplicati" +
      "on_id\030\001 \001(\t\022(\n\004time\030\002 \001(\0132\032.google.proto" +
      "buf.Timestamp\022,\n\013device_info\030\003 \001(\0132\027.int" +
      "egration.DeviceInfo\022\030\n\020integration_name\030" +
      "\004 \001(\t\022\022\n\nevent_type\030\005 \001(\t\022\'\n\006object\030\006 \001(" +
      "\0132\027.google.protobuf.Struct\"\210\001\n\017DownlinkC" +
      "ommand\022\n\n\002id\030\001 \001(\t\022\017\n\007dev_eui\030\002 \001(\t\022\021\n\tc" +
      "onfirmed\030\003 \001(\010\022\016\n\006f_port\030\004 \001(\r\022\014\n\004data\030\005" +
      " \001(\014\022\'\n\006object\030\006 \001(\0132\027.google.protobuf.S" +
      "truct*,\n\010LogLevel\022\010\n\004INFO\020\000\022\013\n\007WARNING\020\001" +
      "\022\t\n\005ERROR\020\002*\300\001\n\007LogCode\022\013\n\007UNKNOWN\020\000\022\031\n\025" +
      "DOWNLINK_PAYLOAD_SIZE\020\001\022\020\n\014UPLINK_CODEC\020" +
      "\002\022\022\n\016DOWNLINK_CODEC\020\003\022\010\n\004OTAA\020\004\022\026\n\022UPLIN" +
      "K_F_CNT_RESET\020\005\022\016\n\nUPLINK_MIC\020\006\022\037\n\033UPLIN" +
      "K_F_CNT_RETRANSMISSION\020\007\022\024\n\020DOWNLINK_GAT" +
      "EWAY\020\010Bk\n io.chirpstack.api.as.integrati" +
      "onB\020IntegrationProtoP\001Z3github.com/broca" +
      "ar/chirpstack/api/go/v4/integrationb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.chirpstack.api.CommonProto.getDescriptor(),
          io.chirpstack.api.gw.GatewayProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_integration_DeviceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_integration_DeviceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_integration_DeviceInfo_descriptor,
        new String[] { "TenantId", "TenantName", "ApplicationId", "ApplicationName", "DeviceProfileId", "DeviceProfileName", "DeviceName", "DevEui", "Tags", });
    internal_static_integration_DeviceInfo_TagsEntry_descriptor =
      internal_static_integration_DeviceInfo_descriptor.getNestedTypes().get(0);
    internal_static_integration_DeviceInfo_TagsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_integration_DeviceInfo_TagsEntry_descriptor,
        new String[] { "Key", "Value", });
    internal_static_integration_UplinkEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_integration_UplinkEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_integration_UplinkEvent_descriptor,
        new String[] { "DeduplicationId", "Time", "DeviceInfo", "DevAddr", "Adr", "Dr", "FCnt", "FPort", "Confirmed", "Data", "Object", "RxInfo", "TxInfo", });
    internal_static_integration_JoinEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_integration_JoinEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_integration_JoinEvent_descriptor,
        new String[] { "DeduplicationId", "Time", "DeviceInfo", "DevAddr", });
    internal_static_integration_AckEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_integration_AckEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_integration_AckEvent_descriptor,
        new String[] { "DeduplicationId", "Time", "DeviceInfo", "QueueItemId", "Acknowledged", "FCntDown", });
    internal_static_integration_TxAckEvent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_integration_TxAckEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_integration_TxAckEvent_descriptor,
        new String[] { "DownlinkId", "Time", "DeviceInfo", "QueueItemId", "FCntDown", "GatewayId", "TxInfo", });
    internal_static_integration_LogEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_integration_LogEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_integration_LogEvent_descriptor,
        new String[] { "Time", "DeviceInfo", "Level", "Code", "Description", "Context", });
    internal_static_integration_LogEvent_ContextEntry_descriptor =
      internal_static_integration_LogEvent_descriptor.getNestedTypes().get(0);
    internal_static_integration_LogEvent_ContextEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_integration_LogEvent_ContextEntry_descriptor,
        new String[] { "Key", "Value", });
    internal_static_integration_StatusEvent_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_integration_StatusEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_integration_StatusEvent_descriptor,
        new String[] { "DeduplicationId", "Time", "DeviceInfo", "Margin", "ExternalPowerSource", "BatteryLevelUnavailable", "BatteryLevel", });
    internal_static_integration_LocationEvent_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_integration_LocationEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_integration_LocationEvent_descriptor,
        new String[] { "DeduplicationId", "Time", "DeviceInfo", "Location", });
    internal_static_integration_IntegrationEvent_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_integration_IntegrationEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_integration_IntegrationEvent_descriptor,
        new String[] { "DeduplicationId", "Time", "DeviceInfo", "IntegrationName", "EventType", "Object", });
    internal_static_integration_DownlinkCommand_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_integration_DownlinkCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_integration_DownlinkCommand_descriptor,
        new String[] { "Id", "DevEui", "Confirmed", "FPort", "Data", "Object", });
    io.chirpstack.api.CommonProto.getDescriptor();
    io.chirpstack.api.gw.GatewayProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}