package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class NextQuestionnaireOptions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nextquestionnaireoptions";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean checked;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<NextQuestionnaireOptions> PROTOBUF_ADAPTER = new MessageNanoAdapter<NextQuestionnaireOptions>() { // from class: com.p1.mobile.putong.core.data.NextQuestionnaireOptions.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NextQuestionnaireOptions nextQuestionnaireOptions) {
            String str = nextQuestionnaireOptions.value;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, nextQuestionnaireOptions.checked);
            ((MessageNano) nextQuestionnaireOptions).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NextQuestionnaireOptions m14559parse(nb5 nb5Var) throws IOException {
            NextQuestionnaireOptions nextQuestionnaireOptions = new NextQuestionnaireOptions();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (nextQuestionnaireOptions.value != null) {
                        break;
                    }
                    nextQuestionnaireOptions.value = "";
                    break;
                }
                if (iU == 10) {
                    nextQuestionnaireOptions.value = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (nextQuestionnaireOptions.value != null) {
                            break;
                        }
                        nextQuestionnaireOptions.value = "";
                        return nextQuestionnaireOptions;
                    }
                    nextQuestionnaireOptions.checked = nb5Var.g();
                }
            }
            return nextQuestionnaireOptions;
        }

        public void serialize(NextQuestionnaireOptions nextQuestionnaireOptions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = nextQuestionnaireOptions.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, nextQuestionnaireOptions.checked);
        }
    };
    public static JsonAdapter<NextQuestionnaireOptions> JSON_ADAPTER = new ObjectJsonAdapter<NextQuestionnaireOptions>() { // from class: com.p1.mobile.putong.core.data.NextQuestionnaireOptions.2
        public Class getDataClass() {
            return NextQuestionnaireOptions.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NextQuestionnaireOptions m14560newInstance() {
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

        public void serializeFields(NextQuestionnaireOptions nextQuestionnaireOptions, JsonGenerator jsonGenerator) throws IOException {
            String str = nextQuestionnaireOptions.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            jsonGenerator.writeBooleanField("checked", nextQuestionnaireOptions.checked);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NextQuestionnaireOptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NextQuestionnaireOptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NextQuestionnaireOptions new_() {
        NextQuestionnaireOptions nextQuestionnaireOptions = new NextQuestionnaireOptions();
        nextQuestionnaireOptions.nullCheck();
        return nextQuestionnaireOptions;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NextQuestionnaireOptions m14558clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.value;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.checked ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
