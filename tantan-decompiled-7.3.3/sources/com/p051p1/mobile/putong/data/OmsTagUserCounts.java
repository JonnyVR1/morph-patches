package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class OmsTagUserCounts extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omstagusercounts";

    @ProtobufIndex(index = 2)
    public long count;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39650id;
    public static ProtobufAdapter<OmsTagUserCounts> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsTagUserCounts>() { // from class: com.p1.mobile.putong.data.OmsTagUserCounts.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OmsTagUserCounts omsTagUserCounts) {
            String str = omsTagUserCounts.f39650id;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, omsTagUserCounts.count);
            omsTagUserCounts.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OmsTagUserCounts parse(nc5 nc5Var) throws IOException {
            OmsTagUserCounts omsTagUserCounts = new OmsTagUserCounts();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (omsTagUserCounts.f39650id != null) {
                        break;
                    }
                    omsTagUserCounts.f39650id = "";
                    break;
                }
                if (iM162497u == 10) {
                    omsTagUserCounts.f39650id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (omsTagUserCounts.f39650id != null) {
                            break;
                        }
                        omsTagUserCounts.f39650id = "";
                        return omsTagUserCounts;
                    }
                    omsTagUserCounts.count = nc5Var.m162487k();
                }
            }
            return omsTagUserCounts;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OmsTagUserCounts omsTagUserCounts, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = omsTagUserCounts.f39650id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, omsTagUserCounts.count);
        }
    };
    public static JsonAdapter<OmsTagUserCounts> JSON_ADAPTER = new ObjectJsonAdapter<OmsTagUserCounts>() { // from class: com.p1.mobile.putong.data.OmsTagUserCounts.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OmsTagUserCounts.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OmsTagUserCounts newInstance() {
            return new OmsTagUserCounts();
        }

        public boolean parseField(OmsTagUserCounts omsTagUserCounts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                omsTagUserCounts.f39650id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("count")) {
                return false;
            }
            omsTagUserCounts.count = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(OmsTagUserCounts omsTagUserCounts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(omsTagUserCounts, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsTagUserCounts omsTagUserCounts, JsonGenerator jsonGenerator) throws IOException {
            String str = omsTagUserCounts.f39650id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("count", omsTagUserCounts.count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsTagUserCounts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsTagUserCounts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OmsTagUserCounts new_() {
        OmsTagUserCounts omsTagUserCounts = new OmsTagUserCounts();
        omsTagUserCounts.nullCheck();
        return omsTagUserCounts;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OmsTagUserCounts mo225055clone() {
        OmsTagUserCounts omsTagUserCounts = new OmsTagUserCounts();
        omsTagUserCounts.f39650id = this.f39650id;
        omsTagUserCounts.count = this.count;
        return omsTagUserCounts;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsTagUserCounts)) {
            return false;
        }
        OmsTagUserCounts omsTagUserCounts = (OmsTagUserCounts) obj;
        return ValueObject.util_equals(this.f39650id, omsTagUserCounts.f39650id) && this.count == omsTagUserCounts.count;
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
        int i2 = i * 41;
        String str = this.f39650id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.count;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39650id == null) {
            this.f39650id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
