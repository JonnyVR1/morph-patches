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
public class FacebookPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "facebookpicture";

    @NonNull
    @ProtobufIndex(index = 1)
    public FacebookPictureInfo data;
    public static ProtobufAdapter<FacebookPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<FacebookPicture>() { // from class: com.p1.mobile.putong.data.FacebookPicture.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FacebookPicture facebookPicture) {
            FacebookPictureInfo facebookPictureInfo = facebookPicture.data;
            int iM17285l = facebookPictureInfo != null ? CodedOutputByteBufferNano.m17285l(1, facebookPictureInfo, FacebookPictureInfo.PROTOBUF_ADAPTER) : 0;
            facebookPicture.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FacebookPicture parse(nc5 nc5Var) throws IOException {
            FacebookPicture facebookPicture = new FacebookPicture();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (facebookPicture.data != null) {
                        break;
                    }
                    facebookPicture.data = FacebookPictureInfo.new_();
                    break;
                }
                if (iM162497u != 10) {
                    if (facebookPicture.data != null) {
                        break;
                    }
                    facebookPicture.data = FacebookPictureInfo.new_();
                    return facebookPicture;
                }
                facebookPicture.data = (FacebookPictureInfo) nc5Var.m162488l(FacebookPictureInfo.PROTOBUF_ADAPTER);
            }
            return facebookPicture;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FacebookPicture facebookPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            FacebookPictureInfo facebookPictureInfo = facebookPicture.data;
            if (facebookPictureInfo != null) {
                codedOutputByteBufferNano.m17309K(1, facebookPictureInfo, FacebookPictureInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FacebookPicture> JSON_ADAPTER = new ObjectJsonAdapter<FacebookPicture>() { // from class: com.p1.mobile.putong.data.FacebookPicture.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FacebookPicture.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FacebookPicture newInstance() {
            return new FacebookPicture();
        }

        public boolean parseField(FacebookPicture facebookPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            facebookPicture.data = FacebookPictureInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FacebookPicture facebookPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(facebookPicture, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FacebookPicture facebookPicture, JsonGenerator jsonGenerator) throws IOException {
            if (facebookPicture.data != null) {
                jsonGenerator.writeFieldName("data");
                FacebookPictureInfo.JSON_ADAPTER.serialize(facebookPicture.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FacebookPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FacebookPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FacebookPicture new_() {
        FacebookPicture facebookPicture = new FacebookPicture();
        facebookPicture.nullCheck();
        return facebookPicture;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FacebookPicture mo225055clone() {
        FacebookPicture facebookPicture = new FacebookPicture();
        FacebookPictureInfo facebookPictureInfo = this.data;
        if (facebookPictureInfo != null) {
            facebookPicture.data = facebookPictureInfo.mo225055clone();
        }
        return facebookPicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FacebookPicture) {
            return ValueObject.util_equals(this.data, ((FacebookPicture) obj).data);
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
        FacebookPictureInfo facebookPictureInfo = this.data;
        int iHashCode = i2 + (facebookPictureInfo != null ? facebookPictureInfo.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.data == null) {
            this.data = FacebookPictureInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
