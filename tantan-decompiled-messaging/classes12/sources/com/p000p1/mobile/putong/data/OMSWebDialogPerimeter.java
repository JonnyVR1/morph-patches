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
public class OMSWebDialogPerimeter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omswebdialogperimeter";

    @NonNull
    @ProtobufIndex(index = 1)
    public OMSWebPerimeterType type;

    @ProtobufIndex(index = 2)
    public double value;
    public static ProtobufAdapter<OMSWebDialogPerimeter> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSWebDialogPerimeter>() { // from class: com.p1.mobile.putong.data.OMSWebDialogPerimeter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSWebDialogPerimeter oMSWebDialogPerimeter) {
            OMSWebPerimeterType oMSWebPerimeterType = oMSWebDialogPerimeter.type;
            int iH = (oMSWebPerimeterType != null ? CodedOutputByteBufferNano.h(1, oMSWebPerimeterType.ordinal()) : 0) + CodedOutputByteBufferNano.d(2, oMSWebDialogPerimeter.value);
            OMSWebPerimeterType oMSWebPerimeterType2 = oMSWebDialogPerimeter.type;
            if (oMSWebPerimeterType2 != null) {
                iH += CodedOutputByteBufferNano.l(3, oMSWebPerimeterType2, OMSWebPerimeterType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) oMSWebDialogPerimeter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSWebDialogPerimeter m18687parse(nb5 nb5Var) throws IOException {
            OMSWebDialogPerimeter oMSWebDialogPerimeter = new OMSWebDialogPerimeter();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSWebDialogPerimeter.type == null && numValueOf != null) {
                        oMSWebDialogPerimeter.type = (OMSWebPerimeterType) OMSWebPerimeterType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (oMSWebDialogPerimeter.type != null) {
                        break;
                    }
                    oMSWebDialogPerimeter.type = (OMSWebPerimeterType) OMSWebPerimeterType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 17) {
                    oMSWebDialogPerimeter.value = nb5Var.h();
                } else {
                    if (iU != 26) {
                        if (oMSWebDialogPerimeter.type == null && numValueOf != null) {
                            oMSWebDialogPerimeter.type = (OMSWebPerimeterType) OMSWebPerimeterType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSWebDialogPerimeter.type != null) {
                            break;
                        }
                        oMSWebDialogPerimeter.type = (OMSWebPerimeterType) OMSWebPerimeterType.JSON_ADAPTER.defaultEnum();
                        return oMSWebDialogPerimeter;
                    }
                    oMSWebDialogPerimeter.type = (OMSWebPerimeterType) nb5Var.l(OMSWebPerimeterType.PROTOBUF_ADAPTER);
                }
            }
            return oMSWebDialogPerimeter;
        }

        public void serialize(OMSWebDialogPerimeter oMSWebDialogPerimeter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OMSWebPerimeterType oMSWebPerimeterType = oMSWebDialogPerimeter.type;
            if (oMSWebPerimeterType != null) {
                codedOutputByteBufferNano.G(1, oMSWebPerimeterType.ordinal());
            }
            codedOutputByteBufferNano.C(2, oMSWebDialogPerimeter.value);
            OMSWebPerimeterType oMSWebPerimeterType2 = oMSWebDialogPerimeter.type;
            if (oMSWebPerimeterType2 != null) {
                codedOutputByteBufferNano.K(3, oMSWebPerimeterType2, OMSWebPerimeterType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSWebDialogPerimeter> JSON_ADAPTER = new ObjectJsonAdapter<OMSWebDialogPerimeter>() { // from class: com.p1.mobile.putong.data.OMSWebDialogPerimeter.2
        public Class getDataClass() {
            return OMSWebDialogPerimeter.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSWebDialogPerimeter mo17830newInstance() {
            return new OMSWebDialogPerimeter();
        }

        public boolean parseField(OMSWebDialogPerimeter oMSWebDialogPerimeter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("type")) {
                oMSWebDialogPerimeter.type = (OMSWebPerimeterType) OMSWebPerimeterType.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            oMSWebDialogPerimeter.value = jsonParser.getValueAsDouble();
            return true;
        }

        public boolean parseFieldCheck(OMSWebDialogPerimeter oMSWebDialogPerimeter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type") || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(oMSWebDialogPerimeter, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSWebDialogPerimeter oMSWebDialogPerimeter, JsonGenerator jsonGenerator) throws IOException {
            if (oMSWebDialogPerimeter.type != null) {
                jsonGenerator.writeFieldName("type");
                OMSWebPerimeterType.JSON_ADAPTER.serialize(oMSWebDialogPerimeter.type, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("value", oMSWebDialogPerimeter.value);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSWebDialogPerimeter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSWebDialogPerimeter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSWebDialogPerimeter new_() {
        OMSWebDialogPerimeter oMSWebDialogPerimeter = new OMSWebDialogPerimeter();
        oMSWebDialogPerimeter.nullCheck();
        return oMSWebDialogPerimeter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSWebDialogPerimeter m18686clone() {
        OMSWebDialogPerimeter oMSWebDialogPerimeter = new OMSWebDialogPerimeter();
        oMSWebDialogPerimeter.type = this.type;
        oMSWebDialogPerimeter.value = this.value;
        return oMSWebDialogPerimeter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSWebDialogPerimeter)) {
            return false;
        }
        OMSWebDialogPerimeter oMSWebDialogPerimeter = (OMSWebDialogPerimeter) obj;
        return ValueObject.util_equals(this.type, oMSWebDialogPerimeter.type) && this.value == oMSWebDialogPerimeter.value;
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
        OMSWebPerimeterType oMSWebPerimeterType = this.type;
        int iHashCode = i2 + (oMSWebPerimeterType != null ? oMSWebPerimeterType.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.value);
        int i3 = (iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = (OMSWebPerimeterType) OMSWebPerimeterType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
