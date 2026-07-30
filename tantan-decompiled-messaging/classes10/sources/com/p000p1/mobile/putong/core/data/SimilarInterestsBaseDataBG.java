package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class SimilarInterestsBaseDataBG extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsbasedatabg";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String img;

    @NonNull
    @ProtobufIndex(index = 1)
    public String startColor;
    public static ProtobufAdapter<SimilarInterestsBaseDataBG> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsBaseDataBG>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsBaseDataBG.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SimilarInterestsBaseDataBG similarInterestsBaseDataBG) {
            String str = similarInterestsBaseDataBG.startColor;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = similarInterestsBaseDataBG.endColor;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = similarInterestsBaseDataBG.img;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) similarInterestsBaseDataBG).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsBaseDataBG m15624parse(nb5 nb5Var) throws IOException {
            SimilarInterestsBaseDataBG similarInterestsBaseDataBG = new SimilarInterestsBaseDataBG();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (similarInterestsBaseDataBG.startColor == null) {
                        similarInterestsBaseDataBG.startColor = "";
                    }
                    if (similarInterestsBaseDataBG.endColor == null) {
                        similarInterestsBaseDataBG.endColor = "";
                    }
                    if (similarInterestsBaseDataBG.img != null) {
                        break;
                    }
                    similarInterestsBaseDataBG.img = "";
                    break;
                }
                if (iU == 10) {
                    similarInterestsBaseDataBG.startColor = nb5Var.s();
                } else if (iU == 18) {
                    similarInterestsBaseDataBG.endColor = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (similarInterestsBaseDataBG.startColor == null) {
                            similarInterestsBaseDataBG.startColor = "";
                        }
                        if (similarInterestsBaseDataBG.endColor == null) {
                            similarInterestsBaseDataBG.endColor = "";
                        }
                        if (similarInterestsBaseDataBG.img != null) {
                            break;
                        }
                        similarInterestsBaseDataBG.img = "";
                        return similarInterestsBaseDataBG;
                    }
                    similarInterestsBaseDataBG.img = nb5Var.s();
                }
            }
            return similarInterestsBaseDataBG;
        }

        public void serialize(SimilarInterestsBaseDataBG similarInterestsBaseDataBG, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = similarInterestsBaseDataBG.startColor;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = similarInterestsBaseDataBG.endColor;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = similarInterestsBaseDataBG.img;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<SimilarInterestsBaseDataBG> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsBaseDataBG>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsBaseDataBG.2
        public Class getDataClass() {
            return SimilarInterestsBaseDataBG.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsBaseDataBG m15625newInstance() {
            return new SimilarInterestsBaseDataBG();
        }

        public boolean parseField(SimilarInterestsBaseDataBG similarInterestsBaseDataBG, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startColor":
                    similarInterestsBaseDataBG.startColor = jsonParser.getValueAsString();
                    return true;
                case "img":
                    similarInterestsBaseDataBG.img = jsonParser.getValueAsString();
                    return true;
                case "endColor":
                    similarInterestsBaseDataBG.endColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SimilarInterestsBaseDataBG similarInterestsBaseDataBG, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startColor":
                case "img":
                case "endColor":
                    return true;
                default:
                    return super.parseFieldCheck(similarInterestsBaseDataBG, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SimilarInterestsBaseDataBG similarInterestsBaseDataBG, JsonGenerator jsonGenerator) throws IOException {
            String str = similarInterestsBaseDataBG.startColor;
            if (str != null) {
                jsonGenerator.writeStringField("startColor", str);
            }
            String str2 = similarInterestsBaseDataBG.endColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("endColor", str2);
            }
            String str3 = similarInterestsBaseDataBG.img;
            if (str3 != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.img, str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsBaseDataBG) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsBaseDataBG) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsBaseDataBG new_() {
        SimilarInterestsBaseDataBG similarInterestsBaseDataBG = new SimilarInterestsBaseDataBG();
        similarInterestsBaseDataBG.nullCheck();
        return similarInterestsBaseDataBG;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimilarInterestsBaseDataBG m15623clone() {
        SimilarInterestsBaseDataBG similarInterestsBaseDataBG = new SimilarInterestsBaseDataBG();
        similarInterestsBaseDataBG.startColor = this.startColor;
        similarInterestsBaseDataBG.endColor = this.endColor;
        similarInterestsBaseDataBG.img = this.img;
        return similarInterestsBaseDataBG;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimilarInterestsBaseDataBG)) {
            return false;
        }
        SimilarInterestsBaseDataBG similarInterestsBaseDataBG = (SimilarInterestsBaseDataBG) obj;
        return ValueObject.util_equals(this.startColor, similarInterestsBaseDataBG.startColor) && ValueObject.util_equals(this.endColor, similarInterestsBaseDataBG.endColor) && ValueObject.util_equals(this.img, similarInterestsBaseDataBG.img);
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
        String str = this.startColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.endColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.img;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
        if (this.img == null) {
            this.img = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
