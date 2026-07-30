package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.alibaba.fastjson.asm.Opcodes;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.MyMeetEntryFeed;
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
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class MyMeetEntryFeed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentryfeed";

    @NonNull
    @ProtobufIndex(index = 3)
    public FeedType feedType;

    @ProtobufIndex(index = 5)
    public int highPopSeeCount;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 9)
    public String f21194id;

    @NonNull
    @ProtobufIndex(index = 10)
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
    @ProtobufIndex(index = 2)
    public List<String> userIds;
    public static ProtobufAdapter<MyMeetEntryFeed> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntryFeed>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryFeed.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyMeetEntryFeed myMeetEntryFeed) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, myMeetEntryFeed.newCount);
            List<String> list = myMeetEntryFeed.userIds;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            FeedType feedType = myMeetEntryFeed.feedType;
            if (feedType != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, feedType, FeedType.PROTOBUF_ADAPTER);
            }
            String str = myMeetEntryFeed.momentText;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(5, myMeetEntryFeed.highPopSeeCount);
            String str2 = myMeetEntryFeed.subText;
            if (str2 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(6, str2);
            }
            String str3 = myMeetEntryFeed.publishTime;
            if (str3 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(7, str3);
            }
            String str4 = myMeetEntryFeed.sortId;
            if (str4 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(8, str4);
            }
            String str5 = myMeetEntryFeed.f21194id;
            if (str5 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(9, str5);
            }
            LiveType liveType = myMeetEntryFeed.liveType;
            if (liveType != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17285l(10, liveType, LiveType.PROTOBUF_ADAPTER);
            }
            MeetRelation meetRelation = myMeetEntryFeed.relation;
            if (meetRelation != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17285l(11, meetRelation, MeetRelation.PROTOBUF_ADAPTER);
            }
            int iM17283j = iM17281h2 + CodedOutputByteBufferNano.m17283j(12, myMeetEntryFeed.publishTimestamp);
            myMeetEntryFeed.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetEntryFeed parse(nc5 nc5Var) throws IOException {
            MyMeetEntryFeed myMeetEntryFeed = new MyMeetEntryFeed();
            while (true) {
                switch (nc5Var.m162497u()) {
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
                        if (myMeetEntryFeed.f21194id == null) {
                            myMeetEntryFeed.f21194id = "";
                        }
                        if (myMeetEntryFeed.relation == null) {
                            myMeetEntryFeed.relation = MeetRelation.new_();
                        }
                        break;
                    case 8:
                        myMeetEntryFeed.newCount = nc5Var.m162486j();
                        continue;
                    case 18:
                        myMeetEntryFeed.userIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 26:
                        myMeetEntryFeed.feedType = (FeedType) nc5Var.m162488l(FeedType.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        myMeetEntryFeed.momentText = nc5Var.m162495s();
                        continue;
                    case 40:
                        myMeetEntryFeed.highPopSeeCount = nc5Var.m162486j();
                        continue;
                    case 50:
                        myMeetEntryFeed.subText = nc5Var.m162495s();
                        continue;
                    case 58:
                        myMeetEntryFeed.publishTime = nc5Var.m162495s();
                        continue;
                    case 66:
                        myMeetEntryFeed.sortId = nc5Var.m162495s();
                        continue;
                    case 74:
                        myMeetEntryFeed.f21194id = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        myMeetEntryFeed.liveType = (LiveType) nc5Var.m162488l(LiveType.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        myMeetEntryFeed.relation = (MeetRelation) nc5Var.m162488l(MeetRelation.PROTOBUF_ADAPTER);
                        continue;
                    case Opcodes.IADD /* 96 */:
                        myMeetEntryFeed.publishTimestamp = nc5Var.m162487k();
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
                        if (myMeetEntryFeed.f21194id == null) {
                            myMeetEntryFeed.f21194id = "";
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetEntryFeed myMeetEntryFeed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, myMeetEntryFeed.newCount);
            List<String> list = myMeetEntryFeed.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            FeedType feedType = myMeetEntryFeed.feedType;
            if (feedType != null) {
                codedOutputByteBufferNano.m17309K(3, feedType, FeedType.PROTOBUF_ADAPTER);
            }
            String str = myMeetEntryFeed.momentText;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(4, str);
            }
            codedOutputByteBufferNano.m17305G(5, myMeetEntryFeed.highPopSeeCount);
            String str2 = myMeetEntryFeed.subText;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(6, str2);
            }
            String str3 = myMeetEntryFeed.publishTime;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(7, str3);
            }
            String str4 = myMeetEntryFeed.sortId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(8, str4);
            }
            String str5 = myMeetEntryFeed.f21194id;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(9, str5);
            }
            LiveType liveType = myMeetEntryFeed.liveType;
            if (liveType != null) {
                codedOutputByteBufferNano.m17309K(10, liveType, LiveType.PROTOBUF_ADAPTER);
            }
            MeetRelation meetRelation = myMeetEntryFeed.relation;
            if (meetRelation != null) {
                codedOutputByteBufferNano.m17309K(11, meetRelation, MeetRelation.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17307I(12, myMeetEntryFeed.publishTimestamp);
        }
    };
    public static JsonAdapter<MyMeetEntryFeed> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntryFeed>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryFeed.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetEntryFeed.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyMeetEntryFeed newInstance() {
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
                    myMeetEntryFeed.relation = MeetRelation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "feedType":
                    myMeetEntryFeed.feedType = FeedType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "userIds":
                    myMeetEntryFeed.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    myMeetEntryFeed.f21194id = jsonParser.getValueAsString();
                    return false;
                case "momentText":
                    myMeetEntryFeed.momentText = jsonParser.getValueAsString();
                    return true;
                case "newCount":
                    myMeetEntryFeed.newCount = jsonParser.getValueAsInt();
                    return true;
                case "liveType":
                    myMeetEntryFeed.liveType = LiveType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
            String str5 = myMeetEntryFeed.f21194id;
            if (str5 != null) {
                jsonGenerator.writeStringField("id", str5);
            }
            if (myMeetEntryFeed.relation != null) {
                jsonGenerator.writeFieldName("relation");
                MeetRelation.JSON_ADAPTER.serialize(myMeetEntryFeed.relation, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("publishTimestamp", myMeetEntryFeed.publishTimestamp);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntryFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntryFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36707a(String str) {
        return str;
    }

    public static MyMeetEntryFeed new_() {
        MyMeetEntryFeed myMeetEntryFeed = new MyMeetEntryFeed();
        myMeetEntryFeed.nullCheck();
        return myMeetEntryFeed;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetEntryFeed mo225055clone() {
        MyMeetEntryFeed myMeetEntryFeed = new MyMeetEntryFeed();
        myMeetEntryFeed.newCount = this.newCount;
        List<String> list = this.userIds;
        if (list != null) {
            myMeetEntryFeed.userIds = ValueObject.util_map(list, new qcj() { // from class: l.g320
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MyMeetEntryFeed.m36707a((String) obj);
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
        myMeetEntryFeed.f21194id = this.f21194id;
        MeetRelation meetRelation = this.relation;
        if (meetRelation != null) {
            myMeetEntryFeed.relation = meetRelation.mo225055clone();
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
        return this.newCount == myMeetEntryFeed.newCount && ValueObject.util_equals(this.userIds, myMeetEntryFeed.userIds) && ValueObject.util_equals(this.feedType, myMeetEntryFeed.feedType) && ValueObject.util_equals(this.liveType, myMeetEntryFeed.liveType) && ValueObject.util_equals(this.momentText, myMeetEntryFeed.momentText) && this.highPopSeeCount == myMeetEntryFeed.highPopSeeCount && ValueObject.util_equals(this.subText, myMeetEntryFeed.subText) && ValueObject.util_equals(this.publishTime, myMeetEntryFeed.publishTime) && ValueObject.util_equals(this.sortId, myMeetEntryFeed.sortId) && ValueObject.util_equals(this.f21194id, myMeetEntryFeed.f21194id) && ValueObject.util_equals(this.relation, myMeetEntryFeed.relation) && this.publishTimestamp == myMeetEntryFeed.publishTimestamp;
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
        String str5 = this.f21194id;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        MeetRelation meetRelation = this.relation;
        int iHashCode9 = meetRelation != null ? meetRelation.hashCode() : 0;
        long j = this.publishTimestamp;
        int i3 = ((iHashCode8 + iHashCode9) * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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
        if (this.f21194id == null) {
            this.f21194id = "";
        }
        if (this.relation == null) {
            this.relation = MeetRelation.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
