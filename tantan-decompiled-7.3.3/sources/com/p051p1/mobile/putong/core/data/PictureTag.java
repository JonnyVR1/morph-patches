package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.PictureTag;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class PictureTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picturetag";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 2)
    public int f21211id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> pictureTags;
    public static ProtobufAdapter<PictureTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<PictureTag>() { // from class: com.p1.mobile.putong.core.data.PictureTag.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PictureTag pictureTag) {
            List<String> list = pictureTag.pictureTags;
            int iM17285l = (list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17281h(2, pictureTag.f21211id);
            String str = pictureTag.name;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(3, str);
            }
            pictureTag.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PictureTag parse(nc5 nc5Var) throws IOException {
            PictureTag pictureTag = new PictureTag();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (pictureTag.name == null) {
                        pictureTag.name = "";
                    }
                    if (pictureTag.pictureTags != null) {
                        break;
                    }
                    pictureTag.pictureTags = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    pictureTag.pictureTags = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 16) {
                    pictureTag.f21211id = nc5Var.m162486j();
                } else {
                    if (iM162497u != 26) {
                        if (pictureTag.name == null) {
                            pictureTag.name = "";
                        }
                        if (pictureTag.pictureTags != null) {
                            break;
                        }
                        pictureTag.pictureTags = new ArrayList();
                        return pictureTag;
                    }
                    pictureTag.name = nc5Var.m162495s();
                }
            }
            return pictureTag;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PictureTag pictureTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = pictureTag.pictureTags;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(2, pictureTag.f21211id);
            String str = pictureTag.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
        }
    };
    public static JsonAdapter<PictureTag> JSON_ADAPTER = new ObjectJsonAdapter<PictureTag>() { // from class: com.p1.mobile.putong.core.data.PictureTag.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PictureTag.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PictureTag newInstance() {
            return new PictureTag();
        }

        public boolean parseField(PictureTag pictureTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pictureTags":
                    pictureTag.pictureTags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    pictureTag.f21211id = jsonParser.getValueAsInt();
                    return false;
                case "name":
                    pictureTag.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PictureTag pictureTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "pictureTags":
                    return true;
                case "id":
                    return false;
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(pictureTag, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PictureTag pictureTag, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", pictureTag.f21211id);
            String str = pictureTag.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (pictureTag.pictureTags != null) {
                jsonGenerator.writeFieldName("pictureTags");
                JsonAdapter.serializeArray(pictureTag.pictureTags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PictureTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PictureTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36750a(String str) {
        return str;
    }

    public static PictureTag new_() {
        PictureTag pictureTag = new PictureTag();
        pictureTag.nullCheck();
        return pictureTag;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PictureTag mo225055clone() {
        PictureTag pictureTag = new PictureTag();
        pictureTag.f21211id = this.f21211id;
        pictureTag.name = this.name;
        List<String> list = this.pictureTags;
        if (list != null) {
            pictureTag.pictureTags = ValueObject.util_map(list, new qcj() { // from class: l.sp70
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return PictureTag.m36750a((String) obj);
                }
            });
        }
        return pictureTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PictureTag)) {
            return false;
        }
        PictureTag pictureTag = (PictureTag) obj;
        return this.f21211id == pictureTag.f21211id && ValueObject.util_equals(this.name, pictureTag.name) && ValueObject.util_equals(this.pictureTags, pictureTag.pictureTags);
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
        int i2 = ((i * 41) + this.f21211id) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.pictureTags;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.pictureTags == null) {
            this.pictureTags = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
