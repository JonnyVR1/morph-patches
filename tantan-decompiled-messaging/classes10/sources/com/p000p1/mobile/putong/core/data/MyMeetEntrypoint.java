package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.UserPrivilege;
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
public class MyMeetEntrypoint extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentrypoint";

    @NonNull
    @ProtobufIndex(index = 1)
    public MyMeetEntryBoost boost;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public MyMeetEntryConversation conversation;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public MyMeetEntryFeed feed;

    @NonNull
    @ProtobufIndex(index = 4)
    public MyMeetEntryPicks picks;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public MyMeetEntrySee see;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<UserPrivilege> summarizedPrivileges;
    public static ProtobufAdapter<MyMeetEntrypoint> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntrypoint>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntrypoint.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MyMeetEntrypoint myMeetEntrypoint) {
            MyMeetEntryBoost myMeetEntryBoost = myMeetEntrypoint.boost;
            int iL = myMeetEntryBoost != null ? CodedOutputByteBufferNano.l(1, myMeetEntryBoost, MyMeetEntryBoost.PROTOBUF_ADAPTER) : 0;
            MyMeetEntryConversation myMeetEntryConversation = myMeetEntrypoint.conversation;
            if (myMeetEntryConversation != null) {
                iL += CodedOutputByteBufferNano.l(2, myMeetEntryConversation, MyMeetEntryConversation.PROTOBUF_ADAPTER);
            }
            MyMeetEntryFeed myMeetEntryFeed = myMeetEntrypoint.feed;
            if (myMeetEntryFeed != null) {
                iL += CodedOutputByteBufferNano.l(3, myMeetEntryFeed, MyMeetEntryFeed.PROTOBUF_ADAPTER);
            }
            MyMeetEntryPicks myMeetEntryPicks = myMeetEntrypoint.picks;
            if (myMeetEntryPicks != null) {
                iL += CodedOutputByteBufferNano.l(4, myMeetEntryPicks, MyMeetEntryPicks.PROTOBUF_ADAPTER);
            }
            MyMeetEntrySee myMeetEntrySee = myMeetEntrypoint.see;
            if (myMeetEntrySee != null) {
                iL += CodedOutputByteBufferNano.l(5, myMeetEntrySee, MyMeetEntrySee.PROTOBUF_ADAPTER);
            }
            List<UserPrivilege> list = myMeetEntrypoint.summarizedPrivileges;
            if (list != null) {
                iL += CodedOutputByteBufferNano.l(6, list, UserPrivilege.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) myMeetEntrypoint).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MyMeetEntrypoint m14429parse(nb5 nb5Var) throws IOException {
            MyMeetEntrypoint myMeetEntrypoint = new MyMeetEntrypoint();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    myMeetEntrypoint.boost = (MyMeetEntryBoost) nb5Var.l(MyMeetEntryBoost.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    myMeetEntrypoint.conversation = (MyMeetEntryConversation) nb5Var.l(MyMeetEntryConversation.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    myMeetEntrypoint.feed = (MyMeetEntryFeed) nb5Var.l(MyMeetEntryFeed.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    myMeetEntrypoint.picks = (MyMeetEntryPicks) nb5Var.l(MyMeetEntryPicks.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    myMeetEntrypoint.see = (MyMeetEntrySee) nb5Var.l(MyMeetEntrySee.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
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
                    myMeetEntrypoint.summarizedPrivileges = (List) nb5Var.l(UserPrivilege.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return myMeetEntrypoint;
        }

        public void serialize(MyMeetEntrypoint myMeetEntrypoint, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MyMeetEntryBoost myMeetEntryBoost = myMeetEntrypoint.boost;
            if (myMeetEntryBoost != null) {
                codedOutputByteBufferNano.K(1, myMeetEntryBoost, MyMeetEntryBoost.PROTOBUF_ADAPTER);
            }
            MyMeetEntryConversation myMeetEntryConversation = myMeetEntrypoint.conversation;
            if (myMeetEntryConversation != null) {
                codedOutputByteBufferNano.K(2, myMeetEntryConversation, MyMeetEntryConversation.PROTOBUF_ADAPTER);
            }
            MyMeetEntryFeed myMeetEntryFeed = myMeetEntrypoint.feed;
            if (myMeetEntryFeed != null) {
                codedOutputByteBufferNano.K(3, myMeetEntryFeed, MyMeetEntryFeed.PROTOBUF_ADAPTER);
            }
            MyMeetEntryPicks myMeetEntryPicks = myMeetEntrypoint.picks;
            if (myMeetEntryPicks != null) {
                codedOutputByteBufferNano.K(4, myMeetEntryPicks, MyMeetEntryPicks.PROTOBUF_ADAPTER);
            }
            MyMeetEntrySee myMeetEntrySee = myMeetEntrypoint.see;
            if (myMeetEntrySee != null) {
                codedOutputByteBufferNano.K(5, myMeetEntrySee, MyMeetEntrySee.PROTOBUF_ADAPTER);
            }
            List<UserPrivilege> list = myMeetEntrypoint.summarizedPrivileges;
            if (list != null) {
                codedOutputByteBufferNano.K(6, list, UserPrivilege.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MyMeetEntrypoint> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntrypoint>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntrypoint.2
        public Class getDataClass() {
            return MyMeetEntrypoint.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MyMeetEntrypoint m14430newInstance() {
            return new MyMeetEntrypoint();
        }

        public boolean parseField(MyMeetEntrypoint myMeetEntrypoint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "see":
                    myMeetEntrypoint.see = (MyMeetEntrySee) MyMeetEntrySee.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "feed":
                    myMeetEntrypoint.feed = (MyMeetEntryFeed) MyMeetEntryFeed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "boost":
                    myMeetEntrypoint.boost = (MyMeetEntryBoost) MyMeetEntryBoost.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "picks":
                    myMeetEntrypoint.picks = (MyMeetEntryPicks) MyMeetEntryPicks.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "summarizedPrivileges":
                    myMeetEntrypoint.summarizedPrivileges = JsonAdapter.parseArray(jsonParser, UserPrivilege.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "conversation":
                    myMeetEntrypoint.conversation = (MyMeetEntryConversation) MyMeetEntryConversation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(MyMeetEntrypoint myMeetEntrypoint, JsonGenerator jsonGenerator) throws IOException {
            if (myMeetEntrypoint.boost != null) {
                jsonGenerator.writeFieldName("boost");
                MyMeetEntryBoost.JSON_ADAPTER.serialize(myMeetEntrypoint.boost, jsonGenerator, true);
            }
            if (myMeetEntrypoint.conversation != null) {
                jsonGenerator.writeFieldName(Conversation.TYPE);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntrypoint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntrypoint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyMeetEntrypoint new_() {
        MyMeetEntrypoint myMeetEntrypoint = new MyMeetEntrypoint();
        myMeetEntrypoint.nullCheck();
        return myMeetEntrypoint;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MyMeetEntrypoint m14428clone() {
        MyMeetEntrypoint myMeetEntrypoint = new MyMeetEntrypoint();
        MyMeetEntryBoost myMeetEntryBoost = this.boost;
        if (myMeetEntryBoost != null) {
            myMeetEntrypoint.boost = myMeetEntryBoost.m14400clone();
        }
        MyMeetEntryConversation myMeetEntryConversation = this.conversation;
        if (myMeetEntryConversation != null) {
            myMeetEntrypoint.conversation = myMeetEntryConversation.m14404clone();
        }
        MyMeetEntryFeed myMeetEntryFeed = this.feed;
        if (myMeetEntryFeed != null) {
            myMeetEntrypoint.feed = myMeetEntryFeed.m14408clone();
        }
        MyMeetEntryPicks myMeetEntryPicks = this.picks;
        if (myMeetEntryPicks != null) {
            myMeetEntrypoint.picks = myMeetEntryPicks.m14416clone();
        }
        MyMeetEntrySee myMeetEntrySee = this.see;
        if (myMeetEntrySee != null) {
            myMeetEntrypoint.see = myMeetEntrySee.m14420clone();
        }
        List<UserPrivilege> list = this.summarizedPrivileges;
        if (list != null) {
            myMeetEntrypoint.summarizedPrivileges = ValueObject.util_map(list, new w9j() { // from class: l.cv10
                public final Object call(Object obj) {
                    return ((UserPrivilege) obj).m16151clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
