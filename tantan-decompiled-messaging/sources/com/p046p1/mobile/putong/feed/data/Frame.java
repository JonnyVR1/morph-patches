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
public class Frame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "frame";

    @NonNull
    @ProtobufIndex(index = 2)
    public FrameContent content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39222id;

    @ProtobufIndex(index = 3)
    public int intervalSec;
    public static ProtobufAdapter<Frame> PROTOBUF_ADAPTER = new MessageNanoAdapter<Frame>() { // from class: com.p1.mobile.putong.feed.data.Frame.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Frame frame) {
            String str = frame.f39222id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            FrameContent frameContent = frame.content;
            if (frameContent != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, frameContent, FrameContent.PROTOBUF_ADAPTER);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, frame.intervalSec);
            frame.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Frame parse(nb5 nb5Var) throws IOException {
            Frame frame = new Frame();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (frame.f39222id == null) {
                        frame.f39222id = "";
                    }
                    if (frame.content != null) {
                        break;
                    }
                    frame.content = FrameContent.new_();
                    break;
                }
                if (iM158752u == 10) {
                    frame.f39222id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    frame.content = (FrameContent) nb5Var.m158743l(FrameContent.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 24) {
                        if (frame.f39222id == null) {
                            frame.f39222id = "";
                        }
                        if (frame.content != null) {
                            break;
                        }
                        frame.content = FrameContent.new_();
                        return frame;
                    }
                    frame.intervalSec = nb5Var.m158741j();
                }
            }
            return frame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Frame frame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = frame.f39222id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            FrameContent frameContent = frame.content;
            if (frameContent != null) {
                codedOutputByteBufferNano.m17254K(2, frameContent, FrameContent.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(3, frame.intervalSec);
        }
    };
    public static JsonAdapter<Frame> JSON_ADAPTER = new ObjectJsonAdapter<Frame>() { // from class: com.p1.mobile.putong.feed.data.Frame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Frame.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Frame newInstance() {
            return new Frame();
        }

        public boolean parseField(Frame frame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "intervalSec":
                    frame.intervalSec = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    frame.f39222id = jsonParser.getValueAsString();
                    return false;
                case "content":
                    frame.content = FrameContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Frame frame, JsonGenerator jsonGenerator) throws IOException {
            String str = frame.f39222id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (frame.content != null) {
                jsonGenerator.writeFieldName("content");
                FrameContent.JSON_ADAPTER.serialize(frame.content, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("intervalSec", frame.intervalSec);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Frame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Frame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Frame new_() {
        Frame frame = new Frame();
        frame.nullCheck();
        return frame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Frame mo223809clone() {
        Frame frame = new Frame();
        frame.f39222id = this.f39222id;
        FrameContent frameContent = this.content;
        if (frameContent != null) {
            frame.content = frameContent.mo223809clone();
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
        return ValueObject.util_equals(this.f39222id, frame.f39222id) && ValueObject.util_equals(this.content, frame.content) && this.intervalSec == frame.intervalSec;
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
        String str = this.f39222id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        FrameContent frameContent = this.content;
        int iHashCode2 = ((iHashCode + (frameContent != null ? frameContent.hashCode() : 0)) * 41) + this.intervalSec;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39222id == null) {
            this.f39222id = "";
        }
        if (this.content == null) {
            this.content = FrameContent.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
