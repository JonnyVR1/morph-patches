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
public class FacebookPictureInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "facebookpictureinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<FacebookPictureInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FacebookPictureInfo>() { // from class: com.p1.mobile.putong.data.FacebookPictureInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FacebookPictureInfo facebookPictureInfo) {
            String str = facebookPictureInfo.url;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) facebookPictureInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FacebookPictureInfo m18082parse(nb5 nb5Var) throws IOException {
            FacebookPictureInfo facebookPictureInfo = new FacebookPictureInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (facebookPictureInfo.url != null) {
                        break;
                    }
                    facebookPictureInfo.url = "";
                    break;
                }
                if (iU != 10) {
                    if (facebookPictureInfo.url != null) {
                        break;
                    }
                    facebookPictureInfo.url = "";
                    return facebookPictureInfo;
                }
                facebookPictureInfo.url = nb5Var.s();
            }
            return facebookPictureInfo;
        }

        public void serialize(FacebookPictureInfo facebookPictureInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = facebookPictureInfo.url;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<FacebookPictureInfo> JSON_ADAPTER = new ObjectJsonAdapter<FacebookPictureInfo>() { // from class: com.p1.mobile.putong.data.FacebookPictureInfo.2
        public Class getDataClass() {
            return FacebookPictureInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FacebookPictureInfo mo17830newInstance() {
            return new FacebookPictureInfo();
        }

        public boolean parseField(FacebookPictureInfo facebookPictureInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("url")) {
                return false;
            }
            facebookPictureInfo.url = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FacebookPictureInfo facebookPictureInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(facebookPictureInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FacebookPictureInfo facebookPictureInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = facebookPictureInfo.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FacebookPictureInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FacebookPictureInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FacebookPictureInfo new_() {
        FacebookPictureInfo facebookPictureInfo = new FacebookPictureInfo();
        facebookPictureInfo.nullCheck();
        return facebookPictureInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FacebookPictureInfo m18081clone() {
        FacebookPictureInfo facebookPictureInfo = new FacebookPictureInfo();
        facebookPictureInfo.url = this.url;
        return facebookPictureInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FacebookPictureInfo) {
            return ValueObject.util_equals(this.url, ((FacebookPictureInfo) obj).url);
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
        String str = this.url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
