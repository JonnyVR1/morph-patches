package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.DecorationPropsItem;
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
public class DecorationProps extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "decorationprops";

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public long expiredTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f48id;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<DecorationPropsItem> items;

    @ProtobufIndex(index = 4)
    public boolean open;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String text;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<DecorationProps> PROTOBUF_ADAPTER = new MessageNanoAdapter<DecorationProps>() { // from class: com.p1.mobile.putong.core.data.DecorationProps.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DecorationProps decorationProps) {
            String str = decorationProps.f48id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = decorationProps.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = decorationProps.text;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, decorationProps.open) + CodedOutputByteBufferNano.j(5, decorationProps.expiredTime);
            List<DecorationPropsItem> list = decorationProps.items;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(6, list, DecorationPropsItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) decorationProps).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DecorationProps m12599parse(nb5 nb5Var) throws IOException {
            DecorationProps decorationProps = new DecorationProps();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (decorationProps.f48id == null) {
                        decorationProps.f48id = "";
                    }
                    if (decorationProps.type == null) {
                        decorationProps.type = "";
                    }
                    if (decorationProps.text == null) {
                        decorationProps.text = "";
                    }
                    if (decorationProps.items != null) {
                        break;
                    }
                    decorationProps.items = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    decorationProps.f48id = nb5Var.s();
                } else if (iU == 18) {
                    decorationProps.type = nb5Var.s();
                } else if (iU == 26) {
                    decorationProps.text = nb5Var.s();
                } else if (iU == 32) {
                    decorationProps.open = nb5Var.g();
                } else if (iU == 40) {
                    decorationProps.expiredTime = nb5Var.k();
                } else {
                    if (iU != 50) {
                        if (decorationProps.f48id == null) {
                            decorationProps.f48id = "";
                        }
                        if (decorationProps.type == null) {
                            decorationProps.type = "";
                        }
                        if (decorationProps.text == null) {
                            decorationProps.text = "";
                        }
                        if (decorationProps.items != null) {
                            break;
                        }
                        decorationProps.items = new ArrayList();
                        return decorationProps;
                    }
                    decorationProps.items = (List) nb5Var.l(DecorationPropsItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return decorationProps;
        }

        public void serialize(DecorationProps decorationProps, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = decorationProps.f48id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = decorationProps.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = decorationProps.text;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.A(4, decorationProps.open);
            codedOutputByteBufferNano.I(5, decorationProps.expiredTime);
            List<DecorationPropsItem> list = decorationProps.items;
            if (list != null) {
                codedOutputByteBufferNano.K(6, list, DecorationPropsItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<DecorationProps> JSON_ADAPTER = new ObjectJsonAdapter<DecorationProps>() { // from class: com.p1.mobile.putong.core.data.DecorationProps.2
        public Class getDataClass() {
            return DecorationProps.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public DecorationProps m12600newInstance() {
            return new DecorationProps();
        }

        public boolean parseField(DecorationProps decorationProps, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expiredTime":
                    decorationProps.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    decorationProps.f48id = jsonParser.getValueAsString();
                    return false;
                case "open":
                    decorationProps.open = jsonParser.getValueAsBoolean();
                    return true;
                case "text":
                    decorationProps.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    decorationProps.type = jsonParser.getValueAsString();
                    return true;
                case "items":
                    decorationProps.items = JsonAdapter.parseArray(jsonParser, DecorationPropsItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DecorationProps decorationProps, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expiredTime":
                    return true;
                case "id":
                    return false;
                case "open":
                case "text":
                case "type":
                case "items":
                    return true;
                default:
                    return super.parseFieldCheck(decorationProps, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(DecorationProps decorationProps, JsonGenerator jsonGenerator) throws IOException {
            String str = decorationProps.f48id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = decorationProps.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = decorationProps.text;
            if (str3 != null) {
                jsonGenerator.writeStringField("text", str3);
            }
            jsonGenerator.writeNumberField("expiredTime", decorationProps.expiredTime);
            jsonGenerator.writeBooleanField("open", decorationProps.open);
            if (decorationProps.items != null) {
                jsonGenerator.writeFieldName("items");
                JsonAdapter.serializeArray(decorationProps.items, jsonGenerator, DecorationPropsItem.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DecorationProps) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DecorationProps) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DecorationProps new_() {
        DecorationProps decorationProps = new DecorationProps();
        decorationProps.nullCheck();
        return decorationProps;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DecorationProps m12598clone() {
        DecorationProps decorationProps = new DecorationProps();
        decorationProps.f48id = this.f48id;
        decorationProps.type = this.type;
        decorationProps.text = this.text;
        decorationProps.expiredTime = this.expiredTime;
        decorationProps.open = this.open;
        List<DecorationPropsItem> list = this.items;
        if (list != null) {
            decorationProps.items = ValueObject.util_map(list, new w9j() { // from class: l.ohd
                public final Object call(Object obj) {
                    return ((DecorationPropsItem) obj).m12602clone();
                }
            });
        }
        return decorationProps;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DecorationProps)) {
            return false;
        }
        DecorationProps decorationProps = (DecorationProps) obj;
        return ValueObject.util_equals(this.f48id, decorationProps.f48id) && ValueObject.util_equals(this.type, decorationProps.type) && ValueObject.util_equals(this.text, decorationProps.text) && this.expiredTime == decorationProps.expiredTime && this.open == decorationProps.open && ValueObject.util_equals(this.items, decorationProps.items);
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
        String str = this.f48id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.text;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.expiredTime;
        int i3 = (((((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.open ? 1231 : 1237)) * 41;
        List<DecorationPropsItem> list = this.items;
        int iHashCode4 = i3 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f48id == null) {
            this.f48id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.items == null) {
            this.items = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
