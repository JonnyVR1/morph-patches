package com.tencent.could.huiyansdk.overseas.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import com.tencent.cloud.overseas.C13800R;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.fragments.BaseFragment;
import com.tencent.could.huiyansdk.manager.C13901a;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.operate.C13907a;
import com.tencent.could.huiyansdk.operate.HuiYanOperateBody;
import com.tencent.could.huiyansdk.overseas.fragment.GuideFragment;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import org.jetbrains.annotations.NotNull;
import p149l.otb;

/* JADX INFO: loaded from: classes2.dex */
public class GuideFragment extends BaseFragment {
    public static final String TAG = "GuideFragment";

    /* JADX INFO: renamed from: a */
    public static void m82373a(View view) {
        C13905e c13905e = C13905e.a.f57445a;
        c13905e.m82337a(2, TAG, "want go to authing fragment");
        C13901a c13901a = C13901a.a.f57409a;
        AuthingFragment authingFragment = new AuthingFragment();
        FragmentManager fragmentManager = c13901a.f57407b;
        if (fragmentManager != null) {
            if (C13880j.a.f57352a.f57345d) {
                c13905e.m82337a(2, "AuthFragmentManager", "Activity is exit, do can not change fragment");
                return;
            }
            c13901a.f57408c = fragmentManager.m2567m();
            FragmentManager fragmentManager2 = c13901a.f57407b;
            int i = C13869R.id.txy_main_fragment;
            fragmentManager2.m2554h0(i);
            c13901a.f57408c.m2811s(i, authingFragment).mo2708j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m82374b(View view) {
        doUserCancelEvent();
    }

    private void doUserCancelEvent() {
        String resString = getResString(C13869R.string.txt_user_cancel_check);
        HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.C13881a.f57357a.f57354b;
        if (huiYanBaseCallBack != null) {
            huiYanBaseCallBack.updateOperateInfo("UserCancel", 1, 0L, "GuidePage");
        }
        CommonUtils.sendErrorAndExitAuth(212, resString);
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment
    public void backPopEvent() {
        super.backPopEvent();
        doUserCancelEvent();
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment, androidx.lifecycle.InterfaceC0475e
    @NotNull
    public /* bridge */ /* synthetic */ otb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (this.fragmentView == null) {
            View viewInflate = layoutInflater.inflate(C13800R.layout.hy_overseas_fragment_guide, viewGroup, false);
            this.fragmentView = viewInflate;
            viewInflate.findViewById(C13800R.id.hy_oversea_start_check_btn).setOnClickListener(new View.OnClickListener() { // from class: l.ctk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GuideFragment.m82373a(view);
                }
            });
            this.fragmentView.findViewById(C13800R.id.txy_hy_overseas_btn_back).setOnClickListener(new View.OnClickListener() { // from class: l.dtk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f87849a.m82374b(view);
                }
            });
        }
        HuiYanOperateBody huiYanOperateBody = C13907a.b.f57473a.f57469a;
        if (huiYanOperateBody != null) {
            huiYanOperateBody.updateInfo("ShowProtocolPage", 1, 1L, System.currentTimeMillis());
        }
        return this.fragmentView;
    }
}
