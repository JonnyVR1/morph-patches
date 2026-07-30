package p153l;

import androidx.lifecycle.C0491t;
import com.cosmos.photon.push.service.PushService;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/std;", "Landroidx/lifecycle/t$c;", "<init>", "()V", "Ll/nll0;", p7f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "Ll/cvb;", "extras", PushService.COMMAND_CREATE, "(Lkotlin/reflect/KClass;Ll/cvb;)Ll/nll0;", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class std implements C0491t.c {

    @NotNull
    public static final std INSTANCE = new std();

    @Override // androidx.lifecycle.C0491t.c
    @NotNull
    public <T extends nll0> T create(@NotNull KClass<T> modelClass, @NotNull cvb extras) {
        modelClass.getClass();
        extras.getClass();
        return (T) yvq.INSTANCE.m217554a(JvmClassMappingKt.m88341b(modelClass));
    }
}
