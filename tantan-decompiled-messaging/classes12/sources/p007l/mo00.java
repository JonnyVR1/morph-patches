package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Moments;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.p005ui.FeedPhotoPreviewView;
import com.p000p1.mobile.putong.feed.p005ui.PlayerView;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedPreviewAct;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.c680;
import l.eb2;
import l.l680;
import l.qib0;
import l.s680;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class mo00 extends eb2 implements ViewPager.j {

    /* JADX INFO: renamed from: e */
    public c680 f10520e;

    /* JADX INFO: renamed from: f */
    public c680 f10521f;

    /* JADX INFO: renamed from: g */
    public k2h f10522g;

    /* JADX INFO: renamed from: h */
    public c680.c f10523h;

    /* JADX INFO: renamed from: i */
    public MomentsFeedPreviewAct f10524i;

    /* JADX INFO: renamed from: j */
    public ArrayList<Media> f10525j;

    /* JADX INFO: renamed from: l.mo00$a */
    public class C2430a extends c680.c {
        public C2430a() {
        }

        /* JADX INFO: renamed from: a */
        public void m11991a(Exception exc) {
            super.a(exc);
            if (NullChecker.a(mo00.this.f10523h)) {
                mo00.this.f10523h.a(exc);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m11992d() {
            super.d();
            if (NullChecker.a(mo00.this.f10523h)) {
                mo00.this.f10523h.d();
            }
        }

        public void onComplete() {
            super.onComplete();
            if (NullChecker.a(mo00.this.f10523h)) {
                mo00.this.f10523h.onComplete();
            }
        }

        public void onPause() {
            super.onPause();
            if (NullChecker.a(mo00.this.f10523h)) {
                mo00.this.f10523h.onPause();
            }
            mo00.this.m11990z(false);
        }

        public void onResume() {
            super.onResume();
            if (NullChecker.a(mo00.this.f10523h)) {
                mo00.this.f10523h.onResume();
            }
            mo00.this.m11990z(false);
        }

        public void onStart() {
            if (NullChecker.a(mo00.this.f10523h)) {
                mo00.this.f10523h.onStart();
            }
            eb1.m9689b(null, 1);
        }
    }

    public mo00(MomentsFeedPreviewAct momentsFeedPreviewAct, ArrayList<Media> arrayList) {
        this.f10524i = momentsFeedPreviewAct;
        this.f10525j = arrayList;
    }

    /* JADX INFO: renamed from: C */
    public void m11980C() {
        if (NullChecker.a(this.f10521f)) {
            this.f10521f.release();
        }
        if (NullChecker.a(this.f10520e)) {
            this.f10520e.release();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m11981D(k2h k2hVar) {
        this.f10522g = k2hVar;
    }

    /* JADX INFO: renamed from: E */
    public void m11982E() {
        if (NullChecker.a(this.f10521f)) {
            this.f10521f.stop();
        }
        if (NullChecker.a(this.f10520e)) {
            this.f10520e.stop();
        }
    }

    public int getCount() {
        return this.f10525j.size();
    }

    public int getItemPosition(Object obj) {
        return ((Integer) obj).intValue();
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view.getTag().equals(obj);
    }

    /* JADX INFO: renamed from: o */
    public void m11983o(ViewGroup viewGroup, int i, Object obj) {
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (NullChecker.a(viewFindViewWithTag)) {
            if (viewFindViewWithTag instanceof PlayerView) {
                ((PlayerView) viewFindViewWithTag).setPlayer(null);
            }
            viewFindViewWithTag.setTag(null);
            viewGroup.removeView(viewFindViewWithTag);
        }
    }

    public void onPageSelected(int i) {
        MomentsFeedPreviewAct momentsFeedPreviewAct = this.f10524i;
        Object objFindViewWithTag = momentsFeedPreviewAct.f5354d.f13359b.findViewWithTag(Integer.valueOf(momentsFeedPreviewAct.f5353c.f12702b));
        if (objFindViewWithTag instanceof FeedPhotoPreviewView) {
            ((FeedPhotoPreviewView) objFindViewWithTag).reset();
        }
        if (this.f10524i.f5353c.f12702b != i) {
            if (NullChecker.a(this.f10521f)) {
                this.f10521f.stop();
            }
            if (NullChecker.a(this.f10520e)) {
                this.f10520e.stop();
            }
        }
        this.f10524i.f5353c.f12702b = i;
    }

    /* JADX INFO: renamed from: p */
    public Object m11984p(ViewGroup viewGroup, int i) {
        View viewM11985u = m11985u(this.f10525j.get(i), i);
        viewM11985u.setTag(Integer.valueOf(i));
        viewGroup.addView(viewM11985u);
        return Integer.valueOf(i);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View, com.p1.mobile.putong.feed.ui.FeedPhotoPreviewView] */
    /* JADX INFO: renamed from: u */
    public View m11985u(final Media media, int i) {
        if (media instanceof Picture) {
            final ?? feedPhotoPreviewView = new FeedPhotoPreviewView(this.f10524i);
            feedPhotoPreviewView.m7679M((Picture) media, true);
            feedPhotoPreviewView.setOnLongPressListener(new FeedPhotoPreviewView.InterfaceC2240b() { // from class: l.jo00
                @Override // com.p000p1.mobile.putong.feed.p005ui.FeedPhotoPreviewView.InterfaceC2240b
                /* JADX INFO: renamed from: a */
                public final boolean mo7684a() {
                    return this.f9457a.m11987w(media);
                }
            });
            feedPhotoPreviewView.setOnTapListener(new FeedPhotoPreviewView.InterfaceC2241c() { // from class: l.ko00
                @Override // com.p000p1.mobile.putong.feed.p005ui.FeedPhotoPreviewView.InterfaceC2241c
                /* JADX INFO: renamed from: a */
                public final void mo7685a() {
                    this.f9751a.m11989y(feedPhotoPreviewView);
                }
            });
            if (this.f10524i.f5353c.f12703c) {
                feedPhotoPreviewView.f5017a.setOnDragDismissListenler(this.f10522g);
            }
            return feedPhotoPreviewView;
        }
        if (!(media instanceof Video)) {
            return null;
        }
        Video video = (Video) media;
        PlayerView playerView = new PlayerView(this.f10524i);
        m11979A(playerView);
        playerView.setProgressBarsEnabled(false);
        m11986v(video.url).a(Moments.TYPE);
        playerView.setPlayer(m11986v(video.url));
        playerView.setVideo(video);
        playerView.m7765z(xdl0.y0(), xdl0.w0() - xdl0.F0());
        if (NullChecker.b(video) && !TextUtils.isEmpty(video.formatAspectRatio())) {
            qib0.S0(video.formatAspectRatio());
        }
        playerView.m7763x(new C2430a());
        return playerView;
    }

    /* JADX INFO: renamed from: v */
    public c680 m11986v(String str) {
        if (!NullChecker.a(str) || str.startsWith("http")) {
            if (this.f10521f == null) {
                this.f10521f = new s680();
            }
            return this.f10521f;
        }
        if (this.f10520e == null) {
            this.f10520e = new l680();
        }
        return this.f10520e;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean m11987w(Media media) {
        if (this.f10524i.lifecycle_() != c.i) {
            return true;
        }
        v1h.m15215N0(this.f10524i, media, null);
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m11988x() {
        m11990z(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m11989y(FeedPhotoPreviewView feedPhotoPreviewView) {
        feedPhotoPreviewView.postDelayed(new Runnable() { // from class: l.lo00
            @Override // java.lang.Runnable
            public final void run() {
                this.f10078a.m11988x();
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: z */
    public void m11990z(boolean z) {
        if (z) {
            this.f10524i.m8067d2();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m11979A(PlayerView playerView) {
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }
}
