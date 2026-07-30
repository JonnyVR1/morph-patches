package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLivePkBountyEffectExtras;
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
public class BLivePkBountyResource extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkBountyResource> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkBountyResource>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkBountyResource.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkBountyResource.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkBountyResource newInstance() {
            return new BLivePkBountyResource();
        }

        public boolean parseField(BLivePkBountyResource bLivePkBountyResource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLivePkBountyResource.duration = jsonParser.getValueAsInt();
                    return true;
                case "resourceId":
                    bLivePkBountyResource.resourceId = jsonParser.getValueAsString();
                    return true;
                case "effectExtras":
                    bLivePkBountyResource.effectExtras = JsonAdapter.parseArray(jsonParser, BLivePkBountyEffectExtras.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkBountyResource bLivePkBountyResource, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkBountyResource.resourceId;
            if (str != null) {
                jsonGenerator.writeStringField("resourceId", str);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLivePkBountyResource.duration);
            if (bLivePkBountyResource.effectExtras != null) {
                jsonGenerator.writeFieldName("effectExtras");
                JsonAdapter.serializeArray(bLivePkBountyResource.effectExtras, jsonGenerator, BLivePkBountyEffectExtras.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkBountyResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkbountyresource";

    @ProtobufIndex(index = 2)
    public int duration;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLivePkBountyEffectExtras> effectExtras;

    @NonNull
    @ProtobufIndex(index = 1)
    public String resourceId;

    public static BLivePkBountyResource new_() {
        BLivePkBountyResource bLivePkBountyResource = new BLivePkBountyResource();
        bLivePkBountyResource.nullCheck();
        return bLivePkBountyResource;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkBountyResource mo223809clone() {
        BLivePkBountyResource bLivePkBountyResource = new BLivePkBountyResource();
        bLivePkBountyResource.resourceId = this.resourceId;
        bLivePkBountyResource.duration = this.duration;
        List<BLivePkBountyEffectExtras> list = this.effectExtras;
        if (list != null) {
            bLivePkBountyResource.effectExtras = ValueObject.util_map(list, new w9j() { // from class: l.c42
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLivePkBountyEffectExtras) obj).mo223809clone();
                }
            });
        }
        return bLivePkBountyResource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkBountyResource)) {
            return false;
        }
        BLivePkBountyResource bLivePkBountyResource = (BLivePkBountyResource) obj;
        return ValueObject.util_equals(this.resourceId, bLivePkBountyResource.resourceId) && this.duration == bLivePkBountyResource.duration && ValueObject.util_equals(this.effectExtras, bLivePkBountyResource.effectExtras);
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
        String str = this.resourceId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.duration) * 41;
        List<BLivePkBountyEffectExtras> list = this.effectExtras;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.resourceId == null) {
            this.resourceId = "";
        }
        if (this.effectExtras == null) {
            this.effectExtras = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
