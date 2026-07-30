package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class VirtualVoiceGroupConversationItemInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "virtualvoicegroupconversationiteminfo";

    @NonNull
    @ProtobufIndex(index = 6)
    public String dissolveReason;

    @ProtobufIndex(index = 4)
    public boolean isDissolved;

    @ProtobufIndex(index = 8)
    public boolean isEntrance;

    @ProtobufIndex(index = 7)
    public boolean isGuest;

    @ProtobufIndex(index = 1)
    public boolean isOnTop;

    @ProtobufIndex(index = 5)
    public boolean isRemind;

    @ProtobufIndex(index = 3)
    public boolean isRemoved;

    @ProtobufIndex(index = 2)
    public boolean isShow;
    public static ProtobufAdapter<VirtualVoiceGroupConversationItemInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<VirtualVoiceGroupConversationItemInfo>() { // from class: com.p1.mobile.putong.data.VirtualVoiceGroupConversationItemInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, virtualVoiceGroupConversationItemInfo.isOnTop) + CodedOutputByteBufferNano.m17220b(2, virtualVoiceGroupConversationItemInfo.isShow) + CodedOutputByteBufferNano.m17220b(3, virtualVoiceGroupConversationItemInfo.isRemoved) + CodedOutputByteBufferNano.m17220b(4, virtualVoiceGroupConversationItemInfo.isDissolved) + CodedOutputByteBufferNano.m17220b(5, virtualVoiceGroupConversationItemInfo.isRemind);
            String str = virtualVoiceGroupConversationItemInfo.dissolveReason;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(6, str);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(7, virtualVoiceGroupConversationItemInfo.isGuest) + CodedOutputByteBufferNano.m17220b(8, virtualVoiceGroupConversationItemInfo.isEntrance);
            virtualVoiceGroupConversationItemInfo.cachedSize = iM17220b2;
            return iM17220b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VirtualVoiceGroupConversationItemInfo parse(nb5 nb5Var) throws IOException {
            VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = new VirtualVoiceGroupConversationItemInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (virtualVoiceGroupConversationItemInfo.dissolveReason != null) {
                        break;
                    }
                    virtualVoiceGroupConversationItemInfo.dissolveReason = "";
                    break;
                }
                if (iM158752u == 8) {
                    virtualVoiceGroupConversationItemInfo.isOnTop = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    virtualVoiceGroupConversationItemInfo.isShow = nb5Var.m158738g();
                } else if (iM158752u == 24) {
                    virtualVoiceGroupConversationItemInfo.isRemoved = nb5Var.m158738g();
                } else if (iM158752u == 32) {
                    virtualVoiceGroupConversationItemInfo.isDissolved = nb5Var.m158738g();
                } else if (iM158752u == 40) {
                    virtualVoiceGroupConversationItemInfo.isRemind = nb5Var.m158738g();
                } else if (iM158752u == 50) {
                    virtualVoiceGroupConversationItemInfo.dissolveReason = nb5Var.m158750s();
                } else if (iM158752u == 56) {
                    virtualVoiceGroupConversationItemInfo.isGuest = nb5Var.m158738g();
                } else {
                    if (iM158752u != 64) {
                        if (virtualVoiceGroupConversationItemInfo.dissolveReason != null) {
                            break;
                        }
                        virtualVoiceGroupConversationItemInfo.dissolveReason = "";
                        return virtualVoiceGroupConversationItemInfo;
                    }
                    virtualVoiceGroupConversationItemInfo.isEntrance = nb5Var.m158738g();
                }
            }
            return virtualVoiceGroupConversationItemInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, virtualVoiceGroupConversationItemInfo.isOnTop);
            codedOutputByteBufferNano.m17244A(2, virtualVoiceGroupConversationItemInfo.isShow);
            codedOutputByteBufferNano.m17244A(3, virtualVoiceGroupConversationItemInfo.isRemoved);
            codedOutputByteBufferNano.m17244A(4, virtualVoiceGroupConversationItemInfo.isDissolved);
            codedOutputByteBufferNano.m17244A(5, virtualVoiceGroupConversationItemInfo.isRemind);
            String str = virtualVoiceGroupConversationItemInfo.dissolveReason;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(6, str);
            }
            codedOutputByteBufferNano.m17244A(7, virtualVoiceGroupConversationItemInfo.isGuest);
            codedOutputByteBufferNano.m17244A(8, virtualVoiceGroupConversationItemInfo.isEntrance);
        }
    };
    public static JsonAdapter<VirtualVoiceGroupConversationItemInfo> JSON_ADAPTER = new ObjectJsonAdapter<VirtualVoiceGroupConversationItemInfo>() { // from class: com.p1.mobile.putong.data.VirtualVoiceGroupConversationItemInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VirtualVoiceGroupConversationItemInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VirtualVoiceGroupConversationItemInfo newInstance() {
            return new VirtualVoiceGroupConversationItemInfo();
        }

        public boolean parseField(VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isShow":
                    virtualVoiceGroupConversationItemInfo.isShow = jsonParser.getValueAsBoolean();
                    return true;
                case "isRemind":
                    virtualVoiceGroupConversationItemInfo.isRemind = jsonParser.getValueAsBoolean();
                    return true;
                case "isRemoved":
                    virtualVoiceGroupConversationItemInfo.isRemoved = jsonParser.getValueAsBoolean();
                    return true;
                case "dissolveReason":
                    virtualVoiceGroupConversationItemInfo.dissolveReason = jsonParser.getValueAsString();
                    return true;
                case "isEntrance":
                    virtualVoiceGroupConversationItemInfo.isEntrance = jsonParser.getValueAsBoolean();
                    return true;
                case "isDissolved":
                    virtualVoiceGroupConversationItemInfo.isDissolved = jsonParser.getValueAsBoolean();
                    return true;
                case "isGuest":
                    virtualVoiceGroupConversationItemInfo.isGuest = jsonParser.getValueAsBoolean();
                    return true;
                case "isOnTop":
                    virtualVoiceGroupConversationItemInfo.isOnTop = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isShow":
                case "isRemind":
                case "isRemoved":
                case "dissolveReason":
                case "isEntrance":
                case "isDissolved":
                case "isGuest":
                case "isOnTop":
                    return true;
                default:
                    return super.parseFieldCheck(virtualVoiceGroupConversationItemInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOnTop", virtualVoiceGroupConversationItemInfo.isOnTop);
            jsonGenerator.writeBooleanField("isShow", virtualVoiceGroupConversationItemInfo.isShow);
            jsonGenerator.writeBooleanField("isRemoved", virtualVoiceGroupConversationItemInfo.isRemoved);
            jsonGenerator.writeBooleanField("isDissolved", virtualVoiceGroupConversationItemInfo.isDissolved);
            jsonGenerator.writeBooleanField("isRemind", virtualVoiceGroupConversationItemInfo.isRemind);
            String str = virtualVoiceGroupConversationItemInfo.dissolveReason;
            if (str != null) {
                jsonGenerator.writeStringField("dissolveReason", str);
            }
            jsonGenerator.writeBooleanField("isGuest", virtualVoiceGroupConversationItemInfo.isGuest);
            jsonGenerator.writeBooleanField("isEntrance", virtualVoiceGroupConversationItemInfo.isEntrance);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VirtualVoiceGroupConversationItemInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VirtualVoiceGroupConversationItemInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VirtualVoiceGroupConversationItemInfo new_() {
        VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = new VirtualVoiceGroupConversationItemInfo();
        virtualVoiceGroupConversationItemInfo.nullCheck();
        return virtualVoiceGroupConversationItemInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VirtualVoiceGroupConversationItemInfo mo223809clone() {
        VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = new VirtualVoiceGroupConversationItemInfo();
        virtualVoiceGroupConversationItemInfo.isOnTop = this.isOnTop;
        virtualVoiceGroupConversationItemInfo.isShow = this.isShow;
        virtualVoiceGroupConversationItemInfo.isRemoved = this.isRemoved;
        virtualVoiceGroupConversationItemInfo.isDissolved = this.isDissolved;
        virtualVoiceGroupConversationItemInfo.isRemind = this.isRemind;
        virtualVoiceGroupConversationItemInfo.dissolveReason = this.dissolveReason;
        virtualVoiceGroupConversationItemInfo.isGuest = this.isGuest;
        virtualVoiceGroupConversationItemInfo.isEntrance = this.isEntrance;
        return virtualVoiceGroupConversationItemInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VirtualVoiceGroupConversationItemInfo)) {
            return false;
        }
        VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = (VirtualVoiceGroupConversationItemInfo) obj;
        return this.isOnTop == virtualVoiceGroupConversationItemInfo.isOnTop && this.isShow == virtualVoiceGroupConversationItemInfo.isShow && this.isRemoved == virtualVoiceGroupConversationItemInfo.isRemoved && this.isDissolved == virtualVoiceGroupConversationItemInfo.isDissolved && this.isRemind == virtualVoiceGroupConversationItemInfo.isRemind && ValueObject.util_equals(this.dissolveReason, virtualVoiceGroupConversationItemInfo.dissolveReason) && this.isGuest == virtualVoiceGroupConversationItemInfo.isGuest && this.isEntrance == virtualVoiceGroupConversationItemInfo.isEntrance;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((((((i * 41) + (this.isOnTop ? 1231 : 1237)) * 41) + (this.isShow ? 1231 : 1237)) * 41) + (this.isRemoved ? 1231 : 1237)) * 41) + (this.isDissolved ? 1231 : 1237)) * 41) + (this.isRemind ? 1231 : 1237)) * 41;
        String str = this.dissolveReason;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isGuest ? 1231 : 1237)) * 41) + (this.isEntrance ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.dissolveReason == null) {
            this.dissolveReason = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
