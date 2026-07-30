package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveVoicePkPoint extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivevoicepkpoint";

    @ProtobufIndex(index = 3)
    public boolean isNewTopOne;

    @ProtobufIndex(index = 4)
    public boolean isScoreChange;

    @ProtobufIndex(index = 2)
    public long point;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<BLiveVoicePkPoint> PROTOBUF_ADAPTER = new C12348a();
    public static JsonAdapter<BLiveVoicePkPoint> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoicePkPoint>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoicePkPoint.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoicePkPoint.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoicePkPoint newInstance() {
            return new BLiveVoicePkPoint();
        }

        public boolean parseField(BLiveVoicePkPoint bLiveVoicePkPoint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveVoicePkPoint.userId = jsonParser.getValueAsString();
                    return true;
                case "isScoreChange":
                    bLiveVoicePkPoint.isScoreChange = jsonParser.getValueAsBoolean();
                    return true;
                case "point":
                    bLiveVoicePkPoint.point = jsonParser.getValueAsLong();
                    return true;
                case "isNewTopOne":
                    bLiveVoicePkPoint.isNewTopOne = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoicePkPoint bLiveVoicePkPoint, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoicePkPoint.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("point", bLiveVoicePkPoint.point);
            jsonGenerator.writeBooleanField("isNewTopOne", bLiveVoicePkPoint.isNewTopOne);
            jsonGenerator.writeBooleanField("isScoreChange", bLiveVoicePkPoint.isScoreChange);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoicePkPoint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoicePkPoint$a */
    public class C12348a extends MessageNanoAdapter<BLiveVoicePkPoint> {
        public C12348a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveVoicePkPoint bLiveVoicePkPoint) {
            String str = bLiveVoicePkPoint.userId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17228j(2, bLiveVoicePkPoint.point) + CodedOutputByteBufferNano.m17220b(3, bLiveVoicePkPoint.isNewTopOne) + CodedOutputByteBufferNano.m17220b(4, bLiveVoicePkPoint.isScoreChange);
            bLiveVoicePkPoint.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveVoicePkPoint parse(nb5 nb5Var) throws IOException {
            BLiveVoicePkPoint bLiveVoicePkPoint = new BLiveVoicePkPoint();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveVoicePkPoint.userId != null) {
                        break;
                    }
                    bLiveVoicePkPoint.userId = "";
                    break;
                }
                if (iM158752u == 10) {
                    bLiveVoicePkPoint.userId = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    bLiveVoicePkPoint.point = nb5Var.m158742k();
                } else if (iM158752u == 24) {
                    bLiveVoicePkPoint.isNewTopOne = nb5Var.m158738g();
                } else {
                    if (iM158752u != 32) {
                        if (bLiveVoicePkPoint.userId != null) {
                            break;
                        }
                        bLiveVoicePkPoint.userId = "";
                        return bLiveVoicePkPoint;
                    }
                    bLiveVoicePkPoint.isScoreChange = nb5Var.m158738g();
                }
            }
            return bLiveVoicePkPoint;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveVoicePkPoint bLiveVoicePkPoint, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveVoicePkPoint.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17252I(2, bLiveVoicePkPoint.point);
            codedOutputByteBufferNano.m17244A(3, bLiveVoicePkPoint.isNewTopOne);
            codedOutputByteBufferNano.m17244A(4, bLiveVoicePkPoint.isScoreChange);
        }
    }

    public static BLiveVoicePkPoint new_() {
        BLiveVoicePkPoint bLiveVoicePkPoint = new BLiveVoicePkPoint();
        bLiveVoicePkPoint.nullCheck();
        return bLiveVoicePkPoint;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoicePkPoint mo223809clone() {
        BLiveVoicePkPoint bLiveVoicePkPoint = new BLiveVoicePkPoint();
        bLiveVoicePkPoint.userId = this.userId;
        bLiveVoicePkPoint.point = this.point;
        bLiveVoicePkPoint.isNewTopOne = this.isNewTopOne;
        bLiveVoicePkPoint.isScoreChange = this.isScoreChange;
        return bLiveVoicePkPoint;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoicePkPoint)) {
            return false;
        }
        BLiveVoicePkPoint bLiveVoicePkPoint = (BLiveVoicePkPoint) obj;
        return ValueObject.util_equals(this.userId, bLiveVoicePkPoint.userId) && this.point == bLiveVoicePkPoint.point && this.isNewTopOne == bLiveVoicePkPoint.isNewTopOne && this.isScoreChange == bLiveVoicePkPoint.isScoreChange;
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
        long j = this.point;
        int i3 = ((((iHashCode + ((int) (j ^ (j >>> 32)))) * 41) + (this.isNewTopOne ? 1231 : 1237)) * 41) + (this.isScoreChange ? 1231 : 1237);
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
