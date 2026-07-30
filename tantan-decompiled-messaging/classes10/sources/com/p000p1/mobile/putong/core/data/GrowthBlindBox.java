package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class GrowthBlindBox extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthblindbox";

    @ProtobufIndex(index = 1)
    public boolean isOpen;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double latestTime;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public GrowthBlindBoxInfo view;
    public static ProtobufAdapter<GrowthBlindBox> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthBlindBox>() { // from class: com.p1.mobile.putong.core.data.GrowthBlindBox.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GrowthBlindBox growthBlindBox) {
            int iB = CodedOutputByteBufferNano.b(1, growthBlindBox.isOpen) + CodedOutputByteBufferNano.d(2, growthBlindBox.latestTime);
            GrowthBlindBoxInfo growthBlindBoxInfo = growthBlindBox.view;
            if (growthBlindBoxInfo != null) {
                iB += CodedOutputByteBufferNano.l(3, growthBlindBoxInfo, GrowthBlindBoxInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) growthBlindBox).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GrowthBlindBox m13119parse(nb5 nb5Var) throws IOException {
            GrowthBlindBox growthBlindBox = new GrowthBlindBox();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (growthBlindBox.view != null) {
                        break;
                    }
                    growthBlindBox.view = GrowthBlindBoxInfo.new_();
                    break;
                }
                if (iU == 8) {
                    growthBlindBox.isOpen = nb5Var.g();
                } else if (iU == 17) {
                    growthBlindBox.latestTime = nb5Var.h();
                } else {
                    if (iU != 26) {
                        if (growthBlindBox.view != null) {
                            break;
                        }
                        growthBlindBox.view = GrowthBlindBoxInfo.new_();
                        return growthBlindBox;
                    }
                    growthBlindBox.view = (GrowthBlindBoxInfo) nb5Var.l(GrowthBlindBoxInfo.PROTOBUF_ADAPTER);
                }
            }
            return growthBlindBox;
        }

        public void serialize(GrowthBlindBox growthBlindBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, growthBlindBox.isOpen);
            codedOutputByteBufferNano.C(2, growthBlindBox.latestTime);
            GrowthBlindBoxInfo growthBlindBoxInfo = growthBlindBox.view;
            if (growthBlindBoxInfo != null) {
                codedOutputByteBufferNano.K(3, growthBlindBoxInfo, GrowthBlindBoxInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GrowthBlindBox> JSON_ADAPTER = new ObjectJsonAdapter<GrowthBlindBox>() { // from class: com.p1.mobile.putong.core.data.GrowthBlindBox.2
        public Class getDataClass() {
            return GrowthBlindBox.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GrowthBlindBox m13120newInstance() {
            return new GrowthBlindBox();
        }

        public boolean parseField(GrowthBlindBox growthBlindBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isOpen":
                    growthBlindBox.isOpen = jsonParser.getValueAsBoolean();
                    return true;
                case "latestTime":
                    growthBlindBox.latestTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "view":
                    growthBlindBox.view = (GrowthBlindBoxInfo) GrowthBlindBoxInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GrowthBlindBox growthBlindBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isOpen":
                case "latestTime":
                case "view":
                    return true;
                default:
                    return super.parseFieldCheck(growthBlindBox, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GrowthBlindBox growthBlindBox, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOpen", growthBlindBox.isOpen);
            jsonGenerator.writeFieldName("latestTime");
            Converter.API_TIME.serialize(Double.valueOf(growthBlindBox.latestTime), jsonGenerator, true);
            if (growthBlindBox.view != null) {
                jsonGenerator.writeFieldName("view");
                GrowthBlindBoxInfo.JSON_ADAPTER.serialize(growthBlindBox.view, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthBlindBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthBlindBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthBlindBox new_() {
        GrowthBlindBox growthBlindBox = new GrowthBlindBox();
        growthBlindBox.nullCheck();
        return growthBlindBox;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GrowthBlindBox m13118clone() {
        GrowthBlindBox growthBlindBox = new GrowthBlindBox();
        growthBlindBox.isOpen = this.isOpen;
        growthBlindBox.latestTime = this.latestTime;
        GrowthBlindBoxInfo growthBlindBoxInfo = this.view;
        if (growthBlindBoxInfo != null) {
            growthBlindBox.view = growthBlindBoxInfo.m13122clone();
        }
        return growthBlindBox;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GrowthBlindBox)) {
            return false;
        }
        GrowthBlindBox growthBlindBox = (GrowthBlindBox) obj;
        return this.isOpen == growthBlindBox.isOpen && this.latestTime == growthBlindBox.latestTime && ValueObject.util_equals(this.view, growthBlindBox.view);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.isOpen ? 1231 : 1237);
        long jDoubleToLongBits = Double.doubleToLongBits(this.latestTime);
        int i3 = ((i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        GrowthBlindBoxInfo growthBlindBoxInfo = this.view;
        int iHashCode = i3 + (growthBlindBoxInfo != null ? growthBlindBoxInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.view == null) {
            this.view = GrowthBlindBoxInfo.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
