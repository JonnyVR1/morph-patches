package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.DecorationPropsItem;
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
public class DecorationProps extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "decorationprops";

    @ProtobufIndex(index = 5)
    public long expiredTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21128id;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<DecorationPropsItem> items;

    @ProtobufIndex(index = 4)
    public boolean open;

    @NonNull
    @ProtobufIndex(index = 3)
    public String text;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<DecorationProps> PROTOBUF_ADAPTER = new MessageNanoAdapter<DecorationProps>() { // from class: com.p1.mobile.putong.core.data.DecorationProps.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DecorationProps decorationProps) {
            String str = decorationProps.f21128id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = decorationProps.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = decorationProps.text;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(4, decorationProps.open) + CodedOutputByteBufferNano.m17283j(5, decorationProps.expiredTime);
            List<DecorationPropsItem> list = decorationProps.items;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(6, list, DecorationPropsItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            decorationProps.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DecorationProps parse(nc5 nc5Var) throws IOException {
            DecorationProps decorationProps = new DecorationProps();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (decorationProps.f21128id == null) {
                        decorationProps.f21128id = "";
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
                if (iM162497u == 10) {
                    decorationProps.f21128id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    decorationProps.type = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    decorationProps.text = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    decorationProps.open = nc5Var.m162483g();
                } else if (iM162497u == 40) {
                    decorationProps.expiredTime = nc5Var.m162487k();
                } else {
                    if (iM162497u != 50) {
                        if (decorationProps.f21128id == null) {
                            decorationProps.f21128id = "";
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
                    decorationProps.items = (List) nc5Var.m162488l(DecorationPropsItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return decorationProps;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DecorationProps decorationProps, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = decorationProps.f21128id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = decorationProps.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = decorationProps.text;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            codedOutputByteBufferNano.m17299A(4, decorationProps.open);
            codedOutputByteBufferNano.m17307I(5, decorationProps.expiredTime);
            List<DecorationPropsItem> list = decorationProps.items;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(6, list, DecorationPropsItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<DecorationProps> JSON_ADAPTER = new ObjectJsonAdapter<DecorationProps>() { // from class: com.p1.mobile.putong.core.data.DecorationProps.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DecorationProps.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DecorationProps newInstance() {
            return new DecorationProps();
        }

        public boolean parseField(DecorationProps decorationProps, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expiredTime":
                    decorationProps.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    decorationProps.f21128id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DecorationProps decorationProps, JsonGenerator jsonGenerator) throws IOException {
            String str = decorationProps.f21128id;
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
                jsonGenerator.writeFieldName(FirebaseAnalytics.Param.ITEMS);
                JsonAdapter.serializeArray(decorationProps.items, jsonGenerator, DecorationPropsItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DecorationProps) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DecorationProps) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DecorationProps new_() {
        DecorationProps decorationProps = new DecorationProps();
        decorationProps.nullCheck();
        return decorationProps;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DecorationProps mo225055clone() {
        DecorationProps decorationProps = new DecorationProps();
        decorationProps.f21128id = this.f21128id;
        decorationProps.type = this.type;
        decorationProps.text = this.text;
        decorationProps.expiredTime = this.expiredTime;
        decorationProps.open = this.open;
        List<DecorationPropsItem> list = this.items;
        if (list != null) {
            decorationProps.items = ValueObject.util_map(list, new qcj() { // from class: l.uid
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((DecorationPropsItem) obj).mo225055clone();
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
        return ValueObject.util_equals(this.f21128id, decorationProps.f21128id) && ValueObject.util_equals(this.type, decorationProps.type) && ValueObject.util_equals(this.text, decorationProps.text) && this.expiredTime == decorationProps.expiredTime && this.open == decorationProps.open && ValueObject.util_equals(this.items, decorationProps.items);
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
        String str = this.f21128id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.text;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.expiredTime;
        int i3 = (((((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.open ? 1231 : 1237)) * 41;
        List<DecorationPropsItem> list = this.items;
        int iHashCode4 = i3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21128id == null) {
            this.f21128id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
