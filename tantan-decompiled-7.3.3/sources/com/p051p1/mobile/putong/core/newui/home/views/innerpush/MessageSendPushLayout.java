package com.p051p1.mobile.putong.core.newui.home.views.innerpush;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;
import com.p051p1.mobile.putong.core.newui.home.views.innerpush.MessageSendPushLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.c600;
import p153l.sum;
import p153l.ud2;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class MessageSendPushLayout extends FrameLayout implements sum {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24816a;

    /* JADX INFO: renamed from: b */
    public VText f24817b;

    /* JADX INFO: renamed from: c */
    public VText f24818c;

    public MessageSendPushLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m40236b(Act act, CoreInnerPush.C4867a c4867a, View view) {
        act.startActivity(MessagesAct.m50127l2(act, c4867a.f19921f, false, false, 1));
        ud2.m195456j().m195459e(c4867a.f19921f);
    }

    @Override // p153l.sum
    /* JADX INFO: renamed from: a */
    public void mo40232a(final Act act, final CoreInnerPush.C4867a c4867a, TabName tabName, Frag frag) {
        if (TextUtils.isEmpty(c4867a.f19918c)) {
            int i = c4867a.f19919d;
            VDraweeView vDraweeView = this.f24816a;
            if (i > 0) {
                bnl0.m105524M(vDraweeView, true);
                this.f24816a.setImageResource(c4867a.f19919d);
            } else {
                bnl0.m105524M(vDraweeView, false);
            }
        } else {
            bnl0.m105524M(this.f24816a, true);
            if (c4867a.f19920e) {
                uqb0.f180374G.m127120O(this.f24816a, c4867a.f19918c, 2, 10);
            } else {
                uqb0.f180374G.m127115L0(this.f24816a, c4867a.f19918c);
            }
        }
        if (!TextUtils.isEmpty(c4867a.f19916a)) {
            bnl0.m105524M(this.f24817b, true);
            this.f24817b.setText(c4867a.f19916a);
            this.f24817b.getPaint().setFakeBoldText(true);
        }
        if (!TextUtils.isEmpty(c4867a.f19917b)) {
            bnl0.m105524M(this.f24818c, true);
            this.f24818c.setText(c4867a.f19917b);
            this.f24818c.getPaint().setFakeBoldText(true);
        }
        if (TextUtils.isEmpty(c4867a.f19921f)) {
            return;
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.z500
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageSendPushLayout.m40236b(act, c4867a, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m40237c(View view) {
        c600.m108088a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40237c(this);
    }

    public MessageSendPushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageSendPushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
