package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.NearbyOnline;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NearbyOnline extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nearbyonline";

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @ProtobufIndex(index = 2)
    public int userCount;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> userIds;
    public static ProtobufAdapter<NearbyOnline> PROTOBUF_ADAPTER = new MessageNanoAdapter<NearbyOnline>() { // from class: com.p1.mobile.putong.feed.data.NearbyOnline.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NearbyOnline nearbyOnline) {
            String str = nearbyOnline.title;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, nearbyOnline.userCount);
            List<String> list = nearbyOnline.userIds;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) nearbyOnline).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NearbyOnline m19675parse(nb5 nb5Var) throws IOException {
            NearbyOnline nearbyOnline = new NearbyOnline();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (nearbyOnline.title == null) {
                        nearbyOnline.title = "";
                    }
                    if (nearbyOnline.userIds != null) {
                        break;
                    }
                    nearbyOnline.userIds = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    nearbyOnline.title = nb5Var.s();
                } else if (iU == 16) {
                    nearbyOnline.userCount = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (nearbyOnline.title == null) {
                            nearbyOnline.title = "";
                        }
                        if (nearbyOnline.userIds != null) {
                            break;
                        }
                        nearbyOnline.userIds = new ArrayList();
                        return nearbyOnline;
                    }
                    nearbyOnline.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return nearbyOnline;
        }

        public void serialize(NearbyOnline nearbyOnline, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = nearbyOnline.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, nearbyOnline.userCount);
            List<String> list = nearbyOnline.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<NearbyOnline> JSON_ADAPTER = new ObjectJsonAdapter<NearbyOnline>() { // from class: com.p1.mobile.putong.feed.data.NearbyOnline.2
        public Class getDataClass() {
            return NearbyOnline.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NearbyOnline mo17830newInstance() {
            return new NearbyOnline();
        }

        public boolean parseField(NearbyOnline nearbyOnline, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userIds":
                    nearbyOnline.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    nearbyOnline.title = jsonParser.getValueAsString();
                    return true;
                case "userCount":
                    nearbyOnline.userCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NearbyOnline nearbyOnline, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userIds":
                case "title":
                case "userCount":
                    return true;
                default:
                    return super.parseFieldCheck(nearbyOnline, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NearbyOnline nearbyOnline, JsonGenerator jsonGenerator) throws IOException {
            String str = nearbyOnline.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            jsonGenerator.writeNumberField("userCount", nearbyOnline.userCount);
            if (nearbyOnline.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(nearbyOnline.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NearbyOnline) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NearbyOnline) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1801a(String str) {
        return str;
    }

    public static NearbyOnline new_() {
        NearbyOnline nearbyOnline = new NearbyOnline();
        nearbyOnline.nullCheck();
        return nearbyOnline;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NearbyOnline m19674clone() {
        NearbyOnline nearbyOnline = new NearbyOnline();
        nearbyOnline.title = this.title;
        nearbyOnline.userCount = this.userCount;
        List<String> list = this.userIds;
        if (list != null) {
            nearbyOnline.userIds = ValueObject.util_map(list, new w9j() { // from class: l.k820
                public final Object call(Object obj) {
                    return NearbyOnline.m1801a((String) obj);
                }
            });
        }
        return nearbyOnline;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NearbyOnline)) {
            return false;
        }
        NearbyOnline nearbyOnline = (NearbyOnline) obj;
        return ValueObject.util_equals(this.title, nearbyOnline.title) && this.userCount == nearbyOnline.userCount && ValueObject.util_equals(this.userIds, nearbyOnline.userIds);
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
        String str = this.title;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.userCount) * 41;
        List<String> list = this.userIds;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
