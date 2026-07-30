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
public class BLiveLuckyGiftInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLuckyGiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLuckyGiftInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLuckyGiftInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLuckyGiftInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLuckyGiftInfo newInstance() {
            return new BLiveLuckyGiftInfo();
        }

        public boolean parseField(BLiveLuckyGiftInfo bLiveLuckyGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftItemId":
                    bLiveLuckyGiftInfo.giftItemId = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    bLiveLuckyGiftInfo.f44396id = jsonParser.getValueAsInt();
                    return false;
                case "giftPicUrl":
                    bLiveLuckyGiftInfo.giftPicUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLuckyGiftInfo bLiveLuckyGiftInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveLuckyGiftInfo.f44396id);
            jsonGenerator.writeNumberField("giftItemId", bLiveLuckyGiftInfo.giftItemId);
            String str = bLiveLuckyGiftInfo.giftPicUrl;
            if (str != null) {
                jsonGenerator.writeStringField("giftPicUrl", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLuckyGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveluckygiftinfo";

    @ProtobufIndex(index = 2)
    public int giftItemId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftPicUrl;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f44396id;

    public static BLiveLuckyGiftInfo new_() {
        BLiveLuckyGiftInfo bLiveLuckyGiftInfo = new BLiveLuckyGiftInfo();
        bLiveLuckyGiftInfo.nullCheck();
        return bLiveLuckyGiftInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLuckyGiftInfo mo223809clone() {
        BLiveLuckyGiftInfo bLiveLuckyGiftInfo = new BLiveLuckyGiftInfo();
        bLiveLuckyGiftInfo.f44396id = this.f44396id;
        bLiveLuckyGiftInfo.giftItemId = this.giftItemId;
        bLiveLuckyGiftInfo.giftPicUrl = this.giftPicUrl;
        return bLiveLuckyGiftInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLuckyGiftInfo)) {
            return false;
        }
        BLiveLuckyGiftInfo bLiveLuckyGiftInfo = (BLiveLuckyGiftInfo) obj;
        return this.f44396id == bLiveLuckyGiftInfo.f44396id && this.giftItemId == bLiveLuckyGiftInfo.giftItemId && ValueObject.util_equals(this.giftPicUrl, bLiveLuckyGiftInfo.giftPicUrl);
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
        int i2 = ((((i * 41) + this.f44396id) * 41) + this.giftItemId) * 41;
        String str = this.giftPicUrl;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftPicUrl == null) {
            this.giftPicUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
