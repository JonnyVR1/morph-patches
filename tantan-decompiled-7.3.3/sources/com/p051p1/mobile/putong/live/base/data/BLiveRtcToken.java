package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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
public class BLiveRtcToken extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRtcToken> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRtcToken>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRtcToken.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRtcToken.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRtcToken newInstance() {
            return new BLiveRtcToken();
        }

        public boolean parseField(BLiveRtcToken bLiveRtcToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "channelKey":
                    bLiveRtcToken.channelKey = jsonParser.getValueAsString();
                    return true;
                case "canMaintain":
                    bLiveRtcToken.canMaintain = jsonParser.getValueAsBoolean();
                    return true;
                case "userSig":
                    bLiveRtcToken.userSig = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveRtcToken.f45281id = jsonParser.getValueAsString();
                    return false;
                case "appId":
                    bLiveRtcToken.appId = jsonParser.getValueAsString();
                    return true;
                case "rtcProvider":
                    bLiveRtcToken.rtcProvider = jsonParser.getValueAsString();
                    return true;
                case "channel":
                    bLiveRtcToken.channel = jsonParser.getValueAsString();
                    return true;
                case "reverbAppKey":
                    bLiveRtcToken.reverbAppKey = jsonParser.getValueAsString();
                    return true;
                case "reverbToken":
                    bLiveRtcToken.reverbToken = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRtcToken bLiveRtcToken, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveRtcToken.f45281id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveRtcToken.appId;
            if (str2 != null) {
                jsonGenerator.writeStringField(RemoteConfigConstants.RequestFieldKey.APP_ID, str2);
            }
            String str3 = bLiveRtcToken.channel;
            if (str3 != null) {
                jsonGenerator.writeStringField("channel", str3);
            }
            String str4 = bLiveRtcToken.channelKey;
            if (str4 != null) {
                jsonGenerator.writeStringField("channelKey", str4);
            }
            String str5 = bLiveRtcToken.rtcProvider;
            if (str5 != null) {
                jsonGenerator.writeStringField("rtcProvider", str5);
            }
            String str6 = bLiveRtcToken.userSig;
            if (str6 != null) {
                jsonGenerator.writeStringField("userSig", str6);
            }
            jsonGenerator.writeBooleanField("canMaintain", bLiveRtcToken.canMaintain);
            String str7 = bLiveRtcToken.reverbAppKey;
            if (str7 != null) {
                jsonGenerator.writeStringField("reverbAppKey", str7);
            }
            String str8 = bLiveRtcToken.reverbToken;
            if (str8 != null) {
                jsonGenerator.writeStringField("reverbToken", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRtcToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivertctoken";

    @NonNull
    @ProtobufIndex(index = 2)
    public String appId;
    public int bitrate;

    @ProtobufIndex(index = 7)
    public boolean canMaintain;

    @NonNull
    @ProtobufIndex(index = 3)
    public String channel;

    @NonNull
    @ProtobufIndex(index = 4)
    public String channelKey;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45281id;

    @NonNull
    @ProtobufIndex(index = 8)
    public String reverbAppKey;

    @NonNull
    @ProtobufIndex(index = 9)
    public String reverbToken;

    @NonNull
    @ProtobufIndex(index = 5)
    public String rtcProvider;

    @NonNull
    @ProtobufIndex(index = 6)
    public String userSig;

    public static BLiveRtcToken new_() {
        BLiveRtcToken bLiveRtcToken = new BLiveRtcToken();
        bLiveRtcToken.nullCheck();
        return bLiveRtcToken;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRtcToken mo225055clone() {
        BLiveRtcToken bLiveRtcToken = new BLiveRtcToken();
        bLiveRtcToken.f45281id = this.f45281id;
        bLiveRtcToken.appId = this.appId;
        bLiveRtcToken.channel = this.channel;
        bLiveRtcToken.channelKey = this.channelKey;
        bLiveRtcToken.rtcProvider = this.rtcProvider;
        bLiveRtcToken.userSig = this.userSig;
        bLiveRtcToken.canMaintain = this.canMaintain;
        bLiveRtcToken.reverbAppKey = this.reverbAppKey;
        bLiveRtcToken.reverbToken = this.reverbToken;
        return bLiveRtcToken;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRtcToken)) {
            return false;
        }
        BLiveRtcToken bLiveRtcToken = (BLiveRtcToken) obj;
        return ValueObject.util_equals(this.f45281id, bLiveRtcToken.f45281id) && ValueObject.util_equals(this.appId, bLiveRtcToken.appId) && ValueObject.util_equals(this.channel, bLiveRtcToken.channel) && ValueObject.util_equals(this.channelKey, bLiveRtcToken.channelKey) && ValueObject.util_equals(this.rtcProvider, bLiveRtcToken.rtcProvider) && ValueObject.util_equals(this.userSig, bLiveRtcToken.userSig) && this.canMaintain == bLiveRtcToken.canMaintain && ValueObject.util_equals(this.reverbAppKey, bLiveRtcToken.reverbAppKey) && ValueObject.util_equals(this.reverbToken, bLiveRtcToken.reverbToken);
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
        String str = this.f45281id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.appId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.channel;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.channelKey;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.rtcProvider;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.userSig;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.canMaintain ? 1231 : 1237)) * 41;
        String str7 = this.reverbAppKey;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.reverbToken;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45281id == null) {
            this.f45281id = "";
        }
        if (this.appId == null) {
            this.appId = "";
        }
        if (this.channel == null) {
            this.channel = "";
        }
        if (this.channelKey == null) {
            this.channelKey = "";
        }
        if (this.rtcProvider == null) {
            this.rtcProvider = "";
        }
        if (this.userSig == null) {
            this.userSig = "";
        }
        if (this.reverbAppKey == null) {
            this.reverbAppKey = "";
        }
        if (this.reverbToken == null) {
            this.reverbToken = "";
        }
    }

    public BLiveRtcToken setBitrate(int i) {
        this.bitrate = i;
        return this;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
