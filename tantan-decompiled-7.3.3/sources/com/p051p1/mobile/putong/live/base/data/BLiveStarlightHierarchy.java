package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Grade;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveStarlightHierarchy extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivestarlighthierarchy";

    @ProtobufIndex(index = 2)
    public long grade;

    @NonNull
    @ProtobufIndex(index = 4)
    public String imageUrl;

    @ProtobufIndex(index = 3)
    public long score;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<BLiveStarlightHierarchy> PROTOBUF_ADAPTER = new C12256a();
    public static JsonAdapter<BLiveStarlightHierarchy> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStarlightHierarchy>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStarlightHierarchy.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStarlightHierarchy.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStarlightHierarchy newInstance() {
            return new BLiveStarlightHierarchy();
        }

        public boolean parseField(BLiveStarlightHierarchy bLiveStarlightHierarchy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "imageUrl":
                    bLiveStarlightHierarchy.imageUrl = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveStarlightHierarchy.userId = jsonParser.getValueAsString();
                    return true;
                case "grade":
                    bLiveStarlightHierarchy.grade = jsonParser.getValueAsLong();
                    return true;
                case "score":
                    bLiveStarlightHierarchy.score = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStarlightHierarchy bLiveStarlightHierarchy, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveStarlightHierarchy.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveStarlightHierarchy.grade);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, bLiveStarlightHierarchy.score);
            String str2 = bLiveStarlightHierarchy.imageUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("imageUrl", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStarlightHierarchy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveStarlightHierarchy$a */
    public class C12256a extends MessageNanoAdapter<BLiveStarlightHierarchy> {
        public C12256a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveStarlightHierarchy bLiveStarlightHierarchy) {
            String str = bLiveStarlightHierarchy.userId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, bLiveStarlightHierarchy.grade) + CodedOutputByteBufferNano.m17283j(3, bLiveStarlightHierarchy.score);
            String str2 = bLiveStarlightHierarchy.imageUrl;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            bLiveStarlightHierarchy.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveStarlightHierarchy parse(nc5 nc5Var) throws IOException {
            BLiveStarlightHierarchy bLiveStarlightHierarchy = new BLiveStarlightHierarchy();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bLiveStarlightHierarchy.userId == null) {
                        bLiveStarlightHierarchy.userId = "";
                    }
                    if (bLiveStarlightHierarchy.imageUrl != null) {
                        break;
                    }
                    bLiveStarlightHierarchy.imageUrl = "";
                    break;
                }
                if (iM162497u == 10) {
                    bLiveStarlightHierarchy.userId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    bLiveStarlightHierarchy.grade = nc5Var.m162487k();
                } else if (iM162497u == 24) {
                    bLiveStarlightHierarchy.score = nc5Var.m162487k();
                } else {
                    if (iM162497u != 34) {
                        if (bLiveStarlightHierarchy.userId == null) {
                            bLiveStarlightHierarchy.userId = "";
                        }
                        if (bLiveStarlightHierarchy.imageUrl != null) {
                            break;
                        }
                        bLiveStarlightHierarchy.imageUrl = "";
                        return bLiveStarlightHierarchy;
                    }
                    bLiveStarlightHierarchy.imageUrl = nc5Var.m162495s();
                }
            }
            return bLiveStarlightHierarchy;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveStarlightHierarchy bLiveStarlightHierarchy, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveStarlightHierarchy.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, bLiveStarlightHierarchy.grade);
            codedOutputByteBufferNano.m17307I(3, bLiveStarlightHierarchy.score);
            String str2 = bLiveStarlightHierarchy.imageUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
        }
    }

    public static BLiveStarlightHierarchy new_() {
        BLiveStarlightHierarchy bLiveStarlightHierarchy = new BLiveStarlightHierarchy();
        bLiveStarlightHierarchy.nullCheck();
        return bLiveStarlightHierarchy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStarlightHierarchy mo225055clone() {
        BLiveStarlightHierarchy bLiveStarlightHierarchy = new BLiveStarlightHierarchy();
        bLiveStarlightHierarchy.userId = this.userId;
        bLiveStarlightHierarchy.grade = this.grade;
        bLiveStarlightHierarchy.score = this.score;
        bLiveStarlightHierarchy.imageUrl = this.imageUrl;
        return bLiveStarlightHierarchy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStarlightHierarchy)) {
            return false;
        }
        BLiveStarlightHierarchy bLiveStarlightHierarchy = (BLiveStarlightHierarchy) obj;
        return ValueObject.util_equals(this.userId, bLiveStarlightHierarchy.userId) && this.grade == bLiveStarlightHierarchy.grade && this.score == bLiveStarlightHierarchy.score && ValueObject.util_equals(this.imageUrl, bLiveStarlightHierarchy.imageUrl);
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
        String str = this.userId;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.grade;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.score;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str2 = this.imageUrl;
        int iHashCode2 = i4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.imageUrl == null) {
            this.imageUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
