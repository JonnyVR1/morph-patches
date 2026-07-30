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
public class BLiveBossGift extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivebossgift";

    @ProtobufIndex(index = 10)
    public long createdTime;

    @NonNull
    @ProtobufIndex(index = 7)
    public String giftName;

    @ProtobufIndex(index = 8)
    public int giftNum;

    @NonNull
    @ProtobufIndex(index = 9)
    public String giftUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public String otherUserId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String otherUserName;

    @ProtobufIndex(index = 1)
    public int popularityValue;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userName;
    public static ProtobufAdapter<BLiveBossGift> PROTOBUF_ADAPTER = new C11676a();
    public static JsonAdapter<BLiveBossGift> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBossGift>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBossGift.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBossGift.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBossGift newInstance() {
            return new BLiveBossGift();
        }

        public boolean parseField(BLiveBossGift bLiveBossGift, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    bLiveBossGift.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "otherUserName":
                    bLiveBossGift.otherUserName = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveBossGift.userId = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    bLiveBossGift.createdTime = jsonParser.getValueAsLong();
                    return true;
                case "popularityValue":
                    bLiveBossGift.popularityValue = jsonParser.getValueAsInt();
                    return true;
                case "userName":
                    bLiveBossGift.userName = jsonParser.getValueAsString();
                    return true;
                case "giftNum":
                    bLiveBossGift.giftNum = jsonParser.getValueAsInt();
                    return true;
                case "giftUrl":
                    bLiveBossGift.giftUrl = jsonParser.getValueAsString();
                    return true;
                case "giftName":
                    bLiveBossGift.giftName = jsonParser.getValueAsString();
                    return true;
                case "userAvatar":
                    bLiveBossGift.userAvatar = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBossGift bLiveBossGift, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("popularityValue", bLiveBossGift.popularityValue);
            String str = bLiveBossGift.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveBossGift.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveBossGift.userAvatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("userAvatar", str3);
            }
            String str4 = bLiveBossGift.otherUserId;
            if (str4 != null) {
                jsonGenerator.writeStringField("otherUserId", str4);
            }
            String str5 = bLiveBossGift.otherUserName;
            if (str5 != null) {
                jsonGenerator.writeStringField("otherUserName", str5);
            }
            String str6 = bLiveBossGift.giftName;
            if (str6 != null) {
                jsonGenerator.writeStringField("giftName", str6);
            }
            jsonGenerator.writeNumberField("giftNum", bLiveBossGift.giftNum);
            String str7 = bLiveBossGift.giftUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("giftUrl", str7);
            }
            jsonGenerator.writeNumberField("createdTime", bLiveBossGift.createdTime);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBossGift) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveBossGift$a */
    public class C11676a extends MessageNanoAdapter<BLiveBossGift> {
        public C11676a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveBossGift bLiveBossGift) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, bLiveBossGift.popularityValue);
            String str = bLiveBossGift.userId;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = bLiveBossGift.userName;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = bLiveBossGift.userAvatar;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = bLiveBossGift.otherUserId;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            String str5 = bLiveBossGift.otherUserName;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            String str6 = bLiveBossGift.giftName;
            if (str6 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(7, str6);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(8, bLiveBossGift.giftNum);
            String str7 = bLiveBossGift.giftUrl;
            if (str7 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(9, str7);
            }
            int iM17283j = iM17281h2 + CodedOutputByteBufferNano.m17283j(10, bLiveBossGift.createdTime);
            bLiveBossGift.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveBossGift parse(nc5 nc5Var) throws IOException {
            BLiveBossGift bLiveBossGift = new BLiveBossGift();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (bLiveBossGift.userId == null) {
                            bLiveBossGift.userId = "";
                        }
                        if (bLiveBossGift.userName == null) {
                            bLiveBossGift.userName = "";
                        }
                        if (bLiveBossGift.userAvatar == null) {
                            bLiveBossGift.userAvatar = "";
                        }
                        if (bLiveBossGift.otherUserId == null) {
                            bLiveBossGift.otherUserId = "";
                        }
                        if (bLiveBossGift.otherUserName == null) {
                            bLiveBossGift.otherUserName = "";
                        }
                        if (bLiveBossGift.giftName == null) {
                            bLiveBossGift.giftName = "";
                        }
                        if (bLiveBossGift.giftUrl == null) {
                            bLiveBossGift.giftUrl = "";
                        }
                        break;
                    case 8:
                        bLiveBossGift.popularityValue = nc5Var.m162486j();
                        continue;
                    case 18:
                        bLiveBossGift.userId = nc5Var.m162495s();
                        continue;
                    case 26:
                        bLiveBossGift.userName = nc5Var.m162495s();
                        continue;
                    case 34:
                        bLiveBossGift.userAvatar = nc5Var.m162495s();
                        continue;
                    case 42:
                        bLiveBossGift.otherUserId = nc5Var.m162495s();
                        continue;
                    case 50:
                        bLiveBossGift.otherUserName = nc5Var.m162495s();
                        continue;
                    case 58:
                        bLiveBossGift.giftName = nc5Var.m162495s();
                        continue;
                    case 64:
                        bLiveBossGift.giftNum = nc5Var.m162486j();
                        continue;
                    case 74:
                        bLiveBossGift.giftUrl = nc5Var.m162495s();
                        continue;
                    case 80:
                        bLiveBossGift.createdTime = nc5Var.m162487k();
                        continue;
                    default:
                        if (bLiveBossGift.userId == null) {
                            bLiveBossGift.userId = "";
                        }
                        if (bLiveBossGift.userName == null) {
                            bLiveBossGift.userName = "";
                        }
                        if (bLiveBossGift.userAvatar == null) {
                            bLiveBossGift.userAvatar = "";
                        }
                        if (bLiveBossGift.otherUserId == null) {
                            bLiveBossGift.otherUserId = "";
                        }
                        if (bLiveBossGift.otherUserName == null) {
                            bLiveBossGift.otherUserName = "";
                        }
                        if (bLiveBossGift.giftName == null) {
                            bLiveBossGift.giftName = "";
                        }
                        if (bLiveBossGift.giftUrl == null) {
                            bLiveBossGift.giftUrl = "";
                            return bLiveBossGift;
                        }
                        break;
                }
            }
            return bLiveBossGift;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveBossGift bLiveBossGift, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, bLiveBossGift.popularityValue);
            String str = bLiveBossGift.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = bLiveBossGift.userName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = bLiveBossGift.userAvatar;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = bLiveBossGift.otherUserId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            String str5 = bLiveBossGift.otherUserName;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
            String str6 = bLiveBossGift.giftName;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(7, str6);
            }
            codedOutputByteBufferNano.m17305G(8, bLiveBossGift.giftNum);
            String str7 = bLiveBossGift.giftUrl;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(9, str7);
            }
            codedOutputByteBufferNano.m17307I(10, bLiveBossGift.createdTime);
        }
    }

    public static BLiveBossGift new_() {
        BLiveBossGift bLiveBossGift = new BLiveBossGift();
        bLiveBossGift.nullCheck();
        return bLiveBossGift;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBossGift mo225055clone() {
        BLiveBossGift bLiveBossGift = new BLiveBossGift();
        bLiveBossGift.popularityValue = this.popularityValue;
        bLiveBossGift.userId = this.userId;
        bLiveBossGift.userName = this.userName;
        bLiveBossGift.userAvatar = this.userAvatar;
        bLiveBossGift.otherUserId = this.otherUserId;
        bLiveBossGift.otherUserName = this.otherUserName;
        bLiveBossGift.giftName = this.giftName;
        bLiveBossGift.giftNum = this.giftNum;
        bLiveBossGift.giftUrl = this.giftUrl;
        bLiveBossGift.createdTime = this.createdTime;
        return bLiveBossGift;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBossGift)) {
            return false;
        }
        BLiveBossGift bLiveBossGift = (BLiveBossGift) obj;
        return this.popularityValue == bLiveBossGift.popularityValue && ValueObject.util_equals(this.userId, bLiveBossGift.userId) && ValueObject.util_equals(this.userName, bLiveBossGift.userName) && ValueObject.util_equals(this.userAvatar, bLiveBossGift.userAvatar) && ValueObject.util_equals(this.otherUserId, bLiveBossGift.otherUserId) && ValueObject.util_equals(this.otherUserName, bLiveBossGift.otherUserName) && ValueObject.util_equals(this.giftName, bLiveBossGift.giftName) && this.giftNum == bLiveBossGift.giftNum && ValueObject.util_equals(this.giftUrl, bLiveBossGift.giftUrl) && this.createdTime == bLiveBossGift.createdTime;
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
        int i2 = ((i * 41) + this.popularityValue) * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userAvatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.otherUserId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.otherUserName;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.giftName;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.giftNum) * 41;
        String str7 = this.giftUrl;
        int iHashCode7 = str7 != null ? str7.hashCode() : 0;
        long j = this.createdTime;
        int i3 = ((iHashCode6 + iHashCode7) * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
        if (this.otherUserName == null) {
            this.otherUserName = "";
        }
        if (this.giftName == null) {
            this.giftName = "";
        }
        if (this.giftUrl == null) {
            this.giftUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
