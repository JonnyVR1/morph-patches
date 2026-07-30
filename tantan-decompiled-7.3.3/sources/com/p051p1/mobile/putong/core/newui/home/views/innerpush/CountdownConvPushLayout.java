package com.p051p1.mobile.putong.core.newui.home.views.innerpush;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;
import com.p051p1.mobile.putong.core.newui.home.views.innerpush.CountdownConvPushLayout;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.sum;
import p153l.ud2;
import p153l.uqb0;
import p153l.vrb;

/* JADX INFO: loaded from: classes11.dex */
public class CountdownConvPushLayout extends FrameLayout implements sum {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24813a;

    /* JADX INFO: renamed from: b */
    public VText f24814b;

    /* JADX INFO: renamed from: c */
    public VText f24815c;

    public CountdownConvPushLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m40234b(String str, CoreInnerPush.C4867a c4867a, Act act, View view) {
        i4g0.m138520r("e_app_specialguest", str);
        ud2.m195456j().m195459e(c4867a.f19922g);
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m40796R5(TabName.Msg);
        }
    }

    @Override // p153l.sum
    /* JADX INFO: renamed from: a */
    public void mo40232a(final Act act, final CoreInnerPush.C4867a c4867a, TabName tabName, Frag frag) {
        if (c4867a.f19920e) {
            uqb0.f180374G.m127120O(this.f24813a, c4867a.f19918c, 2, 10);
        } else {
            uqb0.f180374G.m127115L0(this.f24813a, c4867a.f19918c);
        }
        this.f24814b.setText(c4867a.f19916a);
        final String strMo61563oh = "p_suggest_users_home_view";
        if (tabName != TabName.Card) {
            if (tabName == TabName.Msg) {
                strMo61563oh = OMSDialogPositon.p_messages_view;
            } else if (tabName == TabName.Moment) {
                strMo61563oh = CoreModule.m30932N().mo61563oh(frag);
            } else if (tabName == TabName.Me) {
                strMo61563oh = OMSDialogPositon.p_navigation_view;
            }
        }
        i4g0.m138526x("e_app_specialguest", strMo61563oh);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.urb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CountdownConvPushLayout.m40234b(strMo61563oh, c4867a, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m40235c(View view) {
        vrb.m202480a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40235c(this);
        this.f24814b.getPaint().setFakeBoldText(true);
        this.f24815c.getPaint().setFakeBoldText(true);
    }

    public CountdownConvPushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CountdownConvPushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
