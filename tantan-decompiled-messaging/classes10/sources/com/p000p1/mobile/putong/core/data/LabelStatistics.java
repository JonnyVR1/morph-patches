package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.LabelParams;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LabelStatistics extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "labelstatistics";

    @NonNull
    @ProtobufIndex(index = 1)
    public String eid;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<LabelParams> params;
    public static ProtobufAdapter<LabelStatistics> PROTOBUF_ADAPTER = new MessageNanoAdapter<LabelStatistics>() { // from class: com.p1.mobile.putong.core.data.LabelStatistics.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LabelStatistics labelStatistics) {
            String str = labelStatistics.eid;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<LabelParams> list = labelStatistics.params;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) labelStatistics).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LabelStatistics m13809parse(nb5 nb5Var) throws IOException {
            LabelStatistics labelStatistics = new LabelStatistics();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (labelStatistics.eid == null) {
                        labelStatistics.eid = "";
                    }
                    if (labelStatistics.params != null) {
                        break;
                    }
                    labelStatistics.params = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    labelStatistics.eid = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (labelStatistics.eid == null) {
                            labelStatistics.eid = "";
                        }
                        if (labelStatistics.params != null) {
                            break;
                        }
                        labelStatistics.params = new ArrayList();
                        return labelStatistics;
                    }
                    labelStatistics.params = (List) nb5Var.l(LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return labelStatistics;
        }

        public void serialize(LabelStatistics labelStatistics, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = labelStatistics.eid;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<LabelParams> list = labelStatistics.params;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LabelStatistics> JSON_ADAPTER = new ObjectJsonAdapter<LabelStatistics>() { // from class: com.p1.mobile.putong.core.data.LabelStatistics.2
        public Class getDataClass() {
            return LabelStatistics.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LabelStatistics m13810newInstance() {
            return new LabelStatistics();
        }

        public boolean parseField(LabelStatistics labelStatistics, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("params")) {
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
            if (str.equals("params") || str.equals("eid")) {
                return true;
            }
            return super.parseFieldCheck(labelStatistics, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LabelStatistics labelStatistics, JsonGenerator jsonGenerator) throws IOException {
            String str = labelStatistics.eid;
            if (str != null) {
                jsonGenerator.writeStringField("eid", str);
            }
            if (labelStatistics.params != null) {
                jsonGenerator.writeFieldName("params");
                JsonAdapter.serializeArray(labelStatistics.params, jsonGenerator, LabelParams.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LabelStatistics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LabelStatistics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LabelStatistics new_() {
        LabelStatistics labelStatistics = new LabelStatistics();
        labelStatistics.nullCheck();
        return labelStatistics;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LabelStatistics m13808clone() {
        LabelStatistics labelStatistics = new LabelStatistics();
        labelStatistics.eid = this.eid;
        List<LabelParams> list = this.params;
        if (list != null) {
            labelStatistics.params = ValueObject.util_map(list, new w9j() { // from class: l.v6r
                public final Object call(Object obj) {
                    return ((LabelParams) obj).m13804clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.eid;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<LabelParams> list = this.params;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.eid == null) {
            this.eid = "";
        }
        if (this.params == null) {
            this.params = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
