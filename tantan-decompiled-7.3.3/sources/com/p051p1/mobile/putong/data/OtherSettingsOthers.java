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
public class OtherSettingsOthers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "othersettingsothers";

    @ProtobufIndex(index = 1)
    public boolean refuseSMS;
    public static ProtobufAdapter<OtherSettingsOthers> PROTOBUF_ADAPTER = new MessageNanoAdapter<OtherSettingsOthers>() { // from class: com.p1.mobile.putong.data.OtherSettingsOthers.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OtherSettingsOthers otherSettingsOthers) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, otherSettingsOthers.refuseSMS);
            otherSettingsOthers.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OtherSettingsOthers parse(nc5 nc5Var) throws IOException {
            OtherSettingsOthers otherSettingsOthers = new OtherSettingsOthers();
            while (nc5Var.m162497u() == 8) {
                otherSettingsOthers.refuseSMS = nc5Var.m162483g();
            }
            return otherSettingsOthers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OtherSettingsOthers otherSettingsOthers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, otherSettingsOthers.refuseSMS);
        }
    };
    public static JsonAdapter<OtherSettingsOthers> JSON_ADAPTER = new ObjectJsonAdapter<OtherSettingsOthers>() { // from class: com.p1.mobile.putong.data.OtherSettingsOthers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OtherSettingsOthers.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OtherSettingsOthers newInstance() {
            return new OtherSettingsOthers();
        }

        public boolean parseField(OtherSettingsOthers otherSettingsOthers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("refuseSMS")) {
                return false;
            }
            otherSettingsOthers.refuseSMS = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(OtherSettingsOthers otherSettingsOthers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("refuseSMS")) {
                return true;
            }
            return super.parseFieldCheck(otherSettingsOthers, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OtherSettingsOthers otherSettingsOthers, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("refuseSMS", otherSettingsOthers.refuseSMS);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OtherSettingsOthers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OtherSettingsOthers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OtherSettingsOthers new_() {
        OtherSettingsOthers otherSettingsOthers = new OtherSettingsOthers();
        otherSettingsOthers.nullCheck();
        return otherSettingsOthers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OtherSettingsOthers mo225055clone() {
        OtherSettingsOthers otherSettingsOthers = new OtherSettingsOthers();
        otherSettingsOthers.refuseSMS = this.refuseSMS;
        return otherSettingsOthers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof OtherSettingsOthers) && this.refuseSMS == ((OtherSettingsOthers) obj).refuseSMS;
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
        int i2 = (i * 41) + (this.refuseSMS ? 1231 : 1237);
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
