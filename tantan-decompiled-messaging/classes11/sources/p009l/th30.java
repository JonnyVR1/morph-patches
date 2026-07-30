package p009l;

import android.content.Context;
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
import com.p000p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.user.newui.Item.NewMeetFeedUserImageItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.s;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p1.mobile.putong.core.data.FeedType;
import com.p1.mobile.putong.core.ui.likedusers.LikedUsersAct;
import com.p1.mobile.putong.core.ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.core.ui.vip.picks.act.PicksAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.b3c0;
import l.bt0;
import l.eb2;
import l.j760;
import l.k6c0;
import l.rxg0;
import l.uh30;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import l.zz6;
import org.jetbrains.annotations.NotNull;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class th30 implements kwl {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f20678a;

    /* JADX INFO: renamed from: b */
    public VPager f20679b;

    /* JADX INFO: renamed from: c */
    public NewPictureContainerIndicator f20680c;

    /* JADX INFO: renamed from: d */
    public TextView f20681d;

    /* JADX INFO: renamed from: e */
    public View f20682e;

    /* JADX INFO: renamed from: f */
    public View f20683f;

    /* JADX INFO: renamed from: g */
    public View f20684g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f20685h;

    /* JADX INFO: renamed from: i */
    public TextView f20686i;

    /* JADX INFO: renamed from: j */
    public MeetFeedUserItemData f20687j;

    /* JADX INFO: renamed from: k */
    public C1200b f20688k;

    /* JADX INFO: renamed from: l */
    public Act f20689l;

    /* JADX INFO: renamed from: l.th30$a */
    public class C1199a extends ViewPager.m {
        public C1199a() {
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            th30.this.f20680c.m922b(i);
            if (th30.this.f20687j != null) {
                th30.this.f20687j.picIndex = i;
            }
        }
    }

    /* JADX INFO: renamed from: l.th30$b */
    public static class C1200b extends eb2 {

        /* JADX INFO: renamed from: e */
        public final ArrayList<Media> f20691e = new ArrayList<>();

        /* JADX INFO: renamed from: f */
        public boolean f20692f;

        public int getCount() {
            return this.f20691e.size();
        }

        public int getItemPosition(@NonNull @NotNull Object obj) {
            return -2;
        }

        public boolean isViewFromObject(@NonNull @NotNull View view, @NonNull @NotNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: o */
        public void m22524o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        /* JADX INFO: renamed from: p */
        public Object m22525p(ViewGroup viewGroup, int i) {
            NewMeetFeedUserImageItemView newMeetFeedUserImageItemView = (NewMeetFeedUserImageItemView) o7r.m19649a(viewGroup.getContext()).inflate(k6c0.p0, viewGroup, false);
            newMeetFeedUserImageItemView.m7144b(this.f20691e.get(i), this.f20692f);
            viewGroup.addView(newMeetFeedUserImageItemView);
            return newMeetFeedUserImageItemView;
        }

        /* JADX INFO: renamed from: q */
        public void m22526q(List<Media> list, boolean z) {
            this.f20691e.clear();
            this.f20691e.addAll(list);
            this.f20692f = z;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m22513e(Act act, View view) {
        zvf0.u("e_meet_see_total", "p_meet", new j760[]{vwb.Y("meet_see", "high_pop_level")});
        if (!NullChecker.a(CoreModule.c.o3()) || CoreModule.c.o3().likersLimit.remaining <= 0) {
            CoreModule.P().a().l1(act, "p_meet_view,e_see_banner_highpopsee,click");
        } else {
            act.startActivity(LikersAct.X1(act, "from_meet"));
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m22517i(Act act, View view) {
        zvf0.u("e_meet_see_total", "p_meet", new j760[]{vwb.Y("meet_see", "high_pop_level")});
        if (!NullChecker.a(CoreModule.c.o3()) || CoreModule.c.o3().likersLimit.remaining <= 0) {
            CoreModule.P().a().l1(act, "p_meet_view,e_see_banner_highpopsee,click");
        } else {
            act.startActivity(LikersAct.X1(act, "from_meet"));
        }
    }

    /* JADX INFO: renamed from: l */
    private void m22519l() {
        C1200b c1200b = new C1200b();
        this.f20688k = c1200b;
        this.f20679b.setAdapter(c1200b);
        this.f20679b.d(new C1199a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m22520m(View view) {
        int currentItem = this.f20679b.getCurrentItem();
        if (currentItem == 0) {
            m22522o(-1.5f);
        } else {
            this.f20679b.setCurrentItem(currentItem - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m22521n(View view) {
        int currentItem = this.f20679b.getCurrentItem();
        if (currentItem == this.f20688k.getCount() - 1) {
            m22522o(1.5f);
        } else {
            this.f20679b.setCurrentItem(currentItem + 1);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m22522o(float f) {
        this.f20678a.setPivotX(this.f20679b.getWidth() / 2.0f);
        this.f20678a.setPivotY(this.f20679b.getHeight() / 2.0f);
        bt0.n(this.f20679b, View.ROTATION_Y, new float[]{0.0f, f, 0.0f}).setDuration(200L).start();
    }

    @Override // p009l.kwl
    /* JADX INFO: renamed from: a */
    public void mo11817a(IMeetListData iMeetListData, final Act act) {
        this.f20689l = act;
        MeetFeedUserItemData meetFeedUserItemData = (MeetFeedUserItemData) iMeetListData;
        this.f20687j = meetFeedUserItemData;
        this.f20680c.setIndicatorCount(((AbsMeetUserItemData) meetFeedUserItemData).user.pictures.size());
        xdl0.M(this.f20680c, ((AbsMeetUserItemData) this.f20687j).user.pictures.size() > 1);
        this.f20679b.getAdapter().m22526q(((AbsMeetUserItemData) this.f20687j).user.pictures, !(this.f20687j.isSeePortraitUser() && CoreModule.P().a().e2()) && this.f20687j.isLowSeeSingleUser() && CoreModule.P().a().e2());
        this.f20679b.setCurrentItem(this.f20687j.picIndex);
        xdl0.E0(this.f20683f, new View.OnClickListener() { // from class: l.mh30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16916a.m22520m(view);
            }
        });
        xdl0.E0(this.f20684g, new View.OnClickListener() { // from class: l.nh30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17463a.m22521n(view);
            }
        });
        xdl0.M(this.f20681d, false);
        this.f20681d.setTypeface(Typeface.DEFAULT_BOLD);
        if (((AbsMeetListData) this.f20687j).item.type == FeedType.get("highSeeUser") || ((AbsMeetListData) this.f20687j).item.type == FeedType.get("lowSeeUser") || TextUtils.equals(((AbsMeetListData) this.f20687j).item.momentMediaType, s.Companion.a())) {
            xdl0.M0(this.f20685h, true);
            xdl0.k(this.f20686i, act.getDrawable(b3c0.E0));
            this.f20686i.setText("喜欢我的人 · TA喜欢了我？右滑立即配对");
            xdl0.E0(this.f20685h, new View.OnClickListener() { // from class: l.oh30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    th30.m22517i(act, view);
                }
            });
            xdl0.M(this.f20681d, true);
            boolean zEquals = TEnum.equals(((AbsMeetListData) this.f20687j).item.relation.otherStatus, RelationshipStatus.get("superliked"));
            TextView textView = this.f20681d;
            if (!zEquals) {
                xdl0.k(textView, act.drawable(b3c0.c2));
                this.f20681d.setBackground(act.drawable(b3c0.i2));
                boolean zIsFemale = ((AbsMeetUserItemData) this.f20687j).user.isFemale();
                TextView textView2 = this.f20681d;
                if (zIsFemale) {
                    textView2.setText("她喜欢了我");
                    return;
                } else {
                    textView2.setText("他喜欢了我");
                    return;
                }
            }
            xdl0.k(textView, act.drawable(b3c0.j2));
            this.f20681d.setBackground(act.drawable(b3c0.m2));
            if (CoreModule.P().a().sf() && rxg0.r(((AbsMeetListData) this.f20687j).item.relation.relationshipExt.recvSuperLikedNum) > 1) {
                this.f20681d.setText(String.format("超级喜欢x%s", ((AbsMeetListData) this.f20687j).item.relation.relationshipExt.recvSuperLikedNum));
                return;
            }
            boolean zIsFemale2 = ((AbsMeetUserItemData) this.f20687j).user.isFemale();
            TextView textView3 = this.f20681d;
            if (zIsFemale2) {
                textView3.setText("她超级喜欢了我");
                return;
            } else {
                textView3.setText("他超级喜欢了我");
                return;
            }
        }
        if (((AbsMeetListData) this.f20687j).item.type == FeedType.get("pickUser")) {
            xdl0.M0(this.f20685h, true);
            TextView textView4 = this.f20686i;
            xdl0.k(textView4, textView4.getContext().getDrawable(b3c0.D0));
            if (ura.e().d().Lc()) {
                boolean zU0 = zz6.u0();
                TextView textView5 = this.f20686i;
                if (zU0) {
                    textView5.setText("每日精选 · 认识更多优质男性");
                } else {
                    textView5.setText("每日精选 · 认识更多优质女性");
                }
                xdl0.E0(this.f20685h, new View.OnClickListener() { // from class: l.ph30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ura.e().d().qa(act, "daily_picks_entrance");
                    }
                });
                return;
            }
            boolean zU1 = zz6.u0();
            TextView textView6 = this.f20686i;
            if (zU1) {
                textView6.setText("每日心动 · 发现你的心动男孩");
            } else {
                textView6.setText("每日心动 · 发现你的心动女孩");
            }
            xdl0.E0(this.f20685h, new View.OnClickListener() { // from class: l.qh30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Act act2 = act;
                    act2.startActivity(PicksAct.Y1(act2, "from_meet"));
                }
            });
            return;
        }
        if (((AbsMeetListData) this.f20687j).item.type == FeedType.get("likedUser")) {
            xdl0.M0(this.f20685h, true);
            this.f20686i.setText("我喜欢的人");
            this.f20686i.setCompoundDrawables(null, null, null, null);
            xdl0.E0(this.f20685h, new View.OnClickListener() { // from class: l.rh30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Act act2 = act;
                    act2.startActivity(CoreModule.P().a().Vf() ? NewMyLikedUsersAct.Y1(act2) : new Intent((Context) act2, (Class<?>) LikedUsersAct.class));
                }
            });
            return;
        }
        if (((AbsMeetListData) this.f20687j).item.type != FeedType.get("seePortraitUser")) {
            xdl0.M0(this.f20685h, false);
            return;
        }
        xdl0.M(this.f20681d, true);
        xdl0.M0(this.f20685h, true);
        xdl0.k(this.f20686i, act.getDrawable(b3c0.E0));
        this.f20686i.setText("喜欢我的人 · TA喜欢了我？右滑立即配对");
        xdl0.E0(this.f20685h, new View.OnClickListener() { // from class: l.sh30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                th30.m22513e(act, view);
            }
        });
        xdl0.k(this.f20681d, act.drawable(b3c0.i));
        this.f20681d.setBackground(act.drawable(b3c0.b2));
        this.f20681d.setText("即刻聊天");
    }

    @Override // p009l.kwl
    /* JADX INFO: renamed from: c */
    public View mo11818c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM22523k = m22523k(layoutInflater, viewGroup);
        m22519l();
        return viewM22523k;
    }

    /* JADX INFO: renamed from: k */
    public View m22523k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uh30.b(this, layoutInflater, viewGroup);
    }

    @Override // p009l.kwl
    public void release() {
    }
}
