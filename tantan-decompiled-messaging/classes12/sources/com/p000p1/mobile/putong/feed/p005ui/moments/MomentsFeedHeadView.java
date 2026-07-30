package com.p000p1.mobile.putong.feed.p005ui.moments;

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
import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedHeadView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.e51;
import l.mkd0;
import l.q860;
import l.qib0;
import l.t0g0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yij0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.ho00;
import p007l.ijb0;
import rx.c;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentsFeedHeadView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f5345a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5346b;

    /* JADX INFO: renamed from: c */
    public VImage f5347c;

    /* JADX INFO: renamed from: d */
    public VText f5348d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f5349e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f5350f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f5351g;

    /* JADX INFO: renamed from: h */
    public VText f5352h;

    public MomentsFeedHeadView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ c m8042h(q860 q860Var) {
        return (q860Var.a.isEmpty() || ((MomentActivity) q860Var.a.get(0)).read) ? c.just((Object) null) : ijb0.m10912W(((MomentActivity) q860Var.a.get(0)).actors);
    }

    /* JADX INFO: renamed from: A */
    public void m8047A(int i) {
        String strString;
        boolean z = i > 0;
        xdl0.M(this.f5351g, z);
        this.f5350f.setBackgroundResource(z ? f3c0.f7882p6 : f3c0.f7758a2);
        VText vText = this.f5352h;
        if (z) {
            strString = getResources().getString(i > 1 ? R$string.f398M3 : R$string.f404N3, t0g0.f(i));
        } else {
            strString = m8049n().string(R$string.f422Q3);
        }
        vText.setText(strString);
        this.f5352h.setTextColor(z ? -1 : -1996488705);
    }

    /* JADX INFO: renamed from: m */
    public final void m8048m(View view) {
        ho00.m10682a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public Act m8049n() {
        return m8050o(getContext());
    }

    /* JADX INFO: renamed from: o */
    public final Act m8050o(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Act) context;
        }
        if (context instanceof ContextWrapper) {
            return m8050o(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8048m(this);
        this.f5350f.setOnClickListener(new View.OnClickListener() { // from class: l.vn00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14249a.m8061z(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m8051p(MomentsFeedFrag momentsFeedFrag) {
        momentsFeedFrag.duringCreated(ijb0.m10923j().map(new w9j() { // from class: l.yn00
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).activities.unread);
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.zn00
            public final void call(Object obj) {
                this.f15805a.m8053r((Integer) obj);
            }
        }));
        momentsFeedFrag.duringCreated(ijb0.m10891B()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ao00
            public final void call(Object obj) {
                this.f5788a.m8058w((User) obj);
            }
        }));
        momentsFeedFrag.duringCreated(ijb0.m10891B()).subscribe(mkd0.G(new e30() { // from class: l.bo00
            public final void call(Object obj) {
                this.f6379a.m8060y((User) obj);
            }
        }));
        momentsFeedFrag.duringCreated(FeedModule.f315c.m1617O2().switchMap(new w9j() { // from class: l.co00
            public final Object call(Object obj) {
                return MomentsFeedHeadView.m8042h((q860) obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.do00
            public final void call(Object obj) {
                this.f7014a.m8052q((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m8052q(User user) {
        if (user == null) {
            qib0.G.o(this.f5351g);
        } else {
            qib0.G.Q0(this.f5351g, user.m1042fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m8053r(Integer num) {
        m8047A(num.intValue());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m8054s(Bitmap bitmap) {
        this.f5345a.setImageBitmap(bitmap);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m8055t(int[] iArr, Bitmap bitmap) {
        if (NullChecker.a(bitmap)) {
            final Bitmap bitmapQ = yij0.q(bitmap, iArr[0], iArr[1], getResources().getColor(e1c0.f7122U), t100.d(4.0f));
            e51.M(new Runnable() { // from class: l.xn00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15045a.m8054s(bitmapQ);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m8056u(User user, final int[] iArr) {
        qib0.G.G(user.m1042fp().profileSmall(), new e30() { // from class: l.wn00
            public final void call(Object obj) {
                this.f14625a.m8055t(iArr, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m8057v(final User user) {
        xdl0.Q0(this.f5345a, new e30() { // from class: l.go00
            public final void call(Object obj) {
                this.f8490a.m8056u(user, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m8058w(final User user) {
        qib0.G.Q0(this.f5346b, user.m1042fp().profileSmall());
        e51.M(new Runnable() { // from class: l.eo00
            @Override // java.lang.Runnable
            public final void run() {
                this.f7440a.m8057v(user);
            }
        });
        qib0.b0.b.showUserVerificationLogo(m8049n(), user, this.f5347c);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m8059x(User user, View view) {
        m8049n().startActivity(MomentsInProfileAct.m8110V1(m8049n(), ((DbObject) user).id, "from_MomentsFeedAct"));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m8060y(final User user) {
        this.f5346b.setOnClickListener(new View.OnClickListener() { // from class: l.fo00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8173a.m8059x(user, view);
            }
        });
        this.f5348d.setText(user.name);
        if (vwb.J(user.profile.extensions.interest.emoji)) {
            return;
        }
        xdl0.M(this.f5349e, true);
        qib0.G.L0(this.f5349e, qib0.X.n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8061z(View view) {
        m8049n().startActivityForResult(new Intent((Context) m8049n(), (Class<?>) MomentActivitiesAct.class), 72);
    }

    public MomentsFeedHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentsFeedHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
    }
}
