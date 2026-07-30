package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.CommentInfo;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class CommentInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "commentinfo";

    @ProtobufIndex(index = 6)
    public boolean isBottom;

    @ProtobufIndex(index = 2)
    public boolean liked;

    @ProtobufIndex(index = 1)
    public int likes;

    @NonNull
    @ProtobufIndex(index = 5)
    public String moreSubMessages;

    @NonNull
    @ProtobufIndex(index = 3)
    public String parentMessageId;

    @ProtobufIndex(index = 8)
    public boolean replyMessageAnonymous;

    @NonNull
    @ProtobufIndex(index = 7)
    public String replyMessageId;

    @NonNull
    @ProtobufIndex(index = 9)
    public CommentStatus status;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> subMessageIds;
    public static ProtobufAdapter<CommentInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CommentInfo>() { // from class: com.p1.mobile.putong.feed.data.CommentInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CommentInfo commentInfo) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, commentInfo.likes) + CodedOutputByteBufferNano.m17275b(2, commentInfo.liked);
            String str = commentInfo.parentMessageId;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str);
            }
            List<String> list = commentInfo.subMessageIds;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = commentInfo.moreSubMessages;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(6, commentInfo.isBottom);
            String str3 = commentInfo.replyMessageId;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(7, str3);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(8, commentInfo.replyMessageAnonymous);
            CommentStatus commentStatus = commentInfo.status;
            if (commentStatus != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(9, commentStatus, CommentStatus.PROTOBUF_ADAPTER);
            }
            commentInfo.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CommentInfo parse(nc5 nc5Var) throws IOException {
            CommentInfo commentInfo = new CommentInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (commentInfo.parentMessageId == null) {
                        commentInfo.parentMessageId = "";
                    }
                    if (commentInfo.subMessageIds == null) {
                        commentInfo.subMessageIds = new ArrayList();
                    }
                    if (commentInfo.moreSubMessages == null) {
                        commentInfo.moreSubMessages = "";
                    }
                    if (commentInfo.replyMessageId == null) {
                        commentInfo.replyMessageId = "";
                    }
                    if (commentInfo.status != null) {
                        break;
                    }
                    commentInfo.status = (CommentStatus) CommentStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 8) {
                    commentInfo.likes = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    commentInfo.liked = nc5Var.m162483g();
                } else if (iM162497u == 26) {
                    commentInfo.parentMessageId = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    commentInfo.subMessageIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 42) {
                    commentInfo.moreSubMessages = nc5Var.m162495s();
                } else if (iM162497u == 48) {
                    commentInfo.isBottom = nc5Var.m162483g();
                } else if (iM162497u == 58) {
                    commentInfo.replyMessageId = nc5Var.m162495s();
                } else if (iM162497u == 64) {
                    commentInfo.replyMessageAnonymous = nc5Var.m162483g();
                } else {
                    if (iM162497u != 74) {
                        if (commentInfo.parentMessageId == null) {
                            commentInfo.parentMessageId = "";
                        }
                        if (commentInfo.subMessageIds == null) {
                            commentInfo.subMessageIds = new ArrayList();
                        }
                        if (commentInfo.moreSubMessages == null) {
                            commentInfo.moreSubMessages = "";
                        }
                        if (commentInfo.replyMessageId == null) {
                            commentInfo.replyMessageId = "";
                        }
                        if (commentInfo.status != null) {
                            break;
                        }
                        commentInfo.status = (CommentStatus) CommentStatus.JSON_ADAPTER.defaultEnum();
                        return commentInfo;
                    }
                    commentInfo.status = (CommentStatus) nc5Var.m162488l(CommentStatus.PROTOBUF_ADAPTER);
                }
            }
            return commentInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CommentInfo commentInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, commentInfo.likes);
            codedOutputByteBufferNano.m17299A(2, commentInfo.liked);
            String str = commentInfo.parentMessageId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            List<String> list = commentInfo.subMessageIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = commentInfo.moreSubMessages;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
            codedOutputByteBufferNano.m17299A(6, commentInfo.isBottom);
            String str3 = commentInfo.replyMessageId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(7, str3);
            }
            codedOutputByteBufferNano.m17299A(8, commentInfo.replyMessageAnonymous);
            CommentStatus commentStatus = commentInfo.status;
            if (commentStatus != null) {
                codedOutputByteBufferNano.m17309K(9, commentStatus, CommentStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CommentInfo> JSON_ADAPTER = new ObjectJsonAdapter<CommentInfo>() { // from class: com.p1.mobile.putong.feed.data.CommentInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CommentInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CommentInfo newInstance() {
            return new CommentInfo();
        }

        public boolean parseField(CommentInfo commentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subMessageIds":
                    commentInfo.subMessageIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    commentInfo.status = CommentStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "isBottom":
                    commentInfo.isBottom = jsonParser.getValueAsBoolean();
                    return true;
                case "parentMessageId":
                    commentInfo.parentMessageId = jsonParser.getValueAsString();
                    return true;
                case "liked":
                    commentInfo.liked = jsonParser.getValueAsBoolean();
                    return true;
                case "likes":
                    commentInfo.likes = jsonParser.getValueAsInt();
                    return true;
                case "moreSubMessages":
                    commentInfo.moreSubMessages = jsonParser.getValueAsString();
                    return true;
                case "replyMessageAnonymous":
                    commentInfo.replyMessageAnonymous = jsonParser.getValueAsBoolean();
                    return true;
                case "replyMessageId":
                    commentInfo.replyMessageId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CommentInfo commentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subMessageIds":
                case "status":
                case "isBottom":
                case "parentMessageId":
                case "liked":
                case "likes":
                case "moreSubMessages":
                case "replyMessageAnonymous":
                case "replyMessageId":
                    return true;
                default:
                    return super.parseFieldCheck(commentInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CommentInfo commentInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("likes", commentInfo.likes);
            jsonGenerator.writeBooleanField("liked", commentInfo.liked);
            String str = commentInfo.parentMessageId;
            if (str != null) {
                jsonGenerator.writeStringField("parentMessageId", str);
            }
            if (commentInfo.subMessageIds != null) {
                jsonGenerator.writeFieldName("subMessageIds");
                JsonAdapter.serializeArray(commentInfo.subMessageIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = commentInfo.moreSubMessages;
            if (str2 != null) {
                jsonGenerator.writeStringField("moreSubMessages", str2);
            }
            jsonGenerator.writeBooleanField("isBottom", commentInfo.isBottom);
            String str3 = commentInfo.replyMessageId;
            if (str3 != null) {
                jsonGenerator.writeStringField("replyMessageId", str3);
            }
            jsonGenerator.writeBooleanField("replyMessageAnonymous", commentInfo.replyMessageAnonymous);
            if (commentInfo.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                CommentStatus.JSON_ADAPTER.serialize(commentInfo.status, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61968a(String str) {
        return str;
    }

    public static CommentInfo new_() {
        CommentInfo commentInfo = new CommentInfo();
        commentInfo.nullCheck();
        return commentInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CommentInfo mo225055clone() {
        CommentInfo commentInfo = new CommentInfo();
        commentInfo.likes = this.likes;
        commentInfo.liked = this.liked;
        commentInfo.parentMessageId = this.parentMessageId;
        List<String> list = this.subMessageIds;
        if (list != null) {
            commentInfo.subMessageIds = ValueObject.util_map(list, new qcj() { // from class: l.ei5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CommentInfo.m61968a((String) obj);
                }
            });
        }
        commentInfo.moreSubMessages = this.moreSubMessages;
        commentInfo.isBottom = this.isBottom;
        commentInfo.replyMessageId = this.replyMessageId;
        commentInfo.replyMessageAnonymous = this.replyMessageAnonymous;
        commentInfo.status = this.status;
        return commentInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommentInfo)) {
            return false;
        }
        CommentInfo commentInfo = (CommentInfo) obj;
        return this.likes == commentInfo.likes && this.liked == commentInfo.liked && ValueObject.util_equals(this.parentMessageId, commentInfo.parentMessageId) && ValueObject.util_equals(this.subMessageIds, commentInfo.subMessageIds) && ValueObject.util_equals(this.moreSubMessages, commentInfo.moreSubMessages) && this.isBottom == commentInfo.isBottom && ValueObject.util_equals(this.replyMessageId, commentInfo.replyMessageId) && this.replyMessageAnonymous == commentInfo.replyMessageAnonymous && ValueObject.util_equals(this.status, commentInfo.status);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "commentinfo";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.likes) * 41) + (this.liked ? 1231 : 1237)) * 41;
        String str = this.parentMessageId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.subMessageIds;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.moreSubMessages;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isBottom ? 1231 : 1237)) * 41;
        String str3 = this.replyMessageId;
        int iHashCode4 = (((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.replyMessageAnonymous ? 1231 : 1237)) * 41;
        CommentStatus commentStatus = this.status;
        int iHashCode5 = iHashCode4 + (commentStatus != null ? commentStatus.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.parentMessageId == null) {
            this.parentMessageId = "";
        }
        if (this.subMessageIds == null) {
            this.subMessageIds = new ArrayList();
        }
        if (this.moreSubMessages == null) {
            this.moreSubMessages = "";
        }
        if (this.replyMessageId == null) {
            this.replyMessageId = "";
        }
        if (this.status == null) {
            this.status = (CommentStatus) CommentStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
