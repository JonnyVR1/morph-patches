package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Connector;
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
public class Connector extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "connector";

    @NonNull
    @ProtobufIndex(index = 1)
    public String addr;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> addr_list;

    @Nullable
    @ProtobufIndex(index = 6)
    public String client_ip;

    @Nullable
    @ProtobufIndex(index = 5)
    public ConnectorConfig config;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> tcp_addr_list;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> text_room_tcp_addr_list;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> wss_addr_list;
    public static ProtobufAdapter<Connector> PROTOBUF_ADAPTER = new MessageNanoAdapter<Connector>() { // from class: com.p1.mobile.putong.data.Connector.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Connector connector) {
            String str = connector.addr;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = connector.addr_list;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = connector.wss_addr_list;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = connector.tcp_addr_list;
            if (list3 != null) {
                iO += CodedOutputByteBufferNano.l(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ConnectorConfig connectorConfig = connector.config;
            if (connectorConfig != null) {
                iO += CodedOutputByteBufferNano.l(5, connectorConfig, ConnectorConfig.PROTOBUF_ADAPTER);
            }
            String str2 = connector.client_ip;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(6, str2);
            }
            List<String> list4 = connector.text_room_tcp_addr_list;
            if (list4 != null) {
                iO += CodedOutputByteBufferNano.l(7, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) connector).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Connector m17842parse(nb5 nb5Var) throws IOException {
            Connector connector = new Connector();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (connector.addr == null) {
                        connector.addr = "";
                    }
                    if (connector.addr_list == null) {
                        connector.addr_list = new ArrayList();
                    }
                    if (connector.wss_addr_list == null) {
                        connector.wss_addr_list = new ArrayList();
                    }
                    if (connector.tcp_addr_list == null) {
                        connector.tcp_addr_list = new ArrayList();
                    }
                    if (connector.text_room_tcp_addr_list != null) {
                        break;
                    }
                    connector.text_room_tcp_addr_list = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    connector.addr = nb5Var.s();
                } else if (iU == 18) {
                    connector.addr_list = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    connector.wss_addr_list = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 34) {
                    connector.tcp_addr_list = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 42) {
                    connector.config = (ConnectorConfig) nb5Var.l(ConnectorConfig.PROTOBUF_ADAPTER);
                } else if (iU == 50) {
                    connector.client_ip = nb5Var.s();
                } else {
                    if (iU != 58) {
                        if (connector.addr == null) {
                            connector.addr = "";
                        }
                        if (connector.addr_list == null) {
                            connector.addr_list = new ArrayList();
                        }
                        if (connector.wss_addr_list == null) {
                            connector.wss_addr_list = new ArrayList();
                        }
                        if (connector.tcp_addr_list == null) {
                            connector.tcp_addr_list = new ArrayList();
                        }
                        if (connector.text_room_tcp_addr_list != null) {
                            break;
                        }
                        connector.text_room_tcp_addr_list = new ArrayList();
                        return connector;
                    }
                    connector.text_room_tcp_addr_list = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return connector;
        }

        public void serialize(Connector connector, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = connector.addr;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = connector.addr_list;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = connector.wss_addr_list;
            if (list2 != null) {
                codedOutputByteBufferNano.K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = connector.tcp_addr_list;
            if (list3 != null) {
                codedOutputByteBufferNano.K(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ConnectorConfig connectorConfig = connector.config;
            if (connectorConfig != null) {
                codedOutputByteBufferNano.K(5, connectorConfig, ConnectorConfig.PROTOBUF_ADAPTER);
            }
            String str2 = connector.client_ip;
            if (str2 != null) {
                codedOutputByteBufferNano.R(6, str2);
            }
            List<String> list4 = connector.text_room_tcp_addr_list;
            if (list4 != null) {
                codedOutputByteBufferNano.K(7, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Connector> JSON_ADAPTER = new ObjectJsonAdapter<Connector>() { // from class: com.p1.mobile.putong.data.Connector.2
        public Class getDataClass() {
            return Connector.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Connector mo17830newInstance() {
            return new Connector();
        }

        public boolean parseField(Connector connector, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "client_ip":
                    connector.client_ip = jsonParser.getValueAsString();
                    return true;
                case "config":
                    connector.config = (ConnectorConfig) ConnectorConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "addr":
                    connector.addr = jsonParser.getValueAsString();
                    return true;
                case "tcp_addr_list":
                    connector.tcp_addr_list = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "wss_addr_list":
                    connector.wss_addr_list = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "addr_list":
                    connector.addr_list = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "text_room_tcp_addr_list":
                    connector.text_room_tcp_addr_list = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Connector connector, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "client_ip":
                case "config":
                case "addr":
                case "tcp_addr_list":
                case "wss_addr_list":
                case "addr_list":
                case "text_room_tcp_addr_list":
                    return true;
                default:
                    return super.parseFieldCheck(connector, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Connector connector, JsonGenerator jsonGenerator) throws IOException {
            String str = connector.addr;
            if (str != null) {
                jsonGenerator.writeStringField("addr", str);
            }
            if (connector.addr_list != null) {
                jsonGenerator.writeFieldName("addr_list");
                JsonAdapter.serializeArray(connector.addr_list, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (connector.wss_addr_list != null) {
                jsonGenerator.writeFieldName("wss_addr_list");
                JsonAdapter.serializeArray(connector.wss_addr_list, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (connector.tcp_addr_list != null) {
                jsonGenerator.writeFieldName("tcp_addr_list");
                JsonAdapter.serializeArray(connector.tcp_addr_list, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (connector.config != null) {
                jsonGenerator.writeFieldName("config");
                ConnectorConfig.JSON_ADAPTER.serialize(connector.config, jsonGenerator, true);
            }
            String str2 = connector.client_ip;
            if (str2 != null) {
                jsonGenerator.writeStringField("client_ip", str2);
            }
            if (connector.text_room_tcp_addr_list != null) {
                jsonGenerator.writeFieldName("text_room_tcp_addr_list");
                JsonAdapter.serializeArray(connector.text_room_tcp_addr_list, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Connector) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Connector) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m618a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m619b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m620c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m621d(String str) {
        return str;
    }

    public static Connector new_() {
        Connector connector = new Connector();
        connector.nullCheck();
        return connector;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Connector m17841clone() {
        Connector connector = new Connector();
        connector.addr = this.addr;
        List<String> list = this.addr_list;
        if (list != null) {
            connector.addr_list = ValueObject.util_map(list, new w9j() { // from class: l.lw5
                public final Object call(Object obj) {
                    return Connector.m621d((String) obj);
                }
            });
        }
        List<String> list2 = this.wss_addr_list;
        if (list2 != null) {
            connector.wss_addr_list = ValueObject.util_map(list2, new w9j() { // from class: l.mw5
                public final Object call(Object obj) {
                    return Connector.m620c((String) obj);
                }
            });
        }
        List<String> list3 = this.tcp_addr_list;
        if (list3 != null) {
            connector.tcp_addr_list = ValueObject.util_map(list3, new w9j() { // from class: l.nw5
                public final Object call(Object obj) {
                    return Connector.m619b((String) obj);
                }
            });
        }
        ConnectorConfig connectorConfig = this.config;
        if (connectorConfig != null) {
            connector.config = connectorConfig.m17844clone();
        }
        connector.client_ip = this.client_ip;
        List<String> list4 = this.text_room_tcp_addr_list;
        if (list4 != null) {
            connector.text_room_tcp_addr_list = ValueObject.util_map(list4, new w9j() { // from class: l.ow5
                public final Object call(Object obj) {
                    return Connector.m618a((String) obj);
                }
            });
        }
        return connector;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Connector)) {
            return false;
        }
        Connector connector = (Connector) obj;
        return ValueObject.util_equals(this.addr, connector.addr) && ValueObject.util_equals(this.addr_list, connector.addr_list) && ValueObject.util_equals(this.wss_addr_list, connector.wss_addr_list) && ValueObject.util_equals(this.tcp_addr_list, connector.tcp_addr_list) && ValueObject.util_equals(this.config, connector.config) && ValueObject.util_equals(this.client_ip, connector.client_ip) && ValueObject.util_equals(this.text_room_tcp_addr_list, connector.text_room_tcp_addr_list);
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
        String str = this.addr;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.addr_list;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.wss_addr_list;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.tcp_addr_list;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 41;
        ConnectorConfig connectorConfig = this.config;
        int iHashCode5 = (iHashCode4 + (connectorConfig != null ? connectorConfig.hashCode() : 0)) * 41;
        String str2 = this.client_ip;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list4 = this.text_room_tcp_addr_list;
        int iHashCode7 = iHashCode6 + (list4 != null ? list4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.addr == null) {
            this.addr = "";
        }
        if (this.addr_list == null) {
            this.addr_list = new ArrayList();
        }
        if (this.wss_addr_list == null) {
            this.wss_addr_list = new ArrayList();
        }
        if (this.tcp_addr_list == null) {
            this.tcp_addr_list = new ArrayList();
        }
        if (this.text_room_tcp_addr_list == null) {
            this.text_room_tcp_addr_list = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
