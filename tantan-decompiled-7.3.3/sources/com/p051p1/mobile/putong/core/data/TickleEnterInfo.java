package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.TickleEnterUser;
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
public class TickleEnterInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tickleenterinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<TickleEnterUser> enterList;
    public static ProtobufAdapter<TickleEnterInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<TickleEnterInfo>() { // from class: com.p1.mobile.putong.core.data.TickleEnterInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TickleEnterInfo tickleEnterInfo) {
            List<TickleEnterUser> list = tickleEnterInfo.enterList;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, TickleEnterUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            tickleEnterInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TickleEnterInfo parse(nc5 nc5Var) throws IOException {
            TickleEnterInfo tickleEnterInfo = new TickleEnterInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (tickleEnterInfo.enterList != null) {
                        break;
                    }
                    tickleEnterInfo.enterList = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (tickleEnterInfo.enterList != null) {
                        break;
                    }
                    tickleEnterInfo.enterList = new ArrayList();
                    return tickleEnterInfo;
                }
                tickleEnterInfo.enterList = (List) nc5Var.m162488l(TickleEnterUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return tickleEnterInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TickleEnterInfo tickleEnterInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<TickleEnterUser> list = tickleEnterInfo.enterList;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, TickleEnterUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<TickleEnterInfo> JSON_ADAPTER = new ObjectJsonAdapter<TickleEnterInfo>() { // from class: com.p1.mobile.putong.core.data.TickleEnterInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TickleEnterInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TickleEnterInfo newInstance() {
            return new TickleEnterInfo();
        }

        public boolean parseField(TickleEnterInfo tickleEnterInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("enterList")) {
                return false;
            }
            tickleEnterInfo.enterList = JsonAdapter.parseArray(jsonParser, TickleEnterUser.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TickleEnterInfo tickleEnterInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enterList")) {
                return true;
            }
            return super.parseFieldCheck(tickleEnterInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TickleEnterInfo tickleEnterInfo, JsonGenerator jsonGenerator) throws IOException {
            if (tickleEnterInfo.enterList != null) {
                jsonGenerator.writeFieldName("enterList");
                JsonAdapter.serializeArray(tickleEnterInfo.enterList, jsonGenerator, TickleEnterUser.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TickleEnterInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TickleEnterInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TickleEnterInfo new_() {
        TickleEnterInfo tickleEnterInfo = new TickleEnterInfo();
        tickleEnterInfo.nullCheck();
        return tickleEnterInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TickleEnterInfo mo225055clone() {
        TickleEnterInfo tickleEnterInfo = new TickleEnterInfo();
        List<TickleEnterUser> list = this.enterList;
        if (list != null) {
            tickleEnterInfo.enterList = ValueObject.util_map(list, new qcj() { // from class: l.mzi0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((TickleEnterUser) obj).mo225055clone();
                }
            });
        }
        return tickleEnterInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TickleEnterInfo) {
            return ValueObject.util_equals(this.enterList, ((TickleEnterInfo) obj).enterList);
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
        List<TickleEnterUser> list = this.enterList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.enterList == null) {
            this.enterList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
