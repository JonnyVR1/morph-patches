package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class PluginInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "plugininfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String md5;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;

    @NonNull
    @ProtobufIndex(index = 1)
    public String version;
    public static ProtobufAdapter<PluginInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PluginInfo>() { // from class: com.p1.mobile.putong.data.PluginInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PluginInfo pluginInfo) {
            String str = pluginInfo.version;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = pluginInfo.url;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = pluginInfo.md5;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            pluginInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PluginInfo parse(nc5 nc5Var) throws IOException {
            PluginInfo pluginInfo = new PluginInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (pluginInfo.version == null) {
                        pluginInfo.version = "";
                    }
                    if (pluginInfo.url == null) {
                        pluginInfo.url = "";
                    }
                    if (pluginInfo.md5 != null) {
                        break;
                    }
                    pluginInfo.md5 = "";
                    break;
                }
                if (iM162497u == 10) {
                    pluginInfo.version = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    pluginInfo.url = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (pluginInfo.version == null) {
                            pluginInfo.version = "";
                        }
                        if (pluginInfo.url == null) {
                            pluginInfo.url = "";
                        }
                        if (pluginInfo.md5 != null) {
                            break;
                        }
                        pluginInfo.md5 = "";
                        return pluginInfo;
                    }
                    pluginInfo.md5 = nc5Var.m162495s();
                }
            }
            return pluginInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PluginInfo pluginInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = pluginInfo.version;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = pluginInfo.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = pluginInfo.md5;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<PluginInfo> JSON_ADAPTER = new ObjectJsonAdapter<PluginInfo>() { // from class: com.p1.mobile.putong.data.PluginInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PluginInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PluginInfo newInstance() {
            return new PluginInfo();
        }

        public boolean parseField(PluginInfo pluginInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "md5":
                    pluginInfo.md5 = jsonParser.getValueAsString();
                    return true;
                case "url":
                    pluginInfo.url = jsonParser.getValueAsString();
                    return true;
                case "version":
                    pluginInfo.version = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PluginInfo pluginInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "md5":
                case "url":
                case "version":
                    return true;
                default:
                    return super.parseFieldCheck(pluginInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PluginInfo pluginInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = pluginInfo.version;
            if (str != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str);
            }
            String str2 = pluginInfo.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = pluginInfo.md5;
            if (str3 != null) {
                jsonGenerator.writeStringField("md5", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PluginInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PluginInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PluginInfo new_() {
        PluginInfo pluginInfo = new PluginInfo();
        pluginInfo.nullCheck();
        return pluginInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PluginInfo mo225055clone() {
        PluginInfo pluginInfo = new PluginInfo();
        pluginInfo.version = this.version;
        pluginInfo.url = this.url;
        pluginInfo.md5 = this.md5;
        return pluginInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PluginInfo)) {
            return false;
        }
        PluginInfo pluginInfo = (PluginInfo) obj;
        return ValueObject.util_equals(this.version, pluginInfo.version) && ValueObject.util_equals(this.url, pluginInfo.url) && ValueObject.util_equals(this.md5, pluginInfo.md5);
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
        String str = this.version;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.md5;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.version == null) {
            this.version = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.md5 == null) {
            this.md5 = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
