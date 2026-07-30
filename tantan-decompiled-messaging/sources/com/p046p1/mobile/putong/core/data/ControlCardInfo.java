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
public class ControlCardInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "controlcardinfo";

    @NonNull
    @ProtobufIndex(index = 5)
    public String business;

    @NonNull
    @ProtobufIndex(index = 3)
    public String cardType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String gid;

    @NonNull
    @ProtobufIndex(index = 1)
    public String resourceKey;

    @NonNull
    @ProtobufIndex(index = 2)
    public String ruleKey;
    public static ProtobufAdapter<ControlCardInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ControlCardInfo>() { // from class: com.p1.mobile.putong.core.data.ControlCardInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ControlCardInfo controlCardInfo) {
            String str = controlCardInfo.resourceKey;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = controlCardInfo.ruleKey;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = controlCardInfo.cardType;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = controlCardInfo.gid;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = controlCardInfo.business;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            controlCardInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ControlCardInfo parse(nb5 nb5Var) throws IOException {
            ControlCardInfo controlCardInfo = new ControlCardInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    controlCardInfo.resourceKey = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    controlCardInfo.ruleKey = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    controlCardInfo.cardType = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    controlCardInfo.gid = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
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
                    controlCardInfo.business = nb5Var.m158750s();
                }
            }
            return controlCardInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ControlCardInfo controlCardInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = controlCardInfo.resourceKey;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = controlCardInfo.ruleKey;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = controlCardInfo.cardType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = controlCardInfo.gid;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = controlCardInfo.business;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
        }
    };
    public static JsonAdapter<ControlCardInfo> JSON_ADAPTER = new ObjectJsonAdapter<ControlCardInfo>() { // from class: com.p1.mobile.putong.core.data.ControlCardInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ControlCardInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ControlCardInfo newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ControlCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ControlCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ControlCardInfo new_() {
        ControlCardInfo controlCardInfo = new ControlCardInfo();
        controlCardInfo.nullCheck();
        return controlCardInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ControlCardInfo mo223809clone() {
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
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
