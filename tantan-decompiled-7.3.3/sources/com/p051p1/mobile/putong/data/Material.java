package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
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
    public static ProtobufAdapter<Material> PROTOBUF_ADAPTER = new MessageNanoAdapter<Material>() { // from class: com.p1.mobile.putong.data.Material.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Material material) {
            String str = material.resourceID;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            BannerPicture bannerPicture = material.picture;
            if (bannerPicture != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, bannerPicture, BannerPicture.PROTOBUF_ADAPTER);
            }
            String str2 = material.deeplink;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            material.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Material parse(nc5 nc5Var) throws IOException {
            Material material = new Material();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    material.resourceID = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    material.picture = (BannerPicture) nc5Var.m162488l(BannerPicture.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 26) {
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
                    material.deeplink = nc5Var.m162495s();
                }
            }
            return material;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Material material, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = material.resourceID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            BannerPicture bannerPicture = material.picture;
            if (bannerPicture != null) {
                codedOutputByteBufferNano.m17309K(2, bannerPicture, BannerPicture.PROTOBUF_ADAPTER);
            }
            String str2 = material.deeplink;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<Material> JSON_ADAPTER = new ObjectJsonAdapter<Material>() { // from class: com.p1.mobile.putong.data.Material.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Material.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Material newInstance() {
            return new Material();
        }

        public boolean parseField(Material material, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "resourceID":
                    material.resourceID = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    material.picture = BannerPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Material) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Material) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Material new_() {
        Material material = new Material();
        material.nullCheck();
        return material;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Material mo225055clone() {
        Material material = new Material();
        material.resourceID = this.resourceID;
        BannerPicture bannerPicture = this.picture;
        if (bannerPicture != null) {
            material.picture = bannerPicture.mo225055clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "material";
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
