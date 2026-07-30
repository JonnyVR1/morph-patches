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
public class EmojiCatgoryName extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "emojicatgoryname";

    /* JADX INFO: renamed from: en */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f200en;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f201id;

    /* JADX INFO: renamed from: ja */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f202ja;

    /* JADX INFO: renamed from: ko */
    @NonNull
    @ProtobufIndex(index = 4)
    public String f203ko;

    /* JADX INFO: renamed from: ru */
    @NonNull
    @ProtobufIndex(index = 10)
    public String f204ru;

    /* JADX INFO: renamed from: th */
    @NonNull
    @ProtobufIndex(index = 8)
    public String f205th;

    /* JADX INFO: renamed from: tr */
    @NonNull
    @ProtobufIndex(index = 5)
    public String f206tr;

    /* JADX INFO: renamed from: vi */
    @NonNull
    @ProtobufIndex(index = 9)
    public String f207vi;

    @NonNull
    @ProtobufIndex(index = 6)
    public String zhHans;

    @NonNull
    @ProtobufIndex(index = 7)
    public String zhHant;
    public static ProtobufAdapter<EmojiCatgoryName> PROTOBUF_ADAPTER = new MessageNanoAdapter<EmojiCatgoryName>() { // from class: com.p1.mobile.putong.data.EmojiCatgoryName.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(EmojiCatgoryName emojiCatgoryName) {
            String str = emojiCatgoryName.f200en;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = emojiCatgoryName.f201id;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = emojiCatgoryName.f202ja;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = emojiCatgoryName.f203ko;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = emojiCatgoryName.f206tr;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = emojiCatgoryName.zhHans;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = emojiCatgoryName.zhHant;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            String str8 = emojiCatgoryName.f205th;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(8, str8);
            }
            String str9 = emojiCatgoryName.f207vi;
            if (str9 != null) {
                iO += CodedOutputByteBufferNano.o(9, str9);
            }
            String str10 = emojiCatgoryName.f204ru;
            if (str10 != null) {
                iO += CodedOutputByteBufferNano.o(10, str10);
            }
            ((MessageNano) emojiCatgoryName).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public EmojiCatgoryName m18010parse(nb5 nb5Var) throws IOException {
            EmojiCatgoryName emojiCatgoryName = new EmojiCatgoryName();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (emojiCatgoryName.f200en == null) {
                            emojiCatgoryName.f200en = "";
                        }
                        if (emojiCatgoryName.f201id == null) {
                            emojiCatgoryName.f201id = "";
                        }
                        if (emojiCatgoryName.f202ja == null) {
                            emojiCatgoryName.f202ja = "";
                        }
                        if (emojiCatgoryName.f203ko == null) {
                            emojiCatgoryName.f203ko = "";
                        }
                        if (emojiCatgoryName.f206tr == null) {
                            emojiCatgoryName.f206tr = "";
                        }
                        if (emojiCatgoryName.zhHans == null) {
                            emojiCatgoryName.zhHans = "";
                        }
                        if (emojiCatgoryName.zhHant == null) {
                            emojiCatgoryName.zhHant = "";
                        }
                        if (emojiCatgoryName.f205th == null) {
                            emojiCatgoryName.f205th = "";
                        }
                        if (emojiCatgoryName.f207vi == null) {
                            emojiCatgoryName.f207vi = "";
                        }
                        if (emojiCatgoryName.f204ru == null) {
                            emojiCatgoryName.f204ru = "";
                        }
                        break;
                    case 10:
                        emojiCatgoryName.f200en = nb5Var.s();
                        continue;
                    case 18:
                        emojiCatgoryName.f201id = nb5Var.s();
                        continue;
                    case 26:
                        emojiCatgoryName.f202ja = nb5Var.s();
                        continue;
                    case 34:
                        emojiCatgoryName.f203ko = nb5Var.s();
                        continue;
                    case 42:
                        emojiCatgoryName.f206tr = nb5Var.s();
                        continue;
                    case 50:
                        emojiCatgoryName.zhHans = nb5Var.s();
                        continue;
                    case 58:
                        emojiCatgoryName.zhHant = nb5Var.s();
                        continue;
                    case 66:
                        emojiCatgoryName.f205th = nb5Var.s();
                        continue;
                    case 74:
                        emojiCatgoryName.f207vi = nb5Var.s();
                        continue;
                    case 82:
                        emojiCatgoryName.f204ru = nb5Var.s();
                        continue;
                    default:
                        if (emojiCatgoryName.f200en == null) {
                            emojiCatgoryName.f200en = "";
                        }
                        if (emojiCatgoryName.f201id == null) {
                            emojiCatgoryName.f201id = "";
                        }
                        if (emojiCatgoryName.f202ja == null) {
                            emojiCatgoryName.f202ja = "";
                        }
                        if (emojiCatgoryName.f203ko == null) {
                            emojiCatgoryName.f203ko = "";
                        }
                        if (emojiCatgoryName.f206tr == null) {
                            emojiCatgoryName.f206tr = "";
                        }
                        if (emojiCatgoryName.zhHans == null) {
                            emojiCatgoryName.zhHans = "";
                        }
                        if (emojiCatgoryName.zhHant == null) {
                            emojiCatgoryName.zhHant = "";
                        }
                        if (emojiCatgoryName.f205th == null) {
                            emojiCatgoryName.f205th = "";
                        }
                        if (emojiCatgoryName.f207vi == null) {
                            emojiCatgoryName.f207vi = "";
                        }
                        if (emojiCatgoryName.f204ru == null) {
                            emojiCatgoryName.f204ru = "";
                            return emojiCatgoryName;
                        }
                        break;
                }
            }
            return emojiCatgoryName;
        }

        public void serialize(EmojiCatgoryName emojiCatgoryName, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = emojiCatgoryName.f200en;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = emojiCatgoryName.f201id;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = emojiCatgoryName.f202ja;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = emojiCatgoryName.f203ko;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = emojiCatgoryName.f206tr;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = emojiCatgoryName.zhHans;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = emojiCatgoryName.zhHant;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            String str8 = emojiCatgoryName.f205th;
            if (str8 != null) {
                codedOutputByteBufferNano.R(8, str8);
            }
            String str9 = emojiCatgoryName.f207vi;
            if (str9 != null) {
                codedOutputByteBufferNano.R(9, str9);
            }
            String str10 = emojiCatgoryName.f204ru;
            if (str10 != null) {
                codedOutputByteBufferNano.R(10, str10);
            }
        }
    };
    public static JsonAdapter<EmojiCatgoryName> JSON_ADAPTER = new ObjectJsonAdapter<EmojiCatgoryName>() { // from class: com.p1.mobile.putong.data.EmojiCatgoryName.2
        public Class getDataClass() {
            return EmojiCatgoryName.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public EmojiCatgoryName mo17830newInstance() {
            return new EmojiCatgoryName();
        }

        public boolean parseField(EmojiCatgoryName emojiCatgoryName, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "zh-Hans":
                    emojiCatgoryName.zhHans = jsonParser.getValueAsString();
                    return true;
                case "zh-Hant":
                    emojiCatgoryName.zhHant = jsonParser.getValueAsString();
                    return true;
                case "en":
                    emojiCatgoryName.f200en = jsonParser.getValueAsString();
                    return true;
                case "id":
                    emojiCatgoryName.f201id = jsonParser.getValueAsString();
                    return false;
                case "ja":
                    emojiCatgoryName.f202ja = jsonParser.getValueAsString();
                    return true;
                case "ko":
                    emojiCatgoryName.f203ko = jsonParser.getValueAsString();
                    return true;
                case "ru":
                    emojiCatgoryName.f204ru = jsonParser.getValueAsString();
                    return true;
                case "th":
                    emojiCatgoryName.f205th = jsonParser.getValueAsString();
                    return true;
                case "tr":
                    emojiCatgoryName.f206tr = jsonParser.getValueAsString();
                    return true;
                case "vi":
                    emojiCatgoryName.f207vi = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(EmojiCatgoryName emojiCatgoryName, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "zh-Hans":
                case "zh-Hant":
                case "en":
                    return true;
                case "id":
                    return false;
                case "ja":
                case "ko":
                case "ru":
                case "th":
                case "tr":
                case "vi":
                    return true;
                default:
                    return super.parseFieldCheck(emojiCatgoryName, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(EmojiCatgoryName emojiCatgoryName, JsonGenerator jsonGenerator) throws IOException {
            String str = emojiCatgoryName.f200en;
            if (str != null) {
                jsonGenerator.writeStringField("en", str);
            }
            String str2 = emojiCatgoryName.f201id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            String str3 = emojiCatgoryName.f202ja;
            if (str3 != null) {
                jsonGenerator.writeStringField("ja", str3);
            }
            String str4 = emojiCatgoryName.f203ko;
            if (str4 != null) {
                jsonGenerator.writeStringField("ko", str4);
            }
            String str5 = emojiCatgoryName.f206tr;
            if (str5 != null) {
                jsonGenerator.writeStringField("tr", str5);
            }
            String str6 = emojiCatgoryName.zhHans;
            if (str6 != null) {
                jsonGenerator.writeStringField("zh-Hans", str6);
            }
            String str7 = emojiCatgoryName.zhHant;
            if (str7 != null) {
                jsonGenerator.writeStringField("zh-Hant", str7);
            }
            String str8 = emojiCatgoryName.f205th;
            if (str8 != null) {
                jsonGenerator.writeStringField("th", str8);
            }
            String str9 = emojiCatgoryName.f207vi;
            if (str9 != null) {
                jsonGenerator.writeStringField("vi", str9);
            }
            String str10 = emojiCatgoryName.f204ru;
            if (str10 != null) {
                jsonGenerator.writeStringField("ru", str10);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmojiCatgoryName) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EmojiCatgoryName) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static EmojiCatgoryName new_() {
        EmojiCatgoryName emojiCatgoryName = new EmojiCatgoryName();
        emojiCatgoryName.nullCheck();
        return emojiCatgoryName;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public EmojiCatgoryName m18009clone() {
        EmojiCatgoryName emojiCatgoryName = new EmojiCatgoryName();
        emojiCatgoryName.f200en = this.f200en;
        emojiCatgoryName.f201id = this.f201id;
        emojiCatgoryName.f202ja = this.f202ja;
        emojiCatgoryName.f203ko = this.f203ko;
        emojiCatgoryName.f206tr = this.f206tr;
        emojiCatgoryName.zhHans = this.zhHans;
        emojiCatgoryName.zhHant = this.zhHant;
        emojiCatgoryName.f205th = this.f205th;
        emojiCatgoryName.f207vi = this.f207vi;
        emojiCatgoryName.f204ru = this.f204ru;
        return emojiCatgoryName;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmojiCatgoryName)) {
            return false;
        }
        EmojiCatgoryName emojiCatgoryName = (EmojiCatgoryName) obj;
        return ValueObject.util_equals(this.f200en, emojiCatgoryName.f200en) && ValueObject.util_equals(this.f201id, emojiCatgoryName.f201id) && ValueObject.util_equals(this.f202ja, emojiCatgoryName.f202ja) && ValueObject.util_equals(this.f203ko, emojiCatgoryName.f203ko) && ValueObject.util_equals(this.f206tr, emojiCatgoryName.f206tr) && ValueObject.util_equals(this.zhHans, emojiCatgoryName.zhHans) && ValueObject.util_equals(this.zhHant, emojiCatgoryName.zhHant) && ValueObject.util_equals(this.f205th, emojiCatgoryName.f205th) && ValueObject.util_equals(this.f207vi, emojiCatgoryName.f207vi) && ValueObject.util_equals(this.f204ru, emojiCatgoryName.f204ru);
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
        String str = this.f200en;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f201id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.f202ja;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.f203ko;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.f206tr;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.zhHans;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.zhHant;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.f205th;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.f207vi;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.f204ru;
        int iHashCode10 = iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode10;
        return iHashCode10;
    }

    public void nullCheck() {
        if (this.f200en == null) {
            this.f200en = "";
        }
        if (this.f201id == null) {
            this.f201id = "";
        }
        if (this.f202ja == null) {
            this.f202ja = "";
        }
        if (this.f203ko == null) {
            this.f203ko = "";
        }
        if (this.f206tr == null) {
            this.f206tr = "";
        }
        if (this.zhHans == null) {
            this.zhHans = "";
        }
        if (this.zhHant == null) {
            this.zhHant = "";
        }
        if (this.f205th == null) {
            this.f205th = "";
        }
        if (this.f207vi == null) {
            this.f207vi = "";
        }
        if (this.f204ru == null) {
            this.f204ru = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
