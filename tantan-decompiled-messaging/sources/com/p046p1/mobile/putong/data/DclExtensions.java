package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class DclExtensions extends ValueObject implements Cloneable, Serializable {
    public static final String DCL_EXT_BUSINESS_TYPE_POI = "Poi";
    public static final String TYPE = "dclextensions";

    @NonNull
    @ProtobufIndex(index = 4)
    public String businessType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String exploreModule;

    @NonNull
    @ProtobufIndex(index = 5)
    public String liveLikeSource;

    @NonNull
    @ProtobufIndex(index = 2)
    public String voiceLiveId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String voiceRoomId;
    public static ProtobufAdapter<DclExtensions> PROTOBUF_ADAPTER = new MessageNanoAdapter<DclExtensions>() { // from class: com.p1.mobile.putong.data.DclExtensions.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DclExtensions dclExtensions) {
            String str = dclExtensions.exploreModule;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = dclExtensions.voiceLiveId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = dclExtensions.voiceRoomId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = dclExtensions.businessType;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = dclExtensions.liveLikeSource;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            dclExtensions.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DclExtensions parse(nb5 nb5Var) throws IOException {
            DclExtensions dclExtensions = new DclExtensions();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (dclExtensions.exploreModule == null) {
                        dclExtensions.exploreModule = "";
                    }
                    if (dclExtensions.voiceLiveId == null) {
                        dclExtensions.voiceLiveId = "";
                    }
                    if (dclExtensions.voiceRoomId == null) {
                        dclExtensions.voiceRoomId = "";
                    }
                    if (dclExtensions.businessType == null) {
                        dclExtensions.businessType = "";
                    }
                    if (dclExtensions.liveLikeSource != null) {
                        break;
                    }
                    dclExtensions.liveLikeSource = "";
                    break;
                }
                if (iM158752u == 10) {
                    dclExtensions.exploreModule = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    dclExtensions.voiceLiveId = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    dclExtensions.voiceRoomId = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    dclExtensions.businessType = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (dclExtensions.exploreModule == null) {
                            dclExtensions.exploreModule = "";
                        }
                        if (dclExtensions.voiceLiveId == null) {
                            dclExtensions.voiceLiveId = "";
                        }
                        if (dclExtensions.voiceRoomId == null) {
                            dclExtensions.voiceRoomId = "";
                        }
                        if (dclExtensions.businessType == null) {
                            dclExtensions.businessType = "";
                        }
                        if (dclExtensions.liveLikeSource != null) {
                            break;
                        }
                        dclExtensions.liveLikeSource = "";
                        return dclExtensions;
                    }
                    dclExtensions.liveLikeSource = nb5Var.m158750s();
                }
            }
            return dclExtensions;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DclExtensions dclExtensions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = dclExtensions.exploreModule;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = dclExtensions.voiceLiveId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = dclExtensions.voiceRoomId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = dclExtensions.businessType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = dclExtensions.liveLikeSource;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
        }
    };
    public static JsonAdapter<DclExtensions> JSON_ADAPTER = new ObjectJsonAdapter<DclExtensions>() { // from class: com.p1.mobile.putong.data.DclExtensions.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DclExtensions.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DclExtensions newInstance() {
            return new DclExtensions();
        }

        public boolean parseField(DclExtensions dclExtensions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveLikeSource":
                    dclExtensions.liveLikeSource = jsonParser.getValueAsString();
                    return true;
                case "businessType":
                    dclExtensions.businessType = jsonParser.getValueAsString();
                    return true;
                case "exploreModule":
                    dclExtensions.exploreModule = jsonParser.getValueAsString();
                    return true;
                case "voiceLiveId":
                    dclExtensions.voiceLiveId = jsonParser.getValueAsString();
                    return true;
                case "voiceRoomId":
                    dclExtensions.voiceRoomId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DclExtensions dclExtensions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "liveLikeSource":
                case "businessType":
                case "exploreModule":
                case "voiceLiveId":
                case "voiceRoomId":
                    return true;
                default:
                    return super.parseFieldCheck(dclExtensions, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DclExtensions dclExtensions, JsonGenerator jsonGenerator) throws IOException {
            String str = dclExtensions.exploreModule;
            if (str != null) {
                jsonGenerator.writeStringField("exploreModule", str);
            }
            String str2 = dclExtensions.voiceLiveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("voiceLiveId", str2);
            }
            String str3 = dclExtensions.voiceRoomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("voiceRoomId", str3);
            }
            String str4 = dclExtensions.businessType;
            if (str4 != null) {
                jsonGenerator.writeStringField("businessType", str4);
            }
            String str5 = dclExtensions.liveLikeSource;
            if (str5 != null) {
                jsonGenerator.writeStringField("liveLikeSource", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DclExtensions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DclExtensions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DclExtensions new_() {
        DclExtensions dclExtensions = new DclExtensions();
        dclExtensions.nullCheck();
        return dclExtensions;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DclExtensions mo223809clone() {
        DclExtensions dclExtensions = new DclExtensions();
        dclExtensions.exploreModule = this.exploreModule;
        dclExtensions.voiceLiveId = this.voiceLiveId;
        dclExtensions.voiceRoomId = this.voiceRoomId;
        dclExtensions.businessType = this.businessType;
        dclExtensions.liveLikeSource = this.liveLikeSource;
        return dclExtensions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DclExtensions)) {
            return false;
        }
        DclExtensions dclExtensions = (DclExtensions) obj;
        return ValueObject.util_equals(this.exploreModule, dclExtensions.exploreModule) && ValueObject.util_equals(this.voiceLiveId, dclExtensions.voiceLiveId) && ValueObject.util_equals(this.voiceRoomId, dclExtensions.voiceRoomId) && ValueObject.util_equals(this.businessType, dclExtensions.businessType) && ValueObject.util_equals(this.liveLikeSource, dclExtensions.liveLikeSource);
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
        String str = this.exploreModule;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.voiceLiveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.voiceRoomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.businessType;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.liveLikeSource;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.exploreModule == null) {
            this.exploreModule = "";
        }
        if (this.voiceLiveId == null) {
            this.voiceLiveId = "";
        }
        if (this.voiceRoomId == null) {
            this.voiceRoomId = "";
        }
        if (this.businessType == null) {
            this.businessType = "";
        }
        if (this.liveLikeSource == null) {
            this.liveLikeSource = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
