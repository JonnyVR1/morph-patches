package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.NewUserMonetizationConfig;
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

/* JADX INFO: loaded from: classes10.dex */
public class NewUserMonetizationData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newusermonetizationdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<NewUserMonetizationConfig> newUserMonetizationConfigs;
    public static ProtobufAdapter<NewUserMonetizationData> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewUserMonetizationData>() { // from class: com.p1.mobile.putong.core.data.NewUserMonetizationData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewUserMonetizationData newUserMonetizationData) {
            List<NewUserMonetizationConfig> list = newUserMonetizationData.newUserMonetizationConfigs;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, NewUserMonetizationConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            newUserMonetizationData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewUserMonetizationData parse(nb5 nb5Var) throws IOException {
            NewUserMonetizationData newUserMonetizationData = new NewUserMonetizationData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (newUserMonetizationData.newUserMonetizationConfigs != null) {
                        break;
                    }
                    newUserMonetizationData.newUserMonetizationConfigs = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (newUserMonetizationData.newUserMonetizationConfigs != null) {
                        break;
                    }
                    newUserMonetizationData.newUserMonetizationConfigs = new ArrayList();
                    return newUserMonetizationData;
                }
                newUserMonetizationData.newUserMonetizationConfigs = (List) nb5Var.m158743l(NewUserMonetizationConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return newUserMonetizationData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewUserMonetizationData newUserMonetizationData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<NewUserMonetizationConfig> list = newUserMonetizationData.newUserMonetizationConfigs;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, NewUserMonetizationConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<NewUserMonetizationData> JSON_ADAPTER = new ObjectJsonAdapter<NewUserMonetizationData>() { // from class: com.p1.mobile.putong.core.data.NewUserMonetizationData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewUserMonetizationData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewUserMonetizationData newInstance() {
            return new NewUserMonetizationData();
        }

        public boolean parseField(NewUserMonetizationData newUserMonetizationData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("newUserMonetizationConfigs")) {
                return false;
            }
            newUserMonetizationData.newUserMonetizationConfigs = JsonAdapter.parseArray(jsonParser, NewUserMonetizationConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NewUserMonetizationData newUserMonetizationData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("newUserMonetizationConfigs")) {
                return true;
            }
            return super.parseFieldCheck(newUserMonetizationData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewUserMonetizationData newUserMonetizationData, JsonGenerator jsonGenerator) throws IOException {
            if (newUserMonetizationData.newUserMonetizationConfigs != null) {
                jsonGenerator.writeFieldName("newUserMonetizationConfigs");
                JsonAdapter.serializeArray(newUserMonetizationData.newUserMonetizationConfigs, jsonGenerator, NewUserMonetizationConfig.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewUserMonetizationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewUserMonetizationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewUserMonetizationData new_() {
        NewUserMonetizationData newUserMonetizationData = new NewUserMonetizationData();
        newUserMonetizationData.nullCheck();
        return newUserMonetizationData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewUserMonetizationData mo223809clone() {
        NewUserMonetizationData newUserMonetizationData = new NewUserMonetizationData();
        List<NewUserMonetizationConfig> list = this.newUserMonetizationConfigs;
        if (list != null) {
            newUserMonetizationData.newUserMonetizationConfigs = ValueObject.util_map(list, new w9j() { // from class: l.wh40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((NewUserMonetizationConfig) obj).mo223809clone();
                }
            });
        }
        return newUserMonetizationData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NewUserMonetizationData) {
            return ValueObject.util_equals(this.newUserMonetizationConfigs, ((NewUserMonetizationData) obj).newUserMonetizationConfigs);
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
        List<NewUserMonetizationConfig> list = this.newUserMonetizationConfigs;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.newUserMonetizationConfigs == null) {
            this.newUserMonetizationConfigs = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
