package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.api.api.Network;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class EmojiCatgoryName extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "emojicatgoryname";

    /* JADX INFO: renamed from: en */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39587en;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f39588id;

    /* JADX INFO: renamed from: ja */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f39589ja;

    /* JADX INFO: renamed from: ko */
    @NonNull
    @ProtobufIndex(index = 4)
    public String f39590ko;

    /* JADX INFO: renamed from: ru */
    @NonNull
    @ProtobufIndex(index = 10)
    public String f39591ru;

    /* JADX INFO: renamed from: th */
    @NonNull
    @ProtobufIndex(index = 8)
    public String f39592th;

    /* JADX INFO: renamed from: tr */
    @NonNull
    @ProtobufIndex(index = 5)
    public String f39593tr;

    /* JADX INFO: renamed from: vi */
    @NonNull
    @ProtobufIndex(index = 9)
    public String f39594vi;

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
            String str = emojiCatgoryName.f39587en;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = emojiCatgoryName.f39588id;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = emojiCatgoryName.f39589ja;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = emojiCatgoryName.f39590ko;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = emojiCatgoryName.f39593tr;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = emojiCatgoryName.zhHans;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            String str7 = emojiCatgoryName.zhHant;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str7);
            }
            String str8 = emojiCatgoryName.f39592th;
            if (str8 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str8);
            }
            String str9 = emojiCatgoryName.f39594vi;
            if (str9 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(9, str9);
            }
            String str10 = emojiCatgoryName.f39591ru;
            if (str10 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(10, str10);
            }
            emojiCatgoryName.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public EmojiCatgoryName parse(nc5 nc5Var) throws IOException {
            EmojiCatgoryName emojiCatgoryName = new EmojiCatgoryName();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (emojiCatgoryName.f39587en == null) {
                            emojiCatgoryName.f39587en = "";
                        }
                        if (emojiCatgoryName.f39588id == null) {
                            emojiCatgoryName.f39588id = "";
                        }
                        if (emojiCatgoryName.f39589ja == null) {
                            emojiCatgoryName.f39589ja = "";
                        }
                        if (emojiCatgoryName.f39590ko == null) {
                            emojiCatgoryName.f39590ko = "";
                        }
                        if (emojiCatgoryName.f39593tr == null) {
                            emojiCatgoryName.f39593tr = "";
                        }
                        if (emojiCatgoryName.zhHans == null) {
                            emojiCatgoryName.zhHans = "";
                        }
                        if (emojiCatgoryName.zhHant == null) {
                            emojiCatgoryName.zhHant = "";
                        }
                        if (emojiCatgoryName.f39592th == null) {
                            emojiCatgoryName.f39592th = "";
                        }
                        if (emojiCatgoryName.f39594vi == null) {
                            emojiCatgoryName.f39594vi = "";
                        }
                        if (emojiCatgoryName.f39591ru == null) {
                            emojiCatgoryName.f39591ru = "";
                        }
                        break;
                    case 10:
                        emojiCatgoryName.f39587en = nc5Var.m162495s();
                        continue;
                    case 18:
                        emojiCatgoryName.f39588id = nc5Var.m162495s();
                        continue;
                    case 26:
                        emojiCatgoryName.f39589ja = nc5Var.m162495s();
                        continue;
                    case 34:
                        emojiCatgoryName.f39590ko = nc5Var.m162495s();
                        continue;
                    case 42:
                        emojiCatgoryName.f39593tr = nc5Var.m162495s();
                        continue;
                    case 50:
                        emojiCatgoryName.zhHans = nc5Var.m162495s();
                        continue;
                    case 58:
                        emojiCatgoryName.zhHant = nc5Var.m162495s();
                        continue;
                    case 66:
                        emojiCatgoryName.f39592th = nc5Var.m162495s();
                        continue;
                    case 74:
                        emojiCatgoryName.f39594vi = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        emojiCatgoryName.f39591ru = nc5Var.m162495s();
                        continue;
                    default:
                        if (emojiCatgoryName.f39587en == null) {
                            emojiCatgoryName.f39587en = "";
                        }
                        if (emojiCatgoryName.f39588id == null) {
                            emojiCatgoryName.f39588id = "";
                        }
                        if (emojiCatgoryName.f39589ja == null) {
                            emojiCatgoryName.f39589ja = "";
                        }
                        if (emojiCatgoryName.f39590ko == null) {
                            emojiCatgoryName.f39590ko = "";
                        }
                        if (emojiCatgoryName.f39593tr == null) {
                            emojiCatgoryName.f39593tr = "";
                        }
                        if (emojiCatgoryName.zhHans == null) {
                            emojiCatgoryName.zhHans = "";
                        }
                        if (emojiCatgoryName.zhHant == null) {
                            emojiCatgoryName.zhHant = "";
                        }
                        if (emojiCatgoryName.f39592th == null) {
                            emojiCatgoryName.f39592th = "";
                        }
                        if (emojiCatgoryName.f39594vi == null) {
                            emojiCatgoryName.f39594vi = "";
                        }
                        if (emojiCatgoryName.f39591ru == null) {
                            emojiCatgoryName.f39591ru = "";
                            return emojiCatgoryName;
                        }
                        break;
                }
            }
            return emojiCatgoryName;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(EmojiCatgoryName emojiCatgoryName, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = emojiCatgoryName.f39587en;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = emojiCatgoryName.f39588id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = emojiCatgoryName.f39589ja;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = emojiCatgoryName.f39590ko;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = emojiCatgoryName.f39593tr;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = emojiCatgoryName.zhHans;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            String str7 = emojiCatgoryName.zhHant;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(7, str7);
            }
            String str8 = emojiCatgoryName.f39592th;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(8, str8);
            }
            String str9 = emojiCatgoryName.f39594vi;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(9, str9);
            }
            String str10 = emojiCatgoryName.f39591ru;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(10, str10);
            }
        }
    };
    public static JsonAdapter<EmojiCatgoryName> JSON_ADAPTER = new ObjectJsonAdapter<EmojiCatgoryName>() { // from class: com.p1.mobile.putong.data.EmojiCatgoryName.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return EmojiCatgoryName.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    emojiCatgoryName.f39587en = jsonParser.getValueAsString();
                    return true;
                case "id":
                    emojiCatgoryName.f39588id = jsonParser.getValueAsString();
                    return false;
                case "ja":
                    emojiCatgoryName.f39589ja = jsonParser.getValueAsString();
                    return true;
                case "ko":
                    emojiCatgoryName.f39590ko = jsonParser.getValueAsString();
                    return true;
                case "ru":
                    emojiCatgoryName.f39591ru = jsonParser.getValueAsString();
                    return true;
                case "th":
                    emojiCatgoryName.f39592th = jsonParser.getValueAsString();
                    return true;
                case "tr":
                    emojiCatgoryName.f39593tr = jsonParser.getValueAsString();
                    return true;
                case "vi":
                    emojiCatgoryName.f39594vi = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(EmojiCatgoryName emojiCatgoryName, JsonGenerator jsonGenerator) throws IOException {
            String str = emojiCatgoryName.f39587en;
            if (str != null) {
                jsonGenerator.writeStringField("en", str);
            }
            String str2 = emojiCatgoryName.f39588id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            String str3 = emojiCatgoryName.f39589ja;
            if (str3 != null) {
                jsonGenerator.writeStringField("ja", str3);
            }
            String str4 = emojiCatgoryName.f39590ko;
            if (str4 != null) {
                jsonGenerator.writeStringField("ko", str4);
            }
            String str5 = emojiCatgoryName.f39593tr;
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
            String str8 = emojiCatgoryName.f39592th;
            if (str8 != null) {
                jsonGenerator.writeStringField("th", str8);
            }
            String str9 = emojiCatgoryName.f39594vi;
            if (str9 != null) {
                jsonGenerator.writeStringField("vi", str9);
            }
            String str10 = emojiCatgoryName.f39591ru;
            if (str10 != null) {
                jsonGenerator.writeStringField("ru", str10);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmojiCatgoryName) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public EmojiCatgoryName mo225055clone() {
        EmojiCatgoryName emojiCatgoryName = new EmojiCatgoryName();
        emojiCatgoryName.f39587en = this.f39587en;
        emojiCatgoryName.f39588id = this.f39588id;
        emojiCatgoryName.f39589ja = this.f39589ja;
        emojiCatgoryName.f39590ko = this.f39590ko;
        emojiCatgoryName.f39593tr = this.f39593tr;
        emojiCatgoryName.zhHans = this.zhHans;
        emojiCatgoryName.zhHant = this.zhHant;
        emojiCatgoryName.f39592th = this.f39592th;
        emojiCatgoryName.f39594vi = this.f39594vi;
        emojiCatgoryName.f39591ru = this.f39591ru;
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
        return ValueObject.util_equals(this.f39587en, emojiCatgoryName.f39587en) && ValueObject.util_equals(this.f39588id, emojiCatgoryName.f39588id) && ValueObject.util_equals(this.f39589ja, emojiCatgoryName.f39589ja) && ValueObject.util_equals(this.f39590ko, emojiCatgoryName.f39590ko) && ValueObject.util_equals(this.f39593tr, emojiCatgoryName.f39593tr) && ValueObject.util_equals(this.zhHans, emojiCatgoryName.zhHans) && ValueObject.util_equals(this.zhHant, emojiCatgoryName.zhHant) && ValueObject.util_equals(this.f39592th, emojiCatgoryName.f39592th) && ValueObject.util_equals(this.f39594vi, emojiCatgoryName.f39594vi) && ValueObject.util_equals(this.f39591ru, emojiCatgoryName.f39591ru);
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
        String str = this.f39587en;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f39588id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.f39589ja;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.f39590ko;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.f39593tr;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.zhHans;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.zhHant;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.f39592th;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.f39594vi;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.f39591ru;
        int iHashCode10 = iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39587en == null) {
            this.f39587en = "";
        }
        if (this.f39588id == null) {
            this.f39588id = "";
        }
        if (this.f39589ja == null) {
            this.f39589ja = "";
        }
        if (this.f39590ko == null) {
            this.f39590ko = "";
        }
        if (this.f39593tr == null) {
            this.f39593tr = "";
        }
        if (this.zhHans == null) {
            this.zhHans = "";
        }
        if (this.zhHant == null) {
            this.zhHant = "";
        }
        if (this.f39592th == null) {
            this.f39592th = "";
        }
        if (this.f39594vi == null) {
            this.f39594vi = "";
        }
        if (this.f39591ru == null) {
            this.f39591ru = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
