package androidx.work.impl;

import android.content.Context;
import androidx.work.C0763a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.drb;
import p153l.fui;
import p153l.qzv;
import p153l.rk90;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m88121d2 = {"Ll/drb;", "Landroid/content/Context;", "appContext", "Landroidx/work/a;", "configuration", "Landroidx/work/impl/WorkDatabase;", "db", "", "c", "(Ll/drb;Landroid/content/Context;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V", "", "a", "Ljava/lang/String;", "TAG", "", "b", "J", "MAX_DELAY_MS", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class UnfinishedWorkListenerKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f3486a;

    /* JADX INFO: renamed from: b */
    public static final long f3487b;

    static {
        String strM178831i = qzv.m178831i("UnfinishedWorkListener");
        strM178831i.getClass();
        f3486a = strM178831i;
        f3487b = 3600000L;
    }

    /* JADX INFO: renamed from: c */
    public static final void m4450c(@NotNull drb drbVar, @NotNull Context context, @NotNull C0763a c0763a, @NotNull WorkDatabase workDatabase) {
        drbVar.getClass();
        context.getClass();
        c0763a.getClass();
        workDatabase.getClass();
        if (rk90.m181782b(context, c0763a)) {
            fui.m127465B(fui.m127468E(fui.m127489m(fui.m127486j(fui.m127471H(workDatabase.workSpecDao().mo163429A(), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(null)))), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(context, null)), drbVar);
        }
    }
}
