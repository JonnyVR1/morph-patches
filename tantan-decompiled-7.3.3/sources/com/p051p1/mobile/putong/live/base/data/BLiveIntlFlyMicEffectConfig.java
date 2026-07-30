package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
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
public class BLiveIntlFlyMicEffectConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlFlyMicEffectConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlFlyMicEffectConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlFlyMicEffectConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlFlyMicEffectConfig newInstance() {
            return new BLiveIntlFlyMicEffectConfig();
        }

        public boolean parseField(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "dynamicEffectExtends":
                    bLiveIntlFlyMicEffectConfig.dynamicEffectExtends = JsonAdapter.parseArray(jsonParser, BLiveDynamicEffectExtend.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "resourceId":
                    bLiveIntlFlyMicEffectConfig.resourceId = jsonParser.getValueAsString();
                    return true;
                case "startEffectIcon":
                    bLiveIntlFlyMicEffectConfig.startEffectIcon = jsonParser.getValueAsString();
                    return true;
                case "resourceType":
                    bLiveIntlFlyMicEffectConfig.resourceType = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveIntlFlyMicEffectConfig.f45238id = jsonParser.getValueAsInt();
                    return false;
                case "receiveUserId":
                    bLiveIntlFlyMicEffectConfig.receiveUserId = jsonParser.getValueAsString();
                    return true;
                case "endEffectIcon":
                    bLiveIntlFlyMicEffectConfig.endEffectIcon = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveIntlFlyMicEffectConfig.f45238id);
            String str = bLiveIntlFlyMicEffectConfig.startEffectIcon;
            if (str != null) {
                jsonGenerator.writeStringField("startEffectIcon", str);
            }
            String str2 = bLiveIntlFlyMicEffectConfig.endEffectIcon;
            if (str2 != null) {
                jsonGenerator.writeStringField("endEffectIcon", str2);
            }
            String str3 = bLiveIntlFlyMicEffectConfig.resourceType;
            if (str3 != null) {
                jsonGenerator.writeStringField("resourceType", str3);
            }
            String str4 = bLiveIntlFlyMicEffectConfig.resourceId;
            if (str4 != null) {
                jsonGenerator.writeStringField("resourceId", str4);
            }
            String str5 = bLiveIntlFlyMicEffectConfig.receiveUserId;
            if (str5 != null) {
                jsonGenerator.writeStringField("receiveUserId", str5);
            }
            if (bLiveIntlFlyMicEffectConfig.dynamicEffectExtends != null) {
                jsonGenerator.writeFieldName("dynamicEffectExtends");
                JsonAdapter.serializeArray(bLiveIntlFlyMicEffectConfig.dynamicEffectExtends, jsonGenerator, BLiveDynamicEffectExtend.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlFlyMicEffectConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlflymiceffectconfig";

    @NonNull
    @ProtobufIndex(index = 7)
    public List<BLiveDynamicEffectExtend> dynamicEffectExtends;

    @NonNull
    @ProtobufIndex(index = 3)
    public String endEffectIcon;
    public int[] endPosition;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f45238id;

    @NonNull
    @ProtobufIndex(index = 6)
    public String receiveUserId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String resourceId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String resourceType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String startEffectIcon;
    public int[] startPosition;

    public static BLiveIntlFlyMicEffectConfig new_() {
        BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig = new BLiveIntlFlyMicEffectConfig();
        bLiveIntlFlyMicEffectConfig.nullCheck();
        return bLiveIntlFlyMicEffectConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlFlyMicEffectConfig mo225055clone() {
        BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig = new BLiveIntlFlyMicEffectConfig();
        bLiveIntlFlyMicEffectConfig.f45238id = this.f45238id;
        bLiveIntlFlyMicEffectConfig.startEffectIcon = this.startEffectIcon;
        bLiveIntlFlyMicEffectConfig.endEffectIcon = this.endEffectIcon;
        bLiveIntlFlyMicEffectConfig.resourceType = this.resourceType;
        bLiveIntlFlyMicEffectConfig.resourceId = this.resourceId;
        bLiveIntlFlyMicEffectConfig.receiveUserId = this.receiveUserId;
        List<BLiveDynamicEffectExtend> list = this.dynamicEffectExtends;
        if (list != null) {
            bLiveIntlFlyMicEffectConfig.dynamicEffectExtends = ValueObject.util_map(list, new qcj() { // from class: l.t12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveDynamicEffectExtend) obj).mo225055clone();
                }
            });
        }
        return bLiveIntlFlyMicEffectConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlFlyMicEffectConfig)) {
            return false;
        }
        BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig = (BLiveIntlFlyMicEffectConfig) obj;
        return this.f45238id == bLiveIntlFlyMicEffectConfig.f45238id && ValueObject.util_equals(this.startEffectIcon, bLiveIntlFlyMicEffectConfig.startEffectIcon) && ValueObject.util_equals(this.endEffectIcon, bLiveIntlFlyMicEffectConfig.endEffectIcon) && ValueObject.util_equals(this.resourceType, bLiveIntlFlyMicEffectConfig.resourceType) && ValueObject.util_equals(this.resourceId, bLiveIntlFlyMicEffectConfig.resourceId) && ValueObject.util_equals(this.receiveUserId, bLiveIntlFlyMicEffectConfig.receiveUserId) && ValueObject.util_equals(this.dynamicEffectExtends, bLiveIntlFlyMicEffectConfig.dynamicEffectExtends);
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
        int i2 = ((i * 41) + this.f45238id) * 41;
        String str = this.startEffectIcon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.endEffectIcon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.resourceType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.resourceId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.receiveUserId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<BLiveDynamicEffectExtend> list = this.dynamicEffectExtends;
        int iHashCode6 = iHashCode5 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.startEffectIcon == null) {
            this.startEffectIcon = "";
        }
        if (this.endEffectIcon == null) {
            this.endEffectIcon = "";
        }
        if (this.resourceType == null) {
            this.resourceType = "";
        }
        if (this.resourceId == null) {
            this.resourceId = "";
        }
        if (this.receiveUserId == null) {
            this.receiveUserId = "";
        }
        if (this.dynamicEffectExtends == null) {
            this.dynamicEffectExtends = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
