package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class LiveUserCardButtonConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveusercardbuttonconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorJumpUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public LiveUserCardButtonColorConfig backgroundColorConfig;

    @NonNull
    @ProtobufIndex(index = 6)
    public LiveUserCardButtonColorConfig borderColorConfig;

    @NonNull
    @ProtobufIndex(index = 4)
    public LiveUserCardButtonContent contentConfig;

    @NonNull
    @ProtobufIndex(index = 3)
    public LiveAvatarFrameConfig pictureConfig;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userJumpUrl;
    public static ProtobufAdapter<LiveUserCardButtonConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveUserCardButtonConfig>() { // from class: com.p1.mobile.putong.data.LiveUserCardButtonConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveUserCardButtonConfig liveUserCardButtonConfig) {
            String str = liveUserCardButtonConfig.userJumpUrl;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveUserCardButtonConfig.anchorJumpUrl;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            LiveAvatarFrameConfig liveAvatarFrameConfig = liveUserCardButtonConfig.pictureConfig;
            if (liveAvatarFrameConfig != null) {
                iO += CodedOutputByteBufferNano.l(3, liveAvatarFrameConfig, LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
            }
            LiveUserCardButtonContent liveUserCardButtonContent = liveUserCardButtonConfig.contentConfig;
            if (liveUserCardButtonContent != null) {
                iO += CodedOutputByteBufferNano.l(4, liveUserCardButtonContent, LiveUserCardButtonContent.PROTOBUF_ADAPTER);
            }
            LiveUserCardButtonColorConfig liveUserCardButtonColorConfig = liveUserCardButtonConfig.backgroundColorConfig;
            if (liveUserCardButtonColorConfig != null) {
                iO += CodedOutputByteBufferNano.l(5, liveUserCardButtonColorConfig, LiveUserCardButtonColorConfig.PROTOBUF_ADAPTER);
            }
            LiveUserCardButtonColorConfig liveUserCardButtonColorConfig2 = liveUserCardButtonConfig.borderColorConfig;
            if (liveUserCardButtonColorConfig2 != null) {
                iO += CodedOutputByteBufferNano.l(6, liveUserCardButtonColorConfig2, LiveUserCardButtonColorConfig.PROTOBUF_ADAPTER);
            }
            ((MessageNano) liveUserCardButtonConfig).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveUserCardButtonConfig m18397parse(nb5 nb5Var) throws IOException {
            LiveUserCardButtonConfig liveUserCardButtonConfig = new LiveUserCardButtonConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveUserCardButtonConfig.userJumpUrl == null) {
                        liveUserCardButtonConfig.userJumpUrl = "";
                    }
                    if (liveUserCardButtonConfig.anchorJumpUrl == null) {
                        liveUserCardButtonConfig.anchorJumpUrl = "";
                    }
                    if (liveUserCardButtonConfig.pictureConfig == null) {
                        liveUserCardButtonConfig.pictureConfig = LiveAvatarFrameConfig.new_();
                    }
                    if (liveUserCardButtonConfig.contentConfig == null) {
                        liveUserCardButtonConfig.contentConfig = LiveUserCardButtonContent.new_();
                    }
                    if (liveUserCardButtonConfig.backgroundColorConfig == null) {
                        liveUserCardButtonConfig.backgroundColorConfig = LiveUserCardButtonColorConfig.new_();
                    }
                    if (liveUserCardButtonConfig.borderColorConfig != null) {
                        break;
                    }
                    liveUserCardButtonConfig.borderColorConfig = LiveUserCardButtonColorConfig.new_();
                    break;
                }
                if (iU == 10) {
                    liveUserCardButtonConfig.userJumpUrl = nb5Var.s();
                } else if (iU == 18) {
                    liveUserCardButtonConfig.anchorJumpUrl = nb5Var.s();
                } else if (iU == 26) {
                    liveUserCardButtonConfig.pictureConfig = (LiveAvatarFrameConfig) nb5Var.l(LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    liveUserCardButtonConfig.contentConfig = (LiveUserCardButtonContent) nb5Var.l(LiveUserCardButtonContent.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    liveUserCardButtonConfig.backgroundColorConfig = (LiveUserCardButtonColorConfig) nb5Var.l(LiveUserCardButtonColorConfig.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
                        if (liveUserCardButtonConfig.userJumpUrl == null) {
                            liveUserCardButtonConfig.userJumpUrl = "";
                        }
                        if (liveUserCardButtonConfig.anchorJumpUrl == null) {
                            liveUserCardButtonConfig.anchorJumpUrl = "";
                        }
                        if (liveUserCardButtonConfig.pictureConfig == null) {
                            liveUserCardButtonConfig.pictureConfig = LiveAvatarFrameConfig.new_();
                        }
                        if (liveUserCardButtonConfig.contentConfig == null) {
                            liveUserCardButtonConfig.contentConfig = LiveUserCardButtonContent.new_();
                        }
                        if (liveUserCardButtonConfig.backgroundColorConfig == null) {
                            liveUserCardButtonConfig.backgroundColorConfig = LiveUserCardButtonColorConfig.new_();
                        }
                        if (liveUserCardButtonConfig.borderColorConfig != null) {
                            break;
                        }
                        liveUserCardButtonConfig.borderColorConfig = LiveUserCardButtonColorConfig.new_();
                        return liveUserCardButtonConfig;
                    }
                    liveUserCardButtonConfig.borderColorConfig = (LiveUserCardButtonColorConfig) nb5Var.l(LiveUserCardButtonColorConfig.PROTOBUF_ADAPTER);
                }
            }
            return liveUserCardButtonConfig;
        }

        public void serialize(LiveUserCardButtonConfig liveUserCardButtonConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveUserCardButtonConfig.userJumpUrl;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveUserCardButtonConfig.anchorJumpUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            LiveAvatarFrameConfig liveAvatarFrameConfig = liveUserCardButtonConfig.pictureConfig;
            if (liveAvatarFrameConfig != null) {
                codedOutputByteBufferNano.K(3, liveAvatarFrameConfig, LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
            }
            LiveUserCardButtonContent liveUserCardButtonContent = liveUserCardButtonConfig.contentConfig;
            if (liveUserCardButtonContent != null) {
                codedOutputByteBufferNano.K(4, liveUserCardButtonContent, LiveUserCardButtonContent.PROTOBUF_ADAPTER);
            }
            LiveUserCardButtonColorConfig liveUserCardButtonColorConfig = liveUserCardButtonConfig.backgroundColorConfig;
            if (liveUserCardButtonColorConfig != null) {
                codedOutputByteBufferNano.K(5, liveUserCardButtonColorConfig, LiveUserCardButtonColorConfig.PROTOBUF_ADAPTER);
            }
            LiveUserCardButtonColorConfig liveUserCardButtonColorConfig2 = liveUserCardButtonConfig.borderColorConfig;
            if (liveUserCardButtonColorConfig2 != null) {
                codedOutputByteBufferNano.K(6, liveUserCardButtonColorConfig2, LiveUserCardButtonColorConfig.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LiveUserCardButtonConfig> JSON_ADAPTER = new ObjectJsonAdapter<LiveUserCardButtonConfig>() { // from class: com.p1.mobile.putong.data.LiveUserCardButtonConfig.2
        public Class getDataClass() {
            return LiveUserCardButtonConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveUserCardButtonConfig mo17830newInstance() {
            return new LiveUserCardButtonConfig();
        }

        public boolean parseField(LiveUserCardButtonConfig liveUserCardButtonConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userJumpUrl":
                    liveUserCardButtonConfig.userJumpUrl = jsonParser.getValueAsString();
                    return true;
                case "contentConfig":
                    liveUserCardButtonConfig.contentConfig = (LiveUserCardButtonContent) LiveUserCardButtonContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "borderColorConfig":
                    liveUserCardButtonConfig.borderColorConfig = (LiveUserCardButtonColorConfig) LiveUserCardButtonColorConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pictureConfig":
                    liveUserCardButtonConfig.pictureConfig = (LiveAvatarFrameConfig) LiveAvatarFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "anchorJumpUrl":
                    liveUserCardButtonConfig.anchorJumpUrl = jsonParser.getValueAsString();
                    return true;
                case "backgroundColorConfig":
                    liveUserCardButtonConfig.backgroundColorConfig = (LiveUserCardButtonColorConfig) LiveUserCardButtonColorConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveUserCardButtonConfig liveUserCardButtonConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userJumpUrl":
                case "contentConfig":
                case "borderColorConfig":
                case "pictureConfig":
                case "anchorJumpUrl":
                case "backgroundColorConfig":
                    return true;
                default:
                    return super.parseFieldCheck(liveUserCardButtonConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveUserCardButtonConfig liveUserCardButtonConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = liveUserCardButtonConfig.userJumpUrl;
            if (str != null) {
                jsonGenerator.writeStringField("userJumpUrl", str);
            }
            String str2 = liveUserCardButtonConfig.anchorJumpUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorJumpUrl", str2);
            }
            if (liveUserCardButtonConfig.pictureConfig != null) {
                jsonGenerator.writeFieldName("pictureConfig");
                LiveAvatarFrameConfig.JSON_ADAPTER.serialize(liveUserCardButtonConfig.pictureConfig, jsonGenerator, true);
            }
            if (liveUserCardButtonConfig.contentConfig != null) {
                jsonGenerator.writeFieldName("contentConfig");
                LiveUserCardButtonContent.JSON_ADAPTER.serialize(liveUserCardButtonConfig.contentConfig, jsonGenerator, true);
            }
            if (liveUserCardButtonConfig.backgroundColorConfig != null) {
                jsonGenerator.writeFieldName("backgroundColorConfig");
                LiveUserCardButtonColorConfig.JSON_ADAPTER.serialize(liveUserCardButtonConfig.backgroundColorConfig, jsonGenerator, true);
            }
            if (liveUserCardButtonConfig.borderColorConfig != null) {
                jsonGenerator.writeFieldName("borderColorConfig");
                LiveUserCardButtonColorConfig.JSON_ADAPTER.serialize(liveUserCardButtonConfig.borderColorConfig, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveUserCardButtonConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveUserCardButtonConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveUserCardButtonConfig new_() {
        LiveUserCardButtonConfig liveUserCardButtonConfig = new LiveUserCardButtonConfig();
        liveUserCardButtonConfig.nullCheck();
        return liveUserCardButtonConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveUserCardButtonConfig m18396clone() {
        LiveUserCardButtonConfig liveUserCardButtonConfig = new LiveUserCardButtonConfig();
        liveUserCardButtonConfig.userJumpUrl = this.userJumpUrl;
        liveUserCardButtonConfig.anchorJumpUrl = this.anchorJumpUrl;
        LiveAvatarFrameConfig liveAvatarFrameConfig = this.pictureConfig;
        if (liveAvatarFrameConfig != null) {
            liveUserCardButtonConfig.pictureConfig = liveAvatarFrameConfig.m18327clone();
        }
        LiveUserCardButtonContent liveUserCardButtonContent = this.contentConfig;
        if (liveUserCardButtonContent != null) {
            liveUserCardButtonConfig.contentConfig = liveUserCardButtonContent.m18399clone();
        }
        LiveUserCardButtonColorConfig liveUserCardButtonColorConfig = this.backgroundColorConfig;
        if (liveUserCardButtonColorConfig != null) {
            liveUserCardButtonConfig.backgroundColorConfig = liveUserCardButtonColorConfig.m18393clone();
        }
        LiveUserCardButtonColorConfig liveUserCardButtonColorConfig2 = this.borderColorConfig;
        if (liveUserCardButtonColorConfig2 != null) {
            liveUserCardButtonConfig.borderColorConfig = liveUserCardButtonColorConfig2.m18393clone();
        }
        return liveUserCardButtonConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveUserCardButtonConfig)) {
            return false;
        }
        LiveUserCardButtonConfig liveUserCardButtonConfig = (LiveUserCardButtonConfig) obj;
        return ValueObject.util_equals(this.userJumpUrl, liveUserCardButtonConfig.userJumpUrl) && ValueObject.util_equals(this.anchorJumpUrl, liveUserCardButtonConfig.anchorJumpUrl) && ValueObject.util_equals(this.pictureConfig, liveUserCardButtonConfig.pictureConfig) && ValueObject.util_equals(this.contentConfig, liveUserCardButtonConfig.contentConfig) && ValueObject.util_equals(this.backgroundColorConfig, liveUserCardButtonConfig.backgroundColorConfig) && ValueObject.util_equals(this.borderColorConfig, liveUserCardButtonConfig.borderColorConfig);
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
        String str = this.userJumpUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.anchorJumpUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        LiveAvatarFrameConfig liveAvatarFrameConfig = this.pictureConfig;
        int iHashCode3 = (iHashCode2 + (liveAvatarFrameConfig != null ? liveAvatarFrameConfig.hashCode() : 0)) * 41;
        LiveUserCardButtonContent liveUserCardButtonContent = this.contentConfig;
        int iHashCode4 = (iHashCode3 + (liveUserCardButtonContent != null ? liveUserCardButtonContent.hashCode() : 0)) * 41;
        LiveUserCardButtonColorConfig liveUserCardButtonColorConfig = this.backgroundColorConfig;
        int iHashCode5 = (iHashCode4 + (liveUserCardButtonColorConfig != null ? liveUserCardButtonColorConfig.hashCode() : 0)) * 41;
        LiveUserCardButtonColorConfig liveUserCardButtonColorConfig2 = this.borderColorConfig;
        int iHashCode6 = iHashCode5 + (liveUserCardButtonColorConfig2 != null ? liveUserCardButtonColorConfig2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.userJumpUrl == null) {
            this.userJumpUrl = "";
        }
        if (this.anchorJumpUrl == null) {
            this.anchorJumpUrl = "";
        }
        if (this.pictureConfig == null) {
            this.pictureConfig = LiveAvatarFrameConfig.new_();
        }
        if (this.contentConfig == null) {
            this.contentConfig = LiveUserCardButtonContent.new_();
        }
        if (this.backgroundColorConfig == null) {
            this.backgroundColorConfig = LiveUserCardButtonColorConfig.new_();
        }
        if (this.borderColorConfig == null) {
            this.borderColorConfig = LiveUserCardButtonColorConfig.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
