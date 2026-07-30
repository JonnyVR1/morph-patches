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
public class RepeatNetPictureDlgContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "repeatnetpicturedlgcontent";

    @NonNull
    @ProtobufIndex(index = 4)
    public String button1;

    @NonNull
    @ProtobufIndex(index = 6)
    public String button2;

    @NonNull
    @ProtobufIndex(index = 8)
    public String buttonEid1;

    @NonNull
    @ProtobufIndex(index = 9)
    public String buttonEid2;

    @NonNull
    @ProtobufIndex(index = 5)
    public String buttonLink1;

    @NonNull
    @ProtobufIndex(index = 7)
    public String buttonLink2;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle1;

    @NonNull
    @ProtobufIndex(index = 3)
    public String subTitle2;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<RepeatNetPictureDlgContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<RepeatNetPictureDlgContent>() { // from class: com.p1.mobile.putong.core.data.RepeatNetPictureDlgContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RepeatNetPictureDlgContent repeatNetPictureDlgContent) {
            String str = repeatNetPictureDlgContent.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = repeatNetPictureDlgContent.subTitle1;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = repeatNetPictureDlgContent.subTitle2;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = repeatNetPictureDlgContent.button1;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = repeatNetPictureDlgContent.buttonLink1;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = repeatNetPictureDlgContent.button2;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = repeatNetPictureDlgContent.buttonLink2;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            String str8 = repeatNetPictureDlgContent.buttonEid1;
            if (str8 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str8);
            }
            String str9 = repeatNetPictureDlgContent.buttonEid2;
            if (str9 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(9, str9);
            }
            repeatNetPictureDlgContent.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RepeatNetPictureDlgContent parse(nb5 nb5Var) throws IOException {
            RepeatNetPictureDlgContent repeatNetPictureDlgContent = new RepeatNetPictureDlgContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (repeatNetPictureDlgContent.title == null) {
                        repeatNetPictureDlgContent.title = "";
                    }
                    if (repeatNetPictureDlgContent.subTitle1 == null) {
                        repeatNetPictureDlgContent.subTitle1 = "";
                    }
                    if (repeatNetPictureDlgContent.subTitle2 == null) {
                        repeatNetPictureDlgContent.subTitle2 = "";
                    }
                    if (repeatNetPictureDlgContent.button1 == null) {
                        repeatNetPictureDlgContent.button1 = "";
                    }
                    if (repeatNetPictureDlgContent.buttonLink1 == null) {
                        repeatNetPictureDlgContent.buttonLink1 = "";
                    }
                    if (repeatNetPictureDlgContent.button2 == null) {
                        repeatNetPictureDlgContent.button2 = "";
                    }
                    if (repeatNetPictureDlgContent.buttonLink2 == null) {
                        repeatNetPictureDlgContent.buttonLink2 = "";
                    }
                    if (repeatNetPictureDlgContent.buttonEid1 == null) {
                        repeatNetPictureDlgContent.buttonEid1 = "";
                    }
                    if (repeatNetPictureDlgContent.buttonEid2 != null) {
                        break;
                    }
                    repeatNetPictureDlgContent.buttonEid2 = "";
                    break;
                }
                if (iM158752u == 10) {
                    repeatNetPictureDlgContent.title = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    repeatNetPictureDlgContent.subTitle1 = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    repeatNetPictureDlgContent.subTitle2 = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    repeatNetPictureDlgContent.button1 = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    repeatNetPictureDlgContent.buttonLink1 = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    repeatNetPictureDlgContent.button2 = nb5Var.m158750s();
                } else if (iM158752u == 58) {
                    repeatNetPictureDlgContent.buttonLink2 = nb5Var.m158750s();
                } else if (iM158752u == 66) {
                    repeatNetPictureDlgContent.buttonEid1 = nb5Var.m158750s();
                } else {
                    if (iM158752u != 74) {
                        if (repeatNetPictureDlgContent.title == null) {
                            repeatNetPictureDlgContent.title = "";
                        }
                        if (repeatNetPictureDlgContent.subTitle1 == null) {
                            repeatNetPictureDlgContent.subTitle1 = "";
                        }
                        if (repeatNetPictureDlgContent.subTitle2 == null) {
                            repeatNetPictureDlgContent.subTitle2 = "";
                        }
                        if (repeatNetPictureDlgContent.button1 == null) {
                            repeatNetPictureDlgContent.button1 = "";
                        }
                        if (repeatNetPictureDlgContent.buttonLink1 == null) {
                            repeatNetPictureDlgContent.buttonLink1 = "";
                        }
                        if (repeatNetPictureDlgContent.button2 == null) {
                            repeatNetPictureDlgContent.button2 = "";
                        }
                        if (repeatNetPictureDlgContent.buttonLink2 == null) {
                            repeatNetPictureDlgContent.buttonLink2 = "";
                        }
                        if (repeatNetPictureDlgContent.buttonEid1 == null) {
                            repeatNetPictureDlgContent.buttonEid1 = "";
                        }
                        if (repeatNetPictureDlgContent.buttonEid2 != null) {
                            break;
                        }
                        repeatNetPictureDlgContent.buttonEid2 = "";
                        return repeatNetPictureDlgContent;
                    }
                    repeatNetPictureDlgContent.buttonEid2 = nb5Var.m158750s();
                }
            }
            return repeatNetPictureDlgContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RepeatNetPictureDlgContent repeatNetPictureDlgContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = repeatNetPictureDlgContent.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = repeatNetPictureDlgContent.subTitle1;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = repeatNetPictureDlgContent.subTitle2;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = repeatNetPictureDlgContent.button1;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = repeatNetPictureDlgContent.buttonLink1;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = repeatNetPictureDlgContent.button2;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = repeatNetPictureDlgContent.buttonLink2;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            String str8 = repeatNetPictureDlgContent.buttonEid1;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(8, str8);
            }
            String str9 = repeatNetPictureDlgContent.buttonEid2;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(9, str9);
            }
        }
    };
    public static JsonAdapter<RepeatNetPictureDlgContent> JSON_ADAPTER = new ObjectJsonAdapter<RepeatNetPictureDlgContent>() { // from class: com.p1.mobile.putong.core.data.RepeatNetPictureDlgContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RepeatNetPictureDlgContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RepeatNetPictureDlgContent newInstance() {
            return new RepeatNetPictureDlgContent();
        }

        public boolean parseField(RepeatNetPictureDlgContent repeatNetPictureDlgContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "buttonLink1":
                    repeatNetPictureDlgContent.buttonLink1 = jsonParser.getValueAsString();
                    return true;
                case "buttonLink2":
                    repeatNetPictureDlgContent.buttonLink2 = jsonParser.getValueAsString();
                    return true;
                case "subTitle1":
                    repeatNetPictureDlgContent.subTitle1 = jsonParser.getValueAsString();
                    return true;
                case "subTitle2":
                    repeatNetPictureDlgContent.subTitle2 = jsonParser.getValueAsString();
                    return true;
                case "title":
                    repeatNetPictureDlgContent.title = jsonParser.getValueAsString();
                    return true;
                case "button1":
                    repeatNetPictureDlgContent.button1 = jsonParser.getValueAsString();
                    return true;
                case "button2":
                    repeatNetPictureDlgContent.button2 = jsonParser.getValueAsString();
                    return true;
                case "buttonEid1":
                    repeatNetPictureDlgContent.buttonEid1 = jsonParser.getValueAsString();
                    return true;
                case "buttonEid2":
                    repeatNetPictureDlgContent.buttonEid2 = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RepeatNetPictureDlgContent repeatNetPictureDlgContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "buttonLink1":
                case "buttonLink2":
                case "subTitle1":
                case "subTitle2":
                case "title":
                case "button1":
                case "button2":
                case "buttonEid1":
                case "buttonEid2":
                    return true;
                default:
                    return super.parseFieldCheck(repeatNetPictureDlgContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RepeatNetPictureDlgContent repeatNetPictureDlgContent, JsonGenerator jsonGenerator) throws IOException {
            String str = repeatNetPictureDlgContent.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = repeatNetPictureDlgContent.subTitle1;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle1", str2);
            }
            String str3 = repeatNetPictureDlgContent.subTitle2;
            if (str3 != null) {
                jsonGenerator.writeStringField("subTitle2", str3);
            }
            String str4 = repeatNetPictureDlgContent.button1;
            if (str4 != null) {
                jsonGenerator.writeStringField("button1", str4);
            }
            String str5 = repeatNetPictureDlgContent.buttonLink1;
            if (str5 != null) {
                jsonGenerator.writeStringField("buttonLink1", str5);
            }
            String str6 = repeatNetPictureDlgContent.button2;
            if (str6 != null) {
                jsonGenerator.writeStringField("button2", str6);
            }
            String str7 = repeatNetPictureDlgContent.buttonLink2;
            if (str7 != null) {
                jsonGenerator.writeStringField("buttonLink2", str7);
            }
            String str8 = repeatNetPictureDlgContent.buttonEid1;
            if (str8 != null) {
                jsonGenerator.writeStringField("buttonEid1", str8);
            }
            String str9 = repeatNetPictureDlgContent.buttonEid2;
            if (str9 != null) {
                jsonGenerator.writeStringField("buttonEid2", str9);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RepeatNetPictureDlgContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RepeatNetPictureDlgContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RepeatNetPictureDlgContent new_() {
        RepeatNetPictureDlgContent repeatNetPictureDlgContent = new RepeatNetPictureDlgContent();
        repeatNetPictureDlgContent.nullCheck();
        return repeatNetPictureDlgContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RepeatNetPictureDlgContent mo223809clone() {
        RepeatNetPictureDlgContent repeatNetPictureDlgContent = new RepeatNetPictureDlgContent();
        repeatNetPictureDlgContent.title = this.title;
        repeatNetPictureDlgContent.subTitle1 = this.subTitle1;
        repeatNetPictureDlgContent.subTitle2 = this.subTitle2;
        repeatNetPictureDlgContent.button1 = this.button1;
        repeatNetPictureDlgContent.buttonLink1 = this.buttonLink1;
        repeatNetPictureDlgContent.button2 = this.button2;
        repeatNetPictureDlgContent.buttonLink2 = this.buttonLink2;
        repeatNetPictureDlgContent.buttonEid1 = this.buttonEid1;
        repeatNetPictureDlgContent.buttonEid2 = this.buttonEid2;
        return repeatNetPictureDlgContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RepeatNetPictureDlgContent)) {
            return false;
        }
        RepeatNetPictureDlgContent repeatNetPictureDlgContent = (RepeatNetPictureDlgContent) obj;
        return ValueObject.util_equals(this.title, repeatNetPictureDlgContent.title) && ValueObject.util_equals(this.subTitle1, repeatNetPictureDlgContent.subTitle1) && ValueObject.util_equals(this.subTitle2, repeatNetPictureDlgContent.subTitle2) && ValueObject.util_equals(this.button1, repeatNetPictureDlgContent.button1) && ValueObject.util_equals(this.buttonLink1, repeatNetPictureDlgContent.buttonLink1) && ValueObject.util_equals(this.button2, repeatNetPictureDlgContent.button2) && ValueObject.util_equals(this.buttonLink2, repeatNetPictureDlgContent.buttonLink2) && ValueObject.util_equals(this.buttonEid1, repeatNetPictureDlgContent.buttonEid1) && ValueObject.util_equals(this.buttonEid2, repeatNetPictureDlgContent.buttonEid2);
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
        String str2 = this.subTitle1;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subTitle2;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.button1;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.buttonLink1;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.button2;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.buttonLink2;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.buttonEid1;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.buttonEid2;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle1 == null) {
            this.subTitle1 = "";
        }
        if (this.subTitle2 == null) {
            this.subTitle2 = "";
        }
        if (this.button1 == null) {
            this.button1 = "";
        }
        if (this.buttonLink1 == null) {
            this.buttonLink1 = "";
        }
        if (this.button2 == null) {
            this.button2 = "";
        }
        if (this.buttonLink2 == null) {
            this.buttonLink2 = "";
        }
        if (this.buttonEid1 == null) {
            this.buttonEid1 = "";
        }
        if (this.buttonEid2 == null) {
            this.buttonEid2 = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
