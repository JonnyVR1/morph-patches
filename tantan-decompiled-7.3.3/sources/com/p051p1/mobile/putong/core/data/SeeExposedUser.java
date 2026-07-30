package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class SeeExposedUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seeexposeduser";

    @ProtobufIndex(index = 2)
    public long timestamp;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<SeeExposedUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeExposedUser>() { // from class: com.p1.mobile.putong.core.data.SeeExposedUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SeeExposedUser seeExposedUser) {
            String str = seeExposedUser.userId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, seeExposedUser.timestamp);
            seeExposedUser.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SeeExposedUser parse(nc5 nc5Var) throws IOException {
            SeeExposedUser seeExposedUser = new SeeExposedUser();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (seeExposedUser.userId != null) {
                        break;
                    }
                    seeExposedUser.userId = "";
                    break;
                }
                if (iM162497u == 10) {
                    seeExposedUser.userId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (seeExposedUser.userId != null) {
                            break;
                        }
                        seeExposedUser.userId = "";
                        return seeExposedUser;
                    }
                    seeExposedUser.timestamp = nc5Var.m162487k();
                }
            }
            return seeExposedUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SeeExposedUser seeExposedUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = seeExposedUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, seeExposedUser.timestamp);
        }
    };
    public static JsonAdapter<SeeExposedUser> JSON_ADAPTER = new ObjectJsonAdapter<SeeExposedUser>() { // from class: com.p1.mobile.putong.core.data.SeeExposedUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SeeExposedUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SeeExposedUser newInstance() {
            return new SeeExposedUser();
        }

        public boolean parseField(SeeExposedUser seeExposedUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                seeExposedUser.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("timestamp")) {
                return false;
            }
            seeExposedUser.timestamp = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(SeeExposedUser seeExposedUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("timestamp")) {
                return true;
            }
            return super.parseFieldCheck(seeExposedUser, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SeeExposedUser seeExposedUser, JsonGenerator jsonGenerator) throws IOException {
            String str = seeExposedUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("timestamp", seeExposedUser.timestamp);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeExposedUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeExposedUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeExposedUser new_() {
        SeeExposedUser seeExposedUser = new SeeExposedUser();
        seeExposedUser.nullCheck();
        return seeExposedUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SeeExposedUser mo225055clone() {
        SeeExposedUser seeExposedUser = new SeeExposedUser();
        seeExposedUser.userId = this.userId;
        seeExposedUser.timestamp = this.timestamp;
        return seeExposedUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeExposedUser)) {
            return false;
        }
        SeeExposedUser seeExposedUser = (SeeExposedUser) obj;
        return ValueObject.util_equals(this.userId, seeExposedUser.userId) && this.timestamp == seeExposedUser.timestamp;
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.timestamp;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
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
