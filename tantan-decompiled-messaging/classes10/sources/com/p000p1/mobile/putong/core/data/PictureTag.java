package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.PictureTag;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PictureTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picturetag";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int f131id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> pictureTags;
    public static ProtobufAdapter<PictureTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<PictureTag>() { // from class: com.p1.mobile.putong.core.data.PictureTag.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PictureTag pictureTag) {
            List<String> list = pictureTag.pictureTags;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.h(2, pictureTag.f131id);
            String str = pictureTag.name;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) pictureTag).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PictureTag m14793parse(nb5 nb5Var) throws IOException {
            PictureTag pictureTag = new PictureTag();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (pictureTag.name == null) {
                        pictureTag.name = "";
                    }
                    if (pictureTag.pictureTags != null) {
                        break;
                    }
                    pictureTag.pictureTags = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    pictureTag.pictureTags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 16) {
                    pictureTag.f131id = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (pictureTag.name == null) {
                            pictureTag.name = "";
                        }
                        if (pictureTag.pictureTags != null) {
                            break;
                        }
                        pictureTag.pictureTags = new ArrayList();
                        return pictureTag;
                    }
                    pictureTag.name = nb5Var.s();
                }
            }
            return pictureTag;
        }

        public void serialize(PictureTag pictureTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = pictureTag.pictureTags;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(2, pictureTag.f131id);
            String str = pictureTag.name;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<PictureTag> JSON_ADAPTER = new ObjectJsonAdapter<PictureTag>() { // from class: com.p1.mobile.putong.core.data.PictureTag.2
        public Class getDataClass() {
            return PictureTag.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PictureTag m14794newInstance() {
            return new PictureTag();
        }

        public boolean parseField(PictureTag pictureTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pictureTags":
                    pictureTag.pictureTags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    pictureTag.f131id = jsonParser.getValueAsInt();
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

        public void serializeFields(PictureTag pictureTag, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", pictureTag.f131id);
            String str = pictureTag.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            if (pictureTag.pictureTags != null) {
                jsonGenerator.writeFieldName("pictureTags");
                JsonAdapter.serializeArray(pictureTag.pictureTags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PictureTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PictureTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m549a(String str) {
        return str;
    }

    public static PictureTag new_() {
        PictureTag pictureTag = new PictureTag();
        pictureTag.nullCheck();
        return pictureTag;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PictureTag m14792clone() {
        PictureTag pictureTag = new PictureTag();
        pictureTag.f131id = this.f131id;
        pictureTag.name = this.name;
        List<String> list = this.pictureTags;
        if (list != null) {
            pictureTag.pictureTags = ValueObject.util_map(list, new w9j() { // from class: l.mh70
                public final Object call(Object obj) {
                    return PictureTag.m549a((String) obj);
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
        return this.f131id == pictureTag.f131id && ValueObject.util_equals(this.name, pictureTag.name) && ValueObject.util_equals(this.pictureTags, pictureTag.pictureTags);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f131id) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.pictureTags;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.pictureTags == null) {
            this.pictureTags = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
