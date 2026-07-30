package com.hellogroup.p036mk.core.log.core;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.hellogroup.fep.base.FepContext;
import kotlin.Metadata;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.kkw;
import p153l.nkw;
import p153l.okw;
import p153l.pkw;
import p153l.xh3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Lcom/hellogroup/mk/core/log/core/MKLogReporter;", "", "Ll/okw;", "configuration", "Ll/pkw;", "output", "<init>", "(Ll/okw;Ll/pkw;)V", "", "f", "()Z", "Ll/kkw;", NotificationCompat.CATEGORY_EVENT, "", "c", "(Ll/kkw;)V", "e", "Lcom/hellogroup/mk/core/log/core/MKLogLevel;", "eventLevel", "b", "(Lcom/hellogroup/mk/core/log/core/MKLogLevel;)Z", "a", "Ll/okw;", Constants.INAPP_DATA_TAG, "()Ll/okw;", "Ll/pkw;", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class MKLogReporter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final okw configuration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final pkw output;

    public MKLogReporter(@NotNull okw okwVar, @Nullable pkw pkwVar) {
        okwVar.getClass();
        this.configuration = okwVar;
        this.output = pkwVar;
    }

    /* JADX INFO: renamed from: c */
    private final void m18435c(kkw event) {
        xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new MKLogReporter$dispatchUpload$1(this, event, null), 3, null);
    }

    /* JADX INFO: renamed from: f */
    private final boolean m18436f() {
        return Math.random() < C15274a.m88491g(this.configuration.getSampleRate(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18437b(@NotNull MKLogLevel eventLevel) {
        eventLevel.getClass();
        int i = nkw.f142484a[eventLevel.ordinal()];
        if (i == 2) {
            return this.configuration.getWarningEnabled() || m18436f();
        }
        if (i != 3) {
            return i == 4;
        }
        return this.configuration.getInfoEnabled() || m18436f();
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final okw getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: e */
    public final void m18439e(@Nullable kkw event) {
        if (event != null && this.configuration.getEnabled()) {
            m18435c(event);
        }
    }
}
