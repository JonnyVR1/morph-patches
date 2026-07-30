package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import l.nb5;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Data extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "data";
    public ArrayList<BaseData> dataList;
    public static ProtobufAdapter<Data> PROTOBUF_ADAPTER = new MessageNanoAdapter<Data>() { // from class: com.p1.mobile.putong.data.Data.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Data m17938parse(nb5 nb5Var) throws IOException {
            Data data = new Data();
            nb5Var.u();
            return data;
        }

        public void serialize(Data data, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        }

        public int computeAndCacheSize(Data data) {
            ((MessageNano) data).cachedSize = 0;
            return 0;
        }
    };
    public static JsonAdapter<Data> JSON_ADAPTER = new ObjectJsonAdapter<Data>() { // from class: com.p1.mobile.putong.data.Data.2
        public Class getDataClass() {
            return Data.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Data mo17830newInstance() {
            return new Data();
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Data) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public boolean parseFieldCheck(Data data, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            Objects.requireNonNull(str);
            return super.parseFieldCheck(data, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Data data, JsonGenerator jsonGenerator) throws IOException {
        }

        public boolean parseField(Data data, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            Objects.requireNonNull(str);
            return false;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Data m17937clone() {
        return new Data();
    }

    public boolean equals(Object obj) {
        return obj == this || (obj instanceof Data);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public <T extends BaseData> T getModuleData(Class<T> cls) {
        if (!vwb.J(this.dataList)) {
            Iterator<BaseData> it = this.dataList.iterator();
            while (it.hasNext()) {
                T t = (ValueObject) it.next();
                if (cls.isInstance(t)) {
                    return t;
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
        int i = ((ValueObject) this).hashCode;
        if (i == 0) {
            ((ValueObject) this).hashCode = i;
        }
        return i;
    }

    public void nullCheck() {
    }

    public void onApiParseComplete() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
