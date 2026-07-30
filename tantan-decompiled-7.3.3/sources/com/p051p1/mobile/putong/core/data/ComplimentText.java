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
public class ComplimentText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "complimenttext";

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<ComplimentText> PROTOBUF_ADAPTER = new MessageNanoAdapter<ComplimentText>() { // from class: com.p1.mobile.putong.core.data.ComplimentText.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ComplimentText complimentText) {
            String str = complimentText.value;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            complimentText.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ComplimentText parse(nc5 nc5Var) throws IOException {
            ComplimentText complimentText = new ComplimentText();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (complimentText.value != null) {
                        break;
                    }
                    complimentText.value = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (complimentText.value != null) {
                        break;
                    }
                    complimentText.value = "";
                    return complimentText;
                }
                complimentText.value = nc5Var.m162495s();
            }
            return complimentText;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ComplimentText complimentText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = complimentText.value;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<ComplimentText> JSON_ADAPTER = new ObjectJsonAdapter<ComplimentText>() { // from class: com.p1.mobile.putong.core.data.ComplimentText.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ComplimentText.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ComplimentText newInstance() {
            return new ComplimentText();
        }

        public boolean parseField(ComplimentText complimentText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("value")) {
                return false;
            }
            complimentText.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ComplimentText complimentText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(complimentText, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ComplimentText complimentText, JsonGenerator jsonGenerator) throws IOException {
            String str = complimentText.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ComplimentText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ComplimentText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ComplimentText new_() {
        ComplimentText complimentText = new ComplimentText();
        complimentText.nullCheck();
        return complimentText;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ComplimentText mo225055clone() {
        ComplimentText complimentText = new ComplimentText();
        complimentText.value = this.value;
        return complimentText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComplimentText) {
            return ValueObject.util_equals(this.value, ((ComplimentText) obj).value);
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
        String str = this.value;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
