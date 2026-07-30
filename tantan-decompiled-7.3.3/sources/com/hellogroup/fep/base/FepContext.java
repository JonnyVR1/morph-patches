package com.hellogroup.fep.base;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.common.timer.ControllableTimer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.C15531f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.lv0;
import p153l.po5;
import p153l.r5e;
import p153l.z6h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Lcom/hellogroup/fep/base/FepContext;", "", "<init>", "()V", "Ll/po5;", "a", "Lkotlin/Lazy;", "b", "()Ll/po5;", "job", "Ll/drb;", "()Ll/drb;", "fepScope", "Lcom/hellogroup/common/timer/ControllableTimer;", "c", "()Lcom/hellogroup/common/timer/ControllableTimer;", "pollTimer", "Landroid/content/SharedPreferences;", Constants.INAPP_DATA_TAG, "()Landroid/content/SharedPreferences;", "sharedPreferences", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FepContext {
    public static final FepContext INSTANCE = new FepContext();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy job = LazyKt__LazyJVMKt.m88118b(new Function0<po5>() { // from class: com.hellogroup.fep.base.FepContext$job$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final po5 invoke() {
            return z6h0.m218802b(null, 1, null);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy fepScope = LazyKt__LazyJVMKt.m88118b(new Function0<drb>() { // from class: com.hellogroup.fep.base.FepContext$fepScope$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final drb invoke() {
            return C15531f.m94947a(r5e.m179861b().plus(FepContext.INSTANCE.m17574b()));
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy pollTimer = LazyKt__LazyJVMKt.m88118b(new Function0<ControllableTimer>() { // from class: com.hellogroup.fep.base.FepContext$pollTimer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ControllableTimer invoke() {
            return new ControllableTimer(FepContext.INSTANCE.m17573a().getCoroutineContext());
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private static final Lazy sharedPreferences = LazyKt__LazyJVMKt.m88118b(new Function0<SharedPreferences>() { // from class: com.hellogroup.fep.base.FepContext$sharedPreferences$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final SharedPreferences invoke() {
            Context contextM155971a = lv0.m155971a();
            if (contextM155971a != null) {
                return contextM155971a.getSharedPreferences("fep_sp_config", 0);
            }
            return null;
        }
    });

    private FepContext() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final drb m17573a() {
        return (drb) fepScope.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final po5 m17574b() {
        return (po5) job.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ControllableTimer m17575c() {
        return (ControllableTimer) pollTimer.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final SharedPreferences m17576d() {
        return (SharedPreferences) sharedPreferences.getValue();
    }
}
