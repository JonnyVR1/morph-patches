package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.AndroidPlugin;
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
public class PluginData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "plugindata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<AndroidPlugin> androidPlugins;
    public static ProtobufAdapter<PluginData> PROTOBUF_ADAPTER = new MessageNanoAdapter<PluginData>() { // from class: com.p1.mobile.putong.data.PluginData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PluginData pluginData) {
            List<AndroidPlugin> list = pluginData.androidPlugins;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, AndroidPlugin.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) pluginData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PluginData m18817parse(nb5 nb5Var) throws IOException {
            PluginData pluginData = new PluginData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (pluginData.androidPlugins != null) {
                        break;
                    }
                    pluginData.androidPlugins = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (pluginData.androidPlugins != null) {
                        break;
                    }
                    pluginData.androidPlugins = new ArrayList();
                    return pluginData;
                }
                pluginData.androidPlugins = (List) nb5Var.l(AndroidPlugin.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return pluginData;
        }

        public void serialize(PluginData pluginData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<AndroidPlugin> list = pluginData.androidPlugins;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, AndroidPlugin.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PluginData> JSON_ADAPTER = new ObjectJsonAdapter<PluginData>() { // from class: com.p1.mobile.putong.data.PluginData.2
        public Class getDataClass() {
            return PluginData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PluginData mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PluginData pluginData, JsonGenerator jsonGenerator) throws IOException {
            if (pluginData.androidPlugins != null) {
                jsonGenerator.writeFieldName("androidPlugins");
                JsonAdapter.serializeArray(pluginData.androidPlugins, jsonGenerator, AndroidPlugin.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PluginData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PluginData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PluginData new_() {
        PluginData pluginData = new PluginData();
        pluginData.nullCheck();
        return pluginData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PluginData m18816clone() {
        PluginData pluginData = new PluginData();
        List<AndroidPlugin> list = this.androidPlugins;
        if (list != null) {
            pluginData.androidPlugins = ValueObject.util_map(list, new w9j() { // from class: l.l980
                public final Object call(Object obj) {
                    return ((AndroidPlugin) obj).m17694clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<AndroidPlugin> list = this.androidPlugins;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.androidPlugins == null) {
            this.androidPlugins = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
