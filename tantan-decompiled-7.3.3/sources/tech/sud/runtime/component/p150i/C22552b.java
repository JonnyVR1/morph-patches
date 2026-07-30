package tech.sud.runtime.component.p150i;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import p153l.dmg0;
import tech.sud.runtime.core.C22563g;

/* JADX INFO: renamed from: tech.sud.runtime.component.i.b */
/* JADX INFO: loaded from: classes3.dex */
public class C22552b {

    /* JADX INFO: renamed from: b */
    private final FrameLayout f208712b;

    /* JADX INFO: renamed from: c */
    private final C22563g f208713c;

    /* JADX INFO: renamed from: a */
    private Map<Integer, C22553c> f208711a = new HashMap(10);

    /* JADX INFO: renamed from: d */
    private InterfaceC22554d f208714d = new InterfaceC22554d() { // from class: tech.sud.runtime.component.i.b.1
        @Override // tech.sud.runtime.component.p150i.InterfaceC22554d
        /* JADX INFO: renamed from: a */
        public void mo223124a(int i, int i2, int i3) {
            C22552b.this.m223109a(i, i2, i3);
        }

        @Override // tech.sud.runtime.component.p150i.InterfaceC22554d
        /* JADX INFO: renamed from: b */
        public void mo223125b(int i) {
            C22552b.this.m223114e(i);
        }

        @Override // tech.sud.runtime.component.p150i.InterfaceC22554d
        /* JADX INFO: renamed from: a */
        public void mo223123a(int i) {
            C22552b.this.m223113d(i);
        }
    };

    public C22552b(FrameLayout frameLayout, C22563g c22563g) {
        this.f208712b = frameLayout;
        this.f208713c = c22563g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m223113d(int i) {
        this.f208713c.m223240b(4, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m223114e(int i) {
        this.f208713c.m223240b(5, i);
    }

    /* JADX INFO: renamed from: a */
    public void m223119a(int i, String str) {
        C22553c c22553c;
        if (this.f208712b == null || (c22553c = this.f208711a.get(Integer.valueOf(i))) == null) {
            return;
        }
        c22553c.setVideoFileName(str);
        this.f208712b.addView(c22553c.getVideoControlView(), new FrameLayout.LayoutParams(1, 1));
    }

    /* JADX INFO: renamed from: b */
    public void m223121b(int i) {
        C22553c c22553c = this.f208711a.get(Integer.valueOf(i));
        if (c22553c == null) {
            return;
        }
        c22553c.setKeepRatio(true);
        c22553c.m223149a(true, this.f208713c.m223241c(), this.f208713c.m223242d());
        c22553c.start();
    }

    /* JADX INFO: renamed from: c */
    public void m223122c(int i) {
        C22553c c22553c = this.f208711a.get(Integer.valueOf(i));
        if (c22553c == null) {
            return;
        }
        c22553c.pause();
    }

    /* JADX INFO: renamed from: a */
    public void m223120a(Context context, int i) {
        C22553c c22553c = new C22553c(context, i);
        c22553c.setZOrderOnTop(true);
        c22553c.setEventCallback(this.f208714d);
        this.f208711a.put(Integer.valueOf(i), c22553c);
    }

    /* JADX INFO: renamed from: a */
    public void m223116a(int i) {
        C22553c c22553c = this.f208711a.get(Integer.valueOf(i));
        if (c22553c == null) {
            return;
        }
        C22551a videoControlView = c22553c.getVideoControlView();
        if (videoControlView != null) {
            videoControlView.m223107a();
        }
        this.f208711a.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public void m223115a() {
    }

    /* JADX INFO: renamed from: a */
    public void m223118a(int i, int i2) {
        C22553c c22553c = this.f208711a.get(Integer.valueOf(i));
        if (c22553c == null) {
            return;
        }
        c22553c.seekTo(i2);
    }

    /* JADX INFO: renamed from: a */
    public void m223117a(int i, float f) {
        C22553c c22553c = this.f208711a.get(Integer.valueOf(i));
        if (c22553c == null) {
            return;
        }
        c22553c.setVolume(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m223109a(int i, int i2, int i3) {
        this.f208713c.m223232a(3, i, i2, dmg0.m116959a(i3, ""));
    }
}
