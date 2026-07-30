package com.p046p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.newui.loveletter.LoveLetterEmptyLayout;
import com.p046p1.mobile.putong.data.NavigationIntent;
import p147v.AutoVDraweeView;
import p149l.hcw;
import p149l.qib0;
import p149l.t100;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterEmptyLayout extends LinearLayout {
    public LoveLetterEmptyLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m39589a(hcw hcwVar, View view) {
        hcwVar.act().startActivity(qib0.f154713b0.f139231b.toNewMainAct(hcwVar.act(), NavigationIntent.get("cards")));
        hcwVar.act().m66873d2();
    }

    /* JADX INFO: renamed from: b */
    public void m39590b(final hcw hcwVar) {
        int iM208408w0 = ((xdl0.m208408w0() - xdl0.m208331F0()) - t100.m186890d(480.0f)) - t100.m186890d(30.0f);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) findViewById(u4c0.f174562y3);
        autoVDraweeView.m222887x("https://auto.tancdn.com/v1/images/eyJpZCI6IkY2SU9MNVo0RkRHNFREWFkzNklTS1dKUk8zNEZNSTE0IiwidyI6Mjg4LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNDM1OTczODM2OH0.png", 1);
        if (iM208408w0 > t100.m186890d(208.0f)) {
            xdl0.m208325C0(this, iM208408w0);
            xdl0.m208360X(autoVDraweeView, ((iM208408w0 - t100.m186890d(218.0f)) / 2) + t100.m186890d(18.0f));
        }
        View viewFindViewById = findViewById(u4c0.f174494u3);
        if (viewFindViewById != null) {
            xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.yaw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoveLetterEmptyLayout.m39589a(hcwVar, view);
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
