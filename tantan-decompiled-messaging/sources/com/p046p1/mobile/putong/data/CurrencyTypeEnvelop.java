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
public class CurrencyTypeEnvelop extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "currencytypeenvelop";

    @NonNull
    @ProtobufIndex(index = 2)
    public CurrencyTypeData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<CurrencyTypeEnvelop> PROTOBUF_ADAPTER = new MessageNanoAdapter<CurrencyTypeEnvelop>() { // from class: com.p1.mobile.putong.data.CurrencyTypeEnvelop.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CurrencyTypeEnvelop currencyTypeEnvelop) {
            Meta meta = currencyTypeEnvelop.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            CurrencyTypeData currencyTypeData = currencyTypeEnvelop.data;
            if (currencyTypeData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, currencyTypeData, CurrencyTypeData.PROTOBUF_ADAPTER);
            }
            currencyTypeEnvelop.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CurrencyTypeEnvelop parse(nb5 nb5Var) throws IOException {
            CurrencyTypeEnvelop currencyTypeEnvelop = new CurrencyTypeEnvelop();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (currencyTypeEnvelop.meta == null) {
                        currencyTypeEnvelop.meta = Meta.new_();
                    }
                    if (currencyTypeEnvelop.data != null) {
                        break;
                    }
                    currencyTypeEnvelop.data = CurrencyTypeData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    currencyTypeEnvelop.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (currencyTypeEnvelop.meta == null) {
                            currencyTypeEnvelop.meta = Meta.new_();
                        }
                        if (currencyTypeEnvelop.data != null) {
                            break;
                        }
                        currencyTypeEnvelop.data = CurrencyTypeData.new_();
                        return currencyTypeEnvelop;
                    }
                    currencyTypeEnvelop.data = (CurrencyTypeData) nb5Var.m158743l(CurrencyTypeData.PROTOBUF_ADAPTER);
                }
            }
            return currencyTypeEnvelop;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CurrencyTypeEnvelop currencyTypeEnvelop, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = currencyTypeEnvelop.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            CurrencyTypeData currencyTypeData = currencyTypeEnvelop.data;
            if (currencyTypeData != null) {
                codedOutputByteBufferNano.m17254K(2, currencyTypeData, CurrencyTypeData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CurrencyTypeEnvelop> JSON_ADAPTER = new ObjectJsonAdapter<CurrencyTypeEnvelop>() { // from class: com.p1.mobile.putong.data.CurrencyTypeEnvelop.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CurrencyTypeEnvelop.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CurrencyTypeEnvelop newInstance() {
            return new CurrencyTypeEnvelop();
        }

        public boolean parseField(CurrencyTypeEnvelop currencyTypeEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                currencyTypeEnvelop.data = CurrencyTypeData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            currencyTypeEnvelop.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CurrencyTypeEnvelop currencyTypeEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(currencyTypeEnvelop, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CurrencyTypeEnvelop currencyTypeEnvelop, JsonGenerator jsonGenerator) throws IOException {
            if (currencyTypeEnvelop.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(currencyTypeEnvelop.meta, jsonGenerator, true);
            }
            if (currencyTypeEnvelop.data != null) {
                jsonGenerator.writeFieldName("data");
                CurrencyTypeData.JSON_ADAPTER.serialize(currencyTypeEnvelop.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CurrencyTypeEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CurrencyTypeEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CurrencyTypeEnvelop new_() {
        CurrencyTypeEnvelop currencyTypeEnvelop = new CurrencyTypeEnvelop();
        currencyTypeEnvelop.nullCheck();
        return currencyTypeEnvelop;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CurrencyTypeEnvelop mo223809clone() {
        CurrencyTypeEnvelop currencyTypeEnvelop = new CurrencyTypeEnvelop();
        Meta meta = this.meta;
        if (meta != null) {
            currencyTypeEnvelop.meta = meta.mo223809clone();
        }
        CurrencyTypeData currencyTypeData = this.data;
        if (currencyTypeData != null) {
            currencyTypeEnvelop.data = currencyTypeData.mo223809clone();
        }
        return currencyTypeEnvelop;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CurrencyTypeEnvelop)) {
            return false;
        }
        CurrencyTypeEnvelop currencyTypeEnvelop = (CurrencyTypeEnvelop) obj;
        return ValueObject.util_equals(this.meta, currencyTypeEnvelop.meta) && ValueObject.util_equals(this.data, currencyTypeEnvelop.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        CurrencyTypeData currencyTypeData = this.data;
        int iHashCode2 = iHashCode + (currencyTypeData != null ? currencyTypeData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = CurrencyTypeData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
