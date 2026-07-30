package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class MusicCategory extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "musiccategory";

    @NonNull
    @ProtobufIndex(index = 54)
    public String category;

    @NonNull
    @ProtobufIndex(index = 53)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 51)
    public String f40084id;

    @NonNull
    @ProtobufIndex(index = 52)
    public String name;

    @NonNull
    @ProtobufIndex(index = 55)
    public String type;
    public static ProtobufAdapter<MusicCategory> PROTOBUF_ADAPTER = new MessageNanoAdapter<MusicCategory>() { // from class: com.p1.mobile.putong.feed.data.MusicCategory.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MusicCategory musicCategory) {
            String str = musicCategory.f40084id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(51, str) : 0;
            String str2 = musicCategory.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(52, str2);
            }
            String str3 = musicCategory.icon;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(53, str3);
            }
            String str4 = musicCategory.category;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(54, str4);
            }
            String str5 = musicCategory.type;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(55, str5);
            }
            musicCategory.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MusicCategory parse(nc5 nc5Var) throws IOException {
            MusicCategory musicCategory = new MusicCategory();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (musicCategory.f40084id == null) {
                        musicCategory.f40084id = "";
                    }
                    if (musicCategory.name == null) {
                        musicCategory.name = "";
                    }
                    if (musicCategory.icon == null) {
                        musicCategory.icon = "";
                    }
                    if (musicCategory.category == null) {
                        musicCategory.category = "";
                    }
                    if (musicCategory.type != null) {
                        break;
                    }
                    musicCategory.type = "";
                    break;
                }
                if (iM162497u == 410) {
                    musicCategory.f40084id = nc5Var.m162495s();
                } else if (iM162497u == 418) {
                    musicCategory.name = nc5Var.m162495s();
                } else if (iM162497u == 426) {
                    musicCategory.icon = nc5Var.m162495s();
                } else if (iM162497u == 434) {
                    musicCategory.category = nc5Var.m162495s();
                } else {
                    if (iM162497u != 442) {
                        if (musicCategory.f40084id == null) {
                            musicCategory.f40084id = "";
                        }
                        if (musicCategory.name == null) {
                            musicCategory.name = "";
                        }
                        if (musicCategory.icon == null) {
                            musicCategory.icon = "";
                        }
                        if (musicCategory.category == null) {
                            musicCategory.category = "";
                        }
                        if (musicCategory.type != null) {
                            break;
                        }
                        musicCategory.type = "";
                        return musicCategory;
                    }
                    musicCategory.type = nc5Var.m162495s();
                }
            }
            return musicCategory;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MusicCategory musicCategory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = musicCategory.f40084id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(51, str);
            }
            String str2 = musicCategory.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(52, str2);
            }
            String str3 = musicCategory.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(53, str3);
            }
            String str4 = musicCategory.category;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(54, str4);
            }
            String str5 = musicCategory.type;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(55, str5);
            }
        }
    };
    public static JsonAdapter<MusicCategory> JSON_ADAPTER = new ObjectJsonAdapter<MusicCategory>() { // from class: com.p1.mobile.putong.feed.data.MusicCategory.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MusicCategory.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MusicCategory newInstance() {
            return new MusicCategory();
        }

        public boolean parseField(MusicCategory musicCategory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    musicCategory.f40084id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    musicCategory.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    musicCategory.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    musicCategory.type = jsonParser.getValueAsString();
                    return true;
                case "category":
                    musicCategory.category = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MusicCategory musicCategory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "icon":
                case "name":
                case "type":
                case "category":
                    return true;
                default:
                    return super.parseFieldCheck(musicCategory, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MusicCategory musicCategory, JsonGenerator jsonGenerator) throws IOException {
            String str = musicCategory.f40084id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = musicCategory.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = musicCategory.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = musicCategory.category;
            if (str4 != null) {
                jsonGenerator.writeStringField("category", str4);
            }
            String str5 = musicCategory.type;
            if (str5 != null) {
                jsonGenerator.writeStringField("type", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MusicCategory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MusicCategory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MusicCategory new_() {
        MusicCategory musicCategory = new MusicCategory();
        musicCategory.nullCheck();
        return musicCategory;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MusicCategory mo225055clone() {
        MusicCategory musicCategory = new MusicCategory();
        musicCategory.f40084id = this.f40084id;
        musicCategory.name = this.name;
        musicCategory.icon = this.icon;
        musicCategory.category = this.category;
        musicCategory.type = this.type;
        return musicCategory;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicCategory)) {
            return false;
        }
        MusicCategory musicCategory = (MusicCategory) obj;
        return ValueObject.util_equals(this.f40084id, musicCategory.f40084id) && ValueObject.util_equals(this.name, musicCategory.name) && ValueObject.util_equals(this.icon, musicCategory.icon) && ValueObject.util_equals(this.category, musicCategory.category) && ValueObject.util_equals(this.type, musicCategory.type);
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
        String str = this.f40084id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.category;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.type;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40084id == null) {
            this.f40084id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public MusicCategory subtract(MusicCategory musicCategory) {
        MusicCategory musicCategory2 = new MusicCategory();
        if (!ValueObject.util_equals(this.f40084id, musicCategory.f40084id)) {
            musicCategory2.f40084id = this.f40084id;
        }
        if (!ValueObject.util_equals(this.name, musicCategory.name)) {
            musicCategory2.name = this.name;
        }
        if (!ValueObject.util_equals(this.icon, musicCategory.icon)) {
            musicCategory2.icon = this.icon;
        }
        if (!ValueObject.util_equals(this.category, musicCategory.category)) {
            musicCategory2.category = this.category;
        }
        if (!ValueObject.util_equals(this.type, musicCategory.type)) {
            musicCategory2.type = this.type;
        }
        if (musicCategory2.equals(new MusicCategory())) {
            return null;
        }
        return musicCategory2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
