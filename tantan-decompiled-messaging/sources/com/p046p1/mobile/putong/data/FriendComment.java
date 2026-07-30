package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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

/* JADX INFO: loaded from: classes12.dex */
public class FriendComment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "friendcomment";

    @NonNull
    @ProtobufIndex(index = 1)
    public String commentId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String commentRole;

    @NonNull
    @ProtobufIndex(index = 3)
    public String content;

    @ProtobufIndex(index = 7)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String headImgUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public String nickname;

    @NonNull
    @ProtobufIndex(index = 6)
    public String status;
    public static ProtobufAdapter<FriendComment> PROTOBUF_ADAPTER = new MessageNanoAdapter<FriendComment>() { // from class: com.p1.mobile.putong.data.FriendComment.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FriendComment friendComment) {
            String str = friendComment.commentId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = friendComment.headImgUrl;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = friendComment.content;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = friendComment.commentRole;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = friendComment.nickname;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = friendComment.status;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(7, friendComment.createdTime);
            friendComment.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FriendComment parse(nb5 nb5Var) throws IOException {
            FriendComment friendComment = new FriendComment();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (friendComment.commentId == null) {
                        friendComment.commentId = "";
                    }
                    if (friendComment.headImgUrl == null) {
                        friendComment.headImgUrl = "";
                    }
                    if (friendComment.content == null) {
                        friendComment.content = "";
                    }
                    if (friendComment.commentRole == null) {
                        friendComment.commentRole = "";
                    }
                    if (friendComment.nickname == null) {
                        friendComment.nickname = "";
                    }
                    if (friendComment.status != null) {
                        break;
                    }
                    friendComment.status = "";
                    break;
                }
                if (iM158752u == 10) {
                    friendComment.commentId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    friendComment.headImgUrl = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    friendComment.content = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    friendComment.commentRole = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    friendComment.nickname = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    friendComment.status = nb5Var.m158750s();
                } else {
                    if (iM158752u != 57) {
                        if (friendComment.commentId == null) {
                            friendComment.commentId = "";
                        }
                        if (friendComment.headImgUrl == null) {
                            friendComment.headImgUrl = "";
                        }
                        if (friendComment.content == null) {
                            friendComment.content = "";
                        }
                        if (friendComment.commentRole == null) {
                            friendComment.commentRole = "";
                        }
                        if (friendComment.nickname == null) {
                            friendComment.nickname = "";
                        }
                        if (friendComment.status != null) {
                            break;
                        }
                        friendComment.status = "";
                        return friendComment;
                    }
                    friendComment.createdTime = nb5Var.m158739h();
                }
            }
            return friendComment;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FriendComment friendComment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = friendComment.commentId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = friendComment.headImgUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = friendComment.content;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = friendComment.commentRole;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = friendComment.nickname;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = friendComment.status;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            codedOutputByteBufferNano.m17246C(7, friendComment.createdTime);
        }
    };
    public static JsonAdapter<FriendComment> JSON_ADAPTER = new ObjectJsonAdapter<FriendComment>() { // from class: com.p1.mobile.putong.data.FriendComment.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FriendComment.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FriendComment newInstance() {
            return new FriendComment();
        }

        public boolean parseField(FriendComment friendComment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "commentId":
                    friendComment.commentId = jsonParser.getValueAsString();
                    return true;
                case "status":
                    friendComment.status = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    friendComment.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "nickname":
                    friendComment.nickname = jsonParser.getValueAsString();
                    return true;
                case "content":
                    friendComment.content = jsonParser.getValueAsString();
                    return true;
                case "headImgUrl":
                    friendComment.headImgUrl = jsonParser.getValueAsString();
                    return true;
                case "commentRole":
                    friendComment.commentRole = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FriendComment friendComment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "commentId":
                case "status":
                case "createdTime":
                case "nickname":
                case "content":
                case "headImgUrl":
                case "commentRole":
                    return true;
                default:
                    return super.parseFieldCheck(friendComment, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FriendComment friendComment, JsonGenerator jsonGenerator) throws IOException {
            String str = friendComment.commentId;
            if (str != null) {
                jsonGenerator.writeStringField("commentId", str);
            }
            String str2 = friendComment.headImgUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("headImgUrl", str2);
            }
            String str3 = friendComment.content;
            if (str3 != null) {
                jsonGenerator.writeStringField("content", str3);
            }
            String str4 = friendComment.commentRole;
            if (str4 != null) {
                jsonGenerator.writeStringField("commentRole", str4);
            }
            String str5 = friendComment.nickname;
            if (str5 != null) {
                jsonGenerator.writeStringField("nickname", str5);
            }
            String str6 = friendComment.status;
            if (str6 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str6);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(friendComment.createdTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FriendComment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FriendComment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FriendComment new_() {
        FriendComment friendComment = new FriendComment();
        friendComment.nullCheck();
        return friendComment;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FriendComment mo223809clone() {
        FriendComment friendComment = new FriendComment();
        friendComment.commentId = this.commentId;
        friendComment.headImgUrl = this.headImgUrl;
        friendComment.content = this.content;
        friendComment.commentRole = this.commentRole;
        friendComment.nickname = this.nickname;
        friendComment.status = this.status;
        friendComment.createdTime = this.createdTime;
        return friendComment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FriendComment)) {
            return false;
        }
        FriendComment friendComment = (FriendComment) obj;
        return ValueObject.util_equals(this.commentId, friendComment.commentId) && ValueObject.util_equals(this.headImgUrl, friendComment.headImgUrl) && ValueObject.util_equals(this.content, friendComment.content) && ValueObject.util_equals(this.commentRole, friendComment.commentRole) && ValueObject.util_equals(this.nickname, friendComment.nickname) && ValueObject.util_equals(this.status, friendComment.status) && this.createdTime == friendComment.createdTime;
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
        String str = this.commentId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.headImgUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.commentRole;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.nickname;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.status;
        int iHashCode6 = str6 != null ? str6.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode5 + iHashCode6) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.commentId == null) {
            this.commentId = "";
        }
        if (this.headImgUrl == null) {
            this.headImgUrl = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.commentRole == null) {
            this.commentRole = "";
        }
        if (this.nickname == null) {
            this.nickname = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
