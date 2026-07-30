package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class SimilarInterestsSwipeCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsswipecard";

    @NonNull
    @ProtobufIndex(index = 2)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String startColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public String textColor;
    public static ProtobufAdapter<SimilarInterestsSwipeCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsSwipeCard>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsSwipeCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SimilarInterestsSwipeCard similarInterestsSwipeCard) {
            String str = similarInterestsSwipeCard.startColor;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = similarInterestsSwipeCard.endColor;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = similarInterestsSwipeCard.textColor;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            similarInterestsSwipeCard.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SimilarInterestsSwipeCard parse(nc5 nc5Var) throws IOException {
            SimilarInterestsSwipeCard similarInterestsSwipeCard = new SimilarInterestsSwipeCard();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    similarInterestsSwipeCard.startColor = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    similarInterestsSwipeCard.endColor = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
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
                    similarInterestsSwipeCard.textColor = nc5Var.m162495s();
                }
            }
            return similarInterestsSwipeCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SimilarInterestsSwipeCard similarInterestsSwipeCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = similarInterestsSwipeCard.startColor;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = similarInterestsSwipeCard.endColor;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = similarInterestsSwipeCard.textColor;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<SimilarInterestsSwipeCard> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsSwipeCard>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsSwipeCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SimilarInterestsSwipeCard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SimilarInterestsSwipeCard newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsSwipeCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsSwipeCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsSwipeCard new_() {
        SimilarInterestsSwipeCard similarInterestsSwipeCard = new SimilarInterestsSwipeCard();
        similarInterestsSwipeCard.nullCheck();
        return similarInterestsSwipeCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SimilarInterestsSwipeCard mo225055clone() {
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
        String str = this.startColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.endColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.textColor;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
