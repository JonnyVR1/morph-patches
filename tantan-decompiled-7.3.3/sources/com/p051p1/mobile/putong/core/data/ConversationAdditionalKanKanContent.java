package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ConversationAdditionalKanKanContentIdWrapper;
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
public class ConversationAdditionalKanKanContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationadditionalkankancontent";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ConversationAdditionalKanKanContentIdWrapper> contents;

    @NonNull
    @ProtobufIndex(index = 3)
    public GreetingSummary greetingSummaryDetail;

    @NonNull
    @ProtobufIndex(index = 2)
    public String resonance;
    public static ProtobufAdapter<ConversationAdditionalKanKanContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationAdditionalKanKanContent>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalKanKanContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationAdditionalKanKanContent conversationAdditionalKanKanContent) {
            List<ConversationAdditionalKanKanContentIdWrapper> list = conversationAdditionalKanKanContent.contents;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ConversationAdditionalKanKanContentIdWrapper.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = conversationAdditionalKanKanContent.resonance;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            GreetingSummary greetingSummary = conversationAdditionalKanKanContent.greetingSummaryDetail;
            if (greetingSummary != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, greetingSummary, GreetingSummary.PROTOBUF_ADAPTER);
            }
            conversationAdditionalKanKanContent.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationAdditionalKanKanContent parse(nc5 nc5Var) throws IOException {
            ConversationAdditionalKanKanContent conversationAdditionalKanKanContent = new ConversationAdditionalKanKanContent();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (conversationAdditionalKanKanContent.contents == null) {
                        conversationAdditionalKanKanContent.contents = new ArrayList();
                    }
                    if (conversationAdditionalKanKanContent.resonance == null) {
                        conversationAdditionalKanKanContent.resonance = "";
                    }
                    if (conversationAdditionalKanKanContent.greetingSummaryDetail != null) {
                        break;
                    }
                    conversationAdditionalKanKanContent.greetingSummaryDetail = GreetingSummary.new_();
                    break;
                }
                if (iM162497u == 10) {
                    conversationAdditionalKanKanContent.contents = (List) nc5Var.m162488l(ConversationAdditionalKanKanContentIdWrapper.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 18) {
                    conversationAdditionalKanKanContent.resonance = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (conversationAdditionalKanKanContent.contents == null) {
                            conversationAdditionalKanKanContent.contents = new ArrayList();
                        }
                        if (conversationAdditionalKanKanContent.resonance == null) {
                            conversationAdditionalKanKanContent.resonance = "";
                        }
                        if (conversationAdditionalKanKanContent.greetingSummaryDetail != null) {
                            break;
                        }
                        conversationAdditionalKanKanContent.greetingSummaryDetail = GreetingSummary.new_();
                        return conversationAdditionalKanKanContent;
                    }
                    conversationAdditionalKanKanContent.greetingSummaryDetail = (GreetingSummary) nc5Var.m162488l(GreetingSummary.PROTOBUF_ADAPTER);
                }
            }
            return conversationAdditionalKanKanContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationAdditionalKanKanContent conversationAdditionalKanKanContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ConversationAdditionalKanKanContentIdWrapper> list = conversationAdditionalKanKanContent.contents;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ConversationAdditionalKanKanContentIdWrapper.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = conversationAdditionalKanKanContent.resonance;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            GreetingSummary greetingSummary = conversationAdditionalKanKanContent.greetingSummaryDetail;
            if (greetingSummary != null) {
                codedOutputByteBufferNano.m17309K(3, greetingSummary, GreetingSummary.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ConversationAdditionalKanKanContent> JSON_ADAPTER = new ObjectJsonAdapter<ConversationAdditionalKanKanContent>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalKanKanContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationAdditionalKanKanContent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationAdditionalKanKanContent newInstance() {
            return new ConversationAdditionalKanKanContent();
        }

        public boolean parseField(ConversationAdditionalKanKanContent conversationAdditionalKanKanContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "resonance":
                    conversationAdditionalKanKanContent.resonance = jsonParser.getValueAsString();
                    return true;
                case "greetingSummaryDetail":
                    conversationAdditionalKanKanContent.greetingSummaryDetail = GreetingSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "contents":
                    conversationAdditionalKanKanContent.contents = JsonAdapter.parseArray(jsonParser, ConversationAdditionalKanKanContentIdWrapper.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationAdditionalKanKanContent conversationAdditionalKanKanContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "resonance":
                case "greetingSummaryDetail":
                case "contents":
                    return true;
                default:
                    return super.parseFieldCheck(conversationAdditionalKanKanContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationAdditionalKanKanContent conversationAdditionalKanKanContent, JsonGenerator jsonGenerator) throws IOException {
            if (conversationAdditionalKanKanContent.contents != null) {
                jsonGenerator.writeFieldName("contents");
                JsonAdapter.serializeArray(conversationAdditionalKanKanContent.contents, jsonGenerator, ConversationAdditionalKanKanContentIdWrapper.JSON_ADAPTER);
            }
            String str = conversationAdditionalKanKanContent.resonance;
            if (str != null) {
                jsonGenerator.writeStringField("resonance", str);
            }
            if (conversationAdditionalKanKanContent.greetingSummaryDetail != null) {
                jsonGenerator.writeFieldName("greetingSummaryDetail");
                GreetingSummary.JSON_ADAPTER.serialize(conversationAdditionalKanKanContent.greetingSummaryDetail, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationAdditionalKanKanContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationAdditionalKanKanContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationAdditionalKanKanContent new_() {
        ConversationAdditionalKanKanContent conversationAdditionalKanKanContent = new ConversationAdditionalKanKanContent();
        conversationAdditionalKanKanContent.nullCheck();
        return conversationAdditionalKanKanContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationAdditionalKanKanContent mo225055clone() {
        ConversationAdditionalKanKanContent conversationAdditionalKanKanContent = new ConversationAdditionalKanKanContent();
        List<ConversationAdditionalKanKanContentIdWrapper> list = this.contents;
        if (list != null) {
            conversationAdditionalKanKanContent.contents = ValueObject.util_map(list, new qcj() { // from class: l.w46
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ConversationAdditionalKanKanContentIdWrapper) obj).mo225055clone();
                }
            });
        }
        conversationAdditionalKanKanContent.resonance = this.resonance;
        GreetingSummary greetingSummary = this.greetingSummaryDetail;
        if (greetingSummary != null) {
            conversationAdditionalKanKanContent.greetingSummaryDetail = greetingSummary.mo225055clone();
        }
        return conversationAdditionalKanKanContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationAdditionalKanKanContent)) {
            return false;
        }
        ConversationAdditionalKanKanContent conversationAdditionalKanKanContent = (ConversationAdditionalKanKanContent) obj;
        return ValueObject.util_equals(this.contents, conversationAdditionalKanKanContent.contents) && ValueObject.util_equals(this.resonance, conversationAdditionalKanKanContent.resonance) && ValueObject.util_equals(this.greetingSummaryDetail, conversationAdditionalKanKanContent.greetingSummaryDetail);
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
        List<ConversationAdditionalKanKanContentIdWrapper> list = this.contents;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.resonance;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        GreetingSummary greetingSummary = this.greetingSummaryDetail;
        int iHashCode3 = iHashCode2 + (greetingSummary != null ? greetingSummary.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.contents == null) {
            this.contents = new ArrayList();
        }
        if (this.resonance == null) {
            this.resonance = "";
        }
        if (this.greetingSummaryDetail == null) {
            this.greetingSummaryDetail = GreetingSummary.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
