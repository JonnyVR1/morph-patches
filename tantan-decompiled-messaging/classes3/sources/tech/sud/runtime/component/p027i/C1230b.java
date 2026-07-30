package tech.sud.runtime.component.p027i;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import l.vdg0;
import tech.sud.runtime.core.C1241g;

/* JADX INFO: renamed from: tech.sud.runtime.component.i.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1230b {

    /* JADX INFO: renamed from: b */
    private final FrameLayout f11415b;

    /* JADX INFO: renamed from: c */
    private final C1241g f11416c;

    /* JADX INFO: renamed from: a */
    private Map<Integer, C1231c> f11414a = new HashMap(10);

    /* JADX INFO: renamed from: d */
    private InterfaceC1232d f11417d = new InterfaceC1232d() { // from class: tech.sud.runtime.component.i.b.1
        @Override // tech.sud.runtime.component.p027i.InterfaceC1232d
        /* JADX INFO: renamed from: a */
        public void mo10349a(int i, int i2, int i3) {
            C1230b.this.m10334a(i, i2, i3);
        }

        @Override // tech.sud.runtime.component.p027i.InterfaceC1232d
        /* JADX INFO: renamed from: b */
        public void mo10350b(int i) {
            C1230b.this.m10339e(i);
        }

        @Override // tech.sud.runtime.component.p027i.InterfaceC1232d
        /* JADX INFO: renamed from: a */
        public void mo10348a(int i) {
            C1230b.this.m10338d(i);
        }
    };

    public C1230b(FrameLayout frameLayout, C1241g c1241g) {
        this.f11415b = frameLayout;
        this.f11416c = c1241g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m10338d(int i) {
        this.f11416c.m10465b(4, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m10339e(int i) {
        this.f11416c.m10465b(5, i);
    }

    /* JADX INFO: renamed from: a */
    public void m10344a(int i, String str) {
        C1231c c1231c;
        if (this.f11415b == null || (c1231c = this.f11414a.get(Integer.valueOf(i))) == null) {
            return;
        }
        c1231c.setVideoFileName(str);
        this.f11415b.addView(c1231c.getVideoControlView(), new FrameLayout.LayoutParams(1, 1));
    }

    /* JADX INFO: renamed from: b */
    public void m10346b(int i) {
        C1231c c1231c = this.f11414a.get(Integer.valueOf(i));
        if (c1231c == null) {
            return;
        }
        c1231c.setKeepRatio(true);
        c1231c.m10374a(true, this.f11416c.m10466c(), this.f11416c.m10467d());
        c1231c.start();
    }

    /* JADX INFO: renamed from: c */
    public void m10347c(int i) {
        C1231c c1231c = this.f11414a.get(Integer.valueOf(i));
        if (c1231c == null) {
            return;
        }
        c1231c.pause();
    }

    /* JADX INFO: renamed from: a */
    public void m10345a(Context context, int i) {
        C1231c c1231c = new C1231c(context, i);
        c1231c.setZOrderOnTop(true);
        c1231c.setEventCallback(this.f11417d);
        this.f11414a.put(Integer.valueOf(i), c1231c);
    }

    /* JADX INFO: renamed from: a */
    public void m10341a(int i) {
        C1231c c1231c = this.f11414a.get(Integer.valueOf(i));
        if (c1231c == null) {
            return;
        }
        C1229a videoControlView = c1231c.getVideoControlView();
        if (videoControlView != null) {
            videoControlView.m10332a();
        }
        this.f11414a.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public void m10340a() {
    }

    /* JADX INFO: renamed from: a */
    public void m10343a(int i, int i2) {
        C1231c c1231c = this.f11414a.get(Integer.valueOf(i));
        if (c1231c == null) {
            return;
        }
        c1231c.seekTo(i2);
    }

    /* JADX INFO: renamed from: a */
    public void m10342a(int i, float f) {
        C1231c c1231c = this.f11414a.get(Integer.valueOf(i));
        if (c1231c == null) {
            return;
        }
        c1231c.setVolume(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m10334a(int i, int i2, int i3) {
        this.f11416c.m10457a(3, i, i2, vdg0.a(i3, ""));
    }
}
