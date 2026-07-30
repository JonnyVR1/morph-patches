package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
import p149l.mqi0;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class LiveAvatarFrameConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveavatarframeconfig";

    @ProtobufIndex(index = 7)
    public int changeVoiceNo;

    @NonNull
    @ProtobufIndex(index = 2)
    public String dynamicUrl;

    @ProtobufIndex(index = 8)
    public long endMill;

    @NonNull
    @ProtobufIndex(index = 9)
    public String funnyUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String mediumDynamicUrl;

    @ProtobufIndex(index = 6)
    public int remainingSec;

    @NonNull
    @ProtobufIndex(index = 3)
    public String smallDynamicUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String staticUrl;

    @ProtobufIndex(index = 5)
    public int totalSec;
    public static ProtobufAdapter<LiveAvatarFrameConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveAvatarFrameConfig>() { // from class: com.p1.mobile.putong.data.LiveAvatarFrameConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveAvatarFrameConfig liveAvatarFrameConfig) {
            String str = liveAvatarFrameConfig.staticUrl;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = liveAvatarFrameConfig.dynamicUrl;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = liveAvatarFrameConfig.smallDynamicUrl;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = liveAvatarFrameConfig.mediumDynamicUrl;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(5, liveAvatarFrameConfig.totalSec) + CodedOutputByteBufferNano.m17226h(6, liveAvatarFrameConfig.remainingSec) + CodedOutputByteBufferNano.m17226h(7, liveAvatarFrameConfig.changeVoiceNo) + CodedOutputByteBufferNano.m17228j(8, liveAvatarFrameConfig.endMill);
            String str5 = liveAvatarFrameConfig.funnyUrl;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(9, str5);
            }
            liveAvatarFrameConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveAvatarFrameConfig parse(nb5 nb5Var) throws IOException {
            LiveAvatarFrameConfig liveAvatarFrameConfig = new LiveAvatarFrameConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveAvatarFrameConfig.staticUrl == null) {
                        liveAvatarFrameConfig.staticUrl = "";
                    }
                    if (liveAvatarFrameConfig.dynamicUrl == null) {
                        liveAvatarFrameConfig.dynamicUrl = "";
                    }
                    if (liveAvatarFrameConfig.smallDynamicUrl == null) {
                        liveAvatarFrameConfig.smallDynamicUrl = "";
                    }
                    if (liveAvatarFrameConfig.mediumDynamicUrl == null) {
                        liveAvatarFrameConfig.mediumDynamicUrl = "";
                    }
                    if (liveAvatarFrameConfig.funnyUrl != null) {
                        break;
                    }
                    liveAvatarFrameConfig.funnyUrl = "";
                    break;
                }
                if (iM158752u == 10) {
                    liveAvatarFrameConfig.staticUrl = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    liveAvatarFrameConfig.dynamicUrl = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    liveAvatarFrameConfig.smallDynamicUrl = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    liveAvatarFrameConfig.mediumDynamicUrl = nb5Var.m158750s();
                } else if (iM158752u == 40) {
                    liveAvatarFrameConfig.totalSec = nb5Var.m158741j();
                } else if (iM158752u == 48) {
                    liveAvatarFrameConfig.remainingSec = nb5Var.m158741j();
                } else if (iM158752u == 56) {
                    liveAvatarFrameConfig.changeVoiceNo = nb5Var.m158741j();
                } else if (iM158752u == 64) {
                    liveAvatarFrameConfig.endMill = nb5Var.m158742k();
                } else {
                    if (iM158752u != 74) {
                        if (liveAvatarFrameConfig.staticUrl == null) {
                            liveAvatarFrameConfig.staticUrl = "";
                        }
                        if (liveAvatarFrameConfig.dynamicUrl == null) {
                            liveAvatarFrameConfig.dynamicUrl = "";
                        }
                        if (liveAvatarFrameConfig.smallDynamicUrl == null) {
                            liveAvatarFrameConfig.smallDynamicUrl = "";
                        }
                        if (liveAvatarFrameConfig.mediumDynamicUrl == null) {
                            liveAvatarFrameConfig.mediumDynamicUrl = "";
                        }
                        if (liveAvatarFrameConfig.funnyUrl != null) {
                            break;
                        }
                        liveAvatarFrameConfig.funnyUrl = "";
                        return liveAvatarFrameConfig;
                    }
                    liveAvatarFrameConfig.funnyUrl = nb5Var.m158750s();
                }
            }
            return liveAvatarFrameConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveAvatarFrameConfig liveAvatarFrameConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveAvatarFrameConfig.staticUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = liveAvatarFrameConfig.dynamicUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = liveAvatarFrameConfig.smallDynamicUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = liveAvatarFrameConfig.mediumDynamicUrl;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            codedOutputByteBufferNano.m17250G(5, liveAvatarFrameConfig.totalSec);
            codedOutputByteBufferNano.m17250G(6, liveAvatarFrameConfig.remainingSec);
            codedOutputByteBufferNano.m17250G(7, liveAvatarFrameConfig.changeVoiceNo);
            codedOutputByteBufferNano.m17252I(8, liveAvatarFrameConfig.endMill);
            String str5 = liveAvatarFrameConfig.funnyUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(9, str5);
            }
        }
    };
    public static JsonAdapter<LiveAvatarFrameConfig> JSON_ADAPTER = new ObjectJsonAdapter<LiveAvatarFrameConfig>() { // from class: com.p1.mobile.putong.data.LiveAvatarFrameConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveAvatarFrameConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveAvatarFrameConfig newInstance() {
            return new LiveAvatarFrameConfig();
        }

        public boolean parseField(LiveAvatarFrameConfig liveAvatarFrameConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "staticUrl":
                    liveAvatarFrameConfig.staticUrl = jsonParser.getValueAsString();
                    return true;
                case "endMill":
                    liveAvatarFrameConfig.endMill = jsonParser.getValueAsLong();
                    return true;
                case "totalSec":
                    liveAvatarFrameConfig.totalSec = jsonParser.getValueAsInt();
                    return true;
                case "mediumDynamicUrl":
                    liveAvatarFrameConfig.mediumDynamicUrl = jsonParser.getValueAsString();
                    return true;
                case "changeVoiceNo":
                    liveAvatarFrameConfig.changeVoiceNo = jsonParser.getValueAsInt();
                    return true;
                case "dynamicUrl":
                    liveAvatarFrameConfig.dynamicUrl = jsonParser.getValueAsString();
                    return true;
                case "funnyUrl":
                    liveAvatarFrameConfig.funnyUrl = jsonParser.getValueAsString();
                    return true;
                case "smallDynamicUrl":
                    liveAvatarFrameConfig.smallDynamicUrl = jsonParser.getValueAsString();
                    return true;
                case "remainingSec":
                    liveAvatarFrameConfig.remainingSec = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveAvatarFrameConfig liveAvatarFrameConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "staticUrl":
                case "endMill":
                case "totalSec":
                case "mediumDynamicUrl":
                case "changeVoiceNo":
                case "dynamicUrl":
                case "funnyUrl":
                case "smallDynamicUrl":
                case "remainingSec":
                    return true;
                default:
                    return super.parseFieldCheck(liveAvatarFrameConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveAvatarFrameConfig liveAvatarFrameConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = liveAvatarFrameConfig.staticUrl;
            if (str != null) {
                jsonGenerator.writeStringField("staticUrl", str);
            }
            String str2 = liveAvatarFrameConfig.dynamicUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("dynamicUrl", str2);
            }
            String str3 = liveAvatarFrameConfig.smallDynamicUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("smallDynamicUrl", str3);
            }
            String str4 = liveAvatarFrameConfig.mediumDynamicUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("mediumDynamicUrl", str4);
            }
            jsonGenerator.writeNumberField("totalSec", liveAvatarFrameConfig.totalSec);
            jsonGenerator.writeNumberField("remainingSec", liveAvatarFrameConfig.remainingSec);
            jsonGenerator.writeNumberField("changeVoiceNo", liveAvatarFrameConfig.changeVoiceNo);
            jsonGenerator.writeNumberField("endMill", liveAvatarFrameConfig.endMill);
            String str5 = liveAvatarFrameConfig.funnyUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("funnyUrl", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveAvatarFrameConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveAvatarFrameConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveAvatarFrameConfig new_() {
        LiveAvatarFrameConfig liveAvatarFrameConfig = new LiveAvatarFrameConfig();
        liveAvatarFrameConfig.nullCheck();
        return liveAvatarFrameConfig;
    }

    public boolean checkNeedChangeVoice() {
        return this.changeVoiceNo > 0 && this.endMill > mqi0.m155944o() && this.totalSec > 0;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveAvatarFrameConfig mo223809clone() {
        LiveAvatarFrameConfig liveAvatarFrameConfig = new LiveAvatarFrameConfig();
        liveAvatarFrameConfig.staticUrl = this.staticUrl;
        liveAvatarFrameConfig.dynamicUrl = this.dynamicUrl;
        liveAvatarFrameConfig.smallDynamicUrl = this.smallDynamicUrl;
        liveAvatarFrameConfig.mediumDynamicUrl = this.mediumDynamicUrl;
        liveAvatarFrameConfig.totalSec = this.totalSec;
        liveAvatarFrameConfig.remainingSec = this.remainingSec;
        liveAvatarFrameConfig.changeVoiceNo = this.changeVoiceNo;
        liveAvatarFrameConfig.endMill = this.endMill;
        liveAvatarFrameConfig.funnyUrl = this.funnyUrl;
        return liveAvatarFrameConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveAvatarFrameConfig)) {
            return false;
        }
        LiveAvatarFrameConfig liveAvatarFrameConfig = (LiveAvatarFrameConfig) obj;
        return ValueObject.util_equals(this.staticUrl, liveAvatarFrameConfig.staticUrl) && ValueObject.util_equals(this.dynamicUrl, liveAvatarFrameConfig.dynamicUrl) && ValueObject.util_equals(this.smallDynamicUrl, liveAvatarFrameConfig.smallDynamicUrl) && ValueObject.util_equals(this.mediumDynamicUrl, liveAvatarFrameConfig.mediumDynamicUrl) && this.totalSec == liveAvatarFrameConfig.totalSec && this.remainingSec == liveAvatarFrameConfig.remainingSec && this.changeVoiceNo == liveAvatarFrameConfig.changeVoiceNo && this.endMill == liveAvatarFrameConfig.endMill && ValueObject.util_equals(this.funnyUrl, liveAvatarFrameConfig.funnyUrl);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public float getCurrentProgress() {
        return (((this.endMill - 1000) - mqi0.m155944o()) / (this.totalSec * 1000.0f)) * 100.0f;
    }

    public long getFixedRemainingSec() {
        return (this.endMill - mqi0.m155944o()) / 1000;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.staticUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.dynamicUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.smallDynamicUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.mediumDynamicUrl;
        int iHashCode4 = (((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.totalSec) * 41) + this.remainingSec) * 41) + this.changeVoiceNo) * 41;
        long j = this.endMill;
        int i3 = (iHashCode4 + ((int) (j ^ (j >>> 32)))) * 41;
        String str5 = this.funnyUrl;
        int iHashCode5 = i3 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.staticUrl == null) {
            this.staticUrl = "";
        }
        if (this.dynamicUrl == null) {
            this.dynamicUrl = "";
        }
        if (this.smallDynamicUrl == null) {
            this.smallDynamicUrl = "";
        }
        if (this.mediumDynamicUrl == null) {
            this.mediumDynamicUrl = "";
        }
        if (this.funnyUrl == null) {
            this.funnyUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
