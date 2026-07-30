package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.MyMeetSeeReminder;
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
public class MyMeetSeeReminder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetseereminder";

    @NonNull
    @ProtobufIndex(index = 2)
    public MyMeetSeeReminderType reminderType;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> userIds;
    public static ProtobufAdapter<MyMeetSeeReminder> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetSeeReminder>() { // from class: com.p1.mobile.putong.core.data.MyMeetSeeReminder.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyMeetSeeReminder myMeetSeeReminder) {
            List<String> list = myMeetSeeReminder.userIds;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            MyMeetSeeReminderType myMeetSeeReminderType = myMeetSeeReminder.reminderType;
            if (myMeetSeeReminderType != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, myMeetSeeReminderType, MyMeetSeeReminderType.PROTOBUF_ADAPTER);
            }
            myMeetSeeReminder.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetSeeReminder parse(nc5 nc5Var) throws IOException {
            MyMeetSeeReminder myMeetSeeReminder = new MyMeetSeeReminder();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (myMeetSeeReminder.userIds == null) {
                        myMeetSeeReminder.userIds = new ArrayList();
                    }
                    if (myMeetSeeReminder.reminderType != null) {
                        break;
                    }
                    myMeetSeeReminder.reminderType = (MyMeetSeeReminderType) MyMeetSeeReminderType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 10) {
                    myMeetSeeReminder.userIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (myMeetSeeReminder.userIds == null) {
                            myMeetSeeReminder.userIds = new ArrayList();
                        }
                        if (myMeetSeeReminder.reminderType != null) {
                            break;
                        }
                        myMeetSeeReminder.reminderType = (MyMeetSeeReminderType) MyMeetSeeReminderType.JSON_ADAPTER.defaultEnum();
                        return myMeetSeeReminder;
                    }
                    myMeetSeeReminder.reminderType = (MyMeetSeeReminderType) nc5Var.m162488l(MyMeetSeeReminderType.PROTOBUF_ADAPTER);
                }
            }
            return myMeetSeeReminder;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetSeeReminder myMeetSeeReminder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = myMeetSeeReminder.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            MyMeetSeeReminderType myMeetSeeReminderType = myMeetSeeReminder.reminderType;
            if (myMeetSeeReminderType != null) {
                codedOutputByteBufferNano.m17309K(2, myMeetSeeReminderType, MyMeetSeeReminderType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MyMeetSeeReminder> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetSeeReminder>() { // from class: com.p1.mobile.putong.core.data.MyMeetSeeReminder.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetSeeReminder.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyMeetSeeReminder newInstance() {
            return new MyMeetSeeReminder();
        }

        public boolean parseField(MyMeetSeeReminder myMeetSeeReminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userIds")) {
                myMeetSeeReminder.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("reminderType")) {
                return false;
            }
            myMeetSeeReminder.reminderType = MyMeetSeeReminderType.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(MyMeetSeeReminder myMeetSeeReminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userIds") || str.equals("reminderType")) {
                return true;
            }
            return super.parseFieldCheck(myMeetSeeReminder, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyMeetSeeReminder myMeetSeeReminder, JsonGenerator jsonGenerator) throws IOException {
            if (myMeetSeeReminder.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(myMeetSeeReminder.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (myMeetSeeReminder.reminderType != null) {
                jsonGenerator.writeFieldName("reminderType");
                MyMeetSeeReminderType.JSON_ADAPTER.serialize(myMeetSeeReminder.reminderType, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetSeeReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetSeeReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36715a(String str) {
        return str;
    }

    public static MyMeetSeeReminder new_() {
        MyMeetSeeReminder myMeetSeeReminder = new MyMeetSeeReminder();
        myMeetSeeReminder.nullCheck();
        return myMeetSeeReminder;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetSeeReminder mo225055clone() {
        MyMeetSeeReminder myMeetSeeReminder = new MyMeetSeeReminder();
        List<String> list = this.userIds;
        if (list != null) {
            myMeetSeeReminder.userIds = ValueObject.util_map(list, new qcj() { // from class: l.o320
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MyMeetSeeReminder.m36715a((String) obj);
                }
            });
        }
        myMeetSeeReminder.reminderType = this.reminderType;
        return myMeetSeeReminder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyMeetSeeReminder)) {
            return false;
        }
        MyMeetSeeReminder myMeetSeeReminder = (MyMeetSeeReminder) obj;
        return ValueObject.util_equals(this.userIds, myMeetSeeReminder.userIds) && ValueObject.util_equals(this.reminderType, myMeetSeeReminder.reminderType);
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
        MyMeetSeeReminderType myMeetSeeReminderType = this.reminderType;
        int iHashCode2 = iHashCode + (myMeetSeeReminderType != null ? myMeetSeeReminderType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
        if (this.reminderType == null) {
            this.reminderType = (MyMeetSeeReminderType) MyMeetSeeReminderType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
