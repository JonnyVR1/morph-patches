package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ReminderReference extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reminderreference";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public ReminderAction action;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f157id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ReminderSource type;
    public static ProtobufAdapter<ReminderReference> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReminderReference>() { // from class: com.p1.mobile.putong.core.data.ReminderReference.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ReminderReference reminderReference) {
            String str = reminderReference.f157id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ReminderSource reminderSource = reminderReference.type;
            if (reminderSource != null) {
                iO += CodedOutputByteBufferNano.h(2, reminderSource.ordinal());
            }
            ReminderAction reminderAction = reminderReference.action;
            if (reminderAction != null) {
                iO += CodedOutputByteBufferNano.h(3, reminderAction.ordinal());
            }
            ReminderSource reminderSource2 = reminderReference.type;
            if (reminderSource2 != null) {
                iO += CodedOutputByteBufferNano.l(4, reminderSource2, ReminderSource.PROTOBUF_ADAPTER);
            }
            ReminderAction reminderAction2 = reminderReference.action;
            if (reminderAction2 != null) {
                iO += CodedOutputByteBufferNano.l(5, reminderAction2, ReminderAction.PROTOBUF_ADAPTER);
            }
            ((MessageNano) reminderReference).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ReminderReference m15393parse(nb5 nb5Var) throws IOException {
            ReminderReference reminderReference = new ReminderReference();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (reminderReference.type == null && numValueOf != null) {
                        reminderReference.type = (ReminderSource) ReminderSource.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (reminderReference.action == null && numValueOf2 != null) {
                        reminderReference.action = (ReminderAction) ReminderAction.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                    }
                    if (reminderReference.f157id == null) {
                        reminderReference.f157id = "";
                    }
                    if (reminderReference.type == null) {
                        reminderReference.type = (ReminderSource) ReminderSource.JSON_ADAPTER.defaultEnum();
                    }
                    if (reminderReference.action != null) {
                        break;
                    }
                    reminderReference.action = (ReminderAction) ReminderAction.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    reminderReference.f157id = nb5Var.s();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 24) {
                    numValueOf2 = Integer.valueOf(nb5Var.j());
                } else if (iU == 34) {
                    reminderReference.type = (ReminderSource) nb5Var.l(ReminderSource.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
                        if (reminderReference.type == null && numValueOf != null) {
                            reminderReference.type = (ReminderSource) ReminderSource.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (reminderReference.action == null && numValueOf2 != null) {
                            reminderReference.action = (ReminderAction) ReminderAction.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (reminderReference.f157id == null) {
                            reminderReference.f157id = "";
                        }
                        if (reminderReference.type == null) {
                            reminderReference.type = (ReminderSource) ReminderSource.JSON_ADAPTER.defaultEnum();
                        }
                        if (reminderReference.action != null) {
                            break;
                        }
                        reminderReference.action = (ReminderAction) ReminderAction.JSON_ADAPTER.defaultEnum();
                        return reminderReference;
                    }
                    reminderReference.action = (ReminderAction) nb5Var.l(ReminderAction.PROTOBUF_ADAPTER);
                }
            }
            return reminderReference;
        }

        public void serialize(ReminderReference reminderReference, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = reminderReference.f157id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            ReminderSource reminderSource = reminderReference.type;
            if (reminderSource != null) {
                codedOutputByteBufferNano.G(2, reminderSource.ordinal());
            }
            ReminderAction reminderAction = reminderReference.action;
            if (reminderAction != null) {
                codedOutputByteBufferNano.G(3, reminderAction.ordinal());
            }
            ReminderSource reminderSource2 = reminderReference.type;
            if (reminderSource2 != null) {
                codedOutputByteBufferNano.K(4, reminderSource2, ReminderSource.PROTOBUF_ADAPTER);
            }
            ReminderAction reminderAction2 = reminderReference.action;
            if (reminderAction2 != null) {
                codedOutputByteBufferNano.K(5, reminderAction2, ReminderAction.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ReminderReference> JSON_ADAPTER = new ObjectJsonAdapter<ReminderReference>() { // from class: com.p1.mobile.putong.core.data.ReminderReference.2
        public Class getDataClass() {
            return ReminderReference.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ReminderReference m15394newInstance() {
            return new ReminderReference();
        }

        public boolean parseField(ReminderReference reminderReference, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    reminderReference.action = (ReminderAction) ReminderAction.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    reminderReference.f157id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    reminderReference.type = (ReminderSource) ReminderSource.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ReminderReference reminderReference, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "action":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(reminderReference, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ReminderReference reminderReference, JsonGenerator jsonGenerator) throws IOException {
            String str = reminderReference.f157id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (reminderReference.type != null) {
                jsonGenerator.writeFieldName("type");
                ReminderSource.JSON_ADAPTER.serialize(reminderReference.type, jsonGenerator, true);
            }
            if (reminderReference.action != null) {
                jsonGenerator.writeFieldName("action");
                ReminderAction.JSON_ADAPTER.serialize(reminderReference.action, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReminderReference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReminderReference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReminderReference new_() {
        ReminderReference reminderReference = new ReminderReference();
        reminderReference.nullCheck();
        return reminderReference;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ReminderReference m15392clone() {
        ReminderReference reminderReference = new ReminderReference();
        reminderReference.f157id = this.f157id;
        reminderReference.type = this.type;
        reminderReference.action = this.action;
        return reminderReference;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReminderReference)) {
            return false;
        }
        ReminderReference reminderReference = (ReminderReference) obj;
        return ValueObject.util_equals(this.f157id, reminderReference.f157id) && ValueObject.util_equals(this.type, reminderReference.type) && ValueObject.util_equals(this.action, reminderReference.action);
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
        String str = this.f157id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        ReminderSource reminderSource = this.type;
        int iHashCode2 = (iHashCode + (reminderSource != null ? reminderSource.hashCode() : 0)) * 41;
        ReminderAction reminderAction = this.action;
        int iHashCode3 = iHashCode2 + (reminderAction != null ? reminderAction.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f157id == null) {
            this.f157id = "";
        }
        if (this.type == null) {
            this.type = (ReminderSource) ReminderSource.JSON_ADAPTER.defaultEnum();
        }
        if (this.action == null) {
            this.action = (ReminderAction) ReminderAction.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
