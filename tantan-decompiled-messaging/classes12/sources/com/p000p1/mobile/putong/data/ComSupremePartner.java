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
public class ComSupremePartner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "comsupremepartner";

    @ProtobufIndex(index = 1)
    public boolean isSupremePartner;
    public static ProtobufAdapter<ComSupremePartner> PROTOBUF_ADAPTER = new MessageNanoAdapter<ComSupremePartner>() { // from class: com.p1.mobile.putong.data.ComSupremePartner.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ComSupremePartner comSupremePartner) {
            int iB = CodedOutputByteBufferNano.b(1, comSupremePartner.isSupremePartner);
            ((MessageNano) comSupremePartner).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ComSupremePartner m17823parse(nb5 nb5Var) throws IOException {
            ComSupremePartner comSupremePartner = new ComSupremePartner();
            while (nb5Var.u() == 8) {
                comSupremePartner.isSupremePartner = nb5Var.g();
            }
            return comSupremePartner;
        }

        public void serialize(ComSupremePartner comSupremePartner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, comSupremePartner.isSupremePartner);
        }
    };
    public static JsonAdapter<ComSupremePartner> JSON_ADAPTER = new ObjectJsonAdapter<ComSupremePartner>() { // from class: com.p1.mobile.putong.data.ComSupremePartner.2
        public Class getDataClass() {
            return ComSupremePartner.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ComSupremePartner mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ComSupremePartner comSupremePartner, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isSupremePartner", comSupremePartner.isSupremePartner);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ComSupremePartner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ComSupremePartner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ComSupremePartner new_() {
        ComSupremePartner comSupremePartner = new ComSupremePartner();
        comSupremePartner.nullCheck();
        return comSupremePartner;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ComSupremePartner m17822clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.isSupremePartner ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
