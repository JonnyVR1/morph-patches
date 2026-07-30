package com.p051p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import p153l.jyb;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class Data extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "data";
    public ArrayList<BaseData> dataList;
    public static ProtobufAdapter<Data> PROTOBUF_ADAPTER = new MessageNanoAdapter<Data>() { // from class: com.p1.mobile.putong.data.Data.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Data parse(nc5 nc5Var) throws IOException {
            Data data = new Data();
            nc5Var.m162497u();
            return data;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Data data, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Data data) {
            data.cachedSize = 0;
            return 0;
        }
    };
    public static JsonAdapter<Data> JSON_ADAPTER = new ObjectJsonAdapter<Data>() { // from class: com.p1.mobile.putong.data.Data.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Data.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Data newInstance() {
            return new Data();
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Data) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public boolean parseFieldCheck(Data data, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            Objects.requireNonNull(str);
            return super.parseFieldCheck(data, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Data data, JsonGenerator jsonGenerator) throws IOException {
        }

        public boolean parseField(Data data, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            Objects.requireNonNull(str);
            return false;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Data) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Data new_() {
        Data data = new Data();
        data.nullCheck();
        return data;
    }

    private void processTopicMoment() {
    }

    public void addAll(Data data) {
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Data mo225055clone() {
        return new Data();
    }

    public boolean equals(Object obj) {
        return obj == this || (obj instanceof Data);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "data";
    }

    public <T extends BaseData> T getModuleData(Class<T> cls) {
        if (!jyb.m147479J(this.dataList)) {
            for (BaseData baseData : this.dataList) {
                if (cls.isInstance(baseData)) {
                    return (T) baseData;
                }
            }
        }
        try {
            T tNewInstance = cls.newInstance();
            try {
                tNewInstance.nullCheck();
                return tNewInstance;
            } catch (Exception unused) {
                return tNewInstance;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            this.hashCode = i;
        }
        return i;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void onApiParseComplete() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
