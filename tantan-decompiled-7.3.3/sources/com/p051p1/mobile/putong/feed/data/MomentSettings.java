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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentSettings momentSettings) {
            MomentVisibilityStatus momentVisibilityStatus = momentSettings.visibility;
            int iM17281h = (momentVisibilityStatus != null ? CodedOutputByteBufferNano.m17281h(1, momentVisibilityStatus.ordinal()) : 0) + CodedOutputByteBufferNano.m17275b(2, momentSettings.muted);
            MomentVisibleState momentVisibleState = momentSettings.userSetVisibility;
            if (momentVisibleState != null) {
                iM17281h += CodedOutputByteBufferNano.m17281h(3, momentVisibleState.ordinal());
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(4, momentSettings.anonymous);
            MomentVisibilityStatus momentVisibilityStatus2 = momentSettings.visibility;
            if (momentVisibilityStatus2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(5, momentVisibilityStatus2, MomentVisibilityStatus.PROTOBUF_ADAPTER);
            }
            MomentVisibleState momentVisibleState2 = momentSettings.userSetVisibility;
            if (momentVisibleState2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(6, momentVisibleState2, MomentVisibleState.PROTOBUF_ADAPTER);
            }
            momentSettings.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentSettings parse(nc5 nc5Var) throws IOException {
            MomentSettings momentSettings = new MomentSettings();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 8) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 16) {
                    momentSettings.muted = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 32) {
                    momentSettings.anonymous = nc5Var.m162483g();
                } else if (iM162497u == 42) {
                    momentSettings.visibility = (MomentVisibilityStatus) nc5Var.m162488l(MomentVisibilityStatus.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 50) {
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
                    momentSettings.userSetVisibility = (MomentVisibleState) nc5Var.m162488l(MomentVisibleState.PROTOBUF_ADAPTER);
                }
            }
            return momentSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentSettings momentSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MomentVisibilityStatus momentVisibilityStatus = momentSettings.visibility;
            if (momentVisibilityStatus != null) {
                codedOutputByteBufferNano.m17305G(1, momentVisibilityStatus.ordinal());
            }
            codedOutputByteBufferNano.m17299A(2, momentSettings.muted);
            MomentVisibleState momentVisibleState = momentSettings.userSetVisibility;
            if (momentVisibleState != null) {
                codedOutputByteBufferNano.m17305G(3, momentVisibleState.ordinal());
            }
            codedOutputByteBufferNano.m17299A(4, momentSettings.anonymous);
            MomentVisibilityStatus momentVisibilityStatus2 = momentSettings.visibility;
            if (momentVisibilityStatus2 != null) {
                codedOutputByteBufferNano.m17309K(5, momentVisibilityStatus2, MomentVisibilityStatus.PROTOBUF_ADAPTER);
            }
            MomentVisibleState momentVisibleState2 = momentSettings.userSetVisibility;
            if (momentVisibleState2 != null) {
                codedOutputByteBufferNano.m17309K(6, momentVisibleState2, MomentVisibleState.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentSettings> JSON_ADAPTER = new ObjectJsonAdapter<MomentSettings>() { // from class: com.p1.mobile.putong.feed.data.MomentSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentSettings newInstance() {
            return new MomentSettings();
        }

        public boolean parseField(MomentSettings momentSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anonymous":
                    momentSettings.anonymous = jsonParser.getValueAsBoolean();
                    return true;
                case "userSetVisibility":
                    momentSettings.userSetVisibility = MomentVisibleState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "muted":
                    momentSettings.muted = jsonParser.getValueAsBoolean();
                    return true;
                case "visibility":
                    momentSettings.visibility = MomentVisibilityStatus.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentSettings new_() {
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.nullCheck();
        return momentSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentSettings mo225055clone() {
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
        MomentVisibilityStatus momentVisibilityStatus = this.visibility;
        int iHashCode = (((i2 + (momentVisibilityStatus != null ? momentVisibilityStatus.hashCode() : 0)) * 41) + (this.muted ? 1231 : 1237)) * 41;
        MomentVisibleState momentVisibleState = this.userSetVisibility;
        int iHashCode2 = ((iHashCode + (momentVisibleState != null ? momentVisibleState.hashCode() : 0)) * 41) + (this.anonymous ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.visibility == null) {
            this.visibility = (MomentVisibilityStatus) MomentVisibilityStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.userSetVisibility == null) {
            this.userSetVisibility = (MomentVisibleState) MomentVisibleState.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
