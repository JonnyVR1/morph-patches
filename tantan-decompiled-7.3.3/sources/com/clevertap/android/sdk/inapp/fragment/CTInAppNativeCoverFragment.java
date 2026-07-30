package com.clevertap.android.sdk.inapp.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeCoverFragment;
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
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeCoverFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullNativeFragment;", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "W3", "()Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class CTInAppNativeCoverFragment extends CTInAppBaseFullNativeFragment {
    /* JADX INFO: renamed from: G4 */
    public static void m6506G4(CTInAppNativeCoverFragment cTInAppNativeCoverFragment, View view) {
        cTInAppNativeCoverFragment.getClass();
        cTInAppNativeCoverFragment.m6441Y3(null);
        FragmentActivity activity = cTInAppNativeCoverFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: H4 */
    public static Unit m6507H4(svm svmVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        svmVar.getClass();
        marginLayoutParams.getClass();
        marginLayoutParams.leftMargin = svmVar.f170857a;
        marginLayoutParams.rightMargin = svmVar.f170859c;
        marginLayoutParams.topMargin = svmVar.f170858b;
        marginLayoutParams.bottomMargin = svmVar.f170860d;
        return Unit.INSTANCE;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    @NotNull
    /* JADX INFO: renamed from: W3 */
    public InAppMediaHandler mo6440W3() {
        return InAppMediaHandler.INSTANCE.m6571a(this, m6448f4(), getCurrentOrientation(), m6448f4().getIsTablet() && m6468v4(), m6454m4(), (96 & 32) != 0 ? false : false, (96 & 64) != 0 ? null : null, (96 & 128) != 0 ? null : getActiveMediaUrl());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        ArrayList arrayList = new ArrayList();
        View viewInflate = inflater.inflate(efc0.f93746c, container, false);
        viewInflate.getClass();
        kx3.m151782c(viewInflate, new Function2() { // from class: l.dv3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CTInAppNativeCoverFragment.m6507H4((svm) obj, (ViewGroup.MarginLayoutParams) obj2);
            }
        });
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(icc0.f114360g0);
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(icc0.f114367k);
        relativeLayout.setBackgroundColor(Color.parseColor(m6448f4().getBackgroundColor()));
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(icc0.f114363i);
        Button button = (Button) linearLayout.findViewById(icc0.f114355e);
        arrayList.add(button);
        Button button2 = (Button) linearLayout.findViewById(icc0.f114357f);
        arrayList.add(button2);
        InAppMediaHandler.C1285b.m6574b(m6450h4(), relativeLayout, new brm(icc0.f114347a, false, 0, icc0.f114318I, 4, null), null, 4, null);
        TextView textView = (TextView) relativeLayout.findViewById(icc0.f114369l);
        textView.setText(m6448f4().getTitle());
        textView.setTextColor(Color.parseColor(m6448f4().getTitleColor()));
        TextView textView2 = (TextView) relativeLayout.findViewById(icc0.f114365j);
        textView2.setText(m6448f4().getMessage());
        textView2.setTextColor(Color.parseColor(m6448f4().getMessageColor()));
        List<CTInAppNotificationButton> listM6217f = m6448f4().m6217f();
        if (listM6217f.size() == 1) {
            if (getCurrentOrientation() == 2) {
                button.setVisibility(8);
            } else if (getCurrentOrientation() == 1) {
                button.setVisibility(4);
            }
            button2.getClass();
            m6484F4(button2, listM6217f.get(0), 0);
        } else if (!listM6217f.isEmpty()) {
            int size = listM6217f.size();
            for (int i = 0; i < size; i++) {
                if (i < 2) {
                    CTInAppNotificationButton cTInAppNotificationButton = listM6217f.get(i);
                    Object obj = arrayList.get(i);
                    obj.getClass();
                    m6484F4((Button) obj, cTInAppNotificationButton, i);
                }
            }
        }
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        closeImageView.setOnClickListener(new View.OnClickListener() { // from class: l.ev3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CTInAppNativeCoverFragment.m6506G4(this.f95977a, view);
            }
        });
        if (m6448f4().getIsHideCloseButton()) {
            closeImageView.setVisibility(0);
            return viewInflate;
        }
        closeImageView.setVisibility(8);
        return viewInflate;
    }
}
