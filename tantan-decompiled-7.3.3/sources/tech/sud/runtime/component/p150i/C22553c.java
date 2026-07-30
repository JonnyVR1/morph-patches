package tech.sud.runtime.component.p150i;

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
import tech.sud.runtime.component.p149h.C22550f;

/* JADX INFO: renamed from: tech.sud.runtime.component.i.c */
/* JADX INFO: loaded from: classes3.dex */
public class C22553c extends SurfaceView implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: A */
    private float f208716A;

    /* JADX INFO: renamed from: B */
    private int f208717B;

    /* JADX INFO: renamed from: C */
    private C22551a f208718C;

    /* JADX INFO: renamed from: D */
    private boolean f208719D;

    /* JADX INFO: renamed from: E */
    private boolean f208720E;

    /* JADX INFO: renamed from: F */
    private String f208721F;

    /* JADX INFO: renamed from: G */
    private boolean f208722G;

    /* JADX INFO: renamed from: H */
    private MediaPlayer.OnCompletionListener f208723H;

    /* JADX INFO: renamed from: I */
    private MediaPlayer.OnErrorListener f208724I;

    /* JADX INFO: renamed from: J */
    private MediaPlayer.OnBufferingUpdateListener f208725J;

    /* JADX INFO: renamed from: a */
    protected Context f208726a;

    /* JADX INFO: renamed from: b */
    protected int f208727b;

    /* JADX INFO: renamed from: c */
    protected int f208728c;

    /* JADX INFO: renamed from: d */
    protected int f208729d;

    /* JADX INFO: renamed from: e */
    protected int f208730e;

    /* JADX INFO: renamed from: f */
    protected int f208731f;

    /* JADX INFO: renamed from: g */
    protected int f208732g;

    /* JADX INFO: renamed from: h */
    protected int f208733h;

    /* JADX INFO: renamed from: i */
    protected int f208734i;

    /* JADX INFO: renamed from: j */
    protected boolean f208735j;

    /* JADX INFO: renamed from: k */
    protected int f208736k;

    /* JADX INFO: renamed from: l */
    protected int f208737l;

    /* JADX INFO: renamed from: m */
    MediaPlayer.OnPreparedListener f208738m;

    /* JADX INFO: renamed from: n */
    SurfaceHolder.Callback f208739n;

    /* JADX INFO: renamed from: o */
    private String f208740o;

    /* JADX INFO: renamed from: p */
    private Uri f208741p;

    /* JADX INFO: renamed from: q */
    private int f208742q;

    /* JADX INFO: renamed from: r */
    private int f208743r;

    /* JADX INFO: renamed from: s */
    private int f208744s;

    /* JADX INFO: renamed from: t */
    private SurfaceHolder f208745t;

    /* JADX INFO: renamed from: u */
    private MediaPlayer f208746u;

    /* JADX INFO: renamed from: v */
    private int f208747v;

    /* JADX INFO: renamed from: w */
    private int f208748w;

    /* JADX INFO: renamed from: x */
    private InterfaceC22554d f208749x;

    /* JADX INFO: renamed from: y */
    private int f208750y;

    /* JADX INFO: renamed from: z */
    private int f208751z;

    public C22553c(Context context, int i) {
        super(context);
        this.f208740o = "VideoView";
        this.f208743r = 0;
        this.f208744s = 0;
        this.f208745t = null;
        this.f208746u = null;
        this.f208747v = 0;
        this.f208748w = 0;
        this.f208726a = null;
        this.f208727b = 0;
        this.f208728c = 0;
        this.f208729d = 0;
        this.f208730e = 0;
        this.f208731f = 0;
        this.f208732g = 0;
        this.f208733h = 0;
        this.f208734i = 0;
        this.f208735j = false;
        this.f208736k = 0;
        this.f208737l = 0;
        this.f208717B = 0;
        this.f208719D = false;
        this.f208720E = false;
        this.f208721F = null;
        this.f208722G = false;
        this.f208738m = new MediaPlayer.OnPreparedListener() { // from class: tech.sud.runtime.component.i.c.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                C22553c.this.f208743r = 2;
                if (C22553c.this.f208749x != null) {
                    C22553c.this.f208749x.mo223124a(C22553c.this.f208717B, mediaPlayer.getDuration(), mediaPlayer.getCurrentPosition());
                }
                C22553c.this.f208747v = mediaPlayer.getVideoWidth();
                C22553c.this.f208748w = mediaPlayer.getVideoHeight();
                int i2 = C22553c.this.f208751z;
                if (i2 != 0) {
                    C22553c.this.seekTo(i2);
                }
                C22553c.this.f208746u.setVolume(C22553c.this.f208716A, C22553c.this.f208716A);
                if (C22553c.this.f208744s == 3) {
                    C22553c.this.start();
                }
            }
        };
        this.f208723H = new MediaPlayer.OnCompletionListener() { // from class: tech.sud.runtime.component.i.c.2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                C22553c.this.f208743r = 5;
                C22553c.this.f208744s = 5;
                if (C22553c.this.f208749x != null) {
                    C22553c.this.f208749x.mo223123a(C22553c.this.f208717B);
                }
            }
        };
        this.f208724I = new MediaPlayer.OnErrorListener() { // from class: tech.sud.runtime.component.i.c.3
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                C22550f.m223102b(C22553c.this.f208740o, "Error: " + i2 + Constants.SEPARATOR_COMMA + i3);
                C22553c.this.f208743r = -1;
                C22553c.this.f208744s = -1;
                InterfaceC22554d interfaceC22554d = C22553c.this.f208749x;
                C22553c c22553c = C22553c.this;
                if (interfaceC22554d != null) {
                    c22553c.f208749x.mo223125b(C22553c.this.f208717B);
                    return true;
                }
                if (c22553c.getWindowToken() != null) {
                    Resources resources = C22553c.this.f208726a.getResources();
                    new AlertDialog.Builder(C22553c.this.f208726a).setTitle(resources.getString(resources.getIdentifier("VideoView_error_title", "string", "android"))).setMessage(i2 == 200 ? resources.getIdentifier("VideoView_error_text_invalid_progressive_playback", "string", "android") : resources.getIdentifier("VideoView_error_text_unknown", "string", "android")).setPositiveButton(resources.getString(resources.getIdentifier("VideoView_error_button", "string", "android")), new DialogInterface.OnClickListener() { // from class: tech.sud.runtime.component.i.c.3.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i4) {
                            if (C22553c.this.f208749x != null) {
                                C22553c.this.f208749x.mo223123a(C22553c.this.f208717B);
                            }
                        }
                    }).setCancelable(false).show();
                }
                return true;
            }
        };
        this.f208725J = new MediaPlayer.OnBufferingUpdateListener() { // from class: tech.sud.runtime.component.i.c.4
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
                C22553c.this.f208750y = i2;
            }
        };
        this.f208739n = new SurfaceHolder.Callback() { // from class: tech.sud.runtime.component.i.c.5
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                boolean z = false;
                boolean z2 = C22553c.this.f208744s == 3;
                if (C22553c.this.f208747v == i3 && C22553c.this.f208748w == i4) {
                    z = true;
                }
                if (C22553c.this.f208746u != null && z2 && z) {
                    if (C22553c.this.f208751z != 0) {
                        C22553c c22553c = C22553c.this;
                        c22553c.seekTo(c22553c.f208751z);
                    }
                    C22553c.this.start();
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                C22553c.this.f208745t = surfaceHolder;
                C22553c.this.m223141e();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                C22553c.this.f208745t = null;
                C22553c.this.m223131a(true);
            }
        };
        this.f208717B = i;
        this.f208726a = context;
        m223138d();
        this.f208718C = new C22551a(context, this);
    }

    /* JADX INFO: renamed from: d */
    private void m223138d() {
        this.f208747v = 0;
        this.f208748w = 0;
        getHolder().addCallback(this.f208739n);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f208743r = 0;
        this.f208744s = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m223141e() {
        if (this.f208745t == null) {
            return;
        }
        if (this.f208720E) {
            if (this.f208721F == null) {
                return;
            }
        } else if (this.f208741p == null) {
            return;
        }
        m223131a(false);
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f208746u = mediaPlayer;
            mediaPlayer.setOnPreparedListener(this.f208738m);
            this.f208746u.setOnCompletionListener(this.f208723H);
            this.f208746u.setOnErrorListener(this.f208724I);
            this.f208746u.setOnBufferingUpdateListener(this.f208725J);
            this.f208746u.setDisplay(this.f208745t);
            this.f208746u.setAudioStreamType(3);
            this.f208746u.setScreenOnWhilePlaying(true);
            this.f208742q = -1;
            this.f208750y = 0;
            if (this.f208720E) {
                AssetFileDescriptor assetFileDescriptorOpenFd = this.f208726a.getAssets().openFd(this.f208721F);
                this.f208746u.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
            } else {
                this.f208746u.setDataSource(this.f208726a, this.f208741p);
            }
            this.f208746u.prepareAsync();
            this.f208743r = 1;
        } catch (IOException e) {
            C22550f.m223100a(this.f208740o, "Unable to open content: " + this.f208741p, e);
            this.f208743r = -1;
            this.f208744s = -1;
            this.f208724I.onError(this.f208746u, 1, 0);
        } catch (IllegalArgumentException e2) {
            C22550f.m223100a(this.f208740o, "Unable to open content: " + this.f208741p, e2);
            this.f208743r = -1;
            this.f208744s = -1;
            this.f208724I.onError(this.f208746u, 1, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m223148a(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.f208747v;
        if (i6 == 0 || (i5 = this.f208748w) == 0) {
            this.f208731f = i;
            this.f208732g = i2;
            this.f208733h = i3;
            this.f208734i = i4;
        } else if (i3 == 0 || i4 == 0) {
            this.f208731f = i;
            this.f208732g = i2;
            this.f208733h = i6;
            this.f208734i = i5;
        } else if (this.f208722G) {
            int i7 = i6 * i4;
            int i8 = i3 * i5;
            if (i7 > i8) {
                this.f208733h = i3;
                this.f208734i = i8 / i6;
            } else if (i7 < i8) {
                this.f208733h = i7 / i5;
                this.f208734i = i4;
            }
            this.f208731f = ((i3 - this.f208733h) / 2) + i;
            this.f208732g = ((i4 - this.f208734i) / 2) + i2;
        } else {
            this.f208731f = i;
            this.f208732g = i2;
            this.f208733h = i3;
            this.f208734i = i4;
        }
        getHolder().setFixedSize(this.f208733h, this.f208734i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f208731f;
        layoutParams.topMargin = this.f208732g;
        layoutParams.gravity = 51;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public void m223150b() {
        pause();
        InterfaceC22554d interfaceC22554d = this.f208749x;
        if (interfaceC22554d != null) {
            interfaceC22554d.mo223123a(this.f208717B);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m223151c() {
        int i;
        return (this.f208746u == null || (i = this.f208743r) == -1 || i == 0 || i == 1) ? false : true;
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
        return this.f208746u.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f208746u != null) {
            return this.f208750y;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m223151c()) {
            return this.f208746u.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (!m223151c()) {
            this.f208742q = -1;
            return -1;
        }
        int i = this.f208742q;
        if (i > 0) {
            return i;
        }
        int duration = this.f208746u.getDuration();
        this.f208742q = duration;
        return duration;
    }

    public C22551a getVideoControlView() {
        return this.f208718C;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return m223151c() && this.f208746u.isPlaying();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (m223151c() && this.f208746u.isPlaying()) {
            this.f208746u.pause();
            this.f208743r = 4;
        }
        this.f208744s = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        if (!m223151c()) {
            this.f208751z = i;
        } else {
            this.f208746u.seekTo(i);
            this.f208751z = 0;
        }
    }

    public void setEventCallback(InterfaceC22554d interfaceC22554d) {
        this.f208749x = interfaceC22554d;
    }

    public void setKeepRatio(boolean z) {
        this.f208722G = z;
    }

    public void setVideoFileName(String str) {
        if (str.startsWith("assets/")) {
            str = str.substring(7);
        }
        if (str.startsWith("/")) {
            this.f208720E = false;
        } else {
            this.f208721F = str;
            this.f208720E = true;
        }
        m223129a(Uri.fromFile(new File(str)), (Map<String, String>) null);
    }

    public void setVideoURL(String str) {
        this.f208720E = false;
        m223129a(Uri.parse(str), (Map<String, String>) null);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setVisibility(int i) {
        if (i == 4) {
            boolean zIsPlaying = isPlaying();
            this.f208719D = zIsPlaying;
            if (zIsPlaying) {
                this.f208751z = getCurrentPosition();
            }
        } else if (this.f208719D) {
            start();
            this.f208719D = false;
        }
        super.setVisibility(i);
    }

    public void setVolume(float f) {
        if (m223151c()) {
            this.f208746u.setVolume(f, f);
        }
        this.f208716A = f;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (m223151c()) {
            this.f208746u.start();
            this.f208743r = 3;
        }
        this.f208744s = 3;
    }

    /* JADX INFO: renamed from: a */
    public void m223149a(boolean z, int i, int i2) {
        this.f208735j = z;
        this.f208718C.m223108a(z);
        if (i != 0 && i2 != 0) {
            this.f208736k = i;
            this.f208737l = i2;
        }
        m223147a();
    }

    /* JADX INFO: renamed from: a */
    private void m223129a(Uri uri, Map<String, String> map) {
        this.f208741p = uri;
        this.f208751z = 0;
        this.f208716A = 1.0f;
        this.f208747v = 0;
        this.f208748w = 0;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: a */
    public void m223147a() {
        if (this.f208735j) {
            m223148a(0, 0, this.f208736k, this.f208737l);
        } else {
            m223148a(this.f208727b, this.f208728c, this.f208729d, this.f208730e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m223131a(boolean z) {
        MediaPlayer mediaPlayer = this.f208746u;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f208746u.release();
            this.f208746u = null;
            this.f208743r = 0;
            if (z) {
                this.f208744s = 0;
            }
        }
    }
}
