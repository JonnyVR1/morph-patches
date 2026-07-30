package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class OfficialAccountsSubMenu extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "officialaccountssubmenu";

    @Nullable
    @ProtobufIndex(index = 4)
    public OfficialAccountAction action;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f123id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean needTracking;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String text;
    public static ProtobufAdapter<OfficialAccountsSubMenu> PROTOBUF_ADAPTER = new MessageNanoAdapter<OfficialAccountsSubMenu>() { // from class: com.p1.mobile.putong.core.data.OfficialAccountsSubMenu.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OfficialAccountsSubMenu officialAccountsSubMenu) {
            String str = officialAccountsSubMenu.f123id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = officialAccountsSubMenu.text;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, officialAccountsSubMenu.needTracking);
            OfficialAccountAction officialAccountAction = officialAccountsSubMenu.action;
            if (officialAccountAction != null) {
                iB += CodedOutputByteBufferNano.l(4, officialAccountAction, OfficialAccountAction.PROTOBUF_ADAPTER);
            }
            ((MessageNano) officialAccountsSubMenu).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OfficialAccountsSubMenu m14641parse(nb5 nb5Var) throws IOException {
            OfficialAccountsSubMenu officialAccountsSubMenu = new OfficialAccountsSubMenu();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (officialAccountsSubMenu.f123id == null) {
                        officialAccountsSubMenu.f123id = "";
                    }
                    if (officialAccountsSubMenu.text != null) {
                        break;
                    }
                    officialAccountsSubMenu.text = "";
                    break;
                }
                if (iU == 10) {
                    officialAccountsSubMenu.f123id = nb5Var.s();
                } else if (iU == 18) {
                    officialAccountsSubMenu.text = nb5Var.s();
                } else if (iU == 24) {
                    officialAccountsSubMenu.needTracking = nb5Var.g();
                } else {
                    if (iU != 34) {
                        if (officialAccountsSubMenu.f123id == null) {
                            officialAccountsSubMenu.f123id = "";
                        }
                        if (officialAccountsSubMenu.text != null) {
                            break;
                        }
                        officialAccountsSubMenu.text = "";
                        return officialAccountsSubMenu;
                    }
                    officialAccountsSubMenu.action = (OfficialAccountAction) nb5Var.l(OfficialAccountAction.PROTOBUF_ADAPTER);
                }
            }
            return officialAccountsSubMenu;
        }

        public void serialize(OfficialAccountsSubMenu officialAccountsSubMenu, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = officialAccountsSubMenu.f123id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = officialAccountsSubMenu.text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, officialAccountsSubMenu.needTracking);
            OfficialAccountAction officialAccountAction = officialAccountsSubMenu.action;
            if (officialAccountAction != null) {
                codedOutputByteBufferNano.K(4, officialAccountAction, OfficialAccountAction.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OfficialAccountsSubMenu> JSON_ADAPTER = new ObjectJsonAdapter<OfficialAccountsSubMenu>() { // from class: com.p1.mobile.putong.core.data.OfficialAccountsSubMenu.2
        public Class getDataClass() {
            return OfficialAccountsSubMenu.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OfficialAccountsSubMenu m14642newInstance() {
            return new OfficialAccountsSubMenu();
        }

        public boolean parseField(OfficialAccountsSubMenu officialAccountsSubMenu, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "needTracking":
                    officialAccountsSubMenu.needTracking = jsonParser.getValueAsBoolean();
                    return true;
                case "action":
                    officialAccountsSubMenu.action = (OfficialAccountAction) OfficialAccountAction.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    officialAccountsSubMenu.f123id = jsonParser.getValueAsString();
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

        public void serializeFields(OfficialAccountsSubMenu officialAccountsSubMenu, JsonGenerator jsonGenerator) throws IOException {
            String str = officialAccountsSubMenu.f123id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OfficialAccountsSubMenu) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OfficialAccountsSubMenu) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OfficialAccountsSubMenu new_() {
        OfficialAccountsSubMenu officialAccountsSubMenu = new OfficialAccountsSubMenu();
        officialAccountsSubMenu.nullCheck();
        return officialAccountsSubMenu;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OfficialAccountsSubMenu m14640clone() {
        OfficialAccountsSubMenu officialAccountsSubMenu = new OfficialAccountsSubMenu();
        officialAccountsSubMenu.f123id = this.f123id;
        officialAccountsSubMenu.text = this.text;
        officialAccountsSubMenu.needTracking = this.needTracking;
        OfficialAccountAction officialAccountAction = this.action;
        if (officialAccountAction != null) {
            officialAccountsSubMenu.action = officialAccountAction.clone();
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
        return ValueObject.util_equals(this.f123id, officialAccountsSubMenu.f123id) && ValueObject.util_equals(this.text, officialAccountsSubMenu.text) && this.needTracking == officialAccountsSubMenu.needTracking && ValueObject.util_equals(this.action, officialAccountsSubMenu.action);
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
        String str = this.f123id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.needTracking ? 1231 : 1237)) * 41;
        OfficialAccountAction officialAccountAction = this.action;
        int iHashCode3 = iHashCode2 + (officialAccountAction != null ? officialAccountAction.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f123id == null) {
            this.f123id = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
