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
public class MonetizationMsg extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationmsg";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20450id;

    @NonNull
    @ProtobufIndex(index = 2)
    public CoinRechargeType msgType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String msgVal;

    @NonNull
    @ProtobufIndex(index = 4)
    public OpenH5Type openType;
    public static ProtobufAdapter<MonetizationMsg> PROTOBUF_ADAPTER = new MessageNanoAdapter<MonetizationMsg>() { // from class: com.p1.mobile.putong.core.data.MonetizationMsg.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MonetizationMsg monetizationMsg) {
            String str = monetizationMsg.f20450id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            CoinRechargeType coinRechargeType = monetizationMsg.msgType;
            if (coinRechargeType != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, coinRechargeType, CoinRechargeType.PROTOBUF_ADAPTER);
            }
            String str2 = monetizationMsg.msgVal;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            OpenH5Type openH5Type = monetizationMsg.openType;
            if (openH5Type != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, openH5Type, OpenH5Type.PROTOBUF_ADAPTER);
            }
            monetizationMsg.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MonetizationMsg parse(nb5 nb5Var) throws IOException {
            MonetizationMsg monetizationMsg = new MonetizationMsg();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (monetizationMsg.f20450id == null) {
                        monetizationMsg.f20450id = "";
                    }
                    if (monetizationMsg.msgType == null) {
                        monetizationMsg.msgType = (CoinRechargeType) CoinRechargeType.JSON_ADAPTER.defaultEnum();
                    }
                    if (monetizationMsg.msgVal == null) {
                        monetizationMsg.msgVal = "";
                    }
                    if (monetizationMsg.openType != null) {
                        break;
                    }
                    monetizationMsg.openType = (OpenH5Type) OpenH5Type.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 10) {
                    monetizationMsg.f20450id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    monetizationMsg.msgType = (CoinRechargeType) nb5Var.m158743l(CoinRechargeType.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    monetizationMsg.msgVal = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (monetizationMsg.f20450id == null) {
                            monetizationMsg.f20450id = "";
                        }
                        if (monetizationMsg.msgType == null) {
                            monetizationMsg.msgType = (CoinRechargeType) CoinRechargeType.JSON_ADAPTER.defaultEnum();
                        }
                        if (monetizationMsg.msgVal == null) {
                            monetizationMsg.msgVal = "";
                        }
                        if (monetizationMsg.openType != null) {
                            break;
                        }
                        monetizationMsg.openType = (OpenH5Type) OpenH5Type.JSON_ADAPTER.defaultEnum();
                        return monetizationMsg;
                    }
                    monetizationMsg.openType = (OpenH5Type) nb5Var.m158743l(OpenH5Type.PROTOBUF_ADAPTER);
                }
            }
            return monetizationMsg;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MonetizationMsg monetizationMsg, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = monetizationMsg.f20450id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            CoinRechargeType coinRechargeType = monetizationMsg.msgType;
            if (coinRechargeType != null) {
                codedOutputByteBufferNano.m17254K(2, coinRechargeType, CoinRechargeType.PROTOBUF_ADAPTER);
            }
            String str2 = monetizationMsg.msgVal;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            OpenH5Type openH5Type = monetizationMsg.openType;
            if (openH5Type != null) {
                codedOutputByteBufferNano.m17254K(4, openH5Type, OpenH5Type.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MonetizationMsg> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationMsg>() { // from class: com.p1.mobile.putong.core.data.MonetizationMsg.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MonetizationMsg.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MonetizationMsg newInstance() {
            return new MonetizationMsg();
        }

        public boolean parseField(MonetizationMsg monetizationMsg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "msgVal":
                    monetizationMsg.msgVal = jsonParser.getValueAsString();
                    return true;
                case "openType":
                    monetizationMsg.openType = OpenH5Type.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    monetizationMsg.f20450id = jsonParser.getValueAsString();
                    return false;
                case "msgType":
                    monetizationMsg.msgType = CoinRechargeType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MonetizationMsg monetizationMsg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "msgVal":
                case "openType":
                    return true;
                case "id":
                    return false;
                case "msgType":
                    return true;
                default:
                    return super.parseFieldCheck(monetizationMsg, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MonetizationMsg monetizationMsg, JsonGenerator jsonGenerator) throws IOException {
            String str = monetizationMsg.f20450id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (monetizationMsg.msgType != null) {
                jsonGenerator.writeFieldName("msgType");
                CoinRechargeType.JSON_ADAPTER.serialize(monetizationMsg.msgType, jsonGenerator, true);
            }
            String str2 = monetizationMsg.msgVal;
            if (str2 != null) {
                jsonGenerator.writeStringField("msgVal", str2);
            }
            if (monetizationMsg.openType != null) {
                jsonGenerator.writeFieldName("openType");
                OpenH5Type.JSON_ADAPTER.serialize(monetizationMsg.openType, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationMsg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MonetizationMsg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MonetizationMsg new_() {
        MonetizationMsg monetizationMsg = new MonetizationMsg();
        monetizationMsg.nullCheck();
        return monetizationMsg;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MonetizationMsg mo223809clone() {
        MonetizationMsg monetizationMsg = new MonetizationMsg();
        monetizationMsg.f20450id = this.f20450id;
        monetizationMsg.msgType = this.msgType;
        monetizationMsg.msgVal = this.msgVal;
        monetizationMsg.openType = this.openType;
        return monetizationMsg;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MonetizationMsg)) {
            return false;
        }
        MonetizationMsg monetizationMsg = (MonetizationMsg) obj;
        return ValueObject.util_equals(this.f20450id, monetizationMsg.f20450id) && ValueObject.util_equals(this.msgType, monetizationMsg.msgType) && ValueObject.util_equals(this.msgVal, monetizationMsg.msgVal) && ValueObject.util_equals(this.openType, monetizationMsg.openType);
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
        int i2 = i * 41;
        String str = this.f20450id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        CoinRechargeType coinRechargeType = this.msgType;
        int iHashCode2 = (iHashCode + (coinRechargeType != null ? coinRechargeType.hashCode() : 0)) * 41;
        String str2 = this.msgVal;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        OpenH5Type openH5Type = this.openType;
        int iHashCode4 = iHashCode3 + (openH5Type != null ? openH5Type.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20450id == null) {
            this.f20450id = "";
        }
        if (this.msgType == null) {
            this.msgType = (CoinRechargeType) CoinRechargeType.JSON_ADAPTER.defaultEnum();
        }
        if (this.msgVal == null) {
            this.msgVal = "";
        }
        if (this.openType == null) {
            this.openType = (OpenH5Type) OpenH5Type.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
