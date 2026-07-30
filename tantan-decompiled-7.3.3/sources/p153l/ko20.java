package p153l;

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
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.log.Log4Android;

/* JADX INFO: loaded from: classes10.dex */
public class ko20 extends lb2 {

    /* JADX INFO: renamed from: e */
    public final MediaPreviewAct f127667e;

    /* JADX INFO: renamed from: f */
    public ie80 f127668f;

    /* JADX INFO: renamed from: g */
    public ie80 f127669g;

    /* JADX INFO: renamed from: h */
    public boolean f127670h = false;

    /* JADX INFO: renamed from: i */
    public int f127671i;

    /* JADX INFO: renamed from: j */
    public int f127672j;

    /* JADX INFO: renamed from: l.ko20$b */
    public class C18220b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f127674a;

        public C18220b(View view) {
            this.f127674a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f127674a.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.ko20$c */
    public class C18221c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f127676a;

        public C18221c(View view) {
            this.f127676a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f127676a.setVisibility(8);
        }
    }

    public ko20(MediaPreviewAct mediaPreviewAct) {
        this.f127667e = mediaPreviewAct;
    }

    /* JADX INFO: renamed from: s */
    private void m150569s(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(view, "translationY", 0.0f, -view.getHeight()) : ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getHeight());
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new C18221c(view));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: z */
    private void m150570z(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(view, "translationY", -view.getHeight(), 0.0f) : ObjectAnimator.ofFloat(view, "translationY", view.getHeight(), 0.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new C18220b(view));
        objectAnimatorOfFloat.start();
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f127667e.f54927x.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(Object obj) {
        return -2;
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

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        View viewM150572t;
        Media media = this.f127667e.f54927x.get(i);
        if (media instanceof Video) {
            viewM150572t = m150571r((Video) media);
        } else {
            viewM150572t = media instanceof Picture ? m150572t(viewGroup, media) : null;
        }
        viewM150572t.setTag(media);
        viewGroup.addView(viewM150572t);
        return media;
    }

    /* JADX INFO: renamed from: r */
    public final PlayerView m150571r(Video video) {
        if (video.size == null) {
            m150575w(video);
        }
        PlayerView playerView = new PlayerView(this.f127667e.act);
        playerView.setProgressBarsEnabled(false);
        m150573u(video.url).mo139591a(Moments.TYPE);
        playerView.setPlayer(m150573u(video.url));
        playerView.setVideo(video);
        playerView.m80318t(bnl0.m105592y0(), (bnl0.m105588w0() - bnl0.m105511F0()) - qa00.m175859d(210.0f));
        if (NullChecker.m82487b(video) && !TextUtils.isEmpty(video.formatAspectRatio())) {
            uqb0.m197246S0(video.formatAspectRatio());
        }
        playerView.m80316r(new C18219a());
        m150574v(video, playerView);
        return playerView;
    }

    /* JADX INFO: renamed from: t */
    public final PhotoPreviewView m150572t(ViewGroup viewGroup, Media media) {
        String strM168038z = oki.m168038z(media.url);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strM168038z, options);
        int[] iArr = {options.outWidth, options.outHeight};
        PhotoPreviewView photoPreviewView = new PhotoPreviewView(this.f127667e.act);
        Picture picture = (Picture) media;
        picture.size = new Dimension(iArr);
        photoPreviewView.m80286O(picture, true);
        photoPreviewView.setOnTapListener(new PhotoPreviewView.InterfaceC13236d() { // from class: l.jo20
            @Override // com.p051p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView.InterfaceC13236d
            /* JADX INFO: renamed from: a */
            public final void mo80289a() {
                this.f121936a.m150577y();
            }
        });
        return photoPreviewView;
    }

    /* JADX INFO: renamed from: u */
    public ie80 m150573u(String str) {
        if (!NullChecker.m82486a(str) || str.startsWith("http")) {
            if (this.f127669g == null) {
                this.f127669g = new ye80();
            }
            return this.f127669g;
        }
        if (this.f127668f == null) {
            this.f127668f = new re80();
        }
        return this.f127668f;
    }

    /* JADX INFO: renamed from: v */
    public final void m150574v(Video video, PlayerView playerView) {
        Dimension dimension = video.size;
        if (dimension == null) {
            return;
        }
        int i = dimension.width;
        int i2 = dimension.height;
        int iM105592y0 = bnl0.m105592y0();
        int iM105588w0 = bnl0.m105588w0() - qa00.m175859d(110.0f);
        float f = i;
        float f2 = i2;
        float f3 = iM105592y0;
        float f4 = iM105588w0;
        if (f / f2 >= f3 / f4) {
            this.f127671i = iM105592y0;
            this.f127672j = (int) (f2 * (f3 / f));
        } else {
            this.f127672j = iM105588w0;
            this.f127671i = (int) (f * (f4 / f2));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f127671i, this.f127672j);
        playerView.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams);
        layoutParams2.addRule(13);
        playerView.f54956a.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: w */
    public final void m150575w(Video video) {
        VideoDataRetrieverBySoft videoDataRetrieverBySoft;
        Throwable th;
        try {
            videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
            try {
                if (videoDataRetrieverBySoft.init(oki.m168038z(video.url))) {
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
                    CrashHelper.m82479c(th);
                    Log4Android.getInstance().m82583e(th);
                    if (video.size == null) {
                        m150576x(video);
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
    public final void m150576x(Video video) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(oki.m168038z(video.url));
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
                    CrashHelper.m82479c(th);
                    Log4Android.getInstance().m82583e(th);
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
    public final /* synthetic */ void m150577y() {
        boolean z = this.f127670h;
        MediaPreviewAct mediaPreviewAct = this.f127667e;
        if (z) {
            m150570z(mediaPreviewAct.f54910g, false);
            m150570z(this.f127667e.f54907d, true);
            this.f127670h = false;
        } else {
            m150569s(mediaPreviewAct.f54910g, false);
            m150569s(this.f127667e.f54907d, true);
            this.f127670h = true;
        }
    }

    /* JADX INFO: renamed from: l.ko20$a */
    public class C18219a extends ie80.C17711c {
        public C18219a() {
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
            super.mo45233a(exc);
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            super.mo45236d();
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onComplete() {
            super.onComplete();
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onPause() {
            super.onPause();
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onResume() {
            super.onResume();
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onStart() {
        }
    }
}
