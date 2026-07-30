package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class BannersItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bannersitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public String banner;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<BannersItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<BannersItem>() { // from class: com.p1.mobile.putong.data.BannersItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BannersItem bannersItem) {
            String str = bannersItem.banner;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = bannersItem.url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) bannersItem).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BannersItem m17772parse(nb5 nb5Var) throws IOException {
            BannersItem bannersItem = new BannersItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (bannersItem.banner == null) {
                        bannersItem.banner = "";
                    }
                    if (bannersItem.url != null) {
                        break;
                    }
                    bannersItem.url = "";
                    break;
                }
                if (iU == 10) {
                    bannersItem.banner = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (bannersItem.banner == null) {
                            bannersItem.banner = "";
                        }
                        if (bannersItem.url != null) {
                            break;
                        }
                        bannersItem.url = "";
                        return bannersItem;
                    }
                    bannersItem.url = nb5Var.s();
                }
            }
            return bannersItem;
        }

        public void serialize(BannersItem bannersItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bannersItem.banner;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = bannersItem.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<BannersItem> JSON_ADAPTER = new ObjectJsonAdapter<BannersItem>() { // from class: com.p1.mobile.putong.data.BannersItem.2
        public Class getDataClass() {
            return BannersItem.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public BannersItem mo17830newInstance() {
            return new BannersItem();
        }

        public boolean parseField(BannersItem bannersItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("banner")) {
                bannersItem.banner = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("url")) {
                return false;
            }
            bannersItem.url = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(BannersItem bannersItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("banner") || str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(bannersItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BannersItem bannersItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bannersItem.banner;
            if (str != null) {
                jsonGenerator.writeStringField("banner", str);
            }
            String str2 = bannersItem.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannersItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannersItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannersItem new_() {
        BannersItem bannersItem = new BannersItem();
        bannersItem.nullCheck();
        return bannersItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BannersItem m17771clone() {
        BannersItem bannersItem = new BannersItem();
        bannersItem.banner = this.banner;
        bannersItem.url = this.url;
        return bannersItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannersItem)) {
            return false;
        }
        BannersItem bannersItem = (BannersItem) obj;
        return ValueObject.util_equals(this.banner, bannersItem.banner) && ValueObject.util_equals(this.url, bannersItem.url);
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
        String str = this.banner;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.banner == null) {
            this.banner = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
