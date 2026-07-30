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
public class FBProfile extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbprofile";

    @NonNull
    @ProtobufIndex(index = 1)
    public FBPicture data;
    public static ProtobufAdapter<FBProfile> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBProfile>() { // from class: com.p1.mobile.putong.data.FBProfile.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FBProfile fBProfile) {
            FBPicture fBPicture = fBProfile.data;
            int iL = fBPicture != null ? CodedOutputByteBufferNano.l(1, fBPicture, FBPicture.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) fBProfile).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FBProfile m18055parse(nb5 nb5Var) throws IOException {
            FBProfile fBProfile = new FBProfile();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fBProfile.data != null) {
                        break;
                    }
                    fBProfile.data = FBPicture.new_();
                    break;
                }
                if (iU != 10) {
                    if (fBProfile.data != null) {
                        break;
                    }
                    fBProfile.data = FBPicture.new_();
                    return fBProfile;
                }
                fBProfile.data = (FBPicture) nb5Var.l(FBPicture.PROTOBUF_ADAPTER);
            }
            return fBProfile;
        }

        public void serialize(FBProfile fBProfile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            FBPicture fBPicture = fBProfile.data;
            if (fBPicture != null) {
                codedOutputByteBufferNano.K(1, fBPicture, FBPicture.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FBProfile> JSON_ADAPTER = new ObjectJsonAdapter<FBProfile>() { // from class: com.p1.mobile.putong.data.FBProfile.2
        public Class getDataClass() {
            return FBProfile.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FBProfile mo17830newInstance() {
            return new FBProfile();
        }

        public boolean parseField(FBProfile fBProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Data.TYPE)) {
                return false;
            }
            fBProfile.data = (FBPicture) FBPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FBProfile fBProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(fBProfile, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBProfile fBProfile, JsonGenerator jsonGenerator) throws IOException {
            if (fBProfile.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                FBPicture.JSON_ADAPTER.serialize(fBProfile.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBProfile new_() {
        FBProfile fBProfile = new FBProfile();
        fBProfile.nullCheck();
        return fBProfile;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FBProfile m18054clone() {
        FBProfile fBProfile = new FBProfile();
        FBPicture fBPicture = this.data;
        if (fBPicture != null) {
            fBProfile.data = fBPicture.m18048clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        FBPicture fBPicture = this.data;
        int iHashCode = i2 + (fBPicture != null ? fBPicture.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.data == null) {
            this.data = FBPicture.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
