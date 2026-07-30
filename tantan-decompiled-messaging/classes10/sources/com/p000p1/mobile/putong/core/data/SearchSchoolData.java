package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.SearchSchoolData;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SearchSchoolData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "searchschooldata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> schools;
    public static ProtobufAdapter<SearchSchoolData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SearchSchoolData>() { // from class: com.p1.mobile.putong.core.data.SearchSchoolData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SearchSchoolData searchSchoolData) {
            List<String> list = searchSchoolData.schools;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) searchSchoolData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SearchSchoolData m15499parse(nb5 nb5Var) throws IOException {
            SearchSchoolData searchSchoolData = new SearchSchoolData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (searchSchoolData.schools != null) {
                        break;
                    }
                    searchSchoolData.schools = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (searchSchoolData.schools != null) {
                        break;
                    }
                    searchSchoolData.schools = new ArrayList();
                    return searchSchoolData;
                }
                searchSchoolData.schools = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return searchSchoolData;
        }

        public void serialize(SearchSchoolData searchSchoolData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = searchSchoolData.schools;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SearchSchoolData> JSON_ADAPTER = new ObjectJsonAdapter<SearchSchoolData>() { // from class: com.p1.mobile.putong.core.data.SearchSchoolData.2
        public Class getDataClass() {
            return SearchSchoolData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SearchSchoolData m15500newInstance() {
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

        public void serializeFields(SearchSchoolData searchSchoolData, JsonGenerator jsonGenerator) throws IOException {
            if (searchSchoolData.schools != null) {
                jsonGenerator.writeFieldName("schools");
                JsonAdapter.serializeArray(searchSchoolData.schools, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SearchSchoolData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SearchSchoolData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m629a(String str) {
        return str;
    }

    public static SearchSchoolData new_() {
        SearchSchoolData searchSchoolData = new SearchSchoolData();
        searchSchoolData.nullCheck();
        return searchSchoolData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SearchSchoolData m15498clone() {
        SearchSchoolData searchSchoolData = new SearchSchoolData();
        List<String> list = this.schools;
        if (list != null) {
            searchSchoolData.schools = ValueObject.util_map(list, new w9j() { // from class: l.p6e0
                public final Object call(Object obj) {
                    return SearchSchoolData.m629a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        List<String> list = this.schools;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.schools == null) {
            this.schools = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
