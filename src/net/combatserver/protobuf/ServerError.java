// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerError.proto

package net.combatserver.protobuf;

public final class ServerError {
  private ServerError() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum ReturnStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    STATUS_OK(0, 0),
    STATUS_FAILED(1, -10),
    STATUS_ROOM_CREATE_FAILED(2, -11),
    STATUS_ROOM_FULL(3, -12),
    STATUS_ROOM_LOCKED(4, -13),
    STATUS_ROOM_NOT_FOUND(5, -14),
    STATUS_ROOM_NEED_PASWORD(6, -15),
    STATUS_ROOM_WRONG_PASSWORD(7, -16),
    STATUS_ROOM_TEMPLATE_NOT_FOUND(8, -17),
    STATUS_ROOM_NULL(9, -18),
    STATUS_REGION_FULL(10, -19),
    STATUS_REGION_NOT_FOUND(11, -20),
    STATUS_SERVER_FULL(12, -21),
    STATUS_USER_NOT_FOUND(13, -22),
    STATUS_PLUGIN_NOT_FOUND(14, -25),
    STATUS_PLUGIN_ACTION_NOT_FOUND(15, -26),
    STATUS_PLUGIN_PARAMETER_ERROR(16, -27),
    STATUS_NAME_CONTAINS_BAD_WORD(17, -30),
    STATUS_NAME_USED(18, -31),
    STATUS_AUTH_FAILED(19, -33),
    STATUS_INVID_REQUEST(20, -34),
    STATUS_INVID_REQUEST_DATA(21, -35),
    STATUS_INTERNAL_ERROR(22, -36),
    STATUS_UNKNOWN_ERROR(23, -37),
    STATUS_CONNECT_ERROR(24, -38),
    STATUS_EXPIRED_CERTIFICATE(25, -39),
    STATUS_SCHEDULED_NOT_FOUND(26, -40),
    ;
    
    public static final int STATUS_OK_VALUE = 0;
    public static final int STATUS_FAILED_VALUE = -10;
    public static final int STATUS_ROOM_CREATE_FAILED_VALUE = -11;
    public static final int STATUS_ROOM_FULL_VALUE = -12;
    public static final int STATUS_ROOM_LOCKED_VALUE = -13;
    public static final int STATUS_ROOM_NOT_FOUND_VALUE = -14;
    public static final int STATUS_ROOM_NEED_PASWORD_VALUE = -15;
    public static final int STATUS_ROOM_WRONG_PASSWORD_VALUE = -16;
    public static final int STATUS_ROOM_TEMPLATE_NOT_FOUND_VALUE = -17;
    public static final int STATUS_ROOM_NULL_VALUE = -18;
    public static final int STATUS_REGION_FULL_VALUE = -19;
    public static final int STATUS_REGION_NOT_FOUND_VALUE = -20;
    public static final int STATUS_SERVER_FULL_VALUE = -21;
    public static final int STATUS_USER_NOT_FOUND_VALUE = -22;
    public static final int STATUS_PLUGIN_NOT_FOUND_VALUE = -25;
    public static final int STATUS_PLUGIN_ACTION_NOT_FOUND_VALUE = -26;
    public static final int STATUS_PLUGIN_PARAMETER_ERROR_VALUE = -27;
    public static final int STATUS_NAME_CONTAINS_BAD_WORD_VALUE = -30;
    public static final int STATUS_NAME_USED_VALUE = -31;
    public static final int STATUS_AUTH_FAILED_VALUE = -33;
    public static final int STATUS_INVID_REQUEST_VALUE = -34;
    public static final int STATUS_INVID_REQUEST_DATA_VALUE = -35;
    public static final int STATUS_INTERNAL_ERROR_VALUE = -36;
    public static final int STATUS_UNKNOWN_ERROR_VALUE = -37;
    public static final int STATUS_CONNECT_ERROR_VALUE = -38;
    public static final int STATUS_EXPIRED_CERTIFICATE_VALUE = -39;
    public static final int STATUS_SCHEDULED_NOT_FOUND_VALUE = -40;
    
    
    public final int getNumber() { return value; }
    
    public static ReturnStatus valueOf(int value) {
      switch (value) {
        case 0: return STATUS_OK;
        case -10: return STATUS_FAILED;
        case -11: return STATUS_ROOM_CREATE_FAILED;
        case -12: return STATUS_ROOM_FULL;
        case -13: return STATUS_ROOM_LOCKED;
        case -14: return STATUS_ROOM_NOT_FOUND;
        case -15: return STATUS_ROOM_NEED_PASWORD;
        case -16: return STATUS_ROOM_WRONG_PASSWORD;
        case -17: return STATUS_ROOM_TEMPLATE_NOT_FOUND;
        case -18: return STATUS_ROOM_NULL;
        case -19: return STATUS_REGION_FULL;
        case -20: return STATUS_REGION_NOT_FOUND;
        case -21: return STATUS_SERVER_FULL;
        case -22: return STATUS_USER_NOT_FOUND;
        case -25: return STATUS_PLUGIN_NOT_FOUND;
        case -26: return STATUS_PLUGIN_ACTION_NOT_FOUND;
        case -27: return STATUS_PLUGIN_PARAMETER_ERROR;
        case -30: return STATUS_NAME_CONTAINS_BAD_WORD;
        case -31: return STATUS_NAME_USED;
        case -33: return STATUS_AUTH_FAILED;
        case -34: return STATUS_INVID_REQUEST;
        case -35: return STATUS_INVID_REQUEST_DATA;
        case -36: return STATUS_INTERNAL_ERROR;
        case -37: return STATUS_UNKNOWN_ERROR;
        case -38: return STATUS_CONNECT_ERROR;
        case -39: return STATUS_EXPIRED_CERTIFICATE;
        case -40: return STATUS_SCHEDULED_NOT_FOUND;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<ReturnStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ReturnStatus>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ReturnStatus>() {
            public ReturnStatus findValueByNumber(int number) {
              return ReturnStatus.valueOf(number);
            }
          };
    
    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return net.combatserver.protobuf.ServerError.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final ReturnStatus[] VALUES = {
      STATUS_OK, STATUS_FAILED, STATUS_ROOM_CREATE_FAILED, STATUS_ROOM_FULL, STATUS_ROOM_LOCKED, STATUS_ROOM_NOT_FOUND, STATUS_ROOM_NEED_PASWORD, STATUS_ROOM_WRONG_PASSWORD, STATUS_ROOM_TEMPLATE_NOT_FOUND, STATUS_ROOM_NULL, STATUS_REGION_FULL, STATUS_REGION_NOT_FOUND, STATUS_SERVER_FULL, STATUS_USER_NOT_FOUND, STATUS_PLUGIN_NOT_FOUND, STATUS_PLUGIN_ACTION_NOT_FOUND, STATUS_PLUGIN_PARAMETER_ERROR, STATUS_NAME_CONTAINS_BAD_WORD, STATUS_NAME_USED, STATUS_AUTH_FAILED, STATUS_INVID_REQUEST, STATUS_INVID_REQUEST_DATA, STATUS_INTERNAL_ERROR, STATUS_UNKNOWN_ERROR, STATUS_CONNECT_ERROR, STATUS_EXPIRED_CERTIFICATE, STATUS_SCHEDULED_NOT_FOUND, 
    };
    
    public static ReturnStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private ReturnStatus(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:net.combatserver.protobuf.ReturnStatus)
  }
  
  public interface ServerErrorResponseDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .net.combatserver.protobuf.ReturnStatus error = 1;
    boolean hasError();
    net.combatserver.protobuf.ServerError.ReturnStatus getError();
  }
  public static final class ServerErrorResponseData extends
      com.google.protobuf.GeneratedMessage
      implements ServerErrorResponseDataOrBuilder {
    // Use ServerErrorResponseData.newBuilder() to construct.
    private ServerErrorResponseData(Builder builder) {
      super(builder);
    }
    private ServerErrorResponseData(boolean noInit) {}
    
    private static final ServerErrorResponseData defaultInstance;
    public static ServerErrorResponseData getDefaultInstance() {
      return defaultInstance;
    }
    
    public ServerErrorResponseData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.combatserver.protobuf.ServerError.internal_static_net_combatserver_protobuf_ServerErrorResponseData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.combatserver.protobuf.ServerError.internal_static_net_combatserver_protobuf_ServerErrorResponseData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .net.combatserver.protobuf.ReturnStatus error = 1;
    public static final int ERROR_FIELD_NUMBER = 1;
    private net.combatserver.protobuf.ServerError.ReturnStatus error_;
    public boolean hasError() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public net.combatserver.protobuf.ServerError.ReturnStatus getError() {
      return error_;
    }
    
    private void initFields() {
      error_ = net.combatserver.protobuf.ServerError.ReturnStatus.STATUS_OK;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasError()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, error_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, error_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static net.combatserver.protobuf.ServerError.ServerErrorResponseData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.ServerError.ServerErrorResponseData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.ServerError.ServerErrorResponseData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.combatserver.protobuf.ServerError.ServerErrorResponseData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.ServerError.ServerErrorResponseData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.ServerError.ServerErrorResponseData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.combatserver.protobuf.ServerError.ServerErrorResponseData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.combatserver.protobuf.ServerError.ServerErrorResponseData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.combatserver.protobuf.ServerError.ServerErrorResponseData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.combatserver.protobuf.ServerError.ServerErrorResponseData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.combatserver.protobuf.ServerError.ServerErrorResponseData prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements net.combatserver.protobuf.ServerError.ServerErrorResponseDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.combatserver.protobuf.ServerError.internal_static_net_combatserver_protobuf_ServerErrorResponseData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.combatserver.protobuf.ServerError.internal_static_net_combatserver_protobuf_ServerErrorResponseData_fieldAccessorTable;
      }
      
      // Construct using net.combatserver.protobuf.ServerError.ServerErrorResponseData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        error_ = net.combatserver.protobuf.ServerError.ReturnStatus.STATUS_OK;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.combatserver.protobuf.ServerError.ServerErrorResponseData.getDescriptor();
      }
      
      public net.combatserver.protobuf.ServerError.ServerErrorResponseData getDefaultInstanceForType() {
        return net.combatserver.protobuf.ServerError.ServerErrorResponseData.getDefaultInstance();
      }
      
      public net.combatserver.protobuf.ServerError.ServerErrorResponseData build() {
        net.combatserver.protobuf.ServerError.ServerErrorResponseData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.combatserver.protobuf.ServerError.ServerErrorResponseData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.combatserver.protobuf.ServerError.ServerErrorResponseData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.combatserver.protobuf.ServerError.ServerErrorResponseData buildPartial() {
        net.combatserver.protobuf.ServerError.ServerErrorResponseData result = new net.combatserver.protobuf.ServerError.ServerErrorResponseData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.error_ = error_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.combatserver.protobuf.ServerError.ServerErrorResponseData) {
          return mergeFrom((net.combatserver.protobuf.ServerError.ServerErrorResponseData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.combatserver.protobuf.ServerError.ServerErrorResponseData other) {
        if (other == net.combatserver.protobuf.ServerError.ServerErrorResponseData.getDefaultInstance()) return this;
        if (other.hasError()) {
          setError(other.getError());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasError()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              net.combatserver.protobuf.ServerError.ReturnStatus value = net.combatserver.protobuf.ServerError.ReturnStatus.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                error_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .net.combatserver.protobuf.ReturnStatus error = 1;
      private net.combatserver.protobuf.ServerError.ReturnStatus error_ = net.combatserver.protobuf.ServerError.ReturnStatus.STATUS_OK;
      public boolean hasError() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public net.combatserver.protobuf.ServerError.ReturnStatus getError() {
        return error_;
      }
      public Builder setError(net.combatserver.protobuf.ServerError.ReturnStatus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        error_ = value;
        onChanged();
        return this;
      }
      public Builder clearError() {
        bitField0_ = (bitField0_ & ~0x00000001);
        error_ = net.combatserver.protobuf.ServerError.ReturnStatus.STATUS_OK;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.combatserver.protobuf.ServerErrorResponseData)
    }
    
    static {
      defaultInstance = new ServerErrorResponseData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.combatserver.protobuf.ServerErrorResponseData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_combatserver_protobuf_ServerErrorResponseData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_combatserver_protobuf_ServerErrorResponseData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ServerError.proto\022\031net.combatserver.pr" +
      "otobuf\"Q\n\027ServerErrorResponseData\0226\n\005err" +
      "or\030\001 \002(\0162\'.net.combatserver.protobuf.Ret" +
      "urnStatus*\337\007\n\014ReturnStatus\022\r\n\tSTATUS_OK\020" +
      "\000\022\032\n\rSTATUS_FAILED\020\366\377\377\377\377\377\377\377\377\001\022&\n\031STATUS_" +
      "ROOM_CREATE_FAILED\020\365\377\377\377\377\377\377\377\377\001\022\035\n\020STATUS_" +
      "ROOM_FULL\020\364\377\377\377\377\377\377\377\377\001\022\037\n\022STATUS_ROOM_LOCK" +
      "ED\020\363\377\377\377\377\377\377\377\377\001\022\"\n\025STATUS_ROOM_NOT_FOUND\020\362" +
      "\377\377\377\377\377\377\377\377\001\022%\n\030STATUS_ROOM_NEED_PASWORD\020\361\377" +
      "\377\377\377\377\377\377\377\001\022\'\n\032STATUS_ROOM_WRONG_PASSWORD\020\360",
      "\377\377\377\377\377\377\377\377\001\022+\n\036STATUS_ROOM_TEMPLATE_NOT_FO" +
      "UND\020\357\377\377\377\377\377\377\377\377\001\022\035\n\020STATUS_ROOM_NULL\020\356\377\377\377\377" +
      "\377\377\377\377\001\022\037\n\022STATUS_REGION_FULL\020\355\377\377\377\377\377\377\377\377\001\022$" +
      "\n\027STATUS_REGION_NOT_FOUND\020\354\377\377\377\377\377\377\377\377\001\022\037\n\022" +
      "STATUS_SERVER_FULL\020\353\377\377\377\377\377\377\377\377\001\022\"\n\025STATUS_" +
      "USER_NOT_FOUND\020\352\377\377\377\377\377\377\377\377\001\022$\n\027STATUS_PLUG" +
      "IN_NOT_FOUND\020\347\377\377\377\377\377\377\377\377\001\022+\n\036STATUS_PLUGIN" +
      "_ACTION_NOT_FOUND\020\346\377\377\377\377\377\377\377\377\001\022*\n\035STATUS_P" +
      "LUGIN_PARAMETER_ERROR\020\345\377\377\377\377\377\377\377\377\001\022*\n\035STAT" +
      "US_NAME_CONTAINS_BAD_WORD\020\342\377\377\377\377\377\377\377\377\001\022\035\n\020",
      "STATUS_NAME_USED\020\341\377\377\377\377\377\377\377\377\001\022\037\n\022STATUS_AU" +
      "TH_FAILED\020\337\377\377\377\377\377\377\377\377\001\022!\n\024STATUS_INVID_REQ" +
      "UEST\020\336\377\377\377\377\377\377\377\377\001\022&\n\031STATUS_INVID_REQUEST_" +
      "DATA\020\335\377\377\377\377\377\377\377\377\001\022\"\n\025STATUS_INTERNAL_ERROR" +
      "\020\334\377\377\377\377\377\377\377\377\001\022!\n\024STATUS_UNKNOWN_ERROR\020\333\377\377\377" +
      "\377\377\377\377\377\001\022!\n\024STATUS_CONNECT_ERROR\020\332\377\377\377\377\377\377\377\377" +
      "\001\022\'\n\032STATUS_EXPIRED_CERTIFICATE\020\331\377\377\377\377\377\377\377" +
      "\377\001\022\'\n\032STATUS_SCHEDULED_NOT_FOUND\020\330\377\377\377\377\377\377" +
      "\377\377\001B\002H\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_combatserver_protobuf_ServerErrorResponseData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_combatserver_protobuf_ServerErrorResponseData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_combatserver_protobuf_ServerErrorResponseData_descriptor,
              new java.lang.String[] { "Error", },
              net.combatserver.protobuf.ServerError.ServerErrorResponseData.class,
              net.combatserver.protobuf.ServerError.ServerErrorResponseData.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
