package p153l;

import androidx.lifecycle.C0491t;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Ll/nll0;", "VM", "Landroidx/lifecycle/t$c;", "factory", "Lkotlin/reflect/KClass;", "modelClass", "Ll/cvb;", "extras", "a", "(Landroidx/lifecycle/t$c;Lkotlin/reflect/KClass;Ll/cvb;)Ll/nll0;", "lifecycle-viewmodel_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class qll0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <VM extends nll0> VM m177005a(@NotNull C0491t.c cVar, @NotNull KClass<VM> kClass, @NotNull cvb cvbVar) {
        cVar.getClass();
        kClass.getClass();
        cvbVar.getClass();
        try {
            try {
                return (VM) cVar.create(kClass, cvbVar);
            } catch (AbstractMethodError unused) {
                return (VM) cVar.create(JvmClassMappingKt.m88341b(kClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) cVar.create(JvmClassMappingKt.m88341b(kClass), cvbVar);
        }
    }
}
