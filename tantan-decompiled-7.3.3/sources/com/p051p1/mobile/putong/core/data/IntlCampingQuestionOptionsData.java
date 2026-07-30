package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class IntlCampingQuestionOptionsData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcampingquestionoptionsdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String desc;

    @ProtobufIndex(index = 1)
    public int oid;
    public static ProtobufAdapter<IntlCampingQuestionOptionsData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCampingQuestionOptionsData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingQuestionOptionsData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlCampingQuestionOptionsData intlCampingQuestionOptionsData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, intlCampingQuestionOptionsData.oid);
            String str = intlCampingQuestionOptionsData.desc;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            intlCampingQuestionOptionsData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlCampingQuestionOptionsData parse(nc5 nc5Var) throws IOException {
            IntlCampingQuestionOptionsData intlCampingQuestionOptionsData = new IntlCampingQuestionOptionsData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlCampingQuestionOptionsData.desc != null) {
                        break;
                    }
                    intlCampingQuestionOptionsData.desc = "";
                    break;
                }
                if (iM162497u == 8) {
                    intlCampingQuestionOptionsData.oid = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (intlCampingQuestionOptionsData.desc != null) {
                            break;
                        }
                        intlCampingQuestionOptionsData.desc = "";
                        return intlCampingQuestionOptionsData;
                    }
                    intlCampingQuestionOptionsData.desc = nc5Var.m162495s();
                }
            }
            return intlCampingQuestionOptionsData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlCampingQuestionOptionsData intlCampingQuestionOptionsData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, intlCampingQuestionOptionsData.oid);
            String str = intlCampingQuestionOptionsData.desc;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<IntlCampingQuestionOptionsData> JSON_ADAPTER = new ObjectJsonAdapter<IntlCampingQuestionOptionsData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingQuestionOptionsData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlCampingQuestionOptionsData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlCampingQuestionOptionsData newInstance() {
            return new IntlCampingQuestionOptionsData();
        }

        public boolean parseField(IntlCampingQuestionOptionsData intlCampingQuestionOptionsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("oid")) {
                intlCampingQuestionOptionsData.oid = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(SocialConstants.PARAM_APP_DESC)) {
                return false;
            }
            intlCampingQuestionOptionsData.desc = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlCampingQuestionOptionsData intlCampingQuestionOptionsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("oid") || str.equals(SocialConstants.PARAM_APP_DESC)) {
                return true;
            }
            return super.parseFieldCheck(intlCampingQuestionOptionsData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlCampingQuestionOptionsData intlCampingQuestionOptionsData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("oid", intlCampingQuestionOptionsData.oid);
            String str = intlCampingQuestionOptionsData.desc;
            if (str != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCampingQuestionOptionsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCampingQuestionOptionsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlCampingQuestionOptionsData new_() {
        IntlCampingQuestionOptionsData intlCampingQuestionOptionsData = new IntlCampingQuestionOptionsData();
        intlCampingQuestionOptionsData.nullCheck();
        return intlCampingQuestionOptionsData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlCampingQuestionOptionsData mo225055clone() {
        IntlCampingQuestionOptionsData intlCampingQuestionOptionsData = new IntlCampingQuestionOptionsData();
        intlCampingQuestionOptionsData.oid = this.oid;
        intlCampingQuestionOptionsData.desc = this.desc;
        return intlCampingQuestionOptionsData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlCampingQuestionOptionsData)) {
            return false;
        }
        IntlCampingQuestionOptionsData intlCampingQuestionOptionsData = (IntlCampingQuestionOptionsData) obj;
        return this.oid == intlCampingQuestionOptionsData.oid && ValueObject.util_equals(this.desc, intlCampingQuestionOptionsData.desc);
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
        int i2 = ((i * 41) + this.oid) * 41;
        String str = this.desc;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.desc == null) {
            this.desc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
