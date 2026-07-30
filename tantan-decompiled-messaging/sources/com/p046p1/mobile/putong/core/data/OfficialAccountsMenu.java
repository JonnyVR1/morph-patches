package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p046p1.mobile.putong.core.data.OfficialAccountsSubMenu;
import com.p046p1.mobile.putong.data.OfficialAccountAction;
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
    public String f20460id;

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
            String str = officialAccountsMenu.f20460id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = officialAccountsMenu.text;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, officialAccountsMenu.needTracking);
            List<String> list = officialAccountsMenu.children;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            OfficialAccountAction officialAccountAction = officialAccountsMenu.action;
            if (officialAccountAction != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(5, officialAccountAction, OfficialAccountAction.PROTOBUF_ADAPTER);
            }
            List<OfficialAccountsSubMenu> list2 = officialAccountsMenu.localMenus;
            if (list2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(6, list2, OfficialAccountsSubMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            officialAccountsMenu.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OfficialAccountsMenu parse(nb5 nb5Var) throws IOException {
            OfficialAccountsMenu officialAccountsMenu = new OfficialAccountsMenu();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (officialAccountsMenu.f20460id == null) {
                        officialAccountsMenu.f20460id = "";
                    }
                    if (officialAccountsMenu.text != null) {
                        break;
                    }
                    officialAccountsMenu.text = "";
                    break;
                }
                if (iM158752u == 10) {
                    officialAccountsMenu.f20460id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    officialAccountsMenu.text = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    officialAccountsMenu.needTracking = nb5Var.m158738g();
                } else if (iM158752u == 34) {
                    officialAccountsMenu.children = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 42) {
                    officialAccountsMenu.action = (OfficialAccountAction) nb5Var.m158743l(OfficialAccountAction.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 50) {
                        if (officialAccountsMenu.f20460id == null) {
                            officialAccountsMenu.f20460id = "";
                        }
                        if (officialAccountsMenu.text != null) {
                            break;
                        }
                        officialAccountsMenu.text = "";
                        return officialAccountsMenu;
                    }
                    officialAccountsMenu.localMenus = (List) nb5Var.m158743l(OfficialAccountsSubMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return officialAccountsMenu;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OfficialAccountsMenu officialAccountsMenu, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = officialAccountsMenu.f20460id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = officialAccountsMenu.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, officialAccountsMenu.needTracking);
            List<String> list = officialAccountsMenu.children;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            OfficialAccountAction officialAccountAction = officialAccountsMenu.action;
            if (officialAccountAction != null) {
                codedOutputByteBufferNano.m17254K(5, officialAccountAction, OfficialAccountAction.PROTOBUF_ADAPTER);
            }
            List<OfficialAccountsSubMenu> list2 = officialAccountsMenu.localMenus;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(6, list2, OfficialAccountsSubMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OfficialAccountsMenu> JSON_ADAPTER = new ObjectJsonAdapter<OfficialAccountsMenu>() { // from class: com.p1.mobile.putong.core.data.OfficialAccountsMenu.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OfficialAccountsMenu.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    officialAccountsMenu.f20460id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OfficialAccountsMenu officialAccountsMenu, JsonGenerator jsonGenerator) throws IOException {
            String str = officialAccountsMenu.f20460id;
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OfficialAccountsMenu) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OfficialAccountsMenu) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35738b(String str) {
        return str;
    }

    public static OfficialAccountsMenu new_() {
        OfficialAccountsMenu officialAccountsMenu = new OfficialAccountsMenu();
        officialAccountsMenu.nullCheck();
        return officialAccountsMenu;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OfficialAccountsMenu mo223809clone() {
        OfficialAccountsMenu officialAccountsMenu = new OfficialAccountsMenu();
        officialAccountsMenu.f20460id = this.f20460id;
        officialAccountsMenu.text = this.text;
        officialAccountsMenu.needTracking = this.needTracking;
        List<String> list = this.children;
        if (list != null) {
            officialAccountsMenu.children = ValueObject.util_map(list, new w9j() { // from class: l.u250
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return OfficialAccountsMenu.m35738b((String) obj);
                }
            });
        }
        OfficialAccountAction officialAccountAction = this.action;
        if (officialAccountAction != null) {
            officialAccountsMenu.action = officialAccountAction.mo223809clone();
        }
        List<OfficialAccountsSubMenu> list2 = this.localMenus;
        if (list2 != null) {
            officialAccountsMenu.localMenus = ValueObject.util_map(list2, new w9j() { // from class: l.v250
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OfficialAccountsSubMenu) obj).mo223809clone();
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
        return ValueObject.util_equals(this.f20460id, officialAccountsMenu.f20460id) && ValueObject.util_equals(this.text, officialAccountsMenu.text) && this.needTracking == officialAccountsMenu.needTracking && ValueObject.util_equals(this.children, officialAccountsMenu.children) && ValueObject.util_equals(this.action, officialAccountsMenu.action) && ValueObject.util_equals(this.localMenus, officialAccountsMenu.localMenus);
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
        String str = this.f20460id;
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
        if (this.f20460id == null) {
            this.f20460id = "";
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
