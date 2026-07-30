package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4753s;
import com.p046p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p046p1.mobile.putong.core.data.FeedType;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.user.newui.Item.NewMeetFeedUserImageItemView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUsersAct;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.act.PicksAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VPager;

/* JADX INFO: loaded from: classes11.dex */
public class th30 implements kwl {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f170185a;

    /* JADX INFO: renamed from: b */
    public VPager f170186b;

    /* JADX INFO: renamed from: c */
    public NewPictureContainerIndicator f170187c;

    /* JADX INFO: renamed from: d */
    public TextView f170188d;

    /* JADX INFO: renamed from: e */
    public View f170189e;

    /* JADX INFO: renamed from: f */
    public View f170190f;

    /* JADX INFO: renamed from: g */
    public View f170191g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f170192h;

    /* JADX INFO: renamed from: i */
    public TextView f170193i;

    /* JADX INFO: renamed from: j */
    public MeetFeedUserItemData f170194j;

    /* JADX INFO: renamed from: k */
    public C20173b f170195k;

    /* JADX INFO: renamed from: l */
    public Act f170196l;

    /* JADX INFO: renamed from: l.th30$a */
    public class C20172a extends ViewPager.C0719m {
        public C20172a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            th30.this.f170187c.m36955b(i);
            if (th30.this.f170194j != null) {
                th30.this.f170194j.picIndex = i;
            }
        }
    }

    /* JADX INFO: renamed from: l.th30$b */
    public static class C20173b extends eb2 {

        /* JADX INFO: renamed from: e */
        public final ArrayList<Media> f170198e = new ArrayList<>();

        /* JADX INFO: renamed from: f */
        public boolean f170199f;

        @Override // p149l.w660
        public int getCount() {
            return this.f170198e.size();
        }

        @Override // p149l.w660
        public int getItemPosition(@NonNull @NotNull Object obj) {
            return -2;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull @NotNull View view, @NonNull @NotNull Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            NewMeetFeedUserImageItemView newMeetFeedUserImageItemView = (NewMeetFeedUserImageItemView) o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121418p0, viewGroup, false);
            newMeetFeedUserImageItemView.m42949b(this.f170198e.get(i), this.f170199f);
            viewGroup.addView(newMeetFeedUserImageItemView);
            return newMeetFeedUserImageItemView;
        }

        /* JADX INFO: renamed from: q */
        public void m188857q(List<Media> list, boolean z) {
            this.f170198e.clear();
            this.f170198e.addAll(list);
            this.f170199f = z;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m188846e(Act act, View view) {
        zvf0.m220399u("e_meet_see_total", "p_meet", vwb.m200311Y("meet_see", "high_pop_level"));
        if (!NullChecker.m81303a(CoreModule.f17545c.m31484o3()) || CoreModule.f17545c.m31484o3().likersLimit.remaining <= 0) {
            CoreModule.m29935P().m94651a().mo33534l1(act, "p_meet_view,e_see_banner_highpopsee,click");
        } else {
            act.startActivity(LikersAct.m56544X1(act, "from_meet"));
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m188850i(Act act, View view) {
        zvf0.m220399u("e_meet_see_total", "p_meet", vwb.m200311Y("meet_see", "high_pop_level"));
        if (!NullChecker.m81303a(CoreModule.f17545c.m31484o3()) || CoreModule.f17545c.m31484o3().likersLimit.remaining <= 0) {
            CoreModule.m29935P().m94651a().mo33534l1(act, "p_meet_view,e_see_banner_highpopsee,click");
        } else {
            act.startActivity(LikersAct.m56544X1(act, "from_meet"));
        }
    }

    /* JADX INFO: renamed from: l */
    private void m188852l() {
        C20173b c20173b = new C20173b();
        this.f170195k = c20173b;
        this.f170186b.setAdapter(c20173b);
        this.f170186b.m4185d(new C20172a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m188853m(View view) {
        int currentItem = this.f170186b.getCurrentItem();
        if (currentItem == 0) {
            m188855o(-1.5f);
        } else {
            this.f170186b.setCurrentItem(currentItem - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m188854n(View view) {
        int currentItem = this.f170186b.getCurrentItem();
        if (currentItem == this.f170195k.getCount() - 1) {
            m188855o(1.5f);
        } else {
            this.f170186b.setCurrentItem(currentItem + 1);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m188855o(float f) {
        this.f170185a.setPivotX(this.f170186b.getWidth() / 2.0f);
        this.f170185a.setPivotY(this.f170186b.getHeight() / 2.0f);
        bt0.m103741n(this.f170186b, View.ROTATION_Y, 0.0f, f, 0.0f).setDuration(200L).start();
    }

    @Override // p149l.kwl
    /* JADX INFO: renamed from: a */
    public void mo99891a(IMeetListData iMeetListData, final Act act) {
        this.f170196l = act;
        MeetFeedUserItemData meetFeedUserItemData = (MeetFeedUserItemData) iMeetListData;
        this.f170194j = meetFeedUserItemData;
        this.f170187c.setIndicatorCount(meetFeedUserItemData.user.pictures.size());
        xdl0.m208344M(this.f170187c, this.f170194j.user.pictures.size() > 1);
        ((C20173b) this.f170186b.getAdapter()).m188857q(this.f170194j.user.pictures, !(this.f170194j.isSeePortraitUser() && CoreModule.m29935P().m94651a().mo33489e2()) && this.f170194j.isLowSeeSingleUser() && CoreModule.m29935P().m94651a().mo33489e2());
        this.f170186b.setCurrentItem(this.f170194j.picIndex);
        xdl0.m208329E0(this.f170190f, new View.OnClickListener() { // from class: l.mh30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133776a.m188853m(view);
            }
        });
        xdl0.m208329E0(this.f170191g, new View.OnClickListener() { // from class: l.nh30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138945a.m188854n(view);
            }
        });
        xdl0.m208344M(this.f170188d, false);
        this.f170188d.setTypeface(Typeface.DEFAULT_BOLD);
        if (this.f170194j.item.type == FeedType.get(FeedType.highSeeUser) || this.f170194j.item.type == FeedType.get(FeedType.lowSeeUser) || TextUtils.equals(this.f170194j.item.momentMediaType, C4753s.INSTANCE.m34735a())) {
            xdl0.m208345M0(this.f170192h, true);
            xdl0.m208383k(this.f170193i, act.getDrawable(b3c0.f72849E0));
            this.f170193i.setText("喜欢我的人 · TA喜欢了我？右滑立即配对");
            xdl0.m208329E0(this.f170192h, new View.OnClickListener() { // from class: l.oh30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    th30.m188850i(act, view);
                }
            });
            xdl0.m208344M(this.f170188d, true);
            boolean zEquals = TEnum.equals(this.f170194j.item.relation.otherStatus, RelationshipStatus.get("superliked"));
            TextView textView = this.f170188d;
            if (!zEquals) {
                xdl0.m208383k(textView, act.drawable(b3c0.f73021c2));
                this.f170188d.setBackground(act.drawable(b3c0.f73069i2));
                boolean zIsFemale = this.f170194j.user.isFemale();
                TextView textView2 = this.f170188d;
                if (zIsFemale) {
                    textView2.setText("她喜欢了我");
                    return;
                } else {
                    textView2.setText("他喜欢了我");
                    return;
                }
            }
            xdl0.m208383k(textView, act.drawable(b3c0.f73077j2));
            this.f170188d.setBackground(act.drawable(b3c0.f73101m2));
            if (CoreModule.m29935P().m94651a().mo33587sf() && rxg0.m181574r(this.f170194j.item.relation.relationshipExt.recvSuperLikedNum) > 1) {
                this.f170188d.setText(String.format("超级喜欢x%s", this.f170194j.item.relation.relationshipExt.recvSuperLikedNum));
                return;
            }
            boolean zIsFemale2 = this.f170194j.user.isFemale();
            TextView textView3 = this.f170188d;
            if (zIsFemale2) {
                textView3.setText("她超级喜欢了我");
                return;
            } else {
                textView3.setText("他超级喜欢了我");
                return;
            }
        }
        if (this.f170194j.item.type == FeedType.get(FeedType.pickUser)) {
            xdl0.m208345M0(this.f170192h, true);
            TextView textView4 = this.f170193i;
            xdl0.m208383k(textView4, textView4.getContext().getDrawable(b3c0.f72842D0));
            if (ura.m195053e().m195057d().mo33716Lc()) {
                boolean zM221004u0 = zz6.m221004u0();
                TextView textView5 = this.f170193i;
                if (zM221004u0) {
                    textView5.setText("每日精选 · 认识更多优质男性");
                } else {
                    textView5.setText("每日精选 · 认识更多优质女性");
                }
                xdl0.m208329E0(this.f170192h, new View.OnClickListener() { // from class: l.ph30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ura.m195053e().m195057d().mo33905qa(act, "daily_picks_entrance");
                    }
                });
                return;
            }
            boolean zM221004u1 = zz6.m221004u0();
            TextView textView6 = this.f170193i;
            if (zM221004u1) {
                textView6.setText("每日心动 · 发现你的心动男孩");
            } else {
                textView6.setText("每日心动 · 发现你的心动女孩");
            }
            xdl0.m208329E0(this.f170192h, new View.OnClickListener() { // from class: l.qh30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Act act2 = act;
                    act2.startActivity(PicksAct.m56742Y1(act2, "from_meet"));
                }
            });
            return;
        }
        if (this.f170194j.item.type == FeedType.get("likedUser")) {
            xdl0.m208345M0(this.f170192h, true);
            this.f170193i.setText("我喜欢的人");
            this.f170193i.setCompoundDrawables(null, null, null, null);
            xdl0.m208329E0(this.f170192h, new View.OnClickListener() { // from class: l.rh30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Act act2 = act;
                    act2.startActivity(CoreModule.m29935P().m94651a().mo33433Vf() ? NewMyLikedUsersAct.m46820Y1(act2) : new Intent(act2, (Class<?>) LikedUsersAct.class));
                }
            });
            return;
        }
        if (this.f170194j.item.type != FeedType.get(FeedType.seePortraitUser)) {
            xdl0.m208345M0(this.f170192h, false);
            return;
        }
        xdl0.m208344M(this.f170188d, true);
        xdl0.m208345M0(this.f170192h, true);
        xdl0.m208383k(this.f170193i, act.getDrawable(b3c0.f72849E0));
        this.f170193i.setText("喜欢我的人 · TA喜欢了我？右滑立即配对");
        xdl0.m208329E0(this.f170192h, new View.OnClickListener() { // from class: l.sh30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                th30.m188846e(act, view);
            }
        });
        xdl0.m208383k(this.f170188d, act.drawable(b3c0.f73066i));
        this.f170188d.setBackground(act.drawable(b3c0.f73013b2));
        this.f170188d.setText("即刻聊天");
    }

    @Override // p149l.kwl
    /* JADX INFO: renamed from: c */
    public View mo99892c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM188856k = m188856k(layoutInflater, viewGroup);
        m188852l();
        return viewM188856k;
    }

    /* JADX INFO: renamed from: k */
    public View m188856k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uh30.m193612b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.kwl
    public void release() {
    }
}
