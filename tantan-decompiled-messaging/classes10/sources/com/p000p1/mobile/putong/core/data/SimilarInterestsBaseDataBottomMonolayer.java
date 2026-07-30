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
public class SimilarInterestsBaseDataBottomMonolayer extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsbasedatabottommonolayer";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String startColor;
    public static ProtobufAdapter<SimilarInterestsBaseDataBottomMonolayer> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsBaseDataBottomMonolayer>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsBaseDataBottomMonolayer.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer) {
            String str = similarInterestsBaseDataBottomMonolayer.startColor;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = similarInterestsBaseDataBottomMonolayer.endColor;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) similarInterestsBaseDataBottomMonolayer).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsBaseDataBottomMonolayer m15628parse(nb5 nb5Var) throws IOException {
            SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer = new SimilarInterestsBaseDataBottomMonolayer();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (similarInterestsBaseDataBottomMonolayer.startColor == null) {
                        similarInterestsBaseDataBottomMonolayer.startColor = "";
                    }
                    if (similarInterestsBaseDataBottomMonolayer.endColor != null) {
                        break;
                    }
                    similarInterestsBaseDataBottomMonolayer.endColor = "";
                    break;
                }
                if (iU == 10) {
                    similarInterestsBaseDataBottomMonolayer.startColor = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (similarInterestsBaseDataBottomMonolayer.startColor == null) {
                            similarInterestsBaseDataBottomMonolayer.startColor = "";
                        }
                        if (similarInterestsBaseDataBottomMonolayer.endColor != null) {
                            break;
                        }
                        similarInterestsBaseDataBottomMonolayer.endColor = "";
                        return similarInterestsBaseDataBottomMonolayer;
                    }
                    similarInterestsBaseDataBottomMonolayer.endColor = nb5Var.s();
                }
            }
            return similarInterestsBaseDataBottomMonolayer;
        }

        public void serialize(SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = similarInterestsBaseDataBottomMonolayer.startColor;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = similarInterestsBaseDataBottomMonolayer.endColor;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<SimilarInterestsBaseDataBottomMonolayer> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsBaseDataBottomMonolayer>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsBaseDataBottomMonolayer.2
        public Class getDataClass() {
            return SimilarInterestsBaseDataBottomMonolayer.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsBaseDataBottomMonolayer m15629newInstance() {
            return new SimilarInterestsBaseDataBottomMonolayer();
        }

        public boolean parseField(SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("startColor")) {
                similarInterestsBaseDataBottomMonolayer.startColor = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("endColor")) {
                return false;
            }
            similarInterestsBaseDataBottomMonolayer.endColor = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("startColor") || str.equals("endColor")) {
                return true;
            }
            return super.parseFieldCheck(similarInterestsBaseDataBottomMonolayer, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer, JsonGenerator jsonGenerator) throws IOException {
            String str = similarInterestsBaseDataBottomMonolayer.startColor;
            if (str != null) {
                jsonGenerator.writeStringField("startColor", str);
            }
            String str2 = similarInterestsBaseDataBottomMonolayer.endColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("endColor", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsBaseDataBottomMonolayer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsBaseDataBottomMonolayer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsBaseDataBottomMonolayer new_() {
        SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer = new SimilarInterestsBaseDataBottomMonolayer();
        similarInterestsBaseDataBottomMonolayer.nullCheck();
        return similarInterestsBaseDataBottomMonolayer;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimilarInterestsBaseDataBottomMonolayer m15627clone() {
        SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer = new SimilarInterestsBaseDataBottomMonolayer();
        similarInterestsBaseDataBottomMonolayer.startColor = this.startColor;
        similarInterestsBaseDataBottomMonolayer.endColor = this.endColor;
        return similarInterestsBaseDataBottomMonolayer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimilarInterestsBaseDataBottomMonolayer)) {
            return false;
        }
        SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer = (SimilarInterestsBaseDataBottomMonolayer) obj;
        return ValueObject.util_equals(this.startColor, similarInterestsBaseDataBottomMonolayer.startColor) && ValueObject.util_equals(this.endColor, similarInterestsBaseDataBottomMonolayer.endColor);
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
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
