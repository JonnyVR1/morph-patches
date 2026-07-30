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
public class ComDiamond extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "comdiamond";

    @ProtobufIndex(index = 1)
    public boolean isODiamond;
    public static ProtobufAdapter<ComDiamond> PROTOBUF_ADAPTER = new MessageNanoAdapter<ComDiamond>() { // from class: com.p1.mobile.putong.data.ComDiamond.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ComDiamond comDiamond) {
            int iB = CodedOutputByteBufferNano.b(1, comDiamond.isODiamond);
            ((MessageNano) comDiamond).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ComDiamond m17820parse(nb5 nb5Var) throws IOException {
            ComDiamond comDiamond = new ComDiamond();
            while (nb5Var.u() == 8) {
                comDiamond.isODiamond = nb5Var.g();
            }
            return comDiamond;
        }

        public void serialize(ComDiamond comDiamond, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, comDiamond.isODiamond);
        }
    };
    public static JsonAdapter<ComDiamond> JSON_ADAPTER = new ObjectJsonAdapter<ComDiamond>() { // from class: com.p1.mobile.putong.data.ComDiamond.2
        public Class getDataClass() {
            return ComDiamond.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ComDiamond mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ComDiamond comDiamond, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isODiamond", comDiamond.isODiamond);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ComDiamond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ComDiamond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ComDiamond new_() {
        ComDiamond comDiamond = new ComDiamond();
        comDiamond.nullCheck();
        return comDiamond;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ComDiamond m17819clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.isODiamond ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
