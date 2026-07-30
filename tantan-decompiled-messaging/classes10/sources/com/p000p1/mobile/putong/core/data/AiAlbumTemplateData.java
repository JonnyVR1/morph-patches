package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AiAlbumTemplateData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumtemplatedata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String desc;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f5id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String templateUrl;
    public static ProtobufAdapter<AiAlbumTemplateData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumTemplateData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumTemplateData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiAlbumTemplateData aiAlbumTemplateData) {
            String str = aiAlbumTemplateData.f5id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = aiAlbumTemplateData.desc;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = aiAlbumTemplateData.templateUrl;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) aiAlbumTemplateData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiAlbumTemplateData m11585parse(nb5 nb5Var) throws IOException {
            AiAlbumTemplateData aiAlbumTemplateData = new AiAlbumTemplateData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiAlbumTemplateData.f5id == null) {
                        aiAlbumTemplateData.f5id = "";
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
                if (iU == 10) {
                    aiAlbumTemplateData.f5id = nb5Var.s();
                } else if (iU == 18) {
                    aiAlbumTemplateData.desc = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (aiAlbumTemplateData.f5id == null) {
                            aiAlbumTemplateData.f5id = "";
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
                    aiAlbumTemplateData.templateUrl = nb5Var.s();
                }
            }
            return aiAlbumTemplateData;
        }

        public void serialize(AiAlbumTemplateData aiAlbumTemplateData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiAlbumTemplateData.f5id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = aiAlbumTemplateData.desc;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = aiAlbumTemplateData.templateUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<AiAlbumTemplateData> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumTemplateData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumTemplateData.2
        public Class getDataClass() {
            return AiAlbumTemplateData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiAlbumTemplateData m11586newInstance() {
            return new AiAlbumTemplateData();
        }

        public boolean parseField(AiAlbumTemplateData aiAlbumTemplateData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    aiAlbumTemplateData.f5id = jsonParser.getValueAsString();
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

        public void serializeFields(AiAlbumTemplateData aiAlbumTemplateData, JsonGenerator jsonGenerator) throws IOException {
            String str = aiAlbumTemplateData.f5id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = aiAlbumTemplateData.desc;
            if (str2 != null) {
                jsonGenerator.writeStringField("desc", str2);
            }
            String str3 = aiAlbumTemplateData.templateUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("templateUrl", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumTemplateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumTemplateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiAlbumTemplateData new_() {
        AiAlbumTemplateData aiAlbumTemplateData = new AiAlbumTemplateData();
        aiAlbumTemplateData.nullCheck();
        return aiAlbumTemplateData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiAlbumTemplateData m11584clone() {
        AiAlbumTemplateData aiAlbumTemplateData = new AiAlbumTemplateData();
        aiAlbumTemplateData.f5id = this.f5id;
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
        return ValueObject.util_equals(this.f5id, aiAlbumTemplateData.f5id) && ValueObject.util_equals(this.desc, aiAlbumTemplateData.desc) && ValueObject.util_equals(this.templateUrl, aiAlbumTemplateData.templateUrl);
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
        String str = this.f5id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.templateUrl;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f5id == null) {
            this.f5id = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.templateUrl == null) {
            this.templateUrl = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
