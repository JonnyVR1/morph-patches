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
public class Mytantan extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mytantan";

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<Mytantan> PROTOBUF_ADAPTER = new MessageNanoAdapter<Mytantan>() { // from class: com.p1.mobile.putong.data.Mytantan.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Mytantan mytantan) {
            int iH = CodedOutputByteBufferNano.h(1, mytantan.unread);
            ((MessageNano) mytantan).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Mytantan m18507parse(nb5 nb5Var) throws IOException {
            Mytantan mytantan = new Mytantan();
            while (nb5Var.u() == 8) {
                mytantan.unread = nb5Var.j();
            }
            return mytantan;
        }

        public void serialize(Mytantan mytantan, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, mytantan.unread);
        }
    };
    public static JsonAdapter<Mytantan> JSON_ADAPTER = new ObjectJsonAdapter<Mytantan>() { // from class: com.p1.mobile.putong.data.Mytantan.2
        public Class getDataClass() {
            return Mytantan.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Mytantan mo17830newInstance() {
            return new Mytantan();
        }

        public boolean parseField(Mytantan mytantan, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("unread")) {
                return false;
            }
            mytantan.unread = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(Mytantan mytantan, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("unread")) {
                return true;
            }
            return super.parseFieldCheck(mytantan, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Mytantan mytantan, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unread", mytantan.unread);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Mytantan) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Mytantan) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Mytantan new_() {
        Mytantan mytantan = new Mytantan();
        mytantan.nullCheck();
        return mytantan;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Mytantan m18506clone() {
        Mytantan mytantan = new Mytantan();
        mytantan.unread = this.unread;
        return mytantan;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Mytantan) && this.unread == ((Mytantan) obj).unread;
    }

    public String getClassParseName() {
        return "mytantan";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.unread;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
