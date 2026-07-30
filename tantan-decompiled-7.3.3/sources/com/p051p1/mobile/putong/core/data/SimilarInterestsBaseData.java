package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSResourceType;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class SimilarInterestsBaseData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsbasedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public SimilarInterestsBaseDataBG background;

    @NonNull
    @ProtobufIndex(index = 2)
    public String bottomButtonBg;

    @NonNull
    @ProtobufIndex(index = 8)
    public String bottomButtonSelectedBg;

    @NonNull
    @ProtobufIndex(index = 3)
    public String bottomButtonTextColor;

    @NonNull
    @ProtobufIndex(index = 5)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SimilarInterestsBaseData similarInterestsBaseData) {
            SimilarInterestsBaseDataBG similarInterestsBaseDataBG = similarInterestsBaseData.background;
            int iM17285l = similarInterestsBaseDataBG != null ? CodedOutputByteBufferNano.m17285l(1, similarInterestsBaseDataBG, SimilarInterestsBaseDataBG.PROTOBUF_ADAPTER) : 0;
            String str = similarInterestsBaseData.bottomButtonBg;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = similarInterestsBaseData.bottomButtonTextColor;
            if (str2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = similarInterestsBaseData.descColor;
            if (str3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer = similarInterestsBaseData.bottomMonolayer;
            if (similarInterestsBaseDataBottomMonolayer != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(5, similarInterestsBaseDataBottomMonolayer, SimilarInterestsBaseDataBottomMonolayer.PROTOBUF_ADAPTER);
            }
            SimilarInterestsSwipeCard similarInterestsSwipeCard = similarInterestsBaseData.swipeCard;
            if (similarInterestsSwipeCard != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(6, similarInterestsSwipeCard, SimilarInterestsSwipeCard.PROTOBUF_ADAPTER);
            }
            SimilarInterestsItemCard similarInterestsItemCard = similarInterestsBaseData.itemCard;
            if (similarInterestsItemCard != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(7, similarInterestsItemCard, SimilarInterestsItemCard.PROTOBUF_ADAPTER);
            }
            String str4 = similarInterestsBaseData.bottomButtonSelectedBg;
            if (str4 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(8, str4);
            }
            similarInterestsBaseData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SimilarInterestsBaseData parse(nc5 nc5Var) throws IOException {
            SimilarInterestsBaseData similarInterestsBaseData = new SimilarInterestsBaseData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    similarInterestsBaseData.background = (SimilarInterestsBaseDataBG) nc5Var.m162488l(SimilarInterestsBaseDataBG.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    similarInterestsBaseData.bottomButtonBg = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    similarInterestsBaseData.bottomButtonTextColor = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    similarInterestsBaseData.descColor = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    similarInterestsBaseData.bottomMonolayer = (SimilarInterestsBaseDataBottomMonolayer) nc5Var.m162488l(SimilarInterestsBaseDataBottomMonolayer.PROTOBUF_ADAPTER);
                } else if (iM162497u == 50) {
                    similarInterestsBaseData.swipeCard = (SimilarInterestsSwipeCard) nc5Var.m162488l(SimilarInterestsSwipeCard.PROTOBUF_ADAPTER);
                } else if (iM162497u == 58) {
                    similarInterestsBaseData.itemCard = (SimilarInterestsItemCard) nc5Var.m162488l(SimilarInterestsItemCard.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 66) {
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
                    similarInterestsBaseData.bottomButtonSelectedBg = nc5Var.m162495s();
                }
            }
            return similarInterestsBaseData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SimilarInterestsBaseData similarInterestsBaseData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SimilarInterestsBaseDataBG similarInterestsBaseDataBG = similarInterestsBaseData.background;
            if (similarInterestsBaseDataBG != null) {
                codedOutputByteBufferNano.m17309K(1, similarInterestsBaseDataBG, SimilarInterestsBaseDataBG.PROTOBUF_ADAPTER);
            }
            String str = similarInterestsBaseData.bottomButtonBg;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = similarInterestsBaseData.bottomButtonTextColor;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = similarInterestsBaseData.descColor;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer = similarInterestsBaseData.bottomMonolayer;
            if (similarInterestsBaseDataBottomMonolayer != null) {
                codedOutputByteBufferNano.m17309K(5, similarInterestsBaseDataBottomMonolayer, SimilarInterestsBaseDataBottomMonolayer.PROTOBUF_ADAPTER);
            }
            SimilarInterestsSwipeCard similarInterestsSwipeCard = similarInterestsBaseData.swipeCard;
            if (similarInterestsSwipeCard != null) {
                codedOutputByteBufferNano.m17309K(6, similarInterestsSwipeCard, SimilarInterestsSwipeCard.PROTOBUF_ADAPTER);
            }
            SimilarInterestsItemCard similarInterestsItemCard = similarInterestsBaseData.itemCard;
            if (similarInterestsItemCard != null) {
                codedOutputByteBufferNano.m17309K(7, similarInterestsItemCard, SimilarInterestsItemCard.PROTOBUF_ADAPTER);
            }
            String str4 = similarInterestsBaseData.bottomButtonSelectedBg;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(8, str4);
            }
        }
    };
    public static JsonAdapter<SimilarInterestsBaseData> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsBaseData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsBaseData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SimilarInterestsBaseData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SimilarInterestsBaseData newInstance() {
            return new SimilarInterestsBaseData();
        }

        public boolean parseField(SimilarInterestsBaseData similarInterestsBaseData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bottomMonolayer":
                    similarInterestsBaseData.bottomMonolayer = SimilarInterestsBaseDataBottomMonolayer.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "bottomButtonBg":
                    similarInterestsBaseData.bottomButtonBg = jsonParser.getValueAsString();
                    return true;
                case "background":
                    similarInterestsBaseData.background = SimilarInterestsBaseDataBG.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "bottomButtonSelectedBg":
                    similarInterestsBaseData.bottomButtonSelectedBg = jsonParser.getValueAsString();
                    return true;
                case "bottomButtonTextColor":
                    similarInterestsBaseData.bottomButtonTextColor = jsonParser.getValueAsString();
                    return true;
                case "itemCard":
                    similarInterestsBaseData.itemCard = SimilarInterestsItemCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "descColor":
                    similarInterestsBaseData.descColor = jsonParser.getValueAsString();
                    return true;
                case "swipeCard":
                    similarInterestsBaseData.swipeCard = SimilarInterestsSwipeCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SimilarInterestsBaseData similarInterestsBaseData, JsonGenerator jsonGenerator) throws IOException {
            if (similarInterestsBaseData.background != null) {
                jsonGenerator.writeFieldName(OMSResourceType.background);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsBaseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsBaseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsBaseData new_() {
        SimilarInterestsBaseData similarInterestsBaseData = new SimilarInterestsBaseData();
        similarInterestsBaseData.nullCheck();
        return similarInterestsBaseData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SimilarInterestsBaseData mo225055clone() {
        SimilarInterestsBaseData similarInterestsBaseData = new SimilarInterestsBaseData();
        SimilarInterestsBaseDataBG similarInterestsBaseDataBG = this.background;
        if (similarInterestsBaseDataBG != null) {
            similarInterestsBaseData.background = similarInterestsBaseDataBG.mo225055clone();
        }
        similarInterestsBaseData.bottomButtonBg = this.bottomButtonBg;
        similarInterestsBaseData.bottomButtonTextColor = this.bottomButtonTextColor;
        similarInterestsBaseData.bottomButtonSelectedBg = this.bottomButtonSelectedBg;
        similarInterestsBaseData.descColor = this.descColor;
        SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer = this.bottomMonolayer;
        if (similarInterestsBaseDataBottomMonolayer != null) {
            similarInterestsBaseData.bottomMonolayer = similarInterestsBaseDataBottomMonolayer.mo225055clone();
        }
        SimilarInterestsSwipeCard similarInterestsSwipeCard = this.swipeCard;
        if (similarInterestsSwipeCard != null) {
            similarInterestsBaseData.swipeCard = similarInterestsSwipeCard.mo225055clone();
        }
        SimilarInterestsItemCard similarInterestsItemCard = this.itemCard;
        if (similarInterestsItemCard != null) {
            similarInterestsBaseData.itemCard = similarInterestsItemCard.mo225055clone();
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
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
