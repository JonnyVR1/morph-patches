package com.p000p1.mobile.putong.feed.newui.see;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.newui.see.MomentSeeEntryItemView;
import com.p1.mobile.putong.app.PutongFrag;
import java.util.List;
import l.dac0;
import l.e30;
import l.j760;
import l.mkd0;
import l.q860;
import l.qib0;
import l.xdl0;
import p007l.f3c0;
import p007l.ki00;
import p007l.kjb0;
import p007l.qi00;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentSeeEntryItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f4152a;

    /* JADX INFO: renamed from: b */
    public VImage f4153b;

    /* JADX INFO: renamed from: c */
    public VText f4154c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f4155d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4156e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4157f;

    /* JADX INFO: renamed from: g */
    public View f4158g;

    /* JADX INFO: renamed from: h */
    public boolean f4159h;

    public MomentSeeEntryItemView(Context context) {
        super(context);
        this.f4159h = false;
    }

    /* JADX INFO: renamed from: C */
    public static Picture.ImageUri m6560C(User user) {
        return user.m1042fp().profileSmall();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m6561p(Throwable th) {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m6565w(Throwable th) {
    }

    /* JADX INFO: renamed from: B */
    public final void m6566B() {
        xdl0.M(this.f4155d, false);
        xdl0.M(this.f4156e, false);
        xdl0.M(this.f4157f, false);
    }

    /* JADX INFO: renamed from: E */
    public final void m6567E() {
        if (this.f4159h) {
            return;
        }
        xdl0.M(this.f4152a, false);
        this.f4159h = true;
        qi00.m13568k();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m6568F(Object obj) {
        j760 j760Var = (j760) obj;
        User user = (User) j760Var.a;
        Object obj2 = j760Var.b;
        m6573N(user, ((q860) obj2).a, ((q860) obj2).d());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m6569G(Object obj) {
        j760 j760Var = (j760) obj;
        User user = (User) j760Var.a;
        Object obj2 = j760Var.b;
        m6573N(user, ((q860) obj2).a, ((q860) obj2).d());
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m6570K(PutongFrag putongFrag, View view) {
        if (qi00.m13563f()) {
            m6576Q(putongFrag);
        } else {
            m6574O(putongFrag);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m6571L(final PutongFrag putongFrag, dac0 dac0Var) {
        if (putongFrag == null || dac0Var == null) {
            return;
        }
        m6567E();
        dac0Var.c(putongFrag, qi00.m13566i()).subscribe(mkd0.H(new e30() { // from class: l.fi00
            public final void call(Object obj) {
                this.f8105a.m6568F(obj);
            }
        }, new e30() { // from class: l.gi00
            public final void call(Object obj) {
                MomentSeeEntryItemView.m6565w((Throwable) obj);
            }
        }));
        dac0Var.c(putongFrag, qi00.m13567j()).subscribe(mkd0.H(new e30() { // from class: l.hi00
            public final void call(Object obj) {
                this.f8744a.m6569G(obj);
            }
        }, new e30() { // from class: l.ii00
            public final void call(Object obj) {
                MomentSeeEntryItemView.m6561p((Throwable) obj);
            }
        }));
        setOnClickListener(new View.OnClickListener() { // from class: l.ji00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9365a.m6570K(putongFrag, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m6572M(List<User> list) {
        int size = list.size();
        if (size > 2) {
            m6575P(this.f4157f, list.get(0));
            m6575P(this.f4156e, list.get(1));
            m6575P(this.f4155d, list.get(2));
        } else if (size > 1) {
            m6575P(this.f4156e, list.get(0));
            m6575P(this.f4155d, list.get(1));
        } else if (size > 0) {
            m6575P(this.f4155d, list.get(0));
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m6573N(User user, List<User> list, int i) {
        String str;
        if (list == null || list.size() <= 0 || i <= 0 || !qi00.m13564g(user)) {
            xdl0.M(this.f4152a, false);
            return;
        }
        xdl0.M(this.f4152a, true);
        VText vText = this.f4154c;
        if (i > 99) {
            str = "99+人喜欢了你";
        } else {
            str = i + "人喜欢了你";
        }
        vText.setText(str);
        m6566B();
        if (qi00.m13563f()) {
            m6572M(list);
        } else {
            xdl0.M(this.f4155d, true);
            qib0.G.Y0(this.f4155d, TEnum.equals(user.gender, "female") ? f3c0.f7847l3 : f3c0.f7839k3);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m6574O(PutongFrag putongFrag) {
        if (putongFrag == null) {
            return;
        }
        kjb0.m11441E(putongFrag.getActivity(), null, "nearby");
    }

    /* JADX INFO: renamed from: P */
    public final void m6575P(VDraweeView vDraweeView, User user) {
        xdl0.M(vDraweeView, true);
        qib0.G.Q0(vDraweeView, m6560C(user));
    }

    /* JADX INFO: renamed from: Q */
    public final void m6576Q(PutongFrag putongFrag) {
        if (putongFrag == null) {
            return;
        }
        putongFrag.startActivity(kjb0.m11450b(putongFrag.getActivity(), "feed_nearby_see_entry_item"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6577z(this);
    }

    /* JADX INFO: renamed from: z */
    public final void m6577z(View view) {
        ki00.m11424a(this, view);
    }

    public MomentSeeEntryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4159h = false;
    }

    public MomentSeeEntryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4159h = false;
    }
}
