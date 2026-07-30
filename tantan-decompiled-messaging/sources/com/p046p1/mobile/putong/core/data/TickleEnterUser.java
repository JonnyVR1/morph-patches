package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class TickleEnterUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tickleenteruser";

    @ProtobufIndex(index = 2)
    public int times;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<TickleEnterUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<TickleEnterUser>() { // from class: com.p1.mobile.putong.core.data.TickleEnterUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TickleEnterUser tickleEnterUser) {
            String str = tickleEnterUser.userId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, tickleEnterUser.times);
            tickleEnterUser.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TickleEnterUser parse(nb5 nb5Var) throws IOException {
            TickleEnterUser tickleEnterUser = new TickleEnterUser();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (tickleEnterUser.userId != null) {
                        break;
                    }
                    tickleEnterUser.userId = "";
                    break;
                }
                if (iM158752u == 10) {
                    tickleEnterUser.userId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (tickleEnterUser.userId != null) {
                            break;
                        }
                        tickleEnterUser.userId = "";
                        return tickleEnterUser;
                    }
                    tickleEnterUser.times = nb5Var.m158741j();
                }
            }
            return tickleEnterUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TickleEnterUser tickleEnterUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tickleEnterUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, tickleEnterUser.times);
        }
    };
    public static JsonAdapter<TickleEnterUser> JSON_ADAPTER = new ObjectJsonAdapter<TickleEnterUser>() { // from class: com.p1.mobile.putong.core.data.TickleEnterUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TickleEnterUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TickleEnterUser newInstance() {
            return new TickleEnterUser();
        }

        public boolean parseField(TickleEnterUser tickleEnterUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                tickleEnterUser.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("times")) {
                return false;
            }
            tickleEnterUser.times = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(TickleEnterUser tickleEnterUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("times")) {
                return true;
            }
            return super.parseFieldCheck(tickleEnterUser, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TickleEnterUser tickleEnterUser, JsonGenerator jsonGenerator) throws IOException {
            String str = tickleEnterUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("times", tickleEnterUser.times);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TickleEnterUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TickleEnterUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TickleEnterUser new_() {
        TickleEnterUser tickleEnterUser = new TickleEnterUser();
        tickleEnterUser.nullCheck();
        return tickleEnterUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TickleEnterUser mo223809clone() {
        TickleEnterUser tickleEnterUser = new TickleEnterUser();
        tickleEnterUser.userId = this.userId;
        tickleEnterUser.times = this.times;
        return tickleEnterUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TickleEnterUser)) {
            return false;
        }
        TickleEnterUser tickleEnterUser = (TickleEnterUser) obj;
        return ValueObject.util_equals(this.userId, tickleEnterUser.userId) && this.times == tickleEnterUser.times;
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
        String str = this.userId;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.times;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
