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
public class BoostQueryData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "boostquerydata";

    @ProtobufIndex(index = 1)
    public int allCount;

    @ProtobufIndex(index = 2)
    public int likeCount;
    public static ProtobufAdapter<BoostQueryData> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostQueryData>() { // from class: com.p1.mobile.putong.core.data.BoostQueryData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BoostQueryData boostQueryData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, boostQueryData.allCount) + CodedOutputByteBufferNano.m17281h(2, boostQueryData.likeCount);
            boostQueryData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BoostQueryData parse(nc5 nc5Var) throws IOException {
            BoostQueryData boostQueryData = new BoostQueryData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    boostQueryData.allCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return boostQueryData;
                    }
                    boostQueryData.likeCount = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BoostQueryData boostQueryData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, boostQueryData.allCount);
            codedOutputByteBufferNano.m17305G(2, boostQueryData.likeCount);
        }
    };
    public static JsonAdapter<BoostQueryData> JSON_ADAPTER = new ObjectJsonAdapter<BoostQueryData>() { // from class: com.p1.mobile.putong.core.data.BoostQueryData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BoostQueryData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BoostQueryData newInstance() {
            return new BoostQueryData();
        }

        public boolean parseField(BoostQueryData boostQueryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("likeCount")) {
                boostQueryData.likeCount = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("allCount")) {
                return false;
            }
            boostQueryData.allCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(BoostQueryData boostQueryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("likeCount") || str.equals("allCount")) {
                return true;
            }
            return super.parseFieldCheck(boostQueryData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BoostQueryData boostQueryData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("allCount", boostQueryData.allCount);
            jsonGenerator.writeNumberField("likeCount", boostQueryData.likeCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostQueryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostQueryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostQueryData new_() {
        BoostQueryData boostQueryData = new BoostQueryData();
        boostQueryData.nullCheck();
        return boostQueryData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BoostQueryData mo225055clone() {
        BoostQueryData boostQueryData = new BoostQueryData();
        boostQueryData.allCount = this.allCount;
        boostQueryData.likeCount = this.likeCount;
        return boostQueryData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostQueryData)) {
            return false;
        }
        BoostQueryData boostQueryData = (BoostQueryData) obj;
        return this == obj && this.allCount == boostQueryData.allCount && this.likeCount == boostQueryData.likeCount;
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
        int iHashCode = (((super.hashCode() * 41) + this.allCount) * 41) + this.likeCount;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
