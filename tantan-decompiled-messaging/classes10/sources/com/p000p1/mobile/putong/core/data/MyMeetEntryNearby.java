package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MyMeetEntryNearby;
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
public class MyMeetEntryNearby extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentrynearby";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String subText;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> userIds;
    public static ProtobufAdapter<MyMeetEntryNearby> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntryNearby>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryNearby.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MyMeetEntryNearby myMeetEntryNearby) {
            List<String> list = myMeetEntryNearby.userIds;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = myMeetEntryNearby.subText;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) myMeetEntryNearby).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MyMeetEntryNearby m14413parse(nb5 nb5Var) throws IOException {
            MyMeetEntryNearby myMeetEntryNearby = new MyMeetEntryNearby();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (myMeetEntryNearby.userIds == null) {
                        myMeetEntryNearby.userIds = new ArrayList();
                    }
                    if (myMeetEntryNearby.subText != null) {
                        break;
                    }
                    myMeetEntryNearby.subText = "";
                    break;
                }
                if (iU == 10) {
                    myMeetEntryNearby.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (myMeetEntryNearby.userIds == null) {
                            myMeetEntryNearby.userIds = new ArrayList();
                        }
                        if (myMeetEntryNearby.subText != null) {
                            break;
                        }
                        myMeetEntryNearby.subText = "";
                        return myMeetEntryNearby;
                    }
                    myMeetEntryNearby.subText = nb5Var.s();
                }
            }
            return myMeetEntryNearby;
        }

        public void serialize(MyMeetEntryNearby myMeetEntryNearby, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = myMeetEntryNearby.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = myMeetEntryNearby.subText;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<MyMeetEntryNearby> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntryNearby>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryNearby.2
        public Class getDataClass() {
            return MyMeetEntryNearby.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MyMeetEntryNearby m14414newInstance() {
            return new MyMeetEntryNearby();
        }

        public boolean parseField(MyMeetEntryNearby myMeetEntryNearby, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("subText")) {
                myMeetEntryNearby.subText = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("userIds")) {
                return false;
            }
            myMeetEntryNearby.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MyMeetEntryNearby myMeetEntryNearby, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("subText") || str.equals("userIds")) {
                return true;
            }
            return super.parseFieldCheck(myMeetEntryNearby, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MyMeetEntryNearby myMeetEntryNearby, JsonGenerator jsonGenerator) throws IOException {
            if (myMeetEntryNearby.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(myMeetEntryNearby.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = myMeetEntryNearby.subText;
            if (str != null) {
                jsonGenerator.writeStringField("subText", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntryNearby) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntryNearby) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m507a(String str) {
        return str;
    }

    public static MyMeetEntryNearby new_() {
        MyMeetEntryNearby myMeetEntryNearby = new MyMeetEntryNearby();
        myMeetEntryNearby.nullCheck();
        return myMeetEntryNearby;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MyMeetEntryNearby m14412clone() {
        MyMeetEntryNearby myMeetEntryNearby = new MyMeetEntryNearby();
        List<String> list = this.userIds;
        if (list != null) {
            myMeetEntryNearby.userIds = ValueObject.util_map(list, new w9j() { // from class: l.zu10
                public final Object call(Object obj) {
                    return MyMeetEntryNearby.m507a((String) obj);
                }
            });
        }
        myMeetEntryNearby.subText = this.subText;
        return myMeetEntryNearby;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyMeetEntryNearby)) {
            return false;
        }
        MyMeetEntryNearby myMeetEntryNearby = (MyMeetEntryNearby) obj;
        return ValueObject.util_equals(this.userIds, myMeetEntryNearby.userIds) && ValueObject.util_equals(this.subText, myMeetEntryNearby.subText);
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
        List<String> list = this.userIds;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.subText;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
        if (this.subText == null) {
            this.subText = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
