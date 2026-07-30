package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
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
public class PicVerificationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picverificationinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public Picture media;

    @NonNull
    @ProtobufIndex(index = 2)
    public StudentVerificationStatus status;
    public static ProtobufAdapter<PicVerificationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PicVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.PicVerificationInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PicVerificationInfo picVerificationInfo) {
            Picture picture = picVerificationInfo.media;
            int iM17230l = picture != null ? CodedOutputByteBufferNano.m17230l(1, picture, Picture.PROTOBUF_ADAPTER) : 0;
            StudentVerificationStatus studentVerificationStatus = picVerificationInfo.status;
            if (studentVerificationStatus != null) {
                iM17230l += CodedOutputByteBufferNano.m17226h(2, studentVerificationStatus.ordinal());
            }
            StudentVerificationStatus studentVerificationStatus2 = picVerificationInfo.status;
            if (studentVerificationStatus2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
            picVerificationInfo.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PicVerificationInfo parse(nb5 nb5Var) throws IOException {
            PicVerificationInfo picVerificationInfo = new PicVerificationInfo();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (picVerificationInfo.status == null && numValueOf != null) {
                        picVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (picVerificationInfo.media == null) {
                        picVerificationInfo.media = Picture.new_();
                    }
                    if (picVerificationInfo.status != null) {
                        break;
                    }
                    picVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 10) {
                    picVerificationInfo.media = (Picture) nb5Var.m158743l(Picture.PROTOBUF_ADAPTER);
                } else if (iM158752u == 16) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else {
                    if (iM158752u != 26) {
                        if (picVerificationInfo.status == null && numValueOf != null) {
                            picVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (picVerificationInfo.media == null) {
                            picVerificationInfo.media = Picture.new_();
                        }
                        if (picVerificationInfo.status != null) {
                            break;
                        }
                        picVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                        return picVerificationInfo;
                    }
                    picVerificationInfo.status = (StudentVerificationStatus) nb5Var.m158743l(StudentVerificationStatus.PROTOBUF_ADAPTER);
                }
            }
            return picVerificationInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PicVerificationInfo picVerificationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Picture picture = picVerificationInfo.media;
            if (picture != null) {
                codedOutputByteBufferNano.m17254K(1, picture, Picture.PROTOBUF_ADAPTER);
            }
            StudentVerificationStatus studentVerificationStatus = picVerificationInfo.status;
            if (studentVerificationStatus != null) {
                codedOutputByteBufferNano.m17250G(2, studentVerificationStatus.ordinal());
            }
            StudentVerificationStatus studentVerificationStatus2 = picVerificationInfo.status;
            if (studentVerificationStatus2 != null) {
                codedOutputByteBufferNano.m17254K(3, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PicVerificationInfo> JSON_ADAPTER = new ObjectJsonAdapter<PicVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.PicVerificationInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PicVerificationInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PicVerificationInfo newInstance() {
            return new PicVerificationInfo();
        }

        public boolean parseField(PicVerificationInfo picVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                picVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("media")) {
                return false;
            }
            picVerificationInfo.media = Converter.RAW_PICTURE_TO_PICTURE.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(PicVerificationInfo picVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS) || str.equals("media")) {
                return true;
            }
            return super.parseFieldCheck(picVerificationInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PicVerificationInfo picVerificationInfo, JsonGenerator jsonGenerator) throws IOException {
            if (picVerificationInfo.media != null) {
                jsonGenerator.writeFieldName("media");
                Converter.RAW_PICTURE_TO_PICTURE.serialize(picVerificationInfo.media, jsonGenerator, true);
            }
            if (picVerificationInfo.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                StudentVerificationStatus.JSON_ADAPTER.serialize(picVerificationInfo.status, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PicVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PicVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PicVerificationInfo new_() {
        PicVerificationInfo picVerificationInfo = new PicVerificationInfo();
        picVerificationInfo.nullCheck();
        return picVerificationInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PicVerificationInfo mo223809clone() {
        PicVerificationInfo picVerificationInfo = new PicVerificationInfo();
        Picture picture = this.media;
        if (picture != null) {
            picVerificationInfo.media = picture.mo223809clone();
        }
        picVerificationInfo.status = this.status;
        return picVerificationInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PicVerificationInfo)) {
            return false;
        }
        PicVerificationInfo picVerificationInfo = (PicVerificationInfo) obj;
        return ValueObject.util_equals(this.media, picVerificationInfo.media) && ValueObject.util_equals(this.status, picVerificationInfo.status);
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
        StudentVerificationStatus studentVerificationStatus = this.status;
        int iHashCode2 = iHashCode + (studentVerificationStatus != null ? studentVerificationStatus.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.media == null) {
            this.media = Picture.new_();
        }
        if (this.status == null) {
            this.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
