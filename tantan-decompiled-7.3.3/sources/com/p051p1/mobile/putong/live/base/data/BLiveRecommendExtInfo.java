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
import java.net.URLEncoder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveRecommendExtInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRecommendExtInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRecommendExtInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRecommendExtInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRecommendExtInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRecommendExtInfo newInstance() {
            return new BLiveRecommendExtInfo();
        }

        public boolean parseField(BLiveRecommendExtInfo bLiveRecommendExtInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("category")) {
                return false;
            }
            bLiveRecommendExtInfo.category = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRecommendExtInfo bLiveRecommendExtInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveRecommendExtInfo.category;
            if (str != null) {
                jsonGenerator.writeStringField("category", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRecommendExtInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliverecommendextinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String category;

    public static BLiveRecommendExtInfo new_() {
        BLiveRecommendExtInfo bLiveRecommendExtInfo = new BLiveRecommendExtInfo();
        bLiveRecommendExtInfo.nullCheck();
        return bLiveRecommendExtInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRecommendExtInfo mo225055clone() {
        BLiveRecommendExtInfo bLiveRecommendExtInfo = new BLiveRecommendExtInfo();
        bLiveRecommendExtInfo.category = this.category;
        return bLiveRecommendExtInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveRecommendExtInfo) {
            return ValueObject.util_equals(this.category, ((BLiveRecommendExtInfo) obj).category);
        }
        return false;
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
        String str = this.category;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.category == null) {
            this.category = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public String toJsonAsQueryString() {
        return URLEncoder.encode(toJson());
    }
}
