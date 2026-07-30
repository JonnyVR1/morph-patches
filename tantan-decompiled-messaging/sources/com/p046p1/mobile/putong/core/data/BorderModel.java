package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.BorderModel;
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
public class BorderModel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bordermodel";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> style;
    public static ProtobufAdapter<BorderModel> PROTOBUF_ADAPTER = new MessageNanoAdapter<BorderModel>() { // from class: com.p1.mobile.putong.core.data.BorderModel.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BorderModel borderModel) {
            List<String> list = borderModel.style;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            borderModel.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BorderModel parse(nb5 nb5Var) throws IOException {
            BorderModel borderModel = new BorderModel();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (borderModel.style != null) {
                        break;
                    }
                    borderModel.style = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (borderModel.style != null) {
                        break;
                    }
                    borderModel.style = new ArrayList();
                    return borderModel;
                }
                borderModel.style = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return borderModel;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BorderModel borderModel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = borderModel.style;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<BorderModel> JSON_ADAPTER = new ObjectJsonAdapter<BorderModel>() { // from class: com.p1.mobile.putong.core.data.BorderModel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BorderModel.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BorderModel newInstance() {
            return new BorderModel();
        }

        public boolean parseField(BorderModel borderModel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("style")) {
                return false;
            }
            borderModel.style = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BorderModel borderModel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("style")) {
                return true;
            }
            return super.parseFieldCheck(borderModel, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BorderModel borderModel, JsonGenerator jsonGenerator) throws IOException {
            if (borderModel.style != null) {
                jsonGenerator.writeFieldName("style");
                JsonAdapter.serializeArray(borderModel.style, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BorderModel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BorderModel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35226a(String str) {
        return str;
    }

    public static BorderModel new_() {
        BorderModel borderModel = new BorderModel();
        borderModel.nullCheck();
        return borderModel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BorderModel mo223809clone() {
        BorderModel borderModel = new BorderModel();
        List<String> list = this.style;
        if (list != null) {
            borderModel.style = ValueObject.util_map(list, new w9j() { // from class: l.ga3
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BorderModel.m35226a((String) obj);
                }
            });
        }
        return borderModel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BorderModel) {
            return ValueObject.util_equals(this.style, ((BorderModel) obj).style);
        }
        return false;
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
        List<String> list = this.style;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.style == null) {
            this.style = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
