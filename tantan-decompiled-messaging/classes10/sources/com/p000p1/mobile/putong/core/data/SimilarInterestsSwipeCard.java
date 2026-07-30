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
public class SimilarInterestsSwipeCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsswipecard";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String startColor;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String textColor;
    public static ProtobufAdapter<SimilarInterestsSwipeCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsSwipeCard>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsSwipeCard.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SimilarInterestsSwipeCard similarInterestsSwipeCard) {
            String str = similarInterestsSwipeCard.startColor;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = similarInterestsSwipeCard.endColor;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = similarInterestsSwipeCard.textColor;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) similarInterestsSwipeCard).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsSwipeCard m15660parse(nb5 nb5Var) throws IOException {
            SimilarInterestsSwipeCard similarInterestsSwipeCard = new SimilarInterestsSwipeCard();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (similarInterestsSwipeCard.startColor == null) {
                        similarInterestsSwipeCard.startColor = "";
                    }
                    if (similarInterestsSwipeCard.endColor == null) {
                        similarInterestsSwipeCard.endColor = "";
                    }
                    if (similarInterestsSwipeCard.textColor != null) {
                        break;
                    }
                    similarInterestsSwipeCard.textColor = "";
                    break;
                }
                if (iU == 10) {
                    similarInterestsSwipeCard.startColor = nb5Var.s();
                } else if (iU == 18) {
                    similarInterestsSwipeCard.endColor = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (similarInterestsSwipeCard.startColor == null) {
                            similarInterestsSwipeCard.startColor = "";
                        }
                        if (similarInterestsSwipeCard.endColor == null) {
                            similarInterestsSwipeCard.endColor = "";
                        }
                        if (similarInterestsSwipeCard.textColor != null) {
                            break;
                        }
                        similarInterestsSwipeCard.textColor = "";
                        return similarInterestsSwipeCard;
                    }
                    similarInterestsSwipeCard.textColor = nb5Var.s();
                }
            }
            return similarInterestsSwipeCard;
        }

        public void serialize(SimilarInterestsSwipeCard similarInterestsSwipeCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = similarInterestsSwipeCard.startColor;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = similarInterestsSwipeCard.endColor;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = similarInterestsSwipeCard.textColor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<SimilarInterestsSwipeCard> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsSwipeCard>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsSwipeCard.2
        public Class getDataClass() {
            return SimilarInterestsSwipeCard.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsSwipeCard m15661newInstance() {
            return new SimilarInterestsSwipeCard();
        }

        public boolean parseField(SimilarInterestsSwipeCard similarInterestsSwipeCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startColor":
                    similarInterestsSwipeCard.startColor = jsonParser.getValueAsString();
                    return true;
                case "textColor":
                    similarInterestsSwipeCard.textColor = jsonParser.getValueAsString();
                    return true;
                case "endColor":
                    similarInterestsSwipeCard.endColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SimilarInterestsSwipeCard similarInterestsSwipeCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startColor":
                case "textColor":
                case "endColor":
                    return true;
                default:
                    return super.parseFieldCheck(similarInterestsSwipeCard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SimilarInterestsSwipeCard similarInterestsSwipeCard, JsonGenerator jsonGenerator) throws IOException {
            String str = similarInterestsSwipeCard.startColor;
            if (str != null) {
                jsonGenerator.writeStringField("startColor", str);
            }
            String str2 = similarInterestsSwipeCard.endColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("endColor", str2);
            }
            String str3 = similarInterestsSwipeCard.textColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("textColor", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsSwipeCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsSwipeCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsSwipeCard new_() {
        SimilarInterestsSwipeCard similarInterestsSwipeCard = new SimilarInterestsSwipeCard();
        similarInterestsSwipeCard.nullCheck();
        return similarInterestsSwipeCard;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimilarInterestsSwipeCard m15659clone() {
        SimilarInterestsSwipeCard similarInterestsSwipeCard = new SimilarInterestsSwipeCard();
        similarInterestsSwipeCard.startColor = this.startColor;
        similarInterestsSwipeCard.endColor = this.endColor;
        similarInterestsSwipeCard.textColor = this.textColor;
        return similarInterestsSwipeCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimilarInterestsSwipeCard)) {
            return false;
        }
        SimilarInterestsSwipeCard similarInterestsSwipeCard = (SimilarInterestsSwipeCard) obj;
        return ValueObject.util_equals(this.startColor, similarInterestsSwipeCard.startColor) && ValueObject.util_equals(this.endColor, similarInterestsSwipeCard.endColor) && ValueObject.util_equals(this.textColor, similarInterestsSwipeCard.textColor);
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
        String str = this.startColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.endColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.textColor;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
