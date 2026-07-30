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
public class RiskOtherData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "riskotherdata";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean limited;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<RiskOtherData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RiskOtherData>() { // from class: com.p1.mobile.putong.core.data.RiskOtherData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RiskOtherData riskOtherData) {
            String str = riskOtherData.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = riskOtherData.text;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, riskOtherData.limited);
            ((MessageNano) riskOtherData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RiskOtherData m15447parse(nb5 nb5Var) throws IOException {
            RiskOtherData riskOtherData = new RiskOtherData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (riskOtherData.type == null) {
                        riskOtherData.type = "";
                    }
                    if (riskOtherData.text != null) {
                        break;
                    }
                    riskOtherData.text = "";
                    break;
                }
                if (iU == 10) {
                    riskOtherData.type = nb5Var.s();
                } else if (iU == 18) {
                    riskOtherData.text = nb5Var.s();
                } else {
                    if (iU != 24) {
                        if (riskOtherData.type == null) {
                            riskOtherData.type = "";
                        }
                        if (riskOtherData.text != null) {
                            break;
                        }
                        riskOtherData.text = "";
                        return riskOtherData;
                    }
                    riskOtherData.limited = nb5Var.g();
                }
            }
            return riskOtherData;
        }

        public void serialize(RiskOtherData riskOtherData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = riskOtherData.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = riskOtherData.text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, riskOtherData.limited);
        }
    };
    public static JsonAdapter<RiskOtherData> JSON_ADAPTER = new ObjectJsonAdapter<RiskOtherData>() { // from class: com.p1.mobile.putong.core.data.RiskOtherData.2
        public Class getDataClass() {
            return RiskOtherData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RiskOtherData m15448newInstance() {
            return new RiskOtherData();
        }

        public boolean parseField(RiskOtherData riskOtherData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "text":
                    riskOtherData.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    riskOtherData.type = jsonParser.getValueAsString();
                    return true;
                case "limited":
                    riskOtherData.limited = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RiskOtherData riskOtherData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "text":
                case "type":
                case "limited":
                    return true;
                default:
                    return super.parseFieldCheck(riskOtherData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(RiskOtherData riskOtherData, JsonGenerator jsonGenerator) throws IOException {
            String str = riskOtherData.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = riskOtherData.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            jsonGenerator.writeBooleanField("limited", riskOtherData.limited);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RiskOtherData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RiskOtherData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RiskOtherData new_() {
        RiskOtherData riskOtherData = new RiskOtherData();
        riskOtherData.nullCheck();
        return riskOtherData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RiskOtherData m15446clone() {
        RiskOtherData riskOtherData = new RiskOtherData();
        riskOtherData.type = this.type;
        riskOtherData.text = this.text;
        riskOtherData.limited = this.limited;
        return riskOtherData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RiskOtherData)) {
            return false;
        }
        RiskOtherData riskOtherData = (RiskOtherData) obj;
        return ValueObject.util_equals(this.type, riskOtherData.type) && ValueObject.util_equals(this.text, riskOtherData.text) && this.limited == riskOtherData.limited;
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.limited ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
