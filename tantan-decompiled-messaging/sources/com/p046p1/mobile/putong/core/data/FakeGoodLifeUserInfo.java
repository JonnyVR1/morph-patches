package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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

/* JADX INFO: loaded from: classes10.dex */
public class FakeGoodLifeUserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakegoodlifeuserinfo";

    @ProtobufIndex(index = 3)
    public int avatar;

    @ProtobufIndex(index = 2)
    public int likeNum;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String picBig;

    @ProtobufIndex(index = 4)
    public int picSmall;
    public static ProtobufAdapter<FakeGoodLifeUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakeGoodLifeUserInfo>() { // from class: com.p1.mobile.putong.core.data.FakeGoodLifeUserInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FakeGoodLifeUserInfo fakeGoodLifeUserInfo) {
            String str = fakeGoodLifeUserInfo.name;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, fakeGoodLifeUserInfo.likeNum) + CodedOutputByteBufferNano.m17226h(3, fakeGoodLifeUserInfo.avatar) + CodedOutputByteBufferNano.m17226h(4, fakeGoodLifeUserInfo.picSmall);
            String str2 = fakeGoodLifeUserInfo.picBig;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str2);
            }
            fakeGoodLifeUserInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FakeGoodLifeUserInfo parse(nb5 nb5Var) throws IOException {
            FakeGoodLifeUserInfo fakeGoodLifeUserInfo = new FakeGoodLifeUserInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (fakeGoodLifeUserInfo.name == null) {
                        fakeGoodLifeUserInfo.name = "";
                    }
                    if (fakeGoodLifeUserInfo.picBig != null) {
                        break;
                    }
                    fakeGoodLifeUserInfo.picBig = "";
                    break;
                }
                if (iM158752u == 10) {
                    fakeGoodLifeUserInfo.name = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    fakeGoodLifeUserInfo.likeNum = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    fakeGoodLifeUserInfo.avatar = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    fakeGoodLifeUserInfo.picSmall = nb5Var.m158741j();
                } else {
                    if (iM158752u != 42) {
                        if (fakeGoodLifeUserInfo.name == null) {
                            fakeGoodLifeUserInfo.name = "";
                        }
                        if (fakeGoodLifeUserInfo.picBig != null) {
                            break;
                        }
                        fakeGoodLifeUserInfo.picBig = "";
                        return fakeGoodLifeUserInfo;
                    }
                    fakeGoodLifeUserInfo.picBig = nb5Var.m158750s();
                }
            }
            return fakeGoodLifeUserInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FakeGoodLifeUserInfo fakeGoodLifeUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fakeGoodLifeUserInfo.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, fakeGoodLifeUserInfo.likeNum);
            codedOutputByteBufferNano.m17250G(3, fakeGoodLifeUserInfo.avatar);
            codedOutputByteBufferNano.m17250G(4, fakeGoodLifeUserInfo.picSmall);
            String str2 = fakeGoodLifeUserInfo.picBig;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(5, str2);
            }
        }
    };
    public static JsonAdapter<FakeGoodLifeUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<FakeGoodLifeUserInfo>() { // from class: com.p1.mobile.putong.core.data.FakeGoodLifeUserInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FakeGoodLifeUserInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FakeGoodLifeUserInfo newInstance() {
            return new FakeGoodLifeUserInfo();
        }

        public boolean parseField(FakeGoodLifeUserInfo fakeGoodLifeUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    fakeGoodLifeUserInfo.avatar = jsonParser.getValueAsInt();
                    return true;
                case "picBig":
                    fakeGoodLifeUserInfo.picBig = jsonParser.getValueAsString();
                    return true;
                case "picSmall":
                    fakeGoodLifeUserInfo.picSmall = jsonParser.getValueAsInt();
                    return true;
                case "name":
                    fakeGoodLifeUserInfo.name = jsonParser.getValueAsString();
                    return true;
                case "likeNum":
                    fakeGoodLifeUserInfo.likeNum = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FakeGoodLifeUserInfo fakeGoodLifeUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "avatar":
                case "picBig":
                case "picSmall":
                case "name":
                case "likeNum":
                    return true;
                default:
                    return super.parseFieldCheck(fakeGoodLifeUserInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FakeGoodLifeUserInfo fakeGoodLifeUserInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = fakeGoodLifeUserInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            jsonGenerator.writeNumberField("likeNum", fakeGoodLifeUserInfo.likeNum);
            jsonGenerator.writeNumberField("avatar", fakeGoodLifeUserInfo.avatar);
            jsonGenerator.writeNumberField("picSmall", fakeGoodLifeUserInfo.picSmall);
            String str2 = fakeGoodLifeUserInfo.picBig;
            if (str2 != null) {
                jsonGenerator.writeStringField("picBig", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakeGoodLifeUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakeGoodLifeUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakeGoodLifeUserInfo new_() {
        FakeGoodLifeUserInfo fakeGoodLifeUserInfo = new FakeGoodLifeUserInfo();
        fakeGoodLifeUserInfo.nullCheck();
        return fakeGoodLifeUserInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FakeGoodLifeUserInfo mo223809clone() {
        FakeGoodLifeUserInfo fakeGoodLifeUserInfo = new FakeGoodLifeUserInfo();
        fakeGoodLifeUserInfo.name = this.name;
        fakeGoodLifeUserInfo.likeNum = this.likeNum;
        fakeGoodLifeUserInfo.avatar = this.avatar;
        fakeGoodLifeUserInfo.picSmall = this.picSmall;
        fakeGoodLifeUserInfo.picBig = this.picBig;
        return fakeGoodLifeUserInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FakeGoodLifeUserInfo)) {
            return false;
        }
        FakeGoodLifeUserInfo fakeGoodLifeUserInfo = (FakeGoodLifeUserInfo) obj;
        return ValueObject.util_equals(this.name, fakeGoodLifeUserInfo.name) && this.likeNum == fakeGoodLifeUserInfo.likeNum && this.avatar == fakeGoodLifeUserInfo.avatar && this.picSmall == fakeGoodLifeUserInfo.picSmall && ValueObject.util_equals(this.picBig, fakeGoodLifeUserInfo.picBig);
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
        String str = this.name;
        int iHashCode = (((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.likeNum) * 41) + this.avatar) * 41) + this.picSmall) * 41;
        String str2 = this.picBig;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.picBig == null) {
            this.picBig = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
