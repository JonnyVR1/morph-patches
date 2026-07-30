package com.p046p1.mobile.putong.feed.newui.photoalbum.attitude.participant;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;
import p149l.b5c0;
import p149l.d7h;
import p149l.dac0;
import p149l.e1c0;
import p149l.l80;
import p149l.n41;
import p149l.o6c0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class AttitudeParticipantPagerItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f41420a;

    /* JADX INFO: renamed from: b */
    public ImageView f41421b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f41422c;

    /* JADX INFO: renamed from: d */
    public C11281a f41423d;

    /* JADX INFO: renamed from: e */
    public InterfaceC11282b f41424e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem$a */
    public static class C11281a extends dac0<User> {

        /* JADX INFO: renamed from: d */
        public InterfaceC11282b f41426d;

        /* JADX INFO: renamed from: e */
        public Act f41427e;

        /* JADX INFO: renamed from: c */
        public List<User> f41425c = new ArrayList();

        /* JADX INFO: renamed from: f */
        public l80<User> f41428f = new a();

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem$a$a */
        public class a extends l80<User> {

            /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem$a$a$a, reason: collision with other inner class name */
            public class C22701a extends ViewPager.C0719m {
                public C22701a() {
                }

                @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
                public void onPageScrollStateChanged(int i) {
                    super.onPageScrollStateChanged(i);
                    if (i == 0) {
                        a.this.m148842o();
                    }
                }
            }

            public a() {
            }

            @Override // p149l.l80
            /* JADX INFO: renamed from: f */
            public void mo55694f(ViewGroup viewGroup, ViewGroup viewGroup2) {
                ViewPager viewPager = (ViewPager) viewGroup.findViewById(b5c0.f73584k2);
                if (viewPager == null) {
                    return;
                }
                viewPager.m4185d(new C22701a());
            }

            @Override // p149l.l80
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public void mo63937k(User user, int i, View view) {
                if (AttitudeParticipantListtem.class.isInstance(view)) {
                    ((AttitudeParticipantListtem) view).m63970w(C11281a.this.f41427e, user);
                }
            }

            @Override // p149l.l80
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public void mo55696m(User user, int i, long j, View view) {
            }
        }

        public C11281a(Act act) {
            this.f41427e = act;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            return this.f41425c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return this.f41427e.inflater().inflate(o6c0.f142026F, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, User user, int i, int i2) {
            this.f41428f.m148839h(view, user, i2);
            ((AttitudeParticipantListtem) view).m63966s(this.f41427e, user);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public User getItem(int i) {
            return this.f41425c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m63978G(List<User> list) {
            if (!vwb.m200296J(list)) {
                this.f41425c = list;
            }
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: H */
        public void m63979H(InterfaceC11282b interfaceC11282b) {
            this.f41426d = interfaceC11282b;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: e */
        public void mo47327e(int i) {
            if (this.f41425c.size() <= 0 || this.f41425c.size() - i >= 3 || !this.f41426d.mo63982b()) {
                return;
            }
            this.f41426d.mo63983c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
            super.onViewAttachedToWindow(abstractC0566d0);
            this.f41428f.m148842o();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
            super.onViewDetachedFromWindow(abstractC0566d0);
            this.f41428f.m148842o();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem$b */
    public interface InterfaceC11282b {
        /* JADX INFO: renamed from: b */
        boolean mo63982b();

        /* JADX INFO: renamed from: c */
        void mo63983c();
    }

    public AttitudeParticipantPagerItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m63971a(View view) {
        n41.m157795a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final View m63972b(Act act) {
        RelativeLayout relativeLayout = new RelativeLayout(act);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        VText vText = new VText(act);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = t100.f167267p;
        layoutParams.bottomMargin = t100.f167276y;
        layoutParams.addRule(14);
        vText.setLayoutParams(layoutParams);
        vText.getPaint().setFakeBoldText(true);
        vText.setTextColor(act.getResources().getColor(e1c0.f88804q));
        vText.setTextSize(14.0f);
        vText.setText("仅展示最近表态的用户");
        relativeLayout.addView(vText);
        return relativeLayout;
    }

    /* JADX INFO: renamed from: c */
    public final View m63973c(Act act) {
        RelativeLayout relativeLayout = new RelativeLayout(act);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        VText vText = new VText(act);
        vText.setLayoutParams(new RelativeLayout.LayoutParams(-2, t100.f167258g));
        relativeLayout.addView(vText);
        return relativeLayout;
    }

    /* JADX INFO: renamed from: d */
    public void m63974d(Act act, List<User> list) {
        xdl0.m208344M(this.f41420a, false);
        xdl0.m208344M(this.f41422c, true);
        if (this.f41423d == null) {
            C11281a c11281a = new C11281a(act);
            this.f41423d = c11281a;
            c11281a.m63979H(this.f41424e);
            d7h d7hVar = new d7h(this.f41423d);
            this.f41422c.setAdapter(d7hVar);
            this.f41422c.clearAnimation();
            d7hVar.m143815H(m63973c(act));
            d7hVar.m143813F(m63972b(act));
        }
        this.f41423d.m63978G(list);
    }

    /* JADX INFO: renamed from: e */
    public void m63975e() {
        xdl0.m208344M(this.f41420a, true);
        xdl0.m208344M(this.f41422c, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63971a(this);
        xdl0.m208344M(this.f41422c, false);
    }

    public void setLoadMoreHandler(InterfaceC11282b interfaceC11282b) {
        this.f41424e = interfaceC11282b;
        if (NullChecker.m81303a(this.f41423d)) {
            this.f41423d.m63979H(this.f41424e);
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
