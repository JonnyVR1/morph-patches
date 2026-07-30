package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedHeadView;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.a9g0;
import p153l.bnl0;
import p153l.bsj0;
import p153l.jyb;
import p153l.k9c0;
import p153l.l51;
import p153l.lbc0;
import p153l.mrb0;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.qw00;
import p153l.uqb0;
import p153l.vg60;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentsFeedHeadView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f44732a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f44733b;

    /* JADX INFO: renamed from: c */
    public VImage f44734c;

    /* JADX INFO: renamed from: d */
    public VText f44735d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f44736e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f44737f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f44738g;

    /* JADX INFO: renamed from: h */
    public VText f44739h;

    public MomentsFeedHeadView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C22421c m68031h(vg60 vg60Var) {
        return (vg60Var.f184001a.isEmpty() || ((MomentActivity) vg60Var.f184001a.get(0)).read) ? C22421c.just(null) : mrb0.m159645W(((MomentActivity) vg60Var.f184001a.get(0)).actors);
    }

    /* JADX INFO: renamed from: A */
    public void m68036A(int i) {
        String strString;
        boolean z = i > 0;
        bnl0.m105524M(this.f44738g, z);
        this.f44737f.setBackgroundResource(z ? lbc0.f131117p6 : lbc0.f130993a2);
        VText vText = this.f44739h;
        if (z) {
            strString = getResources().getString(i > 1 ? R$string.f39785M3 : R$string.f39791N3, a9g0.m96571f(i));
        } else {
            strString = m68038n().string(R$string.f39809Q3);
        }
        vText.setText(strString);
        this.f44739h.setTextColor(z ? -1 : -1996488705);
    }

    /* JADX INFO: renamed from: m */
    public final void m68037m(View view) {
        qw00.m178418a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public Act m68038n() {
        return m68039o(getContext());
    }

    /* JADX INFO: renamed from: o */
    public final Act m68039o(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Act) context;
        }
        if (context instanceof ContextWrapper) {
            return m68039o(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68037m(this);
        this.f44737f.setOnClickListener(new View.OnClickListener() { // from class: l.ew00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96065a.m68050z(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m68040p(MomentsFeedFrag momentsFeedFrag) {
        momentsFeedFrag.duringCreated(mrb0.m159656j().map(new qcj() { // from class: l.hw00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).activities.unread);
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.iw00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117237a.m68042r((Integer) obj);
            }
        }));
        momentsFeedFrag.duringCreated(mrb0.m159624B()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.jw00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122868a.m68047w((User) obj);
            }
        }));
        momentsFeedFrag.duringCreated(mrb0.m159624B()).subscribe(psd0.m173596G(new y20() { // from class: l.kw00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129021a.m68049y((User) obj);
            }
        }));
        momentsFeedFrag.duringCreated((C22421c) FeedModule.f39702c.m61875O2().switchMap(new qcj() { // from class: l.lw00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return MomentsFeedHeadView.m68031h((vg60) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.mw00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138991a.m68041q((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m68041q(User user) {
        if (user == null) {
            uqb0.f180374G.m98798o(this.f44738g);
        } else {
            uqb0.f180374G.m127125Q0(this.f44738g, user.m61308fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m68042r(Integer num) {
        m68036A(num.intValue());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m68043s(Bitmap bitmap) {
        this.f44732a.setImageBitmap(bitmap);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m68044t(int[] iArr, Bitmap bitmap) {
        if (NullChecker.m82486a(bitmap)) {
            final Bitmap bitmapM106281q = bsj0.m106281q(bitmap, iArr[0], iArr[1], getResources().getColor(k9c0.f124489U), qa00.m175859d(4.0f));
            l51.m152893M(new Runnable() { // from class: l.gw00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f106718a.m68043s(bitmapM106281q);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m68045u(User user, final int[] iArr) {
        uqb0.f180374G.m127104G(user.m61308fp().profileSmall(), new y20() { // from class: l.fw00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101115a.m68044t(iArr, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m68046v(final User user) {
        bnl0.m105533Q0(this.f44732a, new y20() { // from class: l.pw00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154358a.m68045u(user, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m68047w(final User user) {
        uqb0.f180374G.m127125Q0(this.f44733b, user.m61308fp().profileSmall());
        l51.m152893M(new Runnable() { // from class: l.nw00
            @Override // java.lang.Runnable
            public final void run() {
                this.f143904a.m68046v(user);
            }
        });
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m68038n(), user, this.f44734c);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m68048x(User user, View view) {
        m68038n().startActivity(MomentsInProfileAct.m68095X1(m68038n(), user.f56859id, "from_MomentsFeedAct"));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m68049y(final User user) {
        this.f44733b.setOnClickListener(new View.OnClickListener() { // from class: l.ow00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f149414a.m68048x(user, view);
            }
        });
        this.f44735d.setText(user.name);
        if (jyb.m147479J(user.profile.extensions.interest.emoji)) {
            return;
        }
        bnl0.m105524M(this.f44736e, true);
        uqb0.f180374G.m127115L0(this.f44736e, uqb0.f180392X.m135325n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m68050z(View view) {
        m68038n().startActivityForResult(new Intent(m68038n(), (Class<?>) MomentActivitiesAct.class), 72);
    }

    public MomentsFeedHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentsFeedHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
    }
}
