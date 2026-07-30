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
public class GeoLocation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "geolocation";

    @NonNull
    @ProtobufIndex(index = 1)
    public DoublePair coordinates;

    @NonNull
    @ProtobufIndex(index = 2)
    public ClientAction intent;

    @ProtobufIndex(index = 3)
    public int uncertainty;
    public static ProtobufAdapter<GeoLocation> PROTOBUF_ADAPTER = new MessageNanoAdapter<GeoLocation>() { // from class: com.p1.mobile.putong.data.GeoLocation.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GeoLocation geoLocation) {
            DoublePair doublePair = geoLocation.coordinates;
            int iL = doublePair != null ? CodedOutputByteBufferNano.l(1, doublePair, DoublePair.PROTOBUF_ADAPTER) : 0;
            ClientAction clientAction = geoLocation.intent;
            if (clientAction != null) {
                iL += CodedOutputByteBufferNano.h(2, clientAction.ordinal());
            }
            int iH = iL + CodedOutputByteBufferNano.h(3, geoLocation.uncertainty);
            ClientAction clientAction2 = geoLocation.intent;
            if (clientAction2 != null) {
                iH += CodedOutputByteBufferNano.l(4, clientAction2, ClientAction.PROTOBUF_ADAPTER);
            }
            ((MessageNano) geoLocation).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GeoLocation m18175parse(nb5 nb5Var) throws IOException {
            GeoLocation geoLocation = new GeoLocation();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (geoLocation.intent == null && numValueOf != null) {
                        geoLocation.intent = (ClientAction) ClientAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (geoLocation.coordinates == null) {
                        geoLocation.coordinates = DoublePair.new_();
                    }
                    if (geoLocation.intent != null) {
                        break;
                    }
                    geoLocation.intent = (ClientAction) ClientAction.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    geoLocation.coordinates = (DoublePair) nb5Var.l(DoublePair.PROTOBUF_ADAPTER);
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 24) {
                    geoLocation.uncertainty = nb5Var.j();
                } else {
                    if (iU != 34) {
                        if (geoLocation.intent == null && numValueOf != null) {
                            geoLocation.intent = (ClientAction) ClientAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (geoLocation.coordinates == null) {
                            geoLocation.coordinates = DoublePair.new_();
                        }
                        if (geoLocation.intent != null) {
                            break;
                        }
                        geoLocation.intent = (ClientAction) ClientAction.JSON_ADAPTER.defaultEnum();
                        return geoLocation;
                    }
                    geoLocation.intent = (ClientAction) nb5Var.l(ClientAction.PROTOBUF_ADAPTER);
                }
            }
            return geoLocation;
        }

        public void serialize(GeoLocation geoLocation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            DoublePair doublePair = geoLocation.coordinates;
            if (doublePair != null) {
                codedOutputByteBufferNano.K(1, doublePair, DoublePair.PROTOBUF_ADAPTER);
            }
            ClientAction clientAction = geoLocation.intent;
            if (clientAction != null) {
                codedOutputByteBufferNano.G(2, clientAction.ordinal());
            }
            codedOutputByteBufferNano.G(3, geoLocation.uncertainty);
            ClientAction clientAction2 = geoLocation.intent;
            if (clientAction2 != null) {
                codedOutputByteBufferNano.K(4, clientAction2, ClientAction.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GeoLocation> JSON_ADAPTER = new ObjectJsonAdapter<GeoLocation>() { // from class: com.p1.mobile.putong.data.GeoLocation.2
        public Class getDataClass() {
            return GeoLocation.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public GeoLocation mo17830newInstance() {
            return new GeoLocation();
        }

        public boolean parseField(GeoLocation geoLocation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "uncertainty":
                    geoLocation.uncertainty = jsonParser.getValueAsInt();
                    return true;
                case "intent":
                    geoLocation.intent = (ClientAction) ClientAction.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "coordinates":
                    geoLocation.coordinates = (DoublePair) Converter.DOUBLE_PAIR.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GeoLocation geoLocation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "uncertainty":
                case "intent":
                case "coordinates":
                    return true;
                default:
                    return super.parseFieldCheck(geoLocation, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GeoLocation geoLocation, JsonGenerator jsonGenerator) throws IOException {
            if (geoLocation.coordinates != null) {
                jsonGenerator.writeFieldName("coordinates");
                Converter.DOUBLE_PAIR.serialize(geoLocation.coordinates, jsonGenerator, true);
            }
            if (geoLocation.intent != null) {
                jsonGenerator.writeFieldName("intent");
                ClientAction.JSON_ADAPTER.serialize(geoLocation.intent, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("uncertainty", geoLocation.uncertainty);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GeoLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GeoLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GeoLocation new_() {
        GeoLocation geoLocation = new GeoLocation();
        geoLocation.nullCheck();
        return geoLocation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GeoLocation m18174clone() {
        GeoLocation geoLocation = new GeoLocation();
        DoublePair doublePair = this.coordinates;
        if (doublePair != null) {
            geoLocation.coordinates = doublePair.m18000clone();
        }
        geoLocation.intent = this.intent;
        geoLocation.uncertainty = this.uncertainty;
        return geoLocation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeoLocation)) {
            return false;
        }
        GeoLocation geoLocation = (GeoLocation) obj;
        return ValueObject.util_equals(this.coordinates, geoLocation.coordinates) && ValueObject.util_equals(this.intent, geoLocation.intent) && this.uncertainty == geoLocation.uncertainty;
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
        DoublePair doublePair = this.coordinates;
        int iHashCode = (i2 + (doublePair != null ? doublePair.hashCode() : 0)) * 41;
        ClientAction clientAction = this.intent;
        int iHashCode2 = ((iHashCode + (clientAction != null ? clientAction.hashCode() : 0)) * 41) + this.uncertainty;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.coordinates == null) {
            this.coordinates = DoublePair.new_();
        }
        if (this.intent == null) {
            this.intent = (ClientAction) ClientAction.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
