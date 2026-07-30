package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class GreetingSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingsetting";

    @ProtobufIndex(index = 1)
    public boolean doNotDisturb;
    public static ProtobufAdapter<GreetingSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingSetting>() { // from class: com.p1.mobile.putong.core.data.GreetingSetting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GreetingSetting greetingSetting) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, greetingSetting.doNotDisturb);
            greetingSetting.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetingSetting parse(nc5 nc5Var) throws IOException {
            GreetingSetting greetingSetting = new GreetingSetting();
            while (nc5Var.m162497u() == 8) {
                greetingSetting.doNotDisturb = nc5Var.m162483g();
            }
            return greetingSetting;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetingSetting greetingSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, greetingSetting.doNotDisturb);
        }
    };
    public static JsonAdapter<GreetingSetting> JSON_ADAPTER = new ObjectJsonAdapter<GreetingSetting>() { // from class: com.p1.mobile.putong.core.data.GreetingSetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetingSetting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GreetingSetting newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GreetingSetting greetingSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("doNotDisturb", greetingSetting.doNotDisturb);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingSetting new_() {
        GreetingSetting greetingSetting = new GreetingSetting();
        greetingSetting.nullCheck();
        return greetingSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GreetingSetting mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.doNotDisturb ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
