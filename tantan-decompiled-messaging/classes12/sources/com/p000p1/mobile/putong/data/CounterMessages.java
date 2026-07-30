package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.UnreadDetail;
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
public class CounterMessages extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "countermessages";

    @ProtobufIndex(index = 2)
    public int liunread;

    @ProtobufIndex(index = 4)
    public int unReadOnlyMarriage;

    @ProtobufIndex(index = 1)
    public int unread;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<UnreadDetail> unreadDetails;
    public static ProtobufAdapter<CounterMessages> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterMessages>() { // from class: com.p1.mobile.putong.data.CounterMessages.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CounterMessages counterMessages) {
            int iH = CodedOutputByteBufferNano.h(1, counterMessages.unread) + CodedOutputByteBufferNano.h(2, counterMessages.liunread);
            List<UnreadDetail> list = counterMessages.unreadDetails;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(3, list, UnreadDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(4, counterMessages.unReadOnlyMarriage);
            ((MessageNano) counterMessages).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CounterMessages m17896parse(nb5 nb5Var) throws IOException {
            CounterMessages counterMessages = new CounterMessages();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (counterMessages.unreadDetails != null) {
                        break;
                    }
                    counterMessages.unreadDetails = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    counterMessages.unread = nb5Var.j();
                } else if (iU == 16) {
                    counterMessages.liunread = nb5Var.j();
                } else if (iU == 26) {
                    counterMessages.unreadDetails = (List) nb5Var.l(UnreadDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 32) {
                        if (counterMessages.unreadDetails != null) {
                            break;
                        }
                        counterMessages.unreadDetails = new ArrayList();
                        return counterMessages;
                    }
                    counterMessages.unReadOnlyMarriage = nb5Var.j();
                }
            }
            return counterMessages;
        }

        public void serialize(CounterMessages counterMessages, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, counterMessages.unread);
            codedOutputByteBufferNano.G(2, counterMessages.liunread);
            List<UnreadDetail> list = counterMessages.unreadDetails;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, UnreadDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(4, counterMessages.unReadOnlyMarriage);
        }
    };
    public static JsonAdapter<CounterMessages> JSON_ADAPTER = new ObjectJsonAdapter<CounterMessages>() { // from class: com.p1.mobile.putong.data.CounterMessages.2
        public Class getDataClass() {
            return CounterMessages.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CounterMessages mo17830newInstance() {
            return new CounterMessages();
        }

        public boolean parseField(CounterMessages counterMessages, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "unreadDetails":
                    counterMessages.unreadDetails = JsonAdapter.parseArray(jsonParser, UnreadDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "unReadOnlyMarriage":
                    counterMessages.unReadOnlyMarriage = jsonParser.getValueAsInt();
                    return true;
                case "unread":
                    counterMessages.unread = jsonParser.getValueAsInt();
                    return true;
                case "liunread":
                    counterMessages.liunread = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CounterMessages counterMessages, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "unreadDetails":
                case "unReadOnlyMarriage":
                case "unread":
                case "liunread":
                    return true;
                default:
                    return super.parseFieldCheck(counterMessages, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterMessages counterMessages, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unread", counterMessages.unread);
            jsonGenerator.writeNumberField("liunread", counterMessages.liunread);
            if (counterMessages.unreadDetails != null) {
                jsonGenerator.writeFieldName("unreadDetails");
                JsonAdapter.serializeArray(counterMessages.unreadDetails, jsonGenerator, UnreadDetail.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("unReadOnlyMarriage", counterMessages.unReadOnlyMarriage);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterMessages new_() {
        CounterMessages counterMessages = new CounterMessages();
        counterMessages.nullCheck();
        return counterMessages;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CounterMessages m17895clone() {
        CounterMessages counterMessages = new CounterMessages();
        counterMessages.unread = this.unread;
        counterMessages.liunread = this.liunread;
        List<UnreadDetail> list = this.unreadDetails;
        if (list != null) {
            counterMessages.unreadDetails = ValueObject.util_map(list, new w9j() { // from class: l.kqb
                public final Object call(Object obj) {
                    return ((UnreadDetail) obj).m19141clone();
                }
            });
        }
        counterMessages.unReadOnlyMarriage = this.unReadOnlyMarriage;
        return counterMessages;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterMessages)) {
            return false;
        }
        CounterMessages counterMessages = (CounterMessages) obj;
        return this.unread == counterMessages.unread && this.liunread == counterMessages.liunread && ValueObject.util_equals(this.unreadDetails, counterMessages.unreadDetails) && this.unReadOnlyMarriage == counterMessages.unReadOnlyMarriage;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.unread) * 41) + this.liunread) * 41;
        List<UnreadDetail> list = this.unreadDetails;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.unReadOnlyMarriage;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.unreadDetails == null) {
            this.unreadDetails = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
