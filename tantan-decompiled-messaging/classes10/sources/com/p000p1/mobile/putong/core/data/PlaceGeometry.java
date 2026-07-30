package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.PlaceLocation;
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
public class PlaceGeometry extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "placegeometry";

    @NonNull
    @ProtobufIndex(index = 1)
    public PlaceLocation location;
    public static ProtobufAdapter<PlaceGeometry> PROTOBUF_ADAPTER = new MessageNanoAdapter<PlaceGeometry>() { // from class: com.p1.mobile.putong.core.data.PlaceGeometry.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PlaceGeometry placeGeometry) {
            PlaceLocation placeLocation = placeGeometry.location;
            int iL = placeLocation != null ? CodedOutputByteBufferNano.l(1, placeLocation, PlaceLocation.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) placeGeometry).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PlaceGeometry m14817parse(nb5 nb5Var) throws IOException {
            PlaceGeometry placeGeometry = new PlaceGeometry();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (placeGeometry.location != null) {
                        break;
                    }
                    placeGeometry.location = PlaceLocation.new_();
                    break;
                }
                if (iU != 10) {
                    if (placeGeometry.location != null) {
                        break;
                    }
                    placeGeometry.location = PlaceLocation.new_();
                    return placeGeometry;
                }
                placeGeometry.location = (PlaceLocation) nb5Var.l(PlaceLocation.PROTOBUF_ADAPTER);
            }
            return placeGeometry;
        }

        public void serialize(PlaceGeometry placeGeometry, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PlaceLocation placeLocation = placeGeometry.location;
            if (placeLocation != null) {
                codedOutputByteBufferNano.K(1, placeLocation, PlaceLocation.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PlaceGeometry> JSON_ADAPTER = new ObjectJsonAdapter<PlaceGeometry>() { // from class: com.p1.mobile.putong.core.data.PlaceGeometry.2
        public Class getDataClass() {
            return PlaceGeometry.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PlaceGeometry m14818newInstance() {
            return new PlaceGeometry();
        }

        public boolean parseField(PlaceGeometry placeGeometry, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(MessageType.location)) {
                return false;
            }
            placeGeometry.location = (PlaceLocation) PlaceLocation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PlaceGeometry placeGeometry, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(MessageType.location)) {
                return true;
            }
            return super.parseFieldCheck(placeGeometry, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(PlaceGeometry placeGeometry, JsonGenerator jsonGenerator) throws IOException {
            if (placeGeometry.location != null) {
                jsonGenerator.writeFieldName(MessageType.location);
                PlaceLocation.JSON_ADAPTER.serialize(placeGeometry.location, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PlaceGeometry) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PlaceGeometry) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PlaceGeometry new_() {
        PlaceGeometry placeGeometry = new PlaceGeometry();
        placeGeometry.nullCheck();
        return placeGeometry;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PlaceGeometry m14816clone() {
        PlaceGeometry placeGeometry = new PlaceGeometry();
        PlaceLocation placeLocation = this.location;
        if (placeLocation != null) {
            placeGeometry.location = placeLocation.clone();
        }
        return placeGeometry;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaceGeometry) {
            return ValueObject.util_equals(this.location, ((PlaceGeometry) obj).location);
        }
        return false;
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
        PlaceLocation placeLocation = this.location;
        int iHashCode = i2 + (placeLocation != null ? placeLocation.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.location == null) {
            this.location = PlaceLocation.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
