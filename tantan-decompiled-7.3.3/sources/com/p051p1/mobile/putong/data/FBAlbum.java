package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class FBAlbum extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbalbum";

    @ProtobufIndex(index = 3)
    public int count;

    @NonNull
    @ProtobufIndex(index = 4)
    public FBPicture cover;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39597id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<FBAlbum> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBAlbum>() { // from class: com.p1.mobile.putong.data.FBAlbum.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FBAlbum fBAlbum) {
            String str = fBAlbum.f39597id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = fBAlbum.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, fBAlbum.count);
            FBPicture fBPicture = fBAlbum.cover;
            if (fBPicture != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, fBPicture, FBPicture.PROTOBUF_ADAPTER);
            }
            fBAlbum.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FBAlbum parse(nc5 nc5Var) throws IOException {
            FBAlbum fBAlbum = new FBAlbum();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (fBAlbum.f39597id == null) {
                        fBAlbum.f39597id = "";
                    }
                    if (fBAlbum.name == null) {
                        fBAlbum.name = "";
                    }
                    if (fBAlbum.cover != null) {
                        break;
                    }
                    fBAlbum.cover = FBPicture.new_();
                    break;
                }
                if (iM162497u == 10) {
                    fBAlbum.f39597id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    fBAlbum.name = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    fBAlbum.count = nc5Var.m162486j();
                } else {
                    if (iM162497u != 34) {
                        if (fBAlbum.f39597id == null) {
                            fBAlbum.f39597id = "";
                        }
                        if (fBAlbum.name == null) {
                            fBAlbum.name = "";
                        }
                        if (fBAlbum.cover != null) {
                            break;
                        }
                        fBAlbum.cover = FBPicture.new_();
                        return fBAlbum;
                    }
                    fBAlbum.cover = (FBPicture) nc5Var.m162488l(FBPicture.PROTOBUF_ADAPTER);
                }
            }
            return fBAlbum;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FBAlbum fBAlbum, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBAlbum.f39597id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = fBAlbum.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17305G(3, fBAlbum.count);
            FBPicture fBPicture = fBAlbum.cover;
            if (fBPicture != null) {
                codedOutputByteBufferNano.m17309K(4, fBPicture, FBPicture.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FBAlbum> JSON_ADAPTER = new ObjectJsonAdapter<FBAlbum>() { // from class: com.p1.mobile.putong.data.FBAlbum.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FBAlbum.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FBAlbum newInstance() {
            return new FBAlbum();
        }

        public boolean parseField(FBAlbum fBAlbum, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    fBAlbum.f39597id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    fBAlbum.name = jsonParser.getValueAsString();
                    return true;
                case "count":
                    fBAlbum.count = jsonParser.getValueAsInt();
                    return true;
                case "cover_photo":
                    fBAlbum.cover = FBPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FBAlbum fBAlbum, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "name":
                case "count":
                case "cover_photo":
                    return true;
                default:
                    return super.parseFieldCheck(fBAlbum, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBAlbum fBAlbum, JsonGenerator jsonGenerator) throws IOException {
            String str = fBAlbum.f39597id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = fBAlbum.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            jsonGenerator.writeNumberField("count", fBAlbum.count);
            if (fBAlbum.cover != null) {
                jsonGenerator.writeFieldName("cover_photo");
                FBPicture.JSON_ADAPTER.serialize(fBAlbum.cover, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBAlbum) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBAlbum) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBAlbum new_() {
        FBAlbum fBAlbum = new FBAlbum();
        fBAlbum.nullCheck();
        return fBAlbum;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FBAlbum mo225055clone() {
        FBAlbum fBAlbum = new FBAlbum();
        fBAlbum.f39597id = this.f39597id;
        fBAlbum.name = this.name;
        fBAlbum.count = this.count;
        FBPicture fBPicture = this.cover;
        if (fBPicture != null) {
            fBAlbum.cover = fBPicture.mo225055clone();
        }
        return fBAlbum;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FBAlbum)) {
            return false;
        }
        FBAlbum fBAlbum = (FBAlbum) obj;
        return ValueObject.util_equals(this.f39597id, fBAlbum.f39597id) && ValueObject.util_equals(this.name, fBAlbum.name) && this.count == fBAlbum.count && ValueObject.util_equals(this.cover, fBAlbum.cover);
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
        String str = this.f39597id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.count) * 41;
        FBPicture fBPicture = this.cover;
        int iHashCode3 = iHashCode2 + (fBPicture != null ? fBPicture.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39597id == null) {
            this.f39597id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.cover == null) {
            this.cover = FBPicture.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
