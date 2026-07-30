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
public class MonetizationConfigurationHighRisk extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationconfigurationhighrisk";

    @ProtobufIndex(index = 1)
    public boolean activeHighRisk;
    public static ProtobufAdapter<MonetizationConfigurationHighRisk> PROTOBUF_ADAPTER = new MessageNanoAdapter<MonetizationConfigurationHighRisk>() { // from class: com.p1.mobile.putong.core.data.MonetizationConfigurationHighRisk.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MonetizationConfigurationHighRisk monetizationConfigurationHighRisk) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, monetizationConfigurationHighRisk.activeHighRisk);
            monetizationConfigurationHighRisk.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MonetizationConfigurationHighRisk parse(nc5 nc5Var) throws IOException {
            MonetizationConfigurationHighRisk monetizationConfigurationHighRisk = new MonetizationConfigurationHighRisk();
            while (nc5Var.m162497u() == 8) {
                monetizationConfigurationHighRisk.activeHighRisk = nc5Var.m162483g();
            }
            return monetizationConfigurationHighRisk;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MonetizationConfigurationHighRisk monetizationConfigurationHighRisk, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, monetizationConfigurationHighRisk.activeHighRisk);
        }
    };
    public static JsonAdapter<MonetizationConfigurationHighRisk> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationConfigurationHighRisk>() { // from class: com.p1.mobile.putong.core.data.MonetizationConfigurationHighRisk.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MonetizationConfigurationHighRisk.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MonetizationConfigurationHighRisk newInstance() {
            return new MonetizationConfigurationHighRisk();
        }

        public boolean parseField(MonetizationConfigurationHighRisk monetizationConfigurationHighRisk, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("activeHighRisk")) {
                return false;
            }
            monetizationConfigurationHighRisk.activeHighRisk = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(MonetizationConfigurationHighRisk monetizationConfigurationHighRisk, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("activeHighRisk")) {
                return true;
            }
            return super.parseFieldCheck(monetizationConfigurationHighRisk, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MonetizationConfigurationHighRisk monetizationConfigurationHighRisk, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("activeHighRisk", monetizationConfigurationHighRisk.activeHighRisk);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationConfigurationHighRisk) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MonetizationConfigurationHighRisk) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MonetizationConfigurationHighRisk new_() {
        MonetizationConfigurationHighRisk monetizationConfigurationHighRisk = new MonetizationConfigurationHighRisk();
        monetizationConfigurationHighRisk.nullCheck();
        return monetizationConfigurationHighRisk;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MonetizationConfigurationHighRisk mo225055clone() {
        MonetizationConfigurationHighRisk monetizationConfigurationHighRisk = new MonetizationConfigurationHighRisk();
        monetizationConfigurationHighRisk.activeHighRisk = this.activeHighRisk;
        return monetizationConfigurationHighRisk;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MonetizationConfigurationHighRisk) && this.activeHighRisk == ((MonetizationConfigurationHighRisk) obj).activeHighRisk;
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
        int i2 = (i * 41) + (this.activeHighRisk ? 1231 : 1237);
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
