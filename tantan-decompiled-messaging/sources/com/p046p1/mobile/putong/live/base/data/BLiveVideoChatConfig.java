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
public class BLiveVideoChatConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVideoChatConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVideoChatConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVideoChatConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVideoChatConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVideoChatConfig newInstance() {
            return new BLiveVideoChatConfig();
        }

        public boolean parseField(BLiveVideoChatConfig bLiveVideoChatConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("chat")) {
                bLiveVideoChatConfig.chat = BLiveChatRequestConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("showMoreEntrance")) {
                return false;
            }
            bLiveVideoChatConfig.showMoreEntrance = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVideoChatConfig bLiveVideoChatConfig, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVideoChatConfig.chat != null) {
                jsonGenerator.writeFieldName("chat");
                BLiveChatRequestConfig.JSON_ADAPTER.serialize(bLiveVideoChatConfig.chat, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("showMoreEntrance", bLiveVideoChatConfig.showMoreEntrance);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVideoChatConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevideochatconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveChatRequestConfig chat;

    @ProtobufIndex(index = 2)
    public boolean showMoreEntrance;

    public static BLiveVideoChatConfig new_() {
        BLiveVideoChatConfig bLiveVideoChatConfig = new BLiveVideoChatConfig();
        bLiveVideoChatConfig.nullCheck();
        return bLiveVideoChatConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVideoChatConfig mo223809clone() {
        BLiveVideoChatConfig bLiveVideoChatConfig = new BLiveVideoChatConfig();
        BLiveChatRequestConfig bLiveChatRequestConfig = this.chat;
        if (bLiveChatRequestConfig != null) {
            bLiveVideoChatConfig.chat = bLiveChatRequestConfig.mo223809clone();
        }
        bLiveVideoChatConfig.showMoreEntrance = this.showMoreEntrance;
        return bLiveVideoChatConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVideoChatConfig)) {
            return false;
        }
        BLiveVideoChatConfig bLiveVideoChatConfig = (BLiveVideoChatConfig) obj;
        return ValueObject.util_equals(this.chat, bLiveVideoChatConfig.chat) && this.showMoreEntrance == bLiveVideoChatConfig.showMoreEntrance;
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
        BLiveChatRequestConfig bLiveChatRequestConfig = this.chat;
        int iHashCode = ((i2 + (bLiveChatRequestConfig != null ? bLiveChatRequestConfig.hashCode() : 0)) * 41) + (this.showMoreEntrance ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.chat == null) {
            this.chat = BLiveChatRequestConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
