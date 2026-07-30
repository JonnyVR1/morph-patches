package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveComplexUser;
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
public class BLiveComplexCard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveComplexCard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveComplexCard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveComplexCard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveComplexCard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveComplexCard newInstance() {
            return new BLiveComplexCard();
        }

        public boolean parseField(BLiveComplexCard bLiveComplexCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "voiceChat":
                    bLiveComplexCard.voiceChat = BLiveMultiCallExtendUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "voiceFeed":
                    bLiveComplexCard.voiceFeed = BLiveVoiceRoomFeed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "live":
                    bLiveComplexCard.live = BLiveSuggestLive.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bLiveComplexCard.type = jsonParser.getValueAsString();
                    return true;
                case "users":
                    bLiveComplexCard.users = JsonAdapter.parseArray(jsonParser, BLiveComplexUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveComplexCard bLiveComplexCard, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveComplexCard.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (bLiveComplexCard.live != null) {
                jsonGenerator.writeFieldName("live");
                BLiveSuggestLive.JSON_ADAPTER.serialize(bLiveComplexCard.live, jsonGenerator, true);
            }
            if (bLiveComplexCard.voiceFeed != null) {
                jsonGenerator.writeFieldName("voiceFeed");
                BLiveVoiceRoomFeed.JSON_ADAPTER.serialize(bLiveComplexCard.voiceFeed, jsonGenerator, true);
            }
            if (bLiveComplexCard.voiceChat != null) {
                jsonGenerator.writeFieldName(NavigationIntent.voiceChat);
                BLiveMultiCallExtendUser.JSON_ADAPTER.serialize(bLiveComplexCard.voiceChat, jsonGenerator, true);
            }
            if (bLiveComplexCard.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(bLiveComplexCard.users, jsonGenerator, BLiveComplexUser.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveComplexCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecomplexcard";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveSuggestLive live;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<BLiveComplexUser> users;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveMultiCallExtendUser voiceChat;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveVoiceRoomFeed voiceFeed;

    public static BLiveComplexCard new_() {
        BLiveComplexCard bLiveComplexCard = new BLiveComplexCard();
        bLiveComplexCard.nullCheck();
        return bLiveComplexCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveComplexCard mo225055clone() {
        BLiveComplexCard bLiveComplexCard = new BLiveComplexCard();
        bLiveComplexCard.type = this.type;
        BLiveSuggestLive bLiveSuggestLive = this.live;
        if (bLiveSuggestLive != null) {
            bLiveComplexCard.live = bLiveSuggestLive.mo225055clone();
        }
        BLiveVoiceRoomFeed bLiveVoiceRoomFeed = this.voiceFeed;
        if (bLiveVoiceRoomFeed != null) {
            bLiveComplexCard.voiceFeed = bLiveVoiceRoomFeed.mo225055clone();
        }
        BLiveMultiCallExtendUser bLiveMultiCallExtendUser = this.voiceChat;
        if (bLiveMultiCallExtendUser != null) {
            bLiveComplexCard.voiceChat = bLiveMultiCallExtendUser.mo225055clone();
        }
        List<BLiveComplexUser> list = this.users;
        if (list != null) {
            bLiveComplexCard.users = ValueObject.util_map(list, new qcj() { // from class: l.us1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveComplexUser) obj).mo225055clone();
                }
            });
        }
        return bLiveComplexCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveComplexCard)) {
            return false;
        }
        BLiveComplexCard bLiveComplexCard = (BLiveComplexCard) obj;
        return ValueObject.util_equals(this.type, bLiveComplexCard.type) && ValueObject.util_equals(this.live, bLiveComplexCard.live) && ValueObject.util_equals(this.voiceFeed, bLiveComplexCard.voiceFeed) && ValueObject.util_equals(this.voiceChat, bLiveComplexCard.voiceChat) && ValueObject.util_equals(this.users, bLiveComplexCard.users);
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
        BLiveSuggestLive bLiveSuggestLive = this.live;
        int iHashCode2 = (iHashCode + (bLiveSuggestLive != null ? bLiveSuggestLive.hashCode() : 0)) * 41;
        BLiveVoiceRoomFeed bLiveVoiceRoomFeed = this.voiceFeed;
        int iHashCode3 = (iHashCode2 + (bLiveVoiceRoomFeed != null ? bLiveVoiceRoomFeed.hashCode() : 0)) * 41;
        BLiveMultiCallExtendUser bLiveMultiCallExtendUser = this.voiceChat;
        int iHashCode4 = (iHashCode3 + (bLiveMultiCallExtendUser != null ? bLiveMultiCallExtendUser.hashCode() : 0)) * 41;
        List<BLiveComplexUser> list = this.users;
        int iHashCode5 = iHashCode4 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.live == null) {
            this.live = BLiveSuggestLive.new_();
        }
        if (this.voiceFeed == null) {
            this.voiceFeed = BLiveVoiceRoomFeed.new_();
        }
        if (this.voiceChat == null) {
            this.voiceChat = BLiveMultiCallExtendUser.new_();
        }
        if (this.users == null) {
            this.users = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
