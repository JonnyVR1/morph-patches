package com.p046p1.mobile.putong.account.p050ui.accountnew.loginstrategy;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import p149l.oul;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbsLoginStrategy<T> implements oul<T> {

    /* JADX INFO: renamed from: a */
    public final Act f16614a;

    /* JADX INFO: renamed from: b */
    public LoginStrategyType f16615b = LoginStrategyType.UNKNOWN;

    public enum LoginStrategyType {
        VERIFYCODE,
        PASSWORD,
        UNKNOWN
    }

    public AbsLoginStrategy(Act act) {
        this.f16614a = act;
    }

    @Override // p149l.oul
    /* JADX INFO: renamed from: a */
    public void mo28692a(@NonNull Context context, int i, int i2, Intent intent) {
    }
}
