package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class ExtraPrivileges extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "extraprivileges";

    @NonNull
    @ProtobufIndex(index = 1)
    public HeartbeatMatchData heartbeatMatch;
    public static ProtobufAdapter<ExtraPrivileges> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExtraPrivileges>() { // from class: com.p1.mobile.putong.core.data.ExtraPrivileges.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ExtraPrivileges extraPrivileges) {
            HeartbeatMatchData heartbeatMatchData = extraPrivileges.heartbeatMatch;
            int iM17230l = heartbeatMatchData != null ? CodedOutputByteBufferNano.m17230l(1, heartbeatMatchData, HeartbeatMatchData.PROTOBUF_ADAPTER) : 0;
            extraPrivileges.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ExtraPrivileges parse(nb5 nb5Var) throws IOException {
            ExtraPrivileges extraPrivileges = new ExtraPrivileges();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (extraPrivileges.heartbeatMatch != null) {
                        break;
                    }
                    extraPrivileges.heartbeatMatch = HeartbeatMatchData.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (extraPrivileges.heartbeatMatch != null) {
                        break;
                    }
                    extraPrivileges.heartbeatMatch = HeartbeatMatchData.new_();
                    return extraPrivileges;
                }
                extraPrivileges.heartbeatMatch = (HeartbeatMatchData) nb5Var.m158743l(HeartbeatMatchData.PROTOBUF_ADAPTER);
            }
            return extraPrivileges;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ExtraPrivileges extraPrivileges, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            HeartbeatMatchData heartbeatMatchData = extraPrivileges.heartbeatMatch;
            if (heartbeatMatchData != null) {
                codedOutputByteBufferNano.m17254K(1, heartbeatMatchData, HeartbeatMatchData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ExtraPrivileges> JSON_ADAPTER = new ObjectJsonAdapter<ExtraPrivileges>() { // from class: com.p1.mobile.putong.core.data.ExtraPrivileges.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ExtraPrivileges.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ExtraPrivileges newInstance() {
            return new ExtraPrivileges();
        }

        public boolean parseField(ExtraPrivileges extraPrivileges, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("heartbeatMatch")) {
                return false;
            }
            extraPrivileges.heartbeatMatch = HeartbeatMatchData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ExtraPrivileges extraPrivileges, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("heartbeatMatch")) {
                return true;
            }
            return super.parseFieldCheck(extraPrivileges, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ExtraPrivileges extraPrivileges, JsonGenerator jsonGenerator) throws IOException {
            if (extraPrivileges.heartbeatMatch != null) {
                jsonGenerator.writeFieldName("heartbeatMatch");
                HeartbeatMatchData.JSON_ADAPTER.serialize(extraPrivileges.heartbeatMatch, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExtraPrivileges) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExtraPrivileges) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExtraPrivileges new_() {
        ExtraPrivileges extraPrivileges = new ExtraPrivileges();
        extraPrivileges.nullCheck();
        return extraPrivileges;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ExtraPrivileges mo223809clone() {
        ExtraPrivileges extraPrivileges = new ExtraPrivileges();
        HeartbeatMatchData heartbeatMatchData = this.heartbeatMatch;
        if (heartbeatMatchData != null) {
            extraPrivileges.heartbeatMatch = heartbeatMatchData.mo223809clone();
        }
        return extraPrivileges;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExtraPrivileges) {
            return ValueObject.util_equals(this.heartbeatMatch, ((ExtraPrivileges) obj).heartbeatMatch);
        }
        return false;
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
        HeartbeatMatchData heartbeatMatchData = this.heartbeatMatch;
        int iHashCode = i2 + (heartbeatMatchData != null ? heartbeatMatchData.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.heartbeatMatch == null) {
            this.heartbeatMatch = HeartbeatMatchData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
