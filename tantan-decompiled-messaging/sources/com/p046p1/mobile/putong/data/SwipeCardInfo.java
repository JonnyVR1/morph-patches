package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.SwipeCardInfo;
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
public class SwipeCardInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swipecardinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> cardTypes;
    public static ProtobufAdapter<SwipeCardInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwipeCardInfo>() { // from class: com.p1.mobile.putong.data.SwipeCardInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SwipeCardInfo swipeCardInfo) {
            List<String> list = swipeCardInfo.cardTypes;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            swipeCardInfo.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SwipeCardInfo parse(nb5 nb5Var) throws IOException {
            SwipeCardInfo swipeCardInfo = new SwipeCardInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (swipeCardInfo.cardTypes != null) {
                        break;
                    }
                    swipeCardInfo.cardTypes = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (swipeCardInfo.cardTypes != null) {
                        break;
                    }
                    swipeCardInfo.cardTypes = new ArrayList();
                    return swipeCardInfo;
                }
                swipeCardInfo.cardTypes = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return swipeCardInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SwipeCardInfo swipeCardInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = swipeCardInfo.cardTypes;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SwipeCardInfo> JSON_ADAPTER = new ObjectJsonAdapter<SwipeCardInfo>() { // from class: com.p1.mobile.putong.data.SwipeCardInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SwipeCardInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SwipeCardInfo newInstance() {
            return new SwipeCardInfo();
        }

        public boolean parseField(SwipeCardInfo swipeCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("cardTypes")) {
                return false;
            }
            swipeCardInfo.cardTypes = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SwipeCardInfo swipeCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("cardTypes")) {
                return true;
            }
            return super.parseFieldCheck(swipeCardInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SwipeCardInfo swipeCardInfo, JsonGenerator jsonGenerator) throws IOException {
            if (swipeCardInfo.cardTypes != null) {
                jsonGenerator.writeFieldName("cardTypes");
                JsonAdapter.serializeArray(swipeCardInfo.cardTypes, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60101a(String str) {
        return str;
    }

    public static SwipeCardInfo new_() {
        SwipeCardInfo swipeCardInfo = new SwipeCardInfo();
        swipeCardInfo.nullCheck();
        return swipeCardInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SwipeCardInfo mo223809clone() {
        SwipeCardInfo swipeCardInfo = new SwipeCardInfo();
        List<String> list = this.cardTypes;
        if (list != null) {
            swipeCardInfo.cardTypes = ValueObject.util_map(list, new w9j() { // from class: l.r7h0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return SwipeCardInfo.m60101a((String) obj);
                }
            });
        }
        return swipeCardInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SwipeCardInfo) {
            return ValueObject.util_equals(this.cardTypes, ((SwipeCardInfo) obj).cardTypes);
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
        List<String> list = this.cardTypes;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cardTypes == null) {
            this.cardTypes = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
