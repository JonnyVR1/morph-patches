package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomInProfile;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceRoomInProfile extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRoomInProfile> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRoomInProfile>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRoomInProfile.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRoomInProfile.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRoomInProfile newInstance() {
            return new BLiveVoiceRoomInProfile();
        }

        public boolean parseField(BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    bLiveVoiceRoomInProfile.subTitle = jsonParser.getValueAsString();
                    return true;
                case "background":
                    bLiveVoiceRoomInProfile.background = jsonParser.getValueAsString();
                    return true;
                case "topicId":
                    bLiveVoiceRoomInProfile.topicId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveVoiceRoomInProfile.anchorId = jsonParser.getValueAsString();
                    return true;
                case "userAvatars":
                    bLiveVoiceRoomInProfile.userAvatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    bLiveVoiceRoomInProfile.status = jsonParser.getValueAsString();
                    return true;
                case "isPersonal":
                    bLiveVoiceRoomInProfile.isPersonal = jsonParser.getValueAsBoolean();
                    return true;
                case "voiceLiveId":
                    bLiveVoiceRoomInProfile.voiceLiveId = jsonParser.getValueAsString();
                    return true;
                case "voiceRoomId":
                    bLiveVoiceRoomInProfile.voiceRoomId = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveVoiceRoomInProfile.title = jsonParser.getValueAsString();
                    return true;
                case "needBuild":
                    bLiveVoiceRoomInProfile.needBuild = jsonParser.getValueAsBoolean();
                    return true;
                case "membersText":
                    bLiveVoiceRoomInProfile.membersText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceRoomInProfile.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveVoiceRoomInProfile.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            jsonGenerator.writeBooleanField("isPersonal", bLiveVoiceRoomInProfile.isPersonal);
            String str3 = bLiveVoiceRoomInProfile.membersText;
            if (str3 != null) {
                jsonGenerator.writeStringField("membersText", str3);
            }
            if (bLiveVoiceRoomInProfile.userAvatars != null) {
                jsonGenerator.writeFieldName("userAvatars");
                JsonAdapter.serializeArray(bLiveVoiceRoomInProfile.userAvatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeBooleanField("needBuild", bLiveVoiceRoomInProfile.needBuild);
            String str4 = bLiveVoiceRoomInProfile.voiceLiveId;
            if (str4 != null) {
                jsonGenerator.writeStringField("voiceLiveId", str4);
            }
            String str5 = bLiveVoiceRoomInProfile.voiceRoomId;
            if (str5 != null) {
                jsonGenerator.writeStringField("voiceRoomId", str5);
            }
            String str6 = bLiveVoiceRoomInProfile.anchorId;
            if (str6 != null) {
                jsonGenerator.writeStringField("anchorId", str6);
            }
            String str7 = bLiveVoiceRoomInProfile.background;
            if (str7 != null) {
                jsonGenerator.writeStringField(OMSResourceType.background, str7);
            }
            String str8 = bLiveVoiceRoomInProfile.topicId;
            if (str8 != null) {
                jsonGenerator.writeStringField("topicId", str8);
            }
            String str9 = bLiveVoiceRoomInProfile.status;
            if (str9 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str9);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRoomInProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceroominprofile";

    @NonNull
    @ProtobufIndex(index = 9)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 10)
    public String background;

    @ProtobufIndex(index = 3)
    public boolean isPersonal;

    @NonNull
    @ProtobufIndex(index = 4)
    public String membersText;

    @ProtobufIndex(index = 6)
    public boolean needBuild;

    @NonNull
    @ProtobufIndex(index = 12)
    public String status;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 11)
    public String topicId;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> userAvatars;

    @NonNull
    @ProtobufIndex(index = 7)
    public String voiceLiveId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String voiceRoomId;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69620a(String str) {
        return str;
    }

    public static BLiveVoiceRoomInProfile new_() {
        BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile = new BLiveVoiceRoomInProfile();
        bLiveVoiceRoomInProfile.nullCheck();
        return bLiveVoiceRoomInProfile;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRoomInProfile mo225055clone() {
        BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile = new BLiveVoiceRoomInProfile();
        bLiveVoiceRoomInProfile.title = this.title;
        bLiveVoiceRoomInProfile.subTitle = this.subTitle;
        bLiveVoiceRoomInProfile.isPersonal = this.isPersonal;
        bLiveVoiceRoomInProfile.membersText = this.membersText;
        List<String> list = this.userAvatars;
        if (list != null) {
            bLiveVoiceRoomInProfile.userAvatars = ValueObject.util_map(list, new qcj() { // from class: l.y92
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveVoiceRoomInProfile.m69620a((String) obj);
                }
            });
        }
        bLiveVoiceRoomInProfile.needBuild = this.needBuild;
        bLiveVoiceRoomInProfile.voiceLiveId = this.voiceLiveId;
        bLiveVoiceRoomInProfile.voiceRoomId = this.voiceRoomId;
        bLiveVoiceRoomInProfile.anchorId = this.anchorId;
        bLiveVoiceRoomInProfile.background = this.background;
        bLiveVoiceRoomInProfile.topicId = this.topicId;
        bLiveVoiceRoomInProfile.status = this.status;
        return bLiveVoiceRoomInProfile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceRoomInProfile)) {
            return false;
        }
        BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile = (BLiveVoiceRoomInProfile) obj;
        return ValueObject.util_equals(this.title, bLiveVoiceRoomInProfile.title) && ValueObject.util_equals(this.subTitle, bLiveVoiceRoomInProfile.subTitle) && this.isPersonal == bLiveVoiceRoomInProfile.isPersonal && ValueObject.util_equals(this.membersText, bLiveVoiceRoomInProfile.membersText) && ValueObject.util_equals(this.userAvatars, bLiveVoiceRoomInProfile.userAvatars) && this.needBuild == bLiveVoiceRoomInProfile.needBuild && ValueObject.util_equals(this.voiceLiveId, bLiveVoiceRoomInProfile.voiceLiveId) && ValueObject.util_equals(this.voiceRoomId, bLiveVoiceRoomInProfile.voiceRoomId) && ValueObject.util_equals(this.anchorId, bLiveVoiceRoomInProfile.anchorId) && ValueObject.util_equals(this.background, bLiveVoiceRoomInProfile.background) && ValueObject.util_equals(this.topicId, bLiveVoiceRoomInProfile.topicId) && ValueObject.util_equals(this.status, bLiveVoiceRoomInProfile.status);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isPersonal ? 1231 : 1237)) * 41;
        String str3 = this.membersText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<String> list = this.userAvatars;
        int iHashCode4 = (((iHashCode3 + (list != null ? list.hashCode() : 0)) * 41) + (this.needBuild ? 1231 : 1237)) * 41;
        String str4 = this.voiceLiveId;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.voiceRoomId;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.anchorId;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.background;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.topicId;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.status;
        int iHashCode10 = iHashCode9 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.membersText == null) {
            this.membersText = "";
        }
        if (this.userAvatars == null) {
            this.userAvatars = new ArrayList();
        }
        if (this.voiceLiveId == null) {
            this.voiceLiveId = "";
        }
        if (this.voiceRoomId == null) {
            this.voiceRoomId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.background == null) {
            this.background = "";
        }
        if (this.topicId == null) {
            this.topicId = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
