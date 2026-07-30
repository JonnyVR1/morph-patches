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
public class NewMatchPaginationLinks extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newmatchpaginationlinks";

    @NonNull
    @ProtobufIndex(index = 1)
    public NewMatchLinks links;
    public static ProtobufAdapter<NewMatchPaginationLinks> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewMatchPaginationLinks>() { // from class: com.p1.mobile.putong.core.data.NewMatchPaginationLinks.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewMatchPaginationLinks newMatchPaginationLinks) {
            NewMatchLinks newMatchLinks = newMatchPaginationLinks.links;
            int iL = newMatchLinks != null ? CodedOutputByteBufferNano.l(1, newMatchLinks, NewMatchLinks.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) newMatchPaginationLinks).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewMatchPaginationLinks m14523parse(nb5 nb5Var) throws IOException {
            NewMatchPaginationLinks newMatchPaginationLinks = new NewMatchPaginationLinks();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newMatchPaginationLinks.links != null) {
                        break;
                    }
                    newMatchPaginationLinks.links = NewMatchLinks.new_();
                    break;
                }
                if (iU != 10) {
                    if (newMatchPaginationLinks.links != null) {
                        break;
                    }
                    newMatchPaginationLinks.links = NewMatchLinks.new_();
                    return newMatchPaginationLinks;
                }
                newMatchPaginationLinks.links = (NewMatchLinks) nb5Var.l(NewMatchLinks.PROTOBUF_ADAPTER);
            }
            return newMatchPaginationLinks;
        }

        public void serialize(NewMatchPaginationLinks newMatchPaginationLinks, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            NewMatchLinks newMatchLinks = newMatchPaginationLinks.links;
            if (newMatchLinks != null) {
                codedOutputByteBufferNano.K(1, newMatchLinks, NewMatchLinks.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NewMatchPaginationLinks> JSON_ADAPTER = new ObjectJsonAdapter<NewMatchPaginationLinks>() { // from class: com.p1.mobile.putong.core.data.NewMatchPaginationLinks.2
        public Class getDataClass() {
            return NewMatchPaginationLinks.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewMatchPaginationLinks m14524newInstance() {
            return new NewMatchPaginationLinks();
        }

        public boolean parseField(NewMatchPaginationLinks newMatchPaginationLinks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("links")) {
                return false;
            }
            newMatchPaginationLinks.links = (NewMatchLinks) NewMatchLinks.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NewMatchPaginationLinks newMatchPaginationLinks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("links")) {
                return true;
            }
            return super.parseFieldCheck(newMatchPaginationLinks, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(NewMatchPaginationLinks newMatchPaginationLinks, JsonGenerator jsonGenerator) throws IOException {
            if (newMatchPaginationLinks.links != null) {
                jsonGenerator.writeFieldName("links");
                NewMatchLinks.JSON_ADAPTER.serialize(newMatchPaginationLinks.links, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewMatchPaginationLinks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewMatchPaginationLinks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewMatchPaginationLinks new_() {
        NewMatchPaginationLinks newMatchPaginationLinks = new NewMatchPaginationLinks();
        newMatchPaginationLinks.nullCheck();
        return newMatchPaginationLinks;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewMatchPaginationLinks m14522clone() {
        NewMatchPaginationLinks newMatchPaginationLinks = new NewMatchPaginationLinks();
        NewMatchLinks newMatchLinks = this.links;
        if (newMatchLinks != null) {
            newMatchPaginationLinks.links = newMatchLinks.m14518clone();
        }
        return newMatchPaginationLinks;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NewMatchPaginationLinks) {
            return ValueObject.util_equals(this.links, ((NewMatchPaginationLinks) obj).links);
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
        NewMatchLinks newMatchLinks = this.links;
        int iHashCode = i2 + (newMatchLinks != null ? newMatchLinks.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.links == null) {
            this.links = NewMatchLinks.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
