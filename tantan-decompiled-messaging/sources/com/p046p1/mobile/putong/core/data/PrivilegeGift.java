package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class PrivilegeGift extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privilegegift";

    @ProtobufIndex(index = 4)
    public boolean highProbabilityBuyUser;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f20472id;

    @NonNull
    @ProtobufIndex(index = 2)
    public PrivilegeGiftType privilegeType;

    @ProtobufIndex(index = 1)
    public int remaining;
    public static ProtobufAdapter<PrivilegeGift> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivilegeGift>() { // from class: com.p1.mobile.putong.core.data.PrivilegeGift.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrivilegeGift privilegeGift) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, privilegeGift.remaining);
            PrivilegeGiftType privilegeGiftType = privilegeGift.privilegeType;
            if (privilegeGiftType != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, privilegeGiftType, PrivilegeGiftType.PROTOBUF_ADAPTER);
            }
            String str = privilegeGift.f20472id;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str);
            }
            int iM17220b = iM17226h + CodedOutputByteBufferNano.m17220b(4, privilegeGift.highProbabilityBuyUser);
            privilegeGift.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivilegeGift parse(nb5 nb5Var) throws IOException {
            PrivilegeGift privilegeGift = new PrivilegeGift();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (privilegeGift.privilegeType == null) {
                        privilegeGift.privilegeType = (PrivilegeGiftType) PrivilegeGiftType.JSON_ADAPTER.defaultEnum();
                    }
                    if (privilegeGift.f20472id != null) {
                        break;
                    }
                    privilegeGift.f20472id = "";
                    break;
                }
                if (iM158752u == 8) {
                    privilegeGift.remaining = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    privilegeGift.privilegeType = (PrivilegeGiftType) nb5Var.m158743l(PrivilegeGiftType.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    privilegeGift.f20472id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 32) {
                        if (privilegeGift.privilegeType == null) {
                            privilegeGift.privilegeType = (PrivilegeGiftType) PrivilegeGiftType.JSON_ADAPTER.defaultEnum();
                        }
                        if (privilegeGift.f20472id != null) {
                            break;
                        }
                        privilegeGift.f20472id = "";
                        return privilegeGift;
                    }
                    privilegeGift.highProbabilityBuyUser = nb5Var.m158738g();
                }
            }
            return privilegeGift;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivilegeGift privilegeGift, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, privilegeGift.remaining);
            PrivilegeGiftType privilegeGiftType = privilegeGift.privilegeType;
            if (privilegeGiftType != null) {
                codedOutputByteBufferNano.m17254K(2, privilegeGiftType, PrivilegeGiftType.PROTOBUF_ADAPTER);
            }
            String str = privilegeGift.f20472id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
            codedOutputByteBufferNano.m17244A(4, privilegeGift.highProbabilityBuyUser);
        }
    };
    public static JsonAdapter<PrivilegeGift> JSON_ADAPTER = new ObjectJsonAdapter<PrivilegeGift>() { // from class: com.p1.mobile.putong.core.data.PrivilegeGift.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivilegeGift.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrivilegeGift newInstance() {
            return new PrivilegeGift();
        }

        public boolean parseField(PrivilegeGift privilegeGift, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "privilegeType":
                    privilegeGift.privilegeType = PrivilegeGiftType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "highProbabilityBuyUser":
                    privilegeGift.highProbabilityBuyUser = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    privilegeGift.f20472id = jsonParser.getValueAsString();
                    return false;
                case "remaining":
                    privilegeGift.remaining = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PrivilegeGift privilegeGift, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "privilegeType":
                case "highProbabilityBuyUser":
                    return true;
                case "id":
                    return false;
                case "remaining":
                    return true;
                default:
                    return super.parseFieldCheck(privilegeGift, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivilegeGift privilegeGift, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", privilegeGift.remaining);
            if (privilegeGift.privilegeType != null) {
                jsonGenerator.writeFieldName("privilegeType");
                PrivilegeGiftType.JSON_ADAPTER.serialize(privilegeGift.privilegeType, jsonGenerator, true);
            }
            String str = privilegeGift.f20472id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeBooleanField("highProbabilityBuyUser", privilegeGift.highProbabilityBuyUser);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivilegeGift) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivilegeGift) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivilegeGift new_() {
        PrivilegeGift privilegeGift = new PrivilegeGift();
        privilegeGift.nullCheck();
        return privilegeGift;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrivilegeGift mo223809clone() {
        PrivilegeGift privilegeGift = new PrivilegeGift();
        privilegeGift.remaining = this.remaining;
        privilegeGift.privilegeType = this.privilegeType;
        privilegeGift.f20472id = this.f20472id;
        privilegeGift.highProbabilityBuyUser = this.highProbabilityBuyUser;
        return privilegeGift;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivilegeGift)) {
            return false;
        }
        PrivilegeGift privilegeGift = (PrivilegeGift) obj;
        return this.remaining == privilegeGift.remaining && ValueObject.util_equals(this.privilegeType, privilegeGift.privilegeType) && ValueObject.util_equals(this.f20472id, privilegeGift.f20472id) && this.highProbabilityBuyUser == privilegeGift.highProbabilityBuyUser;
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
        int i2 = ((i * 41) + this.remaining) * 41;
        PrivilegeGiftType privilegeGiftType = this.privilegeType;
        int iHashCode = (i2 + (privilegeGiftType != null ? privilegeGiftType.hashCode() : 0)) * 41;
        String str = this.f20472id;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + (this.highProbabilityBuyUser ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.privilegeType == null) {
            this.privilegeType = (PrivilegeGiftType) PrivilegeGiftType.JSON_ADAPTER.defaultEnum();
        }
        if (this.f20472id == null) {
            this.f20472id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
