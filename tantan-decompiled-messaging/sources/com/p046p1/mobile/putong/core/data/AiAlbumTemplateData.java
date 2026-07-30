package com.p046p1.mobile.putong.core.data;

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
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class AiAlbumTemplateData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumtemplatedata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String desc;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20343id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String templateUrl;
    public static ProtobufAdapter<AiAlbumTemplateData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumTemplateData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumTemplateData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiAlbumTemplateData aiAlbumTemplateData) {
            String str = aiAlbumTemplateData.f20343id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = aiAlbumTemplateData.desc;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = aiAlbumTemplateData.templateUrl;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            aiAlbumTemplateData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiAlbumTemplateData parse(nb5 nb5Var) throws IOException {
            AiAlbumTemplateData aiAlbumTemplateData = new AiAlbumTemplateData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (aiAlbumTemplateData.f20343id == null) {
                        aiAlbumTemplateData.f20343id = "";
                    }
                    if (aiAlbumTemplateData.desc == null) {
                        aiAlbumTemplateData.desc = "";
                    }
                    if (aiAlbumTemplateData.templateUrl != null) {
                        break;
                    }
                    aiAlbumTemplateData.templateUrl = "";
                    break;
                }
                if (iM158752u == 10) {
                    aiAlbumTemplateData.f20343id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    aiAlbumTemplateData.desc = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (aiAlbumTemplateData.f20343id == null) {
                            aiAlbumTemplateData.f20343id = "";
                        }
                        if (aiAlbumTemplateData.desc == null) {
                            aiAlbumTemplateData.desc = "";
                        }
                        if (aiAlbumTemplateData.templateUrl != null) {
                            break;
                        }
                        aiAlbumTemplateData.templateUrl = "";
                        return aiAlbumTemplateData;
                    }
                    aiAlbumTemplateData.templateUrl = nb5Var.m158750s();
                }
            }
            return aiAlbumTemplateData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiAlbumTemplateData aiAlbumTemplateData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiAlbumTemplateData.f20343id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = aiAlbumTemplateData.desc;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = aiAlbumTemplateData.templateUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<AiAlbumTemplateData> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumTemplateData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumTemplateData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiAlbumTemplateData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiAlbumTemplateData newInstance() {
            return new AiAlbumTemplateData();
        }

        public boolean parseField(AiAlbumTemplateData aiAlbumTemplateData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    aiAlbumTemplateData.f20343id = jsonParser.getValueAsString();
                    return false;
                case "desc":
                    aiAlbumTemplateData.desc = jsonParser.getValueAsString();
                    return true;
                case "templateUrl":
                    aiAlbumTemplateData.templateUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AiAlbumTemplateData aiAlbumTemplateData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "desc":
                case "templateUrl":
                    return true;
                default:
                    return super.parseFieldCheck(aiAlbumTemplateData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiAlbumTemplateData aiAlbumTemplateData, JsonGenerator jsonGenerator) throws IOException {
            String str = aiAlbumTemplateData.f20343id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = aiAlbumTemplateData.desc;
            if (str2 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str2);
            }
            String str3 = aiAlbumTemplateData.templateUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("templateUrl", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumTemplateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumTemplateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiAlbumTemplateData new_() {
        AiAlbumTemplateData aiAlbumTemplateData = new AiAlbumTemplateData();
        aiAlbumTemplateData.nullCheck();
        return aiAlbumTemplateData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiAlbumTemplateData mo223809clone() {
        AiAlbumTemplateData aiAlbumTemplateData = new AiAlbumTemplateData();
        aiAlbumTemplateData.f20343id = this.f20343id;
        aiAlbumTemplateData.desc = this.desc;
        aiAlbumTemplateData.templateUrl = this.templateUrl;
        return aiAlbumTemplateData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiAlbumTemplateData)) {
            return false;
        }
        AiAlbumTemplateData aiAlbumTemplateData = (AiAlbumTemplateData) obj;
        return ValueObject.util_equals(this.f20343id, aiAlbumTemplateData.f20343id) && ValueObject.util_equals(this.desc, aiAlbumTemplateData.desc) && ValueObject.util_equals(this.templateUrl, aiAlbumTemplateData.templateUrl);
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
        String str = this.f20343id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.templateUrl;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20343id == null) {
            this.f20343id = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.templateUrl == null) {
            this.templateUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
