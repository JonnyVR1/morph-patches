package com.p046p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class MyTabPostGuide extends ValueObject implements Cloneable, Serializable {
    public static final int STYLE_ONE = 1;
    public static final int STYLE_THREE = 3;
    public static final int STYLE_TWO = 2;
    public static final String TYPE = "mytabpostguide";

    @NonNull
    @ProtobufIndex(index = 4)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 3)
    public String picture;

    @ProtobufIndex(index = 7)
    public int style;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 5)
    public String topicId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String topicName;
    public static ProtobufAdapter<MyTabPostGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyTabPostGuide>() { // from class: com.p1.mobile.putong.feed.data.MyTabPostGuide.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyTabPostGuide myTabPostGuide) {
            String str = myTabPostGuide.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = myTabPostGuide.subtitle;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = myTabPostGuide.picture;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = myTabPostGuide.buttonText;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = myTabPostGuide.topicId;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = myTabPostGuide.topicName;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(7, myTabPostGuide.style);
            myTabPostGuide.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyTabPostGuide parse(nb5 nb5Var) throws IOException {
            MyTabPostGuide myTabPostGuide = new MyTabPostGuide();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (myTabPostGuide.title == null) {
                        myTabPostGuide.title = "";
                    }
                    if (myTabPostGuide.subtitle == null) {
                        myTabPostGuide.subtitle = "";
                    }
                    if (myTabPostGuide.picture == null) {
                        myTabPostGuide.picture = "";
                    }
                    if (myTabPostGuide.buttonText == null) {
                        myTabPostGuide.buttonText = "";
                    }
                    if (myTabPostGuide.topicId == null) {
                        myTabPostGuide.topicId = "";
                    }
                    if (myTabPostGuide.topicName != null) {
                        break;
                    }
                    myTabPostGuide.topicName = "";
                    break;
                }
                if (iM158752u == 10) {
                    myTabPostGuide.title = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    myTabPostGuide.subtitle = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    myTabPostGuide.picture = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    myTabPostGuide.buttonText = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    myTabPostGuide.topicId = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    myTabPostGuide.topicName = nb5Var.m158750s();
                } else {
                    if (iM158752u != 56) {
                        if (myTabPostGuide.title == null) {
                            myTabPostGuide.title = "";
                        }
                        if (myTabPostGuide.subtitle == null) {
                            myTabPostGuide.subtitle = "";
                        }
                        if (myTabPostGuide.picture == null) {
                            myTabPostGuide.picture = "";
                        }
                        if (myTabPostGuide.buttonText == null) {
                            myTabPostGuide.buttonText = "";
                        }
                        if (myTabPostGuide.topicId == null) {
                            myTabPostGuide.topicId = "";
                        }
                        if (myTabPostGuide.topicName != null) {
                            break;
                        }
                        myTabPostGuide.topicName = "";
                        return myTabPostGuide;
                    }
                    myTabPostGuide.style = nb5Var.m158741j();
                }
            }
            return myTabPostGuide;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyTabPostGuide myTabPostGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = myTabPostGuide.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = myTabPostGuide.subtitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = myTabPostGuide.picture;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = myTabPostGuide.buttonText;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = myTabPostGuide.topicId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = myTabPostGuide.topicName;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            codedOutputByteBufferNano.m17250G(7, myTabPostGuide.style);
        }
    };
    public static JsonAdapter<MyTabPostGuide> JSON_ADAPTER = new ObjectJsonAdapter<MyTabPostGuide>() { // from class: com.p1.mobile.putong.feed.data.MyTabPostGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyTabPostGuide.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyTabPostGuide newInstance() {
            return new MyTabPostGuide();
        }

        public boolean parseField(MyTabPostGuide myTabPostGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    myTabPostGuide.subtitle = jsonParser.getValueAsString();
                    return true;
                case "topicId":
                    myTabPostGuide.topicId = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    myTabPostGuide.picture = jsonParser.getValueAsString();
                    return true;
                case "style":
                    myTabPostGuide.style = jsonParser.getValueAsInt();
                    return true;
                case "title":
                    myTabPostGuide.title = jsonParser.getValueAsString();
                    return true;
                case "buttonText":
                    myTabPostGuide.buttonText = jsonParser.getValueAsString();
                    return true;
                case "topicName":
                    myTabPostGuide.topicName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MyTabPostGuide myTabPostGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subtitle":
                case "topicId":
                case "picture":
                case "style":
                case "title":
                case "buttonText":
                case "topicName":
                    return true;
                default:
                    return super.parseFieldCheck(myTabPostGuide, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyTabPostGuide myTabPostGuide, JsonGenerator jsonGenerator) throws IOException {
            String str = myTabPostGuide.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = myTabPostGuide.subtitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subtitle", str2);
            }
            String str3 = myTabPostGuide.picture;
            if (str3 != null) {
                jsonGenerator.writeStringField("picture", str3);
            }
            String str4 = myTabPostGuide.buttonText;
            if (str4 != null) {
                jsonGenerator.writeStringField("buttonText", str4);
            }
            String str5 = myTabPostGuide.topicId;
            if (str5 != null) {
                jsonGenerator.writeStringField("topicId", str5);
            }
            String str6 = myTabPostGuide.topicName;
            if (str6 != null) {
                jsonGenerator.writeStringField("topicName", str6);
            }
            jsonGenerator.writeNumberField("style", myTabPostGuide.style);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyTabPostGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyTabPostGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyTabPostGuide new_() {
        MyTabPostGuide myTabPostGuide = new MyTabPostGuide();
        myTabPostGuide.nullCheck();
        return myTabPostGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyTabPostGuide mo223809clone() {
        MyTabPostGuide myTabPostGuide = new MyTabPostGuide();
        myTabPostGuide.title = this.title;
        myTabPostGuide.subtitle = this.subtitle;
        myTabPostGuide.picture = this.picture;
        myTabPostGuide.buttonText = this.buttonText;
        myTabPostGuide.topicId = this.topicId;
        myTabPostGuide.topicName = this.topicName;
        myTabPostGuide.style = this.style;
        return myTabPostGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyTabPostGuide)) {
            return false;
        }
        MyTabPostGuide myTabPostGuide = (MyTabPostGuide) obj;
        return ValueObject.util_equals(this.title, myTabPostGuide.title) && ValueObject.util_equals(this.subtitle, myTabPostGuide.subtitle) && ValueObject.util_equals(this.picture, myTabPostGuide.picture) && ValueObject.util_equals(this.buttonText, myTabPostGuide.buttonText) && ValueObject.util_equals(this.topicId, myTabPostGuide.topicId) && ValueObject.util_equals(this.topicName, myTabPostGuide.topicName) && this.style == myTabPostGuide.style;
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
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.picture;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.buttonText;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.topicId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.topicName;
        int iHashCode6 = ((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.style;
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
        if (this.picture == null) {
            this.picture = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.topicId == null) {
            this.topicId = "";
        }
        if (this.topicName == null) {
            this.topicName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
