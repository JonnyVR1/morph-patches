package com.p051p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.MomentFeedPushArgs;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
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
import java.util.Map;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class MomentFeedPushArgs extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentfeedpushargs";

    @Nullable
    @ProtobufIndex(index = 3)
    public String mid;

    @Nullable
    @ProtobufIndex(index = 1)
    public String path;

    @Nullable
    @ProtobufIndex(index = 4)
    public Map<String, String> schemeParamMap;

    @Nullable
    @ProtobufIndex(index = 2)
    public String uid;
    public static ProtobufAdapter<MomentFeedPushArgs> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentFeedPushArgs>() { // from class: com.p1.mobile.putong.data.MomentFeedPushArgs.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentFeedPushArgs momentFeedPushArgs) {
            String str = momentFeedPushArgs.path;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = momentFeedPushArgs.uid;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = momentFeedPushArgs.mid;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            Map<String, String> map = momentFeedPushArgs.schemeParamMap;
            if (map != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            momentFeedPushArgs.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentFeedPushArgs parse(nc5 nc5Var) throws IOException {
            MomentFeedPushArgs momentFeedPushArgs = new MomentFeedPushArgs();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    momentFeedPushArgs.path = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    momentFeedPushArgs.uid = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    momentFeedPushArgs.mid = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        return momentFeedPushArgs;
                    }
                    momentFeedPushArgs.schemeParamMap = (Map) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentFeedPushArgs momentFeedPushArgs, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentFeedPushArgs.path;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = momentFeedPushArgs.uid;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = momentFeedPushArgs.mid;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            Map<String, String> map = momentFeedPushArgs.schemeParamMap;
            if (map != null) {
                codedOutputByteBufferNano.m17309K(4, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MomentFeedPushArgs> JSON_ADAPTER = new ObjectJsonAdapter<MomentFeedPushArgs>() { // from class: com.p1.mobile.putong.data.MomentFeedPushArgs.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentFeedPushArgs.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentFeedPushArgs newInstance() {
            return new MomentFeedPushArgs();
        }

        public boolean parseField(MomentFeedPushArgs momentFeedPushArgs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "mid":
                    momentFeedPushArgs.mid = jsonParser.getValueAsString();
                    return true;
                case "uid":
                    momentFeedPushArgs.uid = jsonParser.getValueAsString();
                    return true;
                case "path":
                    momentFeedPushArgs.path = jsonParser.getValueAsString();
                    return true;
                case "schemeParamMap":
                    momentFeedPushArgs.schemeParamMap = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentFeedPushArgs momentFeedPushArgs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "mid":
                case "uid":
                case "path":
                case "schemeParamMap":
                    return true;
                default:
                    return super.parseFieldCheck(momentFeedPushArgs, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentFeedPushArgs momentFeedPushArgs, JsonGenerator jsonGenerator) throws IOException {
            String str = momentFeedPushArgs.path;
            if (str != null) {
                jsonGenerator.writeStringField("path", str);
            }
            String str2 = momentFeedPushArgs.uid;
            if (str2 != null) {
                jsonGenerator.writeStringField(Oauth2AccessToken.KEY_UID, str2);
            }
            String str3 = momentFeedPushArgs.mid;
            if (str3 != null) {
                jsonGenerator.writeStringField(BaseSei.MID, str3);
            }
            if (momentFeedPushArgs.schemeParamMap != null) {
                jsonGenerator.writeFieldName("schemeParamMap");
                JsonAdapter.serializeMap(momentFeedPushArgs.schemeParamMap, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentFeedPushArgs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentFeedPushArgs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61043a(String str) {
        return str;
    }

    public static MomentFeedPushArgs new_() {
        MomentFeedPushArgs momentFeedPushArgs = new MomentFeedPushArgs();
        momentFeedPushArgs.nullCheck();
        return momentFeedPushArgs;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentFeedPushArgs mo225055clone() {
        MomentFeedPushArgs momentFeedPushArgs = new MomentFeedPushArgs();
        momentFeedPushArgs.path = this.path;
        momentFeedPushArgs.uid = this.uid;
        momentFeedPushArgs.mid = this.mid;
        Map<String, String> map = this.schemeParamMap;
        if (map != null) {
            momentFeedPushArgs.schemeParamMap = ValueObject.util_map(map, new qcj() { // from class: l.pn00
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MomentFeedPushArgs.m61043a((String) obj);
                }
            });
        }
        return momentFeedPushArgs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentFeedPushArgs)) {
            return false;
        }
        MomentFeedPushArgs momentFeedPushArgs = (MomentFeedPushArgs) obj;
        return ValueObject.util_equals(this.path, momentFeedPushArgs.path) && ValueObject.util_equals(this.uid, momentFeedPushArgs.uid) && ValueObject.util_equals(this.mid, momentFeedPushArgs.mid) && ValueObject.util_equals(this.schemeParamMap, momentFeedPushArgs.schemeParamMap);
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
        String str = this.path;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.uid;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.mid;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        Map<String, String> map = this.schemeParamMap;
        int iHashCode4 = iHashCode3 + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
