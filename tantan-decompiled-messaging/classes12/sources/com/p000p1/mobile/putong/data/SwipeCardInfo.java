package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.SwipeCardInfo;
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
public class SwipeCardInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swipecardinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> cardTypes;
    public static ProtobufAdapter<SwipeCardInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwipeCardInfo>() { // from class: com.p1.mobile.putong.data.SwipeCardInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SwipeCardInfo swipeCardInfo) {
            List<String> list = swipeCardInfo.cardTypes;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) swipeCardInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SwipeCardInfo m19061parse(nb5 nb5Var) throws IOException {
            SwipeCardInfo swipeCardInfo = new SwipeCardInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (swipeCardInfo.cardTypes != null) {
                        break;
                    }
                    swipeCardInfo.cardTypes = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (swipeCardInfo.cardTypes != null) {
                        break;
                    }
                    swipeCardInfo.cardTypes = new ArrayList();
                    return swipeCardInfo;
                }
                swipeCardInfo.cardTypes = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return swipeCardInfo;
        }

        public void serialize(SwipeCardInfo swipeCardInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = swipeCardInfo.cardTypes;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SwipeCardInfo> JSON_ADAPTER = new ObjectJsonAdapter<SwipeCardInfo>() { // from class: com.p1.mobile.putong.data.SwipeCardInfo.2
        public Class getDataClass() {
            return SwipeCardInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SwipeCardInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SwipeCardInfo swipeCardInfo, JsonGenerator jsonGenerator) throws IOException {
            if (swipeCardInfo.cardTypes != null) {
                jsonGenerator.writeFieldName("cardTypes");
                JsonAdapter.serializeArray(swipeCardInfo.cardTypes, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1019a(String str) {
        return str;
    }

    public static SwipeCardInfo new_() {
        SwipeCardInfo swipeCardInfo = new SwipeCardInfo();
        swipeCardInfo.nullCheck();
        return swipeCardInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SwipeCardInfo m19060clone() {
        SwipeCardInfo swipeCardInfo = new SwipeCardInfo();
        List<String> list = this.cardTypes;
        if (list != null) {
            swipeCardInfo.cardTypes = ValueObject.util_map(list, new w9j() { // from class: l.r7h0
                public final Object call(Object obj) {
                    return SwipeCardInfo.m1019a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.cardTypes;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.cardTypes == null) {
            this.cardTypes = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
