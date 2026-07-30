package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Link;
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

/* JADX INFO: loaded from: classes13.dex */
public class LiveGroupBannerItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livegroupbanneritem";

    @NonNull
    @ProtobufIndex(index = 3)
    public String cover;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f40074id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String link;
    public static ProtobufAdapter<LiveGroupBannerItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveGroupBannerItem>() { // from class: com.p1.mobile.putong.feed.data.LiveGroupBannerItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveGroupBannerItem liveGroupBannerItem) {
            String str = liveGroupBannerItem.f40074id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = liveGroupBannerItem.link;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = liveGroupBannerItem.cover;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            liveGroupBannerItem.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveGroupBannerItem parse(nc5 nc5Var) throws IOException {
            LiveGroupBannerItem liveGroupBannerItem = new LiveGroupBannerItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (liveGroupBannerItem.f40074id == null) {
                        liveGroupBannerItem.f40074id = "";
                    }
                    if (liveGroupBannerItem.link == null) {
                        liveGroupBannerItem.link = "";
                    }
                    if (liveGroupBannerItem.cover != null) {
                        break;
                    }
                    liveGroupBannerItem.cover = "";
                    break;
                }
                if (iM162497u == 10) {
                    liveGroupBannerItem.f40074id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    liveGroupBannerItem.link = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (liveGroupBannerItem.f40074id == null) {
                            liveGroupBannerItem.f40074id = "";
                        }
                        if (liveGroupBannerItem.link == null) {
                            liveGroupBannerItem.link = "";
                        }
                        if (liveGroupBannerItem.cover != null) {
                            break;
                        }
                        liveGroupBannerItem.cover = "";
                        return liveGroupBannerItem;
                    }
                    liveGroupBannerItem.cover = nc5Var.m162495s();
                }
            }
            return liveGroupBannerItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveGroupBannerItem liveGroupBannerItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveGroupBannerItem.f40074id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = liveGroupBannerItem.link;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = liveGroupBannerItem.cover;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<LiveGroupBannerItem> JSON_ADAPTER = new ObjectJsonAdapter<LiveGroupBannerItem>() { // from class: com.p1.mobile.putong.feed.data.LiveGroupBannerItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveGroupBannerItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveGroupBannerItem newInstance() {
            return new LiveGroupBannerItem();
        }

        public boolean parseField(LiveGroupBannerItem liveGroupBannerItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    liveGroupBannerItem.f40074id = jsonParser.getValueAsString();
                    return false;
                case "link":
                    liveGroupBannerItem.link = jsonParser.getValueAsString();
                    return true;
                case "cover":
                    liveGroupBannerItem.cover = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveGroupBannerItem liveGroupBannerItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "link":
                case "cover":
                    return true;
                default:
                    return super.parseFieldCheck(liveGroupBannerItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveGroupBannerItem liveGroupBannerItem, JsonGenerator jsonGenerator) throws IOException {
            String str = liveGroupBannerItem.f40074id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveGroupBannerItem.link;
            if (str2 != null) {
                jsonGenerator.writeStringField(Link.TYPE, str2);
            }
            String str3 = liveGroupBannerItem.cover;
            if (str3 != null) {
                jsonGenerator.writeStringField("cover", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveGroupBannerItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveGroupBannerItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveGroupBannerItem new_() {
        LiveGroupBannerItem liveGroupBannerItem = new LiveGroupBannerItem();
        liveGroupBannerItem.nullCheck();
        return liveGroupBannerItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveGroupBannerItem mo225055clone() {
        LiveGroupBannerItem liveGroupBannerItem = new LiveGroupBannerItem();
        liveGroupBannerItem.f40074id = this.f40074id;
        liveGroupBannerItem.link = this.link;
        liveGroupBannerItem.cover = this.cover;
        return liveGroupBannerItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveGroupBannerItem)) {
            return false;
        }
        LiveGroupBannerItem liveGroupBannerItem = (LiveGroupBannerItem) obj;
        return ValueObject.util_equals(this.f40074id, liveGroupBannerItem.f40074id) && ValueObject.util_equals(this.link, liveGroupBannerItem.link) && ValueObject.util_equals(this.cover, liveGroupBannerItem.cover);
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
        String str = this.f40074id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.link;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.cover;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40074id == null) {
            this.f40074id = "";
        }
        if (this.link == null) {
            this.link = "";
        }
        if (this.cover == null) {
            this.cover = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
