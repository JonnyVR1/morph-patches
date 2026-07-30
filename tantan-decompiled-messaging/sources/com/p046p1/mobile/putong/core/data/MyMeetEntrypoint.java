package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class MyMeetEntrypoint extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentrypoint";

    @NonNull
    @ProtobufIndex(index = 1)
    public MyMeetEntryBoost boost;

    @NonNull
    @ProtobufIndex(index = 2)
    public MyMeetEntryConversation conversation;

    @NonNull
    @ProtobufIndex(index = 3)
    public MyMeetEntryFeed feed;

    @NonNull
    @ProtobufIndex(index = 4)
    public MyMeetEntryPicks picks;

    @NonNull
    @ProtobufIndex(index = 5)
    public MyMeetEntrySee see;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<UserPrivilege> summarizedPrivileges;
    public static ProtobufAdapter<MyMeetEntrypoint> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntrypoint>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntrypoint.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyMeetEntrypoint myMeetEntrypoint) {
            MyMeetEntryBoost myMeetEntryBoost = myMeetEntrypoint.boost;
            int iM17230l = myMeetEntryBoost != null ? CodedOutputByteBufferNano.m17230l(1, myMeetEntryBoost, MyMeetEntryBoost.PROTOBUF_ADAPTER) : 0;
            MyMeetEntryConversation myMeetEntryConversation = myMeetEntrypoint.conversation;
            if (myMeetEntryConversation != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, myMeetEntryConversation, MyMeetEntryConversation.PROTOBUF_ADAPTER);
            }
            MyMeetEntryFeed myMeetEntryFeed = myMeetEntrypoint.feed;
            if (myMeetEntryFeed != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, myMeetEntryFeed, MyMeetEntryFeed.PROTOBUF_ADAPTER);
            }
            MyMeetEntryPicks myMeetEntryPicks = myMeetEntrypoint.picks;
            if (myMeetEntryPicks != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, myMeetEntryPicks, MyMeetEntryPicks.PROTOBUF_ADAPTER);
            }
            MyMeetEntrySee myMeetEntrySee = myMeetEntrypoint.see;
            if (myMeetEntrySee != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, myMeetEntrySee, MyMeetEntrySee.PROTOBUF_ADAPTER);
            }
            List<UserPrivilege> list = myMeetEntrypoint.summarizedPrivileges;
            if (list != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(6, list, UserPrivilege.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            myMeetEntrypoint.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetEntrypoint parse(nb5 nb5Var) throws IOException {
            MyMeetEntrypoint myMeetEntrypoint = new MyMeetEntrypoint();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (myMeetEntrypoint.boost == null) {
                        myMeetEntrypoint.boost = MyMeetEntryBoost.new_();
                    }
                    if (myMeetEntrypoint.conversation == null) {
                        myMeetEntrypoint.conversation = MyMeetEntryConversation.new_();
                    }
                    if (myMeetEntrypoint.feed == null) {
                        myMeetEntrypoint.feed = MyMeetEntryFeed.new_();
                    }
                    if (myMeetEntrypoint.picks == null) {
                        myMeetEntrypoint.picks = MyMeetEntryPicks.new_();
                    }
                    if (myMeetEntrypoint.see == null) {
                        myMeetEntrypoint.see = MyMeetEntrySee.new_();
                    }
                    if (myMeetEntrypoint.summarizedPrivileges != null) {
                        break;
                    }
                    myMeetEntrypoint.summarizedPrivileges = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    myMeetEntrypoint.boost = (MyMeetEntryBoost) nb5Var.m158743l(MyMeetEntryBoost.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    myMeetEntrypoint.conversation = (MyMeetEntryConversation) nb5Var.m158743l(MyMeetEntryConversation.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    myMeetEntrypoint.feed = (MyMeetEntryFeed) nb5Var.m158743l(MyMeetEntryFeed.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    myMeetEntrypoint.picks = (MyMeetEntryPicks) nb5Var.m158743l(MyMeetEntryPicks.PROTOBUF_ADAPTER);
                } else if (iM158752u == 42) {
                    myMeetEntrypoint.see = (MyMeetEntrySee) nb5Var.m158743l(MyMeetEntrySee.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 50) {
                        if (myMeetEntrypoint.boost == null) {
                            myMeetEntrypoint.boost = MyMeetEntryBoost.new_();
                        }
                        if (myMeetEntrypoint.conversation == null) {
                            myMeetEntrypoint.conversation = MyMeetEntryConversation.new_();
                        }
                        if (myMeetEntrypoint.feed == null) {
                            myMeetEntrypoint.feed = MyMeetEntryFeed.new_();
                        }
                        if (myMeetEntrypoint.picks == null) {
                            myMeetEntrypoint.picks = MyMeetEntryPicks.new_();
                        }
                        if (myMeetEntrypoint.see == null) {
                            myMeetEntrypoint.see = MyMeetEntrySee.new_();
                        }
                        if (myMeetEntrypoint.summarizedPrivileges != null) {
                            break;
                        }
                        myMeetEntrypoint.summarizedPrivileges = new ArrayList();
                        return myMeetEntrypoint;
                    }
                    myMeetEntrypoint.summarizedPrivileges = (List) nb5Var.m158743l(UserPrivilege.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return myMeetEntrypoint;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetEntrypoint myMeetEntrypoint, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MyMeetEntryBoost myMeetEntryBoost = myMeetEntrypoint.boost;
            if (myMeetEntryBoost != null) {
                codedOutputByteBufferNano.m17254K(1, myMeetEntryBoost, MyMeetEntryBoost.PROTOBUF_ADAPTER);
            }
            MyMeetEntryConversation myMeetEntryConversation = myMeetEntrypoint.conversation;
            if (myMeetEntryConversation != null) {
                codedOutputByteBufferNano.m17254K(2, myMeetEntryConversation, MyMeetEntryConversation.PROTOBUF_ADAPTER);
            }
            MyMeetEntryFeed myMeetEntryFeed = myMeetEntrypoint.feed;
            if (myMeetEntryFeed != null) {
                codedOutputByteBufferNano.m17254K(3, myMeetEntryFeed, MyMeetEntryFeed.PROTOBUF_ADAPTER);
            }
            MyMeetEntryPicks myMeetEntryPicks = myMeetEntrypoint.picks;
            if (myMeetEntryPicks != null) {
                codedOutputByteBufferNano.m17254K(4, myMeetEntryPicks, MyMeetEntryPicks.PROTOBUF_ADAPTER);
            }
            MyMeetEntrySee myMeetEntrySee = myMeetEntrypoint.see;
            if (myMeetEntrySee != null) {
                codedOutputByteBufferNano.m17254K(5, myMeetEntrySee, MyMeetEntrySee.PROTOBUF_ADAPTER);
            }
            List<UserPrivilege> list = myMeetEntrypoint.summarizedPrivileges;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(6, list, UserPrivilege.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MyMeetEntrypoint> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntrypoint>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntrypoint.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetEntrypoint.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyMeetEntrypoint newInstance() {
            return new MyMeetEntrypoint();
        }

        public boolean parseField(MyMeetEntrypoint myMeetEntrypoint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "see":
                    myMeetEntrypoint.see = MyMeetEntrySee.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "feed":
                    myMeetEntrypoint.feed = MyMeetEntryFeed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "boost":
                    myMeetEntrypoint.boost = MyMeetEntryBoost.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "picks":
                    myMeetEntrypoint.picks = MyMeetEntryPicks.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "summarizedPrivileges":
                    myMeetEntrypoint.summarizedPrivileges = JsonAdapter.parseArray(jsonParser, UserPrivilege.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "conversation":
                    myMeetEntrypoint.conversation = MyMeetEntryConversation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MyMeetEntrypoint myMeetEntrypoint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "see":
                case "feed":
                case "boost":
                case "picks":
                case "summarizedPrivileges":
                case "conversation":
                    return true;
                default:
                    return super.parseFieldCheck(myMeetEntrypoint, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyMeetEntrypoint myMeetEntrypoint, JsonGenerator jsonGenerator) throws IOException {
            if (myMeetEntrypoint.boost != null) {
                jsonGenerator.writeFieldName("boost");
                MyMeetEntryBoost.JSON_ADAPTER.serialize(myMeetEntrypoint.boost, jsonGenerator, true);
            }
            if (myMeetEntrypoint.conversation != null) {
                jsonGenerator.writeFieldName("conversation");
                MyMeetEntryConversation.JSON_ADAPTER.serialize(myMeetEntrypoint.conversation, jsonGenerator, true);
            }
            if (myMeetEntrypoint.feed != null) {
                jsonGenerator.writeFieldName("feed");
                MyMeetEntryFeed.JSON_ADAPTER.serialize(myMeetEntrypoint.feed, jsonGenerator, true);
            }
            if (myMeetEntrypoint.picks != null) {
                jsonGenerator.writeFieldName("picks");
                MyMeetEntryPicks.JSON_ADAPTER.serialize(myMeetEntrypoint.picks, jsonGenerator, true);
            }
            if (myMeetEntrypoint.see != null) {
                jsonGenerator.writeFieldName("see");
                MyMeetEntrySee.JSON_ADAPTER.serialize(myMeetEntrypoint.see, jsonGenerator, true);
            }
            if (myMeetEntrypoint.summarizedPrivileges != null) {
                jsonGenerator.writeFieldName("summarizedPrivileges");
                JsonAdapter.serializeArray(myMeetEntrypoint.summarizedPrivileges, jsonGenerator, UserPrivilege.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntrypoint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntrypoint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyMeetEntrypoint new_() {
        MyMeetEntrypoint myMeetEntrypoint = new MyMeetEntrypoint();
        myMeetEntrypoint.nullCheck();
        return myMeetEntrypoint;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetEntrypoint mo223809clone() {
        MyMeetEntrypoint myMeetEntrypoint = new MyMeetEntrypoint();
        MyMeetEntryBoost myMeetEntryBoost = this.boost;
        if (myMeetEntryBoost != null) {
            myMeetEntrypoint.boost = myMeetEntryBoost.mo223809clone();
        }
        MyMeetEntryConversation myMeetEntryConversation = this.conversation;
        if (myMeetEntryConversation != null) {
            myMeetEntrypoint.conversation = myMeetEntryConversation.mo223809clone();
        }
        MyMeetEntryFeed myMeetEntryFeed = this.feed;
        if (myMeetEntryFeed != null) {
            myMeetEntrypoint.feed = myMeetEntryFeed.mo223809clone();
        }
        MyMeetEntryPicks myMeetEntryPicks = this.picks;
        if (myMeetEntryPicks != null) {
            myMeetEntrypoint.picks = myMeetEntryPicks.mo223809clone();
        }
        MyMeetEntrySee myMeetEntrySee = this.see;
        if (myMeetEntrySee != null) {
            myMeetEntrypoint.see = myMeetEntrySee.mo223809clone();
        }
        List<UserPrivilege> list = this.summarizedPrivileges;
        if (list != null) {
            myMeetEntrypoint.summarizedPrivileges = ValueObject.util_map(list, new w9j() { // from class: l.cv10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((UserPrivilege) obj).mo223809clone();
                }
            });
        }
        return myMeetEntrypoint;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyMeetEntrypoint)) {
            return false;
        }
        MyMeetEntrypoint myMeetEntrypoint = (MyMeetEntrypoint) obj;
        return ValueObject.util_equals(this.boost, myMeetEntrypoint.boost) && ValueObject.util_equals(this.conversation, myMeetEntrypoint.conversation) && ValueObject.util_equals(this.feed, myMeetEntrypoint.feed) && ValueObject.util_equals(this.picks, myMeetEntrypoint.picks) && ValueObject.util_equals(this.see, myMeetEntrypoint.see) && ValueObject.util_equals(this.summarizedPrivileges, myMeetEntrypoint.summarizedPrivileges);
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
        MyMeetEntryBoost myMeetEntryBoost = this.boost;
        int iHashCode = (i2 + (myMeetEntryBoost != null ? myMeetEntryBoost.hashCode() : 0)) * 41;
        MyMeetEntryConversation myMeetEntryConversation = this.conversation;
        int iHashCode2 = (iHashCode + (myMeetEntryConversation != null ? myMeetEntryConversation.hashCode() : 0)) * 41;
        MyMeetEntryFeed myMeetEntryFeed = this.feed;
        int iHashCode3 = (iHashCode2 + (myMeetEntryFeed != null ? myMeetEntryFeed.hashCode() : 0)) * 41;
        MyMeetEntryPicks myMeetEntryPicks = this.picks;
        int iHashCode4 = (iHashCode3 + (myMeetEntryPicks != null ? myMeetEntryPicks.hashCode() : 0)) * 41;
        MyMeetEntrySee myMeetEntrySee = this.see;
        int iHashCode5 = (iHashCode4 + (myMeetEntrySee != null ? myMeetEntrySee.hashCode() : 0)) * 41;
        List<UserPrivilege> list = this.summarizedPrivileges;
        int iHashCode6 = iHashCode5 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.boost == null) {
            this.boost = MyMeetEntryBoost.new_();
        }
        if (this.conversation == null) {
            this.conversation = MyMeetEntryConversation.new_();
        }
        if (this.feed == null) {
            this.feed = MyMeetEntryFeed.new_();
        }
        if (this.picks == null) {
            this.picks = MyMeetEntryPicks.new_();
        }
        if (this.see == null) {
            this.see = MyMeetEntrySee.new_();
        }
        if (this.summarizedPrivileges == null) {
            this.summarizedPrivileges = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
