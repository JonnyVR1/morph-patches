package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class MyMeetExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetextra";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<MyMeetExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetExtra>() { // from class: com.p1.mobile.putong.core.data.MyMeetExtra.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MyMeetExtra myMeetExtra) {
            String str = myMeetExtra.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = myMeetExtra.subTitle;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) myMeetExtra).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MyMeetExtra m14433parse(nb5 nb5Var) throws IOException {
            MyMeetExtra myMeetExtra = new MyMeetExtra();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (myMeetExtra.title == null) {
                        myMeetExtra.title = "";
                    }
                    if (myMeetExtra.subTitle != null) {
                        break;
                    }
                    myMeetExtra.subTitle = "";
                    break;
                }
                if (iU == 10) {
                    myMeetExtra.title = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (myMeetExtra.title == null) {
                            myMeetExtra.title = "";
                        }
                        if (myMeetExtra.subTitle != null) {
                            break;
                        }
                        myMeetExtra.subTitle = "";
                        return myMeetExtra;
                    }
                    myMeetExtra.subTitle = nb5Var.s();
                }
            }
            return myMeetExtra;
        }

        public void serialize(MyMeetExtra myMeetExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = myMeetExtra.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = myMeetExtra.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<MyMeetExtra> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetExtra>() { // from class: com.p1.mobile.putong.core.data.MyMeetExtra.2
        public Class getDataClass() {
            return MyMeetExtra.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MyMeetExtra m14434newInstance() {
            return new MyMeetExtra();
        }

        public boolean parseField(MyMeetExtra myMeetExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("subTitle")) {
                myMeetExtra.subTitle = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return false;
            }
            myMeetExtra.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MyMeetExtra myMeetExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("subTitle") || str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return true;
            }
            return super.parseFieldCheck(myMeetExtra, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MyMeetExtra myMeetExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = myMeetExtra.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            String str2 = myMeetExtra.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyMeetExtra new_() {
        MyMeetExtra myMeetExtra = new MyMeetExtra();
        myMeetExtra.nullCheck();
        return myMeetExtra;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MyMeetExtra m14432clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
