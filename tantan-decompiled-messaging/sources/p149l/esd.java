package p149l;

import androidx.lifecycle.C0490t;
import com.cosmos.photon.push.service.PushService;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/esd;", "Landroidx/lifecycle/t$c;", "<init>", "()V", "Ll/jcl0;", j6f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "Ll/otb;", "extras", PushService.COMMAND_CREATE, "(Lkotlin/reflect/KClass;Ll/otb;)Ll/jcl0;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class esd implements C0490t.c {

    @NotNull
    public static final esd INSTANCE = new esd();

    @Override // androidx.lifecycle.C0490t.c
    @NotNull
    public <T extends jcl0> T create(@NotNull KClass<T> modelClass, @NotNull otb extras) {
        modelClass.getClass();
        extras.getClass();
        return (T) xtq.INSTANCE.m211015a(JvmClassMappingKt.m87452b(modelClass));
    }
}
