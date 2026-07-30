package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class PaginationWithTopic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "paginationwithtopic";

    @NonNull
    @ProtobufIndex(index = 1)
    public PaginationLinks links;
    public static ProtobufAdapter<PaginationWithTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<PaginationWithTopic>() { // from class: com.p1.mobile.putong.feed.data.PaginationWithTopic.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PaginationWithTopic paginationWithTopic) {
            PaginationLinks paginationLinks = paginationWithTopic.links;
            int iM17230l = paginationLinks != null ? CodedOutputByteBufferNano.m17230l(1, paginationLinks, PaginationLinks.PROTOBUF_ADAPTER) : 0;
            paginationWithTopic.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PaginationWithTopic parse(nb5 nb5Var) throws IOException {
            PaginationWithTopic paginationWithTopic = new PaginationWithTopic();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (paginationWithTopic.links != null) {
                        break;
                    }
                    paginationWithTopic.links = PaginationLinks.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (paginationWithTopic.links != null) {
                        break;
                    }
                    paginationWithTopic.links = PaginationLinks.new_();
                    return paginationWithTopic;
                }
                paginationWithTopic.links = (PaginationLinks) nb5Var.m158743l(PaginationLinks.PROTOBUF_ADAPTER);
            }
            return paginationWithTopic;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PaginationWithTopic paginationWithTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PaginationLinks paginationLinks = paginationWithTopic.links;
            if (paginationLinks != null) {
                codedOutputByteBufferNano.m17254K(1, paginationLinks, PaginationLinks.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PaginationWithTopic> JSON_ADAPTER = new ObjectJsonAdapter<PaginationWithTopic>() { // from class: com.p1.mobile.putong.feed.data.PaginationWithTopic.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PaginationWithTopic.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PaginationWithTopic paginationWithTopic, JsonGenerator jsonGenerator) throws IOException {
            if (paginationWithTopic.links != null) {
                jsonGenerator.writeFieldName("links");
                PaginationLinks.JSON_ADAPTER.serialize(paginationWithTopic.links, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PaginationWithTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public PaginationWithTopic mo223809clone() {
        PaginationWithTopic paginationWithTopic = new PaginationWithTopic();
        PaginationLinks paginationLinks = this.links;
        if (paginationLinks != null) {
            paginationWithTopic.links = paginationLinks.mo223809clone();
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
