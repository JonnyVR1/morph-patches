package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
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
    public String f38764id;
    public boolean isSelected;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<LetterContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<LetterContent>() { // from class: com.p1.mobile.putong.data.LetterContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LetterContent letterContent) {
            String str = letterContent.f38764id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = letterContent.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = letterContent.content;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = letterContent.gender;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            letterContent.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LetterContent parse(nb5 nb5Var) throws IOException {
            LetterContent letterContent = new LetterContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (letterContent.f38764id == null) {
                        letterContent.f38764id = "";
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
                if (iM158752u == 10) {
                    letterContent.f38764id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    letterContent.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    letterContent.content = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (letterContent.f38764id == null) {
                            letterContent.f38764id = "";
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
                    letterContent.gender = nb5Var.m158750s();
                }
            }
            return letterContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LetterContent letterContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = letterContent.f38764id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = letterContent.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = letterContent.content;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = letterContent.gender;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<LetterContent> JSON_ADAPTER = new ObjectJsonAdapter<LetterContent>() { // from class: com.p1.mobile.putong.data.LetterContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LetterContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LetterContent newInstance() {
            return new LetterContent();
        }

        public boolean parseField(LetterContent letterContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    letterContent.gender = jsonParser.getValueAsString();
                    return true;
                case "id":
                    letterContent.f38764id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LetterContent letterContent, JsonGenerator jsonGenerator) throws IOException {
            String str = letterContent.f38764id;
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LetterContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LetterContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LetterContent new_() {
        LetterContent letterContent = new LetterContent();
        letterContent.nullCheck();
        return letterContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LetterContent mo223809clone() {
        LetterContent letterContent = new LetterContent();
        letterContent.f38764id = this.f38764id;
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
        return ValueObject.util_equals(this.f38764id, letterContent.f38764id) && ValueObject.util_equals(this.type, letterContent.type) && ValueObject.util_equals(this.content, letterContent.content) && ValueObject.util_equals(this.gender, letterContent.gender);
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
        String str = this.f38764id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.gender;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38764id == null) {
            this.f38764id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
