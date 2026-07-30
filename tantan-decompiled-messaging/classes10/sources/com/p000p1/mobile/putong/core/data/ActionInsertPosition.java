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
public class ActionInsertPosition extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actioninsertposition";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public CardExtraInfo cardExtraInfo;

    @NonNull
    @ProtobufIndex(index = 4)
    public CardStyle cardStyle;

    @NonNull
    @ProtobufIndex(index = 6)
    public CityCData cityCData;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public CardStyle likedMe;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int position;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<ActionInsertPosition> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionInsertPosition>() { // from class: com.p1.mobile.putong.core.data.ActionInsertPosition.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ActionInsertPosition actionInsertPosition) {
            String str = actionInsertPosition.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, actionInsertPosition.position);
            CardExtraInfo cardExtraInfo = actionInsertPosition.cardExtraInfo;
            if (cardExtraInfo != null) {
                iO += CodedOutputByteBufferNano.l(3, cardExtraInfo, CardExtraInfo.PROTOBUF_ADAPTER);
            }
            CardStyle cardStyle = actionInsertPosition.cardStyle;
            if (cardStyle != null) {
                iO += CodedOutputByteBufferNano.l(4, cardStyle, CardStyle.PROTOBUF_ADAPTER);
            }
            CardStyle cardStyle2 = actionInsertPosition.likedMe;
            if (cardStyle2 != null) {
                iO += CodedOutputByteBufferNano.l(5, cardStyle2, CardStyle.PROTOBUF_ADAPTER);
            }
            CityCData cityCData = actionInsertPosition.cityCData;
            if (cityCData != null) {
                iO += CodedOutputByteBufferNano.l(6, cityCData, CityCData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) actionInsertPosition).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ActionInsertPosition m11501parse(nb5 nb5Var) throws IOException {
            ActionInsertPosition actionInsertPosition = new ActionInsertPosition();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    actionInsertPosition.userId = nb5Var.s();
                } else if (iU == 16) {
                    actionInsertPosition.position = nb5Var.j();
                } else if (iU == 26) {
                    actionInsertPosition.cardExtraInfo = (CardExtraInfo) nb5Var.l(CardExtraInfo.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    actionInsertPosition.cardStyle = (CardStyle) nb5Var.l(CardStyle.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    actionInsertPosition.likedMe = (CardStyle) nb5Var.l(CardStyle.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
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
                    actionInsertPosition.cityCData = (CityCData) nb5Var.l(CityCData.PROTOBUF_ADAPTER);
                }
            }
            return actionInsertPosition;
        }

        public void serialize(ActionInsertPosition actionInsertPosition, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = actionInsertPosition.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, actionInsertPosition.position);
            CardExtraInfo cardExtraInfo = actionInsertPosition.cardExtraInfo;
            if (cardExtraInfo != null) {
                codedOutputByteBufferNano.K(3, cardExtraInfo, CardExtraInfo.PROTOBUF_ADAPTER);
            }
            CardStyle cardStyle = actionInsertPosition.cardStyle;
            if (cardStyle != null) {
                codedOutputByteBufferNano.K(4, cardStyle, CardStyle.PROTOBUF_ADAPTER);
            }
            CardStyle cardStyle2 = actionInsertPosition.likedMe;
            if (cardStyle2 != null) {
                codedOutputByteBufferNano.K(5, cardStyle2, CardStyle.PROTOBUF_ADAPTER);
            }
            CityCData cityCData = actionInsertPosition.cityCData;
            if (cityCData != null) {
                codedOutputByteBufferNano.K(6, cityCData, CityCData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ActionInsertPosition> JSON_ADAPTER = new ObjectJsonAdapter<ActionInsertPosition>() { // from class: com.p1.mobile.putong.core.data.ActionInsertPosition.2
        public Class getDataClass() {
            return ActionInsertPosition.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ActionInsertPosition m11502newInstance() {
            return new ActionInsertPosition();
        }

        public boolean parseField(ActionInsertPosition actionInsertPosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cityCData":
                    actionInsertPosition.cityCData = (CityCData) CityCData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionInsertPosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionInsertPosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActionInsertPosition new_() {
        ActionInsertPosition actionInsertPosition = new ActionInsertPosition();
        actionInsertPosition.nullCheck();
        return actionInsertPosition;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ActionInsertPosition m11500clone() {
        ActionInsertPosition actionInsertPosition = new ActionInsertPosition();
        actionInsertPosition.userId = this.userId;
        actionInsertPosition.position = this.position;
        CardExtraInfo cardExtraInfo = this.cardExtraInfo;
        if (cardExtraInfo != null) {
            actionInsertPosition.cardExtraInfo = cardExtraInfo.m11870clone();
        }
        CardStyle cardStyle = this.cardStyle;
        if (cardStyle != null) {
            actionInsertPosition.cardStyle = cardStyle.m11914clone();
        }
        CardStyle cardStyle2 = this.likedMe;
        if (cardStyle2 != null) {
            actionInsertPosition.likedMe = cardStyle2.m11914clone();
        }
        CityCData cityCData = this.cityCData;
        if (cityCData != null) {
            actionInsertPosition.cityCData = cityCData.m12184clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
