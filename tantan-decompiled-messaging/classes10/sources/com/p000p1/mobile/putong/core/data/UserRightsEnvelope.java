package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
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
public class UserRightsEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userrightsenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public UserRightsData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<UserRightsEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserRightsEnvelope>() { // from class: com.p1.mobile.putong.core.data.UserRightsEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserRightsEnvelope userRightsEnvelope) {
            Meta meta = userRightsEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            UserRightsData userRightsData = userRightsEnvelope.data;
            if (userRightsData != null) {
                iL += CodedOutputByteBufferNano.l(2, userRightsData, UserRightsData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) userRightsEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserRightsEnvelope m16168parse(nb5 nb5Var) throws IOException {
            UserRightsEnvelope userRightsEnvelope = new UserRightsEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userRightsEnvelope.meta == null) {
                        userRightsEnvelope.meta = Meta.new_();
                    }
                    if (userRightsEnvelope.data != null) {
                        break;
                    }
                    userRightsEnvelope.data = UserRightsData.new_();
                    break;
                }
                if (iU == 10) {
                    userRightsEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (userRightsEnvelope.meta == null) {
                            userRightsEnvelope.meta = Meta.new_();
                        }
                        if (userRightsEnvelope.data != null) {
                            break;
                        }
                        userRightsEnvelope.data = UserRightsData.new_();
                        return userRightsEnvelope;
                    }
                    userRightsEnvelope.data = (UserRightsData) nb5Var.l(UserRightsData.PROTOBUF_ADAPTER);
                }
            }
            return userRightsEnvelope;
        }

        public void serialize(UserRightsEnvelope userRightsEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = userRightsEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            UserRightsData userRightsData = userRightsEnvelope.data;
            if (userRightsData != null) {
                codedOutputByteBufferNano.K(2, userRightsData, UserRightsData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserRightsEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<UserRightsEnvelope>() { // from class: com.p1.mobile.putong.core.data.UserRightsEnvelope.2
        public Class getDataClass() {
            return UserRightsEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserRightsEnvelope m16169newInstance() {
            return new UserRightsEnvelope();
        }

        public boolean parseField(UserRightsEnvelope userRightsEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                userRightsEnvelope.data = (UserRightsData) UserRightsData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            userRightsEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserRightsEnvelope userRightsEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(userRightsEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(UserRightsEnvelope userRightsEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (userRightsEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(userRightsEnvelope.meta, jsonGenerator, true);
            }
            if (userRightsEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                UserRightsData.JSON_ADAPTER.serialize(userRightsEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserRightsEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserRightsEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserRightsEnvelope new_() {
        UserRightsEnvelope userRightsEnvelope = new UserRightsEnvelope();
        userRightsEnvelope.nullCheck();
        return userRightsEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserRightsEnvelope m16167clone() {
        UserRightsEnvelope userRightsEnvelope = new UserRightsEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            userRightsEnvelope.meta = meta.clone();
        }
        UserRightsData userRightsData = this.data;
        if (userRightsData != null) {
            userRightsEnvelope.data = userRightsData.m16163clone();
        }
        return userRightsEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserRightsEnvelope)) {
            return false;
        }
        UserRightsEnvelope userRightsEnvelope = (UserRightsEnvelope) obj;
        return ValueObject.util_equals(this.meta, userRightsEnvelope.meta) && ValueObject.util_equals(this.data, userRightsEnvelope.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        UserRightsData userRightsData = this.data;
        int iHashCode2 = iHashCode + (userRightsData != null ? userRightsData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = UserRightsData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
