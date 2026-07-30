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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GifMedia gifMedia) {
            String str = gifMedia.url;
            int iO = str != null ? CodedOutputByteBufferNano.o(51, str) : 0;
            String str2 = gifMedia.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(52, str2);
            }
            ((MessageNano) gifMedia).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GifMedia m18178parse(nb5 nb5Var) throws IOException {
            GifMedia gifMedia = new GifMedia();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (gifMedia.url == null) {
                        gifMedia.url = "";
                    }
                    if (gifMedia.type != null) {
                        break;
                    }
                    gifMedia.type = "";
                    break;
                }
                if (iU == 410) {
                    gifMedia.url = nb5Var.s();
                } else {
                    if (iU != 418) {
                        if (gifMedia.url == null) {
                            gifMedia.url = "";
                        }
                        if (gifMedia.type != null) {
                            break;
                        }
                        gifMedia.type = "";
                        return gifMedia;
                    }
                    gifMedia.type = nb5Var.s();
                }
            }
            return gifMedia;
        }

        public void serialize(GifMedia gifMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gifMedia.url;
            if (str != null) {
                codedOutputByteBufferNano.R(51, str);
            }
            String str2 = gifMedia.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(52, str2);
            }
        }
    };
    public static JsonAdapter<GifMedia> JSON_ADAPTER = new ObjectJsonAdapter<GifMedia>() { // from class: com.p1.mobile.putong.data.GifMedia.2
        public Class getDataClass() {
            return GifMedia.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public GifMedia mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GifMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GifMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GifMedia new_() {
        GifMedia gifMedia = new GifMedia();
        gifMedia.nullCheck();
        return gifMedia;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GifMedia m18177clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
