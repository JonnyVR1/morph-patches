package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
public class LiveProfileConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveprofileconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public LiveAvatarFrameConfig backgroundPictureConfig;

    @Nullable
    @ProtobufIndex(index = 3)
    public LiveUserCardButtonConfig buttonConfig;

    @ProtobufIndex(index = 5)
    public int profileVersion;

    @NonNull
    @ProtobufIndex(index = 1)
    public LiveAvatarFrameConfig topFrameConfig;

    @NonNull
    @ProtobufIndex(index = 4)
    public LiveUserCardWholeFrameConfig wholeFrameConfig;
    public static ProtobufAdapter<LiveProfileConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveProfileConfig>() { // from class: com.p1.mobile.putong.data.LiveProfileConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveProfileConfig liveProfileConfig) {
            LiveAvatarFrameConfig liveAvatarFrameConfig = liveProfileConfig.topFrameConfig;
            int iM17230l = liveAvatarFrameConfig != null ? CodedOutputByteBufferNano.m17230l(1, liveAvatarFrameConfig, LiveAvatarFrameConfig.PROTOBUF_ADAPTER) : 0;
            LiveAvatarFrameConfig liveAvatarFrameConfig2 = liveProfileConfig.backgroundPictureConfig;
            if (liveAvatarFrameConfig2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, liveAvatarFrameConfig2, LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
            }
            LiveUserCardButtonConfig liveUserCardButtonConfig = liveProfileConfig.buttonConfig;
            if (liveUserCardButtonConfig != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, liveUserCardButtonConfig, LiveUserCardButtonConfig.PROTOBUF_ADAPTER);
            }
            LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig = liveProfileConfig.wholeFrameConfig;
            if (liveUserCardWholeFrameConfig != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, liveUserCardWholeFrameConfig, LiveUserCardWholeFrameConfig.PROTOBUF_ADAPTER);
            }
            int iM17226h = iM17230l + CodedOutputByteBufferNano.m17226h(5, liveProfileConfig.profileVersion);
            liveProfileConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveProfileConfig parse(nb5 nb5Var) throws IOException {
            LiveProfileConfig liveProfileConfig = new LiveProfileConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveProfileConfig.topFrameConfig == null) {
                        liveProfileConfig.topFrameConfig = LiveAvatarFrameConfig.new_();
                    }
                    if (liveProfileConfig.backgroundPictureConfig == null) {
                        liveProfileConfig.backgroundPictureConfig = LiveAvatarFrameConfig.new_();
                    }
                    if (liveProfileConfig.wholeFrameConfig != null) {
                        break;
                    }
                    liveProfileConfig.wholeFrameConfig = LiveUserCardWholeFrameConfig.new_();
                    break;
                }
                if (iM158752u == 10) {
                    liveProfileConfig.topFrameConfig = (LiveAvatarFrameConfig) nb5Var.m158743l(LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    liveProfileConfig.backgroundPictureConfig = (LiveAvatarFrameConfig) nb5Var.m158743l(LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    liveProfileConfig.buttonConfig = (LiveUserCardButtonConfig) nb5Var.m158743l(LiveUserCardButtonConfig.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    liveProfileConfig.wholeFrameConfig = (LiveUserCardWholeFrameConfig) nb5Var.m158743l(LiveUserCardWholeFrameConfig.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 40) {
                        if (liveProfileConfig.topFrameConfig == null) {
                            liveProfileConfig.topFrameConfig = LiveAvatarFrameConfig.new_();
                        }
                        if (liveProfileConfig.backgroundPictureConfig == null) {
                            liveProfileConfig.backgroundPictureConfig = LiveAvatarFrameConfig.new_();
                        }
                        if (liveProfileConfig.wholeFrameConfig != null) {
                            break;
                        }
                        liveProfileConfig.wholeFrameConfig = LiveUserCardWholeFrameConfig.new_();
                        return liveProfileConfig;
                    }
                    liveProfileConfig.profileVersion = nb5Var.m158741j();
                }
            }
            return liveProfileConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveProfileConfig liveProfileConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LiveAvatarFrameConfig liveAvatarFrameConfig = liveProfileConfig.topFrameConfig;
            if (liveAvatarFrameConfig != null) {
                codedOutputByteBufferNano.m17254K(1, liveAvatarFrameConfig, LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
            }
            LiveAvatarFrameConfig liveAvatarFrameConfig2 = liveProfileConfig.backgroundPictureConfig;
            if (liveAvatarFrameConfig2 != null) {
                codedOutputByteBufferNano.m17254K(2, liveAvatarFrameConfig2, LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
            }
            LiveUserCardButtonConfig liveUserCardButtonConfig = liveProfileConfig.buttonConfig;
            if (liveUserCardButtonConfig != null) {
                codedOutputByteBufferNano.m17254K(3, liveUserCardButtonConfig, LiveUserCardButtonConfig.PROTOBUF_ADAPTER);
            }
            LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig = liveProfileConfig.wholeFrameConfig;
            if (liveUserCardWholeFrameConfig != null) {
                codedOutputByteBufferNano.m17254K(4, liveUserCardWholeFrameConfig, LiveUserCardWholeFrameConfig.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(5, liveProfileConfig.profileVersion);
        }
    };
    public static JsonAdapter<LiveProfileConfig> JSON_ADAPTER = new ObjectJsonAdapter<LiveProfileConfig>() { // from class: com.p1.mobile.putong.data.LiveProfileConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveProfileConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveProfileConfig newInstance() {
            return new LiveProfileConfig();
        }

        public boolean parseField(LiveProfileConfig liveProfileConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "backgroundPictureConfig":
                    liveProfileConfig.backgroundPictureConfig = LiveAvatarFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "profileVersion":
                    liveProfileConfig.profileVersion = jsonParser.getValueAsInt();
                    return true;
                case "buttonConfig":
                    liveProfileConfig.buttonConfig = LiveUserCardButtonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "wholeFrameConfig":
                    liveProfileConfig.wholeFrameConfig = LiveUserCardWholeFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "topFrameConfig":
                    liveProfileConfig.topFrameConfig = LiveAvatarFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveProfileConfig liveProfileConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "backgroundPictureConfig":
                case "profileVersion":
                case "buttonConfig":
                case "wholeFrameConfig":
                case "topFrameConfig":
                    return true;
                default:
                    return super.parseFieldCheck(liveProfileConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveProfileConfig liveProfileConfig, JsonGenerator jsonGenerator) throws IOException {
            if (liveProfileConfig.topFrameConfig != null) {
                jsonGenerator.writeFieldName("topFrameConfig");
                LiveAvatarFrameConfig.JSON_ADAPTER.serialize(liveProfileConfig.topFrameConfig, jsonGenerator, true);
            }
            if (liveProfileConfig.backgroundPictureConfig != null) {
                jsonGenerator.writeFieldName("backgroundPictureConfig");
                LiveAvatarFrameConfig.JSON_ADAPTER.serialize(liveProfileConfig.backgroundPictureConfig, jsonGenerator, true);
            }
            if (liveProfileConfig.buttonConfig != null) {
                jsonGenerator.writeFieldName("buttonConfig");
                LiveUserCardButtonConfig.JSON_ADAPTER.serialize(liveProfileConfig.buttonConfig, jsonGenerator, true);
            }
            if (liveProfileConfig.wholeFrameConfig != null) {
                jsonGenerator.writeFieldName("wholeFrameConfig");
                LiveUserCardWholeFrameConfig.JSON_ADAPTER.serialize(liveProfileConfig.wholeFrameConfig, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("profileVersion", liveProfileConfig.profileVersion);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveProfileConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveProfileConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveProfileConfig new_() {
        LiveProfileConfig liveProfileConfig = new LiveProfileConfig();
        liveProfileConfig.nullCheck();
        return liveProfileConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveProfileConfig mo223809clone() {
        LiveProfileConfig liveProfileConfig = new LiveProfileConfig();
        LiveAvatarFrameConfig liveAvatarFrameConfig = this.topFrameConfig;
        if (liveAvatarFrameConfig != null) {
            liveProfileConfig.topFrameConfig = liveAvatarFrameConfig.mo223809clone();
        }
        LiveAvatarFrameConfig liveAvatarFrameConfig2 = this.backgroundPictureConfig;
        if (liveAvatarFrameConfig2 != null) {
            liveProfileConfig.backgroundPictureConfig = liveAvatarFrameConfig2.mo223809clone();
        }
        LiveUserCardButtonConfig liveUserCardButtonConfig = this.buttonConfig;
        if (liveUserCardButtonConfig != null) {
            liveProfileConfig.buttonConfig = liveUserCardButtonConfig.mo223809clone();
        }
        LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig = this.wholeFrameConfig;
        if (liveUserCardWholeFrameConfig != null) {
            liveProfileConfig.wholeFrameConfig = liveUserCardWholeFrameConfig.mo223809clone();
        }
        liveProfileConfig.profileVersion = this.profileVersion;
        return liveProfileConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveProfileConfig)) {
            return false;
        }
        LiveProfileConfig liveProfileConfig = (LiveProfileConfig) obj;
        return ValueObject.util_equals(this.topFrameConfig, liveProfileConfig.topFrameConfig) && ValueObject.util_equals(this.backgroundPictureConfig, liveProfileConfig.backgroundPictureConfig) && ValueObject.util_equals(this.buttonConfig, liveProfileConfig.buttonConfig) && ValueObject.util_equals(this.wholeFrameConfig, liveProfileConfig.wholeFrameConfig) && this.profileVersion == liveProfileConfig.profileVersion;
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
        LiveAvatarFrameConfig liveAvatarFrameConfig = this.topFrameConfig;
        int iHashCode = (i2 + (liveAvatarFrameConfig != null ? liveAvatarFrameConfig.hashCode() : 0)) * 41;
        LiveAvatarFrameConfig liveAvatarFrameConfig2 = this.backgroundPictureConfig;
        int iHashCode2 = (iHashCode + (liveAvatarFrameConfig2 != null ? liveAvatarFrameConfig2.hashCode() : 0)) * 41;
        LiveUserCardButtonConfig liveUserCardButtonConfig = this.buttonConfig;
        int iHashCode3 = (iHashCode2 + (liveUserCardButtonConfig != null ? liveUserCardButtonConfig.hashCode() : 0)) * 41;
        LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig = this.wholeFrameConfig;
        int iHashCode4 = ((iHashCode3 + (liveUserCardWholeFrameConfig != null ? liveUserCardWholeFrameConfig.hashCode() : 0)) * 41) + this.profileVersion;
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.topFrameConfig == null) {
            this.topFrameConfig = LiveAvatarFrameConfig.new_();
        }
        if (this.backgroundPictureConfig == null) {
            this.backgroundPictureConfig = LiveAvatarFrameConfig.new_();
        }
        if (this.wholeFrameConfig == null) {
            this.wholeFrameConfig = LiveUserCardWholeFrameConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
