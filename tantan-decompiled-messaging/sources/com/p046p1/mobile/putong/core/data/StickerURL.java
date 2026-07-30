package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class StickerURL extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "stickerurl";

    @NonNull
    @ProtobufIndex(index = 3)
    public String femaleStickerPicURL;

    @NonNull
    @ProtobufIndex(index = 4)
    public String femaleStickerURL;

    @NonNull
    @ProtobufIndex(index = 1)
    public String maleStickerPicURL;

    @NonNull
    @ProtobufIndex(index = 2)
    public String maleStickerURL;
    public static ProtobufAdapter<StickerURL> PROTOBUF_ADAPTER = new MessageNanoAdapter<StickerURL>() { // from class: com.p1.mobile.putong.core.data.StickerURL.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StickerURL stickerURL) {
            String str = stickerURL.maleStickerPicURL;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = stickerURL.maleStickerURL;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = stickerURL.femaleStickerPicURL;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = stickerURL.femaleStickerURL;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            stickerURL.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StickerURL parse(nb5 nb5Var) throws IOException {
            StickerURL stickerURL = new StickerURL();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (stickerURL.maleStickerPicURL == null) {
                        stickerURL.maleStickerPicURL = "";
                    }
                    if (stickerURL.femaleStickerPicURL == null) {
                        stickerURL.femaleStickerPicURL = "";
                    }
                    if (stickerURL.maleStickerURL == null) {
                        stickerURL.maleStickerURL = "";
                    }
                    if (stickerURL.femaleStickerURL != null) {
                        break;
                    }
                    stickerURL.femaleStickerURL = "";
                    break;
                }
                if (iM158752u == 10) {
                    stickerURL.maleStickerPicURL = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    stickerURL.maleStickerURL = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    stickerURL.femaleStickerPicURL = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (stickerURL.maleStickerPicURL == null) {
                            stickerURL.maleStickerPicURL = "";
                        }
                        if (stickerURL.femaleStickerPicURL == null) {
                            stickerURL.femaleStickerPicURL = "";
                        }
                        if (stickerURL.maleStickerURL == null) {
                            stickerURL.maleStickerURL = "";
                        }
                        if (stickerURL.femaleStickerURL != null) {
                            break;
                        }
                        stickerURL.femaleStickerURL = "";
                        return stickerURL;
                    }
                    stickerURL.femaleStickerURL = nb5Var.m158750s();
                }
            }
            return stickerURL;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StickerURL stickerURL, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stickerURL.maleStickerPicURL;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = stickerURL.maleStickerURL;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = stickerURL.femaleStickerPicURL;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = stickerURL.femaleStickerURL;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<StickerURL> JSON_ADAPTER = new ObjectJsonAdapter<StickerURL>() { // from class: com.p1.mobile.putong.core.data.StickerURL.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StickerURL.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StickerURL newInstance() {
            return new StickerURL();
        }

        public boolean parseField(StickerURL stickerURL, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "maleStickerURL":
                    stickerURL.maleStickerURL = jsonParser.getValueAsString();
                    return true;
                case "femaleStickerPicURL":
                    stickerURL.femaleStickerPicURL = jsonParser.getValueAsString();
                    return true;
                case "femaleStickerURL":
                    stickerURL.femaleStickerURL = jsonParser.getValueAsString();
                    return true;
                case "maleStickerPicURL":
                    stickerURL.maleStickerPicURL = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(StickerURL stickerURL, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "maleStickerURL":
                case "femaleStickerPicURL":
                case "femaleStickerURL":
                case "maleStickerPicURL":
                    return true;
                default:
                    return super.parseFieldCheck(stickerURL, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StickerURL stickerURL, JsonGenerator jsonGenerator) throws IOException {
            String str = stickerURL.maleStickerPicURL;
            if (str != null) {
                jsonGenerator.writeStringField("maleStickerPicURL", str);
            }
            String str2 = stickerURL.femaleStickerPicURL;
            if (str2 != null) {
                jsonGenerator.writeStringField("femaleStickerPicURL", str2);
            }
            String str3 = stickerURL.maleStickerURL;
            if (str3 != null) {
                jsonGenerator.writeStringField("maleStickerURL", str3);
            }
            String str4 = stickerURL.femaleStickerURL;
            if (str4 != null) {
                jsonGenerator.writeStringField("femaleStickerURL", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StickerURL) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StickerURL) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StickerURL new_() {
        StickerURL stickerURL = new StickerURL();
        stickerURL.nullCheck();
        return stickerURL;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StickerURL mo223809clone() {
        StickerURL stickerURL = new StickerURL();
        stickerURL.maleStickerPicURL = this.maleStickerPicURL;
        stickerURL.femaleStickerPicURL = this.femaleStickerPicURL;
        stickerURL.maleStickerURL = this.maleStickerURL;
        stickerURL.femaleStickerURL = this.femaleStickerURL;
        return stickerURL;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StickerURL)) {
            return false;
        }
        StickerURL stickerURL = (StickerURL) obj;
        return ValueObject.util_equals(this.maleStickerPicURL, stickerURL.maleStickerPicURL) && ValueObject.util_equals(this.femaleStickerPicURL, stickerURL.femaleStickerPicURL) && ValueObject.util_equals(this.maleStickerURL, stickerURL.maleStickerURL) && ValueObject.util_equals(this.femaleStickerURL, stickerURL.femaleStickerURL);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "stickerurl";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.maleStickerPicURL;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.femaleStickerPicURL;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.maleStickerURL;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.femaleStickerURL;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.maleStickerPicURL == null) {
            this.maleStickerPicURL = "";
        }
        if (this.femaleStickerPicURL == null) {
            this.femaleStickerPicURL = "";
        }
        if (this.maleStickerURL == null) {
            this.maleStickerURL = "";
        }
        if (this.femaleStickerURL == null) {
            this.femaleStickerURL = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
