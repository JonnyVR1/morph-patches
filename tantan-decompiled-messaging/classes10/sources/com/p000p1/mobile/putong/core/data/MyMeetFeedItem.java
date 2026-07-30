package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MyMeetFeedItem;
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
public class MyMeetFeedItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetfeeditem";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String f115id;

    @ProtobufIndex(index = 8)
    public int lowPopSeeCount;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String momentId;

    @NonNull
    @ProtobufIndex(index = 14)
    public String momentMediaType;

    @ProtobufIndex(index = 12)
    public boolean online;

    @NonNull
    @ProtobufIndex(index = 6)
    public OverHeatingStatus overheating;

    @ProtobufIndex(index = 13)
    public boolean passBy;

    @NonNull
    @ProtobufIndex(index = 9)
    public PickInfo pick;

    @ProtobufIndex(index = 11)
    public int readStatus;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public MeetRelation relation;

    @ProtobufIndex(index = 7)
    public int seeCount;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String sortId;

    @NonNull
    @ProtobufIndex(index = 4)
    public FeedType type;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> userIds;
    public static ProtobufAdapter<MyMeetFeedItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetFeedItem>() { // from class: com.p1.mobile.putong.core.data.MyMeetFeedItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MyMeetFeedItem myMeetFeedItem) {
            List<String> list = myMeetFeedItem.userIds;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = myMeetFeedItem.sortId;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = myMeetFeedItem.momentId;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(3, str2);
            }
            FeedType feedType = myMeetFeedItem.type;
            if (feedType != null) {
                iL += CodedOutputByteBufferNano.l(4, feedType, FeedType.PROTOBUF_ADAPTER);
            }
            MeetRelation meetRelation = myMeetFeedItem.relation;
            if (meetRelation != null) {
                iL += CodedOutputByteBufferNano.l(5, meetRelation, MeetRelation.PROTOBUF_ADAPTER);
            }
            OverHeatingStatus overHeatingStatus = myMeetFeedItem.overheating;
            if (overHeatingStatus != null) {
                iL += CodedOutputByteBufferNano.l(6, overHeatingStatus, OverHeatingStatus.PROTOBUF_ADAPTER);
            }
            int iH = iL + CodedOutputByteBufferNano.h(7, myMeetFeedItem.seeCount) + CodedOutputByteBufferNano.h(8, myMeetFeedItem.lowPopSeeCount);
            PickInfo pickInfo = myMeetFeedItem.pick;
            if (pickInfo != null) {
                iH += CodedOutputByteBufferNano.l(9, pickInfo, PickInfo.PROTOBUF_ADAPTER);
            }
            String str3 = myMeetFeedItem.f115id;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(10, str3);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(11, myMeetFeedItem.readStatus) + CodedOutputByteBufferNano.b(12, myMeetFeedItem.online) + CodedOutputByteBufferNano.b(13, myMeetFeedItem.passBy);
            String str4 = myMeetFeedItem.momentMediaType;
            if (str4 != null) {
                iH2 += CodedOutputByteBufferNano.o(14, str4);
            }
            ((MessageNano) myMeetFeedItem).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MyMeetFeedItem m14437parse(nb5 nb5Var) throws IOException {
            MyMeetFeedItem myMeetFeedItem = new MyMeetFeedItem();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (myMeetFeedItem.f115id == null) {
                            myMeetFeedItem.f115id = "";
                        }
                        if (myMeetFeedItem.userIds == null) {
                            myMeetFeedItem.userIds = new ArrayList();
                        }
                        if (myMeetFeedItem.sortId == null) {
                            myMeetFeedItem.sortId = "";
                        }
                        if (myMeetFeedItem.momentId == null) {
                            myMeetFeedItem.momentId = "";
                        }
                        if (myMeetFeedItem.type == null) {
                            myMeetFeedItem.type = (FeedType) FeedType.JSON_ADAPTER.defaultEnum();
                        }
                        if (myMeetFeedItem.relation == null) {
                            myMeetFeedItem.relation = MeetRelation.new_();
                        }
                        if (myMeetFeedItem.overheating == null) {
                            myMeetFeedItem.overheating = OverHeatingStatus.new_();
                        }
                        if (myMeetFeedItem.pick == null) {
                            myMeetFeedItem.pick = PickInfo.new_();
                        }
                        if (myMeetFeedItem.momentMediaType == null) {
                            myMeetFeedItem.momentMediaType = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        myMeetFeedItem.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        myMeetFeedItem.sortId = nb5Var.s();
                        continue;
                    case 26:
                        myMeetFeedItem.momentId = nb5Var.s();
                        continue;
                    case 34:
                        myMeetFeedItem.type = (FeedType) nb5Var.l(FeedType.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        myMeetFeedItem.relation = (MeetRelation) nb5Var.l(MeetRelation.PROTOBUF_ADAPTER);
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        myMeetFeedItem.overheating = (OverHeatingStatus) nb5Var.l(OverHeatingStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 56:
                        myMeetFeedItem.seeCount = nb5Var.j();
                        continue;
                    case 64:
                        myMeetFeedItem.lowPopSeeCount = nb5Var.j();
                        continue;
                    case 74:
                        myMeetFeedItem.pick = (PickInfo) nb5Var.l(PickInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 82:
                        myMeetFeedItem.f115id = nb5Var.s();
                        continue;
                    case 88:
                        myMeetFeedItem.readStatus = nb5Var.j();
                        continue;
                    case 96:
                        myMeetFeedItem.online = nb5Var.g();
                        continue;
                    case 104:
                        myMeetFeedItem.passBy = nb5Var.g();
                        continue;
                    case 114:
                        myMeetFeedItem.momentMediaType = nb5Var.s();
                        continue;
                    default:
                        if (myMeetFeedItem.f115id == null) {
                            myMeetFeedItem.f115id = "";
                        }
                        if (myMeetFeedItem.userIds == null) {
                            myMeetFeedItem.userIds = new ArrayList();
                        }
                        if (myMeetFeedItem.sortId == null) {
                            myMeetFeedItem.sortId = "";
                        }
                        if (myMeetFeedItem.momentId == null) {
                            myMeetFeedItem.momentId = "";
                        }
                        if (myMeetFeedItem.type == null) {
                            myMeetFeedItem.type = (FeedType) FeedType.JSON_ADAPTER.defaultEnum();
                        }
                        if (myMeetFeedItem.relation == null) {
                            myMeetFeedItem.relation = MeetRelation.new_();
                        }
                        if (myMeetFeedItem.overheating == null) {
                            myMeetFeedItem.overheating = OverHeatingStatus.new_();
                        }
                        if (myMeetFeedItem.pick == null) {
                            myMeetFeedItem.pick = PickInfo.new_();
                        }
                        if (myMeetFeedItem.momentMediaType == null) {
                            myMeetFeedItem.momentMediaType = "";
                            return myMeetFeedItem;
                        }
                        break;
                }
            }
            return myMeetFeedItem;
        }

        public void serialize(MyMeetFeedItem myMeetFeedItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = myMeetFeedItem.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = myMeetFeedItem.sortId;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = myMeetFeedItem.momentId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            FeedType feedType = myMeetFeedItem.type;
            if (feedType != null) {
                codedOutputByteBufferNano.K(4, feedType, FeedType.PROTOBUF_ADAPTER);
            }
            MeetRelation meetRelation = myMeetFeedItem.relation;
            if (meetRelation != null) {
                codedOutputByteBufferNano.K(5, meetRelation, MeetRelation.PROTOBUF_ADAPTER);
            }
            OverHeatingStatus overHeatingStatus = myMeetFeedItem.overheating;
            if (overHeatingStatus != null) {
                codedOutputByteBufferNano.K(6, overHeatingStatus, OverHeatingStatus.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(7, myMeetFeedItem.seeCount);
            codedOutputByteBufferNano.G(8, myMeetFeedItem.lowPopSeeCount);
            PickInfo pickInfo = myMeetFeedItem.pick;
            if (pickInfo != null) {
                codedOutputByteBufferNano.K(9, pickInfo, PickInfo.PROTOBUF_ADAPTER);
            }
            String str3 = myMeetFeedItem.f115id;
            if (str3 != null) {
                codedOutputByteBufferNano.R(10, str3);
            }
            codedOutputByteBufferNano.G(11, myMeetFeedItem.readStatus);
            codedOutputByteBufferNano.A(12, myMeetFeedItem.online);
            codedOutputByteBufferNano.A(13, myMeetFeedItem.passBy);
            String str4 = myMeetFeedItem.momentMediaType;
            if (str4 != null) {
                codedOutputByteBufferNano.R(14, str4);
            }
        }
    };
    public static JsonAdapter<MyMeetFeedItem> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetFeedItem>() { // from class: com.p1.mobile.putong.core.data.MyMeetFeedItem.2
        public Class getDataClass() {
            return MyMeetFeedItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MyMeetFeedItem m14438newInstance() {
            return new MyMeetFeedItem();
        }

        public boolean parseField(MyMeetFeedItem myMeetFeedItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "online":
                    myMeetFeedItem.online = jsonParser.getValueAsBoolean();
                    return true;
                case "passBy":
                    myMeetFeedItem.passBy = jsonParser.getValueAsBoolean();
                    return true;
                case "sortId":
                    myMeetFeedItem.sortId = jsonParser.getValueAsString();
                    return true;
                case "lowPopSeeCount":
                    myMeetFeedItem.lowPopSeeCount = jsonParser.getValueAsInt();
                    return true;
                case "relation":
                    myMeetFeedItem.relation = (MeetRelation) MeetRelation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "readStatus":
                    myMeetFeedItem.readStatus = jsonParser.getValueAsInt();
                    return true;
                case "momentId":
                    myMeetFeedItem.momentId = jsonParser.getValueAsString();
                    return true;
                case "userIds":
                    myMeetFeedItem.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    myMeetFeedItem.f115id = jsonParser.getValueAsString();
                    return false;
                case "pick":
                    myMeetFeedItem.pick = (PickInfo) PickInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    myMeetFeedItem.type = (FeedType) FeedType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "overheating":
                    myMeetFeedItem.overheating = (OverHeatingStatus) OverHeatingStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "seeCount":
                    myMeetFeedItem.seeCount = jsonParser.getValueAsInt();
                    return true;
                case "momentMediaType":
                    myMeetFeedItem.momentMediaType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MyMeetFeedItem myMeetFeedItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "online":
                case "passBy":
                case "sortId":
                case "lowPopSeeCount":
                case "relation":
                case "readStatus":
                case "momentId":
                case "userIds":
                    return true;
                case "id":
                    return false;
                case "pick":
                case "type":
                case "overheating":
                case "seeCount":
                case "momentMediaType":
                    return true;
                default:
                    return super.parseFieldCheck(myMeetFeedItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MyMeetFeedItem myMeetFeedItem, JsonGenerator jsonGenerator) throws IOException {
            String str = myMeetFeedItem.f115id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (myMeetFeedItem.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(myMeetFeedItem.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = myMeetFeedItem.sortId;
            if (str2 != null) {
                jsonGenerator.writeStringField("sortId", str2);
            }
            String str3 = myMeetFeedItem.momentId;
            if (str3 != null) {
                jsonGenerator.writeStringField("momentId", str3);
            }
            if (myMeetFeedItem.type != null) {
                jsonGenerator.writeFieldName("type");
                FeedType.JSON_ADAPTER.serialize(myMeetFeedItem.type, jsonGenerator, true);
            }
            if (myMeetFeedItem.relation != null) {
                jsonGenerator.writeFieldName("relation");
                MeetRelation.JSON_ADAPTER.serialize(myMeetFeedItem.relation, jsonGenerator, true);
            }
            if (myMeetFeedItem.overheating != null) {
                jsonGenerator.writeFieldName("overheating");
                OverHeatingStatus.JSON_ADAPTER.serialize(myMeetFeedItem.overheating, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("seeCount", myMeetFeedItem.seeCount);
            jsonGenerator.writeNumberField("lowPopSeeCount", myMeetFeedItem.lowPopSeeCount);
            if (myMeetFeedItem.pick != null) {
                jsonGenerator.writeFieldName(ODiamondStatisticsType.pick);
                PickInfo.JSON_ADAPTER.serialize(myMeetFeedItem.pick, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("readStatus", myMeetFeedItem.readStatus);
            jsonGenerator.writeBooleanField("online", myMeetFeedItem.online);
            jsonGenerator.writeBooleanField("passBy", myMeetFeedItem.passBy);
            String str4 = myMeetFeedItem.momentMediaType;
            if (str4 != null) {
                jsonGenerator.writeStringField("momentMediaType", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetFeedItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetFeedItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m511a(String str) {
        return str;
    }

    public static MyMeetFeedItem new_() {
        MyMeetFeedItem myMeetFeedItem = new MyMeetFeedItem();
        myMeetFeedItem.nullCheck();
        return myMeetFeedItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MyMeetFeedItem m14436clone() {
        MyMeetFeedItem myMeetFeedItem = new MyMeetFeedItem();
        myMeetFeedItem.f115id = this.f115id;
        List<String> list = this.userIds;
        if (list != null) {
            myMeetFeedItem.userIds = ValueObject.util_map(list, new w9j() { // from class: l.dv10
                public final Object call(Object obj) {
                    return MyMeetFeedItem.m511a((String) obj);
                }
            });
        }
        myMeetFeedItem.sortId = this.sortId;
        myMeetFeedItem.momentId = this.momentId;
        myMeetFeedItem.type = this.type;
        MeetRelation meetRelation = this.relation;
        if (meetRelation != null) {
            myMeetFeedItem.relation = meetRelation.m14112clone();
        }
        OverHeatingStatus overHeatingStatus = this.overheating;
        if (overHeatingStatus != null) {
            myMeetFeedItem.overheating = overHeatingStatus.m14714clone();
        }
        myMeetFeedItem.seeCount = this.seeCount;
        myMeetFeedItem.lowPopSeeCount = this.lowPopSeeCount;
        PickInfo pickInfo = this.pick;
        if (pickInfo != null) {
            myMeetFeedItem.pick = pickInfo.m14770clone();
        }
        myMeetFeedItem.readStatus = this.readStatus;
        myMeetFeedItem.online = this.online;
        myMeetFeedItem.passBy = this.passBy;
        myMeetFeedItem.momentMediaType = this.momentMediaType;
        return myMeetFeedItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyMeetFeedItem)) {
            return false;
        }
        MyMeetFeedItem myMeetFeedItem = (MyMeetFeedItem) obj;
        return ValueObject.util_equals(this.f115id, myMeetFeedItem.f115id) && ValueObject.util_equals(this.userIds, myMeetFeedItem.userIds) && ValueObject.util_equals(this.sortId, myMeetFeedItem.sortId) && ValueObject.util_equals(this.momentId, myMeetFeedItem.momentId) && ValueObject.util_equals(this.type, myMeetFeedItem.type) && ValueObject.util_equals(this.relation, myMeetFeedItem.relation) && ValueObject.util_equals(this.overheating, myMeetFeedItem.overheating) && this.seeCount == myMeetFeedItem.seeCount && this.lowPopSeeCount == myMeetFeedItem.lowPopSeeCount && ValueObject.util_equals(this.pick, myMeetFeedItem.pick) && this.readStatus == myMeetFeedItem.readStatus && this.online == myMeetFeedItem.online && this.passBy == myMeetFeedItem.passBy && ValueObject.util_equals(this.momentMediaType, myMeetFeedItem.momentMediaType);
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
        String str = this.f115id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.userIds;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.sortId;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.momentId;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        FeedType feedType = this.type;
        int iHashCode5 = (iHashCode4 + (feedType != null ? feedType.hashCode() : 0)) * 41;
        MeetRelation meetRelation = this.relation;
        int iHashCode6 = (iHashCode5 + (meetRelation != null ? meetRelation.hashCode() : 0)) * 41;
        OverHeatingStatus overHeatingStatus = this.overheating;
        int iHashCode7 = (((((iHashCode6 + (overHeatingStatus != null ? overHeatingStatus.hashCode() : 0)) * 41) + this.seeCount) * 41) + this.lowPopSeeCount) * 41;
        PickInfo pickInfo = this.pick;
        int iHashCode8 = (((((((iHashCode7 + (pickInfo != null ? pickInfo.hashCode() : 0)) * 41) + this.readStatus) * 41) + (this.online ? 1231 : 1237)) * 41) + (this.passBy ? 1231 : 1237)) * 41;
        String str4 = this.momentMediaType;
        int iHashCode9 = iHashCode8 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode9;
        return iHashCode9;
    }

    public void nullCheck() {
        if (this.f115id == null) {
            this.f115id = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
        if (this.sortId == null) {
            this.sortId = "";
        }
        if (this.momentId == null) {
            this.momentId = "";
        }
        if (this.type == null) {
            this.type = (FeedType) FeedType.JSON_ADAPTER.defaultEnum();
        }
        if (this.relation == null) {
            this.relation = MeetRelation.new_();
        }
        if (this.overheating == null) {
            this.overheating = OverHeatingStatus.new_();
        }
        if (this.pick == null) {
            this.pick = PickInfo.new_();
        }
        if (this.momentMediaType == null) {
            this.momentMediaType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
