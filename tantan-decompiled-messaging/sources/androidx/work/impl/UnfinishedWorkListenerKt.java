package androidx.work.impl;

import android.content.Context;
import androidx.work.C0761a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.jri;
import p149l.nc90;
import p149l.ppb;
import p149l.txv;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m87232d2 = {"Ll/ppb;", "Landroid/content/Context;", "appContext", "Landroidx/work/a;", "configuration", "Landroidx/work/impl/WorkDatabase;", "db", "", "c", "(Ll/ppb;Landroid/content/Context;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V", "", "a", "Ljava/lang/String;", "TAG", "", "b", "J", "MAX_DELAY_MS", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class UnfinishedWorkListenerKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f3486a;

    /* JADX INFO: renamed from: b */
    public static final long f3487b;

    static {
        String strM190978i = txv.m190978i("UnfinishedWorkListener");
        strM190978i.getClass();
        f3486a = strM190978i;
        f3487b = 3600000L;
    }

    /* JADX INFO: renamed from: c */
    public static final void m4448c(@NotNull ppb ppbVar, @NotNull Context context, @NotNull C0761a c0761a, @NotNull WorkDatabase workDatabase) {
        ppbVar.getClass();
        context.getClass();
        c0761a.getClass();
        workDatabase.getClass();
        if (nc90.m158928b(context, c0761a)) {
            jri.m142930B(jri.m142933E(jri.m142954m(jri.m142951j(jri.m142936H(workDatabase.workSpecDao().mo135162A(), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(null)))), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(context, null)), ppbVar);
        }
    }
}
