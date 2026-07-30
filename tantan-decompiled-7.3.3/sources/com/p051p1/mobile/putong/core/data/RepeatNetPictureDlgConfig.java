package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class RepeatNetPictureDlgConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "repeatnetpicturedlgconfig";

    @NonNull
    @ProtobufIndex(index = 5)
    public RepeatNetPictureDlgContent aiPictureDlg;

    @ProtobufIndex(index = 6)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 2)
    public RepeatNetPictureDlgContent netPictureDlg;

    @NonNull
    @ProtobufIndex(index = 1)
    public RepeatNetPictureDlgContent repeatPictureDlg;

    @NonNull
    @ProtobufIndex(index = 3)
    public RepeatNetPictureDlgContent swipeLimitDlg;

    @NonNull
    @ProtobufIndex(index = 4)
    public RepeatNetPictureTrigger trigger;
    public static ProtobufAdapter<RepeatNetPictureDlgConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<RepeatNetPictureDlgConfig>() { // from class: com.p1.mobile.putong.core.data.RepeatNetPictureDlgConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RepeatNetPictureDlgConfig repeatNetPictureDlgConfig) {
            RepeatNetPictureDlgContent repeatNetPictureDlgContent = repeatNetPictureDlgConfig.repeatPictureDlg;
            int iM17285l = repeatNetPictureDlgContent != null ? CodedOutputByteBufferNano.m17285l(1, repeatNetPictureDlgContent, RepeatNetPictureDlgContent.PROTOBUF_ADAPTER) : 0;
            RepeatNetPictureDlgContent repeatNetPictureDlgContent2 = repeatNetPictureDlgConfig.netPictureDlg;
            if (repeatNetPictureDlgContent2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, repeatNetPictureDlgContent2, RepeatNetPictureDlgContent.PROTOBUF_ADAPTER);
            }
            RepeatNetPictureDlgContent repeatNetPictureDlgContent3 = repeatNetPictureDlgConfig.swipeLimitDlg;
            if (repeatNetPictureDlgContent3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, repeatNetPictureDlgContent3, RepeatNetPictureDlgContent.PROTOBUF_ADAPTER);
            }
            RepeatNetPictureTrigger repeatNetPictureTrigger = repeatNetPictureDlgConfig.trigger;
            if (repeatNetPictureTrigger != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, repeatNetPictureTrigger, RepeatNetPictureTrigger.PROTOBUF_ADAPTER);
            }
            RepeatNetPictureDlgContent repeatNetPictureDlgContent4 = repeatNetPictureDlgConfig.aiPictureDlg;
            if (repeatNetPictureDlgContent4 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(5, repeatNetPictureDlgContent4, RepeatNetPictureDlgContent.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17285l + CodedOutputByteBufferNano.m17275b(6, repeatNetPictureDlgConfig.enable);
            repeatNetPictureDlgConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RepeatNetPictureDlgConfig parse(nc5 nc5Var) throws IOException {
            RepeatNetPictureDlgConfig repeatNetPictureDlgConfig = new RepeatNetPictureDlgConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (repeatNetPictureDlgConfig.repeatPictureDlg == null) {
                        repeatNetPictureDlgConfig.repeatPictureDlg = RepeatNetPictureDlgContent.new_();
                    }
                    if (repeatNetPictureDlgConfig.netPictureDlg == null) {
                        repeatNetPictureDlgConfig.netPictureDlg = RepeatNetPictureDlgContent.new_();
                    }
                    if (repeatNetPictureDlgConfig.swipeLimitDlg == null) {
                        repeatNetPictureDlgConfig.swipeLimitDlg = RepeatNetPictureDlgContent.new_();
                    }
                    if (repeatNetPictureDlgConfig.trigger == null) {
                        repeatNetPictureDlgConfig.trigger = RepeatNetPictureTrigger.new_();
                    }
                    if (repeatNetPictureDlgConfig.aiPictureDlg != null) {
                        break;
                    }
                    repeatNetPictureDlgConfig.aiPictureDlg = RepeatNetPictureDlgContent.new_();
                    break;
                }
                if (iM162497u == 10) {
                    repeatNetPictureDlgConfig.repeatPictureDlg = (RepeatNetPictureDlgContent) nc5Var.m162488l(RepeatNetPictureDlgContent.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    repeatNetPictureDlgConfig.netPictureDlg = (RepeatNetPictureDlgContent) nc5Var.m162488l(RepeatNetPictureDlgContent.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    repeatNetPictureDlgConfig.swipeLimitDlg = (RepeatNetPictureDlgContent) nc5Var.m162488l(RepeatNetPictureDlgContent.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    repeatNetPictureDlgConfig.trigger = (RepeatNetPictureTrigger) nc5Var.m162488l(RepeatNetPictureTrigger.PROTOBUF_ADAPTER);
                } else if (iM162497u == 42) {
                    repeatNetPictureDlgConfig.aiPictureDlg = (RepeatNetPictureDlgContent) nc5Var.m162488l(RepeatNetPictureDlgContent.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 48) {
                        if (repeatNetPictureDlgConfig.repeatPictureDlg == null) {
                            repeatNetPictureDlgConfig.repeatPictureDlg = RepeatNetPictureDlgContent.new_();
                        }
                        if (repeatNetPictureDlgConfig.netPictureDlg == null) {
                            repeatNetPictureDlgConfig.netPictureDlg = RepeatNetPictureDlgContent.new_();
                        }
                        if (repeatNetPictureDlgConfig.swipeLimitDlg == null) {
                            repeatNetPictureDlgConfig.swipeLimitDlg = RepeatNetPictureDlgContent.new_();
                        }
                        if (repeatNetPictureDlgConfig.trigger == null) {
                            repeatNetPictureDlgConfig.trigger = RepeatNetPictureTrigger.new_();
                        }
                        if (repeatNetPictureDlgConfig.aiPictureDlg != null) {
                            break;
                        }
                        repeatNetPictureDlgConfig.aiPictureDlg = RepeatNetPictureDlgContent.new_();
                        return repeatNetPictureDlgConfig;
                    }
                    repeatNetPictureDlgConfig.enable = nc5Var.m162483g();
                }
            }
            return repeatNetPictureDlgConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RepeatNetPictureDlgConfig repeatNetPictureDlgConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            RepeatNetPictureDlgContent repeatNetPictureDlgContent = repeatNetPictureDlgConfig.repeatPictureDlg;
            if (repeatNetPictureDlgContent != null) {
                codedOutputByteBufferNano.m17309K(1, repeatNetPictureDlgContent, RepeatNetPictureDlgContent.PROTOBUF_ADAPTER);
            }
            RepeatNetPictureDlgContent repeatNetPictureDlgContent2 = repeatNetPictureDlgConfig.netPictureDlg;
            if (repeatNetPictureDlgContent2 != null) {
                codedOutputByteBufferNano.m17309K(2, repeatNetPictureDlgContent2, RepeatNetPictureDlgContent.PROTOBUF_ADAPTER);
            }
            RepeatNetPictureDlgContent repeatNetPictureDlgContent3 = repeatNetPictureDlgConfig.swipeLimitDlg;
            if (repeatNetPictureDlgContent3 != null) {
                codedOutputByteBufferNano.m17309K(3, repeatNetPictureDlgContent3, RepeatNetPictureDlgContent.PROTOBUF_ADAPTER);
            }
            RepeatNetPictureTrigger repeatNetPictureTrigger = repeatNetPictureDlgConfig.trigger;
            if (repeatNetPictureTrigger != null) {
                codedOutputByteBufferNano.m17309K(4, repeatNetPictureTrigger, RepeatNetPictureTrigger.PROTOBUF_ADAPTER);
            }
            RepeatNetPictureDlgContent repeatNetPictureDlgContent4 = repeatNetPictureDlgConfig.aiPictureDlg;
            if (repeatNetPictureDlgContent4 != null) {
                codedOutputByteBufferNano.m17309K(5, repeatNetPictureDlgContent4, RepeatNetPictureDlgContent.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(6, repeatNetPictureDlgConfig.enable);
        }
    };
    public static JsonAdapter<RepeatNetPictureDlgConfig> JSON_ADAPTER = new ObjectJsonAdapter<RepeatNetPictureDlgConfig>() { // from class: com.p1.mobile.putong.core.data.RepeatNetPictureDlgConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RepeatNetPictureDlgConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RepeatNetPictureDlgConfig newInstance() {
            return new RepeatNetPictureDlgConfig();
        }

        public boolean parseField(RepeatNetPictureDlgConfig repeatNetPictureDlgConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    repeatNetPictureDlgConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "trigger":
                    repeatNetPictureDlgConfig.trigger = RepeatNetPictureTrigger.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "aiPictureDlg":
                    repeatNetPictureDlgConfig.aiPictureDlg = RepeatNetPictureDlgContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "netPictureDlg":
                    repeatNetPictureDlgConfig.netPictureDlg = RepeatNetPictureDlgContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "repeatPictureDlg":
                    repeatNetPictureDlgConfig.repeatPictureDlg = RepeatNetPictureDlgContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "swipeLimitDlg":
                    repeatNetPictureDlgConfig.swipeLimitDlg = RepeatNetPictureDlgContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RepeatNetPictureDlgConfig repeatNetPictureDlgConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "trigger":
                case "aiPictureDlg":
                case "netPictureDlg":
                case "repeatPictureDlg":
                case "swipeLimitDlg":
                    return true;
                default:
                    return super.parseFieldCheck(repeatNetPictureDlgConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RepeatNetPictureDlgConfig repeatNetPictureDlgConfig, JsonGenerator jsonGenerator) throws IOException {
            if (repeatNetPictureDlgConfig.repeatPictureDlg != null) {
                jsonGenerator.writeFieldName("repeatPictureDlg");
                RepeatNetPictureDlgContent.JSON_ADAPTER.serialize(repeatNetPictureDlgConfig.repeatPictureDlg, jsonGenerator, true);
            }
            if (repeatNetPictureDlgConfig.netPictureDlg != null) {
                jsonGenerator.writeFieldName("netPictureDlg");
                RepeatNetPictureDlgContent.JSON_ADAPTER.serialize(repeatNetPictureDlgConfig.netPictureDlg, jsonGenerator, true);
            }
            if (repeatNetPictureDlgConfig.swipeLimitDlg != null) {
                jsonGenerator.writeFieldName("swipeLimitDlg");
                RepeatNetPictureDlgContent.JSON_ADAPTER.serialize(repeatNetPictureDlgConfig.swipeLimitDlg, jsonGenerator, true);
            }
            if (repeatNetPictureDlgConfig.trigger != null) {
                jsonGenerator.writeFieldName(Trigger.TYPE);
                RepeatNetPictureTrigger.JSON_ADAPTER.serialize(repeatNetPictureDlgConfig.trigger, jsonGenerator, true);
            }
            if (repeatNetPictureDlgConfig.aiPictureDlg != null) {
                jsonGenerator.writeFieldName("aiPictureDlg");
                RepeatNetPictureDlgContent.JSON_ADAPTER.serialize(repeatNetPictureDlgConfig.aiPictureDlg, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("enable", repeatNetPictureDlgConfig.enable);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RepeatNetPictureDlgConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RepeatNetPictureDlgConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RepeatNetPictureDlgConfig new_() {
        RepeatNetPictureDlgConfig repeatNetPictureDlgConfig = new RepeatNetPictureDlgConfig();
        repeatNetPictureDlgConfig.nullCheck();
        return repeatNetPictureDlgConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RepeatNetPictureDlgConfig mo225055clone() {
        RepeatNetPictureDlgConfig repeatNetPictureDlgConfig = new RepeatNetPictureDlgConfig();
        RepeatNetPictureDlgContent repeatNetPictureDlgContent = this.repeatPictureDlg;
        if (repeatNetPictureDlgContent != null) {
            repeatNetPictureDlgConfig.repeatPictureDlg = repeatNetPictureDlgContent.mo225055clone();
        }
        RepeatNetPictureDlgContent repeatNetPictureDlgContent2 = this.netPictureDlg;
        if (repeatNetPictureDlgContent2 != null) {
            repeatNetPictureDlgConfig.netPictureDlg = repeatNetPictureDlgContent2.mo225055clone();
        }
        RepeatNetPictureDlgContent repeatNetPictureDlgContent3 = this.swipeLimitDlg;
        if (repeatNetPictureDlgContent3 != null) {
            repeatNetPictureDlgConfig.swipeLimitDlg = repeatNetPictureDlgContent3.mo225055clone();
        }
        RepeatNetPictureTrigger repeatNetPictureTrigger = this.trigger;
        if (repeatNetPictureTrigger != null) {
            repeatNetPictureDlgConfig.trigger = repeatNetPictureTrigger.mo225055clone();
        }
        RepeatNetPictureDlgContent repeatNetPictureDlgContent4 = this.aiPictureDlg;
        if (repeatNetPictureDlgContent4 != null) {
            repeatNetPictureDlgConfig.aiPictureDlg = repeatNetPictureDlgContent4.mo225055clone();
        }
        repeatNetPictureDlgConfig.enable = this.enable;
        return repeatNetPictureDlgConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RepeatNetPictureDlgConfig)) {
            return false;
        }
        RepeatNetPictureDlgConfig repeatNetPictureDlgConfig = (RepeatNetPictureDlgConfig) obj;
        return ValueObject.util_equals(this.repeatPictureDlg, repeatNetPictureDlgConfig.repeatPictureDlg) && ValueObject.util_equals(this.netPictureDlg, repeatNetPictureDlgConfig.netPictureDlg) && ValueObject.util_equals(this.swipeLimitDlg, repeatNetPictureDlgConfig.swipeLimitDlg) && ValueObject.util_equals(this.trigger, repeatNetPictureDlgConfig.trigger) && ValueObject.util_equals(this.aiPictureDlg, repeatNetPictureDlgConfig.aiPictureDlg) && this.enable == repeatNetPictureDlgConfig.enable;
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
        RepeatNetPictureDlgContent repeatNetPictureDlgContent = this.repeatPictureDlg;
        int iHashCode = (i2 + (repeatNetPictureDlgContent != null ? repeatNetPictureDlgContent.hashCode() : 0)) * 41;
        RepeatNetPictureDlgContent repeatNetPictureDlgContent2 = this.netPictureDlg;
        int iHashCode2 = (iHashCode + (repeatNetPictureDlgContent2 != null ? repeatNetPictureDlgContent2.hashCode() : 0)) * 41;
        RepeatNetPictureDlgContent repeatNetPictureDlgContent3 = this.swipeLimitDlg;
        int iHashCode3 = (iHashCode2 + (repeatNetPictureDlgContent3 != null ? repeatNetPictureDlgContent3.hashCode() : 0)) * 41;
        RepeatNetPictureTrigger repeatNetPictureTrigger = this.trigger;
        int iHashCode4 = (iHashCode3 + (repeatNetPictureTrigger != null ? repeatNetPictureTrigger.hashCode() : 0)) * 41;
        RepeatNetPictureDlgContent repeatNetPictureDlgContent4 = this.aiPictureDlg;
        int iHashCode5 = ((iHashCode4 + (repeatNetPictureDlgContent4 != null ? repeatNetPictureDlgContent4.hashCode() : 0)) * 41) + (this.enable ? 1231 : 1237);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.repeatPictureDlg == null) {
            this.repeatPictureDlg = RepeatNetPictureDlgContent.new_();
        }
        if (this.netPictureDlg == null) {
            this.netPictureDlg = RepeatNetPictureDlgContent.new_();
        }
        if (this.swipeLimitDlg == null) {
            this.swipeLimitDlg = RepeatNetPictureDlgContent.new_();
        }
        if (this.trigger == null) {
            this.trigger = RepeatNetPictureTrigger.new_();
        }
        if (this.aiPictureDlg == null) {
            this.aiPictureDlg = RepeatNetPictureDlgContent.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
