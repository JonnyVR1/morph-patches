package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.PluginInfo;
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
public class AndroidPlugin extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "androidplugin";

    @NonNull
    @ProtobufIndex(index = 2)
    public String appVersion;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<PluginInfo> forceSkipVersions;

    @NonNull
    @ProtobufIndex(index = 3)
    public PluginInfo latestVersion;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;
    public static ProtobufAdapter<AndroidPlugin> PROTOBUF_ADAPTER = new MessageNanoAdapter<AndroidPlugin>() { // from class: com.p1.mobile.putong.data.AndroidPlugin.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AndroidPlugin androidPlugin) {
            String str = androidPlugin.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = androidPlugin.appVersion;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            PluginInfo pluginInfo = androidPlugin.latestVersion;
            if (pluginInfo != null) {
                iO += CodedOutputByteBufferNano.l(3, pluginInfo, PluginInfo.PROTOBUF_ADAPTER);
            }
            List<PluginInfo> list = androidPlugin.forceSkipVersions;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(4, list, PluginInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) androidPlugin).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AndroidPlugin m17695parse(nb5 nb5Var) throws IOException {
            AndroidPlugin androidPlugin = new AndroidPlugin();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (androidPlugin.name == null) {
                        androidPlugin.name = "";
                    }
                    if (androidPlugin.appVersion == null) {
                        androidPlugin.appVersion = "";
                    }
                    if (androidPlugin.latestVersion == null) {
                        androidPlugin.latestVersion = PluginInfo.new_();
                    }
                    if (androidPlugin.forceSkipVersions != null) {
                        break;
                    }
                    androidPlugin.forceSkipVersions = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    androidPlugin.name = nb5Var.s();
                } else if (iU == 18) {
                    androidPlugin.appVersion = nb5Var.s();
                } else if (iU == 26) {
                    androidPlugin.latestVersion = (PluginInfo) nb5Var.l(PluginInfo.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
                        if (androidPlugin.name == null) {
                            androidPlugin.name = "";
                        }
                        if (androidPlugin.appVersion == null) {
                            androidPlugin.appVersion = "";
                        }
                        if (androidPlugin.latestVersion == null) {
                            androidPlugin.latestVersion = PluginInfo.new_();
                        }
                        if (androidPlugin.forceSkipVersions != null) {
                            break;
                        }
                        androidPlugin.forceSkipVersions = new ArrayList();
                        return androidPlugin;
                    }
                    androidPlugin.forceSkipVersions = (List) nb5Var.l(PluginInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return androidPlugin;
        }

        public void serialize(AndroidPlugin androidPlugin, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = androidPlugin.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = androidPlugin.appVersion;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            PluginInfo pluginInfo = androidPlugin.latestVersion;
            if (pluginInfo != null) {
                codedOutputByteBufferNano.K(3, pluginInfo, PluginInfo.PROTOBUF_ADAPTER);
            }
            List<PluginInfo> list = androidPlugin.forceSkipVersions;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, PluginInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AndroidPlugin> JSON_ADAPTER = new ObjectJsonAdapter<AndroidPlugin>() { // from class: com.p1.mobile.putong.data.AndroidPlugin.2
        public Class getDataClass() {
            return AndroidPlugin.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AndroidPlugin mo17830newInstance() {
            return new AndroidPlugin();
        }

        public boolean parseField(AndroidPlugin androidPlugin, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "latestVersion":
                    androidPlugin.latestVersion = (PluginInfo) PluginInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "forceSkipVersions":
                    androidPlugin.forceSkipVersions = JsonAdapter.parseArray(jsonParser, PluginInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    androidPlugin.name = jsonParser.getValueAsString();
                    return true;
                case "appVersion":
                    androidPlugin.appVersion = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AndroidPlugin androidPlugin, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "latestVersion":
                case "forceSkipVersions":
                case "name":
                case "appVersion":
                    return true;
                default:
                    return super.parseFieldCheck(androidPlugin, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AndroidPlugin androidPlugin, JsonGenerator jsonGenerator) throws IOException {
            String str = androidPlugin.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = androidPlugin.appVersion;
            if (str2 != null) {
                jsonGenerator.writeStringField("appVersion", str2);
            }
            if (androidPlugin.latestVersion != null) {
                jsonGenerator.writeFieldName("latestVersion");
                PluginInfo.JSON_ADAPTER.serialize(androidPlugin.latestVersion, jsonGenerator, true);
            }
            if (androidPlugin.forceSkipVersions != null) {
                jsonGenerator.writeFieldName("forceSkipVersions");
                JsonAdapter.serializeArray(androidPlugin.forceSkipVersions, jsonGenerator, PluginInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AndroidPlugin) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AndroidPlugin) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AndroidPlugin new_() {
        AndroidPlugin androidPlugin = new AndroidPlugin();
        androidPlugin.nullCheck();
        return androidPlugin;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AndroidPlugin m17694clone() {
        AndroidPlugin androidPlugin = new AndroidPlugin();
        androidPlugin.name = this.name;
        androidPlugin.appVersion = this.appVersion;
        PluginInfo pluginInfo = this.latestVersion;
        if (pluginInfo != null) {
            androidPlugin.latestVersion = pluginInfo.m18819clone();
        }
        List<PluginInfo> list = this.forceSkipVersions;
        if (list != null) {
            androidPlugin.forceSkipVersions = ValueObject.util_map(list, new w9j() { // from class: l.fo0
                public final Object call(Object obj) {
                    return ((PluginInfo) obj).m18819clone();
                }
            });
        }
        return androidPlugin;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidPlugin)) {
            return false;
        }
        AndroidPlugin androidPlugin = (AndroidPlugin) obj;
        return ValueObject.util_equals(this.name, androidPlugin.name) && ValueObject.util_equals(this.appVersion, androidPlugin.appVersion) && ValueObject.util_equals(this.latestVersion, androidPlugin.latestVersion) && ValueObject.util_equals(this.forceSkipVersions, androidPlugin.forceSkipVersions);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.appVersion;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        PluginInfo pluginInfo = this.latestVersion;
        int iHashCode3 = (iHashCode2 + (pluginInfo != null ? pluginInfo.hashCode() : 0)) * 41;
        List<PluginInfo> list = this.forceSkipVersions;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.appVersion == null) {
            this.appVersion = "";
        }
        if (this.latestVersion == null) {
            this.latestVersion = PluginInfo.new_();
        }
        if (this.forceSkipVersions == null) {
            this.forceSkipVersions = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
