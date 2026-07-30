package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.LimitTimePictureStatus;
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
public class CounterConversations extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counterconversations";

    @ProtobufIndex(index = 4)
    public int addressBookUnseen;

    @ProtobufIndex(index = 1)
    public int total;

    @ProtobufIndex(index = 2)
    public int unread;

    @ProtobufIndex(index = 3)
    public int unseen;
    public static ProtobufAdapter<CounterConversations> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterConversations>() { // from class: com.p1.mobile.putong.data.CounterConversations.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterConversations counterConversations) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, counterConversations.total) + CodedOutputByteBufferNano.m17226h(2, counterConversations.unread) + CodedOutputByteBufferNano.m17226h(3, counterConversations.unseen) + CodedOutputByteBufferNano.m17226h(4, counterConversations.addressBookUnseen);
            counterConversations.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterConversations parse(nb5 nb5Var) throws IOException {
            CounterConversations counterConversations = new CounterConversations();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    counterConversations.total = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    counterConversations.unread = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    counterConversations.unseen = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        return counterConversations;
                    }
                    counterConversations.addressBookUnseen = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterConversations counterConversations, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, counterConversations.total);
            codedOutputByteBufferNano.m17250G(2, counterConversations.unread);
            codedOutputByteBufferNano.m17250G(3, counterConversations.unseen);
            codedOutputByteBufferNano.m17250G(4, counterConversations.addressBookUnseen);
        }
    };
    public static JsonAdapter<CounterConversations> JSON_ADAPTER = new ObjectJsonAdapter<CounterConversations>() { // from class: com.p1.mobile.putong.data.CounterConversations.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterConversations.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterConversations newInstance() {
            return new CounterConversations();
        }

        public boolean parseField(CounterConversations counterConversations, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "unread":
                    counterConversations.unread = jsonParser.getValueAsInt();
                    return true;
                case "unseen":
                    counterConversations.unseen = jsonParser.getValueAsInt();
                    return true;
                case "addressBookUnseen":
                    counterConversations.addressBookUnseen = jsonParser.getValueAsInt();
                    return true;
                case "total":
                    counterConversations.total = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CounterConversations counterConversations, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "unread":
                case "unseen":
                case "addressBookUnseen":
                case "total":
                    return true;
                default:
                    return super.parseFieldCheck(counterConversations, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterConversations counterConversations, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total", counterConversations.total);
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, counterConversations.unread);
            jsonGenerator.writeNumberField("unseen", counterConversations.unseen);
            jsonGenerator.writeNumberField("addressBookUnseen", counterConversations.addressBookUnseen);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterConversations) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterConversations) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterConversations new_() {
        CounterConversations counterConversations = new CounterConversations();
        counterConversations.nullCheck();
        return counterConversations;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterConversations mo223809clone() {
        CounterConversations counterConversations = new CounterConversations();
        counterConversations.total = this.total;
        counterConversations.unread = this.unread;
        counterConversations.unseen = this.unseen;
        counterConversations.addressBookUnseen = this.addressBookUnseen;
        return counterConversations;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterConversations)) {
            return false;
        }
        CounterConversations counterConversations = (CounterConversations) obj;
        return this.total == counterConversations.total && this.unread == counterConversations.unread && this.unseen == counterConversations.unseen && this.addressBookUnseen == counterConversations.addressBookUnseen;
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
        int i2 = (((((((i * 41) + this.total) * 41) + this.unread) * 41) + this.unseen) * 41) + this.addressBookUnseen;
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
