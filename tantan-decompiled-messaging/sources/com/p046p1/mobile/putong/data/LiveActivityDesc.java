package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.LimitTimePictureStatus;
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
public class LiveActivityDesc extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveactivitydesc";

    @NonNull
    @ProtobufIndex(index = 2)
    public String read;

    @NonNull
    @ProtobufIndex(index = 1)
    public String unread;
    public static ProtobufAdapter<LiveActivityDesc> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveActivityDesc>() { // from class: com.p1.mobile.putong.data.LiveActivityDesc.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveActivityDesc liveActivityDesc) {
            String str = liveActivityDesc.unread;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = liveActivityDesc.read;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            liveActivityDesc.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveActivityDesc parse(nb5 nb5Var) throws IOException {
            LiveActivityDesc liveActivityDesc = new LiveActivityDesc();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveActivityDesc.unread == null) {
                        liveActivityDesc.unread = "";
                    }
                    if (liveActivityDesc.read != null) {
                        break;
                    }
                    liveActivityDesc.read = "";
                    break;
                }
                if (iM158752u == 10) {
                    liveActivityDesc.unread = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (liveActivityDesc.unread == null) {
                            liveActivityDesc.unread = "";
                        }
                        if (liveActivityDesc.read != null) {
                            break;
                        }
                        liveActivityDesc.read = "";
                        return liveActivityDesc;
                    }
                    liveActivityDesc.read = nb5Var.m158750s();
                }
            }
            return liveActivityDesc;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveActivityDesc liveActivityDesc, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveActivityDesc.unread;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = liveActivityDesc.read;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<LiveActivityDesc> JSON_ADAPTER = new ObjectJsonAdapter<LiveActivityDesc>() { // from class: com.p1.mobile.putong.data.LiveActivityDesc.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveActivityDesc.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveActivityDesc newInstance() {
            return new LiveActivityDesc();
        }

        public boolean parseField(LiveActivityDesc liveActivityDesc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(LimitTimePictureStatus.unread)) {
                liveActivityDesc.unread = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("read")) {
                return false;
            }
            liveActivityDesc.read = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LiveActivityDesc liveActivityDesc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(LimitTimePictureStatus.unread) || str.equals("read")) {
                return true;
            }
            return super.parseFieldCheck(liveActivityDesc, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveActivityDesc liveActivityDesc, JsonGenerator jsonGenerator) throws IOException {
            String str = liveActivityDesc.unread;
            if (str != null) {
                jsonGenerator.writeStringField(LimitTimePictureStatus.unread, str);
            }
            String str2 = liveActivityDesc.read;
            if (str2 != null) {
                jsonGenerator.writeStringField("read", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveActivityDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveActivityDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveActivityDesc new_() {
        LiveActivityDesc liveActivityDesc = new LiveActivityDesc();
        liveActivityDesc.nullCheck();
        return liveActivityDesc;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveActivityDesc mo223809clone() {
        LiveActivityDesc liveActivityDesc = new LiveActivityDesc();
        liveActivityDesc.unread = this.unread;
        liveActivityDesc.read = this.read;
        return liveActivityDesc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveActivityDesc)) {
            return false;
        }
        LiveActivityDesc liveActivityDesc = (LiveActivityDesc) obj;
        return ValueObject.util_equals(this.unread, liveActivityDesc.unread) && ValueObject.util_equals(this.read, liveActivityDesc.read);
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
        String str = this.unread;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.read;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.unread == null) {
            this.unread = "";
        }
        if (this.read == null) {
            this.read = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
