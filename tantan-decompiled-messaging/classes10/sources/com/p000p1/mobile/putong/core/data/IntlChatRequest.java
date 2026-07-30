package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IntlChatRequest;
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
public class IntlChatRequest extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlchatrequest";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Integer> add_chatRequest_count;
    public static ProtobufAdapter<IntlChatRequest> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlChatRequest>() { // from class: com.p1.mobile.putong.core.data.IntlChatRequest.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlChatRequest intlChatRequest) {
            List<Integer> list = intlChatRequest.add_chatRequest_count;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) intlChatRequest).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlChatRequest m13527parse(nb5 nb5Var) throws IOException {
            IntlChatRequest intlChatRequest = new IntlChatRequest();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlChatRequest.add_chatRequest_count != null) {
                        break;
                    }
                    intlChatRequest.add_chatRequest_count = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (intlChatRequest.add_chatRequest_count != null) {
                        break;
                    }
                    intlChatRequest.add_chatRequest_count = new ArrayList();
                    return intlChatRequest;
                }
                intlChatRequest.add_chatRequest_count = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            return intlChatRequest;
        }

        public void serialize(IntlChatRequest intlChatRequest, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Integer> list = intlChatRequest.add_chatRequest_count;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlChatRequest> JSON_ADAPTER = new ObjectJsonAdapter<IntlChatRequest>() { // from class: com.p1.mobile.putong.core.data.IntlChatRequest.2
        public Class getDataClass() {
            return IntlChatRequest.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlChatRequest m13528newInstance() {
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

        public void serializeFields(IntlChatRequest intlChatRequest, JsonGenerator jsonGenerator) throws IOException {
            if (intlChatRequest.add_chatRequest_count != null) {
                jsonGenerator.writeFieldName("add_chatRequest_count");
                JsonAdapter.serializeArray(intlChatRequest.add_chatRequest_count, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlChatRequest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlChatRequest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m418a(Integer num) {
        return num;
    }

    public static IntlChatRequest new_() {
        IntlChatRequest intlChatRequest = new IntlChatRequest();
        intlChatRequest.nullCheck();
        return intlChatRequest;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlChatRequest m13526clone() {
        IntlChatRequest intlChatRequest = new IntlChatRequest();
        List<Integer> list = this.add_chatRequest_count;
        if (list != null) {
            intlChatRequest.add_chatRequest_count = ValueObject.util_map(list, new w9j() { // from class: l.t5n
                public final Object call(Object obj) {
                    return IntlChatRequest.m418a((Integer) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<Integer> list = this.add_chatRequest_count;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.add_chatRequest_count == null) {
            this.add_chatRequest_count = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
