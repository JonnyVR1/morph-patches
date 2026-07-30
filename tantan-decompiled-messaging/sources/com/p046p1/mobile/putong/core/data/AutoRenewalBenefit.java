package com.p046p1.mobile.putong.core.data;

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
public class AutoRenewalBenefit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "autorenewalbenefit";

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<AutoRenewalBenefit> PROTOBUF_ADAPTER = new MessageNanoAdapter<AutoRenewalBenefit>() { // from class: com.p1.mobile.putong.core.data.AutoRenewalBenefit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AutoRenewalBenefit autoRenewalBenefit) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, autoRenewalBenefit.enable);
            autoRenewalBenefit.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AutoRenewalBenefit parse(nb5 nb5Var) throws IOException {
            AutoRenewalBenefit autoRenewalBenefit = new AutoRenewalBenefit();
            while (nb5Var.m158752u() == 8) {
                autoRenewalBenefit.enable = nb5Var.m158738g();
            }
            return autoRenewalBenefit;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AutoRenewalBenefit autoRenewalBenefit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, autoRenewalBenefit.enable);
        }
    };
    public static JsonAdapter<AutoRenewalBenefit> JSON_ADAPTER = new ObjectJsonAdapter<AutoRenewalBenefit>() { // from class: com.p1.mobile.putong.core.data.AutoRenewalBenefit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AutoRenewalBenefit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AutoRenewalBenefit newInstance() {
            return new AutoRenewalBenefit();
        }

        public boolean parseField(AutoRenewalBenefit autoRenewalBenefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("enable")) {
                return false;
            }
            autoRenewalBenefit.enable = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(AutoRenewalBenefit autoRenewalBenefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable")) {
                return true;
            }
            return super.parseFieldCheck(autoRenewalBenefit, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AutoRenewalBenefit autoRenewalBenefit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", autoRenewalBenefit.enable);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AutoRenewalBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AutoRenewalBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AutoRenewalBenefit new_() {
        AutoRenewalBenefit autoRenewalBenefit = new AutoRenewalBenefit();
        autoRenewalBenefit.nullCheck();
        return autoRenewalBenefit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AutoRenewalBenefit mo223809clone() {
        AutoRenewalBenefit autoRenewalBenefit = new AutoRenewalBenefit();
        autoRenewalBenefit.enable = this.enable;
        return autoRenewalBenefit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AutoRenewalBenefit) && this.enable == ((AutoRenewalBenefit) obj).enable;
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
        int i2 = (i * 41) + (this.enable ? 1231 : 1237);
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
