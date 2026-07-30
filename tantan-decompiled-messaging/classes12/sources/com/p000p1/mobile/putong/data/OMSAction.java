package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSAction;
import com.p000p1.mobile.putong.data.OMSPreCondition;
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
import java.util.List;
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class OMSAction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsaction";

    @NonNull
    @ProtobufIndex(index = 2)
    public Map<String, String> params;

    @Nullable
    @ProtobufIndex(index = 3)
    public List<OMSPreCondition> preCondition;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<OMSAction> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSAction>() { // from class: com.p1.mobile.putong.data.OMSAction.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSAction oMSAction) {
            String str = oMSAction.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Map<String, String> map = oMSAction.params;
            if (map != null) {
                iO += CodedOutputByteBufferNano.l(2, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            List<OMSPreCondition> list = oMSAction.preCondition;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, OMSPreCondition.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) oMSAction).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSAction m18567parse(nb5 nb5Var) throws IOException {
            OMSAction oMSAction = new OMSAction();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSAction.type == null) {
                        oMSAction.type = "";
                    }
                    if (oMSAction.params != null) {
                        break;
                    }
                    oMSAction.params = Collections.EMPTY_MAP;
                    break;
                }
                if (iU == 10) {
                    oMSAction.type = nb5Var.s();
                } else if (iU == 18) {
                    oMSAction.params = (Map) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (oMSAction.type == null) {
                            oMSAction.type = "";
                        }
                        if (oMSAction.params != null) {
                            break;
                        }
                        oMSAction.params = Collections.EMPTY_MAP;
                        return oMSAction;
                    }
                    oMSAction.preCondition = (List) nb5Var.l(OMSPreCondition.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oMSAction;
        }

        public void serialize(OMSAction oMSAction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSAction.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Map<String, String> map = oMSAction.params;
            if (map != null) {
                codedOutputByteBufferNano.K(2, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            List<OMSPreCondition> list = oMSAction.preCondition;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, OMSPreCondition.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSAction> JSON_ADAPTER = new ObjectJsonAdapter<OMSAction>() { // from class: com.p1.mobile.putong.data.OMSAction.2
        public Class getDataClass() {
            return OMSAction.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSAction mo17830newInstance() {
            return new OMSAction();
        }

        public boolean parseField(OMSAction oMSAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "params":
                    oMSAction.params = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                case "type":
                    oMSAction.type = jsonParser.getValueAsString();
                    return true;
                case "preCondition":
                    oMSAction.preCondition = JsonAdapter.parseArray(jsonParser, OMSPreCondition.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSAction oMSAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "params":
                case "type":
                case "preCondition":
                    return true;
                default:
                    return super.parseFieldCheck(oMSAction, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSAction oMSAction, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSAction.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (oMSAction.params != null) {
                jsonGenerator.writeFieldName("params");
                JsonAdapter.serializeMap(oMSAction.params, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (oMSAction.preCondition != null) {
                jsonGenerator.writeFieldName("preCondition");
                JsonAdapter.serializeArray(oMSAction.preCondition, jsonGenerator, OMSPreCondition.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m800b(String str) {
        return str;
    }

    public static OMSAction new_() {
        OMSAction oMSAction = new OMSAction();
        oMSAction.nullCheck();
        return oMSAction;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSAction m18566clone() {
        OMSAction oMSAction = new OMSAction();
        oMSAction.type = this.type;
        Map<String, String> map = this.params;
        if (map != null) {
            oMSAction.params = ValueObject.util_map(map, new w9j() { // from class: l.xx40
                public final Object call(Object obj) {
                    return OMSAction.m800b((String) obj);
                }
            });
        }
        List<OMSPreCondition> list = this.preCondition;
        if (list != null) {
            oMSAction.preCondition = ValueObject.util_map(list, new w9j() { // from class: l.yx40
                public final Object call(Object obj) {
                    return ((OMSPreCondition) obj).m18647clone();
                }
            });
        }
        return oMSAction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSAction)) {
            return false;
        }
        OMSAction oMSAction = (OMSAction) obj;
        return ValueObject.util_equals(this.type, oMSAction.type) && ValueObject.util_equals(this.params, oMSAction.params) && ValueObject.util_equals(this.preCondition, oMSAction.preCondition);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Map<String, String> map = this.params;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 41;
        List<OMSPreCondition> list = this.preCondition;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.params == null) {
            this.params = Collections.EMPTY_MAP;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
