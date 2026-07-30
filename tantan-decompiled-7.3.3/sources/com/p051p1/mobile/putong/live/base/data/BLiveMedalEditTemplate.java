package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalColor;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalIcon;
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
public class BLiveMedalEditTemplate extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMedalEditTemplate> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMedalEditTemplate>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMedalEditTemplate.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMedalEditTemplate.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMedalEditTemplate newInstance() {
            return new BLiveMedalEditTemplate();
        }

        public boolean parseField(BLiveMedalEditTemplate bLiveMedalEditTemplate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("colors")) {
                bLiveMedalEditTemplate.colors = JsonAdapter.parseArray(jsonParser, BLiveMedalColor.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("icons")) {
                return false;
            }
            bLiveMedalEditTemplate.icons = JsonAdapter.parseArray(jsonParser, BLiveMedalIcon.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMedalEditTemplate bLiveMedalEditTemplate, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveMedalEditTemplate.colors != null) {
                jsonGenerator.writeFieldName("colors");
                JsonAdapter.serializeArray(bLiveMedalEditTemplate.colors, jsonGenerator, BLiveMedalColor.JSON_ADAPTER);
            }
            if (bLiveMedalEditTemplate.icons != null) {
                jsonGenerator.writeFieldName("icons");
                JsonAdapter.serializeArray(bLiveMedalEditTemplate.icons, jsonGenerator, BLiveMedalIcon.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMedalEditTemplate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemedaledittemplate";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveMedalColor> colors;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveMedalIcon> icons;

    public static BLiveMedalEditTemplate new_() {
        BLiveMedalEditTemplate bLiveMedalEditTemplate = new BLiveMedalEditTemplate();
        bLiveMedalEditTemplate.nullCheck();
        return bLiveMedalEditTemplate;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMedalEditTemplate mo225055clone() {
        BLiveMedalEditTemplate bLiveMedalEditTemplate = new BLiveMedalEditTemplate();
        List<BLiveMedalColor> list = this.colors;
        if (list != null) {
            bLiveMedalEditTemplate.colors = ValueObject.util_map(list, new qcj() { // from class: l.m22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMedalColor) obj).mo225055clone();
                }
            });
        }
        List<BLiveMedalIcon> list2 = this.icons;
        if (list2 != null) {
            bLiveMedalEditTemplate.icons = ValueObject.util_map(list2, new qcj() { // from class: l.n22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMedalIcon) obj).mo225055clone();
                }
            });
        }
        return bLiveMedalEditTemplate;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMedalEditTemplate)) {
            return false;
        }
        BLiveMedalEditTemplate bLiveMedalEditTemplate = (BLiveMedalEditTemplate) obj;
        return ValueObject.util_equals(this.colors, bLiveMedalEditTemplate.colors) && ValueObject.util_equals(this.icons, bLiveMedalEditTemplate.icons);
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
        List<BLiveMedalColor> list = this.colors;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveMedalIcon> list2 = this.icons;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.colors == null) {
            this.colors = new ArrayList();
        }
        if (this.icons == null) {
            this.icons = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
