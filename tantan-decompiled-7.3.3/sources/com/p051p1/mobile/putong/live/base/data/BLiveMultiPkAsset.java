package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkDuring;
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
public class BLiveMultiPkAsset extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiPkAsset> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiPkAsset>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiPkAsset.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiPkAsset.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiPkAsset newInstance() {
            return new BLiveMultiPkAsset();
        }

        public boolean parseField(BLiveMultiPkAsset bLiveMultiPkAsset, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("durations")) {
                bLiveMultiPkAsset.durations = JsonAdapter.parseArray(jsonParser, BLiveMultiPkDuring.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("rejectInvite")) {
                return false;
            }
            bLiveMultiPkAsset.rejectInvite = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiPkAsset bLiveMultiPkAsset, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("rejectInvite", bLiveMultiPkAsset.rejectInvite);
            if (bLiveMultiPkAsset.durations != null) {
                jsonGenerator.writeFieldName("durations");
                JsonAdapter.serializeArray(bLiveMultiPkAsset.durations, jsonGenerator, BLiveMultiPkDuring.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiPkAsset) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemultipkasset";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveMultiPkDuring> durations;

    @ProtobufIndex(index = 1)
    public boolean rejectInvite;

    public static BLiveMultiPkAsset new_() {
        BLiveMultiPkAsset bLiveMultiPkAsset = new BLiveMultiPkAsset();
        bLiveMultiPkAsset.nullCheck();
        return bLiveMultiPkAsset;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiPkAsset mo225055clone() {
        BLiveMultiPkAsset bLiveMultiPkAsset = new BLiveMultiPkAsset();
        bLiveMultiPkAsset.rejectInvite = this.rejectInvite;
        List<BLiveMultiPkDuring> list = this.durations;
        if (list != null) {
            bLiveMultiPkAsset.durations = ValueObject.util_map(list, new qcj() { // from class: l.f32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMultiPkDuring) obj).mo225055clone();
                }
            });
        }
        return bLiveMultiPkAsset;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiPkAsset)) {
            return false;
        }
        BLiveMultiPkAsset bLiveMultiPkAsset = (BLiveMultiPkAsset) obj;
        return this.rejectInvite == bLiveMultiPkAsset.rejectInvite && ValueObject.util_equals(this.durations, bLiveMultiPkAsset.durations);
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
        int i2 = ((i * 41) + (this.rejectInvite ? 1231 : 1237)) * 41;
        List<BLiveMultiPkDuring> list = this.durations;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.durations == null) {
            this.durations = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
