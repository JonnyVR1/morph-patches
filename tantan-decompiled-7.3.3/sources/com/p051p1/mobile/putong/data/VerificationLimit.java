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
public class VerificationLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationlimit";

    @ProtobufIndex(index = 2)
    public int tribeSwipeCount;

    @ProtobufIndex(index = 1)
    public int tribeTotalCount;
    public static ProtobufAdapter<VerificationLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationLimit>() { // from class: com.p1.mobile.putong.data.VerificationLimit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerificationLimit verificationLimit) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, verificationLimit.tribeTotalCount) + CodedOutputByteBufferNano.m17281h(2, verificationLimit.tribeSwipeCount);
            verificationLimit.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerificationLimit parse(nc5 nc5Var) throws IOException {
            VerificationLimit verificationLimit = new VerificationLimit();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    verificationLimit.tribeTotalCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return verificationLimit;
                    }
                    verificationLimit.tribeSwipeCount = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerificationLimit verificationLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, verificationLimit.tribeTotalCount);
            codedOutputByteBufferNano.m17305G(2, verificationLimit.tribeSwipeCount);
        }
    };
    public static JsonAdapter<VerificationLimit> JSON_ADAPTER = new ObjectJsonAdapter<VerificationLimit>() { // from class: com.p1.mobile.putong.data.VerificationLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerificationLimit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerificationLimit newInstance() {
            return new VerificationLimit();
        }

        public boolean parseField(VerificationLimit verificationLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("tribeTotalCount")) {
                verificationLimit.tribeTotalCount = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("tribeSwipeCount")) {
                return false;
            }
            verificationLimit.tribeSwipeCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(VerificationLimit verificationLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("tribeTotalCount") || str.equals("tribeSwipeCount")) {
                return true;
            }
            return super.parseFieldCheck(verificationLimit, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationLimit verificationLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("tribeTotalCount", verificationLimit.tribeTotalCount);
            jsonGenerator.writeNumberField("tribeSwipeCount", verificationLimit.tribeSwipeCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationLimit new_() {
        VerificationLimit verificationLimit = new VerificationLimit();
        verificationLimit.nullCheck();
        return verificationLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerificationLimit mo225055clone() {
        VerificationLimit verificationLimit = new VerificationLimit();
        verificationLimit.tribeTotalCount = this.tribeTotalCount;
        verificationLimit.tribeSwipeCount = this.tribeSwipeCount;
        return verificationLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerificationLimit)) {
            return false;
        }
        VerificationLimit verificationLimit = (VerificationLimit) obj;
        return this.tribeTotalCount == verificationLimit.tribeTotalCount && this.tribeSwipeCount == verificationLimit.tribeSwipeCount;
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
        int i2 = (((i * 41) + this.tribeTotalCount) * 41) + this.tribeSwipeCount;
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
