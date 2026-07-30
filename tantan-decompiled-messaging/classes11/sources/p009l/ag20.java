package p009l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.immomo.moment.mediautils.VideoDataRetrieverBySoft;
import com.p000p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p000p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView;
import com.p000p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.log.Log4Android;
import l.eb2;
import l.qib0;
import l.rhi;
import l.t100;
import l.xdl0;
import v.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ag20 extends eb2 {

    /* JADX INFO: renamed from: e */
    public final MediaPreviewAct f9470e;

    /* JADX INFO: renamed from: f */
    public c680 f9471f;

    /* JADX INFO: renamed from: g */
    public c680 f9472g;

    /* JADX INFO: renamed from: h */
    public boolean f9473h = false;

    /* JADX INFO: renamed from: i */
    public int f9474i;

    /* JADX INFO: renamed from: j */
    public int f9475j;

    /* JADX INFO: renamed from: l.ag20$b */
    public class C0757b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f9477a;

        public C0757b(View view) {
            this.f9477a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f9477a.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.ag20$c */
    public class C0758c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f9479a;

        public C0758c(View view) {
            this.f9479a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9479a.setVisibility(8);
        }
    }

    public ag20(MediaPreviewAct mediaPreviewAct) {
        this.f9470e = mediaPreviewAct;
    }

    /* JADX INFO: renamed from: s */
    private void m11393s(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(view, "translationY", 0.0f, -view.getHeight()) : ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getHeight());
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new C0758c(view));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: z */
    private void m11394z(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(view, "translationY", -view.getHeight(), 0.0f) : ObjectAnimator.ofFloat(view, "translationY", view.getHeight(), 0.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new C0757b(view));
        objectAnimatorOfFloat.start();
    }

    public int getCount() {
        return this.f9470e.f7685x.size();
    }

    public int getItemPosition(Object obj) {
        return -2;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view.getTag().equals(obj);
    }

    /* JADX INFO: renamed from: o */
    public void m11395o(ViewGroup viewGroup, int i, Object obj) {
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (NullChecker.a(viewFindViewWithTag)) {
            if (viewFindViewWithTag instanceof PlayerView) {
                ((PlayerView) viewFindViewWithTag).setPlayer(null);
            }
            viewFindViewWithTag.setTag(null);
            viewGroup.removeView(viewFindViewWithTag);
        }
    }

    /* JADX INFO: renamed from: p */
    public Object m11396p(ViewGroup viewGroup, int i) {
        a.b bVarM11398t;
        Media media = this.f9470e.f7685x.get(i);
        if (media instanceof Video) {
            bVarM11398t = m11397r((Video) media);
        } else {
            bVarM11398t = media instanceof Picture ? m11398t(viewGroup, media) : null;
        }
        bVarM11398t.setTag(media);
        viewGroup.addView(bVarM11398t);
        return media;
    }

    /* JADX INFO: renamed from: r */
    public final PlayerView m11397r(Video video) {
        if (video.size == null) {
            m11401w(video);
        }
        PlayerView playerView = new PlayerView(((Act) this.f9470e).act);
        playerView.setProgressBarsEnabled(false);
        m11399u(((Media) video).url).mo12358a("moments");
        playerView.setPlayer(m11399u(((Media) video).url));
        playerView.setVideo(video);
        playerView.m9447t(xdl0.y0(), (xdl0.w0() - xdl0.F0()) - t100.d(210.0f));
        if (NullChecker.b(video) && !TextUtils.isEmpty(video.formatAspectRatio())) {
            qib0.S0(video.formatAspectRatio());
        }
        playerView.m9445r(new C0756a());
        m11400v(video, playerView);
        return playerView;
    }

    /* JADX INFO: renamed from: t */
    public final PhotoPreviewView m11398t(ViewGroup viewGroup, Media media) {
        String strZ = rhi.z(media.url);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strZ, options);
        int[] iArr = {options.outWidth, options.outHeight};
        PhotoPreviewView photoPreviewView = new PhotoPreviewView(((Act) this.f9470e).act);
        Picture picture = (Picture) media;
        picture.size = new Dimension(iArr);
        photoPreviewView.m9411O(picture, true);
        photoPreviewView.setOnTapListener(new PhotoPreviewView.InterfaceC0475d() { // from class: l.zf20
            @Override // com.p000p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView.InterfaceC0475d
            /* JADX INFO: renamed from: a */
            public final void mo9418a() {
                this.f23629a.m11403y();
            }
        });
        return photoPreviewView;
    }

    /* JADX INFO: renamed from: u */
    public c680 m11399u(String str) {
        if (!NullChecker.a(str) || str.startsWith("http")) {
            if (this.f9472g == null) {
                this.f9472g = new s680();
            }
            return this.f9472g;
        }
        if (this.f9471f == null) {
            this.f9471f = new l680();
        }
        return this.f9471f;
    }

    /* JADX INFO: renamed from: v */
    public final void m11400v(Video video, PlayerView playerView) {
        Dimension dimension = video.size;
        if (dimension == null) {
            return;
        }
        int i = dimension.width;
        int i2 = dimension.height;
        int iY0 = xdl0.y0();
        int iW0 = xdl0.w0() - t100.d(110.0f);
        float f = i;
        float f2 = i2;
        float f3 = iY0;
        float f4 = iW0;
        if (f / f2 >= f3 / f4) {
            this.f9474i = iY0;
            this.f9475j = (int) (f2 * (f3 / f));
        } else {
            this.f9475j = iW0;
            this.f9474i = (int) (f * (f4 / f2));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f9474i, this.f9475j);
        playerView.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams);
        layoutParams2.addRule(13);
        playerView.f7714a.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: w */
    public final void m11401w(Video video) {
        VideoDataRetrieverBySoft videoDataRetrieverBySoft;
        Throwable th;
        try {
            videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
            try {
                if (videoDataRetrieverBySoft.init(rhi.z(((Media) video).url))) {
                    video.size = new Dimension(new int[]{videoDataRetrieverBySoft.getWidth(), videoDataRetrieverBySoft.getHeight()});
                    if (videoDataRetrieverBySoft.getRotation() == 90 || videoDataRetrieverBySoft.getRotation() == 270) {
                        Dimension dimension = video.size;
                        int i = dimension.width;
                        dimension.width = dimension.height;
                        dimension.height = i;
                    }
                }
                videoDataRetrieverBySoft.release();
            } catch (Throwable th2) {
                th = th2;
                try {
                    CrashHelper.c(th);
                    Log4Android.getInstance().e(th);
                    if (video.size == null) {
                        m11402x(video);
                    }
                } finally {
                    if (videoDataRetrieverBySoft != null) {
                        videoDataRetrieverBySoft.release();
                    }
                }
            }
        } catch (Throwable th3) {
            videoDataRetrieverBySoft = null;
            th = th3;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m11402x(Video video) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(rhi.z(((Media) video).url));
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                if (strExtractMetadata != null && strExtractMetadata2 != null) {
                    int i = Integer.parseInt(strExtractMetadata);
                    int i2 = Integer.parseInt(strExtractMetadata2);
                    int i3 = strExtractMetadata3 != null ? Integer.parseInt(strExtractMetadata3) : 0;
                    Dimension dimension = new Dimension(new int[]{i, i2});
                    video.size = dimension;
                    if (i3 == 90 || i3 == 270) {
                        int i4 = dimension.width;
                        dimension.width = dimension.height;
                        dimension.height = i4;
                    }
                }
                mediaMetadataRetriever.release();
            } catch (Throwable th) {
                try {
                    CrashHelper.c(th);
                    Log4Android.getInstance().e(th);
                    mediaMetadataRetriever.release();
                } catch (Throwable th2) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused) {
                    }
                    throw th2;
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m11403y() {
        boolean z = this.f9473h;
        MediaPreviewAct mediaPreviewAct = this.f9470e;
        if (z) {
            m11394z(mediaPreviewAct.f7668g, false);
            m11394z(this.f9470e.f7665d, true);
            this.f9473h = false;
        } else {
            m11393s(mediaPreviewAct.f7668g, false);
            m11393s(this.f9470e.f7665d, true);
            this.f9473h = true;
        }
    }

    /* JADX INFO: renamed from: l.ag20$a */
    public class C0756a extends c680.C0801c {
        public C0756a() {
        }

        @Override // p009l.c680.C0801c, p009l.c680.InterfaceC0800b
        /* JADX INFO: renamed from: a */
        public void mo9454a(Exception exc) {
            super.mo9454a(exc);
        }

        @Override // p009l.c680.C0801c, p009l.c680.InterfaceC0800b
        /* JADX INFO: renamed from: d */
        public void mo9457d() {
            super.mo9457d();
        }

        @Override // p009l.c680.C0801c, p009l.c680.InterfaceC0800b
        public void onComplete() {
            super.onComplete();
        }

        @Override // p009l.c680.C0801c, p009l.c680.InterfaceC0800b
        public void onPause() {
            super.onPause();
        }

        @Override // p009l.c680.C0801c, p009l.c680.InterfaceC0800b
        public void onResume() {
            super.onResume();
        }

        @Override // p009l.c680.C0801c, p009l.c680.InterfaceC0800b
        public void onStart() {
        }
    }
}
