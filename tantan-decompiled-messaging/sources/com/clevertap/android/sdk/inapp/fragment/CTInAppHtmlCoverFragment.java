package com.clevertap.android.sdk.inapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlCoverFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.lw3;
import p149l.rtm;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppHtmlCoverFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullHtmlFragment;", "<init>", "()V", "", "webViewId", "Landroid/widget/RelativeLayout$LayoutParams;", "H4", "(I)Landroid/widget/RelativeLayout$LayoutParams;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class CTInAppHtmlCoverFragment extends CTInAppBaseFullHtmlFragment {
    /* JADX INFO: renamed from: O4 */
    public static Unit m6447O4(rtm rtmVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        rtmVar.getClass();
        marginLayoutParams.getClass();
        marginLayoutParams.leftMargin = rtmVar.f160972a;
        marginLayoutParams.rightMargin = rtmVar.f160974c;
        marginLayoutParams.topMargin = rtmVar.f160973b;
        marginLayoutParams.bottomMargin = rtmVar.f160975d;
        return Unit.INSTANCE;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullHtmlFragment
    @NotNull
    /* JADX INFO: renamed from: H4 */
    public RelativeLayout.LayoutParams mo6427H4(int webViewId) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        int iM6397i4 = m6397i4(40) / 4;
        layoutParams.setMargins(0, iM6397i4, iM6397i4, 0);
        return layoutParams;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullHtmlFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        if (!getIsFullscreen() && viewOnCreateView != null) {
            lw3.m151933c(viewOnCreateView, new Function2() { // from class: l.zt3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CTInAppHtmlCoverFragment.m6447O4((rtm) obj, (ViewGroup.MarginLayoutParams) obj2);
                }
            });
        }
        return viewOnCreateView;
    }
}
