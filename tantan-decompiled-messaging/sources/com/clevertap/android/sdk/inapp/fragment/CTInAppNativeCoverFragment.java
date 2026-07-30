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
import p149l.a7c0;
import p149l.c4c0;
import p149l.lw3;
import p149l.rtm;
import p149l.zom;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeCoverFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullNativeFragment;", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "W3", "()Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class CTInAppNativeCoverFragment extends CTInAppBaseFullNativeFragment {
    /* JADX INFO: renamed from: G4 */
    public static void m6452G4(CTInAppNativeCoverFragment cTInAppNativeCoverFragment, View view) {
        cTInAppNativeCoverFragment.getClass();
        cTInAppNativeCoverFragment.m6387Y3(null);
        FragmentActivity activity = cTInAppNativeCoverFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: H4 */
    public static Unit m6453H4(rtm rtmVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        rtmVar.getClass();
        marginLayoutParams.getClass();
        marginLayoutParams.leftMargin = rtmVar.f160972a;
        marginLayoutParams.rightMargin = rtmVar.f160974c;
        marginLayoutParams.topMargin = rtmVar.f160973b;
        marginLayoutParams.bottomMargin = rtmVar.f160975d;
        return Unit.INSTANCE;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    @NotNull
    /* JADX INFO: renamed from: W3 */
    public InAppMediaHandler mo6386W3() {
        return InAppMediaHandler.INSTANCE.m6517a(this, m6394f4(), getCurrentOrientation(), m6394f4().getIsTablet() && m6414v4(), m6400m4(), (96 & 32) != 0 ? false : false, (96 & 64) != 0 ? null : null, (96 & 128) != 0 ? null : getActiveMediaUrl());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        ArrayList arrayList = new ArrayList();
        View viewInflate = inflater.inflate(a7c0.f67894c, container, false);
        viewInflate.getClass();
        lw3.m151933c(viewInflate, new Function2() { // from class: l.eu3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CTInAppNativeCoverFragment.m6453H4((rtm) obj, (ViewGroup.MarginLayoutParams) obj2);
            }
        });
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(c4c0.f79224g0);
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(c4c0.f79231k);
        relativeLayout.setBackgroundColor(Color.parseColor(m6394f4().getBackgroundColor()));
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(c4c0.f79227i);
        Button button = (Button) linearLayout.findViewById(c4c0.f79219e);
        arrayList.add(button);
        Button button2 = (Button) linearLayout.findViewById(c4c0.f79221f);
        arrayList.add(button2);
        InAppMediaHandler.C1262b.m6520b(m6396h4(), relativeLayout, new zom(c4c0.f79211a, false, 0, c4c0.f79182I, 4, null), null, 4, null);
        TextView textView = (TextView) relativeLayout.findViewById(c4c0.f79233l);
        textView.setText(m6394f4().getTitle());
        textView.setTextColor(Color.parseColor(m6394f4().getTitleColor()));
        TextView textView2 = (TextView) relativeLayout.findViewById(c4c0.f79229j);
        textView2.setText(m6394f4().getMessage());
        textView2.setTextColor(Color.parseColor(m6394f4().getMessageColor()));
        List<CTInAppNotificationButton> listM6163f = m6394f4().m6163f();
        if (listM6163f.size() == 1) {
            if (getCurrentOrientation() == 2) {
                button.setVisibility(8);
            } else if (getCurrentOrientation() == 1) {
                button.setVisibility(4);
            }
            button2.getClass();
            m6430F4(button2, listM6163f.get(0), 0);
        } else if (!listM6163f.isEmpty()) {
            int size = listM6163f.size();
            for (int i = 0; i < size; i++) {
                if (i < 2) {
                    CTInAppNotificationButton cTInAppNotificationButton = listM6163f.get(i);
                    Object obj = arrayList.get(i);
                    obj.getClass();
                    m6430F4((Button) obj, cTInAppNotificationButton, i);
                }
            }
        }
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        closeImageView.setOnClickListener(new View.OnClickListener() { // from class: l.fu3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CTInAppNativeCoverFragment.m6452G4(this.f99303a, view);
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
