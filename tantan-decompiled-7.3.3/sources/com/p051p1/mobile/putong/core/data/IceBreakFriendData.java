package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.IceBreakUserId;
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
public class IceBreakFriendData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakfrienddata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<IceBreakUserId> friends;
    public static ProtobufAdapter<IceBreakFriendData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakFriendData>() { // from class: com.p1.mobile.putong.core.data.IceBreakFriendData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IceBreakFriendData iceBreakFriendData) {
            List<IceBreakUserId> list = iceBreakFriendData.friends;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, IceBreakUserId.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            iceBreakFriendData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IceBreakFriendData parse(nc5 nc5Var) throws IOException {
            IceBreakFriendData iceBreakFriendData = new IceBreakFriendData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (iceBreakFriendData.friends != null) {
                        break;
                    }
                    iceBreakFriendData.friends = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (iceBreakFriendData.friends != null) {
                        break;
                    }
                    iceBreakFriendData.friends = new ArrayList();
                    return iceBreakFriendData;
                }
                iceBreakFriendData.friends = (List) nc5Var.m162488l(IceBreakUserId.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return iceBreakFriendData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IceBreakFriendData iceBreakFriendData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<IceBreakUserId> list = iceBreakFriendData.friends;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, IceBreakUserId.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IceBreakFriendData> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakFriendData>() { // from class: com.p1.mobile.putong.core.data.IceBreakFriendData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IceBreakFriendData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IceBreakFriendData newInstance() {
            return new IceBreakFriendData();
        }

        public boolean parseField(IceBreakFriendData iceBreakFriendData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("friends")) {
                return false;
            }
            iceBreakFriendData.friends = JsonAdapter.parseArray(jsonParser, IceBreakUserId.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IceBreakFriendData iceBreakFriendData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("friends")) {
                return true;
            }
            return super.parseFieldCheck(iceBreakFriendData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IceBreakFriendData iceBreakFriendData, JsonGenerator jsonGenerator) throws IOException {
            if (iceBreakFriendData.friends != null) {
                jsonGenerator.writeFieldName("friends");
                JsonAdapter.serializeArray(iceBreakFriendData.friends, jsonGenerator, IceBreakUserId.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakFriendData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakFriendData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakFriendData new_() {
        IceBreakFriendData iceBreakFriendData = new IceBreakFriendData();
        iceBreakFriendData.nullCheck();
        return iceBreakFriendData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IceBreakFriendData mo225055clone() {
        IceBreakFriendData iceBreakFriendData = new IceBreakFriendData();
        List<IceBreakUserId> list = this.friends;
        if (list != null) {
            iceBreakFriendData.friends = ValueObject.util_map(list, new qcj() { // from class: l.dbm
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IceBreakUserId) obj).mo225055clone();
                }
            });
        }
        return iceBreakFriendData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IceBreakFriendData) {
            return ValueObject.util_equals(this.friends, ((IceBreakFriendData) obj).friends);
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
        List<IceBreakUserId> list = this.friends;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.friends == null) {
            this.friends = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
