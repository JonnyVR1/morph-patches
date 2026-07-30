package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p046p1.mobile.putong.core.data.MyMeetLiveItem;
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
public class MyMeetListV3 extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetlistv3";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<MyMeetFeedItem> feeds;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<MyMeetLiveItem> liveUsers;
    public static ProtobufAdapter<MyMeetListV3> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetListV3>() { // from class: com.p1.mobile.putong.core.data.MyMeetListV3.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyMeetListV3 myMeetListV3) {
            List<MyMeetFeedItem> list = myMeetListV3.feeds;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, MyMeetFeedItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<MyMeetLiveItem> list2 = myMeetListV3.liveUsers;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, MyMeetLiveItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            myMeetListV3.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetListV3 parse(nb5 nb5Var) throws IOException {
            MyMeetListV3 myMeetListV3 = new MyMeetListV3();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (myMeetListV3.feeds == null) {
                        myMeetListV3.feeds = new ArrayList();
                    }
                    if (myMeetListV3.liveUsers != null) {
                        break;
                    }
                    myMeetListV3.liveUsers = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    myMeetListV3.feeds = (List) nb5Var.m158743l(MyMeetFeedItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (myMeetListV3.feeds == null) {
                            myMeetListV3.feeds = new ArrayList();
                        }
                        if (myMeetListV3.liveUsers != null) {
                            break;
                        }
                        myMeetListV3.liveUsers = new ArrayList();
                        return myMeetListV3;
                    }
                    myMeetListV3.liveUsers = (List) nb5Var.m158743l(MyMeetLiveItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return myMeetListV3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetListV3 myMeetListV3, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<MyMeetFeedItem> list = myMeetListV3.feeds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, MyMeetFeedItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MyMeetLiveItem> list2 = myMeetListV3.liveUsers;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, MyMeetLiveItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MyMeetListV3> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetListV3>() { // from class: com.p1.mobile.putong.core.data.MyMeetListV3.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetListV3.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyMeetListV3 newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetListV3) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetListV3) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyMeetListV3 new_() {
        MyMeetListV3 myMeetListV3 = new MyMeetListV3();
        myMeetListV3.nullCheck();
        return myMeetListV3;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetListV3 mo223809clone() {
        MyMeetListV3 myMeetListV3 = new MyMeetListV3();
        List<MyMeetFeedItem> list = this.feeds;
        if (list != null) {
            myMeetListV3.feeds = ValueObject.util_map(list, new w9j() { // from class: l.ev10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MyMeetFeedItem) obj).mo223809clone();
                }
            });
        }
        List<MyMeetLiveItem> list2 = this.liveUsers;
        if (list2 != null) {
            myMeetListV3.liveUsers = ValueObject.util_map(list2, new w9j() { // from class: l.fv10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MyMeetLiveItem) obj).mo223809clone();
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
        List<MyMeetFeedItem> list = this.feeds;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<MyMeetLiveItem> list2 = this.liveUsers;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.feeds == null) {
            this.feeds = new ArrayList();
        }
        if (this.liveUsers == null) {
            this.liveUsers = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
