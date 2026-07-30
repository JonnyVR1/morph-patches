package com.p051p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.VisitorSortType;
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

/* JADX INFO: loaded from: classes12.dex */
public class SvipSearch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "svipsearch";

    @ProtobufIndex(index = 1)
    public boolean realUser;
    public static ProtobufAdapter<SvipSearch> PROTOBUF_ADAPTER = new MessageNanoAdapter<SvipSearch>() { // from class: com.p1.mobile.putong.data.SvipSearch.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SvipSearch svipSearch) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, svipSearch.realUser);
            svipSearch.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SvipSearch parse(nc5 nc5Var) throws IOException {
            SvipSearch svipSearch = new SvipSearch();
            while (nc5Var.m162497u() == 8) {
                svipSearch.realUser = nc5Var.m162483g();
            }
            return svipSearch;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SvipSearch svipSearch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, svipSearch.realUser);
        }
    };
    public static JsonAdapter<SvipSearch> JSON_ADAPTER = new ObjectJsonAdapter<SvipSearch>() { // from class: com.p1.mobile.putong.data.SvipSearch.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SvipSearch.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SvipSearch newInstance() {
            return new SvipSearch();
        }

        public boolean parseField(SvipSearch svipSearch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(VisitorSortType.realUser)) {
                return false;
            }
            svipSearch.realUser = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(SvipSearch svipSearch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(VisitorSortType.realUser)) {
                return true;
            }
            return super.parseFieldCheck(svipSearch, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SvipSearch svipSearch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(VisitorSortType.realUser, svipSearch.realUser);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SvipSearch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SvipSearch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SvipSearch new_() {
        SvipSearch svipSearch = new SvipSearch();
        svipSearch.nullCheck();
        return svipSearch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SvipSearch mo225055clone() {
        SvipSearch svipSearch = new SvipSearch();
        svipSearch.realUser = this.realUser;
        return svipSearch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SvipSearch) && this.realUser == ((SvipSearch) obj).realUser;
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
        int i2 = (i * 41) + (this.realUser ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
