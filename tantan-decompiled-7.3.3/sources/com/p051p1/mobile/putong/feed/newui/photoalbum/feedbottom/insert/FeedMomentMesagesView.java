package com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.CommentInfo;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.bnl0;
import p153l.hdc0;
import p153l.jyb;
import p153l.k9c0;
import p153l.ksg;
import p153l.lbc0;
import p153l.lyh0;
import p153l.n570;
import p153l.psd0;
import p153l.q8g0;
import p153l.qa00;
import p153l.tfj0;
import p153l.uxj0;
import p153l.y20;
import p153l.y3i;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMomentMesagesView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f42638a;

    /* JADX INFO: renamed from: b */
    public VText f42639b;

    /* JADX INFO: renamed from: c */
    public VText f42640c;

    /* JADX INFO: renamed from: d */
    public ImageView f42641d;

    /* JADX INFO: renamed from: e */
    public Moment f42642e;

    /* JADX INFO: renamed from: f */
    public MomentMessage f42643f;

    public FeedMomentMesagesView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m65762g() {
        this.f42638a = findViewById(hdc0.f108862P0);
        this.f42639b = (VText) findViewById(hdc0.f108880V0);
        this.f42640c = (VText) findViewById(hdc0.f108865Q0);
        this.f42641d = (ImageView) findViewById(hdc0.f108868R0);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m65763h(Moment moment, String str, MomentMessage momentMessage, Act act, View view) {
        y3i.m214148b(moment, str, ksg.m151174K(str, false), "comment", momentMessage.f56856id);
        Intent intentM66018b = MomentDetailAct.C11469a.m66017a(getContext()).m66022f(str).m66029m(moment.f56859id).m66030n(moment.owner).m66036t(true).m66031o(moment.momentValue).m66037u(true).m66020d(this.f42643f.f56856id).m66018b();
        if (intentM66018b == null) {
            return;
        }
        act.startActivity(intentM66018b);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m65764i() {
        Rect rect = new Rect();
        this.f42641d.getHitRect(rect);
        int i = rect.top;
        int i2 = qa00.f156325l;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        ((View) this.f42641d.getParent()).setTouchDelegate(new TouchDelegate(rect, this.f42641d));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m65765j(uxj0 uxj0Var) {
        MomentMessage momentMessage = this.f42643f;
        CommentInfo commentInfo = momentMessage.commentInfo;
        boolean z = commentInfo.liked;
        commentInfo.liked = !z;
        if (z) {
            commentInfo.likes--;
        } else {
            commentInfo.likes++;
        }
        FeedModule.f39703d.f121300H0.put(momentMessage.f56856id, momentMessage);
        m65769n(this.f42643f);
        m65770o(this.f42643f);
        FeedModule.f39703d.f121324R0.onNext(this.f42643f.f56856id);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m65766k(String str, Moment moment, MomentMessage momentMessage, Act act, n570 n570Var, View view) {
        if (!this.f42643f.commentInfo.liked) {
            tfj0.m190939b("e_comment_like", ksg.m151174K(str, false), tfj0.C20302a.m190949g("moment_id", moment.f56859id), tfj0.C20302a.m190949g("owner_id", moment.owner), tfj0.C20302a.m190949g("comment_id", momentMessage.f56856id));
        }
        String str2 = moment.owner;
        String str3 = moment.f56859id;
        MomentMessage momentMessage2 = this.f42643f;
        act.duringCreated(n570Var.m161691u(str2, str3, momentMessage2.f56856id, !momentMessage2.commentInfo.liked)).subscribe(psd0.m173597H(new y20() { // from class: l.wgh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188974a.m65765j((uxj0) obj);
            }
        }, new y20() { // from class: l.xgh
            @Override // p153l.y20
            public final void call(Object obj) {
                i4h.m138538g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m65767l(String str) {
        MomentMessage momentMessage = FeedModule.f39703d.f121300H0.get(this.f42643f.f56856id);
        this.f42643f = momentMessage;
        m65769n(momentMessage);
        m65770o(this.f42643f);
    }

    /* JADX INFO: renamed from: m */
    public void m65768m(final Act act, final Moment moment, final MomentMessage momentMessage, String str, final String str2, final n570 n570Var) {
        this.f42642e = moment;
        this.f42643f = momentMessage;
        this.f42639b.setText(q8g0.m175796b0("热评 " + this.f42643f.value, jyb.m147482M("热评"), getResources().getColor(k9c0.f124472D), lyh0.m156283c(3)));
        m65770o(this.f42643f);
        m65769n(this.f42643f);
        bnl0.m105509E0(this.f42638a, new View.OnClickListener() { // from class: l.sgh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167871a.m65763h(moment, str2, momentMessage, act, view);
            }
        });
        if (NullChecker.m82486a(this.f42641d.getParent()) && ((View) this.f42641d.getParent()).getTouchDelegate() == null) {
            this.f42641d.post(new Runnable() { // from class: l.tgh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f174082a.m65764i();
                }
            });
        }
        bnl0.m105509E0(this.f42641d, new View.OnClickListener() { // from class: l.ugh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178893a.m65766k(str2, moment, momentMessage, act, n570Var, view);
            }
        });
        act.duringCreated(FeedModule.f39703d.f121324R0).subscribe(psd0.m173596G(new y20() { // from class: l.vgh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184035a.m65767l((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final void m65769n(MomentMessage momentMessage) {
        this.f42641d.setImageResource(momentMessage.commentInfo.liked ? lbc0.f130922Q1 : lbc0.f130929R1);
    }

    /* JADX INFO: renamed from: o */
    public final void m65770o(MomentMessage momentMessage) {
        this.f42640c.getPaint().setFakeBoldText(true);
        boolean z = momentMessage.commentInfo.liked;
        VText vText = this.f42640c;
        if (z) {
            vText.setTextColor(getResources().getColor(k9c0.f124472D));
        } else {
            vText.setTextColor(getResources().getColor(k9c0.f124527q));
        }
        this.f42640c.setText(q8g0.m175802h0(momentMessage.commentInfo.likes));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65762g();
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
