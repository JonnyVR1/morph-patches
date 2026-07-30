package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSTriggerRule;
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
import java.util.Map;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class OMSTriggerRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omstriggerrule";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39645id;

    @NonNull
    @ProtobufIndex(index = 2)
    public Map<String, Integer> variables;
    public static ProtobufAdapter<OMSTriggerRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSTriggerRule>() { // from class: com.p1.mobile.putong.data.OMSTriggerRule.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSTriggerRule oMSTriggerRule) {
            String str = oMSTriggerRule.f39645id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            Map<String, Integer> map = oMSTriggerRule.variables;
            if (map != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, map, ProtobufAdapter.INT_BOXED_ADAPTER.MAP_ADAPTER());
            }
            oMSTriggerRule.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSTriggerRule parse(nc5 nc5Var) throws IOException {
            OMSTriggerRule oMSTriggerRule = new OMSTriggerRule();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oMSTriggerRule.f39645id == null) {
                        oMSTriggerRule.f39645id = "";
                    }
                    if (oMSTriggerRule.variables != null) {
                        break;
                    }
                    oMSTriggerRule.variables = Collections.EMPTY_MAP;
                    break;
                }
                if (iM162497u == 10) {
                    oMSTriggerRule.f39645id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (oMSTriggerRule.f39645id == null) {
                            oMSTriggerRule.f39645id = "";
                        }
                        if (oMSTriggerRule.variables != null) {
                            break;
                        }
                        oMSTriggerRule.variables = Collections.EMPTY_MAP;
                        return oMSTriggerRule;
                    }
                    oMSTriggerRule.variables = (Map) nc5Var.m162488l(ProtobufAdapter.INT_BOXED_ADAPTER.MAP_ADAPTER());
                }
            }
            return oMSTriggerRule;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSTriggerRule oMSTriggerRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSTriggerRule.f39645id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            Map<String, Integer> map = oMSTriggerRule.variables;
            if (map != null) {
                codedOutputByteBufferNano.m17309K(2, map, ProtobufAdapter.INT_BOXED_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSTriggerRule> JSON_ADAPTER = new ObjectJsonAdapter<OMSTriggerRule>() { // from class: com.p1.mobile.putong.data.OMSTriggerRule.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSTriggerRule.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSTriggerRule newInstance() {
            return new OMSTriggerRule();
        }

        public boolean parseField(OMSTriggerRule oMSTriggerRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("variables")) {
                oMSTriggerRule.variables = JsonAdapter.parseMap(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2);
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            oMSTriggerRule.f39645id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(OMSTriggerRule oMSTriggerRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("variables")) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(oMSTriggerRule, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSTriggerRule oMSTriggerRule, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSTriggerRule.f39645id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (oMSTriggerRule.variables != null) {
                jsonGenerator.writeFieldName("variables");
                JsonAdapter.serializeMap(oMSTriggerRule.variables, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSTriggerRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSTriggerRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m61126a(Integer num) {
        return num;
    }

    public static OMSTriggerRule new_() {
        OMSTriggerRule oMSTriggerRule = new OMSTriggerRule();
        oMSTriggerRule.nullCheck();
        return oMSTriggerRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSTriggerRule mo225055clone() {
        OMSTriggerRule oMSTriggerRule = new OMSTriggerRule();
        oMSTriggerRule.f39645id = this.f39645id;
        Map<String, Integer> map = this.variables;
        if (map != null) {
            oMSTriggerRule.variables = ValueObject.util_map(map, new qcj() { // from class: l.e850
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OMSTriggerRule.m61126a((Integer) obj);
                }
            });
        }
        return oMSTriggerRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSTriggerRule)) {
            return false;
        }
        OMSTriggerRule oMSTriggerRule = (OMSTriggerRule) obj;
        return ValueObject.util_equals(this.f39645id, oMSTriggerRule.f39645id) && ValueObject.util_equals(this.variables, oMSTriggerRule.variables);
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
        String str = this.f39645id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Map<String, Integer> map = this.variables;
        int iHashCode2 = iHashCode + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39645id == null) {
            this.f39645id = "";
        }
        if (this.variables == null) {
            this.variables = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
