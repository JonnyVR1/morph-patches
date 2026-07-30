package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p000p1.mobile.putong.core.data.MyMeetLiveItem;
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
public class MyMeetListV3 extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetlistv3";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<MyMeetFeedItem> feeds;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<MyMeetLiveItem> liveUsers;
    public static ProtobufAdapter<MyMeetListV3> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetListV3>() { // from class: com.p1.mobile.putong.core.data.MyMeetListV3.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MyMeetListV3 myMeetListV3) {
            List<MyMeetFeedItem> list = myMeetListV3.feeds;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, MyMeetFeedItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<MyMeetLiveItem> list2 = myMeetListV3.liveUsers;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, MyMeetLiveItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) myMeetListV3).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MyMeetListV3 m14441parse(nb5 nb5Var) throws IOException {
            MyMeetListV3 myMeetListV3 = new MyMeetListV3();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (myMeetListV3.feeds == null) {
                        myMeetListV3.feeds = new ArrayList();
                    }
                    if (myMeetListV3.liveUsers != null) {
                        break;
                    }
                    myMeetListV3.liveUsers = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    myMeetListV3.feeds = (List) nb5Var.l(MyMeetFeedItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (myMeetListV3.feeds == null) {
                            myMeetListV3.feeds = new ArrayList();
                        }
                        if (myMeetListV3.liveUsers != null) {
                            break;
                        }
                        myMeetListV3.liveUsers = new ArrayList();
                        return myMeetListV3;
                    }
                    myMeetListV3.liveUsers = (List) nb5Var.l(MyMeetLiveItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return myMeetListV3;
        }

        public void serialize(MyMeetListV3 myMeetListV3, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<MyMeetFeedItem> list = myMeetListV3.feeds;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, MyMeetFeedItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MyMeetLiveItem> list2 = myMeetListV3.liveUsers;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, MyMeetLiveItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MyMeetListV3> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetListV3>() { // from class: com.p1.mobile.putong.core.data.MyMeetListV3.2
        public Class getDataClass() {
            return MyMeetListV3.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MyMeetListV3 m14442newInstance() {
            return new MyMeetListV3();
        }

        public boolean parseField(MyMeetListV3 myMeetListV3, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("feeds")) {
                myMeetListV3.feeds = JsonAdapter.parseArray(jsonParser, MyMeetFeedItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("liveUsers")) {
                return false;
            }
            myMeetListV3.liveUsers = JsonAdapter.parseArray(jsonParser, MyMeetLiveItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MyMeetListV3 myMeetListV3, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("feeds") || str.equals("liveUsers")) {
                return true;
            }
            return super.parseFieldCheck(myMeetListV3, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MyMeetListV3 myMeetListV3, JsonGenerator jsonGenerator) throws IOException {
            if (myMeetListV3.feeds != null) {
                jsonGenerator.writeFieldName("feeds");
                JsonAdapter.serializeArray(myMeetListV3.feeds, jsonGenerator, MyMeetFeedItem.JSON_ADAPTER);
            }
            if (myMeetListV3.liveUsers != null) {
                jsonGenerator.writeFieldName("liveUsers");
                JsonAdapter.serializeArray(myMeetListV3.liveUsers, jsonGenerator, MyMeetLiveItem.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetListV3) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetListV3) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyMeetListV3 new_() {
        MyMeetListV3 myMeetListV3 = new MyMeetListV3();
        myMeetListV3.nullCheck();
        return myMeetListV3;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MyMeetListV3 m14440clone() {
        MyMeetListV3 myMeetListV3 = new MyMeetListV3();
        List<MyMeetFeedItem> list = this.feeds;
        if (list != null) {
            myMeetListV3.feeds = ValueObject.util_map(list, new w9j() { // from class: l.ev10
                public final Object call(Object obj) {
                    return ((MyMeetFeedItem) obj).m14436clone();
                }
            });
        }
        List<MyMeetLiveItem> list2 = this.liveUsers;
        if (list2 != null) {
            myMeetListV3.liveUsers = ValueObject.util_map(list2, new w9j() { // from class: l.fv10
                public final Object call(Object obj) {
                    return ((MyMeetLiveItem) obj).m14444clone();
                }
            });
        }
        return myMeetListV3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyMeetListV3)) {
            return false;
        }
        MyMeetListV3 myMeetListV3 = (MyMeetListV3) obj;
        return ValueObject.util_equals(this.feeds, myMeetListV3.feeds) && ValueObject.util_equals(this.liveUsers, myMeetListV3.liveUsers);
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
        List<MyMeetFeedItem> list = this.feeds;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<MyMeetLiveItem> list2 = this.liveUsers;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.feeds == null) {
            this.feeds = new ArrayList();
        }
        if (this.liveUsers == null) {
            this.liveUsers = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
