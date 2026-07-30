package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class SearchSchool extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "searchschool";

    @NonNull
    @ProtobufIndex(index = 2)
    public SearchSchoolData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<SearchSchool> PROTOBUF_ADAPTER = new MessageNanoAdapter<SearchSchool>() { // from class: com.p1.mobile.putong.core.data.SearchSchool.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SearchSchool searchSchool) {
            Meta meta = searchSchool.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            SearchSchoolData searchSchoolData = searchSchool.data;
            if (searchSchoolData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, searchSchoolData, SearchSchoolData.PROTOBUF_ADAPTER);
            }
            searchSchool.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SearchSchool parse(nc5 nc5Var) throws IOException {
            SearchSchool searchSchool = new SearchSchool();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (searchSchool.meta == null) {
                        searchSchool.meta = Meta.new_();
                    }
                    if (searchSchool.data != null) {
                        break;
                    }
                    searchSchool.data = SearchSchoolData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    searchSchool.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (searchSchool.meta == null) {
                            searchSchool.meta = Meta.new_();
                        }
                        if (searchSchool.data != null) {
                            break;
                        }
                        searchSchool.data = SearchSchoolData.new_();
                        return searchSchool;
                    }
                    searchSchool.data = (SearchSchoolData) nc5Var.m162488l(SearchSchoolData.PROTOBUF_ADAPTER);
                }
            }
            return searchSchool;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SearchSchool searchSchool, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = searchSchool.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            SearchSchoolData searchSchoolData = searchSchool.data;
            if (searchSchoolData != null) {
                codedOutputByteBufferNano.m17309K(2, searchSchoolData, SearchSchoolData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SearchSchool> JSON_ADAPTER = new ObjectJsonAdapter<SearchSchool>() { // from class: com.p1.mobile.putong.core.data.SearchSchool.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SearchSchool.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SearchSchool newInstance() {
            return new SearchSchool();
        }

        public boolean parseField(SearchSchool searchSchool, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                searchSchool.data = SearchSchoolData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            searchSchool.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SearchSchool searchSchool, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(searchSchool, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SearchSchool searchSchool, JsonGenerator jsonGenerator) throws IOException {
            if (searchSchool.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(searchSchool.meta, jsonGenerator, true);
            }
            if (searchSchool.data != null) {
                jsonGenerator.writeFieldName("data");
                SearchSchoolData.JSON_ADAPTER.serialize(searchSchool.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SearchSchool) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SearchSchool) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SearchSchool new_() {
        SearchSchool searchSchool = new SearchSchool();
        searchSchool.nullCheck();
        return searchSchool;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SearchSchool mo225055clone() {
        SearchSchool searchSchool = new SearchSchool();
        Meta meta = this.meta;
        if (meta != null) {
            searchSchool.meta = meta.mo225055clone();
        }
        SearchSchoolData searchSchoolData = this.data;
        if (searchSchoolData != null) {
            searchSchool.data = searchSchoolData.mo225055clone();
        }
        return searchSchool;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchSchool)) {
            return false;
        }
        SearchSchool searchSchool = (SearchSchool) obj;
        return this == obj && ValueObject.util_equals(this.meta, searchSchool.meta) && ValueObject.util_equals(this.data, searchSchool.data);
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
        int iHashCode = super.hashCode() * 41;
        Meta meta = this.meta;
        int iHashCode2 = (iHashCode + (meta != null ? meta.hashCode() : 0)) * 41;
        SearchSchoolData searchSchoolData = this.data;
        int iHashCode3 = iHashCode2 + (searchSchoolData != null ? searchSchoolData.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = SearchSchoolData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
