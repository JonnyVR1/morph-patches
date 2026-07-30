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
public class BLiveUnreadType extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUnreadType> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUnreadType>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUnreadType.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUnreadType.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUnreadType newInstance() {
            return new BLiveUnreadType();
        }

        public boolean parseField(BLiveUnreadType bLiveUnreadType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("activitySummaries")) {
                bLiveUnreadType.activitySummaries = BLiveUnreadTypeEnum.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("liveTab")) {
                return false;
            }
            bLiveUnreadType.liveTab = BLiveUnreadTypeEnum.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUnreadType bLiveUnreadType, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveUnreadType.liveTab != null) {
                jsonGenerator.writeFieldName("liveTab");
                BLiveUnreadTypeEnum.JSON_ADAPTER.serialize(bLiveUnreadType.liveTab, jsonGenerator, true);
            }
            if (bLiveUnreadType.activitySummaries != null) {
                jsonGenerator.writeFieldName("activitySummaries");
                BLiveUnreadTypeEnum.JSON_ADAPTER.serialize(bLiveUnreadType.activitySummaries, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUnreadType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveunreadtype";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveUnreadTypeEnum activitySummaries;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveUnreadTypeEnum liveTab;

    public static BLiveUnreadType new_() {
        BLiveUnreadType bLiveUnreadType = new BLiveUnreadType();
        bLiveUnreadType.nullCheck();
        return bLiveUnreadType;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUnreadType mo223809clone() {
        BLiveUnreadType bLiveUnreadType = new BLiveUnreadType();
        bLiveUnreadType.liveTab = this.liveTab;
        bLiveUnreadType.activitySummaries = this.activitySummaries;
        return bLiveUnreadType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUnreadType)) {
            return false;
        }
        BLiveUnreadType bLiveUnreadType = (BLiveUnreadType) obj;
        return ValueObject.util_equals(this.liveTab, bLiveUnreadType.liveTab) && ValueObject.util_equals(this.activitySummaries, bLiveUnreadType.activitySummaries);
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
        BLiveUnreadTypeEnum bLiveUnreadTypeEnum = this.liveTab;
        int iHashCode = (i2 + (bLiveUnreadTypeEnum != null ? bLiveUnreadTypeEnum.hashCode() : 0)) * 41;
        BLiveUnreadTypeEnum bLiveUnreadTypeEnum2 = this.activitySummaries;
        int iHashCode2 = iHashCode + (bLiveUnreadTypeEnum2 != null ? bLiveUnreadTypeEnum2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveTab == null) {
            this.liveTab = (BLiveUnreadTypeEnum) BLiveUnreadTypeEnum.JSON_ADAPTER.defaultEnum();
        }
        if (this.activitySummaries == null) {
            this.activitySummaries = (BLiveUnreadTypeEnum) BLiveUnreadTypeEnum.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
