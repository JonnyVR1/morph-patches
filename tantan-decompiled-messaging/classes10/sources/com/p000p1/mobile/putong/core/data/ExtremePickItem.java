package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class ExtremePickItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "extremepickitem";

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public double pickedTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int questionID;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String questionText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String showText;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<ExtremePickItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExtremePickItem>() { // from class: com.p1.mobile.putong.core.data.ExtremePickItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ExtremePickItem extremePickItem) {
            String str = extremePickItem.userID;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, extremePickItem.questionID);
            String str2 = extremePickItem.questionText;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = extremePickItem.showText;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            int iD = iO + CodedOutputByteBufferNano.d(5, extremePickItem.pickedTime);
            ((MessageNano) extremePickItem).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ExtremePickItem m12693parse(nb5 nb5Var) throws IOException {
            ExtremePickItem extremePickItem = new ExtremePickItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    extremePickItem.userID = nb5Var.s();
                } else if (iU == 16) {
                    extremePickItem.questionID = nb5Var.j();
                } else if (iU == 26) {
                    extremePickItem.questionText = nb5Var.s();
                } else if (iU == 34) {
                    extremePickItem.showText = nb5Var.s();
                } else {
                    if (iU != 41) {
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
                    extremePickItem.pickedTime = nb5Var.h();
                }
            }
            return extremePickItem;
        }

        public void serialize(ExtremePickItem extremePickItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = extremePickItem.userID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, extremePickItem.questionID);
            String str2 = extremePickItem.questionText;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = extremePickItem.showText;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            codedOutputByteBufferNano.C(5, extremePickItem.pickedTime);
        }
    };
    public static JsonAdapter<ExtremePickItem> JSON_ADAPTER = new ObjectJsonAdapter<ExtremePickItem>() { // from class: com.p1.mobile.putong.core.data.ExtremePickItem.2
        public Class getDataClass() {
            return ExtremePickItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ExtremePickItem m12694newInstance() {
            return new ExtremePickItem();
        }

        public boolean parseField(ExtremePickItem extremePickItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pickedTime":
                    extremePickItem.pickedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExtremePickItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExtremePickItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExtremePickItem new_() {
        ExtremePickItem extremePickItem = new ExtremePickItem();
        extremePickItem.nullCheck();
        return extremePickItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ExtremePickItem m12692clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
