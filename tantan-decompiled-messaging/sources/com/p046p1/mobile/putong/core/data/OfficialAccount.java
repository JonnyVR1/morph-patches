package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.OfficialAccount;
import com.p046p1.mobile.putong.core.data.OfficialAccountsMenu;
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
public class OfficialAccount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "officialaccount";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20459id;

    @Nullable
    @ProtobufIndex(index = 3)
    public List<OfficialAccountsMenu> localMenus;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> menuIds;
    public static ProtobufAdapter<OfficialAccount> PROTOBUF_ADAPTER = new MessageNanoAdapter<OfficialAccount>() { // from class: com.p1.mobile.putong.core.data.OfficialAccount.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OfficialAccount officialAccount) {
            String str = officialAccount.f20459id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = officialAccount.menuIds;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<OfficialAccountsMenu> list2 = officialAccount.localMenus;
            if (list2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list2, OfficialAccountsMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            officialAccount.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OfficialAccount parse(nb5 nb5Var) throws IOException {
            OfficialAccount officialAccount = new OfficialAccount();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (officialAccount.f20459id == null) {
                        officialAccount.f20459id = "";
                    }
                    if (officialAccount.menuIds != null) {
                        break;
                    }
                    officialAccount.menuIds = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    officialAccount.f20459id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    officialAccount.menuIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (officialAccount.f20459id == null) {
                            officialAccount.f20459id = "";
                        }
                        if (officialAccount.menuIds != null) {
                            break;
                        }
                        officialAccount.menuIds = new ArrayList();
                        return officialAccount;
                    }
                    officialAccount.localMenus = (List) nb5Var.m158743l(OfficialAccountsMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return officialAccount;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OfficialAccount officialAccount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = officialAccount.f20459id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = officialAccount.menuIds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<OfficialAccountsMenu> list2 = officialAccount.localMenus;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(3, list2, OfficialAccountsMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OfficialAccount> JSON_ADAPTER = new ObjectJsonAdapter<OfficialAccount>() { // from class: com.p1.mobile.putong.core.data.OfficialAccount.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OfficialAccount.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OfficialAccount newInstance() {
            return new OfficialAccount();
        }

        public boolean parseField(OfficialAccount officialAccount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                officialAccount.f20459id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("menuIds")) {
                return false;
            }
            officialAccount.menuIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OfficialAccount officialAccount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("menuIds")) {
                return true;
            }
            return super.parseFieldCheck(officialAccount, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OfficialAccount officialAccount, JsonGenerator jsonGenerator) throws IOException {
            String str = officialAccount.f20459id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (officialAccount.menuIds != null) {
                jsonGenerator.writeFieldName("menuIds");
                JsonAdapter.serializeArray(officialAccount.menuIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OfficialAccount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OfficialAccount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35735a(String str) {
        return str;
    }

    public static OfficialAccount new_() {
        OfficialAccount officialAccount = new OfficialAccount();
        officialAccount.nullCheck();
        return officialAccount;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OfficialAccount mo223809clone() {
        OfficialAccount officialAccount = new OfficialAccount();
        officialAccount.f20459id = this.f20459id;
        List<String> list = this.menuIds;
        if (list != null) {
            officialAccount.menuIds = ValueObject.util_map(list, new w9j() { // from class: l.s250
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return OfficialAccount.m35735a((String) obj);
                }
            });
        }
        List<OfficialAccountsMenu> list2 = this.localMenus;
        if (list2 != null) {
            officialAccount.localMenus = ValueObject.util_map(list2, new w9j() { // from class: l.t250
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OfficialAccountsMenu) obj).mo223809clone();
                }
            });
        }
        return officialAccount;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfficialAccount)) {
            return false;
        }
        OfficialAccount officialAccount = (OfficialAccount) obj;
        return ValueObject.util_equals(this.f20459id, officialAccount.f20459id) && ValueObject.util_equals(this.menuIds, officialAccount.menuIds) && ValueObject.util_equals(this.localMenus, officialAccount.localMenus);
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
        String str = this.f20459id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.menuIds;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<OfficialAccountsMenu> list2 = this.localMenus;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20459id == null) {
            this.f20459id = "";
        }
        if (this.menuIds == null) {
            this.menuIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
