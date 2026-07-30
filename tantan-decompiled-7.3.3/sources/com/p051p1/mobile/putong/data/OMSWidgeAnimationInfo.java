package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
import p153l.nc5;

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
    public OMSWidgeAnimationType f39646id;

    @ProtobufIndex(index = 3)
    public int startDelay;
    public static ProtobufAdapter<OMSWidgeAnimationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSWidgeAnimationInfo>() { // from class: com.p1.mobile.putong.data.OMSWidgeAnimationInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSWidgeAnimationInfo oMSWidgeAnimationInfo) {
            OMSWidgeAnimationType oMSWidgeAnimationType = oMSWidgeAnimationInfo.f39646id;
            int iM17281h = (oMSWidgeAnimationType != null ? CodedOutputByteBufferNano.m17281h(1, oMSWidgeAnimationType.ordinal()) : 0) + CodedOutputByteBufferNano.m17281h(2, oMSWidgeAnimationInfo.duration) + CodedOutputByteBufferNano.m17281h(3, oMSWidgeAnimationInfo.startDelay);
            OMSDisplayRule oMSDisplayRule = oMSWidgeAnimationInfo.constraint;
            if (oMSDisplayRule != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            OMSWidgeAnimationType oMSWidgeAnimationType2 = oMSWidgeAnimationInfo.f39646id;
            if (oMSWidgeAnimationType2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(5, oMSWidgeAnimationType2, OMSWidgeAnimationType.PROTOBUF_ADAPTER);
            }
            oMSWidgeAnimationInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSWidgeAnimationInfo parse(nc5 nc5Var) throws IOException {
            OMSWidgeAnimationInfo oMSWidgeAnimationInfo = new OMSWidgeAnimationInfo();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oMSWidgeAnimationInfo.f39646id == null && numValueOf != null) {
                        oMSWidgeAnimationInfo.f39646id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (oMSWidgeAnimationInfo.f39646id == null) {
                        oMSWidgeAnimationInfo.f39646id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.defaultEnum();
                    }
                    if (oMSWidgeAnimationInfo.constraint != null) {
                        break;
                    }
                    oMSWidgeAnimationInfo.constraint = OMSDisplayRule.new_();
                    break;
                }
                if (iM162497u == 8) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 16) {
                    oMSWidgeAnimationInfo.duration = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    oMSWidgeAnimationInfo.startDelay = nc5Var.m162486j();
                } else if (iM162497u == 34) {
                    oMSWidgeAnimationInfo.constraint = (OMSDisplayRule) nc5Var.m162488l(OMSDisplayRule.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 42) {
                        if (oMSWidgeAnimationInfo.f39646id == null && numValueOf != null) {
                            oMSWidgeAnimationInfo.f39646id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSWidgeAnimationInfo.f39646id == null) {
                            oMSWidgeAnimationInfo.f39646id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSWidgeAnimationInfo.constraint != null) {
                            break;
                        }
                        oMSWidgeAnimationInfo.constraint = OMSDisplayRule.new_();
                        return oMSWidgeAnimationInfo;
                    }
                    oMSWidgeAnimationInfo.f39646id = (OMSWidgeAnimationType) nc5Var.m162488l(OMSWidgeAnimationType.PROTOBUF_ADAPTER);
                }
            }
            return oMSWidgeAnimationInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSWidgeAnimationInfo oMSWidgeAnimationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OMSWidgeAnimationType oMSWidgeAnimationType = oMSWidgeAnimationInfo.f39646id;
            if (oMSWidgeAnimationType != null) {
                codedOutputByteBufferNano.m17305G(1, oMSWidgeAnimationType.ordinal());
            }
            codedOutputByteBufferNano.m17305G(2, oMSWidgeAnimationInfo.duration);
            codedOutputByteBufferNano.m17305G(3, oMSWidgeAnimationInfo.startDelay);
            OMSDisplayRule oMSDisplayRule = oMSWidgeAnimationInfo.constraint;
            if (oMSDisplayRule != null) {
                codedOutputByteBufferNano.m17309K(4, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            OMSWidgeAnimationType oMSWidgeAnimationType2 = oMSWidgeAnimationInfo.f39646id;
            if (oMSWidgeAnimationType2 != null) {
                codedOutputByteBufferNano.m17309K(5, oMSWidgeAnimationType2, OMSWidgeAnimationType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSWidgeAnimationInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSWidgeAnimationInfo>() { // from class: com.p1.mobile.putong.data.OMSWidgeAnimationInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSWidgeAnimationInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    oMSWidgeAnimationInfo.f39646id = OMSWidgeAnimationType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSWidgeAnimationInfo oMSWidgeAnimationInfo, JsonGenerator jsonGenerator) throws IOException {
            if (oMSWidgeAnimationInfo.f39646id != null) {
                jsonGenerator.writeFieldName("id");
                OMSWidgeAnimationType.JSON_ADAPTER.serialize(oMSWidgeAnimationInfo.f39646id, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, oMSWidgeAnimationInfo.duration);
            jsonGenerator.writeNumberField("startDelay", oMSWidgeAnimationInfo.startDelay);
            if (oMSWidgeAnimationInfo.constraint != null) {
                jsonGenerator.writeFieldName("constraint");
                OMSDisplayRule.JSON_ADAPTER.serialize(oMSWidgeAnimationInfo.constraint, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSWidgeAnimationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public OMSWidgeAnimationInfo mo225055clone() {
        OMSWidgeAnimationInfo oMSWidgeAnimationInfo = new OMSWidgeAnimationInfo();
        oMSWidgeAnimationInfo.f39646id = this.f39646id;
        oMSWidgeAnimationInfo.duration = this.duration;
        oMSWidgeAnimationInfo.startDelay = this.startDelay;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        if (oMSDisplayRule != null) {
            oMSWidgeAnimationInfo.constraint = oMSDisplayRule.mo225055clone();
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
        return ValueObject.util_equals(this.f39646id, oMSWidgeAnimationInfo.f39646id) && this.duration == oMSWidgeAnimationInfo.duration && this.startDelay == oMSWidgeAnimationInfo.startDelay && ValueObject.util_equals(this.constraint, oMSWidgeAnimationInfo.constraint);
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
        OMSWidgeAnimationType oMSWidgeAnimationType = this.f39646id;
        int iHashCode = (((((i2 + (oMSWidgeAnimationType != null ? oMSWidgeAnimationType.hashCode() : 0)) * 41) + this.duration) * 41) + this.startDelay) * 41;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        int iHashCode2 = iHashCode + (oMSDisplayRule != null ? oMSDisplayRule.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39646id == null) {
            this.f39646id = (OMSWidgeAnimationType) OMSWidgeAnimationType.JSON_ADAPTER.defaultEnum();
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
