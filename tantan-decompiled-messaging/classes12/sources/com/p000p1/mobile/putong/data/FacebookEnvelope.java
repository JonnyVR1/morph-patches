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
public class FacebookEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "facebookenvelope";

    @NonNull
    @ProtobufIndex(index = 1)
    public FacebookData data;
    public static ProtobufAdapter<FacebookEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<FacebookEnvelope>() { // from class: com.p1.mobile.putong.data.FacebookEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FacebookEnvelope facebookEnvelope) {
            FacebookData facebookData = facebookEnvelope.data;
            int iL = facebookData != null ? CodedOutputByteBufferNano.l(1, facebookData, FacebookData.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) facebookEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FacebookEnvelope m18073parse(nb5 nb5Var) throws IOException {
            FacebookEnvelope facebookEnvelope = new FacebookEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (facebookEnvelope.data != null) {
                        break;
                    }
                    facebookEnvelope.data = FacebookData.new_();
                    break;
                }
                if (iU != 10) {
                    if (facebookEnvelope.data != null) {
                        break;
                    }
                    facebookEnvelope.data = FacebookData.new_();
                    return facebookEnvelope;
                }
                facebookEnvelope.data = (FacebookData) nb5Var.l(FacebookData.PROTOBUF_ADAPTER);
            }
            return facebookEnvelope;
        }

        public void serialize(FacebookEnvelope facebookEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            FacebookData facebookData = facebookEnvelope.data;
            if (facebookData != null) {
                codedOutputByteBufferNano.K(1, facebookData, FacebookData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FacebookEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<FacebookEnvelope>() { // from class: com.p1.mobile.putong.data.FacebookEnvelope.2
        public Class getDataClass() {
            return FacebookEnvelope.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FacebookEnvelope mo17830newInstance() {
            return new FacebookEnvelope();
        }

        public boolean parseField(FacebookEnvelope facebookEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Data.TYPE)) {
                return false;
            }
            facebookEnvelope.data = (FacebookData) FacebookData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FacebookEnvelope facebookEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(facebookEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FacebookEnvelope facebookEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (facebookEnvelope.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                FacebookData.JSON_ADAPTER.serialize(facebookEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FacebookEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FacebookEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FacebookEnvelope new_() {
        FacebookEnvelope facebookEnvelope = new FacebookEnvelope();
        facebookEnvelope.nullCheck();
        return facebookEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FacebookEnvelope m18072clone() {
        FacebookEnvelope facebookEnvelope = new FacebookEnvelope();
        FacebookData facebookData = this.data;
        if (facebookData != null) {
            facebookEnvelope.data = facebookData.m18069clone();
        }
        return facebookEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FacebookEnvelope) {
            return ValueObject.util_equals(this.data, ((FacebookEnvelope) obj).data);
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
        FacebookData facebookData = this.data;
        int iHashCode = i2 + (facebookData != null ? facebookData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.data == null) {
            this.data = FacebookData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
