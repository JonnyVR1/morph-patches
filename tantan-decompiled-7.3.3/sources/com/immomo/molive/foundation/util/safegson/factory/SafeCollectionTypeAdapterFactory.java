package com.immomo.molive.foundation.util.safegson.factory;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorTypeAdapterFactory;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public class SafeCollectionTypeAdapterFactory extends SafeErrorTypeAdapterFactory {

    /* JADX INFO: renamed from: b */
    private final ConstructorConstructor f13830b;

    public SafeCollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.f13830b = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (C3964a.m19594a(rawType) || (typeToken.getType() instanceof GenericArrayType) || (((typeToken.getType() instanceof Class) && ((Class) typeToken.getType()).isArray()) || !Collection.class.isAssignableFrom(rawType))) {
            return null;
        }
        Type collectionElementType = C$Gson$Types.getCollectionElementType(type, rawType);
        SafeCollectionTypeAdapter safeCollectionTypeAdapter = new SafeCollectionTypeAdapter(gson, collectionElementType, gson.getAdapter(TypeToken.get(collectionElementType)), this.f13830b.get(typeToken));
        safeCollectionTypeAdapter.mo19602a(m19604c());
        return safeCollectionTypeAdapter;
    }
}
