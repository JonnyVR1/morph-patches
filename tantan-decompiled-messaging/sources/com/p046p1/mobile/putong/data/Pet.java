package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class Pet extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pet";

    @ProtobufIndex(index = 1)
    public boolean hasPet;

    @NonNull
    @ProtobufIndex(index = 2)
    public String petType;
    public static ProtobufAdapter<Pet> PROTOBUF_ADAPTER = new MessageNanoAdapter<Pet>() { // from class: com.p1.mobile.putong.data.Pet.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Pet pet) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, pet.hasPet);
            String str = pet.petType;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            pet.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Pet parse(nb5 nb5Var) throws IOException {
            Pet pet = new Pet();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (pet.petType != null) {
                        break;
                    }
                    pet.petType = "";
                    break;
                }
                if (iM158752u == 8) {
                    pet.hasPet = nb5Var.m158738g();
                } else {
                    if (iM158752u != 18) {
                        if (pet.petType != null) {
                            break;
                        }
                        pet.petType = "";
                        return pet;
                    }
                    pet.petType = nb5Var.m158750s();
                }
            }
            return pet;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Pet pet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, pet.hasPet);
            String str = pet.petType;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<Pet> JSON_ADAPTER = new ObjectJsonAdapter<Pet>() { // from class: com.p1.mobile.putong.data.Pet.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Pet.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Pet newInstance() {
            return new Pet();
        }

        public boolean parseField(Pet pet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("hasPet")) {
                pet.hasPet = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("petType")) {
                return false;
            }
            pet.petType = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Pet pet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("hasPet") || str.equals("petType")) {
                return true;
            }
            return super.parseFieldCheck(pet, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Pet pet, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("hasPet", pet.hasPet);
            String str = pet.petType;
            if (str != null) {
                jsonGenerator.writeStringField("petType", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Pet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Pet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Pet new_() {
        Pet pet = new Pet();
        pet.nullCheck();
        return pet;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Pet mo223809clone() {
        Pet pet = new Pet();
        pet.hasPet = this.hasPet;
        pet.petType = this.petType;
        return pet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Pet)) {
            return false;
        }
        Pet pet = (Pet) obj;
        return this.hasPet == pet.hasPet && ValueObject.util_equals(this.petType, pet.petType);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "pet";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.hasPet ? 1231 : 1237)) * 41;
        String str = this.petType;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.petType == null) {
            this.petType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
