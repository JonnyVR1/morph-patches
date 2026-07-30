package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Grade;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes13.dex */
public class BFansRecallUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bfansrecalluser";

    @NonNull
    @ProtobufIndex(index = 2)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 4)
    public String desc;

    @ProtobufIndex(index = 7)
    public int fanbaseGrade;

    @ProtobufIndex(index = 6)
    public boolean followed;

    @ProtobufIndex(index = 5)
    public boolean following;

    @ProtobufIndex(index = 8)
    public int grade;
    private String gradleUrl;

    @ProtobufIndex(index = 9)
    public boolean isOnline;

    @ProtobufIndex(index = 10)
    public boolean isRecalled;
    private boolean isSelected;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<BFansRecallUser> PROTOBUF_ADAPTER = new C11449a();
    public static JsonAdapter<BFansRecallUser> JSON_ADAPTER = new ObjectJsonAdapter<BFansRecallUser>() { // from class: com.p1.mobile.putong.live.base.data.BFansRecallUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BFansRecallUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BFansRecallUser newInstance() {
            return new BFansRecallUser();
        }

        public boolean parseField(BFansRecallUser bFansRecallUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isRecalled":
                    bFansRecallUser.isRecalled = jsonParser.getValueAsBoolean();
                    return true;
                case "avatar":
                    bFansRecallUser.avatar = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bFansRecallUser.userId = jsonParser.getValueAsString();
                    return true;
                case "isOnline":
                    bFansRecallUser.isOnline = jsonParser.getValueAsBoolean();
                    return true;
                case "desc":
                    bFansRecallUser.desc = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bFansRecallUser.name = jsonParser.getValueAsString();
                    return true;
                case "fanbaseGrade":
                    bFansRecallUser.fanbaseGrade = jsonParser.getValueAsInt();
                    return true;
                case "grade":
                    bFansRecallUser.grade = jsonParser.getValueAsInt();
                    return true;
                case "followed":
                    bFansRecallUser.followed = jsonParser.getValueAsBoolean();
                    return true;
                case "following":
                    bFansRecallUser.following = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BFansRecallUser bFansRecallUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isRecalled":
                case "avatar":
                case "userId":
                case "isOnline":
                case "desc":
                case "name":
                case "fanbaseGrade":
                case "grade":
                case "followed":
                case "following":
                    return true;
                default:
                    return super.parseFieldCheck(bFansRecallUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BFansRecallUser bFansRecallUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bFansRecallUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bFansRecallUser.avatar;
            if (str2 != null) {
                jsonGenerator.writeStringField("avatar", str2);
            }
            String str3 = bFansRecallUser.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            String str4 = bFansRecallUser.desc;
            if (str4 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str4);
            }
            jsonGenerator.writeBooleanField(FollowshipStatus.following, bFansRecallUser.following);
            jsonGenerator.writeBooleanField(FollowshipStatus.followed, bFansRecallUser.followed);
            jsonGenerator.writeNumberField("fanbaseGrade", bFansRecallUser.fanbaseGrade);
            jsonGenerator.writeNumberField(Grade.TYPE, bFansRecallUser.grade);
            jsonGenerator.writeBooleanField("isOnline", bFansRecallUser.isOnline);
            jsonGenerator.writeBooleanField("isRecalled", bFansRecallUser.isRecalled);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BFansRecallUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BFansRecallUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BFansRecallUser$a */
    public class C11449a extends MessageNanoAdapter<BFansRecallUser> {
        public C11449a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BFansRecallUser bFansRecallUser) {
            String str = bFansRecallUser.userId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = bFansRecallUser.avatar;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = bFansRecallUser.name;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = bFansRecallUser.desc;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(5, bFansRecallUser.following) + CodedOutputByteBufferNano.m17220b(6, bFansRecallUser.followed) + CodedOutputByteBufferNano.m17226h(7, bFansRecallUser.fanbaseGrade) + CodedOutputByteBufferNano.m17226h(8, bFansRecallUser.grade) + CodedOutputByteBufferNano.m17220b(9, bFansRecallUser.isOnline) + CodedOutputByteBufferNano.m17220b(10, bFansRecallUser.isRecalled);
            bFansRecallUser.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BFansRecallUser parse(nb5 nb5Var) throws IOException {
            BFansRecallUser bFansRecallUser = new BFansRecallUser();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (bFansRecallUser.userId == null) {
                            bFansRecallUser.userId = "";
                        }
                        if (bFansRecallUser.avatar == null) {
                            bFansRecallUser.avatar = "";
                        }
                        if (bFansRecallUser.name == null) {
                            bFansRecallUser.name = "";
                        }
                        if (bFansRecallUser.desc == null) {
                            bFansRecallUser.desc = "";
                        }
                        break;
                    case 10:
                        bFansRecallUser.userId = nb5Var.m158750s();
                        continue;
                    case 18:
                        bFansRecallUser.avatar = nb5Var.m158750s();
                        continue;
                    case 26:
                        bFansRecallUser.name = nb5Var.m158750s();
                        continue;
                    case 34:
                        bFansRecallUser.desc = nb5Var.m158750s();
                        continue;
                    case 40:
                        bFansRecallUser.following = nb5Var.m158738g();
                        continue;
                    case 48:
                        bFansRecallUser.followed = nb5Var.m158738g();
                        continue;
                    case 56:
                        bFansRecallUser.fanbaseGrade = nb5Var.m158741j();
                        continue;
                    case 64:
                        bFansRecallUser.grade = nb5Var.m158741j();
                        continue;
                    case 72:
                        bFansRecallUser.isOnline = nb5Var.m158738g();
                        continue;
                    case 80:
                        bFansRecallUser.isRecalled = nb5Var.m158738g();
                        continue;
                    default:
                        if (bFansRecallUser.userId == null) {
                            bFansRecallUser.userId = "";
                        }
                        if (bFansRecallUser.avatar == null) {
                            bFansRecallUser.avatar = "";
                        }
                        if (bFansRecallUser.name == null) {
                            bFansRecallUser.name = "";
                        }
                        if (bFansRecallUser.desc == null) {
                            bFansRecallUser.desc = "";
                            return bFansRecallUser;
                        }
                        break;
                }
            }
            return bFansRecallUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BFansRecallUser bFansRecallUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bFansRecallUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = bFansRecallUser.avatar;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = bFansRecallUser.name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = bFansRecallUser.desc;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            codedOutputByteBufferNano.m17244A(5, bFansRecallUser.following);
            codedOutputByteBufferNano.m17244A(6, bFansRecallUser.followed);
            codedOutputByteBufferNano.m17250G(7, bFansRecallUser.fanbaseGrade);
            codedOutputByteBufferNano.m17250G(8, bFansRecallUser.grade);
            codedOutputByteBufferNano.m17244A(9, bFansRecallUser.isOnline);
            codedOutputByteBufferNano.m17244A(10, bFansRecallUser.isRecalled);
        }
    }

    public static BFansRecallUser new_() {
        BFansRecallUser bFansRecallUser = new BFansRecallUser();
        bFansRecallUser.nullCheck();
        return bFansRecallUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BFansRecallUser mo223809clone() {
        BFansRecallUser bFansRecallUser = new BFansRecallUser();
        bFansRecallUser.userId = this.userId;
        bFansRecallUser.avatar = this.avatar;
        bFansRecallUser.name = this.name;
        bFansRecallUser.desc = this.desc;
        bFansRecallUser.following = this.following;
        bFansRecallUser.followed = this.followed;
        bFansRecallUser.fanbaseGrade = this.fanbaseGrade;
        bFansRecallUser.grade = this.grade;
        bFansRecallUser.isOnline = this.isOnline;
        bFansRecallUser.isRecalled = this.isRecalled;
        return bFansRecallUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BFansRecallUser)) {
            return false;
        }
        BFansRecallUser bFansRecallUser = (BFansRecallUser) obj;
        return ValueObject.util_equals(this.userId, bFansRecallUser.userId) && ValueObject.util_equals(this.avatar, bFansRecallUser.avatar) && ValueObject.util_equals(this.name, bFansRecallUser.name) && ValueObject.util_equals(this.desc, bFansRecallUser.desc) && this.following == bFansRecallUser.following && this.followed == bFansRecallUser.followed && this.fanbaseGrade == bFansRecallUser.fanbaseGrade && this.grade == bFansRecallUser.grade && this.isOnline == bFansRecallUser.isOnline && this.isRecalled == bFansRecallUser.isRecalled;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getGradleUrl() {
        return this.gradleUrl;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.desc;
        int iHashCode4 = ((((((((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.following ? 1231 : 1237)) * 41) + (this.followed ? 1231 : 1237)) * 41) + this.fanbaseGrade) * 41) + this.grade) * 41) + (this.isOnline ? 1231 : 1237)) * 41) + (this.isRecalled ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
    }

    public void setGradleUrl(String str) {
        this.gradleUrl = str;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
