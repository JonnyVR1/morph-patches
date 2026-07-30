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
public class AgeVerificationPatchInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ageverificationpatchinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String birthday;

    @NonNull
    @ProtobufIndex(index = 2)
    public String certType;

    @NonNull
    @ProtobufIndex(index = 1)
    public Picture media;
    public static ProtobufAdapter<AgeVerificationPatchInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<AgeVerificationPatchInfo>() { // from class: com.p1.mobile.putong.data.AgeVerificationPatchInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AgeVerificationPatchInfo ageVerificationPatchInfo) {
            Picture picture = ageVerificationPatchInfo.media;
            int iM17285l = picture != null ? CodedOutputByteBufferNano.m17285l(1, picture, Picture.PROTOBUF_ADAPTER) : 0;
            String str = ageVerificationPatchInfo.certType;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = ageVerificationPatchInfo.birthday;
            if (str2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            ageVerificationPatchInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AgeVerificationPatchInfo parse(nc5 nc5Var) throws IOException {
            AgeVerificationPatchInfo ageVerificationPatchInfo = new AgeVerificationPatchInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (ageVerificationPatchInfo.media == null) {
                        ageVerificationPatchInfo.media = Picture.new_();
                    }
                    if (ageVerificationPatchInfo.certType == null) {
                        ageVerificationPatchInfo.certType = "";
                    }
                    if (ageVerificationPatchInfo.birthday != null) {
                        break;
                    }
                    ageVerificationPatchInfo.birthday = "";
                    break;
                }
                if (iM162497u == 10) {
                    ageVerificationPatchInfo.media = (Picture) nc5Var.m162488l(Picture.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    ageVerificationPatchInfo.certType = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (ageVerificationPatchInfo.media == null) {
                            ageVerificationPatchInfo.media = Picture.new_();
                        }
                        if (ageVerificationPatchInfo.certType == null) {
                            ageVerificationPatchInfo.certType = "";
                        }
                        if (ageVerificationPatchInfo.birthday != null) {
                            break;
                        }
                        ageVerificationPatchInfo.birthday = "";
                        return ageVerificationPatchInfo;
                    }
                    ageVerificationPatchInfo.birthday = nc5Var.m162495s();
                }
            }
            return ageVerificationPatchInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AgeVerificationPatchInfo ageVerificationPatchInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Picture picture = ageVerificationPatchInfo.media;
            if (picture != null) {
                codedOutputByteBufferNano.m17309K(1, picture, Picture.PROTOBUF_ADAPTER);
            }
            String str = ageVerificationPatchInfo.certType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = ageVerificationPatchInfo.birthday;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<AgeVerificationPatchInfo> JSON_ADAPTER = new ObjectJsonAdapter<AgeVerificationPatchInfo>() { // from class: com.p1.mobile.putong.data.AgeVerificationPatchInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AgeVerificationPatchInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AgeVerificationPatchInfo newInstance() {
            return new AgeVerificationPatchInfo();
        }

        public boolean parseField(AgeVerificationPatchInfo ageVerificationPatchInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "certType":
                    ageVerificationPatchInfo.certType = jsonParser.getValueAsString();
                    return true;
                case "media":
                    ageVerificationPatchInfo.media = Converter.RAW_PICTURE_TO_PICTURE.parse(jsonParser, str2);
                    return true;
                case "birthday":
                    ageVerificationPatchInfo.birthday = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AgeVerificationPatchInfo ageVerificationPatchInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "certType":
                case "media":
                case "birthday":
                    return true;
                default:
                    return super.parseFieldCheck(ageVerificationPatchInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AgeVerificationPatchInfo ageVerificationPatchInfo, JsonGenerator jsonGenerator) throws IOException {
            if (ageVerificationPatchInfo.media != null) {
                jsonGenerator.writeFieldName("media");
                Converter.RAW_PICTURE_TO_PICTURE.serialize(ageVerificationPatchInfo.media, jsonGenerator, true);
            }
            String str = ageVerificationPatchInfo.certType;
            if (str != null) {
                jsonGenerator.writeStringField("certType", str);
            }
            String str2 = ageVerificationPatchInfo.birthday;
            if (str2 != null) {
                jsonGenerator.writeStringField("birthday", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AgeVerificationPatchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AgeVerificationPatchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AgeVerificationPatchInfo new_() {
        AgeVerificationPatchInfo ageVerificationPatchInfo = new AgeVerificationPatchInfo();
        ageVerificationPatchInfo.nullCheck();
        return ageVerificationPatchInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AgeVerificationPatchInfo mo225055clone() {
        AgeVerificationPatchInfo ageVerificationPatchInfo = new AgeVerificationPatchInfo();
        Picture picture = this.media;
        if (picture != null) {
            ageVerificationPatchInfo.media = picture.mo225055clone();
        }
        ageVerificationPatchInfo.certType = this.certType;
        ageVerificationPatchInfo.birthday = this.birthday;
        return ageVerificationPatchInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgeVerificationPatchInfo)) {
            return false;
        }
        AgeVerificationPatchInfo ageVerificationPatchInfo = (AgeVerificationPatchInfo) obj;
        return ValueObject.util_equals(this.media, ageVerificationPatchInfo.media) && ValueObject.util_equals(this.certType, ageVerificationPatchInfo.certType) && ValueObject.util_equals(this.birthday, ageVerificationPatchInfo.birthday);
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
        Picture picture = this.media;
        int iHashCode = (i2 + (picture != null ? picture.hashCode() : 0)) * 41;
        String str = this.certType;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.birthday;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.media == null) {
            this.media = Picture.new_();
        }
        if (this.certType == null) {
            this.certType = "";
        }
        if (this.birthday == null) {
            this.birthday = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
