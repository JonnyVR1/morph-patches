package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.FriendComment;
import com.p046p1.mobile.putong.data.InterestUserSimple;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class FriendCommentInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "friendcommentinfo";

    @ProtobufIndex(index = 3)
    public boolean alreadyInterested;

    @ProtobufIndex(index = 6)
    public int commentsCount;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<FriendComment> friendsComments;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<FriendComment> friendsCommentsHistory;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<InterestUserSimple> interestedUsers;

    @ProtobufIndex(index = 2)
    public int interestsCount;

    @NonNull
    @ProtobufIndex(index = 8)
    public UnreadCounter unreadCounter;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<FriendCommentInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FriendCommentInfo>() { // from class: com.p1.mobile.putong.data.FriendCommentInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FriendCommentInfo friendCommentInfo) {
            String str = friendCommentInfo.userId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, friendCommentInfo.interestsCount) + CodedOutputByteBufferNano.m17220b(3, friendCommentInfo.alreadyInterested);
            List<FriendComment> list = friendCommentInfo.friendsComments;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, list, FriendComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<InterestUserSimple> list2 = friendCommentInfo.interestedUsers;
            if (list2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, list2, InterestUserSimple.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(6, friendCommentInfo.commentsCount);
            List<FriendComment> list3 = friendCommentInfo.friendsCommentsHistory;
            if (list3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(7, list3, FriendComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            UnreadCounter unreadCounter = friendCommentInfo.unreadCounter;
            if (unreadCounter != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(8, unreadCounter, UnreadCounter.PROTOBUF_ADAPTER);
            }
            friendCommentInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FriendCommentInfo parse(nb5 nb5Var) throws IOException {
            FriendCommentInfo friendCommentInfo = new FriendCommentInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (friendCommentInfo.userId == null) {
                        friendCommentInfo.userId = "";
                    }
                    if (friendCommentInfo.friendsComments == null) {
                        friendCommentInfo.friendsComments = new ArrayList();
                    }
                    if (friendCommentInfo.interestedUsers == null) {
                        friendCommentInfo.interestedUsers = new ArrayList();
                    }
                    if (friendCommentInfo.friendsCommentsHistory == null) {
                        friendCommentInfo.friendsCommentsHistory = new ArrayList();
                    }
                    if (friendCommentInfo.unreadCounter != null) {
                        break;
                    }
                    friendCommentInfo.unreadCounter = UnreadCounter.new_();
                    break;
                }
                if (iM158752u == 10) {
                    friendCommentInfo.userId = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    friendCommentInfo.interestsCount = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    friendCommentInfo.alreadyInterested = nb5Var.m158738g();
                } else if (iM158752u == 34) {
                    friendCommentInfo.friendsComments = (List) nb5Var.m158743l(FriendComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 42) {
                    friendCommentInfo.interestedUsers = (List) nb5Var.m158743l(InterestUserSimple.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 48) {
                    friendCommentInfo.commentsCount = nb5Var.m158741j();
                } else if (iM158752u == 58) {
                    friendCommentInfo.friendsCommentsHistory = (List) nb5Var.m158743l(FriendComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 66) {
                        if (friendCommentInfo.userId == null) {
                            friendCommentInfo.userId = "";
                        }
                        if (friendCommentInfo.friendsComments == null) {
                            friendCommentInfo.friendsComments = new ArrayList();
                        }
                        if (friendCommentInfo.interestedUsers == null) {
                            friendCommentInfo.interestedUsers = new ArrayList();
                        }
                        if (friendCommentInfo.friendsCommentsHistory == null) {
                            friendCommentInfo.friendsCommentsHistory = new ArrayList();
                        }
                        if (friendCommentInfo.unreadCounter != null) {
                            break;
                        }
                        friendCommentInfo.unreadCounter = UnreadCounter.new_();
                        return friendCommentInfo;
                    }
                    friendCommentInfo.unreadCounter = (UnreadCounter) nb5Var.m158743l(UnreadCounter.PROTOBUF_ADAPTER);
                }
            }
            return friendCommentInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FriendCommentInfo friendCommentInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = friendCommentInfo.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, friendCommentInfo.interestsCount);
            codedOutputByteBufferNano.m17244A(3, friendCommentInfo.alreadyInterested);
            List<FriendComment> list = friendCommentInfo.friendsComments;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, FriendComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<InterestUserSimple> list2 = friendCommentInfo.interestedUsers;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(5, list2, InterestUserSimple.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(6, friendCommentInfo.commentsCount);
            List<FriendComment> list3 = friendCommentInfo.friendsCommentsHistory;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(7, list3, FriendComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            UnreadCounter unreadCounter = friendCommentInfo.unreadCounter;
            if (unreadCounter != null) {
                codedOutputByteBufferNano.m17254K(8, unreadCounter, UnreadCounter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FriendCommentInfo> JSON_ADAPTER = new ObjectJsonAdapter<FriendCommentInfo>() { // from class: com.p1.mobile.putong.data.FriendCommentInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FriendCommentInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FriendCommentInfo newInstance() {
            return new FriendCommentInfo();
        }

        public boolean parseField(FriendCommentInfo friendCommentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "alreadyInterested":
                    friendCommentInfo.alreadyInterested = jsonParser.getValueAsBoolean();
                    return true;
                case "userId":
                    friendCommentInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "commentsCount":
                    friendCommentInfo.commentsCount = jsonParser.getValueAsInt();
                    return true;
                case "interestedUsers":
                    friendCommentInfo.interestedUsers = JsonAdapter.parseArray(jsonParser, InterestUserSimple.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "interestsCount":
                    friendCommentInfo.interestsCount = jsonParser.getValueAsInt();
                    return true;
                case "friendsCommentsHistory":
                    friendCommentInfo.friendsCommentsHistory = JsonAdapter.parseArray(jsonParser, FriendComment.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "friendsComments":
                    friendCommentInfo.friendsComments = JsonAdapter.parseArray(jsonParser, FriendComment.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "unreadCounter":
                    friendCommentInfo.unreadCounter = UnreadCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FriendCommentInfo friendCommentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "alreadyInterested":
                case "userId":
                case "commentsCount":
                case "interestedUsers":
                case "interestsCount":
                case "friendsCommentsHistory":
                case "friendsComments":
                case "unreadCounter":
                    return true;
                default:
                    return super.parseFieldCheck(friendCommentInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FriendCommentInfo friendCommentInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = friendCommentInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("interestsCount", friendCommentInfo.interestsCount);
            jsonGenerator.writeBooleanField("alreadyInterested", friendCommentInfo.alreadyInterested);
            if (friendCommentInfo.friendsComments != null) {
                jsonGenerator.writeFieldName("friendsComments");
                JsonAdapter.serializeArray(friendCommentInfo.friendsComments, jsonGenerator, FriendComment.JSON_ADAPTER);
            }
            if (friendCommentInfo.interestedUsers != null) {
                jsonGenerator.writeFieldName("interestedUsers");
                JsonAdapter.serializeArray(friendCommentInfo.interestedUsers, jsonGenerator, InterestUserSimple.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("commentsCount", friendCommentInfo.commentsCount);
            if (friendCommentInfo.friendsCommentsHistory != null) {
                jsonGenerator.writeFieldName("friendsCommentsHistory");
                JsonAdapter.serializeArray(friendCommentInfo.friendsCommentsHistory, jsonGenerator, FriendComment.JSON_ADAPTER);
            }
            if (friendCommentInfo.unreadCounter != null) {
                jsonGenerator.writeFieldName("unreadCounter");
                UnreadCounter.JSON_ADAPTER.serialize(friendCommentInfo.unreadCounter, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FriendCommentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FriendCommentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FriendCommentInfo new_() {
        FriendCommentInfo friendCommentInfo = new FriendCommentInfo();
        friendCommentInfo.nullCheck();
        return friendCommentInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FriendCommentInfo mo223809clone() {
        FriendCommentInfo friendCommentInfo = new FriendCommentInfo();
        friendCommentInfo.userId = this.userId;
        friendCommentInfo.interestsCount = this.interestsCount;
        friendCommentInfo.alreadyInterested = this.alreadyInterested;
        List<FriendComment> list = this.friendsComments;
        if (list != null) {
            friendCommentInfo.friendsComments = ValueObject.util_map(list, new w9j() { // from class: l.q6j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FriendComment) obj).mo223809clone();
                }
            });
        }
        List<InterestUserSimple> list2 = this.interestedUsers;
        if (list2 != null) {
            friendCommentInfo.interestedUsers = ValueObject.util_map(list2, new w9j() { // from class: l.r6j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((InterestUserSimple) obj).mo223809clone();
                }
            });
        }
        friendCommentInfo.commentsCount = this.commentsCount;
        List<FriendComment> list3 = this.friendsCommentsHistory;
        if (list3 != null) {
            friendCommentInfo.friendsCommentsHistory = ValueObject.util_map(list3, new w9j() { // from class: l.s6j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FriendComment) obj).mo223809clone();
                }
            });
        }
        UnreadCounter unreadCounter = this.unreadCounter;
        if (unreadCounter != null) {
            friendCommentInfo.unreadCounter = unreadCounter.mo223809clone();
        }
        return friendCommentInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FriendCommentInfo)) {
            return false;
        }
        FriendCommentInfo friendCommentInfo = (FriendCommentInfo) obj;
        return ValueObject.util_equals(this.userId, friendCommentInfo.userId) && this.interestsCount == friendCommentInfo.interestsCount && this.alreadyInterested == friendCommentInfo.alreadyInterested && ValueObject.util_equals(this.friendsComments, friendCommentInfo.friendsComments) && ValueObject.util_equals(this.interestedUsers, friendCommentInfo.interestedUsers) && this.commentsCount == friendCommentInfo.commentsCount && ValueObject.util_equals(this.friendsCommentsHistory, friendCommentInfo.friendsCommentsHistory) && ValueObject.util_equals(this.unreadCounter, friendCommentInfo.unreadCounter);
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
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.interestsCount) * 41) + (this.alreadyInterested ? 1231 : 1237)) * 41;
        List<FriendComment> list = this.friendsComments;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<InterestUserSimple> list2 = this.interestedUsers;
        int iHashCode3 = (((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41) + this.commentsCount) * 41;
        List<FriendComment> list3 = this.friendsCommentsHistory;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 41;
        UnreadCounter unreadCounter = this.unreadCounter;
        int iHashCode5 = iHashCode4 + (unreadCounter != null ? unreadCounter.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.friendsComments == null) {
            this.friendsComments = new ArrayList();
        }
        if (this.interestedUsers == null) {
            this.interestedUsers = new ArrayList();
        }
        if (this.friendsCommentsHistory == null) {
            this.friendsCommentsHistory = new ArrayList();
        }
        if (this.unreadCounter == null) {
            this.unreadCounter = UnreadCounter.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
