package com.p046p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTopic;
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
public class BLiveVoiceRoom extends BLiveAbsRoom implements Cloneable, Serializable {
    public static final BLiveVoiceRoom EMPTY_ROOM = new_();
    public static JsonAdapter<BLiveVoiceRoom> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRoom>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRoom.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRoom.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRoom newInstance() {
            return new BLiveVoiceRoom();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceRoom bLiveVoiceRoom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1893613215:
                    if (str.equals("backgroundUrl")) {
                        b = 0;
                    }
                    break;
                case -1624287023:
                    if (str.equals("primaryLiveMode")) {
                        b = 1;
                    }
                    break;
                case -1538855190:
                    if (str.equals("freeCall")) {
                        b = 2;
                    }
                    break;
                case -1328156777:
                    if (str.equals("backGroundPicId")) {
                        b = 3;
                    }
                    break;
                case -1229361253:
                    if (str.equals("useLastTitle")) {
                        b = 4;
                    }
                    break;
                case -957313271:
                    if (str.equals("topicIds")) {
                        b = 5;
                    }
                    break;
                case -868034268:
                    if (str.equals("topics")) {
                        b = 6;
                    }
                    break;
                case -830077985:
                    if (str.equals("bgPicType")) {
                        b = 7;
                    }
                    break;
                case -350106230:
                    if (str.equals("isPersonal")) {
                        b = 8;
                    }
                    break;
                case -175110025:
                    if (str.equals("callPlaceResource")) {
                        b = 9;
                    }
                    break;
                case -173302091:
                    if (str.equals("roomType")) {
                        b = 10;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 11;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 12;
                    }
                    break;
                case 94852023:
                    if (str.equals("cover")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 14;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        b = 15;
                    }
                    break;
                case 156781895:
                    if (str.equals(VirtualVoiceMotionType.announcement)) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 274882223:
                    if (str.equals("maskMode")) {
                        b = 17;
                    }
                    break;
                case 853619891:
                    if (str.equals("classId")) {
                        b = 18;
                    }
                    break;
                case 1358063253:
                    if (str.equals("memberCount")) {
                        b = 19;
                    }
                    break;
                case 1646683592:
                    if (str.equals("bgThumbnailUrl")) {
                        b = 20;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceRoom.backgroundUrl = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveVoiceRoom.primaryLiveMode = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveVoiceRoom.freeCall = jsonParser.getValueAsBoolean();
                    return true;
                case 3:
                    bLiveVoiceRoom.backGroundPicId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveVoiceRoom.useLastTitle = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    bLiveVoiceRoom.topicIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveVoiceRoom.topics = JsonAdapter.parseArray(jsonParser, BLiveVoiceTopic.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLiveVoiceRoom.bgPicType = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveVoiceRoom.isPersonal = jsonParser.getValueAsBoolean();
                    return true;
                case 9:
                    bLiveVoiceRoom.callPlaceResource = BLiveVoiceRoomCallPlaceResource.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLiveVoiceRoom.roomType = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveVoiceRoom.f44324id = jsonParser.getValueAsString();
                    return false;
                case 12:
                    bLiveVoiceRoom.type = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveVoiceRoom.cover = BLiveRoomCover.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    bLiveVoiceRoom.owner = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    bLiveVoiceRoom.title = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveVoiceRoom.announcement = jsonParser.getValueAsString();
                    return true;
                case 17:
                    bLiveVoiceRoom.maskMode = jsonParser.getValueAsBoolean();
                    return true;
                case 18:
                    bLiveVoiceRoom.classId = jsonParser.getValueAsString();
                    return true;
                case 19:
                    bLiveVoiceRoom.memberCount = jsonParser.getValueAsDouble();
                    return true;
                case 20:
                    bLiveVoiceRoom.bgThumbnailUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRoom bLiveVoiceRoom, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceRoom.f44324id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveVoiceRoom.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                BLiveOwner.JSON_ADAPTER.serialize(bLiveVoiceRoom.owner, jsonGenerator, true);
            }
            String str2 = bLiveVoiceRoom.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            if (bLiveVoiceRoom.cover != null) {
                jsonGenerator.writeFieldName("cover");
                BLiveRoomCover.JSON_ADAPTER.serialize(bLiveVoiceRoom.cover, jsonGenerator, true);
            }
            String str3 = bLiveVoiceRoom.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            if (bLiveVoiceRoom.topics != null) {
                jsonGenerator.writeFieldName("topics");
                JsonAdapter.serializeArray(bLiveVoiceRoom.topics, jsonGenerator, BLiveVoiceTopic.JSON_ADAPTER);
            }
            if (bLiveVoiceRoom.topicIds != null) {
                jsonGenerator.writeFieldName("topicIds");
                JsonAdapter.serializeArray(bLiveVoiceRoom.topicIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str4 = bLiveVoiceRoom.roomType;
            if (str4 != null) {
                jsonGenerator.writeStringField("roomType", str4);
            }
            jsonGenerator.writeBooleanField("freeCall", bLiveVoiceRoom.freeCall);
            jsonGenerator.writeNumberField("memberCount", bLiveVoiceRoom.memberCount);
            jsonGenerator.writeBooleanField("maskMode", bLiveVoiceRoom.maskMode);
            String str5 = bLiveVoiceRoom.backgroundUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("backgroundUrl", str5);
            }
            String str6 = bLiveVoiceRoom.announcement;
            if (str6 != null) {
                jsonGenerator.writeStringField(VirtualVoiceMotionType.announcement, str6);
            }
            jsonGenerator.writeBooleanField("useLastTitle", bLiveVoiceRoom.useLastTitle);
            String str7 = bLiveVoiceRoom.bgPicType;
            if (str7 != null) {
                jsonGenerator.writeStringField("bgPicType", str7);
            }
            String str8 = bLiveVoiceRoom.backGroundPicId;
            if (str8 != null) {
                jsonGenerator.writeStringField("backGroundPicId", str8);
            }
            String str9 = bLiveVoiceRoom.bgThumbnailUrl;
            if (str9 != null) {
                jsonGenerator.writeStringField("bgThumbnailUrl", str9);
            }
            String str10 = bLiveVoiceRoom.classId;
            if (str10 != null) {
                jsonGenerator.writeStringField("classId", str10);
            }
            jsonGenerator.writeBooleanField("isPersonal", bLiveVoiceRoom.isPersonal);
            String str11 = bLiveVoiceRoom.primaryLiveMode;
            if (str11 != null) {
                jsonGenerator.writeStringField("primaryLiveMode", str11);
            }
            if (bLiveVoiceRoom.callPlaceResource != null) {
                jsonGenerator.writeFieldName("callPlaceResource");
                BLiveVoiceRoomCallPlaceResource.JSON_ADAPTER.serialize(bLiveVoiceRoom.callPlaceResource, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRoom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceroom";

    @NonNull
    @ProtobufIndex(index = 58)
    public String announcement;

    @NonNull
    @ProtobufIndex(index = 61)
    public String backGroundPicId;

    @NonNull
    @ProtobufIndex(index = 57)
    public String backgroundUrl;

    @NonNull
    @ProtobufIndex(index = 60)
    public String bgPicType;

    @NonNull
    @ProtobufIndex(index = 62)
    public String bgThumbnailUrl;

    @Nullable
    @ProtobufIndex(index = 66)
    public BLiveVoiceRoomCallPlaceResource callPlaceResource;

    @NonNull
    @ProtobufIndex(index = 63)
    public String classId;
    public String fields = "";

    @ProtobufIndex(index = 54)
    public boolean freeCall;

    @ProtobufIndex(index = 64)
    public boolean isPersonal;

    @ProtobufIndex(index = 56)
    public boolean maskMode;

    @ProtobufIndex(index = 55)
    public double memberCount;

    @NonNull
    @ProtobufIndex(index = 65)
    public String primaryLiveMode;

    @NonNull
    @ProtobufIndex(index = 53)
    public String roomType;

    @NonNull
    @ProtobufIndex(index = 52)
    public List<String> topicIds;

    @NonNull
    @ProtobufIndex(index = 51)
    public List<BLiveVoiceTopic> topics;

    @ProtobufIndex(index = 59)
    public boolean useLastTitle;
    public BLiveVoiceRoomTagInfo voiceRoomTagInfo;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m68429b(String str) {
        return str;
    }

    public static BLiveVoiceRoom new_() {
        BLiveVoiceRoom bLiveVoiceRoom = new BLiveVoiceRoom();
        bLiveVoiceRoom.nullCheck();
        return bLiveVoiceRoom;
    }

    public void addField(String str) {
        if (TextUtils.isEmpty(this.fields) || this.fields.endsWith(Constants.SEPARATOR_COMMA)) {
            this.fields += str;
            return;
        }
        this.fields += Constants.SEPARATOR_COMMA + str;
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom, com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRoom mo223809clone() {
        BLiveVoiceRoom bLiveVoiceRoom = new BLiveVoiceRoom();
        bLiveVoiceRoom.f44324id = this.f44324id;
        BLiveOwner bLiveOwner = this.owner;
        if (bLiveOwner != null) {
            bLiveVoiceRoom.owner = bLiveOwner.mo223809clone();
        }
        bLiveVoiceRoom.title = this.title;
        BLiveRoomCover bLiveRoomCover = this.cover;
        if (bLiveRoomCover != null) {
            bLiveVoiceRoom.cover = bLiveRoomCover.mo223809clone();
        }
        bLiveVoiceRoom.type = this.type;
        List<BLiveVoiceTopic> list = this.topics;
        if (list != null) {
            bLiveVoiceRoom.topics = ValueObject.util_map(list, new w9j() { // from class: l.i92
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceTopic) obj).mo223809clone();
                }
            });
        }
        List<String> list2 = this.topicIds;
        if (list2 != null) {
            bLiveVoiceRoom.topicIds = ValueObject.util_map(list2, new w9j() { // from class: l.j92
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveVoiceRoom.m68429b((String) obj);
                }
            });
        }
        bLiveVoiceRoom.roomType = this.roomType;
        bLiveVoiceRoom.freeCall = this.freeCall;
        bLiveVoiceRoom.memberCount = this.memberCount;
        bLiveVoiceRoom.maskMode = this.maskMode;
        bLiveVoiceRoom.backgroundUrl = this.backgroundUrl;
        bLiveVoiceRoom.announcement = this.announcement;
        bLiveVoiceRoom.useLastTitle = this.useLastTitle;
        bLiveVoiceRoom.bgPicType = this.bgPicType;
        bLiveVoiceRoom.backGroundPicId = this.backGroundPicId;
        bLiveVoiceRoom.bgThumbnailUrl = this.bgThumbnailUrl;
        bLiveVoiceRoom.classId = this.classId;
        bLiveVoiceRoom.isPersonal = this.isPersonal;
        bLiveVoiceRoom.primaryLiveMode = this.primaryLiveMode;
        BLiveVoiceRoomCallPlaceResource bLiveVoiceRoomCallPlaceResource = this.callPlaceResource;
        if (bLiveVoiceRoomCallPlaceResource != null) {
            bLiveVoiceRoom.callPlaceResource = bLiveVoiceRoomCallPlaceResource.mo223809clone();
        }
        return bLiveVoiceRoom;
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceRoom)) {
            return false;
        }
        BLiveVoiceRoom bLiveVoiceRoom = (BLiveVoiceRoom) obj;
        return super.equals(obj) && ValueObject.util_equals(this.topics, bLiveVoiceRoom.topics) && ValueObject.util_equals(this.topicIds, bLiveVoiceRoom.topicIds) && ValueObject.util_equals(this.roomType, bLiveVoiceRoom.roomType) && this.freeCall == bLiveVoiceRoom.freeCall && this.memberCount == bLiveVoiceRoom.memberCount && this.maskMode == bLiveVoiceRoom.maskMode && ValueObject.util_equals(this.backgroundUrl, bLiveVoiceRoom.backgroundUrl) && ValueObject.util_equals(this.announcement, bLiveVoiceRoom.announcement) && this.useLastTitle == bLiveVoiceRoom.useLastTitle && ValueObject.util_equals(this.bgPicType, bLiveVoiceRoom.bgPicType) && ValueObject.util_equals(this.backGroundPicId, bLiveVoiceRoom.backGroundPicId) && ValueObject.util_equals(this.bgThumbnailUrl, bLiveVoiceRoom.bgThumbnailUrl) && ValueObject.util_equals(this.classId, bLiveVoiceRoom.classId) && this.isPersonal == bLiveVoiceRoom.isPersonal && ValueObject.util_equals(this.primaryLiveMode, bLiveVoiceRoom.primaryLiveMode) && ValueObject.util_equals(this.callPlaceResource, bLiveVoiceRoom.callPlaceResource);
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom, com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        List<BLiveVoiceTopic> list = this.topics;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.topicIds;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str = this.roomType;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 41;
        int i2 = this.freeCall ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.memberCount);
        int i3 = (((((iHashCode4 + i2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.maskMode ? 1231 : 1237)) * 41;
        String str2 = this.backgroundUrl;
        int iHashCode5 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.announcement;
        int iHashCode6 = (((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.useLastTitle ? 1231 : 1237)) * 41;
        String str4 = this.bgPicType;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.backGroundPicId;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.bgThumbnailUrl;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.classId;
        int iHashCode10 = (((iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 41) + (this.isPersonal ? 1231 : 1237)) * 41;
        String str8 = this.primaryLiveMode;
        int iHashCode11 = (iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 41;
        BLiveVoiceRoomCallPlaceResource bLiveVoiceRoomCallPlaceResource = this.callPlaceResource;
        int iHashCode12 = iHashCode11 + (bLiveVoiceRoomCallPlaceResource != null ? bLiveVoiceRoomCallPlaceResource.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    public boolean isMaskMode() {
        return this.maskMode;
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom, com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.topics == null) {
            this.topics = new ArrayList();
        }
        if (this.topicIds == null) {
            this.topicIds = new ArrayList();
        }
        if (this.roomType == null) {
            this.roomType = "";
        }
        if (this.backgroundUrl == null) {
            this.backgroundUrl = "";
        }
        if (this.announcement == null) {
            this.announcement = "";
        }
        if (this.bgPicType == null) {
            this.bgPicType = "";
        }
        if (this.backGroundPicId == null) {
            this.backGroundPicId = "";
        }
        if (this.bgThumbnailUrl == null) {
            this.bgThumbnailUrl = "";
        }
        if (this.classId == null) {
            this.classId = "";
        }
        if (this.primaryLiveMode == null) {
            this.primaryLiveMode = "";
        }
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom, com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
