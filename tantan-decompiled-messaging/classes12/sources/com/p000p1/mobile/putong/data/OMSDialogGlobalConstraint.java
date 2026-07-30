package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSDialogGlobalConstraint oMSDialogGlobalConstraint) {
            int iH = CodedOutputByteBufferNano.h(1, oMSDialogGlobalConstraint.count) + CodedOutputByteBufferNano.h(2, oMSDialogGlobalConstraint.sessionCount);
            OmsConstraintDimension omsConstraintDimension = oMSDialogGlobalConstraint.dimension;
            if (omsConstraintDimension != null) {
                iH += CodedOutputByteBufferNano.h(3, omsConstraintDimension.ordinal());
            }
            String str = oMSDialogGlobalConstraint.type;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(4, str);
            }
            OmsConstraintDimension omsConstraintDimension2 = oMSDialogGlobalConstraint.dimension;
            if (omsConstraintDimension2 != null) {
                iH += CodedOutputByteBufferNano.l(5, omsConstraintDimension2, OmsConstraintDimension.PROTOBUF_ADAPTER);
            }
            ((MessageNano) oMSDialogGlobalConstraint).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSDialogGlobalConstraint m18600parse(nb5 nb5Var) throws IOException {
            OMSDialogGlobalConstraint oMSDialogGlobalConstraint = new OMSDialogGlobalConstraint();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    oMSDialogGlobalConstraint.count = nb5Var.j();
                } else if (iU == 16) {
                    oMSDialogGlobalConstraint.sessionCount = nb5Var.j();
                } else if (iU == 24) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 34) {
                    oMSDialogGlobalConstraint.type = nb5Var.s();
                } else {
                    if (iU != 42) {
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
                    oMSDialogGlobalConstraint.dimension = (OmsConstraintDimension) nb5Var.l(OmsConstraintDimension.PROTOBUF_ADAPTER);
                }
            }
            return oMSDialogGlobalConstraint;
        }

        public void serialize(OMSDialogGlobalConstraint oMSDialogGlobalConstraint, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, oMSDialogGlobalConstraint.count);
            codedOutputByteBufferNano.G(2, oMSDialogGlobalConstraint.sessionCount);
            OmsConstraintDimension omsConstraintDimension = oMSDialogGlobalConstraint.dimension;
            if (omsConstraintDimension != null) {
                codedOutputByteBufferNano.G(3, omsConstraintDimension.ordinal());
            }
            String str = oMSDialogGlobalConstraint.type;
            if (str != null) {
                codedOutputByteBufferNano.R(4, str);
            }
            OmsConstraintDimension omsConstraintDimension2 = oMSDialogGlobalConstraint.dimension;
            if (omsConstraintDimension2 != null) {
                codedOutputByteBufferNano.K(5, omsConstraintDimension2, OmsConstraintDimension.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSDialogGlobalConstraint> JSON_ADAPTER = new ObjectJsonAdapter<OMSDialogGlobalConstraint>() { // from class: com.p1.mobile.putong.data.OMSDialogGlobalConstraint.2
        public Class getDataClass() {
            return OMSDialogGlobalConstraint.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSDialogGlobalConstraint mo17830newInstance() {
            return new OMSDialogGlobalConstraint();
        }

        public boolean parseField(OMSDialogGlobalConstraint oMSDialogGlobalConstraint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "dimension":
                    oMSDialogGlobalConstraint.dimension = (OmsConstraintDimension) OmsConstraintDimension.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDialogGlobalConstraint oMSDialogGlobalConstraint, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", oMSDialogGlobalConstraint.count);
            jsonGenerator.writeNumberField("sessionCount", oMSDialogGlobalConstraint.sessionCount);
            if (oMSDialogGlobalConstraint.dimension != null) {
                jsonGenerator.writeFieldName(Dimension.TYPE);
                OmsConstraintDimension.JSON_ADAPTER.serialize(oMSDialogGlobalConstraint.dimension, jsonGenerator, true);
            }
            String str = oMSDialogGlobalConstraint.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDialogGlobalConstraint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDialogGlobalConstraint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSDialogGlobalConstraint new_() {
        OMSDialogGlobalConstraint oMSDialogGlobalConstraint = new OMSDialogGlobalConstraint();
        oMSDialogGlobalConstraint.nullCheck();
        return oMSDialogGlobalConstraint;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSDialogGlobalConstraint m18599clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.count) * 41) + this.sessionCount) * 41;
        OmsConstraintDimension omsConstraintDimension = this.dimension;
        int iHashCode = (i2 + (omsConstraintDimension != null ? omsConstraintDimension.hashCode() : 0)) * 41;
        String str = this.type;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.dimension == null) {
            this.dimension = (OmsConstraintDimension) OmsConstraintDimension.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
