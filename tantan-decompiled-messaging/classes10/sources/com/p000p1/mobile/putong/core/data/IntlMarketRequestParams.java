package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IntlMarketRequestParams;
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
public class IntlMarketRequestParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketrequestparams";

    @ProtobufIndex(index = 4)
    public int flash_option;

    @NonNull
    @ProtobufIndex(index = 1)
    public String mcc;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<Integer> quiz_options;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int regular_option;
    public static ProtobufAdapter<IntlMarketRequestParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketRequestParams>() { // from class: com.p1.mobile.putong.core.data.IntlMarketRequestParams.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketRequestParams intlMarketRequestParams) {
            String str = intlMarketRequestParams.mcc;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, intlMarketRequestParams.regular_option);
            List<Integer> list = intlMarketRequestParams.quiz_options;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iO + CodedOutputByteBufferNano.h(4, intlMarketRequestParams.flash_option);
            ((MessageNano) intlMarketRequestParams).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketRequestParams m13611parse(nb5 nb5Var) throws IOException {
            IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlMarketRequestParams.mcc != null) {
                        break;
                    }
                    intlMarketRequestParams.mcc = "";
                    break;
                }
                if (iU == 10) {
                    intlMarketRequestParams.mcc = nb5Var.s();
                } else if (iU == 16) {
                    intlMarketRequestParams.regular_option = nb5Var.j();
                } else if (iU == 26) {
                    intlMarketRequestParams.quiz_options = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 32) {
                        if (intlMarketRequestParams.mcc != null) {
                            break;
                        }
                        intlMarketRequestParams.mcc = "";
                        return intlMarketRequestParams;
                    }
                    intlMarketRequestParams.flash_option = nb5Var.j();
                }
            }
            return intlMarketRequestParams;
        }

        public void serialize(IntlMarketRequestParams intlMarketRequestParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlMarketRequestParams.mcc;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, intlMarketRequestParams.regular_option);
            List<Integer> list = intlMarketRequestParams.quiz_options;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(4, intlMarketRequestParams.flash_option);
        }
    };
    public static JsonAdapter<IntlMarketRequestParams> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketRequestParams>() { // from class: com.p1.mobile.putong.core.data.IntlMarketRequestParams.2
        public Class getDataClass() {
            return IntlMarketRequestParams.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketRequestParams m13612newInstance() {
            return new IntlMarketRequestParams();
        }

        public boolean parseField(IntlMarketRequestParams intlMarketRequestParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "quiz_options":
                    intlMarketRequestParams.quiz_options = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "flash_option":
                    intlMarketRequestParams.flash_option = jsonParser.getValueAsInt();
                    return true;
                case "regular_option":
                    intlMarketRequestParams.regular_option = jsonParser.getValueAsInt();
                    return true;
                case "mcc":
                    intlMarketRequestParams.mcc = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketRequestParams intlMarketRequestParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "quiz_options":
                case "flash_option":
                case "regular_option":
                case "mcc":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketRequestParams, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlMarketRequestParams intlMarketRequestParams, JsonGenerator jsonGenerator) throws IOException {
            String str = intlMarketRequestParams.mcc;
            if (str != null) {
                jsonGenerator.writeStringField("mcc", str);
            }
            jsonGenerator.writeNumberField("regular_option", intlMarketRequestParams.regular_option);
            if (intlMarketRequestParams.quiz_options != null) {
                jsonGenerator.writeFieldName("quiz_options");
                JsonAdapter.serializeArray(intlMarketRequestParams.quiz_options, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("flash_option", intlMarketRequestParams.flash_option);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketRequestParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketRequestParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m423a(Integer num) {
        return num;
    }

    public static IntlMarketRequestParams new_() {
        IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
        intlMarketRequestParams.nullCheck();
        return intlMarketRequestParams;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketRequestParams m13610clone() {
        IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
        intlMarketRequestParams.mcc = this.mcc;
        intlMarketRequestParams.regular_option = this.regular_option;
        List<Integer> list = this.quiz_options;
        if (list != null) {
            intlMarketRequestParams.quiz_options = ValueObject.util_map(list, new w9j() { // from class: l.xbo
                public final Object call(Object obj) {
                    return IntlMarketRequestParams.m423a((Integer) obj);
                }
            });
        }
        intlMarketRequestParams.flash_option = this.flash_option;
        return intlMarketRequestParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketRequestParams)) {
            return false;
        }
        IntlMarketRequestParams intlMarketRequestParams = (IntlMarketRequestParams) obj;
        return ValueObject.util_equals(this.mcc, intlMarketRequestParams.mcc) && this.regular_option == intlMarketRequestParams.regular_option && ValueObject.util_equals(this.quiz_options, intlMarketRequestParams.quiz_options) && this.flash_option == intlMarketRequestParams.flash_option;
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
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.regular_option) * 41;
        List<Integer> list = this.quiz_options;
        int iHashCode2 = ((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.flash_option;
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
