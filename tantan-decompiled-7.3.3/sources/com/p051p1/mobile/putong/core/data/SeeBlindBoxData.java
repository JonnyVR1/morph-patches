package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.User;
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
public class SeeBlindBoxData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seeblindboxdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<User> users;
    public static ProtobufAdapter<SeeBlindBoxData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeBlindBoxData>() { // from class: com.p1.mobile.putong.core.data.SeeBlindBoxData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SeeBlindBoxData seeBlindBoxData) {
            List<User> list = seeBlindBoxData.users;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            seeBlindBoxData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SeeBlindBoxData parse(nc5 nc5Var) throws IOException {
            SeeBlindBoxData seeBlindBoxData = new SeeBlindBoxData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (seeBlindBoxData.users != null) {
                        break;
                    }
                    seeBlindBoxData.users = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (seeBlindBoxData.users != null) {
                        break;
                    }
                    seeBlindBoxData.users = new ArrayList();
                    return seeBlindBoxData;
                }
                seeBlindBoxData.users = (List) nc5Var.m162488l(User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return seeBlindBoxData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SeeBlindBoxData seeBlindBoxData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<User> list = seeBlindBoxData.users;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SeeBlindBoxData> JSON_ADAPTER = new ObjectJsonAdapter<SeeBlindBoxData>() { // from class: com.p1.mobile.putong.core.data.SeeBlindBoxData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SeeBlindBoxData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SeeBlindBoxData newInstance() {
            return new SeeBlindBoxData();
        }

        public boolean parseField(SeeBlindBoxData seeBlindBoxData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("users")) {
                return false;
            }
            seeBlindBoxData.users = JsonAdapter.parseArray(jsonParser, User.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SeeBlindBoxData seeBlindBoxData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("users")) {
                return true;
            }
            return super.parseFieldCheck(seeBlindBoxData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SeeBlindBoxData seeBlindBoxData, JsonGenerator jsonGenerator) throws IOException {
            if (seeBlindBoxData.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(seeBlindBoxData.users, jsonGenerator, User.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeBlindBoxData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeBlindBoxData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeBlindBoxData new_() {
        SeeBlindBoxData seeBlindBoxData = new SeeBlindBoxData();
        seeBlindBoxData.nullCheck();
        return seeBlindBoxData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SeeBlindBoxData mo225055clone() {
        SeeBlindBoxData seeBlindBoxData = new SeeBlindBoxData();
        List<User> list = this.users;
        if (list != null) {
            seeBlindBoxData.users = ValueObject.util_map(list, new qcj() { // from class: l.sfe0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).mo225055clone();
                }
            });
        }
        return seeBlindBoxData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SeeBlindBoxData) {
            return ValueObject.util_equals(this.users, ((SeeBlindBoxData) obj).users);
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
        List<User> list = this.users;
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
