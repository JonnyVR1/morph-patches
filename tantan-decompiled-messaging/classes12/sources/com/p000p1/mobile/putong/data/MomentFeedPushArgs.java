package com.p000p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.MomentFeedPushArgs;
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
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentFeedPushArgs momentFeedPushArgs) {
            String str = momentFeedPushArgs.path;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = momentFeedPushArgs.uid;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = momentFeedPushArgs.mid;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            Map<String, String> map = momentFeedPushArgs.schemeParamMap;
            if (map != null) {
                iO += CodedOutputByteBufferNano.l(4, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            ((MessageNano) momentFeedPushArgs).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentFeedPushArgs m18483parse(nb5 nb5Var) throws IOException {
            MomentFeedPushArgs momentFeedPushArgs = new MomentFeedPushArgs();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    momentFeedPushArgs.path = nb5Var.s();
                } else if (iU == 18) {
                    momentFeedPushArgs.uid = nb5Var.s();
                } else if (iU == 26) {
                    momentFeedPushArgs.mid = nb5Var.s();
                } else {
                    if (iU != 34) {
                        return momentFeedPushArgs;
                    }
                    momentFeedPushArgs.schemeParamMap = (Map) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
                }
            }
        }

        public void serialize(MomentFeedPushArgs momentFeedPushArgs, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentFeedPushArgs.path;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = momentFeedPushArgs.uid;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = momentFeedPushArgs.mid;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            Map<String, String> map = momentFeedPushArgs.schemeParamMap;
            if (map != null) {
                codedOutputByteBufferNano.K(4, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MomentFeedPushArgs> JSON_ADAPTER = new ObjectJsonAdapter<MomentFeedPushArgs>() { // from class: com.p1.mobile.putong.data.MomentFeedPushArgs.2
        public Class getDataClass() {
            return MomentFeedPushArgs.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentFeedPushArgs mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentFeedPushArgs momentFeedPushArgs, JsonGenerator jsonGenerator) throws IOException {
            String str = momentFeedPushArgs.path;
            if (str != null) {
                jsonGenerator.writeStringField("path", str);
            }
            String str2 = momentFeedPushArgs.uid;
            if (str2 != null) {
                jsonGenerator.writeStringField("uid", str2);
            }
            String str3 = momentFeedPushArgs.mid;
            if (str3 != null) {
                jsonGenerator.writeStringField("mid", str3);
            }
            if (momentFeedPushArgs.schemeParamMap != null) {
                jsonGenerator.writeFieldName("schemeParamMap");
                JsonAdapter.serializeMap(momentFeedPushArgs.schemeParamMap, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentFeedPushArgs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentFeedPushArgs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m777a(String str) {
        return str;
    }

    public static MomentFeedPushArgs new_() {
        MomentFeedPushArgs momentFeedPushArgs = new MomentFeedPushArgs();
        momentFeedPushArgs.nullCheck();
        return momentFeedPushArgs;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentFeedPushArgs m18482clone() {
        MomentFeedPushArgs momentFeedPushArgs = new MomentFeedPushArgs();
        momentFeedPushArgs.path = this.path;
        momentFeedPushArgs.uid = this.uid;
        momentFeedPushArgs.mid = this.mid;
        Map<String, String> map = this.schemeParamMap;
        if (map != null) {
            momentFeedPushArgs.schemeParamMap = ValueObject.util_map(map, new w9j() { // from class: l.gf00
                public final Object call(Object obj) {
                    return MomentFeedPushArgs.m777a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
