package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.HideSpecialUser;
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
public class HideSpecialUserList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hidespecialuserlist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<HideSpecialUser> users;
    public static ProtobufAdapter<HideSpecialUserList> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideSpecialUserList>() { // from class: com.p1.mobile.putong.core.data.HideSpecialUserList.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HideSpecialUserList hideSpecialUserList) {
            List<HideSpecialUser> list = hideSpecialUserList.users;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, HideSpecialUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) hideSpecialUserList).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HideSpecialUserList m13299parse(nb5 nb5Var) throws IOException {
            HideSpecialUserList hideSpecialUserList = new HideSpecialUserList();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (hideSpecialUserList.users != null) {
                        break;
                    }
                    hideSpecialUserList.users = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (hideSpecialUserList.users != null) {
                        break;
                    }
                    hideSpecialUserList.users = new ArrayList();
                    return hideSpecialUserList;
                }
                hideSpecialUserList.users = (List) nb5Var.l(HideSpecialUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return hideSpecialUserList;
        }

        public void serialize(HideSpecialUserList hideSpecialUserList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<HideSpecialUser> list = hideSpecialUserList.users;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, HideSpecialUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<HideSpecialUserList> JSON_ADAPTER = new ObjectJsonAdapter<HideSpecialUserList>() { // from class: com.p1.mobile.putong.core.data.HideSpecialUserList.2
        public Class getDataClass() {
            return HideSpecialUserList.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HideSpecialUserList m13300newInstance() {
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

        public void serializeFields(HideSpecialUserList hideSpecialUserList, JsonGenerator jsonGenerator) throws IOException {
            if (hideSpecialUserList.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(hideSpecialUserList.users, jsonGenerator, HideSpecialUser.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideSpecialUserList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideSpecialUserList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideSpecialUserList new_() {
        HideSpecialUserList hideSpecialUserList = new HideSpecialUserList();
        hideSpecialUserList.nullCheck();
        return hideSpecialUserList;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HideSpecialUserList m13298clone() {
        HideSpecialUserList hideSpecialUserList = new HideSpecialUserList();
        List<HideSpecialUser> list = this.users;
        if (list != null) {
            hideSpecialUserList.users = ValueObject.util_map(list, new w9j() { // from class: l.k1l
                public final Object call(Object obj) {
                    return ((HideSpecialUser) obj).m13294clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<HideSpecialUser> list = this.users;
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
