package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.p060ui.FeedPhotoPreviewView;
import com.p046p1.mobile.putong.feed.p060ui.PlayerView;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedPreviewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class mo00 extends eb2 implements ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: e */
    public c680 f134813e;

    /* JADX INFO: renamed from: f */
    public c680 f134814f;

    /* JADX INFO: renamed from: g */
    public k2h f134815g;

    /* JADX INFO: renamed from: h */
    public c680.C16085c f134816h;

    /* JADX INFO: renamed from: i */
    public MomentsFeedPreviewAct f134817i;

    /* JADX INFO: renamed from: j */
    public ArrayList<Media> f134818j;

    /* JADX INFO: renamed from: l.mo00$a */
    public class C18515a extends c680.C16085c {
        public C18515a() {
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
            super.mo44050a(exc);
            if (NullChecker.m81303a(mo00.this.f134816h)) {
                mo00.this.f134816h.mo44050a(exc);
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            super.mo44053d();
            if (NullChecker.m81303a(mo00.this.f134816h)) {
                mo00.this.f134816h.mo44053d();
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onComplete() {
            super.onComplete();
            if (NullChecker.m81303a(mo00.this.f134816h)) {
                mo00.this.f134816h.onComplete();
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onPause() {
            super.onPause();
            if (NullChecker.m81303a(mo00.this.f134816h)) {
                mo00.this.f134816h.onPause();
            }
            mo00.this.m155585z(false);
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onResume() {
            super.onResume();
            if (NullChecker.m81303a(mo00.this.f134816h)) {
                mo00.this.f134816h.onResume();
            }
            mo00.this.m155585z(false);
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onStart() {
            if (NullChecker.m81303a(mo00.this.f134816h)) {
                mo00.this.f134816h.onStart();
            }
            eb1.m115447b(null, 1);
        }
    }

    public mo00(MomentsFeedPreviewAct momentsFeedPreviewAct, ArrayList<Media> arrayList) {
        this.f134817i = momentsFeedPreviewAct;
        this.f134818j = arrayList;
    }

    /* JADX INFO: renamed from: C */
    public void m155577C() {
        if (NullChecker.m81303a(this.f134814f)) {
            this.f134814f.release();
        }
        if (NullChecker.m81303a(this.f134813e)) {
            this.f134813e.release();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m155578D(k2h k2hVar) {
        this.f134815g = k2hVar;
    }

    /* JADX INFO: renamed from: E */
    public void m155579E() {
        if (NullChecker.m81303a(this.f134814f)) {
            this.f134814f.stop();
        }
        if (NullChecker.m81303a(this.f134813e)) {
            this.f134813e.stop();
        }
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f134818j.size();
    }

    @Override // p149l.w660
    public int getItemPosition(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // p149l.w660
    public boolean isViewFromObject(View view, Object obj) {
        return view.getTag().equals(obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (NullChecker.m81303a(viewFindViewWithTag)) {
            if (viewFindViewWithTag instanceof PlayerView) {
                ((PlayerView) viewFindViewWithTag).setPlayer(null);
            }
            viewFindViewWithTag.setTag(null);
            viewGroup.removeView(viewFindViewWithTag);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        MomentsFeedPreviewAct momentsFeedPreviewAct = this.f134817i;
        View viewFindViewWithTag = momentsFeedPreviewAct.f43893d.f171305b.findViewWithTag(Integer.valueOf(momentsFeedPreviewAct.f43892c.f160343b));
        if (viewFindViewWithTag instanceof FeedPhotoPreviewView) {
            ((FeedPhotoPreviewView) viewFindViewWithTag).reset();
        }
        if (this.f134817i.f43892c.f160343b != i) {
            if (NullChecker.m81303a(this.f134814f)) {
                this.f134814f.stop();
            }
            if (NullChecker.m81303a(this.f134813e)) {
                this.f134813e.stop();
            }
        }
        this.f134817i.f43892c.f160343b = i;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        View viewM155580u = m155580u(this.f134818j.get(i), i);
        viewM155580u.setTag(Integer.valueOf(i));
        viewGroup.addView(viewM155580u);
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: u */
    public View m155580u(final Media media, int i) {
        if (media instanceof Picture) {
            final FeedPhotoPreviewView feedPhotoPreviewView = new FeedPhotoPreviewView(this.f134817i);
            feedPhotoPreviewView.m66508M((Picture) media, true);
            feedPhotoPreviewView.setOnLongPressListener(new FeedPhotoPreviewView.InterfaceC11396b() { // from class: l.jo00
                @Override // com.p046p1.mobile.putong.feed.p060ui.FeedPhotoPreviewView.InterfaceC11396b
                /* JADX INFO: renamed from: a */
                public final boolean mo66509a() {
                    return this.f118909a.m155582w(media);
                }
            });
            feedPhotoPreviewView.setOnTapListener(new FeedPhotoPreviewView.InterfaceC11397c() { // from class: l.ko00
                @Override // com.p046p1.mobile.putong.feed.p060ui.FeedPhotoPreviewView.InterfaceC11397c
                /* JADX INFO: renamed from: a */
                public final void mo66510a() {
                    this.f123946a.m155584y(feedPhotoPreviewView);
                }
            });
            if (this.f134817i.f43892c.f160344c) {
                feedPhotoPreviewView.f43556a.setOnDragDismissListenler(this.f134815g);
            }
            return feedPhotoPreviewView;
        }
        if (!(media instanceof Video)) {
            return null;
        }
        Video video = (Video) media;
        PlayerView playerView = new PlayerView(this.f134817i);
        m155576A(playerView);
        playerView.setProgressBarsEnabled(false);
        m155581v(video.url).mo105366a(Moments.TYPE);
        playerView.setPlayer(m155581v(video.url));
        playerView.setVideo(video);
        playerView.m66581z(xdl0.m208412y0(), xdl0.m208408w0() - xdl0.m208331F0());
        if (NullChecker.m81304b(video) && !TextUtils.isEmpty(video.formatAspectRatio())) {
            qib0.m174792S0(video.formatAspectRatio());
        }
        playerView.m66579x(new C18515a());
        return playerView;
    }

    /* JADX INFO: renamed from: v */
    public c680 m155581v(String str) {
        if (!NullChecker.m81303a(str) || str.startsWith("http")) {
            if (this.f134814f == null) {
                this.f134814f = new s680();
            }
            return this.f134814f;
        }
        if (this.f134813e == null) {
            this.f134813e = new l680();
        }
        return this.f134813e;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean m155582w(Media media) {
        if (this.f134817i.lifecycle_() != C4319c.f15548i) {
            return true;
        }
        v1h.m196576N0(this.f134817i, media, null);
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m155583x() {
        m155585z(true);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m155584y(FeedPhotoPreviewView feedPhotoPreviewView) {
        feedPhotoPreviewView.postDelayed(new Runnable() { // from class: l.lo00
            @Override // java.lang.Runnable
            public final void run() {
                this.f129056a.m155583x();
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: z */
    public void m155585z(boolean z) {
        if (z) {
            this.f134817i.m66873d2();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m155576A(PlayerView playerView) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
