package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveNobleShoutingChatConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNobleShoutingChatConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNobleShoutingChatConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNobleShoutingChatConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNobleShoutingChatConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNobleShoutingChatConfig newInstance() {
            return new BLiveNobleShoutingChatConfig();
        }

        public boolean parseField(BLiveNobleShoutingChatConfig bLiveNobleShoutingChatConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("textLimit")) {
                bLiveNobleShoutingChatConfig.textLimit = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            bLiveNobleShoutingChatConfig.title = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNobleShoutingChatConfig bLiveNobleShoutingChatConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNobleShoutingChatConfig.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            jsonGenerator.writeNumberField("textLimit", bLiveNobleShoutingChatConfig.textLimit);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNobleShoutingChatConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenobleshoutingchatconfig";

    @ProtobufIndex(index = 2)
    public int textLimit;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLiveNobleShoutingChatConfig new_() {
        BLiveNobleShoutingChatConfig bLiveNobleShoutingChatConfig = new BLiveNobleShoutingChatConfig();
        bLiveNobleShoutingChatConfig.nullCheck();
        return bLiveNobleShoutingChatConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNobleShoutingChatConfig mo223809clone() {
        BLiveNobleShoutingChatConfig bLiveNobleShoutingChatConfig = new BLiveNobleShoutingChatConfig();
        bLiveNobleShoutingChatConfig.title = this.title;
        bLiveNobleShoutingChatConfig.textLimit = this.textLimit;
        return bLiveNobleShoutingChatConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNobleShoutingChatConfig)) {
            return false;
        }
        BLiveNobleShoutingChatConfig bLiveNobleShoutingChatConfig = (BLiveNobleShoutingChatConfig) obj;
        return ValueObject.util_equals(this.title, bLiveNobleShoutingChatConfig.title) && this.textLimit == bLiveNobleShoutingChatConfig.textLimit;
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
        String str = this.title;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.textLimit;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
