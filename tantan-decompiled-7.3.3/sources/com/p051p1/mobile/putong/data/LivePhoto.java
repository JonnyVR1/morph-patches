package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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

/* JADX INFO: loaded from: classes12.dex */
public class LivePhoto extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livephoto";

    @ProtobufIndex(index = 54)
    public float duration;

    @NonNull
    @ProtobufIndex(index = 52)
    public String mediaType;

    @NonNull
    @ProtobufIndex(index = 51)
    public Dimension size;

    @NonNull
    @ProtobufIndex(index = 53)
    public String url;
    public static ProtobufAdapter<LivePhoto> PROTOBUF_ADAPTER = new MessageNanoAdapter<LivePhoto>() { // from class: com.p1.mobile.putong.data.LivePhoto.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LivePhoto livePhoto) {
            Dimension dimension = livePhoto.size;
            int iM17285l = dimension != null ? CodedOutputByteBufferNano.m17285l(51, dimension, Dimension.PROTOBUF_ADAPTER) : 0;
            String str = livePhoto.mediaType;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(52, str);
            }
            String str2 = livePhoto.url;
            if (str2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(53, str2);
            }
            int iM17279f = iM17285l + CodedOutputByteBufferNano.m17279f(54, livePhoto.duration);
            livePhoto.cachedSize = iM17279f;
            return iM17279f;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LivePhoto parse(nc5 nc5Var) throws IOException {
            LivePhoto livePhoto = new LivePhoto();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (livePhoto.size == null) {
                        livePhoto.size = Dimension.new_();
                    }
                    if (livePhoto.mediaType == null) {
                        livePhoto.mediaType = "";
                    }
                    if (livePhoto.url != null) {
                        break;
                    }
                    livePhoto.url = "";
                    break;
                }
                if (iM162497u == 410) {
                    livePhoto.size = (Dimension) nc5Var.m162488l(Dimension.PROTOBUF_ADAPTER);
                } else if (iM162497u == 418) {
                    livePhoto.mediaType = nc5Var.m162495s();
                } else if (iM162497u == 426) {
                    livePhoto.url = nc5Var.m162495s();
                } else {
                    if (iM162497u != 437) {
                        if (livePhoto.size == null) {
                            livePhoto.size = Dimension.new_();
                        }
                        if (livePhoto.mediaType == null) {
                            livePhoto.mediaType = "";
                        }
                        if (livePhoto.url != null) {
                            break;
                        }
                        livePhoto.url = "";
                        return livePhoto;
                    }
                    livePhoto.duration = nc5Var.m162485i();
                }
            }
            return livePhoto;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LivePhoto livePhoto, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Dimension dimension = livePhoto.size;
            if (dimension != null) {
                codedOutputByteBufferNano.m17309K(51, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            String str = livePhoto.mediaType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(52, str);
            }
            String str2 = livePhoto.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(53, str2);
            }
            codedOutputByteBufferNano.m17303E(54, livePhoto.duration);
        }
    };
    public static JsonAdapter<LivePhoto> JSON_ADAPTER = new ObjectJsonAdapter<LivePhoto>() { // from class: com.p1.mobile.putong.data.LivePhoto.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LivePhoto.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LivePhoto newInstance() {
            return new LivePhoto();
        }

        public boolean parseField(LivePhoto livePhoto, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    livePhoto.duration = (float) jsonParser.getValueAsDouble();
                    return true;
                case "url":
                    livePhoto.url = jsonParser.getValueAsString();
                    return true;
                case "size":
                    livePhoto.size = Dimension.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mediaType":
                    livePhoto.mediaType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LivePhoto livePhoto, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "url":
                case "size":
                case "mediaType":
                    return true;
                default:
                    return super.parseFieldCheck(livePhoto, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LivePhoto livePhoto, JsonGenerator jsonGenerator) throws IOException {
            if (livePhoto.size != null) {
                jsonGenerator.writeFieldName("size");
                Dimension.JSON_ADAPTER.serialize(livePhoto.size, jsonGenerator, true);
            }
            String str = livePhoto.mediaType;
            if (str != null) {
                jsonGenerator.writeStringField("mediaType", str);
            }
            String str2 = livePhoto.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, livePhoto.duration);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LivePhoto) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LivePhoto) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LivePhoto new_() {
        LivePhoto livePhoto = new LivePhoto();
        livePhoto.nullCheck();
        return livePhoto;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LivePhoto mo225055clone() {
        LivePhoto livePhoto = new LivePhoto();
        Dimension dimension = this.size;
        if (dimension != null) {
            livePhoto.size = dimension.mo225055clone();
        }
        livePhoto.mediaType = this.mediaType;
        livePhoto.url = this.url;
        livePhoto.duration = this.duration;
        return livePhoto;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LivePhoto)) {
            return false;
        }
        LivePhoto livePhoto = (LivePhoto) obj;
        return ValueObject.util_equals(this.size, livePhoto.size) && ValueObject.util_equals(this.mediaType, livePhoto.mediaType) && this.duration == livePhoto.duration;
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
        Dimension dimension = this.size;
        int iHashCode = (i2 + (dimension != null ? dimension.hashCode() : 0)) * 41;
        String str = this.mediaType;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + Float.floatToIntBits(this.duration);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.size == null) {
            this.size = Dimension.new_();
        }
        if (this.mediaType == null) {
            this.mediaType = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    public LivePhoto subtract(LivePhoto livePhoto) {
        LivePhoto livePhoto2 = new LivePhoto();
        if (!ValueObject.util_equals(this.size, livePhoto.size)) {
            livePhoto2.size = this.size;
        }
        if (!ValueObject.util_equals(this.mediaType, livePhoto.mediaType)) {
            livePhoto2.mediaType = this.mediaType;
        }
        if (!ValueObject.util_equals(this.url, livePhoto.url)) {
            livePhoto2.url = this.url;
        }
        if (livePhoto2.equals(new LivePhoto())) {
            return null;
        }
        return livePhoto2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
