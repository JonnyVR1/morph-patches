package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CounterActivities counterActivities) {
            int iH = CodedOutputByteBufferNano.h(1, counterActivities.unread) + CodedOutputByteBufferNano.h(2, counterActivities.unreadInteractions) + CodedOutputByteBufferNano.h(3, counterActivities.unreadGifts) + CodedOutputByteBufferNano.h(4, counterActivities.unreadPicks);
            ((MessageNano) counterActivities).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CounterActivities m17875parse(nb5 nb5Var) throws IOException {
            CounterActivities counterActivities = new CounterActivities();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    counterActivities.unread = nb5Var.j();
                } else if (iU == 16) {
                    counterActivities.unreadInteractions = nb5Var.j();
                } else if (iU == 24) {
                    counterActivities.unreadGifts = nb5Var.j();
                } else {
                    if (iU != 32) {
                        return counterActivities;
                    }
                    counterActivities.unreadPicks = nb5Var.j();
                }
            }
        }

        public void serialize(CounterActivities counterActivities, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, counterActivities.unread);
            codedOutputByteBufferNano.G(2, counterActivities.unreadInteractions);
            codedOutputByteBufferNano.G(3, counterActivities.unreadGifts);
            codedOutputByteBufferNano.G(4, counterActivities.unreadPicks);
        }
    };
    public static JsonAdapter<CounterActivities> JSON_ADAPTER = new ObjectJsonAdapter<CounterActivities>() { // from class: com.p1.mobile.putong.data.CounterActivities.2
        public Class getDataClass() {
            return CounterActivities.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CounterActivities mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterActivities counterActivities, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unread", counterActivities.unread);
            jsonGenerator.writeNumberField("unreadInteractions", counterActivities.unreadInteractions);
            jsonGenerator.writeNumberField("unreadGifts", counterActivities.unreadGifts);
            jsonGenerator.writeNumberField("unreadPicks", counterActivities.unreadPicks);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterActivities) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterActivities) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterActivities new_() {
        CounterActivities counterActivities = new CounterActivities();
        counterActivities.nullCheck();
        return counterActivities;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CounterActivities m17874clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.unread) * 41) + this.unreadInteractions) * 41) + this.unreadGifts) * 41) + this.unreadPicks;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
