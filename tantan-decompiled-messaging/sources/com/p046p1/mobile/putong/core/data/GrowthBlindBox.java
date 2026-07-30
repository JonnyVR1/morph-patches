package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
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
public class GrowthBlindBox extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthblindbox";

    @ProtobufIndex(index = 1)
    public boolean isOpen;

    @ProtobufIndex(index = 2)
    public double latestTime;

    @NonNull
    @ProtobufIndex(index = 3)
    public GrowthBlindBoxInfo view;
    public static ProtobufAdapter<GrowthBlindBox> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthBlindBox>() { // from class: com.p1.mobile.putong.core.data.GrowthBlindBox.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GrowthBlindBox growthBlindBox) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, growthBlindBox.isOpen) + CodedOutputByteBufferNano.m17222d(2, growthBlindBox.latestTime);
            GrowthBlindBoxInfo growthBlindBoxInfo = growthBlindBox.view;
            if (growthBlindBoxInfo != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(3, growthBlindBoxInfo, GrowthBlindBoxInfo.PROTOBUF_ADAPTER);
            }
            growthBlindBox.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GrowthBlindBox parse(nb5 nb5Var) throws IOException {
            GrowthBlindBox growthBlindBox = new GrowthBlindBox();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (growthBlindBox.view != null) {
                        break;
                    }
                    growthBlindBox.view = GrowthBlindBoxInfo.new_();
                    break;
                }
                if (iM158752u == 8) {
                    growthBlindBox.isOpen = nb5Var.m158738g();
                } else if (iM158752u == 17) {
                    growthBlindBox.latestTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 26) {
                        if (growthBlindBox.view != null) {
                            break;
                        }
                        growthBlindBox.view = GrowthBlindBoxInfo.new_();
                        return growthBlindBox;
                    }
                    growthBlindBox.view = (GrowthBlindBoxInfo) nb5Var.m158743l(GrowthBlindBoxInfo.PROTOBUF_ADAPTER);
                }
            }
            return growthBlindBox;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GrowthBlindBox growthBlindBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, growthBlindBox.isOpen);
            codedOutputByteBufferNano.m17246C(2, growthBlindBox.latestTime);
            GrowthBlindBoxInfo growthBlindBoxInfo = growthBlindBox.view;
            if (growthBlindBoxInfo != null) {
                codedOutputByteBufferNano.m17254K(3, growthBlindBoxInfo, GrowthBlindBoxInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GrowthBlindBox> JSON_ADAPTER = new ObjectJsonAdapter<GrowthBlindBox>() { // from class: com.p1.mobile.putong.core.data.GrowthBlindBox.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GrowthBlindBox.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GrowthBlindBox newInstance() {
            return new GrowthBlindBox();
        }

        public boolean parseField(GrowthBlindBox growthBlindBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isOpen":
                    growthBlindBox.isOpen = jsonParser.getValueAsBoolean();
                    return true;
                case "latestTime":
                    growthBlindBox.latestTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "view":
                    growthBlindBox.view = GrowthBlindBoxInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GrowthBlindBox growthBlindBox, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOpen", growthBlindBox.isOpen);
            jsonGenerator.writeFieldName("latestTime");
            Converter.API_TIME.serialize(Double.valueOf(growthBlindBox.latestTime), jsonGenerator, true);
            if (growthBlindBox.view != null) {
                jsonGenerator.writeFieldName(OMSTemplateModeType.view);
                GrowthBlindBoxInfo.JSON_ADAPTER.serialize(growthBlindBox.view, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthBlindBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthBlindBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthBlindBox new_() {
        GrowthBlindBox growthBlindBox = new GrowthBlindBox();
        growthBlindBox.nullCheck();
        return growthBlindBox;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GrowthBlindBox mo223809clone() {
        GrowthBlindBox growthBlindBox = new GrowthBlindBox();
        growthBlindBox.isOpen = this.isOpen;
        growthBlindBox.latestTime = this.latestTime;
        GrowthBlindBoxInfo growthBlindBoxInfo = this.view;
        if (growthBlindBoxInfo != null) {
            growthBlindBox.view = growthBlindBoxInfo.mo223809clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.isOpen ? 1231 : 1237);
        long jDoubleToLongBits = Double.doubleToLongBits(this.latestTime);
        int i3 = ((i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        GrowthBlindBoxInfo growthBlindBoxInfo = this.view;
        int iHashCode = i3 + (growthBlindBoxInfo != null ? growthBlindBoxInfo.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.view == null) {
            this.view = GrowthBlindBoxInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
