package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes13.dex */
public class LiveConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveconfig";

    @ProtobufIndex(index = 6)
    public boolean canSwitchAccount;

    @ProtobufIndex(index = 7)
    public boolean gameEntranceHide;

    @Nullable
    @ProtobufIndex(index = 1)
    public LiveEntranceHide liveEntranceHide;

    @ProtobufIndex(index = 4)
    public boolean settingLiveEntranceHide;

    @ProtobufIndex(index = 5)
    public boolean settingNoticeEntranceHide;

    @Nullable
    @ProtobufIndex(index = 2)
    public VoiceLiveEntranceHide voiceLiveEntranceHide;

    @ProtobufIndex(index = 3)
    public boolean walletLiveEntranceHide;
    public static ProtobufAdapter<LiveConfig> PROTOBUF_ADAPTER = new C12435a();
    public static JsonAdapter<LiveConfig> JSON_ADAPTER = new ObjectJsonAdapter<LiveConfig>() { // from class: com.p1.mobile.putong.live.base.data.LiveConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveConfig newInstance() {
            return new LiveConfig();
        }

        public boolean parseField(LiveConfig liveConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gameEntranceHide":
                    liveConfig.gameEntranceHide = jsonParser.getValueAsBoolean();
                    return true;
                case "canSwitchAccount":
                    liveConfig.canSwitchAccount = jsonParser.getValueAsBoolean();
                    return true;
                case "settingNoticeEntranceHide":
                    liveConfig.settingNoticeEntranceHide = jsonParser.getValueAsBoolean();
                    return true;
                case "liveEntranceHide":
                    liveConfig.liveEntranceHide = LiveEntranceHide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "settingLiveEntranceHide":
                    liveConfig.settingLiveEntranceHide = jsonParser.getValueAsBoolean();
                    return true;
                case "voiceLiveEntranceHide":
                    liveConfig.voiceLiveEntranceHide = VoiceLiveEntranceHide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "walletLiveEntranceHide":
                    liveConfig.walletLiveEntranceHide = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveConfig liveConfig, JsonGenerator jsonGenerator) throws IOException {
            if (liveConfig.liveEntranceHide != null) {
                jsonGenerator.writeFieldName("liveEntranceHide");
                LiveEntranceHide.JSON_ADAPTER.serialize(liveConfig.liveEntranceHide, jsonGenerator, true);
            }
            if (liveConfig.voiceLiveEntranceHide != null) {
                jsonGenerator.writeFieldName("voiceLiveEntranceHide");
                VoiceLiveEntranceHide.JSON_ADAPTER.serialize(liveConfig.voiceLiveEntranceHide, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("walletLiveEntranceHide", liveConfig.walletLiveEntranceHide);
            jsonGenerator.writeBooleanField("settingLiveEntranceHide", liveConfig.settingLiveEntranceHide);
            jsonGenerator.writeBooleanField("settingNoticeEntranceHide", liveConfig.settingNoticeEntranceHide);
            jsonGenerator.writeBooleanField("canSwitchAccount", liveConfig.canSwitchAccount);
            jsonGenerator.writeBooleanField("gameEntranceHide", liveConfig.gameEntranceHide);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.LiveConfig$a */
    public class C12435a extends MessageNanoAdapter<LiveConfig> {
        public C12435a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(LiveConfig liveConfig) {
            LiveEntranceHide liveEntranceHide = liveConfig.liveEntranceHide;
            int iM17230l = liveEntranceHide != null ? CodedOutputByteBufferNano.m17230l(1, liveEntranceHide, LiveEntranceHide.PROTOBUF_ADAPTER) : 0;
            VoiceLiveEntranceHide voiceLiveEntranceHide = liveConfig.voiceLiveEntranceHide;
            if (voiceLiveEntranceHide != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, voiceLiveEntranceHide, VoiceLiveEntranceHide.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17230l + CodedOutputByteBufferNano.m17220b(3, liveConfig.walletLiveEntranceHide) + CodedOutputByteBufferNano.m17220b(4, liveConfig.settingLiveEntranceHide) + CodedOutputByteBufferNano.m17220b(5, liveConfig.settingNoticeEntranceHide) + CodedOutputByteBufferNano.m17220b(6, liveConfig.canSwitchAccount) + CodedOutputByteBufferNano.m17220b(7, liveConfig.gameEntranceHide);
            liveConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LiveConfig parse(nb5 nb5Var) throws IOException {
            LiveConfig liveConfig = new LiveConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    liveConfig.liveEntranceHide = (LiveEntranceHide) nb5Var.m158743l(LiveEntranceHide.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    liveConfig.voiceLiveEntranceHide = (VoiceLiveEntranceHide) nb5Var.m158743l(VoiceLiveEntranceHide.PROTOBUF_ADAPTER);
                } else if (iM158752u == 24) {
                    liveConfig.walletLiveEntranceHide = nb5Var.m158738g();
                } else if (iM158752u == 32) {
                    liveConfig.settingLiveEntranceHide = nb5Var.m158738g();
                } else if (iM158752u == 40) {
                    liveConfig.settingNoticeEntranceHide = nb5Var.m158738g();
                } else if (iM158752u == 48) {
                    liveConfig.canSwitchAccount = nb5Var.m158738g();
                } else {
                    if (iM158752u != 56) {
                        return liveConfig;
                    }
                    liveConfig.gameEntranceHide = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(LiveConfig liveConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LiveEntranceHide liveEntranceHide = liveConfig.liveEntranceHide;
            if (liveEntranceHide != null) {
                codedOutputByteBufferNano.m17254K(1, liveEntranceHide, LiveEntranceHide.PROTOBUF_ADAPTER);
            }
            VoiceLiveEntranceHide voiceLiveEntranceHide = liveConfig.voiceLiveEntranceHide;
            if (voiceLiveEntranceHide != null) {
                codedOutputByteBufferNano.m17254K(2, voiceLiveEntranceHide, VoiceLiveEntranceHide.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(3, liveConfig.walletLiveEntranceHide);
            codedOutputByteBufferNano.m17244A(4, liveConfig.settingLiveEntranceHide);
            codedOutputByteBufferNano.m17244A(5, liveConfig.settingNoticeEntranceHide);
            codedOutputByteBufferNano.m17244A(6, liveConfig.canSwitchAccount);
            codedOutputByteBufferNano.m17244A(7, liveConfig.gameEntranceHide);
        }
    }

    public static LiveConfig new_() {
        LiveConfig liveConfig = new LiveConfig();
        liveConfig.nullCheck();
        return liveConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveConfig mo223809clone() {
        LiveConfig liveConfig = new LiveConfig();
        LiveEntranceHide liveEntranceHide = this.liveEntranceHide;
        if (liveEntranceHide != null) {
            liveConfig.liveEntranceHide = liveEntranceHide.mo223809clone();
        }
        VoiceLiveEntranceHide voiceLiveEntranceHide = this.voiceLiveEntranceHide;
        if (voiceLiveEntranceHide != null) {
            liveConfig.voiceLiveEntranceHide = voiceLiveEntranceHide.mo223809clone();
        }
        liveConfig.walletLiveEntranceHide = this.walletLiveEntranceHide;
        liveConfig.settingLiveEntranceHide = this.settingLiveEntranceHide;
        liveConfig.settingNoticeEntranceHide = this.settingNoticeEntranceHide;
        liveConfig.canSwitchAccount = this.canSwitchAccount;
        liveConfig.gameEntranceHide = this.gameEntranceHide;
        return liveConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveConfig)) {
            return false;
        }
        LiveConfig liveConfig = (LiveConfig) obj;
        return ValueObject.util_equals(this.liveEntranceHide, liveConfig.liveEntranceHide) && ValueObject.util_equals(this.voiceLiveEntranceHide, liveConfig.voiceLiveEntranceHide) && this.walletLiveEntranceHide == liveConfig.walletLiveEntranceHide && this.settingLiveEntranceHide == liveConfig.settingLiveEntranceHide && this.settingNoticeEntranceHide == liveConfig.settingNoticeEntranceHide && this.canSwitchAccount == liveConfig.canSwitchAccount && this.gameEntranceHide == liveConfig.gameEntranceHide;
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
        LiveEntranceHide liveEntranceHide = this.liveEntranceHide;
        int iHashCode = (i2 + (liveEntranceHide != null ? liveEntranceHide.hashCode() : 0)) * 41;
        VoiceLiveEntranceHide voiceLiveEntranceHide = this.voiceLiveEntranceHide;
        int iHashCode2 = ((((((((((iHashCode + (voiceLiveEntranceHide != null ? voiceLiveEntranceHide.hashCode() : 0)) * 41) + (this.walletLiveEntranceHide ? 1231 : 1237)) * 41) + (this.settingLiveEntranceHide ? 1231 : 1237)) * 41) + (this.settingNoticeEntranceHide ? 1231 : 1237)) * 41) + (this.canSwitchAccount ? 1231 : 1237)) * 41) + (this.gameEntranceHide ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
