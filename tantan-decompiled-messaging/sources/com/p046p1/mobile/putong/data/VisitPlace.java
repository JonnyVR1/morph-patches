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
public class VisitPlace extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "visitplace";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38834id;

    @ProtobufIndex(index = 4)
    public double latitude;

    @ProtobufIndex(index = 5)
    public double longitude;

    @NonNull
    @ProtobufIndex(index = 2)
    public Owner owner;

    @NonNull
    @ProtobufIndex(index = 3)
    public String placeName;
    public static ProtobufAdapter<VisitPlace> PROTOBUF_ADAPTER = new MessageNanoAdapter<VisitPlace>() { // from class: com.p1.mobile.putong.data.VisitPlace.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VisitPlace visitPlace) {
            String str = visitPlace.f38834id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            Owner owner = visitPlace.owner;
            if (owner != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = visitPlace.placeName;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(4, visitPlace.latitude) + CodedOutputByteBufferNano.m17222d(5, visitPlace.longitude);
            visitPlace.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VisitPlace parse(nb5 nb5Var) throws IOException {
            VisitPlace visitPlace = new VisitPlace();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (visitPlace.f38834id == null) {
                        visitPlace.f38834id = "";
                    }
                    if (visitPlace.owner == null) {
                        visitPlace.owner = Owner.new_();
                    }
                    if (visitPlace.placeName != null) {
                        break;
                    }
                    visitPlace.placeName = "";
                    break;
                }
                if (iM158752u == 10) {
                    visitPlace.f38834id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    visitPlace.owner = (Owner) nb5Var.m158743l(Owner.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    visitPlace.placeName = nb5Var.m158750s();
                } else if (iM158752u == 33) {
                    visitPlace.latitude = nb5Var.m158739h();
                } else {
                    if (iM158752u != 41) {
                        if (visitPlace.f38834id == null) {
                            visitPlace.f38834id = "";
                        }
                        if (visitPlace.owner == null) {
                            visitPlace.owner = Owner.new_();
                        }
                        if (visitPlace.placeName != null) {
                            break;
                        }
                        visitPlace.placeName = "";
                        return visitPlace;
                    }
                    visitPlace.longitude = nb5Var.m158739h();
                }
            }
            return visitPlace;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VisitPlace visitPlace, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = visitPlace.f38834id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            Owner owner = visitPlace.owner;
            if (owner != null) {
                codedOutputByteBufferNano.m17254K(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = visitPlace.placeName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            codedOutputByteBufferNano.m17246C(4, visitPlace.latitude);
            codedOutputByteBufferNano.m17246C(5, visitPlace.longitude);
        }
    };
    public static JsonAdapter<VisitPlace> JSON_ADAPTER = new ObjectJsonAdapter<VisitPlace>() { // from class: com.p1.mobile.putong.data.VisitPlace.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VisitPlace.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VisitPlace newInstance() {
            return new VisitPlace();
        }

        public boolean parseField(VisitPlace visitPlace, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "latitude":
                    visitPlace.latitude = jsonParser.getValueAsDouble();
                    return true;
                case "id":
                    visitPlace.f38834id = jsonParser.getValueAsString();
                    return false;
                case "owner":
                    visitPlace.owner = Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "longitude":
                    visitPlace.longitude = jsonParser.getValueAsDouble();
                    return true;
                case "placeName":
                    visitPlace.placeName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VisitPlace visitPlace, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "latitude":
                    return true;
                case "id":
                    return false;
                case "owner":
                case "longitude":
                case "placeName":
                    return true;
                default:
                    return super.parseFieldCheck(visitPlace, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VisitPlace visitPlace, JsonGenerator jsonGenerator) throws IOException {
            String str = visitPlace.f38834id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (visitPlace.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Owner.JSON_ADAPTER.serialize(visitPlace.owner, jsonGenerator, true);
            }
            String str2 = visitPlace.placeName;
            if (str2 != null) {
                jsonGenerator.writeStringField("placeName", str2);
            }
            jsonGenerator.writeNumberField("latitude", visitPlace.latitude);
            jsonGenerator.writeNumberField("longitude", visitPlace.longitude);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitPlace) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitPlace) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VisitPlace new_() {
        VisitPlace visitPlace = new VisitPlace();
        visitPlace.nullCheck();
        return visitPlace;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VisitPlace mo223809clone() {
        VisitPlace visitPlace = new VisitPlace();
        visitPlace.f38834id = this.f38834id;
        Owner owner = this.owner;
        if (owner != null) {
            visitPlace.owner = owner.mo223809clone();
        }
        visitPlace.placeName = this.placeName;
        visitPlace.latitude = this.latitude;
        visitPlace.longitude = this.longitude;
        return visitPlace;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisitPlace)) {
            return false;
        }
        VisitPlace visitPlace = (VisitPlace) obj;
        return ValueObject.util_equals(this.f38834id, visitPlace.f38834id) && ValueObject.util_equals(this.owner, visitPlace.owner) && ValueObject.util_equals(this.placeName, visitPlace.placeName) && this.latitude == visitPlace.latitude && this.longitude == visitPlace.longitude;
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
        String str = this.f38834id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Owner owner = this.owner;
        int iHashCode2 = (iHashCode + (owner != null ? owner.hashCode() : 0)) * 41;
        String str2 = this.placeName;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i3 = ((iHashCode2 + iHashCode3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        int i4 = (i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38834id == null) {
            this.f38834id = "";
        }
        if (this.owner == null) {
            this.owner = Owner.new_();
        }
        if (this.placeName == null) {
            this.placeName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
