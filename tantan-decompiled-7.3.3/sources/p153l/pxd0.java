package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import p153l.pxd0.InterfaceC19463a;

/* JADX INFO: loaded from: classes5.dex */
public final class pxd0<T extends InterfaceC19463a<? extends T>> {

    /* JADX INFO: renamed from: a */
    public final Gson f154559a;

    /* JADX INFO: renamed from: b */
    public final Class<T> f154560b;

    /* JADX INFO: renamed from: c */
    public final wyd0 f154561c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final T f154562d;

    /* JADX INFO: renamed from: e */
    public T f154563e;

    /* JADX INFO: renamed from: f */
    public String f154564f;

    /* JADX INFO: renamed from: l.pxd0$a */
    public interface InterfaceC19463a<T> {
        void nullCheck();

        T trimAndCopy();
    }

    public pxd0(Class<T> cls, String str, @NonNull T t, boolean z, String str2) {
        Gson gson = new Gson();
        this.f154559a = gson;
        this.f154561c = new wyd0(str, gson.toJson(t), z, str2);
        this.f154562d = t;
        this.f154564f = str;
        this.f154560b = cls;
    }

    /* JADX INFO: renamed from: a */
    public final T m174216a() {
        T t = this.f154563e;
        if (t != null) {
            return t;
        }
        String str = this.f154561c.get();
        if (TextUtils.isEmpty(str)) {
            this.f154562d.nullCheck();
            return this.f154562d;
        }
        T t2 = (T) this.f154559a.fromJson(str, (Class) this.f154560b);
        t2.nullCheck();
        this.f154563e = t2;
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
    public final void m174217b(T t) {
        T t2 = (T) t.trimAndCopy();
        String json = this.f154559a.toJson(t2);
        this.f154563e = t2;
        this.f154561c.put(json);
    }
}
