package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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

/* JADX INFO: loaded from: classes10.dex */
public class CoreInteractionMessageCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coreinteractionmessagecounter";

    @ProtobufIndex(index = 2)
    public double latestStateCreatedTime;

    @NonNull
    @ProtobufIndex(index = 3)
    public String newestMessageInfo;

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<CoreInteractionMessageCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreInteractionMessageCounter>() { // from class: com.p1.mobile.putong.core.data.CoreInteractionMessageCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreInteractionMessageCounter coreInteractionMessageCounter) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, coreInteractionMessageCounter.unread) + CodedOutputByteBufferNano.m17222d(2, coreInteractionMessageCounter.latestStateCreatedTime);
            String str = coreInteractionMessageCounter.newestMessageInfo;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str);
            }
            coreInteractionMessageCounter.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreInteractionMessageCounter parse(nb5 nb5Var) throws IOException {
            CoreInteractionMessageCounter coreInteractionMessageCounter = new CoreInteractionMessageCounter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (coreInteractionMessageCounter.newestMessageInfo != null) {
                        break;
                    }
                    coreInteractionMessageCounter.newestMessageInfo = "";
                    break;
                }
                if (iM158752u == 8) {
                    coreInteractionMessageCounter.unread = nb5Var.m158741j();
                } else if (iM158752u == 17) {
                    coreInteractionMessageCounter.latestStateCreatedTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 26) {
                        if (coreInteractionMessageCounter.newestMessageInfo != null) {
                            break;
                        }
                        coreInteractionMessageCounter.newestMessageInfo = "";
                        return coreInteractionMessageCounter;
                    }
                    coreInteractionMessageCounter.newestMessageInfo = nb5Var.m158750s();
                }
            }
            return coreInteractionMessageCounter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreInteractionMessageCounter coreInteractionMessageCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, coreInteractionMessageCounter.unread);
            codedOutputByteBufferNano.m17246C(2, coreInteractionMessageCounter.latestStateCreatedTime);
            String str = coreInteractionMessageCounter.newestMessageInfo;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
        }
    };
    public static JsonAdapter<CoreInteractionMessageCounter> JSON_ADAPTER = new ObjectJsonAdapter<CoreInteractionMessageCounter>() { // from class: com.p1.mobile.putong.core.data.CoreInteractionMessageCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreInteractionMessageCounter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreInteractionMessageCounter newInstance() {
            return new CoreInteractionMessageCounter();
        }

        public boolean parseField(CoreInteractionMessageCounter coreInteractionMessageCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "unread":
                    coreInteractionMessageCounter.unread = jsonParser.getValueAsInt();
                    return true;
                case "latestStateCreatedTime":
                    coreInteractionMessageCounter.latestStateCreatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "newestMessageInfo":
                    coreInteractionMessageCounter.newestMessageInfo = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CoreInteractionMessageCounter coreInteractionMessageCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "unread":
                case "latestStateCreatedTime":
                case "newestMessageInfo":
                    return true;
                default:
                    return super.parseFieldCheck(coreInteractionMessageCounter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreInteractionMessageCounter coreInteractionMessageCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, coreInteractionMessageCounter.unread);
            jsonGenerator.writeFieldName("latestStateCreatedTime");
            Converter.API_TIME.serialize(Double.valueOf(coreInteractionMessageCounter.latestStateCreatedTime), jsonGenerator, true);
            String str = coreInteractionMessageCounter.newestMessageInfo;
            if (str != null) {
                jsonGenerator.writeStringField("newestMessageInfo", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreInteractionMessageCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreInteractionMessageCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreInteractionMessageCounter new_() {
        CoreInteractionMessageCounter coreInteractionMessageCounter = new CoreInteractionMessageCounter();
        coreInteractionMessageCounter.nullCheck();
        return coreInteractionMessageCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreInteractionMessageCounter mo223809clone() {
        CoreInteractionMessageCounter coreInteractionMessageCounter = new CoreInteractionMessageCounter();
        coreInteractionMessageCounter.unread = this.unread;
        coreInteractionMessageCounter.latestStateCreatedTime = this.latestStateCreatedTime;
        coreInteractionMessageCounter.newestMessageInfo = this.newestMessageInfo;
        return coreInteractionMessageCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreInteractionMessageCounter)) {
            return false;
        }
        CoreInteractionMessageCounter coreInteractionMessageCounter = (CoreInteractionMessageCounter) obj;
        return this.unread == coreInteractionMessageCounter.unread && this.latestStateCreatedTime == coreInteractionMessageCounter.latestStateCreatedTime && ValueObject.util_equals(this.newestMessageInfo, coreInteractionMessageCounter.newestMessageInfo);
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
        int i2 = (i * 41) + this.unread;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latestStateCreatedTime);
        int i3 = ((i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str = this.newestMessageInfo;
        int iHashCode = i3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.newestMessageInfo == null) {
            this.newestMessageInfo = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
