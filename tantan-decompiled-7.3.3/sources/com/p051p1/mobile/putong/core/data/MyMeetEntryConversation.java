package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class MyMeetEntryConversation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentryconversation";

    @ProtobufIndex(index = 1)
    public int unreadCount;
    public static ProtobufAdapter<MyMeetEntryConversation> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntryConversation>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryConversation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyMeetEntryConversation myMeetEntryConversation) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, myMeetEntryConversation.unreadCount);
            myMeetEntryConversation.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetEntryConversation parse(nc5 nc5Var) throws IOException {
            MyMeetEntryConversation myMeetEntryConversation = new MyMeetEntryConversation();
            while (nc5Var.m162497u() == 8) {
                myMeetEntryConversation.unreadCount = nc5Var.m162486j();
            }
            return myMeetEntryConversation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetEntryConversation myMeetEntryConversation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, myMeetEntryConversation.unreadCount);
        }
    };
    public static JsonAdapter<MyMeetEntryConversation> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntryConversation>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryConversation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetEntryConversation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyMeetEntryConversation newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyMeetEntryConversation myMeetEntryConversation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unreadCount", myMeetEntryConversation.unreadCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntryConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntryConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyMeetEntryConversation new_() {
        MyMeetEntryConversation myMeetEntryConversation = new MyMeetEntryConversation();
        myMeetEntryConversation.nullCheck();
        return myMeetEntryConversation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetEntryConversation mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.unreadCount;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
