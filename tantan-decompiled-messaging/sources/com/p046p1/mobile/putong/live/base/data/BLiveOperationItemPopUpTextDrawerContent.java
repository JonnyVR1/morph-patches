package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemPopUpTextDrawerContent;
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
public class BLiveOperationItemPopUpTextDrawerContent extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationItemPopUpTextDrawerContent> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationItemPopUpTextDrawerContent>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUpTextDrawerContent.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationItemPopUpTextDrawerContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationItemPopUpTextDrawerContent newInstance() {
            return new BLiveOperationItemPopUpTextDrawerContent();
        }

        public boolean parseField(BLiveOperationItemPopUpTextDrawerContent bLiveOperationItemPopUpTextDrawerContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "templateFields":
                    bLiveOperationItemPopUpTextDrawerContent.templateFields = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "amount":
                    bLiveOperationItemPopUpTextDrawerContent.amount = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    bLiveOperationItemPopUpTextDrawerContent.f44418id = jsonParser.getValueAsString();
                    return false;
                case "templateId":
                    bLiveOperationItemPopUpTextDrawerContent.templateId = jsonParser.getValueAsInt();
                    return true;
                case "hierarchy":
                    bLiveOperationItemPopUpTextDrawerContent.hierarchy = BLiveOperationHierarchy.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationItemPopUpTextDrawerContent bLiveOperationItemPopUpTextDrawerContent, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("templateId", bLiveOperationItemPopUpTextDrawerContent.templateId);
            if (bLiveOperationItemPopUpTextDrawerContent.templateFields != null) {
                jsonGenerator.writeFieldName("templateFields");
                JsonAdapter.serializeArray(bLiveOperationItemPopUpTextDrawerContent.templateFields, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveOperationItemPopUpTextDrawerContent.hierarchy != null) {
                jsonGenerator.writeFieldName("hierarchy");
                BLiveOperationHierarchy.JSON_ADAPTER.serialize(bLiveOperationItemPopUpTextDrawerContent.hierarchy, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("amount", bLiveOperationItemPopUpTextDrawerContent.amount);
            String str = bLiveOperationItemPopUpTextDrawerContent.f44418id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationItemPopUpTextDrawerContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationitempopuptextdrawercontent";

    @ProtobufIndex(index = 4)
    public int amount;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveOperationHierarchy hierarchy;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 5)
    public String f44418id;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> templateFields;

    @ProtobufIndex(index = 1)
    public int templateId;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68120a(String str) {
        return str;
    }

    public static BLiveOperationItemPopUpTextDrawerContent new_() {
        BLiveOperationItemPopUpTextDrawerContent bLiveOperationItemPopUpTextDrawerContent = new BLiveOperationItemPopUpTextDrawerContent();
        bLiveOperationItemPopUpTextDrawerContent.nullCheck();
        return bLiveOperationItemPopUpTextDrawerContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationItemPopUpTextDrawerContent mo223809clone() {
        BLiveOperationItemPopUpTextDrawerContent bLiveOperationItemPopUpTextDrawerContent = new BLiveOperationItemPopUpTextDrawerContent();
        bLiveOperationItemPopUpTextDrawerContent.templateId = this.templateId;
        List<String> list = this.templateFields;
        if (list != null) {
            bLiveOperationItemPopUpTextDrawerContent.templateFields = ValueObject.util_map(list, new w9j() { // from class: l.v32
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveOperationItemPopUpTextDrawerContent.m68120a((String) obj);
                }
            });
        }
        BLiveOperationHierarchy bLiveOperationHierarchy = this.hierarchy;
        if (bLiveOperationHierarchy != null) {
            bLiveOperationItemPopUpTextDrawerContent.hierarchy = bLiveOperationHierarchy.mo223809clone();
        }
        bLiveOperationItemPopUpTextDrawerContent.amount = this.amount;
        bLiveOperationItemPopUpTextDrawerContent.f44418id = this.f44418id;
        return bLiveOperationItemPopUpTextDrawerContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationItemPopUpTextDrawerContent)) {
            return false;
        }
        BLiveOperationItemPopUpTextDrawerContent bLiveOperationItemPopUpTextDrawerContent = (BLiveOperationItemPopUpTextDrawerContent) obj;
        return this.templateId == bLiveOperationItemPopUpTextDrawerContent.templateId && ValueObject.util_equals(this.templateFields, bLiveOperationItemPopUpTextDrawerContent.templateFields) && ValueObject.util_equals(this.hierarchy, bLiveOperationItemPopUpTextDrawerContent.hierarchy) && this.amount == bLiveOperationItemPopUpTextDrawerContent.amount && ValueObject.util_equals(this.f44418id, bLiveOperationItemPopUpTextDrawerContent.f44418id);
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
        int i2 = ((i * 41) + this.templateId) * 41;
        List<String> list = this.templateFields;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveOperationHierarchy bLiveOperationHierarchy = this.hierarchy;
        int iHashCode2 = (((iHashCode + (bLiveOperationHierarchy != null ? bLiveOperationHierarchy.hashCode() : 0)) * 41) + this.amount) * 41;
        String str = this.f44418id;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.templateFields == null) {
            this.templateFields = new ArrayList();
        }
        if (this.hierarchy == null) {
            this.hierarchy = BLiveOperationHierarchy.new_();
        }
        if (this.f44418id == null) {
            this.f44418id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
