package com.p046p1.mobile.putong.live.base.data;

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
import p149l.nb5;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveCallEffectConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivecalleffectconfig";

    @NonNull
    @ProtobufIndex(index = 7)
    public String circleVoicingUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String defaultIcon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String horizontalBg;

    @NonNull
    @ProtobufIndex(index = 6)
    public String horizontalVoicingUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String muteIcon;

    @NonNull
    @ProtobufIndex(index = 1)
    public String verticalBg;

    @NonNull
    @ProtobufIndex(index = 5)
    public String verticalVoicingUrl;
    public static ProtobufAdapter<BLiveCallEffectConfig> PROTOBUF_ADAPTER = new C11539a();
    public static JsonAdapter<BLiveCallEffectConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCallEffectConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCallEffectConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCallEffectConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCallEffectConfig newInstance() {
            return new BLiveCallEffectConfig();
        }

        public boolean parseField(BLiveCallEffectConfig bLiveCallEffectConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "defaultIcon":
                    bLiveCallEffectConfig.defaultIcon = jsonParser.getValueAsString();
                    return true;
                case "circleVoicingUrl":
                    bLiveCallEffectConfig.circleVoicingUrl = jsonParser.getValueAsString();
                    return true;
                case "verticalBg":
                    bLiveCallEffectConfig.verticalBg = jsonParser.getValueAsString();
                    return true;
                case "muteIcon":
                    bLiveCallEffectConfig.muteIcon = jsonParser.getValueAsString();
                    return true;
                case "verticalVoicingUrl":
                    bLiveCallEffectConfig.verticalVoicingUrl = jsonParser.getValueAsString();
                    return true;
                case "horizontalVoicingUrl":
                    bLiveCallEffectConfig.horizontalVoicingUrl = jsonParser.getValueAsString();
                    return true;
                case "horizontalBg":
                    bLiveCallEffectConfig.horizontalBg = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCallEffectConfig bLiveCallEffectConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveCallEffectConfig.verticalBg;
            if (str != null) {
                jsonGenerator.writeStringField("verticalBg", str);
            }
            String str2 = bLiveCallEffectConfig.horizontalBg;
            if (str2 != null) {
                jsonGenerator.writeStringField("horizontalBg", str2);
            }
            String str3 = bLiveCallEffectConfig.defaultIcon;
            if (str3 != null) {
                jsonGenerator.writeStringField("defaultIcon", str3);
            }
            String str4 = bLiveCallEffectConfig.muteIcon;
            if (str4 != null) {
                jsonGenerator.writeStringField("muteIcon", str4);
            }
            String str5 = bLiveCallEffectConfig.verticalVoicingUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("verticalVoicingUrl", str5);
            }
            String str6 = bLiveCallEffectConfig.horizontalVoicingUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("horizontalVoicingUrl", str6);
            }
            String str7 = bLiveCallEffectConfig.circleVoicingUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("circleVoicingUrl", str7);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCallEffectConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveCallEffectConfig$a */
    public class C11539a extends MessageNanoAdapter<BLiveCallEffectConfig> {
        public C11539a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveCallEffectConfig bLiveCallEffectConfig) {
            String str = bLiveCallEffectConfig.verticalBg;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = bLiveCallEffectConfig.horizontalBg;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = bLiveCallEffectConfig.defaultIcon;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = bLiveCallEffectConfig.muteIcon;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = bLiveCallEffectConfig.verticalVoicingUrl;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = bLiveCallEffectConfig.horizontalVoicingUrl;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = bLiveCallEffectConfig.circleVoicingUrl;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            bLiveCallEffectConfig.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveCallEffectConfig parse(nb5 nb5Var) throws IOException {
            BLiveCallEffectConfig bLiveCallEffectConfig = new BLiveCallEffectConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveCallEffectConfig.verticalBg == null) {
                        bLiveCallEffectConfig.verticalBg = "";
                    }
                    if (bLiveCallEffectConfig.horizontalBg == null) {
                        bLiveCallEffectConfig.horizontalBg = "";
                    }
                    if (bLiveCallEffectConfig.defaultIcon == null) {
                        bLiveCallEffectConfig.defaultIcon = "";
                    }
                    if (bLiveCallEffectConfig.muteIcon == null) {
                        bLiveCallEffectConfig.muteIcon = "";
                    }
                    if (bLiveCallEffectConfig.verticalVoicingUrl == null) {
                        bLiveCallEffectConfig.verticalVoicingUrl = "";
                    }
                    if (bLiveCallEffectConfig.horizontalVoicingUrl == null) {
                        bLiveCallEffectConfig.horizontalVoicingUrl = "";
                    }
                    if (bLiveCallEffectConfig.circleVoicingUrl != null) {
                        break;
                    }
                    bLiveCallEffectConfig.circleVoicingUrl = "";
                    break;
                }
                if (iM158752u == 10) {
                    bLiveCallEffectConfig.verticalBg = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    bLiveCallEffectConfig.horizontalBg = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    bLiveCallEffectConfig.defaultIcon = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    bLiveCallEffectConfig.muteIcon = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    bLiveCallEffectConfig.verticalVoicingUrl = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    bLiveCallEffectConfig.horizontalVoicingUrl = nb5Var.m158750s();
                } else {
                    if (iM158752u != 58) {
                        if (bLiveCallEffectConfig.verticalBg == null) {
                            bLiveCallEffectConfig.verticalBg = "";
                        }
                        if (bLiveCallEffectConfig.horizontalBg == null) {
                            bLiveCallEffectConfig.horizontalBg = "";
                        }
                        if (bLiveCallEffectConfig.defaultIcon == null) {
                            bLiveCallEffectConfig.defaultIcon = "";
                        }
                        if (bLiveCallEffectConfig.muteIcon == null) {
                            bLiveCallEffectConfig.muteIcon = "";
                        }
                        if (bLiveCallEffectConfig.verticalVoicingUrl == null) {
                            bLiveCallEffectConfig.verticalVoicingUrl = "";
                        }
                        if (bLiveCallEffectConfig.horizontalVoicingUrl == null) {
                            bLiveCallEffectConfig.horizontalVoicingUrl = "";
                        }
                        if (bLiveCallEffectConfig.circleVoicingUrl != null) {
                            break;
                        }
                        bLiveCallEffectConfig.circleVoicingUrl = "";
                        return bLiveCallEffectConfig;
                    }
                    bLiveCallEffectConfig.circleVoicingUrl = nb5Var.m158750s();
                }
            }
            return bLiveCallEffectConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveCallEffectConfig bLiveCallEffectConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveCallEffectConfig.verticalBg;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = bLiveCallEffectConfig.horizontalBg;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = bLiveCallEffectConfig.defaultIcon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = bLiveCallEffectConfig.muteIcon;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = bLiveCallEffectConfig.verticalVoicingUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = bLiveCallEffectConfig.horizontalVoicingUrl;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = bLiveCallEffectConfig.circleVoicingUrl;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
        }
    }

    public static BLiveCallEffectConfig new_() {
        BLiveCallEffectConfig bLiveCallEffectConfig = new BLiveCallEffectConfig();
        bLiveCallEffectConfig.nullCheck();
        return bLiveCallEffectConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCallEffectConfig mo223809clone() {
        BLiveCallEffectConfig bLiveCallEffectConfig = new BLiveCallEffectConfig();
        bLiveCallEffectConfig.verticalBg = this.verticalBg;
        bLiveCallEffectConfig.horizontalBg = this.horizontalBg;
        bLiveCallEffectConfig.defaultIcon = this.defaultIcon;
        bLiveCallEffectConfig.muteIcon = this.muteIcon;
        bLiveCallEffectConfig.verticalVoicingUrl = this.verticalVoicingUrl;
        bLiveCallEffectConfig.horizontalVoicingUrl = this.horizontalVoicingUrl;
        bLiveCallEffectConfig.circleVoicingUrl = this.circleVoicingUrl;
        return bLiveCallEffectConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCallEffectConfig)) {
            return false;
        }
        BLiveCallEffectConfig bLiveCallEffectConfig = (BLiveCallEffectConfig) obj;
        return ValueObject.util_equals(this.verticalBg, bLiveCallEffectConfig.verticalBg) && ValueObject.util_equals(this.horizontalBg, bLiveCallEffectConfig.horizontalBg) && ValueObject.util_equals(this.defaultIcon, bLiveCallEffectConfig.defaultIcon) && ValueObject.util_equals(this.muteIcon, bLiveCallEffectConfig.muteIcon) && ValueObject.util_equals(this.verticalVoicingUrl, bLiveCallEffectConfig.verticalVoicingUrl) && ValueObject.util_equals(this.horizontalVoicingUrl, bLiveCallEffectConfig.horizontalVoicingUrl) && ValueObject.util_equals(this.circleVoicingUrl, bLiveCallEffectConfig.circleVoicingUrl);
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
        String str = this.verticalBg;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.horizontalBg;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.defaultIcon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.muteIcon;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.verticalVoicingUrl;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.horizontalVoicingUrl;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.circleVoicingUrl;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.verticalBg == null) {
            this.verticalBg = "";
        }
        if (this.horizontalBg == null) {
            this.horizontalBg = "";
        }
        if (this.defaultIcon == null) {
            this.defaultIcon = "";
        }
        if (this.muteIcon == null) {
            this.muteIcon = "";
        }
        if (this.verticalVoicingUrl == null) {
            this.verticalVoicingUrl = "";
        }
        if (this.horizontalVoicingUrl == null) {
            this.horizontalVoicingUrl = "";
        }
        if (this.circleVoicingUrl == null) {
            this.circleVoicingUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
