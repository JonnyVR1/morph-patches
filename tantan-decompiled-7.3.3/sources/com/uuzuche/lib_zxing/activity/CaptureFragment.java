package com.uuzuche.lib_zxing.activity;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.zxing.BarcodeFormat;
import com.uuzuche.lib_zxing.decoding.CaptureActivityHandler;
import com.uuzuche.lib_zxing.view.ViewfinderView;
import java.io.IOException;
import java.util.Vector;
import p153l.bfc0;
import p153l.ic5;
import p153l.pdc0;
import p153l.r5d0;
import p153l.vsm;
import p153l.wfc0;
import p153l.x94;

/* JADX INFO: loaded from: classes2.dex */
public class CaptureFragment extends Fragment implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: A */
    private ViewfinderView f61698A;

    /* JADX INFO: renamed from: B */
    private boolean f61699B;

    /* JADX INFO: renamed from: C */
    private Vector<BarcodeFormat> f61700C;

    /* JADX INFO: renamed from: D */
    private String f61701D;

    /* JADX INFO: renamed from: E */
    private vsm f61702E;

    /* JADX INFO: renamed from: F */
    private MediaPlayer f61703F;

    /* JADX INFO: renamed from: G */
    private boolean f61704G;

    /* JADX INFO: renamed from: H */
    private boolean f61705H;

    /* JADX INFO: renamed from: I */
    private SurfaceView f61706I;

    /* JADX INFO: renamed from: J */
    private SurfaceHolder f61707J;

    /* JADX INFO: renamed from: K */
    private ic5 f61708K;

    /* JADX INFO: renamed from: L */
    private Camera f61709L;

    /* JADX INFO: renamed from: M */
    private final MediaPlayer.OnCompletionListener f61710M = new C14676a();

    /* JADX INFO: renamed from: N */
    @Nullable
    InterfaceC14677b f61711N;

    /* JADX INFO: renamed from: z */
    private CaptureActivityHandler f61712z;

    /* JADX INFO: renamed from: com.uuzuche.lib_zxing.activity.CaptureFragment$a */
    public class C14676a implements MediaPlayer.OnCompletionListener {
        public C14676a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.seekTo(0);
        }
    }

    /* JADX INFO: renamed from: com.uuzuche.lib_zxing.activity.CaptureFragment$b */
    public interface InterfaceC14677b {
        /* JADX INFO: renamed from: a */
        void mo85861a(Exception exc);
    }

    /* JADX INFO: renamed from: Y3 */
    private void m85864Y3() {
        if (this.f61704G && this.f61703F == null) {
            getActivity().setVolumeControlStream(3);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f61703F = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            this.f61703F.setOnCompletionListener(this.f61710M);
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = getResources().openRawResourceFd(wfc0.f188783a);
            try {
                this.f61703F.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                this.f61703F.setVolume(0.1f, 0.1f);
                this.f61703F.prepare();
            } catch (IOException unused) {
                this.f61703F = null;
            }
        }
    }

    /* JADX INFO: renamed from: Z3 */
    private void m85865Z3(SurfaceHolder surfaceHolder) {
        try {
            x94.m209763c().m209774l(surfaceHolder);
            this.f61709L = x94.m209763c().m209768e();
            InterfaceC14677b interfaceC14677b = this.f61711N;
            if (interfaceC14677b != null) {
                interfaceC14677b.mo85861a(null);
            }
            if (this.f61712z == null) {
                this.f61712z = new CaptureActivityHandler(this, this.f61700C, this.f61701D, this.f61698A);
            }
        } catch (Exception e) {
            InterfaceC14677b interfaceC14677b2 = this.f61711N;
            if (interfaceC14677b2 != null) {
                interfaceC14677b2.mo85861a(e);
            }
        }
    }

    /* JADX INFO: renamed from: a4 */
    private void m85866a4() {
        MediaPlayer mediaPlayer;
        if (this.f61704G && (mediaPlayer = this.f61703F) != null) {
            mediaPlayer.start();
        }
        if (this.f61705H) {
            FragmentActivity activity = getActivity();
            getActivity();
            ((Vibrator) activity.getSystemService("vibrator")).vibrate(200L);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public void m85867V3() {
        this.f61698A.m85880d();
    }

    /* JADX INFO: renamed from: W3 */
    public Handler m85868W3() {
        return this.f61712z;
    }

    /* JADX INFO: renamed from: X3 */
    public void m85869X3(r5d0 r5d0Var, Bitmap bitmap) {
        this.f61702E.m202639b();
        m85866a4();
        if (r5d0Var == null || TextUtils.isEmpty(r5d0Var.m179857f())) {
            ic5 ic5Var = this.f61708K;
            if (ic5Var != null) {
                ic5Var.mo85863b();
                return;
            }
            return;
        }
        ic5 ic5Var2 = this.f61708K;
        if (ic5Var2 != null) {
            ic5Var2.mo85862a(bitmap, r5d0Var.m179857f());
        }
    }

    /* JADX INFO: renamed from: b4 */
    public void m85870b4(ic5 ic5Var) {
        this.f61708K = ic5Var;
    }

    /* JADX INFO: renamed from: c4 */
    public void m85871c4(InterfaceC14677b interfaceC14677b) {
        this.f61711N = interfaceC14677b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        x94.m209764i(getActivity().getApplication());
        this.f61699B = false;
        this.f61702E = new vsm(getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        Bundle arguments = getArguments();
        View viewInflate = (arguments == null || (i = arguments.getInt("layout_id")) == -1) ? null : layoutInflater.inflate(i, (ViewGroup) null);
        if (viewInflate == null) {
            viewInflate = layoutInflater.inflate(bfc0.f76479b, (ViewGroup) null);
        }
        this.f61698A = (ViewfinderView) viewInflate.findViewById(pdc0.f151741k);
        SurfaceView surfaceView = (SurfaceView) viewInflate.findViewById(pdc0.f151737g);
        this.f61706I = surfaceView;
        this.f61707J = surfaceView.getHolder();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f61702E.m202640c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        CaptureActivityHandler captureActivityHandler = this.f61712z;
        if (captureActivityHandler != null) {
            captureActivityHandler.m85873a();
            this.f61712z = null;
        }
        x94.m209763c().m209766b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        boolean z = this.f61699B;
        SurfaceHolder surfaceHolder = this.f61707J;
        if (z) {
            m85865Z3(surfaceHolder);
        } else {
            surfaceHolder.addCallback(this);
            this.f61707J.setType(3);
        }
        this.f61700C = null;
        this.f61701D = null;
        this.f61704G = true;
        FragmentActivity activity = getActivity();
        getActivity();
        if (((AudioManager) activity.getSystemService("audio")).getRingerMode() != 2) {
            this.f61704G = false;
        }
        m85864Y3();
        this.f61705H = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f61699B) {
            return;
        }
        this.f61699B = true;
        m85865Z3(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f61699B = false;
        Camera camera = this.f61709L;
        if (camera == null || camera == null || !x94.m209763c().m209772j()) {
            return;
        }
        if (!x94.m209763c().m209773k()) {
            this.f61709L.setPreviewCallback(null);
        }
        this.f61709L.stopPreview();
        x94.m209763c().m209771h().m168798a(null, 0);
        x94.m209763c().m209767d().m190675a(null, 0);
        x94.m209763c().m209777o(false);
    }
}
