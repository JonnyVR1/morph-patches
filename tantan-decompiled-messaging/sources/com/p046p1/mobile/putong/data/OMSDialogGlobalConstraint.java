package com.p046p1.mobile.putong.data;

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
public class OMSDialogGlobalConstraint extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsdialogglobalconstraint";

    @ProtobufIndex(index = 1)
    public int count;

    @NonNull
    @ProtobufIndex(index = 3)
    public OmsConstraintDimension dimension;

    @ProtobufIndex(index = 2)
    public int sessionCount;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;
    public static ProtobufAdapter<OMSDialogGlobalConstraint> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSDialogGlobalConstraint>() { // from class: com.p1.mobile.putong.data.OMSDialogGlobalConstraint.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSDialogGlobalConstraint oMSDialogGlobalConstraint) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, oMSDialogGlobalConstraint.count) + CodedOutputByteBufferNano.m17226h(2, oMSDialogGlobalConstraint.sessionCount);
            OmsConstraintDimension omsConstraintDimension = oMSDialogGlobalConstraint.dimension;
            if (omsConstraintDimension != null) {
                iM17226h += CodedOutputByteBufferNano.m17226h(3, omsConstraintDimension.ordinal());
            }
            String str = oMSDialogGlobalConstraint.type;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str);
            }
            OmsConstraintDimension omsConstraintDimension2 = oMSDialogGlobalConstraint.dimension;
            if (omsConstraintDimension2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(5, omsConstraintDimension2, OmsConstraintDimension.PROTOBUF_ADAPTER);
            }
            oMSDialogGlobalConstraint.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSDialogGlobalConstraint parse(nb5 nb5Var) throws IOException {
            OMSDialogGlobalConstraint oMSDialogGlobalConstraint = new OMSDialogGlobalConstraint();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSDialogGlobalConstraint.dimension == null && numValueOf != null) {
                        oMSDialogGlobalConstraint.dimension = (OmsConstraintDimension) OmsConstraintDimension.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (oMSDialogGlobalConstraint.dimension == null) {
                        oMSDialogGlobalConstraint.dimension = (OmsConstraintDimension) OmsConstraintDimension.JSON_ADAPTER.defaultEnum();
                    }
                    if (oMSDialogGlobalConstraint.type != null) {
                        break;
                    }
                    oMSDialogGlobalConstraint.type = "";
                    break;
                }
                if (iM158752u == 8) {
                    oMSDialogGlobalConstraint.count = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    oMSDialogGlobalConstraint.sessionCount = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 34) {
                    oMSDialogGlobalConstraint.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (oMSDialogGlobalConstraint.dimension == null && numValueOf != null) {
                            oMSDialogGlobalConstraint.dimension = (OmsConstraintDimension) OmsConstraintDimension.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSDialogGlobalConstraint.dimension == null) {
                            oMSDialogGlobalConstraint.dimension = (OmsConstraintDimension) OmsConstraintDimension.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSDialogGlobalConstraint.type != null) {
                            break;
                        }
                        oMSDialogGlobalConstraint.type = "";
                        return oMSDialogGlobalConstraint;
                    }
                    oMSDialogGlobalConstraint.dimension = (OmsConstraintDimension) nb5Var.m158743l(OmsConstraintDimension.PROTOBUF_ADAPTER);
                }
            }
            return oMSDialogGlobalConstraint;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSDialogGlobalConstraint oMSDialogGlobalConstraint, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, oMSDialogGlobalConstraint.count);
            codedOutputByteBufferNano.m17250G(2, oMSDialogGlobalConstraint.sessionCount);
            OmsConstraintDimension omsConstraintDimension = oMSDialogGlobalConstraint.dimension;
            if (omsConstraintDimension != null) {
                codedOutputByteBufferNano.m17250G(3, omsConstraintDimension.ordinal());
            }
            String str = oMSDialogGlobalConstraint.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(4, str);
            }
            OmsConstraintDimension omsConstraintDimension2 = oMSDialogGlobalConstraint.dimension;
            if (omsConstraintDimension2 != null) {
                codedOutputByteBufferNano.m17254K(5, omsConstraintDimension2, OmsConstraintDimension.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSDialogGlobalConstraint> JSON_ADAPTER = new ObjectJsonAdapter<OMSDialogGlobalConstraint>() { // from class: com.p1.mobile.putong.data.OMSDialogGlobalConstraint.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSDialogGlobalConstraint.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSDialogGlobalConstraint newInstance() {
            return new OMSDialogGlobalConstraint();
        }

        public boolean parseField(OMSDialogGlobalConstraint oMSDialogGlobalConstraint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "dimension":
                    oMSDialogGlobalConstraint.dimension = OmsConstraintDimension.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "sessionCount":
                    oMSDialogGlobalConstraint.sessionCount = jsonParser.getValueAsInt();
                    return true;
                case "type":
                    oMSDialogGlobalConstraint.type = jsonParser.getValueAsString();
                    return true;
                case "count":
                    oMSDialogGlobalConstraint.count = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSDialogGlobalConstraint oMSDialogGlobalConstraint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "dimension":
                case "sessionCount":
                case "type":
                case "count":
                    return true;
                default:
                    return super.parseFieldCheck(oMSDialogGlobalConstraint, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDialogGlobalConstraint oMSDialogGlobalConstraint, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", oMSDialogGlobalConstraint.count);
            jsonGenerator.writeNumberField("sessionCount", oMSDialogGlobalConstraint.sessionCount);
            if (oMSDialogGlobalConstraint.dimension != null) {
                jsonGenerator.writeFieldName("dimension");
                OmsConstraintDimension.JSON_ADAPTER.serialize(oMSDialogGlobalConstraint.dimension, jsonGenerator, true);
            }
            String str = oMSDialogGlobalConstraint.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDialogGlobalConstraint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDialogGlobalConstraint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSDialogGlobalConstraint new_() {
        OMSDialogGlobalConstraint oMSDialogGlobalConstraint = new OMSDialogGlobalConstraint();
        oMSDialogGlobalConstraint.nullCheck();
        return oMSDialogGlobalConstraint;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSDialogGlobalConstraint mo223809clone() {
        OMSDialogGlobalConstraint oMSDialogGlobalConstraint = new OMSDialogGlobalConstraint();
        oMSDialogGlobalConstraint.count = this.count;
        oMSDialogGlobalConstraint.sessionCount = this.sessionCount;
        oMSDialogGlobalConstraint.dimension = this.dimension;
        oMSDialogGlobalConstraint.type = this.type;
        return oMSDialogGlobalConstraint;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSDialogGlobalConstraint)) {
            return false;
        }
        OMSDialogGlobalConstraint oMSDialogGlobalConstraint = (OMSDialogGlobalConstraint) obj;
        return this.count == oMSDialogGlobalConstraint.count && this.sessionCount == oMSDialogGlobalConstraint.sessionCount && ValueObject.util_equals(this.dimension, oMSDialogGlobalConstraint.dimension) && ValueObject.util_equals(this.type, oMSDialogGlobalConstraint.type);
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
        int i2 = ((((i * 41) + this.count) * 41) + this.sessionCount) * 41;
        OmsConstraintDimension omsConstraintDimension = this.dimension;
        int iHashCode = (i2 + (omsConstraintDimension != null ? omsConstraintDimension.hashCode() : 0)) * 41;
        String str = this.type;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.dimension == null) {
            this.dimension = (OmsConstraintDimension) OmsConstraintDimension.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
