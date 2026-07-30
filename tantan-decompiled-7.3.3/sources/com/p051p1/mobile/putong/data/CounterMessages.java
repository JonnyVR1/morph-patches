package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p051p1.mobile.putong.data.UnreadDetail;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

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
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, counterMessages.unread) + CodedOutputByteBufferNano.m17281h(2, counterMessages.liunread);
            List<UnreadDetail> list = counterMessages.unreadDetails;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, list, UnreadDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(4, counterMessages.unReadOnlyMarriage);
            counterMessages.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterMessages parse(nc5 nc5Var) throws IOException {
            CounterMessages counterMessages = new CounterMessages();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (counterMessages.unreadDetails != null) {
                        break;
                    }
                    counterMessages.unreadDetails = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    counterMessages.unread = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    counterMessages.liunread = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    counterMessages.unreadDetails = (List) nc5Var.m162488l(UnreadDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 32) {
                        if (counterMessages.unreadDetails != null) {
                            break;
                        }
                        counterMessages.unreadDetails = new ArrayList();
                        return counterMessages;
                    }
                    counterMessages.unReadOnlyMarriage = nc5Var.m162486j();
                }
            }
            return counterMessages;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterMessages counterMessages, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, counterMessages.unread);
            codedOutputByteBufferNano.m17305G(2, counterMessages.liunread);
            List<UnreadDetail> list = counterMessages.unreadDetails;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, UnreadDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(4, counterMessages.unReadOnlyMarriage);
        }
    };
    public static JsonAdapter<CounterMessages> JSON_ADAPTER = new ObjectJsonAdapter<CounterMessages>() { // from class: com.p1.mobile.putong.data.CounterMessages.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterMessages.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterMessages counterMessages, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, counterMessages.unread);
            jsonGenerator.writeNumberField("liunread", counterMessages.liunread);
            if (counterMessages.unreadDetails != null) {
                jsonGenerator.writeFieldName("unreadDetails");
                JsonAdapter.serializeArray(counterMessages.unreadDetails, jsonGenerator, UnreadDetail.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("unReadOnlyMarriage", counterMessages.unReadOnlyMarriage);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public CounterMessages mo225055clone() {
        CounterMessages counterMessages = new CounterMessages();
        counterMessages.unread = this.unread;
        counterMessages.liunread = this.liunread;
        List<UnreadDetail> list = this.unreadDetails;
        if (list != null) {
            counterMessages.unreadDetails = ValueObject.util_map(list, new qcj() { // from class: l.yrb
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((UnreadDetail) obj).mo225055clone();
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
