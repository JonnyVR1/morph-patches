package com.p046p1.mobile.putong.live.base.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class LiveEntranceHide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveentrancehide";

    @ProtobufIndex(index = 1)
    public boolean bottomLiveTab;

    @ProtobufIndex(index = 7)
    public boolean helperMessage;

    @ProtobufIndex(index = 4)
    public boolean messageChat;

    @ProtobufIndex(index = 3)
    public boolean messageFriendHead;

    @ProtobufIndex(index = 2)
    public boolean messageListRecommend;

    @ProtobufIndex(index = 8)
    public boolean push;

    @ProtobufIndex(index = 9)
    public boolean slideCard;

    @ProtobufIndex(index = 6)
    public boolean userProfileLiveBanner;

    @ProtobufIndex(index = 5)
    public boolean userProfilePhotoWall;
    public static ProtobufAdapter<LiveEntranceHide> PROTOBUF_ADAPTER = new C12437a();
    public static JsonAdapter<LiveEntranceHide> JSON_ADAPTER = new ObjectJsonAdapter<LiveEntranceHide>() { // from class: com.p1.mobile.putong.live.base.data.LiveEntranceHide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveEntranceHide.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveEntranceHide newInstance() {
            return new LiveEntranceHide();
        }

        public boolean parseField(LiveEntranceHide liveEntranceHide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bottomLiveTab":
                    liveEntranceHide.bottomLiveTab = jsonParser.getValueAsBoolean();
                    return true;
                case "messageChat":
                    liveEntranceHide.messageChat = jsonParser.getValueAsBoolean();
                    return true;
                case "slideCard":
                    liveEntranceHide.slideCard = jsonParser.getValueAsBoolean();
                    return true;
                case "userProfilePhotoWall":
                    liveEntranceHide.userProfilePhotoWall = jsonParser.getValueAsBoolean();
                    return true;
                case "helperMessage":
                    liveEntranceHide.helperMessage = jsonParser.getValueAsBoolean();
                    return true;
                case "push":
                    liveEntranceHide.push = jsonParser.getValueAsBoolean();
                    return true;
                case "messageListRecommend":
                    liveEntranceHide.messageListRecommend = jsonParser.getValueAsBoolean();
                    return true;
                case "messageFriendHead":
                    liveEntranceHide.messageFriendHead = jsonParser.getValueAsBoolean();
                    return true;
                case "userProfileLiveBanner":
                    liveEntranceHide.userProfileLiveBanner = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveEntranceHide liveEntranceHide, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("bottomLiveTab", liveEntranceHide.bottomLiveTab);
            jsonGenerator.writeBooleanField("messageListRecommend", liveEntranceHide.messageListRecommend);
            jsonGenerator.writeBooleanField("messageFriendHead", liveEntranceHide.messageFriendHead);
            jsonGenerator.writeBooleanField("messageChat", liveEntranceHide.messageChat);
            jsonGenerator.writeBooleanField("userProfilePhotoWall", liveEntranceHide.userProfilePhotoWall);
            jsonGenerator.writeBooleanField("userProfileLiveBanner", liveEntranceHide.userProfileLiveBanner);
            jsonGenerator.writeBooleanField("helperMessage", liveEntranceHide.helperMessage);
            jsonGenerator.writeBooleanField("push", liveEntranceHide.push);
            jsonGenerator.writeBooleanField("slideCard", liveEntranceHide.slideCard);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveEntranceHide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.LiveEntranceHide$a */
    public class C12437a extends MessageNanoAdapter<LiveEntranceHide> {
        public C12437a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(LiveEntranceHide liveEntranceHide) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, liveEntranceHide.bottomLiveTab) + CodedOutputByteBufferNano.m17220b(2, liveEntranceHide.messageListRecommend) + CodedOutputByteBufferNano.m17220b(3, liveEntranceHide.messageFriendHead) + CodedOutputByteBufferNano.m17220b(4, liveEntranceHide.messageChat) + CodedOutputByteBufferNano.m17220b(5, liveEntranceHide.userProfilePhotoWall) + CodedOutputByteBufferNano.m17220b(6, liveEntranceHide.userProfileLiveBanner) + CodedOutputByteBufferNano.m17220b(7, liveEntranceHide.helperMessage) + CodedOutputByteBufferNano.m17220b(8, liveEntranceHide.push) + CodedOutputByteBufferNano.m17220b(9, liveEntranceHide.slideCard);
            liveEntranceHide.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LiveEntranceHide parse(nb5 nb5Var) throws IOException {
            LiveEntranceHide liveEntranceHide = new LiveEntranceHide();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    liveEntranceHide.bottomLiveTab = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    liveEntranceHide.messageListRecommend = nb5Var.m158738g();
                } else if (iM158752u == 24) {
                    liveEntranceHide.messageFriendHead = nb5Var.m158738g();
                } else if (iM158752u == 32) {
                    liveEntranceHide.messageChat = nb5Var.m158738g();
                } else if (iM158752u == 40) {
                    liveEntranceHide.userProfilePhotoWall = nb5Var.m158738g();
                } else if (iM158752u == 48) {
                    liveEntranceHide.userProfileLiveBanner = nb5Var.m158738g();
                } else if (iM158752u == 56) {
                    liveEntranceHide.helperMessage = nb5Var.m158738g();
                } else if (iM158752u == 64) {
                    liveEntranceHide.push = nb5Var.m158738g();
                } else {
                    if (iM158752u != 72) {
                        return liveEntranceHide;
                    }
                    liveEntranceHide.slideCard = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(LiveEntranceHide liveEntranceHide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, liveEntranceHide.bottomLiveTab);
            codedOutputByteBufferNano.m17244A(2, liveEntranceHide.messageListRecommend);
            codedOutputByteBufferNano.m17244A(3, liveEntranceHide.messageFriendHead);
            codedOutputByteBufferNano.m17244A(4, liveEntranceHide.messageChat);
            codedOutputByteBufferNano.m17244A(5, liveEntranceHide.userProfilePhotoWall);
            codedOutputByteBufferNano.m17244A(6, liveEntranceHide.userProfileLiveBanner);
            codedOutputByteBufferNano.m17244A(7, liveEntranceHide.helperMessage);
            codedOutputByteBufferNano.m17244A(8, liveEntranceHide.push);
            codedOutputByteBufferNano.m17244A(9, liveEntranceHide.slideCard);
        }
    }

    public static LiveEntranceHide new_() {
        LiveEntranceHide liveEntranceHide = new LiveEntranceHide();
        liveEntranceHide.nullCheck();
        return liveEntranceHide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveEntranceHide mo223809clone() {
        LiveEntranceHide liveEntranceHide = new LiveEntranceHide();
        liveEntranceHide.bottomLiveTab = this.bottomLiveTab;
        liveEntranceHide.messageListRecommend = this.messageListRecommend;
        liveEntranceHide.messageFriendHead = this.messageFriendHead;
        liveEntranceHide.messageChat = this.messageChat;
        liveEntranceHide.userProfilePhotoWall = this.userProfilePhotoWall;
        liveEntranceHide.userProfileLiveBanner = this.userProfileLiveBanner;
        liveEntranceHide.helperMessage = this.helperMessage;
        liveEntranceHide.push = this.push;
        liveEntranceHide.slideCard = this.slideCard;
        return liveEntranceHide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveEntranceHide)) {
            return false;
        }
        LiveEntranceHide liveEntranceHide = (LiveEntranceHide) obj;
        return this.bottomLiveTab == liveEntranceHide.bottomLiveTab && this.messageListRecommend == liveEntranceHide.messageListRecommend && this.messageFriendHead == liveEntranceHide.messageFriendHead && this.messageChat == liveEntranceHide.messageChat && this.userProfilePhotoWall == liveEntranceHide.userProfilePhotoWall && this.userProfileLiveBanner == liveEntranceHide.userProfileLiveBanner && this.helperMessage == liveEntranceHide.helperMessage && this.push == liveEntranceHide.push && this.slideCard == liveEntranceHide.slideCard;
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
        int i2 = (((((((((((((((((i * 41) + (this.bottomLiveTab ? 1231 : 1237)) * 41) + (this.messageListRecommend ? 1231 : 1237)) * 41) + (this.messageFriendHead ? 1231 : 1237)) * 41) + (this.messageChat ? 1231 : 1237)) * 41) + (this.userProfilePhotoWall ? 1231 : 1237)) * 41) + (this.userProfileLiveBanner ? 1231 : 1237)) * 41) + (this.helperMessage ? 1231 : 1237)) * 41) + (this.push ? 1231 : 1237)) * 41) + (this.slideCard ? 1231 : 1237);
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
