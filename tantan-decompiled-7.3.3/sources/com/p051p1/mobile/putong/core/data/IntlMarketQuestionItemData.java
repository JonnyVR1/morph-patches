package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionOptionItemData;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class IntlMarketQuestionItemData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketquestionitemdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<IntlMarketQuestionOptionItemData> options;

    @ProtobufIndex(index = 1)
    public int qid;
    public static ProtobufAdapter<IntlMarketQuestionItemData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketQuestionItemData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionItemData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMarketQuestionItemData intlMarketQuestionItemData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, intlMarketQuestionItemData.qid);
            String str = intlMarketQuestionItemData.desc;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            List<IntlMarketQuestionOptionItemData> list = intlMarketQuestionItemData.options;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, list, IntlMarketQuestionOptionItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            intlMarketQuestionItemData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMarketQuestionItemData parse(nc5 nc5Var) throws IOException {
            IntlMarketQuestionItemData intlMarketQuestionItemData = new IntlMarketQuestionItemData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlMarketQuestionItemData.desc == null) {
                        intlMarketQuestionItemData.desc = "";
                    }
                    if (intlMarketQuestionItemData.options != null) {
                        break;
                    }
                    intlMarketQuestionItemData.options = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    intlMarketQuestionItemData.qid = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    intlMarketQuestionItemData.desc = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (intlMarketQuestionItemData.desc == null) {
                            intlMarketQuestionItemData.desc = "";
                        }
                        if (intlMarketQuestionItemData.options != null) {
                            break;
                        }
                        intlMarketQuestionItemData.options = new ArrayList();
                        return intlMarketQuestionItemData;
                    }
                    intlMarketQuestionItemData.options = (List) nc5Var.m162488l(IntlMarketQuestionOptionItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlMarketQuestionItemData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMarketQuestionItemData intlMarketQuestionItemData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, intlMarketQuestionItemData.qid);
            String str = intlMarketQuestionItemData.desc;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            List<IntlMarketQuestionOptionItemData> list = intlMarketQuestionItemData.options;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, IntlMarketQuestionOptionItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlMarketQuestionItemData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketQuestionItemData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionItemData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMarketQuestionItemData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMarketQuestionItemData newInstance() {
            return new IntlMarketQuestionItemData();
        }

        public boolean parseField(IntlMarketQuestionItemData intlMarketQuestionItemData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "options":
                    intlMarketQuestionItemData.options = JsonAdapter.parseArray(jsonParser, IntlMarketQuestionOptionItemData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "qid":
                    intlMarketQuestionItemData.qid = jsonParser.getValueAsInt();
                    return true;
                case "desc":
                    intlMarketQuestionItemData.desc = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketQuestionItemData intlMarketQuestionItemData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "options":
                case "qid":
                case "desc":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketQuestionItemData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMarketQuestionItemData intlMarketQuestionItemData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("qid", intlMarketQuestionItemData.qid);
            String str = intlMarketQuestionItemData.desc;
            if (str != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str);
            }
            if (intlMarketQuestionItemData.options != null) {
                jsonGenerator.writeFieldName(Options.TYPE);
                JsonAdapter.serializeArray(intlMarketQuestionItemData.options, jsonGenerator, IntlMarketQuestionOptionItemData.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketQuestionItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketQuestionItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketQuestionItemData new_() {
        IntlMarketQuestionItemData intlMarketQuestionItemData = new IntlMarketQuestionItemData();
        intlMarketQuestionItemData.nullCheck();
        return intlMarketQuestionItemData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMarketQuestionItemData mo225055clone() {
        IntlMarketQuestionItemData intlMarketQuestionItemData = new IntlMarketQuestionItemData();
        intlMarketQuestionItemData.qid = this.qid;
        intlMarketQuestionItemData.desc = this.desc;
        List<IntlMarketQuestionOptionItemData> list = this.options;
        if (list != null) {
            intlMarketQuestionItemData.options = ValueObject.util_map(list, new qcj() { // from class: l.wdo
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IntlMarketQuestionOptionItemData) obj).mo225055clone();
                }
            });
        }
        return intlMarketQuestionItemData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketQuestionItemData)) {
            return false;
        }
        IntlMarketQuestionItemData intlMarketQuestionItemData = (IntlMarketQuestionItemData) obj;
        return this.qid == intlMarketQuestionItemData.qid && ValueObject.util_equals(this.desc, intlMarketQuestionItemData.desc) && ValueObject.util_equals(this.options, intlMarketQuestionItemData.options);
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
        int i2 = ((i * 41) + this.qid) * 41;
        String str = this.desc;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<IntlMarketQuestionOptionItemData> list = this.options;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.options == null) {
            this.options = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
