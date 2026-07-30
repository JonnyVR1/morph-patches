package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSTriggerRule;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class OMSTriggerRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omstriggerrule";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f258id;

    @NonNull
    @ProtobufIndex(index = 2)
    public Map<String, Integer> variables;
    public static ProtobufAdapter<OMSTriggerRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSTriggerRule>() { // from class: com.p1.mobile.putong.data.OMSTriggerRule.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSTriggerRule oMSTriggerRule) {
            String str = oMSTriggerRule.f258id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Map<String, Integer> map = oMSTriggerRule.variables;
            if (map != null) {
                iO += CodedOutputByteBufferNano.l(2, map, ProtobufAdapter.INT_BOXED_ADAPTER.MAP_ADAPTER());
            }
            ((MessageNano) oMSTriggerRule).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSTriggerRule m18684parse(nb5 nb5Var) throws IOException {
            OMSTriggerRule oMSTriggerRule = new OMSTriggerRule();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSTriggerRule.f258id == null) {
                        oMSTriggerRule.f258id = "";
                    }
                    if (oMSTriggerRule.variables != null) {
                        break;
                    }
                    oMSTriggerRule.variables = Collections.EMPTY_MAP;
                    break;
                }
                if (iU == 10) {
                    oMSTriggerRule.f258id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (oMSTriggerRule.f258id == null) {
                            oMSTriggerRule.f258id = "";
                        }
                        if (oMSTriggerRule.variables != null) {
                            break;
                        }
                        oMSTriggerRule.variables = Collections.EMPTY_MAP;
                        return oMSTriggerRule;
                    }
                    oMSTriggerRule.variables = (Map) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.MAP_ADAPTER());
                }
            }
            return oMSTriggerRule;
        }

        public void serialize(OMSTriggerRule oMSTriggerRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSTriggerRule.f258id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Map<String, Integer> map = oMSTriggerRule.variables;
            if (map != null) {
                codedOutputByteBufferNano.K(2, map, ProtobufAdapter.INT_BOXED_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSTriggerRule> JSON_ADAPTER = new ObjectJsonAdapter<OMSTriggerRule>() { // from class: com.p1.mobile.putong.data.OMSTriggerRule.2
        public Class getDataClass() {
            return OMSTriggerRule.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSTriggerRule mo17830newInstance() {
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
            oMSTriggerRule.f258id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSTriggerRule oMSTriggerRule, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSTriggerRule.f258id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (oMSTriggerRule.variables != null) {
                jsonGenerator.writeFieldName("variables");
                JsonAdapter.serializeMap(oMSTriggerRule.variables, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSTriggerRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSTriggerRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m860a(Integer num) {
        return num;
    }

    public static OMSTriggerRule new_() {
        OMSTriggerRule oMSTriggerRule = new OMSTriggerRule();
        oMSTriggerRule.nullCheck();
        return oMSTriggerRule;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSTriggerRule m18683clone() {
        OMSTriggerRule oMSTriggerRule = new OMSTriggerRule();
        oMSTriggerRule.f258id = this.f258id;
        Map<String, Integer> map = this.variables;
        if (map != null) {
            oMSTriggerRule.variables = ValueObject.util_map(map, new w9j() { // from class: l.pz40
                public final Object call(Object obj) {
                    return OMSTriggerRule.m860a((Integer) obj);
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
        return ValueObject.util_equals(this.f258id, oMSTriggerRule.f258id) && ValueObject.util_equals(this.variables, oMSTriggerRule.variables);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f258id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Map<String, Integer> map = this.variables;
        int iHashCode2 = iHashCode + (map != null ? map.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f258id == null) {
            this.f258id = "";
        }
        if (this.variables == null) {
            this.variables = Collections.EMPTY_MAP;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
