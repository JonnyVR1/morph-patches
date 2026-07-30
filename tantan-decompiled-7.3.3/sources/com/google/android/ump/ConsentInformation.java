package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import p153l.m1j;
import p153l.wx5;

/* JADX INFO: loaded from: classes7.dex */
public interface ConsentInformation {

    public enum PrivacyOptionsRequirementStatus {
        UNKNOWN,
        NOT_REQUIRED,
        REQUIRED
    }

    /* JADX INFO: renamed from: com.google.android.ump.ConsentInformation$a */
    public interface InterfaceC2656a {
        /* JADX INFO: renamed from: a */
        void mo15436a(@RecentlyNonNull m1j m1jVar);
    }

    /* JADX INFO: renamed from: com.google.android.ump.ConsentInformation$b */
    public interface InterfaceC2657b {
        /* JADX INFO: renamed from: a */
        void mo15437a();
    }

    /* JADX INFO: renamed from: a */
    void mo15434a(@RecentlyNonNull Activity activity, @RecentlyNonNull wx5 wx5Var, @RecentlyNonNull InterfaceC2657b interfaceC2657b, @RecentlyNonNull InterfaceC2656a interfaceC2656a);

    /* JADX INFO: renamed from: b */
    boolean mo15435b();
}
