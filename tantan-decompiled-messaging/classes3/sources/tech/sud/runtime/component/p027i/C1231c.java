package tech.sud.runtime.component.p027i;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.widget.MediaController;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import tech.sud.runtime.component.p026h.C1228f;

/* JADX INFO: renamed from: tech.sud.runtime.component.i.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1231c extends SurfaceView implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: A */
    private float f11419A;

    /* JADX INFO: renamed from: B */
    private int f11420B;

    /* JADX INFO: renamed from: C */
    private C1229a f11421C;

    /* JADX INFO: renamed from: D */
    private boolean f11422D;

    /* JADX INFO: renamed from: E */
    private boolean f11423E;

    /* JADX INFO: renamed from: F */
    private String f11424F;

    /* JADX INFO: renamed from: G */
    private boolean f11425G;

    /* JADX INFO: renamed from: H */
    private MediaPlayer.OnCompletionListener f11426H;

    /* JADX INFO: renamed from: I */
    private MediaPlayer.OnErrorListener f11427I;

    /* JADX INFO: renamed from: J */
    private MediaPlayer.OnBufferingUpdateListener f11428J;

    /* JADX INFO: renamed from: a */
    protected Context f11429a;

    /* JADX INFO: renamed from: b */
    protected int f11430b;

    /* JADX INFO: renamed from: c */
    protected int f11431c;

    /* JADX INFO: renamed from: d */
    protected int f11432d;

    /* JADX INFO: renamed from: e */
    protected int f11433e;

    /* JADX INFO: renamed from: f */
    protected int f11434f;

    /* JADX INFO: renamed from: g */
    protected int f11435g;

    /* JADX INFO: renamed from: h */
    protected int f11436h;

    /* JADX INFO: renamed from: i */
    protected int f11437i;

    /* JADX INFO: renamed from: j */
    protected boolean f11438j;

    /* JADX INFO: renamed from: k */
    protected int f11439k;

    /* JADX INFO: renamed from: l */
    protected int f11440l;

    /* JADX INFO: renamed from: m */
    MediaPlayer.OnPreparedListener f11441m;

    /* JADX INFO: renamed from: n */
    SurfaceHolder.Callback f11442n;

    /* JADX INFO: renamed from: o */
    private String f11443o;

    /* JADX INFO: renamed from: p */
    private Uri f11444p;

    /* JADX INFO: renamed from: q */
    private int f11445q;

    /* JADX INFO: renamed from: r */
    private int f11446r;

    /* JADX INFO: renamed from: s */
    private int f11447s;

    /* JADX INFO: renamed from: t */
    private SurfaceHolder f11448t;

    /* JADX INFO: renamed from: u */
    private MediaPlayer f11449u;

    /* JADX INFO: renamed from: v */
    private int f11450v;

    /* JADX INFO: renamed from: w */
    private int f11451w;

    /* JADX INFO: renamed from: x */
    private InterfaceC1232d f11452x;

    /* JADX INFO: renamed from: y */
    private int f11453y;

    /* JADX INFO: renamed from: z */
    private int f11454z;

    public C1231c(Context context, int i) {
        super(context);
        this.f11443o = "VideoView";
        this.f11446r = 0;
        this.f11447s = 0;
        this.f11448t = null;
        this.f11449u = null;
        this.f11450v = 0;
        this.f11451w = 0;
        this.f11429a = null;
        this.f11430b = 0;
        this.f11431c = 0;
        this.f11432d = 0;
        this.f11433e = 0;
        this.f11434f = 0;
        this.f11435g = 0;
        this.f11436h = 0;
        this.f11437i = 0;
        this.f11438j = false;
        this.f11439k = 0;
        this.f11440l = 0;
        this.f11420B = 0;
        this.f11422D = false;
        this.f11423E = false;
        this.f11424F = null;
        this.f11425G = false;
        this.f11441m = new MediaPlayer.OnPreparedListener() { // from class: tech.sud.runtime.component.i.c.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                C1231c.this.f11446r = 2;
                if (C1231c.this.f11452x != null) {
                    C1231c.this.f11452x.mo10349a(C1231c.this.f11420B, mediaPlayer.getDuration(), mediaPlayer.getCurrentPosition());
                }
                C1231c.this.f11450v = mediaPlayer.getVideoWidth();
                C1231c.this.f11451w = mediaPlayer.getVideoHeight();
                int i2 = C1231c.this.f11454z;
                if (i2 != 0) {
                    C1231c.this.seekTo(i2);
                }
                C1231c.this.f11449u.setVolume(C1231c.this.f11419A, C1231c.this.f11419A);
                if (C1231c.this.f11447s == 3) {
                    C1231c.this.start();
                }
            }
        };
        this.f11426H = new MediaPlayer.OnCompletionListener() { // from class: tech.sud.runtime.component.i.c.2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                C1231c.this.f11446r = 5;
                C1231c.this.f11447s = 5;
                if (C1231c.this.f11452x != null) {
                    C1231c.this.f11452x.mo10348a(C1231c.this.f11420B);
                }
            }
        };
        this.f11427I = new MediaPlayer.OnErrorListener() { // from class: tech.sud.runtime.component.i.c.3
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                C1228f.m10327b(C1231c.this.f11443o, "Error: " + i2 + "," + i3);
                C1231c.this.f11446r = -1;
                C1231c.this.f11447s = -1;
                InterfaceC1232d interfaceC1232d = C1231c.this.f11452x;
                C1231c c1231c = C1231c.this;
                if (interfaceC1232d != null) {
                    c1231c.f11452x.mo10350b(C1231c.this.f11420B);
                    return true;
                }
                if (c1231c.getWindowToken() != null) {
                    Resources resources = C1231c.this.f11429a.getResources();
                    new AlertDialog.Builder(C1231c.this.f11429a).setTitle(resources.getString(resources.getIdentifier("VideoView_error_title", "string", "android"))).setMessage(i2 == 200 ? resources.getIdentifier("VideoView_error_text_invalid_progressive_playback", "string", "android") : resources.getIdentifier("VideoView_error_text_unknown", "string", "android")).setPositiveButton(resources.getString(resources.getIdentifier("VideoView_error_button", "string", "android")), new DialogInterface.OnClickListener() { // from class: tech.sud.runtime.component.i.c.3.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i4) {
                            if (C1231c.this.f11452x != null) {
                                C1231c.this.f11452x.mo10348a(C1231c.this.f11420B);
                            }
                        }
                    }).setCancelable(false).show();
                }
                return true;
            }
        };
        this.f11428J = new MediaPlayer.OnBufferingUpdateListener() { // from class: tech.sud.runtime.component.i.c.4
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
                C1231c.this.f11453y = i2;
            }
        };
        this.f11442n = new SurfaceHolder.Callback() { // from class: tech.sud.runtime.component.i.c.5
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                boolean z = false;
                boolean z2 = C1231c.this.f11447s == 3;
                if (C1231c.this.f11450v == i3 && C1231c.this.f11451w == i4) {
                    z = true;
                }
                if (C1231c.this.f11449u != null && z2 && z) {
                    if (C1231c.this.f11454z != 0) {
                        C1231c c1231c = C1231c.this;
                        c1231c.seekTo(c1231c.f11454z);
                    }
                    C1231c.this.start();
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                C1231c.this.f11448t = surfaceHolder;
                C1231c.this.m10366e();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                C1231c.this.f11448t = null;
                C1231c.this.m10356a(true);
            }
        };
        this.f11420B = i;
        this.f11429a = context;
        m10363d();
        this.f11421C = new C1229a(context, this);
    }

    /* JADX INFO: renamed from: d */
    private void m10363d() {
        this.f11450v = 0;
        this.f11451w = 0;
        getHolder().addCallback(this.f11442n);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f11446r = 0;
        this.f11447s = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m10366e() {
        if (this.f11448t == null) {
            return;
        }
        if (this.f11423E) {
            if (this.f11424F == null) {
                return;
            }
        } else if (this.f11444p == null) {
            return;
        }
        m10356a(false);
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f11449u = mediaPlayer;
            mediaPlayer.setOnPreparedListener(this.f11441m);
            this.f11449u.setOnCompletionListener(this.f11426H);
            this.f11449u.setOnErrorListener(this.f11427I);
            this.f11449u.setOnBufferingUpdateListener(this.f11428J);
            this.f11449u.setDisplay(this.f11448t);
            this.f11449u.setAudioStreamType(3);
            this.f11449u.setScreenOnWhilePlaying(true);
            this.f11445q = -1;
            this.f11453y = 0;
            if (this.f11423E) {
                AssetFileDescriptor assetFileDescriptorOpenFd = this.f11429a.getAssets().openFd(this.f11424F);
                this.f11449u.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
            } else {
                this.f11449u.setDataSource(this.f11429a, this.f11444p);
            }
            this.f11449u.prepareAsync();
            this.f11446r = 1;
        } catch (IOException e) {
            C1228f.m10325a(this.f11443o, "Unable to open content: " + this.f11444p, e);
            this.f11446r = -1;
            this.f11447s = -1;
            this.f11427I.onError(this.f11449u, 1, 0);
        } catch (IllegalArgumentException e2) {
            C1228f.m10325a(this.f11443o, "Unable to open content: " + this.f11444p, e2);
            this.f11446r = -1;
            this.f11447s = -1;
            this.f11427I.onError(this.f11449u, 1, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10373a(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.f11450v;
        if (i6 == 0 || (i5 = this.f11451w) == 0) {
            this.f11434f = i;
            this.f11435g = i2;
            this.f11436h = i3;
            this.f11437i = i4;
        } else if (i3 == 0 || i4 == 0) {
            this.f11434f = i;
            this.f11435g = i2;
            this.f11436h = i6;
            this.f11437i = i5;
        } else if (this.f11425G) {
            int i7 = i6 * i4;
            int i8 = i3 * i5;
            if (i7 > i8) {
                this.f11436h = i3;
                this.f11437i = i8 / i6;
            } else if (i7 < i8) {
                this.f11436h = i7 / i5;
                this.f11437i = i4;
            }
            this.f11434f = ((i3 - this.f11436h) / 2) + i;
            this.f11435g = ((i4 - this.f11437i) / 2) + i2;
        } else {
            this.f11434f = i;
            this.f11435g = i2;
            this.f11436h = i3;
            this.f11437i = i4;
        }
        getHolder().setFixedSize(this.f11436h, this.f11437i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f11434f;
        layoutParams.topMargin = this.f11435g;
        layoutParams.gravity = 51;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public void m10375b() {
        pause();
        InterfaceC1232d interfaceC1232d = this.f11452x;
        if (interfaceC1232d != null) {
            interfaceC1232d.mo10348a(this.f11420B);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m10376c() {
        int i;
        return (this.f11449u == null || (i = this.f11446r) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return this.f11449u.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f11449u != null) {
            return this.f11453y;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m10376c()) {
            return this.f11449u.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (!m10376c()) {
            this.f11445q = -1;
            return -1;
        }
        int i = this.f11445q;
        if (i > 0) {
            return i;
        }
        int duration = this.f11449u.getDuration();
        this.f11445q = duration;
        return duration;
    }

    public C1229a getVideoControlView() {
        return this.f11421C;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return m10376c() && this.f11449u.isPlaying();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (m10376c() && this.f11449u.isPlaying()) {
            this.f11449u.pause();
            this.f11446r = 4;
        }
        this.f11447s = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        if (!m10376c()) {
            this.f11454z = i;
        } else {
            this.f11449u.seekTo(i);
            this.f11454z = 0;
        }
    }

    public void setEventCallback(InterfaceC1232d interfaceC1232d) {
        this.f11452x = interfaceC1232d;
    }

    public void setKeepRatio(boolean z) {
        this.f11425G = z;
    }

    public void setVideoFileName(String str) {
        if (str.startsWith("assets/")) {
            str = str.substring(7);
        }
        if (str.startsWith("/")) {
            this.f11423E = false;
        } else {
            this.f11424F = str;
            this.f11423E = true;
        }
        m10354a(Uri.fromFile(new File(str)), (Map<String, String>) null);
    }

    public void setVideoURL(String str) {
        this.f11423E = false;
        m10354a(Uri.parse(str), (Map<String, String>) null);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setVisibility(int i) {
        if (i == 4) {
            boolean zIsPlaying = isPlaying();
            this.f11422D = zIsPlaying;
            if (zIsPlaying) {
                this.f11454z = getCurrentPosition();
            }
        } else if (this.f11422D) {
            start();
            this.f11422D = false;
        }
        super.setVisibility(i);
    }

    public void setVolume(float f) {
        if (m10376c()) {
            this.f11449u.setVolume(f, f);
        }
        this.f11419A = f;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (m10376c()) {
            this.f11449u.start();
            this.f11446r = 3;
        }
        this.f11447s = 3;
    }

    /* JADX INFO: renamed from: a */
    public void m10374a(boolean z, int i, int i2) {
        this.f11438j = z;
        this.f11421C.m10333a(z);
        if (i != 0 && i2 != 0) {
            this.f11439k = i;
            this.f11440l = i2;
        }
        m10372a();
    }

    /* JADX INFO: renamed from: a */
    private void m10354a(Uri uri, Map<String, String> map) {
        this.f11444p = uri;
        this.f11454z = 0;
        this.f11419A = 1.0f;
        this.f11450v = 0;
        this.f11451w = 0;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: a */
    public void m10372a() {
        if (this.f11438j) {
            m10373a(0, 0, this.f11439k, this.f11440l);
        } else {
            m10373a(this.f11430b, this.f11431c, this.f11432d, this.f11433e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m10356a(boolean z) {
        MediaPlayer mediaPlayer = this.f11449u;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f11449u.release();
            this.f11449u = null;
            this.f11446r = 0;
            if (z) {
                this.f11447s = 0;
            }
        }
    }
}
