package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PluginInfo pluginInfo) {
            String str = pluginInfo.version;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = pluginInfo.url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = pluginInfo.md5;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) pluginInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PluginInfo m18820parse(nb5 nb5Var) throws IOException {
            PluginInfo pluginInfo = new PluginInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    pluginInfo.version = nb5Var.s();
                } else if (iU == 18) {
                    pluginInfo.url = nb5Var.s();
                } else {
                    if (iU != 26) {
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
                    pluginInfo.md5 = nb5Var.s();
                }
            }
            return pluginInfo;
        }

        public void serialize(PluginInfo pluginInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = pluginInfo.version;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = pluginInfo.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = pluginInfo.md5;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<PluginInfo> JSON_ADAPTER = new ObjectJsonAdapter<PluginInfo>() { // from class: com.p1.mobile.putong.data.PluginInfo.2
        public Class getDataClass() {
            return PluginInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PluginInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PluginInfo pluginInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = pluginInfo.version;
            if (str != null) {
                jsonGenerator.writeStringField("version", str);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PluginInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PluginInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PluginInfo new_() {
        PluginInfo pluginInfo = new PluginInfo();
        pluginInfo.nullCheck();
        return pluginInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PluginInfo m18819clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
