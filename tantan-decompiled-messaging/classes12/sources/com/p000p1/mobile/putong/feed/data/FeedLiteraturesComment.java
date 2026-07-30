package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedLiteraturesComment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "feedliteraturescomment";

    @ProtobufIndex(index = 4)
    public long createdTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 5)
    public String f682id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String interestLevel;

    @NonNull
    @ProtobufIndex(index = 2)
    public String literatureID;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<FeedLiteraturesComment> PROTOBUF_ADAPTER = new MessageNanoAdapter<FeedLiteraturesComment>() { // from class: com.p1.mobile.putong.feed.data.FeedLiteraturesComment.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FeedLiteraturesComment feedLiteraturesComment) {
            String str = feedLiteraturesComment.userID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = feedLiteraturesComment.literatureID;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = feedLiteraturesComment.interestLevel;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(4, feedLiteraturesComment.createdTime);
            String str4 = feedLiteraturesComment.f682id;
            if (str4 != null) {
                iJ += CodedOutputByteBufferNano.o(5, str4);
            }
            ((MessageNano) feedLiteraturesComment).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FeedLiteraturesComment m19494parse(nb5 nb5Var) throws IOException {
            FeedLiteraturesComment feedLiteraturesComment = new FeedLiteraturesComment();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (feedLiteraturesComment.userID == null) {
                        feedLiteraturesComment.userID = "";
                    }
                    if (feedLiteraturesComment.literatureID == null) {
                        feedLiteraturesComment.literatureID = "";
                    }
                    if (feedLiteraturesComment.interestLevel == null) {
                        feedLiteraturesComment.interestLevel = "";
                    }
                    if (feedLiteraturesComment.f682id != null) {
                        break;
                    }
                    feedLiteraturesComment.f682id = "";
                    break;
                }
                if (iU == 10) {
                    feedLiteraturesComment.userID = nb5Var.s();
                } else if (iU == 18) {
                    feedLiteraturesComment.literatureID = nb5Var.s();
                } else if (iU == 26) {
                    feedLiteraturesComment.interestLevel = nb5Var.s();
                } else if (iU == 32) {
                    feedLiteraturesComment.createdTime = nb5Var.k();
                } else {
                    if (iU != 42) {
                        if (feedLiteraturesComment.userID == null) {
                            feedLiteraturesComment.userID = "";
                        }
                        if (feedLiteraturesComment.literatureID == null) {
                            feedLiteraturesComment.literatureID = "";
                        }
                        if (feedLiteraturesComment.interestLevel == null) {
                            feedLiteraturesComment.interestLevel = "";
                        }
                        if (feedLiteraturesComment.f682id != null) {
                            break;
                        }
                        feedLiteraturesComment.f682id = "";
                        return feedLiteraturesComment;
                    }
                    feedLiteraturesComment.f682id = nb5Var.s();
                }
            }
            return feedLiteraturesComment;
        }

        public void serialize(FeedLiteraturesComment feedLiteraturesComment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = feedLiteraturesComment.userID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = feedLiteraturesComment.literatureID;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = feedLiteraturesComment.interestLevel;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.I(4, feedLiteraturesComment.createdTime);
            String str4 = feedLiteraturesComment.f682id;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
        }
    };
    public static JsonAdapter<FeedLiteraturesComment> JSON_ADAPTER = new ObjectJsonAdapter<FeedLiteraturesComment>() { // from class: com.p1.mobile.putong.feed.data.FeedLiteraturesComment.2
        public Class getDataClass() {
            return FeedLiteraturesComment.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FeedLiteraturesComment mo17830newInstance() {
            return new FeedLiteraturesComment();
        }

        public boolean parseField(FeedLiteraturesComment feedLiteraturesComment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "interestLevel":
                    feedLiteraturesComment.interestLevel = jsonParser.getValueAsString();
                    return true;
                case "literatureID":
                    feedLiteraturesComment.literatureID = jsonParser.getValueAsString();
                    return true;
                case "userID":
                    feedLiteraturesComment.userID = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    feedLiteraturesComment.createdTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    feedLiteraturesComment.f682id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FeedLiteraturesComment feedLiteraturesComment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "interestLevel":
                case "literatureID":
                case "userID":
                case "createdTime":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(feedLiteraturesComment, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FeedLiteraturesComment feedLiteraturesComment, JsonGenerator jsonGenerator) throws IOException {
            String str = feedLiteraturesComment.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            String str2 = feedLiteraturesComment.literatureID;
            if (str2 != null) {
                jsonGenerator.writeStringField("literatureID", str2);
            }
            String str3 = feedLiteraturesComment.interestLevel;
            if (str3 != null) {
                jsonGenerator.writeStringField("interestLevel", str3);
            }
            jsonGenerator.writeNumberField("createdTime", feedLiteraturesComment.createdTime);
            String str4 = feedLiteraturesComment.f682id;
            if (str4 != null) {
                jsonGenerator.writeStringField("id", str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedLiteraturesComment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedLiteraturesComment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static String formatInterestLevel(String str) {
        if ("to_watch".equals(str)) {
            return "想看";
        }
        if ("watching".equals(str)) {
            return "在看";
        }
        return "watched".equals(str) ? "看过" : "添加";
    }

    public static boolean isShowArtAdd(String str) {
        return ("to_watch".equals(str) || "watching".equals(str) || "watched".equals(str)) ? false : true;
    }

    public static FeedLiteraturesComment new_() {
        FeedLiteraturesComment feedLiteraturesComment = new FeedLiteraturesComment();
        feedLiteraturesComment.nullCheck();
        return feedLiteraturesComment;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FeedLiteraturesComment m19493clone() {
        FeedLiteraturesComment feedLiteraturesComment = new FeedLiteraturesComment();
        feedLiteraturesComment.userID = this.userID;
        feedLiteraturesComment.literatureID = this.literatureID;
        feedLiteraturesComment.interestLevel = this.interestLevel;
        feedLiteraturesComment.createdTime = this.createdTime;
        feedLiteraturesComment.f682id = this.f682id;
        return feedLiteraturesComment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeedLiteraturesComment)) {
            return false;
        }
        FeedLiteraturesComment feedLiteraturesComment = (FeedLiteraturesComment) obj;
        return ValueObject.util_equals(this.userID, feedLiteraturesComment.userID) && ValueObject.util_equals(this.literatureID, feedLiteraturesComment.literatureID) && ValueObject.util_equals(this.interestLevel, feedLiteraturesComment.interestLevel) && this.createdTime == feedLiteraturesComment.createdTime && ValueObject.util_equals(this.f682id, feedLiteraturesComment.f682id);
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
        String str = this.userID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.literatureID;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.interestLevel;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.createdTime;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str4 = this.f682id;
        int iHashCode4 = i3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public boolean isToWatch() {
        return "to_watch".equals(this.interestLevel);
    }

    public boolean isWatched() {
        return "watched".equals(this.interestLevel);
    }

    public boolean isWatching() {
        return "watching".equals(this.interestLevel);
    }

    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
        if (this.literatureID == null) {
            this.literatureID = "";
        }
        if (this.interestLevel == null) {
            this.interestLevel = "";
        }
        if (this.f682id == null) {
            this.f682id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
