package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p046p1.mobile.putong.data.UnreadDetail;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterMessages counterMessages) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, counterMessages.unread) + CodedOutputByteBufferNano.m17226h(2, counterMessages.liunread);
            List<UnreadDetail> list = counterMessages.unreadDetails;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, list, UnreadDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(4, counterMessages.unReadOnlyMarriage);
            counterMessages.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterMessages parse(nb5 nb5Var) throws IOException {
            CounterMessages counterMessages = new CounterMessages();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (counterMessages.unreadDetails != null) {
                        break;
                    }
                    counterMessages.unreadDetails = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    counterMessages.unread = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    counterMessages.liunread = nb5Var.m158741j();
                } else if (iM158752u == 26) {
                    counterMessages.unreadDetails = (List) nb5Var.m158743l(UnreadDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 32) {
                        if (counterMessages.unreadDetails != null) {
                            break;
                        }
                        counterMessages.unreadDetails = new ArrayList();
                        return counterMessages;
                    }
                    counterMessages.unReadOnlyMarriage = nb5Var.m158741j();
                }
            }
            return counterMessages;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterMessages counterMessages, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, counterMessages.unread);
            codedOutputByteBufferNano.m17250G(2, counterMessages.liunread);
            List<UnreadDetail> list = counterMessages.unreadDetails;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, UnreadDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(4, counterMessages.unReadOnlyMarriage);
        }
    };
    public static JsonAdapter<CounterMessages> JSON_ADAPTER = new ObjectJsonAdapter<CounterMessages>() { // from class: com.p1.mobile.putong.data.CounterMessages.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterMessages.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterMessages newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterMessages counterMessages, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, counterMessages.unread);
            jsonGenerator.writeNumberField("liunread", counterMessages.liunread);
            if (counterMessages.unreadDetails != null) {
                jsonGenerator.writeFieldName("unreadDetails");
                JsonAdapter.serializeArray(counterMessages.unreadDetails, jsonGenerator, UnreadDetail.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("unReadOnlyMarriage", counterMessages.unReadOnlyMarriage);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterMessages new_() {
        CounterMessages counterMessages = new CounterMessages();
        counterMessages.nullCheck();
        return counterMessages;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterMessages mo223809clone() {
        CounterMessages counterMessages = new CounterMessages();
        counterMessages.unread = this.unread;
        counterMessages.liunread = this.liunread;
        List<UnreadDetail> list = this.unreadDetails;
        if (list != null) {
            counterMessages.unreadDetails = ValueObject.util_map(list, new w9j() { // from class: l.kqb
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((UnreadDetail) obj).mo223809clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.unread) * 41) + this.liunread) * 41;
        List<UnreadDetail> list = this.unreadDetails;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.unReadOnlyMarriage;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.unreadDetails == null) {
            this.unreadDetails = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
