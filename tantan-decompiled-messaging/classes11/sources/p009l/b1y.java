package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.pager.MeetFeedPageImageItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedItemData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.b3c0;
import l.bt0;
import l.d1y;
import l.e30;
import l.eb2;
import l.eqh0;
import l.k6c0;
import l.rxg0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class b1y implements kwl {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f9874a;

    /* JADX INFO: renamed from: b */
    public VPager f9875b;

    /* JADX INFO: renamed from: c */
    public NewPictureContainerIndicator f9876c;

    /* JADX INFO: renamed from: d */
    public TextView f9877d;

    /* JADX INFO: renamed from: e */
    public MeetFeedItemData f9878e;

    /* JADX INFO: renamed from: f */
    public C0773b f9879f;

    /* JADX INFO: renamed from: l.b1y$a */
    public class C0772a extends ViewPager.m {
        public C0772a() {
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            b1y.this.f9876c.m922b(i);
            if (b1y.this.f9878e != null) {
                b1y.this.f9878e.picIndex = i;
            }
        }
    }

    /* JADX INFO: renamed from: l.b1y$b */
    public class C0773b extends eb2 {

        /* JADX INFO: renamed from: e */
        public final ArrayList<Media> f9881e = new ArrayList<>();

        public C0773b() {
        }

        public int getCount() {
            return this.f9881e.size();
        }

        public int getItemPosition(@NonNull @NotNull Object obj) {
            return -2;
        }

        public boolean isViewFromObject(@NonNull @NotNull View view, @NonNull @NotNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: o */
        public void m11821o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        /* JADX INFO: renamed from: p */
        public Object m11822p(ViewGroup viewGroup, int i) {
            MeetFeedPageImageItemView meetFeedPageImageItemView = (MeetFeedPageImageItemView) o7r.m19649a(viewGroup.getContext()).inflate(k6c0.s0, viewGroup, false);
            meetFeedPageImageItemView.m7135d(this.f9881e.get(i), new e30() { // from class: l.c1y
                public final void call(Object obj) {
                    this.f10413a.m11823r((Boolean) obj);
                }
            });
            viewGroup.addView(meetFeedPageImageItemView);
            return meetFeedPageImageItemView;
        }

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ void m11823r(Boolean bool) {
            int i;
            int currentItem = b1y.this.f9875b.getCurrentItem();
            if (bool.booleanValue()) {
                if (currentItem == 0) {
                    b1y.this.m11816g(-1.5f);
                    return;
                }
                i = currentItem - 1;
            } else {
                if (currentItem == this.f9881e.size() - 1) {
                    b1y.this.m11816g(1.5f);
                    return;
                }
                i = currentItem + 1;
            }
            b1y.this.f9875b.setCurrentItem(i);
        }

        /* JADX INFO: renamed from: s */
        public void m11824s(List<Media> list) {
            this.f9881e.clear();
            this.f9881e.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m11815f() {
        C0773b c0773b = new C0773b();
        this.f9879f = c0773b;
        this.f9875b.setAdapter(c0773b);
        this.f9875b.d(new C0772a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m11816g(float f) {
        this.f9874a.setPivotX(this.f9875b.getWidth() / 2.0f);
        this.f9874a.setPivotY(this.f9875b.getHeight() / 2.0f);
        bt0.n(this.f9875b, View.ROTATION_Y, new float[]{0.0f, f, 0.0f}).setDuration(200L).start();
    }

    @Override // p009l.kwl
    /* JADX INFO: renamed from: a */
    public void mo11817a(IMeetListData iMeetListData, Act act) {
        MeetFeedItemData meetFeedItemData = (MeetFeedItemData) iMeetListData;
        this.f9878e = meetFeedItemData;
        List<Media> list = meetFeedItemData.moment.media;
        if (NullChecker.a(list) && !list.isEmpty()) {
            this.f9876c.setIndicatorCount(list.size());
            xdl0.M(this.f9876c, list.size() > 1);
            this.f9875b.getAdapter().m11824s(list);
        }
        this.f9875b.setCurrentItem(this.f9878e.picIndex);
        if (!TEnum.equals(((AbsMeetListData) this.f9878e).item.relation.otherStatus, RelationshipStatus.get("superliked")) || !CoreModule.P().a().sf() || rxg0.r(((AbsMeetListData) this.f9878e).item.relation.relationshipExt.recvSuperLikedNum) <= 1) {
            xdl0.M(this.f9877d, false);
            return;
        }
        xdl0.M(this.f9877d, true);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9877d.getLayoutParams();
        if (xdl0.O0(this.f9876c)) {
            layoutParams.topMargin = t100.h;
        } else {
            layoutParams.topMargin = t100.j;
        }
        this.f9877d.setLayoutParams(layoutParams);
        xdl0.k(this.f9877d, act.drawable(b3c0.j2));
        this.f9877d.setBackground(act.drawable(b3c0.m2));
        this.f9877d.setTypeface(eqh0.c(2), 1);
        this.f9877d.setText(String.format("超级喜欢x%s", ((AbsMeetListData) this.f9878e).item.relation.relationshipExt.recvSuperLikedNum));
    }

    @Override // p009l.kwl
    /* JADX INFO: renamed from: c */
    public View mo11818c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM11819e = m11819e(layoutInflater, viewGroup);
        m11815f();
        return viewM11819e;
    }

    /* JADX INFO: renamed from: e */
    public View m11819e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d1y.b(this, layoutInflater, viewGroup);
    }

    @Override // p009l.kwl
    public void release() {
    }
}
