package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ThirdPartySticker;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ThirdPartySticker extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thirdpartysticker";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long timeDelay;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> whiteList;
    public final Map<String, Boolean> whiteMap = new HashMap();
    public static ProtobufAdapter<ThirdPartySticker> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThirdPartySticker>() { // from class: com.p1.mobile.putong.core.data.ThirdPartySticker.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ThirdPartySticker thirdPartySticker) {
            List<String> list = thirdPartySticker.whiteList;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.j(2, thirdPartySticker.timeDelay);
            ((MessageNano) thirdPartySticker).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ThirdPartySticker m15982parse(nb5 nb5Var) throws IOException {
            ThirdPartySticker thirdPartySticker = new ThirdPartySticker();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (thirdPartySticker.whiteList != null) {
                        break;
                    }
                    thirdPartySticker.whiteList = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    thirdPartySticker.whiteList = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 16) {
                        if (thirdPartySticker.whiteList != null) {
                            break;
                        }
                        thirdPartySticker.whiteList = new ArrayList();
                        return thirdPartySticker;
                    }
                    thirdPartySticker.timeDelay = nb5Var.k();
                }
            }
            return thirdPartySticker;
        }

        public void serialize(ThirdPartySticker thirdPartySticker, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = thirdPartySticker.whiteList;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.I(2, thirdPartySticker.timeDelay);
        }
    };
    public static JsonAdapter<ThirdPartySticker> JSON_ADAPTER = new ObjectJsonAdapter<ThirdPartySticker>() { // from class: com.p1.mobile.putong.core.data.ThirdPartySticker.2
        public Class getDataClass() {
            return ThirdPartySticker.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ThirdPartySticker m15983newInstance() {
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

        public void serializeFields(ThirdPartySticker thirdPartySticker, JsonGenerator jsonGenerator) throws IOException {
            if (thirdPartySticker.whiteList != null) {
                jsonGenerator.writeFieldName("whiteList");
                JsonAdapter.serializeArray(thirdPartySticker.whiteList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("timeDelay", thirdPartySticker.timeDelay);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdPartySticker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdPartySticker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m676a(String str) {
        return str;
    }

    public static ThirdPartySticker new_() {
        ThirdPartySticker thirdPartySticker = new ThirdPartySticker();
        thirdPartySticker.nullCheck();
        return thirdPartySticker;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ThirdPartySticker m15981clone() {
        ThirdPartySticker thirdPartySticker = new ThirdPartySticker();
        List<String> list = this.whiteList;
        if (list != null) {
            thirdPartySticker.whiteList = ValueObject.util_map(list, new w9j() { // from class: l.qni0
                public final Object call(Object obj) {
                    return ThirdPartySticker.m676a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.whiteList;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        long j = this.timeDelay;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.whiteList == null) {
            this.whiteList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
