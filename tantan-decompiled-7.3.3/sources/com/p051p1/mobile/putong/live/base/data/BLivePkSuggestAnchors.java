package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLivePkSuggestAnchor;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLivePkSuggestAnchors extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkSuggestAnchors> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkSuggestAnchors>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkSuggestAnchors.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkSuggestAnchors.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkSuggestAnchors newInstance() {
            return new BLivePkSuggestAnchors();
        }

        public boolean parseField(BLivePkSuggestAnchors bLivePkSuggestAnchors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchors":
                    bLivePkSuggestAnchors.anchors = JsonAdapter.parseArray(jsonParser, BLivePkSuggestAnchor.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    bLivePkSuggestAnchors.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLivePkSuggestAnchors.type = jsonParser.getValueAsString();
                    return true;
                case "pagination":
                    bLivePkSuggestAnchors.pagination = Pagination.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkSuggestAnchors bLivePkSuggestAnchors, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkSuggestAnchors.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLivePkSuggestAnchors.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (bLivePkSuggestAnchors.anchors != null) {
                jsonGenerator.writeFieldName("anchors");
                JsonAdapter.serializeArray(bLivePkSuggestAnchors.anchors, jsonGenerator, BLivePkSuggestAnchor.JSON_ADAPTER);
            }
            if (bLivePkSuggestAnchors.pagination != null) {
                jsonGenerator.writeFieldName(Pagination.TYPE);
                Pagination.JSON_ADAPTER.serialize(bLivePkSuggestAnchors.pagination, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkSuggestAnchors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepksuggestanchors";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLivePkSuggestAnchor> anchors;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public Pagination pagination;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    public static BLivePkSuggestAnchors new_() {
        BLivePkSuggestAnchors bLivePkSuggestAnchors = new BLivePkSuggestAnchors();
        bLivePkSuggestAnchors.nullCheck();
        return bLivePkSuggestAnchors;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkSuggestAnchors mo225055clone() {
        BLivePkSuggestAnchors bLivePkSuggestAnchors = new BLivePkSuggestAnchors();
        bLivePkSuggestAnchors.name = this.name;
        bLivePkSuggestAnchors.type = this.type;
        List<BLivePkSuggestAnchor> list = this.anchors;
        if (list != null) {
            bLivePkSuggestAnchors.anchors = ValueObject.util_map(list, new qcj() { // from class: l.s42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePkSuggestAnchor) obj).mo225055clone();
                }
            });
        }
        Pagination pagination = this.pagination;
        if (pagination != null) {
            bLivePkSuggestAnchors.pagination = pagination.mo225055clone();
        }
        return bLivePkSuggestAnchors;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkSuggestAnchors)) {
            return false;
        }
        BLivePkSuggestAnchors bLivePkSuggestAnchors = (BLivePkSuggestAnchors) obj;
        return ValueObject.util_equals(this.name, bLivePkSuggestAnchors.name) && ValueObject.util_equals(this.type, bLivePkSuggestAnchors.type) && ValueObject.util_equals(this.anchors, bLivePkSuggestAnchors.anchors) && ValueObject.util_equals(this.pagination, bLivePkSuggestAnchors.pagination);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLivePkSuggestAnchor> list = this.anchors;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        Pagination pagination = this.pagination;
        int iHashCode4 = iHashCode3 + (pagination != null ? pagination.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.anchors == null) {
            this.anchors = new ArrayList();
        }
        if (this.pagination == null) {
            this.pagination = Pagination.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
