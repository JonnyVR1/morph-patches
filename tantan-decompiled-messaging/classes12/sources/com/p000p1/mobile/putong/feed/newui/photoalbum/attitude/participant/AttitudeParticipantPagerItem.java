package com.p000p1.mobile.putong.feed.newui.photoalbum.attitude.participant;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.data.User;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.b5c0;
import p007l.d7h;
import p007l.e1c0;
import p007l.l80;
import p007l.n41;
import p007l.o6c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AttitudeParticipantPagerItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f2881a;

    /* JADX INFO: renamed from: b */
    public ImageView f2882b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f2883c;

    /* JADX INFO: renamed from: d */
    public C2125a f2884d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2126b f2885e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem$a */
    public static class C2125a extends dac0<User> {

        /* JADX INFO: renamed from: d */
        public InterfaceC2126b f2887d;

        /* JADX INFO: renamed from: e */
        public Act f2888e;

        /* JADX INFO: renamed from: c */
        public List<User> f2886c = new ArrayList();

        /* JADX INFO: renamed from: f */
        public l80<User> f2889f = new a();

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem$a$a */
        public class a extends l80<User> {

            /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem$a$a$a, reason: collision with other inner class name */
            public class C2561a extends ViewPager.m {
                public C2561a() {
                }

                public void onPageScrollStateChanged(int i) {
                    super.onPageScrollStateChanged(i);
                    if (i == 0) {
                        a.this.m11597o();
                    }
                }
            }

            public a() {
            }

            @Override // p007l.l80
            /* JADX INFO: renamed from: f */
            public void mo2865f(ViewGroup viewGroup, ViewGroup viewGroup2) {
                ViewPager viewPagerFindViewById = viewGroup.findViewById(b5c0.f6065k2);
                if (viewPagerFindViewById == null) {
                    return;
                }
                viewPagerFindViewById.d(new C2561a());
            }

            @Override // p007l.l80
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public void mo4975k(User user, int i, View view) {
                if (AttitudeParticipantListtem.class.isInstance(view)) {
                    ((AttitudeParticipantListtem) view).m5009w(C2125a.this.f2888e, user);
                }
            }

            @Override // p007l.l80
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public void mo4978m(User user, int i, long j, View view) {
            }
        }

        public C2125a(Act act) {
            this.f2888e = act;
        }

        /* JADX INFO: renamed from: C */
        public int m5016C() {
            return this.f2886c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m5017D(ViewGroup viewGroup, int i) {
            return this.f2888e.inflater().inflate(o6c0.f11045F, viewGroup, false);
        }

        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void m5015A(View view, User user, int i, int i2) {
            this.f2889f.m11594h(view, user, i2);
            ((AttitudeParticipantListtem) view).m5005s(this.f2888e, user);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public User getItem(int i) {
            return this.f2886c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m5020G(List<User> list) {
            if (!vwb.J(list)) {
                this.f2886c = list;
            }
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: H */
        public void m5021H(InterfaceC2126b interfaceC2126b) {
            this.f2887d = interfaceC2126b;
        }

        /* JADX INFO: renamed from: e */
        public void m5022e(int i) {
            if (this.f2886c.size() <= 0 || this.f2886c.size() - i >= 3 || !this.f2887d.mo5025b()) {
                return;
            }
            this.f2887d.mo5026c();
        }

        public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
            super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
            this.f2889f.m11597o();
        }

        public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
            super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
            this.f2889f.m11597o();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem$b */
    public interface InterfaceC2126b {
        /* JADX INFO: renamed from: b */
        boolean mo5025b();

        /* JADX INFO: renamed from: c */
        void mo5026c();
    }

    public AttitudeParticipantPagerItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m5010a(View view) {
        n41.m12067a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final View m5011b(Act act) {
        RelativeLayout relativeLayout = new RelativeLayout(act);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        VText vText = new VText(act);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = t100.p;
        layoutParams.bottomMargin = t100.y;
        layoutParams.addRule(14);
        vText.setLayoutParams(layoutParams);
        vText.getPaint().setFakeBoldText(true);
        vText.setTextColor(act.getResources().getColor(e1c0.f7160q));
        vText.setTextSize(14.0f);
        vText.setText("仅展示最近表态的用户");
        relativeLayout.addView(vText);
        return relativeLayout;
    }

    /* JADX INFO: renamed from: c */
    public final View m5012c(Act act) {
        RelativeLayout relativeLayout = new RelativeLayout(act);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        VText vText = new VText(act);
        vText.setLayoutParams(new RelativeLayout.LayoutParams(-2, t100.g));
        relativeLayout.addView(vText);
        return relativeLayout;
    }

    /* JADX INFO: renamed from: d */
    public void m5013d(Act act, List<User> list) {
        xdl0.M(this.f2881a, false);
        xdl0.M(this.f2883c, true);
        if (this.f2884d == null) {
            C2125a c2125a = new C2125a(act);
            this.f2884d = c2125a;
            c2125a.m5021H(this.f2885e);
            d7h d7hVar = new d7h(this.f2884d);
            this.f2883c.setAdapter(d7hVar);
            this.f2883c.clearAnimation();
            d7hVar.H(m5012c(act));
            d7hVar.F(m5011b(act));
        }
        this.f2884d.m5020G(list);
    }

    /* JADX INFO: renamed from: e */
    public void m5014e() {
        xdl0.M(this.f2881a, true);
        xdl0.M(this.f2883c, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5010a(this);
        xdl0.M(this.f2883c, false);
    }

    public void setLoadMoreHandler(InterfaceC2126b interfaceC2126b) {
        this.f2885e = interfaceC2126b;
        if (NullChecker.a(this.f2884d)) {
            this.f2884d.m5021H(this.f2885e);
        }
    }

    public AttitudeParticipantPagerItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AttitudeParticipantPagerItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AttitudeParticipantPagerItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
