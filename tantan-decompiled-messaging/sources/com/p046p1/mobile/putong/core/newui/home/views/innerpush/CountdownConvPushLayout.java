package com.p046p1.mobile.putong.core.newui.home.views.innerpush;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;
import com.p046p1.mobile.putong.core.newui.home.views.innerpush.CountdownConvPushLayout;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hqb;
import p149l.nd2;
import p149l.qib0;
import p149l.qsm;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class CountdownConvPushLayout extends FrameLayout implements qsm {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24071a;

    /* JADX INFO: renamed from: b */
    public VText f24072b;

    /* JADX INFO: renamed from: c */
    public VText f24073c;

    public CountdownConvPushLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m39231b(String str, CoreInnerPush.C4716a c4716a, Act act, View view) {
        zvf0.m220396r("e_app_specialguest", str);
        nd2.m158964j().m158967e(c4716a.f19181g);
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m39786N5(TabName.Msg);
        }
    }

    @Override // p149l.qsm
    /* JADX INFO: renamed from: a */
    public void mo39229a(final Act act, final CoreInnerPush.C4716a c4716a, TabName tabName, Frag frag) {
        if (c4716a.f19179e) {
            qib0.f154691G.m102336O(this.f24071a, c4716a.f19177c, 2, 10);
        } else {
            qib0.f154691G.m102331L0(this.f24071a, c4716a.f19177c);
        }
        this.f24072b.setText(c4716a.f19175a);
        final String strMo60379oh = "p_suggest_users_home_view";
        if (tabName != TabName.Card) {
            if (tabName == TabName.Msg) {
                strMo60379oh = OMSDialogPositon.p_messages_view;
            } else if (tabName == TabName.Moment) {
                strMo60379oh = CoreModule.m29934N().mo60379oh(frag);
            } else if (tabName == TabName.Me) {
                strMo60379oh = OMSDialogPositon.p_navigation_view;
            }
        }
        zvf0.m220402x("e_app_specialguest", strMo60379oh);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.gqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CountdownConvPushLayout.m39231b(strMo60379oh, c4716a, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m39232c(View view) {
        hqb.m132444a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39232c(this);
        this.f24072b.getPaint().setFakeBoldText(true);
        this.f24073c.getPaint().setFakeBoldText(true);
    }

    public CountdownConvPushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CountdownConvPushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
