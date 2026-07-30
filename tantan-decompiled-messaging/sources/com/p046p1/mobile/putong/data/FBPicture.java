package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class FBPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbpicture";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38753id;

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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FBPicture fBPicture) {
            String str = fBPicture.f38753id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = fBPicture.source;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = fBPicture.url;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = fBPicture.thumbnail;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            fBPicture.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FBPicture parse(nb5 nb5Var) throws IOException {
            FBPicture fBPicture = new FBPicture();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (fBPicture.f38753id == null) {
                        fBPicture.f38753id = "";
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
                if (iM158752u == 10) {
                    fBPicture.f38753id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    fBPicture.source = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    fBPicture.url = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (fBPicture.f38753id == null) {
                            fBPicture.f38753id = "";
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
                    fBPicture.thumbnail = nb5Var.m158750s();
                }
            }
            return fBPicture;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FBPicture fBPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBPicture.f38753id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = fBPicture.source;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = fBPicture.url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = fBPicture.thumbnail;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<FBPicture> JSON_ADAPTER = new ObjectJsonAdapter<FBPicture>() { // from class: com.p1.mobile.putong.data.FBPicture.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FBPicture.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FBPicture newInstance() {
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
                    fBPicture.f38753id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBPicture fBPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = fBPicture.f38753id;
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBPicture new_() {
        FBPicture fBPicture = new FBPicture();
        fBPicture.nullCheck();
        return fBPicture;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FBPicture mo223809clone() {
        FBPicture fBPicture = new FBPicture();
        fBPicture.f38753id = this.f38753id;
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
        return ValueObject.util_equals(this.f38753id, fBPicture.f38753id) && ValueObject.util_equals(this.source, fBPicture.source) && ValueObject.util_equals(this.url, fBPicture.url) && ValueObject.util_equals(this.thumbnail, fBPicture.thumbnail);
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
        String str = this.f38753id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.source;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.thumbnail;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38753id == null) {
            this.f38753id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
