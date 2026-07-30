package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
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
public class BLiveOperation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveoperation";

    @Nullable
    @ProtobufIndex(index = 1)
    public BLiveOperationDefaultConfig defaultConfig;
    public String extraData;
    public boolean isInit;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveOperationItem> operations;
    public boolean showOperationDrawer;
    public static final BLiveOperation REFRESH_UNIT = new_();
    public static JsonAdapter<BLiveOperation> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperation>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperation.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperation newInstance() {
            return new BLiveOperation();
        }

        public boolean parseField(BLiveOperation bLiveOperation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("operations")) {
                bLiveOperation.operations = JsonAdapter.parseArray(jsonParser, BLiveOperationItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("defaultConfig")) {
                return false;
            }
            bLiveOperation.defaultConfig = BLiveOperationDefaultConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperation bLiveOperation, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveOperation.defaultConfig != null) {
                jsonGenerator.writeFieldName("defaultConfig");
                BLiveOperationDefaultConfig.JSON_ADAPTER.serialize(bLiveOperation.defaultConfig, jsonGenerator, true);
            }
            if (bLiveOperation.operations != null) {
                jsonGenerator.writeFieldName("operations");
                JsonAdapter.serializeArray(bLiveOperation.operations, jsonGenerator, BLiveOperationItem.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BLiveOperation new_() {
        BLiveOperation bLiveOperation = new BLiveOperation();
        bLiveOperation.nullCheck();
        return bLiveOperation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperation mo223809clone() {
        BLiveOperation bLiveOperation = new BLiveOperation();
        BLiveOperationDefaultConfig bLiveOperationDefaultConfig = this.defaultConfig;
        if (bLiveOperationDefaultConfig != null) {
            bLiveOperation.defaultConfig = bLiveOperationDefaultConfig.mo223809clone();
        }
        List<BLiveOperationItem> list = this.operations;
        if (list != null) {
            bLiveOperation.operations = ValueObject.util_map(list, new w9j() { // from class: l.u32
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveOperationItem) obj).mo223809clone();
                }
            });
        }
        return bLiveOperation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperation)) {
            return false;
        }
        BLiveOperation bLiveOperation = (BLiveOperation) obj;
        return ValueObject.util_equals(this.defaultConfig, bLiveOperation.defaultConfig) && ValueObject.util_equals(this.operations, bLiveOperation.operations);
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
        BLiveOperationDefaultConfig bLiveOperationDefaultConfig = this.defaultConfig;
        int iHashCode = (i2 + (bLiveOperationDefaultConfig != null ? bLiveOperationDefaultConfig.hashCode() : 0)) * 41;
        List<BLiveOperationItem> list = this.operations;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.operations == null) {
            this.operations = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
