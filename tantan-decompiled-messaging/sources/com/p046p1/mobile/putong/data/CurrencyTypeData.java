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
public class CurrencyTypeData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "currencytypedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String currencyType;
    public static ProtobufAdapter<CurrencyTypeData> PROTOBUF_ADAPTER = new MessageNanoAdapter<CurrencyTypeData>() { // from class: com.p1.mobile.putong.data.CurrencyTypeData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CurrencyTypeData currencyTypeData) {
            String str = currencyTypeData.currencyType;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            currencyTypeData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CurrencyTypeData parse(nb5 nb5Var) throws IOException {
            CurrencyTypeData currencyTypeData = new CurrencyTypeData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (currencyTypeData.currencyType != null) {
                        break;
                    }
                    currencyTypeData.currencyType = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (currencyTypeData.currencyType != null) {
                        break;
                    }
                    currencyTypeData.currencyType = "";
                    return currencyTypeData;
                }
                currencyTypeData.currencyType = nb5Var.m158750s();
            }
            return currencyTypeData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CurrencyTypeData currencyTypeData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = currencyTypeData.currencyType;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<CurrencyTypeData> JSON_ADAPTER = new ObjectJsonAdapter<CurrencyTypeData>() { // from class: com.p1.mobile.putong.data.CurrencyTypeData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CurrencyTypeData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CurrencyTypeData newInstance() {
            return new CurrencyTypeData();
        }

        public boolean parseField(CurrencyTypeData currencyTypeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("currencyType")) {
                return false;
            }
            currencyTypeData.currencyType = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(CurrencyTypeData currencyTypeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("currencyType")) {
                return true;
            }
            return super.parseFieldCheck(currencyTypeData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CurrencyTypeData currencyTypeData, JsonGenerator jsonGenerator) throws IOException {
            String str = currencyTypeData.currencyType;
            if (str != null) {
                jsonGenerator.writeStringField("currencyType", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CurrencyTypeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CurrencyTypeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CurrencyTypeData new_() {
        CurrencyTypeData currencyTypeData = new CurrencyTypeData();
        currencyTypeData.nullCheck();
        return currencyTypeData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CurrencyTypeData mo223809clone() {
        CurrencyTypeData currencyTypeData = new CurrencyTypeData();
        currencyTypeData.currencyType = this.currencyType;
        return currencyTypeData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CurrencyTypeData) {
            return ValueObject.util_equals(this.currencyType, ((CurrencyTypeData) obj).currencyType);
        }
        return false;
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
        String str = this.currencyType;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.currencyType == null) {
            this.currencyType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
