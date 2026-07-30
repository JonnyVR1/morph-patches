package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class FBProfile extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbprofile";

    @NonNull
    @ProtobufIndex(index = 1)
    public FBPicture data;
    public static ProtobufAdapter<FBProfile> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBProfile>() { // from class: com.p1.mobile.putong.data.FBProfile.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FBProfile fBProfile) {
            FBPicture fBPicture = fBProfile.data;
            int iM17230l = fBPicture != null ? CodedOutputByteBufferNano.m17230l(1, fBPicture, FBPicture.PROTOBUF_ADAPTER) : 0;
            fBProfile.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FBProfile parse(nb5 nb5Var) throws IOException {
            FBProfile fBProfile = new FBProfile();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (fBProfile.data != null) {
                        break;
                    }
                    fBProfile.data = FBPicture.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (fBProfile.data != null) {
                        break;
                    }
                    fBProfile.data = FBPicture.new_();
                    return fBProfile;
                }
                fBProfile.data = (FBPicture) nb5Var.m158743l(FBPicture.PROTOBUF_ADAPTER);
            }
            return fBProfile;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FBProfile fBProfile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            FBPicture fBPicture = fBProfile.data;
            if (fBPicture != null) {
                codedOutputByteBufferNano.m17254K(1, fBPicture, FBPicture.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FBProfile> JSON_ADAPTER = new ObjectJsonAdapter<FBProfile>() { // from class: com.p1.mobile.putong.data.FBProfile.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FBProfile.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FBProfile newInstance() {
            return new FBProfile();
        }

        public boolean parseField(FBProfile fBProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            fBProfile.data = FBPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FBProfile fBProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(fBProfile, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBProfile fBProfile, JsonGenerator jsonGenerator) throws IOException {
            if (fBProfile.data != null) {
                jsonGenerator.writeFieldName("data");
                FBPicture.JSON_ADAPTER.serialize(fBProfile.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBProfile new_() {
        FBProfile fBProfile = new FBProfile();
        fBProfile.nullCheck();
        return fBProfile;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FBProfile mo223809clone() {
        FBProfile fBProfile = new FBProfile();
        FBPicture fBPicture = this.data;
        if (fBPicture != null) {
            fBProfile.data = fBPicture.mo223809clone();
        }
        return fBProfile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FBProfile) {
            return ValueObject.util_equals(this.data, ((FBProfile) obj).data);
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
        FBPicture fBPicture = this.data;
        int iHashCode = i2 + (fBPicture != null ? fBPicture.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.data == null) {
            this.data = FBPicture.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
