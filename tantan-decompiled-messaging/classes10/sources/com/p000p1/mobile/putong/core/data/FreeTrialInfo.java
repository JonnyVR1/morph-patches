package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.FreeTrialConfig;
import com.p000p1.mobile.putong.core.data.FreeTrialRecords;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FreeTrialInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "freetrialinfo";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean allowTrial;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public Map<String, FreeTrialConfig> config;

    @ProtobufIndex(index = 1)
    public int popLevel;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<FreeTrialRecords> records;
    public static ProtobufAdapter<FreeTrialInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FreeTrialInfo>() { // from class: com.p1.mobile.putong.core.data.FreeTrialInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FreeTrialInfo freeTrialInfo) {
            int iH = CodedOutputByteBufferNano.h(1, freeTrialInfo.popLevel) + CodedOutputByteBufferNano.b(2, freeTrialInfo.allowTrial);
            Map<String, FreeTrialConfig> map = freeTrialInfo.config;
            if (map != null) {
                iH += CodedOutputByteBufferNano.l(3, map, FreeTrialConfig.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            List<FreeTrialRecords> list = freeTrialInfo.records;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(4, list, FreeTrialRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) freeTrialInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FreeTrialInfo m12837parse(nb5 nb5Var) throws IOException {
            FreeTrialInfo freeTrialInfo = new FreeTrialInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (freeTrialInfo.config == null) {
                        freeTrialInfo.config = Collections.EMPTY_MAP;
                    }
                    if (freeTrialInfo.records != null) {
                        break;
                    }
                    freeTrialInfo.records = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    freeTrialInfo.popLevel = nb5Var.j();
                } else if (iU == 16) {
                    freeTrialInfo.allowTrial = nb5Var.g();
                } else if (iU == 26) {
                    freeTrialInfo.config = (Map) nb5Var.l(FreeTrialConfig.PROTOBUF_ADAPTER.MAP_ADAPTER());
                } else {
                    if (iU != 34) {
                        if (freeTrialInfo.config == null) {
                            freeTrialInfo.config = Collections.EMPTY_MAP;
                        }
                        if (freeTrialInfo.records != null) {
                            break;
                        }
                        freeTrialInfo.records = new ArrayList();
                        return freeTrialInfo;
                    }
                    freeTrialInfo.records = (List) nb5Var.l(FreeTrialRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return freeTrialInfo;
        }

        public void serialize(FreeTrialInfo freeTrialInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, freeTrialInfo.popLevel);
            codedOutputByteBufferNano.A(2, freeTrialInfo.allowTrial);
            Map<String, FreeTrialConfig> map = freeTrialInfo.config;
            if (map != null) {
                codedOutputByteBufferNano.K(3, map, FreeTrialConfig.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            List<FreeTrialRecords> list = freeTrialInfo.records;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, FreeTrialRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FreeTrialInfo> JSON_ADAPTER = new ObjectJsonAdapter<FreeTrialInfo>() { // from class: com.p1.mobile.putong.core.data.FreeTrialInfo.2
        public Class getDataClass() {
            return FreeTrialInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FreeTrialInfo m12838newInstance() {
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

        public void serializeFields(FreeTrialInfo freeTrialInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("popLevel", freeTrialInfo.popLevel);
            jsonGenerator.writeBooleanField("allowTrial", freeTrialInfo.allowTrial);
            if (freeTrialInfo.config != null) {
                jsonGenerator.writeFieldName("config");
                JsonAdapter.serializeMap(freeTrialInfo.config, jsonGenerator, FreeTrialConfig.JSON_ADAPTER);
            }
            if (freeTrialInfo.records != null) {
                jsonGenerator.writeFieldName("records");
                JsonAdapter.serializeArray(freeTrialInfo.records, jsonGenerator, FreeTrialRecords.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FreeTrialInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FreeTrialInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FreeTrialInfo new_() {
        FreeTrialInfo freeTrialInfo = new FreeTrialInfo();
        freeTrialInfo.nullCheck();
        return freeTrialInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FreeTrialInfo m12836clone() {
        FreeTrialInfo freeTrialInfo = new FreeTrialInfo();
        freeTrialInfo.popLevel = this.popLevel;
        freeTrialInfo.allowTrial = this.allowTrial;
        Map<String, FreeTrialConfig> map = this.config;
        if (map != null) {
            freeTrialInfo.config = ValueObject.util_map(map, new w9j() { // from class: l.h6j
                public final Object call(Object obj) {
                    return ((FreeTrialConfig) obj).m12824clone();
                }
            });
        }
        List<FreeTrialRecords> list = this.records;
        if (list != null) {
            freeTrialInfo.records = ValueObject.util_map(list, new w9j() { // from class: l.i6j
                public final Object call(Object obj) {
                    return ((FreeTrialRecords) obj).m12844clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.popLevel) * 41) + (this.allowTrial ? 1231 : 1237)) * 41;
        Map<String, FreeTrialConfig> map = this.config;
        int iHashCode = (i2 + (map != null ? map.hashCode() : 0)) * 41;
        List<FreeTrialRecords> list = this.records;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.config == null) {
            this.config = Collections.EMPTY_MAP;
        }
        if (this.records == null) {
            this.records = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
