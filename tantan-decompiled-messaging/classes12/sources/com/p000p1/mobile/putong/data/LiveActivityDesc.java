package com.p000p1.mobile.putong.data;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveActivityDesc liveActivityDesc) {
            String str = liveActivityDesc.unread;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveActivityDesc.read;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) liveActivityDesc).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveActivityDesc m18313parse(nb5 nb5Var) throws IOException {
            LiveActivityDesc liveActivityDesc = new LiveActivityDesc();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveActivityDesc.unread == null) {
                        liveActivityDesc.unread = "";
                    }
                    if (liveActivityDesc.read != null) {
                        break;
                    }
                    liveActivityDesc.read = "";
                    break;
                }
                if (iU == 10) {
                    liveActivityDesc.unread = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (liveActivityDesc.unread == null) {
                            liveActivityDesc.unread = "";
                        }
                        if (liveActivityDesc.read != null) {
                            break;
                        }
                        liveActivityDesc.read = "";
                        return liveActivityDesc;
                    }
                    liveActivityDesc.read = nb5Var.s();
                }
            }
            return liveActivityDesc;
        }

        public void serialize(LiveActivityDesc liveActivityDesc, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveActivityDesc.unread;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveActivityDesc.read;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<LiveActivityDesc> JSON_ADAPTER = new ObjectJsonAdapter<LiveActivityDesc>() { // from class: com.p1.mobile.putong.data.LiveActivityDesc.2
        public Class getDataClass() {
            return LiveActivityDesc.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveActivityDesc mo17830newInstance() {
            return new LiveActivityDesc();
        }

        public boolean parseField(LiveActivityDesc liveActivityDesc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("unread")) {
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
            if (str.equals("unread") || str.equals("read")) {
                return true;
            }
            return super.parseFieldCheck(liveActivityDesc, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveActivityDesc liveActivityDesc, JsonGenerator jsonGenerator) throws IOException {
            String str = liveActivityDesc.unread;
            if (str != null) {
                jsonGenerator.writeStringField("unread", str);
            }
            String str2 = liveActivityDesc.read;
            if (str2 != null) {
                jsonGenerator.writeStringField("read", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveActivityDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveActivityDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveActivityDesc new_() {
        LiveActivityDesc liveActivityDesc = new LiveActivityDesc();
        liveActivityDesc.nullCheck();
        return liveActivityDesc;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveActivityDesc m18312clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.unread;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.read;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.unread == null) {
            this.unread = "";
        }
        if (this.read == null) {
            this.read = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
