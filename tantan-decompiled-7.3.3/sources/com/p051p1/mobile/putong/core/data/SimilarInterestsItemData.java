package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemLanguagesData;
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
import java.util.Collections;
import java.util.Map;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class SimilarInterestsItemData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsitemdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public Map<String, SimilarInterestsItemLanguagesData> multiLanguage;
    public static ProtobufAdapter<SimilarInterestsItemData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsItemData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SimilarInterestsItemData similarInterestsItemData) {
            Map<String, SimilarInterestsItemLanguagesData> map = similarInterestsItemData.multiLanguage;
            int iM17285l = map != null ? CodedOutputByteBufferNano.m17285l(1, map, SimilarInterestsItemLanguagesData.PROTOBUF_ADAPTER.MAP_ADAPTER()) : 0;
            similarInterestsItemData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SimilarInterestsItemData parse(nc5 nc5Var) throws IOException {
            SimilarInterestsItemData similarInterestsItemData = new SimilarInterestsItemData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (similarInterestsItemData.multiLanguage != null) {
                        break;
                    }
                    similarInterestsItemData.multiLanguage = Collections.EMPTY_MAP;
                    break;
                }
                if (iM162497u != 10) {
                    if (similarInterestsItemData.multiLanguage != null) {
                        break;
                    }
                    similarInterestsItemData.multiLanguage = Collections.EMPTY_MAP;
                    return similarInterestsItemData;
                }
                similarInterestsItemData.multiLanguage = (Map) nc5Var.m162488l(SimilarInterestsItemLanguagesData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            return similarInterestsItemData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SimilarInterestsItemData similarInterestsItemData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Map<String, SimilarInterestsItemLanguagesData> map = similarInterestsItemData.multiLanguage;
            if (map != null) {
                codedOutputByteBufferNano.m17309K(1, map, SimilarInterestsItemLanguagesData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SimilarInterestsItemData> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsItemData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SimilarInterestsItemData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SimilarInterestsItemData newInstance() {
            return new SimilarInterestsItemData();
        }

        public boolean parseField(SimilarInterestsItemData similarInterestsItemData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("multiLanguage")) {
                return false;
            }
            similarInterestsItemData.multiLanguage = JsonAdapter.parseMap(jsonParser, SimilarInterestsItemLanguagesData.JSON_ADAPTER, str2);
            return true;
        }

        public boolean parseFieldCheck(SimilarInterestsItemData similarInterestsItemData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("multiLanguage")) {
                return true;
            }
            return super.parseFieldCheck(similarInterestsItemData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SimilarInterestsItemData similarInterestsItemData, JsonGenerator jsonGenerator) throws IOException {
            if (similarInterestsItemData.multiLanguage != null) {
                jsonGenerator.writeFieldName("multiLanguage");
                JsonAdapter.serializeMap(similarInterestsItemData.multiLanguage, jsonGenerator, SimilarInterestsItemLanguagesData.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsItemData new_() {
        SimilarInterestsItemData similarInterestsItemData = new SimilarInterestsItemData();
        similarInterestsItemData.nullCheck();
        return similarInterestsItemData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SimilarInterestsItemData mo225055clone() {
        SimilarInterestsItemData similarInterestsItemData = new SimilarInterestsItemData();
        Map<String, SimilarInterestsItemLanguagesData> map = this.multiLanguage;
        if (map != null) {
            similarInterestsItemData.multiLanguage = ValueObject.util_map(map, new qcj() { // from class: l.ynf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((SimilarInterestsItemLanguagesData) obj).mo225055clone();
                }
            });
        }
        return similarInterestsItemData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SimilarInterestsItemData) {
            return ValueObject.util_equals(this.multiLanguage, ((SimilarInterestsItemData) obj).multiLanguage);
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
        Map<String, SimilarInterestsItemLanguagesData> map = this.multiLanguage;
        int iHashCode = i2 + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.multiLanguage == null) {
            this.multiLanguage = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
