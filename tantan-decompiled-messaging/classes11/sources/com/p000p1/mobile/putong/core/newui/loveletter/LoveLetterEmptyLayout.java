package com.p000p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.loveletter.LoveLetterEmptyLayout;
import com.p1.mobile.putong.data.NavigationIntent;
import l.qib0;
import l.t100;
import l.u4c0;
import l.xdl0;
import p009l.hcw;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveLetterEmptyLayout extends LinearLayout {
    public LoveLetterEmptyLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3660a(hcw hcwVar, View view) {
        hcwVar.act().startActivity(qib0.b0.b.toNewMainAct(hcwVar.act(), NavigationIntent.get("cards")));
        hcwVar.act().finish();
    }

    /* JADX INFO: renamed from: b */
    public void m3661b(final hcw hcwVar) {
        int iW0 = ((xdl0.w0() - xdl0.F0()) - t100.d(480.0f)) - t100.d(30.0f);
        AutoVDraweeView autoVDraweeViewFindViewById = findViewById(u4c0.y3);
        autoVDraweeViewFindViewById.x("https://auto.tancdn.com/v1/images/eyJpZCI6IkY2SU9MNVo0RkRHNFREWFkzNklTS1dKUk8zNEZNSTE0IiwidyI6Mjg4LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNDM1OTczODM2OH0.png", 1);
        if (iW0 > t100.d(208.0f)) {
            xdl0.C0(this, iW0);
            xdl0.X(autoVDraweeViewFindViewById, ((iW0 - t100.d(218.0f)) / 2) + t100.d(18.0f));
        }
        View viewFindViewById = findViewById(u4c0.u3);
        if (viewFindViewById != null) {
            xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.yaw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoveLetterEmptyLayout.m3660a(hcwVar, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public LoveLetterEmptyLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterEmptyLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
