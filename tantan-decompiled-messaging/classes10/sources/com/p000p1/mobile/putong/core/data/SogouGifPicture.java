package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Dimension;
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
public class SogouGifPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sogougifpicture";

    @ProtobufIndex(index = 4)
    public long duration;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String mediaType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public Dimension size;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String url;
    public static ProtobufAdapter<SogouGifPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<SogouGifPicture>() { // from class: com.p1.mobile.putong.core.data.SogouGifPicture.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SogouGifPicture sogouGifPicture) {
            String str = sogouGifPicture.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = sogouGifPicture.url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            Dimension dimension = sogouGifPicture.size;
            if (dimension != null) {
                iO += CodedOutputByteBufferNano.l(3, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(4, sogouGifPicture.duration);
            String str3 = sogouGifPicture.mediaType;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(5, str3);
            }
            ((MessageNano) sogouGifPicture).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SogouGifPicture m15684parse(nb5 nb5Var) throws IOException {
            SogouGifPicture sogouGifPicture = new SogouGifPicture();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (sogouGifPicture.name == null) {
                        sogouGifPicture.name = "";
                    }
                    if (sogouGifPicture.url == null) {
                        sogouGifPicture.url = "";
                    }
                    if (sogouGifPicture.size == null) {
                        sogouGifPicture.size = Dimension.new_();
                    }
                    if (sogouGifPicture.mediaType != null) {
                        break;
                    }
                    sogouGifPicture.mediaType = "";
                    break;
                }
                if (iU == 10) {
                    sogouGifPicture.name = nb5Var.s();
                } else if (iU == 18) {
                    sogouGifPicture.url = nb5Var.s();
                } else if (iU == 26) {
                    sogouGifPicture.size = (Dimension) nb5Var.l(Dimension.PROTOBUF_ADAPTER);
                } else if (iU == 32) {
                    sogouGifPicture.duration = nb5Var.k();
                } else {
                    if (iU != 42) {
                        if (sogouGifPicture.name == null) {
                            sogouGifPicture.name = "";
                        }
                        if (sogouGifPicture.url == null) {
                            sogouGifPicture.url = "";
                        }
                        if (sogouGifPicture.size == null) {
                            sogouGifPicture.size = Dimension.new_();
                        }
                        if (sogouGifPicture.mediaType != null) {
                            break;
                        }
                        sogouGifPicture.mediaType = "";
                        return sogouGifPicture;
                    }
                    sogouGifPicture.mediaType = nb5Var.s();
                }
            }
            return sogouGifPicture;
        }

        public void serialize(SogouGifPicture sogouGifPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = sogouGifPicture.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = sogouGifPicture.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            Dimension dimension = sogouGifPicture.size;
            if (dimension != null) {
                codedOutputByteBufferNano.K(3, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.I(4, sogouGifPicture.duration);
            String str3 = sogouGifPicture.mediaType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
        }
    };
    public static JsonAdapter<SogouGifPicture> JSON_ADAPTER = new ObjectJsonAdapter<SogouGifPicture>() { // from class: com.p1.mobile.putong.core.data.SogouGifPicture.2
        public Class getDataClass() {
            return SogouGifPicture.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SogouGifPicture m15685newInstance() {
            return new SogouGifPicture();
        }

        public boolean parseField(SogouGifPicture sogouGifPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    sogouGifPicture.duration = jsonParser.getValueAsLong();
                    return true;
                case "url":
                    sogouGifPicture.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    sogouGifPicture.name = jsonParser.getValueAsString();
                    return true;
                case "size":
                    sogouGifPicture.size = (Dimension) Dimension.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mediaType":
                    sogouGifPicture.mediaType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SogouGifPicture sogouGifPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "url":
                case "name":
                case "size":
                case "mediaType":
                    return true;
                default:
                    return super.parseFieldCheck(sogouGifPicture, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SogouGifPicture sogouGifPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = sogouGifPicture.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = sogouGifPicture.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            if (sogouGifPicture.size != null) {
                jsonGenerator.writeFieldName("size");
                Dimension.JSON_ADAPTER.serialize(sogouGifPicture.size, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("duration", sogouGifPicture.duration);
            String str3 = sogouGifPicture.mediaType;
            if (str3 != null) {
                jsonGenerator.writeStringField("mediaType", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SogouGifPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SogouGifPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SogouGifPicture new_() {
        SogouGifPicture sogouGifPicture = new SogouGifPicture();
        sogouGifPicture.nullCheck();
        return sogouGifPicture;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SogouGifPicture m15683clone() {
        SogouGifPicture sogouGifPicture = new SogouGifPicture();
        sogouGifPicture.name = this.name;
        sogouGifPicture.url = this.url;
        Dimension dimension = this.size;
        if (dimension != null) {
            sogouGifPicture.size = dimension.clone();
        }
        sogouGifPicture.duration = this.duration;
        sogouGifPicture.mediaType = this.mediaType;
        return sogouGifPicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SogouGifPicture)) {
            return false;
        }
        SogouGifPicture sogouGifPicture = (SogouGifPicture) obj;
        return ValueObject.util_equals(this.name, sogouGifPicture.name) && ValueObject.util_equals(this.url, sogouGifPicture.url) && ValueObject.util_equals(this.size, sogouGifPicture.size) && this.duration == sogouGifPicture.duration && ValueObject.util_equals(this.mediaType, sogouGifPicture.mediaType);
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
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        Dimension dimension = this.size;
        int iHashCode3 = dimension != null ? dimension.hashCode() : 0;
        long j = this.duration;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.mediaType;
        int iHashCode4 = i3 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.size == null) {
            this.size = Dimension.new_();
        }
        if (this.mediaType == null) {
            this.mediaType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
