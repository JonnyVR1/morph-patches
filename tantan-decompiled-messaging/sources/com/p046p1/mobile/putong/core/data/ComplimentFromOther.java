package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Media;
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

/* JADX INFO: loaded from: classes10.dex */
public class ComplimentFromOther extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "complimentfromother";

    @Nullable
    @ProtobufIndex(index = 1)
    public Media media;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<ComplimentFromOther> PROTOBUF_ADAPTER = new MessageNanoAdapter<ComplimentFromOther>() { // from class: com.p1.mobile.putong.core.data.ComplimentFromOther.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ComplimentFromOther complimentFromOther) {
            Media media = complimentFromOther.media;
            int iM17230l = media != null ? CodedOutputByteBufferNano.m17230l(1, media, Media.PROTOBUF_ADAPTER) : 0;
            String str = complimentFromOther.value;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            complimentFromOther.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ComplimentFromOther parse(nb5 nb5Var) throws IOException {
            ComplimentFromOther complimentFromOther = new ComplimentFromOther();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (complimentFromOther.value != null) {
                        break;
                    }
                    complimentFromOther.value = "";
                    break;
                }
                if (iM158752u == 10) {
                    complimentFromOther.media = (Media) nb5Var.m158743l(Media.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (complimentFromOther.value != null) {
                            break;
                        }
                        complimentFromOther.value = "";
                        return complimentFromOther;
                    }
                    complimentFromOther.value = nb5Var.m158750s();
                }
            }
            return complimentFromOther;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ComplimentFromOther complimentFromOther, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Media media = complimentFromOther.media;
            if (media != null) {
                codedOutputByteBufferNano.m17254K(1, media, Media.PROTOBUF_ADAPTER);
            }
            String str = complimentFromOther.value;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<ComplimentFromOther> JSON_ADAPTER = new ObjectJsonAdapter<ComplimentFromOther>() { // from class: com.p1.mobile.putong.core.data.ComplimentFromOther.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ComplimentFromOther.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ComplimentFromOther newInstance() {
            return new ComplimentFromOther();
        }

        public boolean parseField(ComplimentFromOther complimentFromOther, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("media")) {
                complimentFromOther.media = Converter.RAW_PICTURE_TO_MEDIA.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            complimentFromOther.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ComplimentFromOther complimentFromOther, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("media") || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(complimentFromOther, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ComplimentFromOther complimentFromOther, JsonGenerator jsonGenerator) throws IOException {
            if (complimentFromOther.media != null) {
                jsonGenerator.writeFieldName("media");
                Converter.RAW_PICTURE_TO_MEDIA.serialize(complimentFromOther.media, jsonGenerator, true);
            }
            String str = complimentFromOther.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ComplimentFromOther) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ComplimentFromOther) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ComplimentFromOther new_() {
        ComplimentFromOther complimentFromOther = new ComplimentFromOther();
        complimentFromOther.nullCheck();
        return complimentFromOther;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ComplimentFromOther mo223809clone() {
        ComplimentFromOther complimentFromOther = new ComplimentFromOther();
        Media media = this.media;
        if (media != null) {
            complimentFromOther.media = media.mo223809clone();
        }
        complimentFromOther.value = this.value;
        return complimentFromOther;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComplimentFromOther)) {
            return false;
        }
        ComplimentFromOther complimentFromOther = (ComplimentFromOther) obj;
        return ValueObject.util_equals(this.media, complimentFromOther.media) && ValueObject.util_equals(this.value, complimentFromOther.value);
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
        Media media = this.media;
        int iHashCode = (i2 + (media != null ? media.hashCode() : 0)) * 41;
        String str = this.value;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
