package com.immomo.molive.foundation.util.safegson.factory;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p149l.shg0;
import p149l.udj0;

/* JADX INFO: loaded from: classes7.dex */
public final class SafeMapTypeAdapterFactory extends SafeErrorTypeAdapterFactory {

    /* JADX INFO: renamed from: b */
    private final ConstructorConstructor f13137b;

    /* JADX INFO: renamed from: c */
    final boolean f13138c;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* JADX INFO: renamed from: a */
        private final TypeAdapter<K> f13139a;

        /* JADX INFO: renamed from: b */
        private final TypeAdapter<V> f13140b;

        /* JADX INFO: renamed from: c */
        private final ObjectConstructor<? extends Map<K, V>> f13141c;

        /* JADX INFO: renamed from: d */
        private TypeToken<?> f13142d;

        /* JADX INFO: renamed from: e */
        private String f13143e;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.f13139a = new SafeTypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f13140b = new SafeTypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f13141c = objectConstructor;
        }

        private String keyToString(JsonElement jsonElement) {
            if (!jsonElement.isJsonPrimitive()) {
                if (jsonElement.isJsonNull()) {
                    return "null";
                }
                shg0.m184191a();
                return null;
            }
            JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber()) {
                return String.valueOf(asJsonPrimitive.getAsNumber());
            }
            if (asJsonPrimitive.isBoolean()) {
                return Boolean.toString(asJsonPrimitive.getAsBoolean());
            }
            if (asJsonPrimitive.isString()) {
                return asJsonPrimitive.getAsString();
            }
            shg0.m184191a();
            return null;
        }

        /* JADX INFO: renamed from: c */
        public void m18608c(TypeToken<?> typeToken, String str) {
            this.f13142d = typeToken;
            this.f13143e = str;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Map<K, V> read2(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> mapConstruct = this.f13141c.construct();
            if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K k = this.f13139a.read2(jsonReader);
                    if (mapConstruct.put(k, this.f13140b.read2(jsonReader)) != null) {
                        udj0.m193143a("duplicate key: ", k);
                        return null;
                    }
                    jsonReader.endArray();
                }
                jsonReader.endArray();
                return mapConstruct;
            }
            if (jsonTokenPeek != JsonToken.BEGIN_OBJECT) {
                jsonReader.skipValue();
                SafeMapTypeAdapterFactory.this.mo18623b(jsonReader, TypeToken.get(Object.class), this.f13143e, jsonTokenPeek);
                return null;
            }
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                K k2 = this.f13139a.read2(jsonReader);
                if (mapConstruct.put(k2, this.f13140b.read2(jsonReader)) != null) {
                    udj0.m193143a("duplicate key: ", k2);
                    return null;
                }
            }
            jsonReader.endObject();
            return mapConstruct;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!SafeMapTypeAdapterFactory.this.f13138c) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.f13140b.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                JsonElement jsonTree = this.f13139a.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z |= jsonTree.isJsonArray() || jsonTree.isJsonObject();
            }
            if (!z) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i < size) {
                    jsonWriter.name(keyToString((JsonElement) arrayList.get(i)));
                    this.f13140b.write(jsonWriter, (V) arrayList2.get(i));
                    i++;
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginArray();
            int size2 = arrayList.size();
            while (i < size2) {
                jsonWriter.beginArray();
                Streams.write((JsonElement) arrayList.get(i), jsonWriter);
                this.f13140b.write(jsonWriter, (V) arrayList2.get(i));
                jsonWriter.endArray();
                i++;
            }
            jsonWriter.endArray();
        }
    }

    public SafeMapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z) {
        this.f13137b = constructorConstructor;
        this.f13138c = z;
    }

    /* JADX INFO: renamed from: d */
    private TypeAdapter<?> m18607d(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.BOOLEAN_AS_STRING : gson.getAdapter(TypeToken.get(type));
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Type[] mapKeyAndValueTypes = C$Gson$Types.getMapKeyAndValueTypes(type, C$Gson$Types.getRawType(type));
        return new Adapter(gson, mapKeyAndValueTypes[0], m18607d(gson, mapKeyAndValueTypes[0]), mapKeyAndValueTypes[1], gson.getAdapter(TypeToken.get(mapKeyAndValueTypes[1])), this.f13137b.get(typeToken));
    }
}
