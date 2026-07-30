package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.RegionRule;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class RegionRulesData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "regionrulesdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<RegionRule> regionRules;
    public static ProtobufAdapter<RegionRulesData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RegionRulesData>() { // from class: com.p1.mobile.putong.core.data.RegionRulesData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RegionRulesData regionRulesData) {
            List<RegionRule> list = regionRulesData.regionRules;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, RegionRule.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            regionRulesData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RegionRulesData parse(nb5 nb5Var) throws IOException {
            RegionRulesData regionRulesData = new RegionRulesData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (regionRulesData.regionRules != null) {
                        break;
                    }
                    regionRulesData.regionRules = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (regionRulesData.regionRules != null) {
                        break;
                    }
                    regionRulesData.regionRules = new ArrayList();
                    return regionRulesData;
                }
                regionRulesData.regionRules = (List) nb5Var.m158743l(RegionRule.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return regionRulesData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RegionRulesData regionRulesData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<RegionRule> list = regionRulesData.regionRules;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, RegionRule.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RegionRulesData> JSON_ADAPTER = new ObjectJsonAdapter<RegionRulesData>() { // from class: com.p1.mobile.putong.core.data.RegionRulesData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RegionRulesData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RegionRulesData newInstance() {
            return new RegionRulesData();
        }

        public boolean parseField(RegionRulesData regionRulesData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("regionRules")) {
                return false;
            }
            regionRulesData.regionRules = JsonAdapter.parseArray(jsonParser, RegionRule.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RegionRulesData regionRulesData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("regionRules")) {
                return true;
            }
            return super.parseFieldCheck(regionRulesData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RegionRulesData regionRulesData, JsonGenerator jsonGenerator) throws IOException {
            if (regionRulesData.regionRules != null) {
                jsonGenerator.writeFieldName("regionRules");
                JsonAdapter.serializeArray(regionRulesData.regionRules, jsonGenerator, RegionRule.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RegionRulesData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RegionRulesData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RegionRulesData new_() {
        RegionRulesData regionRulesData = new RegionRulesData();
        regionRulesData.nullCheck();
        return regionRulesData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RegionRulesData mo223809clone() {
        RegionRulesData regionRulesData = new RegionRulesData();
        List<RegionRule> list = this.regionRules;
        if (list != null) {
            regionRulesData.regionRules = ValueObject.util_map(list, new w9j() { // from class: l.mnc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((RegionRule) obj).mo223809clone();
                }
            });
        }
        return regionRulesData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegionRulesData) {
            return ValueObject.util_equals(this.regionRules, ((RegionRulesData) obj).regionRules);
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
        List<RegionRule> list = this.regionRules;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.regionRules == null) {
            this.regionRules = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
