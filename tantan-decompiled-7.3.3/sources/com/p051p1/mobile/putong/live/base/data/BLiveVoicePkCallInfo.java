package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveVoicePkCallInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivevoicepkcallinfo";

    @ProtobufIndex(index = 4)
    public boolean isNewTopOne;

    @ProtobufIndex(index = 5)
    public boolean isShowAnim;

    @NonNull
    @ProtobufIndex(index = 3)
    public String mvpBg;

    @ProtobufIndex(index = 2)
    public long point;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<BLiveVoicePkCallInfo> PROTOBUF_ADAPTER = new C12507a();
    public static JsonAdapter<BLiveVoicePkCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoicePkCallInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoicePkCallInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoicePkCallInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoicePkCallInfo newInstance() {
            return new BLiveVoicePkCallInfo();
        }

        public boolean parseField(BLiveVoicePkCallInfo bLiveVoicePkCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isShowAnim":
                    bLiveVoicePkCallInfo.isShowAnim = jsonParser.getValueAsBoolean();
                    return true;
                case "userId":
                    bLiveVoicePkCallInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "mvpBg":
                    bLiveVoicePkCallInfo.mvpBg = jsonParser.getValueAsString();
                    return true;
                case "point":
                    bLiveVoicePkCallInfo.point = jsonParser.getValueAsLong();
                    return true;
                case "isNewTopOne":
                    bLiveVoicePkCallInfo.isNewTopOne = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoicePkCallInfo bLiveVoicePkCallInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoicePkCallInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("point", bLiveVoicePkCallInfo.point);
            String str2 = bLiveVoicePkCallInfo.mvpBg;
            if (str2 != null) {
                jsonGenerator.writeStringField("mvpBg", str2);
            }
            jsonGenerator.writeBooleanField("isNewTopOne", bLiveVoicePkCallInfo.isNewTopOne);
            jsonGenerator.writeBooleanField("isShowAnim", bLiveVoicePkCallInfo.isShowAnim);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoicePkCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoicePkCallInfo$a */
    public class C12507a extends MessageNanoAdapter<BLiveVoicePkCallInfo> {
        public C12507a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveVoicePkCallInfo bLiveVoicePkCallInfo) {
            String str = bLiveVoicePkCallInfo.userId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, bLiveVoicePkCallInfo.point);
            String str2 = bLiveVoicePkCallInfo.mvpBg;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(4, bLiveVoicePkCallInfo.isNewTopOne) + CodedOutputByteBufferNano.m17275b(5, bLiveVoicePkCallInfo.isShowAnim);
            bLiveVoicePkCallInfo.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveVoicePkCallInfo parse(nc5 nc5Var) throws IOException {
            BLiveVoicePkCallInfo bLiveVoicePkCallInfo = new BLiveVoicePkCallInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bLiveVoicePkCallInfo.userId == null) {
                        bLiveVoicePkCallInfo.userId = "";
                    }
                    if (bLiveVoicePkCallInfo.mvpBg != null) {
                        break;
                    }
                    bLiveVoicePkCallInfo.mvpBg = "";
                    break;
                }
                if (iM162497u == 10) {
                    bLiveVoicePkCallInfo.userId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    bLiveVoicePkCallInfo.point = nc5Var.m162487k();
                } else if (iM162497u == 26) {
                    bLiveVoicePkCallInfo.mvpBg = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    bLiveVoicePkCallInfo.isNewTopOne = nc5Var.m162483g();
                } else {
                    if (iM162497u != 40) {
                        if (bLiveVoicePkCallInfo.userId == null) {
                            bLiveVoicePkCallInfo.userId = "";
                        }
                        if (bLiveVoicePkCallInfo.mvpBg != null) {
                            break;
                        }
                        bLiveVoicePkCallInfo.mvpBg = "";
                        return bLiveVoicePkCallInfo;
                    }
                    bLiveVoicePkCallInfo.isShowAnim = nc5Var.m162483g();
                }
            }
            return bLiveVoicePkCallInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveVoicePkCallInfo bLiveVoicePkCallInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveVoicePkCallInfo.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, bLiveVoicePkCallInfo.point);
            String str2 = bLiveVoicePkCallInfo.mvpBg;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            codedOutputByteBufferNano.m17299A(4, bLiveVoicePkCallInfo.isNewTopOne);
            codedOutputByteBufferNano.m17299A(5, bLiveVoicePkCallInfo.isShowAnim);
        }
    }

    public static BLiveVoicePkCallInfo new_() {
        BLiveVoicePkCallInfo bLiveVoicePkCallInfo = new BLiveVoicePkCallInfo();
        bLiveVoicePkCallInfo.nullCheck();
        return bLiveVoicePkCallInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoicePkCallInfo mo225055clone() {
        BLiveVoicePkCallInfo bLiveVoicePkCallInfo = new BLiveVoicePkCallInfo();
        bLiveVoicePkCallInfo.userId = this.userId;
        bLiveVoicePkCallInfo.point = this.point;
        bLiveVoicePkCallInfo.mvpBg = this.mvpBg;
        bLiveVoicePkCallInfo.isNewTopOne = this.isNewTopOne;
        bLiveVoicePkCallInfo.isShowAnim = this.isShowAnim;
        return bLiveVoicePkCallInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoicePkCallInfo)) {
            return false;
        }
        BLiveVoicePkCallInfo bLiveVoicePkCallInfo = (BLiveVoicePkCallInfo) obj;
        return ValueObject.util_equals(this.userId, bLiveVoicePkCallInfo.userId) && this.point == bLiveVoicePkCallInfo.point && ValueObject.util_equals(this.mvpBg, bLiveVoicePkCallInfo.mvpBg) && this.isNewTopOne == bLiveVoicePkCallInfo.isNewTopOne && this.isShowAnim == bLiveVoicePkCallInfo.isShowAnim;
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
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.point;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str2 = this.mvpBg;
        int iHashCode2 = ((((i3 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isNewTopOne ? 1231 : 1237)) * 41) + (this.isShowAnim ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.mvpBg == null) {
            this.mvpBg = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
