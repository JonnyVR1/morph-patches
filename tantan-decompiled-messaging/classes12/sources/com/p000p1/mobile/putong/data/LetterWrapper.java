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
public class LetterWrapper extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "letterwrapper";

    @NonNull
    @ProtobufIndex(index = 1)
    public String letter;
    public boolean select;
    public static ProtobufAdapter<LetterWrapper> PROTOBUF_ADAPTER = new MessageNanoAdapter<LetterWrapper>() { // from class: com.p1.mobile.putong.data.LetterWrapper.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LetterWrapper letterWrapper) {
            String str = letterWrapper.letter;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) letterWrapper).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LetterWrapper m18286parse(nb5 nb5Var) throws IOException {
            LetterWrapper letterWrapper = new LetterWrapper();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (letterWrapper.letter != null) {
                        break;
                    }
                    letterWrapper.letter = "";
                    break;
                }
                if (iU != 10) {
                    if (letterWrapper.letter != null) {
                        break;
                    }
                    letterWrapper.letter = "";
                    return letterWrapper;
                }
                letterWrapper.letter = nb5Var.s();
            }
            return letterWrapper;
        }

        public void serialize(LetterWrapper letterWrapper, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = letterWrapper.letter;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<LetterWrapper> JSON_ADAPTER = new ObjectJsonAdapter<LetterWrapper>() { // from class: com.p1.mobile.putong.data.LetterWrapper.2
        public Class getDataClass() {
            return LetterWrapper.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LetterWrapper mo17830newInstance() {
            return new LetterWrapper();
        }

        public boolean parseField(LetterWrapper letterWrapper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("letter")) {
                return false;
            }
            letterWrapper.letter = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LetterWrapper letterWrapper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("letter")) {
                return true;
            }
            return super.parseFieldCheck(letterWrapper, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LetterWrapper letterWrapper, JsonGenerator jsonGenerator) throws IOException {
            String str = letterWrapper.letter;
            if (str != null) {
                jsonGenerator.writeStringField("letter", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LetterWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LetterWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LetterWrapper new_() {
        LetterWrapper letterWrapper = new LetterWrapper();
        letterWrapper.nullCheck();
        return letterWrapper;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LetterWrapper m18285clone() {
        LetterWrapper letterWrapper = new LetterWrapper();
        letterWrapper.letter = this.letter;
        return letterWrapper;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LetterWrapper) {
            return ValueObject.util_equals(this.letter, ((LetterWrapper) obj).letter);
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
        String str = this.letter;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.letter == null) {
            this.letter = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
