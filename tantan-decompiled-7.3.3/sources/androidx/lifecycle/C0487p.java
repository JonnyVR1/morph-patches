package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.savedstate.C0679a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.iyd0;
import p153l.kyd0;

/* JADX INFO: renamed from: androidx.lifecycle.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\tB\u001f\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m88121d2 = {"Landroidx/lifecycle/p;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "Landroidx/savedstate/a$b;", "a", "()Landroidx/savedstate/a$b;", "", "Ljava/util/Map;", "liveDatas", "Ll/iyd0;", "b", "Ll/iyd0;", "impl", "Companion", "lifecycle-viewmodel-savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C0487p {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Object> liveDatas;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public iyd0 impl;

    /* JADX INFO: renamed from: androidx.lifecycle.p$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u000e\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Landroidx/lifecycle/p$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "restoredState", "defaultState", "Landroidx/lifecycle/p;", "a", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/p;", "lifecycle-viewmodel-savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C0487p m3061a(@Nullable Bundle restoredState, @Nullable Bundle defaultState) {
            if (restoredState == null) {
                restoredState = defaultState;
            }
            if (restoredState == null) {
                return new C0487p();
            }
            ClassLoader classLoader = C0487p.class.getClassLoader();
            classLoader.getClass();
            restoredState.setClassLoader(classLoader);
            return new C0487p(kyd0.m151958f(kyd0.m151953a(restoredState)));
        }

        public Companion() {
        }
    }

    public C0487p(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        this.liveDatas = new LinkedHashMap();
        this.impl = new iyd0(map);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: a */
    public final C0679a.b m3060a() {
        return this.impl.getSavedStateProvider();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0487p() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new iyd0(null, 1, 0 == true ? 1 : 0);
    }
}
