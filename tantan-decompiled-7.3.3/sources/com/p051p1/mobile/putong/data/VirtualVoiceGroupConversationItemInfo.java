package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

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
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, virtualVoiceGroupConversationItemInfo.isOnTop) + CodedOutputByteBufferNano.m17275b(2, virtualVoiceGroupConversationItemInfo.isShow) + CodedOutputByteBufferNano.m17275b(3, virtualVoiceGroupConversationItemInfo.isRemoved) + CodedOutputByteBufferNano.m17275b(4, virtualVoiceGroupConversationItemInfo.isDissolved) + CodedOutputByteBufferNano.m17275b(5, virtualVoiceGroupConversationItemInfo.isRemind);
            String str = virtualVoiceGroupConversationItemInfo.dissolveReason;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(6, str);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(7, virtualVoiceGroupConversationItemInfo.isGuest) + CodedOutputByteBufferNano.m17275b(8, virtualVoiceGroupConversationItemInfo.isEntrance);
            virtualVoiceGroupConversationItemInfo.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VirtualVoiceGroupConversationItemInfo parse(nc5 nc5Var) throws IOException {
            VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = new VirtualVoiceGroupConversationItemInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (virtualVoiceGroupConversationItemInfo.dissolveReason != null) {
                        break;
                    }
                    virtualVoiceGroupConversationItemInfo.dissolveReason = "";
                    break;
                }
                if (iM162497u == 8) {
                    virtualVoiceGroupConversationItemInfo.isOnTop = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    virtualVoiceGroupConversationItemInfo.isShow = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    virtualVoiceGroupConversationItemInfo.isRemoved = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    virtualVoiceGroupConversationItemInfo.isDissolved = nc5Var.m162483g();
                } else if (iM162497u == 40) {
                    virtualVoiceGroupConversationItemInfo.isRemind = nc5Var.m162483g();
                } else if (iM162497u == 50) {
                    virtualVoiceGroupConversationItemInfo.dissolveReason = nc5Var.m162495s();
                } else if (iM162497u == 56) {
                    virtualVoiceGroupConversationItemInfo.isGuest = nc5Var.m162483g();
                } else {
                    if (iM162497u != 64) {
                        if (virtualVoiceGroupConversationItemInfo.dissolveReason != null) {
                            break;
                        }
                        virtualVoiceGroupConversationItemInfo.dissolveReason = "";
                        return virtualVoiceGroupConversationItemInfo;
                    }
                    virtualVoiceGroupConversationItemInfo.isEntrance = nc5Var.m162483g();
                }
            }
            return virtualVoiceGroupConversationItemInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, virtualVoiceGroupConversationItemInfo.isOnTop);
            codedOutputByteBufferNano.m17299A(2, virtualVoiceGroupConversationItemInfo.isShow);
            codedOutputByteBufferNano.m17299A(3, virtualVoiceGroupConversationItemInfo.isRemoved);
            codedOutputByteBufferNano.m17299A(4, virtualVoiceGroupConversationItemInfo.isDissolved);
            codedOutputByteBufferNano.m17299A(5, virtualVoiceGroupConversationItemInfo.isRemind);
            String str = virtualVoiceGroupConversationItemInfo.dissolveReason;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(6, str);
            }
            codedOutputByteBufferNano.m17299A(7, virtualVoiceGroupConversationItemInfo.isGuest);
            codedOutputByteBufferNano.m17299A(8, virtualVoiceGroupConversationItemInfo.isEntrance);
        }
    };
    public static JsonAdapter<VirtualVoiceGroupConversationItemInfo> JSON_ADAPTER = new ObjectJsonAdapter<VirtualVoiceGroupConversationItemInfo>() { // from class: com.p1.mobile.putong.data.VirtualVoiceGroupConversationItemInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VirtualVoiceGroupConversationItemInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VirtualVoiceGroupConversationItemInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public VirtualVoiceGroupConversationItemInfo mo225055clone() {
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
