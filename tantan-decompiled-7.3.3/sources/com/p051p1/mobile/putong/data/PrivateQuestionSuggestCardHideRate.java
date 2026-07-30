package com.p051p1.mobile.putong.data;

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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class PrivateQuestionSuggestCardHideRate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privatequestionsuggestcardhiderate";

    @NonNull
    @ProtobufIndex(index = 1)
    public String abGroup;

    @ProtobufIndex(index = 2)
    public int weight;
    public static ProtobufAdapter<PrivateQuestionSuggestCardHideRate> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivateQuestionSuggestCardHideRate>() { // from class: com.p1.mobile.putong.data.PrivateQuestionSuggestCardHideRate.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate) {
            String str = privateQuestionSuggestCardHideRate.abGroup;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, privateQuestionSuggestCardHideRate.weight);
            privateQuestionSuggestCardHideRate.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivateQuestionSuggestCardHideRate parse(nc5 nc5Var) throws IOException {
            PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate = new PrivateQuestionSuggestCardHideRate();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (privateQuestionSuggestCardHideRate.abGroup != null) {
                        break;
                    }
                    privateQuestionSuggestCardHideRate.abGroup = "";
                    break;
                }
                if (iM162497u == 10) {
                    privateQuestionSuggestCardHideRate.abGroup = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (privateQuestionSuggestCardHideRate.abGroup != null) {
                            break;
                        }
                        privateQuestionSuggestCardHideRate.abGroup = "";
                        return privateQuestionSuggestCardHideRate;
                    }
                    privateQuestionSuggestCardHideRate.weight = nc5Var.m162486j();
                }
            }
            return privateQuestionSuggestCardHideRate;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = privateQuestionSuggestCardHideRate.abGroup;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, privateQuestionSuggestCardHideRate.weight);
        }
    };
    public static JsonAdapter<PrivateQuestionSuggestCardHideRate> JSON_ADAPTER = new ObjectJsonAdapter<PrivateQuestionSuggestCardHideRate>() { // from class: com.p1.mobile.putong.data.PrivateQuestionSuggestCardHideRate.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivateQuestionSuggestCardHideRate.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrivateQuestionSuggestCardHideRate newInstance() {
            return new PrivateQuestionSuggestCardHideRate();
        }

        public boolean parseField(PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("abGroup")) {
                privateQuestionSuggestCardHideRate.abGroup = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("weight")) {
                return false;
            }
            privateQuestionSuggestCardHideRate.weight = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("abGroup") || str.equals("weight")) {
                return true;
            }
            return super.parseFieldCheck(privateQuestionSuggestCardHideRate, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate, JsonGenerator jsonGenerator) throws IOException {
            String str = privateQuestionSuggestCardHideRate.abGroup;
            if (str != null) {
                jsonGenerator.writeStringField("abGroup", str);
            }
            jsonGenerator.writeNumberField("weight", privateQuestionSuggestCardHideRate.weight);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivateQuestionSuggestCardHideRate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivateQuestionSuggestCardHideRate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivateQuestionSuggestCardHideRate new_() {
        PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate = new PrivateQuestionSuggestCardHideRate();
        privateQuestionSuggestCardHideRate.nullCheck();
        return privateQuestionSuggestCardHideRate;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrivateQuestionSuggestCardHideRate mo225055clone() {
        PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate = new PrivateQuestionSuggestCardHideRate();
        privateQuestionSuggestCardHideRate.abGroup = this.abGroup;
        privateQuestionSuggestCardHideRate.weight = this.weight;
        return privateQuestionSuggestCardHideRate;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivateQuestionSuggestCardHideRate)) {
            return false;
        }
        PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate = (PrivateQuestionSuggestCardHideRate) obj;
        return ValueObject.util_equals(this.abGroup, privateQuestionSuggestCardHideRate.abGroup) && this.weight == privateQuestionSuggestCardHideRate.weight;
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
        String str = this.abGroup;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.weight;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.abGroup == null) {
            this.abGroup = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
