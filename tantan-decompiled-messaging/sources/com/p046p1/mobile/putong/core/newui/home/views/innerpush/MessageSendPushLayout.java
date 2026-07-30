package com.p046p1.mobile.putong.core.newui.home.views.innerpush;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;
import com.p046p1.mobile.putong.core.newui.home.views.innerpush.MessageSendPushLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import p147v.VDraweeView;
import p147v.VText;
import p149l.fxz;
import p149l.nd2;
import p149l.qib0;
import p149l.qsm;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class MessageSendPushLayout extends FrameLayout implements qsm {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24074a;

    /* JADX INFO: renamed from: b */
    public VText f24075b;

    /* JADX INFO: renamed from: c */
    public VText f24076c;

    public MessageSendPushLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m39233b(Act act, CoreInnerPush.C4716a c4716a, View view) {
        act.startActivity(MessagesAct.m48944k2(act, c4716a.f19180f, false, false, 1));
        nd2.m158964j().m158967e(c4716a.f19180f);
    }

    @Override // p149l.qsm
    /* JADX INFO: renamed from: a */
    public void mo39229a(final Act act, final CoreInnerPush.C4716a c4716a, TabName tabName, Frag frag) {
        if (TextUtils.isEmpty(c4716a.f19177c)) {
            int i = c4716a.f19178d;
            VDraweeView vDraweeView = this.f24074a;
            if (i > 0) {
                xdl0.m208344M(vDraweeView, true);
                this.f24074a.setImageResource(c4716a.f19178d);
            } else {
                xdl0.m208344M(vDraweeView, false);
            }
        } else {
            xdl0.m208344M(this.f24074a, true);
            if (c4716a.f19179e) {
                qib0.f154691G.m102336O(this.f24074a, c4716a.f19177c, 2, 10);
            } else {
                qib0.f154691G.m102331L0(this.f24074a, c4716a.f19177c);
            }
        }
        if (!TextUtils.isEmpty(c4716a.f19175a)) {
            xdl0.m208344M(this.f24075b, true);
            this.f24075b.setText(c4716a.f19175a);
            this.f24075b.getPaint().setFakeBoldText(true);
        }
        if (!TextUtils.isEmpty(c4716a.f19176b)) {
            xdl0.m208344M(this.f24076c, true);
            this.f24076c.setText(c4716a.f19176b);
            this.f24076c.getPaint().setFakeBoldText(true);
        }
        if (TextUtils.isEmpty(c4716a.f19180f)) {
            return;
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.cxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageSendPushLayout.m39233b(act, c4716a, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m39234c(View view) {
        fxz.m123701a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39234c(this);
    }

    public MessageSendPushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageSendPushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
