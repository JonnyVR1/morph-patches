package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.LogoutRecommendUser;
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

/* JADX INFO: loaded from: classes10.dex */
public class LogoutRecommendData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "logoutrecommenddata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<LogoutRecommendUser> users;
    public static ProtobufAdapter<LogoutRecommendData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LogoutRecommendData>() { // from class: com.p1.mobile.putong.core.data.LogoutRecommendData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LogoutRecommendData logoutRecommendData) {
            List<LogoutRecommendUser> list = logoutRecommendData.users;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, LogoutRecommendUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            logoutRecommendData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LogoutRecommendData parse(nc5 nc5Var) throws IOException {
            LogoutRecommendData logoutRecommendData = new LogoutRecommendData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (logoutRecommendData.users != null) {
                        break;
                    }
                    logoutRecommendData.users = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (logoutRecommendData.users != null) {
                        break;
                    }
                    logoutRecommendData.users = new ArrayList();
                    return logoutRecommendData;
                }
                logoutRecommendData.users = (List) nc5Var.m162488l(LogoutRecommendUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return logoutRecommendData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LogoutRecommendData logoutRecommendData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<LogoutRecommendUser> list = logoutRecommendData.users;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, LogoutRecommendUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LogoutRecommendData> JSON_ADAPTER = new ObjectJsonAdapter<LogoutRecommendData>() { // from class: com.p1.mobile.putong.core.data.LogoutRecommendData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LogoutRecommendData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LogoutRecommendData newInstance() {
            return new LogoutRecommendData();
        }

        public boolean parseField(LogoutRecommendData logoutRecommendData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("users")) {
                return false;
            }
            logoutRecommendData.users = JsonAdapter.parseArray(jsonParser, LogoutRecommendUser.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LogoutRecommendData logoutRecommendData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("users")) {
                return true;
            }
            return super.parseFieldCheck(logoutRecommendData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LogoutRecommendData logoutRecommendData, JsonGenerator jsonGenerator) throws IOException {
            if (logoutRecommendData.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(logoutRecommendData.users, jsonGenerator, LogoutRecommendUser.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LogoutRecommendData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LogoutRecommendData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LogoutRecommendData new_() {
        LogoutRecommendData logoutRecommendData = new LogoutRecommendData();
        logoutRecommendData.nullCheck();
        return logoutRecommendData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LogoutRecommendData mo225055clone() {
        LogoutRecommendData logoutRecommendData = new LogoutRecommendData();
        List<LogoutRecommendUser> list = this.users;
        if (list != null) {
            logoutRecommendData.users = ValueObject.util_map(list, new qcj() { // from class: l.e1w
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LogoutRecommendUser) obj).mo225055clone();
                }
            });
        }
        return logoutRecommendData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LogoutRecommendData) {
            return ValueObject.util_equals(this.users, ((LogoutRecommendData) obj).users);
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
        List<LogoutRecommendUser> list = this.users;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.users == null) {
            this.users = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
