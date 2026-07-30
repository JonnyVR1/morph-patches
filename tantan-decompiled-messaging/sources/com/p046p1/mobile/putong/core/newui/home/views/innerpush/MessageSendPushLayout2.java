package com.p046p1.mobile.putong.core.newui.home.views.innerpush;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;
import com.p046p1.mobile.putong.core.newui.home.views.innerpush.MessageSendPushLayout2;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import p147v.VDraweeView;
import p147v.VText;
import p149l.exz;
import p149l.nd2;
import p149l.qib0;
import p149l.qsm;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class MessageSendPushLayout2 extends FrameLayout implements qsm {

    /* JADX INFO: renamed from: a */
    public VText f24077a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f24078b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f24079c;

    /* JADX INFO: renamed from: d */
    public VText f24080d;

    /* JADX INFO: renamed from: e */
    public VText f24081e;

    /* JADX INFO: renamed from: f */
    public VText f24082f;

    public MessageSendPushLayout2(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m39235b(Act act, CoreInnerPush.C4716a c4716a, View view) {
        act.startActivity(MessagesAct.m48944k2(act, c4716a.f19180f, false, false, 1));
        nd2.m158964j().m158967e(c4716a.f19180f);
    }

    private void setImageIcon(CoreInnerPush.C4716a c4716a) {
        if (TextUtils.isEmpty(c4716a.f19177c)) {
            if (c4716a.f19178d > 0) {
                xdl0.m208344M(this.f24078b, true);
                this.f24078b.setImageResource(c4716a.f19178d);
                return;
            }
            return;
        }
        xdl0.m208344M(this.f24078b, true);
        if (c4716a.f19179e) {
            qib0.f154691G.m102336O(this.f24078b, c4716a.f19177c, 2, 10);
        } else {
            qib0.f154691G.m102331L0(this.f24078b, c4716a.f19177c);
        }
    }

    @Override // p149l.qsm
    /* JADX INFO: renamed from: a */
    public void mo39229a(@NonNull final Act act, @NonNull final CoreInnerPush.C4716a c4716a, TabName tabName, Frag frag) {
        xdl0.m208344M(this.f24077a, false);
        xdl0.m208344M(this.f24078b, false);
        xdl0.m208344M(this.f24080d, false);
        xdl0.m208344M(this.f24081e, false);
        xdl0.m208344M(this.f24082f, false);
        xdl0.m208344M(this.f24079c, false);
        if ((!TextUtils.isEmpty(c4716a.f19177c) || c4716a.f19178d > 0) && !TextUtils.isEmpty(c4716a.f19175a) && !TextUtils.isEmpty(c4716a.f19176b)) {
            setImageIcon(c4716a);
            xdl0.m208344M(this.f24081e, true);
            this.f24081e.setText(c4716a.f19175a);
            this.f24081e.getPaint().setFakeBoldText(true);
            xdl0.m208344M(this.f24082f, true);
            this.f24082f.setText(c4716a.f19176b);
            xdl0.m208344M(this.f24079c, true);
        } else if ((!TextUtils.isEmpty(c4716a.f19177c) || c4716a.f19178d > 0) && !TextUtils.isEmpty(c4716a.f19175a)) {
            setImageIcon(c4716a);
            xdl0.m208344M(this.f24080d, true);
            this.f24080d.setText(c4716a.f19175a);
            this.f24080d.getPaint().setFakeBoldText(true);
            xdl0.m208344M(this.f24079c, true);
        } else if (!TextUtils.isEmpty(c4716a.f19175a)) {
            xdl0.m208344M(this.f24077a, true);
            this.f24077a.setText(c4716a.f19175a);
            this.f24077a.getPaint().setFakeBoldText(true);
        }
        if (TextUtils.isEmpty(c4716a.f19180f)) {
            return;
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.dxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageSendPushLayout2.m39235b(act, c4716a, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m39236c(View view) {
        exz.m118709a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39236c(this);
    }

    public MessageSendPushLayout2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageSendPushLayout2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
