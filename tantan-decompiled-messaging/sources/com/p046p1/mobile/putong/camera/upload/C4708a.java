package com.p046p1.mobile.putong.camera.upload;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.p046p1.mobile.putong.camera.upload.C4708a.a;
import p149l.uqd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.a */
/* JADX INFO: loaded from: classes9.dex */
public final class C4708a<T extends a<? extends T>> {

    /* JADX INFO: renamed from: a */
    public final Gson f17249a;

    /* JADX INFO: renamed from: b */
    public final Class<T> f17250b;

    /* JADX INFO: renamed from: c */
    public final uqd0 f17251c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final T f17252d;

    /* JADX INFO: renamed from: e */
    public T f17253e;

    /* JADX INFO: renamed from: f */
    public String f17254f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.a$a */
    public interface a<T> {
        void nullCheck();

        T trimAndCopy();
    }

    public C4708a(Class<T> cls, String str, @NonNull T t, boolean z, String str2) {
        Gson gson = new Gson();
        this.f17249a = gson;
        this.f17251c = new uqd0(str, gson.toJson(t), z, str2);
        this.f17252d = t;
        this.f17254f = str;
        this.f17250b = cls;
    }

    /* JADX INFO: renamed from: a */
    public final T m29824a() {
        T t = this.f17253e;
        if (t != null) {
            return t;
        }
        String str = this.f17251c.get();
        if (TextUtils.isEmpty(str)) {
            this.f17252d.nullCheck();
            return this.f17252d;
        }
        T t2 = (T) this.f17249a.fromJson(str, (Class) this.f17250b);
        t2.nullCheck();
        this.f17253e = t2;
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
    public final void m29825b(T t) {
        T t2 = (T) t.trimAndCopy();
        String json = this.f17249a.toJson(t2);
        this.f17253e = t2;
        this.f17251c.put(json);
    }
}
