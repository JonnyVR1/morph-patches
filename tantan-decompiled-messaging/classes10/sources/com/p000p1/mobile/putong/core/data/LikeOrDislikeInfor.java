package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.User;
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
public class LikeOrDislikeInfor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likeordislikeinfor";

    @NonNull
    @ProtobufIndex(index = 7)
    public String event;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String from;

    @ProtobufIndex(index = 4)
    public boolean isSpareId;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean like;

    @NonNull
    @ProtobufIndex(index = 6)
    public String pageId;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean superLiked;

    @NonNull
    @ProtobufIndex(index = 1)
    public User user;
    public static ProtobufAdapter<LikeOrDislikeInfor> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeOrDislikeInfor>() { // from class: com.p1.mobile.putong.core.data.LikeOrDislikeInfor.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikeOrDislikeInfor likeOrDislikeInfor) {
            User user = likeOrDislikeInfor.user;
            int iL = (user != null ? CodedOutputByteBufferNano.l(1, user, User.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.b(2, likeOrDislikeInfor.like) + CodedOutputByteBufferNano.b(3, likeOrDislikeInfor.superLiked) + CodedOutputByteBufferNano.b(4, likeOrDislikeInfor.isSpareId);
            String str = likeOrDislikeInfor.from;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(5, str);
            }
            String str2 = likeOrDislikeInfor.pageId;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(6, str2);
            }
            String str3 = likeOrDislikeInfor.event;
            if (str3 != null) {
                iL += CodedOutputByteBufferNano.o(7, str3);
            }
            ((MessageNano) likeOrDislikeInfor).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikeOrDislikeInfor m13875parse(nb5 nb5Var) throws IOException {
            LikeOrDislikeInfor likeOrDislikeInfor = new LikeOrDislikeInfor();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (likeOrDislikeInfor.user == null) {
                        likeOrDislikeInfor.user = User.new_();
                    }
                    if (likeOrDislikeInfor.from == null) {
                        likeOrDislikeInfor.from = "";
                    }
                    if (likeOrDislikeInfor.pageId == null) {
                        likeOrDislikeInfor.pageId = "";
                    }
                    if (likeOrDislikeInfor.event != null) {
                        break;
                    }
                    likeOrDislikeInfor.event = "";
                    break;
                }
                if (iU == 10) {
                    likeOrDislikeInfor.user = (User) nb5Var.l(User.PROTOBUF_ADAPTER);
                } else if (iU == 16) {
                    likeOrDislikeInfor.like = nb5Var.g();
                } else if (iU == 24) {
                    likeOrDislikeInfor.superLiked = nb5Var.g();
                } else if (iU == 32) {
                    likeOrDislikeInfor.isSpareId = nb5Var.g();
                } else if (iU == 42) {
                    likeOrDislikeInfor.from = nb5Var.s();
                } else if (iU == 50) {
                    likeOrDislikeInfor.pageId = nb5Var.s();
                } else {
                    if (iU != 58) {
                        if (likeOrDislikeInfor.user == null) {
                            likeOrDislikeInfor.user = User.new_();
                        }
                        if (likeOrDislikeInfor.from == null) {
                            likeOrDislikeInfor.from = "";
                        }
                        if (likeOrDislikeInfor.pageId == null) {
                            likeOrDislikeInfor.pageId = "";
                        }
                        if (likeOrDislikeInfor.event != null) {
                            break;
                        }
                        likeOrDislikeInfor.event = "";
                        return likeOrDislikeInfor;
                    }
                    likeOrDislikeInfor.event = nb5Var.s();
                }
            }
            return likeOrDislikeInfor;
        }

        public void serialize(LikeOrDislikeInfor likeOrDislikeInfor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            User user = likeOrDislikeInfor.user;
            if (user != null) {
                codedOutputByteBufferNano.K(1, user, User.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(2, likeOrDislikeInfor.like);
            codedOutputByteBufferNano.A(3, likeOrDislikeInfor.superLiked);
            codedOutputByteBufferNano.A(4, likeOrDislikeInfor.isSpareId);
            String str = likeOrDislikeInfor.from;
            if (str != null) {
                codedOutputByteBufferNano.R(5, str);
            }
            String str2 = likeOrDislikeInfor.pageId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(6, str2);
            }
            String str3 = likeOrDislikeInfor.event;
            if (str3 != null) {
                codedOutputByteBufferNano.R(7, str3);
            }
        }
    };
    public static JsonAdapter<LikeOrDislikeInfor> JSON_ADAPTER = new ObjectJsonAdapter<LikeOrDislikeInfor>() { // from class: com.p1.mobile.putong.core.data.LikeOrDislikeInfor.2
        public Class getDataClass() {
            return LikeOrDislikeInfor.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LikeOrDislikeInfor m13876newInstance() {
            return new LikeOrDislikeInfor();
        }

        public boolean parseField(LikeOrDislikeInfor likeOrDislikeInfor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "superLiked":
                    likeOrDislikeInfor.superLiked = jsonParser.getValueAsBoolean();
                    return true;
                case "pageId":
                    likeOrDislikeInfor.pageId = jsonParser.getValueAsString();
                    return true;
                case "from":
                    likeOrDislikeInfor.from = jsonParser.getValueAsString();
                    return true;
                case "like":
                    likeOrDislikeInfor.like = jsonParser.getValueAsBoolean();
                    return true;
                case "user":
                    likeOrDislikeInfor.user = (User) User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "event":
                    likeOrDislikeInfor.event = jsonParser.getValueAsString();
                    return true;
                case "isSpareId":
                    likeOrDislikeInfor.isSpareId = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LikeOrDislikeInfor likeOrDislikeInfor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "superLiked":
                case "pageId":
                case "from":
                case "like":
                case "user":
                case "event":
                case "isSpareId":
                    return true;
                default:
                    return super.parseFieldCheck(likeOrDislikeInfor, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LikeOrDislikeInfor likeOrDislikeInfor, JsonGenerator jsonGenerator) throws IOException {
            if (likeOrDislikeInfor.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(likeOrDislikeInfor.user, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("like", likeOrDislikeInfor.like);
            jsonGenerator.writeBooleanField("superLiked", likeOrDislikeInfor.superLiked);
            jsonGenerator.writeBooleanField("isSpareId", likeOrDislikeInfor.isSpareId);
            String str = likeOrDislikeInfor.from;
            if (str != null) {
                jsonGenerator.writeStringField("from", str);
            }
            String str2 = likeOrDislikeInfor.pageId;
            if (str2 != null) {
                jsonGenerator.writeStringField("pageId", str2);
            }
            String str3 = likeOrDislikeInfor.event;
            if (str3 != null) {
                jsonGenerator.writeStringField("event", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeOrDislikeInfor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeOrDislikeInfor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeOrDislikeInfor new_() {
        LikeOrDislikeInfor likeOrDislikeInfor = new LikeOrDislikeInfor();
        likeOrDislikeInfor.nullCheck();
        return likeOrDislikeInfor;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikeOrDislikeInfor m13874clone() {
        LikeOrDislikeInfor likeOrDislikeInfor = new LikeOrDislikeInfor();
        User user = this.user;
        if (user != null) {
            likeOrDislikeInfor.user = user.clone();
        }
        likeOrDislikeInfor.like = this.like;
        likeOrDislikeInfor.superLiked = this.superLiked;
        likeOrDislikeInfor.isSpareId = this.isSpareId;
        likeOrDislikeInfor.from = this.from;
        likeOrDislikeInfor.pageId = this.pageId;
        likeOrDislikeInfor.event = this.event;
        return likeOrDislikeInfor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeOrDislikeInfor)) {
            return false;
        }
        LikeOrDislikeInfor likeOrDislikeInfor = (LikeOrDislikeInfor) obj;
        return ValueObject.util_equals(this.user, likeOrDislikeInfor.user) && this.like == likeOrDislikeInfor.like && this.superLiked == likeOrDislikeInfor.superLiked && this.isSpareId == likeOrDislikeInfor.isSpareId && ValueObject.util_equals(this.from, likeOrDislikeInfor.from) && ValueObject.util_equals(this.pageId, likeOrDislikeInfor.pageId) && ValueObject.util_equals(this.event, likeOrDislikeInfor.event);
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
        User user = this.user;
        int iHashCode = (((((((i2 + (user != null ? user.hashCode() : 0)) * 41) + (this.like ? 1231 : 1237)) * 41) + (this.superLiked ? 1231 : 1237)) * 41) + (this.isSpareId ? 1231 : 1237)) * 41;
        String str = this.from;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.pageId;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.event;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.user == null) {
            this.user = User.new_();
        }
        if (this.from == null) {
            this.from = "";
        }
        if (this.pageId == null) {
            this.pageId = "";
        }
        if (this.event == null) {
            this.event = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
