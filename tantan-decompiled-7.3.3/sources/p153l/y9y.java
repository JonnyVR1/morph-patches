package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedItemData;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.pager.MeetFeedPageImageItemView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VPager;

/* JADX INFO: loaded from: classes11.dex */
public class y9y implements czl {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f198134a;

    /* JADX INFO: renamed from: b */
    public VPager f198135b;

    /* JADX INFO: renamed from: c */
    public NewPictureContainerIndicator f198136c;

    /* JADX INFO: renamed from: d */
    public TextView f198137d;

    /* JADX INFO: renamed from: e */
    public MeetFeedItemData f198138e;

    /* JADX INFO: renamed from: f */
    public C21548b f198139f;

    /* JADX INFO: renamed from: l.y9y$a */
    public class C21547a extends ViewPager.C0721m {
        public C21547a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            y9y.this.f198136c.m37958b(i);
            if (y9y.this.f198138e != null) {
                y9y.this.f198138e.picIndex = i;
            }
        }
    }

    /* JADX INFO: renamed from: l.y9y$b */
    public class C21548b extends lb2 {

        /* JADX INFO: renamed from: e */
        public final ArrayList<Media> f198141e = new ArrayList<>();

        public C21548b() {
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f198141e.size();
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
            MeetFeedPageImageItemView meetFeedPageImageItemView = (MeetFeedPageImageItemView) p9r.m171370a(viewGroup.getContext()).inflate(pec0.f152038s0, viewGroup, false);
            meetFeedPageImageItemView.m43951d(this.f198141e.get(i), new y20() { // from class: l.z9y
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203524a.m214850r((Boolean) obj);
                }
            });
            viewGroup.addView(meetFeedPageImageItemView);
            return meetFeedPageImageItemView;
        }

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ void m214850r(Boolean bool) {
            int i;
            int currentItem = y9y.this.f198135b.getCurrentItem();
            if (bool.booleanValue()) {
                if (currentItem == 0) {
                    y9y.this.m214847g(-1.5f);
                    return;
                }
                i = currentItem - 1;
            } else {
                if (currentItem == this.f198141e.size() - 1) {
                    y9y.this.m214847g(1.5f);
                    return;
                }
                i = currentItem + 1;
            }
            y9y.this.f198135b.setCurrentItem(i);
        }

        /* JADX INFO: renamed from: s */
        public void m214851s(List<Media> list) {
            this.f198141e.clear();
            this.f198141e.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m214846f() {
        C21548b c21548b = new C21548b();
        this.f198139f = c21548b;
        this.f198135b.setAdapter(c21548b);
        this.f198135b.m4187d(new C21547a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m214847g(float f) {
        this.f198134a.setPivotX(this.f198135b.getWidth() / 2.0f);
        this.f198134a.setPivotY(this.f198135b.getHeight() / 2.0f);
        gt0.m132168n(this.f198135b, View.ROTATION_Y, 0.0f, f, 0.0f).setDuration(200L).start();
    }

    @Override // p153l.czl
    /* JADX INFO: renamed from: a */
    public void mo103244a(IMeetListData iMeetListData, Act act) {
        MeetFeedItemData meetFeedItemData = (MeetFeedItemData) iMeetListData;
        this.f198138e = meetFeedItemData;
        List<Media> list = meetFeedItemData.moment.media;
        if (NullChecker.m82486a(list) && !list.isEmpty()) {
            this.f198136c.setIndicatorCount(list.size());
            bnl0.m105524M(this.f198136c, list.size() > 1);
            ((C21548b) this.f198135b.getAdapter()).m214851s(list);
        }
        this.f198135b.setCurrentItem(this.f198138e.picIndex);
        if (!TEnum.equals(this.f198138e.item.relation.otherStatus, RelationshipStatus.get("superliked")) || !CoreModule.m30933P().m143405a().mo34590sf() || z5h0.m218677r(this.f198138e.item.relation.relationshipExt.recvSuperLikedNum) <= 1) {
            bnl0.m105524M(this.f198137d, false);
            return;
        }
        bnl0.m105524M(this.f198137d, true);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f198137d.getLayoutParams();
        if (bnl0.m105529O0(this.f198136c)) {
            layoutParams.topMargin = qa00.f156321h;
        } else {
            layoutParams.topMargin = qa00.f156323j;
        }
        this.f198137d.setLayoutParams(layoutParams);
        bnl0.m105563k(this.f198137d, act.drawable(gbc0.f103328j2));
        this.f198137d.setBackground(act.drawable(gbc0.f103352m2));
        this.f198137d.setTypeface(lyh0.m156283c(2), 1);
        this.f198137d.setText(String.format("超级喜欢x%s", this.f198138e.item.relation.relationshipExt.recvSuperLikedNum));
    }

    @Override // p153l.czl
    /* JADX INFO: renamed from: c */
    public View mo103246c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM214848e = m214848e(layoutInflater, viewGroup);
        m214846f();
        return viewM214848e;
    }

    /* JADX INFO: renamed from: e */
    public View m214848e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aay.m96671b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.czl
    public void release() {
    }
}
