package com.tencent.could.huiyansdk.manager;

import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.fragments.BaseFragment;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13901a {

    /* JADX INFO: renamed from: a */
    public String f57406a = "";

    /* JADX INFO: renamed from: b */
    public FragmentManager f57407b;

    /* JADX INFO: renamed from: c */
    public AbstractC0427k f57408c;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C13901a f57409a = new C13901a();
    }

    /* JADX INFO: renamed from: a */
    public void m82323a(Fragment fragment) {
        FragmentManager fragmentManager = this.f57407b;
        if (fragmentManager == null || fragment == null) {
            return;
        }
        this.f57408c = fragmentManager.m2567m();
        FragmentManager fragmentManager2 = this.f57407b;
        int i = C13869R.id.txy_main_fragment;
        fragmentManager2.m2554h0(i);
        this.f57408c.m2811s(i, fragment).m2808g(null).mo2707i();
    }

    /* JADX INFO: renamed from: a */
    public BaseFragment m82322a() {
        FragmentManager fragmentManager = this.f57407b;
        if (fragmentManager == null) {
            return null;
        }
        Fragment fragmentM2554h0 = fragmentManager.m2554h0(C13869R.id.txy_main_fragment);
        if (fragmentM2554h0 instanceof BaseFragment) {
            return (BaseFragment) fragmentM2554h0;
        }
        return null;
    }
}
