package com.p046p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Anonymity;
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

/* JADX INFO: loaded from: classes12.dex */
public class Anonymity extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "anonymity";

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 1)
    public List<String> f38720id;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<String> identifier;
    public static ProtobufAdapter<Anonymity> PROTOBUF_ADAPTER = new MessageNanoAdapter<Anonymity>() { // from class: com.p1.mobile.putong.data.Anonymity.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Anonymity anonymity) {
            List<String> list = anonymity.f38720id;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = anonymity.identifier;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            anonymity.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Anonymity parse(nb5 nb5Var) throws IOException {
            Anonymity anonymity = new Anonymity();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    anonymity.f38720id = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        return anonymity;
                    }
                    anonymity.identifier = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Anonymity anonymity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = anonymity.f38720id;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = anonymity.identifier;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Anonymity> JSON_ADAPTER = new ObjectJsonAdapter<Anonymity>() { // from class: com.p1.mobile.putong.data.Anonymity.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Anonymity.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Anonymity newInstance() {
            return new Anonymity();
        }

        public boolean parseField(Anonymity anonymity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("identifier")) {
                anonymity.identifier = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            anonymity.f38720id = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return false;
        }

        public boolean parseFieldCheck(Anonymity anonymity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("identifier")) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(anonymity, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Anonymity anonymity, JsonGenerator jsonGenerator) throws IOException {
            if (anonymity.f38720id != null) {
                jsonGenerator.writeFieldName("id");
                JsonAdapter.serializeArray(anonymity.f38720id, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (anonymity.identifier != null) {
                jsonGenerator.writeFieldName("identifier");
                JsonAdapter.serializeArray(anonymity.identifier, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Anonymity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Anonymity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59667a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m59668b(String str) {
        return str;
    }

    public static Anonymity new_() {
        Anonymity anonymity = new Anonymity();
        anonymity.nullCheck();
        return anonymity;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Anonymity mo223809clone() {
        Anonymity anonymity = new Anonymity();
        List<String> list = this.f38720id;
        if (list != null) {
            anonymity.f38720id = ValueObject.util_map(list, new w9j() { // from class: l.ss0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Anonymity.m59668b((String) obj);
                }
            });
        }
        List<String> list2 = this.identifier;
        if (list2 != null) {
            anonymity.identifier = ValueObject.util_map(list2, new w9j() { // from class: l.ts0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Anonymity.m59667a((String) obj);
                }
            });
        }
        return anonymity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Anonymity)) {
            return false;
        }
        Anonymity anonymity = (Anonymity) obj;
        return ValueObject.util_equals(this.f38720id, anonymity.f38720id) && ValueObject.util_equals(this.identifier, anonymity.identifier);
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
        List<String> list = this.f38720id;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.identifier;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    public Anonymity subtract(Anonymity anonymity) {
        Anonymity anonymity2 = new Anonymity();
        if (!ValueObject.util_equals(this.f38720id, anonymity.f38720id)) {
            anonymity2.f38720id = this.f38720id;
        }
        if (!ValueObject.util_equals(this.identifier, anonymity.identifier)) {
            anonymity2.identifier = this.identifier;
        }
        if (anonymity2.equals(new Anonymity())) {
            return null;
        }
        return anonymity2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
