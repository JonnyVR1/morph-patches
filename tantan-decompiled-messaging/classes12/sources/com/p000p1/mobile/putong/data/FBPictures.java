package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.FBPicture;
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
public class FBPictures extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbpictures";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<FBPicture> data;

    @NonNull
    @ProtobufIndex(index = 2)
    public Links paging;
    public static ProtobufAdapter<FBPictures> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBPictures>() { // from class: com.p1.mobile.putong.data.FBPictures.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FBPictures fBPictures) {
            List<FBPicture> list = fBPictures.data;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, FBPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            Links links = fBPictures.paging;
            if (links != null) {
                iL += CodedOutputByteBufferNano.l(2, links, Links.PROTOBUF_ADAPTER);
            }
            ((MessageNano) fBPictures).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FBPictures m18052parse(nb5 nb5Var) throws IOException {
            FBPictures fBPictures = new FBPictures();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fBPictures.data == null) {
                        fBPictures.data = new ArrayList();
                    }
                    if (fBPictures.paging != null) {
                        break;
                    }
                    fBPictures.paging = Links.new_();
                    break;
                }
                if (iU == 10) {
                    fBPictures.data = (List) nb5Var.l(FBPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (fBPictures.data == null) {
                            fBPictures.data = new ArrayList();
                        }
                        if (fBPictures.paging != null) {
                            break;
                        }
                        fBPictures.paging = Links.new_();
                        return fBPictures;
                    }
                    fBPictures.paging = (Links) nb5Var.l(Links.PROTOBUF_ADAPTER);
                }
            }
            return fBPictures;
        }

        public void serialize(FBPictures fBPictures, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<FBPicture> list = fBPictures.data;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, FBPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Links links = fBPictures.paging;
            if (links != null) {
                codedOutputByteBufferNano.K(2, links, Links.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FBPictures> JSON_ADAPTER = new ObjectJsonAdapter<FBPictures>() { // from class: com.p1.mobile.putong.data.FBPictures.2
        public Class getDataClass() {
            return FBPictures.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FBPictures mo17830newInstance() {
            return new FBPictures();
        }

        public boolean parseField(FBPictures fBPictures, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("paging")) {
                fBPictures.paging = (Links) Links.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Data.TYPE)) {
                return false;
            }
            fBPictures.data = JsonAdapter.parseArray(jsonParser, FBPicture.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FBPictures fBPictures, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("paging") || str.equals(Data.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(fBPictures, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBPictures fBPictures, JsonGenerator jsonGenerator) throws IOException {
            if (fBPictures.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                JsonAdapter.serializeArray(fBPictures.data, jsonGenerator, FBPicture.JSON_ADAPTER);
            }
            if (fBPictures.paging != null) {
                jsonGenerator.writeFieldName("paging");
                Links.JSON_ADAPTER.serialize(fBPictures.paging, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBPictures) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBPictures) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBPictures new_() {
        FBPictures fBPictures = new FBPictures();
        fBPictures.nullCheck();
        return fBPictures;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FBPictures m18051clone() {
        FBPictures fBPictures = new FBPictures();
        List<FBPicture> list = this.data;
        if (list != null) {
            fBPictures.data = ValueObject.util_map(list, new w9j() { // from class: l.crf
                public final Object call(Object obj) {
                    return ((FBPicture) obj).m18048clone();
                }
            });
        }
        Links links = this.paging;
        if (links != null) {
            fBPictures.paging = links.m18297clone();
        }
        return fBPictures;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FBPictures)) {
            return false;
        }
        FBPictures fBPictures = (FBPictures) obj;
        return ValueObject.util_equals(this.data, fBPictures.data) && ValueObject.util_equals(this.paging, fBPictures.paging);
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
        List<FBPicture> list = this.data;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        Links links = this.paging;
        int iHashCode2 = iHashCode + (links != null ? links.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.data == null) {
            this.data = new ArrayList();
        }
        if (this.paging == null) {
            this.paging = Links.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
