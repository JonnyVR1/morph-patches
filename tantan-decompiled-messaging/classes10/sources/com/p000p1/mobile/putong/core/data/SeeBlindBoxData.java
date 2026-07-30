package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SeeBlindBoxData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seeblindboxdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<User> users;
    public static ProtobufAdapter<SeeBlindBoxData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeBlindBoxData>() { // from class: com.p1.mobile.putong.core.data.SeeBlindBoxData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeeBlindBoxData seeBlindBoxData) {
            List<User> list = seeBlindBoxData.users;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) seeBlindBoxData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeeBlindBoxData m15503parse(nb5 nb5Var) throws IOException {
            SeeBlindBoxData seeBlindBoxData = new SeeBlindBoxData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (seeBlindBoxData.users != null) {
                        break;
                    }
                    seeBlindBoxData.users = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (seeBlindBoxData.users != null) {
                        break;
                    }
                    seeBlindBoxData.users = new ArrayList();
                    return seeBlindBoxData;
                }
                seeBlindBoxData.users = (List) nb5Var.l(User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return seeBlindBoxData;
        }

        public void serialize(SeeBlindBoxData seeBlindBoxData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<User> list = seeBlindBoxData.users;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SeeBlindBoxData> JSON_ADAPTER = new ObjectJsonAdapter<SeeBlindBoxData>() { // from class: com.p1.mobile.putong.core.data.SeeBlindBoxData.2
        public Class getDataClass() {
            return SeeBlindBoxData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SeeBlindBoxData m15504newInstance() {
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

        public void serializeFields(SeeBlindBoxData seeBlindBoxData, JsonGenerator jsonGenerator) throws IOException {
            if (seeBlindBoxData.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(seeBlindBoxData.users, jsonGenerator, User.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeBlindBoxData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeBlindBoxData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeBlindBoxData new_() {
        SeeBlindBoxData seeBlindBoxData = new SeeBlindBoxData();
        seeBlindBoxData.nullCheck();
        return seeBlindBoxData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeeBlindBoxData m15502clone() {
        SeeBlindBoxData seeBlindBoxData = new SeeBlindBoxData();
        List<User> list = this.users;
        if (list != null) {
            seeBlindBoxData.users = ValueObject.util_map(list, new w9j() { // from class: l.n7e0
                public final Object call(Object obj) {
                    return ((User) obj).clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<User> list = this.users;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.users == null) {
            this.users = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
