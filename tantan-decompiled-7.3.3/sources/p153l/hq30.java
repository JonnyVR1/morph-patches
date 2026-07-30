package p153l;

import android.content.Intent;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4904s;
import com.p051p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p051p1.mobile.putong.core.data.FeedType;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.user.newui.Item.NewMeetFeedUserImageItemView;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUsersAct;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.act.PicksAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VPager;

/* JADX INFO: loaded from: classes11.dex */
public class hq30 implements czl {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f111070a;

    /* JADX INFO: renamed from: b */
    public VPager f111071b;

    /* JADX INFO: renamed from: c */
    public NewPictureContainerIndicator f111072c;

    /* JADX INFO: renamed from: d */
    public TextView f111073d;

    /* JADX INFO: renamed from: e */
    public View f111074e;

    /* JADX INFO: renamed from: f */
    public View f111075f;

    /* JADX INFO: renamed from: g */
    public View f111076g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f111077h;

    /* JADX INFO: renamed from: i */
    public TextView f111078i;

    /* JADX INFO: renamed from: j */
    public MeetFeedUserItemData f111079j;

    /* JADX INFO: renamed from: k */
    public C17535b f111080k;

    /* JADX INFO: renamed from: l */
    public Act f111081l;

    /* JADX INFO: renamed from: l.hq30$a */
    public class C17534a extends ViewPager.C0721m {
        public C17534a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            hq30.this.f111072c.m37958b(i);
            if (hq30.this.f111079j != null) {
                hq30.this.f111079j.picIndex = i;
            }
        }
    }

    /* JADX INFO: renamed from: l.hq30$b */
    public static class C17535b extends lb2 {

        /* JADX INFO: renamed from: e */
        public final ArrayList<Media> f111083e = new ArrayList<>();

        /* JADX INFO: renamed from: f */
        public boolean f111084f;

        @Override // p153l.cf60
        public int getCount() {
            return this.f111083e.size();
        }

        @Override // p153l.cf60
        public int getItemPosition(@NonNull @NotNull Object obj) {
            return -2;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull @NotNull View view, @NonNull @NotNull Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            NewMeetFeedUserImageItemView newMeetFeedUserImageItemView = (NewMeetFeedUserImageItemView) p9r.m171370a(viewGroup.getContext()).inflate(pec0.f152026p0, viewGroup, false);
            newMeetFeedUserImageItemView.m43960b(this.f111083e.get(i), this.f111084f);
            viewGroup.addView(newMeetFeedUserImageItemView);
            return newMeetFeedUserImageItemView;
        }

        /* JADX INFO: renamed from: q */
        public void m136599q(List<Media> list, boolean z) {
            this.f111083e.clear();
            this.f111083e.addAll(list);
            this.f111084f = z;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m136588e(Act act, View view) {
        i4g0.m138523u("e_meet_see_total", "p_meet", jyb.m147494Y("meet_see", "high_pop_level"));
        if (!NullChecker.m82486a(CoreModule.f18264c.m32487o3()) || CoreModule.f18264c.m32487o3().likersLimit.remaining <= 0) {
            CoreModule.m30933P().m143405a().mo34537l1(act, "p_meet_view,e_see_banner_highpopsee,click");
        } else {
            act.startActivity(LikersAct.m57727Y1(act, "from_meet"));
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m136592i(Act act, View view) {
        i4g0.m138523u("e_meet_see_total", "p_meet", jyb.m147494Y("meet_see", "high_pop_level"));
        if (!NullChecker.m82486a(CoreModule.f18264c.m32487o3()) || CoreModule.f18264c.m32487o3().likersLimit.remaining <= 0) {
            CoreModule.m30933P().m143405a().mo34537l1(act, "p_meet_view,e_see_banner_highpopsee,click");
        } else {
            act.startActivity(LikersAct.m57727Y1(act, "from_meet"));
        }
    }

    /* JADX INFO: renamed from: l */
    private void m136594l() {
        C17535b c17535b = new C17535b();
        this.f111080k = c17535b;
        this.f111071b.setAdapter(c17535b);
        this.f111071b.m4187d(new C17534a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m136595m(View view) {
        int currentItem = this.f111071b.getCurrentItem();
        if (currentItem == 0) {
            m136597o(-1.5f);
        } else {
            this.f111071b.setCurrentItem(currentItem - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m136596n(View view) {
        int currentItem = this.f111071b.getCurrentItem();
        if (currentItem == this.f111080k.getCount() - 1) {
            m136597o(1.5f);
        } else {
            this.f111071b.setCurrentItem(currentItem + 1);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m136597o(float f) {
        this.f111070a.setPivotX(this.f111071b.getWidth() / 2.0f);
        this.f111070a.setPivotY(this.f111071b.getHeight() / 2.0f);
        gt0.m132168n(this.f111071b, View.ROTATION_Y, 0.0f, f, 0.0f).setDuration(200L).start();
    }

    @Override // p153l.czl
    /* JADX INFO: renamed from: a */
    public void mo103244a(IMeetListData iMeetListData, final Act act) {
        this.f111081l = act;
        MeetFeedUserItemData meetFeedUserItemData = (MeetFeedUserItemData) iMeetListData;
        this.f111079j = meetFeedUserItemData;
        this.f111072c.setIndicatorCount(meetFeedUserItemData.user.pictures.size());
        bnl0.m105524M(this.f111072c, this.f111079j.user.pictures.size() > 1);
        ((C17535b) this.f111071b.getAdapter()).m136599q(this.f111079j.user.pictures, !(this.f111079j.isSeePortraitUser() && CoreModule.m30933P().m143405a().mo34492e2()) && this.f111079j.isLowSeeSingleUser() && CoreModule.m30933P().m143405a().mo34492e2());
        this.f111071b.setCurrentItem(this.f111079j.picIndex);
        bnl0.m105509E0(this.f111075f, new View.OnClickListener() { // from class: l.aq30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72783a.m136595m(view);
            }
        });
        bnl0.m105509E0(this.f111076g, new View.OnClickListener() { // from class: l.bq30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77852a.m136596n(view);
            }
        });
        bnl0.m105524M(this.f111073d, false);
        this.f111073d.setTypeface(Typeface.DEFAULT_BOLD);
        if (this.f111079j.item.type == FeedType.get(FeedType.highSeeUser) || this.f111079j.item.type == FeedType.get(FeedType.lowSeeUser) || TextUtils.equals(this.f111079j.item.momentMediaType, C4904s.INSTANCE.m35738a())) {
            bnl0.m105525M0(this.f111077h, true);
            bnl0.m105563k(this.f111078i, act.getDrawable(gbc0.f103100E0));
            this.f111078i.setText("喜欢我的人 · TA喜欢了我？右滑立即配对");
            bnl0.m105509E0(this.f111077h, new View.OnClickListener() { // from class: l.cq30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hq30.m136592i(act, view);
                }
            });
            bnl0.m105524M(this.f111073d, true);
            boolean zEquals = TEnum.equals(this.f111079j.item.relation.otherStatus, RelationshipStatus.get("superliked"));
            TextView textView = this.f111073d;
            if (!zEquals) {
                bnl0.m105563k(textView, act.drawable(gbc0.f103272c2));
                this.f111073d.setBackground(act.drawable(gbc0.f103320i2));
                boolean zIsFemale = this.f111079j.user.isFemale();
                TextView textView2 = this.f111073d;
                if (zIsFemale) {
                    textView2.setText("她喜欢了我");
                    return;
                } else {
                    textView2.setText("他喜欢了我");
                    return;
                }
            }
            bnl0.m105563k(textView, act.drawable(gbc0.f103328j2));
            this.f111073d.setBackground(act.drawable(gbc0.f103352m2));
            if (CoreModule.m30933P().m143405a().mo34590sf() && z5h0.m218677r(this.f111079j.item.relation.relationshipExt.recvSuperLikedNum) > 1) {
                this.f111073d.setText(String.format("超级喜欢x%s", this.f111079j.item.relation.relationshipExt.recvSuperLikedNum));
                return;
            }
            boolean zIsFemale2 = this.f111079j.user.isFemale();
            TextView textView3 = this.f111073d;
            if (zIsFemale2) {
                textView3.setText("她超级喜欢了我");
                return;
            } else {
                textView3.setText("他超级喜欢了我");
                return;
            }
        }
        if (this.f111079j.item.type == FeedType.get(FeedType.pickUser)) {
            bnl0.m105525M0(this.f111077h, true);
            TextView textView4 = this.f111078i;
            bnl0.m105563k(textView4, textView4.getContext().getDrawable(gbc0.f103093D0));
            if (gta.m132210e().m132214d().mo34719Lc()) {
                boolean zM107528u0 = c17.m107528u0();
                TextView textView5 = this.f111078i;
                if (zM107528u0) {
                    textView5.setText("每日精选 · 认识更多优质男性");
                } else {
                    textView5.setText("每日精选 · 认识更多优质女性");
                }
                bnl0.m105509E0(this.f111077h, new View.OnClickListener() { // from class: l.dq30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        gta.m132210e().m132214d().mo34908qa(act, "daily_picks_entrance");
                    }
                });
                return;
            }
            boolean zM107528u1 = c17.m107528u0();
            TextView textView6 = this.f111078i;
            if (zM107528u1) {
                textView6.setText("每日心动 · 发现你的心动男孩");
            } else {
                textView6.setText("每日心动 · 发现你的心动女孩");
            }
            bnl0.m105509E0(this.f111077h, new View.OnClickListener() { // from class: l.eq30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Act act2 = act;
                    act2.startActivity(PicksAct.m57925Z1(act2, "from_meet"));
                }
            });
            return;
        }
        if (this.f111079j.item.type == FeedType.get("likedUser")) {
            bnl0.m105525M0(this.f111077h, true);
            this.f111078i.setText("我喜欢的人");
            this.f111078i.setCompoundDrawables(null, null, null, null);
            bnl0.m105509E0(this.f111077h, new View.OnClickListener() { // from class: l.fq30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Act act2 = act;
                    act2.startActivity(CoreModule.m30933P().m143405a().mo34436Vf() ? NewMyLikedUsersAct.m48003Z1(act2) : new Intent(act2, (Class<?>) LikedUsersAct.class));
                }
            });
            return;
        }
        if (this.f111079j.item.type != FeedType.get(FeedType.seePortraitUser)) {
            bnl0.m105525M0(this.f111077h, false);
            return;
        }
        bnl0.m105524M(this.f111073d, true);
        bnl0.m105525M0(this.f111077h, true);
        bnl0.m105563k(this.f111078i, act.getDrawable(gbc0.f103100E0));
        this.f111078i.setText("喜欢我的人 · TA喜欢了我？右滑立即配对");
        bnl0.m105509E0(this.f111077h, new View.OnClickListener() { // from class: l.gq30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hq30.m136588e(act, view);
            }
        });
        bnl0.m105563k(this.f111073d, act.drawable(gbc0.f103317i));
        this.f111073d.setBackground(act.drawable(gbc0.f103264b2));
        this.f111073d.setText("即刻聊天");
    }

    @Override // p153l.czl
    /* JADX INFO: renamed from: c */
    public View mo103246c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM136598k = m136598k(layoutInflater, viewGroup);
        m136594l();
        return viewM136598k;
    }

    /* JADX INFO: renamed from: k */
    public View m136598k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iq30.m141560b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.czl
    public void release() {
    }
}
