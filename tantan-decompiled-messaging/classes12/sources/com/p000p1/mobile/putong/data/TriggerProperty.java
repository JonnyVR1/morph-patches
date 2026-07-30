package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSSwipeAction;
import com.p000p1.mobile.putong.data.TriggerProperty;
import com.p000p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TriggerProperty triggerProperty) {
            List<OMSSwipeAction> list = triggerProperty.action;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, OMSSwipeAction.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            OMSSwipeMoment oMSSwipeMoment = triggerProperty.moment;
            if (oMSSwipeMoment != null) {
                iL += CodedOutputByteBufferNano.h(2, oMSSwipeMoment.ordinal());
            }
            String str = triggerProperty.pageID;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(3, str);
            }
            List<OMSSwipeAction> list2 = triggerProperty.action;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(4, list2, OMSSwipeAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSSwipeMoment oMSSwipeMoment2 = triggerProperty.moment;
            if (oMSSwipeMoment2 != null) {
                iL += CodedOutputByteBufferNano.l(5, oMSSwipeMoment2, OMSSwipeMoment.PROTOBUF_ADAPTER);
            }
            ((MessageNano) triggerProperty).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TriggerProperty m19121parse(nb5 nb5Var) throws IOException {
            TriggerProperty triggerProperty = new TriggerProperty();
            List list = null;
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    list = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 26) {
                    triggerProperty.pageID = nb5Var.s();
                } else if (iU == 34) {
                    triggerProperty.action = (List) nb5Var.l(OMSSwipeAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 42) {
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
                    triggerProperty.moment = (OMSSwipeMoment) nb5Var.l(OMSSwipeMoment.PROTOBUF_ADAPTER);
                }
            }
            return triggerProperty;
        }

        public void serialize(TriggerProperty triggerProperty, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<OMSSwipeAction> list = triggerProperty.action;
            if (list != null) {
                codedOutputByteBufferNano.K(1, OMSSwipeAction.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSSwipeMoment oMSSwipeMoment = triggerProperty.moment;
            if (oMSSwipeMoment != null) {
                codedOutputByteBufferNano.G(2, oMSSwipeMoment.ordinal());
            }
            String str = triggerProperty.pageID;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            List<OMSSwipeAction> list2 = triggerProperty.action;
            if (list2 != null) {
                codedOutputByteBufferNano.K(4, list2, OMSSwipeAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSSwipeMoment oMSSwipeMoment2 = triggerProperty.moment;
            if (oMSSwipeMoment2 != null) {
                codedOutputByteBufferNano.K(5, oMSSwipeMoment2, OMSSwipeMoment.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TriggerProperty> JSON_ADAPTER = new ObjectJsonAdapter<TriggerProperty>() { // from class: com.p1.mobile.putong.data.TriggerProperty.2
        public Class getDataClass() {
            return TriggerProperty.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TriggerProperty mo17830newInstance() {
            return new TriggerProperty();
        }

        public boolean parseField(TriggerProperty triggerProperty, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    triggerProperty.action = JsonAdapter.parseArray(jsonParser, OMSSwipeAction.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "moment":
                    triggerProperty.moment = (OMSSwipeMoment) OMSSwipeMoment.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TriggerProperty triggerProperty, JsonGenerator jsonGenerator) throws IOException {
            if (triggerProperty.action != null) {
                jsonGenerator.writeFieldName(Action.TYPE);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TriggerProperty) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TriggerProperty) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ OMSSwipeAction m1024a(OMSSwipeAction oMSSwipeAction) {
        return oMSSwipeAction;
    }

    public static TriggerProperty new_() {
        TriggerProperty triggerProperty = new TriggerProperty();
        triggerProperty.nullCheck();
        return triggerProperty;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TriggerProperty m19120clone() {
        TriggerProperty triggerProperty = new TriggerProperty();
        List<OMSSwipeAction> list = this.action;
        if (list != null) {
            triggerProperty.action = ValueObject.util_map(list, new w9j() { // from class: l.uaj0
                public final Object call(Object obj) {
                    return TriggerProperty.m1024a((OMSSwipeAction) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
