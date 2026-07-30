package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class MyMeetExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetextra";

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<MyMeetExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetExtra>() { // from class: com.p1.mobile.putong.core.data.MyMeetExtra.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyMeetExtra myMeetExtra) {
            String str = myMeetExtra.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = myMeetExtra.subTitle;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            myMeetExtra.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetExtra parse(nb5 nb5Var) throws IOException {
            MyMeetExtra myMeetExtra = new MyMeetExtra();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (myMeetExtra.title == null) {
                        myMeetExtra.title = "";
                    }
                    if (myMeetExtra.subTitle != null) {
                        break;
                    }
                    myMeetExtra.subTitle = "";
                    break;
                }
                if (iM158752u == 10) {
                    myMeetExtra.title = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (myMeetExtra.title == null) {
                            myMeetExtra.title = "";
                        }
                        if (myMeetExtra.subTitle != null) {
                            break;
                        }
                        myMeetExtra.subTitle = "";
                        return myMeetExtra;
                    }
                    myMeetExtra.subTitle = nb5Var.m158750s();
                }
            }
            return myMeetExtra;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetExtra myMeetExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = myMeetExtra.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = myMeetExtra.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<MyMeetExtra> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetExtra>() { // from class: com.p1.mobile.putong.core.data.MyMeetExtra.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetExtra.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyMeetExtra newInstance() {
            return new MyMeetExtra();
        }

        public boolean parseField(MyMeetExtra myMeetExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("subTitle")) {
                myMeetExtra.subTitle = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            myMeetExtra.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MyMeetExtra myMeetExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("subTitle") || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(myMeetExtra, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyMeetExtra myMeetExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = myMeetExtra.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = myMeetExtra.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyMeetExtra new_() {
        MyMeetExtra myMeetExtra = new MyMeetExtra();
        myMeetExtra.nullCheck();
        return myMeetExtra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetExtra mo223809clone() {
        MyMeetExtra myMeetExtra = new MyMeetExtra();
        myMeetExtra.title = this.title;
        myMeetExtra.subTitle = this.subTitle;
        return myMeetExtra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyMeetExtra)) {
            return false;
        }
        MyMeetExtra myMeetExtra = (MyMeetExtra) obj;
        return ValueObject.util_equals(this.title, myMeetExtra.title) && ValueObject.util_equals(this.subTitle, myMeetExtra.subTitle);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
