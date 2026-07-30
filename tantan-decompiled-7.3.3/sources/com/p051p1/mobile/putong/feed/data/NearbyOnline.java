package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.NearbyOnline;
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

/* JADX INFO: loaded from: classes13.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NearbyOnline nearbyOnline) {
            String str = nearbyOnline.title;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, nearbyOnline.userCount);
            List<String> list = nearbyOnline.userIds;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            nearbyOnline.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NearbyOnline parse(nc5 nc5Var) throws IOException {
            NearbyOnline nearbyOnline = new NearbyOnline();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (nearbyOnline.title == null) {
                        nearbyOnline.title = "";
                    }
                    if (nearbyOnline.userIds != null) {
                        break;
                    }
                    nearbyOnline.userIds = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    nearbyOnline.title = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    nearbyOnline.userCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 26) {
                        if (nearbyOnline.title == null) {
                            nearbyOnline.title = "";
                        }
                        if (nearbyOnline.userIds != null) {
                            break;
                        }
                        nearbyOnline.userIds = new ArrayList();
                        return nearbyOnline;
                    }
                    nearbyOnline.userIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return nearbyOnline;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NearbyOnline nearbyOnline, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = nearbyOnline.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, nearbyOnline.userCount);
            List<String> list = nearbyOnline.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<NearbyOnline> JSON_ADAPTER = new ObjectJsonAdapter<NearbyOnline>() { // from class: com.p1.mobile.putong.feed.data.NearbyOnline.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NearbyOnline.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NearbyOnline newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NearbyOnline) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NearbyOnline) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m62059a(String str) {
        return str;
    }

    public static NearbyOnline new_() {
        NearbyOnline nearbyOnline = new NearbyOnline();
        nearbyOnline.nullCheck();
        return nearbyOnline;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NearbyOnline mo225055clone() {
        NearbyOnline nearbyOnline = new NearbyOnline();
        nearbyOnline.title = this.title;
        nearbyOnline.userCount = this.userCount;
        List<String> list = this.userIds;
        if (list != null) {
            nearbyOnline.userIds = ValueObject.util_map(list, new qcj() { // from class: l.sg20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return NearbyOnline.m62059a((String) obj);
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
        String str = this.title;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.userCount) * 41;
        List<String> list = this.userIds;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
