package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class OmsTagUserCounts extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omstagusercounts";

    @ProtobufIndex(index = 2)
    public long count;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f263id;
    public static ProtobufAdapter<OmsTagUserCounts> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsTagUserCounts>() { // from class: com.p1.mobile.putong.data.OmsTagUserCounts.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OmsTagUserCounts omsTagUserCounts) {
            String str = omsTagUserCounts.f263id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, omsTagUserCounts.count);
            ((MessageNano) omsTagUserCounts).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OmsTagUserCounts m18735parse(nb5 nb5Var) throws IOException {
            OmsTagUserCounts omsTagUserCounts = new OmsTagUserCounts();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (omsTagUserCounts.f263id != null) {
                        break;
                    }
                    omsTagUserCounts.f263id = "";
                    break;
                }
                if (iU == 10) {
                    omsTagUserCounts.f263id = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (omsTagUserCounts.f263id != null) {
                            break;
                        }
                        omsTagUserCounts.f263id = "";
                        return omsTagUserCounts;
                    }
                    omsTagUserCounts.count = nb5Var.k();
                }
            }
            return omsTagUserCounts;
        }

        public void serialize(OmsTagUserCounts omsTagUserCounts, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = omsTagUserCounts.f263id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, omsTagUserCounts.count);
        }
    };
    public static JsonAdapter<OmsTagUserCounts> JSON_ADAPTER = new ObjectJsonAdapter<OmsTagUserCounts>() { // from class: com.p1.mobile.putong.data.OmsTagUserCounts.2
        public Class getDataClass() {
            return OmsTagUserCounts.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OmsTagUserCounts mo17830newInstance() {
            return new OmsTagUserCounts();
        }

        public boolean parseField(OmsTagUserCounts omsTagUserCounts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                omsTagUserCounts.f263id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsTagUserCounts omsTagUserCounts, JsonGenerator jsonGenerator) throws IOException {
            String str = omsTagUserCounts.f263id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("count", omsTagUserCounts.count);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsTagUserCounts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsTagUserCounts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OmsTagUserCounts new_() {
        OmsTagUserCounts omsTagUserCounts = new OmsTagUserCounts();
        omsTagUserCounts.nullCheck();
        return omsTagUserCounts;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OmsTagUserCounts m18734clone() {
        OmsTagUserCounts omsTagUserCounts = new OmsTagUserCounts();
        omsTagUserCounts.f263id = this.f263id;
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
        return ValueObject.util_equals(this.f263id, omsTagUserCounts.f263id) && this.count == omsTagUserCounts.count;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f263id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.count;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f263id == null) {
            this.f263id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
