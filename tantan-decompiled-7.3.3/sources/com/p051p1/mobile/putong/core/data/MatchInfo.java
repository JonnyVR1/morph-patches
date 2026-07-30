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
public class MatchInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "matchinfo";

    @ProtobufIndex(index = 1)
    public int todayMatchCount;
    public static ProtobufAdapter<MatchInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatchInfo>() { // from class: com.p1.mobile.putong.core.data.MatchInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MatchInfo matchInfo) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, matchInfo.todayMatchCount);
            matchInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MatchInfo parse(nc5 nc5Var) throws IOException {
            MatchInfo matchInfo = new MatchInfo();
            while (nc5Var.m162497u() == 8) {
                matchInfo.todayMatchCount = nc5Var.m162486j();
            }
            return matchInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MatchInfo matchInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, matchInfo.todayMatchCount);
        }
    };
    public static JsonAdapter<MatchInfo> JSON_ADAPTER = new ObjectJsonAdapter<MatchInfo>() { // from class: com.p1.mobile.putong.core.data.MatchInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MatchInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MatchInfo newInstance() {
            return new MatchInfo();
        }

        public boolean parseField(MatchInfo matchInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("todayMatchCount")) {
                return false;
            }
            matchInfo.todayMatchCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(MatchInfo matchInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("todayMatchCount")) {
                return true;
            }
            return super.parseFieldCheck(matchInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MatchInfo matchInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("todayMatchCount", matchInfo.todayMatchCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatchInfo new_() {
        MatchInfo matchInfo = new MatchInfo();
        matchInfo.nullCheck();
        return matchInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MatchInfo mo225055clone() {
        MatchInfo matchInfo = new MatchInfo();
        matchInfo.todayMatchCount = this.todayMatchCount;
        return matchInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MatchInfo) && this.todayMatchCount == ((MatchInfo) obj).todayMatchCount;
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
        int i2 = (i * 41) + this.todayMatchCount;
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
