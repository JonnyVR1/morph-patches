package com.tencent.could.huiyansdk.overseas.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import com.tencent.cloud.overseas.C13963R;
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.fragments.BaseFragment;
import com.tencent.could.huiyansdk.manager.C14064a;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.operate.C14070a;
import com.tencent.could.huiyansdk.operate.HuiYanOperateBody;
import com.tencent.could.huiyansdk.overseas.fragment.GuideFragment;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import org.jetbrains.annotations.NotNull;
import p153l.cvb;

/* JADX INFO: loaded from: classes12.dex */
public class GuideFragment extends BaseFragment {
    public static final String TAG = "GuideFragment";

    /* JADX INFO: renamed from: a */
    public static void m83556a(View view) {
        C14068e c14068e = C14068e.a.f58293a;
        c14068e.m83520a(2, TAG, "want go to authing fragment");
        C14064a c14064a = C14064a.a.f58257a;
        AuthingFragment authingFragment = new AuthingFragment();
        FragmentManager fragmentManager = c14064a.f58255b;
        if (fragmentManager != null) {
            if (C14043j.a.f58200a.f58193d) {
                c14068e.m83520a(2, "AuthFragmentManager", "Activity is exit, do can not change fragment");
                return;
            }
            c14064a.f58256c = fragmentManager.m2568m();
            FragmentManager fragmentManager2 = c14064a.f58255b;
            int i = C14032R.id.txy_main_fragment;
            fragmentManager2.m2555h0(i);
            c14064a.f58256c.m2812s(i, authingFragment).mo2709j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m83557b(View view) {
        doUserCancelEvent();
    }

    private void doUserCancelEvent() {
        String resString = getResString(C14032R.string.txt_user_cancel_check);
        HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.C14044a.f58205a.f58202b;
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

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment, androidx.lifecycle.InterfaceC0476e
    @NotNull
    public /* bridge */ /* synthetic */ cvb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // com.tencent.could.huiyansdk.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (this.fragmentView == null) {
            View viewInflate = layoutInflater.inflate(C13963R.layout.hy_overseas_fragment_guide, viewGroup, false);
            this.fragmentView = viewInflate;
            viewInflate.findViewById(C13963R.id.hy_oversea_start_check_btn).setOnClickListener(new View.OnClickListener() { // from class: l.svk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GuideFragment.m83556a(view);
                }
            });
            this.fragmentView.findViewById(C13963R.id.txy_hy_overseas_btn_back).setOnClickListener(new View.OnClickListener() { // from class: l.tvk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176266a.m83557b(view);
                }
            });
        }
        HuiYanOperateBody huiYanOperateBody = C14070a.b.f58321a.f58317a;
        if (huiYanOperateBody != null) {
            huiYanOperateBody.updateInfo("ShowProtocolPage", 1, 1L, System.currentTimeMillis());
        }
        return this.fragmentView;
    }
}
