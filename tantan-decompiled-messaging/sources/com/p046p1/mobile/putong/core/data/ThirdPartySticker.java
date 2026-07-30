package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ThirdPartySticker;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class ThirdPartySticker extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thirdpartysticker";

    @ProtobufIndex(index = 2)
    public long timeDelay;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> whiteList;
    public final Map<String, Boolean> whiteMap = new HashMap();
    public static ProtobufAdapter<ThirdPartySticker> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThirdPartySticker>() { // from class: com.p1.mobile.putong.core.data.ThirdPartySticker.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ThirdPartySticker thirdPartySticker) {
            List<String> list = thirdPartySticker.whiteList;
            int iM17230l = (list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17228j(2, thirdPartySticker.timeDelay);
            thirdPartySticker.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ThirdPartySticker parse(nb5 nb5Var) throws IOException {
            ThirdPartySticker thirdPartySticker = new ThirdPartySticker();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (thirdPartySticker.whiteList != null) {
                        break;
                    }
                    thirdPartySticker.whiteList = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    thirdPartySticker.whiteList = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 16) {
                        if (thirdPartySticker.whiteList != null) {
                            break;
                        }
                        thirdPartySticker.whiteList = new ArrayList();
                        return thirdPartySticker;
                    }
                    thirdPartySticker.timeDelay = nb5Var.m158742k();
                }
            }
            return thirdPartySticker;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ThirdPartySticker thirdPartySticker, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = thirdPartySticker.whiteList;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17252I(2, thirdPartySticker.timeDelay);
        }
    };
    public static JsonAdapter<ThirdPartySticker> JSON_ADAPTER = new ObjectJsonAdapter<ThirdPartySticker>() { // from class: com.p1.mobile.putong.core.data.ThirdPartySticker.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ThirdPartySticker.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ThirdPartySticker newInstance() {
            return new ThirdPartySticker();
        }

        public boolean parseField(ThirdPartySticker thirdPartySticker, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("whiteList")) {
                thirdPartySticker.whiteList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("timeDelay")) {
                return false;
            }
            thirdPartySticker.timeDelay = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(ThirdPartySticker thirdPartySticker, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("whiteList") || str.equals("timeDelay")) {
                return true;
            }
            return super.parseFieldCheck(thirdPartySticker, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ThirdPartySticker thirdPartySticker, JsonGenerator jsonGenerator) throws IOException {
            if (thirdPartySticker.whiteList != null) {
                jsonGenerator.writeFieldName("whiteList");
                JsonAdapter.serializeArray(thirdPartySticker.whiteList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("timeDelay", thirdPartySticker.timeDelay);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdPartySticker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdPartySticker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35874a(String str) {
        return str;
    }

    public static ThirdPartySticker new_() {
        ThirdPartySticker thirdPartySticker = new ThirdPartySticker();
        thirdPartySticker.nullCheck();
        return thirdPartySticker;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ThirdPartySticker mo223809clone() {
        ThirdPartySticker thirdPartySticker = new ThirdPartySticker();
        List<String> list = this.whiteList;
        if (list != null) {
            thirdPartySticker.whiteList = ValueObject.util_map(list, new w9j() { // from class: l.qni0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ThirdPartySticker.m35874a((String) obj);
                }
            });
        }
        thirdPartySticker.timeDelay = this.timeDelay;
        return thirdPartySticker;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThirdPartySticker)) {
            return false;
        }
        ThirdPartySticker thirdPartySticker = (ThirdPartySticker) obj;
        return ValueObject.util_equals(this.whiteList, thirdPartySticker.whiteList) && this.timeDelay == thirdPartySticker.timeDelay;
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
        List<String> list = this.whiteList;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        long j = this.timeDelay;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.whiteList == null) {
            this.whiteList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
