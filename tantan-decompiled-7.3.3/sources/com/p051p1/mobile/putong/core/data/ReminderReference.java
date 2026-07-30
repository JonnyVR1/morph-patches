package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: classes10.dex */
public class ReminderReference extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reminderreference";

    @NonNull
    @ProtobufIndex(index = 3)
    public ReminderAction action;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21237id;

    @NonNull
    @ProtobufIndex(index = 2)
    public ReminderSource type;
    public static ProtobufAdapter<ReminderReference> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReminderReference>() { // from class: com.p1.mobile.putong.core.data.ReminderReference.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ReminderReference reminderReference) {
            String str = reminderReference.f21237id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            ReminderSource reminderSource = reminderReference.type;
            if (reminderSource != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(2, reminderSource.ordinal());
            }
            ReminderAction reminderAction = reminderReference.action;
            if (reminderAction != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(3, reminderAction.ordinal());
            }
            ReminderSource reminderSource2 = reminderReference.type;
            if (reminderSource2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, reminderSource2, ReminderSource.PROTOBUF_ADAPTER);
            }
            ReminderAction reminderAction2 = reminderReference.action;
            if (reminderAction2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, reminderAction2, ReminderAction.PROTOBUF_ADAPTER);
            }
            reminderReference.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ReminderReference parse(nc5 nc5Var) throws IOException {
            ReminderReference reminderReference = new ReminderReference();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (reminderReference.type == null && numValueOf != null) {
                        reminderReference.type = (ReminderSource) ReminderSource.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (reminderReference.action == null && numValueOf2 != null) {
                        reminderReference.action = (ReminderAction) ReminderAction.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                    }
                    if (reminderReference.f21237id == null) {
                        reminderReference.f21237id = "";
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
                if (iM162497u == 10) {
                    reminderReference.f21237id = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 24) {
                    numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 34) {
                    reminderReference.type = (ReminderSource) nc5Var.m162488l(ReminderSource.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 42) {
                        if (reminderReference.type == null && numValueOf != null) {
                            reminderReference.type = (ReminderSource) ReminderSource.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (reminderReference.action == null && numValueOf2 != null) {
                            reminderReference.action = (ReminderAction) ReminderAction.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (reminderReference.f21237id == null) {
                            reminderReference.f21237id = "";
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
                    reminderReference.action = (ReminderAction) nc5Var.m162488l(ReminderAction.PROTOBUF_ADAPTER);
                }
            }
            return reminderReference;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ReminderReference reminderReference, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = reminderReference.f21237id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            ReminderSource reminderSource = reminderReference.type;
            if (reminderSource != null) {
                codedOutputByteBufferNano.m17305G(2, reminderSource.ordinal());
            }
            ReminderAction reminderAction = reminderReference.action;
            if (reminderAction != null) {
                codedOutputByteBufferNano.m17305G(3, reminderAction.ordinal());
            }
            ReminderSource reminderSource2 = reminderReference.type;
            if (reminderSource2 != null) {
                codedOutputByteBufferNano.m17309K(4, reminderSource2, ReminderSource.PROTOBUF_ADAPTER);
            }
            ReminderAction reminderAction2 = reminderReference.action;
            if (reminderAction2 != null) {
                codedOutputByteBufferNano.m17309K(5, reminderAction2, ReminderAction.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ReminderReference> JSON_ADAPTER = new ObjectJsonAdapter<ReminderReference>() { // from class: com.p1.mobile.putong.core.data.ReminderReference.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ReminderReference.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ReminderReference newInstance() {
            return new ReminderReference();
        }

        public boolean parseField(ReminderReference reminderReference, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    reminderReference.action = ReminderAction.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    reminderReference.f21237id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    reminderReference.type = ReminderSource.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ReminderReference reminderReference, JsonGenerator jsonGenerator) throws IOException {
            String str = reminderReference.f21237id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReminderReference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReminderReference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReminderReference new_() {
        ReminderReference reminderReference = new ReminderReference();
        reminderReference.nullCheck();
        return reminderReference;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ReminderReference mo225055clone() {
        ReminderReference reminderReference = new ReminderReference();
        reminderReference.f21237id = this.f21237id;
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
        return ValueObject.util_equals(this.f21237id, reminderReference.f21237id) && ValueObject.util_equals(this.type, reminderReference.type) && ValueObject.util_equals(this.action, reminderReference.action);
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
        String str = this.f21237id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        ReminderSource reminderSource = this.type;
        int iHashCode2 = (iHashCode + (reminderSource != null ? reminderSource.hashCode() : 0)) * 41;
        ReminderAction reminderAction = this.action;
        int iHashCode3 = iHashCode2 + (reminderAction != null ? reminderAction.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21237id == null) {
            this.f21237id = "";
        }
        if (this.type == null) {
            this.type = (ReminderSource) ReminderSource.JSON_ADAPTER.defaultEnum();
        }
        if (this.action == null) {
            this.action = (ReminderAction) ReminderAction.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
