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
public class CounterKankan extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counterkankan";

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<CounterKankan> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterKankan>() { // from class: com.p1.mobile.putong.data.CounterKankan.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterKankan counterKankan) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, counterKankan.unread);
            counterKankan.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterKankan parse(nb5 nb5Var) throws IOException {
            CounterKankan counterKankan = new CounterKankan();
            while (nb5Var.m158752u() == 8) {
                counterKankan.unread = nb5Var.m158741j();
            }
            return counterKankan;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterKankan counterKankan, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, counterKankan.unread);
        }
    };
    public static JsonAdapter<CounterKankan> JSON_ADAPTER = new ObjectJsonAdapter<CounterKankan>() { // from class: com.p1.mobile.putong.data.CounterKankan.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterKankan.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterKankan newInstance() {
            return new CounterKankan();
        }

        public boolean parseField(CounterKankan counterKankan, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(LimitTimePictureStatus.unread)) {
                return false;
            }
            counterKankan.unread = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(CounterKankan counterKankan, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(LimitTimePictureStatus.unread)) {
                return true;
            }
            return super.parseFieldCheck(counterKankan, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterKankan counterKankan, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, counterKankan.unread);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterKankan) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterKankan) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterKankan new_() {
        CounterKankan counterKankan = new CounterKankan();
        counterKankan.nullCheck();
        return counterKankan;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterKankan mo223809clone() {
        CounterKankan counterKankan = new CounterKankan();
        counterKankan.unread = this.unread;
        return counterKankan;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CounterKankan) && this.unread == ((CounterKankan) obj).unread;
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
        int i2 = (i * 41) + this.unread;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    public boolean showRedDot() {
        return this.unread > 0;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
