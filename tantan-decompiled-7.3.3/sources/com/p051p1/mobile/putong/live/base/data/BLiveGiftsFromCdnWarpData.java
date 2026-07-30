package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGiftsFromCdnWarpData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftsFromCdnWarpData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftsFromCdnWarpData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftsFromCdnWarpData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftsFromCdnWarpData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftsFromCdnWarpData newInstance() {
            return new BLiveGiftsFromCdnWarpData();
        }

        public boolean parseField(BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "version":
                    bLiveGiftsFromCdnWarpData.version = jsonParser.getValueAsString();
                    return true;
                case "giftList":
                    bLiveGiftsFromCdnWarpData.giftList = JsonAdapter.parseArray(jsonParser, BLiveGiftItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "serverRegion":
                    bLiveGiftsFromCdnWarpData.serverRegion = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveGiftsFromCdnWarpData.giftList != null) {
                jsonGenerator.writeFieldName("giftList");
                JsonAdapter.serializeArray(bLiveGiftsFromCdnWarpData.giftList, jsonGenerator, BLiveGiftItem.JSON_ADAPTER);
            }
            String str = bLiveGiftsFromCdnWarpData.serverRegion;
            if (str != null) {
                jsonGenerator.writeStringField("serverRegion", str);
            }
            String str2 = bLiveGiftsFromCdnWarpData.version;
            if (str2 != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftsFromCdnWarpData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftsfromcdnwarpdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveGiftItem> giftList;

    @NonNull
    @ProtobufIndex(index = 2)
    public String serverRegion;

    @NonNull
    @ProtobufIndex(index = 3)
    public String version;

    public static BLiveGiftsFromCdnWarpData new_() {
        BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData = new BLiveGiftsFromCdnWarpData();
        bLiveGiftsFromCdnWarpData.nullCheck();
        return bLiveGiftsFromCdnWarpData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftsFromCdnWarpData mo225055clone() {
        BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData = new BLiveGiftsFromCdnWarpData();
        List<BLiveGiftItem> list = this.giftList;
        if (list != null) {
            bLiveGiftsFromCdnWarpData.giftList = ValueObject.util_map(list, new qcj() { // from class: l.g12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGiftItem) obj).mo225055clone();
                }
            });
        }
        bLiveGiftsFromCdnWarpData.serverRegion = this.serverRegion;
        bLiveGiftsFromCdnWarpData.version = this.version;
        return bLiveGiftsFromCdnWarpData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftsFromCdnWarpData)) {
            return false;
        }
        BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData = (BLiveGiftsFromCdnWarpData) obj;
        return ValueObject.util_equals(this.giftList, bLiveGiftsFromCdnWarpData.giftList) && ValueObject.util_equals(this.serverRegion, bLiveGiftsFromCdnWarpData.serverRegion) && ValueObject.util_equals(this.version, bLiveGiftsFromCdnWarpData.version);
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
        List<BLiveGiftItem> list = this.giftList;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.serverRegion;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.version;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftList == null) {
            this.giftList = new ArrayList();
        }
        if (this.serverRegion == null) {
            this.serverRegion = "";
        }
        if (this.version == null) {
            this.version = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
