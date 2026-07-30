package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class PlaceDetailsResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "placedetailsresult";

    @NonNull
    @ProtobufIndex(index = 1)
    public String formatted_address;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public PlaceGeometry geometry;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;
    public static ProtobufAdapter<PlaceDetailsResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<PlaceDetailsResult>() { // from class: com.p1.mobile.putong.core.data.PlaceDetailsResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PlaceDetailsResult placeDetailsResult) {
            String str = placeDetailsResult.formatted_address;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = placeDetailsResult.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            PlaceGeometry placeGeometry = placeDetailsResult.geometry;
            if (placeGeometry != null) {
                iO += CodedOutputByteBufferNano.l(3, placeGeometry, PlaceGeometry.PROTOBUF_ADAPTER);
            }
            ((MessageNano) placeDetailsResult).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PlaceDetailsResult m14813parse(nb5 nb5Var) throws IOException {
            PlaceDetailsResult placeDetailsResult = new PlaceDetailsResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (placeDetailsResult.formatted_address == null) {
                        placeDetailsResult.formatted_address = "";
                    }
                    if (placeDetailsResult.name == null) {
                        placeDetailsResult.name = "";
                    }
                    if (placeDetailsResult.geometry != null) {
                        break;
                    }
                    placeDetailsResult.geometry = PlaceGeometry.new_();
                    break;
                }
                if (iU == 10) {
                    placeDetailsResult.formatted_address = nb5Var.s();
                } else if (iU == 18) {
                    placeDetailsResult.name = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (placeDetailsResult.formatted_address == null) {
                            placeDetailsResult.formatted_address = "";
                        }
                        if (placeDetailsResult.name == null) {
                            placeDetailsResult.name = "";
                        }
                        if (placeDetailsResult.geometry != null) {
                            break;
                        }
                        placeDetailsResult.geometry = PlaceGeometry.new_();
                        return placeDetailsResult;
                    }
                    placeDetailsResult.geometry = (PlaceGeometry) nb5Var.l(PlaceGeometry.PROTOBUF_ADAPTER);
                }
            }
            return placeDetailsResult;
        }

        public void serialize(PlaceDetailsResult placeDetailsResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = placeDetailsResult.formatted_address;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = placeDetailsResult.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            PlaceGeometry placeGeometry = placeDetailsResult.geometry;
            if (placeGeometry != null) {
                codedOutputByteBufferNano.K(3, placeGeometry, PlaceGeometry.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PlaceDetailsResult> JSON_ADAPTER = new ObjectJsonAdapter<PlaceDetailsResult>() { // from class: com.p1.mobile.putong.core.data.PlaceDetailsResult.2
        public Class getDataClass() {
            return PlaceDetailsResult.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PlaceDetailsResult m14814newInstance() {
            return new PlaceDetailsResult();
        }

        public boolean parseField(PlaceDetailsResult placeDetailsResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "name":
                    placeDetailsResult.name = jsonParser.getValueAsString();
                    return true;
                case "formatted_address":
                    placeDetailsResult.formatted_address = jsonParser.getValueAsString();
                    return true;
                case "geometry":
                    placeDetailsResult.geometry = (PlaceGeometry) PlaceGeometry.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PlaceDetailsResult placeDetailsResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "name":
                case "formatted_address":
                case "geometry":
                    return true;
                default:
                    return super.parseFieldCheck(placeDetailsResult, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PlaceDetailsResult placeDetailsResult, JsonGenerator jsonGenerator) throws IOException {
            String str = placeDetailsResult.formatted_address;
            if (str != null) {
                jsonGenerator.writeStringField("formatted_address", str);
            }
            String str2 = placeDetailsResult.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            if (placeDetailsResult.geometry != null) {
                jsonGenerator.writeFieldName("geometry");
                PlaceGeometry.JSON_ADAPTER.serialize(placeDetailsResult.geometry, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PlaceDetailsResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PlaceDetailsResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PlaceDetailsResult new_() {
        PlaceDetailsResult placeDetailsResult = new PlaceDetailsResult();
        placeDetailsResult.nullCheck();
        return placeDetailsResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PlaceDetailsResult m14812clone() {
        PlaceDetailsResult placeDetailsResult = new PlaceDetailsResult();
        placeDetailsResult.formatted_address = this.formatted_address;
        placeDetailsResult.name = this.name;
        PlaceGeometry placeGeometry = this.geometry;
        if (placeGeometry != null) {
            placeDetailsResult.geometry = placeGeometry.m14816clone();
        }
        return placeDetailsResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaceDetailsResult)) {
            return false;
        }
        PlaceDetailsResult placeDetailsResult = (PlaceDetailsResult) obj;
        return ValueObject.util_equals(this.formatted_address, placeDetailsResult.formatted_address) && ValueObject.util_equals(this.name, placeDetailsResult.name) && ValueObject.util_equals(this.geometry, placeDetailsResult.geometry);
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
        String str = this.formatted_address;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        PlaceGeometry placeGeometry = this.geometry;
        int iHashCode3 = iHashCode2 + (placeGeometry != null ? placeGeometry.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.formatted_address == null) {
            this.formatted_address = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.geometry == null) {
            this.geometry = PlaceGeometry.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
