package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.GreetingBatchPostBody;
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
public class GreetingBatchPostBody extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingbatchpostbody";

    @NonNull
    @ProtobufIndex(index = 1)
    public String action;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> userIds;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String value;
    public static ProtobufAdapter<GreetingBatchPostBody> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingBatchPostBody>() { // from class: com.p1.mobile.putong.core.data.GreetingBatchPostBody.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GreetingBatchPostBody greetingBatchPostBody) {
            String str = greetingBatchPostBody.action;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = greetingBatchPostBody.value;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<String> list = greetingBatchPostBody.userIds;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) greetingBatchPostBody).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GreetingBatchPostBody m13017parse(nb5 nb5Var) throws IOException {
            GreetingBatchPostBody greetingBatchPostBody = new GreetingBatchPostBody();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (greetingBatchPostBody.action == null) {
                        greetingBatchPostBody.action = "";
                    }
                    if (greetingBatchPostBody.value == null) {
                        greetingBatchPostBody.value = "";
                    }
                    if (greetingBatchPostBody.userIds != null) {
                        break;
                    }
                    greetingBatchPostBody.userIds = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    greetingBatchPostBody.action = nb5Var.s();
                } else if (iU == 18) {
                    greetingBatchPostBody.value = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (greetingBatchPostBody.action == null) {
                            greetingBatchPostBody.action = "";
                        }
                        if (greetingBatchPostBody.value == null) {
                            greetingBatchPostBody.value = "";
                        }
                        if (greetingBatchPostBody.userIds != null) {
                            break;
                        }
                        greetingBatchPostBody.userIds = new ArrayList();
                        return greetingBatchPostBody;
                    }
                    greetingBatchPostBody.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return greetingBatchPostBody;
        }

        public void serialize(GreetingBatchPostBody greetingBatchPostBody, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = greetingBatchPostBody.action;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = greetingBatchPostBody.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<String> list = greetingBatchPostBody.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GreetingBatchPostBody> JSON_ADAPTER = new ObjectJsonAdapter<GreetingBatchPostBody>() { // from class: com.p1.mobile.putong.core.data.GreetingBatchPostBody.2
        public Class getDataClass() {
            return GreetingBatchPostBody.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GreetingBatchPostBody m13018newInstance() {
            return new GreetingBatchPostBody();
        }

        public boolean parseField(GreetingBatchPostBody greetingBatchPostBody, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    greetingBatchPostBody.action = jsonParser.getValueAsString();
                    return true;
                case "userIds":
                    greetingBatchPostBody.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "value":
                    greetingBatchPostBody.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GreetingBatchPostBody greetingBatchPostBody, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "action":
                case "userIds":
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(greetingBatchPostBody, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GreetingBatchPostBody greetingBatchPostBody, JsonGenerator jsonGenerator) throws IOException {
            String str = greetingBatchPostBody.action;
            if (str != null) {
                jsonGenerator.writeStringField("action", str);
            }
            String str2 = greetingBatchPostBody.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            if (greetingBatchPostBody.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(greetingBatchPostBody.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingBatchPostBody) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingBatchPostBody) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m363a(String str) {
        return str;
    }

    public static GreetingBatchPostBody new_() {
        GreetingBatchPostBody greetingBatchPostBody = new GreetingBatchPostBody();
        greetingBatchPostBody.nullCheck();
        return greetingBatchPostBody;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GreetingBatchPostBody m13016clone() {
        GreetingBatchPostBody greetingBatchPostBody = new GreetingBatchPostBody();
        greetingBatchPostBody.action = this.action;
        greetingBatchPostBody.value = this.value;
        List<String> list = this.userIds;
        if (list != null) {
            greetingBatchPostBody.userIds = ValueObject.util_map(list, new w9j() { // from class: l.fak
                public final Object call(Object obj) {
                    return GreetingBatchPostBody.m363a((String) obj);
                }
            });
        }
        return greetingBatchPostBody;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreetingBatchPostBody)) {
            return false;
        }
        GreetingBatchPostBody greetingBatchPostBody = (GreetingBatchPostBody) obj;
        return ValueObject.util_equals(this.action, greetingBatchPostBody.action) && ValueObject.util_equals(this.value, greetingBatchPostBody.value) && ValueObject.util_equals(this.userIds, greetingBatchPostBody.userIds);
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
        String str = this.action;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.userIds;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.action == null) {
            this.action = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
