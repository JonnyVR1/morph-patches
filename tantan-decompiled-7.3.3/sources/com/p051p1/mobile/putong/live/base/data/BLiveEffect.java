package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
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
public class BLiveEffect extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveEffect> JSON_ADAPTER = new ObjectJsonAdapter<BLiveEffect>() { // from class: com.p1.mobile.putong.live.base.data.BLiveEffect.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveEffect.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveEffect newInstance() {
            return new BLiveEffect();
        }

        public boolean parseField(BLiveEffect bLiveEffect, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hdType":
                    bLiveEffect.hdType = jsonParser.getValueAsString();
                    return true;
                case "priority":
                    bLiveEffect.priority = Priority.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    bLiveEffect.f45207id = jsonParser.getValueAsString();
                    return false;
                case "md5":
                    bLiveEffect.md5 = jsonParser.getValueAsString();
                    return true;
                case "zip":
                    bLiveEffect.zip = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveEffect.type = jsonParser.getValueAsString();
                    return true;
                case "downloadType":
                    bLiveEffect.downloadType = jsonParser.getValueAsInt();
                    return true;
                case "loadTypes":
                    bLiveEffect.loadTypes = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "download":
                    bLiveEffect.download = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveEffect bLiveEffect, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveEffect.f45207id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveEffect.zip;
            if (str2 != null) {
                jsonGenerator.writeStringField("zip", str2);
            }
            String str3 = bLiveEffect.md5;
            if (str3 != null) {
                jsonGenerator.writeStringField("md5", str3);
            }
            String str4 = bLiveEffect.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            String str5 = bLiveEffect.hdType;
            if (str5 != null) {
                jsonGenerator.writeStringField("hdType", str5);
            }
            if (bLiveEffect.priority != null) {
                jsonGenerator.writeFieldName("priority");
                Priority.JSON_ADAPTER.serialize(bLiveEffect.priority, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("download", bLiveEffect.download);
            jsonGenerator.writeNumberField("downloadType", bLiveEffect.downloadType);
            if (bLiveEffect.loadTypes != null) {
                jsonGenerator.writeFieldName("loadTypes");
                JsonAdapter.serializeArray(bLiveEffect.loadTypes, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveeffect";

    @ProtobufIndex(index = 7)
    public int download;

    @ProtobufIndex(index = 8)
    public int downloadType;

    @NonNull
    @ProtobufIndex(index = 5)
    public String hdType;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45207id;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<String> loadTypes;

    @NonNull
    @ProtobufIndex(index = 3)
    public String md5;

    @NonNull
    @ProtobufIndex(index = 6)
    public Priority priority;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    @NonNull
    @ProtobufIndex(index = 2)
    public String zip;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69110a(String str) {
        return str;
    }

    public static BLiveEffect new_() {
        BLiveEffect bLiveEffect = new BLiveEffect();
        bLiveEffect.nullCheck();
        return bLiveEffect;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveEffect mo225055clone() {
        BLiveEffect bLiveEffect = new BLiveEffect();
        bLiveEffect.f45207id = this.f45207id;
        bLiveEffect.zip = this.zip;
        bLiveEffect.md5 = this.md5;
        bLiveEffect.type = this.type;
        bLiveEffect.hdType = this.hdType;
        bLiveEffect.priority = this.priority;
        bLiveEffect.download = this.download;
        bLiveEffect.downloadType = this.downloadType;
        List<String> list = this.loadTypes;
        if (list != null) {
            bLiveEffect.loadTypes = ValueObject.util_map(list, new qcj() { // from class: l.fz1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveEffect.m69110a((String) obj);
                }
            });
        }
        return bLiveEffect;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveEffect)) {
            return false;
        }
        BLiveEffect bLiveEffect = (BLiveEffect) obj;
        return ValueObject.util_equals(this.f45207id, bLiveEffect.f45207id) && ValueObject.util_equals(this.zip, bLiveEffect.zip) && ValueObject.util_equals(this.md5, bLiveEffect.md5) && ValueObject.util_equals(this.type, bLiveEffect.type) && ValueObject.util_equals(this.hdType, bLiveEffect.hdType) && ValueObject.util_equals(this.priority, bLiveEffect.priority) && this.download == bLiveEffect.download && this.downloadType == bLiveEffect.downloadType && ValueObject.util_equals(this.loadTypes, bLiveEffect.loadTypes);
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
        String str = this.f45207id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.zip;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.md5;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.hdType;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        Priority priority = this.priority;
        int iHashCode6 = (((((iHashCode5 + (priority != null ? priority.hashCode() : 0)) * 41) + this.download) * 41) + this.downloadType) * 41;
        List<String> list = this.loadTypes;
        int iHashCode7 = iHashCode6 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    public boolean isDownloadNow() {
        return this.download == 0;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45207id == null) {
            this.f45207id = "";
        }
        if (this.zip == null) {
            this.zip = "";
        }
        if (this.md5 == null) {
            this.md5 = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.hdType == null) {
            this.hdType = "";
        }
        if (this.priority == null) {
            this.priority = (Priority) Priority.JSON_ADAPTER.defaultEnum();
        }
        if (this.loadTypes == null) {
            this.loadTypes = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
