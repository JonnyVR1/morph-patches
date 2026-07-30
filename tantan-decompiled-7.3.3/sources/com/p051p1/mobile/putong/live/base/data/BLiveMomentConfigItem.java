package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.Grade;
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
public class BLiveMomentConfigItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMomentConfigItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMomentConfigItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMomentConfigItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMomentConfigItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMomentConfigItem newInstance() {
            return new BLiveMomentConfigItem();
        }

        public boolean parseField(BLiveMomentConfigItem bLiveMomentConfigItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                bLiveMomentConfigItem.text = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(Grade.TYPE)) {
                return false;
            }
            bLiveMomentConfigItem.grade = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMomentConfigItem bLiveMomentConfigItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveMomentConfigItem.grade);
            String str = bLiveMomentConfigItem.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMomentConfigItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemomentconfigitem";

    @ProtobufIndex(index = 1)
    public int grade;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    public static BLiveMomentConfigItem new_() {
        BLiveMomentConfigItem bLiveMomentConfigItem = new BLiveMomentConfigItem();
        bLiveMomentConfigItem.nullCheck();
        return bLiveMomentConfigItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMomentConfigItem mo225055clone() {
        BLiveMomentConfigItem bLiveMomentConfigItem = new BLiveMomentConfigItem();
        bLiveMomentConfigItem.grade = this.grade;
        bLiveMomentConfigItem.text = this.text;
        return bLiveMomentConfigItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMomentConfigItem)) {
            return false;
        }
        BLiveMomentConfigItem bLiveMomentConfigItem = (BLiveMomentConfigItem) obj;
        return this.grade == bLiveMomentConfigItem.grade && ValueObject.util_equals(this.text, bLiveMomentConfigItem.text);
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
        String str = this.text;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
