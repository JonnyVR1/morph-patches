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
public class MonetizationMsg extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationmsg";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f112id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public CoinRechargeType msgType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String msgVal;

    @NonNull
    @ProtobufIndex(index = 4)
    public OpenH5Type openType;
    public static ProtobufAdapter<MonetizationMsg> PROTOBUF_ADAPTER = new MessageNanoAdapter<MonetizationMsg>() { // from class: com.p1.mobile.putong.core.data.MonetizationMsg.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MonetizationMsg monetizationMsg) {
            String str = monetizationMsg.f112id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            CoinRechargeType coinRechargeType = monetizationMsg.msgType;
            if (coinRechargeType != null) {
                iO += CodedOutputByteBufferNano.l(2, coinRechargeType, CoinRechargeType.PROTOBUF_ADAPTER);
            }
            String str2 = monetizationMsg.msgVal;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            OpenH5Type openH5Type = monetizationMsg.openType;
            if (openH5Type != null) {
                iO += CodedOutputByteBufferNano.l(4, openH5Type, OpenH5Type.PROTOBUF_ADAPTER);
            }
            ((MessageNano) monetizationMsg).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MonetizationMsg m14373parse(nb5 nb5Var) throws IOException {
            MonetizationMsg monetizationMsg = new MonetizationMsg();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (monetizationMsg.f112id == null) {
                        monetizationMsg.f112id = "";
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
                if (iU == 10) {
                    monetizationMsg.f112id = nb5Var.s();
                } else if (iU == 18) {
                    monetizationMsg.msgType = (CoinRechargeType) nb5Var.l(CoinRechargeType.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    monetizationMsg.msgVal = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (monetizationMsg.f112id == null) {
                            monetizationMsg.f112id = "";
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
                    monetizationMsg.openType = (OpenH5Type) nb5Var.l(OpenH5Type.PROTOBUF_ADAPTER);
                }
            }
            return monetizationMsg;
        }

        public void serialize(MonetizationMsg monetizationMsg, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = monetizationMsg.f112id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            CoinRechargeType coinRechargeType = monetizationMsg.msgType;
            if (coinRechargeType != null) {
                codedOutputByteBufferNano.K(2, coinRechargeType, CoinRechargeType.PROTOBUF_ADAPTER);
            }
            String str2 = monetizationMsg.msgVal;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            OpenH5Type openH5Type = monetizationMsg.openType;
            if (openH5Type != null) {
                codedOutputByteBufferNano.K(4, openH5Type, OpenH5Type.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MonetizationMsg> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationMsg>() { // from class: com.p1.mobile.putong.core.data.MonetizationMsg.2
        public Class getDataClass() {
            return MonetizationMsg.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MonetizationMsg m14374newInstance() {
            return new MonetizationMsg();
        }

        public boolean parseField(MonetizationMsg monetizationMsg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "msgVal":
                    monetizationMsg.msgVal = jsonParser.getValueAsString();
                    return true;
                case "openType":
                    monetizationMsg.openType = (OpenH5Type) OpenH5Type.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    monetizationMsg.f112id = jsonParser.getValueAsString();
                    return false;
                case "msgType":
                    monetizationMsg.msgType = (CoinRechargeType) CoinRechargeType.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(MonetizationMsg monetizationMsg, JsonGenerator jsonGenerator) throws IOException {
            String str = monetizationMsg.f112id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationMsg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MonetizationMsg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MonetizationMsg new_() {
        MonetizationMsg monetizationMsg = new MonetizationMsg();
        monetizationMsg.nullCheck();
        return monetizationMsg;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MonetizationMsg m14372clone() {
        MonetizationMsg monetizationMsg = new MonetizationMsg();
        monetizationMsg.f112id = this.f112id;
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
        return ValueObject.util_equals(this.f112id, monetizationMsg.f112id) && ValueObject.util_equals(this.msgType, monetizationMsg.msgType) && ValueObject.util_equals(this.msgVal, monetizationMsg.msgVal) && ValueObject.util_equals(this.openType, monetizationMsg.openType);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f112id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        CoinRechargeType coinRechargeType = this.msgType;
        int iHashCode2 = (iHashCode + (coinRechargeType != null ? coinRechargeType.hashCode() : 0)) * 41;
        String str2 = this.msgVal;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        OpenH5Type openH5Type = this.openType;
        int iHashCode4 = iHashCode3 + (openH5Type != null ? openH5Type.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f112id == null) {
            this.f112id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
