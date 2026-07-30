package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomLevelRight;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceRoomLevelDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRoomLevelDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRoomLevelDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRoomLevelDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRoomLevelDetail.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRoomLevelDetail newInstance() {
            return new BLiveVoiceRoomLevelDetail();
        }

        public boolean parseField(BLiveVoiceRoomLevelDetail bLiveVoiceRoomLevelDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "levelIcon":
                    bLiveVoiceRoomLevelDetail.levelIcon = jsonParser.getValueAsString();
                    return true;
                case "progressBgColor":
                    bLiveVoiceRoomLevelDetail.progressBgColor = jsonParser.getValueAsString();
                    return true;
                case "nextLevelButton":
                    bLiveVoiceRoomLevelDetail.nextLevelButton = BLiveVoiceRoomNextLevel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "progress":
                    bLiveVoiceRoomLevelDetail.progress = (float) jsonParser.getValueAsDouble();
                    return true;
                case "roomId":
                    bLiveVoiceRoomLevelDetail.roomId = jsonParser.getValueAsString();
                    return true;
                case "levelBgEndColor":
                    bLiveVoiceRoomLevelDetail.levelBgEndColor = jsonParser.getValueAsString();
                    return true;
                case "level":
                    bLiveVoiceRoomLevelDetail.level = jsonParser.getValueAsInt();
                    return true;
                case "nextLevelDesc":
                    bLiveVoiceRoomLevelDetail.nextLevelDesc = jsonParser.getValueAsString();
                    return true;
                case "levelBgStartColor":
                    bLiveVoiceRoomLevelDetail.levelBgStartColor = jsonParser.getValueAsString();
                    return true;
                case "progressColor":
                    bLiveVoiceRoomLevelDetail.progressColor = jsonParser.getValueAsString();
                    return true;
                case "levelRights":
                    bLiveVoiceRoomLevelDetail.levelRights = JsonAdapter.parseArray(jsonParser, BLiveVoiceVirtualRoomLevelRight.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRoomLevelDetail bLiveVoiceRoomLevelDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceRoomLevelDetail.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            String str2 = bLiveVoiceRoomLevelDetail.levelIcon;
            if (str2 != null) {
                jsonGenerator.writeStringField("levelIcon", str2);
            }
            String str3 = bLiveVoiceRoomLevelDetail.levelBgStartColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("levelBgStartColor", str3);
            }
            String str4 = bLiveVoiceRoomLevelDetail.levelBgEndColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("levelBgEndColor", str4);
            }
            jsonGenerator.writeNumberField("progress", bLiveVoiceRoomLevelDetail.progress);
            String str5 = bLiveVoiceRoomLevelDetail.nextLevelDesc;
            if (str5 != null) {
                jsonGenerator.writeStringField("nextLevelDesc", str5);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, bLiveVoiceRoomLevelDetail.level);
            String str6 = bLiveVoiceRoomLevelDetail.progressColor;
            if (str6 != null) {
                jsonGenerator.writeStringField(WBConstants.TRANS_PROGRESS_COLOR, str6);
            }
            String str7 = bLiveVoiceRoomLevelDetail.progressBgColor;
            if (str7 != null) {
                jsonGenerator.writeStringField("progressBgColor", str7);
            }
            if (bLiveVoiceRoomLevelDetail.levelRights != null) {
                jsonGenerator.writeFieldName("levelRights");
                JsonAdapter.serializeArray(bLiveVoiceRoomLevelDetail.levelRights, jsonGenerator, BLiveVoiceVirtualRoomLevelRight.JSON_ADAPTER);
            }
            if (bLiveVoiceRoomLevelDetail.nextLevelButton != null) {
                jsonGenerator.writeFieldName("nextLevelButton");
                BLiveVoiceRoomNextLevel.JSON_ADAPTER.serialize(bLiveVoiceRoomLevelDetail.nextLevelButton, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRoomLevelDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceroomleveldetail";

    @ProtobufIndex(index = 7)
    public int level;

    @NonNull
    @ProtobufIndex(index = 4)
    public String levelBgEndColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public String levelBgStartColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String levelIcon;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<BLiveVoiceVirtualRoomLevelRight> levelRights;

    @Nullable
    @ProtobufIndex(index = 11)
    public BLiveVoiceRoomNextLevel nextLevelButton;

    @NonNull
    @ProtobufIndex(index = 6)
    public String nextLevelDesc;

    @ProtobufIndex(index = 5)
    public float progress;

    @NonNull
    @ProtobufIndex(index = 9)
    public String progressBgColor;

    @NonNull
    @ProtobufIndex(index = 8)
    public String progressColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String roomId;

    public static BLiveVoiceRoomLevelDetail new_() {
        BLiveVoiceRoomLevelDetail bLiveVoiceRoomLevelDetail = new BLiveVoiceRoomLevelDetail();
        bLiveVoiceRoomLevelDetail.nullCheck();
        return bLiveVoiceRoomLevelDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRoomLevelDetail mo223809clone() {
        BLiveVoiceRoomLevelDetail bLiveVoiceRoomLevelDetail = new BLiveVoiceRoomLevelDetail();
        bLiveVoiceRoomLevelDetail.roomId = this.roomId;
        bLiveVoiceRoomLevelDetail.levelIcon = this.levelIcon;
        bLiveVoiceRoomLevelDetail.levelBgStartColor = this.levelBgStartColor;
        bLiveVoiceRoomLevelDetail.levelBgEndColor = this.levelBgEndColor;
        bLiveVoiceRoomLevelDetail.progress = this.progress;
        bLiveVoiceRoomLevelDetail.nextLevelDesc = this.nextLevelDesc;
        bLiveVoiceRoomLevelDetail.level = this.level;
        bLiveVoiceRoomLevelDetail.progressColor = this.progressColor;
        bLiveVoiceRoomLevelDetail.progressBgColor = this.progressBgColor;
        List<BLiveVoiceVirtualRoomLevelRight> list = this.levelRights;
        if (list != null) {
            bLiveVoiceRoomLevelDetail.levelRights = ValueObject.util_map(list, new w9j() { // from class: l.s92
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceVirtualRoomLevelRight) obj).mo223809clone();
                }
            });
        }
        BLiveVoiceRoomNextLevel bLiveVoiceRoomNextLevel = this.nextLevelButton;
        if (bLiveVoiceRoomNextLevel != null) {
            bLiveVoiceRoomLevelDetail.nextLevelButton = bLiveVoiceRoomNextLevel.mo223809clone();
        }
        return bLiveVoiceRoomLevelDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceRoomLevelDetail)) {
            return false;
        }
        BLiveVoiceRoomLevelDetail bLiveVoiceRoomLevelDetail = (BLiveVoiceRoomLevelDetail) obj;
        return ValueObject.util_equals(this.roomId, bLiveVoiceRoomLevelDetail.roomId) && ValueObject.util_equals(this.levelIcon, bLiveVoiceRoomLevelDetail.levelIcon) && ValueObject.util_equals(this.levelBgStartColor, bLiveVoiceRoomLevelDetail.levelBgStartColor) && ValueObject.util_equals(this.levelBgEndColor, bLiveVoiceRoomLevelDetail.levelBgEndColor) && this.progress == bLiveVoiceRoomLevelDetail.progress && ValueObject.util_equals(this.nextLevelDesc, bLiveVoiceRoomLevelDetail.nextLevelDesc) && this.level == bLiveVoiceRoomLevelDetail.level && ValueObject.util_equals(this.progressColor, bLiveVoiceRoomLevelDetail.progressColor) && ValueObject.util_equals(this.progressBgColor, bLiveVoiceRoomLevelDetail.progressBgColor) && ValueObject.util_equals(this.levelRights, bLiveVoiceRoomLevelDetail.levelRights) && ValueObject.util_equals(this.nextLevelButton, bLiveVoiceRoomLevelDetail.nextLevelButton);
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
        String str = this.roomId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.levelIcon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.levelBgStartColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.levelBgEndColor;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + Float.floatToIntBits(this.progress)) * 41;
        String str5 = this.nextLevelDesc;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.level) * 41;
        String str6 = this.progressColor;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.progressBgColor;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        List<BLiveVoiceVirtualRoomLevelRight> list = this.levelRights;
        int iHashCode8 = (iHashCode7 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveVoiceRoomNextLevel bLiveVoiceRoomNextLevel = this.nextLevelButton;
        int iHashCode9 = iHashCode8 + (bLiveVoiceRoomNextLevel != null ? bLiveVoiceRoomNextLevel.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.levelIcon == null) {
            this.levelIcon = "";
        }
        if (this.levelBgStartColor == null) {
            this.levelBgStartColor = "";
        }
        if (this.levelBgEndColor == null) {
            this.levelBgEndColor = "";
        }
        if (this.nextLevelDesc == null) {
            this.nextLevelDesc = "";
        }
        if (this.progressColor == null) {
            this.progressColor = "";
        }
        if (this.progressBgColor == null) {
            this.progressBgColor = "";
        }
        if (this.levelRights == null) {
            this.levelRights = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
