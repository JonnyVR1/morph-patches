package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.Grade;
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
public class BLiveUserWealthHierarchy extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserWealthHierarchy> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserWealthHierarchy>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserWealthHierarchy.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserWealthHierarchy.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserWealthHierarchy newInstance() {
            return new BLiveUserWealthHierarchy();
        }

        public boolean parseField(BLiveUserWealthHierarchy bLiveUserWealthHierarchy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("icon")) {
                bLiveUserWealthHierarchy.icon = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(Grade.TYPE)) {
                return false;
            }
            bLiveUserWealthHierarchy.grade = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserWealthHierarchy bLiveUserWealthHierarchy, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveUserWealthHierarchy.grade);
            String str = bLiveUserWealthHierarchy.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserWealthHierarchy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveuserwealthhierarchy";

    @ProtobufIndex(index = 1)
    public int grade;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    public static BLiveUserWealthHierarchy new_() {
        BLiveUserWealthHierarchy bLiveUserWealthHierarchy = new BLiveUserWealthHierarchy();
        bLiveUserWealthHierarchy.nullCheck();
        return bLiveUserWealthHierarchy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserWealthHierarchy mo223809clone() {
        BLiveUserWealthHierarchy bLiveUserWealthHierarchy = new BLiveUserWealthHierarchy();
        bLiveUserWealthHierarchy.grade = this.grade;
        bLiveUserWealthHierarchy.icon = this.icon;
        return bLiveUserWealthHierarchy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserWealthHierarchy)) {
            return false;
        }
        BLiveUserWealthHierarchy bLiveUserWealthHierarchy = (BLiveUserWealthHierarchy) obj;
        return this.grade == bLiveUserWealthHierarchy.grade && ValueObject.util_equals(this.icon, bLiveUserWealthHierarchy.icon);
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
        int i2 = ((i * 41) + this.grade) * 41;
        String str = this.icon;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
