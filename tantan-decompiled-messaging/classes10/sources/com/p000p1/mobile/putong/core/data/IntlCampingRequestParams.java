package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IntlCampingRequestParams;
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
public class IntlCampingRequestParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcampingrequestparams";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<Integer> answer;

    @NonNull
    @ProtobufIndex(index = 1)
    public String mcc;
    public static ProtobufAdapter<IntlCampingRequestParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCampingRequestParams>() { // from class: com.p1.mobile.putong.core.data.IntlCampingRequestParams.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlCampingRequestParams intlCampingRequestParams) {
            String str = intlCampingRequestParams.mcc;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<Integer> list = intlCampingRequestParams.answer;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) intlCampingRequestParams).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlCampingRequestParams m13519parse(nb5 nb5Var) throws IOException {
            IntlCampingRequestParams intlCampingRequestParams = new IntlCampingRequestParams();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlCampingRequestParams.mcc != null) {
                        break;
                    }
                    intlCampingRequestParams.mcc = "";
                    break;
                }
                if (iU == 10) {
                    intlCampingRequestParams.mcc = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (intlCampingRequestParams.mcc != null) {
                            break;
                        }
                        intlCampingRequestParams.mcc = "";
                        return intlCampingRequestParams;
                    }
                    intlCampingRequestParams.answer = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlCampingRequestParams;
        }

        public void serialize(IntlCampingRequestParams intlCampingRequestParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlCampingRequestParams.mcc;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<Integer> list = intlCampingRequestParams.answer;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlCampingRequestParams> JSON_ADAPTER = new ObjectJsonAdapter<IntlCampingRequestParams>() { // from class: com.p1.mobile.putong.core.data.IntlCampingRequestParams.2
        public Class getDataClass() {
            return IntlCampingRequestParams.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlCampingRequestParams m13520newInstance() {
            return new IntlCampingRequestParams();
        }

        public boolean parseField(IntlCampingRequestParams intlCampingRequestParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("answer")) {
                intlCampingRequestParams.answer = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("mcc")) {
                return false;
            }
            intlCampingRequestParams.mcc = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlCampingRequestParams intlCampingRequestParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("answer") || str.equals("mcc")) {
                return true;
            }
            return super.parseFieldCheck(intlCampingRequestParams, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlCampingRequestParams intlCampingRequestParams, JsonGenerator jsonGenerator) throws IOException {
            String str = intlCampingRequestParams.mcc;
            if (str != null) {
                jsonGenerator.writeStringField("mcc", str);
            }
            if (intlCampingRequestParams.answer != null) {
                jsonGenerator.writeFieldName("answer");
                JsonAdapter.serializeArray(intlCampingRequestParams.answer, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCampingRequestParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCampingRequestParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m417a(Integer num) {
        return num;
    }

    public static IntlCampingRequestParams new_() {
        IntlCampingRequestParams intlCampingRequestParams = new IntlCampingRequestParams();
        intlCampingRequestParams.nullCheck();
        return intlCampingRequestParams;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlCampingRequestParams m13518clone() {
        IntlCampingRequestParams intlCampingRequestParams = new IntlCampingRequestParams();
        intlCampingRequestParams.mcc = this.mcc;
        List<Integer> list = this.answer;
        if (list != null) {
            intlCampingRequestParams.answer = ValueObject.util_map(list, new w9j() { // from class: l.z3n
                public final Object call(Object obj) {
                    return IntlCampingRequestParams.m417a((Integer) obj);
                }
            });
        }
        return intlCampingRequestParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlCampingRequestParams)) {
            return false;
        }
        IntlCampingRequestParams intlCampingRequestParams = (IntlCampingRequestParams) obj;
        return ValueObject.util_equals(this.mcc, intlCampingRequestParams.mcc) && ValueObject.util_equals(this.answer, intlCampingRequestParams.answer);
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
        String str = this.mcc;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Integer> list = this.answer;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.mcc == null) {
            this.mcc = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
