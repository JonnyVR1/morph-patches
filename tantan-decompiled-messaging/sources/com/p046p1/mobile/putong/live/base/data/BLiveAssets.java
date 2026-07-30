package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAssets extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAssets> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAssets>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAssets.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAssets.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAssets newInstance() {
            return new BLiveAssets();
        }

        public boolean parseField(BLiveAssets bLiveAssets, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("liveTabConfig")) {
                bLiveAssets.liveTabConfig = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("livePermissionControl")) {
                return false;
            }
            bLiveAssets.livePermissionControl = BLivePermissionControl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAssets bLiveAssets, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveAssets.liveTabConfig != null) {
                jsonGenerator.writeFieldName("liveTabConfig");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveAssets.liveTabConfig, jsonGenerator, true);
            }
            if (bLiveAssets.livePermissionControl != null) {
                jsonGenerator.writeFieldName("livePermissionControl");
                BLivePermissionControl.JSON_ADAPTER.serialize(bLiveAssets.livePermissionControl, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAssets) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveassets";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLivePermissionControl livePermissionControl;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveCommonConfig liveTabConfig;

    public static BLiveAssets new_() {
        BLiveAssets bLiveAssets = new BLiveAssets();
        bLiveAssets.nullCheck();
        return bLiveAssets;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAssets mo223809clone() {
        BLiveAssets bLiveAssets = new BLiveAssets();
        BLiveCommonConfig bLiveCommonConfig = this.liveTabConfig;
        if (bLiveCommonConfig != null) {
            bLiveAssets.liveTabConfig = bLiveCommonConfig.mo223809clone();
        }
        BLivePermissionControl bLivePermissionControl = this.livePermissionControl;
        if (bLivePermissionControl != null) {
            bLiveAssets.livePermissionControl = bLivePermissionControl.mo223809clone();
        }
        return bLiveAssets;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAssets)) {
            return false;
        }
        BLiveAssets bLiveAssets = (BLiveAssets) obj;
        return ValueObject.util_equals(this.liveTabConfig, bLiveAssets.liveTabConfig) && ValueObject.util_equals(this.livePermissionControl, bLiveAssets.livePermissionControl);
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
        BLiveCommonConfig bLiveCommonConfig = this.liveTabConfig;
        int iHashCode = (i2 + (bLiveCommonConfig != null ? bLiveCommonConfig.hashCode() : 0)) * 41;
        BLivePermissionControl bLivePermissionControl = this.livePermissionControl;
        int iHashCode2 = iHashCode + (bLivePermissionControl != null ? bLivePermissionControl.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveTabConfig == null) {
            this.liveTabConfig = BLiveCommonConfig.new_();
        }
        if (this.livePermissionControl == null) {
            this.livePermissionControl = BLivePermissionControl.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
