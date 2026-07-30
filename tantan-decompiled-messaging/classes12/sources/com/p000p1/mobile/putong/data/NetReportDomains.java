package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.NetReportDomains;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NetReportDomains netReportDomains) {
            List<String> list = netReportDomains.media;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = netReportDomains.api;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) netReportDomains).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NetReportDomains m18534parse(nb5 nb5Var) throws IOException {
            NetReportDomains netReportDomains = new NetReportDomains();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (netReportDomains.media == null) {
                        netReportDomains.media = new ArrayList();
                    }
                    if (netReportDomains.api != null) {
                        break;
                    }
                    netReportDomains.api = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    netReportDomains.media = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (netReportDomains.media == null) {
                            netReportDomains.media = new ArrayList();
                        }
                        if (netReportDomains.api != null) {
                            break;
                        }
                        netReportDomains.api = new ArrayList();
                        return netReportDomains;
                    }
                    netReportDomains.api = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return netReportDomains;
        }

        public void serialize(NetReportDomains netReportDomains, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = netReportDomains.media;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = netReportDomains.api;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<NetReportDomains> JSON_ADAPTER = new ObjectJsonAdapter<NetReportDomains>() { // from class: com.p1.mobile.putong.data.NetReportDomains.2
        public Class getDataClass() {
            return NetReportDomains.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NetReportDomains mo17830newInstance() {
            return new NetReportDomains();
        }

        public boolean parseField(NetReportDomains netReportDomains, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("api")) {
                netReportDomains.api = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Media.TYPE)) {
                return false;
            }
            netReportDomains.media = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NetReportDomains netReportDomains, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("api") || str.equals(Media.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(netReportDomains, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NetReportDomains netReportDomains, JsonGenerator jsonGenerator) throws IOException {
            if (netReportDomains.media != null) {
                jsonGenerator.writeFieldName(Media.TYPE);
                JsonAdapter.serializeArray(netReportDomains.media, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (netReportDomains.api != null) {
                jsonGenerator.writeFieldName("api");
                JsonAdapter.serializeArray(netReportDomains.api, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NetReportDomains) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NetReportDomains) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m789a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m790b(String str) {
        return str;
    }

    public static NetReportDomains new_() {
        NetReportDomains netReportDomains = new NetReportDomains();
        netReportDomains.nullCheck();
        return netReportDomains;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NetReportDomains m18533clone() {
        NetReportDomains netReportDomains = new NetReportDomains();
        List<String> list = this.media;
        if (list != null) {
            netReportDomains.media = ValueObject.util_map(list, new w9j() { // from class: l.fa20
                public final Object call(Object obj) {
                    return NetReportDomains.m790b((String) obj);
                }
            });
        }
        List<String> list2 = this.api;
        if (list2 != null) {
            netReportDomains.api = ValueObject.util_map(list2, new w9j() { // from class: l.ga20
                public final Object call(Object obj) {
                    return NetReportDomains.m789a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.media;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.api;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.media == null) {
            this.media = new ArrayList();
        }
        if (this.api == null) {
            this.api = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
