package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class SimilarInterestsBaseDataBottomMonolayer extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsbasedatabottommonolayer";

    @NonNull
    @ProtobufIndex(index = 2)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String startColor;
    public static ProtobufAdapter<SimilarInterestsBaseDataBottomMonolayer> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsBaseDataBottomMonolayer>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsBaseDataBottomMonolayer.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer) {
            String str = similarInterestsBaseDataBottomMonolayer.startColor;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = similarInterestsBaseDataBottomMonolayer.endColor;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            similarInterestsBaseDataBottomMonolayer.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SimilarInterestsBaseDataBottomMonolayer parse(nb5 nb5Var) throws IOException {
            SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer = new SimilarInterestsBaseDataBottomMonolayer();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (similarInterestsBaseDataBottomMonolayer.startColor == null) {
                        similarInterestsBaseDataBottomMonolayer.startColor = "";
                    }
                    if (similarInterestsBaseDataBottomMonolayer.endColor != null) {
                        break;
                    }
                    similarInterestsBaseDataBottomMonolayer.endColor = "";
                    break;
                }
                if (iM158752u == 10) {
                    similarInterestsBaseDataBottomMonolayer.startColor = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (similarInterestsBaseDataBottomMonolayer.startColor == null) {
                            similarInterestsBaseDataBottomMonolayer.startColor = "";
                        }
                        if (similarInterestsBaseDataBottomMonolayer.endColor != null) {
                            break;
                        }
                        similarInterestsBaseDataBottomMonolayer.endColor = "";
                        return similarInterestsBaseDataBottomMonolayer;
                    }
                    similarInterestsBaseDataBottomMonolayer.endColor = nb5Var.m158750s();
                }
            }
            return similarInterestsBaseDataBottomMonolayer;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = similarInterestsBaseDataBottomMonolayer.startColor;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = similarInterestsBaseDataBottomMonolayer.endColor;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<SimilarInterestsBaseDataBottomMonolayer> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsBaseDataBottomMonolayer>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsBaseDataBottomMonolayer.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SimilarInterestsBaseDataBottomMonolayer.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SimilarInterestsBaseDataBottomMonolayer newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsBaseDataBottomMonolayer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsBaseDataBottomMonolayer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsBaseDataBottomMonolayer new_() {
        SimilarInterestsBaseDataBottomMonolayer similarInterestsBaseDataBottomMonolayer = new SimilarInterestsBaseDataBottomMonolayer();
        similarInterestsBaseDataBottomMonolayer.nullCheck();
        return similarInterestsBaseDataBottomMonolayer;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SimilarInterestsBaseDataBottomMonolayer mo223809clone() {
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
        String str = this.startColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.endColor;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
