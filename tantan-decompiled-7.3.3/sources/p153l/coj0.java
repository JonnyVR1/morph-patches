package p153l;

import com.google.common.collect.Sets;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class coj0 {

    /* JADX INFO: renamed from: a */
    public final Set<Type> f82893a = Sets.m16175f();

    /* JADX INFO: renamed from: a */
    public final void m111669a(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f82893a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        mo16565e((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        mo16566f((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        mo16564d((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        mo16567b((Class) type);
                    } else {
                        if (!(type instanceof GenericArrayType)) {
                            String strValueOf = String.valueOf(type);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
                            sb.append("Unknown type: ");
                            sb.append(strValueOf);
                            throw new AssertionError(sb.toString());
                        }
                        mo16563c((GenericArrayType) type);
                    }
                } catch (Throwable th) {
                    this.f82893a.remove(type);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo16565e(TypeVariable<?> typeVariable);

    /* JADX INFO: renamed from: f */
    public abstract void mo16566f(WildcardType wildcardType);

    /* JADX INFO: renamed from: b */
    public void mo16567b(Class<?> cls) {
    }

    /* JADX INFO: renamed from: c */
    public void mo16563c(GenericArrayType genericArrayType) {
    }

    /* JADX INFO: renamed from: d */
    public void mo16564d(ParameterizedType parameterizedType) {
    }
}
