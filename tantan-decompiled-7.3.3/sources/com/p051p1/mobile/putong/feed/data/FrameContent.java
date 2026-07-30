package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.LinkAction;
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

/* JADX INFO: loaded from: classes13.dex */
public class FrameContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "framecontent";

    @NonNull
    @ProtobufIndex(index = 1)
    public String deeplink;

    @NonNull
    @ProtobufIndex(index = 2)
    public FrameResource resource;
    public static ProtobufAdapter<FrameContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<FrameContent>() { // from class: com.p1.mobile.putong.feed.data.FrameContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FrameContent frameContent) {
            String str = frameContent.deeplink;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            FrameResource frameResource = frameContent.resource;
            if (frameResource != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, frameResource, FrameResource.PROTOBUF_ADAPTER);
            }
            frameContent.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FrameContent parse(nc5 nc5Var) throws IOException {
            FrameContent frameContent = new FrameContent();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (frameContent.deeplink == null) {
                        frameContent.deeplink = "";
                    }
                    if (frameContent.resource != null) {
                        break;
                    }
                    frameContent.resource = FrameResource.new_();
                    break;
                }
                if (iM162497u == 10) {
                    frameContent.deeplink = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (frameContent.deeplink == null) {
                            frameContent.deeplink = "";
                        }
                        if (frameContent.resource != null) {
                            break;
                        }
                        frameContent.resource = FrameResource.new_();
                        return frameContent;
                    }
                    frameContent.resource = (FrameResource) nc5Var.m162488l(FrameResource.PROTOBUF_ADAPTER);
                }
            }
            return frameContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FrameContent frameContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = frameContent.deeplink;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            FrameResource frameResource = frameContent.resource;
            if (frameResource != null) {
                codedOutputByteBufferNano.m17309K(2, frameResource, FrameResource.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FrameContent> JSON_ADAPTER = new ObjectJsonAdapter<FrameContent>() { // from class: com.p1.mobile.putong.feed.data.FrameContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FrameContent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FrameContent newInstance() {
            return new FrameContent();
        }

        public boolean parseField(FrameContent frameContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("resource")) {
                frameContent.resource = FrameResource.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(LinkAction.deeplink)) {
                return false;
            }
            frameContent.deeplink = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FrameContent frameContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("resource") || str.equals(LinkAction.deeplink)) {
                return true;
            }
            return super.parseFieldCheck(frameContent, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FrameContent frameContent, JsonGenerator jsonGenerator) throws IOException {
            String str = frameContent.deeplink;
            if (str != null) {
                jsonGenerator.writeStringField(LinkAction.deeplink, str);
            }
            if (frameContent.resource != null) {
                jsonGenerator.writeFieldName("resource");
                FrameResource.JSON_ADAPTER.serialize(frameContent.resource, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FrameContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FrameContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FrameContent new_() {
        FrameContent frameContent = new FrameContent();
        frameContent.nullCheck();
        return frameContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FrameContent mo225055clone() {
        FrameContent frameContent = new FrameContent();
        frameContent.deeplink = this.deeplink;
        FrameResource frameResource = this.resource;
        if (frameResource != null) {
            frameContent.resource = frameResource.mo225055clone();
        }
        return frameContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrameContent)) {
            return false;
        }
        FrameContent frameContent = (FrameContent) obj;
        return ValueObject.util_equals(this.deeplink, frameContent.deeplink) && ValueObject.util_equals(this.resource, frameContent.resource);
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
        String str = this.deeplink;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        FrameResource frameResource = this.resource;
        int iHashCode2 = iHashCode + (frameResource != null ? frameResource.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.deeplink == null) {
            this.deeplink = "";
        }
        if (this.resource == null) {
            this.resource = FrameResource.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
