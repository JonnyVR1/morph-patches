package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateData;
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
public class BLiveTemplateData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTemplateData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTemplateData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTemplateData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTemplateData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTemplateData newInstance() {
            return new BLiveTemplateData();
        }

        public boolean parseField(BLiveTemplateData bLiveTemplateData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("fields")) {
                bLiveTemplateData.fields = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            bLiveTemplateData.f45306id = jsonParser.getValueAsInt();
            return false;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTemplateData bLiveTemplateData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveTemplateData.f45306id);
            if (bLiveTemplateData.fields != null) {
                jsonGenerator.writeFieldName("fields");
                JsonAdapter.serializeArray(bLiveTemplateData.fields, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTemplateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetemplatedata";

    @NonNull
    @ProtobufIndex(index = 52)
    public List<String> fields;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 51)
    public int f45306id;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69450a(String str) {
        return str;
    }

    public static BLiveTemplateData new_() {
        BLiveTemplateData bLiveTemplateData = new BLiveTemplateData();
        bLiveTemplateData.nullCheck();
        return bLiveTemplateData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTemplateData mo225055clone() {
        BLiveTemplateData bLiveTemplateData = new BLiveTemplateData();
        bLiveTemplateData.f45306id = this.f45306id;
        List<String> list = this.fields;
        if (list != null) {
            bLiveTemplateData.fields = ValueObject.util_map(list, new qcj() { // from class: l.c72
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveTemplateData.m69450a((String) obj);
                }
            });
        }
        return bLiveTemplateData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTemplateData)) {
            return false;
        }
        BLiveTemplateData bLiveTemplateData = (BLiveTemplateData) obj;
        return this.f45306id == bLiveTemplateData.f45306id && ValueObject.util_equals(this.fields, bLiveTemplateData.fields);
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
        int i2 = ((i * 41) + this.f45306id) * 41;
        List<String> list = this.fields;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.fields == null) {
            this.fields = new ArrayList();
        }
    }

    public BLiveTemplateData subtract(BLiveTemplateData bLiveTemplateData) {
        BLiveTemplateData bLiveTemplateData2 = new BLiveTemplateData();
        if (!ValueObject.util_equals(this.fields, bLiveTemplateData.fields)) {
            bLiveTemplateData2.fields = this.fields;
        }
        if (bLiveTemplateData2.equals(new BLiveTemplateData())) {
            return null;
        }
        return bLiveTemplateData2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
