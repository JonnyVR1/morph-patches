package com.p051p1.mobile.putong.camera.upload;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.p051p1.mobile.putong.camera.upload.C4859a.a;
import p153l.wyd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.a */
/* JADX INFO: loaded from: classes9.dex */
public final class C4859a<T extends a<? extends T>> {

    /* JADX INFO: renamed from: a */
    public final Gson f17968a;

    /* JADX INFO: renamed from: b */
    public final Class<T> f17969b;

    /* JADX INFO: renamed from: c */
    public final wyd0 f17970c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final T f17971d;

    /* JADX INFO: renamed from: e */
    public T f17972e;

    /* JADX INFO: renamed from: f */
    public String f17973f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.a$a */
    public interface a<T> {
        void nullCheck();

        T trimAndCopy();
    }

    public C4859a(Class<T> cls, String str, @NonNull T t, boolean z, String str2) {
        Gson gson = new Gson();
        this.f17968a = gson;
        this.f17970c = new wyd0(str, gson.toJson(t), z, str2);
        this.f17971d = t;
        this.f17973f = str;
        this.f17969b = cls;
    }

    /* JADX INFO: renamed from: a */
    public final T m30822a() {
        T t = this.f17972e;
        if (t != null) {
            return t;
        }
        String str = this.f17970c.get();
        if (TextUtils.isEmpty(str)) {
            this.f17971d.nullCheck();
            return this.f17971d;
        }
        T t2 = (T) this.f17968a.fromJson(str, (Class) this.f17969b);
        t2.nullCheck();
        this.f17972e = t2;
        return t2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final void m30823b(T t) {
        T t2 = (T) t.trimAndCopy();
        String json = this.f17968a.toJson(t2);
        this.f17972e = t2;
        this.f17970c.put(json);
    }
}
