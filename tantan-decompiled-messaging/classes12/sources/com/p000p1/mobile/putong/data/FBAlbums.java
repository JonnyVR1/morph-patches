package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.FBAlbum;
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
public class FBAlbums extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbalbums";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<FBAlbum> data;

    @NonNull
    @ProtobufIndex(index = 2)
    public Links paging;
    public static ProtobufAdapter<FBAlbums> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBAlbums>() { // from class: com.p1.mobile.putong.data.FBAlbums.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FBAlbums fBAlbums) {
            List<FBAlbum> list = fBAlbums.data;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, FBAlbum.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            Links links = fBAlbums.paging;
            if (links != null) {
                iL += CodedOutputByteBufferNano.l(2, links, Links.PROTOBUF_ADAPTER);
            }
            ((MessageNano) fBAlbums).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FBAlbums m18034parse(nb5 nb5Var) throws IOException {
            FBAlbums fBAlbums = new FBAlbums();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fBAlbums.data == null) {
                        fBAlbums.data = new ArrayList();
                    }
                    if (fBAlbums.paging != null) {
                        break;
                    }
                    fBAlbums.paging = Links.new_();
                    break;
                }
                if (iU == 10) {
                    fBAlbums.data = (List) nb5Var.l(FBAlbum.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (fBAlbums.data == null) {
                            fBAlbums.data = new ArrayList();
                        }
                        if (fBAlbums.paging != null) {
                            break;
                        }
                        fBAlbums.paging = Links.new_();
                        return fBAlbums;
                    }
                    fBAlbums.paging = (Links) nb5Var.l(Links.PROTOBUF_ADAPTER);
                }
            }
            return fBAlbums;
        }

        public void serialize(FBAlbums fBAlbums, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<FBAlbum> list = fBAlbums.data;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, FBAlbum.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Links links = fBAlbums.paging;
            if (links != null) {
                codedOutputByteBufferNano.K(2, links, Links.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FBAlbums> JSON_ADAPTER = new ObjectJsonAdapter<FBAlbums>() { // from class: com.p1.mobile.putong.data.FBAlbums.2
        public Class getDataClass() {
            return FBAlbums.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FBAlbums mo17830newInstance() {
            return new FBAlbums();
        }

        public boolean parseField(FBAlbums fBAlbums, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("paging")) {
                fBAlbums.paging = (Links) Links.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Data.TYPE)) {
                return false;
            }
            fBAlbums.data = JsonAdapter.parseArray(jsonParser, FBAlbum.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FBAlbums fBAlbums, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("paging") || str.equals(Data.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(fBAlbums, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBAlbums fBAlbums, JsonGenerator jsonGenerator) throws IOException {
            if (fBAlbums.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                JsonAdapter.serializeArray(fBAlbums.data, jsonGenerator, FBAlbum.JSON_ADAPTER);
            }
            if (fBAlbums.paging != null) {
                jsonGenerator.writeFieldName("paging");
                Links.JSON_ADAPTER.serialize(fBAlbums.paging, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBAlbums) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBAlbums) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBAlbums new_() {
        FBAlbums fBAlbums = new FBAlbums();
        fBAlbums.nullCheck();
        return fBAlbums;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FBAlbums m18033clone() {
        FBAlbums fBAlbums = new FBAlbums();
        List<FBAlbum> list = this.data;
        if (list != null) {
            fBAlbums.data = ValueObject.util_map(list, new w9j() { // from class: l.arf
                public final Object call(Object obj) {
                    return ((FBAlbum) obj).m18030clone();
                }
            });
        }
        Links links = this.paging;
        if (links != null) {
            fBAlbums.paging = links.m18297clone();
        }
        return fBAlbums;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FBAlbums)) {
            return false;
        }
        FBAlbums fBAlbums = (FBAlbums) obj;
        return ValueObject.util_equals(this.data, fBAlbums.data) && ValueObject.util_equals(this.paging, fBAlbums.paging);
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
        List<FBAlbum> list = this.data;
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
