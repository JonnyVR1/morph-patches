package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.momo.momortc.MMConstants;
import com.p051p1.mobile.putong.data.Converter;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class CityCData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "citycdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String cardId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String cardTag;

    @NonNull
    @ProtobufIndex(index = 7)
    public String cardText;

    @NonNull
    @ProtobufIndex(index = 5)
    public String cardTitle;

    @NonNull
    @ProtobufIndex(index = 17)
    public String cityName;

    @ProtobufIndex(index = 8)
    public int cost;

    @NonNull
    @ProtobufIndex(index = 9)
    public String costText;

    @NonNull
    @ProtobufIndex(index = 10)
    public String costType;

    @ProtobufIndex(index = 16)
    public double expireAt;

    @NonNull
    @ProtobufIndex(index = 12)
    public String extra;

    @NonNull
    @ProtobufIndex(index = 11)
    public String profileTag;

    @ProtobufIndex(index = 15)
    public int recievedLikeCount;

    @NonNull
    @ProtobufIndex(index = 3)
    public String titleLocation;

    @NonNull
    @ProtobufIndex(index = 4)
    public String titleTag;

    @ProtobufIndex(index = 13)
    public double updatedTimeexpireAt;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @ProtobufIndex(index = 14)
    public int viewCount;
    public static ProtobufAdapter<CityCData> PROTOBUF_ADAPTER = new MessageNanoAdapter<CityCData>() { // from class: com.p1.mobile.putong.core.data.CityCData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CityCData cityCData) {
            String str = cityCData.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = cityCData.cardId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = cityCData.titleLocation;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = cityCData.titleTag;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = cityCData.cardTitle;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = cityCData.cardTag;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            String str7 = cityCData.cardText;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str7);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(8, cityCData.cost);
            String str8 = cityCData.costText;
            if (str8 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(9, str8);
            }
            String str9 = cityCData.costType;
            if (str9 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(10, str9);
            }
            String str10 = cityCData.profileTag;
            if (str10 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(11, str10);
            }
            String str11 = cityCData.extra;
            if (str11 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(12, str11);
            }
            int iM17277d = iM17281h + CodedOutputByteBufferNano.m17277d(13, cityCData.updatedTimeexpireAt) + CodedOutputByteBufferNano.m17281h(14, cityCData.viewCount) + CodedOutputByteBufferNano.m17281h(15, cityCData.recievedLikeCount) + CodedOutputByteBufferNano.m17277d(16, cityCData.expireAt);
            String str12 = cityCData.cityName;
            if (str12 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(17, str12);
            }
            cityCData.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CityCData parse(nc5 nc5Var) throws IOException {
            CityCData cityCData = new CityCData();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (cityCData.userId == null) {
                            cityCData.userId = "";
                        }
                        if (cityCData.cardId == null) {
                            cityCData.cardId = "";
                        }
                        if (cityCData.titleLocation == null) {
                            cityCData.titleLocation = "";
                        }
                        if (cityCData.titleTag == null) {
                            cityCData.titleTag = "";
                        }
                        if (cityCData.cardTitle == null) {
                            cityCData.cardTitle = "";
                        }
                        if (cityCData.cardTag == null) {
                            cityCData.cardTag = "";
                        }
                        if (cityCData.cardText == null) {
                            cityCData.cardText = "";
                        }
                        if (cityCData.costText == null) {
                            cityCData.costText = "";
                        }
                        if (cityCData.costType == null) {
                            cityCData.costType = "";
                        }
                        if (cityCData.profileTag == null) {
                            cityCData.profileTag = "";
                        }
                        if (cityCData.extra == null) {
                            cityCData.extra = "";
                        }
                        if (cityCData.cityName == null) {
                            cityCData.cityName = "";
                        }
                        break;
                    case 10:
                        cityCData.userId = nc5Var.m162495s();
                        continue;
                    case 18:
                        cityCData.cardId = nc5Var.m162495s();
                        continue;
                    case 26:
                        cityCData.titleLocation = nc5Var.m162495s();
                        continue;
                    case 34:
                        cityCData.titleTag = nc5Var.m162495s();
                        continue;
                    case 42:
                        cityCData.cardTitle = nc5Var.m162495s();
                        continue;
                    case 50:
                        cityCData.cardTag = nc5Var.m162495s();
                        continue;
                    case 58:
                        cityCData.cardText = nc5Var.m162495s();
                        continue;
                    case 64:
                        cityCData.cost = nc5Var.m162486j();
                        continue;
                    case 74:
                        cityCData.costText = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        cityCData.costType = nc5Var.m162495s();
                        continue;
                    case 90:
                        cityCData.profileTag = nc5Var.m162495s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        cityCData.extra = nc5Var.m162495s();
                        continue;
                    case 105:
                        cityCData.updatedTimeexpireAt = nc5Var.m162484h();
                        continue;
                    case 112:
                        cityCData.viewCount = nc5Var.m162486j();
                        continue;
                    case 120:
                        cityCData.recievedLikeCount = nc5Var.m162486j();
                        continue;
                    case MMConstants.ERR_WATERMARK_READ /* 129 */:
                        cityCData.expireAt = nc5Var.m162484h();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        cityCData.cityName = nc5Var.m162495s();
                        continue;
                    default:
                        if (cityCData.userId == null) {
                            cityCData.userId = "";
                        }
                        if (cityCData.cardId == null) {
                            cityCData.cardId = "";
                        }
                        if (cityCData.titleLocation == null) {
                            cityCData.titleLocation = "";
                        }
                        if (cityCData.titleTag == null) {
                            cityCData.titleTag = "";
                        }
                        if (cityCData.cardTitle == null) {
                            cityCData.cardTitle = "";
                        }
                        if (cityCData.cardTag == null) {
                            cityCData.cardTag = "";
                        }
                        if (cityCData.cardText == null) {
                            cityCData.cardText = "";
                        }
                        if (cityCData.costText == null) {
                            cityCData.costText = "";
                        }
                        if (cityCData.costType == null) {
                            cityCData.costType = "";
                        }
                        if (cityCData.profileTag == null) {
                            cityCData.profileTag = "";
                        }
                        if (cityCData.extra == null) {
                            cityCData.extra = "";
                        }
                        if (cityCData.cityName == null) {
                            cityCData.cityName = "";
                            return cityCData;
                        }
                        break;
                }
            }
            return cityCData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CityCData cityCData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cityCData.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = cityCData.cardId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = cityCData.titleLocation;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = cityCData.titleTag;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = cityCData.cardTitle;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = cityCData.cardTag;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            String str7 = cityCData.cardText;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(7, str7);
            }
            codedOutputByteBufferNano.m17305G(8, cityCData.cost);
            String str8 = cityCData.costText;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(9, str8);
            }
            String str9 = cityCData.costType;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(10, str9);
            }
            String str10 = cityCData.profileTag;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(11, str10);
            }
            String str11 = cityCData.extra;
            if (str11 != null) {
                codedOutputByteBufferNano.m17316R(12, str11);
            }
            codedOutputByteBufferNano.m17301C(13, cityCData.updatedTimeexpireAt);
            codedOutputByteBufferNano.m17305G(14, cityCData.viewCount);
            codedOutputByteBufferNano.m17305G(15, cityCData.recievedLikeCount);
            codedOutputByteBufferNano.m17301C(16, cityCData.expireAt);
            String str12 = cityCData.cityName;
            if (str12 != null) {
                codedOutputByteBufferNano.m17316R(17, str12);
            }
        }
    };
    public static JsonAdapter<CityCData> JSON_ADAPTER = new ObjectJsonAdapter<CityCData>() { // from class: com.p1.mobile.putong.core.data.CityCData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CityCData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CityCData newInstance() {
            return new CityCData();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(CityCData cityCData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1968789681:
                    if (str.equals("recievedLikeCount")) {
                        b = 0;
                    }
                    break;
                case -1931593294:
                    if (str.equals("expireAt")) {
                        b = 1;
                    }
                    break;
                case -1870010846:
                    if (str.equals("titleTag")) {
                        b = 2;
                    }
                    break;
                case -1616419878:
                    if (str.equals("updatedTimeexpireAt")) {
                        b = 3;
                    }
                    break;
                case -1599011478:
                    if (str.equals("viewCount")) {
                        b = 4;
                    }
                    break;
                case -1421682026:
                    if (str.equals("cityName")) {
                        b = 5;
                    }
                    break;
                case -1367605173:
                    if (str.equals("cardId")) {
                        b = 6;
                    }
                    break;
                case -1241362899:
                    if (str.equals("titleLocation")) {
                        b = 7;
                    }
                    break;
                case -1102646991:
                    if (str.equals("profileTag")) {
                        b = 8;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 9;
                    }
                    break;
                case -424691046:
                    if (str.equals("costText")) {
                        b = 10;
                    }
                    break;
                case -424672089:
                    if (str.equals("costType")) {
                        b = 11;
                    }
                    break;
                case -255516376:
                    if (str.equals("cardTitle")) {
                        b = 12;
                    }
                    break;
                case -8246179:
                    if (str.equals("cardText")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3059661:
                    if (str.equals("cost")) {
                        b = 14;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        b = 15;
                    }
                    break;
                case 553923178:
                    if (str.equals("cardTag")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    cityCData.recievedLikeCount = jsonParser.getValueAsInt();
                    return true;
                case 1:
                    cityCData.expireAt = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 2:
                    cityCData.titleTag = jsonParser.getValueAsString();
                    return true;
                case 3:
                    cityCData.updatedTimeexpireAt = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 4:
                    cityCData.viewCount = jsonParser.getValueAsInt();
                    return true;
                case 5:
                    cityCData.cityName = jsonParser.getValueAsString();
                    return true;
                case 6:
                    cityCData.cardId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    cityCData.titleLocation = jsonParser.getValueAsString();
                    return true;
                case 8:
                    cityCData.profileTag = jsonParser.getValueAsString();
                    return true;
                case 9:
                    cityCData.userId = jsonParser.getValueAsString();
                    return true;
                case 10:
                    cityCData.costText = jsonParser.getValueAsString();
                    return true;
                case 11:
                    cityCData.costType = jsonParser.getValueAsString();
                    return true;
                case 12:
                    cityCData.cardTitle = jsonParser.getValueAsString();
                    return true;
                case 13:
                    cityCData.cardText = jsonParser.getValueAsString();
                    return true;
                case 14:
                    cityCData.cost = jsonParser.getValueAsInt();
                    return true;
                case 15:
                    cityCData.extra = jsonParser.getValueAsString();
                    return true;
                case 16:
                    cityCData.cardTag = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(CityCData cityCData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1968789681:
                    if (str.equals("recievedLikeCount")) {
                        b = 0;
                    }
                    break;
                case -1931593294:
                    if (str.equals("expireAt")) {
                        b = 1;
                    }
                    break;
                case -1870010846:
                    if (str.equals("titleTag")) {
                        b = 2;
                    }
                    break;
                case -1616419878:
                    if (str.equals("updatedTimeexpireAt")) {
                        b = 3;
                    }
                    break;
                case -1599011478:
                    if (str.equals("viewCount")) {
                        b = 4;
                    }
                    break;
                case -1421682026:
                    if (str.equals("cityName")) {
                        b = 5;
                    }
                    break;
                case -1367605173:
                    if (str.equals("cardId")) {
                        b = 6;
                    }
                    break;
                case -1241362899:
                    if (str.equals("titleLocation")) {
                        b = 7;
                    }
                    break;
                case -1102646991:
                    if (str.equals("profileTag")) {
                        b = 8;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 9;
                    }
                    break;
                case -424691046:
                    if (str.equals("costText")) {
                        b = 10;
                    }
                    break;
                case -424672089:
                    if (str.equals("costType")) {
                        b = 11;
                    }
                    break;
                case -255516376:
                    if (str.equals("cardTitle")) {
                        b = 12;
                    }
                    break;
                case -8246179:
                    if (str.equals("cardText")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3059661:
                    if (str.equals("cost")) {
                        b = 14;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        b = 15;
                    }
                    break;
                case 553923178:
                    if (str.equals("cardTag")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    return true;
                default:
                    return super.parseFieldCheck(cityCData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CityCData cityCData, JsonGenerator jsonGenerator) throws IOException {
            String str = cityCData.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = cityCData.cardId;
            if (str2 != null) {
                jsonGenerator.writeStringField("cardId", str2);
            }
            String str3 = cityCData.titleLocation;
            if (str3 != null) {
                jsonGenerator.writeStringField("titleLocation", str3);
            }
            String str4 = cityCData.titleTag;
            if (str4 != null) {
                jsonGenerator.writeStringField("titleTag", str4);
            }
            String str5 = cityCData.cardTitle;
            if (str5 != null) {
                jsonGenerator.writeStringField("cardTitle", str5);
            }
            String str6 = cityCData.cardTag;
            if (str6 != null) {
                jsonGenerator.writeStringField("cardTag", str6);
            }
            String str7 = cityCData.cardText;
            if (str7 != null) {
                jsonGenerator.writeStringField("cardText", str7);
            }
            jsonGenerator.writeNumberField("cost", cityCData.cost);
            String str8 = cityCData.costText;
            if (str8 != null) {
                jsonGenerator.writeStringField("costText", str8);
            }
            String str9 = cityCData.costType;
            if (str9 != null) {
                jsonGenerator.writeStringField("costType", str9);
            }
            String str10 = cityCData.profileTag;
            if (str10 != null) {
                jsonGenerator.writeStringField("profileTag", str10);
            }
            String str11 = cityCData.extra;
            if (str11 != null) {
                jsonGenerator.writeStringField("extra", str11);
            }
            jsonGenerator.writeFieldName("updatedTimeexpireAt");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(cityCData.updatedTimeexpireAt), jsonGenerator, true);
            jsonGenerator.writeNumberField("viewCount", cityCData.viewCount);
            jsonGenerator.writeNumberField("recievedLikeCount", cityCData.recievedLikeCount);
            jsonGenerator.writeFieldName("expireAt");
            jsonAdapter.serialize(Double.valueOf(cityCData.expireAt), jsonGenerator, true);
            String str12 = cityCData.cityName;
            if (str12 != null) {
                jsonGenerator.writeStringField("cityName", str12);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CityCData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CityCData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CityCData new_() {
        CityCData cityCData = new CityCData();
        cityCData.nullCheck();
        return cityCData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CityCData mo225055clone() {
        CityCData cityCData = new CityCData();
        cityCData.userId = this.userId;
        cityCData.cardId = this.cardId;
        cityCData.titleLocation = this.titleLocation;
        cityCData.titleTag = this.titleTag;
        cityCData.cardTitle = this.cardTitle;
        cityCData.cardTag = this.cardTag;
        cityCData.cardText = this.cardText;
        cityCData.cost = this.cost;
        cityCData.costText = this.costText;
        cityCData.costType = this.costType;
        cityCData.profileTag = this.profileTag;
        cityCData.extra = this.extra;
        cityCData.updatedTimeexpireAt = this.updatedTimeexpireAt;
        cityCData.viewCount = this.viewCount;
        cityCData.recievedLikeCount = this.recievedLikeCount;
        cityCData.expireAt = this.expireAt;
        cityCData.cityName = this.cityName;
        return cityCData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CityCData)) {
            return false;
        }
        CityCData cityCData = (CityCData) obj;
        return ValueObject.util_equals(this.userId, cityCData.userId) && ValueObject.util_equals(this.cardId, cityCData.cardId) && ValueObject.util_equals(this.titleLocation, cityCData.titleLocation) && ValueObject.util_equals(this.titleTag, cityCData.titleTag) && ValueObject.util_equals(this.cardTitle, cityCData.cardTitle) && ValueObject.util_equals(this.cardTag, cityCData.cardTag) && ValueObject.util_equals(this.cardText, cityCData.cardText) && this.cost == cityCData.cost && ValueObject.util_equals(this.costText, cityCData.costText) && ValueObject.util_equals(this.costType, cityCData.costType) && ValueObject.util_equals(this.profileTag, cityCData.profileTag) && ValueObject.util_equals(this.extra, cityCData.extra) && this.updatedTimeexpireAt == cityCData.updatedTimeexpireAt && this.viewCount == cityCData.viewCount && this.recievedLikeCount == cityCData.recievedLikeCount && this.expireAt == cityCData.expireAt && ValueObject.util_equals(this.cityName, cityCData.cityName);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.cardId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.titleLocation;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.titleTag;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.cardTitle;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.cardTag;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.cardText;
        int iHashCode7 = (((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41) + this.cost) * 41;
        String str8 = this.costText;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.costType;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.profileTag;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.extra;
        int iHashCode11 = str11 != null ? str11.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.updatedTimeexpireAt);
        int i3 = ((((((iHashCode10 + iHashCode11) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.viewCount) * 41) + this.recievedLikeCount;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.expireAt);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        String str12 = this.cityName;
        int iHashCode12 = i4 + (str12 != null ? str12.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.cardId == null) {
            this.cardId = "";
        }
        if (this.titleLocation == null) {
            this.titleLocation = "";
        }
        if (this.titleTag == null) {
            this.titleTag = "";
        }
        if (this.cardTitle == null) {
            this.cardTitle = "";
        }
        if (this.cardTag == null) {
            this.cardTag = "";
        }
        if (this.cardText == null) {
            this.cardText = "";
        }
        if (this.costText == null) {
            this.costText = "";
        }
        if (this.costType == null) {
            this.costType = "";
        }
        if (this.profileTag == null) {
            this.profileTag = "";
        }
        if (this.extra == null) {
            this.extra = "";
        }
        if (this.cityName == null) {
            this.cityName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
