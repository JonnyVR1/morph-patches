package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class DatingFriendsApply extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "datingfriendsapply";

    @ProtobufIndex(index = 2)
    public int unchatCount;

    @ProtobufIndex(index = 1)
    public int unreadCount;
    public static ProtobufAdapter<DatingFriendsApply> PROTOBUF_ADAPTER = new MessageNanoAdapter<DatingFriendsApply>() { // from class: com.p1.mobile.putong.core.data.DatingFriendsApply.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DatingFriendsApply datingFriendsApply) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, datingFriendsApply.unreadCount) + CodedOutputByteBufferNano.m17281h(2, datingFriendsApply.unchatCount);
            datingFriendsApply.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DatingFriendsApply parse(nc5 nc5Var) throws IOException {
            DatingFriendsApply datingFriendsApply = new DatingFriendsApply();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    datingFriendsApply.unreadCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return datingFriendsApply;
                    }
                    datingFriendsApply.unchatCount = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DatingFriendsApply datingFriendsApply, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, datingFriendsApply.unreadCount);
            codedOutputByteBufferNano.m17305G(2, datingFriendsApply.unchatCount);
        }
    };
    public static JsonAdapter<DatingFriendsApply> JSON_ADAPTER = new ObjectJsonAdapter<DatingFriendsApply>() { // from class: com.p1.mobile.putong.core.data.DatingFriendsApply.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DatingFriendsApply.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DatingFriendsApply newInstance() {
            return new DatingFriendsApply();
        }

        public boolean parseField(DatingFriendsApply datingFriendsApply, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("unreadCount")) {
                datingFriendsApply.unreadCount = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("unchatCount")) {
                return false;
            }
            datingFriendsApply.unchatCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(DatingFriendsApply datingFriendsApply, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("unreadCount") || str.equals("unchatCount")) {
                return true;
            }
            return super.parseFieldCheck(datingFriendsApply, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DatingFriendsApply datingFriendsApply, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unreadCount", datingFriendsApply.unreadCount);
            jsonGenerator.writeNumberField("unchatCount", datingFriendsApply.unchatCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DatingFriendsApply) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DatingFriendsApply) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DatingFriendsApply new_() {
        DatingFriendsApply datingFriendsApply = new DatingFriendsApply();
        datingFriendsApply.nullCheck();
        return datingFriendsApply;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DatingFriendsApply mo225055clone() {
        DatingFriendsApply datingFriendsApply = new DatingFriendsApply();
        datingFriendsApply.unreadCount = this.unreadCount;
        datingFriendsApply.unchatCount = this.unchatCount;
        return datingFriendsApply;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DatingFriendsApply)) {
            return false;
        }
        DatingFriendsApply datingFriendsApply = (DatingFriendsApply) obj;
        return this.unreadCount == datingFriendsApply.unreadCount && this.unchatCount == datingFriendsApply.unchatCount;
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
        int i2 = (((i * 41) + this.unreadCount) * 41) + this.unchatCount;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
