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
public class BLiveAnchorSuggest extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAnchorSuggest> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAnchorSuggest>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAnchorSuggest.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAnchorSuggest.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAnchorSuggest newInstance() {
            return new BLiveAnchorSuggest();
        }

        public boolean parseField(BLiveAnchorSuggest bLiveAnchorSuggest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "on":
                    bLiveAnchorSuggest.f44332on = jsonParser.getValueAsBoolean();
                    return true;
                case "rowIndex":
                    bLiveAnchorSuggest.rowIndex = jsonParser.getValueAsInt();
                    return true;
                case "title":
                    bLiveAnchorSuggest.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAnchorSuggest bLiveAnchorSuggest, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("on", bLiveAnchorSuggest.f44332on);
            jsonGenerator.writeNumberField("rowIndex", bLiveAnchorSuggest.rowIndex);
            String str = bLiveAnchorSuggest.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAnchorSuggest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveanchorsuggest";

    /* JADX INFO: renamed from: on */
    @ProtobufIndex(index = 1)
    public boolean f44332on;

    @ProtobufIndex(index = 2)
    public int rowIndex;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    public static BLiveAnchorSuggest new_() {
        BLiveAnchorSuggest bLiveAnchorSuggest = new BLiveAnchorSuggest();
        bLiveAnchorSuggest.nullCheck();
        return bLiveAnchorSuggest;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAnchorSuggest mo223809clone() {
        BLiveAnchorSuggest bLiveAnchorSuggest = new BLiveAnchorSuggest();
        bLiveAnchorSuggest.f44332on = this.f44332on;
        bLiveAnchorSuggest.rowIndex = this.rowIndex;
        bLiveAnchorSuggest.title = this.title;
        return bLiveAnchorSuggest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAnchorSuggest)) {
            return false;
        }
        BLiveAnchorSuggest bLiveAnchorSuggest = (BLiveAnchorSuggest) obj;
        return this.f44332on == bLiveAnchorSuggest.f44332on && this.rowIndex == bLiveAnchorSuggest.rowIndex && ValueObject.util_equals(this.title, bLiveAnchorSuggest.title);
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
        int i2 = ((((i * 41) + (this.f44332on ? 1231 : 1237)) * 41) + this.rowIndex) * 41;
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
