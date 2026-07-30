package com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.CommentInfo;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.b5c0;
import p149l.e1c0;
import p149l.e30;
import p149l.eqh0;
import p149l.f3c0;
import p149l.hx60;
import p149l.i0g0;
import p149l.j2i;
import p149l.mkd0;
import p149l.p6j0;
import p149l.roj0;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMomentMesagesView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f41790a;

    /* JADX INFO: renamed from: b */
    public VText f41791b;

    /* JADX INFO: renamed from: c */
    public VText f41792c;

    /* JADX INFO: renamed from: d */
    public ImageView f41793d;

    /* JADX INFO: renamed from: e */
    public Moment f41794e;

    /* JADX INFO: renamed from: f */
    public MomentMessage f41795f;

    public FeedMomentMesagesView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m64579g() {
        this.f41790a = findViewById(b5c0.f73509P0);
        this.f41791b = (VText) findViewById(b5c0.f73527V0);
        this.f41792c = (VText) findViewById(b5c0.f73512Q0);
        this.f41793d = (ImageView) findViewById(b5c0.f73515R0);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m64580h(Moment moment, String str, MomentMessage momentMessage, Act act, View view) {
        j2i.m139463b(moment, str, vqg.m199515K(str, false), "comment", momentMessage.f56008id);
        Intent intentM64835b = MomentDetailAct.C11306a.m64834a(getContext()).m64839f(str).m64846m(moment.f56011id).m64847n(moment.owner).m64853t(true).m64848o(moment.momentValue).m64854u(true).m64837d(this.f41795f.f56008id).m64835b();
        if (intentM64835b == null) {
            return;
        }
        act.startActivity(intentM64835b);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m64581i() {
        Rect rect = new Rect();
        this.f41793d.getHitRect(rect);
        int i = rect.top;
        int i2 = t100.f167263l;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        ((View) this.f41793d.getParent()).setTouchDelegate(new TouchDelegate(rect, this.f41793d));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m64582j(roj0 roj0Var) {
        MomentMessage momentMessage = this.f41795f;
        CommentInfo commentInfo = momentMessage.commentInfo;
        boolean z = commentInfo.liked;
        commentInfo.liked = !z;
        if (z) {
            commentInfo.likes--;
        } else {
            commentInfo.likes++;
        }
        FeedModule.f38855d.f192990H0.put(momentMessage.f56008id, momentMessage);
        m64586n(this.f41795f);
        m64587o(this.f41795f);
        FeedModule.f38855d.f193014R0.onNext(this.f41795f.f56008id);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m64583k(String str, Moment moment, MomentMessage momentMessage, Act act, hx60 hx60Var, View view) {
        if (!this.f41795f.commentInfo.liked) {
            p6j0.m167668b("e_comment_like", vqg.m199515K(str, false), p6j0.C19147a.m167678g("moment_id", moment.f56011id), p6j0.C19147a.m167678g("owner_id", moment.owner), p6j0.C19147a.m167678g("comment_id", momentMessage.f56008id));
        }
        String str2 = moment.owner;
        String str3 = moment.f56011id;
        MomentMessage momentMessage2 = this.f41795f;
        act.duringCreated(hx60Var.m133313u(str2, str3, momentMessage2.f56008id, !momentMessage2.commentInfo.liked)).subscribe(mkd0.m154956H(new e30() { // from class: l.hfh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107480a.m64582j((roj0) obj);
            }
        }, new e30() { // from class: l.ifh
            @Override // p149l.e30
            public final void call(Object obj) {
                t2h.m186976g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m64584l(String str) {
        MomentMessage momentMessage = FeedModule.f38855d.f192990H0.get(this.f41795f.f56008id);
        this.f41795f = momentMessage;
        m64586n(momentMessage);
        m64587o(this.f41795f);
    }

    /* JADX INFO: renamed from: m */
    public void m64585m(final Act act, final Moment moment, final MomentMessage momentMessage, String str, final String str2, final hx60 hx60Var) {
        this.f41794e = moment;
        this.f41795f = momentMessage;
        this.f41791b.setText(i0g0.m133861b0("热评 " + this.f41795f.value, vwb.m200299M("热评"), getResources().getColor(e1c0.f88749D), eqh0.m117752c(3)));
        m64587o(this.f41795f);
        m64586n(this.f41795f);
        xdl0.m208329E0(this.f41790a, new View.OnClickListener() { // from class: l.dfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85942a.m64580h(moment, str2, momentMessage, act, view);
            }
        });
        if (NullChecker.m81303a(this.f41793d.getParent()) && ((View) this.f41793d.getParent()).getTouchDelegate() == null) {
            this.f41793d.post(new Runnable() { // from class: l.efh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f90830a.m64581i();
                }
            });
        }
        xdl0.m208329E0(this.f41793d, new View.OnClickListener() { // from class: l.ffh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97260a.m64583k(str2, moment, momentMessage, act, hx60Var, view);
            }
        });
        act.duringCreated(FeedModule.f38855d.f193014R0).subscribe(mkd0.m154955G(new e30() { // from class: l.gfh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102395a.m64584l((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final void m64586n(MomentMessage momentMessage) {
        this.f41793d.setImageResource(momentMessage.commentInfo.liked ? f3c0.f94404Q1 : f3c0.f94411R1);
    }

    /* JADX INFO: renamed from: o */
    public final void m64587o(MomentMessage momentMessage) {
        this.f41792c.getPaint().setFakeBoldText(true);
        boolean z = momentMessage.commentInfo.liked;
        VText vText = this.f41792c;
        if (z) {
            vText.setTextColor(getResources().getColor(e1c0.f88749D));
        } else {
            vText.setTextColor(getResources().getColor(e1c0.f88804q));
        }
        this.f41792c.setText(i0g0.m133867h0(momentMessage.commentInfo.likes));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64579g();
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
