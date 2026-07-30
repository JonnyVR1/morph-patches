package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.core.data.LabelParams;
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
public class LabelStatistics extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "labelstatistics";

    @NonNull
    @ProtobufIndex(index = 1)
    public String eid;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<LabelParams> params;
    public static ProtobufAdapter<LabelStatistics> PROTOBUF_ADAPTER = new MessageNanoAdapter<LabelStatistics>() { // from class: com.p1.mobile.putong.core.data.LabelStatistics.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LabelStatistics labelStatistics) {
            String str = labelStatistics.eid;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<LabelParams> list = labelStatistics.params;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            labelStatistics.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LabelStatistics parse(nb5 nb5Var) throws IOException {
            LabelStatistics labelStatistics = new LabelStatistics();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (labelStatistics.eid == null) {
                        labelStatistics.eid = "";
                    }
                    if (labelStatistics.params != null) {
                        break;
                    }
                    labelStatistics.params = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    labelStatistics.eid = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (labelStatistics.eid == null) {
                            labelStatistics.eid = "";
                        }
                        if (labelStatistics.params != null) {
                            break;
                        }
                        labelStatistics.params = new ArrayList();
                        return labelStatistics;
                    }
                    labelStatistics.params = (List) nb5Var.m158743l(LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return labelStatistics;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LabelStatistics labelStatistics, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = labelStatistics.eid;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<LabelParams> list = labelStatistics.params;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LabelStatistics> JSON_ADAPTER = new ObjectJsonAdapter<LabelStatistics>() { // from class: com.p1.mobile.putong.core.data.LabelStatistics.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LabelStatistics.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LabelStatistics newInstance() {
            return new LabelStatistics();
        }

        public boolean parseField(LabelStatistics labelStatistics, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(CommandMessage.PARAMS)) {
                labelStatistics.params = JsonAdapter.parseArray(jsonParser, LabelParams.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("eid")) {
                return false;
            }
            labelStatistics.eid = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LabelStatistics labelStatistics, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(CommandMessage.PARAMS) || str.equals("eid")) {
                return true;
            }
            return super.parseFieldCheck(labelStatistics, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LabelStatistics labelStatistics, JsonGenerator jsonGenerator) throws IOException {
            String str = labelStatistics.eid;
            if (str != null) {
                jsonGenerator.writeStringField("eid", str);
            }
            if (labelStatistics.params != null) {
                jsonGenerator.writeFieldName(CommandMessage.PARAMS);
                JsonAdapter.serializeArray(labelStatistics.params, jsonGenerator, LabelParams.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LabelStatistics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LabelStatistics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LabelStatistics new_() {
        LabelStatistics labelStatistics = new LabelStatistics();
        labelStatistics.nullCheck();
        return labelStatistics;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LabelStatistics mo223809clone() {
        LabelStatistics labelStatistics = new LabelStatistics();
        labelStatistics.eid = this.eid;
        List<LabelParams> list = this.params;
        if (list != null) {
            labelStatistics.params = ValueObject.util_map(list, new w9j() { // from class: l.v6r
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LabelParams) obj).mo223809clone();
                }
            });
        }
        return labelStatistics;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LabelStatistics)) {
            return false;
        }
        LabelStatistics labelStatistics = (LabelStatistics) obj;
        return ValueObject.util_equals(this.eid, labelStatistics.eid) && ValueObject.util_equals(this.params, labelStatistics.params);
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
        String str = this.eid;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<LabelParams> list = this.params;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.eid == null) {
            this.eid = "";
        }
        if (this.params == null) {
            this.params = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
