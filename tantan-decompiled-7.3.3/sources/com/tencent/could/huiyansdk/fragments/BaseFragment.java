package com.tencent.could.huiyansdk.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.api.InterfaceC14040g;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.manager.C14068e;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p153l.cvb;

/* JADX INFO: loaded from: classes12.dex */
public class BaseFragment extends Fragment {
    public static final String TAG = "BaseFragment";
    public View fragmentView;

    public void backPopEvent() {
    }

    public void exit() {
        if (getActivity() == null) {
            return;
        }
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity);
        if (activity.isFinishing()) {
            return;
        }
        FragmentActivity activity2 = getActivity();
        Objects.requireNonNull(activity2);
        activity2.finish();
    }

    public Resources getContextResources() {
        if (!isAdded()) {
            Context contextM83413a = C14043j.a.f58200a.m83413a();
            if (contextM83413a != null) {
                return contextM83413a.getResources();
            }
            Context contextM83423a = HuiYanBaseApi.C14044a.f58205a.m83423a();
            if (contextM83423a != null) {
                return contextM83423a.getResources();
            }
        }
        return getResources();
    }

    @NotNull
    public /* bridge */ /* synthetic */ cvb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    public String getResString(int i) {
        return getContextResources().getString(i);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View view = this.fragmentView;
        if (view == null) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        InterfaceC14040g interfaceC14040g = C14043j.a.f58200a.f58190a;
        if (interfaceC14040g != null) {
            interfaceC14040g.onMainViewCreate(view);
        }
        return this.fragmentView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        InterfaceC14040g interfaceC14040g = C14043j.a.f58200a.f58190a;
        if (interfaceC14040g != null) {
            interfaceC14040g.onMainViewDestroy();
        }
        if (this.fragmentView != null) {
            this.fragmentView = null;
        }
        super.onDestroy();
    }

    public void runOnUiThread(Runnable runnable) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        } else {
            C14068e.a.f58293a.m83520a(2, TAG, "fragment attach activity is null");
        }
    }
}
