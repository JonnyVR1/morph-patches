package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
public class ExtremePickItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "extremepickitem";

    @ProtobufIndex(index = 5)
    public double pickedTime;

    @ProtobufIndex(index = 2)
    public int questionID;

    @NonNull
    @ProtobufIndex(index = 3)
    public String questionText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String showText;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<ExtremePickItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExtremePickItem>() { // from class: com.p1.mobile.putong.core.data.ExtremePickItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ExtremePickItem extremePickItem) {
            String str = extremePickItem.userID;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, extremePickItem.questionID);
            String str2 = extremePickItem.questionText;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = extremePickItem.showText;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(5, extremePickItem.pickedTime);
            extremePickItem.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ExtremePickItem parse(nb5 nb5Var) throws IOException {
            ExtremePickItem extremePickItem = new ExtremePickItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (extremePickItem.userID == null) {
                        extremePickItem.userID = "";
                    }
                    if (extremePickItem.questionText == null) {
                        extremePickItem.questionText = "";
                    }
                    if (extremePickItem.showText != null) {
                        break;
                    }
                    extremePickItem.showText = "";
                    break;
                }
                if (iM158752u == 10) {
                    extremePickItem.userID = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    extremePickItem.questionID = nb5Var.m158741j();
                } else if (iM158752u == 26) {
                    extremePickItem.questionText = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    extremePickItem.showText = nb5Var.m158750s();
                } else {
                    if (iM158752u != 41) {
                        if (extremePickItem.userID == null) {
                            extremePickItem.userID = "";
                        }
                        if (extremePickItem.questionText == null) {
                            extremePickItem.questionText = "";
                        }
                        if (extremePickItem.showText != null) {
                            break;
                        }
                        extremePickItem.showText = "";
                        return extremePickItem;
                    }
                    extremePickItem.pickedTime = nb5Var.m158739h();
                }
            }
            return extremePickItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ExtremePickItem extremePickItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = extremePickItem.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, extremePickItem.questionID);
            String str2 = extremePickItem.questionText;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = extremePickItem.showText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            codedOutputByteBufferNano.m17246C(5, extremePickItem.pickedTime);
        }
    };
    public static JsonAdapter<ExtremePickItem> JSON_ADAPTER = new ObjectJsonAdapter<ExtremePickItem>() { // from class: com.p1.mobile.putong.core.data.ExtremePickItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ExtremePickItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ExtremePickItem newInstance() {
            return new ExtremePickItem();
        }

        public boolean parseField(ExtremePickItem extremePickItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pickedTime":
                    extremePickItem.pickedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "userID":
                    extremePickItem.userID = jsonParser.getValueAsString();
                    return true;
                case "showText":
                    extremePickItem.showText = jsonParser.getValueAsString();
                    return true;
                case "questionText":
                    extremePickItem.questionText = jsonParser.getValueAsString();
                    return true;
                case "questionID":
                    extremePickItem.questionID = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ExtremePickItem extremePickItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "pickedTime":
                case "userID":
                case "showText":
                case "questionText":
                case "questionID":
                    return true;
                default:
                    return super.parseFieldCheck(extremePickItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ExtremePickItem extremePickItem, JsonGenerator jsonGenerator) throws IOException {
            String str = extremePickItem.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            jsonGenerator.writeNumberField("questionID", extremePickItem.questionID);
            String str2 = extremePickItem.questionText;
            if (str2 != null) {
                jsonGenerator.writeStringField("questionText", str2);
            }
            String str3 = extremePickItem.showText;
            if (str3 != null) {
                jsonGenerator.writeStringField("showText", str3);
            }
            jsonGenerator.writeFieldName("pickedTime");
            Converter.API_TIME.serialize(Double.valueOf(extremePickItem.pickedTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExtremePickItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExtremePickItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExtremePickItem new_() {
        ExtremePickItem extremePickItem = new ExtremePickItem();
        extremePickItem.nullCheck();
        return extremePickItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ExtremePickItem mo223809clone() {
        ExtremePickItem extremePickItem = new ExtremePickItem();
        extremePickItem.userID = this.userID;
        extremePickItem.questionID = this.questionID;
        extremePickItem.questionText = this.questionText;
        extremePickItem.showText = this.showText;
        extremePickItem.pickedTime = this.pickedTime;
        return extremePickItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtremePickItem)) {
            return false;
        }
        ExtremePickItem extremePickItem = (ExtremePickItem) obj;
        return ValueObject.util_equals(this.userID, extremePickItem.userID) && this.questionID == extremePickItem.questionID && ValueObject.util_equals(this.questionText, extremePickItem.questionText) && ValueObject.util_equals(this.showText, extremePickItem.showText) && this.pickedTime == extremePickItem.pickedTime;
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
        String str = this.userID;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.questionID) * 41;
        String str2 = this.questionText;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.showText;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.pickedTime);
        int i3 = ((iHashCode2 + iHashCode3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
        if (this.questionText == null) {
            this.questionText = "";
        }
        if (this.showText == null) {
            this.showText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
