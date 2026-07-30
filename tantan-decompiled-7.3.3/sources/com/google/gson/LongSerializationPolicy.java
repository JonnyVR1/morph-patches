package com.google.gson;

/* JADX INFO: loaded from: classes7.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l2) {
            return l2 == null ? JsonNull.INSTANCE : new JsonPrimitive(l2);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l2) {
            return l2 == null ? JsonNull.INSTANCE : new JsonPrimitive(l2.toString());
        }
    };

    public abstract JsonElement serialize(Long l2);
}
