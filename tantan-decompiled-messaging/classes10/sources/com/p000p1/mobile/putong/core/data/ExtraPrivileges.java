package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ExtraPrivileges extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "extraprivileges";

    @NonNull
    @ProtobufIndex(index = 1)
    public HeartbeatMatchData heartbeatMatch;
    public static ProtobufAdapter<ExtraPrivileges> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExtraPrivileges>() { // from class: com.p1.mobile.putong.core.data.ExtraPrivileges.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ExtraPrivileges extraPrivileges) {
            HeartbeatMatchData heartbeatMatchData = extraPrivileges.heartbeatMatch;
            int iL = heartbeatMatchData != null ? CodedOutputByteBufferNano.l(1, heartbeatMatchData, HeartbeatMatchData.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) extraPrivileges).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ExtraPrivileges m12689parse(nb5 nb5Var) throws IOException {
            ExtraPrivileges extraPrivileges = new ExtraPrivileges();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (extraPrivileges.heartbeatMatch != null) {
                        break;
                    }
                    extraPrivileges.heartbeatMatch = HeartbeatMatchData.new_();
                    break;
                }
                if (iU != 10) {
                    if (extraPrivileges.heartbeatMatch != null) {
                        break;
                    }
                    extraPrivileges.heartbeatMatch = HeartbeatMatchData.new_();
                    return extraPrivileges;
                }
                extraPrivileges.heartbeatMatch = (HeartbeatMatchData) nb5Var.l(HeartbeatMatchData.PROTOBUF_ADAPTER);
            }
            return extraPrivileges;
        }

        public void serialize(ExtraPrivileges extraPrivileges, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            HeartbeatMatchData heartbeatMatchData = extraPrivileges.heartbeatMatch;
            if (heartbeatMatchData != null) {
                codedOutputByteBufferNano.K(1, heartbeatMatchData, HeartbeatMatchData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ExtraPrivileges> JSON_ADAPTER = new ObjectJsonAdapter<ExtraPrivileges>() { // from class: com.p1.mobile.putong.core.data.ExtraPrivileges.2
        public Class getDataClass() {
            return ExtraPrivileges.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ExtraPrivileges m12690newInstance() {
            return new ExtraPrivileges();
        }

        public boolean parseField(ExtraPrivileges extraPrivileges, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("heartbeatMatch")) {
                return false;
            }
            extraPrivileges.heartbeatMatch = (HeartbeatMatchData) HeartbeatMatchData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ExtraPrivileges extraPrivileges, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("heartbeatMatch")) {
                return true;
            }
            return super.parseFieldCheck(extraPrivileges, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ExtraPrivileges extraPrivileges, JsonGenerator jsonGenerator) throws IOException {
            if (extraPrivileges.heartbeatMatch != null) {
                jsonGenerator.writeFieldName("heartbeatMatch");
                HeartbeatMatchData.JSON_ADAPTER.serialize(extraPrivileges.heartbeatMatch, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExtraPrivileges) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExtraPrivileges) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExtraPrivileges new_() {
        ExtraPrivileges extraPrivileges = new ExtraPrivileges();
        extraPrivileges.nullCheck();
        return extraPrivileges;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ExtraPrivileges m12688clone() {
        ExtraPrivileges extraPrivileges = new ExtraPrivileges();
        HeartbeatMatchData heartbeatMatchData = this.heartbeatMatch;
        if (heartbeatMatchData != null) {
            extraPrivileges.heartbeatMatch = heartbeatMatchData.m13250clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        HeartbeatMatchData heartbeatMatchData = this.heartbeatMatch;
        int iHashCode = i2 + (heartbeatMatchData != null ? heartbeatMatchData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.heartbeatMatch == null) {
            this.heartbeatMatch = HeartbeatMatchData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
