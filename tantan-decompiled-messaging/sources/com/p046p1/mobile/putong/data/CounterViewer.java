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
public class CounterViewer extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counterviewer";

    @ProtobufIndex(index = 1)
    public int total;

    @ProtobufIndex(index = 2)
    public int unread;
    public static ProtobufAdapter<CounterViewer> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterViewer>() { // from class: com.p1.mobile.putong.data.CounterViewer.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterViewer counterViewer) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, counterViewer.total) + CodedOutputByteBufferNano.m17226h(2, counterViewer.unread);
            counterViewer.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterViewer parse(nb5 nb5Var) throws IOException {
            CounterViewer counterViewer = new CounterViewer();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    counterViewer.total = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return counterViewer;
                    }
                    counterViewer.unread = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterViewer counterViewer, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, counterViewer.total);
            codedOutputByteBufferNano.m17250G(2, counterViewer.unread);
        }
    };
    public static JsonAdapter<CounterViewer> JSON_ADAPTER = new ObjectJsonAdapter<CounterViewer>() { // from class: com.p1.mobile.putong.data.CounterViewer.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterViewer.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterViewer newInstance() {
            return new CounterViewer();
        }

        public boolean parseField(CounterViewer counterViewer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(LimitTimePictureStatus.unread)) {
                counterViewer.unread = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("total")) {
                return false;
            }
            counterViewer.total = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(CounterViewer counterViewer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(LimitTimePictureStatus.unread) || str.equals("total")) {
                return true;
            }
            return super.parseFieldCheck(counterViewer, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterViewer counterViewer, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total", counterViewer.total);
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, counterViewer.unread);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterViewer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterViewer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterViewer new_() {
        CounterViewer counterViewer = new CounterViewer();
        counterViewer.nullCheck();
        return counterViewer;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterViewer mo223809clone() {
        CounterViewer counterViewer = new CounterViewer();
        counterViewer.total = this.total;
        counterViewer.unread = this.unread;
        return counterViewer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterViewer)) {
            return false;
        }
        CounterViewer counterViewer = (CounterViewer) obj;
        return this.total == counterViewer.total && this.unread == counterViewer.unread;
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
        int i2 = (((i * 41) + this.total) * 41) + this.unread;
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
