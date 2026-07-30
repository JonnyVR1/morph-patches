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
import p149l.a7c0;
import p149l.c4c0;
import p149l.lw3;
import p149l.rtm;
import p149l.zom;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeFooterFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialNativeFragment;", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "W3", "()Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class CTInAppNativeFooterFragment extends CTInAppBasePartialNativeFragment {
    /* JADX INFO: renamed from: C4 */
    public static Unit m6457C4(rtm rtmVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        rtmVar.getClass();
        marginLayoutParams.getClass();
        marginLayoutParams.leftMargin = rtmVar.f160972a;
        marginLayoutParams.rightMargin = rtmVar.f160974c;
        marginLayoutParams.bottomMargin = rtmVar.f160975d;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static boolean m6458D4(CTInAppNativeFooterFragment cTInAppNativeFooterFragment, View view, MotionEvent motionEvent) {
        cTInAppNativeFooterFragment.getClass();
        cTInAppNativeFooterFragment.m6442w4().onTouchEvent(motionEvent);
        return true;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    @NotNull
    /* JADX INFO: renamed from: W3 */
    public InAppMediaHandler mo6386W3() {
        return InAppMediaHandler.INSTANCE.m6517a(this, m6394f4(), getCurrentOrientation(), false, m6400m4(), (96 & 32) != 0 ? false : false, (96 & 64) != 0 ? null : null, (96 & 128) != 0 ? null : getActiveMediaUrl());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        ArrayList arrayList = new ArrayList();
        View viewInflate = inflater.inflate(a7c0.f67896e, container, false);
        m6440A4(viewInflate);
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) viewInflate.findViewById(c4c0.f79166A)).findViewById(c4c0.f79178G);
        relativeLayout.setBackgroundColor(Color.parseColor(m6394f4().getBackgroundColor()));
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(c4c0.f79170C);
        LinearLayout linearLayout2 = (LinearLayout) relativeLayout.findViewById(c4c0.f79172D);
        LinearLayout linearLayout3 = (LinearLayout) relativeLayout.findViewById(c4c0.f79174E);
        Button button = (Button) linearLayout3.findViewById(c4c0.f79259y);
        button.getClass();
        arrayList.add(button);
        Button button2 = (Button) linearLayout3.findViewById(c4c0.f79261z);
        button2.getClass();
        arrayList.add(button2);
        ((ImageView) linearLayout.findViewById(c4c0.f79168B)).setVisibility(8);
        InAppMediaHandler.C1262b.m6520b(m6396h4(), relativeLayout, new zom(c4c0.f79168B, false, 0, c4c0.f79182I, 4, null), null, 4, null);
        TextView textView = (TextView) linearLayout2.findViewById(c4c0.f79180H);
        textView.setText(m6394f4().getTitle());
        textView.setTextColor(Color.parseColor(m6394f4().getTitleColor()));
        TextView textView2 = (TextView) linearLayout2.findViewById(c4c0.f79176F);
        textView2.setText(m6394f4().getMessage());
        textView2.setTextColor(Color.parseColor(m6394f4().getMessageColor()));
        List<CTInAppNotificationButton> listM6163f = m6394f4().m6163f();
        if (!listM6163f.isEmpty()) {
            int size = listM6163f.size();
            for (int i = 0; i < size && i < 2; i++) {
                m6441B4((Button) arrayList.get(i), listM6163f.get(i), i);
            }
        }
        if (m6394f4().getButtonCount() == 1) {
            m6444y4(button, button2);
        }
        viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: l.ju3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return CTInAppNativeFooterFragment.m6458D4(this.f119726a, view, motionEvent);
            }
        });
        lw3.m151933c(viewInflate, new Function2() { // from class: l.ku3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CTInAppNativeFooterFragment.m6457C4((rtm) obj, (ViewGroup.MarginLayoutParams) obj2);
            }
        });
        return viewInflate;
    }
}
