package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Passby passby) {
            MessageLocation messageLocation = passby.location;
            int iM17230l = (messageLocation != null ? CodedOutputByteBufferNano.m17230l(1, messageLocation, MessageLocation.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.m17226h(2, passby.count) + CodedOutputByteBufferNano.m17222d(3, passby.latestTime);
            passby.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Passby parse(nb5 nb5Var) throws IOException {
            Passby passby = new Passby();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (passby.location != null) {
                        break;
                    }
                    passby.location = MessageLocation.new_();
                    break;
                }
                if (iM158752u == 10) {
                    passby.location = (MessageLocation) nb5Var.m158743l(MessageLocation.PROTOBUF_ADAPTER);
                } else if (iM158752u == 16) {
                    passby.count = nb5Var.m158741j();
                } else {
                    if (iM158752u != 25) {
                        if (passby.location != null) {
                            break;
                        }
                        passby.location = MessageLocation.new_();
                        return passby;
                    }
                    passby.latestTime = nb5Var.m158739h();
                }
            }
            return passby;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Passby passby, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MessageLocation messageLocation = passby.location;
            if (messageLocation != null) {
                codedOutputByteBufferNano.m17254K(1, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(2, passby.count);
            codedOutputByteBufferNano.m17246C(3, passby.latestTime);
        }
    };
    public static JsonAdapter<Passby> JSON_ADAPTER = new ObjectJsonAdapter<Passby>() { // from class: com.p1.mobile.putong.data.Passby.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Passby.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Passby newInstance() {
            return new Passby();
        }

        public boolean parseField(Passby passby, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "latestTime":
                    passby.latestTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "count":
                    passby.count = jsonParser.getValueAsInt();
                    return true;
                case "location":
                    passby.location = MessageLocation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Passby passby, JsonGenerator jsonGenerator) throws IOException {
            if (passby.location != null) {
                jsonGenerator.writeFieldName("location");
                MessageLocation.JSON_ADAPTER.serialize(passby.location, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("count", passby.count);
            jsonGenerator.writeFieldName("latestTime");
            Converter.API_TIME.serialize(Double.valueOf(passby.latestTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Passby) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Passby) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Passby new_() {
        Passby passby = new Passby();
        passby.nullCheck();
        return passby;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Passby mo223809clone() {
        Passby passby = new Passby();
        MessageLocation messageLocation = this.location;
        if (messageLocation != null) {
            passby.location = messageLocation.mo223809clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        MessageLocation messageLocation = this.location;
        int iHashCode = ((i2 + (messageLocation != null ? messageLocation.hashCode() : 0)) * 41) + this.count;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latestTime);
        int i3 = (iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.location == null) {
            this.location = MessageLocation.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
