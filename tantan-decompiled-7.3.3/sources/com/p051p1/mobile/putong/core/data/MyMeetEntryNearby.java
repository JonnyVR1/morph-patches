package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.MyMeetEntryNearby;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class MyMeetEntryNearby extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentrynearby";

    @NonNull
    @ProtobufIndex(index = 2)
    public String subText;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> userIds;
    public static ProtobufAdapter<MyMeetEntryNearby> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntryNearby>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryNearby.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyMeetEntryNearby myMeetEntryNearby) {
            List<String> list = myMeetEntryNearby.userIds;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = myMeetEntryNearby.subText;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            myMeetEntryNearby.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetEntryNearby parse(nc5 nc5Var) throws IOException {
            MyMeetEntryNearby myMeetEntryNearby = new MyMeetEntryNearby();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (myMeetEntryNearby.userIds == null) {
                        myMeetEntryNearby.userIds = new ArrayList();
                    }
                    if (myMeetEntryNearby.subText != null) {
                        break;
                    }
                    myMeetEntryNearby.subText = "";
                    break;
                }
                if (iM162497u == 10) {
                    myMeetEntryNearby.userIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (myMeetEntryNearby.userIds == null) {
                            myMeetEntryNearby.userIds = new ArrayList();
                        }
                        if (myMeetEntryNearby.subText != null) {
                            break;
                        }
                        myMeetEntryNearby.subText = "";
                        return myMeetEntryNearby;
                    }
                    myMeetEntryNearby.subText = nc5Var.m162495s();
                }
            }
            return myMeetEntryNearby;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetEntryNearby myMeetEntryNearby, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = myMeetEntryNearby.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = myMeetEntryNearby.subText;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<MyMeetEntryNearby> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntryNearby>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryNearby.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetEntryNearby.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyMeetEntryNearby newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntryNearby) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntryNearby) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36708a(String str) {
        return str;
    }

    public static MyMeetEntryNearby new_() {
        MyMeetEntryNearby myMeetEntryNearby = new MyMeetEntryNearby();
        myMeetEntryNearby.nullCheck();
        return myMeetEntryNearby;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetEntryNearby mo225055clone() {
        MyMeetEntryNearby myMeetEntryNearby = new MyMeetEntryNearby();
        List<String> list = this.userIds;
        if (list != null) {
            myMeetEntryNearby.userIds = ValueObject.util_map(list, new qcj() { // from class: l.h320
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MyMeetEntryNearby.m36708a((String) obj);
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
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.subText;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
        if (this.subText == null) {
            this.subText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
