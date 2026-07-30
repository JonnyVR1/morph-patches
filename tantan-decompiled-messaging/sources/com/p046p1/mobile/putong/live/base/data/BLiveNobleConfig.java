package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveNobleConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNobleConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNobleConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNobleConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNobleConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNobleConfig newInstance() {
            return new BLiveNobleConfig();
        }

        public boolean parseField(BLiveNobleConfig bLiveNobleConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("isOpen")) {
                bLiveNobleConfig.isOpen = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("shoutingChatConfig")) {
                return false;
            }
            bLiveNobleConfig.shoutingChatConfig = BLiveNobleShoutingChatConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNobleConfig bLiveNobleConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOpen", bLiveNobleConfig.isOpen);
            if (bLiveNobleConfig.shoutingChatConfig != null) {
                jsonGenerator.writeFieldName("shoutingChatConfig");
                BLiveNobleShoutingChatConfig.JSON_ADAPTER.serialize(bLiveNobleConfig.shoutingChatConfig, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNobleConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenobleconfig";

    @ProtobufIndex(index = 1)
    public boolean isOpen;

    @Nullable
    @ProtobufIndex(index = 2)
    public BLiveNobleShoutingChatConfig shoutingChatConfig;

    public static BLiveNobleConfig new_() {
        BLiveNobleConfig bLiveNobleConfig = new BLiveNobleConfig();
        bLiveNobleConfig.nullCheck();
        return bLiveNobleConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNobleConfig mo223809clone() {
        BLiveNobleConfig bLiveNobleConfig = new BLiveNobleConfig();
        bLiveNobleConfig.isOpen = this.isOpen;
        BLiveNobleShoutingChatConfig bLiveNobleShoutingChatConfig = this.shoutingChatConfig;
        if (bLiveNobleShoutingChatConfig != null) {
            bLiveNobleConfig.shoutingChatConfig = bLiveNobleShoutingChatConfig.mo223809clone();
        }
        return bLiveNobleConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNobleConfig)) {
            return false;
        }
        BLiveNobleConfig bLiveNobleConfig = (BLiveNobleConfig) obj;
        return this.isOpen == bLiveNobleConfig.isOpen && ValueObject.util_equals(this.shoutingChatConfig, bLiveNobleConfig.shoutingChatConfig);
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
        int i2 = ((i * 41) + (this.isOpen ? 1231 : 1237)) * 41;
        BLiveNobleShoutingChatConfig bLiveNobleShoutingChatConfig = this.shoutingChatConfig;
        int iHashCode = i2 + (bLiveNobleShoutingChatConfig != null ? bLiveNobleShoutingChatConfig.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
