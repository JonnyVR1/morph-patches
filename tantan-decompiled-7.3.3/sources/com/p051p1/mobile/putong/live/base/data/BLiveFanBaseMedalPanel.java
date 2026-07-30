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
public class BLiveFanBaseMedalPanel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseMedalPanel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseMedalPanel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseMedalPanel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseMedalPanel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseMedalPanel newInstance() {
            return new BLiveFanBaseMedalPanel();
        }

        public boolean parseField(BLiveFanBaseMedalPanel bLiveFanBaseMedalPanel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("template")) {
                bLiveFanBaseMedalPanel.template = BLiveMedalEditTemplate.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("editInfo")) {
                return false;
            }
            bLiveFanBaseMedalPanel.editInfo = BLiveMedalEditInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseMedalPanel bLiveFanBaseMedalPanel, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveFanBaseMedalPanel.editInfo != null) {
                jsonGenerator.writeFieldName("editInfo");
                BLiveMedalEditInfo.JSON_ADAPTER.serialize(bLiveFanBaseMedalPanel.editInfo, jsonGenerator, true);
            }
            if (bLiveFanBaseMedalPanel.template != null) {
                jsonGenerator.writeFieldName("template");
                BLiveMedalEditTemplate.JSON_ADAPTER.serialize(bLiveFanBaseMedalPanel.template, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseMedalPanel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbasemedalpanel";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveMedalEditInfo editInfo;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveMedalEditTemplate template;

    public static BLiveFanBaseMedalPanel new_() {
        BLiveFanBaseMedalPanel bLiveFanBaseMedalPanel = new BLiveFanBaseMedalPanel();
        bLiveFanBaseMedalPanel.nullCheck();
        return bLiveFanBaseMedalPanel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseMedalPanel mo225055clone() {
        BLiveFanBaseMedalPanel bLiveFanBaseMedalPanel = new BLiveFanBaseMedalPanel();
        BLiveMedalEditInfo bLiveMedalEditInfo = this.editInfo;
        if (bLiveMedalEditInfo != null) {
            bLiveFanBaseMedalPanel.editInfo = bLiveMedalEditInfo.mo225055clone();
        }
        BLiveMedalEditTemplate bLiveMedalEditTemplate = this.template;
        if (bLiveMedalEditTemplate != null) {
            bLiveFanBaseMedalPanel.template = bLiveMedalEditTemplate.mo225055clone();
        }
        return bLiveFanBaseMedalPanel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBaseMedalPanel)) {
            return false;
        }
        BLiveFanBaseMedalPanel bLiveFanBaseMedalPanel = (BLiveFanBaseMedalPanel) obj;
        return ValueObject.util_equals(this.editInfo, bLiveFanBaseMedalPanel.editInfo) && ValueObject.util_equals(this.template, bLiveFanBaseMedalPanel.template);
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
        BLiveMedalEditInfo bLiveMedalEditInfo = this.editInfo;
        int iHashCode = (i2 + (bLiveMedalEditInfo != null ? bLiveMedalEditInfo.hashCode() : 0)) * 41;
        BLiveMedalEditTemplate bLiveMedalEditTemplate = this.template;
        int iHashCode2 = iHashCode + (bLiveMedalEditTemplate != null ? bLiveMedalEditTemplate.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.editInfo == null) {
            this.editInfo = BLiveMedalEditInfo.new_();
        }
        if (this.template == null) {
            this.template = BLiveMedalEditTemplate.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
