package com.p000p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.RemoteDeleteAction;
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
public class RemoteDeleteConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "remotedeleteconfig";

    @Nullable
    @ProtobufIndex(index = 1)
    public List<RemoteDeleteAction> actions;
    public static ProtobufAdapter<RemoteDeleteConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<RemoteDeleteConfig>() { // from class: com.p1.mobile.putong.data.RemoteDeleteConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RemoteDeleteConfig remoteDeleteConfig) {
            List<RemoteDeleteAction> list = remoteDeleteConfig.actions;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, RemoteDeleteAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) remoteDeleteConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RemoteDeleteConfig m18908parse(nb5 nb5Var) throws IOException {
            RemoteDeleteConfig remoteDeleteConfig = new RemoteDeleteConfig();
            while (nb5Var.u() == 10) {
                remoteDeleteConfig.actions = (List) nb5Var.l(RemoteDeleteAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return remoteDeleteConfig;
        }

        public void serialize(RemoteDeleteConfig remoteDeleteConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<RemoteDeleteAction> list = remoteDeleteConfig.actions;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, RemoteDeleteAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RemoteDeleteConfig> JSON_ADAPTER = new ObjectJsonAdapter<RemoteDeleteConfig>() { // from class: com.p1.mobile.putong.data.RemoteDeleteConfig.2
        public Class getDataClass() {
            return RemoteDeleteConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public RemoteDeleteConfig mo17830newInstance() {
            return new RemoteDeleteConfig();
        }

        public boolean parseField(RemoteDeleteConfig remoteDeleteConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("actions")) {
                return false;
            }
            remoteDeleteConfig.actions = JsonAdapter.parseArray(jsonParser, RemoteDeleteAction.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RemoteDeleteConfig remoteDeleteConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("actions")) {
                return true;
            }
            return super.parseFieldCheck(remoteDeleteConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RemoteDeleteConfig remoteDeleteConfig, JsonGenerator jsonGenerator) throws IOException {
            if (remoteDeleteConfig.actions != null) {
                jsonGenerator.writeFieldName("actions");
                JsonAdapter.serializeArray(remoteDeleteConfig.actions, jsonGenerator, RemoteDeleteAction.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RemoteDeleteConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RemoteDeleteConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RemoteDeleteConfig new_() {
        RemoteDeleteConfig remoteDeleteConfig = new RemoteDeleteConfig();
        remoteDeleteConfig.nullCheck();
        return remoteDeleteConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RemoteDeleteConfig m18907clone() {
        RemoteDeleteConfig remoteDeleteConfig = new RemoteDeleteConfig();
        List<RemoteDeleteAction> list = this.actions;
        if (list != null) {
            remoteDeleteConfig.actions = ValueObject.util_map(list, new w9j() { // from class: l.iqc0
                public final Object call(Object obj) {
                    return ((RemoteDeleteAction) obj).m18904clone();
                }
            });
        }
        return remoteDeleteConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RemoteDeleteConfig) {
            return ValueObject.util_equals(this.actions, ((RemoteDeleteConfig) obj).actions);
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
        List<RemoteDeleteAction> list = this.actions;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
