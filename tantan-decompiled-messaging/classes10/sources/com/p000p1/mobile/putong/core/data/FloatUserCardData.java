package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.User;
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
public class FloatUserCardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "floatusercarddata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public FloatsCardData floatCardData;

    @NonNull
    @ProtobufIndex(index = 1)
    public User user;
    public static ProtobufAdapter<FloatUserCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<FloatUserCardData>() { // from class: com.p1.mobile.putong.core.data.FloatUserCardData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FloatUserCardData floatUserCardData) {
            User user = floatUserCardData.user;
            int iL = user != null ? CodedOutputByteBufferNano.l(1, user, User.PROTOBUF_ADAPTER) : 0;
            FloatsCardData floatsCardData = floatUserCardData.floatCardData;
            if (floatsCardData != null) {
                iL += CodedOutputByteBufferNano.l(2, floatsCardData, FloatsCardData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) floatUserCardData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FloatUserCardData m12805parse(nb5 nb5Var) throws IOException {
            FloatUserCardData floatUserCardData = new FloatUserCardData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (floatUserCardData.user == null) {
                        floatUserCardData.user = User.new_();
                    }
                    if (floatUserCardData.floatCardData != null) {
                        break;
                    }
                    floatUserCardData.floatCardData = FloatsCardData.new_();
                    break;
                }
                if (iU == 10) {
                    floatUserCardData.user = (User) nb5Var.l(User.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (floatUserCardData.user == null) {
                            floatUserCardData.user = User.new_();
                        }
                        if (floatUserCardData.floatCardData != null) {
                            break;
                        }
                        floatUserCardData.floatCardData = FloatsCardData.new_();
                        return floatUserCardData;
                    }
                    floatUserCardData.floatCardData = (FloatsCardData) nb5Var.l(FloatsCardData.PROTOBUF_ADAPTER);
                }
            }
            return floatUserCardData;
        }

        public void serialize(FloatUserCardData floatUserCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            User user = floatUserCardData.user;
            if (user != null) {
                codedOutputByteBufferNano.K(1, user, User.PROTOBUF_ADAPTER);
            }
            FloatsCardData floatsCardData = floatUserCardData.floatCardData;
            if (floatsCardData != null) {
                codedOutputByteBufferNano.K(2, floatsCardData, FloatsCardData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FloatUserCardData> JSON_ADAPTER = new ObjectJsonAdapter<FloatUserCardData>() { // from class: com.p1.mobile.putong.core.data.FloatUserCardData.2
        public Class getDataClass() {
            return FloatUserCardData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FloatUserCardData m12806newInstance() {
            return new FloatUserCardData();
        }

        public boolean parseField(FloatUserCardData floatUserCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("floatCardData")) {
                floatUserCardData.floatCardData = (FloatsCardData) FloatsCardData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("user")) {
                return false;
            }
            floatUserCardData.user = (User) User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FloatUserCardData floatUserCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("floatCardData") || str.equals("user")) {
                return true;
            }
            return super.parseFieldCheck(floatUserCardData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(FloatUserCardData floatUserCardData, JsonGenerator jsonGenerator) throws IOException {
            if (floatUserCardData.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(floatUserCardData.user, jsonGenerator, true);
            }
            if (floatUserCardData.floatCardData != null) {
                jsonGenerator.writeFieldName("floatCardData");
                FloatsCardData.JSON_ADAPTER.serialize(floatUserCardData.floatCardData, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FloatUserCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FloatUserCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FloatUserCardData new_() {
        FloatUserCardData floatUserCardData = new FloatUserCardData();
        floatUserCardData.nullCheck();
        return floatUserCardData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FloatUserCardData m12804clone() {
        FloatUserCardData floatUserCardData = new FloatUserCardData();
        User user = this.user;
        if (user != null) {
            floatUserCardData.user = user.clone();
        }
        FloatsCardData floatsCardData = this.floatCardData;
        if (floatsCardData != null) {
            floatUserCardData.floatCardData = floatsCardData.m12808clone();
        }
        return floatUserCardData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FloatUserCardData)) {
            return false;
        }
        FloatUserCardData floatUserCardData = (FloatUserCardData) obj;
        return ValueObject.util_equals(this.user, floatUserCardData.user) && ValueObject.util_equals(this.floatCardData, floatUserCardData.floatCardData);
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
        User user = this.user;
        int iHashCode = (i2 + (user != null ? user.hashCode() : 0)) * 41;
        FloatsCardData floatsCardData = this.floatCardData;
        int iHashCode2 = iHashCode + (floatsCardData != null ? floatsCardData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.user == null) {
            this.user = User.new_();
        }
        if (this.floatCardData == null) {
            this.floatCardData = FloatsCardData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
