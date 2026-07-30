package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButtonDivision;
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
public class BLiveBottomButtonDivision extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBottomButtonDivision> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBottomButtonDivision>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBottomButtonDivision.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBottomButtonDivision.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBottomButtonDivision newInstance() {
            return new BLiveBottomButtonDivision();
        }

        public boolean parseField(BLiveBottomButtonDivision bLiveBottomButtonDivision, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "settingZone":
                    bLiveBottomButtonDivision.settingZone = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "quickZone":
                    bLiveBottomButtonDivision.quickZone = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "inputZone":
                    bLiveBottomButtonDivision.inputZone = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBottomButtonDivision bLiveBottomButtonDivision, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveBottomButtonDivision.inputZone != null) {
                jsonGenerator.writeFieldName("inputZone");
                JsonAdapter.serializeArray(bLiveBottomButtonDivision.inputZone, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (bLiveBottomButtonDivision.quickZone != null) {
                jsonGenerator.writeFieldName("quickZone");
                JsonAdapter.serializeArray(bLiveBottomButtonDivision.quickZone, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (bLiveBottomButtonDivision.settingZone != null) {
                jsonGenerator.writeFieldName("settingZone");
                JsonAdapter.serializeArray(bLiveBottomButtonDivision.settingZone, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBottomButtonDivision) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebottombuttondivision";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Integer> inputZone;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Integer> quickZone;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Integer> settingZone;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m67702a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m67703b(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m67704c(Integer num) {
        return num;
    }

    public static BLiveBottomButtonDivision new_() {
        BLiveBottomButtonDivision bLiveBottomButtonDivision = new BLiveBottomButtonDivision();
        bLiveBottomButtonDivision.nullCheck();
        return bLiveBottomButtonDivision;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBottomButtonDivision mo223809clone() {
        BLiveBottomButtonDivision bLiveBottomButtonDivision = new BLiveBottomButtonDivision();
        List<Integer> list = this.inputZone;
        if (list != null) {
            bLiveBottomButtonDivision.inputZone = ValueObject.util_map(list, new w9j() { // from class: l.ur1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveBottomButtonDivision.m67703b((Integer) obj);
                }
            });
        }
        List<Integer> list2 = this.quickZone;
        if (list2 != null) {
            bLiveBottomButtonDivision.quickZone = ValueObject.util_map(list2, new w9j() { // from class: l.vr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveBottomButtonDivision.m67704c((Integer) obj);
                }
            });
        }
        List<Integer> list3 = this.settingZone;
        if (list3 != null) {
            bLiveBottomButtonDivision.settingZone = ValueObject.util_map(list3, new w9j() { // from class: l.wr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveBottomButtonDivision.m67702a((Integer) obj);
                }
            });
        }
        return bLiveBottomButtonDivision;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBottomButtonDivision)) {
            return false;
        }
        BLiveBottomButtonDivision bLiveBottomButtonDivision = (BLiveBottomButtonDivision) obj;
        return ValueObject.util_equals(this.inputZone, bLiveBottomButtonDivision.inputZone) && ValueObject.util_equals(this.quickZone, bLiveBottomButtonDivision.quickZone) && ValueObject.util_equals(this.settingZone, bLiveBottomButtonDivision.settingZone);
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
        List<Integer> list = this.inputZone;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Integer> list2 = this.quickZone;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<Integer> list3 = this.settingZone;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.inputZone == null) {
            this.inputZone = new ArrayList();
        }
        if (this.quickZone == null) {
            this.quickZone = new ArrayList();
        }
        if (this.settingZone == null) {
            this.settingZone = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
