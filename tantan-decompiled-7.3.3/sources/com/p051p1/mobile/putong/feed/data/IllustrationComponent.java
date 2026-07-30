package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.IllustrationComponent;
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

/* JADX INFO: loaded from: classes13.dex */
public class IllustrationComponent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "illustrationcomponent";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> imgs;
    public static ProtobufAdapter<IllustrationComponent> PROTOBUF_ADAPTER = new MessageNanoAdapter<IllustrationComponent>() { // from class: com.p1.mobile.putong.feed.data.IllustrationComponent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IllustrationComponent illustrationComponent) {
            List<String> list = illustrationComponent.imgs;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            illustrationComponent.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IllustrationComponent parse(nc5 nc5Var) throws IOException {
            IllustrationComponent illustrationComponent = new IllustrationComponent();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (illustrationComponent.imgs != null) {
                        break;
                    }
                    illustrationComponent.imgs = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (illustrationComponent.imgs != null) {
                        break;
                    }
                    illustrationComponent.imgs = new ArrayList();
                    return illustrationComponent;
                }
                illustrationComponent.imgs = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return illustrationComponent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IllustrationComponent illustrationComponent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = illustrationComponent.imgs;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IllustrationComponent> JSON_ADAPTER = new ObjectJsonAdapter<IllustrationComponent>() { // from class: com.p1.mobile.putong.feed.data.IllustrationComponent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IllustrationComponent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IllustrationComponent newInstance() {
            return new IllustrationComponent();
        }

        public boolean parseField(IllustrationComponent illustrationComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("imgs")) {
                return false;
            }
            illustrationComponent.imgs = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IllustrationComponent illustrationComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("imgs")) {
                return true;
            }
            return super.parseFieldCheck(illustrationComponent, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IllustrationComponent illustrationComponent, JsonGenerator jsonGenerator) throws IOException {
            if (illustrationComponent.imgs != null) {
                jsonGenerator.writeFieldName("imgs");
                JsonAdapter.serializeArray(illustrationComponent.imgs, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IllustrationComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IllustrationComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m62034a(String str) {
        return str;
    }

    public static IllustrationComponent new_() {
        IllustrationComponent illustrationComponent = new IllustrationComponent();
        illustrationComponent.nullCheck();
        return illustrationComponent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IllustrationComponent mo225055clone() {
        IllustrationComponent illustrationComponent = new IllustrationComponent();
        List<String> list = this.imgs;
        if (list != null) {
            illustrationComponent.imgs = ValueObject.util_map(list, new qcj() { // from class: l.yfm
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IllustrationComponent.m62034a((String) obj);
                }
            });
        }
        return illustrationComponent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IllustrationComponent) {
            return ValueObject.util_equals(this.imgs, ((IllustrationComponent) obj).imgs);
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
        List<String> list = this.imgs;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.imgs == null) {
            this.imgs = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
