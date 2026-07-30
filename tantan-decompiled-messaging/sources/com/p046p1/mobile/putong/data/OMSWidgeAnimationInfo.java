package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
    public OMSWidgeAnimationType f38798id;

    @ProtobufIndex(index = 3)
    public int startDelay;
    public static ProtobufAdapter<OMSWidgeAnimationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSWidgeAnimationInfo>() { // from class: com.p1.mobile.putong.data.OMSWidgeAnimationInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSWidgeAnimationInfo oMSWidgeAnimationInfo) {
            OMSWidgeAnimationType oMSWidgeAnimationType = oMSWidgeAnimationInfo.f38798id;
            int iM17226h = (oMSWidgeAnimationType != null ? CodedOutputByteBufferNano.m17226h(1, oMSWidgeAnimationType.ordinal()) : 0) + CodedOutputByteBufferNano.m17226h(2, oMSWidgeAnimationInfo.duration) + CodedOutputByteBufferNano.m17226h(3, oMSWidgeAnimationInfo.startDelay);
            OMSDisplayRule oMSDisplayRule = oMSWidgeAnimationInfo.constraint;
            if (oMSDisplayRule != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(4, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            OMSWidgeAnimationType oMSWidgeAnimationType2 = oMSWidgeAnimationInfo.f38798id;
            if (oMSWidgeAnimationType2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(5, oMSWidgeAnimationType2, OMSWidgeAnimationType.PROTOBUF_ADAPTER);
            }
            oMSWidgeAnimationInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSWidgeAnimationInfo parse(nb5 nb5Var) throws IOException {
            OMSWidgeAnimationInfo oMSWidgeAnimationInfo = new OMSWidgeAnimationInfo();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSWidgeAnimationInfo.f38798id == null && numValueOf != null) {
                        oMSWidgeAnimationInfo.f38798id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (oMSWidgeAnimationInfo.f38798id == null) {
                        oMSWidgeAnimationInfo.f38798id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.defaultEnum();
                    }
                    if (oMSWidgeAnimationInfo.constraint != null) {
                        break;
                    }
                    oMSWidgeAnimationInfo.constraint = OMSDisplayRule.new_();
                    break;
                }
                if (iM158752u == 8) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 16) {
                    oMSWidgeAnimationInfo.duration = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    oMSWidgeAnimationInfo.startDelay = nb5Var.m158741j();
                } else if (iM158752u == 34) {
                    oMSWidgeAnimationInfo.constraint = (OMSDisplayRule) nb5Var.m158743l(OMSDisplayRule.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 42) {
                        if (oMSWidgeAnimationInfo.f38798id == null && numValueOf != null) {
                            oMSWidgeAnimationInfo.f38798id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSWidgeAnimationInfo.f38798id == null) {
                            oMSWidgeAnimationInfo.f38798id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSWidgeAnimationInfo.constraint != null) {
                            break;
                        }
                        oMSWidgeAnimationInfo.constraint = OMSDisplayRule.new_();
                        return oMSWidgeAnimationInfo;
                    }
                    oMSWidgeAnimationInfo.f38798id = (OMSWidgeAnimationType) nb5Var.m158743l(OMSWidgeAnimationType.PROTOBUF_ADAPTER);
                }
            }
            return oMSWidgeAnimationInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSWidgeAnimationInfo oMSWidgeAnimationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OMSWidgeAnimationType oMSWidgeAnimationType = oMSWidgeAnimationInfo.f38798id;
            if (oMSWidgeAnimationType != null) {
                codedOutputByteBufferNano.m17250G(1, oMSWidgeAnimationType.ordinal());
            }
            codedOutputByteBufferNano.m17250G(2, oMSWidgeAnimationInfo.duration);
            codedOutputByteBufferNano.m17250G(3, oMSWidgeAnimationInfo.startDelay);
            OMSDisplayRule oMSDisplayRule = oMSWidgeAnimationInfo.constraint;
            if (oMSDisplayRule != null) {
                codedOutputByteBufferNano.m17254K(4, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            OMSWidgeAnimationType oMSWidgeAnimationType2 = oMSWidgeAnimationInfo.f38798id;
            if (oMSWidgeAnimationType2 != null) {
                codedOutputByteBufferNano.m17254K(5, oMSWidgeAnimationType2, OMSWidgeAnimationType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSWidgeAnimationInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSWidgeAnimationInfo>() { // from class: com.p1.mobile.putong.data.OMSWidgeAnimationInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSWidgeAnimationInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSWidgeAnimationInfo newInstance() {
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
                    oMSWidgeAnimationInfo.constraint = OMSDisplayRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    oMSWidgeAnimationInfo.f38798id = OMSWidgeAnimationType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSWidgeAnimationInfo oMSWidgeAnimationInfo, JsonGenerator jsonGenerator) throws IOException {
            if (oMSWidgeAnimationInfo.f38798id != null) {
                jsonGenerator.writeFieldName("id");
                OMSWidgeAnimationType.JSON_ADAPTER.serialize(oMSWidgeAnimationInfo.f38798id, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, oMSWidgeAnimationInfo.duration);
            jsonGenerator.writeNumberField("startDelay", oMSWidgeAnimationInfo.startDelay);
            if (oMSWidgeAnimationInfo.constraint != null) {
                jsonGenerator.writeFieldName("constraint");
                OMSDisplayRule.JSON_ADAPTER.serialize(oMSWidgeAnimationInfo.constraint, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSWidgeAnimationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSWidgeAnimationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSWidgeAnimationInfo new_() {
        OMSWidgeAnimationInfo oMSWidgeAnimationInfo = new OMSWidgeAnimationInfo();
        oMSWidgeAnimationInfo.nullCheck();
        return oMSWidgeAnimationInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSWidgeAnimationInfo mo223809clone() {
        OMSWidgeAnimationInfo oMSWidgeAnimationInfo = new OMSWidgeAnimationInfo();
        oMSWidgeAnimationInfo.f38798id = this.f38798id;
        oMSWidgeAnimationInfo.duration = this.duration;
        oMSWidgeAnimationInfo.startDelay = this.startDelay;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        if (oMSDisplayRule != null) {
            oMSWidgeAnimationInfo.constraint = oMSDisplayRule.mo223809clone();
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
        return ValueObject.util_equals(this.f38798id, oMSWidgeAnimationInfo.f38798id) && this.duration == oMSWidgeAnimationInfo.duration && this.startDelay == oMSWidgeAnimationInfo.startDelay && ValueObject.util_equals(this.constraint, oMSWidgeAnimationInfo.constraint);
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
        OMSWidgeAnimationType oMSWidgeAnimationType = this.f38798id;
        int iHashCode = (((((i2 + (oMSWidgeAnimationType != null ? oMSWidgeAnimationType.hashCode() : 0)) * 41) + this.duration) * 41) + this.startDelay) * 41;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        int iHashCode2 = iHashCode + (oMSDisplayRule != null ? oMSDisplayRule.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38798id == null) {
            this.f38798id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.defaultEnum();
        }
        if (this.constraint == null) {
            this.constraint = OMSDisplayRule.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
