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
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.api.InterfaceC13877g;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.manager.C13905e;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p149l.otb;

/* JADX INFO: loaded from: classes2.dex */
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
            Context contextM82230a = C13880j.a.f57352a.m82230a();
            if (contextM82230a != null) {
                return contextM82230a.getResources();
            }
            Context contextM82240a = HuiYanBaseApi.C13881a.f57357a.m82240a();
            if (contextM82240a != null) {
                return contextM82240a.getResources();
            }
        }
        return getResources();
    }

    @NotNull
    public /* bridge */ /* synthetic */ otb getDefaultViewModelCreationExtras() {
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
        InterfaceC13877g interfaceC13877g = C13880j.a.f57352a.f57342a;
        if (interfaceC13877g != null) {
            interfaceC13877g.onMainViewCreate(view);
        }
        return this.fragmentView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        InterfaceC13877g interfaceC13877g = C13880j.a.f57352a.f57342a;
        if (interfaceC13877g != null) {
            interfaceC13877g.onMainViewDestroy();
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
            C13905e.a.f57445a.m82337a(2, TAG, "fragment attach activity is null");
        }
    }
}
