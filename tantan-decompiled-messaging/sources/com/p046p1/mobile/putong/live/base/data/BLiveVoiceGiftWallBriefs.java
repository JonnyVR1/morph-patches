package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
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
public class BLiveVoiceGiftWallBriefs extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceGiftWallBriefs> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceGiftWallBriefs>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBriefs.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceGiftWallBriefs.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceGiftWallBriefs newInstance() {
            return new BLiveVoiceGiftWallBriefs();
        }

        public boolean parseField(BLiveVoiceGiftWallBriefs bLiveVoiceGiftWallBriefs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("gifts")) {
                return false;
            }
            bLiveVoiceGiftWallBriefs.gifts = JsonAdapter.parseArray(jsonParser, BLiveVoiceGiftItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceGiftWallBriefs bLiveVoiceGiftWallBriefs, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceGiftWallBriefs.gifts != null) {
                jsonGenerator.writeFieldName("gifts");
                JsonAdapter.serializeArray(bLiveVoiceGiftWallBriefs.gifts, jsonGenerator, BLiveVoiceGiftItem.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceGiftWallBriefs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicegiftwallbriefs";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveVoiceGiftItem> gifts;

    public static BLiveVoiceGiftWallBriefs new_() {
        BLiveVoiceGiftWallBriefs bLiveVoiceGiftWallBriefs = new BLiveVoiceGiftWallBriefs();
        bLiveVoiceGiftWallBriefs.nullCheck();
        return bLiveVoiceGiftWallBriefs;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceGiftWallBriefs mo223809clone() {
        BLiveVoiceGiftWallBriefs bLiveVoiceGiftWallBriefs = new BLiveVoiceGiftWallBriefs();
        List<BLiveVoiceGiftItem> list = this.gifts;
        if (list != null) {
            bLiveVoiceGiftWallBriefs.gifts = ValueObject.util_map(list, new w9j() { // from class: l.v82
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceGiftItem) obj).mo223809clone();
                }
            });
        }
        return bLiveVoiceGiftWallBriefs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveVoiceGiftWallBriefs) {
            return ValueObject.util_equals(this.gifts, ((BLiveVoiceGiftWallBriefs) obj).gifts);
        }
        return false;
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
        List<BLiveVoiceGiftItem> list = this.gifts;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.gifts == null) {
            this.gifts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
