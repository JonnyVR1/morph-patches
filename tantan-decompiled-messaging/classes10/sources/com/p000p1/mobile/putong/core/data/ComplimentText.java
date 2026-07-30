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
public class ComplimentText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "complimenttext";

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<ComplimentText> PROTOBUF_ADAPTER = new MessageNanoAdapter<ComplimentText>() { // from class: com.p1.mobile.putong.core.data.ComplimentText.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ComplimentText complimentText) {
            String str = complimentText.value;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) complimentText).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ComplimentText m12241parse(nb5 nb5Var) throws IOException {
            ComplimentText complimentText = new ComplimentText();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (complimentText.value != null) {
                        break;
                    }
                    complimentText.value = "";
                    break;
                }
                if (iU != 10) {
                    if (complimentText.value != null) {
                        break;
                    }
                    complimentText.value = "";
                    return complimentText;
                }
                complimentText.value = nb5Var.s();
            }
            return complimentText;
        }

        public void serialize(ComplimentText complimentText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = complimentText.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<ComplimentText> JSON_ADAPTER = new ObjectJsonAdapter<ComplimentText>() { // from class: com.p1.mobile.putong.core.data.ComplimentText.2
        public Class getDataClass() {
            return ComplimentText.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ComplimentText m12242newInstance() {
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

        public void serializeFields(ComplimentText complimentText, JsonGenerator jsonGenerator) throws IOException {
            String str = complimentText.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ComplimentText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ComplimentText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ComplimentText new_() {
        ComplimentText complimentText = new ComplimentText();
        complimentText.nullCheck();
        return complimentText;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ComplimentText m12240clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.value;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
