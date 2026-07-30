package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CommentInfo;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CommentInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "commentinfo";

    @ProtobufIndex(index = 6)
    public boolean isBottom;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean liked;

    @ProtobufIndex(index = 1)
    public int likes;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String moreSubMessages;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String parentMessageId;

    @ProtobufIndex(index = 8)
    public boolean replyMessageAnonymous;

    @NonNull
    @ProtobufIndex(index = 7)
    public String replyMessageId;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> subMessageIds;
    public static ProtobufAdapter<CommentInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CommentInfo>() { // from class: com.p1.mobile.putong.core.data.CommentInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CommentInfo commentInfo) {
            int iH = CodedOutputByteBufferNano.h(1, commentInfo.likes) + CodedOutputByteBufferNano.b(2, commentInfo.liked);
            String str = commentInfo.parentMessageId;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            List<String> list = commentInfo.subMessageIds;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = commentInfo.moreSubMessages;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(5, str2);
            }
            int iB = iH + CodedOutputByteBufferNano.b(6, commentInfo.isBottom);
            String str3 = commentInfo.replyMessageId;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(7, str3);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(8, commentInfo.replyMessageAnonymous);
            ((MessageNano) commentInfo).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CommentInfo m12217parse(nb5 nb5Var) throws IOException {
            CommentInfo commentInfo = new CommentInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (commentInfo.parentMessageId == null) {
                        commentInfo.parentMessageId = "";
                    }
                    if (commentInfo.subMessageIds == null) {
                        commentInfo.subMessageIds = new ArrayList();
                    }
                    if (commentInfo.moreSubMessages == null) {
                        commentInfo.moreSubMessages = "";
                    }
                    if (commentInfo.replyMessageId != null) {
                        break;
                    }
                    commentInfo.replyMessageId = "";
                    break;
                }
                if (iU == 8) {
                    commentInfo.likes = nb5Var.j();
                } else if (iU == 16) {
                    commentInfo.liked = nb5Var.g();
                } else if (iU == 26) {
                    commentInfo.parentMessageId = nb5Var.s();
                } else if (iU == 34) {
                    commentInfo.subMessageIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 42) {
                    commentInfo.moreSubMessages = nb5Var.s();
                } else if (iU == 48) {
                    commentInfo.isBottom = nb5Var.g();
                } else if (iU == 58) {
                    commentInfo.replyMessageId = nb5Var.s();
                } else {
                    if (iU != 64) {
                        if (commentInfo.parentMessageId == null) {
                            commentInfo.parentMessageId = "";
                        }
                        if (commentInfo.subMessageIds == null) {
                            commentInfo.subMessageIds = new ArrayList();
                        }
                        if (commentInfo.moreSubMessages == null) {
                            commentInfo.moreSubMessages = "";
                        }
                        if (commentInfo.replyMessageId != null) {
                            break;
                        }
                        commentInfo.replyMessageId = "";
                        return commentInfo;
                    }
                    commentInfo.replyMessageAnonymous = nb5Var.g();
                }
            }
            return commentInfo;
        }

        public void serialize(CommentInfo commentInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, commentInfo.likes);
            codedOutputByteBufferNano.A(2, commentInfo.liked);
            String str = commentInfo.parentMessageId;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            List<String> list = commentInfo.subMessageIds;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = commentInfo.moreSubMessages;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            codedOutputByteBufferNano.A(6, commentInfo.isBottom);
            String str3 = commentInfo.replyMessageId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(7, str3);
            }
            codedOutputByteBufferNano.A(8, commentInfo.replyMessageAnonymous);
        }
    };
    public static JsonAdapter<CommentInfo> JSON_ADAPTER = new ObjectJsonAdapter<CommentInfo>() { // from class: com.p1.mobile.putong.core.data.CommentInfo.2
        public Class getDataClass() {
            return CommentInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CommentInfo m12218newInstance() {
            return new CommentInfo();
        }

        public boolean parseField(CommentInfo commentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subMessageIds":
                    commentInfo.subMessageIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
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
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m85a(String str) {
        return str;
    }

    public static CommentInfo new_() {
        CommentInfo commentInfo = new CommentInfo();
        commentInfo.nullCheck();
        return commentInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CommentInfo m12216clone() {
        CommentInfo commentInfo = new CommentInfo();
        commentInfo.likes = this.likes;
        commentInfo.liked = this.liked;
        commentInfo.parentMessageId = this.parentMessageId;
        List<String> list = this.subMessageIds;
        if (list != null) {
            commentInfo.subMessageIds = ValueObject.util_map(list, new w9j() { // from class: l.fh5
                public final Object call(Object obj) {
                    return CommentInfo.m85a((String) obj);
                }
            });
        }
        commentInfo.moreSubMessages = this.moreSubMessages;
        commentInfo.isBottom = this.isBottom;
        commentInfo.replyMessageId = this.replyMessageId;
        commentInfo.replyMessageAnonymous = this.replyMessageAnonymous;
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
        return this.likes == commentInfo.likes && this.liked == commentInfo.liked && ValueObject.util_equals(this.parentMessageId, commentInfo.parentMessageId) && ValueObject.util_equals(this.subMessageIds, commentInfo.subMessageIds) && ValueObject.util_equals(this.moreSubMessages, commentInfo.moreSubMessages) && this.isBottom == commentInfo.isBottom && ValueObject.util_equals(this.replyMessageId, commentInfo.replyMessageId) && this.replyMessageAnonymous == commentInfo.replyMessageAnonymous;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        int iHashCode4 = ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.replyMessageAnonymous ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
