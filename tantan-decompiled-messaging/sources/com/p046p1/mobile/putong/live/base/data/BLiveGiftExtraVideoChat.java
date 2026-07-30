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
public class BLiveGiftExtraVideoChat extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftExtraVideoChat> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftExtraVideoChat>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftExtraVideoChat.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftExtraVideoChat.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftExtraVideoChat newInstance() {
            return new BLiveGiftExtraVideoChat();
        }

        public boolean parseField(BLiveGiftExtraVideoChat bLiveGiftExtraVideoChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "chatId":
                    bLiveGiftExtraVideoChat.chatId = jsonParser.getValueAsString();
                    return true;
                case "payType":
                    bLiveGiftExtraVideoChat.payType = jsonParser.getValueAsString();
                    return true;
                case "untilSec":
                    bLiveGiftExtraVideoChat.untilSec = jsonParser.getValueAsInt();
                    return true;
                case "category":
                    bLiveGiftExtraVideoChat.category = jsonParser.getValueAsString();
                    return true;
                case "sinceSec":
                    bLiveGiftExtraVideoChat.sinceSec = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftExtraVideoChat bLiveGiftExtraVideoChat, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftExtraVideoChat.chatId;
            if (str != null) {
                jsonGenerator.writeStringField("chatId", str);
            }
            jsonGenerator.writeNumberField("sinceSec", bLiveGiftExtraVideoChat.sinceSec);
            jsonGenerator.writeNumberField("untilSec", bLiveGiftExtraVideoChat.untilSec);
            String str2 = bLiveGiftExtraVideoChat.category;
            if (str2 != null) {
                jsonGenerator.writeStringField("category", str2);
            }
            String str3 = bLiveGiftExtraVideoChat.payType;
            if (str3 != null) {
                jsonGenerator.writeStringField("payType", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftExtraVideoChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftextravideochat";

    @NonNull
    @ProtobufIndex(index = 4)
    public String category;

    @NonNull
    @ProtobufIndex(index = 1)
    public String chatId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String payType;

    @ProtobufIndex(index = 2)
    public int sinceSec;

    @ProtobufIndex(index = 3)
    public int untilSec;

    public static BLiveGiftExtraVideoChat new_() {
        BLiveGiftExtraVideoChat bLiveGiftExtraVideoChat = new BLiveGiftExtraVideoChat();
        bLiveGiftExtraVideoChat.nullCheck();
        return bLiveGiftExtraVideoChat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftExtraVideoChat mo223809clone() {
        BLiveGiftExtraVideoChat bLiveGiftExtraVideoChat = new BLiveGiftExtraVideoChat();
        bLiveGiftExtraVideoChat.chatId = this.chatId;
        bLiveGiftExtraVideoChat.sinceSec = this.sinceSec;
        bLiveGiftExtraVideoChat.untilSec = this.untilSec;
        bLiveGiftExtraVideoChat.category = this.category;
        bLiveGiftExtraVideoChat.payType = this.payType;
        return bLiveGiftExtraVideoChat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftExtraVideoChat)) {
            return false;
        }
        BLiveGiftExtraVideoChat bLiveGiftExtraVideoChat = (BLiveGiftExtraVideoChat) obj;
        return ValueObject.util_equals(this.chatId, bLiveGiftExtraVideoChat.chatId) && this.sinceSec == bLiveGiftExtraVideoChat.sinceSec && this.untilSec == bLiveGiftExtraVideoChat.untilSec && ValueObject.util_equals(this.category, bLiveGiftExtraVideoChat.category) && ValueObject.util_equals(this.payType, bLiveGiftExtraVideoChat.payType);
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
        String str = this.chatId;
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.sinceSec) * 41) + this.untilSec) * 41;
        String str2 = this.category;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.payType;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.chatId == null) {
            this.chatId = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.payType == null) {
            this.payType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
