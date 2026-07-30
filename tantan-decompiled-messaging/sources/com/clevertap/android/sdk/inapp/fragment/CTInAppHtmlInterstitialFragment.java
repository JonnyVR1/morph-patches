package com.clevertap.android.sdk.inapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlInterstitialFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.lw3;
import p149l.rtm;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppHtmlInterstitialFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullHtmlFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class CTInAppHtmlInterstitialFragment extends CTInAppBaseFullHtmlFragment {
    /* JADX INFO: renamed from: O4 */
    public static Unit m6451O4(rtm rtmVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        rtmVar.getClass();
        marginLayoutParams.getClass();
        marginLayoutParams.leftMargin = rtmVar.f160972a;
        marginLayoutParams.rightMargin = rtmVar.f160974c;
        marginLayoutParams.topMargin = rtmVar.f160973b;
        marginLayoutParams.bottomMargin = rtmVar.f160975d;
        return Unit.INSTANCE;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullHtmlFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        if (!getIsFullscreen() && viewOnCreateView != null) {
            lw3.m151933c(viewOnCreateView, new Function2() { // from class: l.du3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CTInAppHtmlInterstitialFragment.m6451O4((rtm) obj, (ViewGroup.MarginLayoutParams) obj2);
                }
            });
        }
        return viewOnCreateView;
    }
}
