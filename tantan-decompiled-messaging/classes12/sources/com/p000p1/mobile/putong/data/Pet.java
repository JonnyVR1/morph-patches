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
public class Pet extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pet";

    @ProtobufIndex(index = 1)
    public boolean hasPet;

    @NonNull
    @ProtobufIndex(index = 2)
    public String petType;
    public static ProtobufAdapter<Pet> PROTOBUF_ADAPTER = new MessageNanoAdapter<Pet>() { // from class: com.p1.mobile.putong.data.Pet.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Pet pet) {
            int iB = CodedOutputByteBufferNano.b(1, pet.hasPet);
            String str = pet.petType;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) pet).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Pet m18789parse(nb5 nb5Var) throws IOException {
            Pet pet = new Pet();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (pet.petType != null) {
                        break;
                    }
                    pet.petType = "";
                    break;
                }
                if (iU == 8) {
                    pet.hasPet = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (pet.petType != null) {
                            break;
                        }
                        pet.petType = "";
                        return pet;
                    }
                    pet.petType = nb5Var.s();
                }
            }
            return pet;
        }

        public void serialize(Pet pet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, pet.hasPet);
            String str = pet.petType;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<Pet> JSON_ADAPTER = new ObjectJsonAdapter<Pet>() { // from class: com.p1.mobile.putong.data.Pet.2
        public Class getDataClass() {
            return Pet.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Pet mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Pet pet, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("hasPet", pet.hasPet);
            String str = pet.petType;
            if (str != null) {
                jsonGenerator.writeStringField("petType", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Pet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Pet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Pet new_() {
        Pet pet = new Pet();
        pet.nullCheck();
        return pet;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Pet m18788clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.hasPet ? 1231 : 1237)) * 41;
        String str = this.petType;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.petType == null) {
            this.petType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
