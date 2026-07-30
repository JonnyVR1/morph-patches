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
public class BLiveGuardTopChatTemplateItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGuardTopChatTemplateItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGuardTopChatTemplateItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGuardTopChatTemplateItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGuardTopChatTemplateItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGuardTopChatTemplateItem newInstance() {
            return new BLiveGuardTopChatTemplateItem();
        }

        public boolean parseField(BLiveGuardTopChatTemplateItem bLiveGuardTopChatTemplateItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLiveGuardTopChatTemplateItem.duration = jsonParser.getValueAsLong();
                    return true;
                case "giftId":
                    bLiveGuardTopChatTemplateItem.giftId = jsonParser.getValueAsInt();
                    return true;
                case "num":
                    bLiveGuardTopChatTemplateItem.num = jsonParser.getValueAsInt();
                    return true;
                case "icon":
                    bLiveGuardTopChatTemplateItem.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveGuardTopChatTemplateItem.title = jsonParser.getValueAsString();
                    return true;
                case "chatType":
                    bLiveGuardTopChatTemplateItem.chatType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGuardTopChatTemplateItem bLiveGuardTopChatTemplateItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("giftId", bLiveGuardTopChatTemplateItem.giftId);
            String str = bLiveGuardTopChatTemplateItem.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveGuardTopChatTemplateItem.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveGuardTopChatTemplateItem.duration);
            jsonGenerator.writeNumberField("num", bLiveGuardTopChatTemplateItem.num);
            String str3 = bLiveGuardTopChatTemplateItem.chatType;
            if (str3 != null) {
                jsonGenerator.writeStringField("chatType", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGuardTopChatTemplateItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveguardtopchattemplateitem";

    @NonNull
    @ProtobufIndex(index = 6)
    public String chatType;

    @ProtobufIndex(index = 3)
    public long duration;

    @ProtobufIndex(index = 1)
    public int giftId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    @ProtobufIndex(index = 4)
    public int num;

    @NonNull
    @ProtobufIndex(index = 5)
    public String title;

    public static BLiveGuardTopChatTemplateItem new_() {
        BLiveGuardTopChatTemplateItem bLiveGuardTopChatTemplateItem = new BLiveGuardTopChatTemplateItem();
        bLiveGuardTopChatTemplateItem.nullCheck();
        return bLiveGuardTopChatTemplateItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGuardTopChatTemplateItem mo223809clone() {
        BLiveGuardTopChatTemplateItem bLiveGuardTopChatTemplateItem = new BLiveGuardTopChatTemplateItem();
        bLiveGuardTopChatTemplateItem.giftId = this.giftId;
        bLiveGuardTopChatTemplateItem.title = this.title;
        bLiveGuardTopChatTemplateItem.icon = this.icon;
        bLiveGuardTopChatTemplateItem.duration = this.duration;
        bLiveGuardTopChatTemplateItem.num = this.num;
        bLiveGuardTopChatTemplateItem.chatType = this.chatType;
        return bLiveGuardTopChatTemplateItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGuardTopChatTemplateItem)) {
            return false;
        }
        BLiveGuardTopChatTemplateItem bLiveGuardTopChatTemplateItem = (BLiveGuardTopChatTemplateItem) obj;
        return this.giftId == bLiveGuardTopChatTemplateItem.giftId && ValueObject.util_equals(this.title, bLiveGuardTopChatTemplateItem.title) && ValueObject.util_equals(this.icon, bLiveGuardTopChatTemplateItem.icon) && this.duration == bLiveGuardTopChatTemplateItem.duration && this.num == bLiveGuardTopChatTemplateItem.num && ValueObject.util_equals(this.chatType, bLiveGuardTopChatTemplateItem.chatType);
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
        int i2 = ((i * 41) + this.giftId) * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.duration;
        int i3 = (((((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.num) * 41;
        String str3 = this.chatType;
        int iHashCode3 = i3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.chatType == null) {
            this.chatType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
