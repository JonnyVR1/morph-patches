package com.p046p1.mobile.putong.feed.newui.see;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.newui.see.MomentSeeEntryItemView;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.dac0;
import p149l.e30;
import p149l.f3c0;
import p149l.j760;
import p149l.ki00;
import p149l.kjb0;
import p149l.mkd0;
import p149l.q860;
import p149l.qi00;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentSeeEntryItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f42691a;

    /* JADX INFO: renamed from: b */
    public VImage f42692b;

    /* JADX INFO: renamed from: c */
    public VText f42693c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f42694d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f42695e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f42696f;

    /* JADX INFO: renamed from: g */
    public View f42697g;

    /* JADX INFO: renamed from: h */
    public boolean f42698h;

    public MomentSeeEntryItemView(Context context) {
        super(context);
        this.f42698h = false;
    }

    /* JADX INFO: renamed from: C */
    public static Picture.ImageUri m65434C(User user) {
        return user.m60124fp().profileSmall();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m65435p(Throwable th) {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m65439w(Throwable th) {
    }

    /* JADX INFO: renamed from: B */
    public final void m65440B() {
        xdl0.m208344M(this.f42694d, false);
        xdl0.m208344M(this.f42695e, false);
        xdl0.m208344M(this.f42696f, false);
    }

    /* JADX INFO: renamed from: E */
    public final void m65441E() {
        if (this.f42698h) {
            return;
        }
        xdl0.m208344M(this.f42691a, false);
        this.f42698h = true;
        qi00.m174710k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m65442F(Object obj) {
        j760 j760Var = (j760) obj;
        User user = (User) j760Var.f116564a;
        S s = j760Var.f116565b;
        m65447N(user, ((q860) s).f153135a, ((q860) s).m173344d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m65443G(Object obj) {
        j760 j760Var = (j760) obj;
        User user = (User) j760Var.f116564a;
        S s = j760Var.f116565b;
        m65447N(user, ((q860) s).f153135a, ((q860) s).m173344d());
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m65444K(PutongFrag putongFrag, View view) {
        if (qi00.m174705f()) {
            m65450Q(putongFrag);
        } else {
            m65448O(putongFrag);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m65445L(final PutongFrag putongFrag, dac0 dac0Var) {
        if (putongFrag == null || dac0Var == null) {
            return;
        }
        m65441E();
        dac0Var.mo67374c(putongFrag, qi00.m174708i()).subscribe(mkd0.m154956H(new e30() { // from class: l.fi00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97604a.m65442F(obj);
            }
        }, new e30() { // from class: l.gi00
            @Override // p149l.e30
            public final void call(Object obj) {
                MomentSeeEntryItemView.m65439w((Throwable) obj);
            }
        }));
        dac0Var.mo67374c(putongFrag, qi00.m174709j()).subscribe(mkd0.m154956H(new e30() { // from class: l.hi00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107865a.m65443G(obj);
            }
        }, new e30() { // from class: l.ii00
            @Override // p149l.e30
            public final void call(Object obj) {
                MomentSeeEntryItemView.m65435p((Throwable) obj);
            }
        }));
        setOnClickListener(new View.OnClickListener() { // from class: l.ji00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118040a.m65444K(putongFrag, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m65446M(List<User> list) {
        int size = list.size();
        if (size > 2) {
            m65449P(this.f42696f, list.get(0));
            m65449P(this.f42695e, list.get(1));
            m65449P(this.f42694d, list.get(2));
        } else if (size > 1) {
            m65449P(this.f42695e, list.get(0));
            m65449P(this.f42694d, list.get(1));
        } else if (size > 0) {
            m65449P(this.f42694d, list.get(0));
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m65447N(User user, List<User> list, int i) {
        String str;
        if (list == null || list.size() <= 0 || i <= 0 || !qi00.m174706g(user)) {
            xdl0.m208344M(this.f42691a, false);
            return;
        }
        xdl0.m208344M(this.f42691a, true);
        VText vText = this.f42693c;
        if (i > 99) {
            str = "99+人喜欢了你";
        } else {
            str = i + "人喜欢了你";
        }
        vText.setText(str);
        m65440B();
        if (qi00.m174705f()) {
            m65446M(list);
        } else {
            xdl0.m208344M(this.f42694d, true);
            qib0.f154691G.m102354Y0(this.f42694d, TEnum.equals(user.gender, "female") ? f3c0.f94564l3 : f3c0.f94556k3);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m65448O(PutongFrag putongFrag) {
        if (putongFrag == null) {
            return;
        }
        kjb0.m146182E((Act) putongFrag.getActivity(), null, "nearby");
    }

    /* JADX INFO: renamed from: P */
    public final void m65449P(VDraweeView vDraweeView, User user) {
        xdl0.m208344M(vDraweeView, true);
        qib0.f154691G.m102341Q0(vDraweeView, m65434C(user));
    }

    /* JADX INFO: renamed from: Q */
    public final void m65450Q(PutongFrag putongFrag) {
        if (putongFrag == null) {
            return;
        }
        putongFrag.startActivity(kjb0.m146191b(putongFrag.getActivity(), "feed_nearby_see_entry_item"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65451z(this);
    }

    /* JADX INFO: renamed from: z */
    public final void m65451z(View view) {
        ki00.m146040a(this, view);
    }

    public MomentSeeEntryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42698h = false;
    }

    public MomentSeeEntryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42698h = false;
    }
}
