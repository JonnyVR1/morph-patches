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
import com.google.android.gms.ads.internal.util.C2075b;
import com.immomo.momomediaext.sei.BaseSei;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p149l.d1s0;
import p149l.k4t0;
import p149l.l4t0;
import p149l.m4t0;
import p149l.m7s0;
import p149l.n4t0;
import p149l.o4t0;
import p149l.p4t0;
import p149l.q4t0;
import p149l.r4t0;
import p149l.t4t0;
import p149l.t5t0;
import p149l.u5t0;
import p149l.v5t0;
import p149l.vny0;
import p149l.w5t0;
import p149l.x2t0;
import p149l.xsu0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzcfp extends zzcfr implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: s */
    public static final Map f10117s;

    /* JADX INFO: renamed from: c */
    public final v5t0 f10118c;

    /* JADX INFO: renamed from: d */
    public final w5t0 f10119d;

    /* JADX INFO: renamed from: e */
    public final boolean f10120e;

    /* JADX INFO: renamed from: f */
    public int f10121f;

    /* JADX INFO: renamed from: g */
    public int f10122g;

    /* JADX INFO: renamed from: h */
    public MediaPlayer f10123h;

    /* JADX INFO: renamed from: i */
    public Uri f10124i;

    /* JADX INFO: renamed from: j */
    public int f10125j;

    /* JADX INFO: renamed from: k */
    public int f10126k;

    /* JADX INFO: renamed from: l */
    public int f10127l;

    /* JADX INFO: renamed from: m */
    public t5t0 f10128m;

    /* JADX INFO: renamed from: n */
    public final boolean f10129n;

    /* JADX INFO: renamed from: o */
    public int f10130o;

    /* JADX INFO: renamed from: p */
    public t4t0 f10131p;

    /* JADX INFO: renamed from: q */
    public boolean f10132q;

    /* JADX INFO: renamed from: r */
    public Integer f10133r;

    static {
        HashMap map = new HashMap();
        f10117s = map;
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

    public zzcfp(Context context, v5t0 v5t0Var, boolean z, boolean z2, u5t0 u5t0Var, w5t0 w5t0Var) {
        super(context);
        this.f10121f = 0;
        this.f10122g = 0;
        this.f10132q = false;
        this.f10133r = null;
        setSurfaceTextureListener(this);
        this.f10118c = v5t0Var;
        this.f10119d = w5t0Var;
        this.f10129n = z;
        this.f10120e = z2;
        w5t0Var.m201687a(this);
    }

    /* JADX INFO: renamed from: J */
    public static /* bridge */ /* synthetic */ void m13561J(zzcfp zzcfpVar, MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue() || zzcfpVar.f10118c == null || mediaPlayer == null) {
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
                                    zzcfpVar.f10133r = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    map.put("resolution", format2.getInteger("width") + BaseSei.f13930X + format2.getInteger("height"));
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
                zzcfpVar.f10118c.mo13674Z("onMetadataEvent", map);
            }
        } catch (RuntimeException e) {
            vny0.m199079q().m212290w(e, "AdMediaPlayerView.reportMetadata");
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m13563C() {
        xsu0.m210834k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f10124i == null || surfaceTexture == null) {
            return;
        }
        m13564D(false);
        try {
            vny0.m199075m();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f10123h = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f10123h.setOnCompletionListener(this);
            this.f10123h.setOnErrorListener(this);
            this.f10123h.setOnInfoListener(this);
            this.f10123h.setOnPreparedListener(this);
            this.f10123h.setOnVideoSizeChangedListener(this);
            this.f10127l = 0;
            if (this.f10129n) {
                t5t0 t5t0Var = new t5t0(getContext());
                this.f10128m = t5t0Var;
                t5t0Var.m187346c(surfaceTexture, getWidth(), getHeight());
                this.f10128m.start();
                SurfaceTexture surfaceTextureM187344a = this.f10128m.m187344a();
                if (surfaceTextureM187344a != null) {
                    surfaceTexture = surfaceTextureM187344a;
                } else {
                    this.f10128m.m187347d();
                    this.f10128m = null;
                }
            }
            this.f10123h.setDataSource(getContext(), this.f10124i);
            vny0.m199076n();
            this.f10123h.setSurface(new Surface(surfaceTexture));
            this.f10123h.setAudioStreamType(3);
            this.f10123h.setScreenOnWhilePlaying(true);
            this.f10123h.prepareAsync();
            m13565E(1);
        } catch (IOException e) {
            e = e;
            x2t0.m206870h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f10124i)), e);
            onError(this.f10123h, 1, 0);
        } catch (IllegalArgumentException e2) {
            e = e2;
            x2t0.m206870h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f10124i)), e);
            onError(this.f10123h, 1, 0);
        } catch (IllegalStateException e3) {
            e = e3;
            x2t0.m206870h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f10124i)), e);
            onError(this.f10123h, 1, 0);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m13564D(boolean z) {
        xsu0.m210834k("AdMediaPlayerView release");
        t5t0 t5t0Var = this.f10128m;
        if (t5t0Var != null) {
            t5t0Var.m187347d();
            this.f10128m = null;
        }
        MediaPlayer mediaPlayer = this.f10123h;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f10123h.release();
            this.f10123h = null;
            m13565E(0);
            if (z) {
                this.f10122g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m13565E(int i) {
        if (i == 3) {
            this.f10119d.m201689c();
            this.f10135b.m217371b();
        } else if (this.f10121f == 3) {
            this.f10119d.m201691e();
            this.f10135b.m217372c();
        }
        this.f10121f = i;
    }

    /* JADX INFO: renamed from: F */
    public final void m13566F(float f) {
        MediaPlayer mediaPlayer = this.f10123h;
        if (mediaPlayer == null) {
            x2t0.m206869g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m13567G() {
        int i;
        return (this.f10123h == null || (i = this.f10121f) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: i */
    public final int mo13568i() {
        if (m13567G()) {
            return this.f10123h.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: j */
    public final int mo13569j() {
        if (Build.VERSION.SDK_INT < 26 || !m13567G()) {
            return -1;
        }
        return this.f10123h.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: k */
    public final int mo13570k() {
        if (m13567G()) {
            return this.f10123h.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: l */
    public final int mo13571l() {
        MediaPlayer mediaPlayer = this.f10123h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: m */
    public final int mo13572m() {
        MediaPlayer mediaPlayer = this.f10123h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: n */
    public final long mo13573n() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: o */
    public final long mo13574o() {
        if (this.f10133r != null) {
            return (mo13575p() * ((long) this.f10127l)) / 100;
        }
        return -1L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f10127l = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        xsu0.m210834k("AdMediaPlayerView completion");
        m13565E(5);
        this.f10122g = 5;
        C2075b.f9714l.post(new l4t0(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = f10117s;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        x2t0.m206869g("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        m13565E(-1);
        this.f10122g = -1;
        C2075b.f9714l.post(new m4t0(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = f10117s;
        xsu0.m210834k("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
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
        int defaultSize = View.getDefaultSize(this.f10125j, i);
        int defaultSize2 = View.getDefaultSize(this.f10126k, i2);
        if (this.f10125j > 0 && this.f10126k > 0 && this.f10128m == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i6 = (this.f10126k * size) / this.f10125j;
                    if (mode2 == Integer.MIN_VALUE || i6 <= size2) {
                        defaultSize2 = i6;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    i3 = this.f10125j;
                    if (mode2 == 1073741824) {
                        i5 = (i3 * size2) / this.f10126k;
                        if (mode != Integer.MIN_VALUE && i5 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i4 = this.f10126k;
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
                int i7 = this.f10125j;
                int i8 = i7 * size2;
                int i9 = this.f10126k;
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
                    i6 = (this.f10126k * size) / this.f10125j;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i6;
                    defaultSize = size;
                } else {
                    i3 = this.f10125j;
                    if (mode2 == 1073741824) {
                        i5 = (i3 * size2) / this.f10126k;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i4 = this.f10126k;
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
        t5t0 t5t0Var = this.f10128m;
        if (t5t0Var != null) {
            t5t0Var.m187345b(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        xsu0.m210834k("AdMediaPlayerView prepared");
        m13565E(2);
        this.f10119d.m201688b();
        C2075b.f9714l.post(new k4t0(this, mediaPlayer));
        this.f10125j = mediaPlayer.getVideoWidth();
        this.f10126k = mediaPlayer.getVideoHeight();
        int i = this.f10130o;
        if (i != 0) {
            mo13579t(i);
        }
        if (this.f10120e && m13567G() && this.f10123h.getCurrentPosition() > 0 && this.f10122g != 3) {
            xsu0.m210834k("AdMediaPlayerView nudging MediaPlayer");
            m13566F(0.0f);
            this.f10123h.start();
            int currentPosition = this.f10123h.getCurrentPosition();
            long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
            while (m13567G() && this.f10123h.getCurrentPosition() == currentPosition && vny0.m199064b().currentTimeMillis() - jCurrentTimeMillis <= 250) {
            }
            this.f10123h.pause();
            zzn();
        }
        x2t0.m206868f("AdMediaPlayerView stream dimensions: " + this.f10125j + " x " + this.f10126k);
        if (this.f10122g == 3) {
            mo13578s();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        xsu0.m210834k("AdMediaPlayerView surface created");
        m13563C();
        C2075b.f9714l.post(new n4t0(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        xsu0.m210834k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f10123h;
        if (mediaPlayer != null && this.f10130o == 0) {
            this.f10130o = mediaPlayer.getCurrentPosition();
        }
        t5t0 t5t0Var = this.f10128m;
        if (t5t0Var != null) {
            t5t0Var.m187347d();
        }
        C2075b.f9714l.post(new p4t0(this));
        m13564D(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        xsu0.m210834k("AdMediaPlayerView surface changed");
        int i3 = this.f10122g;
        boolean z = false;
        if (this.f10125j == i && this.f10126k == i2) {
            z = true;
        }
        if (this.f10123h != null && i3 == 3 && z) {
            int i4 = this.f10130o;
            if (i4 != 0) {
                mo13579t(i4);
            }
            mo13578s();
        }
        t5t0 t5t0Var = this.f10128m;
        if (t5t0Var != null) {
            t5t0Var.m187345b(i, i2);
        }
        C2075b.f9714l.post(new o4t0(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f10119d.m201692f(this);
        this.f10134a.m167513a(surfaceTexture, this.f10131p);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        xsu0.m210834k("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.f10125j = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f10126k = videoHeight;
        if (this.f10125j == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        xsu0.m210834k("AdMediaPlayerView window visibility changed to " + i);
        C2075b.f9714l.post(new Runnable() { // from class: l.j4t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116236a.zzm(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: p */
    public final long mo13575p() {
        if (this.f10133r != null) {
            return ((long) mo13570k()) * ((long) this.f10133r.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: q */
    public final String mo13576q() {
        return "MediaPlayer".concat(true != this.f10129n ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: r */
    public final void mo13577r() {
        xsu0.m210834k("AdMediaPlayerView pause");
        if (m13567G() && this.f10123h.isPlaying()) {
            this.f10123h.pause();
            m13565E(4);
            C2075b.f9714l.post(new r4t0(this));
        }
        this.f10122g = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: s */
    public final void mo13578s() {
        xsu0.m210834k("AdMediaPlayerView play");
        if (m13567G()) {
            this.f10123h.start();
            m13565E(3);
            this.f10134a.m167514b();
            C2075b.f9714l.post(new q4t0(this));
        }
        this.f10122g = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: t */
    public final void mo13579t(int i) {
        xsu0.m210834k("AdMediaPlayerView seek " + i);
        if (!m13567G()) {
            this.f10130o = i;
        } else {
            this.f10123h.seekTo(i);
            this.f10130o = 0;
        }
    }

    @Override // android.view.View
    public final String toString() {
        return zzcfp.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: u */
    public final void mo13580u(t4t0 t4t0Var) {
        this.f10131p = t4t0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: v */
    public final void mo13581v(@Nullable String str) {
        Uri uri = Uri.parse(str);
        zzbbb zzbbbVarM13546g = zzbbb.m13546g(uri);
        if (zzbbbVarM13546g == null || zzbbbVarM13546g.zza != null) {
            if (zzbbbVarM13546g != null) {
                uri = Uri.parse(zzbbbVarM13546g.zza);
            }
            this.f10124i = uri;
            this.f10130o = 0;
            m13563C();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: w */
    public final void mo13582w() {
        xsu0.m210834k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f10123h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f10123h.release();
            this.f10123h = null;
            m13565E(0);
            this.f10122g = 0;
        }
        this.f10119d.m201690d();
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: x */
    public final void mo13583x(float f, float f2) {
        t5t0 t5t0Var = this.f10128m;
        if (t5t0Var != null) {
            t5t0Var.m187348e(f, f2);
        }
    }

    public final /* synthetic */ void zzm(int i) {
        t4t0 t4t0Var = this.f10131p;
        if (t4t0Var != null) {
            t4t0Var.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr, p149l.y5t0
    public final void zzn() {
        m13566F(this.f10135b.m217370a());
    }
}
