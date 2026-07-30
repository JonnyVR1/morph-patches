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
public class ActionInsertPosition extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actioninsertposition";

    @NonNull
    @ProtobufIndex(index = 3)
    public CardExtraInfo cardExtraInfo;

    @NonNull
    @ProtobufIndex(index = 4)
    public CardStyle cardStyle;

    @NonNull
    @ProtobufIndex(index = 6)
    public CityCData cityCData;

    @NonNull
    @ProtobufIndex(index = 5)
    public CardStyle likedMe;

    @ProtobufIndex(index = 2)
    public int position;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<ActionInsertPosition> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionInsertPosition>() { // from class: com.p1.mobile.putong.core.data.ActionInsertPosition.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ActionInsertPosition actionInsertPosition) {
            String str = actionInsertPosition.userId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, actionInsertPosition.position);
            CardExtraInfo cardExtraInfo = actionInsertPosition.cardExtraInfo;
            if (cardExtraInfo != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, cardExtraInfo, CardExtraInfo.PROTOBUF_ADAPTER);
            }
            CardStyle cardStyle = actionInsertPosition.cardStyle;
            if (cardStyle != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, cardStyle, CardStyle.PROTOBUF_ADAPTER);
            }
            CardStyle cardStyle2 = actionInsertPosition.likedMe;
            if (cardStyle2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, cardStyle2, CardStyle.PROTOBUF_ADAPTER);
            }
            CityCData cityCData = actionInsertPosition.cityCData;
            if (cityCData != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, cityCData, CityCData.PROTOBUF_ADAPTER);
            }
            actionInsertPosition.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ActionInsertPosition parse(nc5 nc5Var) throws IOException {
            ActionInsertPosition actionInsertPosition = new ActionInsertPosition();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (actionInsertPosition.userId == null) {
                        actionInsertPosition.userId = "";
                    }
                    if (actionInsertPosition.cardExtraInfo == null) {
                        actionInsertPosition.cardExtraInfo = CardExtraInfo.new_();
                    }
                    if (actionInsertPosition.cardStyle == null) {
                        actionInsertPosition.cardStyle = CardStyle.new_();
                    }
                    if (actionInsertPosition.likedMe == null) {
                        actionInsertPosition.likedMe = CardStyle.new_();
                    }
                    if (actionInsertPosition.cityCData != null) {
                        break;
                    }
                    actionInsertPosition.cityCData = CityCData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    actionInsertPosition.userId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    actionInsertPosition.position = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    actionInsertPosition.cardExtraInfo = (CardExtraInfo) nc5Var.m162488l(CardExtraInfo.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    actionInsertPosition.cardStyle = (CardStyle) nc5Var.m162488l(CardStyle.PROTOBUF_ADAPTER);
                } else if (iM162497u == 42) {
                    actionInsertPosition.likedMe = (CardStyle) nc5Var.m162488l(CardStyle.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 50) {
                        if (actionInsertPosition.userId == null) {
                            actionInsertPosition.userId = "";
                        }
                        if (actionInsertPosition.cardExtraInfo == null) {
                            actionInsertPosition.cardExtraInfo = CardExtraInfo.new_();
                        }
                        if (actionInsertPosition.cardStyle == null) {
                            actionInsertPosition.cardStyle = CardStyle.new_();
                        }
                        if (actionInsertPosition.likedMe == null) {
                            actionInsertPosition.likedMe = CardStyle.new_();
                        }
                        if (actionInsertPosition.cityCData != null) {
                            break;
                        }
                        actionInsertPosition.cityCData = CityCData.new_();
                        return actionInsertPosition;
                    }
                    actionInsertPosition.cityCData = (CityCData) nc5Var.m162488l(CityCData.PROTOBUF_ADAPTER);
                }
            }
            return actionInsertPosition;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ActionInsertPosition actionInsertPosition, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = actionInsertPosition.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, actionInsertPosition.position);
            CardExtraInfo cardExtraInfo = actionInsertPosition.cardExtraInfo;
            if (cardExtraInfo != null) {
                codedOutputByteBufferNano.m17309K(3, cardExtraInfo, CardExtraInfo.PROTOBUF_ADAPTER);
            }
            CardStyle cardStyle = actionInsertPosition.cardStyle;
            if (cardStyle != null) {
                codedOutputByteBufferNano.m17309K(4, cardStyle, CardStyle.PROTOBUF_ADAPTER);
            }
            CardStyle cardStyle2 = actionInsertPosition.likedMe;
            if (cardStyle2 != null) {
                codedOutputByteBufferNano.m17309K(5, cardStyle2, CardStyle.PROTOBUF_ADAPTER);
            }
            CityCData cityCData = actionInsertPosition.cityCData;
            if (cityCData != null) {
                codedOutputByteBufferNano.m17309K(6, cityCData, CityCData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ActionInsertPosition> JSON_ADAPTER = new ObjectJsonAdapter<ActionInsertPosition>() { // from class: com.p1.mobile.putong.core.data.ActionInsertPosition.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ActionInsertPosition.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ActionInsertPosition newInstance() {
            return new ActionInsertPosition();
        }

        public boolean parseField(ActionInsertPosition actionInsertPosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cityCData":
                    actionInsertPosition.cityCData = CityCData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    actionInsertPosition.userId = jsonParser.getValueAsString();
                    return true;
                case "position":
                    actionInsertPosition.position = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ActionInsertPosition actionInsertPosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cityCData":
                case "userId":
                case "position":
                    return true;
                default:
                    return super.parseFieldCheck(actionInsertPosition, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ActionInsertPosition actionInsertPosition, JsonGenerator jsonGenerator) throws IOException {
            String str = actionInsertPosition.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("position", actionInsertPosition.position);
            if (actionInsertPosition.cityCData != null) {
                jsonGenerator.writeFieldName("cityCData");
                CityCData.JSON_ADAPTER.serialize(actionInsertPosition.cityCData, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionInsertPosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionInsertPosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActionInsertPosition new_() {
        ActionInsertPosition actionInsertPosition = new ActionInsertPosition();
        actionInsertPosition.nullCheck();
        return actionInsertPosition;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ActionInsertPosition mo225055clone() {
        ActionInsertPosition actionInsertPosition = new ActionInsertPosition();
        actionInsertPosition.userId = this.userId;
        actionInsertPosition.position = this.position;
        CardExtraInfo cardExtraInfo = this.cardExtraInfo;
        if (cardExtraInfo != null) {
            actionInsertPosition.cardExtraInfo = cardExtraInfo.mo225055clone();
        }
        CardStyle cardStyle = this.cardStyle;
        if (cardStyle != null) {
            actionInsertPosition.cardStyle = cardStyle.mo225055clone();
        }
        CardStyle cardStyle2 = this.likedMe;
        if (cardStyle2 != null) {
            actionInsertPosition.likedMe = cardStyle2.mo225055clone();
        }
        CityCData cityCData = this.cityCData;
        if (cityCData != null) {
            actionInsertPosition.cityCData = cityCData.mo225055clone();
        }
        return actionInsertPosition;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionInsertPosition)) {
            return false;
        }
        ActionInsertPosition actionInsertPosition = (ActionInsertPosition) obj;
        return ValueObject.util_equals(this.userId, actionInsertPosition.userId) && this.position == actionInsertPosition.position && ValueObject.util_equals(this.cardExtraInfo, actionInsertPosition.cardExtraInfo) && ValueObject.util_equals(this.cardStyle, actionInsertPosition.cardStyle) && ValueObject.util_equals(this.likedMe, actionInsertPosition.likedMe) && ValueObject.util_equals(this.cityCData, actionInsertPosition.cityCData);
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
        String str = this.userId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.position) * 41;
        CardExtraInfo cardExtraInfo = this.cardExtraInfo;
        int iHashCode2 = (iHashCode + (cardExtraInfo != null ? cardExtraInfo.hashCode() : 0)) * 41;
        CardStyle cardStyle = this.cardStyle;
        int iHashCode3 = (iHashCode2 + (cardStyle != null ? cardStyle.hashCode() : 0)) * 41;
        CardStyle cardStyle2 = this.likedMe;
        int iHashCode4 = (iHashCode3 + (cardStyle2 != null ? cardStyle2.hashCode() : 0)) * 41;
        CityCData cityCData = this.cityCData;
        int iHashCode5 = iHashCode4 + (cityCData != null ? cityCData.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.cardExtraInfo == null) {
            this.cardExtraInfo = CardExtraInfo.new_();
        }
        if (this.cardStyle == null) {
            this.cardStyle = CardStyle.new_();
        }
        if (this.likedMe == null) {
            this.likedMe = CardStyle.new_();
        }
        if (this.cityCData == null) {
            this.cityCData = CityCData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
