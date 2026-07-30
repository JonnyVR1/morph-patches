package com.p051p1.mobile.putong.account.p055ui.accountnew.loginstrategy;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import p153l.bxl;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbsLoginStrategy<T> implements bxl<T> {

    /* JADX INFO: renamed from: a */
    public final Act f17333a;

    /* JADX INFO: renamed from: b */
    public LoginStrategyType f17334b = LoginStrategyType.UNKNOWN;

    public enum LoginStrategyType {
        VERIFYCODE,
        PASSWORD,
        UNKNOWN
    }

    public AbsLoginStrategy(Act act) {
        this.f17333a = act;
    }

    @Override // p153l.bxl
    /* JADX INFO: renamed from: a */
    public void mo29691a(@NonNull Context context, int i, int i2, Intent intent) {
    }
}
