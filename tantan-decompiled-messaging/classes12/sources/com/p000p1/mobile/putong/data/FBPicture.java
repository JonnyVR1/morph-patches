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
public class FBPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbpicture";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f214id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String source;

    @NonNull
    @ProtobufIndex(index = 4)
    public String thumbnail;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;
    public static ProtobufAdapter<FBPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBPicture>() { // from class: com.p1.mobile.putong.data.FBPicture.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FBPicture fBPicture) {
            String str = fBPicture.f214id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = fBPicture.source;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = fBPicture.url;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = fBPicture.thumbnail;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) fBPicture).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FBPicture m18049parse(nb5 nb5Var) throws IOException {
            FBPicture fBPicture = new FBPicture();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fBPicture.f214id == null) {
                        fBPicture.f214id = "";
                    }
                    if (fBPicture.source == null) {
                        fBPicture.source = "";
                    }
                    if (fBPicture.url == null) {
                        fBPicture.url = "";
                    }
                    if (fBPicture.thumbnail != null) {
                        break;
                    }
                    fBPicture.thumbnail = "";
                    break;
                }
                if (iU == 10) {
                    fBPicture.f214id = nb5Var.s();
                } else if (iU == 18) {
                    fBPicture.source = nb5Var.s();
                } else if (iU == 26) {
                    fBPicture.url = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (fBPicture.f214id == null) {
                            fBPicture.f214id = "";
                        }
                        if (fBPicture.source == null) {
                            fBPicture.source = "";
                        }
                        if (fBPicture.url == null) {
                            fBPicture.url = "";
                        }
                        if (fBPicture.thumbnail != null) {
                            break;
                        }
                        fBPicture.thumbnail = "";
                        return fBPicture;
                    }
                    fBPicture.thumbnail = nb5Var.s();
                }
            }
            return fBPicture;
        }

        public void serialize(FBPicture fBPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBPicture.f214id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = fBPicture.source;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = fBPicture.url;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = fBPicture.thumbnail;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<FBPicture> JSON_ADAPTER = new ObjectJsonAdapter<FBPicture>() { // from class: com.p1.mobile.putong.data.FBPicture.2
        public Class getDataClass() {
            return FBPicture.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FBPicture mo17830newInstance() {
            return new FBPicture();
        }

        public boolean parseField(FBPicture fBPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "source":
                    fBPicture.source = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    fBPicture.thumbnail = jsonParser.getValueAsString();
                    return true;
                case "id":
                    fBPicture.f214id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    fBPicture.url = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FBPicture fBPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "source":
                case "picture":
                    return true;
                case "id":
                    return false;
                case "url":
                    return true;
                default:
                    return super.parseFieldCheck(fBPicture, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBPicture fBPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = fBPicture.f214id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = fBPicture.source;
            if (str2 != null) {
                jsonGenerator.writeStringField("source", str2);
            }
            String str3 = fBPicture.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            String str4 = fBPicture.thumbnail;
            if (str4 != null) {
                jsonGenerator.writeStringField("picture", str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBPicture new_() {
        FBPicture fBPicture = new FBPicture();
        fBPicture.nullCheck();
        return fBPicture;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FBPicture m18048clone() {
        FBPicture fBPicture = new FBPicture();
        fBPicture.f214id = this.f214id;
        fBPicture.source = this.source;
        fBPicture.url = this.url;
        fBPicture.thumbnail = this.thumbnail;
        return fBPicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FBPicture)) {
            return false;
        }
        FBPicture fBPicture = (FBPicture) obj;
        return ValueObject.util_equals(this.f214id, fBPicture.f214id) && ValueObject.util_equals(this.source, fBPicture.source) && ValueObject.util_equals(this.url, fBPicture.url) && ValueObject.util_equals(this.thumbnail, fBPicture.thumbnail);
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
        String str = this.f214id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.source;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.thumbnail;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f214id == null) {
            this.f214id = "";
        }
        if (this.source == null) {
            this.source = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.thumbnail == null) {
            this.thumbnail = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
