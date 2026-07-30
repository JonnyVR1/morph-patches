package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateMenu;
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
public class BLiveTemplate extends ValueObject implements Cloneable, Serializable {
    public static final int ACTION_DEFAULT = 0;
    public static final int ACTION_H5 = 2;
    public static final int ACTION_MENU = 3;
    public static final int ACTION_PROFILE = 1;
    public static final int ACTION_SCHEMA = 4;
    public static JsonAdapter<BLiveTemplate> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTemplate>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTemplate.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTemplate.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTemplate newInstance() {
            return new BLiveTemplate();
        }

        public boolean parseField(BLiveTemplate bLiveTemplate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    bLiveTemplate.action = jsonParser.getValueAsInt();
                    return true;
                case "format":
                    bLiveTemplate.format = JsonAdapter.parseArray(jsonParser, BLiveTemplateItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "h5":
                    bLiveTemplate.f44456h5 = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveTemplate.f44457id = jsonParser.getValueAsInt();
                    return false;
                case "menu":
                    bLiveTemplate.menu = JsonAdapter.parseArray(jsonParser, BLiveTemplateMenu.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "category":
                    bLiveTemplate.category = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTemplate bLiveTemplate, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveTemplate.f44457id);
            jsonGenerator.writeNumberField("action", bLiveTemplate.action);
            String str = bLiveTemplate.f44456h5;
            if (str != null) {
                jsonGenerator.writeStringField(BLiveOperationClickAction.f44417h5, str);
            }
            if (bLiveTemplate.menu != null) {
                jsonGenerator.writeFieldName(NavigationIntent.menu);
                JsonAdapter.serializeArray(bLiveTemplate.menu, jsonGenerator, BLiveTemplateMenu.JSON_ADAPTER);
            }
            if (bLiveTemplate.format != null) {
                jsonGenerator.writeFieldName("format");
                JsonAdapter.serializeArray(bLiveTemplate.format, jsonGenerator, BLiveTemplateItem.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("category", bLiveTemplate.category);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTemplate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetemplate";

    @ProtobufIndex(index = 2)
    public int action;

    @ProtobufIndex(index = 6)
    public int category;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<BLiveTemplateItem> format;

    /* JADX INFO: renamed from: h5 */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f44456h5;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f44457id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveTemplateMenu> menu;

    public static BLiveTemplate new_() {
        BLiveTemplate bLiveTemplate = new BLiveTemplate();
        bLiveTemplate.nullCheck();
        return bLiveTemplate;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTemplate mo223809clone() {
        BLiveTemplate bLiveTemplate = new BLiveTemplate();
        bLiveTemplate.f44457id = this.f44457id;
        bLiveTemplate.action = this.action;
        bLiveTemplate.f44456h5 = this.f44456h5;
        List<BLiveTemplateMenu> list = this.menu;
        if (list != null) {
            bLiveTemplate.menu = ValueObject.util_map(list, new w9j() { // from class: l.t62
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveTemplateMenu) obj).mo223809clone();
                }
            });
        }
        List<BLiveTemplateItem> list2 = this.format;
        if (list2 != null) {
            bLiveTemplate.format = ValueObject.util_map(list2, new w9j() { // from class: l.u62
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveTemplateItem) obj).mo223809clone();
                }
            });
        }
        bLiveTemplate.category = this.category;
        return bLiveTemplate;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTemplate)) {
            return false;
        }
        BLiveTemplate bLiveTemplate = (BLiveTemplate) obj;
        return this.f44457id == bLiveTemplate.f44457id && this.action == bLiveTemplate.action && ValueObject.util_equals(this.f44456h5, bLiveTemplate.f44456h5) && ValueObject.util_equals(this.menu, bLiveTemplate.menu) && ValueObject.util_equals(this.format, bLiveTemplate.format) && this.category == bLiveTemplate.category;
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
        int i2 = ((((i * 41) + this.f44457id) * 41) + this.action) * 41;
        String str = this.f44456h5;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveTemplateMenu> list = this.menu;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveTemplateItem> list2 = this.format;
        int iHashCode3 = ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41) + this.category;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44456h5 == null) {
            this.f44456h5 = "";
        }
        if (this.menu == null) {
            this.menu = new ArrayList();
        }
        if (this.format == null) {
            this.format = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
