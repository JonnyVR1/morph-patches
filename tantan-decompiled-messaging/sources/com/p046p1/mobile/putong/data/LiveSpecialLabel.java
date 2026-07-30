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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class LiveSpecialLabel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livespeciallabel";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38774id;

    @NonNull
    @ProtobufIndex(index = 5)
    public LiveMultiCallInfoInLabel multiCallInfo;

    @NonNull
    @ProtobufIndex(index = 2)
    public String templateId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String value;
    public static ProtobufAdapter<LiveSpecialLabel> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveSpecialLabel>() { // from class: com.p1.mobile.putong.data.LiveSpecialLabel.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveSpecialLabel liveSpecialLabel) {
            String str = liveSpecialLabel.f38774id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = liveSpecialLabel.templateId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = liveSpecialLabel.value;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = liveSpecialLabel.type;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            LiveMultiCallInfoInLabel liveMultiCallInfoInLabel = liveSpecialLabel.multiCallInfo;
            if (liveMultiCallInfoInLabel != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, liveMultiCallInfoInLabel, LiveMultiCallInfoInLabel.PROTOBUF_ADAPTER);
            }
            liveSpecialLabel.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveSpecialLabel parse(nb5 nb5Var) throws IOException {
            LiveSpecialLabel liveSpecialLabel = new LiveSpecialLabel();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveSpecialLabel.f38774id == null) {
                        liveSpecialLabel.f38774id = "";
                    }
                    if (liveSpecialLabel.templateId == null) {
                        liveSpecialLabel.templateId = "";
                    }
                    if (liveSpecialLabel.value == null) {
                        liveSpecialLabel.value = "";
                    }
                    if (liveSpecialLabel.type == null) {
                        liveSpecialLabel.type = "";
                    }
                    if (liveSpecialLabel.multiCallInfo != null) {
                        break;
                    }
                    liveSpecialLabel.multiCallInfo = LiveMultiCallInfoInLabel.new_();
                    break;
                }
                if (iM158752u == 10) {
                    liveSpecialLabel.f38774id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    liveSpecialLabel.templateId = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    liveSpecialLabel.value = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    liveSpecialLabel.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (liveSpecialLabel.f38774id == null) {
                            liveSpecialLabel.f38774id = "";
                        }
                        if (liveSpecialLabel.templateId == null) {
                            liveSpecialLabel.templateId = "";
                        }
                        if (liveSpecialLabel.value == null) {
                            liveSpecialLabel.value = "";
                        }
                        if (liveSpecialLabel.type == null) {
                            liveSpecialLabel.type = "";
                        }
                        if (liveSpecialLabel.multiCallInfo != null) {
                            break;
                        }
                        liveSpecialLabel.multiCallInfo = LiveMultiCallInfoInLabel.new_();
                        return liveSpecialLabel;
                    }
                    liveSpecialLabel.multiCallInfo = (LiveMultiCallInfoInLabel) nb5Var.m158743l(LiveMultiCallInfoInLabel.PROTOBUF_ADAPTER);
                }
            }
            return liveSpecialLabel;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveSpecialLabel liveSpecialLabel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveSpecialLabel.f38774id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = liveSpecialLabel.templateId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = liveSpecialLabel.value;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = liveSpecialLabel.type;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            LiveMultiCallInfoInLabel liveMultiCallInfoInLabel = liveSpecialLabel.multiCallInfo;
            if (liveMultiCallInfoInLabel != null) {
                codedOutputByteBufferNano.m17254K(5, liveMultiCallInfoInLabel, LiveMultiCallInfoInLabel.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LiveSpecialLabel> JSON_ADAPTER = new ObjectJsonAdapter<LiveSpecialLabel>() { // from class: com.p1.mobile.putong.data.LiveSpecialLabel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveSpecialLabel.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveSpecialLabel newInstance() {
            return new LiveSpecialLabel();
        }

        public boolean parseField(LiveSpecialLabel liveSpecialLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    liveSpecialLabel.f38774id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    liveSpecialLabel.type = jsonParser.getValueAsString();
                    return true;
                case "value":
                    liveSpecialLabel.value = jsonParser.getValueAsString();
                    return true;
                case "templateId":
                    liveSpecialLabel.templateId = jsonParser.getValueAsString();
                    return true;
                case "multiCallInfo":
                    liveSpecialLabel.multiCallInfo = LiveMultiCallInfoInLabel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveSpecialLabel liveSpecialLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "type":
                case "value":
                case "templateId":
                case "multiCallInfo":
                    return true;
                default:
                    return super.parseFieldCheck(liveSpecialLabel, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveSpecialLabel liveSpecialLabel, JsonGenerator jsonGenerator) throws IOException {
            String str = liveSpecialLabel.f38774id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveSpecialLabel.templateId;
            if (str2 != null) {
                jsonGenerator.writeStringField("templateId", str2);
            }
            String str3 = liveSpecialLabel.value;
            if (str3 != null) {
                jsonGenerator.writeStringField("value", str3);
            }
            String str4 = liveSpecialLabel.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            if (liveSpecialLabel.multiCallInfo != null) {
                jsonGenerator.writeFieldName("multiCallInfo");
                LiveMultiCallInfoInLabel.JSON_ADAPTER.serialize(liveSpecialLabel.multiCallInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveSpecialLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveSpecialLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveSpecialLabel new_() {
        LiveSpecialLabel liveSpecialLabel = new LiveSpecialLabel();
        liveSpecialLabel.nullCheck();
        return liveSpecialLabel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveSpecialLabel mo223809clone() {
        LiveSpecialLabel liveSpecialLabel = new LiveSpecialLabel();
        liveSpecialLabel.f38774id = this.f38774id;
        liveSpecialLabel.templateId = this.templateId;
        liveSpecialLabel.value = this.value;
        liveSpecialLabel.type = this.type;
        LiveMultiCallInfoInLabel liveMultiCallInfoInLabel = this.multiCallInfo;
        if (liveMultiCallInfoInLabel != null) {
            liveSpecialLabel.multiCallInfo = liveMultiCallInfoInLabel.mo223809clone();
        }
        return liveSpecialLabel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveSpecialLabel)) {
            return false;
        }
        LiveSpecialLabel liveSpecialLabel = (LiveSpecialLabel) obj;
        return ValueObject.util_equals(this.f38774id, liveSpecialLabel.f38774id) && ValueObject.util_equals(this.templateId, liveSpecialLabel.templateId) && ValueObject.util_equals(this.value, liveSpecialLabel.value) && ValueObject.util_equals(this.type, liveSpecialLabel.type) && ValueObject.util_equals(this.multiCallInfo, liveSpecialLabel.multiCallInfo);
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
        String str = this.f38774id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.templateId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        LiveMultiCallInfoInLabel liveMultiCallInfoInLabel = this.multiCallInfo;
        int iHashCode5 = iHashCode4 + (liveMultiCallInfoInLabel != null ? liveMultiCallInfoInLabel.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38774id == null) {
            this.f38774id = "";
        }
        if (this.templateId == null) {
            this.templateId = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.multiCallInfo == null) {
            this.multiCallInfo = LiveMultiCallInfoInLabel.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
