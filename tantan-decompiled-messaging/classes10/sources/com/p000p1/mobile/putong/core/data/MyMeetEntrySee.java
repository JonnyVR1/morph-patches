package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MyMeetEntrySee;
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
public class MyMeetEntrySee extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentrysee";

    @ProtobufIndex(index = 1)
    public int newCount;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int total;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> userIds;
    public static ProtobufAdapter<MyMeetEntrySee> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntrySee>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntrySee.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MyMeetEntrySee myMeetEntrySee) {
            int iH = CodedOutputByteBufferNano.h(1, myMeetEntrySee.newCount) + CodedOutputByteBufferNano.h(2, myMeetEntrySee.total);
            List<String> list = myMeetEntrySee.userIds;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) myMeetEntrySee).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MyMeetEntrySee m14421parse(nb5 nb5Var) throws IOException {
            MyMeetEntrySee myMeetEntrySee = new MyMeetEntrySee();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (myMeetEntrySee.userIds != null) {
                        break;
                    }
                    myMeetEntrySee.userIds = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    myMeetEntrySee.newCount = nb5Var.j();
                } else if (iU == 16) {
                    myMeetEntrySee.total = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (myMeetEntrySee.userIds != null) {
                            break;
                        }
                        myMeetEntrySee.userIds = new ArrayList();
                        return myMeetEntrySee;
                    }
                    myMeetEntrySee.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return myMeetEntrySee;
        }

        public void serialize(MyMeetEntrySee myMeetEntrySee, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, myMeetEntrySee.newCount);
            codedOutputByteBufferNano.G(2, myMeetEntrySee.total);
            List<String> list = myMeetEntrySee.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MyMeetEntrySee> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntrySee>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntrySee.2
        public Class getDataClass() {
            return MyMeetEntrySee.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MyMeetEntrySee m14422newInstance() {
            return new MyMeetEntrySee();
        }

        public boolean parseField(MyMeetEntrySee myMeetEntrySee, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userIds":
                    myMeetEntrySee.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "total":
                    myMeetEntrySee.total = jsonParser.getValueAsInt();
                    return true;
                case "newCount":
                    myMeetEntrySee.newCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MyMeetEntrySee myMeetEntrySee, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userIds":
                case "total":
                case "newCount":
                    return true;
                default:
                    return super.parseFieldCheck(myMeetEntrySee, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MyMeetEntrySee myMeetEntrySee, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("newCount", myMeetEntrySee.newCount);
            jsonGenerator.writeNumberField("total", myMeetEntrySee.total);
            if (myMeetEntrySee.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(myMeetEntrySee.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntrySee) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntrySee) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m509a(String str) {
        return str;
    }

    public static MyMeetEntrySee new_() {
        MyMeetEntrySee myMeetEntrySee = new MyMeetEntrySee();
        myMeetEntrySee.nullCheck();
        return myMeetEntrySee;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MyMeetEntrySee m14420clone() {
        MyMeetEntrySee myMeetEntrySee = new MyMeetEntrySee();
        myMeetEntrySee.newCount = this.newCount;
        myMeetEntrySee.total = this.total;
        List<String> list = this.userIds;
        if (list != null) {
            myMeetEntrySee.userIds = ValueObject.util_map(list, new w9j() { // from class: l.bv10
                public final Object call(Object obj) {
                    return MyMeetEntrySee.m509a((String) obj);
                }
            });
        }
        return myMeetEntrySee;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyMeetEntrySee)) {
            return false;
        }
        MyMeetEntrySee myMeetEntrySee = (MyMeetEntrySee) obj;
        return this.newCount == myMeetEntrySee.newCount && this.total == myMeetEntrySee.total && ValueObject.util_equals(this.userIds, myMeetEntrySee.userIds);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.newCount) * 41) + this.total) * 41;
        List<String> list = this.userIds;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
