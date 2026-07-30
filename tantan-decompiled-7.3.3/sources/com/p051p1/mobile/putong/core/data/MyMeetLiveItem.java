package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class MyMeetLiveItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetliveitem";

    @ProtobufIndex(index = 7)
    public boolean anonymous;

    @NonNull
    @ProtobufIndex(index = 6)
    public MeetFollow follow;

    @NonNull
    @ProtobufIndex(index = 4)
    public LiveType liveType;

    @NonNull
    @ProtobufIndex(index = 8)
    public String picksTracker;

    @ProtobufIndex(index = 3)
    public boolean picksUser;

    @NonNull
    @ProtobufIndex(index = 5)
    public MeetRelation relation;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<MyMeetLiveItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetLiveItem>() { // from class: com.p1.mobile.putong.core.data.MyMeetLiveItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyMeetLiveItem myMeetLiveItem) {
            String str = myMeetLiveItem.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = myMeetLiveItem.roomId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(3, myMeetLiveItem.picksUser);
            LiveType liveType = myMeetLiveItem.liveType;
            if (liveType != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(4, liveType, LiveType.PROTOBUF_ADAPTER);
            }
            MeetRelation meetRelation = myMeetLiveItem.relation;
            if (meetRelation != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(5, meetRelation, MeetRelation.PROTOBUF_ADAPTER);
            }
            MeetFollow meetFollow = myMeetLiveItem.follow;
            if (meetFollow != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(6, meetFollow, MeetFollow.PROTOBUF_ADAPTER);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(7, myMeetLiveItem.anonymous);
            String str3 = myMeetLiveItem.picksTracker;
            if (str3 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(8, str3);
            }
            myMeetLiveItem.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetLiveItem parse(nc5 nc5Var) throws IOException {
            MyMeetLiveItem myMeetLiveItem = new MyMeetLiveItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (myMeetLiveItem.userId == null) {
                        myMeetLiveItem.userId = "";
                    }
                    if (myMeetLiveItem.roomId == null) {
                        myMeetLiveItem.roomId = "";
                    }
                    if (myMeetLiveItem.liveType == null) {
                        myMeetLiveItem.liveType = (LiveType) LiveType.JSON_ADAPTER.defaultEnum();
                    }
                    if (myMeetLiveItem.relation == null) {
                        myMeetLiveItem.relation = MeetRelation.new_();
                    }
                    if (myMeetLiveItem.follow == null) {
                        myMeetLiveItem.follow = MeetFollow.new_();
                    }
                    if (myMeetLiveItem.picksTracker != null) {
                        break;
                    }
                    myMeetLiveItem.picksTracker = "";
                    break;
                }
                if (iM162497u == 10) {
                    myMeetLiveItem.userId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    myMeetLiveItem.roomId = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    myMeetLiveItem.picksUser = nc5Var.m162483g();
                } else if (iM162497u == 34) {
                    myMeetLiveItem.liveType = (LiveType) nc5Var.m162488l(LiveType.PROTOBUF_ADAPTER);
                } else if (iM162497u == 42) {
                    myMeetLiveItem.relation = (MeetRelation) nc5Var.m162488l(MeetRelation.PROTOBUF_ADAPTER);
                } else if (iM162497u == 50) {
                    myMeetLiveItem.follow = (MeetFollow) nc5Var.m162488l(MeetFollow.PROTOBUF_ADAPTER);
                } else if (iM162497u == 56) {
                    myMeetLiveItem.anonymous = nc5Var.m162483g();
                } else {
                    if (iM162497u != 66) {
                        if (myMeetLiveItem.userId == null) {
                            myMeetLiveItem.userId = "";
                        }
                        if (myMeetLiveItem.roomId == null) {
                            myMeetLiveItem.roomId = "";
                        }
                        if (myMeetLiveItem.liveType == null) {
                            myMeetLiveItem.liveType = (LiveType) LiveType.JSON_ADAPTER.defaultEnum();
                        }
                        if (myMeetLiveItem.relation == null) {
                            myMeetLiveItem.relation = MeetRelation.new_();
                        }
                        if (myMeetLiveItem.follow == null) {
                            myMeetLiveItem.follow = MeetFollow.new_();
                        }
                        if (myMeetLiveItem.picksTracker != null) {
                            break;
                        }
                        myMeetLiveItem.picksTracker = "";
                        return myMeetLiveItem;
                    }
                    myMeetLiveItem.picksTracker = nc5Var.m162495s();
                }
            }
            return myMeetLiveItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetLiveItem myMeetLiveItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = myMeetLiveItem.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = myMeetLiveItem.roomId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17299A(3, myMeetLiveItem.picksUser);
            LiveType liveType = myMeetLiveItem.liveType;
            if (liveType != null) {
                codedOutputByteBufferNano.m17309K(4, liveType, LiveType.PROTOBUF_ADAPTER);
            }
            MeetRelation meetRelation = myMeetLiveItem.relation;
            if (meetRelation != null) {
                codedOutputByteBufferNano.m17309K(5, meetRelation, MeetRelation.PROTOBUF_ADAPTER);
            }
            MeetFollow meetFollow = myMeetLiveItem.follow;
            if (meetFollow != null) {
                codedOutputByteBufferNano.m17309K(6, meetFollow, MeetFollow.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(7, myMeetLiveItem.anonymous);
            String str3 = myMeetLiveItem.picksTracker;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(8, str3);
            }
        }
    };
    public static JsonAdapter<MyMeetLiveItem> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetLiveItem>() { // from class: com.p1.mobile.putong.core.data.MyMeetLiveItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetLiveItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyMeetLiveItem newInstance() {
            return new MyMeetLiveItem();
        }

        public boolean parseField(MyMeetLiveItem myMeetLiveItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anonymous":
                    myMeetLiveItem.anonymous = jsonParser.getValueAsBoolean();
                    return true;
                case "picksUser":
                    myMeetLiveItem.picksUser = jsonParser.getValueAsBoolean();
                    return true;
                case "picksTracker":
                    myMeetLiveItem.picksTracker = jsonParser.getValueAsString();
                    return true;
                case "follow":
                    myMeetLiveItem.follow = MeetFollow.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "roomId":
                    myMeetLiveItem.roomId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    myMeetLiveItem.userId = jsonParser.getValueAsString();
                    return true;
                case "relation":
                    myMeetLiveItem.relation = MeetRelation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveType":
                    myMeetLiveItem.liveType = LiveType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MyMeetLiveItem myMeetLiveItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "anonymous":
                case "picksUser":
                case "picksTracker":
                case "follow":
                case "roomId":
                case "userId":
                case "relation":
                case "liveType":
                    return true;
                default:
                    return super.parseFieldCheck(myMeetLiveItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyMeetLiveItem myMeetLiveItem, JsonGenerator jsonGenerator) throws IOException {
            String str = myMeetLiveItem.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = myMeetLiveItem.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            jsonGenerator.writeBooleanField("picksUser", myMeetLiveItem.picksUser);
            if (myMeetLiveItem.liveType != null) {
                jsonGenerator.writeFieldName("liveType");
                LiveType.JSON_ADAPTER.serialize(myMeetLiveItem.liveType, jsonGenerator, true);
            }
            if (myMeetLiveItem.relation != null) {
                jsonGenerator.writeFieldName("relation");
                MeetRelation.JSON_ADAPTER.serialize(myMeetLiveItem.relation, jsonGenerator, true);
            }
            if (myMeetLiveItem.follow != null) {
                jsonGenerator.writeFieldName("follow");
                MeetFollow.JSON_ADAPTER.serialize(myMeetLiveItem.follow, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("anonymous", myMeetLiveItem.anonymous);
            String str3 = myMeetLiveItem.picksTracker;
            if (str3 != null) {
                jsonGenerator.writeStringField("picksTracker", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetLiveItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetLiveItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyMeetLiveItem new_() {
        MyMeetLiveItem myMeetLiveItem = new MyMeetLiveItem();
        myMeetLiveItem.nullCheck();
        return myMeetLiveItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetLiveItem mo225055clone() {
        MyMeetLiveItem myMeetLiveItem = new MyMeetLiveItem();
        myMeetLiveItem.userId = this.userId;
        myMeetLiveItem.roomId = this.roomId;
        myMeetLiveItem.picksUser = this.picksUser;
        myMeetLiveItem.liveType = this.liveType;
        MeetRelation meetRelation = this.relation;
        if (meetRelation != null) {
            myMeetLiveItem.relation = meetRelation.mo225055clone();
        }
        MeetFollow meetFollow = this.follow;
        if (meetFollow != null) {
            myMeetLiveItem.follow = meetFollow.mo225055clone();
        }
        myMeetLiveItem.anonymous = this.anonymous;
        myMeetLiveItem.picksTracker = this.picksTracker;
        return myMeetLiveItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyMeetLiveItem)) {
            return false;
        }
        MyMeetLiveItem myMeetLiveItem = (MyMeetLiveItem) obj;
        return ValueObject.util_equals(this.userId, myMeetLiveItem.userId) && ValueObject.util_equals(this.roomId, myMeetLiveItem.roomId) && this.picksUser == myMeetLiveItem.picksUser && ValueObject.util_equals(this.liveType, myMeetLiveItem.liveType) && ValueObject.util_equals(this.relation, myMeetLiveItem.relation) && ValueObject.util_equals(this.follow, myMeetLiveItem.follow) && this.anonymous == myMeetLiveItem.anonymous && ValueObject.util_equals(this.picksTracker, myMeetLiveItem.picksTracker);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.picksUser ? 1231 : 1237)) * 41;
        LiveType liveType = this.liveType;
        int iHashCode3 = (iHashCode2 + (liveType != null ? liveType.hashCode() : 0)) * 41;
        MeetRelation meetRelation = this.relation;
        int iHashCode4 = (iHashCode3 + (meetRelation != null ? meetRelation.hashCode() : 0)) * 41;
        MeetFollow meetFollow = this.follow;
        int iHashCode5 = (((iHashCode4 + (meetFollow != null ? meetFollow.hashCode() : 0)) * 41) + (this.anonymous ? 1231 : 1237)) * 41;
        String str3 = this.picksTracker;
        int iHashCode6 = iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveType == null) {
            this.liveType = (LiveType) LiveType.JSON_ADAPTER.defaultEnum();
        }
        if (this.relation == null) {
            this.relation = MeetRelation.new_();
        }
        if (this.follow == null) {
            this.follow = MeetFollow.new_();
        }
        if (this.picksTracker == null) {
            this.picksTracker = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
