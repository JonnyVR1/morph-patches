package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveMagicList;
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
public class BLiveMagic extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMagic> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMagic>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMagic.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMagic.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMagic newInstance() {
            return new BLiveMagic();
        }

        public boolean parseField(BLiveMagic bLiveMagic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "title":
                    bLiveMagic.title = jsonParser.getValueAsString();
                    return true;
                case "gestureModelMd5":
                    bLiveMagic.gestureModelMd5 = jsonParser.getValueAsString();
                    return true;
                case "gestureModelUrl":
                    bLiveMagic.gestureModelUrl = jsonParser.getValueAsString();
                    return true;
                case "liveMagicLists":
                    bLiveMagic.liveMagicLists = JsonAdapter.parseArray(jsonParser, BLiveMagicList.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMagic bLiveMagic, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMagic.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            if (bLiveMagic.liveMagicLists != null) {
                jsonGenerator.writeFieldName("liveMagicLists");
                JsonAdapter.serializeArray(bLiveMagic.liveMagicLists, jsonGenerator, BLiveMagicList.JSON_ADAPTER);
            }
            String str2 = bLiveMagic.gestureModelUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("gestureModelUrl", str2);
            }
            String str3 = bLiveMagic.gestureModelMd5;
            if (str3 != null) {
                jsonGenerator.writeStringField("gestureModelMd5", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMagic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemagic";

    @NonNull
    @ProtobufIndex(index = 4)
    public String gestureModelMd5;

    @NonNull
    @ProtobufIndex(index = 3)
    public String gestureModelUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveMagicList> liveMagicLists;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLiveMagic new_() {
        BLiveMagic bLiveMagic = new BLiveMagic();
        bLiveMagic.nullCheck();
        return bLiveMagic;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMagic mo225055clone() {
        BLiveMagic bLiveMagic = new BLiveMagic();
        bLiveMagic.title = this.title;
        List<BLiveMagicList> list = this.liveMagicLists;
        if (list != null) {
            bLiveMagic.liveMagicLists = ValueObject.util_map(list, new qcj() { // from class: l.h22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMagicList) obj).mo225055clone();
                }
            });
        }
        bLiveMagic.gestureModelUrl = this.gestureModelUrl;
        bLiveMagic.gestureModelMd5 = this.gestureModelMd5;
        return bLiveMagic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMagic)) {
            return false;
        }
        BLiveMagic bLiveMagic = (BLiveMagic) obj;
        return ValueObject.util_equals(this.title, bLiveMagic.title) && ValueObject.util_equals(this.liveMagicLists, bLiveMagic.liveMagicLists) && ValueObject.util_equals(this.gestureModelUrl, bLiveMagic.gestureModelUrl) && ValueObject.util_equals(this.gestureModelMd5, bLiveMagic.gestureModelMd5);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveMagicList> list = this.liveMagicLists;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.gestureModelUrl;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.gestureModelMd5;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.liveMagicLists == null) {
            this.liveMagicLists = new ArrayList();
        }
        if (this.gestureModelUrl == null) {
            this.gestureModelUrl = "";
        }
        if (this.gestureModelMd5 == null) {
            this.gestureModelMd5 = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
