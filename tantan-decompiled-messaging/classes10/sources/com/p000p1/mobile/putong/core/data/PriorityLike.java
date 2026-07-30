package com.p000p1.mobile.putong.core.data;

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
public class PriorityLike extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "prioritylike";

    @ProtobufIndex(index = 1)
    public boolean priorityMatch;
    public static ProtobufAdapter<PriorityLike> PROTOBUF_ADAPTER = new MessageNanoAdapter<PriorityLike>() { // from class: com.p1.mobile.putong.core.data.PriorityLike.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PriorityLike priorityLike) {
            int iB = CodedOutputByteBufferNano.b(1, priorityLike.priorityMatch);
            ((MessageNano) priorityLike).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PriorityLike m14849parse(nb5 nb5Var) throws IOException {
            PriorityLike priorityLike = new PriorityLike();
            while (nb5Var.u() == 8) {
                priorityLike.priorityMatch = nb5Var.g();
            }
            return priorityLike;
        }

        public void serialize(PriorityLike priorityLike, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, priorityLike.priorityMatch);
        }
    };
    public static JsonAdapter<PriorityLike> JSON_ADAPTER = new ObjectJsonAdapter<PriorityLike>() { // from class: com.p1.mobile.putong.core.data.PriorityLike.2
        public Class getDataClass() {
            return PriorityLike.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PriorityLike m14850newInstance() {
            return new PriorityLike();
        }

        public boolean parseField(PriorityLike priorityLike, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("priorityMatch")) {
                return false;
            }
            priorityLike.priorityMatch = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(PriorityLike priorityLike, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("priorityMatch")) {
                return true;
            }
            return super.parseFieldCheck(priorityLike, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(PriorityLike priorityLike, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("priorityMatch", priorityLike.priorityMatch);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PriorityLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PriorityLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PriorityLike new_() {
        PriorityLike priorityLike = new PriorityLike();
        priorityLike.nullCheck();
        return priorityLike;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PriorityLike m14848clone() {
        PriorityLike priorityLike = new PriorityLike();
        priorityLike.priorityMatch = this.priorityMatch;
        return priorityLike;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PriorityLike) && this.priorityMatch == ((PriorityLike) obj).priorityMatch;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.priorityMatch ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
