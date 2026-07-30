package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.BannerFrequencyType;
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
public class HeartBeat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "heartbeat";

    @ProtobufIndex(index = 1)
    public int interval;
    public static ProtobufAdapter<HeartBeat> PROTOBUF_ADAPTER = new MessageNanoAdapter<HeartBeat>() { // from class: com.p1.mobile.putong.core.data.HeartBeat.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HeartBeat heartBeat) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, heartBeat.interval);
            heartBeat.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HeartBeat parse(nb5 nb5Var) throws IOException {
            HeartBeat heartBeat = new HeartBeat();
            while (nb5Var.m158752u() == 8) {
                heartBeat.interval = nb5Var.m158741j();
            }
            return heartBeat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HeartBeat heartBeat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, heartBeat.interval);
        }
    };
    public static JsonAdapter<HeartBeat> JSON_ADAPTER = new ObjectJsonAdapter<HeartBeat>() { // from class: com.p1.mobile.putong.core.data.HeartBeat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HeartBeat.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HeartBeat newInstance() {
            return new HeartBeat();
        }

        public boolean parseField(HeartBeat heartBeat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(BannerFrequencyType.interval)) {
                return false;
            }
            heartBeat.interval = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(HeartBeat heartBeat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(BannerFrequencyType.interval)) {
                return true;
            }
            return super.parseFieldCheck(heartBeat, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HeartBeat heartBeat, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BannerFrequencyType.interval, heartBeat.interval);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HeartBeat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HeartBeat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HeartBeat new_() {
        HeartBeat heartBeat = new HeartBeat();
        heartBeat.nullCheck();
        return heartBeat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HeartBeat mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "heartbeat";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.interval;
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
