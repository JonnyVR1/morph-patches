package com.tencent.could.huiyansdk.manager;

import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.fragments.BaseFragment;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.a */
/* JADX INFO: loaded from: classes12.dex */
public class C14064a {

    /* JADX INFO: renamed from: a */
    public String f58254a = "";

    /* JADX INFO: renamed from: b */
    public FragmentManager f58255b;

    /* JADX INFO: renamed from: c */
    public AbstractC0428k f58256c;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C14064a f58257a = new C14064a();
    }

    /* JADX INFO: renamed from: a */
    public void m83506a(Fragment fragment) {
        FragmentManager fragmentManager = this.f58255b;
        if (fragmentManager == null || fragment == null) {
            return;
        }
        this.f58256c = fragmentManager.m2568m();
        FragmentManager fragmentManager2 = this.f58255b;
        int i = C14032R.id.txy_main_fragment;
        fragmentManager2.m2555h0(i);
        this.f58256c.m2812s(i, fragment).m2809g(null).mo2708i();
    }

    /* JADX INFO: renamed from: a */
    public BaseFragment m83505a() {
        FragmentManager fragmentManager = this.f58255b;
        if (fragmentManager == null) {
            return null;
        }
        Fragment fragmentM2555h0 = fragmentManager.m2555h0(C14032R.id.txy_main_fragment);
        if (fragmentM2555h0 instanceof BaseFragment) {
            return (BaseFragment) fragmentM2555h0;
        }
        return null;
    }
}
