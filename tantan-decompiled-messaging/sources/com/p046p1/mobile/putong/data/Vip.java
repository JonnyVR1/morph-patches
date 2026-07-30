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
public class Vip extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "vip";

    @ProtobufIndex(index = 2)
    public double beginTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String campaignName;

    @NonNull
    @ProtobufIndex(index = 4)
    public String defaultCampaignName;

    @ProtobufIndex(index = 3)
    public double endTime;
    public static ProtobufAdapter<Vip> PROTOBUF_ADAPTER = new MessageNanoAdapter<Vip>() { // from class: com.p1.mobile.putong.data.Vip.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Vip vip) {
            String str = vip.campaignName;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17222d(2, vip.beginTime) + CodedOutputByteBufferNano.m17222d(3, vip.endTime);
            String str2 = vip.defaultCampaignName;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            vip.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Vip parse(nb5 nb5Var) throws IOException {
            Vip vip = new Vip();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (vip.campaignName == null) {
                        vip.campaignName = "";
                    }
                    if (vip.defaultCampaignName != null) {
                        break;
                    }
                    vip.defaultCampaignName = "";
                    break;
                }
                if (iM158752u == 10) {
                    vip.campaignName = nb5Var.m158750s();
                } else if (iM158752u == 17) {
                    vip.beginTime = nb5Var.m158739h();
                } else if (iM158752u == 25) {
                    vip.endTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 34) {
                        if (vip.campaignName == null) {
                            vip.campaignName = "";
                        }
                        if (vip.defaultCampaignName != null) {
                            break;
                        }
                        vip.defaultCampaignName = "";
                        return vip;
                    }
                    vip.defaultCampaignName = nb5Var.m158750s();
                }
            }
            return vip;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Vip vip, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = vip.campaignName;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17246C(2, vip.beginTime);
            codedOutputByteBufferNano.m17246C(3, vip.endTime);
            String str2 = vip.defaultCampaignName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
        }
    };
    public static JsonAdapter<Vip> JSON_ADAPTER = new ObjectJsonAdapter<Vip>() { // from class: com.p1.mobile.putong.data.Vip.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Vip.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Vip newInstance() {
            return new Vip();
        }

        public boolean parseField(Vip vip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "endTime":
                    vip.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "beginTime":
                    vip.beginTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "defaultCampaignName":
                    vip.defaultCampaignName = jsonParser.getValueAsString();
                    return true;
                case "campaignName":
                    vip.campaignName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Vip vip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "endTime":
                case "beginTime":
                case "defaultCampaignName":
                case "campaignName":
                    return true;
                default:
                    return super.parseFieldCheck(vip, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Vip vip, JsonGenerator jsonGenerator) throws IOException {
            String str = vip.campaignName;
            if (str != null) {
                jsonGenerator.writeStringField("campaignName", str);
            }
            jsonGenerator.writeFieldName("beginTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(vip.beginTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(vip.endTime), jsonGenerator, true);
            String str2 = vip.defaultCampaignName;
            if (str2 != null) {
                jsonGenerator.writeStringField("defaultCampaignName", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Vip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Vip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Vip new_() {
        Vip vip = new Vip();
        vip.nullCheck();
        return vip;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Vip mo223809clone() {
        Vip vip = new Vip();
        vip.campaignName = this.campaignName;
        vip.beginTime = this.beginTime;
        vip.endTime = this.endTime;
        vip.defaultCampaignName = this.defaultCampaignName;
        return vip;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Vip)) {
            return false;
        }
        Vip vip = (Vip) obj;
        return ValueObject.util_equals(this.campaignName, vip.campaignName) && this.beginTime == vip.beginTime && this.endTime == vip.endTime && ValueObject.util_equals(this.defaultCampaignName, vip.defaultCampaignName);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "vip";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.campaignName;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.beginTime);
        int i3 = ((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.endTime);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        String str2 = this.defaultCampaignName;
        int iHashCode2 = i4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.campaignName == null) {
            this.campaignName = "";
        }
        if (this.defaultCampaignName == null) {
            this.defaultCampaignName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
