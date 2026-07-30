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
public class StructuredFormatting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "structuredformatting";

    @NonNull
    @ProtobufIndex(index = 1)
    public String main_text;

    @NonNull
    @ProtobufIndex(index = 2)
    public String secondary_text;
    public static ProtobufAdapter<StructuredFormatting> PROTOBUF_ADAPTER = new MessageNanoAdapter<StructuredFormatting>() { // from class: com.p1.mobile.putong.core.data.StructuredFormatting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StructuredFormatting structuredFormatting) {
            String str = structuredFormatting.main_text;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = structuredFormatting.secondary_text;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            structuredFormatting.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StructuredFormatting parse(nc5 nc5Var) throws IOException {
            StructuredFormatting structuredFormatting = new StructuredFormatting();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (structuredFormatting.main_text == null) {
                        structuredFormatting.main_text = "";
                    }
                    if (structuredFormatting.secondary_text != null) {
                        break;
                    }
                    structuredFormatting.secondary_text = "";
                    break;
                }
                if (iM162497u == 10) {
                    structuredFormatting.main_text = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (structuredFormatting.main_text == null) {
                            structuredFormatting.main_text = "";
                        }
                        if (structuredFormatting.secondary_text != null) {
                            break;
                        }
                        structuredFormatting.secondary_text = "";
                        return structuredFormatting;
                    }
                    structuredFormatting.secondary_text = nc5Var.m162495s();
                }
            }
            return structuredFormatting;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StructuredFormatting structuredFormatting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = structuredFormatting.main_text;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = structuredFormatting.secondary_text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<StructuredFormatting> JSON_ADAPTER = new ObjectJsonAdapter<StructuredFormatting>() { // from class: com.p1.mobile.putong.core.data.StructuredFormatting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StructuredFormatting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StructuredFormatting newInstance() {
            return new StructuredFormatting();
        }

        public boolean parseField(StructuredFormatting structuredFormatting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("secondary_text")) {
                structuredFormatting.secondary_text = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("main_text")) {
                return false;
            }
            structuredFormatting.main_text = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(StructuredFormatting structuredFormatting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("secondary_text") || str.equals("main_text")) {
                return true;
            }
            return super.parseFieldCheck(structuredFormatting, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StructuredFormatting structuredFormatting, JsonGenerator jsonGenerator) throws IOException {
            String str = structuredFormatting.main_text;
            if (str != null) {
                jsonGenerator.writeStringField("main_text", str);
            }
            String str2 = structuredFormatting.secondary_text;
            if (str2 != null) {
                jsonGenerator.writeStringField("secondary_text", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StructuredFormatting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StructuredFormatting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StructuredFormatting new_() {
        StructuredFormatting structuredFormatting = new StructuredFormatting();
        structuredFormatting.nullCheck();
        return structuredFormatting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StructuredFormatting mo225055clone() {
        StructuredFormatting structuredFormatting = new StructuredFormatting();
        structuredFormatting.main_text = this.main_text;
        structuredFormatting.secondary_text = this.secondary_text;
        return structuredFormatting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StructuredFormatting)) {
            return false;
        }
        StructuredFormatting structuredFormatting = (StructuredFormatting) obj;
        return ValueObject.util_equals(this.main_text, structuredFormatting.main_text) && ValueObject.util_equals(this.secondary_text, structuredFormatting.secondary_text);
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
        String str = this.main_text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.secondary_text;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.main_text == null) {
            this.main_text = "";
        }
        if (this.secondary_text == null) {
            this.secondary_text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
