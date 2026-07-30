package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaModuleAnnotationsProvider {
    @Nullable
    /* JADX INFO: renamed from: a */
    List<JavaAnnotation> mo89405a(@NotNull ClassId classId);
}
