package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class IdBoxed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idboxed";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f220id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<IdBoxed> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdBoxed>() { // from class: com.p1.mobile.putong.data.IdBoxed.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IdBoxed idBoxed) {
            String str = idBoxed.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = idBoxed.f220id;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) idBoxed).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IdBoxed m18205parse(nb5 nb5Var) throws IOException {
            IdBoxed idBoxed = new IdBoxed();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (idBoxed.type == null) {
                        idBoxed.type = "";
                    }
                    if (idBoxed.f220id != null) {
                        break;
                    }
                    idBoxed.f220id = "";
                    break;
                }
                if (iU == 10) {
                    idBoxed.type = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (idBoxed.type == null) {
                            idBoxed.type = "";
                        }
                        if (idBoxed.f220id != null) {
                            break;
                        }
                        idBoxed.f220id = "";
                        return idBoxed;
                    }
                    idBoxed.f220id = nb5Var.s();
                }
            }
            return idBoxed;
        }

        public void serialize(IdBoxed idBoxed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = idBoxed.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = idBoxed.f220id;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<IdBoxed> JSON_ADAPTER = new ObjectJsonAdapter<IdBoxed>() { // from class: com.p1.mobile.putong.data.IdBoxed.2
        public Class getDataClass() {
            return IdBoxed.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public IdBoxed mo17830newInstance() {
            return new IdBoxed();
        }

        public boolean parseField(IdBoxed idBoxed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                idBoxed.f220id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            idBoxed.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IdBoxed idBoxed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(idBoxed, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IdBoxed idBoxed, JsonGenerator jsonGenerator) throws IOException {
            String str = idBoxed.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = idBoxed.f220id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdBoxed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdBoxed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public IdBoxed(String str, String str2) {
        this.type = str2;
        this.f220id = str;
    }

    public static IdBoxed new_() {
        IdBoxed idBoxed = new IdBoxed();
        idBoxed.nullCheck();
        return idBoxed;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IdBoxed m18204clone() {
        IdBoxed idBoxed = new IdBoxed();
        idBoxed.type = this.type;
        idBoxed.f220id = this.f220id;
        return idBoxed;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdBoxed)) {
            return false;
        }
        IdBoxed idBoxed = (IdBoxed) obj;
        return ValueObject.util_equals(this.type, idBoxed.type) && ValueObject.util_equals(this.f220id, idBoxed.f220id);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f220id;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f220id == null) {
            this.f220id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public IdBoxed() {
    }
}
