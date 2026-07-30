package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.VisitorsRecommendationType;
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
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17228j(2, oDiamondFeedLatestVisitor.latestVisitTime) + CodedOutputByteBufferNano.m17226h(3, oDiamondFeedLatestVisitor.visitCount);
            oDiamondFeedLatestVisitor.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ODiamondFeedLatestVisitor parse(nb5 nb5Var) throws IOException {
            ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor = new ODiamondFeedLatestVisitor();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oDiamondFeedLatestVisitor.userId != null) {
                        break;
                    }
                    oDiamondFeedLatestVisitor.userId = "";
                    break;
                }
                if (iM158752u == 10) {
                    oDiamondFeedLatestVisitor.userId = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    oDiamondFeedLatestVisitor.latestVisitTime = nb5Var.m158742k();
                } else {
                    if (iM158752u != 24) {
                        if (oDiamondFeedLatestVisitor.userId != null) {
                            break;
                        }
                        oDiamondFeedLatestVisitor.userId = "";
                        return oDiamondFeedLatestVisitor;
                    }
                    oDiamondFeedLatestVisitor.visitCount = nb5Var.m158741j();
                }
            }
            return oDiamondFeedLatestVisitor;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oDiamondFeedLatestVisitor.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17252I(2, oDiamondFeedLatestVisitor.latestVisitTime);
            codedOutputByteBufferNano.m17250G(3, oDiamondFeedLatestVisitor.visitCount);
        }
    };
    public static JsonAdapter<ODiamondFeedLatestVisitor> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondFeedLatestVisitor>() { // from class: com.p1.mobile.putong.core.data.ODiamondFeedLatestVisitor.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ODiamondFeedLatestVisitor.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor, JsonGenerator jsonGenerator) throws IOException {
            String str = oDiamondFeedLatestVisitor.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("latestVisitTime", oDiamondFeedLatestVisitor.latestVisitTime);
            jsonGenerator.writeNumberField(VisitorsRecommendationType.visitCount, oDiamondFeedLatestVisitor.visitCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondFeedLatestVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public ODiamondFeedLatestVisitor mo223809clone() {
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
