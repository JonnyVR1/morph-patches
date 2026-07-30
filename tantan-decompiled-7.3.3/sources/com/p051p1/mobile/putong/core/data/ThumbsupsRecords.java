package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class ThumbsupsRecords extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thumbsupsrecords";

    @ProtobufIndex(index = 3)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String identifier;

    @NonNull
    @ProtobufIndex(index = 1)
    public String state;
    public static ProtobufAdapter<ThumbsupsRecords> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThumbsupsRecords>() { // from class: com.p1.mobile.putong.core.data.ThumbsupsRecords.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ThumbsupsRecords thumbsupsRecords) {
            String str = thumbsupsRecords.state;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = thumbsupsRecords.identifier;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(3, thumbsupsRecords.createdTime);
            thumbsupsRecords.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ThumbsupsRecords parse(nc5 nc5Var) throws IOException {
            ThumbsupsRecords thumbsupsRecords = new ThumbsupsRecords();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (thumbsupsRecords.state == null) {
                        thumbsupsRecords.state = "";
                    }
                    if (thumbsupsRecords.identifier != null) {
                        break;
                    }
                    thumbsupsRecords.identifier = "";
                    break;
                }
                if (iM162497u == 10) {
                    thumbsupsRecords.state = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    thumbsupsRecords.identifier = nc5Var.m162495s();
                } else {
                    if (iM162497u != 25) {
                        if (thumbsupsRecords.state == null) {
                            thumbsupsRecords.state = "";
                        }
                        if (thumbsupsRecords.identifier != null) {
                            break;
                        }
                        thumbsupsRecords.identifier = "";
                        return thumbsupsRecords;
                    }
                    thumbsupsRecords.createdTime = nc5Var.m162484h();
                }
            }
            return thumbsupsRecords;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ThumbsupsRecords thumbsupsRecords, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = thumbsupsRecords.state;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = thumbsupsRecords.identifier;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17301C(3, thumbsupsRecords.createdTime);
        }
    };
    public static JsonAdapter<ThumbsupsRecords> JSON_ADAPTER = new ObjectJsonAdapter<ThumbsupsRecords>() { // from class: com.p1.mobile.putong.core.data.ThumbsupsRecords.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ThumbsupsRecords.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ThumbsupsRecords newInstance() {
            return new ThumbsupsRecords();
        }

        public boolean parseField(ThumbsupsRecords thumbsupsRecords, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identifier":
                    thumbsupsRecords.identifier = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    thumbsupsRecords.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ThumbsupsRecords thumbsupsRecords, JsonGenerator jsonGenerator) throws IOException {
            String str = thumbsupsRecords.state;
            if (str != null) {
                jsonGenerator.writeStringField("state", str);
            }
            String str2 = thumbsupsRecords.identifier;
            if (str2 != null) {
                jsonGenerator.writeStringField("identifier", str2);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(thumbsupsRecords.createdTime), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThumbsupsRecords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThumbsupsRecords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThumbsupsRecords new_() {
        ThumbsupsRecords thumbsupsRecords = new ThumbsupsRecords();
        thumbsupsRecords.nullCheck();
        return thumbsupsRecords;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ThumbsupsRecords mo225055clone() {
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
        String str = this.state;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.identifier;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.state == null) {
            this.state = "";
        }
        if (this.identifier == null) {
            this.identifier = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
