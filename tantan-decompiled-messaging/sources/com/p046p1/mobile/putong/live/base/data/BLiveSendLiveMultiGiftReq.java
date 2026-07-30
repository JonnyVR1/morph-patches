package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftReqItem;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSendLiveMultiGiftReq extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSendLiveMultiGiftReq> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSendLiveMultiGiftReq>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftReq.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSendLiveMultiGiftReq.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSendLiveMultiGiftReq newInstance() {
            return new BLiveSendLiveMultiGiftReq();
        }

        public boolean parseField(BLiveSendLiveMultiGiftReq bLiveSendLiveMultiGiftReq, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("originalId")) {
                bLiveSendLiveMultiGiftReq.originalId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("givenGifts")) {
                return false;
            }
            bLiveSendLiveMultiGiftReq.givenGifts = JsonAdapter.parseArray(jsonParser, BLiveSendLiveMultiGiftReqItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSendLiveMultiGiftReq bLiveSendLiveMultiGiftReq, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveSendLiveMultiGiftReq.givenGifts != null) {
                jsonGenerator.writeFieldName("givenGifts");
                JsonAdapter.serializeArray(bLiveSendLiveMultiGiftReq.givenGifts, jsonGenerator, BLiveSendLiveMultiGiftReqItem.JSON_ADAPTER);
            }
            String str = bLiveSendLiveMultiGiftReq.originalId;
            if (str != null) {
                jsonGenerator.writeStringField("originalId", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSendLiveMultiGiftReq) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesendlivemultigiftreq";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveSendLiveMultiGiftReqItem> givenGifts;

    @NonNull
    @ProtobufIndex(index = 2)
    public String originalId;

    public static BLiveSendLiveMultiGiftReq new_() {
        BLiveSendLiveMultiGiftReq bLiveSendLiveMultiGiftReq = new BLiveSendLiveMultiGiftReq();
        bLiveSendLiveMultiGiftReq.nullCheck();
        return bLiveSendLiveMultiGiftReq;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSendLiveMultiGiftReq mo223809clone() {
        BLiveSendLiveMultiGiftReq bLiveSendLiveMultiGiftReq = new BLiveSendLiveMultiGiftReq();
        List<BLiveSendLiveMultiGiftReqItem> list = this.givenGifts;
        if (list != null) {
            bLiveSendLiveMultiGiftReq.givenGifts = ValueObject.util_map(list, new w9j() { // from class: l.h52
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSendLiveMultiGiftReqItem) obj).mo223809clone();
                }
            });
        }
        bLiveSendLiveMultiGiftReq.originalId = this.originalId;
        return bLiveSendLiveMultiGiftReq;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSendLiveMultiGiftReq)) {
            return false;
        }
        BLiveSendLiveMultiGiftReq bLiveSendLiveMultiGiftReq = (BLiveSendLiveMultiGiftReq) obj;
        return ValueObject.util_equals(this.givenGifts, bLiveSendLiveMultiGiftReq.givenGifts) && ValueObject.util_equals(this.originalId, bLiveSendLiveMultiGiftReq.originalId);
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
        List<BLiveSendLiveMultiGiftReqItem> list = this.givenGifts;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.originalId;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.givenGifts == null) {
            this.givenGifts = new ArrayList();
        }
        if (this.originalId == null) {
            this.originalId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
