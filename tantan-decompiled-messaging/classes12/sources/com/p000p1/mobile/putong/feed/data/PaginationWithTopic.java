package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Links;
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
public class PaginationWithTopic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "paginationwithtopic";

    @NonNull
    @ProtobufIndex(index = 1)
    public PaginationLinks links;
    public static ProtobufAdapter<PaginationWithTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<PaginationWithTopic>() { // from class: com.p1.mobile.putong.feed.data.PaginationWithTopic.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PaginationWithTopic paginationWithTopic) {
            PaginationLinks paginationLinks = paginationWithTopic.links;
            int iL = paginationLinks != null ? CodedOutputByteBufferNano.l(1, paginationLinks, PaginationLinks.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) paginationWithTopic).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PaginationWithTopic m19696parse(nb5 nb5Var) throws IOException {
            PaginationWithTopic paginationWithTopic = new PaginationWithTopic();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (paginationWithTopic.links != null) {
                        break;
                    }
                    paginationWithTopic.links = PaginationLinks.new_();
                    break;
                }
                if (iU != 10) {
                    if (paginationWithTopic.links != null) {
                        break;
                    }
                    paginationWithTopic.links = PaginationLinks.new_();
                    return paginationWithTopic;
                }
                paginationWithTopic.links = (PaginationLinks) nb5Var.l(PaginationLinks.PROTOBUF_ADAPTER);
            }
            return paginationWithTopic;
        }

        public void serialize(PaginationWithTopic paginationWithTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PaginationLinks paginationLinks = paginationWithTopic.links;
            if (paginationLinks != null) {
                codedOutputByteBufferNano.K(1, paginationLinks, PaginationLinks.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PaginationWithTopic> JSON_ADAPTER = new ObjectJsonAdapter<PaginationWithTopic>() { // from class: com.p1.mobile.putong.feed.data.PaginationWithTopic.2
        public Class getDataClass() {
            return PaginationWithTopic.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PaginationWithTopic mo17830newInstance() {
            return new PaginationWithTopic();
        }

        public boolean parseField(PaginationWithTopic paginationWithTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Links.TYPE)) {
                return false;
            }
            paginationWithTopic.links = (PaginationLinks) PaginationLinks.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PaginationWithTopic paginationWithTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Links.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(paginationWithTopic, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PaginationWithTopic paginationWithTopic, JsonGenerator jsonGenerator) throws IOException {
            if (paginationWithTopic.links != null) {
                jsonGenerator.writeFieldName(Links.TYPE);
                PaginationLinks.JSON_ADAPTER.serialize(paginationWithTopic.links, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PaginationWithTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PaginationWithTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PaginationWithTopic new_() {
        PaginationWithTopic paginationWithTopic = new PaginationWithTopic();
        paginationWithTopic.nullCheck();
        return paginationWithTopic;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PaginationWithTopic m19695clone() {
        PaginationWithTopic paginationWithTopic = new PaginationWithTopic();
        PaginationLinks paginationLinks = this.links;
        if (paginationLinks != null) {
            paginationWithTopic.links = paginationLinks.m19692clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        PaginationLinks paginationLinks = this.links;
        int iHashCode = i2 + (paginationLinks != null ? paginationLinks.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.links == null) {
            this.links = PaginationLinks.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
