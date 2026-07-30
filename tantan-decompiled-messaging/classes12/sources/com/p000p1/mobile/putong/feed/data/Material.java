package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.LinkAction;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Material extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "material";

    @NonNull
    @ProtobufIndex(index = 3)
    public String deeplink;

    @NonNull
    @ProtobufIndex(index = 2)
    public BannerPicture picture;

    @NonNull
    @ProtobufIndex(index = 1)
    public String resourceID;
    public static ProtobufAdapter<Material> PROTOBUF_ADAPTER = new MessageNanoAdapter<Material>() { // from class: com.p1.mobile.putong.feed.data.Material.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Material material) {
            String str = material.resourceID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            BannerPicture bannerPicture = material.picture;
            if (bannerPicture != null) {
                iO += CodedOutputByteBufferNano.l(2, bannerPicture, BannerPicture.PROTOBUF_ADAPTER);
            }
            String str2 = material.deeplink;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) material).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Material m19584parse(nb5 nb5Var) throws IOException {
            Material material = new Material();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (material.resourceID == null) {
                        material.resourceID = "";
                    }
                    if (material.picture == null) {
                        material.picture = BannerPicture.new_();
                    }
                    if (material.deeplink != null) {
                        break;
                    }
                    material.deeplink = "";
                    break;
                }
                if (iU == 10) {
                    material.resourceID = nb5Var.s();
                } else if (iU == 18) {
                    material.picture = (BannerPicture) nb5Var.l(BannerPicture.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
                        if (material.resourceID == null) {
                            material.resourceID = "";
                        }
                        if (material.picture == null) {
                            material.picture = BannerPicture.new_();
                        }
                        if (material.deeplink != null) {
                            break;
                        }
                        material.deeplink = "";
                        return material;
                    }
                    material.deeplink = nb5Var.s();
                }
            }
            return material;
        }

        public void serialize(Material material, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = material.resourceID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            BannerPicture bannerPicture = material.picture;
            if (bannerPicture != null) {
                codedOutputByteBufferNano.K(2, bannerPicture, BannerPicture.PROTOBUF_ADAPTER);
            }
            String str2 = material.deeplink;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<Material> JSON_ADAPTER = new ObjectJsonAdapter<Material>() { // from class: com.p1.mobile.putong.feed.data.Material.2
        public Class getDataClass() {
            return Material.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Material mo17830newInstance() {
            return new Material();
        }

        public boolean parseField(Material material, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "resourceID":
                    material.resourceID = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    material.picture = (BannerPicture) BannerPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "deeplink":
                    material.deeplink = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Material material, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "resourceID":
                case "picture":
                case "deeplink":
                    return true;
                default:
                    return super.parseFieldCheck(material, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Material material, JsonGenerator jsonGenerator) throws IOException {
            String str = material.resourceID;
            if (str != null) {
                jsonGenerator.writeStringField("resourceID", str);
            }
            if (material.picture != null) {
                jsonGenerator.writeFieldName("picture");
                BannerPicture.JSON_ADAPTER.serialize(material.picture, jsonGenerator, true);
            }
            String str2 = material.deeplink;
            if (str2 != null) {
                jsonGenerator.writeStringField(LinkAction.deeplink, str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Material) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Material) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Material new_() {
        Material material = new Material();
        material.nullCheck();
        return material;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Material m19583clone() {
        Material material = new Material();
        material.resourceID = this.resourceID;
        BannerPicture bannerPicture = this.picture;
        if (bannerPicture != null) {
            material.picture = bannerPicture.m19424clone();
        }
        material.deeplink = this.deeplink;
        return material;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Material)) {
            return false;
        }
        Material material = (Material) obj;
        return ValueObject.util_equals(this.resourceID, material.resourceID) && ValueObject.util_equals(this.picture, material.picture) && ValueObject.util_equals(this.deeplink, material.deeplink);
    }

    public String getClassParseName() {
        return "material";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.resourceID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BannerPicture bannerPicture = this.picture;
        int iHashCode2 = (iHashCode + (bannerPicture != null ? bannerPicture.hashCode() : 0)) * 41;
        String str2 = this.deeplink;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.resourceID == null) {
            this.resourceID = "";
        }
        if (this.picture == null) {
            this.picture = BannerPicture.new_();
        }
        if (this.deeplink == null) {
            this.deeplink = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
