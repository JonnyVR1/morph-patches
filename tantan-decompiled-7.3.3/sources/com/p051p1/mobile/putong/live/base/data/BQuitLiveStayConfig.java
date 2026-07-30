package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BQuitLiveStayConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BQuitLiveStayConfig> JSON_ADAPTER = new ObjectJsonAdapter<BQuitLiveStayConfig>() { // from class: com.p1.mobile.putong.live.base.data.BQuitLiveStayConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BQuitLiveStayConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BQuitLiveStayConfig newInstance() {
            return new BQuitLiveStayConfig();
        }

        public boolean parseField(BQuitLiveStayConfig bQuitLiveStayConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "popupLimit":
                    bQuitLiveStayConfig.popupLimit = jsonParser.getValueAsInt();
                    return true;
                case "popupContent":
                    bQuitLiveStayConfig.popupContent = jsonParser.getValueAsString();
                    return true;
                case "watchLiveDuration":
                    bQuitLiveStayConfig.watchLiveDuration = jsonParser.getValueAsInt();
                    return true;
                case "on":
                    bQuitLiveStayConfig.f45364on = jsonParser.getValueAsBoolean();
                    return true;
                case "watchLiveCount":
                    bQuitLiveStayConfig.watchLiveCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BQuitLiveStayConfig bQuitLiveStayConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("on", bQuitLiveStayConfig.f45364on);
            String str = bQuitLiveStayConfig.popupContent;
            if (str != null) {
                jsonGenerator.writeStringField("popupContent", str);
            }
            jsonGenerator.writeNumberField("popupLimit", bQuitLiveStayConfig.popupLimit);
            jsonGenerator.writeNumberField("watchLiveCount", bQuitLiveStayConfig.watchLiveCount);
            jsonGenerator.writeNumberField("watchLiveDuration", bQuitLiveStayConfig.watchLiveDuration);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BQuitLiveStayConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bquitlivestayconfig";

    /* JADX INFO: renamed from: on */
    @ProtobufIndex(index = 1)
    public boolean f45364on;

    @NonNull
    @ProtobufIndex(index = 2)
    public String popupContent;

    @ProtobufIndex(index = 3)
    public int popupLimit;

    @ProtobufIndex(index = 4)
    public int watchLiveCount;

    @ProtobufIndex(index = 5)
    public int watchLiveDuration;

    public static BQuitLiveStayConfig new_() {
        BQuitLiveStayConfig bQuitLiveStayConfig = new BQuitLiveStayConfig();
        bQuitLiveStayConfig.nullCheck();
        return bQuitLiveStayConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BQuitLiveStayConfig mo225055clone() {
        BQuitLiveStayConfig bQuitLiveStayConfig = new BQuitLiveStayConfig();
        bQuitLiveStayConfig.f45364on = this.f45364on;
        bQuitLiveStayConfig.popupContent = this.popupContent;
        bQuitLiveStayConfig.popupLimit = this.popupLimit;
        bQuitLiveStayConfig.watchLiveCount = this.watchLiveCount;
        bQuitLiveStayConfig.watchLiveDuration = this.watchLiveDuration;
        return bQuitLiveStayConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BQuitLiveStayConfig)) {
            return false;
        }
        BQuitLiveStayConfig bQuitLiveStayConfig = (BQuitLiveStayConfig) obj;
        return this.f45364on == bQuitLiveStayConfig.f45364on && ValueObject.util_equals(this.popupContent, bQuitLiveStayConfig.popupContent) && this.popupLimit == bQuitLiveStayConfig.popupLimit && this.watchLiveCount == bQuitLiveStayConfig.watchLiveCount && this.watchLiveDuration == bQuitLiveStayConfig.watchLiveDuration;
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
        int i2 = ((i * 41) + (this.f45364on ? 1231 : 1237)) * 41;
        String str = this.popupContent;
        int iHashCode = ((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.popupLimit) * 41) + this.watchLiveCount) * 41) + this.watchLiveDuration;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.popupContent == null) {
            this.popupContent = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
