package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.User;
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
public class LikeOrDislikeInfor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likeordislikeinfor";

    @NonNull
    @ProtobufIndex(index = 7)
    public String event;

    @NonNull
    @ProtobufIndex(index = 5)
    public String from;

    @ProtobufIndex(index = 4)
    public boolean isSpareId;

    @ProtobufIndex(index = 2)
    public boolean like;

    @NonNull
    @ProtobufIndex(index = 6)
    public String pageId;

    @ProtobufIndex(index = 3)
    public boolean superLiked;

    @NonNull
    @ProtobufIndex(index = 1)
    public User user;
    public static ProtobufAdapter<LikeOrDislikeInfor> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeOrDislikeInfor>() { // from class: com.p1.mobile.putong.core.data.LikeOrDislikeInfor.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikeOrDislikeInfor likeOrDislikeInfor) {
            User user = likeOrDislikeInfor.user;
            int iM17230l = (user != null ? CodedOutputByteBufferNano.m17230l(1, user, User.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.m17220b(2, likeOrDislikeInfor.like) + CodedOutputByteBufferNano.m17220b(3, likeOrDislikeInfor.superLiked) + CodedOutputByteBufferNano.m17220b(4, likeOrDislikeInfor.isSpareId);
            String str = likeOrDislikeInfor.from;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(5, str);
            }
            String str2 = likeOrDislikeInfor.pageId;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(6, str2);
            }
            String str3 = likeOrDislikeInfor.event;
            if (str3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(7, str3);
            }
            likeOrDislikeInfor.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikeOrDislikeInfor parse(nb5 nb5Var) throws IOException {
            LikeOrDislikeInfor likeOrDislikeInfor = new LikeOrDislikeInfor();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    likeOrDislikeInfor.user = (User) nb5Var.m158743l(User.PROTOBUF_ADAPTER);
                } else if (iM158752u == 16) {
                    likeOrDislikeInfor.like = nb5Var.m158738g();
                } else if (iM158752u == 24) {
                    likeOrDislikeInfor.superLiked = nb5Var.m158738g();
                } else if (iM158752u == 32) {
                    likeOrDislikeInfor.isSpareId = nb5Var.m158738g();
                } else if (iM158752u == 42) {
                    likeOrDislikeInfor.from = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    likeOrDislikeInfor.pageId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 58) {
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
                    likeOrDislikeInfor.event = nb5Var.m158750s();
                }
            }
            return likeOrDislikeInfor;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikeOrDislikeInfor likeOrDislikeInfor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            User user = likeOrDislikeInfor.user;
            if (user != null) {
                codedOutputByteBufferNano.m17254K(1, user, User.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(2, likeOrDislikeInfor.like);
            codedOutputByteBufferNano.m17244A(3, likeOrDislikeInfor.superLiked);
            codedOutputByteBufferNano.m17244A(4, likeOrDislikeInfor.isSpareId);
            String str = likeOrDislikeInfor.from;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(5, str);
            }
            String str2 = likeOrDislikeInfor.pageId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(6, str2);
            }
            String str3 = likeOrDislikeInfor.event;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(7, str3);
            }
        }
    };
    public static JsonAdapter<LikeOrDislikeInfor> JSON_ADAPTER = new ObjectJsonAdapter<LikeOrDislikeInfor>() { // from class: com.p1.mobile.putong.core.data.LikeOrDislikeInfor.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikeOrDislikeInfor.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikeOrDislikeInfor newInstance() {
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
                    likeOrDislikeInfor.user = User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikeOrDislikeInfor likeOrDislikeInfor, JsonGenerator jsonGenerator) throws IOException {
            if (likeOrDislikeInfor.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(likeOrDislikeInfor.user, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("like", likeOrDislikeInfor.like);
            jsonGenerator.writeBooleanField(MatchFrom.superLiked, likeOrDislikeInfor.superLiked);
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
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_EVENT, str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeOrDislikeInfor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeOrDislikeInfor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeOrDislikeInfor new_() {
        LikeOrDislikeInfor likeOrDislikeInfor = new LikeOrDislikeInfor();
        likeOrDislikeInfor.nullCheck();
        return likeOrDislikeInfor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikeOrDislikeInfor mo223809clone() {
        LikeOrDislikeInfor likeOrDislikeInfor = new LikeOrDislikeInfor();
        User user = this.user;
        if (user != null) {
            likeOrDislikeInfor.user = user.mo223809clone();
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
        User user = this.user;
        int iHashCode = (((((((i2 + (user != null ? user.hashCode() : 0)) * 41) + (this.like ? 1231 : 1237)) * 41) + (this.superLiked ? 1231 : 1237)) * 41) + (this.isSpareId ? 1231 : 1237)) * 41;
        String str = this.from;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.pageId;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.event;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
