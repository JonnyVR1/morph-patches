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
public class FacebookPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "facebookpicture";

    @NonNull
    @ProtobufIndex(index = 1)
    public FacebookPictureInfo data;
    public static ProtobufAdapter<FacebookPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<FacebookPicture>() { // from class: com.p1.mobile.putong.data.FacebookPicture.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FacebookPicture facebookPicture) {
            FacebookPictureInfo facebookPictureInfo = facebookPicture.data;
            int iL = facebookPictureInfo != null ? CodedOutputByteBufferNano.l(1, facebookPictureInfo, FacebookPictureInfo.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) facebookPicture).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FacebookPicture m18079parse(nb5 nb5Var) throws IOException {
            FacebookPicture facebookPicture = new FacebookPicture();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (facebookPicture.data != null) {
                        break;
                    }
                    facebookPicture.data = FacebookPictureInfo.new_();
                    break;
                }
                if (iU != 10) {
                    if (facebookPicture.data != null) {
                        break;
                    }
                    facebookPicture.data = FacebookPictureInfo.new_();
                    return facebookPicture;
                }
                facebookPicture.data = (FacebookPictureInfo) nb5Var.l(FacebookPictureInfo.PROTOBUF_ADAPTER);
            }
            return facebookPicture;
        }

        public void serialize(FacebookPicture facebookPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            FacebookPictureInfo facebookPictureInfo = facebookPicture.data;
            if (facebookPictureInfo != null) {
                codedOutputByteBufferNano.K(1, facebookPictureInfo, FacebookPictureInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FacebookPicture> JSON_ADAPTER = new ObjectJsonAdapter<FacebookPicture>() { // from class: com.p1.mobile.putong.data.FacebookPicture.2
        public Class getDataClass() {
            return FacebookPicture.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FacebookPicture mo17830newInstance() {
            return new FacebookPicture();
        }

        public boolean parseField(FacebookPicture facebookPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Data.TYPE)) {
                return false;
            }
            facebookPicture.data = (FacebookPictureInfo) FacebookPictureInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FacebookPicture facebookPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(facebookPicture, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FacebookPicture facebookPicture, JsonGenerator jsonGenerator) throws IOException {
            if (facebookPicture.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                FacebookPictureInfo.JSON_ADAPTER.serialize(facebookPicture.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FacebookPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FacebookPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FacebookPicture new_() {
        FacebookPicture facebookPicture = new FacebookPicture();
        facebookPicture.nullCheck();
        return facebookPicture;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FacebookPicture m18078clone() {
        FacebookPicture facebookPicture = new FacebookPicture();
        FacebookPictureInfo facebookPictureInfo = this.data;
        if (facebookPictureInfo != null) {
            facebookPicture.data = facebookPictureInfo.m18081clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        FacebookPictureInfo facebookPictureInfo = this.data;
        int iHashCode = i2 + (facebookPictureInfo != null ? facebookPictureInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.data == null) {
            this.data = FacebookPictureInfo.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
