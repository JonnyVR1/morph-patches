package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.HideSpecialUser;
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
public class HideSpecialUserList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hidespecialuserlist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<HideSpecialUser> users;
    public static ProtobufAdapter<HideSpecialUserList> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideSpecialUserList>() { // from class: com.p1.mobile.putong.core.data.HideSpecialUserList.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HideSpecialUserList hideSpecialUserList) {
            List<HideSpecialUser> list = hideSpecialUserList.users;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, HideSpecialUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            hideSpecialUserList.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HideSpecialUserList parse(nc5 nc5Var) throws IOException {
            HideSpecialUserList hideSpecialUserList = new HideSpecialUserList();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (hideSpecialUserList.users != null) {
                        break;
                    }
                    hideSpecialUserList.users = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (hideSpecialUserList.users != null) {
                        break;
                    }
                    hideSpecialUserList.users = new ArrayList();
                    return hideSpecialUserList;
                }
                hideSpecialUserList.users = (List) nc5Var.m162488l(HideSpecialUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return hideSpecialUserList;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HideSpecialUserList hideSpecialUserList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<HideSpecialUser> list = hideSpecialUserList.users;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, HideSpecialUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<HideSpecialUserList> JSON_ADAPTER = new ObjectJsonAdapter<HideSpecialUserList>() { // from class: com.p1.mobile.putong.core.data.HideSpecialUserList.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HideSpecialUserList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HideSpecialUserList newInstance() {
            return new HideSpecialUserList();
        }

        public boolean parseField(HideSpecialUserList hideSpecialUserList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("users")) {
                return false;
            }
            hideSpecialUserList.users = JsonAdapter.parseArray(jsonParser, HideSpecialUser.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(HideSpecialUserList hideSpecialUserList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("users")) {
                return true;
            }
            return super.parseFieldCheck(hideSpecialUserList, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HideSpecialUserList hideSpecialUserList, JsonGenerator jsonGenerator) throws IOException {
            if (hideSpecialUserList.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(hideSpecialUserList.users, jsonGenerator, HideSpecialUser.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideSpecialUserList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideSpecialUserList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideSpecialUserList new_() {
        HideSpecialUserList hideSpecialUserList = new HideSpecialUserList();
        hideSpecialUserList.nullCheck();
        return hideSpecialUserList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HideSpecialUserList mo225055clone() {
        HideSpecialUserList hideSpecialUserList = new HideSpecialUserList();
        List<HideSpecialUser> list = this.users;
        if (list != null) {
            hideSpecialUserList.users = ValueObject.util_map(list, new qcj() { // from class: l.a4l
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((HideSpecialUser) obj).mo225055clone();
                }
            });
        }
        return hideSpecialUserList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HideSpecialUserList) {
            return ValueObject.util_equals(this.users, ((HideSpecialUserList) obj).users);
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
        List<HideSpecialUser> list = this.users;
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
