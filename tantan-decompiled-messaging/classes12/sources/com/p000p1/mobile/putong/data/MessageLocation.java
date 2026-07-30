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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageLocation messageLocation) {
            String str = messageLocation.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = messageLocation.address;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            DoublePair doublePair = messageLocation.coordinates;
            if (doublePair != null) {
                iO += CodedOutputByteBufferNano.l(3, doublePair, DoublePair.PROTOBUF_ADAPTER);
            }
            String str3 = messageLocation.distance;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) messageLocation).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageLocation m18459parse(nb5 nb5Var) throws IOException {
            MessageLocation messageLocation = new MessageLocation();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    messageLocation.name = nb5Var.s();
                } else if (iU == 18) {
                    messageLocation.address = nb5Var.s();
                } else if (iU == 26) {
                    messageLocation.coordinates = (DoublePair) nb5Var.l(DoublePair.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
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
                    messageLocation.distance = nb5Var.s();
                }
            }
            return messageLocation;
        }

        public void serialize(MessageLocation messageLocation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageLocation.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = messageLocation.address;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            DoublePair doublePair = messageLocation.coordinates;
            if (doublePair != null) {
                codedOutputByteBufferNano.K(3, doublePair, DoublePair.PROTOBUF_ADAPTER);
            }
            String str3 = messageLocation.distance;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<MessageLocation> JSON_ADAPTER = new ObjectJsonAdapter<MessageLocation>() { // from class: com.p1.mobile.putong.data.MessageLocation.2
        public Class getDataClass() {
            return MessageLocation.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MessageLocation mo17830newInstance() {
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
                    messageLocation.coordinates = (DoublePair) Converter.DOUBLE_PAIR.parse(jsonParser, str2);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageLocation messageLocation, JsonGenerator jsonGenerator) throws IOException {
            String str = messageLocation.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = messageLocation.address;
            if (str2 != null) {
                jsonGenerator.writeStringField("address", str2);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageLocation new_() {
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.nullCheck();
        return messageLocation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageLocation m18458clone() {
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.name = this.name;
        messageLocation.address = this.address;
        DoublePair doublePair = this.coordinates;
        if (doublePair != null) {
            messageLocation.coordinates = doublePair.m18000clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
