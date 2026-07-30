package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveExpirationItem;
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
public class BLiveTabGiftExpiration extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTabGiftExpiration> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTabGiftExpiration>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTabGiftExpiration.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTabGiftExpiration.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTabGiftExpiration newInstance() {
            return new BLiveTabGiftExpiration();
        }

        public boolean parseField(BLiveTabGiftExpiration bLiveTabGiftExpiration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "remain":
                    bLiveTabGiftExpiration.remain = jsonParser.getValueAsInt();
                    return true;
                case "expirationInfos":
                    bLiveTabGiftExpiration.expirationInfos = JsonAdapter.parseArray(jsonParser, BLiveExpirationItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "latestExpiredTime":
                    bLiveTabGiftExpiration.latestExpiredTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTabGiftExpiration bLiveTabGiftExpiration, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remain", bLiveTabGiftExpiration.remain);
            jsonGenerator.writeNumberField("latestExpiredTime", bLiveTabGiftExpiration.latestExpiredTime);
            if (bLiveTabGiftExpiration.expirationInfos != null) {
                jsonGenerator.writeFieldName("expirationInfos");
                JsonAdapter.serializeArray(bLiveTabGiftExpiration.expirationInfos, jsonGenerator, BLiveExpirationItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTabGiftExpiration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetabgiftexpiration";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveExpirationItem> expirationInfos;

    @ProtobufIndex(index = 2)
    public long latestExpiredTime;

    @ProtobufIndex(index = 1)
    public int remain;

    public static BLiveTabGiftExpiration new_() {
        BLiveTabGiftExpiration bLiveTabGiftExpiration = new BLiveTabGiftExpiration();
        bLiveTabGiftExpiration.nullCheck();
        return bLiveTabGiftExpiration;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTabGiftExpiration mo225055clone() {
        BLiveTabGiftExpiration bLiveTabGiftExpiration = new BLiveTabGiftExpiration();
        bLiveTabGiftExpiration.remain = this.remain;
        bLiveTabGiftExpiration.latestExpiredTime = this.latestExpiredTime;
        List<BLiveExpirationItem> list = this.expirationInfos;
        if (list != null) {
            bLiveTabGiftExpiration.expirationInfos = ValueObject.util_map(list, new qcj() { // from class: l.v62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveExpirationItem) obj).mo225055clone();
                }
            });
        }
        return bLiveTabGiftExpiration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTabGiftExpiration)) {
            return false;
        }
        BLiveTabGiftExpiration bLiveTabGiftExpiration = (BLiveTabGiftExpiration) obj;
        return this.remain == bLiveTabGiftExpiration.remain && this.latestExpiredTime == bLiveTabGiftExpiration.latestExpiredTime && ValueObject.util_equals(this.expirationInfos, bLiveTabGiftExpiration.expirationInfos);
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
        int i2 = ((i * 41) + this.remain) * 41;
        long j = this.latestExpiredTime;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 41;
        List<BLiveExpirationItem> list = this.expirationInfos;
        int iHashCode = i3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.expirationInfos == null) {
            this.expirationInfos = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
