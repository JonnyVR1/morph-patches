package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.xdl0;
import p007l.f3c0;
import p007l.ijb0;
import p007l.sg5;
import p007l.v1h;
import v.VEditText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CommentCheckMarkView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f5088a;

    /* JADX INFO: renamed from: b */
    public VEditText f5089b;

    /* JADX INFO: renamed from: c */
    public VText f5090c;

    /* JADX INFO: renamed from: d */
    public View f5091d;

    /* JADX INFO: renamed from: e */
    public boolean f5092e;

    /* JADX INFO: renamed from: f */
    public f30<Boolean, Integer> f5093f;

    public CommentCheckMarkView(Context context) {
        super(context);
        this.f5092e = false;
        this.f5093f = new f30() { // from class: l.mg5
            public final void call(Object obj, Object obj2) {
                this.f10460a.m7790l((Boolean) obj, (Integer) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: i */
    public final void m7787i(View view) {
        sg5.m14223a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public Act m7788j() {
        return getContext();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m7789k() {
        xdl0.M0(this.f5088a, true);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m7790l(Boolean bool, Integer num) {
        if (bool.booleanValue() && this.f5092e) {
            m7798t();
            e51.H(m7788j(), new Runnable() { // from class: l.ng5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10799a.m7789k();
                }
            }, 240L);
        } else {
            this.f5089b.setText(null);
            xdl0.M0(this.f5088a, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m7791m(CharSequence charSequence) {
        Editable text = this.f5089b.getText();
        this.f5090c.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean m7792n(View view, MotionEvent motionEvent) {
        if (this.f5088a.getVisibility() == 0) {
            this.f5092e = false;
            m7788j().hideInput(this.f5089b);
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m7793o(d30 d30Var, MomentMessage momentMessage) {
        this.f5089b.setText(null);
        lsi0.q(m7788j().getString(R$string.f380J3), m7788j().getResources().getDrawable(f3c0.f7750Z1));
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7787i(this);
        this.f5089b.i(true).subscribe(mkd0.G(new e30() { // from class: l.kg5
            public final void call(Object obj) {
                this.f9710a.m7791m((CharSequence) obj);
            }
        }));
        setOnTouchListener(new View.OnTouchListener() { // from class: l.lg5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f10027a.m7792n(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m7795q(final String str, final String str2, final d30 d30Var, View view) {
        final String strTrim = this.f5089b.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        if (qib0.Z.K(strTrim)) {
            v1h.m15275z0(getContext(), new d30() { // from class: l.pg5
                public final void call() {
                    this.f11832a.m7794p(str, str2, strTrim, d30Var);
                }
            });
        } else {
            m7794p(str, str2, strTrim, d30Var);
        }
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m7794p(String str, String str2, String str3, final d30 d30Var) {
        if (ijb0.m10913X(str).unilateralBlock()) {
            this.f5089b.setText("");
            m7788j().hideInput(this.f5089b);
        } else {
            if (str3.isEmpty()) {
                return;
            }
            this.f5092e = false;
            m7788j().hideInput(this.f5089b);
            MomentMessage momentMessage = new MomentMessage();
            momentMessage.value = str3;
            momentMessage.moment = str2;
            FeedModule.f315c.m1642b3(str, momentMessage).subscribe(mkd0.H(new e30() { // from class: l.qg5
                public final void call(Object obj) {
                    this.f12232a.m7793o(d30Var, (MomentMessage) obj);
                }
            }, new e30() { // from class: l.rg5
                public final void call(Object obj) {
                    lsi0.w(R$string.f374I3);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m7797s(final String str, final String str2, final d30 d30Var) {
        this.f5090c.setOnClickListener(new View.OnClickListener() { // from class: l.og5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11468a.m7795q(str, str2, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m7798t() {
        xdl0.A(this.f5089b);
        m7788j().showInput(this.f5089b, 0);
        this.f5092e = true;
    }

    public CommentCheckMarkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5092e = false;
        this.f5093f = new f30() { // from class: l.mg5
            public final void call(Object obj, Object obj2) {
                this.f10460a.m7790l((Boolean) obj, (Integer) obj2);
            }
        };
    }

    public CommentCheckMarkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5092e = false;
        this.f5093f = new f30() { // from class: l.mg5
            public final void call(Object obj, Object obj2) {
                this.f10460a.m7790l((Boolean) obj, (Integer) obj2);
            }
        };
    }
}
