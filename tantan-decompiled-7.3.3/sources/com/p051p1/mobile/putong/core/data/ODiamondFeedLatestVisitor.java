package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.VisitorsRecommendationType;
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
public class ODiamondFeedLatestVisitor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondfeedlatestvisitor";

    @ProtobufIndex(index = 2)
    public long latestVisitTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @ProtobufIndex(index = 3)
    public int visitCount;
    public static ProtobufAdapter<ODiamondFeedLatestVisitor> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondFeedLatestVisitor>() { // from class: com.p1.mobile.putong.core.data.ODiamondFeedLatestVisitor.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor) {
            String str = oDiamondFeedLatestVisitor.userId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, oDiamondFeedLatestVisitor.latestVisitTime) + CodedOutputByteBufferNano.m17281h(3, oDiamondFeedLatestVisitor.visitCount);
            oDiamondFeedLatestVisitor.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ODiamondFeedLatestVisitor parse(nc5 nc5Var) throws IOException {
            ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor = new ODiamondFeedLatestVisitor();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oDiamondFeedLatestVisitor.userId != null) {
                        break;
                    }
                    oDiamondFeedLatestVisitor.userId = "";
                    break;
                }
                if (iM162497u == 10) {
                    oDiamondFeedLatestVisitor.userId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    oDiamondFeedLatestVisitor.latestVisitTime = nc5Var.m162487k();
                } else {
                    if (iM162497u != 24) {
                        if (oDiamondFeedLatestVisitor.userId != null) {
                            break;
                        }
                        oDiamondFeedLatestVisitor.userId = "";
                        return oDiamondFeedLatestVisitor;
                    }
                    oDiamondFeedLatestVisitor.visitCount = nc5Var.m162486j();
                }
            }
            return oDiamondFeedLatestVisitor;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oDiamondFeedLatestVisitor.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, oDiamondFeedLatestVisitor.latestVisitTime);
            codedOutputByteBufferNano.m17305G(3, oDiamondFeedLatestVisitor.visitCount);
        }
    };
    public static JsonAdapter<ODiamondFeedLatestVisitor> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondFeedLatestVisitor>() { // from class: com.p1.mobile.putong.core.data.ODiamondFeedLatestVisitor.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ODiamondFeedLatestVisitor.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ODiamondFeedLatestVisitor newInstance() {
            return new ODiamondFeedLatestVisitor();
        }

        public boolean parseField(ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "visitCount":
                    oDiamondFeedLatestVisitor.visitCount = jsonParser.getValueAsInt();
                    return true;
                case "userId":
                    oDiamondFeedLatestVisitor.userId = jsonParser.getValueAsString();
                    return true;
                case "latestVisitTime":
                    oDiamondFeedLatestVisitor.latestVisitTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "visitCount":
                case "userId":
                case "latestVisitTime":
                    return true;
                default:
                    return super.parseFieldCheck(oDiamondFeedLatestVisitor, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor, JsonGenerator jsonGenerator) throws IOException {
            String str = oDiamondFeedLatestVisitor.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("latestVisitTime", oDiamondFeedLatestVisitor.latestVisitTime);
            jsonGenerator.writeNumberField(VisitorsRecommendationType.visitCount, oDiamondFeedLatestVisitor.visitCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondFeedLatestVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondFeedLatestVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondFeedLatestVisitor new_() {
        ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor = new ODiamondFeedLatestVisitor();
        oDiamondFeedLatestVisitor.nullCheck();
        return oDiamondFeedLatestVisitor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ODiamondFeedLatestVisitor mo225055clone() {
        ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor = new ODiamondFeedLatestVisitor();
        oDiamondFeedLatestVisitor.userId = this.userId;
        oDiamondFeedLatestVisitor.latestVisitTime = this.latestVisitTime;
        oDiamondFeedLatestVisitor.visitCount = this.visitCount;
        return oDiamondFeedLatestVisitor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ODiamondFeedLatestVisitor)) {
            return false;
        }
        ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor = (ODiamondFeedLatestVisitor) obj;
        return ValueObject.util_equals(this.userId, oDiamondFeedLatestVisitor.userId) && this.latestVisitTime == oDiamondFeedLatestVisitor.latestVisitTime && this.visitCount == oDiamondFeedLatestVisitor.visitCount;
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.latestVisitTime;
        int i3 = ((iHashCode + ((int) (j ^ (j >>> 32)))) * 41) + this.visitCount;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
