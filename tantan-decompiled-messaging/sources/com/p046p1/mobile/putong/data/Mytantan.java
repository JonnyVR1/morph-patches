package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.LimitTimePictureStatus;
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
public class Mytantan extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mytantan";

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<Mytantan> PROTOBUF_ADAPTER = new MessageNanoAdapter<Mytantan>() { // from class: com.p1.mobile.putong.data.Mytantan.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Mytantan mytantan) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, mytantan.unread);
            mytantan.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Mytantan parse(nb5 nb5Var) throws IOException {
            Mytantan mytantan = new Mytantan();
            while (nb5Var.m158752u() == 8) {
                mytantan.unread = nb5Var.m158741j();
            }
            return mytantan;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Mytantan mytantan, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, mytantan.unread);
        }
    };
    public static JsonAdapter<Mytantan> JSON_ADAPTER = new ObjectJsonAdapter<Mytantan>() { // from class: com.p1.mobile.putong.data.Mytantan.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Mytantan.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Mytantan newInstance() {
            return new Mytantan();
        }

        public boolean parseField(Mytantan mytantan, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(LimitTimePictureStatus.unread)) {
                return false;
            }
            mytantan.unread = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(Mytantan mytantan, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(LimitTimePictureStatus.unread)) {
                return true;
            }
            return super.parseFieldCheck(mytantan, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Mytantan mytantan, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, mytantan.unread);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Mytantan) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Mytantan) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Mytantan new_() {
        Mytantan mytantan = new Mytantan();
        mytantan.nullCheck();
        return mytantan;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Mytantan mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "mytantan";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.unread;
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
