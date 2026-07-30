package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.PictureTag;
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

/* JADX INFO: loaded from: classes10.dex */
public class PictureTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picturetag";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 2)
    public int f20469id;

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
            int iM17230l = (list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17226h(2, pictureTag.f20469id);
            String str = pictureTag.name;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str);
            }
            pictureTag.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PictureTag parse(nb5 nb5Var) throws IOException {
            PictureTag pictureTag = new PictureTag();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (pictureTag.name == null) {
                        pictureTag.name = "";
                    }
                    if (pictureTag.pictureTags != null) {
                        break;
                    }
                    pictureTag.pictureTags = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    pictureTag.pictureTags = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 16) {
                    pictureTag.f20469id = nb5Var.m158741j();
                } else {
                    if (iM158752u != 26) {
                        if (pictureTag.name == null) {
                            pictureTag.name = "";
                        }
                        if (pictureTag.pictureTags != null) {
                            break;
                        }
                        pictureTag.pictureTags = new ArrayList();
                        return pictureTag;
                    }
                    pictureTag.name = nb5Var.m158750s();
                }
            }
            return pictureTag;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PictureTag pictureTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = pictureTag.pictureTags;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(2, pictureTag.f20469id);
            String str = pictureTag.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
        }
    };
    public static JsonAdapter<PictureTag> JSON_ADAPTER = new ObjectJsonAdapter<PictureTag>() { // from class: com.p1.mobile.putong.core.data.PictureTag.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PictureTag.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    pictureTag.f20469id = jsonParser.getValueAsInt();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PictureTag pictureTag, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", pictureTag.f20469id);
            String str = pictureTag.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (pictureTag.pictureTags != null) {
                jsonGenerator.writeFieldName("pictureTags");
                JsonAdapter.serializeArray(pictureTag.pictureTags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PictureTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PictureTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35747a(String str) {
        return str;
    }

    public static PictureTag new_() {
        PictureTag pictureTag = new PictureTag();
        pictureTag.nullCheck();
        return pictureTag;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PictureTag mo223809clone() {
        PictureTag pictureTag = new PictureTag();
        pictureTag.f20469id = this.f20469id;
        pictureTag.name = this.name;
        List<String> list = this.pictureTags;
        if (list != null) {
            pictureTag.pictureTags = ValueObject.util_map(list, new w9j() { // from class: l.mh70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return PictureTag.m35747a((String) obj);
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
        return this.f20469id == pictureTag.f20469id && ValueObject.util_equals(this.name, pictureTag.name) && ValueObject.util_equals(this.pictureTags, pictureTag.pictureTags);
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
        int i2 = ((i * 41) + this.f20469id) * 41;
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
