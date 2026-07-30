package com.p000p1.mobile.putong.data;

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
public class WithdrawConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "withdrawconfig";

    @ProtobufIndex(index = 1)
    public double minWithDrawNum;
    public static ProtobufAdapter<WithdrawConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<WithdrawConfig>() { // from class: com.p1.mobile.putong.data.WithdrawConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WithdrawConfig withdrawConfig) {
            int iD = CodedOutputByteBufferNano.d(1, withdrawConfig.minWithDrawNum);
            ((MessageNano) withdrawConfig).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WithdrawConfig m19380parse(nb5 nb5Var) throws IOException {
            WithdrawConfig withdrawConfig = new WithdrawConfig();
            while (nb5Var.u() == 9) {
                withdrawConfig.minWithDrawNum = nb5Var.h();
            }
            return withdrawConfig;
        }

        public void serialize(WithdrawConfig withdrawConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.C(1, withdrawConfig.minWithDrawNum);
        }
    };
    public static JsonAdapter<WithdrawConfig> JSON_ADAPTER = new ObjectJsonAdapter<WithdrawConfig>() { // from class: com.p1.mobile.putong.data.WithdrawConfig.2
        public Class getDataClass() {
            return WithdrawConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public WithdrawConfig mo17830newInstance() {
            return new WithdrawConfig();
        }

        public boolean parseField(WithdrawConfig withdrawConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("minWithDrawNum")) {
                return false;
            }
            withdrawConfig.minWithDrawNum = jsonParser.getValueAsDouble();
            return true;
        }

        public boolean parseFieldCheck(WithdrawConfig withdrawConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("minWithDrawNum")) {
                return true;
            }
            return super.parseFieldCheck(withdrawConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WithdrawConfig withdrawConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("minWithDrawNum", withdrawConfig.minWithDrawNum);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WithdrawConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WithdrawConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WithdrawConfig new_() {
        WithdrawConfig withdrawConfig = new WithdrawConfig();
        withdrawConfig.nullCheck();
        return withdrawConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WithdrawConfig m19379clone() {
        WithdrawConfig withdrawConfig = new WithdrawConfig();
        withdrawConfig.minWithDrawNum = this.minWithDrawNum;
        return withdrawConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof WithdrawConfig) && this.minWithDrawNum == ((WithdrawConfig) obj).minWithDrawNum;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.minWithDrawNum);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
