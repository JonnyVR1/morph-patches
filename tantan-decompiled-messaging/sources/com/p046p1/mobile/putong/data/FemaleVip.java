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
public class FemaleVip extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "femalevip";

    @ProtobufIndex(index = 1)
    public boolean isFvip;
    public static ProtobufAdapter<FemaleVip> PROTOBUF_ADAPTER = new MessageNanoAdapter<FemaleVip>() { // from class: com.p1.mobile.putong.data.FemaleVip.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FemaleVip femaleVip) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, femaleVip.isFvip);
            femaleVip.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FemaleVip parse(nb5 nb5Var) throws IOException {
            FemaleVip femaleVip = new FemaleVip();
            while (nb5Var.m158752u() == 8) {
                femaleVip.isFvip = nb5Var.m158738g();
            }
            return femaleVip;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FemaleVip femaleVip, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, femaleVip.isFvip);
        }
    };
    public static JsonAdapter<FemaleVip> JSON_ADAPTER = new ObjectJsonAdapter<FemaleVip>() { // from class: com.p1.mobile.putong.data.FemaleVip.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FemaleVip.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FemaleVip newInstance() {
            return new FemaleVip();
        }

        public boolean parseField(FemaleVip femaleVip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isFvip")) {
                return false;
            }
            femaleVip.isFvip = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(FemaleVip femaleVip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isFvip")) {
                return true;
            }
            return super.parseFieldCheck(femaleVip, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FemaleVip femaleVip, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isFvip", femaleVip.isFvip);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FemaleVip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FemaleVip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FemaleVip new_() {
        FemaleVip femaleVip = new FemaleVip();
        femaleVip.nullCheck();
        return femaleVip;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FemaleVip mo223809clone() {
        FemaleVip femaleVip = new FemaleVip();
        femaleVip.isFvip = this.isFvip;
        return femaleVip;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FemaleVip) && this.isFvip == ((FemaleVip) obj).isFvip;
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
        int i2 = (i * 41) + (this.isFvip ? 1231 : 1237);
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
