package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes13.dex */
public class Frame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "frame";

    @NonNull
    @ProtobufIndex(index = 2)
    public FrameContent content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f40070id;

    @ProtobufIndex(index = 3)
    public int intervalSec;
    public static ProtobufAdapter<Frame> PROTOBUF_ADAPTER = new MessageNanoAdapter<Frame>() { // from class: com.p1.mobile.putong.feed.data.Frame.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Frame frame) {
            String str = frame.f40070id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            FrameContent frameContent = frame.content;
            if (frameContent != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, frameContent, FrameContent.PROTOBUF_ADAPTER);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, frame.intervalSec);
            frame.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Frame parse(nc5 nc5Var) throws IOException {
            Frame frame = new Frame();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (frame.f40070id == null) {
                        frame.f40070id = "";
                    }
                    if (frame.content != null) {
                        break;
                    }
                    frame.content = FrameContent.new_();
                    break;
                }
                if (iM162497u == 10) {
                    frame.f40070id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    frame.content = (FrameContent) nc5Var.m162488l(FrameContent.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 24) {
                        if (frame.f40070id == null) {
                            frame.f40070id = "";
                        }
                        if (frame.content != null) {
                            break;
                        }
                        frame.content = FrameContent.new_();
                        return frame;
                    }
                    frame.intervalSec = nc5Var.m162486j();
                }
            }
            return frame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Frame frame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = frame.f40070id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            FrameContent frameContent = frame.content;
            if (frameContent != null) {
                codedOutputByteBufferNano.m17309K(2, frameContent, FrameContent.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(3, frame.intervalSec);
        }
    };
    public static JsonAdapter<Frame> JSON_ADAPTER = new ObjectJsonAdapter<Frame>() { // from class: com.p1.mobile.putong.feed.data.Frame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Frame.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    frame.f40070id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Frame frame, JsonGenerator jsonGenerator) throws IOException {
            String str = frame.f40070id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (frame.content != null) {
                jsonGenerator.writeFieldName("content");
                FrameContent.JSON_ADAPTER.serialize(frame.content, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("intervalSec", frame.intervalSec);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Frame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public Frame mo225055clone() {
        Frame frame = new Frame();
        frame.f40070id = this.f40070id;
        FrameContent frameContent = this.content;
        if (frameContent != null) {
            frame.content = frameContent.mo225055clone();
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
        return ValueObject.util_equals(this.f40070id, frame.f40070id) && ValueObject.util_equals(this.content, frame.content) && this.intervalSec == frame.intervalSec;
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
        String str = this.f40070id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        FrameContent frameContent = this.content;
        int iHashCode2 = ((iHashCode + (frameContent != null ? frameContent.hashCode() : 0)) * 41) + this.intervalSec;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40070id == null) {
            this.f40070id = "";
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
