package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PrivilegeGift extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privilegegift";

    @ProtobufIndex(index = 4)
    public boolean highProbabilityBuyUser;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String f134id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public PrivilegeGiftType privilegeType;

    @ProtobufIndex(index = 1)
    public int remaining;
    public static ProtobufAdapter<PrivilegeGift> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivilegeGift>() { // from class: com.p1.mobile.putong.core.data.PrivilegeGift.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PrivilegeGift privilegeGift) {
            int iH = CodedOutputByteBufferNano.h(1, privilegeGift.remaining);
            PrivilegeGiftType privilegeGiftType = privilegeGift.privilegeType;
            if (privilegeGiftType != null) {
                iH += CodedOutputByteBufferNano.l(2, privilegeGiftType, PrivilegeGiftType.PROTOBUF_ADAPTER);
            }
            String str = privilegeGift.f134id;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            int iB = iH + CodedOutputByteBufferNano.b(4, privilegeGift.highProbabilityBuyUser);
            ((MessageNano) privilegeGift).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PrivilegeGift m14883parse(nb5 nb5Var) throws IOException {
            PrivilegeGift privilegeGift = new PrivilegeGift();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (privilegeGift.privilegeType == null) {
                        privilegeGift.privilegeType = (PrivilegeGiftType) PrivilegeGiftType.JSON_ADAPTER.defaultEnum();
                    }
                    if (privilegeGift.f134id != null) {
                        break;
                    }
                    privilegeGift.f134id = "";
                    break;
                }
                if (iU == 8) {
                    privilegeGift.remaining = nb5Var.j();
                } else if (iU == 18) {
                    privilegeGift.privilegeType = (PrivilegeGiftType) nb5Var.l(PrivilegeGiftType.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    privilegeGift.f134id = nb5Var.s();
                } else {
                    if (iU != 32) {
                        if (privilegeGift.privilegeType == null) {
                            privilegeGift.privilegeType = (PrivilegeGiftType) PrivilegeGiftType.JSON_ADAPTER.defaultEnum();
                        }
                        if (privilegeGift.f134id != null) {
                            break;
                        }
                        privilegeGift.f134id = "";
                        return privilegeGift;
                    }
                    privilegeGift.highProbabilityBuyUser = nb5Var.g();
                }
            }
            return privilegeGift;
        }

        public void serialize(PrivilegeGift privilegeGift, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, privilegeGift.remaining);
            PrivilegeGiftType privilegeGiftType = privilegeGift.privilegeType;
            if (privilegeGiftType != null) {
                codedOutputByteBufferNano.K(2, privilegeGiftType, PrivilegeGiftType.PROTOBUF_ADAPTER);
            }
            String str = privilegeGift.f134id;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            codedOutputByteBufferNano.A(4, privilegeGift.highProbabilityBuyUser);
        }
    };
    public static JsonAdapter<PrivilegeGift> JSON_ADAPTER = new ObjectJsonAdapter<PrivilegeGift>() { // from class: com.p1.mobile.putong.core.data.PrivilegeGift.2
        public Class getDataClass() {
            return PrivilegeGift.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PrivilegeGift m14884newInstance() {
            return new PrivilegeGift();
        }

        public boolean parseField(PrivilegeGift privilegeGift, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "privilegeType":
                    privilegeGift.privilegeType = (PrivilegeGiftType) PrivilegeGiftType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "highProbabilityBuyUser":
                    privilegeGift.highProbabilityBuyUser = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    privilegeGift.f134id = jsonParser.getValueAsString();
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

        public void serializeFields(PrivilegeGift privilegeGift, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", privilegeGift.remaining);
            if (privilegeGift.privilegeType != null) {
                jsonGenerator.writeFieldName("privilegeType");
                PrivilegeGiftType.JSON_ADAPTER.serialize(privilegeGift.privilegeType, jsonGenerator, true);
            }
            String str = privilegeGift.f134id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeBooleanField("highProbabilityBuyUser", privilegeGift.highProbabilityBuyUser);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivilegeGift) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivilegeGift) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivilegeGift new_() {
        PrivilegeGift privilegeGift = new PrivilegeGift();
        privilegeGift.nullCheck();
        return privilegeGift;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PrivilegeGift m14882clone() {
        PrivilegeGift privilegeGift = new PrivilegeGift();
        privilegeGift.remaining = this.remaining;
        privilegeGift.privilegeType = this.privilegeType;
        privilegeGift.f134id = this.f134id;
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
        return this.remaining == privilegeGift.remaining && ValueObject.util_equals(this.privilegeType, privilegeGift.privilegeType) && ValueObject.util_equals(this.f134id, privilegeGift.f134id) && this.highProbabilityBuyUser == privilegeGift.highProbabilityBuyUser;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.remaining) * 41;
        PrivilegeGiftType privilegeGiftType = this.privilegeType;
        int iHashCode = (i2 + (privilegeGiftType != null ? privilegeGiftType.hashCode() : 0)) * 41;
        String str = this.f134id;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + (this.highProbabilityBuyUser ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.privilegeType == null) {
            this.privilegeType = (PrivilegeGiftType) PrivilegeGiftType.JSON_ADAPTER.defaultEnum();
        }
        if (this.f134id == null) {
            this.f134id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
