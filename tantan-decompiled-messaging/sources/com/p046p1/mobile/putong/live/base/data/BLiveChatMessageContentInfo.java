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
public class BLiveChatMessageContentInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatMessageContentInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatMessageContentInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatMessageContentInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatMessageContentInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatMessageContentInfo newInstance() {
            return new BLiveChatMessageContentInfo();
        }

        public boolean parseField(BLiveChatMessageContentInfo bLiveChatMessageContentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("groupType")) {
                bLiveChatMessageContentInfo.groupType = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("message")) {
                return false;
            }
            bLiveChatMessageContentInfo.message = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatMessageContentInfo bLiveChatMessageContentInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveChatMessageContentInfo.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
            String str2 = bLiveChatMessageContentInfo.groupType;
            if (str2 != null) {
                jsonGenerator.writeStringField("groupType", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatMessageContentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatmessagecontentinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String groupType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String message;

    public static BLiveChatMessageContentInfo new_() {
        BLiveChatMessageContentInfo bLiveChatMessageContentInfo = new BLiveChatMessageContentInfo();
        bLiveChatMessageContentInfo.nullCheck();
        return bLiveChatMessageContentInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatMessageContentInfo mo223809clone() {
        BLiveChatMessageContentInfo bLiveChatMessageContentInfo = new BLiveChatMessageContentInfo();
        bLiveChatMessageContentInfo.message = this.message;
        bLiveChatMessageContentInfo.groupType = this.groupType;
        return bLiveChatMessageContentInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatMessageContentInfo)) {
            return false;
        }
        BLiveChatMessageContentInfo bLiveChatMessageContentInfo = (BLiveChatMessageContentInfo) obj;
        return ValueObject.util_equals(this.message, bLiveChatMessageContentInfo.message) && ValueObject.util_equals(this.groupType, bLiveChatMessageContentInfo.groupType);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getMessageOnly() {
        return this.message;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.message;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.groupType;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.message == null) {
            this.message = "";
        }
        if (this.groupType == null) {
            this.groupType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
