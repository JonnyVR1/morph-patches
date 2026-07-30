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
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class SvipSearch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "svipsearch";

    @ProtobufIndex(index = 1)
    public boolean realUser;
    public static ProtobufAdapter<SvipSearch> PROTOBUF_ADAPTER = new MessageNanoAdapter<SvipSearch>() { // from class: com.p1.mobile.putong.data.SvipSearch.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SvipSearch svipSearch) {
            int iB = CodedOutputByteBufferNano.b(1, svipSearch.realUser);
            ((MessageNano) svipSearch).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SvipSearch m19058parse(nb5 nb5Var) throws IOException {
            SvipSearch svipSearch = new SvipSearch();
            while (nb5Var.u() == 8) {
                svipSearch.realUser = nb5Var.g();
            }
            return svipSearch;
        }

        public void serialize(SvipSearch svipSearch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, svipSearch.realUser);
        }
    };
    public static JsonAdapter<SvipSearch> JSON_ADAPTER = new ObjectJsonAdapter<SvipSearch>() { // from class: com.p1.mobile.putong.data.SvipSearch.2
        public Class getDataClass() {
            return SvipSearch.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SvipSearch mo17830newInstance() {
            return new SvipSearch();
        }

        public boolean parseField(SvipSearch svipSearch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("realUser")) {
                return false;
            }
            svipSearch.realUser = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(SvipSearch svipSearch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("realUser")) {
                return true;
            }
            return super.parseFieldCheck(svipSearch, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SvipSearch svipSearch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("realUser", svipSearch.realUser);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SvipSearch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SvipSearch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SvipSearch new_() {
        SvipSearch svipSearch = new SvipSearch();
        svipSearch.nullCheck();
        return svipSearch;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SvipSearch m19057clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.realUser ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
