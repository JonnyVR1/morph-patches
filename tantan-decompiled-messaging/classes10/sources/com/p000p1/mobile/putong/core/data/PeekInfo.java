package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.PeekInfo;
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
public class PeekInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "peekinfo";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f128id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> otherUserIds;
    public static ProtobufAdapter<PeekInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PeekInfo>() { // from class: com.p1.mobile.putong.core.data.PeekInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PeekInfo peekInfo) {
            String str = peekInfo.f128id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = peekInfo.otherUserIds;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) peekInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PeekInfo m14739parse(nb5 nb5Var) throws IOException {
            PeekInfo peekInfo = new PeekInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (peekInfo.f128id == null) {
                        peekInfo.f128id = "";
                    }
                    if (peekInfo.otherUserIds != null) {
                        break;
                    }
                    peekInfo.otherUserIds = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    peekInfo.f128id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (peekInfo.f128id == null) {
                            peekInfo.f128id = "";
                        }
                        if (peekInfo.otherUserIds != null) {
                            break;
                        }
                        peekInfo.otherUserIds = new ArrayList();
                        return peekInfo;
                    }
                    peekInfo.otherUserIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return peekInfo;
        }

        public void serialize(PeekInfo peekInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = peekInfo.f128id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = peekInfo.otherUserIds;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PeekInfo> JSON_ADAPTER = new ObjectJsonAdapter<PeekInfo>() { // from class: com.p1.mobile.putong.core.data.PeekInfo.2
        public Class getDataClass() {
            return PeekInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PeekInfo m14740newInstance() {
            return new PeekInfo();
        }

        public boolean parseField(PeekInfo peekInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                peekInfo.f128id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("otherUserIds")) {
                return false;
            }
            peekInfo.otherUserIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PeekInfo peekInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("otherUserIds")) {
                return true;
            }
            return super.parseFieldCheck(peekInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(PeekInfo peekInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = peekInfo.f128id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (peekInfo.otherUserIds != null) {
                jsonGenerator.writeFieldName("otherUserIds");
                JsonAdapter.serializeArray(peekInfo.otherUserIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PeekInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PeekInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m547a(String str) {
        return str;
    }

    public static PeekInfo new_() {
        PeekInfo peekInfo = new PeekInfo();
        peekInfo.nullCheck();
        return peekInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PeekInfo m14738clone() {
        PeekInfo peekInfo = new PeekInfo();
        peekInfo.f128id = this.f128id;
        List<String> list = this.otherUserIds;
        if (list != null) {
            peekInfo.otherUserIds = ValueObject.util_map(list, new w9j() { // from class: l.mi60
                public final Object call(Object obj) {
                    return PeekInfo.m547a((String) obj);
                }
            });
        }
        return peekInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PeekInfo)) {
            return false;
        }
        PeekInfo peekInfo = (PeekInfo) obj;
        return ValueObject.util_equals(this.f128id, peekInfo.f128id) && ValueObject.util_equals(this.otherUserIds, peekInfo.otherUserIds);
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
        String str = this.f128id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.otherUserIds;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f128id == null) {
            this.f128id = "";
        }
        if (this.otherUserIds == null) {
            this.otherUserIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
