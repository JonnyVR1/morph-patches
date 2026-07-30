package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class PriorityLike extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "prioritylike";

    @ProtobufIndex(index = 1)
    public boolean priorityMatch;
    public static ProtobufAdapter<PriorityLike> PROTOBUF_ADAPTER = new MessageNanoAdapter<PriorityLike>() { // from class: com.p1.mobile.putong.core.data.PriorityLike.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PriorityLike priorityLike) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, priorityLike.priorityMatch);
            priorityLike.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PriorityLike parse(nb5 nb5Var) throws IOException {
            PriorityLike priorityLike = new PriorityLike();
            while (nb5Var.m158752u() == 8) {
                priorityLike.priorityMatch = nb5Var.m158738g();
            }
            return priorityLike;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PriorityLike priorityLike, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, priorityLike.priorityMatch);
        }
    };
    public static JsonAdapter<PriorityLike> JSON_ADAPTER = new ObjectJsonAdapter<PriorityLike>() { // from class: com.p1.mobile.putong.core.data.PriorityLike.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PriorityLike.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PriorityLike newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PriorityLike priorityLike, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("priorityMatch", priorityLike.priorityMatch);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PriorityLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PriorityLike) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PriorityLike new_() {
        PriorityLike priorityLike = new PriorityLike();
        priorityLike.nullCheck();
        return priorityLike;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PriorityLike mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.priorityMatch ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
