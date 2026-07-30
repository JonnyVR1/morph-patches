package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class FacebookEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "facebookenvelope";

    @NonNull
    @ProtobufIndex(index = 1)
    public FacebookData data;
    public static ProtobufAdapter<FacebookEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<FacebookEnvelope>() { // from class: com.p1.mobile.putong.data.FacebookEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FacebookEnvelope facebookEnvelope) {
            FacebookData facebookData = facebookEnvelope.data;
            int iM17285l = facebookData != null ? CodedOutputByteBufferNano.m17285l(1, facebookData, FacebookData.PROTOBUF_ADAPTER) : 0;
            facebookEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FacebookEnvelope parse(nc5 nc5Var) throws IOException {
            FacebookEnvelope facebookEnvelope = new FacebookEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (facebookEnvelope.data != null) {
                        break;
                    }
                    facebookEnvelope.data = FacebookData.new_();
                    break;
                }
                if (iM162497u != 10) {
                    if (facebookEnvelope.data != null) {
                        break;
                    }
                    facebookEnvelope.data = FacebookData.new_();
                    return facebookEnvelope;
                }
                facebookEnvelope.data = (FacebookData) nc5Var.m162488l(FacebookData.PROTOBUF_ADAPTER);
            }
            return facebookEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FacebookEnvelope facebookEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            FacebookData facebookData = facebookEnvelope.data;
            if (facebookData != null) {
                codedOutputByteBufferNano.m17309K(1, facebookData, FacebookData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FacebookEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<FacebookEnvelope>() { // from class: com.p1.mobile.putong.data.FacebookEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FacebookEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FacebookEnvelope newInstance() {
            return new FacebookEnvelope();
        }

        public boolean parseField(FacebookEnvelope facebookEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            facebookEnvelope.data = FacebookData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FacebookEnvelope facebookEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(facebookEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FacebookEnvelope facebookEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (facebookEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                FacebookData.JSON_ADAPTER.serialize(facebookEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FacebookEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FacebookEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FacebookEnvelope new_() {
        FacebookEnvelope facebookEnvelope = new FacebookEnvelope();
        facebookEnvelope.nullCheck();
        return facebookEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FacebookEnvelope mo225055clone() {
        FacebookEnvelope facebookEnvelope = new FacebookEnvelope();
        FacebookData facebookData = this.data;
        if (facebookData != null) {
            facebookEnvelope.data = facebookData.mo225055clone();
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
        FacebookData facebookData = this.data;
        int iHashCode = i2 + (facebookData != null ? facebookData.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.data == null) {
            this.data = FacebookData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
