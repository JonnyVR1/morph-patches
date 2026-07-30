package com.p000p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import l.j760;
import l.t100;
import l.xdl0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.p6j0;
import p007l.ywh;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RoamEntranceView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f4949a;

    public RoamEntranceView(@NonNull Context context) {
        super(context);
        m7586b(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m7586b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, t100.s));
        linearLayout.setOrientation(0);
        View vImage = new VImage(context);
        int i = t100.m;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        int i2 = t100.i;
        layoutParams.leftMargin = i2;
        vImage.setImageResource(f3c0.f7676O4);
        vImage.setLayoutParams(layoutParams);
        VText vText = new VText(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = t100.e;
        layoutParams2.rightMargin = i2;
        layoutParams2.gravity = 16;
        vText.setLayoutParams(layoutParams2);
        vText.setTextColor(context.getResources().getColor(e1c0.f7168y));
        vText.setTextSize(12.0f);
        this.f4949a = vText;
        linearLayout.addView(vImage);
        linearLayout.addView(vText);
        linearLayout.setBackgroundResource(f3c0.f7669N4);
        addView(linearLayout);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.d5d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6833a.m7587c(view);
            }
        });
        p6j0.m12915e("e_roam_entrance", "p_discover_dating", new j760[0]);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m7587c(View view) {
        p6j0.m12913c("e_roam_entrance", "p_discover_dating", new j760[0]);
        if (getContext() instanceof Act) {
            ywh.m17196c(getContext(), "p_discover_dating,e_roam_entrance,click");
        }
    }

    /* JADX INFO: renamed from: d */
    public void m7588d(String str) {
        if (this.f4949a == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (str.length() <= 4) {
            this.f4949a.setText(str);
        } else {
            this.f4949a.setText(str.substring(0, 4).concat("…"));
        }
    }

    public RoamEntranceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7586b(context);
    }

    public RoamEntranceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7586b(context);
    }
}
