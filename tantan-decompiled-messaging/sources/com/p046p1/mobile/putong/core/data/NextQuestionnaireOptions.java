package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class NextQuestionnaireOptions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nextquestionnaireoptions";

    @ProtobufIndex(index = 2)
    public boolean checked;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<NextQuestionnaireOptions> PROTOBUF_ADAPTER = new MessageNanoAdapter<NextQuestionnaireOptions>() { // from class: com.p1.mobile.putong.core.data.NextQuestionnaireOptions.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NextQuestionnaireOptions nextQuestionnaireOptions) {
            String str = nextQuestionnaireOptions.value;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, nextQuestionnaireOptions.checked);
            nextQuestionnaireOptions.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NextQuestionnaireOptions parse(nb5 nb5Var) throws IOException {
            NextQuestionnaireOptions nextQuestionnaireOptions = new NextQuestionnaireOptions();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (nextQuestionnaireOptions.value != null) {
                        break;
                    }
                    nextQuestionnaireOptions.value = "";
                    break;
                }
                if (iM158752u == 10) {
                    nextQuestionnaireOptions.value = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (nextQuestionnaireOptions.value != null) {
                            break;
                        }
                        nextQuestionnaireOptions.value = "";
                        return nextQuestionnaireOptions;
                    }
                    nextQuestionnaireOptions.checked = nb5Var.m158738g();
                }
            }
            return nextQuestionnaireOptions;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NextQuestionnaireOptions nextQuestionnaireOptions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = nextQuestionnaireOptions.value;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, nextQuestionnaireOptions.checked);
        }
    };
    public static JsonAdapter<NextQuestionnaireOptions> JSON_ADAPTER = new ObjectJsonAdapter<NextQuestionnaireOptions>() { // from class: com.p1.mobile.putong.core.data.NextQuestionnaireOptions.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NextQuestionnaireOptions.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NextQuestionnaireOptions newInstance() {
            return new NextQuestionnaireOptions();
        }

        public boolean parseField(NextQuestionnaireOptions nextQuestionnaireOptions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("value")) {
                nextQuestionnaireOptions.value = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("checked")) {
                return false;
            }
            nextQuestionnaireOptions.checked = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(NextQuestionnaireOptions nextQuestionnaireOptions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("value") || str.equals("checked")) {
                return true;
            }
            return super.parseFieldCheck(nextQuestionnaireOptions, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NextQuestionnaireOptions nextQuestionnaireOptions, JsonGenerator jsonGenerator) throws IOException {
            String str = nextQuestionnaireOptions.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            jsonGenerator.writeBooleanField("checked", nextQuestionnaireOptions.checked);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NextQuestionnaireOptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NextQuestionnaireOptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NextQuestionnaireOptions new_() {
        NextQuestionnaireOptions nextQuestionnaireOptions = new NextQuestionnaireOptions();
        nextQuestionnaireOptions.nullCheck();
        return nextQuestionnaireOptions;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NextQuestionnaireOptions mo223809clone() {
        NextQuestionnaireOptions nextQuestionnaireOptions = new NextQuestionnaireOptions();
        nextQuestionnaireOptions.value = this.value;
        nextQuestionnaireOptions.checked = this.checked;
        return nextQuestionnaireOptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NextQuestionnaireOptions)) {
            return false;
        }
        NextQuestionnaireOptions nextQuestionnaireOptions = (NextQuestionnaireOptions) obj;
        return ValueObject.util_equals(this.value, nextQuestionnaireOptions.value) && this.checked == nextQuestionnaireOptions.checked;
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
        String str = this.value;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.checked ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
