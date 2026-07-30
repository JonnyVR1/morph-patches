package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ObjectCodec extends TreeCodec implements Versioned {
    @Override // com.fasterxml.jackson.core.TreeCodec
    public abstract TreeNode createArrayNode();

    @Override // com.fasterxml.jackson.core.TreeCodec
    public abstract TreeNode createObjectNode();

    public JsonFactory getFactory() {
        return getJsonFactory();
    }

    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    @Override // com.fasterxml.jackson.core.TreeCodec
    public abstract <T extends TreeNode> T readTree(JsonParser jsonParser) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, ResolvedType resolvedType) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, TypeReference<?> typeReference) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, ResolvedType resolvedType) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, TypeReference<?> typeReference) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException;

    @Override // com.fasterxml.jackson.core.TreeCodec
    public abstract JsonParser treeAsTokens(TreeNode treeNode);

    public abstract <T> T treeToValue(TreeNode treeNode, Class<T> cls) throws JsonProcessingException;

    @Override // com.fasterxml.jackson.core.Versioned
    public Version version() {
        return Version.unknownVersion();
    }

    @Override // com.fasterxml.jackson.core.TreeCodec
    public abstract void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode) throws IOException;

    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException;
}
