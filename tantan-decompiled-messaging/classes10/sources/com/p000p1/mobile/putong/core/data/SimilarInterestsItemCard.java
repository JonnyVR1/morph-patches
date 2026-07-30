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
public class SimilarInterestsItemCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsitemcard";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String borderColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String borderShadowColor;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String descTextColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String titleTextColor;
    public static ProtobufAdapter<SimilarInterestsItemCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsItemCard>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemCard.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SimilarInterestsItemCard similarInterestsItemCard) {
            String str = similarInterestsItemCard.titleTextColor;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = similarInterestsItemCard.descTextColor;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = similarInterestsItemCard.borderColor;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = similarInterestsItemCard.borderShadowColor;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) similarInterestsItemCard).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsItemCard m15636parse(nb5 nb5Var) throws IOException {
            SimilarInterestsItemCard similarInterestsItemCard = new SimilarInterestsItemCard();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (similarInterestsItemCard.titleTextColor == null) {
                        similarInterestsItemCard.titleTextColor = "";
                    }
                    if (similarInterestsItemCard.descTextColor == null) {
                        similarInterestsItemCard.descTextColor = "";
                    }
                    if (similarInterestsItemCard.borderColor == null) {
                        similarInterestsItemCard.borderColor = "";
                    }
                    if (similarInterestsItemCard.borderShadowColor != null) {
                        break;
                    }
                    similarInterestsItemCard.borderShadowColor = "";
                    break;
                }
                if (iU == 10) {
                    similarInterestsItemCard.titleTextColor = nb5Var.s();
                } else if (iU == 18) {
                    similarInterestsItemCard.descTextColor = nb5Var.s();
                } else if (iU == 26) {
                    similarInterestsItemCard.borderColor = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (similarInterestsItemCard.titleTextColor == null) {
                            similarInterestsItemCard.titleTextColor = "";
                        }
                        if (similarInterestsItemCard.descTextColor == null) {
                            similarInterestsItemCard.descTextColor = "";
                        }
                        if (similarInterestsItemCard.borderColor == null) {
                            similarInterestsItemCard.borderColor = "";
                        }
                        if (similarInterestsItemCard.borderShadowColor != null) {
                            break;
                        }
                        similarInterestsItemCard.borderShadowColor = "";
                        return similarInterestsItemCard;
                    }
                    similarInterestsItemCard.borderShadowColor = nb5Var.s();
                }
            }
            return similarInterestsItemCard;
        }

        public void serialize(SimilarInterestsItemCard similarInterestsItemCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = similarInterestsItemCard.titleTextColor;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = similarInterestsItemCard.descTextColor;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = similarInterestsItemCard.borderColor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = similarInterestsItemCard.borderShadowColor;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<SimilarInterestsItemCard> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsItemCard>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemCard.2
        public Class getDataClass() {
            return SimilarInterestsItemCard.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsItemCard m15637newInstance() {
            return new SimilarInterestsItemCard();
        }

        public boolean parseField(SimilarInterestsItemCard similarInterestsItemCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "descTextColor":
                    similarInterestsItemCard.descTextColor = jsonParser.getValueAsString();
                    return true;
                case "titleTextColor":
                    similarInterestsItemCard.titleTextColor = jsonParser.getValueAsString();
                    return true;
                case "borderColor":
                    similarInterestsItemCard.borderColor = jsonParser.getValueAsString();
                    return true;
                case "borderShadowColor":
                    similarInterestsItemCard.borderShadowColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SimilarInterestsItemCard similarInterestsItemCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "descTextColor":
                case "titleTextColor":
                case "borderColor":
                case "borderShadowColor":
                    return true;
                default:
                    return super.parseFieldCheck(similarInterestsItemCard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SimilarInterestsItemCard similarInterestsItemCard, JsonGenerator jsonGenerator) throws IOException {
            String str = similarInterestsItemCard.titleTextColor;
            if (str != null) {
                jsonGenerator.writeStringField("titleTextColor", str);
            }
            String str2 = similarInterestsItemCard.descTextColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("descTextColor", str2);
            }
            String str3 = similarInterestsItemCard.borderColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("borderColor", str3);
            }
            String str4 = similarInterestsItemCard.borderShadowColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("borderShadowColor", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsItemCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsItemCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsItemCard new_() {
        SimilarInterestsItemCard similarInterestsItemCard = new SimilarInterestsItemCard();
        similarInterestsItemCard.nullCheck();
        return similarInterestsItemCard;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimilarInterestsItemCard m15635clone() {
        SimilarInterestsItemCard similarInterestsItemCard = new SimilarInterestsItemCard();
        similarInterestsItemCard.titleTextColor = this.titleTextColor;
        similarInterestsItemCard.descTextColor = this.descTextColor;
        similarInterestsItemCard.borderColor = this.borderColor;
        similarInterestsItemCard.borderShadowColor = this.borderShadowColor;
        return similarInterestsItemCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimilarInterestsItemCard)) {
            return false;
        }
        SimilarInterestsItemCard similarInterestsItemCard = (SimilarInterestsItemCard) obj;
        return ValueObject.util_equals(this.titleTextColor, similarInterestsItemCard.titleTextColor) && ValueObject.util_equals(this.descTextColor, similarInterestsItemCard.descTextColor) && ValueObject.util_equals(this.borderColor, similarInterestsItemCard.borderColor) && ValueObject.util_equals(this.borderShadowColor, similarInterestsItemCard.borderShadowColor);
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
        String str = this.titleTextColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.descTextColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.borderColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.borderShadowColor;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.titleTextColor == null) {
            this.titleTextColor = "";
        }
        if (this.descTextColor == null) {
            this.descTextColor = "";
        }
        if (this.borderColor == null) {
            this.borderColor = "";
        }
        if (this.borderShadowColor == null) {
            this.borderShadowColor = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
