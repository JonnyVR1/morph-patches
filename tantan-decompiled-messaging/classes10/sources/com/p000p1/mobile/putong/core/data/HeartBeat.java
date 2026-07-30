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
public class HeartBeat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "heartbeat";

    @ProtobufIndex(index = 1)
    public int interval;
    public static ProtobufAdapter<HeartBeat> PROTOBUF_ADAPTER = new MessageNanoAdapter<HeartBeat>() { // from class: com.p1.mobile.putong.core.data.HeartBeat.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HeartBeat heartBeat) {
            int iH = CodedOutputByteBufferNano.h(1, heartBeat.interval);
            ((MessageNano) heartBeat).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HeartBeat m13235parse(nb5 nb5Var) throws IOException {
            HeartBeat heartBeat = new HeartBeat();
            while (nb5Var.u() == 8) {
                heartBeat.interval = nb5Var.j();
            }
            return heartBeat;
        }

        public void serialize(HeartBeat heartBeat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, heartBeat.interval);
        }
    };
    public static JsonAdapter<HeartBeat> JSON_ADAPTER = new ObjectJsonAdapter<HeartBeat>() { // from class: com.p1.mobile.putong.core.data.HeartBeat.2
        public Class getDataClass() {
            return HeartBeat.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HeartBeat m13236newInstance() {
            return new HeartBeat();
        }

        public boolean parseField(HeartBeat heartBeat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("interval")) {
                return false;
            }
            heartBeat.interval = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(HeartBeat heartBeat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("interval")) {
                return true;
            }
            return super.parseFieldCheck(heartBeat, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(HeartBeat heartBeat, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("interval", heartBeat.interval);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HeartBeat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HeartBeat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HeartBeat new_() {
        HeartBeat heartBeat = new HeartBeat();
        heartBeat.nullCheck();
        return heartBeat;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HeartBeat m13234clone() {
        HeartBeat heartBeat = new HeartBeat();
        heartBeat.interval = this.interval;
        return heartBeat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof HeartBeat) && this.interval == ((HeartBeat) obj).interval;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.interval;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
