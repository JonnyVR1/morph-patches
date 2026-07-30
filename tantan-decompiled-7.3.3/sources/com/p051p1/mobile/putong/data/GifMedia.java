package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes12.dex */
public class GifMedia extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gifmedia";

    @NonNull
    @ProtobufIndex(index = 52)
    public String type;

    @NonNull
    @ProtobufIndex(index = 51)
    public String url;
    public static ProtobufAdapter<GifMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<GifMedia>() { // from class: com.p1.mobile.putong.data.GifMedia.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GifMedia gifMedia) {
            String str = gifMedia.url;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(51, str) : 0;
            String str2 = gifMedia.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(52, str2);
            }
            gifMedia.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GifMedia parse(nc5 nc5Var) throws IOException {
            GifMedia gifMedia = new GifMedia();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (gifMedia.url == null) {
                        gifMedia.url = "";
                    }
                    if (gifMedia.type != null) {
                        break;
                    }
                    gifMedia.type = "";
                    break;
                }
                if (iM162497u == 410) {
                    gifMedia.url = nc5Var.m162495s();
                } else {
                    if (iM162497u != 418) {
                        if (gifMedia.url == null) {
                            gifMedia.url = "";
                        }
                        if (gifMedia.type != null) {
                            break;
                        }
                        gifMedia.type = "";
                        return gifMedia;
                    }
                    gifMedia.type = nc5Var.m162495s();
                }
            }
            return gifMedia;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GifMedia gifMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gifMedia.url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(51, str);
            }
            String str2 = gifMedia.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(52, str2);
            }
        }
    };
    public static JsonAdapter<GifMedia> JSON_ADAPTER = new ObjectJsonAdapter<GifMedia>() { // from class: com.p1.mobile.putong.data.GifMedia.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GifMedia.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GifMedia newInstance() {
            return new GifMedia();
        }

        public boolean parseField(GifMedia gifMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("url")) {
                gifMedia.url = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("type")) {
                return false;
            }
            gifMedia.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GifMedia gifMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("url") || str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(gifMedia, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GifMedia gifMedia, JsonGenerator jsonGenerator) throws IOException {
            String str = gifMedia.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            String str2 = gifMedia.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GifMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GifMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GifMedia new_() {
        GifMedia gifMedia = new GifMedia();
        gifMedia.nullCheck();
        return gifMedia;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GifMedia mo225055clone() {
        GifMedia gifMedia = new GifMedia();
        gifMedia.url = this.url;
        gifMedia.type = this.type;
        return gifMedia;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GifMedia)) {
            return false;
        }
        GifMedia gifMedia = (GifMedia) obj;
        return ValueObject.util_equals(this.url, gifMedia.url) && ValueObject.util_equals(this.type, gifMedia.type);
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
        String str = this.url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public GifMedia subtract(GifMedia gifMedia) {
        GifMedia gifMedia2 = new GifMedia();
        if (!ValueObject.util_equals(this.url, gifMedia.url)) {
            gifMedia2.url = this.url;
        }
        if (!ValueObject.util_equals(this.type, gifMedia.type)) {
            gifMedia2.type = this.type;
        }
        if (gifMedia2.equals(new GifMedia())) {
            return null;
        }
        return gifMedia2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
