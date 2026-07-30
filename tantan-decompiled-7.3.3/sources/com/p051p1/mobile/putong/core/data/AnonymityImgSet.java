package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.AnonymityAsset;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class AnonymityImgSet extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "anonymityimgset";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<AnonymityAsset> items;
    public static ProtobufAdapter<AnonymityImgSet> PROTOBUF_ADAPTER = new MessageNanoAdapter<AnonymityImgSet>() { // from class: com.p1.mobile.putong.core.data.AnonymityImgSet.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AnonymityImgSet anonymityImgSet) {
            List<AnonymityAsset> list = anonymityImgSet.items;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, AnonymityAsset.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            anonymityImgSet.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AnonymityImgSet parse(nc5 nc5Var) throws IOException {
            AnonymityImgSet anonymityImgSet = new AnonymityImgSet();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (anonymityImgSet.items != null) {
                        break;
                    }
                    anonymityImgSet.items = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (anonymityImgSet.items != null) {
                        break;
                    }
                    anonymityImgSet.items = new ArrayList();
                    return anonymityImgSet;
                }
                anonymityImgSet.items = (List) nc5Var.m162488l(AnonymityAsset.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return anonymityImgSet;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AnonymityImgSet anonymityImgSet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<AnonymityAsset> list = anonymityImgSet.items;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, AnonymityAsset.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AnonymityImgSet> JSON_ADAPTER = new ObjectJsonAdapter<AnonymityImgSet>() { // from class: com.p1.mobile.putong.core.data.AnonymityImgSet.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AnonymityImgSet.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AnonymityImgSet newInstance() {
            return new AnonymityImgSet();
        }

        public boolean parseField(AnonymityImgSet anonymityImgSet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(FirebaseAnalytics.Param.ITEMS)) {
                return false;
            }
            anonymityImgSet.items = JsonAdapter.parseArray(jsonParser, AnonymityAsset.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AnonymityImgSet anonymityImgSet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.ITEMS)) {
                return true;
            }
            return super.parseFieldCheck(anonymityImgSet, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AnonymityImgSet anonymityImgSet, JsonGenerator jsonGenerator) throws IOException {
            if (anonymityImgSet.items != null) {
                jsonGenerator.writeFieldName(FirebaseAnalytics.Param.ITEMS);
                JsonAdapter.serializeArray(anonymityImgSet.items, jsonGenerator, AnonymityAsset.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AnonymityImgSet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AnonymityImgSet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AnonymityImgSet new_() {
        AnonymityImgSet anonymityImgSet = new AnonymityImgSet();
        anonymityImgSet.nullCheck();
        return anonymityImgSet;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AnonymityImgSet mo225055clone() {
        AnonymityImgSet anonymityImgSet = new AnonymityImgSet();
        List<AnonymityAsset> list = this.items;
        if (list != null) {
            anonymityImgSet.items = ValueObject.util_map(list, new qcj() { // from class: l.zs0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((AnonymityAsset) obj).mo225055clone();
                }
            });
        }
        return anonymityImgSet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AnonymityImgSet) {
            return ValueObject.util_equals(this.items, ((AnonymityImgSet) obj).items);
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
        List<AnonymityAsset> list = this.items;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.items == null) {
            this.items = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
