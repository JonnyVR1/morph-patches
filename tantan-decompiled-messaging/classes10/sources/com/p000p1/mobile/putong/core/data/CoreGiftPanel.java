package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CoreGiftPanel;
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
public class CoreGiftPanel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coregiftpanel";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> giftIds;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String f40id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;
    public static ProtobufAdapter<CoreGiftPanel> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreGiftPanel>() { // from class: com.p1.mobile.putong.core.data.CoreGiftPanel.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CoreGiftPanel coreGiftPanel) {
            List<String> list = coreGiftPanel.giftIds;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = coreGiftPanel.name;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = coreGiftPanel.f40id;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) coreGiftPanel).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CoreGiftPanel m12491parse(nb5 nb5Var) throws IOException {
            CoreGiftPanel coreGiftPanel = new CoreGiftPanel();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (coreGiftPanel.giftIds == null) {
                        coreGiftPanel.giftIds = new ArrayList();
                    }
                    if (coreGiftPanel.name == null) {
                        coreGiftPanel.name = "";
                    }
                    if (coreGiftPanel.f40id != null) {
                        break;
                    }
                    coreGiftPanel.f40id = "";
                    break;
                }
                if (iU == 10) {
                    coreGiftPanel.giftIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    coreGiftPanel.name = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (coreGiftPanel.giftIds == null) {
                            coreGiftPanel.giftIds = new ArrayList();
                        }
                        if (coreGiftPanel.name == null) {
                            coreGiftPanel.name = "";
                        }
                        if (coreGiftPanel.f40id != null) {
                            break;
                        }
                        coreGiftPanel.f40id = "";
                        return coreGiftPanel;
                    }
                    coreGiftPanel.f40id = nb5Var.s();
                }
            }
            return coreGiftPanel;
        }

        public void serialize(CoreGiftPanel coreGiftPanel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = coreGiftPanel.giftIds;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = coreGiftPanel.name;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = coreGiftPanel.f40id;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<CoreGiftPanel> JSON_ADAPTER = new ObjectJsonAdapter<CoreGiftPanel>() { // from class: com.p1.mobile.putong.core.data.CoreGiftPanel.2
        public Class getDataClass() {
            return CoreGiftPanel.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CoreGiftPanel m12492newInstance() {
            return new CoreGiftPanel();
        }

        public boolean parseField(CoreGiftPanel coreGiftPanel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    coreGiftPanel.f40id = jsonParser.getValueAsString();
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

        public void serializeFields(CoreGiftPanel coreGiftPanel, JsonGenerator jsonGenerator) throws IOException {
            if (coreGiftPanel.giftIds != null) {
                jsonGenerator.writeFieldName("giftIds");
                JsonAdapter.serializeArray(coreGiftPanel.giftIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = coreGiftPanel.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = coreGiftPanel.f40id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreGiftPanel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreGiftPanel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m282a(String str) {
        return str;
    }

    public static CoreGiftPanel new_() {
        CoreGiftPanel coreGiftPanel = new CoreGiftPanel();
        coreGiftPanel.nullCheck();
        return coreGiftPanel;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CoreGiftPanel m12490clone() {
        CoreGiftPanel coreGiftPanel = new CoreGiftPanel();
        List<String> list = this.giftIds;
        if (list != null) {
            coreGiftPanel.giftIds = ValueObject.util_map(list, new w9j() { // from class: l.ot8
                public final Object call(Object obj) {
                    return CoreGiftPanel.m282a((String) obj);
                }
            });
        }
        coreGiftPanel.name = this.name;
        coreGiftPanel.f40id = this.f40id;
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
        return ValueObject.util_equals(this.giftIds, coreGiftPanel.giftIds) && ValueObject.util_equals(this.name, coreGiftPanel.name) && ValueObject.util_equals(this.f40id, coreGiftPanel.f40id);
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
        List<String> list = this.giftIds;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f40id;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.giftIds == null) {
            this.giftIds = new ArrayList();
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.f40id == null) {
            this.f40id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
