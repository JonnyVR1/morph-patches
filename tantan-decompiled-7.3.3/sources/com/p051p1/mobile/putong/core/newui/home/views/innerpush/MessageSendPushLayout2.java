package com.p051p1.mobile.putong.core.newui.home.views.innerpush;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;
import com.p051p1.mobile.putong.core.newui.home.views.innerpush.MessageSendPushLayout2;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import p151v.VDraweeView;
import p151v.VText;
import p153l.b600;
import p153l.bnl0;
import p153l.sum;
import p153l.ud2;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class MessageSendPushLayout2 extends FrameLayout implements sum {

    /* JADX INFO: renamed from: a */
    public VText f24819a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f24820b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f24821c;

    /* JADX INFO: renamed from: d */
    public VText f24822d;

    /* JADX INFO: renamed from: e */
    public VText f24823e;

    /* JADX INFO: renamed from: f */
    public VText f24824f;

    public MessageSendPushLayout2(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m40238b(Act act, CoreInnerPush.C4867a c4867a, View view) {
        act.startActivity(MessagesAct.m50127l2(act, c4867a.f19921f, false, false, 1));
        ud2.m195456j().m195459e(c4867a.f19921f);
    }

    private void setImageIcon(CoreInnerPush.C4867a c4867a) {
        if (TextUtils.isEmpty(c4867a.f19918c)) {
            if (c4867a.f19919d > 0) {
                bnl0.m105524M(this.f24820b, true);
                this.f24820b.setImageResource(c4867a.f19919d);
                return;
            }
            return;
        }
        bnl0.m105524M(this.f24820b, true);
        if (c4867a.f19920e) {
            uqb0.f180374G.m127120O(this.f24820b, c4867a.f19918c, 2, 10);
        } else {
            uqb0.f180374G.m127115L0(this.f24820b, c4867a.f19918c);
        }
    }

    @Override // p153l.sum
    /* JADX INFO: renamed from: a */
    public void mo40232a(@NonNull final Act act, @NonNull final CoreInnerPush.C4867a c4867a, TabName tabName, Frag frag) {
        bnl0.m105524M(this.f24819a, false);
        bnl0.m105524M(this.f24820b, false);
        bnl0.m105524M(this.f24822d, false);
        bnl0.m105524M(this.f24823e, false);
        bnl0.m105524M(this.f24824f, false);
        bnl0.m105524M(this.f24821c, false);
        if ((!TextUtils.isEmpty(c4867a.f19918c) || c4867a.f19919d > 0) && !TextUtils.isEmpty(c4867a.f19916a) && !TextUtils.isEmpty(c4867a.f19917b)) {
            setImageIcon(c4867a);
            bnl0.m105524M(this.f24823e, true);
            this.f24823e.setText(c4867a.f19916a);
            this.f24823e.getPaint().setFakeBoldText(true);
            bnl0.m105524M(this.f24824f, true);
            this.f24824f.setText(c4867a.f19917b);
            bnl0.m105524M(this.f24821c, true);
        } else if ((!TextUtils.isEmpty(c4867a.f19918c) || c4867a.f19919d > 0) && !TextUtils.isEmpty(c4867a.f19916a)) {
            setImageIcon(c4867a);
            bnl0.m105524M(this.f24822d, true);
            this.f24822d.setText(c4867a.f19916a);
            this.f24822d.getPaint().setFakeBoldText(true);
            bnl0.m105524M(this.f24821c, true);
        } else if (!TextUtils.isEmpty(c4867a.f19916a)) {
            bnl0.m105524M(this.f24819a, true);
            this.f24819a.setText(c4867a.f19916a);
            this.f24819a.getPaint().setFakeBoldText(true);
        }
        if (TextUtils.isEmpty(c4867a.f19921f)) {
            return;
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.a600
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageSendPushLayout2.m40238b(act, c4867a, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m40239c(View view) {
        b600.m102691a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40239c(this);
    }

    public MessageSendPushLayout2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageSendPushLayout2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
