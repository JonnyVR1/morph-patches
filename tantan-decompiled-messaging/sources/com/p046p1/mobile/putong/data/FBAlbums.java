package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.FBAlbum;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FBAlbums fBAlbums) {
            List<FBAlbum> list = fBAlbums.data;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, FBAlbum.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            Links links = fBAlbums.paging;
            if (links != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, links, Links.PROTOBUF_ADAPTER);
            }
            fBAlbums.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FBAlbums parse(nb5 nb5Var) throws IOException {
            FBAlbums fBAlbums = new FBAlbums();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (fBAlbums.data == null) {
                        fBAlbums.data = new ArrayList();
                    }
                    if (fBAlbums.paging != null) {
                        break;
                    }
                    fBAlbums.paging = Links.new_();
                    break;
                }
                if (iM158752u == 10) {
                    fBAlbums.data = (List) nb5Var.m158743l(FBAlbum.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (fBAlbums.data == null) {
                            fBAlbums.data = new ArrayList();
                        }
                        if (fBAlbums.paging != null) {
                            break;
                        }
                        fBAlbums.paging = Links.new_();
                        return fBAlbums;
                    }
                    fBAlbums.paging = (Links) nb5Var.m158743l(Links.PROTOBUF_ADAPTER);
                }
            }
            return fBAlbums;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FBAlbums fBAlbums, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<FBAlbum> list = fBAlbums.data;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, FBAlbum.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Links links = fBAlbums.paging;
            if (links != null) {
                codedOutputByteBufferNano.m17254K(2, links, Links.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FBAlbums> JSON_ADAPTER = new ObjectJsonAdapter<FBAlbums>() { // from class: com.p1.mobile.putong.data.FBAlbums.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FBAlbums.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FBAlbums newInstance() {
            return new FBAlbums();
        }

        public boolean parseField(FBAlbums fBAlbums, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("paging")) {
                fBAlbums.paging = Links.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("data")) {
                return false;
            }
            fBAlbums.data = JsonAdapter.parseArray(jsonParser, FBAlbum.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FBAlbums fBAlbums, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("paging") || str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(fBAlbums, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBAlbums fBAlbums, JsonGenerator jsonGenerator) throws IOException {
            if (fBAlbums.data != null) {
                jsonGenerator.writeFieldName("data");
                JsonAdapter.serializeArray(fBAlbums.data, jsonGenerator, FBAlbum.JSON_ADAPTER);
            }
            if (fBAlbums.paging != null) {
                jsonGenerator.writeFieldName("paging");
                Links.JSON_ADAPTER.serialize(fBAlbums.paging, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBAlbums) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBAlbums) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBAlbums new_() {
        FBAlbums fBAlbums = new FBAlbums();
        fBAlbums.nullCheck();
        return fBAlbums;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FBAlbums mo223809clone() {
        FBAlbums fBAlbums = new FBAlbums();
        List<FBAlbum> list = this.data;
        if (list != null) {
            fBAlbums.data = ValueObject.util_map(list, new w9j() { // from class: l.arf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FBAlbum) obj).mo223809clone();
                }
            });
        }
        Links links = this.paging;
        if (links != null) {
            fBAlbums.paging = links.mo223809clone();
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
        List<FBAlbum> list = this.data;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        Links links = this.paging;
        int iHashCode2 = iHashCode + (links != null ? links.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.data == null) {
            this.data = new ArrayList();
        }
        if (this.paging == null) {
            this.paging = Links.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
