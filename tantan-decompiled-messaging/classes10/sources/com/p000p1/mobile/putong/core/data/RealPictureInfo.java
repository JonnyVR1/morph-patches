package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Picture;
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
public class RealPictureInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "realpictureinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public Picture media;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String reason;

    @NonNull
    @ProtobufIndex(index = 4)
    public String source;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String status;
    public static ProtobufAdapter<RealPictureInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<RealPictureInfo>() { // from class: com.p1.mobile.putong.core.data.RealPictureInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RealPictureInfo realPictureInfo) {
            Picture picture = realPictureInfo.media;
            int iL = picture != null ? CodedOutputByteBufferNano.l(1, picture, Picture.PROTOBUF_ADAPTER) : 0;
            String str = realPictureInfo.status;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = realPictureInfo.reason;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = realPictureInfo.source;
            if (str3 != null) {
                iL += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) realPictureInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RealPictureInfo m15253parse(nb5 nb5Var) throws IOException {
            RealPictureInfo realPictureInfo = new RealPictureInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (realPictureInfo.media == null) {
                        realPictureInfo.media = Picture.new_();
                    }
                    if (realPictureInfo.status == null) {
                        realPictureInfo.status = "";
                    }
                    if (realPictureInfo.reason == null) {
                        realPictureInfo.reason = "";
                    }
                    if (realPictureInfo.source != null) {
                        break;
                    }
                    realPictureInfo.source = "";
                    break;
                }
                if (iU == 10) {
                    realPictureInfo.media = (Picture) nb5Var.l(Picture.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    realPictureInfo.status = nb5Var.s();
                } else if (iU == 26) {
                    realPictureInfo.reason = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (realPictureInfo.media == null) {
                            realPictureInfo.media = Picture.new_();
                        }
                        if (realPictureInfo.status == null) {
                            realPictureInfo.status = "";
                        }
                        if (realPictureInfo.reason == null) {
                            realPictureInfo.reason = "";
                        }
                        if (realPictureInfo.source != null) {
                            break;
                        }
                        realPictureInfo.source = "";
                        return realPictureInfo;
                    }
                    realPictureInfo.source = nb5Var.s();
                }
            }
            return realPictureInfo;
        }

        public void serialize(RealPictureInfo realPictureInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Picture picture = realPictureInfo.media;
            if (picture != null) {
                codedOutputByteBufferNano.K(1, picture, Picture.PROTOBUF_ADAPTER);
            }
            String str = realPictureInfo.status;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = realPictureInfo.reason;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = realPictureInfo.source;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<RealPictureInfo> JSON_ADAPTER = new ObjectJsonAdapter<RealPictureInfo>() { // from class: com.p1.mobile.putong.core.data.RealPictureInfo.2
        public Class getDataClass() {
            return RealPictureInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RealPictureInfo m15254newInstance() {
            return new RealPictureInfo();
        }

        public boolean parseField(RealPictureInfo realPictureInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reason":
                    realPictureInfo.reason = jsonParser.getValueAsString();
                    return true;
                case "source":
                    realPictureInfo.source = jsonParser.getValueAsString();
                    return true;
                case "status":
                    realPictureInfo.status = jsonParser.getValueAsString();
                    return true;
                case "media":
                    realPictureInfo.media = (Picture) Converter.RAW_PICTURE_TO_PICTURE.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RealPictureInfo realPictureInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "reason":
                case "source":
                case "status":
                case "media":
                    return true;
                default:
                    return super.parseFieldCheck(realPictureInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(RealPictureInfo realPictureInfo, JsonGenerator jsonGenerator) throws IOException {
            if (realPictureInfo.media != null) {
                jsonGenerator.writeFieldName("media");
                Converter.RAW_PICTURE_TO_PICTURE.serialize(realPictureInfo.media, jsonGenerator, true);
            }
            String str = realPictureInfo.status;
            if (str != null) {
                jsonGenerator.writeStringField("status", str);
            }
            String str2 = realPictureInfo.reason;
            if (str2 != null) {
                jsonGenerator.writeStringField(Reason.TYPE, str2);
            }
            String str3 = realPictureInfo.source;
            if (str3 != null) {
                jsonGenerator.writeStringField("source", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RealPictureInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RealPictureInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RealPictureInfo new_() {
        RealPictureInfo realPictureInfo = new RealPictureInfo();
        realPictureInfo.nullCheck();
        return realPictureInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RealPictureInfo m15252clone() {
        RealPictureInfo realPictureInfo = new RealPictureInfo();
        Picture picture = this.media;
        if (picture != null) {
            realPictureInfo.media = picture.clone();
        }
        realPictureInfo.status = this.status;
        realPictureInfo.reason = this.reason;
        realPictureInfo.source = this.source;
        return realPictureInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealPictureInfo)) {
            return false;
        }
        RealPictureInfo realPictureInfo = (RealPictureInfo) obj;
        return ValueObject.util_equals(this.media, realPictureInfo.media) && ValueObject.util_equals(this.status, realPictureInfo.status) && ValueObject.util_equals(this.reason, realPictureInfo.reason) && ValueObject.util_equals(this.source, realPictureInfo.source);
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
        Picture picture = this.media;
        int iHashCode = (i2 + (picture != null ? picture.hashCode() : 0)) * 41;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.reason;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.source;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.media == null) {
            this.media = Picture.new_();
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.reason == null) {
            this.reason = "";
        }
        if (this.source == null) {
            this.source = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
