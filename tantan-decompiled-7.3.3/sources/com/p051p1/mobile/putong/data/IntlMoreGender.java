package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.IntlMoreGender;
import com.p051p1.mobile.putong.data.LookingFor;
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
import java.util.HashSet;
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class IntlMoreGender extends ValueObject<IntlMoreGender> implements Cloneable, Serializable {
    public static final String TYPE = "intlmoregender";

    @NonNull
    @ProtobufIndex(index = 6)
    public Boolean canUpdate;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<LookingFor> lookingForGenders;

    @Nullable
    @ProtobufIndex(index = 1)
    public IntlGender newGender;

    @NonNull
    @ProtobufIndex(index = 4)
    public Boolean notShowCis;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public Boolean showOnProfile;

    @Nullable
    @ProtobufIndex(index = 2)
    public String subGender;
    public static ProtobufAdapter<IntlMoreGender> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMoreGender>() { // from class: com.p1.mobile.putong.data.IntlMoreGender.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMoreGender intlMoreGender) {
            IntlGender intlGender = intlMoreGender.newGender;
            int iM17285l = intlGender != null ? CodedOutputByteBufferNano.m17285l(1, intlGender, IntlGender.PROTOBUF_ADAPTER) : 0;
            String str = intlMoreGender.subGender;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            List<LookingFor> list = intlMoreGender.lookingForGenders;
            if (list != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list, LookingFor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Boolean bool = intlMoreGender.notShowCis;
            if (bool != null) {
                iM17285l += CodedOutputByteBufferNano.m17275b(4, bool.booleanValue());
            }
            Boolean bool2 = intlMoreGender.showOnProfile;
            if (bool2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17275b(5, bool2.booleanValue());
            }
            Boolean bool3 = intlMoreGender.canUpdate;
            if (bool3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17275b(6, bool3.booleanValue());
            }
            intlMoreGender.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMoreGender parse(nc5 nc5Var) throws IOException {
            IntlMoreGender intlMoreGender = new IntlMoreGender();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlMoreGender.lookingForGenders == null) {
                        intlMoreGender.lookingForGenders = new ArrayList();
                    }
                    if (intlMoreGender.notShowCis == null) {
                        intlMoreGender.notShowCis = Boolean.FALSE;
                    }
                    if (intlMoreGender.showOnProfile == null) {
                        intlMoreGender.showOnProfile = Boolean.FALSE;
                    }
                    if (intlMoreGender.canUpdate != null) {
                        break;
                    }
                    intlMoreGender.canUpdate = Boolean.FALSE;
                    break;
                }
                if (iM162497u == 10) {
                    intlMoreGender.newGender = (IntlGender) nc5Var.m162488l(IntlGender.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    intlMoreGender.subGender = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    intlMoreGender.lookingForGenders = (List) nc5Var.m162488l(LookingFor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 32) {
                    intlMoreGender.notShowCis = Boolean.valueOf(nc5Var.m162483g());
                } else if (iM162497u == 40) {
                    intlMoreGender.showOnProfile = Boolean.valueOf(nc5Var.m162483g());
                } else {
                    if (iM162497u != 48) {
                        if (intlMoreGender.lookingForGenders == null) {
                            intlMoreGender.lookingForGenders = new ArrayList();
                        }
                        if (intlMoreGender.notShowCis == null) {
                            intlMoreGender.notShowCis = Boolean.FALSE;
                        }
                        if (intlMoreGender.showOnProfile == null) {
                            intlMoreGender.showOnProfile = Boolean.FALSE;
                        }
                        if (intlMoreGender.canUpdate != null) {
                            break;
                        }
                        intlMoreGender.canUpdate = Boolean.FALSE;
                        return intlMoreGender;
                    }
                    intlMoreGender.canUpdate = Boolean.valueOf(nc5Var.m162483g());
                }
            }
            return intlMoreGender;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMoreGender intlMoreGender, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            IntlGender intlGender = intlMoreGender.newGender;
            if (intlGender != null) {
                codedOutputByteBufferNano.m17309K(1, intlGender, IntlGender.PROTOBUF_ADAPTER);
            }
            String str = intlMoreGender.subGender;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            List<LookingFor> list = intlMoreGender.lookingForGenders;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, LookingFor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Boolean bool = intlMoreGender.notShowCis;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(4, bool.booleanValue());
            }
            Boolean bool2 = intlMoreGender.showOnProfile;
            if (bool2 != null) {
                codedOutputByteBufferNano.m17299A(5, bool2.booleanValue());
            }
            Boolean bool3 = intlMoreGender.canUpdate;
            if (bool3 != null) {
                codedOutputByteBufferNano.m17299A(6, bool3.booleanValue());
            }
        }
    };
    public static JsonAdapter<IntlMoreGender> JSON_ADAPTER = new ObjectJsonAdapter<IntlMoreGender>() { // from class: com.p1.mobile.putong.data.IntlMoreGender.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMoreGender.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMoreGender newInstance() {
            return new IntlMoreGender();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(IntlMoreGender intlMoreGender, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -953233279:
                    if (str.equals("newGender")) {
                        b = 0;
                    }
                    break;
                case -743117535:
                    if (str.equals("subGender")) {
                        b = 1;
                    }
                    break;
                case -196222452:
                    if (str.equals("lookingForGenders")) {
                        b = 2;
                    }
                    break;
                case 85690553:
                    if (str.equals("canUpdate")) {
                        b = 3;
                    }
                    break;
                case 385539149:
                    if (str.equals("showOnProfile")) {
                        b = 4;
                    }
                    break;
                case 833854013:
                    if (str.equals("notShowCis")) {
                        b = 5;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    intlMoreGender.newGender = IntlGender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 1:
                    intlMoreGender.subGender = jsonParser.getValueAsString();
                    return true;
                case 2:
                    intlMoreGender.lookingForGenders = JsonAdapter.parseArray(jsonParser, LookingFor.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    intlMoreGender.canUpdate = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 4:
                    intlMoreGender.showOnProfile = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 5:
                    intlMoreGender.notShowCis = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMoreGender intlMoreGender, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "newGender":
                case "subGender":
                case "lookingForGenders":
                case "canUpdate":
                case "showOnProfile":
                case "notShowCis":
                    return true;
                default:
                    return super.parseFieldCheck(intlMoreGender, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMoreGender intlMoreGender, JsonGenerator jsonGenerator) throws IOException {
            if (intlMoreGender.newGender != null) {
                jsonGenerator.writeFieldName("newGender");
                IntlGender.JSON_ADAPTER.serialize(intlMoreGender.newGender, jsonGenerator, true);
            }
            String str = intlMoreGender.subGender;
            if (str != null) {
                jsonGenerator.writeStringField("subGender", str);
            }
            if (intlMoreGender.lookingForGenders != null) {
                jsonGenerator.writeFieldName("lookingForGenders");
                JsonAdapter.serializeArray(intlMoreGender.lookingForGenders, jsonGenerator, LookingFor.JSON_ADAPTER);
            }
            Boolean bool = intlMoreGender.notShowCis;
            if (bool != null) {
                jsonGenerator.writeBooleanField("notShowCis", bool.booleanValue());
            }
            Boolean bool2 = intlMoreGender.showOnProfile;
            if (bool2 != null) {
                jsonGenerator.writeBooleanField("showOnProfile", bool2.booleanValue());
            }
            Boolean bool3 = intlMoreGender.canUpdate;
            if (bool3 != null) {
                jsonGenerator.writeBooleanField("canUpdate", bool3.booleanValue());
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMoreGender) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMoreGender) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ LookingFor m60993a(LookingFor lookingFor) {
        return lookingFor;
    }

    public static IntlMoreGender new_() {
        IntlMoreGender intlMoreGender = new IntlMoreGender();
        intlMoreGender.nullCheck();
        return intlMoreGender;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMoreGender mo225055clone() {
        IntlMoreGender intlMoreGender = new IntlMoreGender();
        intlMoreGender.newGender = this.newGender;
        intlMoreGender.subGender = this.subGender;
        List<LookingFor> list = this.lookingForGenders;
        if (list != null) {
            intlMoreGender.lookingForGenders = ValueObject.util_map(list, new qcj() { // from class: l.smo
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlMoreGender.m60993a((LookingFor) obj);
                }
            });
        }
        intlMoreGender.notShowCis = this.notShowCis;
        intlMoreGender.showOnProfile = this.showOnProfile;
        intlMoreGender.canUpdate = this.canUpdate;
        return intlMoreGender;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMoreGender)) {
            return false;
        }
        IntlMoreGender intlMoreGender = (IntlMoreGender) obj;
        return ValueObject.util_equals(this.newGender, intlMoreGender.newGender) && ValueObject.util_equals(this.subGender, intlMoreGender.subGender) && ValueObject.util_equals(this.lookingForGenders, intlMoreGender.lookingForGenders) && ValueObject.util_equals(this.notShowCis, intlMoreGender.notShowCis) && ValueObject.util_equals(this.showOnProfile, intlMoreGender.showOnProfile) && ValueObject.util_equals(this.canUpdate, intlMoreGender.canUpdate);
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
        IntlGender intlGender = this.newGender;
        int iHashCode = (i2 + (intlGender != null ? intlGender.hashCode() : 0)) * 41;
        String str = this.subGender;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<LookingFor> list = this.lookingForGenders;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        Boolean bool = this.notShowCis;
        int iHashCode4 = (iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 41;
        Boolean bool2 = this.showOnProfile;
        int iHashCode5 = (iHashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 41;
        Boolean bool3 = this.canUpdate;
        int iHashCode6 = iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(IntlMoreGender intlMoreGender) {
        if (!shouldMergeData() || equals(intlMoreGender)) {
            return;
        }
        if (!isFieldParsed("newGender")) {
            this.newGender = intlMoreGender.newGender;
        }
        if (!isFieldParsed("subGender")) {
            this.subGender = intlMoreGender.subGender;
        }
        if (!isFieldParsed("lookingForGenders")) {
            this.lookingForGenders = intlMoreGender.lookingForGenders;
        }
        if (!isFieldParsed("notShowCis")) {
            this.notShowCis = intlMoreGender.notShowCis;
        }
        if (!isFieldParsed("showOnProfile")) {
            this.showOnProfile = intlMoreGender.showOnProfile;
        }
        if (!isFieldParsed("canUpdate")) {
            this.canUpdate = intlMoreGender.canUpdate;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.lookingForGenders == null) {
            this.lookingForGenders = new ArrayList();
        }
        if (this.notShowCis == null) {
            this.notShowCis = Boolean.FALSE;
        }
        if (this.showOnProfile == null) {
            this.showOnProfile = Boolean.FALSE;
        }
        if (this.canUpdate == null) {
            this.canUpdate = Boolean.FALSE;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public IntlMoreGender subtract(IntlMoreGender intlMoreGender) {
        IntlMoreGender intlMoreGender2 = new IntlMoreGender();
        if (!ValueObject.util_equals(this.newGender, intlMoreGender.newGender)) {
            intlMoreGender2.newGender = this.newGender;
        }
        if (!ValueObject.util_equals(this.subGender, intlMoreGender.subGender)) {
            intlMoreGender2.subGender = this.subGender;
        }
        if (!ValueObject.util_equals(this.lookingForGenders, intlMoreGender.lookingForGenders)) {
            intlMoreGender2.lookingForGenders = this.lookingForGenders;
        }
        if (!ValueObject.util_equals(this.notShowCis, intlMoreGender.notShowCis)) {
            intlMoreGender2.notShowCis = this.notShowCis;
        }
        if (!ValueObject.util_equals(this.showOnProfile, intlMoreGender.showOnProfile)) {
            intlMoreGender2.showOnProfile = this.showOnProfile;
        }
        if (!ValueObject.util_equals(this.canUpdate, intlMoreGender.canUpdate)) {
            intlMoreGender2.canUpdate = this.canUpdate;
        }
        if (intlMoreGender2.equals(new IntlMoreGender())) {
            return null;
        }
        return intlMoreGender2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
