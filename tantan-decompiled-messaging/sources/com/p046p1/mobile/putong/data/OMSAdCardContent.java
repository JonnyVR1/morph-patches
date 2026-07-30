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
public class OMSAdCardContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsadcardcontent";

    @NonNull
    @ProtobufIndex(index = 5)
    public OmsLiteratureCardGuide literatureCardGuide;

    @NonNull
    @ProtobufIndex(index = 1)
    public OmsCard omsCard;

    @NonNull
    @ProtobufIndex(index = 2)
    public OmsCardLiterature omsCardLiterature;

    @NonNull
    @ProtobufIndex(index = 3)
    public OmsCardSound omsCardSound;

    @NonNull
    @ProtobufIndex(index = 4)
    public OmsTagCard tagCard;
    public static ProtobufAdapter<OMSAdCardContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSAdCardContent>() { // from class: com.p1.mobile.putong.data.OMSAdCardContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSAdCardContent oMSAdCardContent) {
            OmsCard omsCard = oMSAdCardContent.omsCard;
            int iM17230l = omsCard != null ? CodedOutputByteBufferNano.m17230l(1, omsCard, OmsCard.PROTOBUF_ADAPTER) : 0;
            OmsCardLiterature omsCardLiterature = oMSAdCardContent.omsCardLiterature;
            if (omsCardLiterature != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, omsCardLiterature, OmsCardLiterature.PROTOBUF_ADAPTER);
            }
            OmsCardSound omsCardSound = oMSAdCardContent.omsCardSound;
            if (omsCardSound != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, omsCardSound, OmsCardSound.PROTOBUF_ADAPTER);
            }
            OmsTagCard omsTagCard = oMSAdCardContent.tagCard;
            if (omsTagCard != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, omsTagCard, OmsTagCard.PROTOBUF_ADAPTER);
            }
            OmsLiteratureCardGuide omsLiteratureCardGuide = oMSAdCardContent.literatureCardGuide;
            if (omsLiteratureCardGuide != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, omsLiteratureCardGuide, OmsLiteratureCardGuide.PROTOBUF_ADAPTER);
            }
            oMSAdCardContent.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSAdCardContent parse(nb5 nb5Var) throws IOException {
            OMSAdCardContent oMSAdCardContent = new OMSAdCardContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSAdCardContent.omsCard == null) {
                        oMSAdCardContent.omsCard = OmsCard.new_();
                    }
                    if (oMSAdCardContent.omsCardLiterature == null) {
                        oMSAdCardContent.omsCardLiterature = OmsCardLiterature.new_();
                    }
                    if (oMSAdCardContent.omsCardSound == null) {
                        oMSAdCardContent.omsCardSound = OmsCardSound.new_();
                    }
                    if (oMSAdCardContent.tagCard == null) {
                        oMSAdCardContent.tagCard = OmsTagCard.new_();
                    }
                    if (oMSAdCardContent.literatureCardGuide != null) {
                        break;
                    }
                    oMSAdCardContent.literatureCardGuide = OmsLiteratureCardGuide.new_();
                    break;
                }
                if (iM158752u == 10) {
                    oMSAdCardContent.omsCard = (OmsCard) nb5Var.m158743l(OmsCard.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    oMSAdCardContent.omsCardLiterature = (OmsCardLiterature) nb5Var.m158743l(OmsCardLiterature.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    oMSAdCardContent.omsCardSound = (OmsCardSound) nb5Var.m158743l(OmsCardSound.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    oMSAdCardContent.tagCard = (OmsTagCard) nb5Var.m158743l(OmsTagCard.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 42) {
                        if (oMSAdCardContent.omsCard == null) {
                            oMSAdCardContent.omsCard = OmsCard.new_();
                        }
                        if (oMSAdCardContent.omsCardLiterature == null) {
                            oMSAdCardContent.omsCardLiterature = OmsCardLiterature.new_();
                        }
                        if (oMSAdCardContent.omsCardSound == null) {
                            oMSAdCardContent.omsCardSound = OmsCardSound.new_();
                        }
                        if (oMSAdCardContent.tagCard == null) {
                            oMSAdCardContent.tagCard = OmsTagCard.new_();
                        }
                        if (oMSAdCardContent.literatureCardGuide != null) {
                            break;
                        }
                        oMSAdCardContent.literatureCardGuide = OmsLiteratureCardGuide.new_();
                        return oMSAdCardContent;
                    }
                    oMSAdCardContent.literatureCardGuide = (OmsLiteratureCardGuide) nb5Var.m158743l(OmsLiteratureCardGuide.PROTOBUF_ADAPTER);
                }
            }
            return oMSAdCardContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSAdCardContent oMSAdCardContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OmsCard omsCard = oMSAdCardContent.omsCard;
            if (omsCard != null) {
                codedOutputByteBufferNano.m17254K(1, omsCard, OmsCard.PROTOBUF_ADAPTER);
            }
            OmsCardLiterature omsCardLiterature = oMSAdCardContent.omsCardLiterature;
            if (omsCardLiterature != null) {
                codedOutputByteBufferNano.m17254K(2, omsCardLiterature, OmsCardLiterature.PROTOBUF_ADAPTER);
            }
            OmsCardSound omsCardSound = oMSAdCardContent.omsCardSound;
            if (omsCardSound != null) {
                codedOutputByteBufferNano.m17254K(3, omsCardSound, OmsCardSound.PROTOBUF_ADAPTER);
            }
            OmsTagCard omsTagCard = oMSAdCardContent.tagCard;
            if (omsTagCard != null) {
                codedOutputByteBufferNano.m17254K(4, omsTagCard, OmsTagCard.PROTOBUF_ADAPTER);
            }
            OmsLiteratureCardGuide omsLiteratureCardGuide = oMSAdCardContent.literatureCardGuide;
            if (omsLiteratureCardGuide != null) {
                codedOutputByteBufferNano.m17254K(5, omsLiteratureCardGuide, OmsLiteratureCardGuide.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSAdCardContent> JSON_ADAPTER = new ObjectJsonAdapter<OMSAdCardContent>() { // from class: com.p1.mobile.putong.data.OMSAdCardContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSAdCardContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSAdCardContent newInstance() {
            return new OMSAdCardContent();
        }

        public boolean parseField(OMSAdCardContent oMSAdCardContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "omsCardLiterature":
                    oMSAdCardContent.omsCardLiterature = OmsCardLiterature.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "tagCard":
                    oMSAdCardContent.tagCard = OmsTagCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "omsCard":
                    oMSAdCardContent.omsCard = OmsCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "omsCardSound":
                    oMSAdCardContent.omsCardSound = OmsCardSound.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "literatureCardGuide":
                    oMSAdCardContent.literatureCardGuide = OmsLiteratureCardGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSAdCardContent oMSAdCardContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "omsCardLiterature":
                case "tagCard":
                case "omsCard":
                case "omsCardSound":
                case "literatureCardGuide":
                    return true;
                default:
                    return super.parseFieldCheck(oMSAdCardContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSAdCardContent oMSAdCardContent, JsonGenerator jsonGenerator) throws IOException {
            if (oMSAdCardContent.omsCard != null) {
                jsonGenerator.writeFieldName("omsCard");
                OmsCard.JSON_ADAPTER.serialize(oMSAdCardContent.omsCard, jsonGenerator, true);
            }
            if (oMSAdCardContent.omsCardLiterature != null) {
                jsonGenerator.writeFieldName("omsCardLiterature");
                OmsCardLiterature.JSON_ADAPTER.serialize(oMSAdCardContent.omsCardLiterature, jsonGenerator, true);
            }
            if (oMSAdCardContent.omsCardSound != null) {
                jsonGenerator.writeFieldName("omsCardSound");
                OmsCardSound.JSON_ADAPTER.serialize(oMSAdCardContent.omsCardSound, jsonGenerator, true);
            }
            if (oMSAdCardContent.tagCard != null) {
                jsonGenerator.writeFieldName("tagCard");
                OmsTagCard.JSON_ADAPTER.serialize(oMSAdCardContent.tagCard, jsonGenerator, true);
            }
            if (oMSAdCardContent.literatureCardGuide != null) {
                jsonGenerator.writeFieldName("literatureCardGuide");
                OmsLiteratureCardGuide.JSON_ADAPTER.serialize(oMSAdCardContent.literatureCardGuide, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSAdCardContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSAdCardContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSAdCardContent new_() {
        OMSAdCardContent oMSAdCardContent = new OMSAdCardContent();
        oMSAdCardContent.nullCheck();
        return oMSAdCardContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSAdCardContent mo223809clone() {
        OMSAdCardContent oMSAdCardContent = new OMSAdCardContent();
        OmsCard omsCard = this.omsCard;
        if (omsCard != null) {
            oMSAdCardContent.omsCard = omsCard.mo223809clone();
        }
        OmsCardLiterature omsCardLiterature = this.omsCardLiterature;
        if (omsCardLiterature != null) {
            oMSAdCardContent.omsCardLiterature = omsCardLiterature.mo223809clone();
        }
        OmsCardSound omsCardSound = this.omsCardSound;
        if (omsCardSound != null) {
            oMSAdCardContent.omsCardSound = omsCardSound.mo223809clone();
        }
        OmsTagCard omsTagCard = this.tagCard;
        if (omsTagCard != null) {
            oMSAdCardContent.tagCard = omsTagCard.mo223809clone();
        }
        OmsLiteratureCardGuide omsLiteratureCardGuide = this.literatureCardGuide;
        if (omsLiteratureCardGuide != null) {
            oMSAdCardContent.literatureCardGuide = omsLiteratureCardGuide.mo223809clone();
        }
        return oMSAdCardContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSAdCardContent)) {
            return false;
        }
        OMSAdCardContent oMSAdCardContent = (OMSAdCardContent) obj;
        return ValueObject.util_equals(this.omsCard, oMSAdCardContent.omsCard) && ValueObject.util_equals(this.omsCardLiterature, oMSAdCardContent.omsCardLiterature) && ValueObject.util_equals(this.omsCardSound, oMSAdCardContent.omsCardSound) && ValueObject.util_equals(this.tagCard, oMSAdCardContent.tagCard) && ValueObject.util_equals(this.literatureCardGuide, oMSAdCardContent.literatureCardGuide);
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
        OmsCard omsCard = this.omsCard;
        int iHashCode = (i2 + (omsCard != null ? omsCard.hashCode() : 0)) * 41;
        OmsCardLiterature omsCardLiterature = this.omsCardLiterature;
        int iHashCode2 = (iHashCode + (omsCardLiterature != null ? omsCardLiterature.hashCode() : 0)) * 41;
        OmsCardSound omsCardSound = this.omsCardSound;
        int iHashCode3 = (iHashCode2 + (omsCardSound != null ? omsCardSound.hashCode() : 0)) * 41;
        OmsTagCard omsTagCard = this.tagCard;
        int iHashCode4 = (iHashCode3 + (omsTagCard != null ? omsTagCard.hashCode() : 0)) * 41;
        OmsLiteratureCardGuide omsLiteratureCardGuide = this.literatureCardGuide;
        int iHashCode5 = iHashCode4 + (omsLiteratureCardGuide != null ? omsLiteratureCardGuide.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.omsCard == null) {
            this.omsCard = OmsCard.new_();
        }
        if (this.omsCardLiterature == null) {
            this.omsCardLiterature = OmsCardLiterature.new_();
        }
        if (this.omsCardSound == null) {
            this.omsCardSound = OmsCardSound.new_();
        }
        if (this.tagCard == null) {
            this.tagCard = OmsTagCard.new_();
        }
        if (this.literatureCardGuide == null) {
            this.literatureCardGuide = OmsLiteratureCardGuide.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
