package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.NetReportSetting;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NetReportSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "netreportsetting";

    @ProtobufIndex(index = 7)
    public int androidErrorRate;

    @ProtobufIndex(index = 9)
    public int androidHttpdnsLogRate;

    @ProtobufIndex(index = 6)
    public int androidSuccessRate;

    @NonNull
    @ProtobufIndex(index = 4)
    public NetReportDomains domains;

    @ProtobufIndex(index = 8)
    public boolean enableAndroidHttpdnsLogReport;

    @ProtobufIndex(index = 1)
    public boolean enableNetReport;

    @ProtobufIndex(index = 3)
    public int errorRate;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> reportDomains;

    @ProtobufIndex(index = 2)
    public int successRate;
    public static ProtobufAdapter<NetReportSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<NetReportSetting>() { // from class: com.p1.mobile.putong.data.NetReportSetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NetReportSetting netReportSetting) {
            int iB = CodedOutputByteBufferNano.b(1, netReportSetting.enableNetReport) + CodedOutputByteBufferNano.h(2, netReportSetting.successRate) + CodedOutputByteBufferNano.h(3, netReportSetting.errorRate);
            NetReportDomains netReportDomains = netReportSetting.domains;
            if (netReportDomains != null) {
                iB += CodedOutputByteBufferNano.l(4, netReportDomains, NetReportDomains.PROTOBUF_ADAPTER);
            }
            List<String> list = netReportSetting.reportDomains;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iB + CodedOutputByteBufferNano.h(6, netReportSetting.androidSuccessRate) + CodedOutputByteBufferNano.h(7, netReportSetting.androidErrorRate) + CodedOutputByteBufferNano.b(8, netReportSetting.enableAndroidHttpdnsLogReport) + CodedOutputByteBufferNano.h(9, netReportSetting.androidHttpdnsLogRate);
            ((MessageNano) netReportSetting).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NetReportSetting m18537parse(nb5 nb5Var) throws IOException {
            NetReportSetting netReportSetting = new NetReportSetting();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (netReportSetting.domains == null) {
                        netReportSetting.domains = NetReportDomains.new_();
                    }
                    if (netReportSetting.reportDomains != null) {
                        break;
                    }
                    netReportSetting.reportDomains = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    netReportSetting.enableNetReport = nb5Var.g();
                } else if (iU == 16) {
                    netReportSetting.successRate = nb5Var.j();
                } else if (iU == 24) {
                    netReportSetting.errorRate = nb5Var.j();
                } else if (iU == 34) {
                    netReportSetting.domains = (NetReportDomains) nb5Var.l(NetReportDomains.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    netReportSetting.reportDomains = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 48) {
                    netReportSetting.androidSuccessRate = nb5Var.j();
                } else if (iU == 56) {
                    netReportSetting.androidErrorRate = nb5Var.j();
                } else if (iU == 64) {
                    netReportSetting.enableAndroidHttpdnsLogReport = nb5Var.g();
                } else {
                    if (iU != 72) {
                        if (netReportSetting.domains == null) {
                            netReportSetting.domains = NetReportDomains.new_();
                        }
                        if (netReportSetting.reportDomains != null) {
                            break;
                        }
                        netReportSetting.reportDomains = new ArrayList();
                        return netReportSetting;
                    }
                    netReportSetting.androidHttpdnsLogRate = nb5Var.j();
                }
            }
            return netReportSetting;
        }

        public void serialize(NetReportSetting netReportSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, netReportSetting.enableNetReport);
            codedOutputByteBufferNano.G(2, netReportSetting.successRate);
            codedOutputByteBufferNano.G(3, netReportSetting.errorRate);
            NetReportDomains netReportDomains = netReportSetting.domains;
            if (netReportDomains != null) {
                codedOutputByteBufferNano.K(4, netReportDomains, NetReportDomains.PROTOBUF_ADAPTER);
            }
            List<String> list = netReportSetting.reportDomains;
            if (list != null) {
                codedOutputByteBufferNano.K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(6, netReportSetting.androidSuccessRate);
            codedOutputByteBufferNano.G(7, netReportSetting.androidErrorRate);
            codedOutputByteBufferNano.A(8, netReportSetting.enableAndroidHttpdnsLogReport);
            codedOutputByteBufferNano.G(9, netReportSetting.androidHttpdnsLogRate);
        }
    };
    public static JsonAdapter<NetReportSetting> JSON_ADAPTER = new ObjectJsonAdapter<NetReportSetting>() { // from class: com.p1.mobile.putong.data.NetReportSetting.2
        public Class getDataClass() {
            return NetReportSetting.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NetReportSetting mo17830newInstance() {
            return new NetReportSetting();
        }

        public boolean parseField(NetReportSetting netReportSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "successRate":
                    netReportSetting.successRate = jsonParser.getValueAsInt();
                    return true;
                case "enableNetReport":
                    netReportSetting.enableNetReport = jsonParser.getValueAsBoolean();
                    return true;
                case "androidErrorRate":
                    netReportSetting.androidErrorRate = jsonParser.getValueAsInt();
                    return true;
                case "enableAndroidHttpdnsLogReport":
                    netReportSetting.enableAndroidHttpdnsLogReport = jsonParser.getValueAsBoolean();
                    return true;
                case "errorRate":
                    netReportSetting.errorRate = jsonParser.getValueAsInt();
                    return true;
                case "androidSuccessRate":
                    netReportSetting.androidSuccessRate = jsonParser.getValueAsInt();
                    return true;
                case "reportDomains":
                    netReportSetting.reportDomains = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "androidHttpdnsLogRate":
                    netReportSetting.androidHttpdnsLogRate = jsonParser.getValueAsInt();
                    return true;
                case "domains":
                    netReportSetting.domains = (NetReportDomains) NetReportDomains.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NetReportSetting netReportSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "successRate":
                case "enableNetReport":
                case "androidErrorRate":
                case "enableAndroidHttpdnsLogReport":
                case "errorRate":
                case "androidSuccessRate":
                case "reportDomains":
                case "androidHttpdnsLogRate":
                case "domains":
                    return true;
                default:
                    return super.parseFieldCheck(netReportSetting, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NetReportSetting netReportSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enableNetReport", netReportSetting.enableNetReport);
            jsonGenerator.writeNumberField("successRate", netReportSetting.successRate);
            jsonGenerator.writeNumberField("errorRate", netReportSetting.errorRate);
            if (netReportSetting.domains != null) {
                jsonGenerator.writeFieldName("domains");
                NetReportDomains.JSON_ADAPTER.serialize(netReportSetting.domains, jsonGenerator, true);
            }
            if (netReportSetting.reportDomains != null) {
                jsonGenerator.writeFieldName("reportDomains");
                JsonAdapter.serializeArray(netReportSetting.reportDomains, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("androidSuccessRate", netReportSetting.androidSuccessRate);
            jsonGenerator.writeNumberField("androidErrorRate", netReportSetting.androidErrorRate);
            jsonGenerator.writeBooleanField("enableAndroidHttpdnsLogReport", netReportSetting.enableAndroidHttpdnsLogReport);
            jsonGenerator.writeNumberField("androidHttpdnsLogRate", netReportSetting.androidHttpdnsLogRate);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NetReportSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NetReportSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m791a(String str) {
        return str;
    }

    public static NetReportSetting new_() {
        NetReportSetting netReportSetting = new NetReportSetting();
        netReportSetting.nullCheck();
        return netReportSetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NetReportSetting m18536clone() {
        NetReportSetting netReportSetting = new NetReportSetting();
        netReportSetting.enableNetReport = this.enableNetReport;
        netReportSetting.successRate = this.successRate;
        netReportSetting.errorRate = this.errorRate;
        NetReportDomains netReportDomains = this.domains;
        if (netReportDomains != null) {
            netReportSetting.domains = netReportDomains.m18533clone();
        }
        List<String> list = this.reportDomains;
        if (list != null) {
            netReportSetting.reportDomains = ValueObject.util_map(list, new w9j() { // from class: l.ha20
                public final Object call(Object obj) {
                    return NetReportSetting.m791a((String) obj);
                }
            });
        }
        netReportSetting.androidSuccessRate = this.androidSuccessRate;
        netReportSetting.androidErrorRate = this.androidErrorRate;
        netReportSetting.enableAndroidHttpdnsLogReport = this.enableAndroidHttpdnsLogReport;
        netReportSetting.androidHttpdnsLogRate = this.androidHttpdnsLogRate;
        return netReportSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetReportSetting)) {
            return false;
        }
        NetReportSetting netReportSetting = (NetReportSetting) obj;
        return this.enableNetReport == netReportSetting.enableNetReport && this.successRate == netReportSetting.successRate && this.errorRate == netReportSetting.errorRate && ValueObject.util_equals(this.domains, netReportSetting.domains) && ValueObject.util_equals(this.reportDomains, netReportSetting.reportDomains) && this.androidSuccessRate == netReportSetting.androidSuccessRate && this.androidErrorRate == netReportSetting.androidErrorRate && this.enableAndroidHttpdnsLogReport == netReportSetting.enableAndroidHttpdnsLogReport && this.androidHttpdnsLogRate == netReportSetting.androidHttpdnsLogRate;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + (this.enableNetReport ? 1231 : 1237)) * 41) + this.successRate) * 41) + this.errorRate) * 41;
        NetReportDomains netReportDomains = this.domains;
        int iHashCode = (i2 + (netReportDomains != null ? netReportDomains.hashCode() : 0)) * 41;
        List<String> list = this.reportDomains;
        int iHashCode2 = ((((((((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.androidSuccessRate) * 41) + this.androidErrorRate) * 41) + (this.enableAndroidHttpdnsLogReport ? 1231 : 1237)) * 41) + this.androidHttpdnsLogRate;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.domains == null) {
            this.domains = NetReportDomains.new_();
        }
        if (this.reportDomains == null) {
            this.reportDomains = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
