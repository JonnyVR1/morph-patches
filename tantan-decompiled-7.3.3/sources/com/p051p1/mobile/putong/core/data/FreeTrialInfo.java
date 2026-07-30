package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.FreeTrialConfig;
import com.p051p1.mobile.putong.core.data.FreeTrialRecords;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class FreeTrialInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "freetrialinfo";

    @ProtobufIndex(index = 2)
    public boolean allowTrial;

    @NonNull
    @ProtobufIndex(index = 3)
    public Map<String, FreeTrialConfig> config;

    @ProtobufIndex(index = 1)
    public int popLevel;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<FreeTrialRecords> records;
    public static ProtobufAdapter<FreeTrialInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FreeTrialInfo>() { // from class: com.p1.mobile.putong.core.data.FreeTrialInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FreeTrialInfo freeTrialInfo) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, freeTrialInfo.popLevel) + CodedOutputByteBufferNano.m17275b(2, freeTrialInfo.allowTrial);
            Map<String, FreeTrialConfig> map = freeTrialInfo.config;
            if (map != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, map, FreeTrialConfig.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            List<FreeTrialRecords> list = freeTrialInfo.records;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, list, FreeTrialRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            freeTrialInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FreeTrialInfo parse(nc5 nc5Var) throws IOException {
            FreeTrialInfo freeTrialInfo = new FreeTrialInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (freeTrialInfo.config == null) {
                        freeTrialInfo.config = Collections.EMPTY_MAP;
                    }
                    if (freeTrialInfo.records != null) {
                        break;
                    }
                    freeTrialInfo.records = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    freeTrialInfo.popLevel = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    freeTrialInfo.allowTrial = nc5Var.m162483g();
                } else if (iM162497u == 26) {
                    freeTrialInfo.config = (Map) nc5Var.m162488l(FreeTrialConfig.PROTOBUF_ADAPTER.MAP_ADAPTER());
                } else {
                    if (iM162497u != 34) {
                        if (freeTrialInfo.config == null) {
                            freeTrialInfo.config = Collections.EMPTY_MAP;
                        }
                        if (freeTrialInfo.records != null) {
                            break;
                        }
                        freeTrialInfo.records = new ArrayList();
                        return freeTrialInfo;
                    }
                    freeTrialInfo.records = (List) nc5Var.m162488l(FreeTrialRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return freeTrialInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FreeTrialInfo freeTrialInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, freeTrialInfo.popLevel);
            codedOutputByteBufferNano.m17299A(2, freeTrialInfo.allowTrial);
            Map<String, FreeTrialConfig> map = freeTrialInfo.config;
            if (map != null) {
                codedOutputByteBufferNano.m17309K(3, map, FreeTrialConfig.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            List<FreeTrialRecords> list = freeTrialInfo.records;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, FreeTrialRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FreeTrialInfo> JSON_ADAPTER = new ObjectJsonAdapter<FreeTrialInfo>() { // from class: com.p1.mobile.putong.core.data.FreeTrialInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FreeTrialInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FreeTrialInfo newInstance() {
            return new FreeTrialInfo();
        }

        public boolean parseField(FreeTrialInfo freeTrialInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "config":
                    freeTrialInfo.config = JsonAdapter.parseMap(jsonParser, FreeTrialConfig.JSON_ADAPTER, str2);
                    return true;
                case "allowTrial":
                    freeTrialInfo.allowTrial = jsonParser.getValueAsBoolean();
                    return true;
                case "popLevel":
                    freeTrialInfo.popLevel = jsonParser.getValueAsInt();
                    return true;
                case "records":
                    freeTrialInfo.records = JsonAdapter.parseArray(jsonParser, FreeTrialRecords.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FreeTrialInfo freeTrialInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "config":
                case "allowTrial":
                case "popLevel":
                case "records":
                    return true;
                default:
                    return super.parseFieldCheck(freeTrialInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FreeTrialInfo freeTrialInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("popLevel", freeTrialInfo.popLevel);
            jsonGenerator.writeBooleanField("allowTrial", freeTrialInfo.allowTrial);
            if (freeTrialInfo.config != null) {
                jsonGenerator.writeFieldName(Constants.KEY_CONFIG);
                JsonAdapter.serializeMap(freeTrialInfo.config, jsonGenerator, FreeTrialConfig.JSON_ADAPTER);
            }
            if (freeTrialInfo.records != null) {
                jsonGenerator.writeFieldName("records");
                JsonAdapter.serializeArray(freeTrialInfo.records, jsonGenerator, FreeTrialRecords.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FreeTrialInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FreeTrialInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FreeTrialInfo new_() {
        FreeTrialInfo freeTrialInfo = new FreeTrialInfo();
        freeTrialInfo.nullCheck();
        return freeTrialInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FreeTrialInfo mo225055clone() {
        FreeTrialInfo freeTrialInfo = new FreeTrialInfo();
        freeTrialInfo.popLevel = this.popLevel;
        freeTrialInfo.allowTrial = this.allowTrial;
        Map<String, FreeTrialConfig> map = this.config;
        if (map != null) {
            freeTrialInfo.config = ValueObject.util_map(map, new qcj() { // from class: l.b9j
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((FreeTrialConfig) obj).mo225055clone();
                }
            });
        }
        List<FreeTrialRecords> list = this.records;
        if (list != null) {
            freeTrialInfo.records = ValueObject.util_map(list, new qcj() { // from class: l.c9j
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((FreeTrialRecords) obj).mo225055clone();
                }
            });
        }
        return freeTrialInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FreeTrialInfo)) {
            return false;
        }
        FreeTrialInfo freeTrialInfo = (FreeTrialInfo) obj;
        return this.popLevel == freeTrialInfo.popLevel && this.allowTrial == freeTrialInfo.allowTrial && ValueObject.util_equals(this.config, freeTrialInfo.config) && ValueObject.util_equals(this.records, freeTrialInfo.records);
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
        int i2 = ((((i * 41) + this.popLevel) * 41) + (this.allowTrial ? 1231 : 1237)) * 41;
        Map<String, FreeTrialConfig> map = this.config;
        int iHashCode = (i2 + (map != null ? map.hashCode() : 0)) * 41;
        List<FreeTrialRecords> list = this.records;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.config == null) {
            this.config = Collections.EMPTY_MAP;
        }
        if (this.records == null) {
            this.records = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
