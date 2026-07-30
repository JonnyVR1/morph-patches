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
public class PicVerification extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picverification";

    @NonNull
    @ProtobufIndex(index = 3)
    public VerificationResult age;

    @NonNull
    @ProtobufIndex(index = 4)
    public VerificationResult anchor;

    @NonNull
    @ProtobufIndex(index = 2)
    public IdVerificationResult idCard;

    @NonNull
    @ProtobufIndex(index = 5)
    public OtherVerificationWrapper others;

    @NonNull
    @ProtobufIndex(index = 1)
    public PicVerificationResult picVerificationResult;
    public static ProtobufAdapter<PicVerification> PROTOBUF_ADAPTER = new MessageNanoAdapter<PicVerification>() { // from class: com.p1.mobile.putong.data.PicVerification.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PicVerification picVerification) {
            PicVerificationResult picVerificationResult = picVerification.picVerificationResult;
            int iL = picVerificationResult != null ? CodedOutputByteBufferNano.l(1, picVerificationResult, PicVerificationResult.PROTOBUF_ADAPTER) : 0;
            IdVerificationResult idVerificationResult = picVerification.idCard;
            if (idVerificationResult != null) {
                iL += CodedOutputByteBufferNano.l(2, idVerificationResult, IdVerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult = picVerification.age;
            if (verificationResult != null) {
                iL += CodedOutputByteBufferNano.l(3, verificationResult, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult2 = picVerification.anchor;
            if (verificationResult2 != null) {
                iL += CodedOutputByteBufferNano.l(4, verificationResult2, VerificationResult.PROTOBUF_ADAPTER);
            }
            OtherVerificationWrapper otherVerificationWrapper = picVerification.others;
            if (otherVerificationWrapper != null) {
                iL += CodedOutputByteBufferNano.l(5, otherVerificationWrapper, OtherVerificationWrapper.PROTOBUF_ADAPTER);
            }
            ((MessageNano) picVerification).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PicVerification m18801parse(nb5 nb5Var) throws IOException {
            PicVerification picVerification = new PicVerification();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (picVerification.picVerificationResult == null) {
                        picVerification.picVerificationResult = PicVerificationResult.new_();
                    }
                    if (picVerification.idCard == null) {
                        picVerification.idCard = IdVerificationResult.new_();
                    }
                    if (picVerification.age == null) {
                        picVerification.age = VerificationResult.new_();
                    }
                    if (picVerification.anchor == null) {
                        picVerification.anchor = VerificationResult.new_();
                    }
                    if (picVerification.others != null) {
                        break;
                    }
                    picVerification.others = OtherVerificationWrapper.new_();
                    break;
                }
                if (iU == 10) {
                    picVerification.picVerificationResult = (PicVerificationResult) nb5Var.l(PicVerificationResult.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    picVerification.idCard = (IdVerificationResult) nb5Var.l(IdVerificationResult.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    picVerification.age = (VerificationResult) nb5Var.l(VerificationResult.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    picVerification.anchor = (VerificationResult) nb5Var.l(VerificationResult.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
                        if (picVerification.picVerificationResult == null) {
                            picVerification.picVerificationResult = PicVerificationResult.new_();
                        }
                        if (picVerification.idCard == null) {
                            picVerification.idCard = IdVerificationResult.new_();
                        }
                        if (picVerification.age == null) {
                            picVerification.age = VerificationResult.new_();
                        }
                        if (picVerification.anchor == null) {
                            picVerification.anchor = VerificationResult.new_();
                        }
                        if (picVerification.others != null) {
                            break;
                        }
                        picVerification.others = OtherVerificationWrapper.new_();
                        return picVerification;
                    }
                    picVerification.others = (OtherVerificationWrapper) nb5Var.l(OtherVerificationWrapper.PROTOBUF_ADAPTER);
                }
            }
            return picVerification;
        }

        public void serialize(PicVerification picVerification, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PicVerificationResult picVerificationResult = picVerification.picVerificationResult;
            if (picVerificationResult != null) {
                codedOutputByteBufferNano.K(1, picVerificationResult, PicVerificationResult.PROTOBUF_ADAPTER);
            }
            IdVerificationResult idVerificationResult = picVerification.idCard;
            if (idVerificationResult != null) {
                codedOutputByteBufferNano.K(2, idVerificationResult, IdVerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult = picVerification.age;
            if (verificationResult != null) {
                codedOutputByteBufferNano.K(3, verificationResult, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult2 = picVerification.anchor;
            if (verificationResult2 != null) {
                codedOutputByteBufferNano.K(4, verificationResult2, VerificationResult.PROTOBUF_ADAPTER);
            }
            OtherVerificationWrapper otherVerificationWrapper = picVerification.others;
            if (otherVerificationWrapper != null) {
                codedOutputByteBufferNano.K(5, otherVerificationWrapper, OtherVerificationWrapper.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PicVerification> JSON_ADAPTER = new ObjectJsonAdapter<PicVerification>() { // from class: com.p1.mobile.putong.data.PicVerification.2
        public Class getDataClass() {
            return PicVerification.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PicVerification mo17830newInstance() {
            return new PicVerification();
        }

        public boolean parseField(PicVerification picVerification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchor":
                    picVerification.anchor = (VerificationResult) VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "idCard":
                    picVerification.idCard = (IdVerificationResult) IdVerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "others":
                    picVerification.others = (OtherVerificationWrapper) OtherVerificationWrapper.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "picture":
                    picVerification.picVerificationResult = (PicVerificationResult) PicVerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "age":
                    picVerification.age = (VerificationResult) VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PicVerification picVerification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "anchor":
                case "idCard":
                case "others":
                case "picture":
                case "age":
                    return true;
                default:
                    return super.parseFieldCheck(picVerification, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PicVerification picVerification, JsonGenerator jsonGenerator) throws IOException {
            if (picVerification.picVerificationResult != null) {
                jsonGenerator.writeFieldName("picture");
                PicVerificationResult.JSON_ADAPTER.serialize(picVerification.picVerificationResult, jsonGenerator, true);
            }
            if (picVerification.idCard != null) {
                jsonGenerator.writeFieldName(SearchPriority.idCard);
                IdVerificationResult.JSON_ADAPTER.serialize(picVerification.idCard, jsonGenerator, true);
            }
            if (picVerification.age != null) {
                jsonGenerator.writeFieldName(SeeTextDynamicParam.age);
                VerificationResult.JSON_ADAPTER.serialize(picVerification.age, jsonGenerator, true);
            }
            if (picVerification.anchor != null) {
                jsonGenerator.writeFieldName(LiveRole.anchor);
                VerificationResult.JSON_ADAPTER.serialize(picVerification.anchor, jsonGenerator, true);
            }
            if (picVerification.others != null) {
                jsonGenerator.writeFieldName(LiveRegionTag.others);
                OtherVerificationWrapper.JSON_ADAPTER.serialize(picVerification.others, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PicVerification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PicVerification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PicVerification new_() {
        PicVerification picVerification = new PicVerification();
        picVerification.nullCheck();
        return picVerification;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PicVerification m18800clone() {
        PicVerification picVerification = new PicVerification();
        PicVerificationResult picVerificationResult = this.picVerificationResult;
        if (picVerificationResult != null) {
            picVerification.picVerificationResult = picVerificationResult.m18803clone();
        }
        IdVerificationResult idVerificationResult = this.idCard;
        if (idVerificationResult != null) {
            picVerification.idCard = idVerificationResult.m18210clone();
        }
        VerificationResult verificationResult = this.age;
        if (verificationResult != null) {
            picVerification.age = verificationResult.m19279clone();
        }
        VerificationResult verificationResult2 = this.anchor;
        if (verificationResult2 != null) {
            picVerification.anchor = verificationResult2.m19279clone();
        }
        OtherVerificationWrapper otherVerificationWrapper = this.others;
        if (otherVerificationWrapper != null) {
            picVerification.others = otherVerificationWrapper.m18758clone();
        }
        return picVerification;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PicVerification)) {
            return false;
        }
        PicVerification picVerification = (PicVerification) obj;
        return ValueObject.util_equals(this.picVerificationResult, picVerification.picVerificationResult) && ValueObject.util_equals(this.idCard, picVerification.idCard) && ValueObject.util_equals(this.age, picVerification.age) && ValueObject.util_equals(this.anchor, picVerification.anchor) && ValueObject.util_equals(this.others, picVerification.others);
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
        PicVerificationResult picVerificationResult = this.picVerificationResult;
        int iHashCode = (i2 + (picVerificationResult != null ? picVerificationResult.hashCode() : 0)) * 41;
        IdVerificationResult idVerificationResult = this.idCard;
        int iHashCode2 = (iHashCode + (idVerificationResult != null ? idVerificationResult.hashCode() : 0)) * 41;
        VerificationResult verificationResult = this.age;
        int iHashCode3 = (iHashCode2 + (verificationResult != null ? verificationResult.hashCode() : 0)) * 41;
        VerificationResult verificationResult2 = this.anchor;
        int iHashCode4 = (iHashCode3 + (verificationResult2 != null ? verificationResult2.hashCode() : 0)) * 41;
        OtherVerificationWrapper otherVerificationWrapper = this.others;
        int iHashCode5 = iHashCode4 + (otherVerificationWrapper != null ? otherVerificationWrapper.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.picVerificationResult == null) {
            this.picVerificationResult = PicVerificationResult.new_();
        }
        if (this.idCard == null) {
            this.idCard = IdVerificationResult.new_();
        }
        if (this.age == null) {
            this.age = VerificationResult.new_();
        }
        if (this.anchor == null) {
            this.anchor = VerificationResult.new_();
        }
        if (this.others == null) {
            this.others = OtherVerificationWrapper.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
