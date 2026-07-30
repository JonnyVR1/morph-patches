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
public class Letter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "letter";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean appendBanner;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<Letter> PROTOBUF_ADAPTER = new MessageNanoAdapter<Letter>() { // from class: com.p1.mobile.putong.core.data.Letter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Letter letter) {
            String str = letter.value;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, letter.appendBanner);
            ((MessageNano) letter).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Letter m13825parse(nb5 nb5Var) throws IOException {
            Letter letter = new Letter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (letter.value != null) {
                        break;
                    }
                    letter.value = "";
                    break;
                }
                if (iU == 10) {
                    letter.value = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (letter.value != null) {
                            break;
                        }
                        letter.value = "";
                        return letter;
                    }
                    letter.appendBanner = nb5Var.g();
                }
            }
            return letter;
        }

        public void serialize(Letter letter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = letter.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, letter.appendBanner);
        }
    };
    public static JsonAdapter<Letter> JSON_ADAPTER = new ObjectJsonAdapter<Letter>() { // from class: com.p1.mobile.putong.core.data.Letter.2
        public Class getDataClass() {
            return Letter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Letter m13826newInstance() {
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

        public void serializeFields(Letter letter, JsonGenerator jsonGenerator) throws IOException {
            String str = letter.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            jsonGenerator.writeBooleanField("appendBanner", letter.appendBanner);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Letter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Letter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Letter new_() {
        Letter letter = new Letter();
        letter.nullCheck();
        return letter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Letter m13824clone() {
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

    public String getClassParseName() {
        return "letter";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.value;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.appendBanner ? 1231 : 1237);
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
