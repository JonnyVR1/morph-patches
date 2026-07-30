package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FrameResource frameResource) {
            String str = frameResource.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = frameResource.url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) frameResource).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FrameResource m19518parse(nb5 nb5Var) throws IOException {
            FrameResource frameResource = new FrameResource();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (frameResource.type == null) {
                        frameResource.type = "";
                    }
                    if (frameResource.url != null) {
                        break;
                    }
                    frameResource.url = "";
                    break;
                }
                if (iU == 10) {
                    frameResource.type = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (frameResource.type == null) {
                            frameResource.type = "";
                        }
                        if (frameResource.url != null) {
                            break;
                        }
                        frameResource.url = "";
                        return frameResource;
                    }
                    frameResource.url = nb5Var.s();
                }
            }
            return frameResource;
        }

        public void serialize(FrameResource frameResource, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = frameResource.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = frameResource.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<FrameResource> JSON_ADAPTER = new ObjectJsonAdapter<FrameResource>() { // from class: com.p1.mobile.putong.feed.data.FrameResource.2
        public Class getDataClass() {
            return FrameResource.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FrameResource mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FrameResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FrameResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FrameResource new_() {
        FrameResource frameResource = new FrameResource();
        frameResource.nullCheck();
        return frameResource;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FrameResource m19517clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
