package com.p051p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.RemoteDeleteAction;
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
public class RemoteDeleteConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "remotedeleteconfig";

    @Nullable
    @ProtobufIndex(index = 1)
    public List<RemoteDeleteAction> actions;
    public static ProtobufAdapter<RemoteDeleteConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<RemoteDeleteConfig>() { // from class: com.p1.mobile.putong.data.RemoteDeleteConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RemoteDeleteConfig remoteDeleteConfig) {
            List<RemoteDeleteAction> list = remoteDeleteConfig.actions;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, RemoteDeleteAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            remoteDeleteConfig.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RemoteDeleteConfig parse(nc5 nc5Var) throws IOException {
            RemoteDeleteConfig remoteDeleteConfig = new RemoteDeleteConfig();
            while (nc5Var.m162497u() == 10) {
                remoteDeleteConfig.actions = (List) nc5Var.m162488l(RemoteDeleteAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return remoteDeleteConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RemoteDeleteConfig remoteDeleteConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<RemoteDeleteAction> list = remoteDeleteConfig.actions;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, RemoteDeleteAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RemoteDeleteConfig> JSON_ADAPTER = new ObjectJsonAdapter<RemoteDeleteConfig>() { // from class: com.p1.mobile.putong.data.RemoteDeleteConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RemoteDeleteConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RemoteDeleteConfig newInstance() {
            return new RemoteDeleteConfig();
        }

        public boolean parseField(RemoteDeleteConfig remoteDeleteConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Constants.KEY_ACTIONS)) {
                return false;
            }
            remoteDeleteConfig.actions = JsonAdapter.parseArray(jsonParser, RemoteDeleteAction.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RemoteDeleteConfig remoteDeleteConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Constants.KEY_ACTIONS)) {
                return true;
            }
            return super.parseFieldCheck(remoteDeleteConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RemoteDeleteConfig remoteDeleteConfig, JsonGenerator jsonGenerator) throws IOException {
            if (remoteDeleteConfig.actions != null) {
                jsonGenerator.writeFieldName(Constants.KEY_ACTIONS);
                JsonAdapter.serializeArray(remoteDeleteConfig.actions, jsonGenerator, RemoteDeleteAction.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RemoteDeleteConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RemoteDeleteConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RemoteDeleteConfig new_() {
        RemoteDeleteConfig remoteDeleteConfig = new RemoteDeleteConfig();
        remoteDeleteConfig.nullCheck();
        return remoteDeleteConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RemoteDeleteConfig mo225055clone() {
        RemoteDeleteConfig remoteDeleteConfig = new RemoteDeleteConfig();
        List<RemoteDeleteAction> list = this.actions;
        if (list != null) {
            remoteDeleteConfig.actions = ValueObject.util_map(list, new qcj() { // from class: l.nyc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((RemoteDeleteAction) obj).mo225055clone();
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
        List<RemoteDeleteAction> list = this.actions;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
