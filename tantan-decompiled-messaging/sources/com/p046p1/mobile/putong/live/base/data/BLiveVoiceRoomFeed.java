package com.p046p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMemberAvatar;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTag;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceRoomFeed extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRoomFeed> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRoomFeed>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRoomFeed.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRoomFeed newInstance() {
            return new BLiveVoiceRoomFeed();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1102434521:
                    if (str.equals("liveId")) {
                        b = 0;
                    }
                    break;
                case -1077870019:
                    if (str.equals("roomTitle")) {
                        b = 1;
                    }
                    break;
                case -1077695212:
                    if (str.equals("roomTopic")) {
                        b = 2;
                    }
                    break;
                case -971181392:
                    if (str.equals("anchorId")) {
                        b = 3;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 4;
                    }
                    break;
                case -577978033:
                    if (str.equals("roomTopicId")) {
                        b = 5;
                    }
                    break;
                case -315634225:
                    if (str.equals("streamUrl")) {
                        b = 6;
                    }
                    break;
                case -312409271:
                    if (str.equals("liveAttributeTags")) {
                        b = 7;
                    }
                    break;
                case -278052470:
                    if (str.equals("anchorLocation")) {
                        b = 8;
                    }
                    break;
                case -253631266:
                    if (str.equals("extraInfo")) {
                        b = 9;
                    }
                    break;
                case -191918377:
                    if (str.equals("feedTags")) {
                        b = 10;
                    }
                    break;
                case -191895048:
                    if (str.equals("feedType")) {
                        b = 11;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 12;
                    }
                    break;
                case 274882223:
                    if (str.equals("maskMode")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 514733446:
                    if (str.equals("liveTemplate")) {
                        b = 14;
                    }
                    break;
                case 662750480:
                    if (str.equals("intlFrame")) {
                        b = 15;
                    }
                    break;
                case 1108431579:
                    if (str.equals("streamCdnInfo")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1358063253:
                    if (str.equals("memberCount")) {
                        b = 17;
                    }
                    break;
                case 1417675557:
                    if (str.equals("liveTags")) {
                        b = 18;
                    }
                    break;
                case 2130785856:
                    if (str.equals("memberAvatars")) {
                        b = 19;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceRoomFeed.liveId = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveVoiceRoomFeed.roomTitle = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveVoiceRoomFeed.roomTopic = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveVoiceRoomFeed.anchorId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveVoiceRoomFeed.roomId = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveVoiceRoomFeed.roomTopicId = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveVoiceRoomFeed.streamUrl = BLiveStreamUrl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLiveVoiceRoomFeed.liveAttributeTags = BLiveDirectionTags.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveVoiceRoomFeed.anchorLocation = Location.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveVoiceRoomFeed.extraInfo = BLiveVoiceFeedExtraInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLiveVoiceRoomFeed.feedTags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLiveVoiceRoomFeed.feedType = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveVoiceRoomFeed.state = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveVoiceRoomFeed.maskMode = jsonParser.getValueAsBoolean();
                    return true;
                case 14:
                    bLiveVoiceRoomFeed.liveTemplate = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveVoiceRoomFeed.intlFrame = BLiveIntlLiveFrame.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    bLiveVoiceRoomFeed.streamCdnInfo = BLiveStreamCdnInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    bLiveVoiceRoomFeed.memberCount = jsonParser.getValueAsString();
                    return true;
                case 18:
                    bLiveVoiceRoomFeed.liveTags = JsonAdapter.parseArray(jsonParser, BLiveVoiceTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    bLiveVoiceRoomFeed.memberAvatars = JsonAdapter.parseArray(jsonParser, BLiveVoiceMemberAvatar.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceRoomFeed.liveId;
            if (str != null) {
                jsonGenerator.writeStringField("liveId", str);
            }
            String str2 = bLiveVoiceRoomFeed.anchorId;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorId", str2);
            }
            String str3 = bLiveVoiceRoomFeed.roomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("roomId", str3);
            }
            String str4 = bLiveVoiceRoomFeed.roomTopic;
            if (str4 != null) {
                jsonGenerator.writeStringField("roomTopic", str4);
            }
            String str5 = bLiveVoiceRoomFeed.roomTopicId;
            if (str5 != null) {
                jsonGenerator.writeStringField("roomTopicId", str5);
            }
            String str6 = bLiveVoiceRoomFeed.roomTitle;
            if (str6 != null) {
                jsonGenerator.writeStringField("roomTitle", str6);
            }
            String str7 = bLiveVoiceRoomFeed.memberCount;
            if (str7 != null) {
                jsonGenerator.writeStringField("memberCount", str7);
            }
            jsonGenerator.writeBooleanField("maskMode", bLiveVoiceRoomFeed.maskMode);
            if (bLiveVoiceRoomFeed.liveTags != null) {
                jsonGenerator.writeFieldName("liveTags");
                JsonAdapter.serializeArray(bLiveVoiceRoomFeed.liveTags, jsonGenerator, BLiveVoiceTag.JSON_ADAPTER);
            }
            if (bLiveVoiceRoomFeed.memberAvatars != null) {
                jsonGenerator.writeFieldName("memberAvatars");
                JsonAdapter.serializeArray(bLiveVoiceRoomFeed.memberAvatars, jsonGenerator, BLiveVoiceMemberAvatar.JSON_ADAPTER);
            }
            String str8 = bLiveVoiceRoomFeed.liveTemplate;
            if (str8 != null) {
                jsonGenerator.writeStringField("liveTemplate", str8);
            }
            if (bLiveVoiceRoomFeed.feedTags != null) {
                jsonGenerator.writeFieldName("feedTags");
                JsonAdapter.serializeArray(bLiveVoiceRoomFeed.feedTags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str9 = bLiveVoiceRoomFeed.state;
            if (str9 != null) {
                jsonGenerator.writeStringField("state", str9);
            }
            if (bLiveVoiceRoomFeed.liveAttributeTags != null) {
                jsonGenerator.writeFieldName("liveAttributeTags");
                BLiveDirectionTags.JSON_ADAPTER.serialize(bLiveVoiceRoomFeed.liveAttributeTags, jsonGenerator, true);
            }
            if (bLiveVoiceRoomFeed.extraInfo != null) {
                jsonGenerator.writeFieldName("extraInfo");
                BLiveVoiceFeedExtraInfo.JSON_ADAPTER.serialize(bLiveVoiceRoomFeed.extraInfo, jsonGenerator, true);
            }
            String str10 = bLiveVoiceRoomFeed.feedType;
            if (str10 != null) {
                jsonGenerator.writeStringField("feedType", str10);
            }
            if (bLiveVoiceRoomFeed.intlFrame != null) {
                jsonGenerator.writeFieldName("intlFrame");
                BLiveIntlLiveFrame.JSON_ADAPTER.serialize(bLiveVoiceRoomFeed.intlFrame, jsonGenerator, true);
            }
            if (bLiveVoiceRoomFeed.anchorLocation != null) {
                jsonGenerator.writeFieldName("anchorLocation");
                Location.JSON_ADAPTER.serialize(bLiveVoiceRoomFeed.anchorLocation, jsonGenerator, true);
            }
            if (bLiveVoiceRoomFeed.streamCdnInfo != null) {
                jsonGenerator.writeFieldName("streamCdnInfo");
                BLiveStreamCdnInfo.JSON_ADAPTER.serialize(bLiveVoiceRoomFeed.streamCdnInfo, jsonGenerator, true);
            }
            if (bLiveVoiceRoomFeed.streamUrl != null) {
                jsonGenerator.writeFieldName("streamUrl");
                BLiveStreamUrl.JSON_ADAPTER.serialize(bLiveVoiceRoomFeed.streamUrl, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRoomFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceroomfeed";

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 18)
    public Location anchorLocation;

    @NonNull
    @ProtobufIndex(index = 15)
    public BLiveVoiceFeedExtraInfo extraInfo;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<String> feedTags;

    @NonNull
    @ProtobufIndex(index = 16)
    public String feedType;
    public int index;

    @Nullable
    @ProtobufIndex(index = 17)
    public BLiveIntlLiveFrame intlFrame;

    @NonNull
    @ProtobufIndex(index = 14)
    public BLiveDirectionTags liveAttributeTags;

    @NonNull
    @ProtobufIndex(index = 1)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<BLiveVoiceTag> liveTags;

    @NonNull
    @ProtobufIndex(index = 11)
    public String liveTemplate;

    @ProtobufIndex(index = 8)
    public boolean maskMode;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<BLiveVoiceMemberAvatar> memberAvatars;

    @NonNull
    @ProtobufIndex(index = 7)
    public String memberCount;

    @NonNull
    @ProtobufIndex(index = 3)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String roomTitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public String roomTopic;

    @NonNull
    @ProtobufIndex(index = 5)
    public String roomTopicId;

    @NonNull
    @ProtobufIndex(index = 13)
    public String state;

    @NonNull
    @ProtobufIndex(index = 19)
    public BLiveStreamCdnInfo streamCdnInfo;

    @NonNull
    @ProtobufIndex(index = 20)
    public BLiveStreamUrl streamUrl;
    public User user;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m68436c(String str) {
        return str;
    }

    public static BLiveVoiceRoomFeed convertFrom(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        BLiveVoiceRoomFeed bLiveVoiceRoomFeedNew_ = new_();
        bLiveVoiceRoomFeedNew_.liveId = bLiveAbsData.f44323id;
        bLiveVoiceRoomFeedNew_.roomId = bLiveAbsData.room.f44419id;
        bLiveVoiceRoomFeedNew_.anchorId = bLiveAbsData.anchor.f44419id;
        return bLiveVoiceRoomFeedNew_;
    }

    public static BLiveVoiceRoomFeed new_() {
        BLiveVoiceRoomFeed bLiveVoiceRoomFeed = new BLiveVoiceRoomFeed();
        bLiveVoiceRoomFeed.nullCheck();
        return bLiveVoiceRoomFeed;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRoomFeed mo223809clone() {
        BLiveVoiceRoomFeed bLiveVoiceRoomFeed = new BLiveVoiceRoomFeed();
        bLiveVoiceRoomFeed.liveId = this.liveId;
        bLiveVoiceRoomFeed.anchorId = this.anchorId;
        bLiveVoiceRoomFeed.roomId = this.roomId;
        bLiveVoiceRoomFeed.roomTopic = this.roomTopic;
        bLiveVoiceRoomFeed.roomTopicId = this.roomTopicId;
        bLiveVoiceRoomFeed.roomTitle = this.roomTitle;
        bLiveVoiceRoomFeed.memberCount = this.memberCount;
        bLiveVoiceRoomFeed.maskMode = this.maskMode;
        List<BLiveVoiceTag> list = this.liveTags;
        if (list != null) {
            bLiveVoiceRoomFeed.liveTags = ValueObject.util_map(list, new w9j() { // from class: l.o92
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceTag) obj).mo223809clone();
                }
            });
        }
        List<BLiveVoiceMemberAvatar> list2 = this.memberAvatars;
        if (list2 != null) {
            bLiveVoiceRoomFeed.memberAvatars = ValueObject.util_map(list2, new w9j() { // from class: l.p92
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceMemberAvatar) obj).mo223809clone();
                }
            });
        }
        bLiveVoiceRoomFeed.liveTemplate = this.liveTemplate;
        List<String> list3 = this.feedTags;
        if (list3 != null) {
            bLiveVoiceRoomFeed.feedTags = ValueObject.util_map(list3, new w9j() { // from class: l.q92
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveVoiceRoomFeed.m68436c((String) obj);
                }
            });
        }
        bLiveVoiceRoomFeed.state = this.state;
        BLiveDirectionTags bLiveDirectionTags = this.liveAttributeTags;
        if (bLiveDirectionTags != null) {
            bLiveVoiceRoomFeed.liveAttributeTags = bLiveDirectionTags.mo223809clone();
        }
        BLiveVoiceFeedExtraInfo bLiveVoiceFeedExtraInfo = this.extraInfo;
        if (bLiveVoiceFeedExtraInfo != null) {
            bLiveVoiceRoomFeed.extraInfo = bLiveVoiceFeedExtraInfo.mo223809clone();
        }
        bLiveVoiceRoomFeed.feedType = this.feedType;
        BLiveIntlLiveFrame bLiveIntlLiveFrame = this.intlFrame;
        if (bLiveIntlLiveFrame != null) {
            bLiveVoiceRoomFeed.intlFrame = bLiveIntlLiveFrame.mo223809clone();
        }
        Location location = this.anchorLocation;
        if (location != null) {
            bLiveVoiceRoomFeed.anchorLocation = location.mo223809clone();
        }
        BLiveStreamCdnInfo bLiveStreamCdnInfo = this.streamCdnInfo;
        if (bLiveStreamCdnInfo != null) {
            bLiveVoiceRoomFeed.streamCdnInfo = bLiveStreamCdnInfo.mo223809clone();
        }
        BLiveStreamUrl bLiveStreamUrl = this.streamUrl;
        if (bLiveStreamUrl != null) {
            bLiveVoiceRoomFeed.streamUrl = bLiveStreamUrl.mo223809clone();
        }
        return bLiveVoiceRoomFeed;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceRoomFeed)) {
            return false;
        }
        BLiveVoiceRoomFeed bLiveVoiceRoomFeed = (BLiveVoiceRoomFeed) obj;
        return ValueObject.util_equals(this.liveId, bLiveVoiceRoomFeed.liveId) && ValueObject.util_equals(this.anchorId, bLiveVoiceRoomFeed.anchorId) && ValueObject.util_equals(this.roomId, bLiveVoiceRoomFeed.roomId) && ValueObject.util_equals(this.roomTopic, bLiveVoiceRoomFeed.roomTopic) && ValueObject.util_equals(this.roomTopicId, bLiveVoiceRoomFeed.roomTopicId) && ValueObject.util_equals(this.roomTitle, bLiveVoiceRoomFeed.roomTitle) && ValueObject.util_equals(this.memberCount, bLiveVoiceRoomFeed.memberCount) && this.maskMode == bLiveVoiceRoomFeed.maskMode && ValueObject.util_equals(this.liveTags, bLiveVoiceRoomFeed.liveTags) && ValueObject.util_equals(this.memberAvatars, bLiveVoiceRoomFeed.memberAvatars) && ValueObject.util_equals(this.liveTemplate, bLiveVoiceRoomFeed.liveTemplate) && ValueObject.util_equals(this.feedTags, bLiveVoiceRoomFeed.feedTags) && ValueObject.util_equals(this.state, bLiveVoiceRoomFeed.state) && ValueObject.util_equals(this.liveAttributeTags, bLiveVoiceRoomFeed.liveAttributeTags) && ValueObject.util_equals(this.extraInfo, bLiveVoiceRoomFeed.extraInfo) && ValueObject.util_equals(this.feedType, bLiveVoiceRoomFeed.feedType) && ValueObject.util_equals(this.intlFrame, bLiveVoiceRoomFeed.intlFrame) && ValueObject.util_equals(this.anchorLocation, bLiveVoiceRoomFeed.anchorLocation) && ValueObject.util_equals(this.streamCdnInfo, bLiveVoiceRoomFeed.streamCdnInfo) && ValueObject.util_equals(this.streamUrl, bLiveVoiceRoomFeed.streamUrl);
    }

    public BLiveAbsData expendToFullLive() {
        BLiveVoice bLiveVoiceNew_ = BLiveVoice.new_();
        bLiveVoiceNew_.f44323id = this.liveId;
        BLiveOwner bLiveOwnerNew_ = BLiveOwner.new_();
        bLiveVoiceNew_.anchor = bLiveOwnerNew_;
        bLiveOwnerNew_.f44419id = this.anchorId;
        BLiveOwner bLiveOwnerNew_2 = BLiveOwner.new_();
        bLiveVoiceNew_.room = bLiveOwnerNew_2;
        bLiveOwnerNew_2.f44419id = this.roomId;
        return bLiveVoiceNew_;
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
        String str = this.liveId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.anchorId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.roomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.roomTopic;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.roomTopicId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.roomTitle;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.memberCount;
        int iHashCode7 = (((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41) + (this.maskMode ? 1231 : 1237)) * 41;
        List<BLiveVoiceTag> list = this.liveTags;
        int iHashCode8 = (iHashCode7 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveVoiceMemberAvatar> list2 = this.memberAvatars;
        int iHashCode9 = (iHashCode8 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str8 = this.liveTemplate;
        int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 41;
        List<String> list3 = this.feedTags;
        int iHashCode11 = (iHashCode10 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str9 = this.state;
        int iHashCode12 = (iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 41;
        BLiveDirectionTags bLiveDirectionTags = this.liveAttributeTags;
        int iHashCode13 = (iHashCode12 + (bLiveDirectionTags != null ? bLiveDirectionTags.hashCode() : 0)) * 41;
        BLiveVoiceFeedExtraInfo bLiveVoiceFeedExtraInfo = this.extraInfo;
        int iHashCode14 = (iHashCode13 + (bLiveVoiceFeedExtraInfo != null ? bLiveVoiceFeedExtraInfo.hashCode() : 0)) * 41;
        String str10 = this.feedType;
        int iHashCode15 = (iHashCode14 + (str10 != null ? str10.hashCode() : 0)) * 41;
        BLiveIntlLiveFrame bLiveIntlLiveFrame = this.intlFrame;
        int iHashCode16 = (iHashCode15 + (bLiveIntlLiveFrame != null ? bLiveIntlLiveFrame.hashCode() : 0)) * 41;
        Location location = this.anchorLocation;
        int iHashCode17 = (iHashCode16 + (location != null ? location.hashCode() : 0)) * 41;
        BLiveStreamCdnInfo bLiveStreamCdnInfo = this.streamCdnInfo;
        int iHashCode18 = (iHashCode17 + (bLiveStreamCdnInfo != null ? bLiveStreamCdnInfo.hashCode() : 0)) * 41;
        BLiveStreamUrl bLiveStreamUrl = this.streamUrl;
        int iHashCode19 = iHashCode18 + (bLiveStreamUrl != null ? bLiveStreamUrl.hashCode() : 0);
        this.hashCode = iHashCode19;
        return iHashCode19;
    }

    public boolean isCreateRoomType() {
        return TextUtils.equals(this.feedType, "createVoiceLive");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.roomTopic == null) {
            this.roomTopic = "";
        }
        if (this.roomTopicId == null) {
            this.roomTopicId = "";
        }
        if (this.roomTitle == null) {
            this.roomTitle = "";
        }
        if (this.memberCount == null) {
            this.memberCount = "";
        }
        if (this.liveTags == null) {
            this.liveTags = new ArrayList();
        }
        if (this.memberAvatars == null) {
            this.memberAvatars = new ArrayList();
        }
        if (this.liveTemplate == null) {
            this.liveTemplate = "";
        }
        if (this.feedTags == null) {
            this.feedTags = new ArrayList();
        }
        if (this.state == null) {
            this.state = "";
        }
        if (this.liveAttributeTags == null) {
            this.liveAttributeTags = BLiveDirectionTags.new_();
        }
        if (this.extraInfo == null) {
            this.extraInfo = BLiveVoiceFeedExtraInfo.new_();
        }
        if (this.feedType == null) {
            this.feedType = "";
        }
        if (this.anchorLocation == null) {
            this.anchorLocation = Location.new_();
        }
        if (this.streamCdnInfo == null) {
            this.streamCdnInfo = BLiveStreamCdnInfo.new_();
        }
        if (this.streamUrl == null) {
            this.streamUrl = BLiveStreamUrl.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
