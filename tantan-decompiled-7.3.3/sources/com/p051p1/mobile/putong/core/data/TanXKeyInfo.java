package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.TanXKeyInfo;
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
public class TanXKeyInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tanxkeyinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> contents;

    @NonNull
    @ProtobufIndex(index = 1)
    public String iconType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<TanXKeyInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<TanXKeyInfo>() { // from class: com.p1.mobile.putong.core.data.TanXKeyInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TanXKeyInfo tanXKeyInfo) {
            String str = tanXKeyInfo.iconType;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = tanXKeyInfo.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<String> list = tanXKeyInfo.contents;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            tanXKeyInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TanXKeyInfo parse(nc5 nc5Var) throws IOException {
            TanXKeyInfo tanXKeyInfo = new TanXKeyInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (tanXKeyInfo.iconType == null) {
                        tanXKeyInfo.iconType = "";
                    }
                    if (tanXKeyInfo.type == null) {
                        tanXKeyInfo.type = "";
                    }
                    if (tanXKeyInfo.contents != null) {
                        break;
                    }
                    tanXKeyInfo.contents = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    tanXKeyInfo.iconType = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    tanXKeyInfo.type = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (tanXKeyInfo.iconType == null) {
                            tanXKeyInfo.iconType = "";
                        }
                        if (tanXKeyInfo.type == null) {
                            tanXKeyInfo.type = "";
                        }
                        if (tanXKeyInfo.contents != null) {
                            break;
                        }
                        tanXKeyInfo.contents = new ArrayList();
                        return tanXKeyInfo;
                    }
                    tanXKeyInfo.contents = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return tanXKeyInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TanXKeyInfo tanXKeyInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tanXKeyInfo.iconType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = tanXKeyInfo.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<String> list = tanXKeyInfo.contents;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<TanXKeyInfo> JSON_ADAPTER = new ObjectJsonAdapter<TanXKeyInfo>() { // from class: com.p1.mobile.putong.core.data.TanXKeyInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TanXKeyInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TanXKeyInfo newInstance() {
            return new TanXKeyInfo();
        }

        public boolean parseField(TanXKeyInfo tanXKeyInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "iconType":
                    tanXKeyInfo.iconType = jsonParser.getValueAsString();
                    return true;
                case "contents":
                    tanXKeyInfo.contents = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    tanXKeyInfo.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TanXKeyInfo tanXKeyInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "iconType":
                case "contents":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(tanXKeyInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TanXKeyInfo tanXKeyInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = tanXKeyInfo.iconType;
            if (str != null) {
                jsonGenerator.writeStringField("iconType", str);
            }
            String str2 = tanXKeyInfo.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (tanXKeyInfo.contents != null) {
                jsonGenerator.writeFieldName("contents");
                JsonAdapter.serializeArray(tanXKeyInfo.contents, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TanXKeyInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TanXKeyInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36873a(String str) {
        return str;
    }

    public static TanXKeyInfo new_() {
        TanXKeyInfo tanXKeyInfo = new TanXKeyInfo();
        tanXKeyInfo.nullCheck();
        return tanXKeyInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TanXKeyInfo mo225055clone() {
        TanXKeyInfo tanXKeyInfo = new TanXKeyInfo();
        tanXKeyInfo.iconType = this.iconType;
        tanXKeyInfo.type = this.type;
        List<String> list = this.contents;
        if (list != null) {
            tanXKeyInfo.contents = ValueObject.util_map(list, new qcj() { // from class: l.i9i0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return TanXKeyInfo.m36873a((String) obj);
                }
            });
        }
        return tanXKeyInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TanXKeyInfo)) {
            return false;
        }
        TanXKeyInfo tanXKeyInfo = (TanXKeyInfo) obj;
        return ValueObject.util_equals(this.iconType, tanXKeyInfo.iconType) && ValueObject.util_equals(this.type, tanXKeyInfo.type) && ValueObject.util_equals(this.contents, tanXKeyInfo.contents);
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
        String str = this.iconType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.contents;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.iconType == null) {
            this.iconType = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.contents == null) {
            this.contents = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
