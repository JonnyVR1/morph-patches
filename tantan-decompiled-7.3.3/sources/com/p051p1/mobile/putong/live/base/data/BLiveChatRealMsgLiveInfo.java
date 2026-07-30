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
public class BLiveChatRealMsgLiveInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatRealMsgLiveInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatRealMsgLiveInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatRealMsgLiveInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatRealMsgLiveInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatRealMsgLiveInfo newInstance() {
            return new BLiveChatRealMsgLiveInfo();
        }

        public boolean parseField(BLiveChatRealMsgLiveInfo bLiveChatRealMsgLiveInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchorAvatar":
                    bLiveChatRealMsgLiveInfo.anchorAvatar = jsonParser.getValueAsString();
                    return true;
                case "anchorName":
                    bLiveChatRealMsgLiveInfo.anchorName = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveChatRealMsgLiveInfo.type = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveChatRealMsgLiveInfo.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatRealMsgLiveInfo bLiveChatRealMsgLiveInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveChatRealMsgLiveInfo.anchorName;
            if (str != null) {
                jsonGenerator.writeStringField("anchorName", str);
            }
            String str2 = bLiveChatRealMsgLiveInfo.anchorAvatar;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorAvatar", str2);
            }
            String str3 = bLiveChatRealMsgLiveInfo.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = bLiveChatRealMsgLiveInfo.title;
            if (str4 != null) {
                jsonGenerator.writeStringField("title", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatRealMsgLiveInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatrealmsgliveinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorAvatar;

    @NonNull
    @ProtobufIndex(index = 1)
    public String anchorName;

    @NonNull
    @ProtobufIndex(index = 4)
    public String title;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    public static BLiveChatRealMsgLiveInfo new_() {
        BLiveChatRealMsgLiveInfo bLiveChatRealMsgLiveInfo = new BLiveChatRealMsgLiveInfo();
        bLiveChatRealMsgLiveInfo.nullCheck();
        return bLiveChatRealMsgLiveInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatRealMsgLiveInfo mo225055clone() {
        BLiveChatRealMsgLiveInfo bLiveChatRealMsgLiveInfo = new BLiveChatRealMsgLiveInfo();
        bLiveChatRealMsgLiveInfo.anchorName = this.anchorName;
        bLiveChatRealMsgLiveInfo.anchorAvatar = this.anchorAvatar;
        bLiveChatRealMsgLiveInfo.type = this.type;
        bLiveChatRealMsgLiveInfo.title = this.title;
        return bLiveChatRealMsgLiveInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatRealMsgLiveInfo)) {
            return false;
        }
        BLiveChatRealMsgLiveInfo bLiveChatRealMsgLiveInfo = (BLiveChatRealMsgLiveInfo) obj;
        return ValueObject.util_equals(this.anchorName, bLiveChatRealMsgLiveInfo.anchorName) && ValueObject.util_equals(this.anchorAvatar, bLiveChatRealMsgLiveInfo.anchorAvatar) && ValueObject.util_equals(this.type, bLiveChatRealMsgLiveInfo.type) && ValueObject.util_equals(this.title, bLiveChatRealMsgLiveInfo.title);
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
        String str = this.anchorName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.anchorAvatar;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.anchorName == null) {
            this.anchorName = "";
        }
        if (this.anchorAvatar == null) {
            this.anchorAvatar = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
