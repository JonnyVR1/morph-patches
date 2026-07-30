package com.p000p1.mobile.putong.core.newui.home.views.innerpush;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.views.innerpush.MessageSendPushLayout2;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.api.CoreInnerPush;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import l.exz;
import l.nd2;
import l.qib0;
import l.xdl0;
import p009l.qsm;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MessageSendPushLayout2 extends FrameLayout implements qsm {

    /* JADX INFO: renamed from: a */
    public VText f2855a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f2856b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f2857c;

    /* JADX INFO: renamed from: d */
    public VText f2858d;

    /* JADX INFO: renamed from: e */
    public VText f2859e;

    /* JADX INFO: renamed from: f */
    public VText f2860f;

    public MessageSendPushLayout2(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3253b(Act act, CoreInnerPush.a aVar, View view) {
        act.startActivity(MessagesAct.k2(act, aVar.f, false, false, 1));
        nd2.j().e(aVar.f);
    }

    private void setImageIcon(CoreInnerPush.a aVar) {
        if (TextUtils.isEmpty(aVar.c)) {
            if (aVar.d > 0) {
                xdl0.M(this.f2856b, true);
                this.f2856b.setImageResource(aVar.d);
                return;
            }
            return;
        }
        xdl0.M(this.f2856b, true);
        if (aVar.e) {
            qib0.G.O(this.f2856b, aVar.c, 2, 10);
        } else {
            qib0.G.L0(this.f2856b, aVar.c);
        }
    }

    @Override // p009l.qsm
    /* JADX INFO: renamed from: a */
    public void mo3247a(@NonNull final Act act, @NonNull final CoreInnerPush.a aVar, TabName tabName, Frag frag) {
        xdl0.M(this.f2855a, false);
        xdl0.M(this.f2856b, false);
        xdl0.M(this.f2858d, false);
        xdl0.M(this.f2859e, false);
        xdl0.M(this.f2860f, false);
        xdl0.M(this.f2857c, false);
        if ((!TextUtils.isEmpty(aVar.c) || aVar.d > 0) && !TextUtils.isEmpty(aVar.a) && !TextUtils.isEmpty(aVar.b)) {
            setImageIcon(aVar);
            xdl0.M(this.f2859e, true);
            this.f2859e.setText(aVar.a);
            this.f2859e.getPaint().setFakeBoldText(true);
            xdl0.M(this.f2860f, true);
            this.f2860f.setText(aVar.b);
            xdl0.M(this.f2857c, true);
        } else if ((!TextUtils.isEmpty(aVar.c) || aVar.d > 0) && !TextUtils.isEmpty(aVar.a)) {
            setImageIcon(aVar);
            xdl0.M(this.f2858d, true);
            this.f2858d.setText(aVar.a);
            this.f2858d.getPaint().setFakeBoldText(true);
            xdl0.M(this.f2857c, true);
        } else if (!TextUtils.isEmpty(aVar.a)) {
            xdl0.M(this.f2855a, true);
            this.f2855a.setText(aVar.a);
            this.f2855a.getPaint().setFakeBoldText(true);
        }
        if (TextUtils.isEmpty(aVar.f)) {
            return;
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.dxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageSendPushLayout2.m3253b(act, aVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m3254c(View view) {
        exz.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3254c(this);
    }

    public MessageSendPushLayout2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageSendPushLayout2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
