package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class ComSupremePartner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "comsupremepartner";

    @ProtobufIndex(index = 1)
    public boolean isSupremePartner;
    public static ProtobufAdapter<ComSupremePartner> PROTOBUF_ADAPTER = new MessageNanoAdapter<ComSupremePartner>() { // from class: com.p1.mobile.putong.data.ComSupremePartner.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ComSupremePartner comSupremePartner) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, comSupremePartner.isSupremePartner);
            comSupremePartner.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ComSupremePartner parse(nc5 nc5Var) throws IOException {
            ComSupremePartner comSupremePartner = new ComSupremePartner();
            while (nc5Var.m162497u() == 8) {
                comSupremePartner.isSupremePartner = nc5Var.m162483g();
            }
            return comSupremePartner;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ComSupremePartner comSupremePartner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, comSupremePartner.isSupremePartner);
        }
    };
    public static JsonAdapter<ComSupremePartner> JSON_ADAPTER = new ObjectJsonAdapter<ComSupremePartner>() { // from class: com.p1.mobile.putong.data.ComSupremePartner.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ComSupremePartner.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ComSupremePartner newInstance() {
            return new ComSupremePartner();
        }

        public boolean parseField(ComSupremePartner comSupremePartner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isSupremePartner")) {
                return false;
            }
            comSupremePartner.isSupremePartner = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ComSupremePartner comSupremePartner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isSupremePartner")) {
                return true;
            }
            return super.parseFieldCheck(comSupremePartner, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ComSupremePartner comSupremePartner, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isSupremePartner", comSupremePartner.isSupremePartner);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ComSupremePartner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ComSupremePartner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ComSupremePartner new_() {
        ComSupremePartner comSupremePartner = new ComSupremePartner();
        comSupremePartner.nullCheck();
        return comSupremePartner;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ComSupremePartner mo225055clone() {
        ComSupremePartner comSupremePartner = new ComSupremePartner();
        comSupremePartner.isSupremePartner = this.isSupremePartner;
        return comSupremePartner;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ComSupremePartner) && this.isSupremePartner == ((ComSupremePartner) obj).isSupremePartner;
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
        int i2 = (i * 41) + (this.isSupremePartner ? 1231 : 1237);
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
