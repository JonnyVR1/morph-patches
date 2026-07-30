package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class PictureServeCheckResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pictureservecheckresult";

    @NonNull
    @ProtobufIndex(index = 4)
    public PhotoLowModelData lowPhotoResult;

    @NonNull
    @ProtobufIndex(index = 3)
    public PhotoLowModelData netPictureResult;

    @NonNull
    @ProtobufIndex(index = 1)
    public PhotoLowModelData notVerificationResultData;

    @NonNull
    @ProtobufIndex(index = 2)
    public PhotoLowModelData repeatPictureResult;
    public static ProtobufAdapter<PictureServeCheckResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<PictureServeCheckResult>() { // from class: com.p1.mobile.putong.core.data.PictureServeCheckResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PictureServeCheckResult pictureServeCheckResult) {
            PhotoLowModelData photoLowModelData = pictureServeCheckResult.notVerificationResultData;
            int iM17285l = photoLowModelData != null ? CodedOutputByteBufferNano.m17285l(1, photoLowModelData, PhotoLowModelData.PROTOBUF_ADAPTER) : 0;
            PhotoLowModelData photoLowModelData2 = pictureServeCheckResult.repeatPictureResult;
            if (photoLowModelData2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, photoLowModelData2, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            PhotoLowModelData photoLowModelData3 = pictureServeCheckResult.netPictureResult;
            if (photoLowModelData3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, photoLowModelData3, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            PhotoLowModelData photoLowModelData4 = pictureServeCheckResult.lowPhotoResult;
            if (photoLowModelData4 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, photoLowModelData4, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            pictureServeCheckResult.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PictureServeCheckResult parse(nc5 nc5Var) throws IOException {
            PictureServeCheckResult pictureServeCheckResult = new PictureServeCheckResult();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (pictureServeCheckResult.notVerificationResultData == null) {
                        pictureServeCheckResult.notVerificationResultData = PhotoLowModelData.new_();
                    }
                    if (pictureServeCheckResult.repeatPictureResult == null) {
                        pictureServeCheckResult.repeatPictureResult = PhotoLowModelData.new_();
                    }
                    if (pictureServeCheckResult.netPictureResult == null) {
                        pictureServeCheckResult.netPictureResult = PhotoLowModelData.new_();
                    }
                    if (pictureServeCheckResult.lowPhotoResult != null) {
                        break;
                    }
                    pictureServeCheckResult.lowPhotoResult = PhotoLowModelData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    pictureServeCheckResult.notVerificationResultData = (PhotoLowModelData) nc5Var.m162488l(PhotoLowModelData.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    pictureServeCheckResult.repeatPictureResult = (PhotoLowModelData) nc5Var.m162488l(PhotoLowModelData.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    pictureServeCheckResult.netPictureResult = (PhotoLowModelData) nc5Var.m162488l(PhotoLowModelData.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 34) {
                        if (pictureServeCheckResult.notVerificationResultData == null) {
                            pictureServeCheckResult.notVerificationResultData = PhotoLowModelData.new_();
                        }
                        if (pictureServeCheckResult.repeatPictureResult == null) {
                            pictureServeCheckResult.repeatPictureResult = PhotoLowModelData.new_();
                        }
                        if (pictureServeCheckResult.netPictureResult == null) {
                            pictureServeCheckResult.netPictureResult = PhotoLowModelData.new_();
                        }
                        if (pictureServeCheckResult.lowPhotoResult != null) {
                            break;
                        }
                        pictureServeCheckResult.lowPhotoResult = PhotoLowModelData.new_();
                        return pictureServeCheckResult;
                    }
                    pictureServeCheckResult.lowPhotoResult = (PhotoLowModelData) nc5Var.m162488l(PhotoLowModelData.PROTOBUF_ADAPTER);
                }
            }
            return pictureServeCheckResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PictureServeCheckResult pictureServeCheckResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PhotoLowModelData photoLowModelData = pictureServeCheckResult.notVerificationResultData;
            if (photoLowModelData != null) {
                codedOutputByteBufferNano.m17309K(1, photoLowModelData, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            PhotoLowModelData photoLowModelData2 = pictureServeCheckResult.repeatPictureResult;
            if (photoLowModelData2 != null) {
                codedOutputByteBufferNano.m17309K(2, photoLowModelData2, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            PhotoLowModelData photoLowModelData3 = pictureServeCheckResult.netPictureResult;
            if (photoLowModelData3 != null) {
                codedOutputByteBufferNano.m17309K(3, photoLowModelData3, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
            PhotoLowModelData photoLowModelData4 = pictureServeCheckResult.lowPhotoResult;
            if (photoLowModelData4 != null) {
                codedOutputByteBufferNano.m17309K(4, photoLowModelData4, PhotoLowModelData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PictureServeCheckResult> JSON_ADAPTER = new ObjectJsonAdapter<PictureServeCheckResult>() { // from class: com.p1.mobile.putong.core.data.PictureServeCheckResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PictureServeCheckResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PictureServeCheckResult newInstance() {
            return new PictureServeCheckResult();
        }

        public boolean parseField(PictureServeCheckResult pictureServeCheckResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "notVerificationResultData":
                    pictureServeCheckResult.notVerificationResultData = PhotoLowModelData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "lowPhotoResult":
                    pictureServeCheckResult.lowPhotoResult = PhotoLowModelData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "netPictureResult":
                    pictureServeCheckResult.netPictureResult = PhotoLowModelData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "repeatPictureResult":
                    pictureServeCheckResult.repeatPictureResult = PhotoLowModelData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PictureServeCheckResult pictureServeCheckResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "notVerificationResultData":
                case "lowPhotoResult":
                case "netPictureResult":
                case "repeatPictureResult":
                    return true;
                default:
                    return super.parseFieldCheck(pictureServeCheckResult, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PictureServeCheckResult pictureServeCheckResult, JsonGenerator jsonGenerator) throws IOException {
            if (pictureServeCheckResult.notVerificationResultData != null) {
                jsonGenerator.writeFieldName("notVerificationResultData");
                PhotoLowModelData.JSON_ADAPTER.serialize(pictureServeCheckResult.notVerificationResultData, jsonGenerator, true);
            }
            if (pictureServeCheckResult.repeatPictureResult != null) {
                jsonGenerator.writeFieldName("repeatPictureResult");
                PhotoLowModelData.JSON_ADAPTER.serialize(pictureServeCheckResult.repeatPictureResult, jsonGenerator, true);
            }
            if (pictureServeCheckResult.netPictureResult != null) {
                jsonGenerator.writeFieldName("netPictureResult");
                PhotoLowModelData.JSON_ADAPTER.serialize(pictureServeCheckResult.netPictureResult, jsonGenerator, true);
            }
            if (pictureServeCheckResult.lowPhotoResult != null) {
                jsonGenerator.writeFieldName("lowPhotoResult");
                PhotoLowModelData.JSON_ADAPTER.serialize(pictureServeCheckResult.lowPhotoResult, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PictureServeCheckResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PictureServeCheckResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PictureServeCheckResult new_() {
        PictureServeCheckResult pictureServeCheckResult = new PictureServeCheckResult();
        pictureServeCheckResult.nullCheck();
        return pictureServeCheckResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PictureServeCheckResult mo225055clone() {
        PictureServeCheckResult pictureServeCheckResult = new PictureServeCheckResult();
        PhotoLowModelData photoLowModelData = this.notVerificationResultData;
        if (photoLowModelData != null) {
            pictureServeCheckResult.notVerificationResultData = photoLowModelData.mo225055clone();
        }
        PhotoLowModelData photoLowModelData2 = this.repeatPictureResult;
        if (photoLowModelData2 != null) {
            pictureServeCheckResult.repeatPictureResult = photoLowModelData2.mo225055clone();
        }
        PhotoLowModelData photoLowModelData3 = this.netPictureResult;
        if (photoLowModelData3 != null) {
            pictureServeCheckResult.netPictureResult = photoLowModelData3.mo225055clone();
        }
        PhotoLowModelData photoLowModelData4 = this.lowPhotoResult;
        if (photoLowModelData4 != null) {
            pictureServeCheckResult.lowPhotoResult = photoLowModelData4.mo225055clone();
        }
        return pictureServeCheckResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PictureServeCheckResult)) {
            return false;
        }
        PictureServeCheckResult pictureServeCheckResult = (PictureServeCheckResult) obj;
        return ValueObject.util_equals(this.notVerificationResultData, pictureServeCheckResult.notVerificationResultData) && ValueObject.util_equals(this.repeatPictureResult, pictureServeCheckResult.repeatPictureResult) && ValueObject.util_equals(this.netPictureResult, pictureServeCheckResult.netPictureResult) && ValueObject.util_equals(this.lowPhotoResult, pictureServeCheckResult.lowPhotoResult);
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
        PhotoLowModelData photoLowModelData = this.notVerificationResultData;
        int iHashCode = (i2 + (photoLowModelData != null ? photoLowModelData.hashCode() : 0)) * 41;
        PhotoLowModelData photoLowModelData2 = this.repeatPictureResult;
        int iHashCode2 = (iHashCode + (photoLowModelData2 != null ? photoLowModelData2.hashCode() : 0)) * 41;
        PhotoLowModelData photoLowModelData3 = this.netPictureResult;
        int iHashCode3 = (iHashCode2 + (photoLowModelData3 != null ? photoLowModelData3.hashCode() : 0)) * 41;
        PhotoLowModelData photoLowModelData4 = this.lowPhotoResult;
        int iHashCode4 = iHashCode3 + (photoLowModelData4 != null ? photoLowModelData4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.notVerificationResultData == null) {
            this.notVerificationResultData = PhotoLowModelData.new_();
        }
        if (this.repeatPictureResult == null) {
            this.repeatPictureResult = PhotoLowModelData.new_();
        }
        if (this.netPictureResult == null) {
            this.netPictureResult = PhotoLowModelData.new_();
        }
        if (this.lowPhotoResult == null) {
            this.lowPhotoResult = PhotoLowModelData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
