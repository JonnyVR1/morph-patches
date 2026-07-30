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
public class VerificationLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationlimit";

    @ProtobufIndex(index = 2)
    public int tribeSwipeCount;

    @ProtobufIndex(index = 1)
    public int tribeTotalCount;
    public static ProtobufAdapter<VerificationLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationLimit>() { // from class: com.p1.mobile.putong.data.VerificationLimit.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VerificationLimit verificationLimit) {
            int iH = CodedOutputByteBufferNano.h(1, verificationLimit.tribeTotalCount) + CodedOutputByteBufferNano.h(2, verificationLimit.tribeSwipeCount);
            ((MessageNano) verificationLimit).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VerificationLimit m19262parse(nb5 nb5Var) throws IOException {
            VerificationLimit verificationLimit = new VerificationLimit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    verificationLimit.tribeTotalCount = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return verificationLimit;
                    }
                    verificationLimit.tribeSwipeCount = nb5Var.j();
                }
            }
        }

        public void serialize(VerificationLimit verificationLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, verificationLimit.tribeTotalCount);
            codedOutputByteBufferNano.G(2, verificationLimit.tribeSwipeCount);
        }
    };
    public static JsonAdapter<VerificationLimit> JSON_ADAPTER = new ObjectJsonAdapter<VerificationLimit>() { // from class: com.p1.mobile.putong.data.VerificationLimit.2
        public Class getDataClass() {
            return VerificationLimit.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VerificationLimit mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationLimit verificationLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("tribeTotalCount", verificationLimit.tribeTotalCount);
            jsonGenerator.writeNumberField("tribeSwipeCount", verificationLimit.tribeSwipeCount);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationLimit new_() {
        VerificationLimit verificationLimit = new VerificationLimit();
        verificationLimit.nullCheck();
        return verificationLimit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VerificationLimit m19261clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.tribeTotalCount) * 41) + this.tribeSwipeCount;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
