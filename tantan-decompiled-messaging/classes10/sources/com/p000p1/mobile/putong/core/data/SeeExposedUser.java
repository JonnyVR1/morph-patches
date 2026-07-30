package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SeeExposedUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seeexposeduser";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long timestamp;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<SeeExposedUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeExposedUser>() { // from class: com.p1.mobile.putong.core.data.SeeExposedUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeeExposedUser seeExposedUser) {
            String str = seeExposedUser.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, seeExposedUser.timestamp);
            ((MessageNano) seeExposedUser).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeeExposedUser m15511parse(nb5 nb5Var) throws IOException {
            SeeExposedUser seeExposedUser = new SeeExposedUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (seeExposedUser.userId != null) {
                        break;
                    }
                    seeExposedUser.userId = "";
                    break;
                }
                if (iU == 10) {
                    seeExposedUser.userId = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (seeExposedUser.userId != null) {
                            break;
                        }
                        seeExposedUser.userId = "";
                        return seeExposedUser;
                    }
                    seeExposedUser.timestamp = nb5Var.k();
                }
            }
            return seeExposedUser;
        }

        public void serialize(SeeExposedUser seeExposedUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = seeExposedUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, seeExposedUser.timestamp);
        }
    };
    public static JsonAdapter<SeeExposedUser> JSON_ADAPTER = new ObjectJsonAdapter<SeeExposedUser>() { // from class: com.p1.mobile.putong.core.data.SeeExposedUser.2
        public Class getDataClass() {
            return SeeExposedUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SeeExposedUser m15512newInstance() {
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

        public void serializeFields(SeeExposedUser seeExposedUser, JsonGenerator jsonGenerator) throws IOException {
            String str = seeExposedUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("timestamp", seeExposedUser.timestamp);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeExposedUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeExposedUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeExposedUser new_() {
        SeeExposedUser seeExposedUser = new SeeExposedUser();
        seeExposedUser.nullCheck();
        return seeExposedUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeeExposedUser m15510clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.timestamp;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
