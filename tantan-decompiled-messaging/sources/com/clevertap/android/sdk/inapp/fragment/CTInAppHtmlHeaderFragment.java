package com.clevertap.android.sdk.inapp.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlHeaderFragment;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.a7c0;
import p149l.c4c0;
import p149l.lw3;
import p149l.rtm;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppHtmlHeaderFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialHtmlFragment;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "Landroid/view/ViewGroup;", "z4", "(Landroid/view/View;)Landroid/view/ViewGroup;", "Landroid/view/LayoutInflater;", "inflater", "container", "A4", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class CTInAppHtmlHeaderFragment extends CTInAppBasePartialHtmlFragment {
    /* JADX INFO: renamed from: C4 */
    public static Unit m6450C4(rtm rtmVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        rtmVar.getClass();
        marginLayoutParams.getClass();
        marginLayoutParams.leftMargin = rtmVar.f160972a;
        marginLayoutParams.rightMargin = rtmVar.f160974c;
        marginLayoutParams.topMargin = rtmVar.f160973b;
        return Unit.INSTANCE;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialHtmlFragment
    @NotNull
    /* JADX INFO: renamed from: A4 */
    public View mo6437A4(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        View viewInflate = inflater.inflate(a7c0.f67902k, container, false);
        viewInflate.getClass();
        lw3.m151933c(viewInflate, new Function2() { // from class: l.cu3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CTInAppHtmlHeaderFragment.m6450C4((rtm) obj, (ViewGroup.MarginLayoutParams) obj2);
            }
        });
        return viewInflate;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialHtmlFragment
    @Nullable
    /* JADX INFO: renamed from: z4 */
    public ViewGroup mo6438z4(@Nullable View view) {
        if (view != null) {
            return (ViewGroup) view.findViewById(c4c0.f79236m0);
        }
        return null;
    }
}
