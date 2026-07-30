package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.libraries.places.api.model.PlaceTypes;
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
public class MessageLocation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagelocation";

    @NonNull
    @ProtobufIndex(index = 2)
    public String address;

    @NonNull
    @ProtobufIndex(index = 3)
    public DoublePair coordinates;

    @NonNull
    @ProtobufIndex(index = 4)
    public String distance;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;
    public static ProtobufAdapter<MessageLocation> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageLocation>() { // from class: com.p1.mobile.putong.data.MessageLocation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageLocation messageLocation) {
            String str = messageLocation.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = messageLocation.address;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            DoublePair doublePair = messageLocation.coordinates;
            if (doublePair != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, doublePair, DoublePair.PROTOBUF_ADAPTER);
            }
            String str3 = messageLocation.distance;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            messageLocation.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageLocation parse(nb5 nb5Var) throws IOException {
            MessageLocation messageLocation = new MessageLocation();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (messageLocation.name == null) {
                        messageLocation.name = "";
                    }
                    if (messageLocation.address == null) {
                        messageLocation.address = "";
                    }
                    if (messageLocation.coordinates == null) {
                        messageLocation.coordinates = DoublePair.new_();
                    }
                    if (messageLocation.distance != null) {
                        break;
                    }
                    messageLocation.distance = "";
                    break;
                }
                if (iM158752u == 10) {
                    messageLocation.name = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    messageLocation.address = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    messageLocation.coordinates = (DoublePair) nb5Var.m158743l(DoublePair.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 34) {
                        if (messageLocation.name == null) {
                            messageLocation.name = "";
                        }
                        if (messageLocation.address == null) {
                            messageLocation.address = "";
                        }
                        if (messageLocation.coordinates == null) {
                            messageLocation.coordinates = DoublePair.new_();
                        }
                        if (messageLocation.distance != null) {
                            break;
                        }
                        messageLocation.distance = "";
                        return messageLocation;
                    }
                    messageLocation.distance = nb5Var.m158750s();
                }
            }
            return messageLocation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageLocation messageLocation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageLocation.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = messageLocation.address;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            DoublePair doublePair = messageLocation.coordinates;
            if (doublePair != null) {
                codedOutputByteBufferNano.m17254K(3, doublePair, DoublePair.PROTOBUF_ADAPTER);
            }
            String str3 = messageLocation.distance;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<MessageLocation> JSON_ADAPTER = new ObjectJsonAdapter<MessageLocation>() { // from class: com.p1.mobile.putong.data.MessageLocation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageLocation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageLocation newInstance() {
            return new MessageLocation();
        }

        public boolean parseField(MessageLocation messageLocation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "address":
                    messageLocation.address = jsonParser.getValueAsString();
                    return true;
                case "name":
                    messageLocation.name = jsonParser.getValueAsString();
                    return true;
                case "distance":
                    messageLocation.distance = jsonParser.getValueAsString();
                    return true;
                case "coordinates":
                    messageLocation.coordinates = Converter.DOUBLE_PAIR.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageLocation messageLocation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "address":
                case "name":
                case "distance":
                case "coordinates":
                    return true;
                default:
                    return super.parseFieldCheck(messageLocation, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageLocation messageLocation, JsonGenerator jsonGenerator) throws IOException {
            String str = messageLocation.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = messageLocation.address;
            if (str2 != null) {
                jsonGenerator.writeStringField(PlaceTypes.ADDRESS, str2);
            }
            if (messageLocation.coordinates != null) {
                jsonGenerator.writeFieldName("coordinates");
                Converter.DOUBLE_PAIR.serialize(messageLocation.coordinates, jsonGenerator, true);
            }
            String str3 = messageLocation.distance;
            if (str3 != null) {
                jsonGenerator.writeStringField("distance", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageLocation new_() {
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.nullCheck();
        return messageLocation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageLocation mo223809clone() {
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.name = this.name;
        messageLocation.address = this.address;
        DoublePair doublePair = this.coordinates;
        if (doublePair != null) {
            messageLocation.coordinates = doublePair.mo223809clone();
        }
        messageLocation.distance = this.distance;
        return messageLocation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageLocation)) {
            return false;
        }
        MessageLocation messageLocation = (MessageLocation) obj;
        return ValueObject.util_equals(this.name, messageLocation.name) && ValueObject.util_equals(this.address, messageLocation.address) && ValueObject.util_equals(this.coordinates, messageLocation.coordinates) && ValueObject.util_equals(this.distance, messageLocation.distance);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.address;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        DoublePair doublePair = this.coordinates;
        int iHashCode3 = (iHashCode2 + (doublePair != null ? doublePair.hashCode() : 0)) * 41;
        String str3 = this.distance;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.address == null) {
            this.address = "";
        }
        if (this.coordinates == null) {
            this.coordinates = DoublePair.new_();
        }
        if (this.distance == null) {
            this.distance = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
