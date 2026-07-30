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
    public static ProtobufAdapter<LiveEntranceHide> PROTOBUF_ADAPTER = new C12600a();
    public static JsonAdapter<LiveEntranceHide> JSON_ADAPTER = new ObjectJsonAdapter<LiveEntranceHide>() { // from class: com.p1.mobile.putong.live.base.data.LiveEntranceHide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveEntranceHide.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveEntranceHide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.LiveEntranceHide$a */
    public class C12600a extends MessageNanoAdapter<LiveEntranceHide> {
        public C12600a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(LiveEntranceHide liveEntranceHide) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, liveEntranceHide.bottomLiveTab) + CodedOutputByteBufferNano.m17275b(2, liveEntranceHide.messageListRecommend) + CodedOutputByteBufferNano.m17275b(3, liveEntranceHide.messageFriendHead) + CodedOutputByteBufferNano.m17275b(4, liveEntranceHide.messageChat) + CodedOutputByteBufferNano.m17275b(5, liveEntranceHide.userProfilePhotoWall) + CodedOutputByteBufferNano.m17275b(6, liveEntranceHide.userProfileLiveBanner) + CodedOutputByteBufferNano.m17275b(7, liveEntranceHide.helperMessage) + CodedOutputByteBufferNano.m17275b(8, liveEntranceHide.push) + CodedOutputByteBufferNano.m17275b(9, liveEntranceHide.slideCard);
            liveEntranceHide.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LiveEntranceHide parse(nc5 nc5Var) throws IOException {
            LiveEntranceHide liveEntranceHide = new LiveEntranceHide();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    liveEntranceHide.bottomLiveTab = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    liveEntranceHide.messageListRecommend = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    liveEntranceHide.messageFriendHead = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    liveEntranceHide.messageChat = nc5Var.m162483g();
                } else if (iM162497u == 40) {
                    liveEntranceHide.userProfilePhotoWall = nc5Var.m162483g();
                } else if (iM162497u == 48) {
                    liveEntranceHide.userProfileLiveBanner = nc5Var.m162483g();
                } else if (iM162497u == 56) {
                    liveEntranceHide.helperMessage = nc5Var.m162483g();
                } else if (iM162497u == 64) {
                    liveEntranceHide.push = nc5Var.m162483g();
                } else {
                    if (iM162497u != 72) {
                        return liveEntranceHide;
                    }
                    liveEntranceHide.slideCard = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(LiveEntranceHide liveEntranceHide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, liveEntranceHide.bottomLiveTab);
            codedOutputByteBufferNano.m17299A(2, liveEntranceHide.messageListRecommend);
            codedOutputByteBufferNano.m17299A(3, liveEntranceHide.messageFriendHead);
            codedOutputByteBufferNano.m17299A(4, liveEntranceHide.messageChat);
            codedOutputByteBufferNano.m17299A(5, liveEntranceHide.userProfilePhotoWall);
            codedOutputByteBufferNano.m17299A(6, liveEntranceHide.userProfileLiveBanner);
            codedOutputByteBufferNano.m17299A(7, liveEntranceHide.helperMessage);
            codedOutputByteBufferNano.m17299A(8, liveEntranceHide.push);
            codedOutputByteBufferNano.m17299A(9, liveEntranceHide.slideCard);
        }
    }

    public static LiveEntranceHide new_() {
        LiveEntranceHide liveEntranceHide = new LiveEntranceHide();
        liveEntranceHide.nullCheck();
        return liveEntranceHide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveEntranceHide mo225055clone() {
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
