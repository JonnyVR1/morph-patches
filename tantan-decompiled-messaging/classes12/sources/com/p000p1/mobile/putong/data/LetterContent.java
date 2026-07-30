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
public class LetterContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lettercontent";

    @NonNull
    @ProtobufIndex(index = 3)
    public String content;

    @NonNull
    @ProtobufIndex(index = 4)
    public String gender;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f225id;
    public boolean isSelected;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<LetterContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<LetterContent>() { // from class: com.p1.mobile.putong.data.LetterContent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LetterContent letterContent) {
            String str = letterContent.f225id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = letterContent.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = letterContent.content;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = letterContent.gender;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) letterContent).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LetterContent m18283parse(nb5 nb5Var) throws IOException {
            LetterContent letterContent = new LetterContent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (letterContent.f225id == null) {
                        letterContent.f225id = "";
                    }
                    if (letterContent.type == null) {
                        letterContent.type = "";
                    }
                    if (letterContent.content == null) {
                        letterContent.content = "";
                    }
                    if (letterContent.gender != null) {
                        break;
                    }
                    letterContent.gender = "";
                    break;
                }
                if (iU == 10) {
                    letterContent.f225id = nb5Var.s();
                } else if (iU == 18) {
                    letterContent.type = nb5Var.s();
                } else if (iU == 26) {
                    letterContent.content = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (letterContent.f225id == null) {
                            letterContent.f225id = "";
                        }
                        if (letterContent.type == null) {
                            letterContent.type = "";
                        }
                        if (letterContent.content == null) {
                            letterContent.content = "";
                        }
                        if (letterContent.gender != null) {
                            break;
                        }
                        letterContent.gender = "";
                        return letterContent;
                    }
                    letterContent.gender = nb5Var.s();
                }
            }
            return letterContent;
        }

        public void serialize(LetterContent letterContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = letterContent.f225id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = letterContent.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = letterContent.content;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = letterContent.gender;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<LetterContent> JSON_ADAPTER = new ObjectJsonAdapter<LetterContent>() { // from class: com.p1.mobile.putong.data.LetterContent.2
        public Class getDataClass() {
            return LetterContent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LetterContent mo17830newInstance() {
            return new LetterContent();
        }

        public boolean parseField(LetterContent letterContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    letterContent.gender = jsonParser.getValueAsString();
                    return true;
                case "id":
                    letterContent.f225id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    letterContent.type = jsonParser.getValueAsString();
                    return true;
                case "content":
                    letterContent.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LetterContent letterContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "gender":
                    return true;
                case "id":
                    return false;
                case "type":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(letterContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LetterContent letterContent, JsonGenerator jsonGenerator) throws IOException {
            String str = letterContent.f225id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = letterContent.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = letterContent.content;
            if (str3 != null) {
                jsonGenerator.writeStringField("content", str3);
            }
            String str4 = letterContent.gender;
            if (str4 != null) {
                jsonGenerator.writeStringField("gender", str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LetterContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LetterContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LetterContent new_() {
        LetterContent letterContent = new LetterContent();
        letterContent.nullCheck();
        return letterContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LetterContent m18282clone() {
        LetterContent letterContent = new LetterContent();
        letterContent.f225id = this.f225id;
        letterContent.type = this.type;
        letterContent.content = this.content;
        letterContent.gender = this.gender;
        return letterContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LetterContent)) {
            return false;
        }
        LetterContent letterContent = (LetterContent) obj;
        return ValueObject.util_equals(this.f225id, letterContent.f225id) && ValueObject.util_equals(this.type, letterContent.type) && ValueObject.util_equals(this.content, letterContent.content) && ValueObject.util_equals(this.gender, letterContent.gender);
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
        String str = this.f225id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.gender;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f225id == null) {
            this.f225id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
