package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class CardPatternBottomContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardpatternbottomcontent";

    @NonNull
    @ProtobufIndex(index = 3)
    public String bottomContext;

    @NonNull
    @ProtobufIndex(index = 2)
    public String middleContext;

    @NonNull
    @ProtobufIndex(index = 1)
    public CardPatternCombinedIcon topContent;
    public static ProtobufAdapter<CardPatternBottomContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardPatternBottomContent>() { // from class: com.p1.mobile.putong.core.data.CardPatternBottomContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardPatternBottomContent cardPatternBottomContent) {
            CardPatternCombinedIcon cardPatternCombinedIcon = cardPatternBottomContent.topContent;
            int iM17230l = cardPatternCombinedIcon != null ? CodedOutputByteBufferNano.m17230l(1, cardPatternCombinedIcon, CardPatternCombinedIcon.PROTOBUF_ADAPTER) : 0;
            String str = cardPatternBottomContent.middleContext;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = cardPatternBottomContent.bottomContext;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            cardPatternBottomContent.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardPatternBottomContent parse(nb5 nb5Var) throws IOException {
            CardPatternBottomContent cardPatternBottomContent = new CardPatternBottomContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (cardPatternBottomContent.topContent == null) {
                        cardPatternBottomContent.topContent = CardPatternCombinedIcon.new_();
                    }
                    if (cardPatternBottomContent.middleContext == null) {
                        cardPatternBottomContent.middleContext = "";
                    }
                    if (cardPatternBottomContent.bottomContext != null) {
                        break;
                    }
                    cardPatternBottomContent.bottomContext = "";
                    break;
                }
                if (iM158752u == 10) {
                    cardPatternBottomContent.topContent = (CardPatternCombinedIcon) nb5Var.m158743l(CardPatternCombinedIcon.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    cardPatternBottomContent.middleContext = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (cardPatternBottomContent.topContent == null) {
                            cardPatternBottomContent.topContent = CardPatternCombinedIcon.new_();
                        }
                        if (cardPatternBottomContent.middleContext == null) {
                            cardPatternBottomContent.middleContext = "";
                        }
                        if (cardPatternBottomContent.bottomContext != null) {
                            break;
                        }
                        cardPatternBottomContent.bottomContext = "";
                        return cardPatternBottomContent;
                    }
                    cardPatternBottomContent.bottomContext = nb5Var.m158750s();
                }
            }
            return cardPatternBottomContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardPatternBottomContent cardPatternBottomContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            CardPatternCombinedIcon cardPatternCombinedIcon = cardPatternBottomContent.topContent;
            if (cardPatternCombinedIcon != null) {
                codedOutputByteBufferNano.m17254K(1, cardPatternCombinedIcon, CardPatternCombinedIcon.PROTOBUF_ADAPTER);
            }
            String str = cardPatternBottomContent.middleContext;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = cardPatternBottomContent.bottomContext;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<CardPatternBottomContent> JSON_ADAPTER = new ObjectJsonAdapter<CardPatternBottomContent>() { // from class: com.p1.mobile.putong.core.data.CardPatternBottomContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardPatternBottomContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardPatternBottomContent newInstance() {
            return new CardPatternBottomContent();
        }

        public boolean parseField(CardPatternBottomContent cardPatternBottomContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bottomContext":
                    cardPatternBottomContent.bottomContext = jsonParser.getValueAsString();
                    return true;
                case "topContent":
                    cardPatternBottomContent.topContent = CardPatternCombinedIcon.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "middleContext":
                    cardPatternBottomContent.middleContext = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CardPatternBottomContent cardPatternBottomContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bottomContext":
                case "topContent":
                case "middleContext":
                    return true;
                default:
                    return super.parseFieldCheck(cardPatternBottomContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CardPatternBottomContent cardPatternBottomContent, JsonGenerator jsonGenerator) throws IOException {
            if (cardPatternBottomContent.topContent != null) {
                jsonGenerator.writeFieldName("topContent");
                CardPatternCombinedIcon.JSON_ADAPTER.serialize(cardPatternBottomContent.topContent, jsonGenerator, true);
            }
            String str = cardPatternBottomContent.middleContext;
            if (str != null) {
                jsonGenerator.writeStringField("middleContext", str);
            }
            String str2 = cardPatternBottomContent.bottomContext;
            if (str2 != null) {
                jsonGenerator.writeStringField("bottomContext", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardPatternBottomContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardPatternBottomContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardPatternBottomContent new_() {
        CardPatternBottomContent cardPatternBottomContent = new CardPatternBottomContent();
        cardPatternBottomContent.nullCheck();
        return cardPatternBottomContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardPatternBottomContent mo223809clone() {
        CardPatternBottomContent cardPatternBottomContent = new CardPatternBottomContent();
        CardPatternCombinedIcon cardPatternCombinedIcon = this.topContent;
        if (cardPatternCombinedIcon != null) {
            cardPatternBottomContent.topContent = cardPatternCombinedIcon.mo223809clone();
        }
        cardPatternBottomContent.middleContext = this.middleContext;
        cardPatternBottomContent.bottomContext = this.bottomContext;
        return cardPatternBottomContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardPatternBottomContent)) {
            return false;
        }
        CardPatternBottomContent cardPatternBottomContent = (CardPatternBottomContent) obj;
        return ValueObject.util_equals(this.topContent, cardPatternBottomContent.topContent) && ValueObject.util_equals(this.middleContext, cardPatternBottomContent.middleContext) && ValueObject.util_equals(this.bottomContext, cardPatternBottomContent.bottomContext);
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
        CardPatternCombinedIcon cardPatternCombinedIcon = this.topContent;
        int iHashCode = (i2 + (cardPatternCombinedIcon != null ? cardPatternCombinedIcon.hashCode() : 0)) * 41;
        String str = this.middleContext;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.bottomContext;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.topContent == null) {
            this.topContent = CardPatternCombinedIcon.new_();
        }
        if (this.middleContext == null) {
            this.middleContext = "";
        }
        if (this.bottomContext == null) {
            this.bottomContext = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
