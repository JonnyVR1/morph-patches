package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class OldUserWelcome extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "olduserwelcome";

    @ProtobufIndex(index = 1)
    public int time_interval;
    public static ProtobufAdapter<OldUserWelcome> PROTOBUF_ADAPTER = new MessageNanoAdapter<OldUserWelcome>() { // from class: com.p1.mobile.putong.core.data.OldUserWelcome.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OldUserWelcome oldUserWelcome) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, oldUserWelcome.time_interval);
            oldUserWelcome.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OldUserWelcome parse(nc5 nc5Var) throws IOException {
            OldUserWelcome oldUserWelcome = new OldUserWelcome();
            while (nc5Var.m162497u() == 8) {
                oldUserWelcome.time_interval = nc5Var.m162486j();
            }
            return oldUserWelcome;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OldUserWelcome oldUserWelcome, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, oldUserWelcome.time_interval);
        }
    };
    public static JsonAdapter<OldUserWelcome> JSON_ADAPTER = new ObjectJsonAdapter<OldUserWelcome>() { // from class: com.p1.mobile.putong.core.data.OldUserWelcome.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OldUserWelcome.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OldUserWelcome newInstance() {
            return new OldUserWelcome();
        }

        public boolean parseField(OldUserWelcome oldUserWelcome, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("time_interval")) {
                return false;
            }
            oldUserWelcome.time_interval = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(OldUserWelcome oldUserWelcome, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("time_interval")) {
                return true;
            }
            return super.parseFieldCheck(oldUserWelcome, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OldUserWelcome oldUserWelcome, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("time_interval", oldUserWelcome.time_interval);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OldUserWelcome) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OldUserWelcome) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OldUserWelcome new_() {
        OldUserWelcome oldUserWelcome = new OldUserWelcome();
        oldUserWelcome.nullCheck();
        return oldUserWelcome;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OldUserWelcome mo225055clone() {
        OldUserWelcome oldUserWelcome = new OldUserWelcome();
        oldUserWelcome.time_interval = this.time_interval;
        return oldUserWelcome;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof OldUserWelcome) && this.time_interval == ((OldUserWelcome) obj).time_interval;
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
        int i2 = (i * 41) + this.time_interval;
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
