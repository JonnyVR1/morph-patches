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
public class BLiveOperationItemTitleTextRules extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationItemTitleTextRules> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationItemTitleTextRules>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationItemTitleTextRules.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationItemTitleTextRules.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationItemTitleTextRules newInstance() {
            return new BLiveOperationItemTitleTextRules();
        }

        public boolean parseField(BLiveOperationItemTitleTextRules bLiveOperationItemTitleTextRules, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("fadingSeconds")) {
                bLiveOperationItemTitleTextRules.fadingSeconds = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("showType")) {
                return false;
            }
            bLiveOperationItemTitleTextRules.showType = BLiveOperationTitleShowType.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationItemTitleTextRules bLiveOperationItemTitleTextRules, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveOperationItemTitleTextRules.showType != null) {
                jsonGenerator.writeFieldName("showType");
                BLiveOperationTitleShowType.JSON_ADAPTER.serialize(bLiveOperationItemTitleTextRules.showType, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("fadingSeconds", bLiveOperationItemTitleTextRules.fadingSeconds);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationItemTitleTextRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationitemtitletextrules";

    @ProtobufIndex(index = 2)
    public long fadingSeconds;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveOperationTitleShowType showType;

    public static BLiveOperationItemTitleTextRules new_() {
        BLiveOperationItemTitleTextRules bLiveOperationItemTitleTextRules = new BLiveOperationItemTitleTextRules();
        bLiveOperationItemTitleTextRules.nullCheck();
        return bLiveOperationItemTitleTextRules;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationItemTitleTextRules mo223809clone() {
        BLiveOperationItemTitleTextRules bLiveOperationItemTitleTextRules = new BLiveOperationItemTitleTextRules();
        bLiveOperationItemTitleTextRules.showType = this.showType;
        bLiveOperationItemTitleTextRules.fadingSeconds = this.fadingSeconds;
        return bLiveOperationItemTitleTextRules;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationItemTitleTextRules)) {
            return false;
        }
        BLiveOperationItemTitleTextRules bLiveOperationItemTitleTextRules = (BLiveOperationItemTitleTextRules) obj;
        return ValueObject.util_equals(this.showType, bLiveOperationItemTitleTextRules.showType) && this.fadingSeconds == bLiveOperationItemTitleTextRules.fadingSeconds;
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
        BLiveOperationTitleShowType bLiveOperationTitleShowType = this.showType;
        int iHashCode = (i2 + (bLiveOperationTitleShowType != null ? bLiveOperationTitleShowType.hashCode() : 0)) * 41;
        long j = this.fadingSeconds;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.showType == null) {
            this.showType = (BLiveOperationTitleShowType) BLiveOperationTitleShowType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
