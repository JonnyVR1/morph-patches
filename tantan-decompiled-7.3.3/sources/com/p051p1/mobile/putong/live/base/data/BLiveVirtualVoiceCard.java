package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVirtualVoiceCard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVirtualVoiceCard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVirtualVoiceCard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVirtualVoiceCard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVirtualVoiceCard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVirtualVoiceCard newInstance() {
            return new BLiveVirtualVoiceCard();
        }

        public boolean parseField(BLiveVirtualVoiceCard bLiveVirtualVoiceCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchor":
                    bLiveVirtualVoiceCard.anchor = BLiveSuggestLiveAnchor.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveId":
                    bLiveVirtualVoiceCard.liveId = jsonParser.getValueAsString();
                    return true;
                case "businessInfo":
                    bLiveVirtualVoiceCard.businessInfo = BLiveVirtualVoiceBusinessInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "room":
                    bLiveVirtualVoiceCard.room = BLiveSuggestLiveRoom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bLiveVirtualVoiceCard.type = jsonParser.getValueAsString();
                    return true;
                case "user":
                    bLiveVirtualVoiceCard.user = BLiveVirtualVoiceUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "voiceTemplate":
                    bLiveVirtualVoiceCard.voiceTemplate = jsonParser.getValueAsString();
                    return true;
                case "voice":
                    bLiveVirtualVoiceCard.voice = BLiveSuggestLiveRoom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "actionButton":
                    bLiveVirtualVoiceCard.actionButton = BLiveVirtualVoiceActionButton.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVirtualVoiceCard bLiveVirtualVoiceCard, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVirtualVoiceCard.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveVirtualVoiceCard.voiceTemplate;
            if (str2 != null) {
                jsonGenerator.writeStringField("voiceTemplate", str2);
            }
            if (bLiveVirtualVoiceCard.voice != null) {
                jsonGenerator.writeFieldName("voice");
                BLiveSuggestLiveRoom.JSON_ADAPTER.serialize(bLiveVirtualVoiceCard.voice, jsonGenerator, true);
            }
            String str3 = bLiveVirtualVoiceCard.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            if (bLiveVirtualVoiceCard.room != null) {
                jsonGenerator.writeFieldName("room");
                BLiveSuggestLiveRoom.JSON_ADAPTER.serialize(bLiveVirtualVoiceCard.room, jsonGenerator, true);
            }
            if (bLiveVirtualVoiceCard.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                BLiveSuggestLiveAnchor.JSON_ADAPTER.serialize(bLiveVirtualVoiceCard.anchor, jsonGenerator, true);
            }
            if (bLiveVirtualVoiceCard.businessInfo != null) {
                jsonGenerator.writeFieldName("businessInfo");
                BLiveVirtualVoiceBusinessInfo.JSON_ADAPTER.serialize(bLiveVirtualVoiceCard.businessInfo, jsonGenerator, true);
            }
            if (bLiveVirtualVoiceCard.user != null) {
                jsonGenerator.writeFieldName("user");
                BLiveVirtualVoiceUser.JSON_ADAPTER.serialize(bLiveVirtualVoiceCard.user, jsonGenerator, true);
            }
            if (bLiveVirtualVoiceCard.actionButton != null) {
                jsonGenerator.writeFieldName("actionButton");
                BLiveVirtualVoiceActionButton.JSON_ADAPTER.serialize(bLiveVirtualVoiceCard.actionButton, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVirtualVoiceCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevirtualvoicecard";

    @NonNull
    @ProtobufIndex(index = 8)
    public BLiveVirtualVoiceActionButton actionButton;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveSuggestLiveAnchor anchor;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveVirtualVoiceBusinessInfo businessInfo;

    @NonNull
    @ProtobufIndex(index = 3)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveSuggestLiveRoom room;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveVirtualVoiceUser user;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveSuggestLiveRoom voice;

    @NonNull
    @ProtobufIndex(index = 9)
    public String voiceTemplate;

    public static BLiveVirtualVoiceCard new_() {
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard = new BLiveVirtualVoiceCard();
        bLiveVirtualVoiceCard.nullCheck();
        return bLiveVirtualVoiceCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVirtualVoiceCard mo225055clone() {
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard = new BLiveVirtualVoiceCard();
        bLiveVirtualVoiceCard.type = this.type;
        bLiveVirtualVoiceCard.voiceTemplate = this.voiceTemplate;
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom = this.voice;
        if (bLiveSuggestLiveRoom != null) {
            bLiveVirtualVoiceCard.voice = bLiveSuggestLiveRoom.mo225055clone();
        }
        bLiveVirtualVoiceCard.liveId = this.liveId;
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom2 = this.room;
        if (bLiveSuggestLiveRoom2 != null) {
            bLiveVirtualVoiceCard.room = bLiveSuggestLiveRoom2.mo225055clone();
        }
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = this.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            bLiveVirtualVoiceCard.anchor = bLiveSuggestLiveAnchor.mo225055clone();
        }
        BLiveVirtualVoiceBusinessInfo bLiveVirtualVoiceBusinessInfo = this.businessInfo;
        if (bLiveVirtualVoiceBusinessInfo != null) {
            bLiveVirtualVoiceCard.businessInfo = bLiveVirtualVoiceBusinessInfo.mo225055clone();
        }
        BLiveVirtualVoiceUser bLiveVirtualVoiceUser = this.user;
        if (bLiveVirtualVoiceUser != null) {
            bLiveVirtualVoiceCard.user = bLiveVirtualVoiceUser.mo225055clone();
        }
        BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton = this.actionButton;
        if (bLiveVirtualVoiceActionButton != null) {
            bLiveVirtualVoiceCard.actionButton = bLiveVirtualVoiceActionButton.mo225055clone();
        }
        return bLiveVirtualVoiceCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVirtualVoiceCard)) {
            return false;
        }
        BLiveVirtualVoiceCard bLiveVirtualVoiceCard = (BLiveVirtualVoiceCard) obj;
        return ValueObject.util_equals(this.type, bLiveVirtualVoiceCard.type) && ValueObject.util_equals(this.voiceTemplate, bLiveVirtualVoiceCard.voiceTemplate) && ValueObject.util_equals(this.voice, bLiveVirtualVoiceCard.voice) && ValueObject.util_equals(this.liveId, bLiveVirtualVoiceCard.liveId) && ValueObject.util_equals(this.room, bLiveVirtualVoiceCard.room) && ValueObject.util_equals(this.anchor, bLiveVirtualVoiceCard.anchor) && ValueObject.util_equals(this.businessInfo, bLiveVirtualVoiceCard.businessInfo) && ValueObject.util_equals(this.user, bLiveVirtualVoiceCard.user) && ValueObject.util_equals(this.actionButton, bLiveVirtualVoiceCard.actionButton);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.voiceTemplate;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom = this.voice;
        int iHashCode3 = (iHashCode2 + (bLiveSuggestLiveRoom != null ? bLiveSuggestLiveRoom.hashCode() : 0)) * 41;
        String str3 = this.liveId;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom2 = this.room;
        int iHashCode5 = (iHashCode4 + (bLiveSuggestLiveRoom2 != null ? bLiveSuggestLiveRoom2.hashCode() : 0)) * 41;
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = this.anchor;
        int iHashCode6 = (iHashCode5 + (bLiveSuggestLiveAnchor != null ? bLiveSuggestLiveAnchor.hashCode() : 0)) * 41;
        BLiveVirtualVoiceBusinessInfo bLiveVirtualVoiceBusinessInfo = this.businessInfo;
        int iHashCode7 = (iHashCode6 + (bLiveVirtualVoiceBusinessInfo != null ? bLiveVirtualVoiceBusinessInfo.hashCode() : 0)) * 41;
        BLiveVirtualVoiceUser bLiveVirtualVoiceUser = this.user;
        int iHashCode8 = (iHashCode7 + (bLiveVirtualVoiceUser != null ? bLiveVirtualVoiceUser.hashCode() : 0)) * 41;
        BLiveVirtualVoiceActionButton bLiveVirtualVoiceActionButton = this.actionButton;
        int iHashCode9 = iHashCode8 + (bLiveVirtualVoiceActionButton != null ? bLiveVirtualVoiceActionButton.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.voiceTemplate == null) {
            this.voiceTemplate = "";
        }
        if (this.voice == null) {
            this.voice = BLiveSuggestLiveRoom.new_();
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.room == null) {
            this.room = BLiveSuggestLiveRoom.new_();
        }
        if (this.anchor == null) {
            this.anchor = BLiveSuggestLiveAnchor.new_();
        }
        if (this.businessInfo == null) {
            this.businessInfo = BLiveVirtualVoiceBusinessInfo.new_();
        }
        if (this.user == null) {
            this.user = BLiveVirtualVoiceUser.new_();
        }
        if (this.actionButton == null) {
            this.actionButton = BLiveVirtualVoiceActionButton.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
