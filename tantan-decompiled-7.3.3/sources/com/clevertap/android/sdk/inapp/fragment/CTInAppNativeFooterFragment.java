package com.clevertap.android.sdk.inapp.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeFooterFragment;
import com.clevertap.android.sdk.inapp.media.InAppMediaHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.brm;
import p153l.efc0;
import p153l.icc0;
import p153l.kx3;
import p153l.svm;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeFooterFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialNativeFragment;", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "W3", "()Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class CTInAppNativeFooterFragment extends CTInAppBasePartialNativeFragment {
    /* JADX INFO: renamed from: C4 */
    public static Unit m6511C4(svm svmVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        svmVar.getClass();
        marginLayoutParams.getClass();
        marginLayoutParams.leftMargin = svmVar.f170857a;
        marginLayoutParams.rightMargin = svmVar.f170859c;
        marginLayoutParams.bottomMargin = svmVar.f170860d;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static boolean m6512D4(CTInAppNativeFooterFragment cTInAppNativeFooterFragment, View view, MotionEvent motionEvent) {
        cTInAppNativeFooterFragment.getClass();
        cTInAppNativeFooterFragment.m6496w4().onTouchEvent(motionEvent);
        return true;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    @NotNull
    /* JADX INFO: renamed from: W3 */
    public InAppMediaHandler mo6440W3() {
        return InAppMediaHandler.INSTANCE.m6571a(this, m6448f4(), getCurrentOrientation(), false, m6454m4(), (96 & 32) != 0 ? false : false, (96 & 64) != 0 ? null : null, (96 & 128) != 0 ? null : getActiveMediaUrl());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        ArrayList arrayList = new ArrayList();
        View viewInflate = inflater.inflate(efc0.f93748e, container, false);
        m6494A4(viewInflate);
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) viewInflate.findViewById(icc0.f114302A)).findViewById(icc0.f114314G);
        relativeLayout.setBackgroundColor(Color.parseColor(m6448f4().getBackgroundColor()));
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(icc0.f114306C);
        LinearLayout linearLayout2 = (LinearLayout) relativeLayout.findViewById(icc0.f114308D);
        LinearLayout linearLayout3 = (LinearLayout) relativeLayout.findViewById(icc0.f114310E);
        Button button = (Button) linearLayout3.findViewById(icc0.f114395y);
        button.getClass();
        arrayList.add(button);
        Button button2 = (Button) linearLayout3.findViewById(icc0.f114397z);
        button2.getClass();
        arrayList.add(button2);
        ((ImageView) linearLayout.findViewById(icc0.f114304B)).setVisibility(8);
        InAppMediaHandler.C1285b.m6574b(m6450h4(), relativeLayout, new brm(icc0.f114304B, false, 0, icc0.f114318I, 4, null), null, 4, null);
        TextView textView = (TextView) linearLayout2.findViewById(icc0.f114316H);
        textView.setText(m6448f4().getTitle());
        textView.setTextColor(Color.parseColor(m6448f4().getTitleColor()));
        TextView textView2 = (TextView) linearLayout2.findViewById(icc0.f114312F);
        textView2.setText(m6448f4().getMessage());
        textView2.setTextColor(Color.parseColor(m6448f4().getMessageColor()));
        List<CTInAppNotificationButton> listM6217f = m6448f4().m6217f();
        if (!listM6217f.isEmpty()) {
            int size = listM6217f.size();
            for (int i = 0; i < size && i < 2; i++) {
                m6495B4((Button) arrayList.get(i), listM6217f.get(i), i);
            }
        }
        if (m6448f4().getButtonCount() == 1) {
            m6498y4(button, button2);
        }
        viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: l.iv3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return CTInAppNativeFooterFragment.m6512D4(this.f117013a, view, motionEvent);
            }
        });
        kx3.m151782c(viewInflate, new Function2() { // from class: l.jv3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CTInAppNativeFooterFragment.m6511C4((svm) obj, (ViewGroup.MarginLayoutParams) obj2);
            }
        });
        return viewInflate;
    }
}
