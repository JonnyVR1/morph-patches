package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;
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
public class BLiveIntlTemplateData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlTemplateData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlTemplateData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlTemplateData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlTemplateData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlTemplateData newInstance() {
            return new BLiveIntlTemplateData();
        }

        public boolean parseField(BLiveIntlTemplateData bLiveIntlTemplateData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("templates")) {
                return false;
            }
            bLiveIntlTemplateData.templates = JsonAdapter.parseArray(jsonParser, BLiveTemplate.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlTemplateData bLiveIntlTemplateData, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveIntlTemplateData.templates != null) {
                jsonGenerator.writeFieldName("templates");
                JsonAdapter.serializeArray(bLiveIntlTemplateData.templates, jsonGenerator, BLiveTemplate.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlTemplateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintltemplatedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveTemplate> templates;

    public static BLiveIntlTemplateData new_() {
        BLiveIntlTemplateData bLiveIntlTemplateData = new BLiveIntlTemplateData();
        bLiveIntlTemplateData.nullCheck();
        return bLiveIntlTemplateData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlTemplateData mo225055clone() {
        BLiveIntlTemplateData bLiveIntlTemplateData = new BLiveIntlTemplateData();
        List<BLiveTemplate> list = this.templates;
        if (list != null) {
            bLiveIntlTemplateData.templates = ValueObject.util_map(list, new qcj() { // from class: l.y12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveTemplate) obj).mo225055clone();
                }
            });
        }
        return bLiveIntlTemplateData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveIntlTemplateData) {
            return ValueObject.util_equals(this.templates, ((BLiveIntlTemplateData) obj).templates);
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
        List<BLiveTemplate> list = this.templates;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.templates == null) {
            this.templates = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
