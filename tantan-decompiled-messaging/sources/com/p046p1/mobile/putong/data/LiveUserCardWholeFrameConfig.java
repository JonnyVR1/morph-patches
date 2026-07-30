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
public class LiveUserCardWholeFrameConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveusercardwholeframeconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String playType;

    @ProtobufIndex(index = 2)
    public int resourceId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String staticUrl;
    public static ProtobufAdapter<LiveUserCardWholeFrameConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveUserCardWholeFrameConfig>() { // from class: com.p1.mobile.putong.data.LiveUserCardWholeFrameConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig) {
            String str = liveUserCardWholeFrameConfig.playType;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, liveUserCardWholeFrameConfig.resourceId);
            String str2 = liveUserCardWholeFrameConfig.staticUrl;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            liveUserCardWholeFrameConfig.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveUserCardWholeFrameConfig parse(nb5 nb5Var) throws IOException {
            LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig = new LiveUserCardWholeFrameConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveUserCardWholeFrameConfig.playType == null) {
                        liveUserCardWholeFrameConfig.playType = "";
                    }
                    if (liveUserCardWholeFrameConfig.staticUrl != null) {
                        break;
                    }
                    liveUserCardWholeFrameConfig.staticUrl = "";
                    break;
                }
                if (iM158752u == 10) {
                    liveUserCardWholeFrameConfig.playType = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    liveUserCardWholeFrameConfig.resourceId = nb5Var.m158741j();
                } else {
                    if (iM158752u != 26) {
                        if (liveUserCardWholeFrameConfig.playType == null) {
                            liveUserCardWholeFrameConfig.playType = "";
                        }
                        if (liveUserCardWholeFrameConfig.staticUrl != null) {
                            break;
                        }
                        liveUserCardWholeFrameConfig.staticUrl = "";
                        return liveUserCardWholeFrameConfig;
                    }
                    liveUserCardWholeFrameConfig.staticUrl = nb5Var.m158750s();
                }
            }
            return liveUserCardWholeFrameConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveUserCardWholeFrameConfig.playType;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, liveUserCardWholeFrameConfig.resourceId);
            String str2 = liveUserCardWholeFrameConfig.staticUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<LiveUserCardWholeFrameConfig> JSON_ADAPTER = new ObjectJsonAdapter<LiveUserCardWholeFrameConfig>() { // from class: com.p1.mobile.putong.data.LiveUserCardWholeFrameConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveUserCardWholeFrameConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveUserCardWholeFrameConfig newInstance() {
            return new LiveUserCardWholeFrameConfig();
        }

        public boolean parseField(LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "staticUrl":
                    liveUserCardWholeFrameConfig.staticUrl = jsonParser.getValueAsString();
                    return true;
                case "resourceId":
                    liveUserCardWholeFrameConfig.resourceId = jsonParser.getValueAsInt();
                    return true;
                case "playType":
                    liveUserCardWholeFrameConfig.playType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "staticUrl":
                case "resourceId":
                case "playType":
                    return true;
                default:
                    return super.parseFieldCheck(liveUserCardWholeFrameConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = liveUserCardWholeFrameConfig.playType;
            if (str != null) {
                jsonGenerator.writeStringField("playType", str);
            }
            jsonGenerator.writeNumberField("resourceId", liveUserCardWholeFrameConfig.resourceId);
            String str2 = liveUserCardWholeFrameConfig.staticUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("staticUrl", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveUserCardWholeFrameConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveUserCardWholeFrameConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveUserCardWholeFrameConfig new_() {
        LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig = new LiveUserCardWholeFrameConfig();
        liveUserCardWholeFrameConfig.nullCheck();
        return liveUserCardWholeFrameConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveUserCardWholeFrameConfig mo223809clone() {
        LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig = new LiveUserCardWholeFrameConfig();
        liveUserCardWholeFrameConfig.playType = this.playType;
        liveUserCardWholeFrameConfig.resourceId = this.resourceId;
        liveUserCardWholeFrameConfig.staticUrl = this.staticUrl;
        return liveUserCardWholeFrameConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveUserCardWholeFrameConfig)) {
            return false;
        }
        LiveUserCardWholeFrameConfig liveUserCardWholeFrameConfig = (LiveUserCardWholeFrameConfig) obj;
        return ValueObject.util_equals(this.playType, liveUserCardWholeFrameConfig.playType) && this.resourceId == liveUserCardWholeFrameConfig.resourceId && ValueObject.util_equals(this.staticUrl, liveUserCardWholeFrameConfig.staticUrl);
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
        String str = this.playType;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.resourceId) * 41;
        String str2 = this.staticUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.playType == null) {
            this.playType = "";
        }
        if (this.staticUrl == null) {
            this.staticUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
