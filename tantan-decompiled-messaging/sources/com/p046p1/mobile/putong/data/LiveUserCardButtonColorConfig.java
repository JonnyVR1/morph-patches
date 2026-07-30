package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.LiveUserCardButtonColorConfig;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class LiveUserCardButtonColorConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveusercardbuttoncolorconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> colors;

    @ProtobufIndex(index = 1)
    public int gradientDirection;

    @ProtobufIndex(index = 3)
    public int transparency;
    public static ProtobufAdapter<LiveUserCardButtonColorConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveUserCardButtonColorConfig>() { // from class: com.p1.mobile.putong.data.LiveUserCardButtonColorConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveUserCardButtonColorConfig liveUserCardButtonColorConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, liveUserCardButtonColorConfig.gradientDirection);
            List<String> list = liveUserCardButtonColorConfig.colors;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(3, liveUserCardButtonColorConfig.transparency);
            liveUserCardButtonColorConfig.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveUserCardButtonColorConfig parse(nb5 nb5Var) throws IOException {
            LiveUserCardButtonColorConfig liveUserCardButtonColorConfig = new LiveUserCardButtonColorConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveUserCardButtonColorConfig.colors != null) {
                        break;
                    }
                    liveUserCardButtonColorConfig.colors = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    liveUserCardButtonColorConfig.gradientDirection = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    liveUserCardButtonColorConfig.colors = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 24) {
                        if (liveUserCardButtonColorConfig.colors != null) {
                            break;
                        }
                        liveUserCardButtonColorConfig.colors = new ArrayList();
                        return liveUserCardButtonColorConfig;
                    }
                    liveUserCardButtonColorConfig.transparency = nb5Var.m158741j();
                }
            }
            return liveUserCardButtonColorConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveUserCardButtonColorConfig liveUserCardButtonColorConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, liveUserCardButtonColorConfig.gradientDirection);
            List<String> list = liveUserCardButtonColorConfig.colors;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(3, liveUserCardButtonColorConfig.transparency);
        }
    };
    public static JsonAdapter<LiveUserCardButtonColorConfig> JSON_ADAPTER = new ObjectJsonAdapter<LiveUserCardButtonColorConfig>() { // from class: com.p1.mobile.putong.data.LiveUserCardButtonColorConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveUserCardButtonColorConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveUserCardButtonColorConfig newInstance() {
            return new LiveUserCardButtonColorConfig();
        }

        public boolean parseField(LiveUserCardButtonColorConfig liveUserCardButtonColorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "transparency":
                    liveUserCardButtonColorConfig.transparency = jsonParser.getValueAsInt();
                    return true;
                case "colors":
                    liveUserCardButtonColorConfig.colors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "gradientDirection":
                    liveUserCardButtonColorConfig.gradientDirection = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveUserCardButtonColorConfig liveUserCardButtonColorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "transparency":
                case "colors":
                case "gradientDirection":
                    return true;
                default:
                    return super.parseFieldCheck(liveUserCardButtonColorConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveUserCardButtonColorConfig liveUserCardButtonColorConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("gradientDirection", liveUserCardButtonColorConfig.gradientDirection);
            if (liveUserCardButtonColorConfig.colors != null) {
                jsonGenerator.writeFieldName("colors");
                JsonAdapter.serializeArray(liveUserCardButtonColorConfig.colors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("transparency", liveUserCardButtonColorConfig.transparency);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveUserCardButtonColorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveUserCardButtonColorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59843a(String str) {
        return str;
    }

    public static LiveUserCardButtonColorConfig new_() {
        LiveUserCardButtonColorConfig liveUserCardButtonColorConfig = new LiveUserCardButtonColorConfig();
        liveUserCardButtonColorConfig.nullCheck();
        return liveUserCardButtonColorConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveUserCardButtonColorConfig mo223809clone() {
        LiveUserCardButtonColorConfig liveUserCardButtonColorConfig = new LiveUserCardButtonColorConfig();
        liveUserCardButtonColorConfig.gradientDirection = this.gradientDirection;
        List<String> list = this.colors;
        if (list != null) {
            liveUserCardButtonColorConfig.colors = ValueObject.util_map(list, new w9j() { // from class: l.vdu
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LiveUserCardButtonColorConfig.m59843a((String) obj);
                }
            });
        }
        liveUserCardButtonColorConfig.transparency = this.transparency;
        return liveUserCardButtonColorConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveUserCardButtonColorConfig)) {
            return false;
        }
        LiveUserCardButtonColorConfig liveUserCardButtonColorConfig = (LiveUserCardButtonColorConfig) obj;
        return this.gradientDirection == liveUserCardButtonColorConfig.gradientDirection && ValueObject.util_equals(this.colors, liveUserCardButtonColorConfig.colors) && this.transparency == liveUserCardButtonColorConfig.transparency;
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
        int i2 = ((i * 41) + this.gradientDirection) * 41;
        List<String> list = this.colors;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.transparency;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.colors == null) {
            this.colors = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
