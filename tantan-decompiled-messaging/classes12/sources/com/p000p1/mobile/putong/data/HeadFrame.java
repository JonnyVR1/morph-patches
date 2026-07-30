package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.HeadFrame;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HeadFrame headFrame) {
            List<String> list = headFrame.url;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Double> list2 = headFrame.expiredTime;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) headFrame).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HeadFrame m18199parse(nb5 nb5Var) throws IOException {
            HeadFrame headFrame = new HeadFrame();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (headFrame.url == null) {
                        headFrame.url = new ArrayList();
                    }
                    if (headFrame.expiredTime != null) {
                        break;
                    }
                    headFrame.expiredTime = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    headFrame.url = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (headFrame.url == null) {
                            headFrame.url = new ArrayList();
                        }
                        if (headFrame.expiredTime != null) {
                            break;
                        }
                        headFrame.expiredTime = new ArrayList();
                        return headFrame;
                    }
                    headFrame.expiredTime = (List) nb5Var.l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return headFrame;
        }

        public void serialize(HeadFrame headFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = headFrame.url;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Double> list2 = headFrame.expiredTime;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<HeadFrame> JSON_ADAPTER = new ObjectJsonAdapter<HeadFrame>() { // from class: com.p1.mobile.putong.data.HeadFrame.2
        public Class getDataClass() {
            return HeadFrame.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public HeadFrame mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HeadFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HeadFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m719a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Double m720b(Double d) {
        return d;
    }

    public static HeadFrame new_() {
        HeadFrame headFrame = new HeadFrame();
        headFrame.nullCheck();
        return headFrame;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HeadFrame m18198clone() {
        HeadFrame headFrame = new HeadFrame();
        List<String> list = this.url;
        if (list != null) {
            headFrame.url = ValueObject.util_map(list, new w9j() { // from class: l.mwk
                public final Object call(Object obj) {
                    return HeadFrame.m719a((String) obj);
                }
            });
        }
        List<Double> list2 = this.expiredTime;
        if (list2 != null) {
            headFrame.expiredTime = ValueObject.util_map(list2, new w9j() { // from class: l.nwk
                public final Object call(Object obj) {
                    return HeadFrame.m720b((Double) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.url;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Double> list2 = this.expiredTime;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
