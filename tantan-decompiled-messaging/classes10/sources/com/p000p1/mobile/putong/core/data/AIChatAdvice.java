package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.AIAdviceResults;
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
public class AIChatAdvice extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aichatadvice";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f0id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String response_uuid;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<AIAdviceResults> results;
    public static ProtobufAdapter<AIChatAdvice> PROTOBUF_ADAPTER = new MessageNanoAdapter<AIChatAdvice>() { // from class: com.p1.mobile.putong.core.data.AIChatAdvice.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AIChatAdvice aIChatAdvice) {
            String str = aIChatAdvice.f0id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<AIAdviceResults> list = aIChatAdvice.results;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, AIAdviceResults.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = aIChatAdvice.response_uuid;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) aIChatAdvice).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AIChatAdvice m11471parse(nb5 nb5Var) throws IOException {
            AIChatAdvice aIChatAdvice = new AIChatAdvice();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aIChatAdvice.f0id == null) {
                        aIChatAdvice.f0id = "";
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
                if (iU == 10) {
                    aIChatAdvice.f0id = nb5Var.s();
                } else if (iU == 18) {
                    aIChatAdvice.results = (List) nb5Var.l(AIAdviceResults.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (aIChatAdvice.f0id == null) {
                            aIChatAdvice.f0id = "";
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
                    aIChatAdvice.response_uuid = nb5Var.s();
                }
            }
            return aIChatAdvice;
        }

        public void serialize(AIChatAdvice aIChatAdvice, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aIChatAdvice.f0id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<AIAdviceResults> list = aIChatAdvice.results;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, AIAdviceResults.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = aIChatAdvice.response_uuid;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<AIChatAdvice> JSON_ADAPTER = new ObjectJsonAdapter<AIChatAdvice>() { // from class: com.p1.mobile.putong.core.data.AIChatAdvice.2
        public Class getDataClass() {
            return AIChatAdvice.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AIChatAdvice m11472newInstance() {
            return new AIChatAdvice();
        }

        public boolean parseField(AIChatAdvice aIChatAdvice, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    aIChatAdvice.f0id = jsonParser.getValueAsString();
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

        public void serializeFields(AIChatAdvice aIChatAdvice, JsonGenerator jsonGenerator) throws IOException {
            String str = aIChatAdvice.f0id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AIChatAdvice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AIChatAdvice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AIChatAdvice new_() {
        AIChatAdvice aIChatAdvice = new AIChatAdvice();
        aIChatAdvice.nullCheck();
        return aIChatAdvice;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AIChatAdvice m11470clone() {
        AIChatAdvice aIChatAdvice = new AIChatAdvice();
        aIChatAdvice.f0id = this.f0id;
        List<AIAdviceResults> list = this.results;
        if (list != null) {
            aIChatAdvice.results = ValueObject.util_map(list, new w9j() { // from class: l.u
                public final Object call(Object obj) {
                    return ((AIAdviceResults) obj).m11466clone();
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
        return ValueObject.util_equals(this.f0id, aIChatAdvice.f0id) && ValueObject.util_equals(this.results, aIChatAdvice.results) && ValueObject.util_equals(this.response_uuid, aIChatAdvice.response_uuid);
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
        String str = this.f0id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<AIAdviceResults> list = this.results;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.response_uuid;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f0id == null) {
            this.f0id = "";
        }
        if (this.results == null) {
            this.results = new ArrayList();
        }
        if (this.response_uuid == null) {
            this.response_uuid = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
