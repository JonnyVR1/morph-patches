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
public class Letter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "letter";

    @ProtobufIndex(index = 2)
    public boolean appendBanner;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<Letter> PROTOBUF_ADAPTER = new MessageNanoAdapter<Letter>() { // from class: com.p1.mobile.putong.core.data.Letter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Letter letter) {
            String str = letter.value;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, letter.appendBanner);
            letter.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Letter parse(nb5 nb5Var) throws IOException {
            Letter letter = new Letter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (letter.value != null) {
                        break;
                    }
                    letter.value = "";
                    break;
                }
                if (iM158752u == 10) {
                    letter.value = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (letter.value != null) {
                            break;
                        }
                        letter.value = "";
                        return letter;
                    }
                    letter.appendBanner = nb5Var.m158738g();
                }
            }
            return letter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Letter letter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = letter.value;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, letter.appendBanner);
        }
    };
    public static JsonAdapter<Letter> JSON_ADAPTER = new ObjectJsonAdapter<Letter>() { // from class: com.p1.mobile.putong.core.data.Letter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Letter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Letter newInstance() {
            return new Letter();
        }

        public boolean parseField(Letter letter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("value")) {
                letter.value = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("appendBanner")) {
                return false;
            }
            letter.appendBanner = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(Letter letter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("value") || str.equals("appendBanner")) {
                return true;
            }
            return super.parseFieldCheck(letter, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Letter letter, JsonGenerator jsonGenerator) throws IOException {
            String str = letter.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            jsonGenerator.writeBooleanField("appendBanner", letter.appendBanner);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Letter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Letter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Letter new_() {
        Letter letter = new Letter();
        letter.nullCheck();
        return letter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Letter mo223809clone() {
        Letter letter = new Letter();
        letter.value = this.value;
        letter.appendBanner = this.appendBanner;
        return letter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Letter)) {
            return false;
        }
        Letter letter = (Letter) obj;
        return ValueObject.util_equals(this.value, letter.value) && this.appendBanner == letter.appendBanner;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "letter";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.value;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.appendBanner ? 1231 : 1237);
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
