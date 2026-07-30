package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class ThumbsupsRecords extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thumbsupsrecords";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String identifier;

    @NonNull
    @ProtobufIndex(index = 1)
    public String state;
    public static ProtobufAdapter<ThumbsupsRecords> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThumbsupsRecords>() { // from class: com.p1.mobile.putong.core.data.ThumbsupsRecords.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ThumbsupsRecords thumbsupsRecords) {
            String str = thumbsupsRecords.state;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = thumbsupsRecords.identifier;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iD = iO + CodedOutputByteBufferNano.d(3, thumbsupsRecords.createdTime);
            ((MessageNano) thumbsupsRecords).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ThumbsupsRecords m15990parse(nb5 nb5Var) throws IOException {
            ThumbsupsRecords thumbsupsRecords = new ThumbsupsRecords();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (thumbsupsRecords.state == null) {
                        thumbsupsRecords.state = "";
                    }
                    if (thumbsupsRecords.identifier != null) {
                        break;
                    }
                    thumbsupsRecords.identifier = "";
                    break;
                }
                if (iU == 10) {
                    thumbsupsRecords.state = nb5Var.s();
                } else if (iU == 18) {
                    thumbsupsRecords.identifier = nb5Var.s();
                } else {
                    if (iU != 25) {
                        if (thumbsupsRecords.state == null) {
                            thumbsupsRecords.state = "";
                        }
                        if (thumbsupsRecords.identifier != null) {
                            break;
                        }
                        thumbsupsRecords.identifier = "";
                        return thumbsupsRecords;
                    }
                    thumbsupsRecords.createdTime = nb5Var.h();
                }
            }
            return thumbsupsRecords;
        }

        public void serialize(ThumbsupsRecords thumbsupsRecords, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = thumbsupsRecords.state;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = thumbsupsRecords.identifier;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.C(3, thumbsupsRecords.createdTime);
        }
    };
    public static JsonAdapter<ThumbsupsRecords> JSON_ADAPTER = new ObjectJsonAdapter<ThumbsupsRecords>() { // from class: com.p1.mobile.putong.core.data.ThumbsupsRecords.2
        public Class getDataClass() {
            return ThumbsupsRecords.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ThumbsupsRecords m15991newInstance() {
            return new ThumbsupsRecords();
        }

        public boolean parseField(ThumbsupsRecords thumbsupsRecords, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identifier":
                    thumbsupsRecords.identifier = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    thumbsupsRecords.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "state":
                    thumbsupsRecords.state = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ThumbsupsRecords thumbsupsRecords, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identifier":
                case "createdTime":
                case "state":
                    return true;
                default:
                    return super.parseFieldCheck(thumbsupsRecords, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ThumbsupsRecords thumbsupsRecords, JsonGenerator jsonGenerator) throws IOException {
            String str = thumbsupsRecords.state;
            if (str != null) {
                jsonGenerator.writeStringField(MessageChannel.state, str);
            }
            String str2 = thumbsupsRecords.identifier;
            if (str2 != null) {
                jsonGenerator.writeStringField("identifier", str2);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(thumbsupsRecords.createdTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThumbsupsRecords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThumbsupsRecords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThumbsupsRecords new_() {
        ThumbsupsRecords thumbsupsRecords = new ThumbsupsRecords();
        thumbsupsRecords.nullCheck();
        return thumbsupsRecords;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ThumbsupsRecords m15989clone() {
        ThumbsupsRecords thumbsupsRecords = new ThumbsupsRecords();
        thumbsupsRecords.state = this.state;
        thumbsupsRecords.identifier = this.identifier;
        thumbsupsRecords.createdTime = this.createdTime;
        return thumbsupsRecords;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThumbsupsRecords)) {
            return false;
        }
        ThumbsupsRecords thumbsupsRecords = (ThumbsupsRecords) obj;
        return ValueObject.util_equals(this.state, thumbsupsRecords.state) && ValueObject.util_equals(this.identifier, thumbsupsRecords.identifier) && this.createdTime == thumbsupsRecords.createdTime;
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
        String str = this.state;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.identifier;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.state == null) {
            this.state = "";
        }
        if (this.identifier == null) {
            this.identifier = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
