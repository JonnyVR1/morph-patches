package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Condition;
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
public class OMSPreCondition extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsprecondition";

    @NonNull
    @ProtobufIndex(index = 4)
    public String condition;

    @NonNull
    @ProtobufIndex(index = 5)
    public String fail_content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38795id;

    @NonNull
    @ProtobufIndex(index = 3)
    public OMSTemplateModeType type;
    public static ProtobufAdapter<OMSPreCondition> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSPreCondition>() { // from class: com.p1.mobile.putong.data.OMSPreCondition.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSPreCondition oMSPreCondition) {
            String str = oMSPreCondition.f38795id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            OMSTemplateModeType oMSTemplateModeType = oMSPreCondition.type;
            if (oMSTemplateModeType != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, oMSTemplateModeType, OMSTemplateModeType.PROTOBUF_ADAPTER);
            }
            OMSTemplateModeType oMSTemplateModeType2 = oMSPreCondition.type;
            if (oMSTemplateModeType2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(3, oMSTemplateModeType2.ordinal());
            }
            String str2 = oMSPreCondition.condition;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            String str3 = oMSPreCondition.fail_content;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            oMSPreCondition.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSPreCondition parse(nb5 nb5Var) throws IOException {
            OMSPreCondition oMSPreCondition = new OMSPreCondition();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSPreCondition.type == null && numValueOf != null) {
                        oMSPreCondition.type = (OMSTemplateModeType) OMSTemplateModeType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (oMSPreCondition.f38795id == null) {
                        oMSPreCondition.f38795id = "";
                    }
                    if (oMSPreCondition.type == null) {
                        oMSPreCondition.type = (OMSTemplateModeType) OMSTemplateModeType.JSON_ADAPTER.defaultEnum();
                    }
                    if (oMSPreCondition.condition == null) {
                        oMSPreCondition.condition = "";
                    }
                    if (oMSPreCondition.fail_content != null) {
                        break;
                    }
                    oMSPreCondition.fail_content = "";
                    break;
                }
                if (iM158752u == 10) {
                    oMSPreCondition.f38795id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    oMSPreCondition.type = (OMSTemplateModeType) nb5Var.m158743l(OMSTemplateModeType.PROTOBUF_ADAPTER);
                } else if (iM158752u == 24) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 34) {
                    oMSPreCondition.condition = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (oMSPreCondition.type == null && numValueOf != null) {
                            oMSPreCondition.type = (OMSTemplateModeType) OMSTemplateModeType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSPreCondition.f38795id == null) {
                            oMSPreCondition.f38795id = "";
                        }
                        if (oMSPreCondition.type == null) {
                            oMSPreCondition.type = (OMSTemplateModeType) OMSTemplateModeType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSPreCondition.condition == null) {
                            oMSPreCondition.condition = "";
                        }
                        if (oMSPreCondition.fail_content != null) {
                            break;
                        }
                        oMSPreCondition.fail_content = "";
                        return oMSPreCondition;
                    }
                    oMSPreCondition.fail_content = nb5Var.m158750s();
                }
            }
            return oMSPreCondition;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSPreCondition oMSPreCondition, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSPreCondition.f38795id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            OMSTemplateModeType oMSTemplateModeType = oMSPreCondition.type;
            if (oMSTemplateModeType != null) {
                codedOutputByteBufferNano.m17254K(2, oMSTemplateModeType, OMSTemplateModeType.PROTOBUF_ADAPTER);
            }
            OMSTemplateModeType oMSTemplateModeType2 = oMSPreCondition.type;
            if (oMSTemplateModeType2 != null) {
                codedOutputByteBufferNano.m17250G(3, oMSTemplateModeType2.ordinal());
            }
            String str2 = oMSPreCondition.condition;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
            String str3 = oMSPreCondition.fail_content;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
        }
    };
    public static JsonAdapter<OMSPreCondition> JSON_ADAPTER = new ObjectJsonAdapter<OMSPreCondition>() { // from class: com.p1.mobile.putong.data.OMSPreCondition.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSPreCondition.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSPreCondition newInstance() {
            return new OMSPreCondition();
        }

        public boolean parseField(OMSPreCondition oMSPreCondition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "condition":
                    oMSPreCondition.condition = jsonParser.getValueAsString();
                    return true;
                case "fail_content":
                    oMSPreCondition.fail_content = jsonParser.getValueAsString();
                    return true;
                case "id":
                    oMSPreCondition.f38795id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    oMSPreCondition.type = OMSTemplateModeType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSPreCondition oMSPreCondition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "condition":
                case "fail_content":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(oMSPreCondition, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSPreCondition oMSPreCondition, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSPreCondition.f38795id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (oMSPreCondition.type != null) {
                jsonGenerator.writeFieldName("type");
                OMSTemplateModeType.JSON_ADAPTER.serialize(oMSPreCondition.type, jsonGenerator, true);
            }
            String str2 = oMSPreCondition.condition;
            if (str2 != null) {
                jsonGenerator.writeStringField(Condition.TYPE, str2);
            }
            String str3 = oMSPreCondition.fail_content;
            if (str3 != null) {
                jsonGenerator.writeStringField("fail_content", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSPreCondition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSPreCondition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSPreCondition new_() {
        OMSPreCondition oMSPreCondition = new OMSPreCondition();
        oMSPreCondition.nullCheck();
        return oMSPreCondition;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSPreCondition mo223809clone() {
        OMSPreCondition oMSPreCondition = new OMSPreCondition();
        oMSPreCondition.f38795id = this.f38795id;
        oMSPreCondition.type = this.type;
        oMSPreCondition.condition = this.condition;
        oMSPreCondition.fail_content = this.fail_content;
        return oMSPreCondition;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSPreCondition)) {
            return false;
        }
        OMSPreCondition oMSPreCondition = (OMSPreCondition) obj;
        return ValueObject.util_equals(this.f38795id, oMSPreCondition.f38795id) && ValueObject.util_equals(this.type, oMSPreCondition.type) && ValueObject.util_equals(this.condition, oMSPreCondition.condition) && ValueObject.util_equals(this.fail_content, oMSPreCondition.fail_content);
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
        String str = this.f38795id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        OMSTemplateModeType oMSTemplateModeType = this.type;
        int iHashCode2 = (iHashCode + (oMSTemplateModeType != null ? oMSTemplateModeType.hashCode() : 0)) * 41;
        String str2 = this.condition;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.fail_content;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38795id == null) {
            this.f38795id = "";
        }
        if (this.type == null) {
            this.type = (OMSTemplateModeType) OMSTemplateModeType.JSON_ADAPTER.defaultEnum();
        }
        if (this.condition == null) {
            this.condition = "";
        }
        if (this.fail_content == null) {
            this.fail_content = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
