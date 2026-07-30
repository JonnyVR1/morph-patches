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
import p149l.ib5;
import p149l.j5c0;
import p149l.oxc0;
import p149l.s7c0;
import p149l.tqm;
import p149l.w6c0;
import p149l.y84;

/* JADX INFO: loaded from: classes2.dex */
public class CaptureFragment extends Fragment implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: A */
    private ViewfinderView f60851A;

    /* JADX INFO: renamed from: B */
    private boolean f60852B;

    /* JADX INFO: renamed from: C */
    private Vector<BarcodeFormat> f60853C;

    /* JADX INFO: renamed from: D */
    private String f60854D;

    /* JADX INFO: renamed from: E */
    private tqm f60855E;

    /* JADX INFO: renamed from: F */
    private MediaPlayer f60856F;

    /* JADX INFO: renamed from: G */
    private boolean f60857G;

    /* JADX INFO: renamed from: H */
    private boolean f60858H;

    /* JADX INFO: renamed from: I */
    private SurfaceView f60859I;

    /* JADX INFO: renamed from: J */
    private SurfaceHolder f60860J;

    /* JADX INFO: renamed from: K */
    private ib5 f60861K;

    /* JADX INFO: renamed from: L */
    private Camera f60862L;

    /* JADX INFO: renamed from: M */
    private final MediaPlayer.OnCompletionListener f60863M = new C14528a();

    /* JADX INFO: renamed from: N */
    @Nullable
    InterfaceC14529b f60864N;

    /* JADX INFO: renamed from: z */
    private CaptureActivityHandler f60865z;

    /* JADX INFO: renamed from: com.uuzuche.lib_zxing.activity.CaptureFragment$a */
    public class C14528a implements MediaPlayer.OnCompletionListener {
        public C14528a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.seekTo(0);
        }
    }

    /* JADX INFO: renamed from: com.uuzuche.lib_zxing.activity.CaptureFragment$b */
    public interface InterfaceC14529b {
        /* JADX INFO: renamed from: a */
        void mo84690a(Exception exc);
    }

    /* JADX INFO: renamed from: Y3 */
    private void m84693Y3() {
        if (this.f60857G && this.f60856F == null) {
            getActivity().setVolumeControlStream(3);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f60856F = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            this.f60856F.setOnCompletionListener(this.f60863M);
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = getResources().openRawResourceFd(s7c0.f162907a);
            try {
                this.f60856F.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                this.f60856F.setVolume(0.1f, 0.1f);
                this.f60856F.prepare();
            } catch (IOException unused) {
                this.f60856F = null;
            }
        }
    }

    /* JADX INFO: renamed from: Z3 */
    private void m84694Z3(SurfaceHolder surfaceHolder) {
        try {
            y84.m213344c().m213355l(surfaceHolder);
            this.f60862L = y84.m213344c().m213349e();
            InterfaceC14529b interfaceC14529b = this.f60864N;
            if (interfaceC14529b != null) {
                interfaceC14529b.mo84690a(null);
            }
            if (this.f60865z == null) {
                this.f60865z = new CaptureActivityHandler(this, this.f60853C, this.f60854D, this.f60851A);
            }
        } catch (Exception e) {
            InterfaceC14529b interfaceC14529b2 = this.f60864N;
            if (interfaceC14529b2 != null) {
                interfaceC14529b2.mo84690a(e);
            }
        }
    }

    /* JADX INFO: renamed from: a4 */
    private void m84695a4() {
        MediaPlayer mediaPlayer;
        if (this.f60857G && (mediaPlayer = this.f60856F) != null) {
            mediaPlayer.start();
        }
        if (this.f60858H) {
            FragmentActivity activity = getActivity();
            getActivity();
            ((Vibrator) activity.getSystemService("vibrator")).vibrate(200L);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public void m84696V3() {
        this.f60851A.m84709d();
    }

    /* JADX INFO: renamed from: W3 */
    public Handler m84697W3() {
        return this.f60865z;
    }

    /* JADX INFO: renamed from: X3 */
    public void m84698X3(oxc0 oxc0Var, Bitmap bitmap) {
        this.f60855E.m190125b();
        m84695a4();
        if (oxc0Var == null || TextUtils.isEmpty(oxc0Var.m166532f())) {
            ib5 ib5Var = this.f60861K;
            if (ib5Var != null) {
                ib5Var.mo84692b();
                return;
            }
            return;
        }
        ib5 ib5Var2 = this.f60861K;
        if (ib5Var2 != null) {
            ib5Var2.mo84691a(bitmap, oxc0Var.m166532f());
        }
    }

    /* JADX INFO: renamed from: b4 */
    public void m84699b4(ib5 ib5Var) {
        this.f60861K = ib5Var;
    }

    /* JADX INFO: renamed from: c4 */
    public void m84700c4(InterfaceC14529b interfaceC14529b) {
        this.f60864N = interfaceC14529b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        y84.m213345i(getActivity().getApplication());
        this.f60852B = false;
        this.f60855E = new tqm(getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        Bundle arguments = getArguments();
        View viewInflate = (arguments == null || (i = arguments.getInt("layout_id")) == -1) ? null : layoutInflater.inflate(i, (ViewGroup) null);
        if (viewInflate == null) {
            viewInflate = layoutInflater.inflate(w6c0.f184829b, (ViewGroup) null);
        }
        this.f60851A = (ViewfinderView) viewInflate.findViewById(j5c0.f116295k);
        SurfaceView surfaceView = (SurfaceView) viewInflate.findViewById(j5c0.f116291g);
        this.f60859I = surfaceView;
        this.f60860J = surfaceView.getHolder();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f60855E.m190126c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        CaptureActivityHandler captureActivityHandler = this.f60865z;
        if (captureActivityHandler != null) {
            captureActivityHandler.m84702a();
            this.f60865z = null;
        }
        y84.m213344c().m213347b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        boolean z = this.f60852B;
        SurfaceHolder surfaceHolder = this.f60860J;
        if (z) {
            m84694Z3(surfaceHolder);
        } else {
            surfaceHolder.addCallback(this);
            this.f60860J.setType(3);
        }
        this.f60853C = null;
        this.f60854D = null;
        this.f60857G = true;
        FragmentActivity activity = getActivity();
        getActivity();
        if (((AudioManager) activity.getSystemService("audio")).getRingerMode() != 2) {
            this.f60857G = false;
        }
        m84693Y3();
        this.f60858H = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f60852B) {
            return;
        }
        this.f60852B = true;
        m84694Z3(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f60852B = false;
        Camera camera = this.f60862L;
        if (camera == null || camera == null || !y84.m213344c().m213353j()) {
            return;
        }
        if (!y84.m213344c().m213354k()) {
            this.f60862L.setPreviewCallback(null);
        }
        this.f60862L.stopPreview();
        y84.m213344c().m213352h().m146054a(null, 0);
        y84.m213344c().m213348d().m154110a(null, 0);
        y84.m213344c().m213358o(false);
    }
}
