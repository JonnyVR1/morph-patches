package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class IapAffiliatePromotionDisplaySlot extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "iapaffiliatepromotiondisplayslot";

    @Nullable
    @ProtobufIndex(index = 4)
    public String buttonText;

    @Nullable
    @ProtobufIndex(index = 8)
    public String countdownTopText;

    @Nullable
    @ProtobufIndex(index = 15)
    public String digitBackground;

    @Nullable
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String imgUrl;

    @Nullable
    @ProtobufIndex(index = 9)
    public String interceptToast;

    @Nullable
    @ProtobufIndex(index = 1)
    public String mainTitle;

    @Nullable
    @ProtobufIndex(index = 13)
    public String seePoolHasUserMainTitle;

    @Nullable
    @ProtobufIndex(index = 6)
    public String seePoolHasUserSubtitle;

    @Nullable
    @ProtobufIndex(index = 14)
    public String seePoolNoUserMainTitle;

    @Nullable
    @ProtobufIndex(index = 7)
    public String seePoolNoUserSubtitle;

    @Nullable
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String skuTitle;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String subtitle;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String theme;

    @Nullable
    @ProtobufIndex(index = 11)
    public String titleLine1;

    @Nullable
    @ProtobufIndex(index = 12)
    public String titleLine2;
    public static ProtobufAdapter<IapAffiliatePromotionDisplaySlot> PROTOBUF_ADAPTER = new MessageNanoAdapter<IapAffiliatePromotionDisplaySlot>() { // from class: com.p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot) {
            String str = iapAffiliatePromotionDisplaySlot.mainTitle;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = iapAffiliatePromotionDisplaySlot.subtitle;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = iapAffiliatePromotionDisplaySlot.theme;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = iapAffiliatePromotionDisplaySlot.buttonText;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = iapAffiliatePromotionDisplaySlot.imgUrl;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            String str8 = iapAffiliatePromotionDisplaySlot.countdownTopText;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(8, str8);
            }
            String str9 = iapAffiliatePromotionDisplaySlot.interceptToast;
            if (str9 != null) {
                iO += CodedOutputByteBufferNano.o(9, str9);
            }
            String str10 = iapAffiliatePromotionDisplaySlot.skuTitle;
            if (str10 != null) {
                iO += CodedOutputByteBufferNano.o(10, str10);
            }
            String str11 = iapAffiliatePromotionDisplaySlot.titleLine1;
            if (str11 != null) {
                iO += CodedOutputByteBufferNano.o(11, str11);
            }
            String str12 = iapAffiliatePromotionDisplaySlot.titleLine2;
            if (str12 != null) {
                iO += CodedOutputByteBufferNano.o(12, str12);
            }
            String str13 = iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle;
            if (str13 != null) {
                iO += CodedOutputByteBufferNano.o(13, str13);
            }
            String str14 = iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle;
            if (str14 != null) {
                iO += CodedOutputByteBufferNano.o(14, str14);
            }
            String str15 = iapAffiliatePromotionDisplaySlot.digitBackground;
            if (str15 != null) {
                iO += CodedOutputByteBufferNano.o(15, str15);
            }
            ((MessageNano) iapAffiliatePromotionDisplaySlot).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IapAffiliatePromotionDisplaySlot m13361parse(nb5 nb5Var) throws IOException {
            IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot = new IapAffiliatePromotionDisplaySlot();
            while (true) {
                switch (nb5Var.u()) {
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        iapAffiliatePromotionDisplaySlot.mainTitle = nb5Var.s();
                        break;
                    case 18:
                        iapAffiliatePromotionDisplaySlot.subtitle = nb5Var.s();
                        break;
                    case 26:
                        iapAffiliatePromotionDisplaySlot.theme = nb5Var.s();
                        break;
                    case 34:
                        iapAffiliatePromotionDisplaySlot.buttonText = nb5Var.s();
                        break;
                    case 42:
                        iapAffiliatePromotionDisplaySlot.imgUrl = nb5Var.s();
                        break;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle = nb5Var.s();
                        break;
                    case 58:
                        iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle = nb5Var.s();
                        break;
                    case 66:
                        iapAffiliatePromotionDisplaySlot.countdownTopText = nb5Var.s();
                        break;
                    case 74:
                        iapAffiliatePromotionDisplaySlot.interceptToast = nb5Var.s();
                        break;
                    case 82:
                        iapAffiliatePromotionDisplaySlot.skuTitle = nb5Var.s();
                        break;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        iapAffiliatePromotionDisplaySlot.titleLine1 = nb5Var.s();
                        break;
                    case 98:
                        iapAffiliatePromotionDisplaySlot.titleLine2 = nb5Var.s();
                        break;
                    case 106:
                        iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle = nb5Var.s();
                        break;
                    case 114:
                        iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle = nb5Var.s();
                        break;
                    case 122:
                        iapAffiliatePromotionDisplaySlot.digitBackground = nb5Var.s();
                        break;
                    default:
                        return iapAffiliatePromotionDisplaySlot;
                }
            }
        }

        public void serialize(IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iapAffiliatePromotionDisplaySlot.mainTitle;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = iapAffiliatePromotionDisplaySlot.subtitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = iapAffiliatePromotionDisplaySlot.theme;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = iapAffiliatePromotionDisplaySlot.buttonText;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = iapAffiliatePromotionDisplaySlot.imgUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            String str8 = iapAffiliatePromotionDisplaySlot.countdownTopText;
            if (str8 != null) {
                codedOutputByteBufferNano.R(8, str8);
            }
            String str9 = iapAffiliatePromotionDisplaySlot.interceptToast;
            if (str9 != null) {
                codedOutputByteBufferNano.R(9, str9);
            }
            String str10 = iapAffiliatePromotionDisplaySlot.skuTitle;
            if (str10 != null) {
                codedOutputByteBufferNano.R(10, str10);
            }
            String str11 = iapAffiliatePromotionDisplaySlot.titleLine1;
            if (str11 != null) {
                codedOutputByteBufferNano.R(11, str11);
            }
            String str12 = iapAffiliatePromotionDisplaySlot.titleLine2;
            if (str12 != null) {
                codedOutputByteBufferNano.R(12, str12);
            }
            String str13 = iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle;
            if (str13 != null) {
                codedOutputByteBufferNano.R(13, str13);
            }
            String str14 = iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle;
            if (str14 != null) {
                codedOutputByteBufferNano.R(14, str14);
            }
            String str15 = iapAffiliatePromotionDisplaySlot.digitBackground;
            if (str15 != null) {
                codedOutputByteBufferNano.R(15, str15);
            }
        }
    };
    public static JsonAdapter<IapAffiliatePromotionDisplaySlot> JSON_ADAPTER = new ObjectJsonAdapter<IapAffiliatePromotionDisplaySlot>() { // from class: com.p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot.2
        public Class getDataClass() {
            return IapAffiliatePromotionDisplaySlot.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IapAffiliatePromotionDisplaySlot m13362newInstance() {
            return new IapAffiliatePromotionDisplaySlot();
        }

        public boolean parseField(IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    iapAffiliatePromotionDisplaySlot.subtitle = jsonParser.getValueAsString();
                    return true;
                case "skuTitle":
                    iapAffiliatePromotionDisplaySlot.skuTitle = jsonParser.getValueAsString();
                    return true;
                case "titleLine1":
                    iapAffiliatePromotionDisplaySlot.titleLine1 = jsonParser.getValueAsString();
                    return true;
                case "titleLine2":
                    iapAffiliatePromotionDisplaySlot.titleLine2 = jsonParser.getValueAsString();
                    return true;
                case "imgUrl":
                    iapAffiliatePromotionDisplaySlot.imgUrl = jsonParser.getValueAsString();
                    return true;
                case "seePoolHasUserMainTitle":
                    iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle = jsonParser.getValueAsString();
                    return true;
                case "seePoolHasUserSubtitle":
                    iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle = jsonParser.getValueAsString();
                    return true;
                case "seePoolNoUserSubtitle":
                    iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle = jsonParser.getValueAsString();
                    return true;
                case "mainTitle":
                    iapAffiliatePromotionDisplaySlot.mainTitle = jsonParser.getValueAsString();
                    return true;
                case "theme":
                    iapAffiliatePromotionDisplaySlot.theme = jsonParser.getValueAsString();
                    return true;
                case "buttonText":
                    iapAffiliatePromotionDisplaySlot.buttonText = jsonParser.getValueAsString();
                    return true;
                case "countdownTopText":
                    iapAffiliatePromotionDisplaySlot.countdownTopText = jsonParser.getValueAsString();
                    return true;
                case "seePoolNoUserMainTitle":
                    iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle = jsonParser.getValueAsString();
                    return true;
                case "interceptToast":
                    iapAffiliatePromotionDisplaySlot.interceptToast = jsonParser.getValueAsString();
                    return true;
                case "digitBackground":
                    iapAffiliatePromotionDisplaySlot.digitBackground = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subtitle":
                case "skuTitle":
                case "titleLine1":
                case "titleLine2":
                case "imgUrl":
                case "seePoolHasUserMainTitle":
                case "seePoolHasUserSubtitle":
                case "seePoolNoUserSubtitle":
                case "mainTitle":
                case "theme":
                case "buttonText":
                case "countdownTopText":
                case "seePoolNoUserMainTitle":
                case "interceptToast":
                case "digitBackground":
                    return true;
                default:
                    return super.parseFieldCheck(iapAffiliatePromotionDisplaySlot, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot, JsonGenerator jsonGenerator) throws IOException {
            String str = iapAffiliatePromotionDisplaySlot.mainTitle;
            if (str != null) {
                jsonGenerator.writeStringField("mainTitle", str);
            }
            String str2 = iapAffiliatePromotionDisplaySlot.subtitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subtitle", str2);
            }
            String str3 = iapAffiliatePromotionDisplaySlot.theme;
            if (str3 != null) {
                jsonGenerator.writeStringField(IntlMarketToken.theme, str3);
            }
            String str4 = iapAffiliatePromotionDisplaySlot.buttonText;
            if (str4 != null) {
                jsonGenerator.writeStringField("buttonText", str4);
            }
            String str5 = iapAffiliatePromotionDisplaySlot.imgUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("imgUrl", str5);
            }
            String str6 = iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle;
            if (str6 != null) {
                jsonGenerator.writeStringField("seePoolHasUserMainTitle", str6);
            }
            String str7 = iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle;
            if (str7 != null) {
                jsonGenerator.writeStringField("seePoolNoUserMainTitle", str7);
            }
            String str8 = iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle;
            if (str8 != null) {
                jsonGenerator.writeStringField("seePoolHasUserSubtitle", str8);
            }
            String str9 = iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle;
            if (str9 != null) {
                jsonGenerator.writeStringField("seePoolNoUserSubtitle", str9);
            }
            String str10 = iapAffiliatePromotionDisplaySlot.countdownTopText;
            if (str10 != null) {
                jsonGenerator.writeStringField("countdownTopText", str10);
            }
            String str11 = iapAffiliatePromotionDisplaySlot.interceptToast;
            if (str11 != null) {
                jsonGenerator.writeStringField("interceptToast", str11);
            }
            String str12 = iapAffiliatePromotionDisplaySlot.skuTitle;
            if (str12 != null) {
                jsonGenerator.writeStringField("skuTitle", str12);
            }
            String str13 = iapAffiliatePromotionDisplaySlot.titleLine1;
            if (str13 != null) {
                jsonGenerator.writeStringField("titleLine1", str13);
            }
            String str14 = iapAffiliatePromotionDisplaySlot.titleLine2;
            if (str14 != null) {
                jsonGenerator.writeStringField("titleLine2", str14);
            }
            String str15 = iapAffiliatePromotionDisplaySlot.digitBackground;
            if (str15 != null) {
                jsonGenerator.writeStringField("digitBackground", str15);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IapAffiliatePromotionDisplaySlot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IapAffiliatePromotionDisplaySlot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IapAffiliatePromotionDisplaySlot new_() {
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot = new IapAffiliatePromotionDisplaySlot();
        iapAffiliatePromotionDisplaySlot.nullCheck();
        return iapAffiliatePromotionDisplaySlot;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IapAffiliatePromotionDisplaySlot m13360clone() {
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot = new IapAffiliatePromotionDisplaySlot();
        iapAffiliatePromotionDisplaySlot.mainTitle = this.mainTitle;
        iapAffiliatePromotionDisplaySlot.subtitle = this.subtitle;
        iapAffiliatePromotionDisplaySlot.theme = this.theme;
        iapAffiliatePromotionDisplaySlot.buttonText = this.buttonText;
        iapAffiliatePromotionDisplaySlot.imgUrl = this.imgUrl;
        iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle = this.seePoolHasUserMainTitle;
        iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle = this.seePoolNoUserMainTitle;
        iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle = this.seePoolHasUserSubtitle;
        iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle = this.seePoolNoUserSubtitle;
        iapAffiliatePromotionDisplaySlot.countdownTopText = this.countdownTopText;
        iapAffiliatePromotionDisplaySlot.interceptToast = this.interceptToast;
        iapAffiliatePromotionDisplaySlot.skuTitle = this.skuTitle;
        iapAffiliatePromotionDisplaySlot.titleLine1 = this.titleLine1;
        iapAffiliatePromotionDisplaySlot.titleLine2 = this.titleLine2;
        iapAffiliatePromotionDisplaySlot.digitBackground = this.digitBackground;
        return iapAffiliatePromotionDisplaySlot;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IapAffiliatePromotionDisplaySlot)) {
            return false;
        }
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot = (IapAffiliatePromotionDisplaySlot) obj;
        return ValueObject.util_equals(this.mainTitle, iapAffiliatePromotionDisplaySlot.mainTitle) && ValueObject.util_equals(this.subtitle, iapAffiliatePromotionDisplaySlot.subtitle) && ValueObject.util_equals(this.theme, iapAffiliatePromotionDisplaySlot.theme) && ValueObject.util_equals(this.buttonText, iapAffiliatePromotionDisplaySlot.buttonText) && ValueObject.util_equals(this.imgUrl, iapAffiliatePromotionDisplaySlot.imgUrl) && ValueObject.util_equals(this.seePoolHasUserMainTitle, iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle) && ValueObject.util_equals(this.seePoolNoUserMainTitle, iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle) && ValueObject.util_equals(this.seePoolHasUserSubtitle, iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle) && ValueObject.util_equals(this.seePoolNoUserSubtitle, iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle) && ValueObject.util_equals(this.countdownTopText, iapAffiliatePromotionDisplaySlot.countdownTopText) && ValueObject.util_equals(this.interceptToast, iapAffiliatePromotionDisplaySlot.interceptToast) && ValueObject.util_equals(this.skuTitle, iapAffiliatePromotionDisplaySlot.skuTitle) && ValueObject.util_equals(this.titleLine1, iapAffiliatePromotionDisplaySlot.titleLine1) && ValueObject.util_equals(this.titleLine2, iapAffiliatePromotionDisplaySlot.titleLine2) && ValueObject.util_equals(this.digitBackground, iapAffiliatePromotionDisplaySlot.digitBackground);
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
        String str = this.mainTitle;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.theme;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.buttonText;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.imgUrl;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.seePoolHasUserMainTitle;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.seePoolNoUserMainTitle;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.seePoolHasUserSubtitle;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.seePoolNoUserSubtitle;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.countdownTopText;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.interceptToast;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.skuTitle;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 41;
        String str13 = this.titleLine1;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.titleLine2;
        int iHashCode14 = (iHashCode13 + (str14 != null ? str14.hashCode() : 0)) * 41;
        String str15 = this.digitBackground;
        int iHashCode15 = iHashCode14 + (str15 != null ? str15.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode15;
        return iHashCode15;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
