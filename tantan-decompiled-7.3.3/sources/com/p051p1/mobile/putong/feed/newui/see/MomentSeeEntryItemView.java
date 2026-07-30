package com.p051p1.mobile.putong.feed.newui.see;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.newui.see.MomentSeeEntryItemView;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.jic0;
import p153l.lbc0;
import p153l.orb0;
import p153l.pf60;
import p153l.psd0;
import p153l.tq00;
import p153l.uqb0;
import p153l.vg60;
import p153l.y20;
import p153l.zq00;

/* JADX INFO: loaded from: classes13.dex */
public class MomentSeeEntryItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f43539a;

    /* JADX INFO: renamed from: b */
    public VImage f43540b;

    /* JADX INFO: renamed from: c */
    public VText f43541c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f43542d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43543e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f43544f;

    /* JADX INFO: renamed from: g */
    public View f43545g;

    /* JADX INFO: renamed from: h */
    public boolean f43546h;

    public MomentSeeEntryItemView(Context context) {
        super(context);
        this.f43546h = false;
    }

    /* JADX INFO: renamed from: C */
    public static Picture.ImageUri m66617C(User user) {
        return user.m61308fp().profileSmall();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m66618p(Throwable th) {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m66622w(Throwable th) {
    }

    /* JADX INFO: renamed from: B */
    public final void m66623B() {
        bnl0.m105524M(this.f43542d, false);
        bnl0.m105524M(this.f43543e, false);
        bnl0.m105524M(this.f43544f, false);
    }

    /* JADX INFO: renamed from: E */
    public final void m66624E() {
        if (this.f43546h) {
            return;
        }
        bnl0.m105524M(this.f43539a, false);
        this.f43546h = true;
        zq00.m220944k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m66625F(Object obj) {
        pf60 pf60Var = (pf60) obj;
        User user = (User) pf60Var.f152156a;
        S s = pf60Var.f152157b;
        m66630N(user, ((vg60) s).f184001a, ((vg60) s).m201222d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m66626G(Object obj) {
        pf60 pf60Var = (pf60) obj;
        User user = (User) pf60Var.f152156a;
        S s = pf60Var.f152157b;
        m66630N(user, ((vg60) s).f184001a, ((vg60) s).m201222d());
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m66627K(PutongFrag putongFrag, View view) {
        if (zq00.m220939f()) {
            m66633Q(putongFrag);
        } else {
            m66631O(putongFrag);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m66628L(final PutongFrag putongFrag, jic0 jic0Var) {
        if (putongFrag == null || jic0Var == null) {
            return;
        }
        m66624E();
        jic0Var.mo68557c(putongFrag, zq00.m220942i()).subscribe(psd0.m173597H(new y20() { // from class: l.oq00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148531a.m66625F(obj);
            }
        }, new y20() { // from class: l.pq00
            @Override // p153l.y20
            public final void call(Object obj) {
                MomentSeeEntryItemView.m66622w((Throwable) obj);
            }
        }));
        jic0Var.mo68557c(putongFrag, zq00.m220943j()).subscribe(psd0.m173597H(new y20() { // from class: l.qq00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158937a.m66626G(obj);
            }
        }, new y20() { // from class: l.rq00
            @Override // p153l.y20
            public final void call(Object obj) {
                MomentSeeEntryItemView.m66618p((Throwable) obj);
            }
        }));
        setOnClickListener(new View.OnClickListener() { // from class: l.sq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170123a.m66627K(putongFrag, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m66629M(List<User> list) {
        int size = list.size();
        if (size > 2) {
            m66632P(this.f43544f, list.get(0));
            m66632P(this.f43543e, list.get(1));
            m66632P(this.f43542d, list.get(2));
        } else if (size > 1) {
            m66632P(this.f43543e, list.get(0));
            m66632P(this.f43542d, list.get(1));
        } else if (size > 0) {
            m66632P(this.f43542d, list.get(0));
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m66630N(User user, List<User> list, int i) {
        String str;
        if (list == null || list.size() <= 0 || i <= 0 || !zq00.m220940g(user)) {
            bnl0.m105524M(this.f43539a, false);
            return;
        }
        bnl0.m105524M(this.f43539a, true);
        VText vText = this.f43541c;
        if (i > 99) {
            str = "99+人喜欢了你";
        } else {
            str = i + "人喜欢了你";
        }
        vText.setText(str);
        m66623B();
        if (zq00.m220939f()) {
            m66629M(list);
        } else {
            bnl0.m105524M(this.f43542d, true);
            uqb0.f180374G.m127138Y0(this.f43542d, TEnum.equals(user.gender, "female") ? lbc0.f131082l3 : lbc0.f131074k3);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m66631O(PutongFrag putongFrag) {
        if (putongFrag == null) {
            return;
        }
        orb0.m168876E((Act) putongFrag.getActivity(), null, "nearby");
    }

    /* JADX INFO: renamed from: P */
    public final void m66632P(VDraweeView vDraweeView, User user) {
        bnl0.m105524M(vDraweeView, true);
        uqb0.f180374G.m127125Q0(vDraweeView, m66617C(user));
    }

    /* JADX INFO: renamed from: Q */
    public final void m66633Q(PutongFrag putongFrag) {
        if (putongFrag == null) {
            return;
        }
        putongFrag.startActivity(orb0.m168885b(putongFrag.getActivity(), "feed_nearby_see_entry_item"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66634z(this);
    }

    /* JADX INFO: renamed from: z */
    public final void m66634z(View view) {
        tq00.m192229a(this, view);
    }

    public MomentSeeEntryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43546h = false;
    }

    public MomentSeeEntryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43546h = false;
    }
}
