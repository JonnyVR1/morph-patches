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
public class ComDiamond extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "comdiamond";

    @ProtobufIndex(index = 1)
    public boolean isODiamond;
    public static ProtobufAdapter<ComDiamond> PROTOBUF_ADAPTER = new MessageNanoAdapter<ComDiamond>() { // from class: com.p1.mobile.putong.data.ComDiamond.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ComDiamond comDiamond) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, comDiamond.isODiamond);
            comDiamond.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ComDiamond parse(nb5 nb5Var) throws IOException {
            ComDiamond comDiamond = new ComDiamond();
            while (nb5Var.m158752u() == 8) {
                comDiamond.isODiamond = nb5Var.m158738g();
            }
            return comDiamond;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ComDiamond comDiamond, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, comDiamond.isODiamond);
        }
    };
    public static JsonAdapter<ComDiamond> JSON_ADAPTER = new ObjectJsonAdapter<ComDiamond>() { // from class: com.p1.mobile.putong.data.ComDiamond.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ComDiamond.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ComDiamond newInstance() {
            return new ComDiamond();
        }

        public boolean parseField(ComDiamond comDiamond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isODiamond")) {
                return false;
            }
            comDiamond.isODiamond = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ComDiamond comDiamond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isODiamond")) {
                return true;
            }
            return super.parseFieldCheck(comDiamond, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ComDiamond comDiamond, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isODiamond", comDiamond.isODiamond);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ComDiamond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ComDiamond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ComDiamond new_() {
        ComDiamond comDiamond = new ComDiamond();
        comDiamond.nullCheck();
        return comDiamond;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ComDiamond mo223809clone() {
        ComDiamond comDiamond = new ComDiamond();
        comDiamond.isODiamond = this.isODiamond;
        return comDiamond;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ComDiamond) && this.isODiamond == ((ComDiamond) obj).isODiamond;
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
        int i2 = (i * 41) + (this.isODiamond ? 1231 : 1237);
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
