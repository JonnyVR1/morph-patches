package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class BLiveVoiceChatGroupApply extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceChatGroupApply> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceChatGroupApply>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceChatGroupApply.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceChatGroupApply.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceChatGroupApply newInstance() {
            return new BLiveVoiceChatGroupApply();
        }

        public boolean parseField(BLiveVoiceChatGroupApply bLiveVoiceChatGroupApply, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    bLiveVoiceChatGroupApply.status = BLiveCoiceChatGroupApplyStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "userId":
                    bLiveVoiceChatGroupApply.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVoiceChatGroupApply.f44492id = jsonParser.getValueAsString();
                    return false;
                case "mask":
                    bLiveVoiceChatGroupApply.mask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceChatGroupApply bLiveVoiceChatGroupApply, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceChatGroupApply.f44492id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceChatGroupApply.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            if (bLiveVoiceChatGroupApply.mask != null) {
                jsonGenerator.writeFieldName("mask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveVoiceChatGroupApply.mask, jsonGenerator, true);
            }
            if (bLiveVoiceChatGroupApply.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BLiveCoiceChatGroupApplyStatus.JSON_ADAPTER.serialize(bLiveVoiceChatGroupApply.status, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceChatGroupApply) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicechatgroupapply";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44492id;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveUserMask mask;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveCoiceChatGroupApplyStatus status;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    public static BLiveVoiceChatGroupApply new_() {
        BLiveVoiceChatGroupApply bLiveVoiceChatGroupApply = new BLiveVoiceChatGroupApply();
        bLiveVoiceChatGroupApply.nullCheck();
        return bLiveVoiceChatGroupApply;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceChatGroupApply mo223809clone() {
        BLiveVoiceChatGroupApply bLiveVoiceChatGroupApply = new BLiveVoiceChatGroupApply();
        bLiveVoiceChatGroupApply.f44492id = this.f44492id;
        bLiveVoiceChatGroupApply.userId = this.userId;
        BLiveUserMask bLiveUserMask = this.mask;
        if (bLiveUserMask != null) {
            bLiveVoiceChatGroupApply.mask = bLiveUserMask.mo223809clone();
        }
        bLiveVoiceChatGroupApply.status = this.status;
        return bLiveVoiceChatGroupApply;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceChatGroupApply)) {
            return false;
        }
        BLiveVoiceChatGroupApply bLiveVoiceChatGroupApply = (BLiveVoiceChatGroupApply) obj;
        return ValueObject.util_equals(this.f44492id, bLiveVoiceChatGroupApply.f44492id) && ValueObject.util_equals(this.userId, bLiveVoiceChatGroupApply.userId) && ValueObject.util_equals(this.mask, bLiveVoiceChatGroupApply.mask) && ValueObject.util_equals(this.status, bLiveVoiceChatGroupApply.status);
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
        String str = this.f44492id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask = this.mask;
        int iHashCode3 = (iHashCode2 + (bLiveUserMask != null ? bLiveUserMask.hashCode() : 0)) * 41;
        BLiveCoiceChatGroupApplyStatus bLiveCoiceChatGroupApplyStatus = this.status;
        int iHashCode4 = iHashCode3 + (bLiveCoiceChatGroupApplyStatus != null ? bLiveCoiceChatGroupApplyStatus.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44492id == null) {
            this.f44492id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.mask == null) {
            this.mask = BLiveUserMask.new_();
        }
        if (this.status == null) {
            this.status = (BLiveCoiceChatGroupApplyStatus) BLiveCoiceChatGroupApplyStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
