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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSAdCardContent oMSAdCardContent) {
            OmsCard omsCard = oMSAdCardContent.omsCard;
            int iL = omsCard != null ? CodedOutputByteBufferNano.l(1, omsCard, OmsCard.PROTOBUF_ADAPTER) : 0;
            OmsCardLiterature omsCardLiterature = oMSAdCardContent.omsCardLiterature;
            if (omsCardLiterature != null) {
                iL += CodedOutputByteBufferNano.l(2, omsCardLiterature, OmsCardLiterature.PROTOBUF_ADAPTER);
            }
            OmsCardSound omsCardSound = oMSAdCardContent.omsCardSound;
            if (omsCardSound != null) {
                iL += CodedOutputByteBufferNano.l(3, omsCardSound, OmsCardSound.PROTOBUF_ADAPTER);
            }
            OmsTagCard omsTagCard = oMSAdCardContent.tagCard;
            if (omsTagCard != null) {
                iL += CodedOutputByteBufferNano.l(4, omsTagCard, OmsTagCard.PROTOBUF_ADAPTER);
            }
            OmsLiteratureCardGuide omsLiteratureCardGuide = oMSAdCardContent.literatureCardGuide;
            if (omsLiteratureCardGuide != null) {
                iL += CodedOutputByteBufferNano.l(5, omsLiteratureCardGuide, OmsLiteratureCardGuide.PROTOBUF_ADAPTER);
            }
            ((MessageNano) oMSAdCardContent).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSAdCardContent m18570parse(nb5 nb5Var) throws IOException {
            OMSAdCardContent oMSAdCardContent = new OMSAdCardContent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    oMSAdCardContent.omsCard = (OmsCard) nb5Var.l(OmsCard.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    oMSAdCardContent.omsCardLiterature = (OmsCardLiterature) nb5Var.l(OmsCardLiterature.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    oMSAdCardContent.omsCardSound = (OmsCardSound) nb5Var.l(OmsCardSound.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    oMSAdCardContent.tagCard = (OmsTagCard) nb5Var.l(OmsTagCard.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
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
                    oMSAdCardContent.literatureCardGuide = (OmsLiteratureCardGuide) nb5Var.l(OmsLiteratureCardGuide.PROTOBUF_ADAPTER);
                }
            }
            return oMSAdCardContent;
        }

        public void serialize(OMSAdCardContent oMSAdCardContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OmsCard omsCard = oMSAdCardContent.omsCard;
            if (omsCard != null) {
                codedOutputByteBufferNano.K(1, omsCard, OmsCard.PROTOBUF_ADAPTER);
            }
            OmsCardLiterature omsCardLiterature = oMSAdCardContent.omsCardLiterature;
            if (omsCardLiterature != null) {
                codedOutputByteBufferNano.K(2, omsCardLiterature, OmsCardLiterature.PROTOBUF_ADAPTER);
            }
            OmsCardSound omsCardSound = oMSAdCardContent.omsCardSound;
            if (omsCardSound != null) {
                codedOutputByteBufferNano.K(3, omsCardSound, OmsCardSound.PROTOBUF_ADAPTER);
            }
            OmsTagCard omsTagCard = oMSAdCardContent.tagCard;
            if (omsTagCard != null) {
                codedOutputByteBufferNano.K(4, omsTagCard, OmsTagCard.PROTOBUF_ADAPTER);
            }
            OmsLiteratureCardGuide omsLiteratureCardGuide = oMSAdCardContent.literatureCardGuide;
            if (omsLiteratureCardGuide != null) {
                codedOutputByteBufferNano.K(5, omsLiteratureCardGuide, OmsLiteratureCardGuide.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSAdCardContent> JSON_ADAPTER = new ObjectJsonAdapter<OMSAdCardContent>() { // from class: com.p1.mobile.putong.data.OMSAdCardContent.2
        public Class getDataClass() {
            return OMSAdCardContent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSAdCardContent mo17830newInstance() {
            return new OMSAdCardContent();
        }

        public boolean parseField(OMSAdCardContent oMSAdCardContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "omsCardLiterature":
                    oMSAdCardContent.omsCardLiterature = (OmsCardLiterature) OmsCardLiterature.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "tagCard":
                    oMSAdCardContent.tagCard = (OmsTagCard) OmsTagCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "omsCard":
                    oMSAdCardContent.omsCard = (OmsCard) OmsCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "omsCardSound":
                    oMSAdCardContent.omsCardSound = (OmsCardSound) OmsCardSound.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "literatureCardGuide":
                    oMSAdCardContent.literatureCardGuide = (OmsLiteratureCardGuide) OmsLiteratureCardGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSAdCardContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSAdCardContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSAdCardContent new_() {
        OMSAdCardContent oMSAdCardContent = new OMSAdCardContent();
        oMSAdCardContent.nullCheck();
        return oMSAdCardContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSAdCardContent m18569clone() {
        OMSAdCardContent oMSAdCardContent = new OMSAdCardContent();
        OmsCard omsCard = this.omsCard;
        if (omsCard != null) {
            oMSAdCardContent.omsCard = omsCard.m18704clone();
        }
        OmsCardLiterature omsCardLiterature = this.omsCardLiterature;
        if (omsCardLiterature != null) {
            oMSAdCardContent.omsCardLiterature = omsCardLiterature.m18707clone();
        }
        OmsCardSound omsCardSound = this.omsCardSound;
        if (omsCardSound != null) {
            oMSAdCardContent.omsCardSound = omsCardSound.m18710clone();
        }
        OmsTagCard omsTagCard = this.tagCard;
        if (omsTagCard != null) {
            oMSAdCardContent.tagCard = omsTagCard.m18731clone();
        }
        OmsLiteratureCardGuide omsLiteratureCardGuide = this.literatureCardGuide;
        if (omsLiteratureCardGuide != null) {
            oMSAdCardContent.literatureCardGuide = omsLiteratureCardGuide.m18719clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
