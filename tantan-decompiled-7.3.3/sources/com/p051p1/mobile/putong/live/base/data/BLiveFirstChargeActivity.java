package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveFirstChargeActivity extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFirstChargeActivity> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFirstChargeActivity>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFirstChargeActivity.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFirstChargeActivity.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFirstChargeActivity newInstance() {
            return new BLiveFirstChargeActivity();
        }

        public boolean parseField(BLiveFirstChargeActivity bLiveFirstChargeActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    bLiveFirstChargeActivity.subtitle = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveFirstChargeActivity.f45217id = jsonParser.getValueAsString();
                    return false;
                case "title":
                    bLiveFirstChargeActivity.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFirstChargeActivity bLiveFirstChargeActivity, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFirstChargeActivity.f45217id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveFirstChargeActivity.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveFirstChargeActivity.subtitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subtitle", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFirstChargeActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefirstchargeactivity";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45217id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveFirstChargeActivity new_() {
        BLiveFirstChargeActivity bLiveFirstChargeActivity = new BLiveFirstChargeActivity();
        bLiveFirstChargeActivity.nullCheck();
        return bLiveFirstChargeActivity;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFirstChargeActivity mo225055clone() {
        BLiveFirstChargeActivity bLiveFirstChargeActivity = new BLiveFirstChargeActivity();
        bLiveFirstChargeActivity.f45217id = this.f45217id;
        bLiveFirstChargeActivity.title = this.title;
        bLiveFirstChargeActivity.subtitle = this.subtitle;
        return bLiveFirstChargeActivity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFirstChargeActivity)) {
            return false;
        }
        BLiveFirstChargeActivity bLiveFirstChargeActivity = (BLiveFirstChargeActivity) obj;
        return ValueObject.util_equals(this.f45217id, bLiveFirstChargeActivity.f45217id) && ValueObject.util_equals(this.title, bLiveFirstChargeActivity.title) && ValueObject.util_equals(this.subtitle, bLiveFirstChargeActivity.subtitle);
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
        String str = this.f45217id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subtitle;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45217id == null) {
            this.f45217id = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
