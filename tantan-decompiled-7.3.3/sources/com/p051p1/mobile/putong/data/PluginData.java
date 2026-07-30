package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.AndroidPlugin;
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
public class PluginData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "plugindata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<AndroidPlugin> androidPlugins;
    public static ProtobufAdapter<PluginData> PROTOBUF_ADAPTER = new MessageNanoAdapter<PluginData>() { // from class: com.p1.mobile.putong.data.PluginData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PluginData pluginData) {
            List<AndroidPlugin> list = pluginData.androidPlugins;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, AndroidPlugin.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            pluginData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PluginData parse(nc5 nc5Var) throws IOException {
            PluginData pluginData = new PluginData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (pluginData.androidPlugins != null) {
                        break;
                    }
                    pluginData.androidPlugins = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (pluginData.androidPlugins != null) {
                        break;
                    }
                    pluginData.androidPlugins = new ArrayList();
                    return pluginData;
                }
                pluginData.androidPlugins = (List) nc5Var.m162488l(AndroidPlugin.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return pluginData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PluginData pluginData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<AndroidPlugin> list = pluginData.androidPlugins;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, AndroidPlugin.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PluginData> JSON_ADAPTER = new ObjectJsonAdapter<PluginData>() { // from class: com.p1.mobile.putong.data.PluginData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PluginData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PluginData newInstance() {
            return new PluginData();
        }

        public boolean parseField(PluginData pluginData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("androidPlugins")) {
                return false;
            }
            pluginData.androidPlugins = JsonAdapter.parseArray(jsonParser, AndroidPlugin.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PluginData pluginData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("androidPlugins")) {
                return true;
            }
            return super.parseFieldCheck(pluginData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PluginData pluginData, JsonGenerator jsonGenerator) throws IOException {
            if (pluginData.androidPlugins != null) {
                jsonGenerator.writeFieldName("androidPlugins");
                JsonAdapter.serializeArray(pluginData.androidPlugins, jsonGenerator, AndroidPlugin.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PluginData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PluginData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PluginData new_() {
        PluginData pluginData = new PluginData();
        pluginData.nullCheck();
        return pluginData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PluginData mo225055clone() {
        PluginData pluginData = new PluginData();
        List<AndroidPlugin> list = this.androidPlugins;
        if (list != null) {
            pluginData.androidPlugins = ValueObject.util_map(list, new qcj() { // from class: l.rh80
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((AndroidPlugin) obj).mo225055clone();
                }
            });
        }
        return pluginData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PluginData) {
            return ValueObject.util_equals(this.androidPlugins, ((PluginData) obj).androidPlugins);
        }
        return false;
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
        List<AndroidPlugin> list = this.androidPlugins;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.androidPlugins == null) {
            this.androidPlugins = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
