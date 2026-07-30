package com.p000p1.mobile.putong.core.newui.home.views.innerpush;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.views.innerpush.CountdownConvPushLayout;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreInnerPush;
import l.hqb;
import l.nd2;
import l.qib0;
import l.xdl0;
import l.zvf0;
import p009l.qsm;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CountdownConvPushLayout extends FrameLayout implements qsm {

    /* JADX INFO: renamed from: a */
    public VDraweeView f2849a;

    /* JADX INFO: renamed from: b */
    public VText f2850b;

    /* JADX INFO: renamed from: c */
    public VText f2851c;

    public CountdownConvPushLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3249b(String str, CoreInnerPush.a aVar, Act act, View view) {
        zvf0.r("e_app_specialguest", str);
        nd2.j().e(aVar.g);
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m3862N5(TabName.Msg);
        }
    }

    @Override // p009l.qsm
    /* JADX INFO: renamed from: a */
    public void mo3247a(final Act act, final CoreInnerPush.a aVar, TabName tabName, Frag frag) {
        if (aVar.e) {
            qib0.G.O(this.f2849a, aVar.c, 2, 10);
        } else {
            qib0.G.L0(this.f2849a, aVar.c);
        }
        this.f2850b.setText(aVar.a);
        final String strOh = "p_suggest_users_home_view";
        if (tabName != TabName.Card) {
            if (tabName == TabName.Msg) {
                strOh = "p_messages_view";
            } else if (tabName == TabName.Moment) {
                strOh = CoreModule.N().oh(frag);
            } else if (tabName == TabName.Me) {
                strOh = "p_navigation_view";
            }
        }
        zvf0.x("e_app_specialguest", strOh);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.gqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CountdownConvPushLayout.m3249b(strOh, aVar, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m3250c(View view) {
        hqb.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3250c(this);
        this.f2850b.getPaint().setFakeBoldText(true);
        this.f2851c.getPaint().setFakeBoldText(true);
    }

    public CountdownConvPushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CountdownConvPushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
