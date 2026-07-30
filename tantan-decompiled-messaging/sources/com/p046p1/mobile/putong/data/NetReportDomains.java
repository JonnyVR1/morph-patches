package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.NetReportDomains;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class NetReportDomains extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "netreportdomains";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> api;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> media;
    public static ProtobufAdapter<NetReportDomains> PROTOBUF_ADAPTER = new MessageNanoAdapter<NetReportDomains>() { // from class: com.p1.mobile.putong.data.NetReportDomains.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NetReportDomains netReportDomains) {
            List<String> list = netReportDomains.media;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = netReportDomains.api;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            netReportDomains.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NetReportDomains parse(nb5 nb5Var) throws IOException {
            NetReportDomains netReportDomains = new NetReportDomains();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (netReportDomains.media == null) {
                        netReportDomains.media = new ArrayList();
                    }
                    if (netReportDomains.api != null) {
                        break;
                    }
                    netReportDomains.api = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    netReportDomains.media = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (netReportDomains.media == null) {
                            netReportDomains.media = new ArrayList();
                        }
                        if (netReportDomains.api != null) {
                            break;
                        }
                        netReportDomains.api = new ArrayList();
                        return netReportDomains;
                    }
                    netReportDomains.api = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return netReportDomains;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NetReportDomains netReportDomains, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = netReportDomains.media;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = netReportDomains.api;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<NetReportDomains> JSON_ADAPTER = new ObjectJsonAdapter<NetReportDomains>() { // from class: com.p1.mobile.putong.data.NetReportDomains.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NetReportDomains.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NetReportDomains newInstance() {
            return new NetReportDomains();
        }

        public boolean parseField(NetReportDomains netReportDomains, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("api")) {
                netReportDomains.api = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("media")) {
                return false;
            }
            netReportDomains.media = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NetReportDomains netReportDomains, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("api") || str.equals("media")) {
                return true;
            }
            return super.parseFieldCheck(netReportDomains, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NetReportDomains netReportDomains, JsonGenerator jsonGenerator) throws IOException {
            if (netReportDomains.media != null) {
                jsonGenerator.writeFieldName("media");
                JsonAdapter.serializeArray(netReportDomains.media, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (netReportDomains.api != null) {
                jsonGenerator.writeFieldName("api");
                JsonAdapter.serializeArray(netReportDomains.api, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NetReportDomains) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NetReportDomains) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59871a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m59872b(String str) {
        return str;
    }

    public static NetReportDomains new_() {
        NetReportDomains netReportDomains = new NetReportDomains();
        netReportDomains.nullCheck();
        return netReportDomains;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NetReportDomains mo223809clone() {
        NetReportDomains netReportDomains = new NetReportDomains();
        List<String> list = this.media;
        if (list != null) {
            netReportDomains.media = ValueObject.util_map(list, new w9j() { // from class: l.fa20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NetReportDomains.m59872b((String) obj);
                }
            });
        }
        List<String> list2 = this.api;
        if (list2 != null) {
            netReportDomains.api = ValueObject.util_map(list2, new w9j() { // from class: l.ga20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NetReportDomains.m59871a((String) obj);
                }
            });
        }
        return netReportDomains;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetReportDomains)) {
            return false;
        }
        NetReportDomains netReportDomains = (NetReportDomains) obj;
        return ValueObject.util_equals(this.media, netReportDomains.media) && ValueObject.util_equals(this.api, netReportDomains.api);
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
        List<String> list = this.media;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.api;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.media == null) {
            this.media = new ArrayList();
        }
        if (this.api == null) {
            this.api = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
