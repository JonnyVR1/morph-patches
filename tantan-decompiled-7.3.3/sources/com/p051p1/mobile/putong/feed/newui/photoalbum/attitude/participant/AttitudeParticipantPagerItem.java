package com.p051p1.mobile.putong.feed.newui.photoalbum.attitude.participant;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;
import p153l.bnl0;
import p153l.h80;
import p153l.hdc0;
import p153l.jic0;
import p153l.jyb;
import p153l.k9c0;
import p153l.qa00;
import p153l.s8h;
import p153l.tec0;
import p153l.u41;

/* JADX INFO: loaded from: classes13.dex */
public class AttitudeParticipantPagerItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f42268a;

    /* JADX INFO: renamed from: b */
    public ImageView f42269b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f42270c;

    /* JADX INFO: renamed from: d */
    public C11444a f42271d;

    /* JADX INFO: renamed from: e */
    public InterfaceC11445b f42272e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem$a */
    public static class C11444a extends jic0<User> {

        /* JADX INFO: renamed from: d */
        public InterfaceC11445b f42274d;

        /* JADX INFO: renamed from: e */
        public Act f42275e;

        /* JADX INFO: renamed from: c */
        public List<User> f42273c = new ArrayList();

        /* JADX INFO: renamed from: f */
        public h80<User> f42276f = new a();

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem$a$a */
        public class a extends h80<User> {

            /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem$a$a$a, reason: collision with other inner class name */
            public class C22817a extends ViewPager.C0721m {
                public C22817a() {
                }

                @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
                public void onPageScrollStateChanged(int i) {
                    super.onPageScrollStateChanged(i);
                    if (i == 0) {
                        a.this.m133884o();
                    }
                }
            }

            public a() {
            }

            @Override // p153l.h80
            /* JADX INFO: renamed from: f */
            public void mo56877f(ViewGroup viewGroup, ViewGroup viewGroup2) {
                ViewPager viewPager = (ViewPager) viewGroup.findViewById(hdc0.f108937k2);
                if (viewPager == null) {
                    return;
                }
                viewPager.m4187d(new C22817a());
            }

            @Override // p153l.h80
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public void mo65120k(User user, int i, View view) {
                if (AttitudeParticipantListtem.class.isInstance(view)) {
                    ((AttitudeParticipantListtem) view).m65153w(C11444a.this.f42275e, user);
                }
            }

            @Override // p153l.h80
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public void mo56879m(User user, int i, long j, View view) {
            }
        }

        public C11444a(Act act) {
            this.f42275e = act;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            return this.f42273c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return this.f42275e.inflater().inflate(tec0.f173495F, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, User user, int i, int i2) {
            this.f42276f.m133881h(view, user, i2);
            ((AttitudeParticipantListtem) view).m65149s(this.f42275e, user);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public User getItem(int i) {
            return this.f42273c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m65161G(List<User> list) {
            if (!jyb.m147479J(list)) {
                this.f42273c = list;
            }
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: H */
        public void m65162H(InterfaceC11445b interfaceC11445b) {
            this.f42274d = interfaceC11445b;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: e */
        public void mo48510e(int i) {
            if (this.f42273c.size() <= 0 || this.f42273c.size() - i >= 3 || !this.f42274d.mo65165b()) {
                return;
            }
            this.f42274d.mo65166c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
            super.onViewAttachedToWindow(abstractC0569e0);
            this.f42276f.m133884o();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
            super.onViewDetachedFromWindow(abstractC0569e0);
            this.f42276f.m133884o();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem$b */
    public interface InterfaceC11445b {
        /* JADX INFO: renamed from: b */
        boolean mo65165b();

        /* JADX INFO: renamed from: c */
        void mo65166c();
    }

    public AttitudeParticipantPagerItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m65154a(View view) {
        u41.m194463a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final View m65155b(Act act) {
        RelativeLayout relativeLayout = new RelativeLayout(act);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        VText vText = new VText(act);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = qa00.f156329p;
        layoutParams.bottomMargin = qa00.f156338y;
        layoutParams.addRule(14);
        vText.setLayoutParams(layoutParams);
        vText.getPaint().setFakeBoldText(true);
        vText.setTextColor(act.getResources().getColor(k9c0.f124527q));
        vText.setTextSize(14.0f);
        vText.setText("仅展示最近表态的用户");
        relativeLayout.addView(vText);
        return relativeLayout;
    }

    /* JADX INFO: renamed from: c */
    public final View m65156c(Act act) {
        RelativeLayout relativeLayout = new RelativeLayout(act);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        VText vText = new VText(act);
        vText.setLayoutParams(new RelativeLayout.LayoutParams(-2, qa00.f156320g));
        relativeLayout.addView(vText);
        return relativeLayout;
    }

    /* JADX INFO: renamed from: d */
    public void m65157d(Act act, List<User> list) {
        bnl0.m105524M(this.f42268a, false);
        bnl0.m105524M(this.f42270c, true);
        if (this.f42271d == null) {
            C11444a c11444a = new C11444a(act);
            this.f42271d = c11444a;
            c11444a.m65162H(this.f42272e);
            s8h s8hVar = new s8h(this.f42271d);
            this.f42270c.setAdapter(s8hVar);
            this.f42270c.clearAnimation();
            s8hVar.m222265H(m65156c(act));
            s8hVar.m222263F(m65155b(act));
        }
        this.f42271d.m65161G(list);
    }

    /* JADX INFO: renamed from: e */
    public void m65158e() {
        bnl0.m105524M(this.f42268a, true);
        bnl0.m105524M(this.f42270c, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65154a(this);
        bnl0.m105524M(this.f42270c, false);
    }

    public void setLoadMoreHandler(InterfaceC11445b interfaceC11445b) {
        this.f42272e = interfaceC11445b;
        if (NullChecker.m82486a(this.f42271d)) {
            this.f42271d.m65162H(this.f42272e);
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
