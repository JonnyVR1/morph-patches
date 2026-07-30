package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Media;
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
public class ComplimentFromOther extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "complimentfromother";

    @Nullable
    @ProtobufIndex(index = 1)
    public Media media;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String value;
    public static ProtobufAdapter<ComplimentFromOther> PROTOBUF_ADAPTER = new MessageNanoAdapter<ComplimentFromOther>() { // from class: com.p1.mobile.putong.core.data.ComplimentFromOther.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ComplimentFromOther complimentFromOther) {
            Media media = complimentFromOther.media;
            int iL = media != null ? CodedOutputByteBufferNano.l(1, media, Media.PROTOBUF_ADAPTER) : 0;
            String str = complimentFromOther.value;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) complimentFromOther).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ComplimentFromOther m12237parse(nb5 nb5Var) throws IOException {
            ComplimentFromOther complimentFromOther = new ComplimentFromOther();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (complimentFromOther.value != null) {
                        break;
                    }
                    complimentFromOther.value = "";
                    break;
                }
                if (iU == 10) {
                    complimentFromOther.media = (Media) nb5Var.l(Media.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (complimentFromOther.value != null) {
                            break;
                        }
                        complimentFromOther.value = "";
                        return complimentFromOther;
                    }
                    complimentFromOther.value = nb5Var.s();
                }
            }
            return complimentFromOther;
        }

        public void serialize(ComplimentFromOther complimentFromOther, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Media media = complimentFromOther.media;
            if (media != null) {
                codedOutputByteBufferNano.K(1, media, Media.PROTOBUF_ADAPTER);
            }
            String str = complimentFromOther.value;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<ComplimentFromOther> JSON_ADAPTER = new ObjectJsonAdapter<ComplimentFromOther>() { // from class: com.p1.mobile.putong.core.data.ComplimentFromOther.2
        public Class getDataClass() {
            return ComplimentFromOther.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ComplimentFromOther m12238newInstance() {
            return new ComplimentFromOther();
        }

        public boolean parseField(ComplimentFromOther complimentFromOther, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("media")) {
                complimentFromOther.media = (Media) Converter.RAW_PICTURE_TO_MEDIA.parse(jsonParser, str2);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ComplimentFromOther) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ComplimentFromOther) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ComplimentFromOther new_() {
        ComplimentFromOther complimentFromOther = new ComplimentFromOther();
        complimentFromOther.nullCheck();
        return complimentFromOther;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ComplimentFromOther m12236clone() {
        ComplimentFromOther complimentFromOther = new ComplimentFromOther();
        Media media = this.media;
        if (media != null) {
            complimentFromOther.media = media.clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Media media = this.media;
        int iHashCode = (i2 + (media != null ? media.hashCode() : 0)) * 41;
        String str = this.value;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
