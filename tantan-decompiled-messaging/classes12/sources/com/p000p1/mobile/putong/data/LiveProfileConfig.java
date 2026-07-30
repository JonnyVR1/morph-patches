package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveProfileConfig liveProfileConfig) {
            LiveAvatarFrameConfig liveAvatarFrameConfig = liveProfileConfig.topFrameConfig;
            int iL = liveAvatarFrameConfig != null ? CodedOutputByteBufferNano.l(1, liveAvatarFrameConfig, LiveAvatarFrameConfig.PROTOBUF_ADAPTER) : 0;
            LiveAvatarFrameConfig liveAvatarFrameConfig2 = liveProfileConfig.backgroundPictureConfig;
            if (liveAvatarFrameConfig2 != null) {
                iL += CodedOutputByteBufferNano.l(2, liveAvatarFrameConfig2, LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
            }
            LiveUserCardButtonConfig liveUserCardButtonConfig = liveProfileConfig.buttonConfig;
            if (liveUserCardButtonConfig != null) {
                iL += CodedOutputByteBufferNano.l(3, liveUserCardButtonConfig, LiveUserCardButtonConfig.PROTOBUF_ADAPTER);
            }
            LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig = liveProfileConfig.wholeFrameConfig;
            if (liveUserCardWholeFrameConfig != null) {
                iL += CodedOutputByteBufferNano.l(4, liveUserCardWholeFrameConfig, LiveUserCardWholeFrameConfig.PROTOBUF_ADAPTER);
            }
            int iH = iL + CodedOutputByteBufferNano.h(5, liveProfileConfig.profileVersion);
            ((MessageNano) liveProfileConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveProfileConfig m18361parse(nb5 nb5Var) throws IOException {
            LiveProfileConfig liveProfileConfig = new LiveProfileConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    liveProfileConfig.topFrameConfig = (LiveAvatarFrameConfig) nb5Var.l(LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    liveProfileConfig.backgroundPictureConfig = (LiveAvatarFrameConfig) nb5Var.l(LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    liveProfileConfig.buttonConfig = (LiveUserCardButtonConfig) nb5Var.l(LiveUserCardButtonConfig.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    liveProfileConfig.wholeFrameConfig = (LiveUserCardWholeFrameConfig) nb5Var.l(LiveUserCardWholeFrameConfig.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 40) {
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
                    liveProfileConfig.profileVersion = nb5Var.j();
                }
            }
            return liveProfileConfig;
        }

        public void serialize(LiveProfileConfig liveProfileConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LiveAvatarFrameConfig liveAvatarFrameConfig = liveProfileConfig.topFrameConfig;
            if (liveAvatarFrameConfig != null) {
                codedOutputByteBufferNano.K(1, liveAvatarFrameConfig, LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
            }
            LiveAvatarFrameConfig liveAvatarFrameConfig2 = liveProfileConfig.backgroundPictureConfig;
            if (liveAvatarFrameConfig2 != null) {
                codedOutputByteBufferNano.K(2, liveAvatarFrameConfig2, LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
            }
            LiveUserCardButtonConfig liveUserCardButtonConfig = liveProfileConfig.buttonConfig;
            if (liveUserCardButtonConfig != null) {
                codedOutputByteBufferNano.K(3, liveUserCardButtonConfig, LiveUserCardButtonConfig.PROTOBUF_ADAPTER);
            }
            LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig = liveProfileConfig.wholeFrameConfig;
            if (liveUserCardWholeFrameConfig != null) {
                codedOutputByteBufferNano.K(4, liveUserCardWholeFrameConfig, LiveUserCardWholeFrameConfig.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(5, liveProfileConfig.profileVersion);
        }
    };
    public static JsonAdapter<LiveProfileConfig> JSON_ADAPTER = new ObjectJsonAdapter<LiveProfileConfig>() { // from class: com.p1.mobile.putong.data.LiveProfileConfig.2
        public Class getDataClass() {
            return LiveProfileConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveProfileConfig mo17830newInstance() {
            return new LiveProfileConfig();
        }

        public boolean parseField(LiveProfileConfig liveProfileConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "backgroundPictureConfig":
                    liveProfileConfig.backgroundPictureConfig = (LiveAvatarFrameConfig) LiveAvatarFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "profileVersion":
                    liveProfileConfig.profileVersion = jsonParser.getValueAsInt();
                    return true;
                case "buttonConfig":
                    liveProfileConfig.buttonConfig = (LiveUserCardButtonConfig) LiveUserCardButtonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "wholeFrameConfig":
                    liveProfileConfig.wholeFrameConfig = (LiveUserCardWholeFrameConfig) LiveUserCardWholeFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "topFrameConfig":
                    liveProfileConfig.topFrameConfig = (LiveAvatarFrameConfig) LiveAvatarFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveProfileConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveProfileConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveProfileConfig new_() {
        LiveProfileConfig liveProfileConfig = new LiveProfileConfig();
        liveProfileConfig.nullCheck();
        return liveProfileConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveProfileConfig m18360clone() {
        LiveProfileConfig liveProfileConfig = new LiveProfileConfig();
        LiveAvatarFrameConfig liveAvatarFrameConfig = this.topFrameConfig;
        if (liveAvatarFrameConfig != null) {
            liveProfileConfig.topFrameConfig = liveAvatarFrameConfig.m18327clone();
        }
        LiveAvatarFrameConfig liveAvatarFrameConfig2 = this.backgroundPictureConfig;
        if (liveAvatarFrameConfig2 != null) {
            liveProfileConfig.backgroundPictureConfig = liveAvatarFrameConfig2.m18327clone();
        }
        LiveUserCardButtonConfig liveUserCardButtonConfig = this.buttonConfig;
        if (liveUserCardButtonConfig != null) {
            liveProfileConfig.buttonConfig = liveUserCardButtonConfig.m18396clone();
        }
        LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig = this.wholeFrameConfig;
        if (liveUserCardWholeFrameConfig != null) {
            liveProfileConfig.wholeFrameConfig = liveUserCardWholeFrameConfig.m18402clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
