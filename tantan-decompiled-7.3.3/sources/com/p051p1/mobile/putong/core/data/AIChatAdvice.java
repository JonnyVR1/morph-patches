package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.AIAdviceResults;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class AIChatAdvice extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aichatadvice";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21080id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String response_uuid;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<AIAdviceResults> results;
    public static ProtobufAdapter<AIChatAdvice> PROTOBUF_ADAPTER = new MessageNanoAdapter<AIChatAdvice>() { // from class: com.p1.mobile.putong.core.data.AIChatAdvice.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AIChatAdvice aIChatAdvice) {
            String str = aIChatAdvice.f21080id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<AIAdviceResults> list = aIChatAdvice.results;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, AIAdviceResults.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = aIChatAdvice.response_uuid;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            aIChatAdvice.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AIChatAdvice parse(nc5 nc5Var) throws IOException {
            AIChatAdvice aIChatAdvice = new AIChatAdvice();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (aIChatAdvice.f21080id == null) {
                        aIChatAdvice.f21080id = "";
                    }
                    if (aIChatAdvice.results == null) {
                        aIChatAdvice.results = new ArrayList();
                    }
                    if (aIChatAdvice.response_uuid != null) {
                        break;
                    }
                    aIChatAdvice.response_uuid = "";
                    break;
                }
                if (iM162497u == 10) {
                    aIChatAdvice.f21080id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    aIChatAdvice.results = (List) nc5Var.m162488l(AIAdviceResults.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (aIChatAdvice.f21080id == null) {
                            aIChatAdvice.f21080id = "";
                        }
                        if (aIChatAdvice.results == null) {
                            aIChatAdvice.results = new ArrayList();
                        }
                        if (aIChatAdvice.response_uuid != null) {
                            break;
                        }
                        aIChatAdvice.response_uuid = "";
                        return aIChatAdvice;
                    }
                    aIChatAdvice.response_uuid = nc5Var.m162495s();
                }
            }
            return aIChatAdvice;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AIChatAdvice aIChatAdvice, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aIChatAdvice.f21080id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<AIAdviceResults> list = aIChatAdvice.results;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, AIAdviceResults.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = aIChatAdvice.response_uuid;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<AIChatAdvice> JSON_ADAPTER = new ObjectJsonAdapter<AIChatAdvice>() { // from class: com.p1.mobile.putong.core.data.AIChatAdvice.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AIChatAdvice.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AIChatAdvice newInstance() {
            return new AIChatAdvice();
        }

        public boolean parseField(AIChatAdvice aIChatAdvice, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    aIChatAdvice.f21080id = jsonParser.getValueAsString();
                    return false;
                case "results":
                    aIChatAdvice.results = JsonAdapter.parseArray(jsonParser, AIAdviceResults.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "response_uuid":
                    aIChatAdvice.response_uuid = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AIChatAdvice aIChatAdvice, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "results":
                case "response_uuid":
                    return true;
                default:
                    return super.parseFieldCheck(aIChatAdvice, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AIChatAdvice aIChatAdvice, JsonGenerator jsonGenerator) throws IOException {
            String str = aIChatAdvice.f21080id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (aIChatAdvice.results != null) {
                jsonGenerator.writeFieldName("results");
                JsonAdapter.serializeArray(aIChatAdvice.results, jsonGenerator, AIAdviceResults.JSON_ADAPTER);
            }
            String str2 = aIChatAdvice.response_uuid;
            if (str2 != null) {
                jsonGenerator.writeStringField("response_uuid", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AIChatAdvice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AIChatAdvice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AIChatAdvice new_() {
        AIChatAdvice aIChatAdvice = new AIChatAdvice();
        aIChatAdvice.nullCheck();
        return aIChatAdvice;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AIChatAdvice mo225055clone() {
        AIChatAdvice aIChatAdvice = new AIChatAdvice();
        aIChatAdvice.f21080id = this.f21080id;
        List<AIAdviceResults> list = this.results;
        if (list != null) {
            aIChatAdvice.results = ValueObject.util_map(list, new qcj() { // from class: l.u
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((AIAdviceResults) obj).mo225055clone();
                }
            });
        }
        aIChatAdvice.response_uuid = this.response_uuid;
        return aIChatAdvice;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AIChatAdvice)) {
            return false;
        }
        AIChatAdvice aIChatAdvice = (AIChatAdvice) obj;
        return ValueObject.util_equals(this.f21080id, aIChatAdvice.f21080id) && ValueObject.util_equals(this.results, aIChatAdvice.results) && ValueObject.util_equals(this.response_uuid, aIChatAdvice.response_uuid);
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
        String str = this.f21080id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<AIAdviceResults> list = this.results;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.response_uuid;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21080id == null) {
            this.f21080id = "";
        }
        if (this.results == null) {
            this.results = new ArrayList();
        }
        if (this.response_uuid == null) {
            this.response_uuid = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
