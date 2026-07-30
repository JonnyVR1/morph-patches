package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MonetizationHomeSeeVisitorInfo;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MonetizationHomeSeeVisitorInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationhomeseevisitorinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> newAvatars;

    @ProtobufIndex(index = 1)
    public int newCount;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> recentAvatars;
    public static ProtobufAdapter<MonetizationHomeSeeVisitorInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<MonetizationHomeSeeVisitorInfo>() { // from class: com.p1.mobile.putong.core.data.MonetizationHomeSeeVisitorInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo) {
            int iH = CodedOutputByteBufferNano.h(1, monetizationHomeSeeVisitorInfo.newCount);
            List<String> list = monetizationHomeSeeVisitorInfo.newAvatars;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = monetizationHomeSeeVisitorInfo.recentAvatars;
            if (list2 != null) {
                iH += CodedOutputByteBufferNano.l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) monetizationHomeSeeVisitorInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MonetizationHomeSeeVisitorInfo m14369parse(nb5 nb5Var) throws IOException {
            MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo = new MonetizationHomeSeeVisitorInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (monetizationHomeSeeVisitorInfo.newAvatars == null) {
                        monetizationHomeSeeVisitorInfo.newAvatars = new ArrayList();
                    }
                    if (monetizationHomeSeeVisitorInfo.recentAvatars != null) {
                        break;
                    }
                    monetizationHomeSeeVisitorInfo.recentAvatars = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    monetizationHomeSeeVisitorInfo.newCount = nb5Var.j();
                } else if (iU == 18) {
                    monetizationHomeSeeVisitorInfo.newAvatars = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (monetizationHomeSeeVisitorInfo.newAvatars == null) {
                            monetizationHomeSeeVisitorInfo.newAvatars = new ArrayList();
                        }
                        if (monetizationHomeSeeVisitorInfo.recentAvatars != null) {
                            break;
                        }
                        monetizationHomeSeeVisitorInfo.recentAvatars = new ArrayList();
                        return monetizationHomeSeeVisitorInfo;
                    }
                    monetizationHomeSeeVisitorInfo.recentAvatars = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return monetizationHomeSeeVisitorInfo;
        }

        public void serialize(MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, monetizationHomeSeeVisitorInfo.newCount);
            List<String> list = monetizationHomeSeeVisitorInfo.newAvatars;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = monetizationHomeSeeVisitorInfo.recentAvatars;
            if (list2 != null) {
                codedOutputByteBufferNano.K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MonetizationHomeSeeVisitorInfo> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationHomeSeeVisitorInfo>() { // from class: com.p1.mobile.putong.core.data.MonetizationHomeSeeVisitorInfo.2
        public Class getDataClass() {
            return MonetizationHomeSeeVisitorInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MonetizationHomeSeeVisitorInfo m14370newInstance() {
            return new MonetizationHomeSeeVisitorInfo();
        }

        public boolean parseField(MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "newAvatars":
                    monetizationHomeSeeVisitorInfo.newAvatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "recentAvatars":
                    monetizationHomeSeeVisitorInfo.recentAvatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "newCount":
                    monetizationHomeSeeVisitorInfo.newCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "newAvatars":
                case "recentAvatars":
                case "newCount":
                    return true;
                default:
                    return super.parseFieldCheck(monetizationHomeSeeVisitorInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("newCount", monetizationHomeSeeVisitorInfo.newCount);
            if (monetizationHomeSeeVisitorInfo.newAvatars != null) {
                jsonGenerator.writeFieldName("newAvatars");
                JsonAdapter.serializeArray(monetizationHomeSeeVisitorInfo.newAvatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (monetizationHomeSeeVisitorInfo.recentAvatars != null) {
                jsonGenerator.writeFieldName("recentAvatars");
                JsonAdapter.serializeArray(monetizationHomeSeeVisitorInfo.recentAvatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationHomeSeeVisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MonetizationHomeSeeVisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m497a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m498b(String str) {
        return str;
    }

    public static MonetizationHomeSeeVisitorInfo new_() {
        MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo = new MonetizationHomeSeeVisitorInfo();
        monetizationHomeSeeVisitorInfo.nullCheck();
        return monetizationHomeSeeVisitorInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MonetizationHomeSeeVisitorInfo m14368clone() {
        MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo = new MonetizationHomeSeeVisitorInfo();
        monetizationHomeSeeVisitorInfo.newCount = this.newCount;
        List<String> list = this.newAvatars;
        if (list != null) {
            monetizationHomeSeeVisitorInfo.newAvatars = ValueObject.util_map(list, new w9j() { // from class: l.lx00
                public final Object call(Object obj) {
                    return MonetizationHomeSeeVisitorInfo.m497a((String) obj);
                }
            });
        }
        List<String> list2 = this.recentAvatars;
        if (list2 != null) {
            monetizationHomeSeeVisitorInfo.recentAvatars = ValueObject.util_map(list2, new w9j() { // from class: l.mx00
                public final Object call(Object obj) {
                    return MonetizationHomeSeeVisitorInfo.m498b((String) obj);
                }
            });
        }
        return monetizationHomeSeeVisitorInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MonetizationHomeSeeVisitorInfo)) {
            return false;
        }
        MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo = (MonetizationHomeSeeVisitorInfo) obj;
        return this.newCount == monetizationHomeSeeVisitorInfo.newCount && ValueObject.util_equals(this.newAvatars, monetizationHomeSeeVisitorInfo.newAvatars) && ValueObject.util_equals(this.recentAvatars, monetizationHomeSeeVisitorInfo.recentAvatars);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.newCount) * 41;
        List<String> list = this.newAvatars;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.recentAvatars;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.newAvatars == null) {
            this.newAvatars = new ArrayList();
        }
        if (this.recentAvatars == null) {
            this.recentAvatars = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
