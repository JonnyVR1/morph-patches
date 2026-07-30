package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.SearchSchoolData;
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
public class SearchSchoolData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "searchschooldata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> schools;
    public static ProtobufAdapter<SearchSchoolData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SearchSchoolData>() { // from class: com.p1.mobile.putong.core.data.SearchSchoolData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SearchSchoolData searchSchoolData) {
            List<String> list = searchSchoolData.schools;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            searchSchoolData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SearchSchoolData parse(nc5 nc5Var) throws IOException {
            SearchSchoolData searchSchoolData = new SearchSchoolData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (searchSchoolData.schools != null) {
                        break;
                    }
                    searchSchoolData.schools = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (searchSchoolData.schools != null) {
                        break;
                    }
                    searchSchoolData.schools = new ArrayList();
                    return searchSchoolData;
                }
                searchSchoolData.schools = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return searchSchoolData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SearchSchoolData searchSchoolData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = searchSchoolData.schools;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SearchSchoolData> JSON_ADAPTER = new ObjectJsonAdapter<SearchSchoolData>() { // from class: com.p1.mobile.putong.core.data.SearchSchoolData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SearchSchoolData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SearchSchoolData newInstance() {
            return new SearchSchoolData();
        }

        public boolean parseField(SearchSchoolData searchSchoolData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("schools")) {
                return false;
            }
            searchSchoolData.schools = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SearchSchoolData searchSchoolData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("schools")) {
                return true;
            }
            return super.parseFieldCheck(searchSchoolData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SearchSchoolData searchSchoolData, JsonGenerator jsonGenerator) throws IOException {
            if (searchSchoolData.schools != null) {
                jsonGenerator.writeFieldName("schools");
                JsonAdapter.serializeArray(searchSchoolData.schools, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SearchSchoolData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SearchSchoolData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36830a(String str) {
        return str;
    }

    public static SearchSchoolData new_() {
        SearchSchoolData searchSchoolData = new SearchSchoolData();
        searchSchoolData.nullCheck();
        return searchSchoolData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SearchSchoolData mo225055clone() {
        SearchSchoolData searchSchoolData = new SearchSchoolData();
        List<String> list = this.schools;
        if (list != null) {
            searchSchoolData.schools = ValueObject.util_map(list, new qcj() { // from class: l.uee0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return SearchSchoolData.m36830a((String) obj);
                }
            });
        }
        return searchSchoolData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchSchoolData)) {
            return false;
        }
        SearchSchoolData searchSchoolData = (SearchSchoolData) obj;
        if (this != obj) {
            return false;
        }
        return ValueObject.util_equals(this.schools, searchSchoolData.schools);
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
        List<String> list = this.schools;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.schools == null) {
            this.schools = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
