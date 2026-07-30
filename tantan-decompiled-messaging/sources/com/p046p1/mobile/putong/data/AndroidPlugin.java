package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.PluginInfo;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AndroidPlugin androidPlugin) {
            String str = androidPlugin.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = androidPlugin.appVersion;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            PluginInfo pluginInfo = androidPlugin.latestVersion;
            if (pluginInfo != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, pluginInfo, PluginInfo.PROTOBUF_ADAPTER);
            }
            List<PluginInfo> list = androidPlugin.forceSkipVersions;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, list, PluginInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            androidPlugin.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AndroidPlugin parse(nb5 nb5Var) throws IOException {
            AndroidPlugin androidPlugin = new AndroidPlugin();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    androidPlugin.name = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    androidPlugin.appVersion = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    androidPlugin.latestVersion = (PluginInfo) nb5Var.m158743l(PluginInfo.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 34) {
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
                    androidPlugin.forceSkipVersions = (List) nb5Var.m158743l(PluginInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return androidPlugin;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AndroidPlugin androidPlugin, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = androidPlugin.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = androidPlugin.appVersion;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            PluginInfo pluginInfo = androidPlugin.latestVersion;
            if (pluginInfo != null) {
                codedOutputByteBufferNano.m17254K(3, pluginInfo, PluginInfo.PROTOBUF_ADAPTER);
            }
            List<PluginInfo> list = androidPlugin.forceSkipVersions;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, PluginInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AndroidPlugin> JSON_ADAPTER = new ObjectJsonAdapter<AndroidPlugin>() { // from class: com.p1.mobile.putong.data.AndroidPlugin.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AndroidPlugin.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AndroidPlugin newInstance() {
            return new AndroidPlugin();
        }

        public boolean parseField(AndroidPlugin androidPlugin, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "latestVersion":
                    androidPlugin.latestVersion = PluginInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AndroidPlugin androidPlugin, JsonGenerator jsonGenerator) throws IOException {
            String str = androidPlugin.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = androidPlugin.appVersion;
            if (str2 != null) {
                jsonGenerator.writeStringField(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str2);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AndroidPlugin) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AndroidPlugin) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AndroidPlugin new_() {
        AndroidPlugin androidPlugin = new AndroidPlugin();
        androidPlugin.nullCheck();
        return androidPlugin;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AndroidPlugin mo223809clone() {
        AndroidPlugin androidPlugin = new AndroidPlugin();
        androidPlugin.name = this.name;
        androidPlugin.appVersion = this.appVersion;
        PluginInfo pluginInfo = this.latestVersion;
        if (pluginInfo != null) {
            androidPlugin.latestVersion = pluginInfo.mo223809clone();
        }
        List<PluginInfo> list = this.forceSkipVersions;
        if (list != null) {
            androidPlugin.forceSkipVersions = ValueObject.util_map(list, new w9j() { // from class: l.fo0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((PluginInfo) obj).mo223809clone();
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.appVersion;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        PluginInfo pluginInfo = this.latestVersion;
        int iHashCode3 = (iHashCode2 + (pluginInfo != null ? pluginInfo.hashCode() : 0)) * 41;
        List<PluginInfo> list = this.forceSkipVersions;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
