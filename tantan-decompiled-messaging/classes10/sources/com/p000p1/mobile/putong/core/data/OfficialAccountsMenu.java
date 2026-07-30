package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p000p1.mobile.putong.core.data.OfficialAccountsSubMenu;
import com.p1.mobile.putong.data.OfficialAccountAction;
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
public class OfficialAccountsMenu extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "officialaccountsmenu";

    @Nullable
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public OfficialAccountAction action;

    @Nullable
    @ProtobufIndex(index = 4)
    public List<String> children;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f122id;

    @Nullable
    @ProtobufIndex(index = 6)
    public List<OfficialAccountsSubMenu> localMenus;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean needTracking;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String text;
    public static ProtobufAdapter<OfficialAccountsMenu> PROTOBUF_ADAPTER = new MessageNanoAdapter<OfficialAccountsMenu>() { // from class: com.p1.mobile.putong.core.data.OfficialAccountsMenu.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OfficialAccountsMenu officialAccountsMenu) {
            String str = officialAccountsMenu.f122id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = officialAccountsMenu.text;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, officialAccountsMenu.needTracking);
            List<String> list = officialAccountsMenu.children;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            OfficialAccountAction officialAccountAction = officialAccountsMenu.action;
            if (officialAccountAction != null) {
                iB += CodedOutputByteBufferNano.l(5, officialAccountAction, OfficialAccountAction.PROTOBUF_ADAPTER);
            }
            List<OfficialAccountsSubMenu> list2 = officialAccountsMenu.localMenus;
            if (list2 != null) {
                iB += CodedOutputByteBufferNano.l(6, list2, OfficialAccountsSubMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) officialAccountsMenu).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OfficialAccountsMenu m14637parse(nb5 nb5Var) throws IOException {
            OfficialAccountsMenu officialAccountsMenu = new OfficialAccountsMenu();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (officialAccountsMenu.f122id == null) {
                        officialAccountsMenu.f122id = "";
                    }
                    if (officialAccountsMenu.text != null) {
                        break;
                    }
                    officialAccountsMenu.text = "";
                    break;
                }
                if (iU == 10) {
                    officialAccountsMenu.f122id = nb5Var.s();
                } else if (iU == 18) {
                    officialAccountsMenu.text = nb5Var.s();
                } else if (iU == 24) {
                    officialAccountsMenu.needTracking = nb5Var.g();
                } else if (iU == 34) {
                    officialAccountsMenu.children = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 42) {
                    officialAccountsMenu.action = (OfficialAccountAction) nb5Var.l(OfficialAccountAction.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
                        if (officialAccountsMenu.f122id == null) {
                            officialAccountsMenu.f122id = "";
                        }
                        if (officialAccountsMenu.text != null) {
                            break;
                        }
                        officialAccountsMenu.text = "";
                        return officialAccountsMenu;
                    }
                    officialAccountsMenu.localMenus = (List) nb5Var.l(OfficialAccountsSubMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return officialAccountsMenu;
        }

        public void serialize(OfficialAccountsMenu officialAccountsMenu, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = officialAccountsMenu.f122id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = officialAccountsMenu.text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, officialAccountsMenu.needTracking);
            List<String> list = officialAccountsMenu.children;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            OfficialAccountAction officialAccountAction = officialAccountsMenu.action;
            if (officialAccountAction != null) {
                codedOutputByteBufferNano.K(5, officialAccountAction, OfficialAccountAction.PROTOBUF_ADAPTER);
            }
            List<OfficialAccountsSubMenu> list2 = officialAccountsMenu.localMenus;
            if (list2 != null) {
                codedOutputByteBufferNano.K(6, list2, OfficialAccountsSubMenu.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OfficialAccountsMenu> JSON_ADAPTER = new ObjectJsonAdapter<OfficialAccountsMenu>() { // from class: com.p1.mobile.putong.core.data.OfficialAccountsMenu.2
        public Class getDataClass() {
            return OfficialAccountsMenu.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OfficialAccountsMenu m14638newInstance() {
            return new OfficialAccountsMenu();
        }

        public boolean parseField(OfficialAccountsMenu officialAccountsMenu, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "needTracking":
                    officialAccountsMenu.needTracking = jsonParser.getValueAsBoolean();
                    return true;
                case "action":
                    officialAccountsMenu.action = (OfficialAccountAction) OfficialAccountAction.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    officialAccountsMenu.f122id = jsonParser.getValueAsString();
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

        public void serializeFields(OfficialAccountsMenu officialAccountsMenu, JsonGenerator jsonGenerator) throws IOException {
            String str = officialAccountsMenu.f122id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OfficialAccountsMenu) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OfficialAccountsMenu) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m540b(String str) {
        return str;
    }

    public static OfficialAccountsMenu new_() {
        OfficialAccountsMenu officialAccountsMenu = new OfficialAccountsMenu();
        officialAccountsMenu.nullCheck();
        return officialAccountsMenu;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OfficialAccountsMenu m14636clone() {
        OfficialAccountsMenu officialAccountsMenu = new OfficialAccountsMenu();
        officialAccountsMenu.f122id = this.f122id;
        officialAccountsMenu.text = this.text;
        officialAccountsMenu.needTracking = this.needTracking;
        List<String> list = this.children;
        if (list != null) {
            officialAccountsMenu.children = ValueObject.util_map(list, new w9j() { // from class: l.u250
                public final Object call(Object obj) {
                    return OfficialAccountsMenu.m540b((String) obj);
                }
            });
        }
        OfficialAccountAction officialAccountAction = this.action;
        if (officialAccountAction != null) {
            officialAccountsMenu.action = officialAccountAction.clone();
        }
        List<OfficialAccountsSubMenu> list2 = this.localMenus;
        if (list2 != null) {
            officialAccountsMenu.localMenus = ValueObject.util_map(list2, new w9j() { // from class: l.v250
                public final Object call(Object obj) {
                    return ((OfficialAccountsSubMenu) obj).m14640clone();
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
        return ValueObject.util_equals(this.f122id, officialAccountsMenu.f122id) && ValueObject.util_equals(this.text, officialAccountsMenu.text) && this.needTracking == officialAccountsMenu.needTracking && ValueObject.util_equals(this.children, officialAccountsMenu.children) && ValueObject.util_equals(this.action, officialAccountsMenu.action) && ValueObject.util_equals(this.localMenus, officialAccountsMenu.localMenus);
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
        String str = this.f122id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.needTracking ? 1231 : 1237)) * 41;
        List<String> list = this.children;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        OfficialAccountAction officialAccountAction = this.action;
        int iHashCode4 = (iHashCode3 + (officialAccountAction != null ? officialAccountAction.hashCode() : 0)) * 41;
        List<OfficialAccountsSubMenu> list2 = this.localMenus;
        int iHashCode5 = iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.f122id == null) {
            this.f122id = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
