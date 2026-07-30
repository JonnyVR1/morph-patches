package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.p065ui.FeedPhotoPreviewView;
import com.p051p1.mobile.putong.feed.p065ui.PlayerView;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class vw00 extends lb2 implements ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: e */
    public ie80 f186052e;

    /* JADX INFO: renamed from: f */
    public ie80 f186053f;

    /* JADX INFO: renamed from: g */
    public z3h f186054g;

    /* JADX INFO: renamed from: h */
    public ie80.C17711c f186055h;

    /* JADX INFO: renamed from: i */
    public MomentsFeedPreviewAct f186056i;

    /* JADX INFO: renamed from: j */
    public ArrayList<Media> f186057j;

    /* JADX INFO: renamed from: l.vw00$a */
    public class C20945a extends ie80.C17711c {
        public C20945a() {
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
            super.mo45233a(exc);
            if (NullChecker.m82486a(vw00.this.f186055h)) {
                vw00.this.f186055h.mo45233a(exc);
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            super.mo45236d();
            if (NullChecker.m82486a(vw00.this.f186055h)) {
                vw00.this.f186055h.mo45236d();
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onComplete() {
            super.onComplete();
            if (NullChecker.m82486a(vw00.this.f186055h)) {
                vw00.this.f186055h.onComplete();
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onPause() {
            super.onPause();
            if (NullChecker.m82486a(vw00.this.f186055h)) {
                vw00.this.f186055h.onPause();
            }
            vw00.this.m203054z(false);
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onResume() {
            super.onResume();
            if (NullChecker.m82486a(vw00.this.f186055h)) {
                vw00.this.f186055h.onResume();
            }
            vw00.this.m203054z(false);
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onStart() {
            if (NullChecker.m82486a(vw00.this.f186055h)) {
                vw00.this.f186055h.onStart();
            }
            lb1.m153552b(null, 1);
        }
    }

    public vw00(MomentsFeedPreviewAct momentsFeedPreviewAct, ArrayList<Media> arrayList) {
        this.f186056i = momentsFeedPreviewAct;
        this.f186057j = arrayList;
    }

    /* JADX INFO: renamed from: C */
    public void m203046C() {
        if (NullChecker.m82486a(this.f186053f)) {
            this.f186053f.release();
        }
        if (NullChecker.m82486a(this.f186052e)) {
            this.f186052e.release();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m203047D(z3h z3hVar) {
        this.f186054g = z3hVar;
    }

    /* JADX INFO: renamed from: E */
    public void m203048E() {
        if (NullChecker.m82486a(this.f186053f)) {
            this.f186053f.stop();
        }
        if (NullChecker.m82486a(this.f186052e)) {
            this.f186052e.stop();
        }
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f186057j.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(View view, Object obj) {
        return view.getTag().equals(obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (NullChecker.m82486a(viewFindViewWithTag)) {
            if (viewFindViewWithTag instanceof PlayerView) {
                ((PlayerView) viewFindViewWithTag).setPlayer(null);
            }
            viewFindViewWithTag.setTag(null);
            viewGroup.removeView(viewFindViewWithTag);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        MomentsFeedPreviewAct momentsFeedPreviewAct = this.f186056i;
        View viewFindViewWithTag = momentsFeedPreviewAct.f44741d.f84159b.findViewWithTag(Integer.valueOf(momentsFeedPreviewAct.f44740c.f73809b));
        if (viewFindViewWithTag instanceof FeedPhotoPreviewView) {
            ((FeedPhotoPreviewView) viewFindViewWithTag).reset();
        }
        if (this.f186056i.f44740c.f73809b != i) {
            if (NullChecker.m82486a(this.f186053f)) {
                this.f186053f.stop();
            }
            if (NullChecker.m82486a(this.f186052e)) {
                this.f186052e.stop();
            }
        }
        this.f186056i.f44740c.f73809b = i;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        View viewM203049u = m203049u(this.f186057j.get(i), i);
        viewM203049u.setTag(Integer.valueOf(i));
        viewGroup.addView(viewM203049u);
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: u */
    public View m203049u(final Media media, int i) {
        if (media instanceof Picture) {
            final FeedPhotoPreviewView feedPhotoPreviewView = new FeedPhotoPreviewView(this.f186056i);
            feedPhotoPreviewView.m67691M((Picture) media, true);
            feedPhotoPreviewView.setOnLongPressListener(new FeedPhotoPreviewView.InterfaceC11559b() { // from class: l.sw00
                @Override // com.p051p1.mobile.putong.feed.p065ui.FeedPhotoPreviewView.InterfaceC11559b
                /* JADX INFO: renamed from: a */
                public final boolean mo67692a() {
                    return this.f170910a.m203051w(media);
                }
            });
            feedPhotoPreviewView.setOnTapListener(new FeedPhotoPreviewView.InterfaceC11560c() { // from class: l.tw00
                @Override // com.p051p1.mobile.putong.feed.p065ui.FeedPhotoPreviewView.InterfaceC11560c
                /* JADX INFO: renamed from: a */
                public final void mo67693a() {
                    this.f176366a.m203053y(feedPhotoPreviewView);
                }
            });
            if (this.f186056i.f44740c.f73810c) {
                feedPhotoPreviewView.f44404a.setOnDragDismissListenler(this.f186054g);
            }
            return feedPhotoPreviewView;
        }
        if (!(media instanceof Video)) {
            return null;
        }
        Video video = (Video) media;
        PlayerView playerView = new PlayerView(this.f186056i);
        m203045A(playerView);
        playerView.setProgressBarsEnabled(false);
        m203050v(video.url).mo139591a(Moments.TYPE);
        playerView.setPlayer(m203050v(video.url));
        playerView.setVideo(video);
        playerView.m67764z(bnl0.m105592y0(), bnl0.m105588w0() - bnl0.m105511F0());
        if (NullChecker.m82487b(video) && !TextUtils.isEmpty(video.formatAspectRatio())) {
            uqb0.m197246S0(video.formatAspectRatio());
        }
        playerView.m67762x(new C20945a());
        return playerView;
    }

    /* JADX INFO: renamed from: v */
    public ie80 m203050v(String str) {
        if (!NullChecker.m82486a(str) || str.startsWith("http")) {
            if (this.f186053f == null) {
                this.f186053f = new ye80();
            }
            return this.f186053f;
        }
        if (this.f186052e == null) {
            this.f186052e = new re80();
        }
        return this.f186052e;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean m203051w(Media media) {
        if (this.f186056i.lifecycle_() != C4470c.f16267i) {
            return true;
        }
        k3h.m148053N0(this.f186056i, media, null);
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m203052x() {
        m203054z(true);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m203053y(FeedPhotoPreviewView feedPhotoPreviewView) {
        feedPhotoPreviewView.postDelayed(new Runnable() { // from class: l.uw00
            @Override // java.lang.Runnable
            public final void run() {
                this.f181223a.m203052x();
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: z */
    public void m203054z(boolean z) {
        if (z) {
            this.f186056i.m68056e2();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m203045A(PlayerView playerView) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
