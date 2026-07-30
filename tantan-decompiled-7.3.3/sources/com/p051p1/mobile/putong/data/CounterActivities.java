package com.p051p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.LimitTimePictureStatus;
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

/* JADX INFO: loaded from: classes12.dex */
public class CounterActivities extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counteractivities";

    @ProtobufIndex(index = 1)
    public int unread;

    @ProtobufIndex(index = 3)
    public int unreadGifts;

    @ProtobufIndex(index = 2)
    public int unreadInteractions;

    @ProtobufIndex(index = 4)
    public int unreadPicks;
    public static ProtobufAdapter<CounterActivities> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterActivities>() { // from class: com.p1.mobile.putong.data.CounterActivities.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterActivities counterActivities) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, counterActivities.unread) + CodedOutputByteBufferNano.m17281h(2, counterActivities.unreadInteractions) + CodedOutputByteBufferNano.m17281h(3, counterActivities.unreadGifts) + CodedOutputByteBufferNano.m17281h(4, counterActivities.unreadPicks);
            counterActivities.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterActivities parse(nc5 nc5Var) throws IOException {
            CounterActivities counterActivities = new CounterActivities();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    counterActivities.unread = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    counterActivities.unreadInteractions = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    counterActivities.unreadGifts = nc5Var.m162486j();
                } else {
                    if (iM162497u != 32) {
                        return counterActivities;
                    }
                    counterActivities.unreadPicks = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterActivities counterActivities, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, counterActivities.unread);
            codedOutputByteBufferNano.m17305G(2, counterActivities.unreadInteractions);
            codedOutputByteBufferNano.m17305G(3, counterActivities.unreadGifts);
            codedOutputByteBufferNano.m17305G(4, counterActivities.unreadPicks);
        }
    };
    public static JsonAdapter<CounterActivities> JSON_ADAPTER = new ObjectJsonAdapter<CounterActivities>() { // from class: com.p1.mobile.putong.data.CounterActivities.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterActivities.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterActivities newInstance() {
            return new CounterActivities();
        }

        public boolean parseField(CounterActivities counterActivities, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "unreadGifts":
                    counterActivities.unreadGifts = jsonParser.getValueAsInt();
                    return true;
                case "unreadPicks":
                    counterActivities.unreadPicks = jsonParser.getValueAsInt();
                    return true;
                case "unread":
                    counterActivities.unread = jsonParser.getValueAsInt();
                    return true;
                case "unreadInteractions":
                    counterActivities.unreadInteractions = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CounterActivities counterActivities, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "unreadGifts":
                case "unreadPicks":
                case "unread":
                case "unreadInteractions":
                    return true;
                default:
                    return super.parseFieldCheck(counterActivities, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterActivities counterActivities, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, counterActivities.unread);
            jsonGenerator.writeNumberField("unreadInteractions", counterActivities.unreadInteractions);
            jsonGenerator.writeNumberField("unreadGifts", counterActivities.unreadGifts);
            jsonGenerator.writeNumberField("unreadPicks", counterActivities.unreadPicks);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterActivities) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterActivities) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterActivities new_() {
        CounterActivities counterActivities = new CounterActivities();
        counterActivities.nullCheck();
        return counterActivities;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterActivities mo225055clone() {
        CounterActivities counterActivities = new CounterActivities();
        counterActivities.unread = this.unread;
        counterActivities.unreadInteractions = this.unreadInteractions;
        counterActivities.unreadGifts = this.unreadGifts;
        counterActivities.unreadPicks = this.unreadPicks;
        return counterActivities;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterActivities)) {
            return false;
        }
        CounterActivities counterActivities = (CounterActivities) obj;
        return this.unread == counterActivities.unread && this.unreadInteractions == counterActivities.unreadInteractions && this.unreadGifts == counterActivities.unreadGifts && this.unreadPicks == counterActivities.unreadPicks;
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
        int i2 = (((((((i * 41) + this.unread) * 41) + this.unreadInteractions) * 41) + this.unreadGifts) * 41) + this.unreadPicks;
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
