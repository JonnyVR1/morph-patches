package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FakeGoodLifeUserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakegoodlifeuserinfo";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int avatar;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int likeNum;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String picBig;

    @ProtobufIndex(index = 4)
    public int picSmall;
    public static ProtobufAdapter<FakeGoodLifeUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakeGoodLifeUserInfo>() { // from class: com.p1.mobile.putong.core.data.FakeGoodLifeUserInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FakeGoodLifeUserInfo fakeGoodLifeUserInfo) {
            String str = fakeGoodLifeUserInfo.name;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, fakeGoodLifeUserInfo.likeNum) + CodedOutputByteBufferNano.h(3, fakeGoodLifeUserInfo.avatar) + CodedOutputByteBufferNano.h(4, fakeGoodLifeUserInfo.picSmall);
            String str2 = fakeGoodLifeUserInfo.picBig;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(5, str2);
            }
            ((MessageNano) fakeGoodLifeUserInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FakeGoodLifeUserInfo m12709parse(nb5 nb5Var) throws IOException {
            FakeGoodLifeUserInfo fakeGoodLifeUserInfo = new FakeGoodLifeUserInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fakeGoodLifeUserInfo.name == null) {
                        fakeGoodLifeUserInfo.name = "";
                    }
                    if (fakeGoodLifeUserInfo.picBig != null) {
                        break;
                    }
                    fakeGoodLifeUserInfo.picBig = "";
                    break;
                }
                if (iU == 10) {
                    fakeGoodLifeUserInfo.name = nb5Var.s();
                } else if (iU == 16) {
                    fakeGoodLifeUserInfo.likeNum = nb5Var.j();
                } else if (iU == 24) {
                    fakeGoodLifeUserInfo.avatar = nb5Var.j();
                } else if (iU == 32) {
                    fakeGoodLifeUserInfo.picSmall = nb5Var.j();
                } else {
                    if (iU != 42) {
                        if (fakeGoodLifeUserInfo.name == null) {
                            fakeGoodLifeUserInfo.name = "";
                        }
                        if (fakeGoodLifeUserInfo.picBig != null) {
                            break;
                        }
                        fakeGoodLifeUserInfo.picBig = "";
                        return fakeGoodLifeUserInfo;
                    }
                    fakeGoodLifeUserInfo.picBig = nb5Var.s();
                }
            }
            return fakeGoodLifeUserInfo;
        }

        public void serialize(FakeGoodLifeUserInfo fakeGoodLifeUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fakeGoodLifeUserInfo.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, fakeGoodLifeUserInfo.likeNum);
            codedOutputByteBufferNano.G(3, fakeGoodLifeUserInfo.avatar);
            codedOutputByteBufferNano.G(4, fakeGoodLifeUserInfo.picSmall);
            String str2 = fakeGoodLifeUserInfo.picBig;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
        }
    };
    public static JsonAdapter<FakeGoodLifeUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<FakeGoodLifeUserInfo>() { // from class: com.p1.mobile.putong.core.data.FakeGoodLifeUserInfo.2
        public Class getDataClass() {
            return FakeGoodLifeUserInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FakeGoodLifeUserInfo m12710newInstance() {
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

        public void serializeFields(FakeGoodLifeUserInfo fakeGoodLifeUserInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = fakeGoodLifeUserInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            jsonGenerator.writeNumberField("likeNum", fakeGoodLifeUserInfo.likeNum);
            jsonGenerator.writeNumberField(ReminderAction.avatar, fakeGoodLifeUserInfo.avatar);
            jsonGenerator.writeNumberField("picSmall", fakeGoodLifeUserInfo.picSmall);
            String str2 = fakeGoodLifeUserInfo.picBig;
            if (str2 != null) {
                jsonGenerator.writeStringField("picBig", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakeGoodLifeUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakeGoodLifeUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakeGoodLifeUserInfo new_() {
        FakeGoodLifeUserInfo fakeGoodLifeUserInfo = new FakeGoodLifeUserInfo();
        fakeGoodLifeUserInfo.nullCheck();
        return fakeGoodLifeUserInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FakeGoodLifeUserInfo m12708clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.name;
        int iHashCode = (((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.likeNum) * 41) + this.avatar) * 41) + this.picSmall) * 41;
        String str2 = this.picBig;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.picBig == null) {
            this.picBig = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
