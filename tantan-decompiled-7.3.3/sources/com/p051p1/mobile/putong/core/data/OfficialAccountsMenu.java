package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p051p1.mobile.putong.core.data.OfficialAccountsSubMenu;
import com.p051p1.mobile.putong.data.OfficialAccountAction;
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
public class OfficialAccountsMenu extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "officialaccountsmenu";

    @Nullable
    @ProtobufIndex(index = 5)
    public OfficialAccountAction action;

    @Nullable
    @ProtobufIndex(index = 4)
    public List<String> children;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21202id;

    @Nullable
    @ProtobufIndex(index = 6)
    public List<OfficialAccountsSubMenu> localMenus;

    @ProtobufIndex(index = 3)
    public boolean needTracking;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;
    public static ProtobufAdapter<OfficialAccountsMenu> PROTOBUF_ADAPTER = new MessageNanoAdapter<OfficialAccountsMenu>() { // from class: com.p1.mobile.putong.core.data.OfficialAccountsMenu.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OfficialAccountsMenu officialAccountsMenu) {
            String str = officialAccountsMenu.f21202id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = officialAccountsMenu.text;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(3, officialAccountsMenu.needTracking);
            List<String> list = officialAccountsMenu.children;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            OfficialAccountAction officialAccountAction = officialAccountsMenu.action;
            if (officialAccountAction != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(5, officialAccountAction, OfficialAccountAction.PROTOBUF_ADAPTER);
            }
            List<OfficialAccountsSubMenu> list2 = officialAccountsMenu.localMenus;
            if (list2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(6, list2, OfficialAccountsSubMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            officialAccountsMenu.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OfficialAccountsMenu parse(nc5 nc5Var) throws IOException {
            OfficialAccountsMenu officialAccountsMenu = new OfficialAccountsMenu();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (officialAccountsMenu.f21202id == null) {
                        officialAccountsMenu.f21202id = "";
                    }
                    if (officialAccountsMenu.text != null) {
                        break;
                    }
                    officialAccountsMenu.text = "";
                    break;
                }
                if (iM162497u == 10) {
                    officialAccountsMenu.f21202id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    officialAccountsMenu.text = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    officialAccountsMenu.needTracking = nc5Var.m162483g();
                } else if (iM162497u == 34) {
                    officialAccountsMenu.children = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 42) {
                    officialAccountsMenu.action = (OfficialAccountAction) nc5Var.m162488l(OfficialAccountAction.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 50) {
                        if (officialAccountsMenu.f21202id == null) {
                            officialAccountsMenu.f21202id = "";
                        }
                        if (officialAccountsMenu.text != null) {
                            break;
                        }
                        officialAccountsMenu.text = "";
                        return officialAccountsMenu;
                    }
                    officialAccountsMenu.localMenus = (List) nc5Var.m162488l(OfficialAccountsSubMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return officialAccountsMenu;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OfficialAccountsMenu officialAccountsMenu, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = officialAccountsMenu.f21202id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = officialAccountsMenu.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17299A(3, officialAccountsMenu.needTracking);
            List<String> list = officialAccountsMenu.children;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            OfficialAccountAction officialAccountAction = officialAccountsMenu.action;
            if (officialAccountAction != null) {
                codedOutputByteBufferNano.m17309K(5, officialAccountAction, OfficialAccountAction.PROTOBUF_ADAPTER);
            }
            List<OfficialAccountsSubMenu> list2 = officialAccountsMenu.localMenus;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(6, list2, OfficialAccountsSubMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OfficialAccountsMenu> JSON_ADAPTER = new ObjectJsonAdapter<OfficialAccountsMenu>() { // from class: com.p1.mobile.putong.core.data.OfficialAccountsMenu.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OfficialAccountsMenu.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OfficialAccountsMenu newInstance() {
            return new OfficialAccountsMenu();
        }

        public boolean parseField(OfficialAccountsMenu officialAccountsMenu, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "needTracking":
                    officialAccountsMenu.needTracking = jsonParser.getValueAsBoolean();
                    return true;
                case "action":
                    officialAccountsMenu.action = OfficialAccountAction.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    officialAccountsMenu.f21202id = jsonParser.getValueAsString();
                    return false;
                case "text":
                    officialAccountsMenu.text = jsonParser.getValueAsString();
                    return true;
                case "children":
                    officialAccountsMenu.children = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OfficialAccountsMenu officialAccountsMenu, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "needTracking":
                case "action":
                    return true;
                case "id":
                    return false;
                case "text":
                case "children":
                    return true;
                default:
                    return super.parseFieldCheck(officialAccountsMenu, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OfficialAccountsMenu officialAccountsMenu, JsonGenerator jsonGenerator) throws IOException {
            String str = officialAccountsMenu.f21202id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = officialAccountsMenu.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            jsonGenerator.writeBooleanField("needTracking", officialAccountsMenu.needTracking);
            if (officialAccountsMenu.children != null) {
                jsonGenerator.writeFieldName("children");
                JsonAdapter.serializeArray(officialAccountsMenu.children, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (officialAccountsMenu.action != null) {
                jsonGenerator.writeFieldName("action");
                OfficialAccountAction.JSON_ADAPTER.serialize(officialAccountsMenu.action, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OfficialAccountsMenu) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OfficialAccountsMenu) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36741b(String str) {
        return str;
    }

    public static OfficialAccountsMenu new_() {
        OfficialAccountsMenu officialAccountsMenu = new OfficialAccountsMenu();
        officialAccountsMenu.nullCheck();
        return officialAccountsMenu;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OfficialAccountsMenu mo225055clone() {
        OfficialAccountsMenu officialAccountsMenu = new OfficialAccountsMenu();
        officialAccountsMenu.f21202id = this.f21202id;
        officialAccountsMenu.text = this.text;
        officialAccountsMenu.needTracking = this.needTracking;
        List<String> list = this.children;
        if (list != null) {
            officialAccountsMenu.children = ValueObject.util_map(list, new qcj() { // from class: l.jb50
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OfficialAccountsMenu.m36741b((String) obj);
                }
            });
        }
        OfficialAccountAction officialAccountAction = this.action;
        if (officialAccountAction != null) {
            officialAccountsMenu.action = officialAccountAction.mo225055clone();
        }
        List<OfficialAccountsSubMenu> list2 = this.localMenus;
        if (list2 != null) {
            officialAccountsMenu.localMenus = ValueObject.util_map(list2, new qcj() { // from class: l.kb50
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((OfficialAccountsSubMenu) obj).mo225055clone();
                }
            });
        }
        return officialAccountsMenu;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfficialAccountsMenu)) {
            return false;
        }
        OfficialAccountsMenu officialAccountsMenu = (OfficialAccountsMenu) obj;
        return ValueObject.util_equals(this.f21202id, officialAccountsMenu.f21202id) && ValueObject.util_equals(this.text, officialAccountsMenu.text) && this.needTracking == officialAccountsMenu.needTracking && ValueObject.util_equals(this.children, officialAccountsMenu.children) && ValueObject.util_equals(this.action, officialAccountsMenu.action) && ValueObject.util_equals(this.localMenus, officialAccountsMenu.localMenus);
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
        String str = this.f21202id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.needTracking ? 1231 : 1237)) * 41;
        List<String> list = this.children;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        OfficialAccountAction officialAccountAction = this.action;
        int iHashCode4 = (iHashCode3 + (officialAccountAction != null ? officialAccountAction.hashCode() : 0)) * 41;
        List<OfficialAccountsSubMenu> list2 = this.localMenus;
        int iHashCode5 = iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21202id == null) {
            this.f21202id = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
