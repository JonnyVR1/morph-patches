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
public class CardPatternCombinedIcon extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardpatterncombinedicon";

    @NonNull
    @ProtobufIndex(index = 1)
    public String backgroundId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String context;

    @NonNull
    @ProtobufIndex(index = 2)
    public String iconId;
    public static ProtobufAdapter<CardPatternCombinedIcon> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardPatternCombinedIcon>() { // from class: com.p1.mobile.putong.core.data.CardPatternCombinedIcon.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardPatternCombinedIcon cardPatternCombinedIcon) {
            String str = cardPatternCombinedIcon.backgroundId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = cardPatternCombinedIcon.iconId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = cardPatternCombinedIcon.context;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            cardPatternCombinedIcon.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardPatternCombinedIcon parse(nb5 nb5Var) throws IOException {
            CardPatternCombinedIcon cardPatternCombinedIcon = new CardPatternCombinedIcon();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (cardPatternCombinedIcon.backgroundId == null) {
                        cardPatternCombinedIcon.backgroundId = "";
                    }
                    if (cardPatternCombinedIcon.iconId == null) {
                        cardPatternCombinedIcon.iconId = "";
                    }
                    if (cardPatternCombinedIcon.context != null) {
                        break;
                    }
                    cardPatternCombinedIcon.context = "";
                    break;
                }
                if (iM158752u == 10) {
                    cardPatternCombinedIcon.backgroundId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    cardPatternCombinedIcon.iconId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (cardPatternCombinedIcon.backgroundId == null) {
                            cardPatternCombinedIcon.backgroundId = "";
                        }
                        if (cardPatternCombinedIcon.iconId == null) {
                            cardPatternCombinedIcon.iconId = "";
                        }
                        if (cardPatternCombinedIcon.context != null) {
                            break;
                        }
                        cardPatternCombinedIcon.context = "";
                        return cardPatternCombinedIcon;
                    }
                    cardPatternCombinedIcon.context = nb5Var.m158750s();
                }
            }
            return cardPatternCombinedIcon;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardPatternCombinedIcon cardPatternCombinedIcon, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardPatternCombinedIcon.backgroundId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = cardPatternCombinedIcon.iconId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = cardPatternCombinedIcon.context;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<CardPatternCombinedIcon> JSON_ADAPTER = new ObjectJsonAdapter<CardPatternCombinedIcon>() { // from class: com.p1.mobile.putong.core.data.CardPatternCombinedIcon.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardPatternCombinedIcon.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardPatternCombinedIcon newInstance() {
            return new CardPatternCombinedIcon();
        }

        public boolean parseField(CardPatternCombinedIcon cardPatternCombinedIcon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "iconId":
                    cardPatternCombinedIcon.iconId = jsonParser.getValueAsString();
                    return true;
                case "backgroundId":
                    cardPatternCombinedIcon.backgroundId = jsonParser.getValueAsString();
                    return true;
                case "context":
                    cardPatternCombinedIcon.context = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CardPatternCombinedIcon cardPatternCombinedIcon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "iconId":
                case "backgroundId":
                case "context":
                    return true;
                default:
                    return super.parseFieldCheck(cardPatternCombinedIcon, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CardPatternCombinedIcon cardPatternCombinedIcon, JsonGenerator jsonGenerator) throws IOException {
            String str = cardPatternCombinedIcon.backgroundId;
            if (str != null) {
                jsonGenerator.writeStringField("backgroundId", str);
            }
            String str2 = cardPatternCombinedIcon.iconId;
            if (str2 != null) {
                jsonGenerator.writeStringField("iconId", str2);
            }
            String str3 = cardPatternCombinedIcon.context;
            if (str3 != null) {
                jsonGenerator.writeStringField("context", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardPatternCombinedIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardPatternCombinedIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardPatternCombinedIcon new_() {
        CardPatternCombinedIcon cardPatternCombinedIcon = new CardPatternCombinedIcon();
        cardPatternCombinedIcon.nullCheck();
        return cardPatternCombinedIcon;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardPatternCombinedIcon mo223809clone() {
        CardPatternCombinedIcon cardPatternCombinedIcon = new CardPatternCombinedIcon();
        cardPatternCombinedIcon.backgroundId = this.backgroundId;
        cardPatternCombinedIcon.iconId = this.iconId;
        cardPatternCombinedIcon.context = this.context;
        return cardPatternCombinedIcon;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardPatternCombinedIcon)) {
            return false;
        }
        CardPatternCombinedIcon cardPatternCombinedIcon = (CardPatternCombinedIcon) obj;
        return ValueObject.util_equals(this.backgroundId, cardPatternCombinedIcon.backgroundId) && ValueObject.util_equals(this.iconId, cardPatternCombinedIcon.iconId) && ValueObject.util_equals(this.context, cardPatternCombinedIcon.context);
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
        String str = this.backgroundId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.iconId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.context;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.backgroundId == null) {
            this.backgroundId = "";
        }
        if (this.iconId == null) {
            this.iconId = "";
        }
        if (this.context == null) {
            this.context = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
