package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.IntlCampingRequestParams;
import com.p051p1.mobile.putong.data.Answer;
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
public class IntlCampingRequestParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcampingrequestparams";

    @Nullable
    @ProtobufIndex(index = 2)
    public List<Integer> answer;

    @NonNull
    @ProtobufIndex(index = 1)
    public String mcc;
    public static ProtobufAdapter<IntlCampingRequestParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCampingRequestParams>() { // from class: com.p1.mobile.putong.core.data.IntlCampingRequestParams.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlCampingRequestParams intlCampingRequestParams) {
            String str = intlCampingRequestParams.mcc;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<Integer> list = intlCampingRequestParams.answer;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            intlCampingRequestParams.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlCampingRequestParams parse(nc5 nc5Var) throws IOException {
            IntlCampingRequestParams intlCampingRequestParams = new IntlCampingRequestParams();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlCampingRequestParams.mcc != null) {
                        break;
                    }
                    intlCampingRequestParams.mcc = "";
                    break;
                }
                if (iM162497u == 10) {
                    intlCampingRequestParams.mcc = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (intlCampingRequestParams.mcc != null) {
                            break;
                        }
                        intlCampingRequestParams.mcc = "";
                        return intlCampingRequestParams;
                    }
                    intlCampingRequestParams.answer = (List) nc5Var.m162488l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlCampingRequestParams;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlCampingRequestParams intlCampingRequestParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlCampingRequestParams.mcc;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<Integer> list = intlCampingRequestParams.answer;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlCampingRequestParams> JSON_ADAPTER = new ObjectJsonAdapter<IntlCampingRequestParams>() { // from class: com.p1.mobile.putong.core.data.IntlCampingRequestParams.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlCampingRequestParams.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlCampingRequestParams newInstance() {
            return new IntlCampingRequestParams();
        }

        public boolean parseField(IntlCampingRequestParams intlCampingRequestParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Answer.TYPE)) {
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
            if (str.equals(Answer.TYPE) || str.equals("mcc")) {
                return true;
            }
            return super.parseFieldCheck(intlCampingRequestParams, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlCampingRequestParams intlCampingRequestParams, JsonGenerator jsonGenerator) throws IOException {
            String str = intlCampingRequestParams.mcc;
            if (str != null) {
                jsonGenerator.writeStringField("mcc", str);
            }
            if (intlCampingRequestParams.answer != null) {
                jsonGenerator.writeFieldName(Answer.TYPE);
                JsonAdapter.serializeArray(intlCampingRequestParams.answer, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCampingRequestParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCampingRequestParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m36618a(Integer num) {
        return num;
    }

    public static IntlCampingRequestParams new_() {
        IntlCampingRequestParams intlCampingRequestParams = new IntlCampingRequestParams();
        intlCampingRequestParams.nullCheck();
        return intlCampingRequestParams;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlCampingRequestParams mo225055clone() {
        IntlCampingRequestParams intlCampingRequestParams = new IntlCampingRequestParams();
        intlCampingRequestParams.mcc = this.mcc;
        List<Integer> list = this.answer;
        if (list != null) {
            intlCampingRequestParams.answer = ValueObject.util_map(list, new qcj() { // from class: l.z5n
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlCampingRequestParams.m36618a((Integer) obj);
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
        String str = this.mcc;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Integer> list = this.answer;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.mcc == null) {
            this.mcc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
