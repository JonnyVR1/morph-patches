package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.NetReportSetting;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NetReportSetting netReportSetting) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, netReportSetting.enableNetReport) + CodedOutputByteBufferNano.m17281h(2, netReportSetting.successRate) + CodedOutputByteBufferNano.m17281h(3, netReportSetting.errorRate);
            NetReportDomains netReportDomains = netReportSetting.domains;
            if (netReportDomains != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(4, netReportDomains, NetReportDomains.PROTOBUF_ADAPTER);
            }
            List<String> list = netReportSetting.reportDomains;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(6, netReportSetting.androidSuccessRate) + CodedOutputByteBufferNano.m17281h(7, netReportSetting.androidErrorRate) + CodedOutputByteBufferNano.m17275b(8, netReportSetting.enableAndroidHttpdnsLogReport) + CodedOutputByteBufferNano.m17281h(9, netReportSetting.androidHttpdnsLogRate);
            netReportSetting.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NetReportSetting parse(nc5 nc5Var) throws IOException {
            NetReportSetting netReportSetting = new NetReportSetting();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (netReportSetting.domains == null) {
                        netReportSetting.domains = NetReportDomains.new_();
                    }
                    if (netReportSetting.reportDomains != null) {
                        break;
                    }
                    netReportSetting.reportDomains = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    netReportSetting.enableNetReport = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    netReportSetting.successRate = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    netReportSetting.errorRate = nc5Var.m162486j();
                } else if (iM162497u == 34) {
                    netReportSetting.domains = (NetReportDomains) nc5Var.m162488l(NetReportDomains.PROTOBUF_ADAPTER);
                } else if (iM162497u == 42) {
                    netReportSetting.reportDomains = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 48) {
                    netReportSetting.androidSuccessRate = nc5Var.m162486j();
                } else if (iM162497u == 56) {
                    netReportSetting.androidErrorRate = nc5Var.m162486j();
                } else if (iM162497u == 64) {
                    netReportSetting.enableAndroidHttpdnsLogReport = nc5Var.m162483g();
                } else {
                    if (iM162497u != 72) {
                        if (netReportSetting.domains == null) {
                            netReportSetting.domains = NetReportDomains.new_();
                        }
                        if (netReportSetting.reportDomains != null) {
                            break;
                        }
                        netReportSetting.reportDomains = new ArrayList();
                        return netReportSetting;
                    }
                    netReportSetting.androidHttpdnsLogRate = nc5Var.m162486j();
                }
            }
            return netReportSetting;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NetReportSetting netReportSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, netReportSetting.enableNetReport);
            codedOutputByteBufferNano.m17305G(2, netReportSetting.successRate);
            codedOutputByteBufferNano.m17305G(3, netReportSetting.errorRate);
            NetReportDomains netReportDomains = netReportSetting.domains;
            if (netReportDomains != null) {
                codedOutputByteBufferNano.m17309K(4, netReportDomains, NetReportDomains.PROTOBUF_ADAPTER);
            }
            List<String> list = netReportSetting.reportDomains;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(6, netReportSetting.androidSuccessRate);
            codedOutputByteBufferNano.m17305G(7, netReportSetting.androidErrorRate);
            codedOutputByteBufferNano.m17299A(8, netReportSetting.enableAndroidHttpdnsLogReport);
            codedOutputByteBufferNano.m17305G(9, netReportSetting.androidHttpdnsLogRate);
        }
    };
    public static JsonAdapter<NetReportSetting> JSON_ADAPTER = new ObjectJsonAdapter<NetReportSetting>() { // from class: com.p1.mobile.putong.data.NetReportSetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NetReportSetting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NetReportSetting newInstance() {
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
                    netReportSetting.domains = NetReportDomains.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NetReportSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NetReportSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61057a(String str) {
        return str;
    }

    public static NetReportSetting new_() {
        NetReportSetting netReportSetting = new NetReportSetting();
        netReportSetting.nullCheck();
        return netReportSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NetReportSetting mo225055clone() {
        NetReportSetting netReportSetting = new NetReportSetting();
        netReportSetting.enableNetReport = this.enableNetReport;
        netReportSetting.successRate = this.successRate;
        netReportSetting.errorRate = this.errorRate;
        NetReportDomains netReportDomains = this.domains;
        if (netReportDomains != null) {
            netReportSetting.domains = netReportDomains.mo225055clone();
        }
        List<String> list = this.reportDomains;
        if (list != null) {
            netReportSetting.reportDomains = ValueObject.util_map(list, new qcj() { // from class: l.pi20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return NetReportSetting.m61057a((String) obj);
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + (this.enableNetReport ? 1231 : 1237)) * 41) + this.successRate) * 41) + this.errorRate) * 41;
        NetReportDomains netReportDomains = this.domains;
        int iHashCode = (i2 + (netReportDomains != null ? netReportDomains.hashCode() : 0)) * 41;
        List<String> list = this.reportDomains;
        int iHashCode2 = ((((((((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.androidSuccessRate) * 41) + this.androidErrorRate) * 41) + (this.enableAndroidHttpdnsLogReport ? 1231 : 1237)) * 41) + this.androidHttpdnsLogRate;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.domains == null) {
            this.domains = NetReportDomains.new_();
        }
        if (this.reportDomains == null) {
            this.reportDomains = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
