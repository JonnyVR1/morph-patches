package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.tantanapp.common.utils.NullChecker;
import p147v.VEditText;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.f30;
import p149l.f3c0;
import p149l.ijb0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qib0;
import p149l.sg5;
import p149l.v1h;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class CommentCheckMarkView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f43627a;

    /* JADX INFO: renamed from: b */
    public VEditText f43628b;

    /* JADX INFO: renamed from: c */
    public VText f43629c;

    /* JADX INFO: renamed from: d */
    public View f43630d;

    /* JADX INFO: renamed from: e */
    public boolean f43631e;

    /* JADX INFO: renamed from: f */
    public f30<Boolean, Integer> f43632f;

    public CommentCheckMarkView(Context context) {
        super(context);
        this.f43631e = false;
        this.f43632f = new f30() { // from class: l.mg5
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f133642a.m66599l((Boolean) obj, (Integer) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: i */
    public final void m66596i(View view) {
        sg5.m184033a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public Act m66597j() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m66598k() {
        xdl0.m208345M0(this.f43627a, true);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m66599l(Boolean bool, Integer num) {
        if (bool.booleanValue() && this.f43631e) {
            m66607t();
            e51.m114743H(m66597j(), new Runnable() { // from class: l.ng5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f138840a.m66598k();
                }
            }, 240L);
        } else {
            this.f43628b.setText((CharSequence) null);
            xdl0.m208345M0(this.f43627a, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m66600m(CharSequence charSequence) {
        Editable text = this.f43628b.getText();
        this.f43629c.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean m66601n(View view, MotionEvent motionEvent) {
        if (this.f43627a.getVisibility() == 0) {
            this.f43631e = false;
            m66597j().hideInput(this.f43628b);
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m66602o(d30 d30Var, MomentMessage momentMessage) {
        this.f43628b.setText((CharSequence) null);
        lsi0.m151587q(m66597j().getString(R$string.f38919J3), m66597j().getResources().getDrawable(f3c0.f94467Z1));
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66596i(this);
        this.f43628b.mo28618i(true).subscribe(mkd0.m154955G(new e30() { // from class: l.kg5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123001a.m66600m((CharSequence) obj);
            }
        }));
        setOnTouchListener(new View.OnTouchListener() { // from class: l.lg5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f127948a.m66601n(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m66604q(final String str, final String str2, final d30 d30Var, View view) {
        final String strTrim = this.f43628b.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        if (qib0.f154711Z.m119125K(strTrim)) {
            v1h.m196636z0((Act) getContext(), new d30() { // from class: l.pg5
                @Override // p149l.d30
                public final void call() {
                    this.f148615a.m66603p(str, str2, strTrim, d30Var);
                }
            });
        } else {
            m66603p(str, str2, strTrim, d30Var);
        }
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m66603p(String str, String str2, String str3, final d30 d30Var) {
        if (ijb0.m136560X(str).unilateralBlock()) {
            this.f43628b.setText("");
            m66597j().hideInput(this.f43628b);
        } else {
            if (str3.isEmpty()) {
                return;
            }
            this.f43631e = false;
            m66597j().hideInput(this.f43628b);
            MomentMessage momentMessage = new MomentMessage();
            momentMessage.value = str3;
            momentMessage.moment = str2;
            FeedModule.f38854c.m60716b3(str, momentMessage).subscribe(mkd0.m154956H(new e30() { // from class: l.qg5
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f154308a.m66602o(d30Var, (MomentMessage) obj);
                }
            }, new e30() { // from class: l.rg5
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151593w(R$string.f38913I3);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m66606s(final String str, final String str2, final d30 d30Var) {
        this.f43629c.setOnClickListener(new View.OnClickListener() { // from class: l.og5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143818a.m66604q(str, str2, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m66607t() {
        xdl0.m208320A(this.f43628b);
        m66597j().showInput(this.f43628b, 0);
        this.f43631e = true;
    }

    public CommentCheckMarkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43631e = false;
        this.f43632f = new f30() { // from class: l.mg5
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f133642a.m66599l((Boolean) obj, (Integer) obj2);
            }
        };
    }

    public CommentCheckMarkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43631e = false;
        this.f43632f = new f30() { // from class: l.mg5
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f133642a.m66599l((Boolean) obj, (Integer) obj2);
            }
        };
    }
}
