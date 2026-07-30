package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.MyMeetEntryPicks;
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
public class MyMeetEntryPicks extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentrypicks";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> userIds;
    public static ProtobufAdapter<MyMeetEntryPicks> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntryPicks>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryPicks.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyMeetEntryPicks myMeetEntryPicks) {
            List<String> list = myMeetEntryPicks.userIds;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            myMeetEntryPicks.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetEntryPicks parse(nb5 nb5Var) throws IOException {
            MyMeetEntryPicks myMeetEntryPicks = new MyMeetEntryPicks();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (myMeetEntryPicks.userIds != null) {
                        break;
                    }
                    myMeetEntryPicks.userIds = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (myMeetEntryPicks.userIds != null) {
                        break;
                    }
                    myMeetEntryPicks.userIds = new ArrayList();
                    return myMeetEntryPicks;
                }
                myMeetEntryPicks.userIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return myMeetEntryPicks;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetEntryPicks myMeetEntryPicks, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = myMeetEntryPicks.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MyMeetEntryPicks> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntryPicks>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryPicks.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetEntryPicks.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyMeetEntryPicks newInstance() {
            return new MyMeetEntryPicks();
        }

        public boolean parseField(MyMeetEntryPicks myMeetEntryPicks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("userIds")) {
                return false;
            }
            myMeetEntryPicks.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MyMeetEntryPicks myMeetEntryPicks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userIds")) {
                return true;
            }
            return super.parseFieldCheck(myMeetEntryPicks, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyMeetEntryPicks myMeetEntryPicks, JsonGenerator jsonGenerator) throws IOException {
            if (myMeetEntryPicks.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(myMeetEntryPicks.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntryPicks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntryPicks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35706a(String str) {
        return str;
    }

    public static MyMeetEntryPicks new_() {
        MyMeetEntryPicks myMeetEntryPicks = new MyMeetEntryPicks();
        myMeetEntryPicks.nullCheck();
        return myMeetEntryPicks;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetEntryPicks mo223809clone() {
        MyMeetEntryPicks myMeetEntryPicks = new MyMeetEntryPicks();
        List<String> list = this.userIds;
        if (list != null) {
            myMeetEntryPicks.userIds = ValueObject.util_map(list, new w9j() { // from class: l.av10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MyMeetEntryPicks.m35706a((String) obj);
                }
            });
        }
        return myMeetEntryPicks;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MyMeetEntryPicks) {
            return ValueObject.util_equals(this.userIds, ((MyMeetEntryPicks) obj).userIds);
        }
        return false;
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
        List<String> list = this.userIds;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
