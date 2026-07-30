package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CategoriesDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "categoriesdetail";

    @NonNull
    @ProtobufIndex(index = 1)
    public String category;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String identifier;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int total;
    public static ProtobufAdapter<CategoriesDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<CategoriesDetail>() { // from class: com.p1.mobile.putong.core.data.CategoriesDetail.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CategoriesDetail categoriesDetail) {
            String str = categoriesDetail.category;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = categoriesDetail.identifier;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, categoriesDetail.total);
            ((MessageNano) categoriesDetail).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CategoriesDetail m11927parse(nb5 nb5Var) throws IOException {
            CategoriesDetail categoriesDetail = new CategoriesDetail();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (categoriesDetail.category == null) {
                        categoriesDetail.category = "";
                    }
                    if (categoriesDetail.identifier != null) {
                        break;
                    }
                    categoriesDetail.identifier = "";
                    break;
                }
                if (iU == 10) {
                    categoriesDetail.category = nb5Var.s();
                } else if (iU == 18) {
                    categoriesDetail.identifier = nb5Var.s();
                } else {
                    if (iU != 24) {
                        if (categoriesDetail.category == null) {
                            categoriesDetail.category = "";
                        }
                        if (categoriesDetail.identifier != null) {
                            break;
                        }
                        categoriesDetail.identifier = "";
                        return categoriesDetail;
                    }
                    categoriesDetail.total = nb5Var.j();
                }
            }
            return categoriesDetail;
        }

        public void serialize(CategoriesDetail categoriesDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = categoriesDetail.category;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = categoriesDetail.identifier;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, categoriesDetail.total);
        }
    };
    public static JsonAdapter<CategoriesDetail> JSON_ADAPTER = new ObjectJsonAdapter<CategoriesDetail>() { // from class: com.p1.mobile.putong.core.data.CategoriesDetail.2
        public Class getDataClass() {
            return CategoriesDetail.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CategoriesDetail m11928newInstance() {
            return new CategoriesDetail();
        }

        public boolean parseField(CategoriesDetail categoriesDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identifier":
                    categoriesDetail.identifier = jsonParser.getValueAsString();
                    return true;
                case "category":
                    categoriesDetail.category = jsonParser.getValueAsString();
                    return true;
                case "total":
                    categoriesDetail.total = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CategoriesDetail categoriesDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identifier":
                case "category":
                case "total":
                    return true;
                default:
                    return super.parseFieldCheck(categoriesDetail, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CategoriesDetail categoriesDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = categoriesDetail.category;
            if (str != null) {
                jsonGenerator.writeStringField("category", str);
            }
            String str2 = categoriesDetail.identifier;
            if (str2 != null) {
                jsonGenerator.writeStringField("identifier", str2);
            }
            jsonGenerator.writeNumberField("total", categoriesDetail.total);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CategoriesDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CategoriesDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CategoriesDetail new_() {
        CategoriesDetail categoriesDetail = new CategoriesDetail();
        categoriesDetail.nullCheck();
        return categoriesDetail;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CategoriesDetail m11926clone() {
        CategoriesDetail categoriesDetail = new CategoriesDetail();
        categoriesDetail.category = this.category;
        categoriesDetail.identifier = this.identifier;
        categoriesDetail.total = this.total;
        return categoriesDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategoriesDetail)) {
            return false;
        }
        CategoriesDetail categoriesDetail = (CategoriesDetail) obj;
        return ValueObject.util_equals(this.category, categoriesDetail.category) && ValueObject.util_equals(this.identifier, categoriesDetail.identifier) && this.total == categoriesDetail.total;
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
        String str = this.category;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.identifier;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.total;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.category == null) {
            this.category = "";
        }
        if (this.identifier == null) {
            this.identifier = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
