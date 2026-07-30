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
public class Frame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "frame";

    @NonNull
    @ProtobufIndex(index = 2)
    public FrameContent content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f683id;

    @ProtobufIndex(index = 3)
    public int intervalSec;
    public static ProtobufAdapter<Frame> PROTOBUF_ADAPTER = new MessageNanoAdapter<Frame>() { // from class: com.p1.mobile.putong.feed.data.Frame.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Frame frame) {
            String str = frame.f683id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            FrameContent frameContent = frame.content;
            if (frameContent != null) {
                iO += CodedOutputByteBufferNano.l(2, frameContent, FrameContent.PROTOBUF_ADAPTER);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, frame.intervalSec);
            ((MessageNano) frame).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Frame m19512parse(nb5 nb5Var) throws IOException {
            Frame frame = new Frame();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (frame.f683id == null) {
                        frame.f683id = "";
                    }
                    if (frame.content != null) {
                        break;
                    }
                    frame.content = FrameContent.new_();
                    break;
                }
                if (iU == 10) {
                    frame.f683id = nb5Var.s();
                } else if (iU == 18) {
                    frame.content = (FrameContent) nb5Var.l(FrameContent.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 24) {
                        if (frame.f683id == null) {
                            frame.f683id = "";
                        }
                        if (frame.content != null) {
                            break;
                        }
                        frame.content = FrameContent.new_();
                        return frame;
                    }
                    frame.intervalSec = nb5Var.j();
                }
            }
            return frame;
        }

        public void serialize(Frame frame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = frame.f683id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            FrameContent frameContent = frame.content;
            if (frameContent != null) {
                codedOutputByteBufferNano.K(2, frameContent, FrameContent.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(3, frame.intervalSec);
        }
    };
    public static JsonAdapter<Frame> JSON_ADAPTER = new ObjectJsonAdapter<Frame>() { // from class: com.p1.mobile.putong.feed.data.Frame.2
        public Class getDataClass() {
            return Frame.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Frame mo17830newInstance() {
            return new Frame();
        }

        public boolean parseField(Frame frame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "intervalSec":
                    frame.intervalSec = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    frame.f683id = jsonParser.getValueAsString();
                    return false;
                case "content":
                    frame.content = (FrameContent) FrameContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Frame frame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "intervalSec":
                    return true;
                case "id":
                    return false;
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(frame, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Frame frame, JsonGenerator jsonGenerator) throws IOException {
            String str = frame.f683id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (frame.content != null) {
                jsonGenerator.writeFieldName("content");
                FrameContent.JSON_ADAPTER.serialize(frame.content, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("intervalSec", frame.intervalSec);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Frame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Frame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Frame new_() {
        Frame frame = new Frame();
        frame.nullCheck();
        return frame;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Frame m19511clone() {
        Frame frame = new Frame();
        frame.f683id = this.f683id;
        FrameContent frameContent = this.content;
        if (frameContent != null) {
            frame.content = frameContent.m19514clone();
        }
        frame.intervalSec = this.intervalSec;
        return frame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) obj;
        return ValueObject.util_equals(this.f683id, frame.f683id) && ValueObject.util_equals(this.content, frame.content) && this.intervalSec == frame.intervalSec;
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
        String str = this.f683id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        FrameContent frameContent = this.content;
        int iHashCode2 = ((iHashCode + (frameContent != null ? frameContent.hashCode() : 0)) * 41) + this.intervalSec;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f683id == null) {
            this.f683id = "";
        }
        if (this.content == null) {
            this.content = FrameContent.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
