package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class MonetizationMsg extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationmsg";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21192id;

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
            String str = monetizationMsg.f21192id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            CoinRechargeType coinRechargeType = monetizationMsg.msgType;
            if (coinRechargeType != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, coinRechargeType, CoinRechargeType.PROTOBUF_ADAPTER);
            }
            String str2 = monetizationMsg.msgVal;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            OpenH5Type openH5Type = monetizationMsg.openType;
            if (openH5Type != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, openH5Type, OpenH5Type.PROTOBUF_ADAPTER);
            }
            monetizationMsg.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MonetizationMsg parse(nc5 nc5Var) throws IOException {
            MonetizationMsg monetizationMsg = new MonetizationMsg();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (monetizationMsg.f21192id == null) {
                        monetizationMsg.f21192id = "";
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
                if (iM162497u == 10) {
                    monetizationMsg.f21192id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    monetizationMsg.msgType = (CoinRechargeType) nc5Var.m162488l(CoinRechargeType.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    monetizationMsg.msgVal = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (monetizationMsg.f21192id == null) {
                            monetizationMsg.f21192id = "";
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
                    monetizationMsg.openType = (OpenH5Type) nc5Var.m162488l(OpenH5Type.PROTOBUF_ADAPTER);
                }
            }
            return monetizationMsg;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MonetizationMsg monetizationMsg, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = monetizationMsg.f21192id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            CoinRechargeType coinRechargeType = monetizationMsg.msgType;
            if (coinRechargeType != null) {
                codedOutputByteBufferNano.m17309K(2, coinRechargeType, CoinRechargeType.PROTOBUF_ADAPTER);
            }
            String str2 = monetizationMsg.msgVal;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            OpenH5Type openH5Type = monetizationMsg.openType;
            if (openH5Type != null) {
                codedOutputByteBufferNano.m17309K(4, openH5Type, OpenH5Type.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MonetizationMsg> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationMsg>() { // from class: com.p1.mobile.putong.core.data.MonetizationMsg.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MonetizationMsg.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    monetizationMsg.f21192id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MonetizationMsg monetizationMsg, JsonGenerator jsonGenerator) throws IOException {
            String str = monetizationMsg.f21192id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationMsg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public MonetizationMsg mo225055clone() {
        MonetizationMsg monetizationMsg = new MonetizationMsg();
        monetizationMsg.f21192id = this.f21192id;
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
        return ValueObject.util_equals(this.f21192id, monetizationMsg.f21192id) && ValueObject.util_equals(this.msgType, monetizationMsg.msgType) && ValueObject.util_equals(this.msgVal, monetizationMsg.msgVal) && ValueObject.util_equals(this.openType, monetizationMsg.openType);
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
        String str = this.f21192id;
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
        if (this.f21192id == null) {
            this.f21192id = "";
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
