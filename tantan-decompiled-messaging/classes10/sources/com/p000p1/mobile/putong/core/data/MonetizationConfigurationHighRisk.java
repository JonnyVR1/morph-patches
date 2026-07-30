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
public class MonetizationConfigurationHighRisk extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationconfigurationhighrisk";

    @ProtobufIndex(index = 1)
    public boolean activeHighRisk;
    public static ProtobufAdapter<MonetizationConfigurationHighRisk> PROTOBUF_ADAPTER = new MessageNanoAdapter<MonetizationConfigurationHighRisk>() { // from class: com.p1.mobile.putong.core.data.MonetizationConfigurationHighRisk.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MonetizationConfigurationHighRisk monetizationConfigurationHighRisk) {
            int iB = CodedOutputByteBufferNano.b(1, monetizationConfigurationHighRisk.activeHighRisk);
            ((MessageNano) monetizationConfigurationHighRisk).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MonetizationConfigurationHighRisk m14365parse(nb5 nb5Var) throws IOException {
            MonetizationConfigurationHighRisk monetizationConfigurationHighRisk = new MonetizationConfigurationHighRisk();
            while (nb5Var.u() == 8) {
                monetizationConfigurationHighRisk.activeHighRisk = nb5Var.g();
            }
            return monetizationConfigurationHighRisk;
        }

        public void serialize(MonetizationConfigurationHighRisk monetizationConfigurationHighRisk, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, monetizationConfigurationHighRisk.activeHighRisk);
        }
    };
    public static JsonAdapter<MonetizationConfigurationHighRisk> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationConfigurationHighRisk>() { // from class: com.p1.mobile.putong.core.data.MonetizationConfigurationHighRisk.2
        public Class getDataClass() {
            return MonetizationConfigurationHighRisk.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MonetizationConfigurationHighRisk m14366newInstance() {
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

        public void serializeFields(MonetizationConfigurationHighRisk monetizationConfigurationHighRisk, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("activeHighRisk", monetizationConfigurationHighRisk.activeHighRisk);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationConfigurationHighRisk) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MonetizationConfigurationHighRisk) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MonetizationConfigurationHighRisk new_() {
        MonetizationConfigurationHighRisk monetizationConfigurationHighRisk = new MonetizationConfigurationHighRisk();
        monetizationConfigurationHighRisk.nullCheck();
        return monetizationConfigurationHighRisk;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MonetizationConfigurationHighRisk m14364clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.activeHighRisk ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
