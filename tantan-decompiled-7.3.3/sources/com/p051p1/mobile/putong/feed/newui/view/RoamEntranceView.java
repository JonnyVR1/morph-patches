package com.p051p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.k9c0;
import p153l.lbc0;
import p153l.nyh;
import p153l.pf60;
import p153l.qa00;
import p153l.tfj0;

/* JADX INFO: loaded from: classes13.dex */
public class RoamEntranceView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f44336a;

    public RoamEntranceView(@NonNull Context context) {
        super(context);
        m67604b(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m67604b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, qa00.f156332s));
        linearLayout.setOrientation(0);
        VImage vImage = new VImage(context);
        int i = qa00.f156326m;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        int i2 = qa00.f156322i;
        layoutParams.leftMargin = i2;
        vImage.setImageResource(lbc0.f130911O4);
        vImage.setLayoutParams(layoutParams);
        VText vText = new VText(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = qa00.f156318e;
        layoutParams2.rightMargin = i2;
        layoutParams2.gravity = 16;
        vText.setLayoutParams(layoutParams2);
        vText.setTextColor(context.getResources().getColor(k9c0.f124535y));
        vText.setTextSize(12.0f);
        this.f44336a = vText;
        linearLayout.addView(vImage);
        linearLayout.addView(vText);
        linearLayout.setBackgroundResource(lbc0.f130904N4);
        addView(linearLayout);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.gdd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103699a.m67605c(view);
            }
        });
        tfj0.m190942e("e_roam_entrance", "p_discover_dating", new pf60[0]);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m67605c(View view) {
        tfj0.m190940c("e_roam_entrance", "p_discover_dating", new pf60[0]);
        if (getContext() instanceof Act) {
            nyh.m165325c((Act) getContext(), "p_discover_dating,e_roam_entrance,click");
        }
    }

    /* JADX INFO: renamed from: d */
    public void m67606d(String str) {
        if (this.f44336a == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (str.length() <= 4) {
            this.f44336a.setText(str);
        } else {
            this.f44336a.setText(str.substring(0, 4).concat("…"));
        }
    }

    public RoamEntranceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67604b(context);
    }

    public RoamEntranceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67604b(context);
    }
}
