package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.TailFrame;
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

/* JADX INFO: loaded from: classes12.dex */
public class TailFrame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tailframe";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Double> expiredTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> url;
    public static ProtobufAdapter<TailFrame> PROTOBUF_ADAPTER = new MessageNanoAdapter<TailFrame>() { // from class: com.p1.mobile.putong.data.TailFrame.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TailFrame tailFrame) {
            List<String> list = tailFrame.url;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Double> list2 = tailFrame.expiredTime;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            tailFrame.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TailFrame parse(nb5 nb5Var) throws IOException {
            TailFrame tailFrame = new TailFrame();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (tailFrame.url == null) {
                        tailFrame.url = new ArrayList();
                    }
                    if (tailFrame.expiredTime != null) {
                        break;
                    }
                    tailFrame.expiredTime = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    tailFrame.url = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (tailFrame.url == null) {
                            tailFrame.url = new ArrayList();
                        }
                        if (tailFrame.expiredTime != null) {
                            break;
                        }
                        tailFrame.expiredTime = new ArrayList();
                        return tailFrame;
                    }
                    tailFrame.expiredTime = (List) nb5Var.m158743l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return tailFrame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TailFrame tailFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = tailFrame.url;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Double> list2 = tailFrame.expiredTime;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<TailFrame> JSON_ADAPTER = new ObjectJsonAdapter<TailFrame>() { // from class: com.p1.mobile.putong.data.TailFrame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TailFrame.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TailFrame newInstance() {
            return new TailFrame();
        }

        public boolean parseField(TailFrame tailFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("expiredTime")) {
                tailFrame.expiredTime = JsonAdapter.parseArray(jsonParser, Converter.API_TIME, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("url")) {
                return false;
            }
            tailFrame.url = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TailFrame tailFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("expiredTime") || str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(tailFrame, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TailFrame tailFrame, JsonGenerator jsonGenerator) throws IOException {
            if (tailFrame.url != null) {
                jsonGenerator.writeFieldName("url");
                JsonAdapter.serializeArray(tailFrame.url, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (tailFrame.expiredTime != null) {
                jsonGenerator.writeFieldName("expiredTime");
                JsonAdapter.serializeArray(tailFrame.expiredTime, jsonGenerator, Converter.API_TIME);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TailFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TailFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60102a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Double m60103b(Double d) {
        return d;
    }

    public static TailFrame new_() {
        TailFrame tailFrame = new TailFrame();
        tailFrame.nullCheck();
        return tailFrame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TailFrame mo223809clone() {
        TailFrame tailFrame = new TailFrame();
        List<String> list = this.url;
        if (list != null) {
            tailFrame.url = ValueObject.util_map(list, new w9j() { // from class: l.ruh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TailFrame.m60102a((String) obj);
                }
            });
        }
        List<Double> list2 = this.expiredTime;
        if (list2 != null) {
            tailFrame.expiredTime = ValueObject.util_map(list2, new w9j() { // from class: l.suh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TailFrame.m60103b((Double) obj);
                }
            });
        }
        return tailFrame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TailFrame)) {
            return false;
        }
        TailFrame tailFrame = (TailFrame) obj;
        return ValueObject.util_equals(this.url, tailFrame.url) && ValueObject.util_equals(this.expiredTime, tailFrame.expiredTime);
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

    public TailFrame subtract(TailFrame tailFrame) {
        TailFrame tailFrame2 = new TailFrame();
        if (!ValueObject.util_equals(this.url, tailFrame.url)) {
            tailFrame2.url = this.url;
        }
        if (!ValueObject.util_equals(this.expiredTime, tailFrame.expiredTime)) {
            tailFrame2.expiredTime = this.expiredTime;
        }
        if (tailFrame2.equals(new TailFrame())) {
            return null;
        }
        return tailFrame2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
