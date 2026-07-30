package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MyMeetSeeReminder;
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
public class MyMeetSeeReminder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetseereminder";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public MyMeetSeeReminderType reminderType;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> userIds;
    public static ProtobufAdapter<MyMeetSeeReminder> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetSeeReminder>() { // from class: com.p1.mobile.putong.core.data.MyMeetSeeReminder.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MyMeetSeeReminder myMeetSeeReminder) {
            List<String> list = myMeetSeeReminder.userIds;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            MyMeetSeeReminderType myMeetSeeReminderType = myMeetSeeReminder.reminderType;
            if (myMeetSeeReminderType != null) {
                iL += CodedOutputByteBufferNano.l(2, myMeetSeeReminderType, MyMeetSeeReminderType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) myMeetSeeReminder).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MyMeetSeeReminder m14449parse(nb5 nb5Var) throws IOException {
            MyMeetSeeReminder myMeetSeeReminder = new MyMeetSeeReminder();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (myMeetSeeReminder.userIds == null) {
                        myMeetSeeReminder.userIds = new ArrayList();
                    }
                    if (myMeetSeeReminder.reminderType != null) {
                        break;
                    }
                    myMeetSeeReminder.reminderType = (MyMeetSeeReminderType) MyMeetSeeReminderType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    myMeetSeeReminder.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (myMeetSeeReminder.userIds == null) {
                            myMeetSeeReminder.userIds = new ArrayList();
                        }
                        if (myMeetSeeReminder.reminderType != null) {
                            break;
                        }
                        myMeetSeeReminder.reminderType = (MyMeetSeeReminderType) MyMeetSeeReminderType.JSON_ADAPTER.defaultEnum();
                        return myMeetSeeReminder;
                    }
                    myMeetSeeReminder.reminderType = (MyMeetSeeReminderType) nb5Var.l(MyMeetSeeReminderType.PROTOBUF_ADAPTER);
                }
            }
            return myMeetSeeReminder;
        }

        public void serialize(MyMeetSeeReminder myMeetSeeReminder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = myMeetSeeReminder.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            MyMeetSeeReminderType myMeetSeeReminderType = myMeetSeeReminder.reminderType;
            if (myMeetSeeReminderType != null) {
                codedOutputByteBufferNano.K(2, myMeetSeeReminderType, MyMeetSeeReminderType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MyMeetSeeReminder> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetSeeReminder>() { // from class: com.p1.mobile.putong.core.data.MyMeetSeeReminder.2
        public Class getDataClass() {
            return MyMeetSeeReminder.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MyMeetSeeReminder m14450newInstance() {
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
            myMeetSeeReminder.reminderType = (MyMeetSeeReminderType) MyMeetSeeReminderType.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(MyMeetSeeReminder myMeetSeeReminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userIds") || str.equals("reminderType")) {
                return true;
            }
            return super.parseFieldCheck(myMeetSeeReminder, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetSeeReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetSeeReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m514a(String str) {
        return str;
    }

    public static MyMeetSeeReminder new_() {
        MyMeetSeeReminder myMeetSeeReminder = new MyMeetSeeReminder();
        myMeetSeeReminder.nullCheck();
        return myMeetSeeReminder;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MyMeetSeeReminder m14448clone() {
        MyMeetSeeReminder myMeetSeeReminder = new MyMeetSeeReminder();
        List<String> list = this.userIds;
        if (list != null) {
            myMeetSeeReminder.userIds = ValueObject.util_map(list, new w9j() { // from class: l.gv10
                public final Object call(Object obj) {
                    return MyMeetSeeReminder.m514a((String) obj);
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
        MyMeetSeeReminderType myMeetSeeReminderType = this.reminderType;
        int iHashCode2 = iHashCode + (myMeetSeeReminderType != null ? myMeetSeeReminderType.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
        if (this.reminderType == null) {
            this.reminderType = (MyMeetSeeReminderType) MyMeetSeeReminderType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
