package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLivePkPunishMotion;
import com.p046p1.mobile.putong.live.base.data.BLivePkSetting;
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
public class BLivePkSetting extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkSetting> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkSetting>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkSetting.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkSetting.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkSetting newInstance() {
            return new BLivePkSetting();
        }

        public boolean parseField(BLivePkSetting bLivePkSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "quitPkMessages":
                    bLivePkSetting.quitPkMessages = BLiveQuitPkMessages.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "winTimesTag":
                    bLivePkSetting.winTimesTag = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "firstGiftOn":
                    bLivePkSetting.firstGiftOn = jsonParser.getValueAsBoolean();
                    return true;
                case "stopLiveMessages":
                    bLivePkSetting.stopLiveMessages = BLiveQuitPkMessages.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "entranceShowLimit":
                    bLivePkSetting.entranceShowLimit = BLivePkEntranceShowLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pkMotions":
                    bLivePkSetting.pkMotions = JsonAdapter.parseArray(jsonParser, BLivePkPunishMotion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "startShowMessage":
                    bLivePkSetting.startShowMessage = BLivePkStartMessage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "punishMotionSelectIds":
                    bLivePkSetting.punishMotionSelectIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "punishmentMessage":
                    bLivePkSetting.punishmentMessage = jsonParser.getValueAsString();
                    return true;
                case "victoryMotionId":
                    bLivePkSetting.victoryMotionId = jsonParser.getValueAsString();
                    return true;
                case "firstGiftToast":
                    bLivePkSetting.firstGiftToast = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkSetting bLivePkSetting, JsonGenerator jsonGenerator) throws IOException {
            if (bLivePkSetting.entranceShowLimit != null) {
                jsonGenerator.writeFieldName("entranceShowLimit");
                BLivePkEntranceShowLimit.JSON_ADAPTER.serialize(bLivePkSetting.entranceShowLimit, jsonGenerator, true);
            }
            if (bLivePkSetting.pkMotions != null) {
                jsonGenerator.writeFieldName("pkMotions");
                JsonAdapter.serializeArray(bLivePkSetting.pkMotions, jsonGenerator, BLivePkPunishMotion.JSON_ADAPTER);
            }
            if (bLivePkSetting.startShowMessage != null) {
                jsonGenerator.writeFieldName("startShowMessage");
                BLivePkStartMessage.JSON_ADAPTER.serialize(bLivePkSetting.startShowMessage, jsonGenerator, true);
            }
            String str = bLivePkSetting.victoryMotionId;
            if (str != null) {
                jsonGenerator.writeStringField("victoryMotionId", str);
            }
            if (bLivePkSetting.punishMotionSelectIds != null) {
                jsonGenerator.writeFieldName("punishMotionSelectIds");
                JsonAdapter.serializeArray(bLivePkSetting.punishMotionSelectIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLivePkSetting.quitPkMessages != null) {
                jsonGenerator.writeFieldName("quitPkMessages");
                BLiveQuitPkMessages.JSON_ADAPTER.serialize(bLivePkSetting.quitPkMessages, jsonGenerator, true);
            }
            if (bLivePkSetting.stopLiveMessages != null) {
                jsonGenerator.writeFieldName("stopLiveMessages");
                BLiveQuitPkMessages.JSON_ADAPTER.serialize(bLivePkSetting.stopLiveMessages, jsonGenerator, true);
            }
            String str2 = bLivePkSetting.punishmentMessage;
            if (str2 != null) {
                jsonGenerator.writeStringField("punishmentMessage", str2);
            }
            String str3 = bLivePkSetting.firstGiftToast;
            if (str3 != null) {
                jsonGenerator.writeStringField("firstGiftToast", str3);
            }
            jsonGenerator.writeBooleanField("firstGiftOn", bLivePkSetting.firstGiftOn);
            if (bLivePkSetting.winTimesTag != null) {
                jsonGenerator.writeFieldName("winTimesTag");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLivePkSetting.winTimesTag, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepksetting";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLivePkEntranceShowLimit entranceShowLimit;

    @ProtobufIndex(index = 10)
    public boolean firstGiftOn;

    @NonNull
    @ProtobufIndex(index = 9)
    public String firstGiftToast;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLivePkPunishMotion> pkMotions;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> punishMotionSelectIds;

    @NonNull
    @ProtobufIndex(index = 8)
    public String punishmentMessage;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveQuitPkMessages quitPkMessages;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLivePkStartMessage startShowMessage;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveQuitPkMessages stopLiveMessages;

    @NonNull
    @ProtobufIndex(index = 4)
    public String victoryMotionId;

    @NonNull
    @ProtobufIndex(index = 11)
    public BLiveCommonConfig winTimesTag;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68161a(String str) {
        return str;
    }

    public static BLivePkSetting new_() {
        BLivePkSetting bLivePkSetting = new BLivePkSetting();
        bLivePkSetting.nullCheck();
        return bLivePkSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkSetting mo223809clone() {
        BLivePkSetting bLivePkSetting = new BLivePkSetting();
        BLivePkEntranceShowLimit bLivePkEntranceShowLimit = this.entranceShowLimit;
        if (bLivePkEntranceShowLimit != null) {
            bLivePkSetting.entranceShowLimit = bLivePkEntranceShowLimit.mo223809clone();
        }
        List<BLivePkPunishMotion> list = this.pkMotions;
        if (list != null) {
            bLivePkSetting.pkMotions = ValueObject.util_map(list, new w9j() { // from class: l.j42
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLivePkPunishMotion) obj).mo223809clone();
                }
            });
        }
        BLivePkStartMessage bLivePkStartMessage = this.startShowMessage;
        if (bLivePkStartMessage != null) {
            bLivePkSetting.startShowMessage = bLivePkStartMessage.mo223809clone();
        }
        bLivePkSetting.victoryMotionId = this.victoryMotionId;
        List<String> list2 = this.punishMotionSelectIds;
        if (list2 != null) {
            bLivePkSetting.punishMotionSelectIds = ValueObject.util_map(list2, new w9j() { // from class: l.k42
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLivePkSetting.m68161a((String) obj);
                }
            });
        }
        BLiveQuitPkMessages bLiveQuitPkMessages = this.quitPkMessages;
        if (bLiveQuitPkMessages != null) {
            bLivePkSetting.quitPkMessages = bLiveQuitPkMessages.mo223809clone();
        }
        BLiveQuitPkMessages bLiveQuitPkMessages2 = this.stopLiveMessages;
        if (bLiveQuitPkMessages2 != null) {
            bLivePkSetting.stopLiveMessages = bLiveQuitPkMessages2.mo223809clone();
        }
        bLivePkSetting.punishmentMessage = this.punishmentMessage;
        bLivePkSetting.firstGiftToast = this.firstGiftToast;
        bLivePkSetting.firstGiftOn = this.firstGiftOn;
        BLiveCommonConfig bLiveCommonConfig = this.winTimesTag;
        if (bLiveCommonConfig != null) {
            bLivePkSetting.winTimesTag = bLiveCommonConfig.mo223809clone();
        }
        return bLivePkSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkSetting)) {
            return false;
        }
        BLivePkSetting bLivePkSetting = (BLivePkSetting) obj;
        return ValueObject.util_equals(this.entranceShowLimit, bLivePkSetting.entranceShowLimit) && ValueObject.util_equals(this.pkMotions, bLivePkSetting.pkMotions) && ValueObject.util_equals(this.startShowMessage, bLivePkSetting.startShowMessage) && ValueObject.util_equals(this.victoryMotionId, bLivePkSetting.victoryMotionId) && ValueObject.util_equals(this.punishMotionSelectIds, bLivePkSetting.punishMotionSelectIds) && ValueObject.util_equals(this.quitPkMessages, bLivePkSetting.quitPkMessages) && ValueObject.util_equals(this.stopLiveMessages, bLivePkSetting.stopLiveMessages) && ValueObject.util_equals(this.punishmentMessage, bLivePkSetting.punishmentMessage) && ValueObject.util_equals(this.firstGiftToast, bLivePkSetting.firstGiftToast) && this.firstGiftOn == bLivePkSetting.firstGiftOn && ValueObject.util_equals(this.winTimesTag, bLivePkSetting.winTimesTag);
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
        BLivePkEntranceShowLimit bLivePkEntranceShowLimit = this.entranceShowLimit;
        int iHashCode = (i2 + (bLivePkEntranceShowLimit != null ? bLivePkEntranceShowLimit.hashCode() : 0)) * 41;
        List<BLivePkPunishMotion> list = this.pkMotions;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        BLivePkStartMessage bLivePkStartMessage = this.startShowMessage;
        int iHashCode3 = (iHashCode2 + (bLivePkStartMessage != null ? bLivePkStartMessage.hashCode() : 0)) * 41;
        String str = this.victoryMotionId;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list2 = this.punishMotionSelectIds;
        int iHashCode5 = (iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 41;
        BLiveQuitPkMessages bLiveQuitPkMessages = this.quitPkMessages;
        int iHashCode6 = (iHashCode5 + (bLiveQuitPkMessages != null ? bLiveQuitPkMessages.hashCode() : 0)) * 41;
        BLiveQuitPkMessages bLiveQuitPkMessages2 = this.stopLiveMessages;
        int iHashCode7 = (iHashCode6 + (bLiveQuitPkMessages2 != null ? bLiveQuitPkMessages2.hashCode() : 0)) * 41;
        String str2 = this.punishmentMessage;
        int iHashCode8 = (iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.firstGiftToast;
        int iHashCode9 = (((iHashCode8 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.firstGiftOn ? 1231 : 1237)) * 41;
        BLiveCommonConfig bLiveCommonConfig = this.winTimesTag;
        int iHashCode10 = iHashCode9 + (bLiveCommonConfig != null ? bLiveCommonConfig.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.entranceShowLimit == null) {
            this.entranceShowLimit = BLivePkEntranceShowLimit.new_();
        }
        if (this.pkMotions == null) {
            this.pkMotions = new ArrayList();
        }
        if (this.startShowMessage == null) {
            this.startShowMessage = BLivePkStartMessage.new_();
        }
        if (this.victoryMotionId == null) {
            this.victoryMotionId = "";
        }
        if (this.punishMotionSelectIds == null) {
            this.punishMotionSelectIds = new ArrayList();
        }
        if (this.quitPkMessages == null) {
            this.quitPkMessages = BLiveQuitPkMessages.new_();
        }
        if (this.stopLiveMessages == null) {
            this.stopLiveMessages = BLiveQuitPkMessages.new_();
        }
        if (this.punishmentMessage == null) {
            this.punishmentMessage = "";
        }
        if (this.firstGiftToast == null) {
            this.firstGiftToast = "";
        }
        if (this.winTimesTag == null) {
            this.winTimesTag = BLiveCommonConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
