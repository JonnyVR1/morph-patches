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
public class BLiveFakeAlert extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFakeAlert> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFakeAlert>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFakeAlert.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFakeAlert.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFakeAlert newInstance() {
            return new BLiveFakeAlert();
        }

        public boolean parseField(BLiveFakeAlert bLiveFakeAlert, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("title")) {
                return false;
            }
            bLiveFakeAlert.title = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFakeAlert bLiveFakeAlert, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFakeAlert.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFakeAlert) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefakealert";

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLiveFakeAlert new_() {
        BLiveFakeAlert bLiveFakeAlert = new BLiveFakeAlert();
        bLiveFakeAlert.nullCheck();
        return bLiveFakeAlert;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFakeAlert mo223809clone() {
        BLiveFakeAlert bLiveFakeAlert = new BLiveFakeAlert();
        bLiveFakeAlert.title = this.title;
        return bLiveFakeAlert;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveFakeAlert) {
            return ValueObject.util_equals(this.title, ((BLiveFakeAlert) obj).title);
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
        String str = this.title;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
