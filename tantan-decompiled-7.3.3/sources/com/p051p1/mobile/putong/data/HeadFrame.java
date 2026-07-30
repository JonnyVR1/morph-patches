package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.HeadFrame;
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

/* JADX INFO: loaded from: classes12.dex */
public class HeadFrame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "headframe";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Double> expiredTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> url;
    public static ProtobufAdapter<HeadFrame> PROTOBUF_ADAPTER = new MessageNanoAdapter<HeadFrame>() { // from class: com.p1.mobile.putong.data.HeadFrame.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HeadFrame headFrame) {
            List<String> list = headFrame.url;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Double> list2 = headFrame.expiredTime;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            headFrame.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HeadFrame parse(nc5 nc5Var) throws IOException {
            HeadFrame headFrame = new HeadFrame();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (headFrame.url == null) {
                        headFrame.url = new ArrayList();
                    }
                    if (headFrame.expiredTime != null) {
                        break;
                    }
                    headFrame.expiredTime = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    headFrame.url = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (headFrame.url == null) {
                            headFrame.url = new ArrayList();
                        }
                        if (headFrame.expiredTime != null) {
                            break;
                        }
                        headFrame.expiredTime = new ArrayList();
                        return headFrame;
                    }
                    headFrame.expiredTime = (List) nc5Var.m162488l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return headFrame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HeadFrame headFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = headFrame.url;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Double> list2 = headFrame.expiredTime;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<HeadFrame> JSON_ADAPTER = new ObjectJsonAdapter<HeadFrame>() { // from class: com.p1.mobile.putong.data.HeadFrame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HeadFrame.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HeadFrame newInstance() {
            return new HeadFrame();
        }

        public boolean parseField(HeadFrame headFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("expiredTime")) {
                headFrame.expiredTime = JsonAdapter.parseArray(jsonParser, Converter.API_TIME, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("url")) {
                return false;
            }
            headFrame.url = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(HeadFrame headFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("expiredTime") || str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(headFrame, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HeadFrame headFrame, JsonGenerator jsonGenerator) throws IOException {
            if (headFrame.url != null) {
                jsonGenerator.writeFieldName("url");
                JsonAdapter.serializeArray(headFrame.url, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (headFrame.expiredTime != null) {
                jsonGenerator.writeFieldName("expiredTime");
                JsonAdapter.serializeArray(headFrame.expiredTime, jsonGenerator, Converter.API_TIME);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HeadFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HeadFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60985a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Double m60986b(Double d) {
        return d;
    }

    public static HeadFrame new_() {
        HeadFrame headFrame = new HeadFrame();
        headFrame.nullCheck();
        return headFrame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HeadFrame mo225055clone() {
        HeadFrame headFrame = new HeadFrame();
        List<String> list = this.url;
        if (list != null) {
            headFrame.url = ValueObject.util_map(list, new qcj() { // from class: l.czk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return HeadFrame.m60985a((String) obj);
                }
            });
        }
        List<Double> list2 = this.expiredTime;
        if (list2 != null) {
            headFrame.expiredTime = ValueObject.util_map(list2, new qcj() { // from class: l.dzk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return HeadFrame.m60986b((Double) obj);
                }
            });
        }
        return headFrame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeadFrame)) {
            return false;
        }
        HeadFrame headFrame = (HeadFrame) obj;
        return ValueObject.util_equals(this.url, headFrame.url) && ValueObject.util_equals(this.expiredTime, headFrame.expiredTime);
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
        List<String> list = this.url;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Double> list2 = this.expiredTime;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = new ArrayList();
        }
        if (this.expiredTime == null) {
            this.expiredTime = new ArrayList();
        }
    }

    public HeadFrame subtract(HeadFrame headFrame) {
        HeadFrame headFrame2 = new HeadFrame();
        if (!ValueObject.util_equals(this.url, headFrame.url)) {
            headFrame2.url = this.url;
        }
        if (!ValueObject.util_equals(this.expiredTime, headFrame.expiredTime)) {
            headFrame2.expiredTime = this.expiredTime;
        }
        if (headFrame2.equals(new HeadFrame())) {
            return null;
        }
        return headFrame2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
