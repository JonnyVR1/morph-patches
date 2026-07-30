package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpVip spVip) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, spVip.isSpvip) + CodedOutputByteBufferNano.m17220b(2, spVip.isOpenMystery) + CodedOutputByteBufferNano.m17226h(3, spVip.userCode);
            spVip.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpVip parse(nb5 nb5Var) throws IOException {
            SpVip spVip = new SpVip();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    spVip.isSpvip = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    spVip.isOpenMystery = nb5Var.m158738g();
                } else {
                    if (iM158752u != 24) {
                        return spVip;
                    }
                    spVip.userCode = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpVip spVip, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, spVip.isSpvip);
            codedOutputByteBufferNano.m17244A(2, spVip.isOpenMystery);
            codedOutputByteBufferNano.m17250G(3, spVip.userCode);
        }
    };
    public static JsonAdapter<SpVip> JSON_ADAPTER = new ObjectJsonAdapter<SpVip>() { // from class: com.p1.mobile.putong.data.SpVip.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpVip.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpVip newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpVip spVip, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isSpvip", spVip.isSpvip);
            jsonGenerator.writeBooleanField("isOpenMystery", spVip.isOpenMystery);
            jsonGenerator.writeNumberField("userCode", spVip.userCode);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpVip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpVip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpVip new_() {
        SpVip spVip = new SpVip();
        spVip.nullCheck();
        return spVip;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpVip mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.isSpvip ? 1231 : 1237)) * 41) + (this.isOpenMystery ? 1231 : 1237)) * 41) + this.userCode;
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
