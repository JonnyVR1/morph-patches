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
public class SpVip extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spvip";

    @ProtobufIndex(index = 2)
    public boolean isOpenMystery;

    @ProtobufIndex(index = 1)
    public boolean isSpvip;

    @ProtobufIndex(index = 3)
    public int userCode;
    public static ProtobufAdapter<SpVip> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpVip>() { // from class: com.p1.mobile.putong.data.SpVip.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SpVip spVip) {
            int iB = CodedOutputByteBufferNano.b(1, spVip.isSpvip) + CodedOutputByteBufferNano.b(2, spVip.isOpenMystery) + CodedOutputByteBufferNano.h(3, spVip.userCode);
            ((MessageNano) spVip).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SpVip m19007parse(nb5 nb5Var) throws IOException {
            SpVip spVip = new SpVip();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    spVip.isSpvip = nb5Var.g();
                } else if (iU == 16) {
                    spVip.isOpenMystery = nb5Var.g();
                } else {
                    if (iU != 24) {
                        return spVip;
                    }
                    spVip.userCode = nb5Var.j();
                }
            }
        }

        public void serialize(SpVip spVip, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, spVip.isSpvip);
            codedOutputByteBufferNano.A(2, spVip.isOpenMystery);
            codedOutputByteBufferNano.G(3, spVip.userCode);
        }
    };
    public static JsonAdapter<SpVip> JSON_ADAPTER = new ObjectJsonAdapter<SpVip>() { // from class: com.p1.mobile.putong.data.SpVip.2
        public Class getDataClass() {
            return SpVip.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SpVip mo17830newInstance() {
            return new SpVip();
        }

        public boolean parseField(SpVip spVip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userCode":
                    spVip.userCode = jsonParser.getValueAsInt();
                    return true;
                case "isOpenMystery":
                    spVip.isOpenMystery = jsonParser.getValueAsBoolean();
                    return true;
                case "isSpvip":
                    spVip.isSpvip = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SpVip spVip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userCode":
                case "isOpenMystery":
                case "isSpvip":
                    return true;
                default:
                    return super.parseFieldCheck(spVip, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpVip spVip, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isSpvip", spVip.isSpvip);
            jsonGenerator.writeBooleanField("isOpenMystery", spVip.isOpenMystery);
            jsonGenerator.writeNumberField("userCode", spVip.userCode);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpVip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpVip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpVip new_() {
        SpVip spVip = new SpVip();
        spVip.nullCheck();
        return spVip;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SpVip m19006clone() {
        SpVip spVip = new SpVip();
        spVip.isSpvip = this.isSpvip;
        spVip.isOpenMystery = this.isOpenMystery;
        spVip.userCode = this.userCode;
        return spVip;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpVip)) {
            return false;
        }
        SpVip spVip = (SpVip) obj;
        return this.isSpvip == spVip.isSpvip && this.isOpenMystery == spVip.isOpenMystery && this.userCode == spVip.userCode;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.isSpvip ? 1231 : 1237)) * 41) + (this.isOpenMystery ? 1231 : 1237)) * 41) + this.userCode;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
