package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.sina.weibo.sdk.constant.WBConstants;
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
public class BLiveResourceInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveResourceInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveResourceInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveResourceInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveResourceInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveResourceInfo newInstance() {
            return new BLiveResourceInfo();
        }

        public boolean parseField(BLiveResourceInfo bLiveResourceInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveResources":
                    bLiveResourceInfo.liveResources = JsonAdapter.parseArray(jsonParser, BLiveEffect.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "version":
                    bLiveResourceInfo.version = jsonParser.getValueAsString();
                    return true;
                case "operation":
                    bLiveResourceInfo.operation = BLiveResOperation.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveResourceInfo bLiveResourceInfo, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveResourceInfo.operation != null) {
                jsonGenerator.writeFieldName(MessageType.operation);
                BLiveResOperation.JSON_ADAPTER.serialize(bLiveResourceInfo.operation, jsonGenerator, true);
            }
            String str = bLiveResourceInfo.version;
            if (str != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str);
            }
            if (bLiveResourceInfo.liveResources != null) {
                jsonGenerator.writeFieldName("liveResources");
                JsonAdapter.serializeArray(bLiveResourceInfo.liveResources, jsonGenerator, BLiveEffect.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveResourceInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveresourceinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveEffect> liveResources;

    @NonNull
    @ProtobufIndex(index = 1)
    @Deprecated
    public BLiveResOperation operation;

    @NonNull
    @ProtobufIndex(index = 2)
    public String version;

    public static BLiveResourceInfo new_() {
        BLiveResourceInfo bLiveResourceInfo = new BLiveResourceInfo();
        bLiveResourceInfo.nullCheck();
        return bLiveResourceInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveResourceInfo mo225055clone() {
        BLiveResourceInfo bLiveResourceInfo = new BLiveResourceInfo();
        bLiveResourceInfo.operation = this.operation;
        bLiveResourceInfo.version = this.version;
        List<BLiveEffect> list = this.liveResources;
        if (list != null) {
            bLiveResourceInfo.liveResources = ValueObject.util_map(list, new qcj() { // from class: l.e52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveEffect) obj).mo225055clone();
                }
            });
        }
        return bLiveResourceInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveResourceInfo)) {
            return false;
        }
        BLiveResourceInfo bLiveResourceInfo = (BLiveResourceInfo) obj;
        return ValueObject.util_equals(this.operation, bLiveResourceInfo.operation) && ValueObject.util_equals(this.version, bLiveResourceInfo.version) && ValueObject.util_equals(this.liveResources, bLiveResourceInfo.liveResources);
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
        BLiveResOperation bLiveResOperation = this.operation;
        int iHashCode = (i2 + (bLiveResOperation != null ? bLiveResOperation.hashCode() : 0)) * 41;
        String str = this.version;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveEffect> list = this.liveResources;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.operation == null) {
            this.operation = (BLiveResOperation) BLiveResOperation.JSON_ADAPTER.defaultEnum();
        }
        if (this.version == null) {
            this.version = "";
        }
        if (this.liveResources == null) {
            this.liveResources = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
