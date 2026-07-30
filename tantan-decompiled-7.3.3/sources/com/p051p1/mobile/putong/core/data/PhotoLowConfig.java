package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes10.dex */
public class PhotoLowConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "photolowconfig";

    @ProtobufIndex(index = 2)
    public int count;

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<PhotoLowConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<PhotoLowConfig>() { // from class: com.p1.mobile.putong.core.data.PhotoLowConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PhotoLowConfig photoLowConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, photoLowConfig.enable) + CodedOutputByteBufferNano.m17281h(2, photoLowConfig.count);
            photoLowConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PhotoLowConfig parse(nc5 nc5Var) throws IOException {
            PhotoLowConfig photoLowConfig = new PhotoLowConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    photoLowConfig.enable = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return photoLowConfig;
                    }
                    photoLowConfig.count = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PhotoLowConfig photoLowConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, photoLowConfig.enable);
            codedOutputByteBufferNano.m17305G(2, photoLowConfig.count);
        }
    };
    public static JsonAdapter<PhotoLowConfig> JSON_ADAPTER = new ObjectJsonAdapter<PhotoLowConfig>() { // from class: com.p1.mobile.putong.core.data.PhotoLowConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PhotoLowConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PhotoLowConfig newInstance() {
            return new PhotoLowConfig();
        }

        public boolean parseField(PhotoLowConfig photoLowConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enable")) {
                photoLowConfig.enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("count")) {
                return false;
            }
            photoLowConfig.count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(PhotoLowConfig photoLowConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable") || str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(photoLowConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PhotoLowConfig photoLowConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", photoLowConfig.enable);
            jsonGenerator.writeNumberField("count", photoLowConfig.count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PhotoLowConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PhotoLowConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PhotoLowConfig new_() {
        PhotoLowConfig photoLowConfig = new PhotoLowConfig();
        photoLowConfig.nullCheck();
        return photoLowConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PhotoLowConfig mo225055clone() {
        PhotoLowConfig photoLowConfig = new PhotoLowConfig();
        photoLowConfig.enable = this.enable;
        photoLowConfig.count = this.count;
        return photoLowConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhotoLowConfig)) {
            return false;
        }
        PhotoLowConfig photoLowConfig = (PhotoLowConfig) obj;
        return this.enable == photoLowConfig.enable && this.count == photoLowConfig.count;
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
        int i2 = (((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.count;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
