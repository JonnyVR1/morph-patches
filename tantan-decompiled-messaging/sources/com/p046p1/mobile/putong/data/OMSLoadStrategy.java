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
public class OMSLoadStrategy extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsloadstrategy";

    @NonNull
    @ProtobufIndex(index = 3)
    public OMSIds displayRuleIDs;

    @NonNull
    @ProtobufIndex(index = 5)
    public OMSIds positionIDs;

    @NonNull
    @ProtobufIndex(index = 4)
    public OMSIds resourceIDs;

    @NonNull
    @ProtobufIndex(index = 1)
    public LoadStrategy strategy;

    @NonNull
    @ProtobufIndex(index = 2)
    public OMSIds triggerRuleIDs;
    public static ProtobufAdapter<OMSLoadStrategy> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSLoadStrategy>() { // from class: com.p1.mobile.putong.data.OMSLoadStrategy.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSLoadStrategy oMSLoadStrategy) {
            LoadStrategy loadStrategy = oMSLoadStrategy.strategy;
            int iM17226h = loadStrategy != null ? CodedOutputByteBufferNano.m17226h(1, loadStrategy.ordinal()) : 0;
            OMSIds oMSIds = oMSLoadStrategy.triggerRuleIDs;
            if (oMSIds != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, oMSIds, OMSIds.PROTOBUF_ADAPTER);
            }
            OMSIds oMSIds2 = oMSLoadStrategy.displayRuleIDs;
            if (oMSIds2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, oMSIds2, OMSIds.PROTOBUF_ADAPTER);
            }
            OMSIds oMSIds3 = oMSLoadStrategy.resourceIDs;
            if (oMSIds3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(4, oMSIds3, OMSIds.PROTOBUF_ADAPTER);
            }
            OMSIds oMSIds4 = oMSLoadStrategy.positionIDs;
            if (oMSIds4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(5, oMSIds4, OMSIds.PROTOBUF_ADAPTER);
            }
            LoadStrategy loadStrategy2 = oMSLoadStrategy.strategy;
            if (loadStrategy2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(6, loadStrategy2, LoadStrategy.PROTOBUF_ADAPTER);
            }
            oMSLoadStrategy.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSLoadStrategy parse(nb5 nb5Var) throws IOException {
            OMSLoadStrategy oMSLoadStrategy = new OMSLoadStrategy();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSLoadStrategy.strategy == null && numValueOf != null) {
                        oMSLoadStrategy.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (oMSLoadStrategy.strategy == null) {
                        oMSLoadStrategy.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.defaultEnum();
                    }
                    if (oMSLoadStrategy.triggerRuleIDs == null) {
                        oMSLoadStrategy.triggerRuleIDs = OMSIds.new_();
                    }
                    if (oMSLoadStrategy.displayRuleIDs == null) {
                        oMSLoadStrategy.displayRuleIDs = OMSIds.new_();
                    }
                    if (oMSLoadStrategy.resourceIDs == null) {
                        oMSLoadStrategy.resourceIDs = OMSIds.new_();
                    }
                    if (oMSLoadStrategy.positionIDs != null) {
                        break;
                    }
                    oMSLoadStrategy.positionIDs = OMSIds.new_();
                    break;
                }
                if (iM158752u == 8) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 18) {
                    oMSLoadStrategy.triggerRuleIDs = (OMSIds) nb5Var.m158743l(OMSIds.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    oMSLoadStrategy.displayRuleIDs = (OMSIds) nb5Var.m158743l(OMSIds.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    oMSLoadStrategy.resourceIDs = (OMSIds) nb5Var.m158743l(OMSIds.PROTOBUF_ADAPTER);
                } else if (iM158752u == 42) {
                    oMSLoadStrategy.positionIDs = (OMSIds) nb5Var.m158743l(OMSIds.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 50) {
                        if (oMSLoadStrategy.strategy == null && numValueOf != null) {
                            oMSLoadStrategy.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSLoadStrategy.strategy == null) {
                            oMSLoadStrategy.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSLoadStrategy.triggerRuleIDs == null) {
                            oMSLoadStrategy.triggerRuleIDs = OMSIds.new_();
                        }
                        if (oMSLoadStrategy.displayRuleIDs == null) {
                            oMSLoadStrategy.displayRuleIDs = OMSIds.new_();
                        }
                        if (oMSLoadStrategy.resourceIDs == null) {
                            oMSLoadStrategy.resourceIDs = OMSIds.new_();
                        }
                        if (oMSLoadStrategy.positionIDs != null) {
                            break;
                        }
                        oMSLoadStrategy.positionIDs = OMSIds.new_();
                        return oMSLoadStrategy;
                    }
                    oMSLoadStrategy.strategy = (LoadStrategy) nb5Var.m158743l(LoadStrategy.PROTOBUF_ADAPTER);
                }
            }
            return oMSLoadStrategy;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSLoadStrategy oMSLoadStrategy, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LoadStrategy loadStrategy = oMSLoadStrategy.strategy;
            if (loadStrategy != null) {
                codedOutputByteBufferNano.m17250G(1, loadStrategy.ordinal());
            }
            OMSIds oMSIds = oMSLoadStrategy.triggerRuleIDs;
            if (oMSIds != null) {
                codedOutputByteBufferNano.m17254K(2, oMSIds, OMSIds.PROTOBUF_ADAPTER);
            }
            OMSIds oMSIds2 = oMSLoadStrategy.displayRuleIDs;
            if (oMSIds2 != null) {
                codedOutputByteBufferNano.m17254K(3, oMSIds2, OMSIds.PROTOBUF_ADAPTER);
            }
            OMSIds oMSIds3 = oMSLoadStrategy.resourceIDs;
            if (oMSIds3 != null) {
                codedOutputByteBufferNano.m17254K(4, oMSIds3, OMSIds.PROTOBUF_ADAPTER);
            }
            OMSIds oMSIds4 = oMSLoadStrategy.positionIDs;
            if (oMSIds4 != null) {
                codedOutputByteBufferNano.m17254K(5, oMSIds4, OMSIds.PROTOBUF_ADAPTER);
            }
            LoadStrategy loadStrategy2 = oMSLoadStrategy.strategy;
            if (loadStrategy2 != null) {
                codedOutputByteBufferNano.m17254K(6, loadStrategy2, LoadStrategy.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSLoadStrategy> JSON_ADAPTER = new ObjectJsonAdapter<OMSLoadStrategy>() { // from class: com.p1.mobile.putong.data.OMSLoadStrategy.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSLoadStrategy.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSLoadStrategy newInstance() {
            return new OMSLoadStrategy();
        }

        public boolean parseField(OMSLoadStrategy oMSLoadStrategy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "displayRuleIDs":
                    oMSLoadStrategy.displayRuleIDs = OMSIds.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "positionIDs":
                    oMSLoadStrategy.positionIDs = OMSIds.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "resourceIDs":
                    oMSLoadStrategy.resourceIDs = OMSIds.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "triggerRuleIDs":
                    oMSLoadStrategy.triggerRuleIDs = OMSIds.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "strategy":
                    oMSLoadStrategy.strategy = LoadStrategy.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSLoadStrategy oMSLoadStrategy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "displayRuleIDs":
                case "positionIDs":
                case "resourceIDs":
                case "triggerRuleIDs":
                case "strategy":
                    return true;
                default:
                    return super.parseFieldCheck(oMSLoadStrategy, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSLoadStrategy oMSLoadStrategy, JsonGenerator jsonGenerator) throws IOException {
            if (oMSLoadStrategy.strategy != null) {
                jsonGenerator.writeFieldName("strategy");
                LoadStrategy.JSON_ADAPTER.serialize(oMSLoadStrategy.strategy, jsonGenerator, true);
            }
            if (oMSLoadStrategy.triggerRuleIDs != null) {
                jsonGenerator.writeFieldName("triggerRuleIDs");
                OMSIds.JSON_ADAPTER.serialize(oMSLoadStrategy.triggerRuleIDs, jsonGenerator, true);
            }
            if (oMSLoadStrategy.displayRuleIDs != null) {
                jsonGenerator.writeFieldName("displayRuleIDs");
                OMSIds.JSON_ADAPTER.serialize(oMSLoadStrategy.displayRuleIDs, jsonGenerator, true);
            }
            if (oMSLoadStrategy.resourceIDs != null) {
                jsonGenerator.writeFieldName("resourceIDs");
                OMSIds.JSON_ADAPTER.serialize(oMSLoadStrategy.resourceIDs, jsonGenerator, true);
            }
            if (oMSLoadStrategy.positionIDs != null) {
                jsonGenerator.writeFieldName("positionIDs");
                OMSIds.JSON_ADAPTER.serialize(oMSLoadStrategy.positionIDs, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSLoadStrategy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSLoadStrategy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSLoadStrategy new_() {
        OMSLoadStrategy oMSLoadStrategy = new OMSLoadStrategy();
        oMSLoadStrategy.nullCheck();
        return oMSLoadStrategy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSLoadStrategy mo223809clone() {
        OMSLoadStrategy oMSLoadStrategy = new OMSLoadStrategy();
        oMSLoadStrategy.strategy = this.strategy;
        OMSIds oMSIds = this.triggerRuleIDs;
        if (oMSIds != null) {
            oMSLoadStrategy.triggerRuleIDs = oMSIds.mo223809clone();
        }
        OMSIds oMSIds2 = this.displayRuleIDs;
        if (oMSIds2 != null) {
            oMSLoadStrategy.displayRuleIDs = oMSIds2.mo223809clone();
        }
        OMSIds oMSIds3 = this.resourceIDs;
        if (oMSIds3 != null) {
            oMSLoadStrategy.resourceIDs = oMSIds3.mo223809clone();
        }
        OMSIds oMSIds4 = this.positionIDs;
        if (oMSIds4 != null) {
            oMSLoadStrategy.positionIDs = oMSIds4.mo223809clone();
        }
        return oMSLoadStrategy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSLoadStrategy)) {
            return false;
        }
        OMSLoadStrategy oMSLoadStrategy = (OMSLoadStrategy) obj;
        return ValueObject.util_equals(this.strategy, oMSLoadStrategy.strategy) && ValueObject.util_equals(this.triggerRuleIDs, oMSLoadStrategy.triggerRuleIDs) && ValueObject.util_equals(this.displayRuleIDs, oMSLoadStrategy.displayRuleIDs) && ValueObject.util_equals(this.resourceIDs, oMSLoadStrategy.resourceIDs) && ValueObject.util_equals(this.positionIDs, oMSLoadStrategy.positionIDs);
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
        LoadStrategy loadStrategy = this.strategy;
        int iHashCode = (i2 + (loadStrategy != null ? loadStrategy.hashCode() : 0)) * 41;
        OMSIds oMSIds = this.triggerRuleIDs;
        int iHashCode2 = (iHashCode + (oMSIds != null ? oMSIds.hashCode() : 0)) * 41;
        OMSIds oMSIds2 = this.displayRuleIDs;
        int iHashCode3 = (iHashCode2 + (oMSIds2 != null ? oMSIds2.hashCode() : 0)) * 41;
        OMSIds oMSIds3 = this.resourceIDs;
        int iHashCode4 = (iHashCode3 + (oMSIds3 != null ? oMSIds3.hashCode() : 0)) * 41;
        OMSIds oMSIds4 = this.positionIDs;
        int iHashCode5 = iHashCode4 + (oMSIds4 != null ? oMSIds4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.strategy == null) {
            this.strategy = (LoadStrategy) LoadStrategy.JSON_ADAPTER.defaultEnum();
        }
        if (this.triggerRuleIDs == null) {
            this.triggerRuleIDs = OMSIds.new_();
        }
        if (this.displayRuleIDs == null) {
            this.displayRuleIDs = OMSIds.new_();
        }
        if (this.resourceIDs == null) {
            this.resourceIDs = OMSIds.new_();
        }
        if (this.positionIDs == null) {
            this.positionIDs = OMSIds.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
