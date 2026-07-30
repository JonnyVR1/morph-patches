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
public class CreditScoreData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "creditscoredata";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int creditScore;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f46id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean show;
    public static ProtobufAdapter<CreditScoreData> PROTOBUF_ADAPTER = new MessageNanoAdapter<CreditScoreData>() { // from class: com.p1.mobile.putong.core.data.CreditScoreData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CreditScoreData creditScoreData) {
            String str = creditScoreData.f46id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, creditScoreData.creditScore) + CodedOutputByteBufferNano.b(3, creditScoreData.show);
            ((MessageNano) creditScoreData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CreditScoreData m12563parse(nb5 nb5Var) throws IOException {
            CreditScoreData creditScoreData = new CreditScoreData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (creditScoreData.f46id != null) {
                        break;
                    }
                    creditScoreData.f46id = "";
                    break;
                }
                if (iU == 10) {
                    creditScoreData.f46id = nb5Var.s();
                } else if (iU == 16) {
                    creditScoreData.creditScore = nb5Var.j();
                } else {
                    if (iU != 24) {
                        if (creditScoreData.f46id != null) {
                            break;
                        }
                        creditScoreData.f46id = "";
                        return creditScoreData;
                    }
                    creditScoreData.show = nb5Var.g();
                }
            }
            return creditScoreData;
        }

        public void serialize(CreditScoreData creditScoreData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = creditScoreData.f46id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, creditScoreData.creditScore);
            codedOutputByteBufferNano.A(3, creditScoreData.show);
        }
    };
    public static JsonAdapter<CreditScoreData> JSON_ADAPTER = new ObjectJsonAdapter<CreditScoreData>() { // from class: com.p1.mobile.putong.core.data.CreditScoreData.2
        public Class getDataClass() {
            return CreditScoreData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CreditScoreData m12564newInstance() {
            return new CreditScoreData();
        }

        public boolean parseField(CreditScoreData creditScoreData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "creditScore":
                    creditScoreData.creditScore = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    creditScoreData.f46id = jsonParser.getValueAsString();
                    return false;
                case "show":
                    creditScoreData.show = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CreditScoreData creditScoreData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "creditScore":
                    return true;
                case "id":
                    return false;
                case "show":
                    return true;
                default:
                    return super.parseFieldCheck(creditScoreData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CreditScoreData creditScoreData, JsonGenerator jsonGenerator) throws IOException {
            String str = creditScoreData.f46id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("creditScore", creditScoreData.creditScore);
            jsonGenerator.writeBooleanField("show", creditScoreData.show);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CreditScoreData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CreditScoreData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CreditScoreData new_() {
        CreditScoreData creditScoreData = new CreditScoreData();
        creditScoreData.nullCheck();
        return creditScoreData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CreditScoreData m12562clone() {
        CreditScoreData creditScoreData = new CreditScoreData();
        creditScoreData.f46id = this.f46id;
        creditScoreData.creditScore = this.creditScore;
        creditScoreData.show = this.show;
        return creditScoreData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreditScoreData)) {
            return false;
        }
        CreditScoreData creditScoreData = (CreditScoreData) obj;
        return ValueObject.util_equals(this.f46id, creditScoreData.f46id) && this.creditScore == creditScoreData.creditScore && this.show == creditScoreData.show;
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
        String str = this.f46id;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.creditScore) * 41) + (this.show ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.f46id == null) {
            this.f46id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
