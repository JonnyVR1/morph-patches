package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.api.api.Network;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class EmojiCatgoryName extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "emojicatgoryname";

    /* JADX INFO: renamed from: en */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38739en;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f38740id;

    /* JADX INFO: renamed from: ja */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f38741ja;

    /* JADX INFO: renamed from: ko */
    @NonNull
    @ProtobufIndex(index = 4)
    public String f38742ko;

    /* JADX INFO: renamed from: ru */
    @NonNull
    @ProtobufIndex(index = 10)
    public String f38743ru;

    /* JADX INFO: renamed from: th */
    @NonNull
    @ProtobufIndex(index = 8)
    public String f38744th;

    /* JADX INFO: renamed from: tr */
    @NonNull
    @ProtobufIndex(index = 5)
    public String f38745tr;

    /* JADX INFO: renamed from: vi */
    @NonNull
    @ProtobufIndex(index = 9)
    public String f38746vi;

    @NonNull
    @ProtobufIndex(index = 6)
    public String zhHans;

    @NonNull
    @ProtobufIndex(index = 7)
    public String zhHant;
    public static ProtobufAdapter<EmojiCatgoryName> PROTOBUF_ADAPTER = new MessageNanoAdapter<EmojiCatgoryName>() { // from class: com.p1.mobile.putong.data.EmojiCatgoryName.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(EmojiCatgoryName emojiCatgoryName) {
            String str = emojiCatgoryName.f38739en;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = emojiCatgoryName.f38740id;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = emojiCatgoryName.f38741ja;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = emojiCatgoryName.f38742ko;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = emojiCatgoryName.f38745tr;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = emojiCatgoryName.zhHans;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = emojiCatgoryName.zhHant;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            String str8 = emojiCatgoryName.f38744th;
            if (str8 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str8);
            }
            String str9 = emojiCatgoryName.f38746vi;
            if (str9 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(9, str9);
            }
            String str10 = emojiCatgoryName.f38743ru;
            if (str10 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(10, str10);
            }
            emojiCatgoryName.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public EmojiCatgoryName parse(nb5 nb5Var) throws IOException {
            EmojiCatgoryName emojiCatgoryName = new EmojiCatgoryName();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (emojiCatgoryName.f38739en == null) {
                            emojiCatgoryName.f38739en = "";
                        }
                        if (emojiCatgoryName.f38740id == null) {
                            emojiCatgoryName.f38740id = "";
                        }
                        if (emojiCatgoryName.f38741ja == null) {
                            emojiCatgoryName.f38741ja = "";
                        }
                        if (emojiCatgoryName.f38742ko == null) {
                            emojiCatgoryName.f38742ko = "";
                        }
                        if (emojiCatgoryName.f38745tr == null) {
                            emojiCatgoryName.f38745tr = "";
                        }
                        if (emojiCatgoryName.zhHans == null) {
                            emojiCatgoryName.zhHans = "";
                        }
                        if (emojiCatgoryName.zhHant == null) {
                            emojiCatgoryName.zhHant = "";
                        }
                        if (emojiCatgoryName.f38744th == null) {
                            emojiCatgoryName.f38744th = "";
                        }
                        if (emojiCatgoryName.f38746vi == null) {
                            emojiCatgoryName.f38746vi = "";
                        }
                        if (emojiCatgoryName.f38743ru == null) {
                            emojiCatgoryName.f38743ru = "";
                        }
                        break;
                    case 10:
                        emojiCatgoryName.f38739en = nb5Var.m158750s();
                        continue;
                    case 18:
                        emojiCatgoryName.f38740id = nb5Var.m158750s();
                        continue;
                    case 26:
                        emojiCatgoryName.f38741ja = nb5Var.m158750s();
                        continue;
                    case 34:
                        emojiCatgoryName.f38742ko = nb5Var.m158750s();
                        continue;
                    case 42:
                        emojiCatgoryName.f38745tr = nb5Var.m158750s();
                        continue;
                    case 50:
                        emojiCatgoryName.zhHans = nb5Var.m158750s();
                        continue;
                    case 58:
                        emojiCatgoryName.zhHant = nb5Var.m158750s();
                        continue;
                    case 66:
                        emojiCatgoryName.f38744th = nb5Var.m158750s();
                        continue;
                    case 74:
                        emojiCatgoryName.f38746vi = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        emojiCatgoryName.f38743ru = nb5Var.m158750s();
                        continue;
                    default:
                        if (emojiCatgoryName.f38739en == null) {
                            emojiCatgoryName.f38739en = "";
                        }
                        if (emojiCatgoryName.f38740id == null) {
                            emojiCatgoryName.f38740id = "";
                        }
                        if (emojiCatgoryName.f38741ja == null) {
                            emojiCatgoryName.f38741ja = "";
                        }
                        if (emojiCatgoryName.f38742ko == null) {
                            emojiCatgoryName.f38742ko = "";
                        }
                        if (emojiCatgoryName.f38745tr == null) {
                            emojiCatgoryName.f38745tr = "";
                        }
                        if (emojiCatgoryName.zhHans == null) {
                            emojiCatgoryName.zhHans = "";
                        }
                        if (emojiCatgoryName.zhHant == null) {
                            emojiCatgoryName.zhHant = "";
                        }
                        if (emojiCatgoryName.f38744th == null) {
                            emojiCatgoryName.f38744th = "";
                        }
                        if (emojiCatgoryName.f38746vi == null) {
                            emojiCatgoryName.f38746vi = "";
                        }
                        if (emojiCatgoryName.f38743ru == null) {
                            emojiCatgoryName.f38743ru = "";
                            return emojiCatgoryName;
                        }
                        break;
                }
            }
            return emojiCatgoryName;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(EmojiCatgoryName emojiCatgoryName, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = emojiCatgoryName.f38739en;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = emojiCatgoryName.f38740id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = emojiCatgoryName.f38741ja;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = emojiCatgoryName.f38742ko;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = emojiCatgoryName.f38745tr;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = emojiCatgoryName.zhHans;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = emojiCatgoryName.zhHant;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            String str8 = emojiCatgoryName.f38744th;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(8, str8);
            }
            String str9 = emojiCatgoryName.f38746vi;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(9, str9);
            }
            String str10 = emojiCatgoryName.f38743ru;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(10, str10);
            }
        }
    };
    public static JsonAdapter<EmojiCatgoryName> JSON_ADAPTER = new ObjectJsonAdapter<EmojiCatgoryName>() { // from class: com.p1.mobile.putong.data.EmojiCatgoryName.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return EmojiCatgoryName.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public EmojiCatgoryName newInstance() {
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
                    emojiCatgoryName.f38739en = jsonParser.getValueAsString();
                    return true;
                case "id":
                    emojiCatgoryName.f38740id = jsonParser.getValueAsString();
                    return false;
                case "ja":
                    emojiCatgoryName.f38741ja = jsonParser.getValueAsString();
                    return true;
                case "ko":
                    emojiCatgoryName.f38742ko = jsonParser.getValueAsString();
                    return true;
                case "ru":
                    emojiCatgoryName.f38743ru = jsonParser.getValueAsString();
                    return true;
                case "th":
                    emojiCatgoryName.f38744th = jsonParser.getValueAsString();
                    return true;
                case "tr":
                    emojiCatgoryName.f38745tr = jsonParser.getValueAsString();
                    return true;
                case "vi":
                    emojiCatgoryName.f38746vi = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(EmojiCatgoryName emojiCatgoryName, JsonGenerator jsonGenerator) throws IOException {
            String str = emojiCatgoryName.f38739en;
            if (str != null) {
                jsonGenerator.writeStringField("en", str);
            }
            String str2 = emojiCatgoryName.f38740id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            String str3 = emojiCatgoryName.f38741ja;
            if (str3 != null) {
                jsonGenerator.writeStringField("ja", str3);
            }
            String str4 = emojiCatgoryName.f38742ko;
            if (str4 != null) {
                jsonGenerator.writeStringField("ko", str4);
            }
            String str5 = emojiCatgoryName.f38745tr;
            if (str5 != null) {
                jsonGenerator.writeStringField("tr", str5);
            }
            String str6 = emojiCatgoryName.zhHans;
            if (str6 != null) {
                jsonGenerator.writeStringField(Network.LANGUAGE_ZH_HANS, str6);
            }
            String str7 = emojiCatgoryName.zhHant;
            if (str7 != null) {
                jsonGenerator.writeStringField(Network.LANGUAGE_ZH_HANT, str7);
            }
            String str8 = emojiCatgoryName.f38744th;
            if (str8 != null) {
                jsonGenerator.writeStringField("th", str8);
            }
            String str9 = emojiCatgoryName.f38746vi;
            if (str9 != null) {
                jsonGenerator.writeStringField("vi", str9);
            }
            String str10 = emojiCatgoryName.f38743ru;
            if (str10 != null) {
                jsonGenerator.writeStringField("ru", str10);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmojiCatgoryName) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EmojiCatgoryName) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static EmojiCatgoryName new_() {
        EmojiCatgoryName emojiCatgoryName = new EmojiCatgoryName();
        emojiCatgoryName.nullCheck();
        return emojiCatgoryName;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public EmojiCatgoryName mo223809clone() {
        EmojiCatgoryName emojiCatgoryName = new EmojiCatgoryName();
        emojiCatgoryName.f38739en = this.f38739en;
        emojiCatgoryName.f38740id = this.f38740id;
        emojiCatgoryName.f38741ja = this.f38741ja;
        emojiCatgoryName.f38742ko = this.f38742ko;
        emojiCatgoryName.f38745tr = this.f38745tr;
        emojiCatgoryName.zhHans = this.zhHans;
        emojiCatgoryName.zhHant = this.zhHant;
        emojiCatgoryName.f38744th = this.f38744th;
        emojiCatgoryName.f38746vi = this.f38746vi;
        emojiCatgoryName.f38743ru = this.f38743ru;
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
        return ValueObject.util_equals(this.f38739en, emojiCatgoryName.f38739en) && ValueObject.util_equals(this.f38740id, emojiCatgoryName.f38740id) && ValueObject.util_equals(this.f38741ja, emojiCatgoryName.f38741ja) && ValueObject.util_equals(this.f38742ko, emojiCatgoryName.f38742ko) && ValueObject.util_equals(this.f38745tr, emojiCatgoryName.f38745tr) && ValueObject.util_equals(this.zhHans, emojiCatgoryName.zhHans) && ValueObject.util_equals(this.zhHant, emojiCatgoryName.zhHant) && ValueObject.util_equals(this.f38744th, emojiCatgoryName.f38744th) && ValueObject.util_equals(this.f38746vi, emojiCatgoryName.f38746vi) && ValueObject.util_equals(this.f38743ru, emojiCatgoryName.f38743ru);
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
        String str = this.f38739en;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f38740id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.f38741ja;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.f38742ko;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.f38745tr;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.zhHans;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.zhHant;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.f38744th;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.f38746vi;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.f38743ru;
        int iHashCode10 = iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38739en == null) {
            this.f38739en = "";
        }
        if (this.f38740id == null) {
            this.f38740id = "";
        }
        if (this.f38741ja == null) {
            this.f38741ja = "";
        }
        if (this.f38742ko == null) {
            this.f38742ko = "";
        }
        if (this.f38745tr == null) {
            this.f38745tr = "";
        }
        if (this.zhHans == null) {
            this.zhHans = "";
        }
        if (this.zhHant == null) {
            this.zhHant = "";
        }
        if (this.f38744th == null) {
            this.f38744th = "";
        }
        if (this.f38746vi == null) {
            this.f38746vi = "";
        }
        if (this.f38743ru == null) {
            this.f38743ru = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
