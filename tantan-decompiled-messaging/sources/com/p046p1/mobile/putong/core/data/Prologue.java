package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class Prologue extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "prologue";

    @NonNull
    @ProtobufIndex(index = 2)
    public String category;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<Prologue> PROTOBUF_ADAPTER = new MessageNanoAdapter<Prologue>() { // from class: com.p1.mobile.putong.core.data.Prologue.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Prologue prologue) {
            String str = prologue.value;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = prologue.category;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            prologue.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Prologue parse(nb5 nb5Var) throws IOException {
            Prologue prologue = new Prologue();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (prologue.value == null) {
                        prologue.value = "";
                    }
                    if (prologue.category != null) {
                        break;
                    }
                    prologue.category = "";
                    break;
                }
                if (iM158752u == 10) {
                    prologue.value = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (prologue.value == null) {
                            prologue.value = "";
                        }
                        if (prologue.category != null) {
                            break;
                        }
                        prologue.category = "";
                        return prologue;
                    }
                    prologue.category = nb5Var.m158750s();
                }
            }
            return prologue;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Prologue prologue, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = prologue.value;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = prologue.category;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<Prologue> JSON_ADAPTER = new ObjectJsonAdapter<Prologue>() { // from class: com.p1.mobile.putong.core.data.Prologue.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Prologue.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Prologue newInstance() {
            return new Prologue();
        }

        public boolean parseField(Prologue prologue, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("category")) {
                prologue.category = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            prologue.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Prologue prologue, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("category") || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(prologue, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Prologue prologue, JsonGenerator jsonGenerator) throws IOException {
            String str = prologue.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = prologue.category;
            if (str2 != null) {
                jsonGenerator.writeStringField("category", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Prologue) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Prologue) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Prologue new_() {
        Prologue prologue = new Prologue();
        prologue.nullCheck();
        return prologue;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Prologue mo223809clone() {
        Prologue prologue = new Prologue();
        prologue.value = this.value;
        prologue.category = this.category;
        return prologue;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Prologue)) {
            return false;
        }
        Prologue prologue = (Prologue) obj;
        return ValueObject.util_equals(this.value, prologue.value) && ValueObject.util_equals(this.category, prologue.category);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "prologue";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.category;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.category == null) {
            this.category = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
