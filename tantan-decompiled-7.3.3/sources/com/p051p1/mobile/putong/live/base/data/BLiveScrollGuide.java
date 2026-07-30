package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveScrollGuide;
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
public class BLiveScrollGuide extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveScrollGuide> JSON_ADAPTER = new ObjectJsonAdapter<BLiveScrollGuide>() { // from class: com.p1.mobile.putong.live.base.data.BLiveScrollGuide.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveScrollGuide.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveScrollGuide newInstance() {
            return new BLiveScrollGuide();
        }

        public boolean parseField(BLiveScrollGuide bLiveScrollGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "intervalDays":
                    bLiveScrollGuide.intervalDays = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "animationInterval":
                    bLiveScrollGuide.animationInterval = jsonParser.getValueAsInt();
                    return true;
                case "maxShowTimes":
                    bLiveScrollGuide.maxShowTimes = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveScrollGuide bLiveScrollGuide, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("animationInterval", bLiveScrollGuide.animationInterval);
            if (bLiveScrollGuide.intervalDays != null) {
                jsonGenerator.writeFieldName("intervalDays");
                JsonAdapter.serializeArray(bLiveScrollGuide.intervalDays, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("maxShowTimes", bLiveScrollGuide.maxShowTimes);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveScrollGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivescrollguide";

    @ProtobufIndex(index = 1)
    public int animationInterval;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Integer> intervalDays;

    @ProtobufIndex(index = 3)
    public int maxShowTimes;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m69390a(Integer num) {
        return num;
    }

    public static BLiveScrollGuide new_() {
        BLiveScrollGuide bLiveScrollGuide = new BLiveScrollGuide();
        bLiveScrollGuide.nullCheck();
        return bLiveScrollGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveScrollGuide mo225055clone() {
        BLiveScrollGuide bLiveScrollGuide = new BLiveScrollGuide();
        bLiveScrollGuide.animationInterval = this.animationInterval;
        List<Integer> list = this.intervalDays;
        if (list != null) {
            bLiveScrollGuide.intervalDays = ValueObject.util_map(list, new qcj() { // from class: l.m52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveScrollGuide.m69390a((Integer) obj);
                }
            });
        }
        bLiveScrollGuide.maxShowTimes = this.maxShowTimes;
        return bLiveScrollGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveScrollGuide)) {
            return false;
        }
        BLiveScrollGuide bLiveScrollGuide = (BLiveScrollGuide) obj;
        return this.animationInterval == bLiveScrollGuide.animationInterval && ValueObject.util_equals(this.intervalDays, bLiveScrollGuide.intervalDays) && this.maxShowTimes == bLiveScrollGuide.maxShowTimes;
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
        int i2 = ((i * 41) + this.animationInterval) * 41;
        List<Integer> list = this.intervalDays;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.maxShowTimes;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.intervalDays == null) {
            this.intervalDays = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
