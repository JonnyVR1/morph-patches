package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
public class HideSpecialUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hidespecialuser";

    @NonNull
    @ProtobufIndex(index = 2)
    public Long timeStamp;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<HideSpecialUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideSpecialUser>() { // from class: com.p1.mobile.putong.core.data.HideSpecialUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HideSpecialUser hideSpecialUser) {
            String str = hideSpecialUser.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            Long l2 = hideSpecialUser.timeStamp;
            if (l2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17283j(2, l2.longValue());
            }
            hideSpecialUser.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HideSpecialUser parse(nc5 nc5Var) throws IOException {
            HideSpecialUser hideSpecialUser = new HideSpecialUser();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (hideSpecialUser.userId == null) {
                        hideSpecialUser.userId = "";
                    }
                    if (hideSpecialUser.timeStamp != null) {
                        break;
                    }
                    hideSpecialUser.timeStamp = 0L;
                    break;
                }
                if (iM162497u == 10) {
                    hideSpecialUser.userId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (hideSpecialUser.userId == null) {
                            hideSpecialUser.userId = "";
                        }
                        if (hideSpecialUser.timeStamp != null) {
                            break;
                        }
                        hideSpecialUser.timeStamp = 0L;
                        return hideSpecialUser;
                    }
                    hideSpecialUser.timeStamp = Long.valueOf(nc5Var.m162487k());
                }
            }
            return hideSpecialUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HideSpecialUser hideSpecialUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = hideSpecialUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            Long l2 = hideSpecialUser.timeStamp;
            if (l2 != null) {
                codedOutputByteBufferNano.m17307I(2, l2.longValue());
            }
        }
    };
    public static JsonAdapter<HideSpecialUser> JSON_ADAPTER = new ObjectJsonAdapter<HideSpecialUser>() { // from class: com.p1.mobile.putong.core.data.HideSpecialUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HideSpecialUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HideSpecialUser newInstance() {
            return new HideSpecialUser();
        }

        public boolean parseField(HideSpecialUser hideSpecialUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                hideSpecialUser.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("timeStamp")) {
                return false;
            }
            hideSpecialUser.timeStamp = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Long.valueOf(jsonParser.getValueAsLong());
            return true;
        }

        public boolean parseFieldCheck(HideSpecialUser hideSpecialUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("timeStamp")) {
                return true;
            }
            return super.parseFieldCheck(hideSpecialUser, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HideSpecialUser hideSpecialUser, JsonGenerator jsonGenerator) throws IOException {
            String str = hideSpecialUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            Long l2 = hideSpecialUser.timeStamp;
            if (l2 != null) {
                jsonGenerator.writeNumberField("timeStamp", l2.longValue());
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideSpecialUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideSpecialUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideSpecialUser new_() {
        HideSpecialUser hideSpecialUser = new HideSpecialUser();
        hideSpecialUser.nullCheck();
        return hideSpecialUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HideSpecialUser mo225055clone() {
        HideSpecialUser hideSpecialUser = new HideSpecialUser();
        hideSpecialUser.userId = this.userId;
        hideSpecialUser.timeStamp = this.timeStamp;
        return hideSpecialUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideSpecialUser)) {
            return false;
        }
        HideSpecialUser hideSpecialUser = (HideSpecialUser) obj;
        return ValueObject.util_equals(this.userId, hideSpecialUser.userId) && ValueObject.util_equals(this.timeStamp, hideSpecialUser.timeStamp);
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
        Long l2 = this.timeStamp;
        int iHashCode2 = iHashCode + (l2 != null ? l2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.timeStamp == null) {
            this.timeStamp = 0L;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
