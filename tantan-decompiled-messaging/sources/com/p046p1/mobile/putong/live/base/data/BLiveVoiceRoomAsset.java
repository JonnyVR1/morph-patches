package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveStartPageTemplate;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGuideTemplate;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
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
public class BLiveVoiceRoomAsset extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRoomAsset> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRoomAsset>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRoomAsset.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRoomAsset newInstance() {
            return new BLiveVoiceRoomAsset();
        }

        public boolean parseField(BLiveVoiceRoomAsset bLiveVoiceRoomAsset, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "canOpenPersonal":
                    bLiveVoiceRoomAsset.canOpenPersonal = jsonParser.getValueAsBoolean();
                    return true;
                case "flowerLBSchema":
                    bLiveVoiceRoomAsset.flowerLBSchema = jsonParser.getValueAsString();
                    return true;
                case "bobelLBSchema":
                    bLiveVoiceRoomAsset.bobelLBSchema = jsonParser.getValueAsString();
                    return true;
                case "tips":
                    bLiveVoiceRoomAsset.tips = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "undercoverEntranceUrl":
                    bLiveVoiceRoomAsset.undercoverEntranceUrl = jsonParser.getValueAsString();
                    return true;
                case "startPageTemplates":
                    bLiveVoiceRoomAsset.startPageTemplates = JsonAdapter.parseArray(jsonParser, BLiveStartPageTemplate.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "templates":
                    bLiveVoiceRoomAsset.templates = JsonAdapter.parseArray(jsonParser, BLiveVoiceGuideTemplate.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRoomAsset bLiveVoiceRoomAsset, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceRoomAsset.templates != null) {
                jsonGenerator.writeFieldName("templates");
                JsonAdapter.serializeArray(bLiveVoiceRoomAsset.templates, jsonGenerator, BLiveVoiceGuideTemplate.JSON_ADAPTER);
            }
            if (bLiveVoiceRoomAsset.tips != null) {
                jsonGenerator.writeFieldName("tips");
                JsonAdapter.serializeArray(bLiveVoiceRoomAsset.tips, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = bLiveVoiceRoomAsset.undercoverEntranceUrl;
            if (str != null) {
                jsonGenerator.writeStringField("undercoverEntranceUrl", str);
            }
            String str2 = bLiveVoiceRoomAsset.flowerLBSchema;
            if (str2 != null) {
                jsonGenerator.writeStringField("flowerLBSchema", str2);
            }
            String str3 = bLiveVoiceRoomAsset.bobelLBSchema;
            if (str3 != null) {
                jsonGenerator.writeStringField("bobelLBSchema", str3);
            }
            jsonGenerator.writeBooleanField("canOpenPersonal", bLiveVoiceRoomAsset.canOpenPersonal);
            if (bLiveVoiceRoomAsset.startPageTemplates != null) {
                jsonGenerator.writeFieldName("startPageTemplates");
                JsonAdapter.serializeArray(bLiveVoiceRoomAsset.startPageTemplates, jsonGenerator, BLiveStartPageTemplate.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRoomAsset) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceroomasset";

    @NonNull
    @ProtobufIndex(index = 5)
    public String bobelLBSchema;

    @ProtobufIndex(index = 6)
    public boolean canOpenPersonal = true;

    @NonNull
    @ProtobufIndex(index = 4)
    public String flowerLBSchema;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<BLiveStartPageTemplate> startPageTemplates;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveVoiceGuideTemplate> templates;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> tips;

    @NonNull
    @ProtobufIndex(index = 3)
    public String undercoverEntranceUrl;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68430a(String str) {
        return str;
    }

    public static BLiveVoiceRoomAsset new_() {
        BLiveVoiceRoomAsset bLiveVoiceRoomAsset = new BLiveVoiceRoomAsset();
        bLiveVoiceRoomAsset.nullCheck();
        return bLiveVoiceRoomAsset;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRoomAsset mo223809clone() {
        BLiveVoiceRoomAsset bLiveVoiceRoomAsset = new BLiveVoiceRoomAsset();
        List<BLiveVoiceGuideTemplate> list = this.templates;
        if (list != null) {
            bLiveVoiceRoomAsset.templates = ValueObject.util_map(list, new w9j() { // from class: l.k92
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceGuideTemplate) obj).mo223809clone();
                }
            });
        }
        List<String> list2 = this.tips;
        if (list2 != null) {
            bLiveVoiceRoomAsset.tips = ValueObject.util_map(list2, new w9j() { // from class: l.l92
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveVoiceRoomAsset.m68430a((String) obj);
                }
            });
        }
        bLiveVoiceRoomAsset.undercoverEntranceUrl = this.undercoverEntranceUrl;
        bLiveVoiceRoomAsset.flowerLBSchema = this.flowerLBSchema;
        bLiveVoiceRoomAsset.bobelLBSchema = this.bobelLBSchema;
        bLiveVoiceRoomAsset.canOpenPersonal = this.canOpenPersonal;
        List<BLiveStartPageTemplate> list3 = this.startPageTemplates;
        if (list3 != null) {
            bLiveVoiceRoomAsset.startPageTemplates = ValueObject.util_map(list3, new w9j() { // from class: l.m92
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveStartPageTemplate) obj).mo223809clone();
                }
            });
        }
        return bLiveVoiceRoomAsset;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceRoomAsset)) {
            return false;
        }
        BLiveVoiceRoomAsset bLiveVoiceRoomAsset = (BLiveVoiceRoomAsset) obj;
        return ValueObject.util_equals(this.templates, bLiveVoiceRoomAsset.templates) && ValueObject.util_equals(this.tips, bLiveVoiceRoomAsset.tips) && ValueObject.util_equals(this.undercoverEntranceUrl, bLiveVoiceRoomAsset.undercoverEntranceUrl) && ValueObject.util_equals(this.flowerLBSchema, bLiveVoiceRoomAsset.flowerLBSchema) && ValueObject.util_equals(this.bobelLBSchema, bLiveVoiceRoomAsset.bobelLBSchema) && this.canOpenPersonal == bLiveVoiceRoomAsset.canOpenPersonal && ValueObject.util_equals(this.startPageTemplates, bLiveVoiceRoomAsset.startPageTemplates);
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
        List<BLiveVoiceGuideTemplate> list = this.templates;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.tips;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str = this.undercoverEntranceUrl;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.flowerLBSchema;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bobelLBSchema;
        int iHashCode5 = (((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.canOpenPersonal ? 1231 : 1237)) * 41;
        List<BLiveStartPageTemplate> list3 = this.startPageTemplates;
        int iHashCode6 = iHashCode5 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.templates == null) {
            this.templates = new ArrayList();
        }
        if (this.tips == null) {
            this.tips = new ArrayList();
        }
        if (this.undercoverEntranceUrl == null) {
            this.undercoverEntranceUrl = "";
        }
        if (this.flowerLBSchema == null) {
            this.flowerLBSchema = "";
        }
        if (this.bobelLBSchema == null) {
            this.bobelLBSchema = "";
        }
        if (this.startPageTemplates == null) {
            this.startPageTemplates = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
