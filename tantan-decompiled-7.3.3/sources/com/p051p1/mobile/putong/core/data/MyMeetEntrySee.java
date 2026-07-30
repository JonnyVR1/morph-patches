package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.MyMeetEntrySee;
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
public class MyMeetEntrySee extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentrysee";

    @ProtobufIndex(index = 1)
    public int newCount;

    @ProtobufIndex(index = 2)
    public int total;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> userIds;
    public static ProtobufAdapter<MyMeetEntrySee> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntrySee>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntrySee.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyMeetEntrySee myMeetEntrySee) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, myMeetEntrySee.newCount) + CodedOutputByteBufferNano.m17281h(2, myMeetEntrySee.total);
            List<String> list = myMeetEntrySee.userIds;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            myMeetEntrySee.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetEntrySee parse(nc5 nc5Var) throws IOException {
            MyMeetEntrySee myMeetEntrySee = new MyMeetEntrySee();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (myMeetEntrySee.userIds != null) {
                        break;
                    }
                    myMeetEntrySee.userIds = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    myMeetEntrySee.newCount = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    myMeetEntrySee.total = nc5Var.m162486j();
                } else {
                    if (iM162497u != 26) {
                        if (myMeetEntrySee.userIds != null) {
                            break;
                        }
                        myMeetEntrySee.userIds = new ArrayList();
                        return myMeetEntrySee;
                    }
                    myMeetEntrySee.userIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return myMeetEntrySee;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetEntrySee myMeetEntrySee, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, myMeetEntrySee.newCount);
            codedOutputByteBufferNano.m17305G(2, myMeetEntrySee.total);
            List<String> list = myMeetEntrySee.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MyMeetEntrySee> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntrySee>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntrySee.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetEntrySee.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyMeetEntrySee newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyMeetEntrySee myMeetEntrySee, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("newCount", myMeetEntrySee.newCount);
            jsonGenerator.writeNumberField("total", myMeetEntrySee.total);
            if (myMeetEntrySee.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(myMeetEntrySee.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntrySee) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntrySee) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36710a(String str) {
        return str;
    }

    public static MyMeetEntrySee new_() {
        MyMeetEntrySee myMeetEntrySee = new MyMeetEntrySee();
        myMeetEntrySee.nullCheck();
        return myMeetEntrySee;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetEntrySee mo225055clone() {
        MyMeetEntrySee myMeetEntrySee = new MyMeetEntrySee();
        myMeetEntrySee.newCount = this.newCount;
        myMeetEntrySee.total = this.total;
        List<String> list = this.userIds;
        if (list != null) {
            myMeetEntrySee.userIds = ValueObject.util_map(list, new qcj() { // from class: l.j320
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MyMeetEntrySee.m36710a((String) obj);
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.newCount) * 41) + this.total) * 41;
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
