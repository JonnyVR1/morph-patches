package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PrivateQuestionSuggestCardHideRate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privatequestionsuggestcardhiderate";

    @NonNull
    @ProtobufIndex(index = 1)
    public String abGroup;

    @ProtobufIndex(index = 2)
    public int weight;
    public static ProtobufAdapter<PrivateQuestionSuggestCardHideRate> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivateQuestionSuggestCardHideRate>() { // from class: com.p1.mobile.putong.data.PrivateQuestionSuggestCardHideRate.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate) {
            String str = privateQuestionSuggestCardHideRate.abGroup;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, privateQuestionSuggestCardHideRate.weight);
            ((MessageNano) privateQuestionSuggestCardHideRate).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PrivateQuestionSuggestCardHideRate m18829parse(nb5 nb5Var) throws IOException {
            PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate = new PrivateQuestionSuggestCardHideRate();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (privateQuestionSuggestCardHideRate.abGroup != null) {
                        break;
                    }
                    privateQuestionSuggestCardHideRate.abGroup = "";
                    break;
                }
                if (iU == 10) {
                    privateQuestionSuggestCardHideRate.abGroup = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (privateQuestionSuggestCardHideRate.abGroup != null) {
                            break;
                        }
                        privateQuestionSuggestCardHideRate.abGroup = "";
                        return privateQuestionSuggestCardHideRate;
                    }
                    privateQuestionSuggestCardHideRate.weight = nb5Var.j();
                }
            }
            return privateQuestionSuggestCardHideRate;
        }

        public void serialize(PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = privateQuestionSuggestCardHideRate.abGroup;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, privateQuestionSuggestCardHideRate.weight);
        }
    };
    public static JsonAdapter<PrivateQuestionSuggestCardHideRate> JSON_ADAPTER = new ObjectJsonAdapter<PrivateQuestionSuggestCardHideRate>() { // from class: com.p1.mobile.putong.data.PrivateQuestionSuggestCardHideRate.2
        public Class getDataClass() {
            return PrivateQuestionSuggestCardHideRate.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PrivateQuestionSuggestCardHideRate mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate, JsonGenerator jsonGenerator) throws IOException {
            String str = privateQuestionSuggestCardHideRate.abGroup;
            if (str != null) {
                jsonGenerator.writeStringField("abGroup", str);
            }
            jsonGenerator.writeNumberField("weight", privateQuestionSuggestCardHideRate.weight);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivateQuestionSuggestCardHideRate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivateQuestionSuggestCardHideRate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivateQuestionSuggestCardHideRate new_() {
        PrivateQuestionSuggestCardHideRate privateQuestionSuggestCardHideRate = new PrivateQuestionSuggestCardHideRate();
        privateQuestionSuggestCardHideRate.nullCheck();
        return privateQuestionSuggestCardHideRate;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PrivateQuestionSuggestCardHideRate m18828clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.abGroup;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.weight;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.abGroup == null) {
            this.abGroup = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
