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
public class GrowthSpamInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthspaminfo";

    @ProtobufIndex(index = 1)
    public boolean pop;
    public static ProtobufAdapter<GrowthSpamInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthSpamInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthSpamInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GrowthSpamInfo growthSpamInfo) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, growthSpamInfo.pop);
            growthSpamInfo.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GrowthSpamInfo parse(nc5 nc5Var) throws IOException {
            GrowthSpamInfo growthSpamInfo = new GrowthSpamInfo();
            while (nc5Var.m162497u() == 8) {
                growthSpamInfo.pop = nc5Var.m162483g();
            }
            return growthSpamInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GrowthSpamInfo growthSpamInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, growthSpamInfo.pop);
        }
    };
    public static JsonAdapter<GrowthSpamInfo> JSON_ADAPTER = new ObjectJsonAdapter<GrowthSpamInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthSpamInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GrowthSpamInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GrowthSpamInfo newInstance() {
            return new GrowthSpamInfo();
        }

        public boolean parseField(GrowthSpamInfo growthSpamInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(GuideBoostMode.pop)) {
                return false;
            }
            growthSpamInfo.pop = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(GrowthSpamInfo growthSpamInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(GuideBoostMode.pop)) {
                return true;
            }
            return super.parseFieldCheck(growthSpamInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GrowthSpamInfo growthSpamInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(GuideBoostMode.pop, growthSpamInfo.pop);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthSpamInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthSpamInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthSpamInfo new_() {
        GrowthSpamInfo growthSpamInfo = new GrowthSpamInfo();
        growthSpamInfo.nullCheck();
        return growthSpamInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GrowthSpamInfo mo225055clone() {
        GrowthSpamInfo growthSpamInfo = new GrowthSpamInfo();
        growthSpamInfo.pop = this.pop;
        return growthSpamInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GrowthSpamInfo) && this.pop == ((GrowthSpamInfo) obj).pop;
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
        int i2 = (i * 41) + (this.pop ? 1231 : 1237);
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
