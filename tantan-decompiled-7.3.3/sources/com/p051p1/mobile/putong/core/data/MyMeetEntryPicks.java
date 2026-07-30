package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.MyMeetEntryPicks;
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
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            myMeetEntryPicks.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetEntryPicks parse(nc5 nc5Var) throws IOException {
            MyMeetEntryPicks myMeetEntryPicks = new MyMeetEntryPicks();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (myMeetEntryPicks.userIds != null) {
                        break;
                    }
                    myMeetEntryPicks.userIds = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (myMeetEntryPicks.userIds != null) {
                        break;
                    }
                    myMeetEntryPicks.userIds = new ArrayList();
                    return myMeetEntryPicks;
                }
                myMeetEntryPicks.userIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return myMeetEntryPicks;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetEntryPicks myMeetEntryPicks, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = myMeetEntryPicks.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MyMeetEntryPicks> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntryPicks>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryPicks.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetEntryPicks.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyMeetEntryPicks myMeetEntryPicks, JsonGenerator jsonGenerator) throws IOException {
            if (myMeetEntryPicks.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(myMeetEntryPicks.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntryPicks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntryPicks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36709a(String str) {
        return str;
    }

    public static MyMeetEntryPicks new_() {
        MyMeetEntryPicks myMeetEntryPicks = new MyMeetEntryPicks();
        myMeetEntryPicks.nullCheck();
        return myMeetEntryPicks;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetEntryPicks mo225055clone() {
        MyMeetEntryPicks myMeetEntryPicks = new MyMeetEntryPicks();
        List<String> list = this.userIds;
        if (list != null) {
            myMeetEntryPicks.userIds = ValueObject.util_map(list, new qcj() { // from class: l.i320
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MyMeetEntryPicks.m36709a((String) obj);
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
