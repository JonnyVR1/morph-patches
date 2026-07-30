package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.PeekInfo;
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

/* JADX INFO: loaded from: classes10.dex */
public class PeekInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "peekinfo";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21208id;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> otherUserIds;
    public static ProtobufAdapter<PeekInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PeekInfo>() { // from class: com.p1.mobile.putong.core.data.PeekInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PeekInfo peekInfo) {
            String str = peekInfo.f21208id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = peekInfo.otherUserIds;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            peekInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PeekInfo parse(nc5 nc5Var) throws IOException {
            PeekInfo peekInfo = new PeekInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (peekInfo.f21208id == null) {
                        peekInfo.f21208id = "";
                    }
                    if (peekInfo.otherUserIds != null) {
                        break;
                    }
                    peekInfo.otherUserIds = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    peekInfo.f21208id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (peekInfo.f21208id == null) {
                            peekInfo.f21208id = "";
                        }
                        if (peekInfo.otherUserIds != null) {
                            break;
                        }
                        peekInfo.otherUserIds = new ArrayList();
                        return peekInfo;
                    }
                    peekInfo.otherUserIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return peekInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PeekInfo peekInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = peekInfo.f21208id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = peekInfo.otherUserIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PeekInfo> JSON_ADAPTER = new ObjectJsonAdapter<PeekInfo>() { // from class: com.p1.mobile.putong.core.data.PeekInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PeekInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PeekInfo newInstance() {
            return new PeekInfo();
        }

        public boolean parseField(PeekInfo peekInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                peekInfo.f21208id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PeekInfo peekInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = peekInfo.f21208id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (peekInfo.otherUserIds != null) {
                jsonGenerator.writeFieldName("otherUserIds");
                JsonAdapter.serializeArray(peekInfo.otherUserIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PeekInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PeekInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36748a(String str) {
        return str;
    }

    public static PeekInfo new_() {
        PeekInfo peekInfo = new PeekInfo();
        peekInfo.nullCheck();
        return peekInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PeekInfo mo225055clone() {
        PeekInfo peekInfo = new PeekInfo();
        peekInfo.f21208id = this.f21208id;
        List<String> list = this.otherUserIds;
        if (list != null) {
            peekInfo.otherUserIds = ValueObject.util_map(list, new qcj() { // from class: l.rq60
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return PeekInfo.m36748a((String) obj);
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
        return ValueObject.util_equals(this.f21208id, peekInfo.f21208id) && ValueObject.util_equals(this.otherUserIds, peekInfo.otherUserIds);
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
        String str = this.f21208id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.otherUserIds;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21208id == null) {
            this.f21208id = "";
        }
        if (this.otherUserIds == null) {
            this.otherUserIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
