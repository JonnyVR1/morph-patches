package com.p046p1.mobile.putong.live.base.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveFansMemberNum extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivefansmembernum";

    @ProtobufIndex(index = 1)
    public int memberNum;
    public static ProtobufAdapter<BLiveFansMemberNum> PROTOBUF_ADAPTER = new C11648a();
    public static JsonAdapter<BLiveFansMemberNum> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFansMemberNum>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFansMemberNum.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFansMemberNum.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFansMemberNum newInstance() {
            return new BLiveFansMemberNum();
        }

        public boolean parseField(BLiveFansMemberNum bLiveFansMemberNum, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("memberNum")) {
                return false;
            }
            bLiveFansMemberNum.memberNum = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFansMemberNum bLiveFansMemberNum, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("memberNum", bLiveFansMemberNum.memberNum);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFansMemberNum) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveFansMemberNum$a */
    public class C11648a extends MessageNanoAdapter<BLiveFansMemberNum> {
        public C11648a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveFansMemberNum bLiveFansMemberNum) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, bLiveFansMemberNum.memberNum);
            bLiveFansMemberNum.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveFansMemberNum parse(nb5 nb5Var) throws IOException {
            BLiveFansMemberNum bLiveFansMemberNum = new BLiveFansMemberNum();
            while (nb5Var.m158752u() == 8) {
                bLiveFansMemberNum.memberNum = nb5Var.m158741j();
            }
            return bLiveFansMemberNum;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveFansMemberNum bLiveFansMemberNum, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, bLiveFansMemberNum.memberNum);
        }
    }

    public static BLiveFansMemberNum new_() {
        BLiveFansMemberNum bLiveFansMemberNum = new BLiveFansMemberNum();
        bLiveFansMemberNum.nullCheck();
        return bLiveFansMemberNum;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFansMemberNum mo223809clone() {
        BLiveFansMemberNum bLiveFansMemberNum = new BLiveFansMemberNum();
        bLiveFansMemberNum.memberNum = this.memberNum;
        return bLiveFansMemberNum;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveFansMemberNum) && this.memberNum == ((BLiveFansMemberNum) obj).memberNum;
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
        int i2 = (i * 41) + this.memberNum;
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
