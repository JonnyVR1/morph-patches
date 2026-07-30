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
public class ControlCardInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "controlcardinfo";

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String business;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String cardType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String gid;

    @NonNull
    @ProtobufIndex(index = 1)
    public String resourceKey;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String ruleKey;
    public static ProtobufAdapter<ControlCardInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ControlCardInfo>() { // from class: com.p1.mobile.putong.core.data.ControlCardInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ControlCardInfo controlCardInfo) {
            String str = controlCardInfo.resourceKey;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = controlCardInfo.ruleKey;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = controlCardInfo.cardType;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = controlCardInfo.gid;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = controlCardInfo.business;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            ((MessageNano) controlCardInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ControlCardInfo m12285parse(nb5 nb5Var) throws IOException {
            ControlCardInfo controlCardInfo = new ControlCardInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (controlCardInfo.resourceKey == null) {
                        controlCardInfo.resourceKey = "";
                    }
                    if (controlCardInfo.ruleKey == null) {
                        controlCardInfo.ruleKey = "";
                    }
                    if (controlCardInfo.cardType == null) {
                        controlCardInfo.cardType = "";
                    }
                    if (controlCardInfo.gid == null) {
                        controlCardInfo.gid = "";
                    }
                    if (controlCardInfo.business != null) {
                        break;
                    }
                    controlCardInfo.business = "";
                    break;
                }
                if (iU == 10) {
                    controlCardInfo.resourceKey = nb5Var.s();
                } else if (iU == 18) {
                    controlCardInfo.ruleKey = nb5Var.s();
                } else if (iU == 26) {
                    controlCardInfo.cardType = nb5Var.s();
                } else if (iU == 34) {
                    controlCardInfo.gid = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (controlCardInfo.resourceKey == null) {
                            controlCardInfo.resourceKey = "";
                        }
                        if (controlCardInfo.ruleKey == null) {
                            controlCardInfo.ruleKey = "";
                        }
                        if (controlCardInfo.cardType == null) {
                            controlCardInfo.cardType = "";
                        }
                        if (controlCardInfo.gid == null) {
                            controlCardInfo.gid = "";
                        }
                        if (controlCardInfo.business != null) {
                            break;
                        }
                        controlCardInfo.business = "";
                        return controlCardInfo;
                    }
                    controlCardInfo.business = nb5Var.s();
                }
            }
            return controlCardInfo;
        }

        public void serialize(ControlCardInfo controlCardInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = controlCardInfo.resourceKey;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = controlCardInfo.ruleKey;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = controlCardInfo.cardType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = controlCardInfo.gid;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = controlCardInfo.business;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
        }
    };
    public static JsonAdapter<ControlCardInfo> JSON_ADAPTER = new ObjectJsonAdapter<ControlCardInfo>() { // from class: com.p1.mobile.putong.core.data.ControlCardInfo.2
        public Class getDataClass() {
            return ControlCardInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ControlCardInfo m12286newInstance() {
            return new ControlCardInfo();
        }

        public boolean parseField(ControlCardInfo controlCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "business":
                    controlCardInfo.business = jsonParser.getValueAsString();
                    return true;
                case "cardType":
                    controlCardInfo.cardType = jsonParser.getValueAsString();
                    return true;
                case "gid":
                    controlCardInfo.gid = jsonParser.getValueAsString();
                    return true;
                case "resourceKey":
                    controlCardInfo.resourceKey = jsonParser.getValueAsString();
                    return true;
                case "ruleKey":
                    controlCardInfo.ruleKey = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ControlCardInfo controlCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "business":
                case "cardType":
                case "gid":
                case "resourceKey":
                case "ruleKey":
                    return true;
                default:
                    return super.parseFieldCheck(controlCardInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ControlCardInfo controlCardInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = controlCardInfo.resourceKey;
            if (str != null) {
                jsonGenerator.writeStringField("resourceKey", str);
            }
            String str2 = controlCardInfo.ruleKey;
            if (str2 != null) {
                jsonGenerator.writeStringField("ruleKey", str2);
            }
            String str3 = controlCardInfo.cardType;
            if (str3 != null) {
                jsonGenerator.writeStringField("cardType", str3);
            }
            String str4 = controlCardInfo.gid;
            if (str4 != null) {
                jsonGenerator.writeStringField("gid", str4);
            }
            String str5 = controlCardInfo.business;
            if (str5 != null) {
                jsonGenerator.writeStringField("business", str5);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ControlCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ControlCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ControlCardInfo new_() {
        ControlCardInfo controlCardInfo = new ControlCardInfo();
        controlCardInfo.nullCheck();
        return controlCardInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ControlCardInfo m12284clone() {
        ControlCardInfo controlCardInfo = new ControlCardInfo();
        controlCardInfo.resourceKey = this.resourceKey;
        controlCardInfo.ruleKey = this.ruleKey;
        controlCardInfo.cardType = this.cardType;
        controlCardInfo.gid = this.gid;
        controlCardInfo.business = this.business;
        return controlCardInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ControlCardInfo)) {
            return false;
        }
        ControlCardInfo controlCardInfo = (ControlCardInfo) obj;
        return ValueObject.util_equals(this.resourceKey, controlCardInfo.resourceKey) && ValueObject.util_equals(this.ruleKey, controlCardInfo.ruleKey) && ValueObject.util_equals(this.cardType, controlCardInfo.cardType) && ValueObject.util_equals(this.gid, controlCardInfo.gid) && ValueObject.util_equals(this.business, controlCardInfo.business);
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
        String str = this.resourceKey;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.ruleKey;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.cardType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.gid;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.business;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.resourceKey == null) {
            this.resourceKey = "";
        }
        if (this.ruleKey == null) {
            this.ruleKey = "";
        }
        if (this.cardType == null) {
            this.cardType = "";
        }
        if (this.gid == null) {
            this.gid = "";
        }
        if (this.business == null) {
            this.business = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
