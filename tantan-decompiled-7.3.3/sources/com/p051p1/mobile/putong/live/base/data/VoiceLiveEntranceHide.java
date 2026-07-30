package com.p051p1.mobile.putong.live.base.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class VoiceLiveEntranceHide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voiceliveentrancehide";

    @ProtobufIndex(index = 1)
    public boolean bottomRecreation;

    @ProtobufIndex(index = 6)
    public boolean messageChatShare;

    @ProtobufIndex(index = 5)
    public boolean messageFriendHead;

    @ProtobufIndex(index = 7)
    public boolean messageHelperMessage;

    @ProtobufIndex(index = 4)
    public boolean messageListChatDynamic;

    @ProtobufIndex(index = 2)
    public boolean messageListRecommend;

    @ProtobufIndex(index = 3)
    public boolean messageListRightBottom;

    @ProtobufIndex(index = 8)
    public boolean push;

    @ProtobufIndex(index = 9)
    public boolean slideCard;
    public static ProtobufAdapter<VoiceLiveEntranceHide> PROTOBUF_ADAPTER = new C12611a();
    public static JsonAdapter<VoiceLiveEntranceHide> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLiveEntranceHide>() { // from class: com.p1.mobile.putong.live.base.data.VoiceLiveEntranceHide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceLiveEntranceHide.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceLiveEntranceHide newInstance() {
            return new VoiceLiveEntranceHide();
        }

        public boolean parseField(VoiceLiveEntranceHide voiceLiveEntranceHide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bottomRecreation":
                    voiceLiveEntranceHide.bottomRecreation = jsonParser.getValueAsBoolean();
                    return true;
                case "messageListRightBottom":
                    voiceLiveEntranceHide.messageListRightBottom = jsonParser.getValueAsBoolean();
                    return true;
                case "slideCard":
                    voiceLiveEntranceHide.slideCard = jsonParser.getValueAsBoolean();
                    return true;
                case "messageListChatDynamic":
                    voiceLiveEntranceHide.messageListChatDynamic = jsonParser.getValueAsBoolean();
                    return true;
                case "push":
                    voiceLiveEntranceHide.push = jsonParser.getValueAsBoolean();
                    return true;
                case "messageChatShare":
                    voiceLiveEntranceHide.messageChatShare = jsonParser.getValueAsBoolean();
                    return true;
                case "messageHelperMessage":
                    voiceLiveEntranceHide.messageHelperMessage = jsonParser.getValueAsBoolean();
                    return true;
                case "messageListRecommend":
                    voiceLiveEntranceHide.messageListRecommend = jsonParser.getValueAsBoolean();
                    return true;
                case "messageFriendHead":
                    voiceLiveEntranceHide.messageFriendHead = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLiveEntranceHide voiceLiveEntranceHide, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("bottomRecreation", voiceLiveEntranceHide.bottomRecreation);
            jsonGenerator.writeBooleanField("messageListRecommend", voiceLiveEntranceHide.messageListRecommend);
            jsonGenerator.writeBooleanField("messageListRightBottom", voiceLiveEntranceHide.messageListRightBottom);
            jsonGenerator.writeBooleanField("messageListChatDynamic", voiceLiveEntranceHide.messageListChatDynamic);
            jsonGenerator.writeBooleanField("messageFriendHead", voiceLiveEntranceHide.messageFriendHead);
            jsonGenerator.writeBooleanField("messageChatShare", voiceLiveEntranceHide.messageChatShare);
            jsonGenerator.writeBooleanField("messageHelperMessage", voiceLiveEntranceHide.messageHelperMessage);
            jsonGenerator.writeBooleanField("push", voiceLiveEntranceHide.push);
            jsonGenerator.writeBooleanField("slideCard", voiceLiveEntranceHide.slideCard);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLiveEntranceHide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.VoiceLiveEntranceHide$a */
    public class C12611a extends MessageNanoAdapter<VoiceLiveEntranceHide> {
        public C12611a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(VoiceLiveEntranceHide voiceLiveEntranceHide) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, voiceLiveEntranceHide.bottomRecreation) + CodedOutputByteBufferNano.m17275b(2, voiceLiveEntranceHide.messageListRecommend) + CodedOutputByteBufferNano.m17275b(3, voiceLiveEntranceHide.messageListRightBottom) + CodedOutputByteBufferNano.m17275b(4, voiceLiveEntranceHide.messageListChatDynamic) + CodedOutputByteBufferNano.m17275b(5, voiceLiveEntranceHide.messageFriendHead) + CodedOutputByteBufferNano.m17275b(6, voiceLiveEntranceHide.messageChatShare) + CodedOutputByteBufferNano.m17275b(7, voiceLiveEntranceHide.messageHelperMessage) + CodedOutputByteBufferNano.m17275b(8, voiceLiveEntranceHide.push) + CodedOutputByteBufferNano.m17275b(9, voiceLiveEntranceHide.slideCard);
            voiceLiveEntranceHide.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VoiceLiveEntranceHide parse(nc5 nc5Var) throws IOException {
            VoiceLiveEntranceHide voiceLiveEntranceHide = new VoiceLiveEntranceHide();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    voiceLiveEntranceHide.bottomRecreation = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    voiceLiveEntranceHide.messageListRecommend = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    voiceLiveEntranceHide.messageListRightBottom = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    voiceLiveEntranceHide.messageListChatDynamic = nc5Var.m162483g();
                } else if (iM162497u == 40) {
                    voiceLiveEntranceHide.messageFriendHead = nc5Var.m162483g();
                } else if (iM162497u == 48) {
                    voiceLiveEntranceHide.messageChatShare = nc5Var.m162483g();
                } else if (iM162497u == 56) {
                    voiceLiveEntranceHide.messageHelperMessage = nc5Var.m162483g();
                } else if (iM162497u == 64) {
                    voiceLiveEntranceHide.push = nc5Var.m162483g();
                } else {
                    if (iM162497u != 72) {
                        return voiceLiveEntranceHide;
                    }
                    voiceLiveEntranceHide.slideCard = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(VoiceLiveEntranceHide voiceLiveEntranceHide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, voiceLiveEntranceHide.bottomRecreation);
            codedOutputByteBufferNano.m17299A(2, voiceLiveEntranceHide.messageListRecommend);
            codedOutputByteBufferNano.m17299A(3, voiceLiveEntranceHide.messageListRightBottom);
            codedOutputByteBufferNano.m17299A(4, voiceLiveEntranceHide.messageListChatDynamic);
            codedOutputByteBufferNano.m17299A(5, voiceLiveEntranceHide.messageFriendHead);
            codedOutputByteBufferNano.m17299A(6, voiceLiveEntranceHide.messageChatShare);
            codedOutputByteBufferNano.m17299A(7, voiceLiveEntranceHide.messageHelperMessage);
            codedOutputByteBufferNano.m17299A(8, voiceLiveEntranceHide.push);
            codedOutputByteBufferNano.m17299A(9, voiceLiveEntranceHide.slideCard);
        }
    }

    public static VoiceLiveEntranceHide new_() {
        VoiceLiveEntranceHide voiceLiveEntranceHide = new VoiceLiveEntranceHide();
        voiceLiveEntranceHide.nullCheck();
        return voiceLiveEntranceHide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceLiveEntranceHide mo225055clone() {
        VoiceLiveEntranceHide voiceLiveEntranceHide = new VoiceLiveEntranceHide();
        voiceLiveEntranceHide.bottomRecreation = this.bottomRecreation;
        voiceLiveEntranceHide.messageListRecommend = this.messageListRecommend;
        voiceLiveEntranceHide.messageListRightBottom = this.messageListRightBottom;
        voiceLiveEntranceHide.messageListChatDynamic = this.messageListChatDynamic;
        voiceLiveEntranceHide.messageFriendHead = this.messageFriendHead;
        voiceLiveEntranceHide.messageChatShare = this.messageChatShare;
        voiceLiveEntranceHide.messageHelperMessage = this.messageHelperMessage;
        voiceLiveEntranceHide.push = this.push;
        voiceLiveEntranceHide.slideCard = this.slideCard;
        return voiceLiveEntranceHide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceLiveEntranceHide)) {
            return false;
        }
        VoiceLiveEntranceHide voiceLiveEntranceHide = (VoiceLiveEntranceHide) obj;
        return this.bottomRecreation == voiceLiveEntranceHide.bottomRecreation && this.messageListRecommend == voiceLiveEntranceHide.messageListRecommend && this.messageListRightBottom == voiceLiveEntranceHide.messageListRightBottom && this.messageListChatDynamic == voiceLiveEntranceHide.messageListChatDynamic && this.messageFriendHead == voiceLiveEntranceHide.messageFriendHead && this.messageChatShare == voiceLiveEntranceHide.messageChatShare && this.messageHelperMessage == voiceLiveEntranceHide.messageHelperMessage && this.push == voiceLiveEntranceHide.push && this.slideCard == voiceLiveEntranceHide.slideCard;
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
        int i2 = (((((((((((((((((i * 41) + (this.bottomRecreation ? 1231 : 1237)) * 41) + (this.messageListRecommend ? 1231 : 1237)) * 41) + (this.messageListRightBottom ? 1231 : 1237)) * 41) + (this.messageListChatDynamic ? 1231 : 1237)) * 41) + (this.messageFriendHead ? 1231 : 1237)) * 41) + (this.messageChatShare ? 1231 : 1237)) * 41) + (this.messageHelperMessage ? 1231 : 1237)) * 41) + (this.push ? 1231 : 1237)) * 41) + (this.slideCard ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
