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
public class OMSWidgeAnimationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omswidgeanimationinfo";

    @NonNull
    @ProtobufIndex(index = 4)
    public OMSDisplayRule constraint;

    @ProtobufIndex(index = 2)
    public int duration;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public OMSWidgeAnimationType f259id;

    @ProtobufIndex(index = 3)
    public int startDelay;
    public static ProtobufAdapter<OMSWidgeAnimationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSWidgeAnimationInfo>() { // from class: com.p1.mobile.putong.data.OMSWidgeAnimationInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSWidgeAnimationInfo oMSWidgeAnimationInfo) {
            OMSWidgeAnimationType oMSWidgeAnimationType = oMSWidgeAnimationInfo.f259id;
            int iH = (oMSWidgeAnimationType != null ? CodedOutputByteBufferNano.h(1, oMSWidgeAnimationType.ordinal()) : 0) + CodedOutputByteBufferNano.h(2, oMSWidgeAnimationInfo.duration) + CodedOutputByteBufferNano.h(3, oMSWidgeAnimationInfo.startDelay);
            OMSDisplayRule oMSDisplayRule = oMSWidgeAnimationInfo.constraint;
            if (oMSDisplayRule != null) {
                iH += CodedOutputByteBufferNano.l(4, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            OMSWidgeAnimationType oMSWidgeAnimationType2 = oMSWidgeAnimationInfo.f259id;
            if (oMSWidgeAnimationType2 != null) {
                iH += CodedOutputByteBufferNano.l(5, oMSWidgeAnimationType2, OMSWidgeAnimationType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) oMSWidgeAnimationInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSWidgeAnimationInfo m18693parse(nb5 nb5Var) throws IOException {
            OMSWidgeAnimationInfo oMSWidgeAnimationInfo = new OMSWidgeAnimationInfo();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSWidgeAnimationInfo.f259id == null && numValueOf != null) {
                        oMSWidgeAnimationInfo.f259id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (oMSWidgeAnimationInfo.f259id == null) {
                        oMSWidgeAnimationInfo.f259id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.defaultEnum();
                    }
                    if (oMSWidgeAnimationInfo.constraint != null) {
                        break;
                    }
                    oMSWidgeAnimationInfo.constraint = OMSDisplayRule.new_();
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 16) {
                    oMSWidgeAnimationInfo.duration = nb5Var.j();
                } else if (iU == 24) {
                    oMSWidgeAnimationInfo.startDelay = nb5Var.j();
                } else if (iU == 34) {
                    oMSWidgeAnimationInfo.constraint = (OMSDisplayRule) nb5Var.l(OMSDisplayRule.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
                        if (oMSWidgeAnimationInfo.f259id == null && numValueOf != null) {
                            oMSWidgeAnimationInfo.f259id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSWidgeAnimationInfo.f259id == null) {
                            oMSWidgeAnimationInfo.f259id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSWidgeAnimationInfo.constraint != null) {
                            break;
                        }
                        oMSWidgeAnimationInfo.constraint = OMSDisplayRule.new_();
                        return oMSWidgeAnimationInfo;
                    }
                    oMSWidgeAnimationInfo.f259id = (OMSWidgeAnimationType) nb5Var.l(OMSWidgeAnimationType.PROTOBUF_ADAPTER);
                }
            }
            return oMSWidgeAnimationInfo;
        }

        public void serialize(OMSWidgeAnimationInfo oMSWidgeAnimationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OMSWidgeAnimationType oMSWidgeAnimationType = oMSWidgeAnimationInfo.f259id;
            if (oMSWidgeAnimationType != null) {
                codedOutputByteBufferNano.G(1, oMSWidgeAnimationType.ordinal());
            }
            codedOutputByteBufferNano.G(2, oMSWidgeAnimationInfo.duration);
            codedOutputByteBufferNano.G(3, oMSWidgeAnimationInfo.startDelay);
            OMSDisplayRule oMSDisplayRule = oMSWidgeAnimationInfo.constraint;
            if (oMSDisplayRule != null) {
                codedOutputByteBufferNano.K(4, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            OMSWidgeAnimationType oMSWidgeAnimationType2 = oMSWidgeAnimationInfo.f259id;
            if (oMSWidgeAnimationType2 != null) {
                codedOutputByteBufferNano.K(5, oMSWidgeAnimationType2, OMSWidgeAnimationType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSWidgeAnimationInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSWidgeAnimationInfo>() { // from class: com.p1.mobile.putong.data.OMSWidgeAnimationInfo.2
        public Class getDataClass() {
            return OMSWidgeAnimationInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSWidgeAnimationInfo mo17830newInstance() {
            return new OMSWidgeAnimationInfo();
        }

        public boolean parseField(OMSWidgeAnimationInfo oMSWidgeAnimationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    oMSWidgeAnimationInfo.duration = jsonParser.getValueAsInt();
                    return true;
                case "startDelay":
                    oMSWidgeAnimationInfo.startDelay = jsonParser.getValueAsInt();
                    return true;
                case "constraint":
                    oMSWidgeAnimationInfo.constraint = (OMSDisplayRule) OMSDisplayRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    oMSWidgeAnimationInfo.f259id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.parse(jsonParser, str2);
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSWidgeAnimationInfo oMSWidgeAnimationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "startDelay":
                case "constraint":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(oMSWidgeAnimationInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSWidgeAnimationInfo oMSWidgeAnimationInfo, JsonGenerator jsonGenerator) throws IOException {
            if (oMSWidgeAnimationInfo.f259id != null) {
                jsonGenerator.writeFieldName("id");
                OMSWidgeAnimationType.JSON_ADAPTER.serialize(oMSWidgeAnimationInfo.f259id, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("duration", oMSWidgeAnimationInfo.duration);
            jsonGenerator.writeNumberField("startDelay", oMSWidgeAnimationInfo.startDelay);
            if (oMSWidgeAnimationInfo.constraint != null) {
                jsonGenerator.writeFieldName("constraint");
                OMSDisplayRule.JSON_ADAPTER.serialize(oMSWidgeAnimationInfo.constraint, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSWidgeAnimationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSWidgeAnimationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSWidgeAnimationInfo new_() {
        OMSWidgeAnimationInfo oMSWidgeAnimationInfo = new OMSWidgeAnimationInfo();
        oMSWidgeAnimationInfo.nullCheck();
        return oMSWidgeAnimationInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSWidgeAnimationInfo m18692clone() {
        OMSWidgeAnimationInfo oMSWidgeAnimationInfo = new OMSWidgeAnimationInfo();
        oMSWidgeAnimationInfo.f259id = this.f259id;
        oMSWidgeAnimationInfo.duration = this.duration;
        oMSWidgeAnimationInfo.startDelay = this.startDelay;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        if (oMSDisplayRule != null) {
            oMSWidgeAnimationInfo.constraint = oMSDisplayRule.m18608clone();
        }
        return oMSWidgeAnimationInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSWidgeAnimationInfo)) {
            return false;
        }
        OMSWidgeAnimationInfo oMSWidgeAnimationInfo = (OMSWidgeAnimationInfo) obj;
        return ValueObject.util_equals(this.f259id, oMSWidgeAnimationInfo.f259id) && this.duration == oMSWidgeAnimationInfo.duration && this.startDelay == oMSWidgeAnimationInfo.startDelay && ValueObject.util_equals(this.constraint, oMSWidgeAnimationInfo.constraint);
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
        OMSWidgeAnimationType oMSWidgeAnimationType = this.f259id;
        int iHashCode = (((((i2 + (oMSWidgeAnimationType != null ? oMSWidgeAnimationType.hashCode() : 0)) * 41) + this.duration) * 41) + this.startDelay) * 41;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        int iHashCode2 = iHashCode + (oMSDisplayRule != null ? oMSDisplayRule.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f259id == null) {
            this.f259id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.defaultEnum();
        }
        if (this.constraint == null) {
            this.constraint = OMSDisplayRule.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
