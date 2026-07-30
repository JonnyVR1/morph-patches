package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.StudentVerificationStatus;
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
public class PicVerificationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picverificationinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public Picture media;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public StudentVerificationStatus status;
    public static ProtobufAdapter<PicVerificationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PicVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.PicVerificationInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PicVerificationInfo picVerificationInfo) {
            Picture picture = picVerificationInfo.media;
            int iL = picture != null ? CodedOutputByteBufferNano.l(1, picture, Picture.PROTOBUF_ADAPTER) : 0;
            StudentVerificationStatus studentVerificationStatus = picVerificationInfo.status;
            if (studentVerificationStatus != null) {
                iL += CodedOutputByteBufferNano.h(2, studentVerificationStatus.ordinal());
            }
            StudentVerificationStatus studentVerificationStatus2 = picVerificationInfo.status;
            if (studentVerificationStatus2 != null) {
                iL += CodedOutputByteBufferNano.l(3, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) picVerificationInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PicVerificationInfo m14767parse(nb5 nb5Var) throws IOException {
            PicVerificationInfo picVerificationInfo = new PicVerificationInfo();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (picVerificationInfo.status == null && numValueOf != null) {
                        picVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (picVerificationInfo.media == null) {
                        picVerificationInfo.media = Picture.new_();
                    }
                    if (picVerificationInfo.status != null) {
                        break;
                    }
                    picVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    picVerificationInfo.media = (Picture) nb5Var.l(Picture.PROTOBUF_ADAPTER);
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 26) {
                        if (picVerificationInfo.status == null && numValueOf != null) {
                            picVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (picVerificationInfo.media == null) {
                            picVerificationInfo.media = Picture.new_();
                        }
                        if (picVerificationInfo.status != null) {
                            break;
                        }
                        picVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                        return picVerificationInfo;
                    }
                    picVerificationInfo.status = (StudentVerificationStatus) nb5Var.l(StudentVerificationStatus.PROTOBUF_ADAPTER);
                }
            }
            return picVerificationInfo;
        }

        public void serialize(PicVerificationInfo picVerificationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Picture picture = picVerificationInfo.media;
            if (picture != null) {
                codedOutputByteBufferNano.K(1, picture, Picture.PROTOBUF_ADAPTER);
            }
            StudentVerificationStatus studentVerificationStatus = picVerificationInfo.status;
            if (studentVerificationStatus != null) {
                codedOutputByteBufferNano.G(2, studentVerificationStatus.ordinal());
            }
            StudentVerificationStatus studentVerificationStatus2 = picVerificationInfo.status;
            if (studentVerificationStatus2 != null) {
                codedOutputByteBufferNano.K(3, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PicVerificationInfo> JSON_ADAPTER = new ObjectJsonAdapter<PicVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.PicVerificationInfo.2
        public Class getDataClass() {
            return PicVerificationInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PicVerificationInfo m14768newInstance() {
            return new PicVerificationInfo();
        }

        public boolean parseField(PicVerificationInfo picVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("status")) {
                picVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("media")) {
                return false;
            }
            picVerificationInfo.media = (Picture) Converter.RAW_PICTURE_TO_PICTURE.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(PicVerificationInfo picVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status") || str.equals("media")) {
                return true;
            }
            return super.parseFieldCheck(picVerificationInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(PicVerificationInfo picVerificationInfo, JsonGenerator jsonGenerator) throws IOException {
            if (picVerificationInfo.media != null) {
                jsonGenerator.writeFieldName("media");
                Converter.RAW_PICTURE_TO_PICTURE.serialize(picVerificationInfo.media, jsonGenerator, true);
            }
            if (picVerificationInfo.status != null) {
                jsonGenerator.writeFieldName("status");
                StudentVerificationStatus.JSON_ADAPTER.serialize(picVerificationInfo.status, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PicVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PicVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PicVerificationInfo new_() {
        PicVerificationInfo picVerificationInfo = new PicVerificationInfo();
        picVerificationInfo.nullCheck();
        return picVerificationInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PicVerificationInfo m14766clone() {
        PicVerificationInfo picVerificationInfo = new PicVerificationInfo();
        Picture picture = this.media;
        if (picture != null) {
            picVerificationInfo.media = picture.clone();
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
        StudentVerificationStatus studentVerificationStatus = this.status;
        int iHashCode2 = iHashCode + (studentVerificationStatus != null ? studentVerificationStatus.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.media == null) {
            this.media = Picture.new_();
        }
        if (this.status == null) {
            this.status = StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
