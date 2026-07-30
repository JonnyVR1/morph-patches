package com.fasterxml.jackson.core;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public interface TreeNode {
    JsonToken asToken();

    /* JADX INFO: renamed from: at */
    TreeNode m9307at(JsonPointer jsonPointer);

    /* JADX INFO: renamed from: at */
    TreeNode m9308at(String str) throws IllegalArgumentException;

    Iterator<String> fieldNames();

    TreeNode get(int i);

    TreeNode get(String str);

    boolean isArray();

    boolean isContainerNode();

    boolean isMissingNode();

    boolean isObject();

    boolean isValueNode();

    JsonParser.NumberType numberType();

    TreeNode path(int i);

    TreeNode path(String str);

    int size();

    JsonParser traverse();

    JsonParser traverse(ObjectCodec objectCodec);
}
