package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.FBPicture;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FBPictures fBPictures) {
            List<FBPicture> list = fBPictures.data;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, FBPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            Links links = fBPictures.paging;
            if (links != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, links, Links.PROTOBUF_ADAPTER);
            }
            fBPictures.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FBPictures parse(nb5 nb5Var) throws IOException {
            FBPictures fBPictures = new FBPictures();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (fBPictures.data == null) {
                        fBPictures.data = new ArrayList();
                    }
                    if (fBPictures.paging != null) {
                        break;
                    }
                    fBPictures.paging = Links.new_();
                    break;
                }
                if (iM158752u == 10) {
                    fBPictures.data = (List) nb5Var.m158743l(FBPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (fBPictures.data == null) {
                            fBPictures.data = new ArrayList();
                        }
                        if (fBPictures.paging != null) {
                            break;
                        }
                        fBPictures.paging = Links.new_();
                        return fBPictures;
                    }
                    fBPictures.paging = (Links) nb5Var.m158743l(Links.PROTOBUF_ADAPTER);
                }
            }
            return fBPictures;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FBPictures fBPictures, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<FBPicture> list = fBPictures.data;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, FBPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Links links = fBPictures.paging;
            if (links != null) {
                codedOutputByteBufferNano.m17254K(2, links, Links.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FBPictures> JSON_ADAPTER = new ObjectJsonAdapter<FBPictures>() { // from class: com.p1.mobile.putong.data.FBPictures.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FBPictures.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FBPictures newInstance() {
            return new FBPictures();
        }

        public boolean parseField(FBPictures fBPictures, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("paging")) {
                fBPictures.paging = Links.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("data")) {
                return false;
            }
            fBPictures.data = JsonAdapter.parseArray(jsonParser, FBPicture.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FBPictures fBPictures, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("paging") || str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(fBPictures, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBPictures fBPictures, JsonGenerator jsonGenerator) throws IOException {
            if (fBPictures.data != null) {
                jsonGenerator.writeFieldName("data");
                JsonAdapter.serializeArray(fBPictures.data, jsonGenerator, FBPicture.JSON_ADAPTER);
            }
            if (fBPictures.paging != null) {
                jsonGenerator.writeFieldName("paging");
                Links.JSON_ADAPTER.serialize(fBPictures.paging, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBPictures) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBPictures) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBPictures new_() {
        FBPictures fBPictures = new FBPictures();
        fBPictures.nullCheck();
        return fBPictures;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FBPictures mo223809clone() {
        FBPictures fBPictures = new FBPictures();
        List<FBPicture> list = this.data;
        if (list != null) {
            fBPictures.data = ValueObject.util_map(list, new w9j() { // from class: l.crf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FBPicture) obj).mo223809clone();
                }
            });
        }
        Links links = this.paging;
        if (links != null) {
            fBPictures.paging = links.mo223809clone();
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
        List<FBPicture> list = this.data;
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
