package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class OfficialAccountsSubMenu extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "officialaccountssubmenu";

    @Nullable
    @ProtobufIndex(index = 4)
    public OfficialAccountAction action;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20461id;

    @ProtobufIndex(index = 3)
    public boolean needTracking;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;
    public static ProtobufAdapter<OfficialAccountsSubMenu> PROTOBUF_ADAPTER = new MessageNanoAdapter<OfficialAccountsSubMenu>() { // from class: com.p1.mobile.putong.core.data.OfficialAccountsSubMenu.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OfficialAccountsSubMenu officialAccountsSubMenu) {
            String str = officialAccountsSubMenu.f20461id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = officialAccountsSubMenu.text;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, officialAccountsSubMenu.needTracking);
            OfficialAccountAction officialAccountAction = officialAccountsSubMenu.action;
            if (officialAccountAction != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(4, officialAccountAction, OfficialAccountAction.PROTOBUF_ADAPTER);
            }
            officialAccountsSubMenu.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OfficialAccountsSubMenu parse(nb5 nb5Var) throws IOException {
            OfficialAccountsSubMenu officialAccountsSubMenu = new OfficialAccountsSubMenu();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (officialAccountsSubMenu.f20461id == null) {
                        officialAccountsSubMenu.f20461id = "";
                    }
                    if (officialAccountsSubMenu.text != null) {
                        break;
                    }
                    officialAccountsSubMenu.text = "";
                    break;
                }
                if (iM158752u == 10) {
                    officialAccountsSubMenu.f20461id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    officialAccountsSubMenu.text = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    officialAccountsSubMenu.needTracking = nb5Var.m158738g();
                } else {
                    if (iM158752u != 34) {
                        if (officialAccountsSubMenu.f20461id == null) {
                            officialAccountsSubMenu.f20461id = "";
                        }
                        if (officialAccountsSubMenu.text != null) {
                            break;
                        }
                        officialAccountsSubMenu.text = "";
                        return officialAccountsSubMenu;
                    }
                    officialAccountsSubMenu.action = (OfficialAccountAction) nb5Var.m158743l(OfficialAccountAction.PROTOBUF_ADAPTER);
                }
            }
            return officialAccountsSubMenu;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OfficialAccountsSubMenu officialAccountsSubMenu, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = officialAccountsSubMenu.f20461id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = officialAccountsSubMenu.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, officialAccountsSubMenu.needTracking);
            OfficialAccountAction officialAccountAction = officialAccountsSubMenu.action;
            if (officialAccountAction != null) {
                codedOutputByteBufferNano.m17254K(4, officialAccountAction, OfficialAccountAction.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OfficialAccountsSubMenu> JSON_ADAPTER = new ObjectJsonAdapter<OfficialAccountsSubMenu>() { // from class: com.p1.mobile.putong.core.data.OfficialAccountsSubMenu.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OfficialAccountsSubMenu.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OfficialAccountsSubMenu newInstance() {
            return new OfficialAccountsSubMenu();
        }

        public boolean parseField(OfficialAccountsSubMenu officialAccountsSubMenu, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "needTracking":
                    officialAccountsSubMenu.needTracking = jsonParser.getValueAsBoolean();
                    return true;
                case "action":
                    officialAccountsSubMenu.action = OfficialAccountAction.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    officialAccountsSubMenu.f20461id = jsonParser.getValueAsString();
                    return false;
                case "text":
                    officialAccountsSubMenu.text = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OfficialAccountsSubMenu officialAccountsSubMenu, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "needTracking":
                case "action":
                    return true;
                case "id":
                    return false;
                case "text":
                    return true;
                default:
                    return super.parseFieldCheck(officialAccountsSubMenu, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OfficialAccountsSubMenu officialAccountsSubMenu, JsonGenerator jsonGenerator) throws IOException {
            String str = officialAccountsSubMenu.f20461id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = officialAccountsSubMenu.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            jsonGenerator.writeBooleanField("needTracking", officialAccountsSubMenu.needTracking);
            if (officialAccountsSubMenu.action != null) {
                jsonGenerator.writeFieldName("action");
                OfficialAccountAction.JSON_ADAPTER.serialize(officialAccountsSubMenu.action, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OfficialAccountsSubMenu) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OfficialAccountsSubMenu) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OfficialAccountsSubMenu new_() {
        OfficialAccountsSubMenu officialAccountsSubMenu = new OfficialAccountsSubMenu();
        officialAccountsSubMenu.nullCheck();
        return officialAccountsSubMenu;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OfficialAccountsSubMenu mo223809clone() {
        OfficialAccountsSubMenu officialAccountsSubMenu = new OfficialAccountsSubMenu();
        officialAccountsSubMenu.f20461id = this.f20461id;
        officialAccountsSubMenu.text = this.text;
        officialAccountsSubMenu.needTracking = this.needTracking;
        OfficialAccountAction officialAccountAction = this.action;
        if (officialAccountAction != null) {
            officialAccountsSubMenu.action = officialAccountAction.mo223809clone();
        }
        return officialAccountsSubMenu;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfficialAccountsSubMenu)) {
            return false;
        }
        OfficialAccountsSubMenu officialAccountsSubMenu = (OfficialAccountsSubMenu) obj;
        return ValueObject.util_equals(this.f20461id, officialAccountsSubMenu.f20461id) && ValueObject.util_equals(this.text, officialAccountsSubMenu.text) && this.needTracking == officialAccountsSubMenu.needTracking && ValueObject.util_equals(this.action, officialAccountsSubMenu.action);
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
        String str = this.f20461id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.needTracking ? 1231 : 1237)) * 41;
        OfficialAccountAction officialAccountAction = this.action;
        int iHashCode3 = iHashCode2 + (officialAccountAction != null ? officialAccountAction.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20461id == null) {
            this.f20461id = "";
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
