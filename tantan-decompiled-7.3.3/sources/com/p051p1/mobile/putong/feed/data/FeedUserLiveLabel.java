package com.p051p1.mobile.putong.feed.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes13.dex */
public class FeedUserLiveLabel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "feeduserlivelabel";

    @NonNull
    @ProtobufIndex(index = 9)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String buttonTitle;

    @NonNull
    @ProtobufIndex(index = 3)
    public String iconTitle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String liveState;

    @NonNull
    @ProtobufIndex(index = 1)
    public String mainTitle;

    @Nullable
    @ProtobufIndex(index = 11)
    public LiveMultiCallInfo multiCallInfo;

    @ProtobufIndex(index = 7)
    public boolean ongoingCall;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 10)
    public String voiceRoomTopicId;
    public static ProtobufAdapter<FeedUserLiveLabel> PROTOBUF_ADAPTER = new MessageNanoAdapter<FeedUserLiveLabel>() { // from class: com.p1.mobile.putong.feed.data.FeedUserLiveLabel.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FeedUserLiveLabel feedUserLiveLabel) {
            String str = feedUserLiveLabel.mainTitle;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = feedUserLiveLabel.subTitle;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = feedUserLiveLabel.iconTitle;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = feedUserLiveLabel.userId;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = feedUserLiveLabel.buttonTitle;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = feedUserLiveLabel.liveId;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(7, feedUserLiveLabel.ongoingCall);
            String str7 = feedUserLiveLabel.liveState;
            if (str7 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(8, str7);
            }
            String str8 = feedUserLiveLabel.anchorId;
            if (str8 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(9, str8);
            }
            String str9 = feedUserLiveLabel.voiceRoomTopicId;
            if (str9 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(10, str9);
            }
            LiveMultiCallInfo liveMultiCallInfo = feedUserLiveLabel.multiCallInfo;
            if (liveMultiCallInfo != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(11, liveMultiCallInfo, LiveMultiCallInfo.PROTOBUF_ADAPTER);
            }
            feedUserLiveLabel.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FeedUserLiveLabel parse(nc5 nc5Var) throws IOException {
            FeedUserLiveLabel feedUserLiveLabel = new FeedUserLiveLabel();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (feedUserLiveLabel.mainTitle == null) {
                            feedUserLiveLabel.mainTitle = "";
                        }
                        if (feedUserLiveLabel.subTitle == null) {
                            feedUserLiveLabel.subTitle = "";
                        }
                        if (feedUserLiveLabel.iconTitle == null) {
                            feedUserLiveLabel.iconTitle = "";
                        }
                        if (feedUserLiveLabel.userId == null) {
                            feedUserLiveLabel.userId = "";
                        }
                        if (feedUserLiveLabel.buttonTitle == null) {
                            feedUserLiveLabel.buttonTitle = "";
                        }
                        if (feedUserLiveLabel.liveId == null) {
                            feedUserLiveLabel.liveId = "";
                        }
                        if (feedUserLiveLabel.liveState == null) {
                            feedUserLiveLabel.liveState = "";
                        }
                        if (feedUserLiveLabel.anchorId == null) {
                            feedUserLiveLabel.anchorId = "";
                        }
                        if (feedUserLiveLabel.voiceRoomTopicId == null) {
                            feedUserLiveLabel.voiceRoomTopicId = "";
                        }
                        break;
                    case 10:
                        feedUserLiveLabel.mainTitle = nc5Var.m162495s();
                        continue;
                    case 18:
                        feedUserLiveLabel.subTitle = nc5Var.m162495s();
                        continue;
                    case 26:
                        feedUserLiveLabel.iconTitle = nc5Var.m162495s();
                        continue;
                    case 34:
                        feedUserLiveLabel.userId = nc5Var.m162495s();
                        continue;
                    case 42:
                        feedUserLiveLabel.buttonTitle = nc5Var.m162495s();
                        continue;
                    case 50:
                        feedUserLiveLabel.liveId = nc5Var.m162495s();
                        continue;
                    case 56:
                        feedUserLiveLabel.ongoingCall = nc5Var.m162483g();
                        continue;
                    case 66:
                        feedUserLiveLabel.liveState = nc5Var.m162495s();
                        continue;
                    case 74:
                        feedUserLiveLabel.anchorId = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        feedUserLiveLabel.voiceRoomTopicId = nc5Var.m162495s();
                        continue;
                    case 90:
                        feedUserLiveLabel.multiCallInfo = (LiveMultiCallInfo) nc5Var.m162488l(LiveMultiCallInfo.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (feedUserLiveLabel.mainTitle == null) {
                            feedUserLiveLabel.mainTitle = "";
                        }
                        if (feedUserLiveLabel.subTitle == null) {
                            feedUserLiveLabel.subTitle = "";
                        }
                        if (feedUserLiveLabel.iconTitle == null) {
                            feedUserLiveLabel.iconTitle = "";
                        }
                        if (feedUserLiveLabel.userId == null) {
                            feedUserLiveLabel.userId = "";
                        }
                        if (feedUserLiveLabel.buttonTitle == null) {
                            feedUserLiveLabel.buttonTitle = "";
                        }
                        if (feedUserLiveLabel.liveId == null) {
                            feedUserLiveLabel.liveId = "";
                        }
                        if (feedUserLiveLabel.liveState == null) {
                            feedUserLiveLabel.liveState = "";
                        }
                        if (feedUserLiveLabel.anchorId == null) {
                            feedUserLiveLabel.anchorId = "";
                        }
                        if (feedUserLiveLabel.voiceRoomTopicId == null) {
                            feedUserLiveLabel.voiceRoomTopicId = "";
                            return feedUserLiveLabel;
                        }
                        break;
                }
            }
            return feedUserLiveLabel;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FeedUserLiveLabel feedUserLiveLabel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = feedUserLiveLabel.mainTitle;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = feedUserLiveLabel.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = feedUserLiveLabel.iconTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = feedUserLiveLabel.userId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = feedUserLiveLabel.buttonTitle;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = feedUserLiveLabel.liveId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            codedOutputByteBufferNano.m17299A(7, feedUserLiveLabel.ongoingCall);
            String str7 = feedUserLiveLabel.liveState;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(8, str7);
            }
            String str8 = feedUserLiveLabel.anchorId;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(9, str8);
            }
            String str9 = feedUserLiveLabel.voiceRoomTopicId;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(10, str9);
            }
            LiveMultiCallInfo liveMultiCallInfo = feedUserLiveLabel.multiCallInfo;
            if (liveMultiCallInfo != null) {
                codedOutputByteBufferNano.m17309K(11, liveMultiCallInfo, LiveMultiCallInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FeedUserLiveLabel> JSON_ADAPTER = new ObjectJsonAdapter<FeedUserLiveLabel>() { // from class: com.p1.mobile.putong.feed.data.FeedUserLiveLabel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FeedUserLiveLabel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FeedUserLiveLabel newInstance() {
            return new FeedUserLiveLabel();
        }

        public boolean parseField(FeedUserLiveLabel feedUserLiveLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    feedUserLiveLabel.subTitle = jsonParser.getValueAsString();
                    return true;
                case "buttonTitle":
                    feedUserLiveLabel.buttonTitle = jsonParser.getValueAsString();
                    return true;
                case "iconTitle":
                    feedUserLiveLabel.iconTitle = jsonParser.getValueAsString();
                    return true;
                case "ongoingCall":
                    feedUserLiveLabel.ongoingCall = jsonParser.getValueAsBoolean();
                    return true;
                case "liveId":
                    feedUserLiveLabel.liveId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    feedUserLiveLabel.anchorId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    feedUserLiveLabel.userId = jsonParser.getValueAsString();
                    return true;
                case "mainTitle":
                    feedUserLiveLabel.mainTitle = jsonParser.getValueAsString();
                    return true;
                case "voiceRoomTopicId":
                    feedUserLiveLabel.voiceRoomTopicId = jsonParser.getValueAsString();
                    return true;
                case "liveState":
                    feedUserLiveLabel.liveState = jsonParser.getValueAsString();
                    return true;
                case "multiCallInfo":
                    feedUserLiveLabel.multiCallInfo = LiveMultiCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FeedUserLiveLabel feedUserLiveLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "buttonTitle":
                case "iconTitle":
                case "ongoingCall":
                case "liveId":
                case "anchorId":
                case "userId":
                case "mainTitle":
                case "voiceRoomTopicId":
                case "liveState":
                case "multiCallInfo":
                    return true;
                default:
                    return super.parseFieldCheck(feedUserLiveLabel, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FeedUserLiveLabel feedUserLiveLabel, JsonGenerator jsonGenerator) throws IOException {
            String str = feedUserLiveLabel.mainTitle;
            if (str != null) {
                jsonGenerator.writeStringField("mainTitle", str);
            }
            String str2 = feedUserLiveLabel.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = feedUserLiveLabel.iconTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("iconTitle", str3);
            }
            String str4 = feedUserLiveLabel.userId;
            if (str4 != null) {
                jsonGenerator.writeStringField("userId", str4);
            }
            String str5 = feedUserLiveLabel.buttonTitle;
            if (str5 != null) {
                jsonGenerator.writeStringField("buttonTitle", str5);
            }
            String str6 = feedUserLiveLabel.liveId;
            if (str6 != null) {
                jsonGenerator.writeStringField("liveId", str6);
            }
            jsonGenerator.writeBooleanField("ongoingCall", feedUserLiveLabel.ongoingCall);
            String str7 = feedUserLiveLabel.liveState;
            if (str7 != null) {
                jsonGenerator.writeStringField("liveState", str7);
            }
            String str8 = feedUserLiveLabel.anchorId;
            if (str8 != null) {
                jsonGenerator.writeStringField("anchorId", str8);
            }
            String str9 = feedUserLiveLabel.voiceRoomTopicId;
            if (str9 != null) {
                jsonGenerator.writeStringField("voiceRoomTopicId", str9);
            }
            if (feedUserLiveLabel.multiCallInfo != null) {
                jsonGenerator.writeFieldName("multiCallInfo");
                LiveMultiCallInfo.JSON_ADAPTER.serialize(feedUserLiveLabel.multiCallInfo, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedUserLiveLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedUserLiveLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FeedUserLiveLabel new_() {
        FeedUserLiveLabel feedUserLiveLabel = new FeedUserLiveLabel();
        feedUserLiveLabel.nullCheck();
        return feedUserLiveLabel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FeedUserLiveLabel mo225055clone() {
        FeedUserLiveLabel feedUserLiveLabel = new FeedUserLiveLabel();
        feedUserLiveLabel.mainTitle = this.mainTitle;
        feedUserLiveLabel.subTitle = this.subTitle;
        feedUserLiveLabel.iconTitle = this.iconTitle;
        feedUserLiveLabel.userId = this.userId;
        feedUserLiveLabel.buttonTitle = this.buttonTitle;
        feedUserLiveLabel.liveId = this.liveId;
        feedUserLiveLabel.ongoingCall = this.ongoingCall;
        feedUserLiveLabel.liveState = this.liveState;
        feedUserLiveLabel.anchorId = this.anchorId;
        feedUserLiveLabel.voiceRoomTopicId = this.voiceRoomTopicId;
        LiveMultiCallInfo liveMultiCallInfo = this.multiCallInfo;
        if (liveMultiCallInfo != null) {
            feedUserLiveLabel.multiCallInfo = liveMultiCallInfo.mo225055clone();
        }
        return feedUserLiveLabel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeedUserLiveLabel)) {
            return false;
        }
        FeedUserLiveLabel feedUserLiveLabel = (FeedUserLiveLabel) obj;
        return ValueObject.util_equals(this.mainTitle, feedUserLiveLabel.mainTitle) && ValueObject.util_equals(this.subTitle, feedUserLiveLabel.subTitle) && ValueObject.util_equals(this.iconTitle, feedUserLiveLabel.iconTitle) && ValueObject.util_equals(this.userId, feedUserLiveLabel.userId) && ValueObject.util_equals(this.buttonTitle, feedUserLiveLabel.buttonTitle) && ValueObject.util_equals(this.liveId, feedUserLiveLabel.liveId) && this.ongoingCall == feedUserLiveLabel.ongoingCall && ValueObject.util_equals(this.liveState, feedUserLiveLabel.liveState) && ValueObject.util_equals(this.anchorId, feedUserLiveLabel.anchorId) && ValueObject.util_equals(this.voiceRoomTopicId, feedUserLiveLabel.voiceRoomTopicId) && ValueObject.util_equals(this.multiCallInfo, feedUserLiveLabel.multiCallInfo);
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
        String str = this.mainTitle;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.iconTitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.buttonTitle;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.liveId;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.ongoingCall ? 1231 : 1237)) * 41;
        String str7 = this.liveState;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.anchorId;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.voiceRoomTopicId;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        LiveMultiCallInfo liveMultiCallInfo = this.multiCallInfo;
        int iHashCode10 = iHashCode9 + (liveMultiCallInfo != null ? liveMultiCallInfo.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    public boolean isLiveOpened() {
        return TextUtils.equals(this.liveState, "online") || TextUtils.equals(this.liveState, "suspended");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.mainTitle == null) {
            this.mainTitle = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.iconTitle == null) {
            this.iconTitle = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.buttonTitle == null) {
            this.buttonTitle = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.liveState == null) {
            this.liveState = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.voiceRoomTopicId == null) {
            this.voiceRoomTopicId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
