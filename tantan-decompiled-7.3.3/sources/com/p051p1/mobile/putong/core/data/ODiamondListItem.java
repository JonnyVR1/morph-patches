package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ODiamondListFeed;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class ODiamondListItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondlistitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ODiamondListFeed> feeds;
    public static ProtobufAdapter<ODiamondListItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondListItem>() { // from class: com.p1.mobile.putong.core.data.ODiamondListItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ODiamondListItem oDiamondListItem) {
            List<ODiamondListFeed> list = oDiamondListItem.feeds;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ODiamondListFeed.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            oDiamondListItem.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ODiamondListItem parse(nc5 nc5Var) throws IOException {
            ODiamondListItem oDiamondListItem = new ODiamondListItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oDiamondListItem.feeds != null) {
                        break;
                    }
                    oDiamondListItem.feeds = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (oDiamondListItem.feeds != null) {
                        break;
                    }
                    oDiamondListItem.feeds = new ArrayList();
                    return oDiamondListItem;
                }
                oDiamondListItem.feeds = (List) nc5Var.m162488l(ODiamondListFeed.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return oDiamondListItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ODiamondListItem oDiamondListItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ODiamondListFeed> list = oDiamondListItem.feeds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ODiamondListFeed.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ODiamondListItem> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondListItem>() { // from class: com.p1.mobile.putong.core.data.ODiamondListItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ODiamondListItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ODiamondListItem newInstance() {
            return new ODiamondListItem();
        }

        public boolean parseField(ODiamondListItem oDiamondListItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("feeds")) {
                return false;
            }
            oDiamondListItem.feeds = JsonAdapter.parseArray(jsonParser, ODiamondListFeed.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ODiamondListItem oDiamondListItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("feeds")) {
                return true;
            }
            return super.parseFieldCheck(oDiamondListItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ODiamondListItem oDiamondListItem, JsonGenerator jsonGenerator) throws IOException {
            if (oDiamondListItem.feeds != null) {
                jsonGenerator.writeFieldName("feeds");
                JsonAdapter.serializeArray(oDiamondListItem.feeds, jsonGenerator, ODiamondListFeed.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondListItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondListItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondListItem new_() {
        ODiamondListItem oDiamondListItem = new ODiamondListItem();
        oDiamondListItem.nullCheck();
        return oDiamondListItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ODiamondListItem mo225055clone() {
        ODiamondListItem oDiamondListItem = new ODiamondListItem();
        List<ODiamondListFeed> list = this.feeds;
        if (list != null) {
            oDiamondListItem.feeds = ValueObject.util_map(list, new qcj() { // from class: l.v450
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ODiamondListFeed) obj).mo225055clone();
                }
            });
        }
        return oDiamondListItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ODiamondListItem) {
            return ValueObject.util_equals(this.feeds, ((ODiamondListItem) obj).feeds);
        }
        return false;
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
        List<ODiamondListFeed> list = this.feeds;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.feeds == null) {
            this.feeds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
