package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveTaskSummary;
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
public class BLiveTaskSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTaskSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTaskSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTaskSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTaskSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTaskSummary newInstance() {
            return new BLiveTaskSummary();
        }

        public boolean parseField(BLiveTaskSummary bLiveTaskSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fields":
                    bLiveTaskSummary.fields = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "scheme":
                    bLiveTaskSummary.scheme = jsonParser.getValueAsString();
                    return true;
                case "backgroundColor":
                    bLiveTaskSummary.backgroundColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTaskSummary bLiveTaskSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveTaskSummary.backgroundColor;
            if (str != null) {
                jsonGenerator.writeStringField("backgroundColor", str);
            }
            String str2 = bLiveTaskSummary.scheme;
            if (str2 != null) {
                jsonGenerator.writeStringField(BLiveOperationClickAction.scheme, str2);
            }
            if (bLiveTaskSummary.fields != null) {
                jsonGenerator.writeFieldName("fields");
                JsonAdapter.serializeArray(bLiveTaskSummary.fields, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTaskSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetasksummary";

    @NonNull
    @ProtobufIndex(index = 1)
    public String backgroundColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> fields;

    @NonNull
    @ProtobufIndex(index = 2)
    public String scheme;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68263a(String str) {
        return str;
    }

    public static BLiveTaskSummary new_() {
        BLiveTaskSummary bLiveTaskSummary = new BLiveTaskSummary();
        bLiveTaskSummary.nullCheck();
        return bLiveTaskSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTaskSummary mo223809clone() {
        BLiveTaskSummary bLiveTaskSummary = new BLiveTaskSummary();
        bLiveTaskSummary.backgroundColor = this.backgroundColor;
        bLiveTaskSummary.scheme = this.scheme;
        List<String> list = this.fields;
        if (list != null) {
            bLiveTaskSummary.fields = ValueObject.util_map(list, new w9j() { // from class: l.r62
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveTaskSummary.m68263a((String) obj);
                }
            });
        }
        return bLiveTaskSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTaskSummary)) {
            return false;
        }
        BLiveTaskSummary bLiveTaskSummary = (BLiveTaskSummary) obj;
        return ValueObject.util_equals(this.backgroundColor, bLiveTaskSummary.backgroundColor) && ValueObject.util_equals(this.scheme, bLiveTaskSummary.scheme) && ValueObject.util_equals(this.fields, bLiveTaskSummary.fields);
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
        String str = this.backgroundColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.scheme;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.fields;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.backgroundColor == null) {
            this.backgroundColor = "";
        }
        if (this.scheme == null) {
            this.scheme = "";
        }
        if (this.fields == null) {
            this.fields = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
