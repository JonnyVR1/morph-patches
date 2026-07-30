package com.p000p1.mobile.putong.core.newui.home.views.innerpush;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.views.innerpush.MessageSendPushLayout;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.api.CoreInnerPush;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import l.fxz;
import l.nd2;
import l.qib0;
import l.xdl0;
import p009l.qsm;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MessageSendPushLayout extends FrameLayout implements qsm {

    /* JADX INFO: renamed from: a */
    public VDraweeView f2852a;

    /* JADX INFO: renamed from: b */
    public VText f2853b;

    /* JADX INFO: renamed from: c */
    public VText f2854c;

    public MessageSendPushLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3251b(Act act, CoreInnerPush.a aVar, View view) {
        act.startActivity(MessagesAct.k2(act, aVar.f, false, false, 1));
        nd2.j().e(aVar.f);
    }

    @Override // p009l.qsm
    /* JADX INFO: renamed from: a */
    public void mo3247a(final Act act, final CoreInnerPush.a aVar, TabName tabName, Frag frag) {
        if (TextUtils.isEmpty(aVar.c)) {
            int i = aVar.d;
            VDraweeView vDraweeView = this.f2852a;
            if (i > 0) {
                xdl0.M(vDraweeView, true);
                this.f2852a.setImageResource(aVar.d);
            } else {
                xdl0.M(vDraweeView, false);
            }
        } else {
            xdl0.M(this.f2852a, true);
            if (aVar.e) {
                qib0.G.O(this.f2852a, aVar.c, 2, 10);
            } else {
                qib0.G.L0(this.f2852a, aVar.c);
            }
        }
        if (!TextUtils.isEmpty(aVar.a)) {
            xdl0.M(this.f2853b, true);
            this.f2853b.setText(aVar.a);
            this.f2853b.getPaint().setFakeBoldText(true);
        }
        if (!TextUtils.isEmpty(aVar.b)) {
            xdl0.M(this.f2854c, true);
            this.f2854c.setText(aVar.b);
            this.f2854c.getPaint().setFakeBoldText(true);
        }
        if (TextUtils.isEmpty(aVar.f)) {
            return;
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.cxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageSendPushLayout.m3251b(act, aVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m3252c(View view) {
        fxz.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3252c(this);
    }

    public MessageSendPushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageSendPushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
