package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import p149l.rw5;
import p149l.ryi;

/* JADX INFO: loaded from: classes7.dex */
public interface ConsentInformation {

    public enum PrivacyOptionsRequirementStatus {
        UNKNOWN,
        NOT_REQUIRED,
        REQUIRED
    }

    /* JADX INFO: renamed from: com.google.android.ump.ConsentInformation$a */
    public interface InterfaceC2633a {
        /* JADX INFO: renamed from: a */
        void mo15382a(@RecentlyNonNull ryi ryiVar);
    }

    /* JADX INFO: renamed from: com.google.android.ump.ConsentInformation$b */
    public interface InterfaceC2634b {
        /* JADX INFO: renamed from: a */
        void mo15383a();
    }

    /* JADX INFO: renamed from: a */
    void mo15380a(@RecentlyNonNull Activity activity, @RecentlyNonNull rw5 rw5Var, @RecentlyNonNull InterfaceC2634b interfaceC2634b, @RecentlyNonNull InterfaceC2633a interfaceC2633a);

    /* JADX INFO: renamed from: b */
    boolean mo15381b();
}
