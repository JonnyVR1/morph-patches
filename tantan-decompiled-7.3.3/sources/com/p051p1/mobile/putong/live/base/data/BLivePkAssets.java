package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLivePkFirstKillGift;
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
public class BLivePkAssets extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkAssets> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkAssets>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkAssets.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkAssets.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkAssets newInstance() {
            return new BLivePkAssets();
        }

        public boolean parseField(BLivePkAssets bLivePkAssets, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "firstKillGifts":
                    bLivePkAssets.firstKillGifts = JsonAdapter.parseArray(jsonParser, BLivePkFirstKillGift.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLivePkAssets.f45270id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLivePkAssets.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkAssets bLivePkAssets, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkAssets.f45270id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLivePkAssets.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (bLivePkAssets.firstKillGifts != null) {
                jsonGenerator.writeFieldName("firstKillGifts");
                JsonAdapter.serializeArray(bLivePkAssets.firstKillGifts, jsonGenerator, BLivePkFirstKillGift.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkAssets) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkassets";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLivePkFirstKillGift> firstKillGifts;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45270id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    public static BLivePkAssets new_() {
        BLivePkAssets bLivePkAssets = new BLivePkAssets();
        bLivePkAssets.nullCheck();
        return bLivePkAssets;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkAssets mo225055clone() {
        BLivePkAssets bLivePkAssets = new BLivePkAssets();
        bLivePkAssets.f45270id = this.f45270id;
        bLivePkAssets.type = this.type;
        List<BLivePkFirstKillGift> list = this.firstKillGifts;
        if (list != null) {
            bLivePkAssets.firstKillGifts = ValueObject.util_map(list, new qcj() { // from class: l.i42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePkFirstKillGift) obj).mo225055clone();
                }
            });
        }
        return bLivePkAssets;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkAssets)) {
            return false;
        }
        BLivePkAssets bLivePkAssets = (BLivePkAssets) obj;
        return ValueObject.util_equals(this.f45270id, bLivePkAssets.f45270id) && ValueObject.util_equals(this.type, bLivePkAssets.type) && ValueObject.util_equals(this.firstKillGifts, bLivePkAssets.firstKillGifts);
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
        String str = this.f45270id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLivePkFirstKillGift> list = this.firstKillGifts;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45270id == null) {
            this.f45270id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.firstKillGifts == null) {
            this.firstKillGifts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
