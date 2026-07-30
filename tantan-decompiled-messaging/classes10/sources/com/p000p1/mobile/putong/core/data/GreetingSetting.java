package com.p000p1.mobile.putong.core.data;

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
public class GreetingSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingsetting";

    @ProtobufIndex(index = 1)
    public boolean doNotDisturb;
    public static ProtobufAdapter<GreetingSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingSetting>() { // from class: com.p1.mobile.putong.core.data.GreetingSetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GreetingSetting greetingSetting) {
            int iB = CodedOutputByteBufferNano.b(1, greetingSetting.doNotDisturb);
            ((MessageNano) greetingSetting).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GreetingSetting m13057parse(nb5 nb5Var) throws IOException {
            GreetingSetting greetingSetting = new GreetingSetting();
            while (nb5Var.u() == 8) {
                greetingSetting.doNotDisturb = nb5Var.g();
            }
            return greetingSetting;
        }

        public void serialize(GreetingSetting greetingSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, greetingSetting.doNotDisturb);
        }
    };
    public static JsonAdapter<GreetingSetting> JSON_ADAPTER = new ObjectJsonAdapter<GreetingSetting>() { // from class: com.p1.mobile.putong.core.data.GreetingSetting.2
        public Class getDataClass() {
            return GreetingSetting.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GreetingSetting m13058newInstance() {
            return new GreetingSetting();
        }

        public boolean parseField(GreetingSetting greetingSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("doNotDisturb")) {
                return false;
            }
            greetingSetting.doNotDisturb = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(GreetingSetting greetingSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("doNotDisturb")) {
                return true;
            }
            return super.parseFieldCheck(greetingSetting, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(GreetingSetting greetingSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("doNotDisturb", greetingSetting.doNotDisturb);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingSetting new_() {
        GreetingSetting greetingSetting = new GreetingSetting();
        greetingSetting.nullCheck();
        return greetingSetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GreetingSetting m13056clone() {
        GreetingSetting greetingSetting = new GreetingSetting();
        greetingSetting.doNotDisturb = this.doNotDisturb;
        return greetingSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GreetingSetting) && this.doNotDisturb == ((GreetingSetting) obj).doNotDisturb;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.doNotDisturb ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
