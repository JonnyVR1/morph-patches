package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.OfficialAccount;
import com.p000p1.mobile.putong.core.data.OfficialAccountsMenu;
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
public class OfficialAccount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "officialaccount";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f121id;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<OfficialAccountsMenu> localMenus;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> menuIds;
    public static ProtobufAdapter<OfficialAccount> PROTOBUF_ADAPTER = new MessageNanoAdapter<OfficialAccount>() { // from class: com.p1.mobile.putong.core.data.OfficialAccount.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OfficialAccount officialAccount) {
            String str = officialAccount.f121id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = officialAccount.menuIds;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<OfficialAccountsMenu> list2 = officialAccount.localMenus;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(3, list2, OfficialAccountsMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) officialAccount).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OfficialAccount m14633parse(nb5 nb5Var) throws IOException {
            OfficialAccount officialAccount = new OfficialAccount();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (officialAccount.f121id == null) {
                        officialAccount.f121id = "";
                    }
                    if (officialAccount.menuIds != null) {
                        break;
                    }
                    officialAccount.menuIds = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    officialAccount.f121id = nb5Var.s();
                } else if (iU == 18) {
                    officialAccount.menuIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (officialAccount.f121id == null) {
                            officialAccount.f121id = "";
                        }
                        if (officialAccount.menuIds != null) {
                            break;
                        }
                        officialAccount.menuIds = new ArrayList();
                        return officialAccount;
                    }
                    officialAccount.localMenus = (List) nb5Var.l(OfficialAccountsMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return officialAccount;
        }

        public void serialize(OfficialAccount officialAccount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = officialAccount.f121id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = officialAccount.menuIds;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<OfficialAccountsMenu> list2 = officialAccount.localMenus;
            if (list2 != null) {
                codedOutputByteBufferNano.K(3, list2, OfficialAccountsMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OfficialAccount> JSON_ADAPTER = new ObjectJsonAdapter<OfficialAccount>() { // from class: com.p1.mobile.putong.core.data.OfficialAccount.2
        public Class getDataClass() {
            return OfficialAccount.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OfficialAccount m14634newInstance() {
            return new OfficialAccount();
        }

        public boolean parseField(OfficialAccount officialAccount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                officialAccount.f121id = jsonParser.getValueAsString();
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

        public void serializeFields(OfficialAccount officialAccount, JsonGenerator jsonGenerator) throws IOException {
            String str = officialAccount.f121id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (officialAccount.menuIds != null) {
                jsonGenerator.writeFieldName("menuIds");
                JsonAdapter.serializeArray(officialAccount.menuIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OfficialAccount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OfficialAccount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m537a(String str) {
        return str;
    }

    public static OfficialAccount new_() {
        OfficialAccount officialAccount = new OfficialAccount();
        officialAccount.nullCheck();
        return officialAccount;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OfficialAccount m14632clone() {
        OfficialAccount officialAccount = new OfficialAccount();
        officialAccount.f121id = this.f121id;
        List<String> list = this.menuIds;
        if (list != null) {
            officialAccount.menuIds = ValueObject.util_map(list, new w9j() { // from class: l.s250
                public final Object call(Object obj) {
                    return OfficialAccount.m537a((String) obj);
                }
            });
        }
        List<OfficialAccountsMenu> list2 = this.localMenus;
        if (list2 != null) {
            officialAccount.localMenus = ValueObject.util_map(list2, new w9j() { // from class: l.t250
                public final Object call(Object obj) {
                    return ((OfficialAccountsMenu) obj).m14636clone();
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
        return ValueObject.util_equals(this.f121id, officialAccount.f121id) && ValueObject.util_equals(this.menuIds, officialAccount.menuIds) && ValueObject.util_equals(this.localMenus, officialAccount.localMenus);
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
        String str = this.f121id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.menuIds;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<OfficialAccountsMenu> list2 = this.localMenus;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f121id == null) {
            this.f121id = "";
        }
        if (this.menuIds == null) {
            this.menuIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
