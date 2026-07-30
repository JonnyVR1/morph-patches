package com.p046p1.mobile.putong.feed.data;

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
public class FrameResource extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "frameresource";

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<FrameResource> PROTOBUF_ADAPTER = new MessageNanoAdapter<FrameResource>() { // from class: com.p1.mobile.putong.feed.data.FrameResource.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FrameResource frameResource) {
            String str = frameResource.type;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = frameResource.url;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            frameResource.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FrameResource parse(nb5 nb5Var) throws IOException {
            FrameResource frameResource = new FrameResource();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (frameResource.type == null) {
                        frameResource.type = "";
                    }
                    if (frameResource.url != null) {
                        break;
                    }
                    frameResource.url = "";
                    break;
                }
                if (iM158752u == 10) {
                    frameResource.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (frameResource.type == null) {
                            frameResource.type = "";
                        }
                        if (frameResource.url != null) {
                            break;
                        }
                        frameResource.url = "";
                        return frameResource;
                    }
                    frameResource.url = nb5Var.m158750s();
                }
            }
            return frameResource;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FrameResource frameResource, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = frameResource.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = frameResource.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<FrameResource> JSON_ADAPTER = new ObjectJsonAdapter<FrameResource>() { // from class: com.p1.mobile.putong.feed.data.FrameResource.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FrameResource.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FrameResource newInstance() {
            return new FrameResource();
        }

        public boolean parseField(FrameResource frameResource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("url")) {
                frameResource.url = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("type")) {
                return false;
            }
            frameResource.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FrameResource frameResource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("url") || str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(frameResource, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FrameResource frameResource, JsonGenerator jsonGenerator) throws IOException {
            String str = frameResource.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = frameResource.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FrameResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FrameResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FrameResource new_() {
        FrameResource frameResource = new FrameResource();
        frameResource.nullCheck();
        return frameResource;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FrameResource mo223809clone() {
        FrameResource frameResource = new FrameResource();
        frameResource.type = this.type;
        frameResource.url = this.url;
        return frameResource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrameResource)) {
            return false;
        }
        FrameResource frameResource = (FrameResource) obj;
        return ValueObject.util_equals(this.type, frameResource.type) && ValueObject.util_equals(this.url, frameResource.url);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
