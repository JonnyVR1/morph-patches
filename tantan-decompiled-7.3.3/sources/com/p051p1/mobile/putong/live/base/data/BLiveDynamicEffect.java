package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveDynamicEffect;
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
public class BLiveDynamicEffect extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDynamicEffect> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDynamicEffect>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDynamicEffect.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDynamicEffect.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDynamicEffect newInstance() {
            return new BLiveDynamicEffect();
        }

        public boolean parseField(BLiveDynamicEffect bLiveDynamicEffect, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLiveDynamicEffect.duration = jsonParser.getValueAsInt();
                    return true;
                case "enableDefault":
                    bLiveDynamicEffect.enableDefault = jsonParser.getValueAsInt();
                    return true;
                case "productID":
                    bLiveDynamicEffect.productID = jsonParser.getValueAsString();
                    return true;
                case "region":
                    bLiveDynamicEffect.region = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "zipMd5":
                    bLiveDynamicEffect.zipMd5 = jsonParser.getValueAsString();
                    return true;
                case "zipurl":
                    bLiveDynamicEffect.zipurl = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveDynamicEffect.name = jsonParser.getValueAsString();
                    return true;
                case "cover":
                    bLiveDynamicEffect.cover = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDynamicEffect bLiveDynamicEffect, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveDynamicEffect.productID;
            if (str != null) {
                jsonGenerator.writeStringField("productID", str);
            }
            jsonGenerator.writeNumberField("enableDefault", bLiveDynamicEffect.enableDefault);
            String str2 = bLiveDynamicEffect.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveDynamicEffect.cover;
            if (str3 != null) {
                jsonGenerator.writeStringField("cover", str3);
            }
            String str4 = bLiveDynamicEffect.zipurl;
            if (str4 != null) {
                jsonGenerator.writeStringField("zipurl", str4);
            }
            String str5 = bLiveDynamicEffect.zipMd5;
            if (str5 != null) {
                jsonGenerator.writeStringField("zipMd5", str5);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveDynamicEffect.duration);
            if (bLiveDynamicEffect.region != null) {
                jsonGenerator.writeFieldName("region");
                JsonAdapter.serializeArray(bLiveDynamicEffect.region, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDynamicEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedynamiceffect";

    @NonNull
    @ProtobufIndex(index = 4)
    public String cover;

    @ProtobufIndex(index = 7)
    public int duration;

    @ProtobufIndex(index = 2)
    public int enableDefault;
    public boolean hasDownloaded;
    public boolean isSelected;
    public String modelPath;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;
    public String notice;

    @NonNull
    @ProtobufIndex(index = 1)
    public String productID;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<Integer> region;
    public String type;
    public String typeName;

    @NonNull
    @ProtobufIndex(index = 6)
    public String zipMd5;

    @NonNull
    @ProtobufIndex(index = 5)
    public String zipurl;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m69108a(Integer num) {
        return num;
    }

    public static BLiveDynamicEffect new_() {
        BLiveDynamicEffect bLiveDynamicEffect = new BLiveDynamicEffect();
        bLiveDynamicEffect.nullCheck();
        return bLiveDynamicEffect;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDynamicEffect mo225055clone() {
        BLiveDynamicEffect bLiveDynamicEffect = new BLiveDynamicEffect();
        bLiveDynamicEffect.productID = this.productID;
        bLiveDynamicEffect.enableDefault = this.enableDefault;
        bLiveDynamicEffect.name = this.name;
        bLiveDynamicEffect.cover = this.cover;
        bLiveDynamicEffect.zipurl = this.zipurl;
        bLiveDynamicEffect.zipMd5 = this.zipMd5;
        bLiveDynamicEffect.duration = this.duration;
        List<Integer> list = this.region;
        if (list != null) {
            bLiveDynamicEffect.region = ValueObject.util_map(list, new qcj() { // from class: l.dz1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveDynamicEffect.m69108a((Integer) obj);
                }
            });
        }
        return bLiveDynamicEffect;
    }

    public BLiveDynamicEffect copyOther(BLiveDynamicEffect bLiveDynamicEffect) {
        this.productID = bLiveDynamicEffect.productID;
        this.enableDefault = bLiveDynamicEffect.enableDefault;
        this.name = bLiveDynamicEffect.name;
        this.cover = bLiveDynamicEffect.cover;
        this.zipurl = bLiveDynamicEffect.zipurl;
        this.zipMd5 = bLiveDynamicEffect.zipMd5;
        this.duration = bLiveDynamicEffect.duration;
        this.region = bLiveDynamicEffect.region;
        this.hasDownloaded = bLiveDynamicEffect.hasDownloaded;
        this.modelPath = bLiveDynamicEffect.modelPath;
        this.typeName = bLiveDynamicEffect.typeName;
        this.isSelected = bLiveDynamicEffect.isSelected;
        this.notice = bLiveDynamicEffect.notice;
        this.type = bLiveDynamicEffect.type;
        return bLiveDynamicEffect;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDynamicEffect)) {
            return false;
        }
        BLiveDynamicEffect bLiveDynamicEffect = (BLiveDynamicEffect) obj;
        return ValueObject.util_equals(this.productID, bLiveDynamicEffect.productID) && this.enableDefault == bLiveDynamicEffect.enableDefault && ValueObject.util_equals(this.name, bLiveDynamicEffect.name) && ValueObject.util_equals(this.cover, bLiveDynamicEffect.cover) && ValueObject.util_equals(this.zipurl, bLiveDynamicEffect.zipurl) && ValueObject.util_equals(this.zipMd5, bLiveDynamicEffect.zipMd5) && this.duration == bLiveDynamicEffect.duration && ValueObject.util_equals(this.region, bLiveDynamicEffect.region);
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
        String str = this.productID;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.enableDefault) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.cover;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.zipurl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.zipMd5;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.duration) * 41;
        List<Integer> list = this.region;
        int iHashCode6 = iHashCode5 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.productID == null) {
            this.productID = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.cover == null) {
            this.cover = "";
        }
        if (this.zipurl == null) {
            this.zipurl = "";
        }
        if (this.zipMd5 == null) {
            this.zipMd5 = "";
        }
        if (this.region == null) {
            this.region = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
