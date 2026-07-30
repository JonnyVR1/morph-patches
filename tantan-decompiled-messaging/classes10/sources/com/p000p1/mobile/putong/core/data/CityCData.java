package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class CityCData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "citycdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String cardId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String cardTag;

    @NonNull
    @ProtobufIndex(index = 7)
    public String cardText;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
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
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
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
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CityCData cityCData) {
            String str = cityCData.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = cityCData.cardId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = cityCData.titleLocation;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = cityCData.titleTag;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = cityCData.cardTitle;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = cityCData.cardTag;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = cityCData.cardText;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            int iH = iO + CodedOutputByteBufferNano.h(8, cityCData.cost);
            String str8 = cityCData.costText;
            if (str8 != null) {
                iH += CodedOutputByteBufferNano.o(9, str8);
            }
            String str9 = cityCData.costType;
            if (str9 != null) {
                iH += CodedOutputByteBufferNano.o(10, str9);
            }
            String str10 = cityCData.profileTag;
            if (str10 != null) {
                iH += CodedOutputByteBufferNano.o(11, str10);
            }
            String str11 = cityCData.extra;
            if (str11 != null) {
                iH += CodedOutputByteBufferNano.o(12, str11);
            }
            int iD = iH + CodedOutputByteBufferNano.d(13, cityCData.updatedTimeexpireAt) + CodedOutputByteBufferNano.h(14, cityCData.viewCount) + CodedOutputByteBufferNano.h(15, cityCData.recievedLikeCount) + CodedOutputByteBufferNano.d(16, cityCData.expireAt);
            String str12 = cityCData.cityName;
            if (str12 != null) {
                iD += CodedOutputByteBufferNano.o(17, str12);
            }
            ((MessageNano) cityCData).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CityCData m12185parse(nb5 nb5Var) throws IOException {
            CityCData cityCData = new CityCData();
            while (true) {
                switch (nb5Var.u()) {
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
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        cityCData.userId = nb5Var.s();
                        continue;
                    case 18:
                        cityCData.cardId = nb5Var.s();
                        continue;
                    case 26:
                        cityCData.titleLocation = nb5Var.s();
                        continue;
                    case 34:
                        cityCData.titleTag = nb5Var.s();
                        continue;
                    case 42:
                        cityCData.cardTitle = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        cityCData.cardTag = nb5Var.s();
                        continue;
                    case 58:
                        cityCData.cardText = nb5Var.s();
                        continue;
                    case 64:
                        cityCData.cost = nb5Var.j();
                        continue;
                    case 74:
                        cityCData.costText = nb5Var.s();
                        continue;
                    case 82:
                        cityCData.costType = nb5Var.s();
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        cityCData.profileTag = nb5Var.s();
                        continue;
                    case 98:
                        cityCData.extra = nb5Var.s();
                        continue;
                    case 105:
                        cityCData.updatedTimeexpireAt = nb5Var.h();
                        continue;
                    case 112:
                        cityCData.viewCount = nb5Var.j();
                        continue;
                    case 120:
                        cityCData.recievedLikeCount = nb5Var.j();
                        continue;
                    case 129:
                        cityCData.expireAt = nb5Var.h();
                        continue;
                    case 138:
                        cityCData.cityName = nb5Var.s();
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

        public void serialize(CityCData cityCData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cityCData.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = cityCData.cardId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = cityCData.titleLocation;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = cityCData.titleTag;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = cityCData.cardTitle;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = cityCData.cardTag;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = cityCData.cardText;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            codedOutputByteBufferNano.G(8, cityCData.cost);
            String str8 = cityCData.costText;
            if (str8 != null) {
                codedOutputByteBufferNano.R(9, str8);
            }
            String str9 = cityCData.costType;
            if (str9 != null) {
                codedOutputByteBufferNano.R(10, str9);
            }
            String str10 = cityCData.profileTag;
            if (str10 != null) {
                codedOutputByteBufferNano.R(11, str10);
            }
            String str11 = cityCData.extra;
            if (str11 != null) {
                codedOutputByteBufferNano.R(12, str11);
            }
            codedOutputByteBufferNano.C(13, cityCData.updatedTimeexpireAt);
            codedOutputByteBufferNano.G(14, cityCData.viewCount);
            codedOutputByteBufferNano.G(15, cityCData.recievedLikeCount);
            codedOutputByteBufferNano.C(16, cityCData.expireAt);
            String str12 = cityCData.cityName;
            if (str12 != null) {
                codedOutputByteBufferNano.R(17, str12);
            }
        }
    };
    public static JsonAdapter<CityCData> JSON_ADAPTER = new ObjectJsonAdapter<CityCData>() { // from class: com.p1.mobile.putong.core.data.CityCData.2
        public Class getDataClass() {
            return CityCData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CityCData m12186newInstance() {
            return new CityCData();
        }

        public boolean parseField(CityCData cityCData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "recievedLikeCount":
                    cityCData.recievedLikeCount = jsonParser.getValueAsInt();
                    return true;
                case "expireAt":
                    cityCData.expireAt = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "titleTag":
                    cityCData.titleTag = jsonParser.getValueAsString();
                    return true;
                case "updatedTimeexpireAt":
                    cityCData.updatedTimeexpireAt = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "viewCount":
                    cityCData.viewCount = jsonParser.getValueAsInt();
                    return true;
                case "cityName":
                    cityCData.cityName = jsonParser.getValueAsString();
                    return true;
                case "cardId":
                    cityCData.cardId = jsonParser.getValueAsString();
                    return true;
                case "titleLocation":
                    cityCData.titleLocation = jsonParser.getValueAsString();
                    return true;
                case "profileTag":
                    cityCData.profileTag = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    cityCData.userId = jsonParser.getValueAsString();
                    return true;
                case "costText":
                    cityCData.costText = jsonParser.getValueAsString();
                    return true;
                case "costType":
                    cityCData.costType = jsonParser.getValueAsString();
                    return true;
                case "cardTitle":
                    cityCData.cardTitle = jsonParser.getValueAsString();
                    return true;
                case "cardText":
                    cityCData.cardText = jsonParser.getValueAsString();
                    return true;
                case "cost":
                    cityCData.cost = jsonParser.getValueAsInt();
                    return true;
                case "extra":
                    cityCData.extra = jsonParser.getValueAsString();
                    return true;
                case "cardTag":
                    cityCData.cardTag = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CityCData cityCData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "recievedLikeCount":
                case "expireAt":
                case "titleTag":
                case "updatedTimeexpireAt":
                case "viewCount":
                case "cityName":
                case "cardId":
                case "titleLocation":
                case "profileTag":
                case "userId":
                case "costText":
                case "costType":
                case "cardTitle":
                case "cardText":
                case "cost":
                case "extra":
                case "cardTag":
                    return true;
                default:
                    return super.parseFieldCheck(cityCData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

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
            JsonAdapter jsonAdapter = Converter.API_TIME;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CityCData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CityCData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CityCData new_() {
        CityCData cityCData = new CityCData();
        cityCData.nullCheck();
        return cityCData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CityCData m12184clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode12;
        return iHashCode12;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
