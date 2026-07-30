package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FacebookData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "facebookdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public FacebookUserInfo user;
    public static ProtobufAdapter<FacebookData> PROTOBUF_ADAPTER = new MessageNanoAdapter<FacebookData>() { // from class: com.p1.mobile.putong.data.FacebookData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FacebookData facebookData) {
            FacebookUserInfo facebookUserInfo = facebookData.user;
            int iL = facebookUserInfo != null ? CodedOutputByteBufferNano.l(1, facebookUserInfo, FacebookUserInfo.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) facebookData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FacebookData m18070parse(nb5 nb5Var) throws IOException {
            FacebookData facebookData = new FacebookData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (facebookData.user != null) {
                        break;
                    }
                    facebookData.user = FacebookUserInfo.new_();
                    break;
                }
                if (iU != 10) {
                    if (facebookData.user != null) {
                        break;
                    }
                    facebookData.user = FacebookUserInfo.new_();
                    return facebookData;
                }
                facebookData.user = (FacebookUserInfo) nb5Var.l(FacebookUserInfo.PROTOBUF_ADAPTER);
            }
            return facebookData;
        }

        public void serialize(FacebookData facebookData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            FacebookUserInfo facebookUserInfo = facebookData.user;
            if (facebookUserInfo != null) {
                codedOutputByteBufferNano.K(1, facebookUserInfo, FacebookUserInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FacebookData> JSON_ADAPTER = new ObjectJsonAdapter<FacebookData>() { // from class: com.p1.mobile.putong.data.FacebookData.2
        public Class getDataClass() {
            return FacebookData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FacebookData mo17830newInstance() {
            return new FacebookData();
        }

        public boolean parseField(FacebookData facebookData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("user")) {
                return false;
            }
            facebookData.user = (FacebookUserInfo) FacebookUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FacebookData facebookData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("user")) {
                return true;
            }
            return super.parseFieldCheck(facebookData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FacebookData facebookData, JsonGenerator jsonGenerator) throws IOException {
            if (facebookData.user != null) {
                jsonGenerator.writeFieldName("user");
                FacebookUserInfo.JSON_ADAPTER.serialize(facebookData.user, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FacebookData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FacebookData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FacebookData new_() {
        FacebookData facebookData = new FacebookData();
        facebookData.nullCheck();
        return facebookData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FacebookData m18069clone() {
        FacebookData facebookData = new FacebookData();
        FacebookUserInfo facebookUserInfo = this.user;
        if (facebookUserInfo != null) {
            facebookData.user = facebookUserInfo.m18084clone();
        }
        return facebookData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FacebookData) {
            return ValueObject.util_equals(this.user, ((FacebookData) obj).user);
        }
        return false;
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
        FacebookUserInfo facebookUserInfo = this.user;
        int iHashCode = i2 + (facebookUserInfo != null ? facebookUserInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.user == null) {
            this.user = FacebookUserInfo.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
