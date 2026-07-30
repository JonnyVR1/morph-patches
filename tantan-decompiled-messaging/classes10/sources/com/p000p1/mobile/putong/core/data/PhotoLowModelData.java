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
public class PhotoLowModelData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "photolowmodeldata";

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String audit;

    @NonNull
    @ProtobufIndex(index = 1)
    public String conclusion;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String differ;

    @NonNull
    @ProtobufIndex(index = 4)
    public String mapping;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String pointer;
    public static ProtobufAdapter<PhotoLowModelData> PROTOBUF_ADAPTER = new MessageNanoAdapter<PhotoLowModelData>() { // from class: com.p1.mobile.putong.core.data.PhotoLowModelData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PhotoLowModelData photoLowModelData) {
            String str = photoLowModelData.conclusion;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = photoLowModelData.pointer;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = photoLowModelData.differ;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = photoLowModelData.mapping;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = photoLowModelData.audit;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            ((MessageNano) photoLowModelData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PhotoLowModelData m14759parse(nb5 nb5Var) throws IOException {
            PhotoLowModelData photoLowModelData = new PhotoLowModelData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (photoLowModelData.audit == null) {
                        photoLowModelData.audit = "";
                    }
                    if (photoLowModelData.conclusion == null) {
                        photoLowModelData.conclusion = "";
                    }
                    if (photoLowModelData.pointer == null) {
                        photoLowModelData.pointer = "";
                    }
                    if (photoLowModelData.differ == null) {
                        photoLowModelData.differ = "";
                    }
                    if (photoLowModelData.mapping != null) {
                        break;
                    }
                    photoLowModelData.mapping = "";
                    break;
                }
                if (iU == 10) {
                    photoLowModelData.conclusion = nb5Var.s();
                } else if (iU == 18) {
                    photoLowModelData.pointer = nb5Var.s();
                } else if (iU == 26) {
                    photoLowModelData.differ = nb5Var.s();
                } else if (iU == 34) {
                    photoLowModelData.mapping = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (photoLowModelData.audit == null) {
                            photoLowModelData.audit = "";
                        }
                        if (photoLowModelData.conclusion == null) {
                            photoLowModelData.conclusion = "";
                        }
                        if (photoLowModelData.pointer == null) {
                            photoLowModelData.pointer = "";
                        }
                        if (photoLowModelData.differ == null) {
                            photoLowModelData.differ = "";
                        }
                        if (photoLowModelData.mapping != null) {
                            break;
                        }
                        photoLowModelData.mapping = "";
                        return photoLowModelData;
                    }
                    photoLowModelData.audit = nb5Var.s();
                }
            }
            return photoLowModelData;
        }

        public void serialize(PhotoLowModelData photoLowModelData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = photoLowModelData.conclusion;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = photoLowModelData.pointer;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = photoLowModelData.differ;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = photoLowModelData.mapping;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = photoLowModelData.audit;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
        }
    };
    public static JsonAdapter<PhotoLowModelData> JSON_ADAPTER = new ObjectJsonAdapter<PhotoLowModelData>() { // from class: com.p1.mobile.putong.core.data.PhotoLowModelData.2
        public Class getDataClass() {
            return PhotoLowModelData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PhotoLowModelData m14760newInstance() {
            return new PhotoLowModelData();
        }

        public boolean parseField(PhotoLowModelData photoLowModelData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "conclusion":
                    photoLowModelData.conclusion = jsonParser.getValueAsString();
                    return true;
                case "differ":
                    photoLowModelData.differ = jsonParser.getValueAsString();
                    return true;
                case "pointer":
                    photoLowModelData.pointer = jsonParser.getValueAsString();
                    return true;
                case "audit":
                    photoLowModelData.audit = jsonParser.getValueAsString();
                    return true;
                case "mapping":
                    photoLowModelData.mapping = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PhotoLowModelData photoLowModelData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "conclusion":
                case "differ":
                case "pointer":
                case "audit":
                case "mapping":
                    return true;
                default:
                    return super.parseFieldCheck(photoLowModelData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PhotoLowModelData photoLowModelData, JsonGenerator jsonGenerator) throws IOException {
            String str = photoLowModelData.audit;
            if (str != null) {
                jsonGenerator.writeStringField("audit", str);
            }
            String str2 = photoLowModelData.conclusion;
            if (str2 != null) {
                jsonGenerator.writeStringField("conclusion", str2);
            }
            String str3 = photoLowModelData.pointer;
            if (str3 != null) {
                jsonGenerator.writeStringField("pointer", str3);
            }
            String str4 = photoLowModelData.differ;
            if (str4 != null) {
                jsonGenerator.writeStringField("differ", str4);
            }
            String str5 = photoLowModelData.mapping;
            if (str5 != null) {
                jsonGenerator.writeStringField("mapping", str5);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PhotoLowModelData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PhotoLowModelData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PhotoLowModelData new_() {
        PhotoLowModelData photoLowModelData = new PhotoLowModelData();
        photoLowModelData.nullCheck();
        return photoLowModelData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PhotoLowModelData m14758clone() {
        PhotoLowModelData photoLowModelData = new PhotoLowModelData();
        photoLowModelData.audit = this.audit;
        photoLowModelData.conclusion = this.conclusion;
        photoLowModelData.pointer = this.pointer;
        photoLowModelData.differ = this.differ;
        photoLowModelData.mapping = this.mapping;
        return photoLowModelData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhotoLowModelData)) {
            return false;
        }
        PhotoLowModelData photoLowModelData = (PhotoLowModelData) obj;
        return ValueObject.util_equals(this.audit, photoLowModelData.audit) && ValueObject.util_equals(this.conclusion, photoLowModelData.conclusion) && ValueObject.util_equals(this.pointer, photoLowModelData.pointer) && ValueObject.util_equals(this.differ, photoLowModelData.differ) && ValueObject.util_equals(this.mapping, photoLowModelData.mapping);
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
        String str = this.audit;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.conclusion;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.pointer;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.differ;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.mapping;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.audit == null) {
            this.audit = "";
        }
        if (this.conclusion == null) {
            this.conclusion = "";
        }
        if (this.pointer == null) {
            this.pointer = "";
        }
        if (this.differ == null) {
            this.differ = "";
        }
        if (this.mapping == null) {
            this.mapping = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
