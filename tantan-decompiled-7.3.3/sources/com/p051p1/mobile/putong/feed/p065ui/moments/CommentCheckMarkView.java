package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.tantanapp.common.utils.NullChecker;
import p151v.VEditText;
import p151v.VText;
import p153l.bnl0;
import p153l.k3h;
import p153l.l51;
import p153l.lbc0;
import p153l.mrb0;
import p153l.o1j0;
import p153l.psd0;
import p153l.sh5;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class CommentCheckMarkView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f44475a;

    /* JADX INFO: renamed from: b */
    public VEditText f44476b;

    /* JADX INFO: renamed from: c */
    public VText f44477c;

    /* JADX INFO: renamed from: d */
    public View f44478d;

    /* JADX INFO: renamed from: e */
    public boolean f44479e;

    /* JADX INFO: renamed from: f */
    public z20<Boolean, Integer> f44480f;

    public CommentCheckMarkView(Context context) {
        super(context);
        this.f44479e = false;
        this.f44480f = new z20() { // from class: l.mh5
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f136827a.m67782l((Boolean) obj, (Integer) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: i */
    public final void m67779i(View view) {
        sh5.m185860a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public Act m67780j() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m67781k() {
        bnl0.m105525M0(this.f44475a, true);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m67782l(Boolean bool, Integer num) {
        if (bool.booleanValue() && this.f44479e) {
            m67790t();
            l51.m152888H(m67780j(), new Runnable() { // from class: l.nh5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f141926a.m67781k();
                }
            }, 240L);
        } else {
            this.f44476b.setText((CharSequence) null);
            bnl0.m105525M0(this.f44475a, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m67783m(CharSequence charSequence) {
        Editable text = this.f44476b.getText();
        this.f44477c.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean m67784n(View view, MotionEvent motionEvent) {
        if (this.f44475a.getVisibility() == 0) {
            this.f44479e = false;
            m67780j().hideInput(this.f44476b);
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m67785o(x20 x20Var, MomentMessage momentMessage) {
        this.f44476b.setText((CharSequence) null);
        o1j0.m165643q(m67780j().getString(R$string.f39767J3), m67780j().getResources().getDrawable(lbc0.f130985Z1));
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67779i(this);
        this.f44476b.mo29617i(true).subscribe(psd0.m173596G(new y20() { // from class: l.kh5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126695a.m67783m((CharSequence) obj);
            }
        }));
        setOnTouchListener(new View.OnTouchListener() { // from class: l.lh5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f132070a.m67784n(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m67787q(final String str, final String str2, final x20 x20Var, View view) {
        final String strTrim = this.f44476b.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        if (uqb0.f180394Z.m95954K(strTrim)) {
            k3h.m148113z0((Act) getContext(), new x20() { // from class: l.ph5
                @Override // p153l.x20
                public final void call() {
                    this.f152395a.m67786p(str, str2, strTrim, x20Var);
                }
            });
        } else {
            m67786p(str, str2, strTrim, x20Var);
        }
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m67786p(String str, String str2, String str3, final x20 x20Var) {
        if (mrb0.m159646X(str).unilateralBlock()) {
            this.f44476b.setText("");
            m67780j().hideInput(this.f44476b);
        } else {
            if (str3.isEmpty()) {
                return;
            }
            this.f44479e = false;
            m67780j().hideInput(this.f44476b);
            MomentMessage momentMessage = new MomentMessage();
            momentMessage.value = str3;
            momentMessage.moment = str2;
            FeedModule.f39702c.m61900b3(str, momentMessage).subscribe(psd0.m173597H(new y20() { // from class: l.qh5
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f157505a.m67785o(x20Var, (MomentMessage) obj);
                }
            }, new y20() { // from class: l.rh5
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165649w(R$string.f39761I3);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m67789s(final String str, final String str2, final x20 x20Var) {
        this.f44477c.setOnClickListener(new View.OnClickListener() { // from class: l.oh5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147342a.m67787q(str, str2, x20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m67790t() {
        bnl0.m105500A(this.f44476b);
        m67780j().showInput(this.f44476b, 0);
        this.f44479e = true;
    }

    public CommentCheckMarkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44479e = false;
        this.f44480f = new z20() { // from class: l.mh5
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f136827a.m67782l((Boolean) obj, (Integer) obj2);
            }
        };
    }

    public CommentCheckMarkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44479e = false;
        this.f44480f = new z20() { // from class: l.mh5
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f136827a.m67782l((Boolean) obj, (Integer) obj2);
            }
        };
    }
}
