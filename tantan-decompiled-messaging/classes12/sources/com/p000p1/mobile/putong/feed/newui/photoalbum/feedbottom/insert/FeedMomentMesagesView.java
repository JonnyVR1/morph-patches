package com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.CommentInfo;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.eqh0;
import l.i0g0;
import l.mkd0;
import l.roj0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.b5c0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.hx60;
import p007l.j2i;
import p007l.p6j0;
import p007l.vqg;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMomentMesagesView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f3251a;

    /* JADX INFO: renamed from: b */
    public VText f3252b;

    /* JADX INFO: renamed from: c */
    public VText f3253c;

    /* JADX INFO: renamed from: d */
    public ImageView f3254d;

    /* JADX INFO: renamed from: e */
    public Moment f3255e;

    /* JADX INFO: renamed from: f */
    public MomentMessage f3256f;

    public FeedMomentMesagesView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m5673g() {
        this.f3251a = findViewById(b5c0.f5990P0);
        this.f3252b = findViewById(b5c0.f6008V0);
        this.f3253c = findViewById(b5c0.f5993Q0);
        this.f3254d = (ImageView) findViewById(b5c0.f5996R0);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m5674h(Moment moment, String str, MomentMessage momentMessage, Act act, View view) {
        j2i.m11068b(moment, str, vqg.m15485K(str, false), "comment", ((CopyObject) momentMessage).id);
        Intent intentM5932b = MomentDetailAct.C2150a.m5931a(getContext()).m5936f(str).m5943m(((DbObject) moment).id).m5944n(moment.owner).m5950t(true).m5945o(moment.momentValue).m5951u(true).m5934d(((CopyObject) this.f3256f).id).m5932b();
        if (intentM5932b == null) {
            return;
        }
        act.startActivity(intentM5932b);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m5675i() {
        Rect rect = new Rect();
        this.f3254d.getHitRect(rect);
        int i = rect.top;
        int i2 = t100.l;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        ((View) this.f3254d.getParent()).setTouchDelegate(new TouchDelegate(rect, this.f3254d));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m5676j(roj0 roj0Var) {
        MomentMessage momentMessage = this.f3256f;
        CommentInfo commentInfo = momentMessage.commentInfo;
        boolean z = commentInfo.liked;
        commentInfo.liked = !z;
        if (z) {
            commentInfo.likes--;
        } else {
            commentInfo.likes++;
        }
        FeedModule.f316d.f14925H0.put(((CopyObject) momentMessage).id, momentMessage);
        m5680n(this.f3256f);
        m5681o(this.f3256f);
        FeedModule.f316d.f14949R0.onNext(((CopyObject) this.f3256f).id);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m5677k(String str, Moment moment, MomentMessage momentMessage, Act act, hx60 hx60Var, View view) {
        if (!this.f3256f.commentInfo.liked) {
            p6j0.m12912b("e_comment_like", vqg.m15485K(str, false), p6j0.C2456a.m12922g("moment_id", ((DbObject) moment).id), p6j0.C2456a.m12922g("owner_id", moment.owner), p6j0.C2456a.m12922g("comment_id", ((CopyObject) momentMessage).id));
        }
        String str2 = moment.owner;
        String str3 = ((DbObject) moment).id;
        MomentMessage momentMessage2 = this.f3256f;
        act.duringCreated(hx60Var.m10748u(str2, str3, ((CopyObject) momentMessage2).id, !momentMessage2.commentInfo.liked)).subscribe(mkd0.H(new e30() { // from class: l.hfh
            public final void call(Object obj) {
                this.f8693a.m5676j((roj0) obj);
            }
        }, new e30() { // from class: l.ifh
            public final void call(Object obj) {
                t2h.m14427g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m5678l(String str) {
        MomentMessage momentMessage = FeedModule.f316d.f14925H0.get(((CopyObject) this.f3256f).id);
        this.f3256f = momentMessage;
        m5680n(momentMessage);
        m5681o(this.f3256f);
    }

    /* JADX INFO: renamed from: m */
    public void m5679m(final Act act, final Moment moment, final MomentMessage momentMessage, String str, final String str2, final hx60 hx60Var) {
        this.f3255e = moment;
        this.f3256f = momentMessage;
        this.f3252b.setText(i0g0.b0("热评 " + this.f3256f.value, vwb.M("热评"), getResources().getColor(e1c0.f7105D), eqh0.c(3)));
        m5681o(this.f3256f);
        m5680n(this.f3256f);
        xdl0.E0(this.f3251a, new View.OnClickListener() { // from class: l.dfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6915a.m5674h(moment, str2, momentMessage, act, view);
            }
        });
        if (NullChecker.a(this.f3254d.getParent()) && ((View) this.f3254d.getParent()).getTouchDelegate() == null) {
            this.f3254d.post(new Runnable() { // from class: l.efh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7344a.m5675i();
                }
            });
        }
        xdl0.E0(this.f3254d, new View.OnClickListener() { // from class: l.ffh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8082a.m5677k(str2, moment, momentMessage, act, hx60Var, view);
            }
        });
        act.duringCreated(FeedModule.f316d.f14949R0).subscribe(mkd0.G(new e30() { // from class: l.gfh
            public final void call(Object obj) {
                this.f8441a.m5678l((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final void m5680n(MomentMessage momentMessage) {
        this.f3254d.setImageResource(momentMessage.commentInfo.liked ? f3c0.f7687Q1 : f3c0.f7694R1);
    }

    /* JADX INFO: renamed from: o */
    public final void m5681o(MomentMessage momentMessage) {
        this.f3253c.getPaint().setFakeBoldText(true);
        boolean z = momentMessage.commentInfo.liked;
        VText vText = this.f3253c;
        if (z) {
            vText.setTextColor(getResources().getColor(e1c0.f7105D));
        } else {
            vText.setTextColor(getResources().getColor(e1c0.f7160q));
        }
        this.f3253c.setText(i0g0.h0(momentMessage.commentInfo.likes));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5673g();
    }

    public FeedMomentMesagesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedMomentMesagesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FeedMomentMesagesView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
