package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MyMeetEntryFeed;
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
public class MyMeetEntryFeed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentryfeed";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public FeedType feedType;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int highPopSeeCount;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 9)
    public String f114id;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public LiveType liveType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String momentText;

    @ProtobufIndex(index = 1)
    public int newCount;

    @NonNull
    @ProtobufIndex(index = 7)
    public String publishTime;

    @ProtobufIndex(index = 12)
    public long publishTimestamp;

    @NonNull
    @ProtobufIndex(index = 11)
    public MeetRelation relation;

    @NonNull
    @ProtobufIndex(index = 8)
    public String sortId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String subText;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> userIds;
    public static ProtobufAdapter<MyMeetEntryFeed> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntryFeed>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryFeed.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MyMeetEntryFeed myMeetEntryFeed) {
            int iH = CodedOutputByteBufferNano.h(1, myMeetEntryFeed.newCount);
            List<String> list = myMeetEntryFeed.userIds;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            FeedType feedType = myMeetEntryFeed.feedType;
            if (feedType != null) {
                iH += CodedOutputByteBufferNano.l(3, feedType, FeedType.PROTOBUF_ADAPTER);
            }
            String str = myMeetEntryFeed.momentText;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(4, str);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(5, myMeetEntryFeed.highPopSeeCount);
            String str2 = myMeetEntryFeed.subText;
            if (str2 != null) {
                iH2 += CodedOutputByteBufferNano.o(6, str2);
            }
            String str3 = myMeetEntryFeed.publishTime;
            if (str3 != null) {
                iH2 += CodedOutputByteBufferNano.o(7, str3);
            }
            String str4 = myMeetEntryFeed.sortId;
            if (str4 != null) {
                iH2 += CodedOutputByteBufferNano.o(8, str4);
            }
            String str5 = myMeetEntryFeed.f114id;
            if (str5 != null) {
                iH2 += CodedOutputByteBufferNano.o(9, str5);
            }
            LiveType liveType = myMeetEntryFeed.liveType;
            if (liveType != null) {
                iH2 += CodedOutputByteBufferNano.l(10, liveType, LiveType.PROTOBUF_ADAPTER);
            }
            MeetRelation meetRelation = myMeetEntryFeed.relation;
            if (meetRelation != null) {
                iH2 += CodedOutputByteBufferNano.l(11, meetRelation, MeetRelation.PROTOBUF_ADAPTER);
            }
            int iJ = iH2 + CodedOutputByteBufferNano.j(12, myMeetEntryFeed.publishTimestamp);
            ((MessageNano) myMeetEntryFeed).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MyMeetEntryFeed m14409parse(nb5 nb5Var) throws IOException {
            MyMeetEntryFeed myMeetEntryFeed = new MyMeetEntryFeed();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (myMeetEntryFeed.userIds == null) {
                            myMeetEntryFeed.userIds = new ArrayList();
                        }
                        if (myMeetEntryFeed.feedType == null) {
                            myMeetEntryFeed.feedType = (FeedType) FeedType.JSON_ADAPTER.defaultEnum();
                        }
                        if (myMeetEntryFeed.liveType == null) {
                            myMeetEntryFeed.liveType = (LiveType) LiveType.JSON_ADAPTER.defaultEnum();
                        }
                        if (myMeetEntryFeed.momentText == null) {
                            myMeetEntryFeed.momentText = "";
                        }
                        if (myMeetEntryFeed.subText == null) {
                            myMeetEntryFeed.subText = "";
                        }
                        if (myMeetEntryFeed.publishTime == null) {
                            myMeetEntryFeed.publishTime = "";
                        }
                        if (myMeetEntryFeed.sortId == null) {
                            myMeetEntryFeed.sortId = "";
                        }
                        if (myMeetEntryFeed.f114id == null) {
                            myMeetEntryFeed.f114id = "";
                        }
                        if (myMeetEntryFeed.relation == null) {
                            myMeetEntryFeed.relation = MeetRelation.new_();
                        }
                        break;
                    case 8:
                        myMeetEntryFeed.newCount = nb5Var.j();
                        continue;
                    case 18:
                        myMeetEntryFeed.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 26:
                        myMeetEntryFeed.feedType = (FeedType) nb5Var.l(FeedType.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        myMeetEntryFeed.momentText = nb5Var.s();
                        continue;
                    case 40:
                        myMeetEntryFeed.highPopSeeCount = nb5Var.j();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        myMeetEntryFeed.subText = nb5Var.s();
                        continue;
                    case 58:
                        myMeetEntryFeed.publishTime = nb5Var.s();
                        continue;
                    case 66:
                        myMeetEntryFeed.sortId = nb5Var.s();
                        continue;
                    case 74:
                        myMeetEntryFeed.f114id = nb5Var.s();
                        continue;
                    case 82:
                        myMeetEntryFeed.liveType = (LiveType) nb5Var.l(LiveType.PROTOBUF_ADAPTER);
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        myMeetEntryFeed.relation = (MeetRelation) nb5Var.l(MeetRelation.PROTOBUF_ADAPTER);
                        continue;
                    case 96:
                        myMeetEntryFeed.publishTimestamp = nb5Var.k();
                        continue;
                    default:
                        if (myMeetEntryFeed.userIds == null) {
                            myMeetEntryFeed.userIds = new ArrayList();
                        }
                        if (myMeetEntryFeed.feedType == null) {
                            myMeetEntryFeed.feedType = (FeedType) FeedType.JSON_ADAPTER.defaultEnum();
                        }
                        if (myMeetEntryFeed.liveType == null) {
                            myMeetEntryFeed.liveType = (LiveType) LiveType.JSON_ADAPTER.defaultEnum();
                        }
                        if (myMeetEntryFeed.momentText == null) {
                            myMeetEntryFeed.momentText = "";
                        }
                        if (myMeetEntryFeed.subText == null) {
                            myMeetEntryFeed.subText = "";
                        }
                        if (myMeetEntryFeed.publishTime == null) {
                            myMeetEntryFeed.publishTime = "";
                        }
                        if (myMeetEntryFeed.sortId == null) {
                            myMeetEntryFeed.sortId = "";
                        }
                        if (myMeetEntryFeed.f114id == null) {
                            myMeetEntryFeed.f114id = "";
                        }
                        if (myMeetEntryFeed.relation == null) {
                            myMeetEntryFeed.relation = MeetRelation.new_();
                            return myMeetEntryFeed;
                        }
                        break;
                }
            }
            return myMeetEntryFeed;
        }

        public void serialize(MyMeetEntryFeed myMeetEntryFeed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, myMeetEntryFeed.newCount);
            List<String> list = myMeetEntryFeed.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            FeedType feedType = myMeetEntryFeed.feedType;
            if (feedType != null) {
                codedOutputByteBufferNano.K(3, feedType, FeedType.PROTOBUF_ADAPTER);
            }
            String str = myMeetEntryFeed.momentText;
            if (str != null) {
                codedOutputByteBufferNano.R(4, str);
            }
            codedOutputByteBufferNano.G(5, myMeetEntryFeed.highPopSeeCount);
            String str2 = myMeetEntryFeed.subText;
            if (str2 != null) {
                codedOutputByteBufferNano.R(6, str2);
            }
            String str3 = myMeetEntryFeed.publishTime;
            if (str3 != null) {
                codedOutputByteBufferNano.R(7, str3);
            }
            String str4 = myMeetEntryFeed.sortId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(8, str4);
            }
            String str5 = myMeetEntryFeed.f114id;
            if (str5 != null) {
                codedOutputByteBufferNano.R(9, str5);
            }
            LiveType liveType = myMeetEntryFeed.liveType;
            if (liveType != null) {
                codedOutputByteBufferNano.K(10, liveType, LiveType.PROTOBUF_ADAPTER);
            }
            MeetRelation meetRelation = myMeetEntryFeed.relation;
            if (meetRelation != null) {
                codedOutputByteBufferNano.K(11, meetRelation, MeetRelation.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.I(12, myMeetEntryFeed.publishTimestamp);
        }
    };
    public static JsonAdapter<MyMeetEntryFeed> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntryFeed>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryFeed.2
        public Class getDataClass() {
            return MyMeetEntryFeed.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MyMeetEntryFeed m14410newInstance() {
            return new MyMeetEntryFeed();
        }

        public boolean parseField(MyMeetEntryFeed myMeetEntryFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subText":
                    myMeetEntryFeed.subText = jsonParser.getValueAsString();
                    return true;
                case "publishTimestamp":
                    myMeetEntryFeed.publishTimestamp = jsonParser.getValueAsLong();
                    return true;
                case "highPopSeeCount":
                    myMeetEntryFeed.highPopSeeCount = jsonParser.getValueAsInt();
                    return true;
                case "sortId":
                    myMeetEntryFeed.sortId = jsonParser.getValueAsString();
                    return true;
                case "publishTime":
                    myMeetEntryFeed.publishTime = jsonParser.getValueAsString();
                    return true;
                case "relation":
                    myMeetEntryFeed.relation = (MeetRelation) MeetRelation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "feedType":
                    myMeetEntryFeed.feedType = (FeedType) FeedType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "userIds":
                    myMeetEntryFeed.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    myMeetEntryFeed.f114id = jsonParser.getValueAsString();
                    return false;
                case "momentText":
                    myMeetEntryFeed.momentText = jsonParser.getValueAsString();
                    return true;
                case "newCount":
                    myMeetEntryFeed.newCount = jsonParser.getValueAsInt();
                    return true;
                case "liveType":
                    myMeetEntryFeed.liveType = (LiveType) LiveType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MyMeetEntryFeed myMeetEntryFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subText":
                case "publishTimestamp":
                case "highPopSeeCount":
                case "sortId":
                case "publishTime":
                case "relation":
                case "feedType":
                case "userIds":
                    return true;
                case "id":
                    return false;
                case "momentText":
                case "newCount":
                case "liveType":
                    return true;
                default:
                    return super.parseFieldCheck(myMeetEntryFeed, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MyMeetEntryFeed myMeetEntryFeed, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("newCount", myMeetEntryFeed.newCount);
            if (myMeetEntryFeed.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(myMeetEntryFeed.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (myMeetEntryFeed.feedType != null) {
                jsonGenerator.writeFieldName("feedType");
                FeedType.JSON_ADAPTER.serialize(myMeetEntryFeed.feedType, jsonGenerator, true);
            }
            if (myMeetEntryFeed.liveType != null) {
                jsonGenerator.writeFieldName("liveType");
                LiveType.JSON_ADAPTER.serialize(myMeetEntryFeed.liveType, jsonGenerator, true);
            }
            String str = myMeetEntryFeed.momentText;
            if (str != null) {
                jsonGenerator.writeStringField("momentText", str);
            }
            jsonGenerator.writeNumberField("highPopSeeCount", myMeetEntryFeed.highPopSeeCount);
            String str2 = myMeetEntryFeed.subText;
            if (str2 != null) {
                jsonGenerator.writeStringField("subText", str2);
            }
            String str3 = myMeetEntryFeed.publishTime;
            if (str3 != null) {
                jsonGenerator.writeStringField("publishTime", str3);
            }
            String str4 = myMeetEntryFeed.sortId;
            if (str4 != null) {
                jsonGenerator.writeStringField("sortId", str4);
            }
            String str5 = myMeetEntryFeed.f114id;
            if (str5 != null) {
                jsonGenerator.writeStringField("id", str5);
            }
            if (myMeetEntryFeed.relation != null) {
                jsonGenerator.writeFieldName("relation");
                MeetRelation.JSON_ADAPTER.serialize(myMeetEntryFeed.relation, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("publishTimestamp", myMeetEntryFeed.publishTimestamp);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntryFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntryFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m506a(String str) {
        return str;
    }

    public static MyMeetEntryFeed new_() {
        MyMeetEntryFeed myMeetEntryFeed = new MyMeetEntryFeed();
        myMeetEntryFeed.nullCheck();
        return myMeetEntryFeed;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MyMeetEntryFeed m14408clone() {
        MyMeetEntryFeed myMeetEntryFeed = new MyMeetEntryFeed();
        myMeetEntryFeed.newCount = this.newCount;
        List<String> list = this.userIds;
        if (list != null) {
            myMeetEntryFeed.userIds = ValueObject.util_map(list, new w9j() { // from class: l.yu10
                public final Object call(Object obj) {
                    return MyMeetEntryFeed.m506a((String) obj);
                }
            });
        }
        myMeetEntryFeed.feedType = this.feedType;
        myMeetEntryFeed.liveType = this.liveType;
        myMeetEntryFeed.momentText = this.momentText;
        myMeetEntryFeed.highPopSeeCount = this.highPopSeeCount;
        myMeetEntryFeed.subText = this.subText;
        myMeetEntryFeed.publishTime = this.publishTime;
        myMeetEntryFeed.sortId = this.sortId;
        myMeetEntryFeed.f114id = this.f114id;
        MeetRelation meetRelation = this.relation;
        if (meetRelation != null) {
            myMeetEntryFeed.relation = meetRelation.m14112clone();
        }
        myMeetEntryFeed.publishTimestamp = this.publishTimestamp;
        return myMeetEntryFeed;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyMeetEntryFeed)) {
            return false;
        }
        MyMeetEntryFeed myMeetEntryFeed = (MyMeetEntryFeed) obj;
        return this.newCount == myMeetEntryFeed.newCount && ValueObject.util_equals(this.userIds, myMeetEntryFeed.userIds) && ValueObject.util_equals(this.feedType, myMeetEntryFeed.feedType) && ValueObject.util_equals(this.liveType, myMeetEntryFeed.liveType) && ValueObject.util_equals(this.momentText, myMeetEntryFeed.momentText) && this.highPopSeeCount == myMeetEntryFeed.highPopSeeCount && ValueObject.util_equals(this.subText, myMeetEntryFeed.subText) && ValueObject.util_equals(this.publishTime, myMeetEntryFeed.publishTime) && ValueObject.util_equals(this.sortId, myMeetEntryFeed.sortId) && ValueObject.util_equals(this.f114id, myMeetEntryFeed.f114id) && ValueObject.util_equals(this.relation, myMeetEntryFeed.relation) && this.publishTimestamp == myMeetEntryFeed.publishTimestamp;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.newCount) * 41;
        List<String> list = this.userIds;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        FeedType feedType = this.feedType;
        int iHashCode2 = (iHashCode + (feedType != null ? feedType.hashCode() : 0)) * 41;
        LiveType liveType = this.liveType;
        int iHashCode3 = (iHashCode2 + (liveType != null ? liveType.hashCode() : 0)) * 41;
        String str = this.momentText;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 41) + this.highPopSeeCount) * 41;
        String str2 = this.subText;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.publishTime;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.sortId;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.f114id;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        MeetRelation meetRelation = this.relation;
        int iHashCode9 = meetRelation != null ? meetRelation.hashCode() : 0;
        long j = this.publishTimestamp;
        int i3 = ((iHashCode8 + iHashCode9) * 41) + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
        if (this.feedType == null) {
            this.feedType = (FeedType) FeedType.JSON_ADAPTER.defaultEnum();
        }
        if (this.liveType == null) {
            this.liveType = (LiveType) LiveType.JSON_ADAPTER.defaultEnum();
        }
        if (this.momentText == null) {
            this.momentText = "";
        }
        if (this.subText == null) {
            this.subText = "";
        }
        if (this.publishTime == null) {
            this.publishTime = "";
        }
        if (this.sortId == null) {
            this.sortId = "";
        }
        if (this.f114id == null) {
            this.f114id = "";
        }
        if (this.relation == null) {
            this.relation = MeetRelation.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
