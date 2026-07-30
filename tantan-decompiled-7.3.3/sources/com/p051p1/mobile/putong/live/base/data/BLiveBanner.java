package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveBannerTab;
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
public class BLiveBanner extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBanner> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBanner>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBanner.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBanner.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBanner newInstance() {
            return new BLiveBanner();
        }

        public boolean parseField(BLiveBanner bLiveBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveBanner.f45184id = jsonParser.getValueAsString();
                    return false;
                case "tabs":
                    bLiveBanner.tabs = JsonAdapter.parseArray(jsonParser, BLiveBannerTab.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bLiveBanner.type = jsonParser.getValueAsString();
                    return true;
                case "rowIndex":
                    bLiveBanner.rowIndex = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBanner bLiveBanner, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveBanner.f45184id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("rowIndex", bLiveBanner.rowIndex);
            if (bLiveBanner.tabs != null) {
                jsonGenerator.writeFieldName("tabs");
                JsonAdapter.serializeArray(bLiveBanner.tabs, jsonGenerator, BLiveBannerTab.JSON_ADAPTER);
            }
            String str2 = bLiveBanner.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebanner";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45184id;

    @ProtobufIndex(index = 2)
    public int rowIndex;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveBannerTab> tabs;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    public static BLiveBanner new_() {
        BLiveBanner bLiveBanner = new BLiveBanner();
        bLiveBanner.nullCheck();
        return bLiveBanner;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBanner mo225055clone() {
        BLiveBanner bLiveBanner = new BLiveBanner();
        bLiveBanner.f45184id = this.f45184id;
        bLiveBanner.rowIndex = this.rowIndex;
        List<BLiveBannerTab> list = this.tabs;
        if (list != null) {
            bLiveBanner.tabs = ValueObject.util_map(list, new qcj() { // from class: l.sr1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveBannerTab) obj).mo225055clone();
                }
            });
        }
        bLiveBanner.type = this.type;
        return bLiveBanner;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBanner)) {
            return false;
        }
        BLiveBanner bLiveBanner = (BLiveBanner) obj;
        return ValueObject.util_equals(this.f45184id, bLiveBanner.f45184id) && this.rowIndex == bLiveBanner.rowIndex && ValueObject.util_equals(this.tabs, bLiveBanner.tabs) && ValueObject.util_equals(this.type, bLiveBanner.type);
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
        String str = this.f45184id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.rowIndex) * 41;
        List<BLiveBannerTab> list = this.tabs;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45184id == null) {
            this.f45184id = "";
        }
        if (this.tabs == null) {
            this.tabs = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
