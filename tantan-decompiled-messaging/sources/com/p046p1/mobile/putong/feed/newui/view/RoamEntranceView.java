package com.p046p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import p147v.VImage;
import p147v.VText;
import p149l.e1c0;
import p149l.f3c0;
import p149l.j760;
import p149l.p6j0;
import p149l.t100;
import p149l.xdl0;
import p149l.ywh;

/* JADX INFO: loaded from: classes12.dex */
public class RoamEntranceView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f43488a;

    public RoamEntranceView(@NonNull Context context) {
        super(context);
        m66421b(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m66421b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, t100.f167270s));
        linearLayout.setOrientation(0);
        VImage vImage = new VImage(context);
        int i = t100.f167264m;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        int i2 = t100.f167260i;
        layoutParams.leftMargin = i2;
        vImage.setImageResource(f3c0.f94393O4);
        vImage.setLayoutParams(layoutParams);
        VText vText = new VText(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = t100.f167256e;
        layoutParams2.rightMargin = i2;
        layoutParams2.gravity = 16;
        vText.setLayoutParams(layoutParams2);
        vText.setTextColor(context.getResources().getColor(e1c0.f88812y));
        vText.setTextSize(12.0f);
        this.f43488a = vText;
        linearLayout.addView(vImage);
        linearLayout.addView(vText);
        linearLayout.setBackgroundResource(f3c0.f94386N4);
        addView(linearLayout);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.d5d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84527a.m66422c(view);
            }
        });
        p6j0.m167671e("e_roam_entrance", "p_discover_dating", new j760[0]);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m66422c(View view) {
        p6j0.m167669c("e_roam_entrance", "p_discover_dating", new j760[0]);
        if (getContext() instanceof Act) {
            ywh.m216394c((Act) getContext(), "p_discover_dating,e_roam_entrance,click");
        }
    }

    /* JADX INFO: renamed from: d */
    public void m66423d(String str) {
        if (this.f43488a == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (str.length() <= 4) {
            this.f43488a.setText(str);
        } else {
            this.f43488a.setText(str.substring(0, 4).concat("…"));
        }
    }

    public RoamEntranceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66421b(context);
    }

    public RoamEntranceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66421b(context);
    }
}
