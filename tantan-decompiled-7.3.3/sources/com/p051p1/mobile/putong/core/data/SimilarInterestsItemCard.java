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
public class SimilarInterestsItemCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsitemcard";

    @NonNull
    @ProtobufIndex(index = 3)
    public String borderColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String borderShadowColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String descTextColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String titleTextColor;
    public static ProtobufAdapter<SimilarInterestsItemCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsItemCard>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SimilarInterestsItemCard similarInterestsItemCard) {
            String str = similarInterestsItemCard.titleTextColor;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = similarInterestsItemCard.descTextColor;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = similarInterestsItemCard.borderColor;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = similarInterestsItemCard.borderShadowColor;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            similarInterestsItemCard.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SimilarInterestsItemCard parse(nc5 nc5Var) throws IOException {
            SimilarInterestsItemCard similarInterestsItemCard = new SimilarInterestsItemCard();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    similarInterestsItemCard.titleTextColor = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    similarInterestsItemCard.descTextColor = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    similarInterestsItemCard.borderColor = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
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
                    similarInterestsItemCard.borderShadowColor = nc5Var.m162495s();
                }
            }
            return similarInterestsItemCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SimilarInterestsItemCard similarInterestsItemCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = similarInterestsItemCard.titleTextColor;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = similarInterestsItemCard.descTextColor;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = similarInterestsItemCard.borderColor;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = similarInterestsItemCard.borderShadowColor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<SimilarInterestsItemCard> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsItemCard>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SimilarInterestsItemCard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SimilarInterestsItemCard newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsItemCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsItemCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsItemCard new_() {
        SimilarInterestsItemCard similarInterestsItemCard = new SimilarInterestsItemCard();
        similarInterestsItemCard.nullCheck();
        return similarInterestsItemCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SimilarInterestsItemCard mo225055clone() {
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
        String str = this.titleTextColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.descTextColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.borderColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.borderShadowColor;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
