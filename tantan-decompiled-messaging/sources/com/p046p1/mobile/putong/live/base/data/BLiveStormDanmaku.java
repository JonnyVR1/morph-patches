package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuResource;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuTip;
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
public class BLiveStormDanmaku extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStormDanmaku> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStormDanmaku>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStormDanmaku.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStormDanmaku.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStormDanmaku newInstance() {
            return new BLiveStormDanmaku();
        }

        public boolean parseField(BLiveStormDanmaku bLiveStormDanmaku, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("resources")) {
                bLiveStormDanmaku.resources = JsonAdapter.parseArray(jsonParser, BLiveStormDanmakuResource.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("defaultComments")) {
                return false;
            }
            bLiveStormDanmaku.defaultComments = JsonAdapter.parseArray(jsonParser, BLiveStormDanmakuTip.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStormDanmaku bLiveStormDanmaku, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveStormDanmaku.resources != null) {
                jsonGenerator.writeFieldName("resources");
                JsonAdapter.serializeArray(bLiveStormDanmaku.resources, jsonGenerator, BLiveStormDanmakuResource.JSON_ADAPTER);
            }
            if (bLiveStormDanmaku.defaultComments != null) {
                jsonGenerator.writeFieldName("defaultComments");
                JsonAdapter.serializeArray(bLiveStormDanmaku.defaultComments, jsonGenerator, BLiveStormDanmakuTip.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStormDanmaku) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestormdanmaku";

    @Nullable
    @ProtobufIndex(index = 2)
    public List<BLiveStormDanmakuTip> defaultComments;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveStormDanmakuResource> resources;

    public static BLiveStormDanmaku new_() {
        BLiveStormDanmaku bLiveStormDanmaku = new BLiveStormDanmaku();
        bLiveStormDanmaku.nullCheck();
        return bLiveStormDanmaku;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStormDanmaku mo223809clone() {
        BLiveStormDanmaku bLiveStormDanmaku = new BLiveStormDanmaku();
        List<BLiveStormDanmakuResource> list = this.resources;
        if (list != null) {
            bLiveStormDanmaku.resources = ValueObject.util_map(list, new w9j() { // from class: l.e62
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveStormDanmakuResource) obj).mo223809clone();
                }
            });
        }
        List<BLiveStormDanmakuTip> list2 = this.defaultComments;
        if (list2 != null) {
            bLiveStormDanmaku.defaultComments = ValueObject.util_map(list2, new w9j() { // from class: l.f62
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveStormDanmakuTip) obj).mo223809clone();
                }
            });
        }
        return bLiveStormDanmaku;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStormDanmaku)) {
            return false;
        }
        BLiveStormDanmaku bLiveStormDanmaku = (BLiveStormDanmaku) obj;
        return ValueObject.util_equals(this.resources, bLiveStormDanmaku.resources) && ValueObject.util_equals(this.defaultComments, bLiveStormDanmaku.defaultComments);
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
        List<BLiveStormDanmakuResource> list = this.resources;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveStormDanmakuTip> list2 = this.defaultComments;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.resources == null) {
            this.resources = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
