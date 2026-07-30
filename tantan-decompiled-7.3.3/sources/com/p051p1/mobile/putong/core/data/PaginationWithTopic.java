package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class PaginationWithTopic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "paginationwithtopic";

    @NonNull
    @ProtobufIndex(index = 1)
    public PaginationLinks links;
    public static ProtobufAdapter<PaginationWithTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<PaginationWithTopic>() { // from class: com.p1.mobile.putong.core.data.PaginationWithTopic.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PaginationWithTopic paginationWithTopic) {
            PaginationLinks paginationLinks = paginationWithTopic.links;
            int iM17285l = paginationLinks != null ? CodedOutputByteBufferNano.m17285l(1, paginationLinks, PaginationLinks.PROTOBUF_ADAPTER) : 0;
            paginationWithTopic.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PaginationWithTopic parse(nc5 nc5Var) throws IOException {
            PaginationWithTopic paginationWithTopic = new PaginationWithTopic();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (paginationWithTopic.links != null) {
                        break;
                    }
                    paginationWithTopic.links = PaginationLinks.new_();
                    break;
                }
                if (iM162497u != 10) {
                    if (paginationWithTopic.links != null) {
                        break;
                    }
                    paginationWithTopic.links = PaginationLinks.new_();
                    return paginationWithTopic;
                }
                paginationWithTopic.links = (PaginationLinks) nc5Var.m162488l(PaginationLinks.PROTOBUF_ADAPTER);
            }
            return paginationWithTopic;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PaginationWithTopic paginationWithTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PaginationLinks paginationLinks = paginationWithTopic.links;
            if (paginationLinks != null) {
                codedOutputByteBufferNano.m17309K(1, paginationLinks, PaginationLinks.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PaginationWithTopic> JSON_ADAPTER = new ObjectJsonAdapter<PaginationWithTopic>() { // from class: com.p1.mobile.putong.core.data.PaginationWithTopic.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PaginationWithTopic.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PaginationWithTopic newInstance() {
            return new PaginationWithTopic();
        }

        public boolean parseField(PaginationWithTopic paginationWithTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("links")) {
                return false;
            }
            paginationWithTopic.links = PaginationLinks.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PaginationWithTopic paginationWithTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("links")) {
                return true;
            }
            return super.parseFieldCheck(paginationWithTopic, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PaginationWithTopic paginationWithTopic, JsonGenerator jsonGenerator) throws IOException {
            if (paginationWithTopic.links != null) {
                jsonGenerator.writeFieldName("links");
                PaginationLinks.JSON_ADAPTER.serialize(paginationWithTopic.links, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PaginationWithTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PaginationWithTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PaginationWithTopic new_() {
        PaginationWithTopic paginationWithTopic = new PaginationWithTopic();
        paginationWithTopic.nullCheck();
        return paginationWithTopic;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PaginationWithTopic mo225055clone() {
        PaginationWithTopic paginationWithTopic = new PaginationWithTopic();
        PaginationLinks paginationLinks = this.links;
        if (paginationLinks != null) {
            paginationWithTopic.links = paginationLinks.mo225055clone();
        }
        return paginationWithTopic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PaginationWithTopic) {
            return ValueObject.util_equals(this.links, ((PaginationWithTopic) obj).links);
        }
        return false;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "paginationwithtopic";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        PaginationLinks paginationLinks = this.links;
        int iHashCode = i2 + (paginationLinks != null ? paginationLinks.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.links == null) {
            this.links = PaginationLinks.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
