package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Link;
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
public class LiveGroupBannerItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livegroupbanneritem";

    @NonNull
    @ProtobufIndex(index = 3)
    public String cover;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f687id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String link;
    public static ProtobufAdapter<LiveGroupBannerItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveGroupBannerItem>() { // from class: com.p1.mobile.putong.feed.data.LiveGroupBannerItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveGroupBannerItem liveGroupBannerItem) {
            String str = liveGroupBannerItem.f687id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveGroupBannerItem.link;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = liveGroupBannerItem.cover;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) liveGroupBannerItem).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveGroupBannerItem m19557parse(nb5 nb5Var) throws IOException {
            LiveGroupBannerItem liveGroupBannerItem = new LiveGroupBannerItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveGroupBannerItem.f687id == null) {
                        liveGroupBannerItem.f687id = "";
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
                if (iU == 10) {
                    liveGroupBannerItem.f687id = nb5Var.s();
                } else if (iU == 18) {
                    liveGroupBannerItem.link = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (liveGroupBannerItem.f687id == null) {
                            liveGroupBannerItem.f687id = "";
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
                    liveGroupBannerItem.cover = nb5Var.s();
                }
            }
            return liveGroupBannerItem;
        }

        public void serialize(LiveGroupBannerItem liveGroupBannerItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveGroupBannerItem.f687id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveGroupBannerItem.link;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = liveGroupBannerItem.cover;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<LiveGroupBannerItem> JSON_ADAPTER = new ObjectJsonAdapter<LiveGroupBannerItem>() { // from class: com.p1.mobile.putong.feed.data.LiveGroupBannerItem.2
        public Class getDataClass() {
            return LiveGroupBannerItem.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveGroupBannerItem mo17830newInstance() {
            return new LiveGroupBannerItem();
        }

        public boolean parseField(LiveGroupBannerItem liveGroupBannerItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    liveGroupBannerItem.f687id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveGroupBannerItem liveGroupBannerItem, JsonGenerator jsonGenerator) throws IOException {
            String str = liveGroupBannerItem.f687id;
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveGroupBannerItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveGroupBannerItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveGroupBannerItem new_() {
        LiveGroupBannerItem liveGroupBannerItem = new LiveGroupBannerItem();
        liveGroupBannerItem.nullCheck();
        return liveGroupBannerItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveGroupBannerItem m19556clone() {
        LiveGroupBannerItem liveGroupBannerItem = new LiveGroupBannerItem();
        liveGroupBannerItem.f687id = this.f687id;
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
        return ValueObject.util_equals(this.f687id, liveGroupBannerItem.f687id) && ValueObject.util_equals(this.link, liveGroupBannerItem.link) && ValueObject.util_equals(this.cover, liveGroupBannerItem.cover);
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
        String str = this.f687id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.link;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.cover;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f687id == null) {
            this.f687id = "";
        }
        if (this.link == null) {
            this.link = "";
        }
        if (this.cover == null) {
            this.cover = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
