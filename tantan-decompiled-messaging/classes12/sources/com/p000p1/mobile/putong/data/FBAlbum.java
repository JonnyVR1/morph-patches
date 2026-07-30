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
    public String f210id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<FBAlbum> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBAlbum>() { // from class: com.p1.mobile.putong.data.FBAlbum.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FBAlbum fBAlbum) {
            String str = fBAlbum.f210id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = fBAlbum.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, fBAlbum.count);
            FBPicture fBPicture = fBAlbum.cover;
            if (fBPicture != null) {
                iH += CodedOutputByteBufferNano.l(4, fBPicture, FBPicture.PROTOBUF_ADAPTER);
            }
            ((MessageNano) fBAlbum).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FBAlbum m18031parse(nb5 nb5Var) throws IOException {
            FBAlbum fBAlbum = new FBAlbum();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fBAlbum.f210id == null) {
                        fBAlbum.f210id = "";
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
                if (iU == 10) {
                    fBAlbum.f210id = nb5Var.s();
                } else if (iU == 18) {
                    fBAlbum.name = nb5Var.s();
                } else if (iU == 24) {
                    fBAlbum.count = nb5Var.j();
                } else {
                    if (iU != 34) {
                        if (fBAlbum.f210id == null) {
                            fBAlbum.f210id = "";
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
                    fBAlbum.cover = (FBPicture) nb5Var.l(FBPicture.PROTOBUF_ADAPTER);
                }
            }
            return fBAlbum;
        }

        public void serialize(FBAlbum fBAlbum, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBAlbum.f210id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = fBAlbum.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, fBAlbum.count);
            FBPicture fBPicture = fBAlbum.cover;
            if (fBPicture != null) {
                codedOutputByteBufferNano.K(4, fBPicture, FBPicture.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FBAlbum> JSON_ADAPTER = new ObjectJsonAdapter<FBAlbum>() { // from class: com.p1.mobile.putong.data.FBAlbum.2
        public Class getDataClass() {
            return FBAlbum.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FBAlbum mo17830newInstance() {
            return new FBAlbum();
        }

        public boolean parseField(FBAlbum fBAlbum, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    fBAlbum.f210id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    fBAlbum.name = jsonParser.getValueAsString();
                    return true;
                case "count":
                    fBAlbum.count = jsonParser.getValueAsInt();
                    return true;
                case "cover_photo":
                    fBAlbum.cover = (FBPicture) FBPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBAlbum fBAlbum, JsonGenerator jsonGenerator) throws IOException {
            String str = fBAlbum.f210id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = fBAlbum.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            jsonGenerator.writeNumberField("count", fBAlbum.count);
            if (fBAlbum.cover != null) {
                jsonGenerator.writeFieldName("cover_photo");
                FBPicture.JSON_ADAPTER.serialize(fBAlbum.cover, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBAlbum) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBAlbum) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBAlbum new_() {
        FBAlbum fBAlbum = new FBAlbum();
        fBAlbum.nullCheck();
        return fBAlbum;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FBAlbum m18030clone() {
        FBAlbum fBAlbum = new FBAlbum();
        fBAlbum.f210id = this.f210id;
        fBAlbum.name = this.name;
        fBAlbum.count = this.count;
        FBPicture fBPicture = this.cover;
        if (fBPicture != null) {
            fBAlbum.cover = fBPicture.m18048clone();
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
        return ValueObject.util_equals(this.f210id, fBAlbum.f210id) && ValueObject.util_equals(this.name, fBAlbum.name) && this.count == fBAlbum.count && ValueObject.util_equals(this.cover, fBAlbum.cover);
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
        String str = this.f210id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.count) * 41;
        FBPicture fBPicture = this.cover;
        int iHashCode3 = iHashCode2 + (fBPicture != null ? fBPicture.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f210id == null) {
            this.f210id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.cover == null) {
            this.cover = FBPicture.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
