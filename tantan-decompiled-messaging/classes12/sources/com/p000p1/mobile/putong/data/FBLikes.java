package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.FBLike;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FBLikes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fblikes";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<FBLike> data;
    public static ProtobufAdapter<FBLikes> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBLikes>() { // from class: com.p1.mobile.putong.data.FBLikes.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FBLikes fBLikes) {
            List<FBLike> list = fBLikes.data;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, FBLike.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) fBLikes).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FBLikes m18043parse(nb5 nb5Var) throws IOException {
            FBLikes fBLikes = new FBLikes();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fBLikes.data != null) {
                        break;
                    }
                    fBLikes.data = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (fBLikes.data != null) {
                        break;
                    }
                    fBLikes.data = new ArrayList();
                    return fBLikes;
                }
                fBLikes.data = (List) nb5Var.l(FBLike.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return fBLikes;
        }

        public void serialize(FBLikes fBLikes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<FBLike> list = fBLikes.data;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, FBLike.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FBLikes> JSON_ADAPTER = new ObjectJsonAdapter<FBLikes>() { // from class: com.p1.mobile.putong.data.FBLikes.2
        public Class getDataClass() {
            return FBLikes.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FBLikes mo17830newInstance() {
            return new FBLikes();
        }

        public boolean parseField(FBLikes fBLikes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Data.TYPE)) {
                return false;
            }
            fBLikes.data = JsonAdapter.parseArray(jsonParser, FBLike.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FBLikes fBLikes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(fBLikes, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBLikes fBLikes, JsonGenerator jsonGenerator) throws IOException {
            if (fBLikes.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                JsonAdapter.serializeArray(fBLikes.data, jsonGenerator, FBLike.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBLikes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBLikes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBLikes new_() {
        FBLikes fBLikes = new FBLikes();
        fBLikes.nullCheck();
        return fBLikes;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FBLikes m18042clone() {
        FBLikes fBLikes = new FBLikes();
        List<FBLike> list = this.data;
        if (list != null) {
            fBLikes.data = ValueObject.util_map(list, new w9j() { // from class: l.brf
                public final Object call(Object obj) {
                    return ((FBLike) obj).m18039clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<FBLike> list = this.data;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.data == null) {
            this.data = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
