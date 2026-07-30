package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class MyMeetEntryV3 extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentryv3";

    @NonNull
    @ProtobufIndex(index = 1)
    public MyMeetEntryConversation conversation;

    @NonNull
    @ProtobufIndex(index = 2)
    public MyMeetEntryFeed feed;

    @Nullable
    @ProtobufIndex(index = 5)
    public MyMeetEntryNearby nearby;

    @Nullable
    @ProtobufIndex(index = 4)
    public ODiamondFeed oDiamondFeed;

    @Nullable
    @ProtobufIndex(index = 3)
    public MyMeetSeeReminder seeReminder;
    public static ProtobufAdapter<MyMeetEntryV3> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntryV3>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryV3.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyMeetEntryV3 myMeetEntryV3) {
            MyMeetEntryConversation myMeetEntryConversation = myMeetEntryV3.conversation;
            int iM17285l = myMeetEntryConversation != null ? CodedOutputByteBufferNano.m17285l(1, myMeetEntryConversation, MyMeetEntryConversation.PROTOBUF_ADAPTER) : 0;
            MyMeetEntryFeed myMeetEntryFeed = myMeetEntryV3.feed;
            if (myMeetEntryFeed != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, myMeetEntryFeed, MyMeetEntryFeed.PROTOBUF_ADAPTER);
            }
            MyMeetSeeReminder myMeetSeeReminder = myMeetEntryV3.seeReminder;
            if (myMeetSeeReminder != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, myMeetSeeReminder, MyMeetSeeReminder.PROTOBUF_ADAPTER);
            }
            ODiamondFeed oDiamondFeed = myMeetEntryV3.oDiamondFeed;
            if (oDiamondFeed != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, oDiamondFeed, ODiamondFeed.PROTOBUF_ADAPTER);
            }
            MyMeetEntryNearby myMeetEntryNearby = myMeetEntryV3.nearby;
            if (myMeetEntryNearby != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(5, myMeetEntryNearby, MyMeetEntryNearby.PROTOBUF_ADAPTER);
            }
            myMeetEntryV3.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetEntryV3 parse(nc5 nc5Var) throws IOException {
            MyMeetEntryV3 myMeetEntryV3 = new MyMeetEntryV3();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (myMeetEntryV3.conversation == null) {
                        myMeetEntryV3.conversation = MyMeetEntryConversation.new_();
                    }
                    if (myMeetEntryV3.feed != null) {
                        break;
                    }
                    myMeetEntryV3.feed = MyMeetEntryFeed.new_();
                    break;
                }
                if (iM162497u == 10) {
                    myMeetEntryV3.conversation = (MyMeetEntryConversation) nc5Var.m162488l(MyMeetEntryConversation.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    myMeetEntryV3.feed = (MyMeetEntryFeed) nc5Var.m162488l(MyMeetEntryFeed.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    myMeetEntryV3.seeReminder = (MyMeetSeeReminder) nc5Var.m162488l(MyMeetSeeReminder.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    myMeetEntryV3.oDiamondFeed = (ODiamondFeed) nc5Var.m162488l(ODiamondFeed.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 42) {
                        if (myMeetEntryV3.conversation == null) {
                            myMeetEntryV3.conversation = MyMeetEntryConversation.new_();
                        }
                        if (myMeetEntryV3.feed != null) {
                            break;
                        }
                        myMeetEntryV3.feed = MyMeetEntryFeed.new_();
                        return myMeetEntryV3;
                    }
                    myMeetEntryV3.nearby = (MyMeetEntryNearby) nc5Var.m162488l(MyMeetEntryNearby.PROTOBUF_ADAPTER);
                }
            }
            return myMeetEntryV3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetEntryV3 myMeetEntryV3, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MyMeetEntryConversation myMeetEntryConversation = myMeetEntryV3.conversation;
            if (myMeetEntryConversation != null) {
                codedOutputByteBufferNano.m17309K(1, myMeetEntryConversation, MyMeetEntryConversation.PROTOBUF_ADAPTER);
            }
            MyMeetEntryFeed myMeetEntryFeed = myMeetEntryV3.feed;
            if (myMeetEntryFeed != null) {
                codedOutputByteBufferNano.m17309K(2, myMeetEntryFeed, MyMeetEntryFeed.PROTOBUF_ADAPTER);
            }
            MyMeetSeeReminder myMeetSeeReminder = myMeetEntryV3.seeReminder;
            if (myMeetSeeReminder != null) {
                codedOutputByteBufferNano.m17309K(3, myMeetSeeReminder, MyMeetSeeReminder.PROTOBUF_ADAPTER);
            }
            ODiamondFeed oDiamondFeed = myMeetEntryV3.oDiamondFeed;
            if (oDiamondFeed != null) {
                codedOutputByteBufferNano.m17309K(4, oDiamondFeed, ODiamondFeed.PROTOBUF_ADAPTER);
            }
            MyMeetEntryNearby myMeetEntryNearby = myMeetEntryV3.nearby;
            if (myMeetEntryNearby != null) {
                codedOutputByteBufferNano.m17309K(5, myMeetEntryNearby, MyMeetEntryNearby.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MyMeetEntryV3> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntryV3>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryV3.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetEntryV3.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyMeetEntryV3 newInstance() {
            return new MyMeetEntryV3();
        }

        public boolean parseField(MyMeetEntryV3 myMeetEntryV3, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "seeReminder":
                    myMeetEntryV3.seeReminder = MyMeetSeeReminder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "nearby":
                    myMeetEntryV3.nearby = MyMeetEntryNearby.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "feed":
                    myMeetEntryV3.feed = MyMeetEntryFeed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "conversation":
                    myMeetEntryV3.conversation = MyMeetEntryConversation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "oDiamondFeed":
                    myMeetEntryV3.oDiamondFeed = ODiamondFeed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MyMeetEntryV3 myMeetEntryV3, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "seeReminder":
                case "nearby":
                case "feed":
                case "conversation":
                case "oDiamondFeed":
                    return true;
                default:
                    return super.parseFieldCheck(myMeetEntryV3, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyMeetEntryV3 myMeetEntryV3, JsonGenerator jsonGenerator) throws IOException {
            if (myMeetEntryV3.conversation != null) {
                jsonGenerator.writeFieldName("conversation");
                MyMeetEntryConversation.JSON_ADAPTER.serialize(myMeetEntryV3.conversation, jsonGenerator, true);
            }
            if (myMeetEntryV3.feed != null) {
                jsonGenerator.writeFieldName("feed");
                MyMeetEntryFeed.JSON_ADAPTER.serialize(myMeetEntryV3.feed, jsonGenerator, true);
            }
            if (myMeetEntryV3.seeReminder != null) {
                jsonGenerator.writeFieldName("seeReminder");
                MyMeetSeeReminder.JSON_ADAPTER.serialize(myMeetEntryV3.seeReminder, jsonGenerator, true);
            }
            if (myMeetEntryV3.oDiamondFeed != null) {
                jsonGenerator.writeFieldName("oDiamondFeed");
                ODiamondFeed.JSON_ADAPTER.serialize(myMeetEntryV3.oDiamondFeed, jsonGenerator, true);
            }
            if (myMeetEntryV3.nearby != null) {
                jsonGenerator.writeFieldName("nearby");
                MyMeetEntryNearby.JSON_ADAPTER.serialize(myMeetEntryV3.nearby, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntryV3) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntryV3) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyMeetEntryV3 new_() {
        MyMeetEntryV3 myMeetEntryV3 = new MyMeetEntryV3();
        myMeetEntryV3.nullCheck();
        return myMeetEntryV3;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetEntryV3 mo225055clone() {
        MyMeetEntryV3 myMeetEntryV3 = new MyMeetEntryV3();
        MyMeetEntryConversation myMeetEntryConversation = this.conversation;
        if (myMeetEntryConversation != null) {
            myMeetEntryV3.conversation = myMeetEntryConversation.mo225055clone();
        }
        MyMeetEntryFeed myMeetEntryFeed = this.feed;
        if (myMeetEntryFeed != null) {
            myMeetEntryV3.feed = myMeetEntryFeed.mo225055clone();
        }
        MyMeetSeeReminder myMeetSeeReminder = this.seeReminder;
        if (myMeetSeeReminder != null) {
            myMeetEntryV3.seeReminder = myMeetSeeReminder.mo225055clone();
        }
        ODiamondFeed oDiamondFeed = this.oDiamondFeed;
        if (oDiamondFeed != null) {
            myMeetEntryV3.oDiamondFeed = oDiamondFeed.mo225055clone();
        }
        MyMeetEntryNearby myMeetEntryNearby = this.nearby;
        if (myMeetEntryNearby != null) {
            myMeetEntryV3.nearby = myMeetEntryNearby.mo225055clone();
        }
        return myMeetEntryV3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyMeetEntryV3)) {
            return false;
        }
        MyMeetEntryV3 myMeetEntryV3 = (MyMeetEntryV3) obj;
        return ValueObject.util_equals(this.conversation, myMeetEntryV3.conversation) && ValueObject.util_equals(this.feed, myMeetEntryV3.feed) && ValueObject.util_equals(this.seeReminder, myMeetEntryV3.seeReminder) && ValueObject.util_equals(this.oDiamondFeed, myMeetEntryV3.oDiamondFeed) && ValueObject.util_equals(this.nearby, myMeetEntryV3.nearby);
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
        MyMeetEntryConversation myMeetEntryConversation = this.conversation;
        int iHashCode = (i2 + (myMeetEntryConversation != null ? myMeetEntryConversation.hashCode() : 0)) * 41;
        MyMeetEntryFeed myMeetEntryFeed = this.feed;
        int iHashCode2 = (iHashCode + (myMeetEntryFeed != null ? myMeetEntryFeed.hashCode() : 0)) * 41;
        MyMeetSeeReminder myMeetSeeReminder = this.seeReminder;
        int iHashCode3 = (iHashCode2 + (myMeetSeeReminder != null ? myMeetSeeReminder.hashCode() : 0)) * 41;
        ODiamondFeed oDiamondFeed = this.oDiamondFeed;
        int iHashCode4 = (iHashCode3 + (oDiamondFeed != null ? oDiamondFeed.hashCode() : 0)) * 41;
        MyMeetEntryNearby myMeetEntryNearby = this.nearby;
        int iHashCode5 = iHashCode4 + (myMeetEntryNearby != null ? myMeetEntryNearby.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.conversation == null) {
            this.conversation = MyMeetEntryConversation.new_();
        }
        if (this.feed == null) {
            this.feed = MyMeetEntryFeed.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
