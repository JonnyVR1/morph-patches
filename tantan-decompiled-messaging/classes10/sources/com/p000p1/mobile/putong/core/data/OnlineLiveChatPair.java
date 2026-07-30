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
public class OnlineLiveChatPair extends ValueObject implements Cloneable, Serializable {
    public static final String LIVE_MULTI_CALL = "onMultiCall";
    public static final String LIVE_STATE_VIDEO = "onLive";
    public static final String LIVE_STATE_VOICE = "onVoice";
    public static final String TYPE = "onlinelivechatpair";

    @NonNull
    @ProtobufIndex(index = 7)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String liveState;

    @NonNull
    @ProtobufIndex(index = 9)
    public LiveMultiCallInfo multiCallInfo;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String name;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String schema;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String voiceRoomTopicId;
    public static ProtobufAdapter<OnlineLiveChatPair> PROTOBUF_ADAPTER = new MessageNanoAdapter<OnlineLiveChatPair>() { // from class: com.p1.mobile.putong.core.data.OnlineLiveChatPair.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OnlineLiveChatPair onlineLiveChatPair) {
            String str = onlineLiveChatPair.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = onlineLiveChatPair.liveId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = onlineLiveChatPair.name;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = onlineLiveChatPair.avatar;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = onlineLiveChatPair.text;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = onlineLiveChatPair.voiceRoomTopicId;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = onlineLiveChatPair.anchorId;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            String str8 = onlineLiveChatPair.liveState;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(8, str8);
            }
            LiveMultiCallInfo liveMultiCallInfo = onlineLiveChatPair.multiCallInfo;
            if (liveMultiCallInfo != null) {
                iO += CodedOutputByteBufferNano.l(9, liveMultiCallInfo, LiveMultiCallInfo.PROTOBUF_ADAPTER);
            }
            String str9 = onlineLiveChatPair.schema;
            if (str9 != null) {
                iO += CodedOutputByteBufferNano.o(10, str9);
            }
            ((MessageNano) onlineLiveChatPair).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OnlineLiveChatPair m14665parse(nb5 nb5Var) throws IOException {
            OnlineLiveChatPair onlineLiveChatPair = new OnlineLiveChatPair();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (onlineLiveChatPair.userId == null) {
                            onlineLiveChatPair.userId = "";
                        }
                        if (onlineLiveChatPair.liveId == null) {
                            onlineLiveChatPair.liveId = "";
                        }
                        if (onlineLiveChatPair.name == null) {
                            onlineLiveChatPair.name = "";
                        }
                        if (onlineLiveChatPair.avatar == null) {
                            onlineLiveChatPair.avatar = "";
                        }
                        if (onlineLiveChatPair.text == null) {
                            onlineLiveChatPair.text = "";
                        }
                        if (onlineLiveChatPair.voiceRoomTopicId == null) {
                            onlineLiveChatPair.voiceRoomTopicId = "";
                        }
                        if (onlineLiveChatPair.anchorId == null) {
                            onlineLiveChatPair.anchorId = "";
                        }
                        if (onlineLiveChatPair.liveState == null) {
                            onlineLiveChatPair.liveState = "";
                        }
                        if (onlineLiveChatPair.multiCallInfo == null) {
                            onlineLiveChatPair.multiCallInfo = LiveMultiCallInfo.new_();
                        }
                        if (onlineLiveChatPair.schema == null) {
                            onlineLiveChatPair.schema = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        onlineLiveChatPair.userId = nb5Var.s();
                        continue;
                    case 18:
                        onlineLiveChatPair.liveId = nb5Var.s();
                        continue;
                    case 26:
                        onlineLiveChatPair.name = nb5Var.s();
                        continue;
                    case 34:
                        onlineLiveChatPair.avatar = nb5Var.s();
                        continue;
                    case 42:
                        onlineLiveChatPair.text = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        onlineLiveChatPair.voiceRoomTopicId = nb5Var.s();
                        continue;
                    case 58:
                        onlineLiveChatPair.anchorId = nb5Var.s();
                        continue;
                    case 66:
                        onlineLiveChatPair.liveState = nb5Var.s();
                        continue;
                    case 74:
                        onlineLiveChatPair.multiCallInfo = (LiveMultiCallInfo) nb5Var.l(LiveMultiCallInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 82:
                        onlineLiveChatPair.schema = nb5Var.s();
                        continue;
                    default:
                        if (onlineLiveChatPair.userId == null) {
                            onlineLiveChatPair.userId = "";
                        }
                        if (onlineLiveChatPair.liveId == null) {
                            onlineLiveChatPair.liveId = "";
                        }
                        if (onlineLiveChatPair.name == null) {
                            onlineLiveChatPair.name = "";
                        }
                        if (onlineLiveChatPair.avatar == null) {
                            onlineLiveChatPair.avatar = "";
                        }
                        if (onlineLiveChatPair.text == null) {
                            onlineLiveChatPair.text = "";
                        }
                        if (onlineLiveChatPair.voiceRoomTopicId == null) {
                            onlineLiveChatPair.voiceRoomTopicId = "";
                        }
                        if (onlineLiveChatPair.anchorId == null) {
                            onlineLiveChatPair.anchorId = "";
                        }
                        if (onlineLiveChatPair.liveState == null) {
                            onlineLiveChatPair.liveState = "";
                        }
                        if (onlineLiveChatPair.multiCallInfo == null) {
                            onlineLiveChatPair.multiCallInfo = LiveMultiCallInfo.new_();
                        }
                        if (onlineLiveChatPair.schema == null) {
                            onlineLiveChatPair.schema = "";
                            return onlineLiveChatPair;
                        }
                        break;
                }
            }
            return onlineLiveChatPair;
        }

        public void serialize(OnlineLiveChatPair onlineLiveChatPair, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = onlineLiveChatPair.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = onlineLiveChatPair.liveId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = onlineLiveChatPair.name;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = onlineLiveChatPair.avatar;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = onlineLiveChatPair.text;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = onlineLiveChatPair.voiceRoomTopicId;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = onlineLiveChatPair.anchorId;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            String str8 = onlineLiveChatPair.liveState;
            if (str8 != null) {
                codedOutputByteBufferNano.R(8, str8);
            }
            LiveMultiCallInfo liveMultiCallInfo = onlineLiveChatPair.multiCallInfo;
            if (liveMultiCallInfo != null) {
                codedOutputByteBufferNano.K(9, liveMultiCallInfo, LiveMultiCallInfo.PROTOBUF_ADAPTER);
            }
            String str9 = onlineLiveChatPair.schema;
            if (str9 != null) {
                codedOutputByteBufferNano.R(10, str9);
            }
        }
    };
    public static JsonAdapter<OnlineLiveChatPair> JSON_ADAPTER = new ObjectJsonAdapter<OnlineLiveChatPair>() { // from class: com.p1.mobile.putong.core.data.OnlineLiveChatPair.2
        public Class getDataClass() {
            return OnlineLiveChatPair.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OnlineLiveChatPair m14666newInstance() {
            return new OnlineLiveChatPair();
        }

        public boolean parseField(OnlineLiveChatPair onlineLiveChatPair, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    onlineLiveChatPair.avatar = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    onlineLiveChatPair.liveId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    onlineLiveChatPair.anchorId = jsonParser.getValueAsString();
                    return true;
                case "schema":
                    onlineLiveChatPair.schema = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    onlineLiveChatPair.userId = jsonParser.getValueAsString();
                    return true;
                case "name":
                    onlineLiveChatPair.name = jsonParser.getValueAsString();
                    return true;
                case "text":
                    onlineLiveChatPair.text = jsonParser.getValueAsString();
                    return true;
                case "voiceRoomTopicId":
                    onlineLiveChatPair.voiceRoomTopicId = jsonParser.getValueAsString();
                    return true;
                case "liveState":
                    onlineLiveChatPair.liveState = jsonParser.getValueAsString();
                    return true;
                case "multiCallInfo":
                    onlineLiveChatPair.multiCallInfo = (LiveMultiCallInfo) LiveMultiCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OnlineLiveChatPair onlineLiveChatPair, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "avatar":
                case "liveId":
                case "anchorId":
                case "schema":
                case "userId":
                case "name":
                case "text":
                case "voiceRoomTopicId":
                case "liveState":
                case "multiCallInfo":
                    return true;
                default:
                    return super.parseFieldCheck(onlineLiveChatPair, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(OnlineLiveChatPair onlineLiveChatPair, JsonGenerator jsonGenerator) throws IOException {
            String str = onlineLiveChatPair.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = onlineLiveChatPair.liveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveId", str2);
            }
            String str3 = onlineLiveChatPair.name;
            if (str3 != null) {
                jsonGenerator.writeStringField("name", str3);
            }
            String str4 = onlineLiveChatPair.avatar;
            if (str4 != null) {
                jsonGenerator.writeStringField(ReminderAction.avatar, str4);
            }
            String str5 = onlineLiveChatPair.text;
            if (str5 != null) {
                jsonGenerator.writeStringField("text", str5);
            }
            String str6 = onlineLiveChatPair.voiceRoomTopicId;
            if (str6 != null) {
                jsonGenerator.writeStringField("voiceRoomTopicId", str6);
            }
            String str7 = onlineLiveChatPair.anchorId;
            if (str7 != null) {
                jsonGenerator.writeStringField("anchorId", str7);
            }
            String str8 = onlineLiveChatPair.liveState;
            if (str8 != null) {
                jsonGenerator.writeStringField("liveState", str8);
            }
            if (onlineLiveChatPair.multiCallInfo != null) {
                jsonGenerator.writeFieldName("multiCallInfo");
                LiveMultiCallInfo.JSON_ADAPTER.serialize(onlineLiveChatPair.multiCallInfo, jsonGenerator, true);
            }
            String str9 = onlineLiveChatPair.schema;
            if (str9 != null) {
                jsonGenerator.writeStringField("schema", str9);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OnlineLiveChatPair) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OnlineLiveChatPair) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OnlineLiveChatPair new_() {
        OnlineLiveChatPair onlineLiveChatPair = new OnlineLiveChatPair();
        onlineLiveChatPair.nullCheck();
        return onlineLiveChatPair;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OnlineLiveChatPair m14664clone() {
        OnlineLiveChatPair onlineLiveChatPair = new OnlineLiveChatPair();
        onlineLiveChatPair.userId = this.userId;
        onlineLiveChatPair.liveId = this.liveId;
        onlineLiveChatPair.name = this.name;
        onlineLiveChatPair.avatar = this.avatar;
        onlineLiveChatPair.text = this.text;
        onlineLiveChatPair.voiceRoomTopicId = this.voiceRoomTopicId;
        onlineLiveChatPair.anchorId = this.anchorId;
        onlineLiveChatPair.liveState = this.liveState;
        LiveMultiCallInfo liveMultiCallInfo = this.multiCallInfo;
        if (liveMultiCallInfo != null) {
            onlineLiveChatPair.multiCallInfo = liveMultiCallInfo.m13938clone();
        }
        onlineLiveChatPair.schema = this.schema;
        return onlineLiveChatPair;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OnlineLiveChatPair)) {
            return false;
        }
        OnlineLiveChatPair onlineLiveChatPair = (OnlineLiveChatPair) obj;
        return ValueObject.util_equals(this.userId, onlineLiveChatPair.userId) && ValueObject.util_equals(this.liveId, onlineLiveChatPair.liveId) && ValueObject.util_equals(this.name, onlineLiveChatPair.name) && ValueObject.util_equals(this.avatar, onlineLiveChatPair.avatar) && ValueObject.util_equals(this.text, onlineLiveChatPair.text) && ValueObject.util_equals(this.voiceRoomTopicId, onlineLiveChatPair.voiceRoomTopicId) && ValueObject.util_equals(this.anchorId, onlineLiveChatPair.anchorId) && ValueObject.util_equals(this.liveState, onlineLiveChatPair.liveState) && ValueObject.util_equals(this.multiCallInfo, onlineLiveChatPair.multiCallInfo) && ValueObject.util_equals(this.schema, onlineLiveChatPair.schema);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.liveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.avatar;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.text;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.voiceRoomTopicId;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.anchorId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.liveState;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        LiveMultiCallInfo liveMultiCallInfo = this.multiCallInfo;
        int iHashCode9 = (iHashCode8 + (liveMultiCallInfo != null ? liveMultiCallInfo.hashCode() : 0)) * 41;
        String str9 = this.schema;
        int iHashCode10 = iHashCode9 + (str9 != null ? str9.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode10;
        return iHashCode10;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.voiceRoomTopicId == null) {
            this.voiceRoomTopicId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.liveState == null) {
            this.liveState = "";
        }
        if (this.multiCallInfo == null) {
            this.multiCallInfo = LiveMultiCallInfo.new_();
        }
        if (this.schema == null) {
            this.schema = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
