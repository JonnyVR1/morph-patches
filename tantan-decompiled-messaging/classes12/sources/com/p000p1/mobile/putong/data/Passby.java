package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class Passby extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "passby";

    @ProtobufIndex(index = 2)
    public int count;

    @ProtobufIndex(index = 3)
    public double latestTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public MessageLocation location;
    public static ProtobufAdapter<Passby> PROTOBUF_ADAPTER = new MessageNanoAdapter<Passby>() { // from class: com.p1.mobile.putong.data.Passby.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Passby passby) {
            MessageLocation messageLocation = passby.location;
            int iL = (messageLocation != null ? CodedOutputByteBufferNano.l(1, messageLocation, MessageLocation.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.h(2, passby.count) + CodedOutputByteBufferNano.d(3, passby.latestTime);
            ((MessageNano) passby).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Passby m18771parse(nb5 nb5Var) throws IOException {
            Passby passby = new Passby();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (passby.location != null) {
                        break;
                    }
                    passby.location = MessageLocation.new_();
                    break;
                }
                if (iU == 10) {
                    passby.location = (MessageLocation) nb5Var.l(MessageLocation.PROTOBUF_ADAPTER);
                } else if (iU == 16) {
                    passby.count = nb5Var.j();
                } else {
                    if (iU != 25) {
                        if (passby.location != null) {
                            break;
                        }
                        passby.location = MessageLocation.new_();
                        return passby;
                    }
                    passby.latestTime = nb5Var.h();
                }
            }
            return passby;
        }

        public void serialize(Passby passby, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MessageLocation messageLocation = passby.location;
            if (messageLocation != null) {
                codedOutputByteBufferNano.K(1, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(2, passby.count);
            codedOutputByteBufferNano.C(3, passby.latestTime);
        }
    };
    public static JsonAdapter<Passby> JSON_ADAPTER = new ObjectJsonAdapter<Passby>() { // from class: com.p1.mobile.putong.data.Passby.2
        public Class getDataClass() {
            return Passby.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Passby mo17830newInstance() {
            return new Passby();
        }

        public boolean parseField(Passby passby, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "latestTime":
                    passby.latestTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "count":
                    passby.count = jsonParser.getValueAsInt();
                    return true;
                case "location":
                    passby.location = (MessageLocation) MessageLocation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Passby passby, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "latestTime":
                case "count":
                case "location":
                    return true;
                default:
                    return super.parseFieldCheck(passby, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Passby passby, JsonGenerator jsonGenerator) throws IOException {
            if (passby.location != null) {
                jsonGenerator.writeFieldName("location");
                MessageLocation.JSON_ADAPTER.serialize(passby.location, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("count", passby.count);
            jsonGenerator.writeFieldName("latestTime");
            Converter.API_TIME.serialize(Double.valueOf(passby.latestTime), jsonGenerator, true);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Passby) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Passby) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Passby new_() {
        Passby passby = new Passby();
        passby.nullCheck();
        return passby;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Passby m18770clone() {
        Passby passby = new Passby();
        MessageLocation messageLocation = this.location;
        if (messageLocation != null) {
            passby.location = messageLocation.m18458clone();
        }
        passby.count = this.count;
        passby.latestTime = this.latestTime;
        return passby;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Passby)) {
            return false;
        }
        Passby passby = (Passby) obj;
        return ValueObject.util_equals(this.location, passby.location) && this.count == passby.count && this.latestTime == passby.latestTime;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        MessageLocation messageLocation = this.location;
        int iHashCode = ((i2 + (messageLocation != null ? messageLocation.hashCode() : 0)) * 41) + this.count;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latestTime);
        int i3 = (iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.location == null) {
            this.location = MessageLocation.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
