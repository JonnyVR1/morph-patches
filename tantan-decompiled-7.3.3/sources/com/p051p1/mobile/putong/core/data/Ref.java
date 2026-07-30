package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class Ref extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ref";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21232id;
    public static ProtobufAdapter<Ref> PROTOBUF_ADAPTER = new MessageNanoAdapter<Ref>() { // from class: com.p1.mobile.putong.core.data.Ref.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Ref ref) {
            String str = ref.f21232id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            ref.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Ref parse(nc5 nc5Var) throws IOException {
            Ref ref = new Ref();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (ref.f21232id != null) {
                        break;
                    }
                    ref.f21232id = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (ref.f21232id != null) {
                        break;
                    }
                    ref.f21232id = "";
                    return ref;
                }
                ref.f21232id = nc5Var.m162495s();
            }
            return ref;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Ref ref, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = ref.f21232id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<Ref> JSON_ADAPTER = new ObjectJsonAdapter<Ref>() { // from class: com.p1.mobile.putong.core.data.Ref.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Ref.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Ref newInstance() {
            return new Ref();
        }

        public boolean parseField(Ref ref, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("id")) {
                return false;
            }
            ref.f21232id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(Ref ref, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(ref, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Ref ref, JsonGenerator jsonGenerator) throws IOException {
            String str = ref.f21232id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Ref) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Ref) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Ref new_() {
        Ref ref = new Ref();
        ref.nullCheck();
        return ref;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Ref mo225055clone() {
        Ref ref = new Ref();
        ref.f21232id = this.f21232id;
        return ref;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ref) {
            return ValueObject.util_equals(this.f21232id, ((Ref) obj).f21232id);
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
        String str = this.f21232id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21232id == null) {
            this.f21232id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
