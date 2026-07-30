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
public class RiskData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "riskdata";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean limited;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<RiskData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RiskData>() { // from class: com.p1.mobile.putong.core.data.RiskData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RiskData riskData) {
            String str = riskData.text;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, riskData.limited);
            ((MessageNano) riskData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RiskData m15443parse(nb5 nb5Var) throws IOException {
            RiskData riskData = new RiskData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (riskData.text != null) {
                        break;
                    }
                    riskData.text = "";
                    break;
                }
                if (iU == 10) {
                    riskData.text = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (riskData.text != null) {
                            break;
                        }
                        riskData.text = "";
                        return riskData;
                    }
                    riskData.limited = nb5Var.g();
                }
            }
            return riskData;
        }

        public void serialize(RiskData riskData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = riskData.text;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, riskData.limited);
        }
    };
    public static JsonAdapter<RiskData> JSON_ADAPTER = new ObjectJsonAdapter<RiskData>() { // from class: com.p1.mobile.putong.core.data.RiskData.2
        public Class getDataClass() {
            return RiskData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RiskData m15444newInstance() {
            return new RiskData();
        }

        public boolean parseField(RiskData riskData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                riskData.text = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("limited")) {
                return false;
            }
            riskData.limited = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(RiskData riskData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("text") || str.equals("limited")) {
                return true;
            }
            return super.parseFieldCheck(riskData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(RiskData riskData, JsonGenerator jsonGenerator) throws IOException {
            String str = riskData.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            jsonGenerator.writeBooleanField("limited", riskData.limited);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RiskData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RiskData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RiskData new_() {
        RiskData riskData = new RiskData();
        riskData.nullCheck();
        return riskData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RiskData m15442clone() {
        RiskData riskData = new RiskData();
        riskData.text = this.text;
        riskData.limited = this.limited;
        return riskData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RiskData)) {
            return false;
        }
        RiskData riskData = (RiskData) obj;
        return ValueObject.util_equals(this.text, riskData.text) && this.limited == riskData.limited;
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
        String str = this.text;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.limited ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
