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
public class NCTAndroidBatch_ extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nctandroidbatch_";

    @ProtobufIndex(index = 2)
    public int MessageLimit;

    @ProtobufIndex(index = 1)
    public long TimeLimit;
    public static ProtobufAdapter<NCTAndroidBatch_> PROTOBUF_ADAPTER = new MessageNanoAdapter<NCTAndroidBatch_>() { // from class: com.p1.mobile.putong.data.NCTAndroidBatch_.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NCTAndroidBatch_ nCTAndroidBatch_) {
            int iJ = CodedOutputByteBufferNano.j(1, nCTAndroidBatch_.TimeLimit) + CodedOutputByteBufferNano.h(2, nCTAndroidBatch_.MessageLimit);
            ((MessageNano) nCTAndroidBatch_).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NCTAndroidBatch_ m18510parse(nb5 nb5Var) throws IOException {
            NCTAndroidBatch_ nCTAndroidBatch_ = new NCTAndroidBatch_();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    nCTAndroidBatch_.TimeLimit = nb5Var.k();
                } else {
                    if (iU != 16) {
                        return nCTAndroidBatch_;
                    }
                    nCTAndroidBatch_.MessageLimit = nb5Var.j();
                }
            }
        }

        public void serialize(NCTAndroidBatch_ nCTAndroidBatch_, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, nCTAndroidBatch_.TimeLimit);
            codedOutputByteBufferNano.G(2, nCTAndroidBatch_.MessageLimit);
        }
    };
    public static JsonAdapter<NCTAndroidBatch_> JSON_ADAPTER = new ObjectJsonAdapter<NCTAndroidBatch_>() { // from class: com.p1.mobile.putong.data.NCTAndroidBatch_.2
        public Class getDataClass() {
            return NCTAndroidBatch_.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NCTAndroidBatch_ mo17830newInstance() {
            return new NCTAndroidBatch_();
        }

        public boolean parseField(NCTAndroidBatch_ nCTAndroidBatch_, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("MessageLimit")) {
                nCTAndroidBatch_.MessageLimit = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("TimeLimit")) {
                return false;
            }
            nCTAndroidBatch_.TimeLimit = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(NCTAndroidBatch_ nCTAndroidBatch_, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("MessageLimit") || str.equals("TimeLimit")) {
                return true;
            }
            return super.parseFieldCheck(nCTAndroidBatch_, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NCTAndroidBatch_ nCTAndroidBatch_, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("TimeLimit", nCTAndroidBatch_.TimeLimit);
            jsonGenerator.writeNumberField("MessageLimit", nCTAndroidBatch_.MessageLimit);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NCTAndroidBatch_) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NCTAndroidBatch_) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NCTAndroidBatch_ new_() {
        NCTAndroidBatch_ nCTAndroidBatch_ = new NCTAndroidBatch_();
        nCTAndroidBatch_.nullCheck();
        return nCTAndroidBatch_;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NCTAndroidBatch_ m18509clone() {
        NCTAndroidBatch_ nCTAndroidBatch_ = new NCTAndroidBatch_();
        nCTAndroidBatch_.TimeLimit = this.TimeLimit;
        nCTAndroidBatch_.MessageLimit = this.MessageLimit;
        return nCTAndroidBatch_;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NCTAndroidBatch_)) {
            return false;
        }
        NCTAndroidBatch_ nCTAndroidBatch_ = (NCTAndroidBatch_) obj;
        return this.TimeLimit == nCTAndroidBatch_.TimeLimit && this.MessageLimit == nCTAndroidBatch_.MessageLimit;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.TimeLimit;
        int i2 = (((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.MessageLimit;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
