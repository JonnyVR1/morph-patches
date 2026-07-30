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
public class MomentSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentsettings";

    @ProtobufIndex(index = 4)
    public boolean anonymous;

    @ProtobufIndex(index = 2)
    public boolean muted;

    @NonNull
    @ProtobufIndex(index = 3)
    public MomentVisibleState userSetVisibility;

    @NonNull
    @ProtobufIndex(index = 1)
    public MomentVisibilityStatus visibility;
    public static ProtobufAdapter<MomentSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentSettings>() { // from class: com.p1.mobile.putong.feed.data.MomentSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentSettings momentSettings) {
            MomentVisibilityStatus momentVisibilityStatus = momentSettings.visibility;
            int iH = (momentVisibilityStatus != null ? CodedOutputByteBufferNano.h(1, momentVisibilityStatus.ordinal()) : 0) + CodedOutputByteBufferNano.b(2, momentSettings.muted);
            MomentVisibleState momentVisibleState = momentSettings.userSetVisibility;
            if (momentVisibleState != null) {
                iH += CodedOutputByteBufferNano.h(3, momentVisibleState.ordinal());
            }
            int iB = iH + CodedOutputByteBufferNano.b(4, momentSettings.anonymous);
            MomentVisibilityStatus momentVisibilityStatus2 = momentSettings.visibility;
            if (momentVisibilityStatus2 != null) {
                iB += CodedOutputByteBufferNano.l(5, momentVisibilityStatus2, MomentVisibilityStatus.PROTOBUF_ADAPTER);
            }
            MomentVisibleState momentVisibleState2 = momentSettings.userSetVisibility;
            if (momentVisibleState2 != null) {
                iB += CodedOutputByteBufferNano.l(6, momentVisibleState2, MomentVisibleState.PROTOBUF_ADAPTER);
            }
            ((MessageNano) momentSettings).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentSettings m19645parse(nb5 nb5Var) throws IOException {
            MomentSettings momentSettings = new MomentSettings();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentSettings.visibility == null && numValueOf != null) {
                        momentSettings.visibility = (MomentVisibilityStatus) MomentVisibilityStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (momentSettings.userSetVisibility == null && numValueOf2 != null) {
                        momentSettings.userSetVisibility = (MomentVisibleState) MomentVisibleState.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                    }
                    if (momentSettings.visibility == null) {
                        momentSettings.visibility = (MomentVisibilityStatus) MomentVisibilityStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (momentSettings.userSetVisibility != null) {
                        break;
                    }
                    momentSettings.userSetVisibility = (MomentVisibleState) MomentVisibleState.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 16) {
                    momentSettings.muted = nb5Var.g();
                } else if (iU == 24) {
                    numValueOf2 = Integer.valueOf(nb5Var.j());
                } else if (iU == 32) {
                    momentSettings.anonymous = nb5Var.g();
                } else if (iU == 42) {
                    momentSettings.visibility = (MomentVisibilityStatus) nb5Var.l(MomentVisibilityStatus.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
                        if (momentSettings.visibility == null && numValueOf != null) {
                            momentSettings.visibility = (MomentVisibilityStatus) MomentVisibilityStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (momentSettings.userSetVisibility == null && numValueOf2 != null) {
                            momentSettings.userSetVisibility = (MomentVisibleState) MomentVisibleState.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (momentSettings.visibility == null) {
                            momentSettings.visibility = (MomentVisibilityStatus) MomentVisibilityStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (momentSettings.userSetVisibility != null) {
                            break;
                        }
                        momentSettings.userSetVisibility = (MomentVisibleState) MomentVisibleState.JSON_ADAPTER.defaultEnum();
                        return momentSettings;
                    }
                    momentSettings.userSetVisibility = (MomentVisibleState) nb5Var.l(MomentVisibleState.PROTOBUF_ADAPTER);
                }
            }
            return momentSettings;
        }

        public void serialize(MomentSettings momentSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MomentVisibilityStatus momentVisibilityStatus = momentSettings.visibility;
            if (momentVisibilityStatus != null) {
                codedOutputByteBufferNano.G(1, momentVisibilityStatus.ordinal());
            }
            codedOutputByteBufferNano.A(2, momentSettings.muted);
            MomentVisibleState momentVisibleState = momentSettings.userSetVisibility;
            if (momentVisibleState != null) {
                codedOutputByteBufferNano.G(3, momentVisibleState.ordinal());
            }
            codedOutputByteBufferNano.A(4, momentSettings.anonymous);
            MomentVisibilityStatus momentVisibilityStatus2 = momentSettings.visibility;
            if (momentVisibilityStatus2 != null) {
                codedOutputByteBufferNano.K(5, momentVisibilityStatus2, MomentVisibilityStatus.PROTOBUF_ADAPTER);
            }
            MomentVisibleState momentVisibleState2 = momentSettings.userSetVisibility;
            if (momentVisibleState2 != null) {
                codedOutputByteBufferNano.K(6, momentVisibleState2, MomentVisibleState.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentSettings> JSON_ADAPTER = new ObjectJsonAdapter<MomentSettings>() { // from class: com.p1.mobile.putong.feed.data.MomentSettings.2
        public Class getDataClass() {
            return MomentSettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentSettings mo17830newInstance() {
            return new MomentSettings();
        }

        public boolean parseField(MomentSettings momentSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anonymous":
                    momentSettings.anonymous = jsonParser.getValueAsBoolean();
                    return true;
                case "userSetVisibility":
                    momentSettings.userSetVisibility = (MomentVisibleState) MomentVisibleState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "muted":
                    momentSettings.muted = jsonParser.getValueAsBoolean();
                    return true;
                case "visibility":
                    momentSettings.visibility = (MomentVisibilityStatus) MomentVisibilityStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentSettings momentSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "anonymous":
                case "userSetVisibility":
                case "muted":
                case "visibility":
                    return true;
                default:
                    return super.parseFieldCheck(momentSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentSettings momentSettings, JsonGenerator jsonGenerator) throws IOException {
            if (momentSettings.visibility != null) {
                jsonGenerator.writeFieldName("visibility");
                MomentVisibilityStatus.JSON_ADAPTER.serialize(momentSettings.visibility, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("muted", momentSettings.muted);
            if (momentSettings.userSetVisibility != null) {
                jsonGenerator.writeFieldName("userSetVisibility");
                MomentVisibleState.JSON_ADAPTER.serialize(momentSettings.userSetVisibility, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("anonymous", momentSettings.anonymous);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentSettings new_() {
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.nullCheck();
        return momentSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentSettings m19644clone() {
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.visibility = this.visibility;
        momentSettings.muted = this.muted;
        momentSettings.userSetVisibility = this.userSetVisibility;
        momentSettings.anonymous = this.anonymous;
        return momentSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentSettings)) {
            return false;
        }
        MomentSettings momentSettings = (MomentSettings) obj;
        return ValueObject.util_equals(this.visibility, momentSettings.visibility) && this.muted == momentSettings.muted && ValueObject.util_equals(this.userSetVisibility, momentSettings.userSetVisibility) && this.anonymous == momentSettings.anonymous;
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
        MomentVisibilityStatus momentVisibilityStatus = this.visibility;
        int iHashCode = (((i2 + (momentVisibilityStatus != null ? momentVisibilityStatus.hashCode() : 0)) * 41) + (this.muted ? 1231 : 1237)) * 41;
        MomentVisibleState momentVisibleState = this.userSetVisibility;
        int iHashCode2 = ((iHashCode + (momentVisibleState != null ? momentVisibleState.hashCode() : 0)) * 41) + (this.anonymous ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.visibility == null) {
            this.visibility = (MomentVisibilityStatus) MomentVisibilityStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.userSetVisibility == null) {
            this.userSetVisibility = (MomentVisibleState) MomentVisibleState.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
