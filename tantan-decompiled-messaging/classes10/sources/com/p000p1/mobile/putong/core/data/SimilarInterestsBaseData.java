package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class SimilarInterestsBaseData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsbasedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public SimilarInterestsBaseDataBG background;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String bottomButtonBg;

    @NonNull
    @ProtobufIndex(index = 8)
    public String bottomButtonSelectedBg;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String bottomButtonTextColor;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public SimilarInterestsBaseDataBottomMonolayer bottomMonolayer;

    @NonNull
    @ProtobufIndex(index = 4)
    public String descColor;

    @NonNull
    @ProtobufIndex(index = 7)
    public SimilarInterestsItemCard itemCard;

    @NonNull
    @ProtobufIndex(index = 6)
    public SimilarInterestsSwipeCard swipeCard;
    public static ProtobufAdapter<SimilarInterestsBaseData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsBaseData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsBaseData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SimilarInterestsBaseData similarInterestsBaseData) {
            SimilarInterestsBaseDataBG similarInterestsBaseDataBG = similarInterestsBaseData.background;
            int iL = similarInterestsBaseDataBG != null ? CodedOutputByteBufferNano.l(1, similarInterestsBaseDataBG, SimilarInterestsBaseDataBG.PROTOBUF_ADAPTER) : 0;
            String str = similarInterestsBaseData.bottomButtonBg;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = similarInterestsBaseData.bottomButtonTextColor;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = similarInterestsBaseData.descColor;
            if (str3 != null) {
                iL += CodedOutputByteBufferNano.o(4, str3);
            }
            SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer = similarInterestsBaseData.bottomMonolayer;
            if (similarInterestsBaseDataBottomMonolayer != null) {
                iL += CodedOutputByteBufferNano.l(5, similarInterestsBaseDataBottomMonolayer, SimilarInterestsBaseDataBottomMonolayer.PROTOBUF_ADAPTER);
            }
            SimilarInterestsSwipeCard similarInterestsSwipeCard = similarInterestsBaseData.swipeCard;
            if (similarInterestsSwipeCard != null) {
                iL += CodedOutputByteBufferNano.l(6, similarInterestsSwipeCard, SimilarInterestsSwipeCard.PROTOBUF_ADAPTER);
            }
            SimilarInterestsItemCard similarInterestsItemCard = similarInterestsBaseData.itemCard;
            if (similarInterestsItemCard != null) {
                iL += CodedOutputByteBufferNano.l(7, similarInterestsItemCard, SimilarInterestsItemCard.PROTOBUF_ADAPTER);
            }
            String str4 = similarInterestsBaseData.bottomButtonSelectedBg;
            if (str4 != null) {
                iL += CodedOutputByteBufferNano.o(8, str4);
            }
            ((MessageNano) similarInterestsBaseData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsBaseData m15620parse(nb5 nb5Var) throws IOException {
            SimilarInterestsBaseData similarInterestsBaseData = new SimilarInterestsBaseData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (similarInterestsBaseData.background == null) {
                        similarInterestsBaseData.background = SimilarInterestsBaseDataBG.new_();
                    }
                    if (similarInterestsBaseData.bottomButtonBg == null) {
                        similarInterestsBaseData.bottomButtonBg = "";
                    }
                    if (similarInterestsBaseData.bottomButtonTextColor == null) {
                        similarInterestsBaseData.bottomButtonTextColor = "";
                    }
                    if (similarInterestsBaseData.bottomButtonSelectedBg == null) {
                        similarInterestsBaseData.bottomButtonSelectedBg = "";
                    }
                    if (similarInterestsBaseData.descColor == null) {
                        similarInterestsBaseData.descColor = "";
                    }
                    if (similarInterestsBaseData.bottomMonolayer == null) {
                        similarInterestsBaseData.bottomMonolayer = SimilarInterestsBaseDataBottomMonolayer.new_();
                    }
                    if (similarInterestsBaseData.swipeCard == null) {
                        similarInterestsBaseData.swipeCard = SimilarInterestsSwipeCard.new_();
                    }
                    if (similarInterestsBaseData.itemCard != null) {
                        break;
                    }
                    similarInterestsBaseData.itemCard = SimilarInterestsItemCard.new_();
                    break;
                }
                if (iU == 10) {
                    similarInterestsBaseData.background = (SimilarInterestsBaseDataBG) nb5Var.l(SimilarInterestsBaseDataBG.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    similarInterestsBaseData.bottomButtonBg = nb5Var.s();
                } else if (iU == 26) {
                    similarInterestsBaseData.bottomButtonTextColor = nb5Var.s();
                } else if (iU == 34) {
                    similarInterestsBaseData.descColor = nb5Var.s();
                } else if (iU == 42) {
                    similarInterestsBaseData.bottomMonolayer = (SimilarInterestsBaseDataBottomMonolayer) nb5Var.l(SimilarInterestsBaseDataBottomMonolayer.PROTOBUF_ADAPTER);
                } else if (iU == 50) {
                    similarInterestsBaseData.swipeCard = (SimilarInterestsSwipeCard) nb5Var.l(SimilarInterestsSwipeCard.PROTOBUF_ADAPTER);
                } else if (iU == 58) {
                    similarInterestsBaseData.itemCard = (SimilarInterestsItemCard) nb5Var.l(SimilarInterestsItemCard.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 66) {
                        if (similarInterestsBaseData.background == null) {
                            similarInterestsBaseData.background = SimilarInterestsBaseDataBG.new_();
                        }
                        if (similarInterestsBaseData.bottomButtonBg == null) {
                            similarInterestsBaseData.bottomButtonBg = "";
                        }
                        if (similarInterestsBaseData.bottomButtonTextColor == null) {
                            similarInterestsBaseData.bottomButtonTextColor = "";
                        }
                        if (similarInterestsBaseData.bottomButtonSelectedBg == null) {
                            similarInterestsBaseData.bottomButtonSelectedBg = "";
                        }
                        if (similarInterestsBaseData.descColor == null) {
                            similarInterestsBaseData.descColor = "";
                        }
                        if (similarInterestsBaseData.bottomMonolayer == null) {
                            similarInterestsBaseData.bottomMonolayer = SimilarInterestsBaseDataBottomMonolayer.new_();
                        }
                        if (similarInterestsBaseData.swipeCard == null) {
                            similarInterestsBaseData.swipeCard = SimilarInterestsSwipeCard.new_();
                        }
                        if (similarInterestsBaseData.itemCard != null) {
                            break;
                        }
                        similarInterestsBaseData.itemCard = SimilarInterestsItemCard.new_();
                        return similarInterestsBaseData;
                    }
                    similarInterestsBaseData.bottomButtonSelectedBg = nb5Var.s();
                }
            }
            return similarInterestsBaseData;
        }

        public void serialize(SimilarInterestsBaseData similarInterestsBaseData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SimilarInterestsBaseDataBG similarInterestsBaseDataBG = similarInterestsBaseData.background;
            if (similarInterestsBaseDataBG != null) {
                codedOutputByteBufferNano.K(1, similarInterestsBaseDataBG, SimilarInterestsBaseDataBG.PROTOBUF_ADAPTER);
            }
            String str = similarInterestsBaseData.bottomButtonBg;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = similarInterestsBaseData.bottomButtonTextColor;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = similarInterestsBaseData.descColor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer = similarInterestsBaseData.bottomMonolayer;
            if (similarInterestsBaseDataBottomMonolayer != null) {
                codedOutputByteBufferNano.K(5, similarInterestsBaseDataBottomMonolayer, SimilarInterestsBaseDataBottomMonolayer.PROTOBUF_ADAPTER);
            }
            SimilarInterestsSwipeCard similarInterestsSwipeCard = similarInterestsBaseData.swipeCard;
            if (similarInterestsSwipeCard != null) {
                codedOutputByteBufferNano.K(6, similarInterestsSwipeCard, SimilarInterestsSwipeCard.PROTOBUF_ADAPTER);
            }
            SimilarInterestsItemCard similarInterestsItemCard = similarInterestsBaseData.itemCard;
            if (similarInterestsItemCard != null) {
                codedOutputByteBufferNano.K(7, similarInterestsItemCard, SimilarInterestsItemCard.PROTOBUF_ADAPTER);
            }
            String str4 = similarInterestsBaseData.bottomButtonSelectedBg;
            if (str4 != null) {
                codedOutputByteBufferNano.R(8, str4);
            }
        }
    };
    public static JsonAdapter<SimilarInterestsBaseData> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsBaseData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsBaseData.2
        public Class getDataClass() {
            return SimilarInterestsBaseData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsBaseData m15621newInstance() {
            return new SimilarInterestsBaseData();
        }

        public boolean parseField(SimilarInterestsBaseData similarInterestsBaseData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bottomMonolayer":
                    similarInterestsBaseData.bottomMonolayer = (SimilarInterestsBaseDataBottomMonolayer) SimilarInterestsBaseDataBottomMonolayer.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "bottomButtonBg":
                    similarInterestsBaseData.bottomButtonBg = jsonParser.getValueAsString();
                    return true;
                case "background":
                    similarInterestsBaseData.background = (SimilarInterestsBaseDataBG) SimilarInterestsBaseDataBG.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "bottomButtonSelectedBg":
                    similarInterestsBaseData.bottomButtonSelectedBg = jsonParser.getValueAsString();
                    return true;
                case "bottomButtonTextColor":
                    similarInterestsBaseData.bottomButtonTextColor = jsonParser.getValueAsString();
                    return true;
                case "itemCard":
                    similarInterestsBaseData.itemCard = (SimilarInterestsItemCard) SimilarInterestsItemCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "descColor":
                    similarInterestsBaseData.descColor = jsonParser.getValueAsString();
                    return true;
                case "swipeCard":
                    similarInterestsBaseData.swipeCard = (SimilarInterestsSwipeCard) SimilarInterestsSwipeCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SimilarInterestsBaseData similarInterestsBaseData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bottomMonolayer":
                case "bottomButtonBg":
                case "background":
                case "bottomButtonSelectedBg":
                case "bottomButtonTextColor":
                case "itemCard":
                case "descColor":
                case "swipeCard":
                    return true;
                default:
                    return super.parseFieldCheck(similarInterestsBaseData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SimilarInterestsBaseData similarInterestsBaseData, JsonGenerator jsonGenerator) throws IOException {
            if (similarInterestsBaseData.background != null) {
                jsonGenerator.writeFieldName("background");
                SimilarInterestsBaseDataBG.JSON_ADAPTER.serialize(similarInterestsBaseData.background, jsonGenerator, true);
            }
            String str = similarInterestsBaseData.bottomButtonBg;
            if (str != null) {
                jsonGenerator.writeStringField("bottomButtonBg", str);
            }
            String str2 = similarInterestsBaseData.bottomButtonTextColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("bottomButtonTextColor", str2);
            }
            String str3 = similarInterestsBaseData.bottomButtonSelectedBg;
            if (str3 != null) {
                jsonGenerator.writeStringField("bottomButtonSelectedBg", str3);
            }
            String str4 = similarInterestsBaseData.descColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("descColor", str4);
            }
            if (similarInterestsBaseData.bottomMonolayer != null) {
                jsonGenerator.writeFieldName("bottomMonolayer");
                SimilarInterestsBaseDataBottomMonolayer.JSON_ADAPTER.serialize(similarInterestsBaseData.bottomMonolayer, jsonGenerator, true);
            }
            if (similarInterestsBaseData.swipeCard != null) {
                jsonGenerator.writeFieldName("swipeCard");
                SimilarInterestsSwipeCard.JSON_ADAPTER.serialize(similarInterestsBaseData.swipeCard, jsonGenerator, true);
            }
            if (similarInterestsBaseData.itemCard != null) {
                jsonGenerator.writeFieldName("itemCard");
                SimilarInterestsItemCard.JSON_ADAPTER.serialize(similarInterestsBaseData.itemCard, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsBaseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsBaseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsBaseData new_() {
        SimilarInterestsBaseData similarInterestsBaseData = new SimilarInterestsBaseData();
        similarInterestsBaseData.nullCheck();
        return similarInterestsBaseData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimilarInterestsBaseData m15619clone() {
        SimilarInterestsBaseData similarInterestsBaseData = new SimilarInterestsBaseData();
        SimilarInterestsBaseDataBG similarInterestsBaseDataBG = this.background;
        if (similarInterestsBaseDataBG != null) {
            similarInterestsBaseData.background = similarInterestsBaseDataBG.m15623clone();
        }
        similarInterestsBaseData.bottomButtonBg = this.bottomButtonBg;
        similarInterestsBaseData.bottomButtonTextColor = this.bottomButtonTextColor;
        similarInterestsBaseData.bottomButtonSelectedBg = this.bottomButtonSelectedBg;
        similarInterestsBaseData.descColor = this.descColor;
        SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer = this.bottomMonolayer;
        if (similarInterestsBaseDataBottomMonolayer != null) {
            similarInterestsBaseData.bottomMonolayer = similarInterestsBaseDataBottomMonolayer.m15627clone();
        }
        SimilarInterestsSwipeCard similarInterestsSwipeCard = this.swipeCard;
        if (similarInterestsSwipeCard != null) {
            similarInterestsBaseData.swipeCard = similarInterestsSwipeCard.m15659clone();
        }
        SimilarInterestsItemCard similarInterestsItemCard = this.itemCard;
        if (similarInterestsItemCard != null) {
            similarInterestsBaseData.itemCard = similarInterestsItemCard.m15635clone();
        }
        return similarInterestsBaseData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimilarInterestsBaseData)) {
            return false;
        }
        SimilarInterestsBaseData similarInterestsBaseData = (SimilarInterestsBaseData) obj;
        return ValueObject.util_equals(this.background, similarInterestsBaseData.background) && ValueObject.util_equals(this.bottomButtonBg, similarInterestsBaseData.bottomButtonBg) && ValueObject.util_equals(this.bottomButtonTextColor, similarInterestsBaseData.bottomButtonTextColor) && ValueObject.util_equals(this.bottomButtonSelectedBg, similarInterestsBaseData.bottomButtonSelectedBg) && ValueObject.util_equals(this.descColor, similarInterestsBaseData.descColor) && ValueObject.util_equals(this.bottomMonolayer, similarInterestsBaseData.bottomMonolayer) && ValueObject.util_equals(this.swipeCard, similarInterestsBaseData.swipeCard) && ValueObject.util_equals(this.itemCard, similarInterestsBaseData.itemCard);
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
        SimilarInterestsBaseDataBG similarInterestsBaseDataBG = this.background;
        int iHashCode = (i2 + (similarInterestsBaseDataBG != null ? similarInterestsBaseDataBG.hashCode() : 0)) * 41;
        String str = this.bottomButtonBg;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.bottomButtonTextColor;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bottomButtonSelectedBg;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.descColor;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer = this.bottomMonolayer;
        int iHashCode6 = (iHashCode5 + (similarInterestsBaseDataBottomMonolayer != null ? similarInterestsBaseDataBottomMonolayer.hashCode() : 0)) * 41;
        SimilarInterestsSwipeCard similarInterestsSwipeCard = this.swipeCard;
        int iHashCode7 = (iHashCode6 + (similarInterestsSwipeCard != null ? similarInterestsSwipeCard.hashCode() : 0)) * 41;
        SimilarInterestsItemCard similarInterestsItemCard = this.itemCard;
        int iHashCode8 = iHashCode7 + (similarInterestsItemCard != null ? similarInterestsItemCard.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

    public void nullCheck() {
        if (this.background == null) {
            this.background = SimilarInterestsBaseDataBG.new_();
        }
        if (this.bottomButtonBg == null) {
            this.bottomButtonBg = "";
        }
        if (this.bottomButtonTextColor == null) {
            this.bottomButtonTextColor = "";
        }
        if (this.bottomButtonSelectedBg == null) {
            this.bottomButtonSelectedBg = "";
        }
        if (this.descColor == null) {
            this.descColor = "";
        }
        if (this.bottomMonolayer == null) {
            this.bottomMonolayer = SimilarInterestsBaseDataBottomMonolayer.new_();
        }
        if (this.swipeCard == null) {
            this.swipeCard = SimilarInterestsSwipeCard.new_();
        }
        if (this.itemCard == null) {
            this.itemCard = SimilarInterestsItemCard.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
