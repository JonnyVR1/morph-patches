package com.p051p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
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
    @ProtobufIndex(index = 5)
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
    @ProtobufIndex(index = 10)
    public String skuTitle;

    @Nullable
    @ProtobufIndex(index = 2)
    public String subtitle;

    @Nullable
    @ProtobufIndex(index = 3)
    public String theme;

    @Nullable
    @ProtobufIndex(index = 11)
    public String titleLine1;

    @Nullable
    @ProtobufIndex(index = 12)
    public String titleLine2;
    public static ProtobufAdapter<IapAffiliatePromotionDisplaySlot> PROTOBUF_ADAPTER = new MessageNanoAdapter<IapAffiliatePromotionDisplaySlot>() { // from class: com.p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot) {
            String str = iapAffiliatePromotionDisplaySlot.mainTitle;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = iapAffiliatePromotionDisplaySlot.subtitle;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = iapAffiliatePromotionDisplaySlot.theme;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = iapAffiliatePromotionDisplaySlot.buttonText;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = iapAffiliatePromotionDisplaySlot.imgUrl;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            String str7 = iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str7);
            }
            String str8 = iapAffiliatePromotionDisplaySlot.countdownTopText;
            if (str8 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str8);
            }
            String str9 = iapAffiliatePromotionDisplaySlot.interceptToast;
            if (str9 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(9, str9);
            }
            String str10 = iapAffiliatePromotionDisplaySlot.skuTitle;
            if (str10 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(10, str10);
            }
            String str11 = iapAffiliatePromotionDisplaySlot.titleLine1;
            if (str11 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(11, str11);
            }
            String str12 = iapAffiliatePromotionDisplaySlot.titleLine2;
            if (str12 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(12, str12);
            }
            String str13 = iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle;
            if (str13 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(13, str13);
            }
            String str14 = iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle;
            if (str14 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(14, str14);
            }
            String str15 = iapAffiliatePromotionDisplaySlot.digitBackground;
            if (str15 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(15, str15);
            }
            iapAffiliatePromotionDisplaySlot.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IapAffiliatePromotionDisplaySlot parse(nc5 nc5Var) throws IOException {
            IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot = new IapAffiliatePromotionDisplaySlot();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 10:
                        iapAffiliatePromotionDisplaySlot.mainTitle = nc5Var.m162495s();
                        break;
                    case 18:
                        iapAffiliatePromotionDisplaySlot.subtitle = nc5Var.m162495s();
                        break;
                    case 26:
                        iapAffiliatePromotionDisplaySlot.theme = nc5Var.m162495s();
                        break;
                    case 34:
                        iapAffiliatePromotionDisplaySlot.buttonText = nc5Var.m162495s();
                        break;
                    case 42:
                        iapAffiliatePromotionDisplaySlot.imgUrl = nc5Var.m162495s();
                        break;
                    case 50:
                        iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle = nc5Var.m162495s();
                        break;
                    case 58:
                        iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle = nc5Var.m162495s();
                        break;
                    case 66:
                        iapAffiliatePromotionDisplaySlot.countdownTopText = nc5Var.m162495s();
                        break;
                    case 74:
                        iapAffiliatePromotionDisplaySlot.interceptToast = nc5Var.m162495s();
                        break;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        iapAffiliatePromotionDisplaySlot.skuTitle = nc5Var.m162495s();
                        break;
                    case 90:
                        iapAffiliatePromotionDisplaySlot.titleLine1 = nc5Var.m162495s();
                        break;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        iapAffiliatePromotionDisplaySlot.titleLine2 = nc5Var.m162495s();
                        break;
                    case 106:
                        iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle = nc5Var.m162495s();
                        break;
                    case 114:
                        iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle = nc5Var.m162495s();
                        break;
                    case 122:
                        iapAffiliatePromotionDisplaySlot.digitBackground = nc5Var.m162495s();
                        break;
                    default:
                        return iapAffiliatePromotionDisplaySlot;
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iapAffiliatePromotionDisplaySlot.mainTitle;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = iapAffiliatePromotionDisplaySlot.subtitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = iapAffiliatePromotionDisplaySlot.theme;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = iapAffiliatePromotionDisplaySlot.buttonText;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = iapAffiliatePromotionDisplaySlot.imgUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            String str7 = iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(7, str7);
            }
            String str8 = iapAffiliatePromotionDisplaySlot.countdownTopText;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(8, str8);
            }
            String str9 = iapAffiliatePromotionDisplaySlot.interceptToast;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(9, str9);
            }
            String str10 = iapAffiliatePromotionDisplaySlot.skuTitle;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(10, str10);
            }
            String str11 = iapAffiliatePromotionDisplaySlot.titleLine1;
            if (str11 != null) {
                codedOutputByteBufferNano.m17316R(11, str11);
            }
            String str12 = iapAffiliatePromotionDisplaySlot.titleLine2;
            if (str12 != null) {
                codedOutputByteBufferNano.m17316R(12, str12);
            }
            String str13 = iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle;
            if (str13 != null) {
                codedOutputByteBufferNano.m17316R(13, str13);
            }
            String str14 = iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle;
            if (str14 != null) {
                codedOutputByteBufferNano.m17316R(14, str14);
            }
            String str15 = iapAffiliatePromotionDisplaySlot.digitBackground;
            if (str15 != null) {
                codedOutputByteBufferNano.m17316R(15, str15);
            }
        }
    };
    public static JsonAdapter<IapAffiliatePromotionDisplaySlot> JSON_ADAPTER = new ObjectJsonAdapter<IapAffiliatePromotionDisplaySlot>() { // from class: com.p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IapAffiliatePromotionDisplaySlot.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IapAffiliatePromotionDisplaySlot newInstance() {
            return new IapAffiliatePromotionDisplaySlot();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2060497896:
                    if (str.equals("subtitle")) {
                        b = 0;
                    }
                    break;
                case -1831198917:
                    if (str.equals("skuTitle")) {
                        b = 1;
                    }
                    break;
                case -1791233211:
                    if (str.equals("titleLine1")) {
                        b = 2;
                    }
                    break;
                case -1791233210:
                    if (str.equals("titleLine2")) {
                        b = 3;
                    }
                    break;
                case -1185088852:
                    if (str.equals("imgUrl")) {
                        b = 4;
                    }
                    break;
                case -1163528887:
                    if (str.equals("seePoolHasUserMainTitle")) {
                        b = 5;
                    }
                    break;
                case -842669650:
                    if (str.equals("seePoolHasUserSubtitle")) {
                        b = 6;
                    }
                    break;
                case -345074093:
                    if (str.equals("seePoolNoUserSubtitle")) {
                        b = 7;
                    }
                    break;
                case -261498849:
                    if (str.equals("mainTitle")) {
                        b = 8;
                    }
                    break;
                case 110327241:
                    if (str.equals(IntlMarketToken.theme)) {
                        b = 9;
                    }
                    break;
                case 358545279:
                    if (str.equals("buttonText")) {
                        b = 10;
                    }
                    break;
                case 666558641:
                    if (str.equals("countdownTopText")) {
                        b = 11;
                    }
                    break;
                case 1377031492:
                    if (str.equals("seePoolNoUserMainTitle")) {
                        b = 12;
                    }
                    break;
                case 1702866565:
                    if (str.equals("interceptToast")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 2068633147:
                    if (str.equals("digitBackground")) {
                        b = 14;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    iapAffiliatePromotionDisplaySlot.subtitle = jsonParser.getValueAsString();
                    return true;
                case 1:
                    iapAffiliatePromotionDisplaySlot.skuTitle = jsonParser.getValueAsString();
                    return true;
                case 2:
                    iapAffiliatePromotionDisplaySlot.titleLine1 = jsonParser.getValueAsString();
                    return true;
                case 3:
                    iapAffiliatePromotionDisplaySlot.titleLine2 = jsonParser.getValueAsString();
                    return true;
                case 4:
                    iapAffiliatePromotionDisplaySlot.imgUrl = jsonParser.getValueAsString();
                    return true;
                case 5:
                    iapAffiliatePromotionDisplaySlot.seePoolHasUserMainTitle = jsonParser.getValueAsString();
                    return true;
                case 6:
                    iapAffiliatePromotionDisplaySlot.seePoolHasUserSubtitle = jsonParser.getValueAsString();
                    return true;
                case 7:
                    iapAffiliatePromotionDisplaySlot.seePoolNoUserSubtitle = jsonParser.getValueAsString();
                    return true;
                case 8:
                    iapAffiliatePromotionDisplaySlot.mainTitle = jsonParser.getValueAsString();
                    return true;
                case 9:
                    iapAffiliatePromotionDisplaySlot.theme = jsonParser.getValueAsString();
                    return true;
                case 10:
                    iapAffiliatePromotionDisplaySlot.buttonText = jsonParser.getValueAsString();
                    return true;
                case 11:
                    iapAffiliatePromotionDisplaySlot.countdownTopText = jsonParser.getValueAsString();
                    return true;
                case 12:
                    iapAffiliatePromotionDisplaySlot.seePoolNoUserMainTitle = jsonParser.getValueAsString();
                    return true;
                case 13:
                    iapAffiliatePromotionDisplaySlot.interceptToast = jsonParser.getValueAsString();
                    return true;
                case 14:
                    iapAffiliatePromotionDisplaySlot.digitBackground = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2060497896:
                    if (str.equals("subtitle")) {
                        b = 0;
                    }
                    break;
                case -1831198917:
                    if (str.equals("skuTitle")) {
                        b = 1;
                    }
                    break;
                case -1791233211:
                    if (str.equals("titleLine1")) {
                        b = 2;
                    }
                    break;
                case -1791233210:
                    if (str.equals("titleLine2")) {
                        b = 3;
                    }
                    break;
                case -1185088852:
                    if (str.equals("imgUrl")) {
                        b = 4;
                    }
                    break;
                case -1163528887:
                    if (str.equals("seePoolHasUserMainTitle")) {
                        b = 5;
                    }
                    break;
                case -842669650:
                    if (str.equals("seePoolHasUserSubtitle")) {
                        b = 6;
                    }
                    break;
                case -345074093:
                    if (str.equals("seePoolNoUserSubtitle")) {
                        b = 7;
                    }
                    break;
                case -261498849:
                    if (str.equals("mainTitle")) {
                        b = 8;
                    }
                    break;
                case 110327241:
                    if (str.equals(IntlMarketToken.theme)) {
                        b = 9;
                    }
                    break;
                case 358545279:
                    if (str.equals("buttonText")) {
                        b = 10;
                    }
                    break;
                case 666558641:
                    if (str.equals("countdownTopText")) {
                        b = 11;
                    }
                    break;
                case 1377031492:
                    if (str.equals("seePoolNoUserMainTitle")) {
                        b = 12;
                    }
                    break;
                case 1702866565:
                    if (str.equals("interceptToast")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 2068633147:
                    if (str.equals("digitBackground")) {
                        b = 14;
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
                    return true;
                default:
                    return super.parseFieldCheck(iapAffiliatePromotionDisplaySlot, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IapAffiliatePromotionDisplaySlot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IapAffiliatePromotionDisplaySlot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IapAffiliatePromotionDisplaySlot new_() {
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlot = new IapAffiliatePromotionDisplaySlot();
        iapAffiliatePromotionDisplaySlot.nullCheck();
        return iapAffiliatePromotionDisplaySlot;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IapAffiliatePromotionDisplaySlot mo225055clone() {
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
        this.hashCode = iHashCode15;
        return iHashCode15;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
