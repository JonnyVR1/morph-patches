package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.HeadFrame;
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
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Double> list2 = headFrame.expiredTime;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            headFrame.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HeadFrame parse(nb5 nb5Var) throws IOException {
            HeadFrame headFrame = new HeadFrame();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (headFrame.url == null) {
                        headFrame.url = new ArrayList();
                    }
                    if (headFrame.expiredTime != null) {
                        break;
                    }
                    headFrame.expiredTime = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    headFrame.url = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (headFrame.url == null) {
                            headFrame.url = new ArrayList();
                        }
                        if (headFrame.expiredTime != null) {
                            break;
                        }
                        headFrame.expiredTime = new ArrayList();
                        return headFrame;
                    }
                    headFrame.expiredTime = (List) nb5Var.m158743l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return headFrame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HeadFrame headFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = headFrame.url;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Double> list2 = headFrame.expiredTime;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<HeadFrame> JSON_ADAPTER = new ObjectJsonAdapter<HeadFrame>() { // from class: com.p1.mobile.putong.data.HeadFrame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HeadFrame.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HeadFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HeadFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59801a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Double m59802b(Double d) {
        return d;
    }

    public static HeadFrame new_() {
        HeadFrame headFrame = new HeadFrame();
        headFrame.nullCheck();
        return headFrame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HeadFrame mo223809clone() {
        HeadFrame headFrame = new HeadFrame();
        List<String> list = this.url;
        if (list != null) {
            headFrame.url = ValueObject.util_map(list, new w9j() { // from class: l.mwk
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return HeadFrame.m59801a((String) obj);
                }
            });
        }
        List<Double> list2 = this.expiredTime;
        if (list2 != null) {
            headFrame.expiredTime = ValueObject.util_map(list2, new w9j() { // from class: l.nwk
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return HeadFrame.m59802b((Double) obj);
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
