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
import l.mqi0;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveAvatarFrameConfig liveAvatarFrameConfig) {
            String str = liveAvatarFrameConfig.staticUrl;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveAvatarFrameConfig.dynamicUrl;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = liveAvatarFrameConfig.smallDynamicUrl;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = liveAvatarFrameConfig.mediumDynamicUrl;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iH = iO + CodedOutputByteBufferNano.h(5, liveAvatarFrameConfig.totalSec) + CodedOutputByteBufferNano.h(6, liveAvatarFrameConfig.remainingSec) + CodedOutputByteBufferNano.h(7, liveAvatarFrameConfig.changeVoiceNo) + CodedOutputByteBufferNano.j(8, liveAvatarFrameConfig.endMill);
            String str5 = liveAvatarFrameConfig.funnyUrl;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(9, str5);
            }
            ((MessageNano) liveAvatarFrameConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveAvatarFrameConfig m18328parse(nb5 nb5Var) throws IOException {
            LiveAvatarFrameConfig liveAvatarFrameConfig = new LiveAvatarFrameConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    liveAvatarFrameConfig.staticUrl = nb5Var.s();
                } else if (iU == 18) {
                    liveAvatarFrameConfig.dynamicUrl = nb5Var.s();
                } else if (iU == 26) {
                    liveAvatarFrameConfig.smallDynamicUrl = nb5Var.s();
                } else if (iU == 34) {
                    liveAvatarFrameConfig.mediumDynamicUrl = nb5Var.s();
                } else if (iU == 40) {
                    liveAvatarFrameConfig.totalSec = nb5Var.j();
                } else if (iU == 48) {
                    liveAvatarFrameConfig.remainingSec = nb5Var.j();
                } else if (iU == 56) {
                    liveAvatarFrameConfig.changeVoiceNo = nb5Var.j();
                } else if (iU == 64) {
                    liveAvatarFrameConfig.endMill = nb5Var.k();
                } else {
                    if (iU != 74) {
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
                    liveAvatarFrameConfig.funnyUrl = nb5Var.s();
                }
            }
            return liveAvatarFrameConfig;
        }

        public void serialize(LiveAvatarFrameConfig liveAvatarFrameConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveAvatarFrameConfig.staticUrl;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveAvatarFrameConfig.dynamicUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = liveAvatarFrameConfig.smallDynamicUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = liveAvatarFrameConfig.mediumDynamicUrl;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.G(5, liveAvatarFrameConfig.totalSec);
            codedOutputByteBufferNano.G(6, liveAvatarFrameConfig.remainingSec);
            codedOutputByteBufferNano.G(7, liveAvatarFrameConfig.changeVoiceNo);
            codedOutputByteBufferNano.I(8, liveAvatarFrameConfig.endMill);
            String str5 = liveAvatarFrameConfig.funnyUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.R(9, str5);
            }
        }
    };
    public static JsonAdapter<LiveAvatarFrameConfig> JSON_ADAPTER = new ObjectJsonAdapter<LiveAvatarFrameConfig>() { // from class: com.p1.mobile.putong.data.LiveAvatarFrameConfig.2
        public Class getDataClass() {
            return LiveAvatarFrameConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveAvatarFrameConfig mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveAvatarFrameConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
        return this.changeVoiceNo > 0 && this.endMill > mqi0.o() && this.totalSec > 0;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveAvatarFrameConfig m18327clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public float getCurrentProgress() {
        return (((this.endMill - 1000) - mqi0.o()) / (this.totalSec * 1000.0f)) * 100.0f;
    }

    public long getFixedRemainingSec() {
        return (this.endMill - mqi0.o()) / 1000;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
