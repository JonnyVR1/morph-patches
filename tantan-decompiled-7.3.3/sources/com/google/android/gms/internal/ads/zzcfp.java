package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;
import com.immomo.momomediaext.sei.BaseSei;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p153l.aft0;
import p153l.bft0;
import p153l.bxy0;
import p153l.cft0;
import p153l.d2v0;
import p153l.dct0;
import p153l.jas0;
import p153l.qdt0;
import p153l.rdt0;
import p153l.sdt0;
import p153l.sgs0;
import p153l.tdt0;
import p153l.udt0;
import p153l.vdt0;
import p153l.wdt0;
import p153l.xdt0;
import p153l.zdt0;
import p153l.zet0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzcfp extends zzcfr implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: s */
    public static final Map f10154s;

    /* JADX INFO: renamed from: c */
    public final bft0 f10155c;

    /* JADX INFO: renamed from: d */
    public final cft0 f10156d;

    /* JADX INFO: renamed from: e */
    public final boolean f10157e;

    /* JADX INFO: renamed from: f */
    public int f10158f;

    /* JADX INFO: renamed from: g */
    public int f10159g;

    /* JADX INFO: renamed from: h */
    public MediaPlayer f10160h;

    /* JADX INFO: renamed from: i */
    public Uri f10161i;

    /* JADX INFO: renamed from: j */
    public int f10162j;

    /* JADX INFO: renamed from: k */
    public int f10163k;

    /* JADX INFO: renamed from: l */
    public int f10164l;

    /* JADX INFO: renamed from: m */
    public zet0 f10165m;

    /* JADX INFO: renamed from: n */
    public final boolean f10166n;

    /* JADX INFO: renamed from: o */
    public int f10167o;

    /* JADX INFO: renamed from: p */
    public zdt0 f10168p;

    /* JADX INFO: renamed from: q */
    public boolean f10169q;

    /* JADX INFO: renamed from: r */
    public Integer f10170r;

    static {
        HashMap map = new HashMap();
        f10154s = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcfp(Context context, bft0 bft0Var, boolean z, boolean z2, aft0 aft0Var, cft0 cft0Var) {
        super(context);
        this.f10158f = 0;
        this.f10159g = 0;
        this.f10169q = false;
        this.f10170r = null;
        setSurfaceTextureListener(this);
        this.f10155c = bft0Var;
        this.f10156d = cft0Var;
        this.f10166n = z;
        this.f10157e = z2;
        cft0Var.m109597a(this);
    }

    /* JADX INFO: renamed from: J */
    public static /* bridge */ /* synthetic */ void m13615J(zzcfp zzcfpVar, MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue() || zzcfpVar.f10155c == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    zzcfpVar.f10170r = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    map.put("resolution", format2.getInteger("width") + BaseSei.f14624X + format2.getInteger("height"));
                                }
                                if (format2.containsKey(IMediaFormat.KEY_MIME)) {
                                    map.put("videoMime", format2.getString(IMediaFormat.KEY_MIME));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey(IMediaFormat.KEY_MIME)) {
                                map.put("audioMime", format.getString(IMediaFormat.KEY_MIME));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                zzcfpVar.f10155c.mo13728Z("onMetadataEvent", map);
            }
        } catch (RuntimeException e) {
            bxy0.m106933q().m120275w(e, "AdMediaPlayerView.reportMetadata");
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m13617C() {
        d2v0.m113737k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f10161i == null || surfaceTexture == null) {
            return;
        }
        m13618D(false);
        try {
            bxy0.m106929m();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f10160h = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f10160h.setOnCompletionListener(this);
            this.f10160h.setOnErrorListener(this);
            this.f10160h.setOnInfoListener(this);
            this.f10160h.setOnPreparedListener(this);
            this.f10160h.setOnVideoSizeChangedListener(this);
            this.f10164l = 0;
            if (this.f10166n) {
                zet0 zet0Var = new zet0(getContext());
                this.f10165m = zet0Var;
                zet0Var.m219512c(surfaceTexture, getWidth(), getHeight());
                this.f10165m.start();
                SurfaceTexture surfaceTextureM219510a = this.f10165m.m219510a();
                if (surfaceTextureM219510a != null) {
                    surfaceTexture = surfaceTextureM219510a;
                } else {
                    this.f10165m.m219513d();
                    this.f10165m = null;
                }
            }
            this.f10160h.setDataSource(getContext(), this.f10161i);
            bxy0.m106930n();
            this.f10160h.setSurface(new Surface(surfaceTexture));
            this.f10160h.setAudioStreamType(3);
            this.f10160h.setScreenOnWhilePlaying(true);
            this.f10160h.prepareAsync();
            m13619E(1);
        } catch (IOException e) {
            e = e;
            dct0.m115299h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f10161i)), e);
            onError(this.f10160h, 1, 0);
        } catch (IllegalArgumentException e2) {
            e = e2;
            dct0.m115299h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f10161i)), e);
            onError(this.f10160h, 1, 0);
        } catch (IllegalStateException e3) {
            e = e3;
            dct0.m115299h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f10161i)), e);
            onError(this.f10160h, 1, 0);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m13618D(boolean z) {
        d2v0.m113737k("AdMediaPlayerView release");
        zet0 zet0Var = this.f10165m;
        if (zet0Var != null) {
            zet0Var.m219513d();
            this.f10165m = null;
        }
        MediaPlayer mediaPlayer = this.f10160h;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f10160h.release();
            this.f10160h = null;
            m13619E(0);
            if (z) {
                this.f10159g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m13619E(int i) {
        if (i == 3) {
            this.f10156d.m109599c();
            this.f10172b.m125420b();
        } else if (this.f10158f == 3) {
            this.f10156d.m109601e();
            this.f10172b.m125421c();
        }
        this.f10158f = i;
    }

    /* JADX INFO: renamed from: F */
    public final void m13620F(float f) {
        MediaPlayer mediaPlayer = this.f10160h;
        if (mediaPlayer == null) {
            dct0.m115298g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m13621G() {
        int i;
        return (this.f10160h == null || (i = this.f10158f) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: i */
    public final int mo13622i() {
        if (m13621G()) {
            return this.f10160h.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: j */
    public final int mo13623j() {
        if (Build.VERSION.SDK_INT < 26 || !m13621G()) {
            return -1;
        }
        return this.f10160h.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: k */
    public final int mo13624k() {
        if (m13621G()) {
            return this.f10160h.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: l */
    public final int mo13625l() {
        MediaPlayer mediaPlayer = this.f10160h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: m */
    public final int mo13626m() {
        MediaPlayer mediaPlayer = this.f10160h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: n */
    public final long mo13627n() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: o */
    public final long mo13628o() {
        if (this.f10170r != null) {
            return (mo13629p() * ((long) this.f10164l)) / 100;
        }
        return -1L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f10164l = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        d2v0.m113737k("AdMediaPlayerView completion");
        m13619E(5);
        this.f10159g = 5;
        C2098b.f9751l.post(new rdt0(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = f10154s;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        dct0.m115298g("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        m13619E(-1);
        this.f10159g = -1;
        C2098b.f9751l.post(new sdt0(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = f10154s;
        d2v0.m113737k("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int defaultSize = View.getDefaultSize(this.f10162j, i);
        int defaultSize2 = View.getDefaultSize(this.f10163k, i2);
        if (this.f10162j > 0 && this.f10163k > 0 && this.f10165m == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i6 = (this.f10163k * size) / this.f10162j;
                    if (mode2 == Integer.MIN_VALUE || i6 <= size2) {
                        defaultSize2 = i6;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    i3 = this.f10162j;
                    if (mode2 == 1073741824) {
                        i5 = (i3 * size2) / this.f10163k;
                        if (mode != Integer.MIN_VALUE && i5 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i4 = this.f10163k;
                        if (mode2 == Integer.MIN_VALUE || i4 <= size2) {
                            size2 = i4;
                            i5 = i3;
                        } else {
                            i5 = (size2 * i3) / i4;
                        }
                        if (mode == Integer.MIN_VALUE && i5 > size) {
                            defaultSize2 = (i4 * size) / i3;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i5;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i7 = this.f10162j;
                int i8 = i7 * size2;
                int i9 = this.f10163k;
                int i10 = size * i9;
                if (i8 < i10) {
                    defaultSize = i8 / i9;
                } else {
                    if (i8 > i10) {
                        defaultSize2 = i10 / i7;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i6 = (this.f10163k * size) / this.f10162j;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i6;
                    defaultSize = size;
                } else {
                    i3 = this.f10162j;
                    if (mode2 == 1073741824) {
                        i5 = (i3 * size2) / this.f10163k;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i4 = this.f10163k;
                        if (mode2 == Integer.MIN_VALUE) {
                            size2 = i4;
                            i5 = i3;
                        } else {
                            size2 = i4;
                            i5 = i3;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i4 * size) / i3;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i5;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zet0 zet0Var = this.f10165m;
        if (zet0Var != null) {
            zet0Var.m219511b(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        d2v0.m113737k("AdMediaPlayerView prepared");
        m13619E(2);
        this.f10156d.m109598b();
        C2098b.f9751l.post(new qdt0(this, mediaPlayer));
        this.f10162j = mediaPlayer.getVideoWidth();
        this.f10163k = mediaPlayer.getVideoHeight();
        int i = this.f10167o;
        if (i != 0) {
            mo13633t(i);
        }
        if (this.f10157e && m13621G() && this.f10160h.getCurrentPosition() > 0 && this.f10159g != 3) {
            d2v0.m113737k("AdMediaPlayerView nudging MediaPlayer");
            m13620F(0.0f);
            this.f10160h.start();
            int currentPosition = this.f10160h.getCurrentPosition();
            long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
            while (m13621G() && this.f10160h.getCurrentPosition() == currentPosition && bxy0.m106918b().currentTimeMillis() - jCurrentTimeMillis <= 250) {
            }
            this.f10160h.pause();
            zzn();
        }
        dct0.m115297f("AdMediaPlayerView stream dimensions: " + this.f10162j + " x " + this.f10163k);
        if (this.f10159g == 3) {
            mo13632s();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        d2v0.m113737k("AdMediaPlayerView surface created");
        m13617C();
        C2098b.f9751l.post(new tdt0(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        d2v0.m113737k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f10160h;
        if (mediaPlayer != null && this.f10167o == 0) {
            this.f10167o = mediaPlayer.getCurrentPosition();
        }
        zet0 zet0Var = this.f10165m;
        if (zet0Var != null) {
            zet0Var.m219513d();
        }
        C2098b.f9751l.post(new vdt0(this));
        m13618D(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        d2v0.m113737k("AdMediaPlayerView surface changed");
        int i3 = this.f10159g;
        boolean z = false;
        if (this.f10162j == i && this.f10163k == i2) {
            z = true;
        }
        if (this.f10160h != null && i3 == 3 && z) {
            int i4 = this.f10167o;
            if (i4 != 0) {
                mo13633t(i4);
            }
            mo13632s();
        }
        zet0 zet0Var = this.f10165m;
        if (zet0Var != null) {
            zet0Var.m219511b(i, i2);
        }
        C2098b.f9751l.post(new udt0(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f10156d.m109602f(this);
        this.f10171a.m201076a(surfaceTexture, this.f10168p);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        d2v0.m113737k("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.f10162j = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f10163k = videoHeight;
        if (this.f10162j == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        d2v0.m113737k("AdMediaPlayerView window visibility changed to " + i);
        C2098b.f9751l.post(new Runnable() { // from class: l.pdt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f151830a.zzm(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: p */
    public final long mo13629p() {
        if (this.f10170r != null) {
            return ((long) mo13624k()) * ((long) this.f10170r.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: q */
    public final String mo13630q() {
        return "MediaPlayer".concat(true != this.f10166n ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: r */
    public final void mo13631r() {
        d2v0.m113737k("AdMediaPlayerView pause");
        if (m13621G() && this.f10160h.isPlaying()) {
            this.f10160h.pause();
            m13619E(4);
            C2098b.f9751l.post(new xdt0(this));
        }
        this.f10159g = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: s */
    public final void mo13632s() {
        d2v0.m113737k("AdMediaPlayerView play");
        if (m13621G()) {
            this.f10160h.start();
            m13619E(3);
            this.f10171a.m201077b();
            C2098b.f9751l.post(new wdt0(this));
        }
        this.f10159g = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: t */
    public final void mo13633t(int i) {
        d2v0.m113737k("AdMediaPlayerView seek " + i);
        if (!m13621G()) {
            this.f10167o = i;
        } else {
            this.f10160h.seekTo(i);
            this.f10167o = 0;
        }
    }

    @Override // android.view.View
    public final String toString() {
        return zzcfp.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: u */
    public final void mo13634u(zdt0 zdt0Var) {
        this.f10168p = zdt0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: v */
    public final void mo13635v(@Nullable String str) {
        Uri uri = Uri.parse(str);
        zzbbb zzbbbVarM13600g = zzbbb.m13600g(uri);
        if (zzbbbVarM13600g == null || zzbbbVarM13600g.zza != null) {
            if (zzbbbVarM13600g != null) {
                uri = Uri.parse(zzbbbVarM13600g.zza);
            }
            this.f10161i = uri;
            this.f10167o = 0;
            m13617C();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: w */
    public final void mo13636w() {
        d2v0.m113737k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f10160h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f10160h.release();
            this.f10160h = null;
            m13619E(0);
            this.f10159g = 0;
        }
        this.f10156d.m109600d();
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: x */
    public final void mo13637x(float f, float f2) {
        zet0 zet0Var = this.f10165m;
        if (zet0Var != null) {
            zet0Var.m219514e(f, f2);
        }
    }

    public final /* synthetic */ void zzm(int i) {
        zdt0 zdt0Var = this.f10168p;
        if (zdt0Var != null) {
            zdt0Var.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr, p153l.eft0
    public final void zzn() {
        m13620F(this.f10172b.m125419a());
    }
}
