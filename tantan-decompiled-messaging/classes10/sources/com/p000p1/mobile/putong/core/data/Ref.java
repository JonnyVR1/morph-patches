package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class Ref extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ref";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f152id;
    public static ProtobufAdapter<Ref> PROTOBUF_ADAPTER = new MessageNanoAdapter<Ref>() { // from class: com.p1.mobile.putong.core.data.Ref.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Ref ref) {
            String str = ref.f152id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) ref).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Ref m15355parse(nb5 nb5Var) throws IOException {
            Ref ref = new Ref();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (ref.f152id != null) {
                        break;
                    }
                    ref.f152id = "";
                    break;
                }
                if (iU != 10) {
                    if (ref.f152id != null) {
                        break;
                    }
                    ref.f152id = "";
                    return ref;
                }
                ref.f152id = nb5Var.s();
            }
            return ref;
        }

        public void serialize(Ref ref, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = ref.f152id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<Ref> JSON_ADAPTER = new ObjectJsonAdapter<Ref>() { // from class: com.p1.mobile.putong.core.data.Ref.2
        public Class getDataClass() {
            return Ref.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Ref m15356newInstance() {
            return new Ref();
        }

        public boolean parseField(Ref ref, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("id")) {
                return false;
            }
            ref.f152id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(Ref ref, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(ref, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(Ref ref, JsonGenerator jsonGenerator) throws IOException {
            String str = ref.f152id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Ref) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Ref) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Ref new_() {
        Ref ref = new Ref();
        ref.nullCheck();
        return ref;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Ref m15354clone() {
        Ref ref = new Ref();
        ref.f152id = this.f152id;
        return ref;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ref) {
            return ValueObject.util_equals(this.f152id, ((Ref) obj).f152id);
        }
        return false;
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
        String str = this.f152id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.f152id == null) {
            this.f152id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
