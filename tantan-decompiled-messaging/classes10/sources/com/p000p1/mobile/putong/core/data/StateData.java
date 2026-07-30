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
public class StateData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "statedata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String emotionId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String emotionText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String emotionUrl;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String sourceFlag;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<StateData> PROTOBUF_ADAPTER = new MessageNanoAdapter<StateData>() { // from class: com.p1.mobile.putong.core.data.StateData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StateData stateData) {
            String str = stateData.value;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = stateData.emotionId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = stateData.emotionText;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = stateData.emotionUrl;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = stateData.sourceFlag;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            ((MessageNano) stateData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StateData m15754parse(nb5 nb5Var) throws IOException {
            StateData stateData = new StateData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (stateData.value == null) {
                        stateData.value = "";
                    }
                    if (stateData.emotionId == null) {
                        stateData.emotionId = "";
                    }
                    if (stateData.emotionText == null) {
                        stateData.emotionText = "";
                    }
                    if (stateData.emotionUrl == null) {
                        stateData.emotionUrl = "";
                    }
                    if (stateData.sourceFlag != null) {
                        break;
                    }
                    stateData.sourceFlag = "";
                    break;
                }
                if (iU == 10) {
                    stateData.value = nb5Var.s();
                } else if (iU == 18) {
                    stateData.emotionId = nb5Var.s();
                } else if (iU == 26) {
                    stateData.emotionText = nb5Var.s();
                } else if (iU == 34) {
                    stateData.emotionUrl = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (stateData.value == null) {
                            stateData.value = "";
                        }
                        if (stateData.emotionId == null) {
                            stateData.emotionId = "";
                        }
                        if (stateData.emotionText == null) {
                            stateData.emotionText = "";
                        }
                        if (stateData.emotionUrl == null) {
                            stateData.emotionUrl = "";
                        }
                        if (stateData.sourceFlag != null) {
                            break;
                        }
                        stateData.sourceFlag = "";
                        return stateData;
                    }
                    stateData.sourceFlag = nb5Var.s();
                }
            }
            return stateData;
        }

        public void serialize(StateData stateData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stateData.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = stateData.emotionId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = stateData.emotionText;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = stateData.emotionUrl;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = stateData.sourceFlag;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
        }
    };
    public static JsonAdapter<StateData> JSON_ADAPTER = new ObjectJsonAdapter<StateData>() { // from class: com.p1.mobile.putong.core.data.StateData.2
        public Class getDataClass() {
            return StateData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public StateData m15755newInstance() {
            return new StateData();
        }

        public boolean parseField(StateData stateData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "emotionText":
                    stateData.emotionText = jsonParser.getValueAsString();
                    return true;
                case "sourceFlag":
                    stateData.sourceFlag = jsonParser.getValueAsString();
                    return true;
                case "value":
                    stateData.value = jsonParser.getValueAsString();
                    return true;
                case "emotionUrl":
                    stateData.emotionUrl = jsonParser.getValueAsString();
                    return true;
                case "emotionId":
                    stateData.emotionId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(StateData stateData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "emotionText":
                case "sourceFlag":
                case "value":
                case "emotionUrl":
                case "emotionId":
                    return true;
                default:
                    return super.parseFieldCheck(stateData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(StateData stateData, JsonGenerator jsonGenerator) throws IOException {
            String str = stateData.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = stateData.emotionId;
            if (str2 != null) {
                jsonGenerator.writeStringField("emotionId", str2);
            }
            String str3 = stateData.emotionText;
            if (str3 != null) {
                jsonGenerator.writeStringField("emotionText", str3);
            }
            String str4 = stateData.emotionUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("emotionUrl", str4);
            }
            String str5 = stateData.sourceFlag;
            if (str5 != null) {
                jsonGenerator.writeStringField("sourceFlag", str5);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StateData new_() {
        StateData stateData = new StateData();
        stateData.nullCheck();
        return stateData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StateData m15753clone() {
        StateData stateData = new StateData();
        stateData.value = this.value;
        stateData.emotionId = this.emotionId;
        stateData.emotionText = this.emotionText;
        stateData.emotionUrl = this.emotionUrl;
        stateData.sourceFlag = this.sourceFlag;
        return stateData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StateData)) {
            return false;
        }
        StateData stateData = (StateData) obj;
        return ValueObject.util_equals(this.value, stateData.value) && ValueObject.util_equals(this.emotionId, stateData.emotionId) && ValueObject.util_equals(this.emotionText, stateData.emotionText) && ValueObject.util_equals(this.emotionUrl, stateData.emotionUrl) && ValueObject.util_equals(this.sourceFlag, stateData.sourceFlag);
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
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.emotionId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.emotionText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.emotionUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.sourceFlag;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.emotionId == null) {
            this.emotionId = "";
        }
        if (this.emotionText == null) {
            this.emotionText = "";
        }
        if (this.emotionUrl == null) {
            this.emotionUrl = "";
        }
        if (this.sourceFlag == null) {
            this.sourceFlag = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
