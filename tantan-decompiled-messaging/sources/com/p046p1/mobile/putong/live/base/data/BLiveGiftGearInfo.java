package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
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
public class BLiveGiftGearInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftGearInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftGearInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftGearInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftGearInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftGearInfo newInstance() {
            return new BLiveGiftGearInfo();
        }

        public boolean parseField(BLiveGiftGearInfo bLiveGiftGearInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("gearEffects")) {
                return false;
            }
            bLiveGiftGearInfo.gearEffects = JsonAdapter.parseArray(jsonParser, BLiveGiftGearEffectInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftGearInfo bLiveGiftGearInfo, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveGiftGearInfo.gearEffects != null) {
                jsonGenerator.writeFieldName("gearEffects");
                JsonAdapter.serializeArray(bLiveGiftGearInfo.gearEffects, jsonGenerator, BLiveGiftGearEffectInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftGearInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftgearinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveGiftGearEffectInfo> gearEffects;

    public static BLiveGiftGearInfo new_() {
        BLiveGiftGearInfo bLiveGiftGearInfo = new BLiveGiftGearInfo();
        bLiveGiftGearInfo.nullCheck();
        return bLiveGiftGearInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftGearInfo mo223809clone() {
        BLiveGiftGearInfo bLiveGiftGearInfo = new BLiveGiftGearInfo();
        List<BLiveGiftGearEffectInfo> list = this.gearEffects;
        if (list != null) {
            bLiveGiftGearInfo.gearEffects = ValueObject.util_map(list, new w9j() { // from class: l.i02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveGiftGearEffectInfo) obj).mo223809clone();
                }
            });
        }
        return bLiveGiftGearInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveGiftGearInfo) {
            return ValueObject.util_equals(this.gearEffects, ((BLiveGiftGearInfo) obj).gearEffects);
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
        List<BLiveGiftGearEffectInfo> list = this.gearEffects;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.gearEffects == null) {
            this.gearEffects = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
