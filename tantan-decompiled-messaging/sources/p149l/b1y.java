package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedItemData;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.pager.MeetFeedPageImageItemView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VPager;

/* JADX INFO: loaded from: classes11.dex */
public class b1y implements kwl {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f72639a;

    /* JADX INFO: renamed from: b */
    public VPager f72640b;

    /* JADX INFO: renamed from: c */
    public NewPictureContainerIndicator f72641c;

    /* JADX INFO: renamed from: d */
    public TextView f72642d;

    /* JADX INFO: renamed from: e */
    public MeetFeedItemData f72643e;

    /* JADX INFO: renamed from: f */
    public C15777b f72644f;

    /* JADX INFO: renamed from: l.b1y$a */
    public class C15776a extends ViewPager.C0719m {
        public C15776a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            b1y.this.f72641c.m36955b(i);
            if (b1y.this.f72643e != null) {
                b1y.this.f72643e.picIndex = i;
            }
        }
    }

    /* JADX INFO: renamed from: l.b1y$b */
    public class C15777b extends eb2 {

        /* JADX INFO: renamed from: e */
        public final ArrayList<Media> f72646e = new ArrayList<>();

        public C15777b() {
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f72646e.size();
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
            MeetFeedPageImageItemView meetFeedPageImageItemView = (MeetFeedPageImageItemView) o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121430s0, viewGroup, false);
            meetFeedPageImageItemView.m42940d(this.f72646e.get(i), new e30() { // from class: l.c1y
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f78313a.m99895r((Boolean) obj);
                }
            });
            viewGroup.addView(meetFeedPageImageItemView);
            return meetFeedPageImageItemView;
        }

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ void m99895r(Boolean bool) {
            int i;
            int currentItem = b1y.this.f72640b.getCurrentItem();
            if (bool.booleanValue()) {
                if (currentItem == 0) {
                    b1y.this.m99890g(-1.5f);
                    return;
                }
                i = currentItem - 1;
            } else {
                if (currentItem == this.f72646e.size() - 1) {
                    b1y.this.m99890g(1.5f);
                    return;
                }
                i = currentItem + 1;
            }
            b1y.this.f72640b.setCurrentItem(i);
        }

        /* JADX INFO: renamed from: s */
        public void m99896s(List<Media> list) {
            this.f72646e.clear();
            this.f72646e.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m99889f() {
        C15777b c15777b = new C15777b();
        this.f72644f = c15777b;
        this.f72640b.setAdapter(c15777b);
        this.f72640b.m4185d(new C15776a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m99890g(float f) {
        this.f72639a.setPivotX(this.f72640b.getWidth() / 2.0f);
        this.f72639a.setPivotY(this.f72640b.getHeight() / 2.0f);
        bt0.m103741n(this.f72640b, View.ROTATION_Y, 0.0f, f, 0.0f).setDuration(200L).start();
    }

    @Override // p149l.kwl
    /* JADX INFO: renamed from: a */
    public void mo99891a(IMeetListData iMeetListData, Act act) {
        MeetFeedItemData meetFeedItemData = (MeetFeedItemData) iMeetListData;
        this.f72643e = meetFeedItemData;
        List<Media> list = meetFeedItemData.moment.media;
        if (NullChecker.m81303a(list) && !list.isEmpty()) {
            this.f72641c.setIndicatorCount(list.size());
            xdl0.m208344M(this.f72641c, list.size() > 1);
            ((C15777b) this.f72640b.getAdapter()).m99896s(list);
        }
        this.f72640b.setCurrentItem(this.f72643e.picIndex);
        if (!TEnum.equals(this.f72643e.item.relation.otherStatus, RelationshipStatus.get("superliked")) || !CoreModule.m29935P().m94651a().mo33587sf() || rxg0.m181574r(this.f72643e.item.relation.relationshipExt.recvSuperLikedNum) <= 1) {
            xdl0.m208344M(this.f72642d, false);
            return;
        }
        xdl0.m208344M(this.f72642d, true);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f72642d.getLayoutParams();
        if (xdl0.m208349O0(this.f72641c)) {
            layoutParams.topMargin = t100.f167259h;
        } else {
            layoutParams.topMargin = t100.f167261j;
        }
        this.f72642d.setLayoutParams(layoutParams);
        xdl0.m208383k(this.f72642d, act.drawable(b3c0.f73077j2));
        this.f72642d.setBackground(act.drawable(b3c0.f73101m2));
        this.f72642d.setTypeface(eqh0.m117752c(2), 1);
        this.f72642d.setText(String.format("超级喜欢x%s", this.f72643e.item.relation.relationshipExt.recvSuperLikedNum));
    }

    @Override // p149l.kwl
    /* JADX INFO: renamed from: c */
    public View mo99892c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM99893e = m99893e(layoutInflater, viewGroup);
        m99889f();
        return viewM99893e;
    }

    /* JADX INFO: renamed from: e */
    public View m99893e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d1y.m109699b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.kwl
    public void release() {
    }
}
