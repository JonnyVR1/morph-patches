package com.clevertap.android.sdk.inapp.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeCoverImageFragment;
import com.clevertap.android.sdk.inapp.media.InAppMediaHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.a7c0;
import p149l.c4c0;
import p149l.lw3;
import p149l.rtm;
import p149l.zom;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeCoverImageFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullFragment;", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "W3", "()Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class CTInAppNativeCoverImageFragment extends CTInAppBaseFullFragment {
    /* JADX INFO: renamed from: E4 */
    public static Unit m6454E4(CTInAppNativeCoverImageFragment cTInAppNativeCoverImageFragment) {
        cTInAppNativeCoverImageFragment.getClass();
        cTInAppNativeCoverImageFragment.m6398j4(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static Unit m6455F4(rtm rtmVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        rtmVar.getClass();
        marginLayoutParams.getClass();
        marginLayoutParams.leftMargin = rtmVar.f160972a;
        marginLayoutParams.rightMargin = rtmVar.f160974c;
        marginLayoutParams.topMargin = rtmVar.f160973b;
        marginLayoutParams.bottomMargin = rtmVar.f160975d;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static void m6456G4(CTInAppNativeCoverImageFragment cTInAppNativeCoverImageFragment, View view) {
        cTInAppNativeCoverImageFragment.getClass();
        cTInAppNativeCoverImageFragment.m6387Y3(null);
        FragmentActivity activity = cTInAppNativeCoverImageFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    @NotNull
    /* JADX INFO: renamed from: W3 */
    public InAppMediaHandler mo6386W3() {
        return InAppMediaHandler.INSTANCE.m6517a(this, m6394f4(), getCurrentOrientation(), m6394f4().getIsTablet() && m6414v4(), m6400m4(), true, !m6394f4().m6163f().isEmpty() ? new Function0() { // from class: l.iu3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CTInAppNativeCoverImageFragment.m6454E4(this.f114967a);
            }
        } : null, getActiveMediaUrl());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        View viewInflate = inflater.inflate(a7c0.f67895d, container, false);
        viewInflate.getClass();
        lw3.m151933c(viewInflate, new Function2() { // from class: l.gu3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CTInAppNativeCoverImageFragment.m6455F4((rtm) obj, (ViewGroup.MarginLayoutParams) obj2);
            }
        });
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(c4c0.f79226h0);
        frameLayout.setBackgroundColor(Color.parseColor(m6394f4().getBackgroundColor()));
        m6396h4().setup((RelativeLayout) frameLayout.findViewById(c4c0.f79225h), new zom(c4c0.f79223g, true, c4c0.f79201R0, c4c0.f79182I), new CTInAppBaseFragment.ViewOnClickListenerC1241a());
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        closeImageView.setOnClickListener(new View.OnClickListener() { // from class: l.hu3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CTInAppNativeCoverImageFragment.m6456G4(this.f109510a, view);
            }
        });
        if (m6394f4().getIsHideCloseButton()) {
            closeImageView.setVisibility(0);
            return viewInflate;
        }
        closeImageView.setVisibility(8);
        return viewInflate;
    }
}
