package p149l;

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
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.log.Log4Android;

/* JADX INFO: loaded from: classes11.dex */
public class ag20 extends eb2 {

    /* JADX INFO: renamed from: e */
    public final MediaPreviewAct f69241e;

    /* JADX INFO: renamed from: f */
    public c680 f69242f;

    /* JADX INFO: renamed from: g */
    public c680 f69243g;

    /* JADX INFO: renamed from: h */
    public boolean f69244h = false;

    /* JADX INFO: renamed from: i */
    public int f69245i;

    /* JADX INFO: renamed from: j */
    public int f69246j;

    /* JADX INFO: renamed from: l.ag20$b */
    public class C15603b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f69248a;

        public C15603b(View view) {
            this.f69248a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f69248a.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.ag20$c */
    public class C15604c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f69250a;

        public C15604c(View view) {
            this.f69250a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f69250a.setVisibility(8);
        }
    }

    public ag20(MediaPreviewAct mediaPreviewAct) {
        this.f69241e = mediaPreviewAct;
    }

    /* JADX INFO: renamed from: s */
    private void m96281s(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(view, "translationY", 0.0f, -view.getHeight()) : ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getHeight());
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new C15604c(view));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: z */
    private void m96282z(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(view, "translationY", -view.getHeight(), 0.0f) : ObjectAnimator.ofFloat(view, "translationY", view.getHeight(), 0.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new C15603b(view));
        objectAnimatorOfFloat.start();
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f69241e.f54079x.size();
    }

    @Override // p149l.w660
    public int getItemPosition(Object obj) {
        return -2;
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

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        View viewM96284t;
        Media media = this.f69241e.f54079x.get(i);
        if (media instanceof Video) {
            viewM96284t = m96283r((Video) media);
        } else {
            viewM96284t = media instanceof Picture ? m96284t(viewGroup, media) : null;
        }
        viewM96284t.setTag(media);
        viewGroup.addView(viewM96284t);
        return media;
    }

    /* JADX INFO: renamed from: r */
    public final PlayerView m96283r(Video video) {
        if (video.size == null) {
            m96287w(video);
        }
        PlayerView playerView = new PlayerView(this.f69241e.act);
        playerView.setProgressBarsEnabled(false);
        m96285u(video.url).mo105366a(Moments.TYPE);
        playerView.setPlayer(m96285u(video.url));
        playerView.setVideo(video);
        playerView.m79135t(xdl0.m208412y0(), (xdl0.m208408w0() - xdl0.m208331F0()) - t100.m186890d(210.0f));
        if (NullChecker.m81304b(video) && !TextUtils.isEmpty(video.formatAspectRatio())) {
            qib0.m174792S0(video.formatAspectRatio());
        }
        playerView.m79133r(new C15602a());
        m96286v(video, playerView);
        return playerView;
    }

    /* JADX INFO: renamed from: t */
    public final PhotoPreviewView m96284t(ViewGroup viewGroup, Media media) {
        String strM179382z = rhi.m179382z(media.url);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strM179382z, options);
        int[] iArr = {options.outWidth, options.outHeight};
        PhotoPreviewView photoPreviewView = new PhotoPreviewView(this.f69241e.act);
        Picture picture = (Picture) media;
        picture.size = new Dimension(iArr);
        photoPreviewView.m79103O(picture, true);
        photoPreviewView.setOnTapListener(new PhotoPreviewView.InterfaceC13073d() { // from class: l.zf20
            @Override // com.p046p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView.InterfaceC13073d
            /* JADX INFO: renamed from: a */
            public final void mo79106a() {
                this.f202877a.m96289y();
            }
        });
        return photoPreviewView;
    }

    /* JADX INFO: renamed from: u */
    public c680 m96285u(String str) {
        if (!NullChecker.m81303a(str) || str.startsWith("http")) {
            if (this.f69243g == null) {
                this.f69243g = new s680();
            }
            return this.f69243g;
        }
        if (this.f69242f == null) {
            this.f69242f = new l680();
        }
        return this.f69242f;
    }

    /* JADX INFO: renamed from: v */
    public final void m96286v(Video video, PlayerView playerView) {
        Dimension dimension = video.size;
        if (dimension == null) {
            return;
        }
        int i = dimension.width;
        int i2 = dimension.height;
        int iM208412y0 = xdl0.m208412y0();
        int iM208408w0 = xdl0.m208408w0() - t100.m186890d(110.0f);
        float f = i;
        float f2 = i2;
        float f3 = iM208412y0;
        float f4 = iM208408w0;
        if (f / f2 >= f3 / f4) {
            this.f69245i = iM208412y0;
            this.f69246j = (int) (f2 * (f3 / f));
        } else {
            this.f69246j = iM208408w0;
            this.f69245i = (int) (f * (f4 / f2));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f69245i, this.f69246j);
        playerView.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams);
        layoutParams2.addRule(13);
        playerView.f54108a.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: w */
    public final void m96287w(Video video) {
        VideoDataRetrieverBySoft videoDataRetrieverBySoft;
        Throwable th;
        try {
            videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
            try {
                if (videoDataRetrieverBySoft.init(rhi.m179382z(video.url))) {
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
                    CrashHelper.m81296c(th);
                    Log4Android.getInstance().m81400e(th);
                    if (video.size == null) {
                        m96288x(video);
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
    public final void m96288x(Video video) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(rhi.m179382z(video.url));
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
                    CrashHelper.m81296c(th);
                    Log4Android.getInstance().m81400e(th);
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
    public final /* synthetic */ void m96289y() {
        boolean z = this.f69244h;
        MediaPreviewAct mediaPreviewAct = this.f69241e;
        if (z) {
            m96282z(mediaPreviewAct.f54062g, false);
            m96282z(this.f69241e.f54059d, true);
            this.f69244h = false;
        } else {
            m96281s(mediaPreviewAct.f54062g, false);
            m96281s(this.f69241e.f54059d, true);
            this.f69244h = true;
        }
    }

    /* JADX INFO: renamed from: l.ag20$a */
    public class C15602a extends c680.C16085c {
        public C15602a() {
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
            super.mo44050a(exc);
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            super.mo44053d();
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onComplete() {
            super.onComplete();
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onPause() {
            super.onPause();
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onResume() {
            super.onResume();
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onStart() {
        }
    }
}
