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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BannersItem bannersItem) {
            String str = bannersItem.banner;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = bannersItem.url;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            bannersItem.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BannersItem parse(nc5 nc5Var) throws IOException {
            BannersItem bannersItem = new BannersItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bannersItem.banner == null) {
                        bannersItem.banner = "";
                    }
                    if (bannersItem.url != null) {
                        break;
                    }
                    bannersItem.url = "";
                    break;
                }
                if (iM162497u == 10) {
                    bannersItem.banner = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (bannersItem.banner == null) {
                            bannersItem.banner = "";
                        }
                        if (bannersItem.url != null) {
                            break;
                        }
                        bannersItem.url = "";
                        return bannersItem;
                    }
                    bannersItem.url = nc5Var.m162495s();
                }
            }
            return bannersItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BannersItem bannersItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bannersItem.banner;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = bannersItem.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<BannersItem> JSON_ADAPTER = new ObjectJsonAdapter<BannersItem>() { // from class: com.p1.mobile.putong.data.BannersItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BannersItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BannersItem newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannersItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannersItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannersItem new_() {
        BannersItem bannersItem = new BannersItem();
        bannersItem.nullCheck();
        return bannersItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BannersItem mo225055clone() {
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
        String str = this.banner;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.banner == null) {
            this.banner = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
