package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.FBLike;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class FBLikes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fblikes";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<FBLike> data;
    public static ProtobufAdapter<FBLikes> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBLikes>() { // from class: com.p1.mobile.putong.data.FBLikes.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FBLikes fBLikes) {
            List<FBLike> list = fBLikes.data;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, FBLike.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            fBLikes.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FBLikes parse(nb5 nb5Var) throws IOException {
            FBLikes fBLikes = new FBLikes();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (fBLikes.data != null) {
                        break;
                    }
                    fBLikes.data = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (fBLikes.data != null) {
                        break;
                    }
                    fBLikes.data = new ArrayList();
                    return fBLikes;
                }
                fBLikes.data = (List) nb5Var.m158743l(FBLike.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return fBLikes;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FBLikes fBLikes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<FBLike> list = fBLikes.data;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, FBLike.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FBLikes> JSON_ADAPTER = new ObjectJsonAdapter<FBLikes>() { // from class: com.p1.mobile.putong.data.FBLikes.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FBLikes.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FBLikes newInstance() {
            return new FBLikes();
        }

        public boolean parseField(FBLikes fBLikes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            fBLikes.data = JsonAdapter.parseArray(jsonParser, FBLike.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FBLikes fBLikes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(fBLikes, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBLikes fBLikes, JsonGenerator jsonGenerator) throws IOException {
            if (fBLikes.data != null) {
                jsonGenerator.writeFieldName("data");
                JsonAdapter.serializeArray(fBLikes.data, jsonGenerator, FBLike.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBLikes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBLikes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBLikes new_() {
        FBLikes fBLikes = new FBLikes();
        fBLikes.nullCheck();
        return fBLikes;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FBLikes mo223809clone() {
        FBLikes fBLikes = new FBLikes();
        List<FBLike> list = this.data;
        if (list != null) {
            fBLikes.data = ValueObject.util_map(list, new w9j() { // from class: l.brf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FBLike) obj).mo223809clone();
                }
            });
        }
        return fBLikes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FBLikes) {
            return ValueObject.util_equals(this.data, ((FBLikes) obj).data);
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
        List<FBLike> list = this.data;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.data == null) {
            this.data = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
