package com.p000p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Anonymity;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Anonymity extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "anonymity";

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 1)
    public List<String> f181id;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<String> identifier;
    public static ProtobufAdapter<Anonymity> PROTOBUF_ADAPTER = new MessageNanoAdapter<Anonymity>() { // from class: com.p1.mobile.putong.data.Anonymity.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Anonymity anonymity) {
            List<String> list = anonymity.f181id;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = anonymity.identifier;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) anonymity).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Anonymity m17698parse(nb5 nb5Var) throws IOException {
            Anonymity anonymity = new Anonymity();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    anonymity.f181id = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        return anonymity;
                    }
                    anonymity.identifier = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
        }

        public void serialize(Anonymity anonymity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = anonymity.f181id;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = anonymity.identifier;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Anonymity> JSON_ADAPTER = new ObjectJsonAdapter<Anonymity>() { // from class: com.p1.mobile.putong.data.Anonymity.2
        public Class getDataClass() {
            return Anonymity.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Anonymity mo17830newInstance() {
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
            anonymity.f181id = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Anonymity anonymity, JsonGenerator jsonGenerator) throws IOException {
            if (anonymity.f181id != null) {
                jsonGenerator.writeFieldName("id");
                JsonAdapter.serializeArray(anonymity.f181id, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (anonymity.identifier != null) {
                jsonGenerator.writeFieldName("identifier");
                JsonAdapter.serializeArray(anonymity.identifier, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Anonymity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Anonymity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m569a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m570b(String str) {
        return str;
    }

    public static Anonymity new_() {
        Anonymity anonymity = new Anonymity();
        anonymity.nullCheck();
        return anonymity;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Anonymity m17697clone() {
        Anonymity anonymity = new Anonymity();
        List<String> list = this.f181id;
        if (list != null) {
            anonymity.f181id = ValueObject.util_map(list, new w9j() { // from class: l.ss0
                public final Object call(Object obj) {
                    return Anonymity.m570b((String) obj);
                }
            });
        }
        List<String> list2 = this.identifier;
        if (list2 != null) {
            anonymity.identifier = ValueObject.util_map(list2, new w9j() { // from class: l.ts0
                public final Object call(Object obj) {
                    return Anonymity.m569a((String) obj);
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
        return ValueObject.util_equals(this.f181id, anonymity.f181id) && ValueObject.util_equals(this.identifier, anonymity.identifier);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.f181id;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.identifier;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
    }

    public Anonymity subtract(Anonymity anonymity) {
        Anonymity anonymity2 = new Anonymity();
        if (!ValueObject.util_equals(this.f181id, anonymity.f181id)) {
            anonymity2.f181id = this.f181id;
        }
        if (!ValueObject.util_equals(this.identifier, anonymity.identifier)) {
            anonymity2.identifier = this.identifier;
        }
        if (anonymity2.equals(new Anonymity())) {
            return null;
        }
        return anonymity2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
