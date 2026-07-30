package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.LocalExperienceSyc;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class LocalExperienceSyc extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "localexperiencesyc";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> groups;
    public static ProtobufAdapter<LocalExperienceSyc> PROTOBUF_ADAPTER = new MessageNanoAdapter<LocalExperienceSyc>() { // from class: com.p1.mobile.putong.core.data.LocalExperienceSyc.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LocalExperienceSyc localExperienceSyc) {
            List<String> list = localExperienceSyc.groups;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            localExperienceSyc.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LocalExperienceSyc parse(nb5 nb5Var) throws IOException {
            LocalExperienceSyc localExperienceSyc = new LocalExperienceSyc();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (localExperienceSyc.groups != null) {
                        break;
                    }
                    localExperienceSyc.groups = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (localExperienceSyc.groups != null) {
                        break;
                    }
                    localExperienceSyc.groups = new ArrayList();
                    return localExperienceSyc;
                }
                localExperienceSyc.groups = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return localExperienceSyc;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LocalExperienceSyc localExperienceSyc, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = localExperienceSyc.groups;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LocalExperienceSyc> JSON_ADAPTER = new ObjectJsonAdapter<LocalExperienceSyc>() { // from class: com.p1.mobile.putong.core.data.LocalExperienceSyc.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LocalExperienceSyc.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LocalExperienceSyc newInstance() {
            return new LocalExperienceSyc();
        }

        public boolean parseField(LocalExperienceSyc localExperienceSyc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("groups")) {
                return false;
            }
            localExperienceSyc.groups = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LocalExperienceSyc localExperienceSyc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("groups")) {
                return true;
            }
            return super.parseFieldCheck(localExperienceSyc, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LocalExperienceSyc localExperienceSyc, JsonGenerator jsonGenerator) throws IOException {
            if (localExperienceSyc.groups != null) {
                jsonGenerator.writeFieldName("groups");
                JsonAdapter.serializeArray(localExperienceSyc.groups, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LocalExperienceSyc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LocalExperienceSyc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35651a(String str) {
        return str;
    }

    public static LocalExperienceSyc new_() {
        LocalExperienceSyc localExperienceSyc = new LocalExperienceSyc();
        localExperienceSyc.nullCheck();
        return localExperienceSyc;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LocalExperienceSyc mo223809clone() {
        LocalExperienceSyc localExperienceSyc = new LocalExperienceSyc();
        List<String> list = this.groups;
        if (list != null) {
            localExperienceSyc.groups = ValueObject.util_map(list, new w9j() { // from class: l.fsv
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LocalExperienceSyc.m35651a((String) obj);
                }
            });
        }
        return localExperienceSyc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocalExperienceSyc) {
            return ValueObject.util_equals(this.groups, ((LocalExperienceSyc) obj).groups);
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
        List<String> list = this.groups;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.groups == null) {
            this.groups = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
