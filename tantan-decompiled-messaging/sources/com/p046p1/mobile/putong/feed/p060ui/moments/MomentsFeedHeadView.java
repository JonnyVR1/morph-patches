package com.p046p1.mobile.putong.feed.p060ui.moments;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedHeadView;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.f3c0;
import p149l.ho00;
import p149l.ijb0;
import p149l.mkd0;
import p149l.q860;
import p149l.qib0;
import p149l.t0g0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.yij0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentsFeedHeadView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f43884a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43885b;

    /* JADX INFO: renamed from: c */
    public VImage f43886c;

    /* JADX INFO: renamed from: d */
    public VText f43887d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43888e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f43889f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f43890g;

    /* JADX INFO: renamed from: h */
    public VText f43891h;

    public MomentsFeedHeadView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C22306c m66848h(q860 q860Var) {
        return (q860Var.f153135a.isEmpty() || ((MomentActivity) q860Var.f153135a.get(0)).read) ? C22306c.just(null) : ijb0.m136559W(((MomentActivity) q860Var.f153135a.get(0)).actors);
    }

    /* JADX INFO: renamed from: A */
    public void m66853A(int i) {
        String strString;
        boolean z = i > 0;
        xdl0.m208344M(this.f43890g, z);
        this.f43889f.setBackgroundResource(z ? f3c0.f94599p6 : f3c0.f94475a2);
        VText vText = this.f43891h;
        if (z) {
            strString = getResources().getString(i > 1 ? R$string.f38937M3 : R$string.f38943N3, t0g0.m186865f(i));
        } else {
            strString = m66855n().string(R$string.f38961Q3);
        }
        vText.setText(strString);
        this.f43891h.setTextColor(z ? -1 : -1996488705);
    }

    /* JADX INFO: renamed from: m */
    public final void m66854m(View view) {
        ho00.m132035a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public Act m66855n() {
        return m66856o(getContext());
    }

    /* JADX INFO: renamed from: o */
    public final Act m66856o(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Act) context;
        }
        if (context instanceof ContextWrapper) {
            return m66856o(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66854m(this);
        this.f43889f.setOnClickListener(new View.OnClickListener() { // from class: l.vn00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182200a.m66867z(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m66857p(MomentsFeedFrag momentsFeedFrag) {
        momentsFeedFrag.duringCreated(ijb0.m136570j().map(new w9j() { // from class: l.yn00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).activities.unread);
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.zn00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203913a.m66859r((Integer) obj);
            }
        }));
        momentsFeedFrag.duringCreated(ijb0.m136538B()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ao00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70781a.m66864w((User) obj);
            }
        }));
        momentsFeedFrag.duringCreated(ijb0.m136538B()).subscribe(mkd0.m154955G(new e30() { // from class: l.bo00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76474a.m66866y((User) obj);
            }
        }));
        momentsFeedFrag.duringCreated((C22306c) FeedModule.f38854c.m60691O2().switchMap(new w9j() { // from class: l.co00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return MomentsFeedHeadView.m66848h((q860) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.do00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87121a.m66858q((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m66858q(User user) {
        if (user == null) {
            qib0.f154691G.m184725o(this.f43890g);
        } else {
            qib0.f154691G.m102341Q0(this.f43890g, user.m60124fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m66859r(Integer num) {
        m66853A(num.intValue());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m66860s(Bitmap bitmap) {
        this.f43884a.setImageBitmap(bitmap);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m66861t(int[] iArr, Bitmap bitmap) {
        if (NullChecker.m81303a(bitmap)) {
            final Bitmap bitmapM214961q = yij0.m214961q(bitmap, iArr[0], iArr[1], getResources().getColor(e1c0.f88766U), t100.m186890d(4.0f));
            e51.m114748M(new Runnable() { // from class: l.xn00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f193635a.m66860s(bitmapM214961q);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m66862u(User user, final int[] iArr) {
        qib0.f154691G.m102320G(user.m60124fp().profileSmall(), new e30() { // from class: l.wn00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187231a.m66861t(iArr, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m66863v(final User user) {
        xdl0.m208353Q0(this.f43884a, new e30() { // from class: l.go00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103644a.m66862u(user, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m66864w(final User user) {
        qib0.f154691G.m102341Q0(this.f43885b, user.m60124fp().profileSmall());
        e51.m114748M(new Runnable() { // from class: l.eo00
            @Override // java.lang.Runnable
            public final void run() {
                this.f92412a.m66863v(user);
            }
        });
        qib0.f154713b0.f139231b.showUserVerificationLogo(m66855n(), user, this.f43886c);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m66865x(User user, View view) {
        m66855n().startActivity(MomentsInProfileAct.m66912V1(m66855n(), user.f56011id, "from_MomentsFeedAct"));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m66866y(final User user) {
        this.f43885b.setOnClickListener(new View.OnClickListener() { // from class: l.fo00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98496a.m66865x(user, view);
            }
        });
        this.f43887d.setText(user.name);
        if (vwb.m200296J(user.profile.extensions.interest.emoji)) {
            return;
        }
        xdl0.m208344M(this.f43888e, true);
        qib0.f154691G.m102331L0(this.f43888e, qib0.f154709X.m126254n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m66867z(View view) {
        m66855n().startActivityForResult(new Intent(m66855n(), (Class<?>) MomentActivitiesAct.class), 72);
    }

    public MomentsFeedHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentsFeedHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
    }
}
