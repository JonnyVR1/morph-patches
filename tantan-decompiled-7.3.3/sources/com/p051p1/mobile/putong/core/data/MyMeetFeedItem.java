package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.alibaba.fastjson.asm.Opcodes;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.MyMeetFeedItem;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class MyMeetFeedItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetfeeditem";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 10)
    public String f21195id;

    @ProtobufIndex(index = 8)
    public int lowPopSeeCount;

    @NonNull
    @ProtobufIndex(index = 3)
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
    @ProtobufIndex(index = 5)
    public MeetRelation relation;

    @ProtobufIndex(index = 7)
    public int seeCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public String sortId;

    @NonNull
    @ProtobufIndex(index = 4)
    public FeedType type;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> userIds;
    public static ProtobufAdapter<MyMeetFeedItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetFeedItem>() { // from class: com.p1.mobile.putong.core.data.MyMeetFeedItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyMeetFeedItem myMeetFeedItem) {
            List<String> list = myMeetFeedItem.userIds;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = myMeetFeedItem.sortId;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = myMeetFeedItem.momentId;
            if (str2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            FeedType feedType = myMeetFeedItem.type;
            if (feedType != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, feedType, FeedType.PROTOBUF_ADAPTER);
            }
            MeetRelation meetRelation = myMeetFeedItem.relation;
            if (meetRelation != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(5, meetRelation, MeetRelation.PROTOBUF_ADAPTER);
            }
            OverHeatingStatus overHeatingStatus = myMeetFeedItem.overheating;
            if (overHeatingStatus != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(6, overHeatingStatus, OverHeatingStatus.PROTOBUF_ADAPTER);
            }
            int iM17281h = iM17285l + CodedOutputByteBufferNano.m17281h(7, myMeetFeedItem.seeCount) + CodedOutputByteBufferNano.m17281h(8, myMeetFeedItem.lowPopSeeCount);
            PickInfo pickInfo = myMeetFeedItem.pick;
            if (pickInfo != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(9, pickInfo, PickInfo.PROTOBUF_ADAPTER);
            }
            String str3 = myMeetFeedItem.f21195id;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(10, str3);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(11, myMeetFeedItem.readStatus) + CodedOutputByteBufferNano.m17275b(12, myMeetFeedItem.online) + CodedOutputByteBufferNano.m17275b(13, myMeetFeedItem.passBy);
            String str4 = myMeetFeedItem.momentMediaType;
            if (str4 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(14, str4);
            }
            myMeetFeedItem.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetFeedItem parse(nc5 nc5Var) throws IOException {
            MyMeetFeedItem myMeetFeedItem = new MyMeetFeedItem();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (myMeetFeedItem.f21195id == null) {
                            myMeetFeedItem.f21195id = "";
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
                    case 10:
                        myMeetFeedItem.userIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        myMeetFeedItem.sortId = nc5Var.m162495s();
                        continue;
                    case 26:
                        myMeetFeedItem.momentId = nc5Var.m162495s();
                        continue;
                    case 34:
                        myMeetFeedItem.type = (FeedType) nc5Var.m162488l(FeedType.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        myMeetFeedItem.relation = (MeetRelation) nc5Var.m162488l(MeetRelation.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        myMeetFeedItem.overheating = (OverHeatingStatus) nc5Var.m162488l(OverHeatingStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 56:
                        myMeetFeedItem.seeCount = nc5Var.m162486j();
                        continue;
                    case 64:
                        myMeetFeedItem.lowPopSeeCount = nc5Var.m162486j();
                        continue;
                    case 74:
                        myMeetFeedItem.pick = (PickInfo) nc5Var.m162488l(PickInfo.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        myMeetFeedItem.f21195id = nc5Var.m162495s();
                        continue;
                    case 88:
                        myMeetFeedItem.readStatus = nc5Var.m162486j();
                        continue;
                    case Opcodes.IADD /* 96 */:
                        myMeetFeedItem.online = nc5Var.m162483g();
                        continue;
                    case 104:
                        myMeetFeedItem.passBy = nc5Var.m162483g();
                        continue;
                    case 114:
                        myMeetFeedItem.momentMediaType = nc5Var.m162495s();
                        continue;
                    default:
                        if (myMeetFeedItem.f21195id == null) {
                            myMeetFeedItem.f21195id = "";
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetFeedItem myMeetFeedItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = myMeetFeedItem.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = myMeetFeedItem.sortId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = myMeetFeedItem.momentId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            FeedType feedType = myMeetFeedItem.type;
            if (feedType != null) {
                codedOutputByteBufferNano.m17309K(4, feedType, FeedType.PROTOBUF_ADAPTER);
            }
            MeetRelation meetRelation = myMeetFeedItem.relation;
            if (meetRelation != null) {
                codedOutputByteBufferNano.m17309K(5, meetRelation, MeetRelation.PROTOBUF_ADAPTER);
            }
            OverHeatingStatus overHeatingStatus = myMeetFeedItem.overheating;
            if (overHeatingStatus != null) {
                codedOutputByteBufferNano.m17309K(6, overHeatingStatus, OverHeatingStatus.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(7, myMeetFeedItem.seeCount);
            codedOutputByteBufferNano.m17305G(8, myMeetFeedItem.lowPopSeeCount);
            PickInfo pickInfo = myMeetFeedItem.pick;
            if (pickInfo != null) {
                codedOutputByteBufferNano.m17309K(9, pickInfo, PickInfo.PROTOBUF_ADAPTER);
            }
            String str3 = myMeetFeedItem.f21195id;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(10, str3);
            }
            codedOutputByteBufferNano.m17305G(11, myMeetFeedItem.readStatus);
            codedOutputByteBufferNano.m17299A(12, myMeetFeedItem.online);
            codedOutputByteBufferNano.m17299A(13, myMeetFeedItem.passBy);
            String str4 = myMeetFeedItem.momentMediaType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(14, str4);
            }
        }
    };
    public static JsonAdapter<MyMeetFeedItem> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetFeedItem>() { // from class: com.p1.mobile.putong.core.data.MyMeetFeedItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetFeedItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyMeetFeedItem newInstance() {
            return new MyMeetFeedItem();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(MyMeetFeedItem myMeetFeedItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1012222381:
                    if (str.equals("online")) {
                        b = 0;
                    }
                    break;
                case -995382200:
                    if (str.equals("passBy")) {
                        b = 1;
                    }
                    break;
                case -896594087:
                    if (str.equals("sortId")) {
                        b = 2;
                    }
                    break;
                case -699793927:
                    if (str.equals("lowPopSeeCount")) {
                        b = 3;
                    }
                    break;
                case -554436100:
                    if (str.equals("relation")) {
                        b = 4;
                    }
                    break;
                case -500691672:
                    if (str.equals("readStatus")) {
                        b = 5;
                    }
                    break;
                case -361297093:
                    if (str.equals("momentId")) {
                        b = 6;
                    }
                    break;
                case -147154195:
                    if (str.equals("userIds")) {
                        b = 7;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 8;
                    }
                    break;
                case 3440673:
                    if (str.equals(ODiamondStatisticsType.pick)) {
                        b = 9;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 10;
                    }
                    break;
                case 431501470:
                    if (str.equals("overheating")) {
                        b = 11;
                    }
                    break;
                case 960127100:
                    if (str.equals("seeCount")) {
                        b = 12;
                    }
                    break;
                case 1795800862:
                    if (str.equals("momentMediaType")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    myMeetFeedItem.online = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    myMeetFeedItem.passBy = jsonParser.getValueAsBoolean();
                    return true;
                case 2:
                    myMeetFeedItem.sortId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    myMeetFeedItem.lowPopSeeCount = jsonParser.getValueAsInt();
                    return true;
                case 4:
                    myMeetFeedItem.relation = MeetRelation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    myMeetFeedItem.readStatus = jsonParser.getValueAsInt();
                    return true;
                case 6:
                    myMeetFeedItem.momentId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    myMeetFeedItem.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    myMeetFeedItem.f21195id = jsonParser.getValueAsString();
                    return false;
                case 9:
                    myMeetFeedItem.pick = PickInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    myMeetFeedItem.type = FeedType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 11:
                    myMeetFeedItem.overheating = OverHeatingStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    myMeetFeedItem.seeCount = jsonParser.getValueAsInt();
                    return true;
                case 13:
                    myMeetFeedItem.momentMediaType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(MyMeetFeedItem myMeetFeedItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1012222381:
                    if (str.equals("online")) {
                        b = 0;
                    }
                    break;
                case -995382200:
                    if (str.equals("passBy")) {
                        b = 1;
                    }
                    break;
                case -896594087:
                    if (str.equals("sortId")) {
                        b = 2;
                    }
                    break;
                case -699793927:
                    if (str.equals("lowPopSeeCount")) {
                        b = 3;
                    }
                    break;
                case -554436100:
                    if (str.equals("relation")) {
                        b = 4;
                    }
                    break;
                case -500691672:
                    if (str.equals("readStatus")) {
                        b = 5;
                    }
                    break;
                case -361297093:
                    if (str.equals("momentId")) {
                        b = 6;
                    }
                    break;
                case -147154195:
                    if (str.equals("userIds")) {
                        b = 7;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 8;
                    }
                    break;
                case 3440673:
                    if (str.equals(ODiamondStatisticsType.pick)) {
                        b = 9;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 10;
                    }
                    break;
                case 431501470:
                    if (str.equals("overheating")) {
                        b = 11;
                    }
                    break;
                case 960127100:
                    if (str.equals("seeCount")) {
                        b = 12;
                    }
                    break;
                case 1795800862:
                    if (str.equals("momentMediaType")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return true;
                case 8:
                    return false;
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    return true;
                default:
                    return super.parseFieldCheck(myMeetFeedItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyMeetFeedItem myMeetFeedItem, JsonGenerator jsonGenerator) throws IOException {
            String str = myMeetFeedItem.f21195id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetFeedItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetFeedItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36712a(String str) {
        return str;
    }

    public static MyMeetFeedItem new_() {
        MyMeetFeedItem myMeetFeedItem = new MyMeetFeedItem();
        myMeetFeedItem.nullCheck();
        return myMeetFeedItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetFeedItem mo225055clone() {
        MyMeetFeedItem myMeetFeedItem = new MyMeetFeedItem();
        myMeetFeedItem.f21195id = this.f21195id;
        List<String> list = this.userIds;
        if (list != null) {
            myMeetFeedItem.userIds = ValueObject.util_map(list, new qcj() { // from class: l.l320
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MyMeetFeedItem.m36712a((String) obj);
                }
            });
        }
        myMeetFeedItem.sortId = this.sortId;
        myMeetFeedItem.momentId = this.momentId;
        myMeetFeedItem.type = this.type;
        MeetRelation meetRelation = this.relation;
        if (meetRelation != null) {
            myMeetFeedItem.relation = meetRelation.mo225055clone();
        }
        OverHeatingStatus overHeatingStatus = this.overheating;
        if (overHeatingStatus != null) {
            myMeetFeedItem.overheating = overHeatingStatus.mo225055clone();
        }
        myMeetFeedItem.seeCount = this.seeCount;
        myMeetFeedItem.lowPopSeeCount = this.lowPopSeeCount;
        PickInfo pickInfo = this.pick;
        if (pickInfo != null) {
            myMeetFeedItem.pick = pickInfo.mo225055clone();
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
        return ValueObject.util_equals(this.f21195id, myMeetFeedItem.f21195id) && ValueObject.util_equals(this.userIds, myMeetFeedItem.userIds) && ValueObject.util_equals(this.sortId, myMeetFeedItem.sortId) && ValueObject.util_equals(this.momentId, myMeetFeedItem.momentId) && ValueObject.util_equals(this.type, myMeetFeedItem.type) && ValueObject.util_equals(this.relation, myMeetFeedItem.relation) && ValueObject.util_equals(this.overheating, myMeetFeedItem.overheating) && this.seeCount == myMeetFeedItem.seeCount && this.lowPopSeeCount == myMeetFeedItem.lowPopSeeCount && ValueObject.util_equals(this.pick, myMeetFeedItem.pick) && this.readStatus == myMeetFeedItem.readStatus && this.online == myMeetFeedItem.online && this.passBy == myMeetFeedItem.passBy && ValueObject.util_equals(this.momentMediaType, myMeetFeedItem.momentMediaType);
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
        String str = this.f21195id;
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
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21195id == null) {
            this.f21195id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
