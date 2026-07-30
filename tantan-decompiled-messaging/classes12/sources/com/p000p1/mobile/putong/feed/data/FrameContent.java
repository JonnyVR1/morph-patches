package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.LinkAction;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FrameContent frameContent) {
            String str = frameContent.deeplink;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            FrameResource frameResource = frameContent.resource;
            if (frameResource != null) {
                iO += CodedOutputByteBufferNano.l(2, frameResource, FrameResource.PROTOBUF_ADAPTER);
            }
            ((MessageNano) frameContent).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FrameContent m19515parse(nb5 nb5Var) throws IOException {
            FrameContent frameContent = new FrameContent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (frameContent.deeplink == null) {
                        frameContent.deeplink = "";
                    }
                    if (frameContent.resource != null) {
                        break;
                    }
                    frameContent.resource = FrameResource.new_();
                    break;
                }
                if (iU == 10) {
                    frameContent.deeplink = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (frameContent.deeplink == null) {
                            frameContent.deeplink = "";
                        }
                        if (frameContent.resource != null) {
                            break;
                        }
                        frameContent.resource = FrameResource.new_();
                        return frameContent;
                    }
                    frameContent.resource = (FrameResource) nb5Var.l(FrameResource.PROTOBUF_ADAPTER);
                }
            }
            return frameContent;
        }

        public void serialize(FrameContent frameContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = frameContent.deeplink;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            FrameResource frameResource = frameContent.resource;
            if (frameResource != null) {
                codedOutputByteBufferNano.K(2, frameResource, FrameResource.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FrameContent> JSON_ADAPTER = new ObjectJsonAdapter<FrameContent>() { // from class: com.p1.mobile.putong.feed.data.FrameContent.2
        public Class getDataClass() {
            return FrameContent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FrameContent mo17830newInstance() {
            return new FrameContent();
        }

        public boolean parseField(FrameContent frameContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("resource")) {
                frameContent.resource = (FrameResource) FrameResource.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FrameContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FrameContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FrameContent new_() {
        FrameContent frameContent = new FrameContent();
        frameContent.nullCheck();
        return frameContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FrameContent m19514clone() {
        FrameContent frameContent = new FrameContent();
        frameContent.deeplink = this.deeplink;
        FrameResource frameResource = this.resource;
        if (frameResource != null) {
            frameContent.resource = frameResource.m19517clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.deeplink;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        FrameResource frameResource = this.resource;
        int iHashCode2 = iHashCode + (frameResource != null ? frameResource.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.deeplink == null) {
            this.deeplink = "";
        }
        if (this.resource == null) {
            this.resource = FrameResource.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
