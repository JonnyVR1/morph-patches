package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OMSSwipeAction;
import com.p046p1.mobile.putong.data.TriggerProperty;
import com.p046p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class TriggerProperty extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "triggerproperty";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<OMSSwipeAction> action;

    @NonNull
    @ProtobufIndex(index = 2)
    public OMSSwipeMoment moment;

    @NonNull
    @ProtobufIndex(index = 3)
    public String pageID;
    public static ProtobufAdapter<TriggerProperty> PROTOBUF_ADAPTER = new MessageNanoAdapter<TriggerProperty>() { // from class: com.p1.mobile.putong.data.TriggerProperty.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TriggerProperty triggerProperty) {
            List<OMSSwipeAction> list = triggerProperty.action;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, OMSSwipeAction.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            OMSSwipeMoment oMSSwipeMoment = triggerProperty.moment;
            if (oMSSwipeMoment != null) {
                iM17230l += CodedOutputByteBufferNano.m17226h(2, oMSSwipeMoment.ordinal());
            }
            String str = triggerProperty.pageID;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str);
            }
            List<OMSSwipeAction> list2 = triggerProperty.action;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, list2, OMSSwipeAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSSwipeMoment oMSSwipeMoment2 = triggerProperty.moment;
            if (oMSSwipeMoment2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, oMSSwipeMoment2, OMSSwipeMoment.PROTOBUF_ADAPTER);
            }
            triggerProperty.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TriggerProperty parse(nb5 nb5Var) throws IOException {
            TriggerProperty triggerProperty = new TriggerProperty();
            List list = null;
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (triggerProperty.action == null && list != null) {
                        triggerProperty.action = OMSSwipeAction.oldEnumCovertList(list);
                    }
                    if (triggerProperty.moment == null && numValueOf != null) {
                        triggerProperty.moment = (OMSSwipeMoment) OMSSwipeMoment.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (triggerProperty.action == null) {
                        triggerProperty.action = new ArrayList();
                    }
                    if (triggerProperty.moment == null) {
                        triggerProperty.moment = (OMSSwipeMoment) OMSSwipeMoment.JSON_ADAPTER.defaultEnum();
                    }
                    if (triggerProperty.pageID != null) {
                        break;
                    }
                    triggerProperty.pageID = "";
                    break;
                }
                if (iM158752u == 10) {
                    list = (List) nb5Var.m158743l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 16) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 26) {
                    triggerProperty.pageID = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    triggerProperty.action = (List) nb5Var.m158743l(OMSSwipeAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 42) {
                        if (triggerProperty.action == null && list != null) {
                            triggerProperty.action = OMSSwipeAction.oldEnumCovertList(list);
                        }
                        if (triggerProperty.moment == null && numValueOf != null) {
                            triggerProperty.moment = (OMSSwipeMoment) OMSSwipeMoment.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (triggerProperty.action == null) {
                            triggerProperty.action = new ArrayList();
                        }
                        if (triggerProperty.moment == null) {
                            triggerProperty.moment = (OMSSwipeMoment) OMSSwipeMoment.JSON_ADAPTER.defaultEnum();
                        }
                        if (triggerProperty.pageID != null) {
                            break;
                        }
                        triggerProperty.pageID = "";
                        return triggerProperty;
                    }
                    triggerProperty.moment = (OMSSwipeMoment) nb5Var.m158743l(OMSSwipeMoment.PROTOBUF_ADAPTER);
                }
            }
            return triggerProperty;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TriggerProperty triggerProperty, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<OMSSwipeAction> list = triggerProperty.action;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, OMSSwipeAction.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSSwipeMoment oMSSwipeMoment = triggerProperty.moment;
            if (oMSSwipeMoment != null) {
                codedOutputByteBufferNano.m17250G(2, oMSSwipeMoment.ordinal());
            }
            String str = triggerProperty.pageID;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
            List<OMSSwipeAction> list2 = triggerProperty.action;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(4, list2, OMSSwipeAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSSwipeMoment oMSSwipeMoment2 = triggerProperty.moment;
            if (oMSSwipeMoment2 != null) {
                codedOutputByteBufferNano.m17254K(5, oMSSwipeMoment2, OMSSwipeMoment.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TriggerProperty> JSON_ADAPTER = new ObjectJsonAdapter<TriggerProperty>() { // from class: com.p1.mobile.putong.data.TriggerProperty.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TriggerProperty.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TriggerProperty newInstance() {
            return new TriggerProperty();
        }

        public boolean parseField(TriggerProperty triggerProperty, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    triggerProperty.action = JsonAdapter.parseArray(jsonParser, OMSSwipeAction.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "moment":
                    triggerProperty.moment = OMSSwipeMoment.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "pageID":
                    triggerProperty.pageID = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TriggerProperty triggerProperty, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "action":
                case "moment":
                case "pageID":
                    return true;
                default:
                    return super.parseFieldCheck(triggerProperty, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TriggerProperty triggerProperty, JsonGenerator jsonGenerator) throws IOException {
            if (triggerProperty.action != null) {
                jsonGenerator.writeFieldName("action");
                JsonAdapter.serializeArray(triggerProperty.action, jsonGenerator, OMSSwipeAction.JSON_ADAPTER);
            }
            if (triggerProperty.moment != null) {
                jsonGenerator.writeFieldName("moment");
                OMSSwipeMoment.JSON_ADAPTER.serialize(triggerProperty.moment, jsonGenerator, true);
            }
            String str = triggerProperty.pageID;
            if (str != null) {
                jsonGenerator.writeStringField("pageID", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TriggerProperty) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TriggerProperty) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ OMSSwipeAction m60106a(OMSSwipeAction oMSSwipeAction) {
        return oMSSwipeAction;
    }

    public static TriggerProperty new_() {
        TriggerProperty triggerProperty = new TriggerProperty();
        triggerProperty.nullCheck();
        return triggerProperty;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TriggerProperty mo223809clone() {
        TriggerProperty triggerProperty = new TriggerProperty();
        List<OMSSwipeAction> list = this.action;
        if (list != null) {
            triggerProperty.action = ValueObject.util_map(list, new w9j() { // from class: l.uaj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TriggerProperty.m60106a((OMSSwipeAction) obj);
                }
            });
        }
        triggerProperty.moment = this.moment;
        triggerProperty.pageID = this.pageID;
        return triggerProperty;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TriggerProperty)) {
            return false;
        }
        TriggerProperty triggerProperty = (TriggerProperty) obj;
        return ValueObject.util_equals(this.action, triggerProperty.action) && ValueObject.util_equals(this.moment, triggerProperty.moment) && ValueObject.util_equals(this.pageID, triggerProperty.pageID);
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
        List<OMSSwipeAction> list = this.action;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        OMSSwipeMoment oMSSwipeMoment = this.moment;
        int iHashCode2 = (iHashCode + (oMSSwipeMoment != null ? oMSSwipeMoment.hashCode() : 0)) * 41;
        String str = this.pageID;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.action == null) {
            this.action = new ArrayList();
        }
        if (this.moment == null) {
            this.moment = (OMSSwipeMoment) OMSSwipeMoment.JSON_ADAPTER.defaultEnum();
        }
        if (this.pageID == null) {
            this.pageID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
