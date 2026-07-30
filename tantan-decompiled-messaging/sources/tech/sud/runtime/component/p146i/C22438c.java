package tech.sud.runtime.component.p146i;

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
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import tech.sud.runtime.component.p145h.C22435f;

/* JADX INFO: renamed from: tech.sud.runtime.component.i.c */
/* JADX INFO: loaded from: classes3.dex */
public class C22438c extends SurfaceView implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: A */
    private float f207794A;

    /* JADX INFO: renamed from: B */
    private int f207795B;

    /* JADX INFO: renamed from: C */
    private C22436a f207796C;

    /* JADX INFO: renamed from: D */
    private boolean f207797D;

    /* JADX INFO: renamed from: E */
    private boolean f207798E;

    /* JADX INFO: renamed from: F */
    private String f207799F;

    /* JADX INFO: renamed from: G */
    private boolean f207800G;

    /* JADX INFO: renamed from: H */
    private MediaPlayer.OnCompletionListener f207801H;

    /* JADX INFO: renamed from: I */
    private MediaPlayer.OnErrorListener f207802I;

    /* JADX INFO: renamed from: J */
    private MediaPlayer.OnBufferingUpdateListener f207803J;

    /* JADX INFO: renamed from: a */
    protected Context f207804a;

    /* JADX INFO: renamed from: b */
    protected int f207805b;

    /* JADX INFO: renamed from: c */
    protected int f207806c;

    /* JADX INFO: renamed from: d */
    protected int f207807d;

    /* JADX INFO: renamed from: e */
    protected int f207808e;

    /* JADX INFO: renamed from: f */
    protected int f207809f;

    /* JADX INFO: renamed from: g */
    protected int f207810g;

    /* JADX INFO: renamed from: h */
    protected int f207811h;

    /* JADX INFO: renamed from: i */
    protected int f207812i;

    /* JADX INFO: renamed from: j */
    protected boolean f207813j;

    /* JADX INFO: renamed from: k */
    protected int f207814k;

    /* JADX INFO: renamed from: l */
    protected int f207815l;

    /* JADX INFO: renamed from: m */
    MediaPlayer.OnPreparedListener f207816m;

    /* JADX INFO: renamed from: n */
    SurfaceHolder.Callback f207817n;

    /* JADX INFO: renamed from: o */
    private String f207818o;

    /* JADX INFO: renamed from: p */
    private Uri f207819p;

    /* JADX INFO: renamed from: q */
    private int f207820q;

    /* JADX INFO: renamed from: r */
    private int f207821r;

    /* JADX INFO: renamed from: s */
    private int f207822s;

    /* JADX INFO: renamed from: t */
    private SurfaceHolder f207823t;

    /* JADX INFO: renamed from: u */
    private MediaPlayer f207824u;

    /* JADX INFO: renamed from: v */
    private int f207825v;

    /* JADX INFO: renamed from: w */
    private int f207826w;

    /* JADX INFO: renamed from: x */
    private InterfaceC22439d f207827x;

    /* JADX INFO: renamed from: y */
    private int f207828y;

    /* JADX INFO: renamed from: z */
    private int f207829z;

    public C22438c(Context context, int i) {
        super(context);
        this.f207818o = "VideoView";
        this.f207821r = 0;
        this.f207822s = 0;
        this.f207823t = null;
        this.f207824u = null;
        this.f207825v = 0;
        this.f207826w = 0;
        this.f207804a = null;
        this.f207805b = 0;
        this.f207806c = 0;
        this.f207807d = 0;
        this.f207808e = 0;
        this.f207809f = 0;
        this.f207810g = 0;
        this.f207811h = 0;
        this.f207812i = 0;
        this.f207813j = false;
        this.f207814k = 0;
        this.f207815l = 0;
        this.f207795B = 0;
        this.f207797D = false;
        this.f207798E = false;
        this.f207799F = null;
        this.f207800G = false;
        this.f207816m = new MediaPlayer.OnPreparedListener() { // from class: tech.sud.runtime.component.i.c.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                C22438c.this.f207821r = 2;
                if (C22438c.this.f207827x != null) {
                    C22438c.this.f207827x.mo221878a(C22438c.this.f207795B, mediaPlayer.getDuration(), mediaPlayer.getCurrentPosition());
                }
                C22438c.this.f207825v = mediaPlayer.getVideoWidth();
                C22438c.this.f207826w = mediaPlayer.getVideoHeight();
                int i2 = C22438c.this.f207829z;
                if (i2 != 0) {
                    C22438c.this.seekTo(i2);
                }
                C22438c.this.f207824u.setVolume(C22438c.this.f207794A, C22438c.this.f207794A);
                if (C22438c.this.f207822s == 3) {
                    C22438c.this.start();
                }
            }
        };
        this.f207801H = new MediaPlayer.OnCompletionListener() { // from class: tech.sud.runtime.component.i.c.2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                C22438c.this.f207821r = 5;
                C22438c.this.f207822s = 5;
                if (C22438c.this.f207827x != null) {
                    C22438c.this.f207827x.mo221877a(C22438c.this.f207795B);
                }
            }
        };
        this.f207802I = new MediaPlayer.OnErrorListener() { // from class: tech.sud.runtime.component.i.c.3
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                C22435f.m221856b(C22438c.this.f207818o, "Error: " + i2 + Constants.SEPARATOR_COMMA + i3);
                C22438c.this.f207821r = -1;
                C22438c.this.f207822s = -1;
                InterfaceC22439d interfaceC22439d = C22438c.this.f207827x;
                C22438c c22438c = C22438c.this;
                if (interfaceC22439d != null) {
                    c22438c.f207827x.mo221879b(C22438c.this.f207795B);
                    return true;
                }
                if (c22438c.getWindowToken() != null) {
                    Resources resources = C22438c.this.f207804a.getResources();
                    new AlertDialog.Builder(C22438c.this.f207804a).setTitle(resources.getString(resources.getIdentifier("VideoView_error_title", "string", "android"))).setMessage(i2 == 200 ? resources.getIdentifier("VideoView_error_text_invalid_progressive_playback", "string", "android") : resources.getIdentifier("VideoView_error_text_unknown", "string", "android")).setPositiveButton(resources.getString(resources.getIdentifier("VideoView_error_button", "string", "android")), new DialogInterface.OnClickListener() { // from class: tech.sud.runtime.component.i.c.3.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i4) {
                            if (C22438c.this.f207827x != null) {
                                C22438c.this.f207827x.mo221877a(C22438c.this.f207795B);
                            }
                        }
                    }).setCancelable(false).show();
                }
                return true;
            }
        };
        this.f207803J = new MediaPlayer.OnBufferingUpdateListener() { // from class: tech.sud.runtime.component.i.c.4
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
                C22438c.this.f207828y = i2;
            }
        };
        this.f207817n = new SurfaceHolder.Callback() { // from class: tech.sud.runtime.component.i.c.5
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                boolean z = false;
                boolean z2 = C22438c.this.f207822s == 3;
                if (C22438c.this.f207825v == i3 && C22438c.this.f207826w == i4) {
                    z = true;
                }
                if (C22438c.this.f207824u != null && z2 && z) {
                    if (C22438c.this.f207829z != 0) {
                        C22438c c22438c = C22438c.this;
                        c22438c.seekTo(c22438c.f207829z);
                    }
                    C22438c.this.start();
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                C22438c.this.f207823t = surfaceHolder;
                C22438c.this.m221895e();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                C22438c.this.f207823t = null;
                C22438c.this.m221885a(true);
            }
        };
        this.f207795B = i;
        this.f207804a = context;
        m221892d();
        this.f207796C = new C22436a(context, this);
    }

    /* JADX INFO: renamed from: d */
    private void m221892d() {
        this.f207825v = 0;
        this.f207826w = 0;
        getHolder().addCallback(this.f207817n);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f207821r = 0;
        this.f207822s = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m221895e() {
        if (this.f207823t == null) {
            return;
        }
        if (this.f207798E) {
            if (this.f207799F == null) {
                return;
            }
        } else if (this.f207819p == null) {
            return;
        }
        m221885a(false);
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f207824u = mediaPlayer;
            mediaPlayer.setOnPreparedListener(this.f207816m);
            this.f207824u.setOnCompletionListener(this.f207801H);
            this.f207824u.setOnErrorListener(this.f207802I);
            this.f207824u.setOnBufferingUpdateListener(this.f207803J);
            this.f207824u.setDisplay(this.f207823t);
            this.f207824u.setAudioStreamType(3);
            this.f207824u.setScreenOnWhilePlaying(true);
            this.f207820q = -1;
            this.f207828y = 0;
            if (this.f207798E) {
                AssetFileDescriptor assetFileDescriptorOpenFd = this.f207804a.getAssets().openFd(this.f207799F);
                this.f207824u.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
            } else {
                this.f207824u.setDataSource(this.f207804a, this.f207819p);
            }
            this.f207824u.prepareAsync();
            this.f207821r = 1;
        } catch (IOException e) {
            C22435f.m221854a(this.f207818o, "Unable to open content: " + this.f207819p, e);
            this.f207821r = -1;
            this.f207822s = -1;
            this.f207802I.onError(this.f207824u, 1, 0);
        } catch (IllegalArgumentException e2) {
            C22435f.m221854a(this.f207818o, "Unable to open content: " + this.f207819p, e2);
            this.f207821r = -1;
            this.f207822s = -1;
            this.f207802I.onError(this.f207824u, 1, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221902a(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.f207825v;
        if (i6 == 0 || (i5 = this.f207826w) == 0) {
            this.f207809f = i;
            this.f207810g = i2;
            this.f207811h = i3;
            this.f207812i = i4;
        } else if (i3 == 0 || i4 == 0) {
            this.f207809f = i;
            this.f207810g = i2;
            this.f207811h = i6;
            this.f207812i = i5;
        } else if (this.f207800G) {
            int i7 = i6 * i4;
            int i8 = i3 * i5;
            if (i7 > i8) {
                this.f207811h = i3;
                this.f207812i = i8 / i6;
            } else if (i7 < i8) {
                this.f207811h = i7 / i5;
                this.f207812i = i4;
            }
            this.f207809f = ((i3 - this.f207811h) / 2) + i;
            this.f207810g = ((i4 - this.f207812i) / 2) + i2;
        } else {
            this.f207809f = i;
            this.f207810g = i2;
            this.f207811h = i3;
            this.f207812i = i4;
        }
        getHolder().setFixedSize(this.f207811h, this.f207812i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f207809f;
        layoutParams.topMargin = this.f207810g;
        layoutParams.gravity = 51;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public void m221904b() {
        pause();
        InterfaceC22439d interfaceC22439d = this.f207827x;
        if (interfaceC22439d != null) {
            interfaceC22439d.mo221877a(this.f207795B);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m221905c() {
        int i;
        return (this.f207824u == null || (i = this.f207821r) == -1 || i == 0 || i == 1) ? false : true;
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
        return this.f207824u.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f207824u != null) {
            return this.f207828y;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m221905c()) {
            return this.f207824u.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (!m221905c()) {
            this.f207820q = -1;
            return -1;
        }
        int i = this.f207820q;
        if (i > 0) {
            return i;
        }
        int duration = this.f207824u.getDuration();
        this.f207820q = duration;
        return duration;
    }

    public C22436a getVideoControlView() {
        return this.f207796C;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return m221905c() && this.f207824u.isPlaying();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (m221905c() && this.f207824u.isPlaying()) {
            this.f207824u.pause();
            this.f207821r = 4;
        }
        this.f207822s = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        if (!m221905c()) {
            this.f207829z = i;
        } else {
            this.f207824u.seekTo(i);
            this.f207829z = 0;
        }
    }

    public void setEventCallback(InterfaceC22439d interfaceC22439d) {
        this.f207827x = interfaceC22439d;
    }

    public void setKeepRatio(boolean z) {
        this.f207800G = z;
    }

    public void setVideoFileName(String str) {
        if (str.startsWith("assets/")) {
            str = str.substring(7);
        }
        if (str.startsWith("/")) {
            this.f207798E = false;
        } else {
            this.f207799F = str;
            this.f207798E = true;
        }
        m221883a(Uri.fromFile(new File(str)), (Map<String, String>) null);
    }

    public void setVideoURL(String str) {
        this.f207798E = false;
        m221883a(Uri.parse(str), (Map<String, String>) null);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setVisibility(int i) {
        if (i == 4) {
            boolean zIsPlaying = isPlaying();
            this.f207797D = zIsPlaying;
            if (zIsPlaying) {
                this.f207829z = getCurrentPosition();
            }
        } else if (this.f207797D) {
            start();
            this.f207797D = false;
        }
        super.setVisibility(i);
    }

    public void setVolume(float f) {
        if (m221905c()) {
            this.f207824u.setVolume(f, f);
        }
        this.f207794A = f;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (m221905c()) {
            this.f207824u.start();
            this.f207821r = 3;
        }
        this.f207822s = 3;
    }

    /* JADX INFO: renamed from: a */
    public void m221903a(boolean z, int i, int i2) {
        this.f207813j = z;
        this.f207796C.m221862a(z);
        if (i != 0 && i2 != 0) {
            this.f207814k = i;
            this.f207815l = i2;
        }
        m221901a();
    }

    /* JADX INFO: renamed from: a */
    private void m221883a(Uri uri, Map<String, String> map) {
        this.f207819p = uri;
        this.f207829z = 0;
        this.f207794A = 1.0f;
        this.f207825v = 0;
        this.f207826w = 0;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: a */
    public void m221901a() {
        if (this.f207813j) {
            m221902a(0, 0, this.f207814k, this.f207815l);
        } else {
            m221902a(this.f207805b, this.f207806c, this.f207807d, this.f207808e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m221885a(boolean z) {
        MediaPlayer mediaPlayer = this.f207824u;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f207824u.release();
            this.f207824u = null;
            this.f207821r = 0;
            if (z) {
                this.f207822s = 0;
            }
        }
    }
}
