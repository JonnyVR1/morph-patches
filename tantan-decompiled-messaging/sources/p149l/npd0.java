package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import p149l.npd0.InterfaceC18745a;

/* JADX INFO: loaded from: classes5.dex */
public final class npd0<T extends InterfaceC18745a<? extends T>> {

    /* JADX INFO: renamed from: a */
    public final Gson f139953a;

    /* JADX INFO: renamed from: b */
    public final Class<T> f139954b;

    /* JADX INFO: renamed from: c */
    public final uqd0 f139955c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final T f139956d;

    /* JADX INFO: renamed from: e */
    public T f139957e;

    /* JADX INFO: renamed from: f */
    public String f139958f;

    /* JADX INFO: renamed from: l.npd0$a */
    public interface InterfaceC18745a<T> {
        void nullCheck();

        T trimAndCopy();
    }

    public npd0(Class<T> cls, String str, @NonNull T t, boolean z, String str2) {
        Gson gson = new Gson();
        this.f139953a = gson;
        this.f139955c = new uqd0(str, gson.toJson(t), z, str2);
        this.f139956d = t;
        this.f139958f = str;
        this.f139954b = cls;
    }

    /* JADX INFO: renamed from: a */
    public final T m160473a() {
        T t = this.f139957e;
        if (t != null) {
            return t;
        }
        String str = this.f139955c.get();
        if (TextUtils.isEmpty(str)) {
            this.f139956d.nullCheck();
            return this.f139956d;
        }
        T t2 = (T) this.f139953a.fromJson(str, (Class) this.f139954b);
        t2.nullCheck();
        this.f139957e = t2;
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
    public final void m160474b(T t) {
        T t2 = (T) t.trimAndCopy();
        String json = this.f139953a.toJson(t2);
        this.f139957e = t2;
        this.f139955c.put(json);
    }
}
