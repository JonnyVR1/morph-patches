package com.p000p1.mobile.putong.account.p002ui.accountnew.loginstrategy;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import p006l.oul;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class AbsLoginStrategy<T> implements oul<T> {

    /* JADX INFO: renamed from: a */
    public final Act f603a;

    /* JADX INFO: renamed from: b */
    public LoginStrategyType f604b = LoginStrategyType.UNKNOWN;

    public enum LoginStrategyType {
        VERIFYCODE,
        PASSWORD,
        UNKNOWN
    }

    public AbsLoginStrategy(Act act) {
        this.f603a = act;
    }

    @Override // p006l.oul
    /* JADX INFO: renamed from: a */
    public void mo591a(@NonNull Context context, int i, int i2, Intent intent) {
    }
}
