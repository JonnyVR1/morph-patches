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
public class PrivilegesChange extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privilegeschange";

    @NonNull
    @ProtobufIndex(index = 1)
    public SuperlikePrivilege superLike;
    public static ProtobufAdapter<PrivilegesChange> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivilegesChange>() { // from class: com.p1.mobile.putong.core.data.PrivilegesChange.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PrivilegesChange privilegesChange) {
            SuperlikePrivilege superlikePrivilege = privilegesChange.superLike;
            int iL = superlikePrivilege != null ? CodedOutputByteBufferNano.l(1, superlikePrivilege, SuperlikePrivilege.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) privilegesChange).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PrivilegesChange m14901parse(nb5 nb5Var) throws IOException {
            PrivilegesChange privilegesChange = new PrivilegesChange();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (privilegesChange.superLike != null) {
                        break;
                    }
                    privilegesChange.superLike = SuperlikePrivilege.new_();
                    break;
                }
                if (iU != 10) {
                    if (privilegesChange.superLike != null) {
                        break;
                    }
                    privilegesChange.superLike = SuperlikePrivilege.new_();
                    return privilegesChange;
                }
                privilegesChange.superLike = (SuperlikePrivilege) nb5Var.l(SuperlikePrivilege.PROTOBUF_ADAPTER);
            }
            return privilegesChange;
        }

        public void serialize(PrivilegesChange privilegesChange, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SuperlikePrivilege superlikePrivilege = privilegesChange.superLike;
            if (superlikePrivilege != null) {
                codedOutputByteBufferNano.K(1, superlikePrivilege, SuperlikePrivilege.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PrivilegesChange> JSON_ADAPTER = new ObjectJsonAdapter<PrivilegesChange>() { // from class: com.p1.mobile.putong.core.data.PrivilegesChange.2
        public Class getDataClass() {
            return PrivilegesChange.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PrivilegesChange m14902newInstance() {
            return new PrivilegesChange();
        }

        public boolean parseField(PrivilegesChange privilegesChange, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("superLike")) {
                return false;
            }
            privilegesChange.superLike = (SuperlikePrivilege) SuperlikePrivilege.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PrivilegesChange privilegesChange, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("superLike")) {
                return true;
            }
            return super.parseFieldCheck(privilegesChange, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(PrivilegesChange privilegesChange, JsonGenerator jsonGenerator) throws IOException {
            if (privilegesChange.superLike != null) {
                jsonGenerator.writeFieldName("superLike");
                SuperlikePrivilege.JSON_ADAPTER.serialize(privilegesChange.superLike, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivilegesChange) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivilegesChange) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivilegesChange new_() {
        PrivilegesChange privilegesChange = new PrivilegesChange();
        privilegesChange.nullCheck();
        return privilegesChange;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PrivilegesChange m14900clone() {
        PrivilegesChange privilegesChange = new PrivilegesChange();
        SuperlikePrivilege superlikePrivilege = this.superLike;
        if (superlikePrivilege != null) {
            privilegesChange.superLike = superlikePrivilege.m15829clone();
        }
        return privilegesChange;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PrivilegesChange) {
            return ValueObject.util_equals(this.superLike, ((PrivilegesChange) obj).superLike);
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
        SuperlikePrivilege superlikePrivilege = this.superLike;
        int iHashCode = i2 + (superlikePrivilege != null ? superlikePrivilege.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.superLike == null) {
            this.superLike = SuperlikePrivilege.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
