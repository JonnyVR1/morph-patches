package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CreativeData;
import com.p000p1.mobile.putong.core.data.PaymentPlatform;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CreativeData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "creativedata";

    @ProtobufIndex(index = 9)
    public boolean autoRenewable;

    @NonNull
    @ProtobufIndex(index = 17)
    public List<Media> backgroundPicture;

    @NonNull
    @ProtobufIndex(index = 15)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 16)
    public List<String> buttonTexts;

    @NonNull
    @ProtobufIndex(index = 14)
    public List<String> clause;

    @NonNull
    @ProtobufIndex(index = 21)
    public String currency;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String currencyCode;

    @NonNull
    @ProtobufIndex(index = 7)
    public Double discountPrice;

    @ProtobufIndex(index = 20)
    public boolean displayPrice;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Long endTime;

    @NonNull
    @ProtobufIndex(index = 18)
    public List<Media> iconPicture;

    @NonNull
    @ProtobufIndex(index = 23)
    public String itemID;

    @NonNull
    @ProtobufIndex(index = 6)
    public Double normalPrice;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public List<PaymentPlatform> payPlatform;

    @ProtobufIndex(index = 8)
    public boolean popUpWindow;

    @NonNull
    @ProtobufIndex(index = 19)
    public List<Media> positionPicture;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public ProductCategory productType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String promotionName;

    @NonNull
    @ProtobufIndex(index = 22)
    public String skuID;

    @NonNull
    @ProtobufIndex(index = 1)
    public Long startTime;

    @NonNull
    @ProtobufIndex(index = 13)
    public String terms;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<String> textContent;

    @NonNull
    @ProtobufIndex(index = 11)
    public String textTitle;
    public static ProtobufAdapter<CreativeData> PROTOBUF_ADAPTER = new MessageNanoAdapter<CreativeData>() { // from class: com.p1.mobile.putong.core.data.CreativeData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CreativeData creativeData) {
            Long l2 = creativeData.startTime;
            int iJ = l2 != null ? CodedOutputByteBufferNano.j(1, l2.longValue()) : 0;
            Long l3 = creativeData.endTime;
            if (l3 != null) {
                iJ += CodedOutputByteBufferNano.j(2, l3.longValue());
            }
            ProductCategory productCategory = creativeData.productType;
            if (productCategory != null) {
                iJ += CodedOutputByteBufferNano.h(3, productCategory.ordinal());
            }
            String str = creativeData.promotionName;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(4, str);
            }
            List<PaymentPlatform> list = creativeData.payPlatform;
            if (list != null) {
                iJ += CodedOutputByteBufferNano.l(5, PaymentPlatform.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Double d = creativeData.normalPrice;
            if (d != null) {
                iJ += CodedOutputByteBufferNano.d(6, d.doubleValue());
            }
            Double d2 = creativeData.discountPrice;
            if (d2 != null) {
                iJ += CodedOutputByteBufferNano.d(7, d2.doubleValue());
            }
            int iB = iJ + CodedOutputByteBufferNano.b(8, creativeData.popUpWindow) + CodedOutputByteBufferNano.b(9, creativeData.autoRenewable);
            String str2 = creativeData.currencyCode;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(10, str2);
            }
            String str3 = creativeData.textTitle;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(11, str3);
            }
            List<String> list2 = creativeData.textContent;
            if (list2 != null) {
                iB += CodedOutputByteBufferNano.l(12, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = creativeData.terms;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(13, str4);
            }
            List<String> list3 = creativeData.clause;
            if (list3 != null) {
                iB += CodedOutputByteBufferNano.l(14, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = creativeData.buttonText;
            if (str5 != null) {
                iB += CodedOutputByteBufferNano.o(15, str5);
            }
            List<String> list4 = creativeData.buttonTexts;
            if (list4 != null) {
                iB += CodedOutputByteBufferNano.l(16, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Media> list5 = creativeData.backgroundPicture;
            if (list5 != null) {
                iB += CodedOutputByteBufferNano.l(17, list5, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Media> list6 = creativeData.iconPicture;
            if (list6 != null) {
                iB += CodedOutputByteBufferNano.l(18, list6, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Media> list7 = creativeData.positionPicture;
            if (list7 != null) {
                iB += CodedOutputByteBufferNano.l(19, list7, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(20, creativeData.displayPrice);
            String str6 = creativeData.currency;
            if (str6 != null) {
                iB2 += CodedOutputByteBufferNano.o(21, str6);
            }
            String str7 = creativeData.skuID;
            if (str7 != null) {
                iB2 += CodedOutputByteBufferNano.o(22, str7);
            }
            String str8 = creativeData.itemID;
            if (str8 != null) {
                iB2 += CodedOutputByteBufferNano.o(23, str8);
            }
            ProductCategory productCategory2 = creativeData.productType;
            if (productCategory2 != null) {
                iB2 += CodedOutputByteBufferNano.l(24, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            List<PaymentPlatform> list8 = creativeData.payPlatform;
            if (list8 != null) {
                iB2 += CodedOutputByteBufferNano.l(25, list8, PaymentPlatform.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) creativeData).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CreativeData m12551parse(nb5 nb5Var) throws IOException {
            Double dValueOf = Double.valueOf(0.0d);
            CreativeData creativeData = new CreativeData();
            Integer numValueOf = null;
            List list = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (creativeData.productType == null && numValueOf != null) {
                            creativeData.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (creativeData.payPlatform == null && list != null) {
                            creativeData.payPlatform = PaymentPlatform.oldEnumCovertList(list);
                        }
                        if (creativeData.startTime == null) {
                            creativeData.startTime = 0L;
                        }
                        if (creativeData.endTime == null) {
                            creativeData.endTime = 0L;
                        }
                        if (creativeData.productType == null) {
                            creativeData.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (creativeData.promotionName == null) {
                            creativeData.promotionName = "";
                        }
                        if (creativeData.payPlatform == null) {
                            creativeData.payPlatform = new ArrayList();
                        }
                        if (creativeData.normalPrice == null) {
                            creativeData.normalPrice = dValueOf;
                        }
                        if (creativeData.discountPrice == null) {
                            creativeData.discountPrice = dValueOf;
                        }
                        if (creativeData.currencyCode == null) {
                            creativeData.currencyCode = "";
                        }
                        if (creativeData.textTitle == null) {
                            creativeData.textTitle = "";
                        }
                        if (creativeData.textContent == null) {
                            creativeData.textContent = new ArrayList();
                        }
                        if (creativeData.terms == null) {
                            creativeData.terms = "";
                        }
                        if (creativeData.clause == null) {
                            creativeData.clause = new ArrayList();
                        }
                        if (creativeData.buttonText == null) {
                            creativeData.buttonText = "";
                        }
                        if (creativeData.buttonTexts == null) {
                            creativeData.buttonTexts = new ArrayList();
                        }
                        if (creativeData.backgroundPicture == null) {
                            creativeData.backgroundPicture = new ArrayList();
                        }
                        if (creativeData.iconPicture == null) {
                            creativeData.iconPicture = new ArrayList();
                        }
                        if (creativeData.positionPicture == null) {
                            creativeData.positionPicture = new ArrayList();
                        }
                        if (creativeData.currency == null) {
                            creativeData.currency = "";
                        }
                        if (creativeData.skuID == null) {
                            creativeData.skuID = "";
                        }
                        if (creativeData.itemID == null) {
                            creativeData.itemID = "";
                        }
                        break;
                    case 8:
                        creativeData.startTime = Long.valueOf(nb5Var.k());
                        continue;
                    case 16:
                        creativeData.endTime = Long.valueOf(nb5Var.k());
                        continue;
                    case 24:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 34:
                        creativeData.promotionName = nb5Var.s();
                        continue;
                    case 42:
                        list = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 49:
                        creativeData.normalPrice = Double.valueOf(nb5Var.h());
                        continue;
                    case 57:
                        creativeData.discountPrice = Double.valueOf(nb5Var.h());
                        continue;
                    case 64:
                        creativeData.popUpWindow = nb5Var.g();
                        continue;
                    case 72:
                        creativeData.autoRenewable = nb5Var.g();
                        continue;
                    case 82:
                        creativeData.currencyCode = nb5Var.s();
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        creativeData.textTitle = nb5Var.s();
                        continue;
                    case 98:
                        creativeData.textContent = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 106:
                        creativeData.terms = nb5Var.s();
                        continue;
                    case 114:
                        creativeData.clause = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 122:
                        creativeData.buttonText = nb5Var.s();
                        continue;
                    case 130:
                        creativeData.buttonTexts = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 138:
                        creativeData.backgroundPicture = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 146:
                        creativeData.iconPicture = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 154:
                        creativeData.positionPicture = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 160:
                        creativeData.displayPrice = nb5Var.g();
                        continue;
                    case 170:
                        creativeData.currency = nb5Var.s();
                        continue;
                    case 178:
                        creativeData.skuID = nb5Var.s();
                        continue;
                    case 186:
                        creativeData.itemID = nb5Var.s();
                        continue;
                    case 194:
                        creativeData.productType = (ProductCategory) nb5Var.l(ProductCategory.PROTOBUF_ADAPTER);
                        continue;
                    case 202:
                        creativeData.payPlatform = (List) nb5Var.l(PaymentPlatform.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (creativeData.productType == null && numValueOf != null) {
                            creativeData.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (creativeData.payPlatform == null && list != null) {
                            creativeData.payPlatform = PaymentPlatform.oldEnumCovertList(list);
                        }
                        if (creativeData.startTime == null) {
                            creativeData.startTime = 0L;
                        }
                        if (creativeData.endTime == null) {
                            creativeData.endTime = 0L;
                        }
                        if (creativeData.productType == null) {
                            creativeData.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (creativeData.promotionName == null) {
                            creativeData.promotionName = "";
                        }
                        if (creativeData.payPlatform == null) {
                            creativeData.payPlatform = new ArrayList();
                        }
                        if (creativeData.normalPrice == null) {
                            creativeData.normalPrice = dValueOf;
                        }
                        if (creativeData.discountPrice == null) {
                            creativeData.discountPrice = dValueOf;
                        }
                        if (creativeData.currencyCode == null) {
                            creativeData.currencyCode = "";
                        }
                        if (creativeData.textTitle == null) {
                            creativeData.textTitle = "";
                        }
                        if (creativeData.textContent == null) {
                            creativeData.textContent = new ArrayList();
                        }
                        if (creativeData.terms == null) {
                            creativeData.terms = "";
                        }
                        if (creativeData.clause == null) {
                            creativeData.clause = new ArrayList();
                        }
                        if (creativeData.buttonText == null) {
                            creativeData.buttonText = "";
                        }
                        if (creativeData.buttonTexts == null) {
                            creativeData.buttonTexts = new ArrayList();
                        }
                        if (creativeData.backgroundPicture == null) {
                            creativeData.backgroundPicture = new ArrayList();
                        }
                        if (creativeData.iconPicture == null) {
                            creativeData.iconPicture = new ArrayList();
                        }
                        if (creativeData.positionPicture == null) {
                            creativeData.positionPicture = new ArrayList();
                        }
                        if (creativeData.currency == null) {
                            creativeData.currency = "";
                        }
                        if (creativeData.skuID == null) {
                            creativeData.skuID = "";
                        }
                        if (creativeData.itemID == null) {
                            creativeData.itemID = "";
                            return creativeData;
                        }
                        break;
                }
            }
            return creativeData;
        }

        public void serialize(CreativeData creativeData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Long l2 = creativeData.startTime;
            if (l2 != null) {
                codedOutputByteBufferNano.I(1, l2.longValue());
            }
            Long l3 = creativeData.endTime;
            if (l3 != null) {
                codedOutputByteBufferNano.I(2, l3.longValue());
            }
            ProductCategory productCategory = creativeData.productType;
            if (productCategory != null) {
                codedOutputByteBufferNano.G(3, productCategory.ordinal());
            }
            String str = creativeData.promotionName;
            if (str != null) {
                codedOutputByteBufferNano.R(4, str);
            }
            List<PaymentPlatform> list = creativeData.payPlatform;
            if (list != null) {
                codedOutputByteBufferNano.K(5, PaymentPlatform.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Double d = creativeData.normalPrice;
            if (d != null) {
                codedOutputByteBufferNano.C(6, d.doubleValue());
            }
            Double d2 = creativeData.discountPrice;
            if (d2 != null) {
                codedOutputByteBufferNano.C(7, d2.doubleValue());
            }
            codedOutputByteBufferNano.A(8, creativeData.popUpWindow);
            codedOutputByteBufferNano.A(9, creativeData.autoRenewable);
            String str2 = creativeData.currencyCode;
            if (str2 != null) {
                codedOutputByteBufferNano.R(10, str2);
            }
            String str3 = creativeData.textTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.R(11, str3);
            }
            List<String> list2 = creativeData.textContent;
            if (list2 != null) {
                codedOutputByteBufferNano.K(12, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = creativeData.terms;
            if (str4 != null) {
                codedOutputByteBufferNano.R(13, str4);
            }
            List<String> list3 = creativeData.clause;
            if (list3 != null) {
                codedOutputByteBufferNano.K(14, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = creativeData.buttonText;
            if (str5 != null) {
                codedOutputByteBufferNano.R(15, str5);
            }
            List<String> list4 = creativeData.buttonTexts;
            if (list4 != null) {
                codedOutputByteBufferNano.K(16, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Media> list5 = creativeData.backgroundPicture;
            if (list5 != null) {
                codedOutputByteBufferNano.K(17, list5, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Media> list6 = creativeData.iconPicture;
            if (list6 != null) {
                codedOutputByteBufferNano.K(18, list6, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Media> list7 = creativeData.positionPicture;
            if (list7 != null) {
                codedOutputByteBufferNano.K(19, list7, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(20, creativeData.displayPrice);
            String str6 = creativeData.currency;
            if (str6 != null) {
                codedOutputByteBufferNano.R(21, str6);
            }
            String str7 = creativeData.skuID;
            if (str7 != null) {
                codedOutputByteBufferNano.R(22, str7);
            }
            String str8 = creativeData.itemID;
            if (str8 != null) {
                codedOutputByteBufferNano.R(23, str8);
            }
            ProductCategory productCategory2 = creativeData.productType;
            if (productCategory2 != null) {
                codedOutputByteBufferNano.K(24, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            List<PaymentPlatform> list8 = creativeData.payPlatform;
            if (list8 != null) {
                codedOutputByteBufferNano.K(25, list8, PaymentPlatform.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CreativeData> JSON_ADAPTER = new ObjectJsonAdapter<CreativeData>() { // from class: com.p1.mobile.putong.core.data.CreativeData.2
        public Class getDataClass() {
            return CreativeData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CreativeData m12552newInstance() {
            return new CreativeData();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(CreativeData creativeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129294769:
                    if (str.equals("startTime")) {
                        b = 0;
                    }
                    break;
                case -1769998124:
                    if (str.equals("buttonTexts")) {
                        b = 1;
                    }
                    break;
                case -1607243192:
                    if (str.equals("endTime")) {
                        b = 2;
                    }
                    break;
                case -1551036432:
                    if (str.equals("backgroundPicture")) {
                        b = 3;
                    }
                    break;
                case -1491615543:
                    if (str.equals("productType")) {
                        b = 4;
                    }
                    break;
                case -1357935249:
                    if (str.equals("clause")) {
                        b = 5;
                    }
                    break;
                case -1217761723:
                    if (str.equals("iconPicture")) {
                        b = 6;
                    }
                    break;
                case -1178662034:
                    if (str.equals("itemID")) {
                        b = 7;
                    }
                    break;
                case -1048043221:
                    if (str.equals("textTitle")) {
                        b = 8;
                    }
                    break;
                case -275055454:
                    if (str.equals("normalPrice")) {
                        b = 9;
                    }
                    break;
                case -146772856:
                    if (str.equals("discountPrice")) {
                        b = 10;
                    }
                    break;
                case 109507320:
                    if (str.equals("skuID")) {
                        b = 11;
                    }
                    break;
                case 110250375:
                    if (str.equals("terms")) {
                        b = 12;
                    }
                    break;
                case 111594124:
                    if (str.equals("textContent")) {
                        b = 13;
                    }
                    break;
                case 358545279:
                    if (str.equals("buttonText")) {
                        b = 14;
                    }
                    break;
                case 575402001:
                    if (str.equals("currency")) {
                        b = 15;
                    }
                    break;
                case 714924494:
                    if (str.equals("promotionName")) {
                        b = 16;
                    }
                    break;
                case 717581276:
                    if (str.equals("popUpWindow")) {
                        b = 17;
                    }
                    break;
                case 789760120:
                    if (str.equals("autoRenewable")) {
                        b = 18;
                    }
                    break;
                case 1003640123:
                    if (str.equals("payPlatform")) {
                        b = 19;
                    }
                    break;
                case 1004773790:
                    if (str.equals("currencyCode")) {
                        b = 20;
                    }
                    break;
                case 1601360295:
                    if (str.equals("displayPrice")) {
                        b = 21;
                    }
                    break;
                case 1658350485:
                    if (str.equals("positionPicture")) {
                        b = 22;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    creativeData.startTime = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Long.valueOf(jsonParser.getValueAsLong()) : null;
                    return true;
                case 1:
                    creativeData.buttonTexts = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case QuickChatCardWrapper.QuickChatCardType.PASSIVE /* 2 */:
                    creativeData.endTime = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Long.valueOf(jsonParser.getValueAsLong()) : null;
                    return true;
                case QuickChatCardWrapper.QuickChatCardType.PEI_LIAO /* 3 */:
                    creativeData.backgroundPicture = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    creativeData.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE /* 5 */:
                    creativeData.clause = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    creativeData.iconPicture = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    creativeData.itemID = jsonParser.getValueAsString();
                    return true;
                case 8:
                    creativeData.textTitle = jsonParser.getValueAsString();
                    return true;
                case 9:
                    creativeData.normalPrice = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Double.valueOf(jsonParser.getValueAsDouble()) : null;
                    return true;
                case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                    creativeData.discountPrice = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Double.valueOf(jsonParser.getValueAsDouble()) : null;
                    return true;
                case 11:
                    creativeData.skuID = jsonParser.getValueAsString();
                    return true;
                case 12:
                    creativeData.terms = jsonParser.getValueAsString();
                    return true;
                case 13:
                    creativeData.textContent = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    creativeData.buttonText = jsonParser.getValueAsString();
                    return true;
                case 15:
                    creativeData.currency = jsonParser.getValueAsString();
                    return true;
                case 16:
                    creativeData.promotionName = jsonParser.getValueAsString();
                    return true;
                case 17:
                    creativeData.popUpWindow = jsonParser.getValueAsBoolean();
                    return true;
                case 18:
                    creativeData.autoRenewable = jsonParser.getValueAsBoolean();
                    return true;
                case 19:
                    creativeData.payPlatform = JsonAdapter.parseArray(jsonParser, PaymentPlatform.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    creativeData.currencyCode = jsonParser.getValueAsString();
                    return true;
                case 21:
                    creativeData.displayPrice = jsonParser.getValueAsBoolean();
                    return true;
                case 22:
                    creativeData.positionPicture = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CreativeData creativeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "buttonTexts":
                case "endTime":
                case "backgroundPicture":
                case "productType":
                case "clause":
                case "iconPicture":
                case "itemID":
                case "textTitle":
                case "normalPrice":
                case "discountPrice":
                case "skuID":
                case "terms":
                case "textContent":
                case "buttonText":
                case "currency":
                case "promotionName":
                case "popUpWindow":
                case "autoRenewable":
                case "payPlatform":
                case "currencyCode":
                case "displayPrice":
                case "positionPicture":
                    return true;
                default:
                    return super.parseFieldCheck(creativeData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CreativeData creativeData, JsonGenerator jsonGenerator) throws IOException {
            Long l2 = creativeData.startTime;
            if (l2 != null) {
                jsonGenerator.writeNumberField("startTime", l2.longValue());
            }
            Long l3 = creativeData.endTime;
            if (l3 != null) {
                jsonGenerator.writeNumberField("endTime", l3.longValue());
            }
            if (creativeData.productType != null) {
                jsonGenerator.writeFieldName("productType");
                ProductCategory.JSON_ADAPTER.serialize(creativeData.productType, jsonGenerator, true);
            }
            String str = creativeData.promotionName;
            if (str != null) {
                jsonGenerator.writeStringField("promotionName", str);
            }
            if (creativeData.payPlatform != null) {
                jsonGenerator.writeFieldName("payPlatform");
                JsonAdapter.serializeArray(creativeData.payPlatform, jsonGenerator, PaymentPlatform.JSON_ADAPTER);
            }
            Double d = creativeData.normalPrice;
            if (d != null) {
                jsonGenerator.writeNumberField("normalPrice", d.doubleValue());
            }
            Double d2 = creativeData.discountPrice;
            if (d2 != null) {
                jsonGenerator.writeNumberField("discountPrice", d2.doubleValue());
            }
            jsonGenerator.writeBooleanField("popUpWindow", creativeData.popUpWindow);
            jsonGenerator.writeBooleanField("autoRenewable", creativeData.autoRenewable);
            String str2 = creativeData.currencyCode;
            if (str2 != null) {
                jsonGenerator.writeStringField("currencyCode", str2);
            }
            String str3 = creativeData.textTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("textTitle", str3);
            }
            if (creativeData.textContent != null) {
                jsonGenerator.writeFieldName("textContent");
                JsonAdapter.serializeArray(creativeData.textContent, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str4 = creativeData.terms;
            if (str4 != null) {
                jsonGenerator.writeStringField("terms", str4);
            }
            if (creativeData.clause != null) {
                jsonGenerator.writeFieldName("clause");
                JsonAdapter.serializeArray(creativeData.clause, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str5 = creativeData.buttonText;
            if (str5 != null) {
                jsonGenerator.writeStringField("buttonText", str5);
            }
            if (creativeData.buttonTexts != null) {
                jsonGenerator.writeFieldName("buttonTexts");
                JsonAdapter.serializeArray(creativeData.buttonTexts, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (creativeData.backgroundPicture != null) {
                jsonGenerator.writeFieldName("backgroundPicture");
                JsonAdapter.serializeArray(creativeData.backgroundPicture, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            if (creativeData.iconPicture != null) {
                jsonGenerator.writeFieldName("iconPicture");
                JsonAdapter.serializeArray(creativeData.iconPicture, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            if (creativeData.positionPicture != null) {
                jsonGenerator.writeFieldName("positionPicture");
                JsonAdapter.serializeArray(creativeData.positionPicture, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            jsonGenerator.writeBooleanField("displayPrice", creativeData.displayPrice);
            String str6 = creativeData.currency;
            if (str6 != null) {
                jsonGenerator.writeStringField("currency", str6);
            }
            String str7 = creativeData.skuID;
            if (str7 != null) {
                jsonGenerator.writeStringField("skuID", str7);
            }
            String str8 = creativeData.itemID;
            if (str8 != null) {
                jsonGenerator.writeStringField("itemID", str8);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CreativeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CreativeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m295b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ PaymentPlatform m296c(PaymentPlatform paymentPlatform) {
        return paymentPlatform;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m298e(String str) {
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m300k(String str) {
        return str;
    }

    public static CreativeData new_() {
        CreativeData creativeData = new CreativeData();
        creativeData.nullCheck();
        return creativeData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CreativeData m12550clone() {
        CreativeData creativeData = new CreativeData();
        creativeData.startTime = this.startTime;
        creativeData.endTime = this.endTime;
        creativeData.productType = this.productType;
        creativeData.promotionName = this.promotionName;
        List<PaymentPlatform> list = this.payPlatform;
        if (list != null) {
            creativeData.payPlatform = ValueObject.util_map(list, new w9j() { // from class: l.ptb
                public final Object call(Object obj) {
                    return CreativeData.m296c((PaymentPlatform) obj);
                }
            });
        }
        creativeData.normalPrice = this.normalPrice;
        creativeData.discountPrice = this.discountPrice;
        creativeData.popUpWindow = this.popUpWindow;
        creativeData.autoRenewable = this.autoRenewable;
        creativeData.currencyCode = this.currencyCode;
        creativeData.textTitle = this.textTitle;
        List<String> list2 = this.textContent;
        if (list2 != null) {
            creativeData.textContent = ValueObject.util_map(list2, new w9j() { // from class: l.qtb
                public final Object call(Object obj) {
                    return CreativeData.m295b((String) obj);
                }
            });
        }
        creativeData.terms = this.terms;
        List<String> list3 = this.clause;
        if (list3 != null) {
            creativeData.clause = ValueObject.util_map(list3, new w9j() { // from class: l.rtb
                public final Object call(Object obj) {
                    return CreativeData.m298e((String) obj);
                }
            });
        }
        creativeData.buttonText = this.buttonText;
        List<String> list4 = this.buttonTexts;
        if (list4 != null) {
            creativeData.buttonTexts = ValueObject.util_map(list4, new w9j() { // from class: l.stb
                public final Object call(Object obj) {
                    return CreativeData.m300k((String) obj);
                }
            });
        }
        List<Media> list5 = this.backgroundPicture;
        if (list5 != null) {
            creativeData.backgroundPicture = ValueObject.util_map(list5, new w9j() { // from class: l.ttb
                public final Object call(Object obj) {
                    return ((Media) obj).clone();
                }
            });
        }
        List<Media> list6 = this.iconPicture;
        if (list6 != null) {
            creativeData.iconPicture = ValueObject.util_map(list6, new w9j() { // from class: l.utb
                public final Object call(Object obj) {
                    return ((Media) obj).clone();
                }
            });
        }
        List<Media> list7 = this.positionPicture;
        if (list7 != null) {
            creativeData.positionPicture = ValueObject.util_map(list7, new w9j() { // from class: l.vtb
                public final Object call(Object obj) {
                    return ((Media) obj).clone();
                }
            });
        }
        creativeData.displayPrice = this.displayPrice;
        creativeData.currency = this.currency;
        creativeData.skuID = this.skuID;
        creativeData.itemID = this.itemID;
        return creativeData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeData)) {
            return false;
        }
        CreativeData creativeData = (CreativeData) obj;
        return ValueObject.util_equals(this.startTime, creativeData.startTime) && ValueObject.util_equals(this.endTime, creativeData.endTime) && ValueObject.util_equals(this.productType, creativeData.productType) && ValueObject.util_equals(this.promotionName, creativeData.promotionName) && ValueObject.util_equals(this.payPlatform, creativeData.payPlatform) && ValueObject.util_equals(this.normalPrice, creativeData.normalPrice) && ValueObject.util_equals(this.discountPrice, creativeData.discountPrice) && this.popUpWindow == creativeData.popUpWindow && this.autoRenewable == creativeData.autoRenewable && ValueObject.util_equals(this.currencyCode, creativeData.currencyCode) && ValueObject.util_equals(this.textTitle, creativeData.textTitle) && ValueObject.util_equals(this.textContent, creativeData.textContent) && ValueObject.util_equals(this.terms, creativeData.terms) && ValueObject.util_equals(this.clause, creativeData.clause) && ValueObject.util_equals(this.buttonText, creativeData.buttonText) && ValueObject.util_equals(this.buttonTexts, creativeData.buttonTexts) && ValueObject.util_equals(this.backgroundPicture, creativeData.backgroundPicture) && ValueObject.util_equals(this.iconPicture, creativeData.iconPicture) && ValueObject.util_equals(this.positionPicture, creativeData.positionPicture) && this.displayPrice == creativeData.displayPrice && ValueObject.util_equals(this.currency, creativeData.currency) && ValueObject.util_equals(this.skuID, creativeData.skuID) && ValueObject.util_equals(this.itemID, creativeData.itemID);
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
        Long l2 = this.startTime;
        int iHashCode = (i2 + (l2 != null ? l2.hashCode() : 0)) * 41;
        Long l3 = this.endTime;
        int iHashCode2 = (iHashCode + (l3 != null ? l3.hashCode() : 0)) * 41;
        ProductCategory productCategory = this.productType;
        int iHashCode3 = (iHashCode2 + (productCategory != null ? productCategory.hashCode() : 0)) * 41;
        String str = this.promotionName;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 41;
        List<PaymentPlatform> list = this.payPlatform;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        Double d = this.normalPrice;
        int iHashCode6 = (iHashCode5 + (d != null ? d.hashCode() : 0)) * 41;
        Double d2 = this.discountPrice;
        int iHashCode7 = (((((iHashCode6 + (d2 != null ? d2.hashCode() : 0)) * 41) + (this.popUpWindow ? 1231 : 1237)) * 41) + (this.autoRenewable ? 1231 : 1237)) * 41;
        String str2 = this.currencyCode;
        int iHashCode8 = (iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.textTitle;
        int iHashCode9 = (iHashCode8 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<String> list2 = this.textContent;
        int iHashCode10 = (iHashCode9 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str4 = this.terms;
        int iHashCode11 = (iHashCode10 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list3 = this.clause;
        int iHashCode12 = (iHashCode11 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str5 = this.buttonText;
        int iHashCode13 = (iHashCode12 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<String> list4 = this.buttonTexts;
        int iHashCode14 = (iHashCode13 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<Media> list5 = this.backgroundPicture;
        int iHashCode15 = (iHashCode14 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<Media> list6 = this.iconPicture;
        int iHashCode16 = (iHashCode15 + (list6 != null ? list6.hashCode() : 0)) * 41;
        List<Media> list7 = this.positionPicture;
        int iHashCode17 = (((iHashCode16 + (list7 != null ? list7.hashCode() : 0)) * 41) + (this.displayPrice ? 1231 : 1237)) * 41;
        String str6 = this.currency;
        int iHashCode18 = (iHashCode17 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.skuID;
        int iHashCode19 = (iHashCode18 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.itemID;
        int iHashCode20 = iHashCode19 + (str8 != null ? str8.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode20;
        return iHashCode20;
    }

    public void nullCheck() {
        Double dValueOf = Double.valueOf(0.0d);
        if (this.startTime == null) {
            this.startTime = 0L;
        }
        if (this.endTime == null) {
            this.endTime = 0L;
        }
        if (this.productType == null) {
            this.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.promotionName == null) {
            this.promotionName = "";
        }
        if (this.payPlatform == null) {
            this.payPlatform = new ArrayList();
        }
        if (this.normalPrice == null) {
            this.normalPrice = dValueOf;
        }
        if (this.discountPrice == null) {
            this.discountPrice = dValueOf;
        }
        if (this.currencyCode == null) {
            this.currencyCode = "";
        }
        if (this.textTitle == null) {
            this.textTitle = "";
        }
        if (this.textContent == null) {
            this.textContent = new ArrayList();
        }
        if (this.terms == null) {
            this.terms = "";
        }
        if (this.clause == null) {
            this.clause = new ArrayList();
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.buttonTexts == null) {
            this.buttonTexts = new ArrayList();
        }
        if (this.backgroundPicture == null) {
            this.backgroundPicture = new ArrayList();
        }
        if (this.iconPicture == null) {
            this.iconPicture = new ArrayList();
        }
        if (this.positionPicture == null) {
            this.positionPicture = new ArrayList();
        }
        if (this.currency == null) {
            this.currency = "";
        }
        if (this.skuID == null) {
            this.skuID = "";
        }
        if (this.itemID == null) {
            this.itemID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
