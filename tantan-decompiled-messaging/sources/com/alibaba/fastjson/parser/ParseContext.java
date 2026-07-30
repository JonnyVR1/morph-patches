package com.alibaba.fastjson.parser;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class ParseContext {
    public final Object fieldName;
    public final int level;
    public Object object;
    public final ParseContext parent;
    private transient String path;
    public Type type;

    public ParseContext(ParseContext parseContext, Object obj, Object obj2) {
        this.parent = parseContext;
        this.object = obj;
        this.fieldName = obj2;
        this.level = parseContext == null ? 0 : parseContext.level + 1;
    }

    public String toString() {
        if (this.path == null) {
            if (this.parent == null) {
                this.path = "$";
            } else {
                boolean z = this.fieldName instanceof Integer;
                ParseContext parseContext = this.parent;
                if (z) {
                    this.path = parseContext.toString() + "[" + this.fieldName + Constants.AES_SUFFIX;
                } else {
                    this.path = parseContext.toString() + "." + this.fieldName;
                }
            }
        }
        return this.path;
    }
}
