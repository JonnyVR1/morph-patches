package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveGiftMessage extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftMessage> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftMessage>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftMessage.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftMessage.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftMessage newInstance() {
            return new BLiveGiftMessage();
        }

        public boolean parseField(BLiveGiftMessage bLiveGiftMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveGiftMessage.f44379id = jsonParser.getValueAsLong();
                    return false;
                case "url":
                    bLiveGiftMessage.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveGiftMessage.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveGiftMessage.type = jsonParser.getValueAsInt();
                    return true;
                case "count":
                    bLiveGiftMessage.count = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftMessage bLiveGiftMessage, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("type", bLiveGiftMessage.type);
            String str = bLiveGiftMessage.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            jsonGenerator.writeNumberField("count", bLiveGiftMessage.count);
            jsonGenerator.writeNumberField("id", bLiveGiftMessage.f44379id);
            String str2 = bLiveGiftMessage.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftmessage";

    @ProtobufIndex(index = 53)
    public int count;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 54)
    public long f44379id;

    @NonNull
    @ProtobufIndex(index = 52)
    public String name;

    @ProtobufIndex(index = 51)
    public int type;

    @NonNull
    @ProtobufIndex(index = 55)
    public String url;

    public static BLiveGiftMessage new_() {
        BLiveGiftMessage bLiveGiftMessage = new BLiveGiftMessage();
        bLiveGiftMessage.nullCheck();
        return bLiveGiftMessage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftMessage mo223809clone() {
        BLiveGiftMessage bLiveGiftMessage = new BLiveGiftMessage();
        bLiveGiftMessage.type = this.type;
        bLiveGiftMessage.name = this.name;
        bLiveGiftMessage.count = this.count;
        bLiveGiftMessage.f44379id = this.f44379id;
        bLiveGiftMessage.url = this.url;
        return bLiveGiftMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftMessage)) {
            return false;
        }
        BLiveGiftMessage bLiveGiftMessage = (BLiveGiftMessage) obj;
        return this.type == bLiveGiftMessage.type && ValueObject.util_equals(this.name, bLiveGiftMessage.name) && this.count == bLiveGiftMessage.count && this.f44379id == bLiveGiftMessage.f44379id && ValueObject.util_equals(this.url, bLiveGiftMessage.url);
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
        int i2 = ((i * 41) + this.type) * 41;
        String str = this.name;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.count) * 41;
        long j = this.f44379id;
        int i3 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 41;
        String str2 = this.url;
        int iHashCode2 = i3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    public BLiveGiftMessage subtract(BLiveGiftMessage bLiveGiftMessage) {
        BLiveGiftMessage bLiveGiftMessage2 = new BLiveGiftMessage();
        if (!ValueObject.util_equals(this.name, bLiveGiftMessage.name)) {
            bLiveGiftMessage2.name = this.name;
        }
        if (!ValueObject.util_equals(this.url, bLiveGiftMessage.url)) {
            bLiveGiftMessage2.url = this.url;
        }
        if (bLiveGiftMessage2.equals(new BLiveGiftMessage())) {
            return null;
        }
        return bLiveGiftMessage2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
