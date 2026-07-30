package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.CoreGiftPanel;
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
public class CoreGiftPanel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coregiftpanel";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> giftIds;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f20378id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<CoreGiftPanel> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreGiftPanel>() { // from class: com.p1.mobile.putong.core.data.CoreGiftPanel.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreGiftPanel coreGiftPanel) {
            List<String> list = coreGiftPanel.giftIds;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = coreGiftPanel.name;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = coreGiftPanel.f20378id;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            coreGiftPanel.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreGiftPanel parse(nb5 nb5Var) throws IOException {
            CoreGiftPanel coreGiftPanel = new CoreGiftPanel();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (coreGiftPanel.giftIds == null) {
                        coreGiftPanel.giftIds = new ArrayList();
                    }
                    if (coreGiftPanel.name == null) {
                        coreGiftPanel.name = "";
                    }
                    if (coreGiftPanel.f20378id != null) {
                        break;
                    }
                    coreGiftPanel.f20378id = "";
                    break;
                }
                if (iM158752u == 10) {
                    coreGiftPanel.giftIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    coreGiftPanel.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (coreGiftPanel.giftIds == null) {
                            coreGiftPanel.giftIds = new ArrayList();
                        }
                        if (coreGiftPanel.name == null) {
                            coreGiftPanel.name = "";
                        }
                        if (coreGiftPanel.f20378id != null) {
                            break;
                        }
                        coreGiftPanel.f20378id = "";
                        return coreGiftPanel;
                    }
                    coreGiftPanel.f20378id = nb5Var.m158750s();
                }
            }
            return coreGiftPanel;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreGiftPanel coreGiftPanel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = coreGiftPanel.giftIds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = coreGiftPanel.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = coreGiftPanel.f20378id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<CoreGiftPanel> JSON_ADAPTER = new ObjectJsonAdapter<CoreGiftPanel>() { // from class: com.p1.mobile.putong.core.data.CoreGiftPanel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreGiftPanel.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreGiftPanel newInstance() {
            return new CoreGiftPanel();
        }

        public boolean parseField(CoreGiftPanel coreGiftPanel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    coreGiftPanel.f20378id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    coreGiftPanel.name = jsonParser.getValueAsString();
                    return true;
                case "giftIds":
                    coreGiftPanel.giftIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CoreGiftPanel coreGiftPanel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "name":
                case "giftIds":
                    return true;
                default:
                    return super.parseFieldCheck(coreGiftPanel, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreGiftPanel coreGiftPanel, JsonGenerator jsonGenerator) throws IOException {
            if (coreGiftPanel.giftIds != null) {
                jsonGenerator.writeFieldName("giftIds");
                JsonAdapter.serializeArray(coreGiftPanel.giftIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = coreGiftPanel.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = coreGiftPanel.f20378id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreGiftPanel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreGiftPanel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35480a(String str) {
        return str;
    }

    public static CoreGiftPanel new_() {
        CoreGiftPanel coreGiftPanel = new CoreGiftPanel();
        coreGiftPanel.nullCheck();
        return coreGiftPanel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreGiftPanel mo223809clone() {
        CoreGiftPanel coreGiftPanel = new CoreGiftPanel();
        List<String> list = this.giftIds;
        if (list != null) {
            coreGiftPanel.giftIds = ValueObject.util_map(list, new w9j() { // from class: l.ot8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreGiftPanel.m35480a((String) obj);
                }
            });
        }
        coreGiftPanel.name = this.name;
        coreGiftPanel.f20378id = this.f20378id;
        return coreGiftPanel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreGiftPanel)) {
            return false;
        }
        CoreGiftPanel coreGiftPanel = (CoreGiftPanel) obj;
        return ValueObject.util_equals(this.giftIds, coreGiftPanel.giftIds) && ValueObject.util_equals(this.name, coreGiftPanel.name) && ValueObject.util_equals(this.f20378id, coreGiftPanel.f20378id);
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
        List<String> list = this.giftIds;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f20378id;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftIds == null) {
            this.giftIds = new ArrayList();
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.f20378id == null) {
            this.f20378id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
