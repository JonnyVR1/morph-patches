package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MyMeetEntryConversation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentryconversation";

    @ProtobufIndex(index = 1)
    public int unreadCount;
    public static ProtobufAdapter<MyMeetEntryConversation> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntryConversation>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryConversation.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MyMeetEntryConversation myMeetEntryConversation) {
            int iH = CodedOutputByteBufferNano.h(1, myMeetEntryConversation.unreadCount);
            ((MessageNano) myMeetEntryConversation).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MyMeetEntryConversation m14405parse(nb5 nb5Var) throws IOException {
            MyMeetEntryConversation myMeetEntryConversation = new MyMeetEntryConversation();
            while (nb5Var.u() == 8) {
                myMeetEntryConversation.unreadCount = nb5Var.j();
            }
            return myMeetEntryConversation;
        }

        public void serialize(MyMeetEntryConversation myMeetEntryConversation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, myMeetEntryConversation.unreadCount);
        }
    };
    public static JsonAdapter<MyMeetEntryConversation> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntryConversation>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryConversation.2
        public Class getDataClass() {
            return MyMeetEntryConversation.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MyMeetEntryConversation m14406newInstance() {
            return new MyMeetEntryConversation();
        }

        public boolean parseField(MyMeetEntryConversation myMeetEntryConversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("unreadCount")) {
                return false;
            }
            myMeetEntryConversation.unreadCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(MyMeetEntryConversation myMeetEntryConversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("unreadCount")) {
                return true;
            }
            return super.parseFieldCheck(myMeetEntryConversation, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MyMeetEntryConversation myMeetEntryConversation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unreadCount", myMeetEntryConversation.unreadCount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntryConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntryConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyMeetEntryConversation new_() {
        MyMeetEntryConversation myMeetEntryConversation = new MyMeetEntryConversation();
        myMeetEntryConversation.nullCheck();
        return myMeetEntryConversation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MyMeetEntryConversation m14404clone() {
        MyMeetEntryConversation myMeetEntryConversation = new MyMeetEntryConversation();
        myMeetEntryConversation.unreadCount = this.unreadCount;
        return myMeetEntryConversation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MyMeetEntryConversation) && this.unreadCount == ((MyMeetEntryConversation) obj).unreadCount;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.unreadCount;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
