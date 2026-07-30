package com.p051p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class CommunityOptimization extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "communityoptimization";

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<CommunityOptimization> PROTOBUF_ADAPTER = new MessageNanoAdapter<CommunityOptimization>() { // from class: com.p1.mobile.putong.feed.data.CommunityOptimization.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CommunityOptimization communityOptimization) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, communityOptimization.enable);
            communityOptimization.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CommunityOptimization parse(nc5 nc5Var) throws IOException {
            CommunityOptimization communityOptimization = new CommunityOptimization();
            while (nc5Var.m162497u() == 8) {
                communityOptimization.enable = nc5Var.m162483g();
            }
            return communityOptimization;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CommunityOptimization communityOptimization, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, communityOptimization.enable);
        }
    };
    public static JsonAdapter<CommunityOptimization> JSON_ADAPTER = new ObjectJsonAdapter<CommunityOptimization>() { // from class: com.p1.mobile.putong.feed.data.CommunityOptimization.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CommunityOptimization.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CommunityOptimization newInstance() {
            return new CommunityOptimization();
        }

        public boolean parseField(CommunityOptimization communityOptimization, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("enable")) {
                return false;
            }
            communityOptimization.enable = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(CommunityOptimization communityOptimization, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable")) {
                return true;
            }
            return super.parseFieldCheck(communityOptimization, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CommunityOptimization communityOptimization, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", communityOptimization.enable);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommunityOptimization) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommunityOptimization) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CommunityOptimization new_() {
        CommunityOptimization communityOptimization = new CommunityOptimization();
        communityOptimization.nullCheck();
        return communityOptimization;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CommunityOptimization mo225055clone() {
        CommunityOptimization communityOptimization = new CommunityOptimization();
        communityOptimization.enable = this.enable;
        return communityOptimization;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CommunityOptimization) && this.enable == ((CommunityOptimization) obj).enable;
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
        int i2 = (i * 41) + (this.enable ? 1231 : 1237);
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
