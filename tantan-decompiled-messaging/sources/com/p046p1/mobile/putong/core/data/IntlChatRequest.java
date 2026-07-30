package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.IntlChatRequest;
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
public class IntlChatRequest extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlchatrequest";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Integer> add_chatRequest_count;
    public static ProtobufAdapter<IntlChatRequest> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlChatRequest>() { // from class: com.p1.mobile.putong.core.data.IntlChatRequest.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlChatRequest intlChatRequest) {
            List<Integer> list = intlChatRequest.add_chatRequest_count;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0;
            intlChatRequest.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlChatRequest parse(nb5 nb5Var) throws IOException {
            IntlChatRequest intlChatRequest = new IntlChatRequest();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlChatRequest.add_chatRequest_count != null) {
                        break;
                    }
                    intlChatRequest.add_chatRequest_count = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (intlChatRequest.add_chatRequest_count != null) {
                        break;
                    }
                    intlChatRequest.add_chatRequest_count = new ArrayList();
                    return intlChatRequest;
                }
                intlChatRequest.add_chatRequest_count = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            return intlChatRequest;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlChatRequest intlChatRequest, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Integer> list = intlChatRequest.add_chatRequest_count;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlChatRequest> JSON_ADAPTER = new ObjectJsonAdapter<IntlChatRequest>() { // from class: com.p1.mobile.putong.core.data.IntlChatRequest.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlChatRequest.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlChatRequest newInstance() {
            return new IntlChatRequest();
        }

        public boolean parseField(IntlChatRequest intlChatRequest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("add_chatRequest_count")) {
                return false;
            }
            intlChatRequest.add_chatRequest_count = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlChatRequest intlChatRequest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("add_chatRequest_count")) {
                return true;
            }
            return super.parseFieldCheck(intlChatRequest, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlChatRequest intlChatRequest, JsonGenerator jsonGenerator) throws IOException {
            if (intlChatRequest.add_chatRequest_count != null) {
                jsonGenerator.writeFieldName("add_chatRequest_count");
                JsonAdapter.serializeArray(intlChatRequest.add_chatRequest_count, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlChatRequest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlChatRequest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m35616a(Integer num) {
        return num;
    }

    public static IntlChatRequest new_() {
        IntlChatRequest intlChatRequest = new IntlChatRequest();
        intlChatRequest.nullCheck();
        return intlChatRequest;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlChatRequest mo223809clone() {
        IntlChatRequest intlChatRequest = new IntlChatRequest();
        List<Integer> list = this.add_chatRequest_count;
        if (list != null) {
            intlChatRequest.add_chatRequest_count = ValueObject.util_map(list, new w9j() { // from class: l.t5n
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlChatRequest.m35616a((Integer) obj);
                }
            });
        }
        return intlChatRequest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntlChatRequest) {
            return ValueObject.util_equals(this.add_chatRequest_count, ((IntlChatRequest) obj).add_chatRequest_count);
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
        List<Integer> list = this.add_chatRequest_count;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.add_chatRequest_count == null) {
            this.add_chatRequest_count = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
