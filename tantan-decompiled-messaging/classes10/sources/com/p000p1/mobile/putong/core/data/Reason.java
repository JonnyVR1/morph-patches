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
public class Reason extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reason";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f150id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String value;
    public static ProtobufAdapter<Reason> PROTOBUF_ADAPTER = new MessageNanoAdapter<Reason>() { // from class: com.p1.mobile.putong.core.data.Reason.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Reason reason) {
            String str = reason.f150id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = reason.value;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) reason).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Reason m15277parse(nb5 nb5Var) throws IOException {
            Reason reason = new Reason();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (reason.f150id == null) {
                        reason.f150id = "";
                    }
                    if (reason.value != null) {
                        break;
                    }
                    reason.value = "";
                    break;
                }
                if (iU == 10) {
                    reason.f150id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (reason.f150id == null) {
                            reason.f150id = "";
                        }
                        if (reason.value != null) {
                            break;
                        }
                        reason.value = "";
                        return reason;
                    }
                    reason.value = nb5Var.s();
                }
            }
            return reason;
        }

        public void serialize(Reason reason, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = reason.f150id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = reason.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<Reason> JSON_ADAPTER = new ObjectJsonAdapter<Reason>() { // from class: com.p1.mobile.putong.core.data.Reason.2
        public Class getDataClass() {
            return Reason.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Reason m15278newInstance() {
            return new Reason();
        }

        public boolean parseField(Reason reason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                reason.f150id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("value")) {
                return false;
            }
            reason.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Reason reason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(reason, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(Reason reason, JsonGenerator jsonGenerator) throws IOException {
            String str = reason.f150id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = reason.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Reason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Reason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Reason new_() {
        Reason reason = new Reason();
        reason.nullCheck();
        return reason;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Reason m15276clone() {
        Reason reason = new Reason();
        reason.f150id = this.f150id;
        reason.value = this.value;
        return reason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Reason)) {
            return false;
        }
        Reason reason = (Reason) obj;
        return ValueObject.util_equals(this.f150id, reason.f150id) && ValueObject.util_equals(this.value, reason.value);
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
        String str = this.f150id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f150id == null) {
            this.f150id = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
