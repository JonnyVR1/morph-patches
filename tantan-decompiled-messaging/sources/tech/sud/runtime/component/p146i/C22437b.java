package tech.sud.runtime.component.p146i;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import p149l.vdg0;
import tech.sud.runtime.core.C22448g;

/* JADX INFO: renamed from: tech.sud.runtime.component.i.b */
/* JADX INFO: loaded from: classes3.dex */
public class C22437b {

    /* JADX INFO: renamed from: b */
    private final FrameLayout f207790b;

    /* JADX INFO: renamed from: c */
    private final C22448g f207791c;

    /* JADX INFO: renamed from: a */
    private Map<Integer, C22438c> f207789a = new HashMap(10);

    /* JADX INFO: renamed from: d */
    private InterfaceC22439d f207792d = new InterfaceC22439d() { // from class: tech.sud.runtime.component.i.b.1
        @Override // tech.sud.runtime.component.p146i.InterfaceC22439d
        /* JADX INFO: renamed from: a */
        public void mo221878a(int i, int i2, int i3) {
            C22437b.this.m221863a(i, i2, i3);
        }

        @Override // tech.sud.runtime.component.p146i.InterfaceC22439d
        /* JADX INFO: renamed from: b */
        public void mo221879b(int i) {
            C22437b.this.m221868e(i);
        }

        @Override // tech.sud.runtime.component.p146i.InterfaceC22439d
        /* JADX INFO: renamed from: a */
        public void mo221877a(int i) {
            C22437b.this.m221867d(i);
        }
    };

    public C22437b(FrameLayout frameLayout, C22448g c22448g) {
        this.f207790b = frameLayout;
        this.f207791c = c22448g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m221867d(int i) {
        this.f207791c.m221994b(4, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m221868e(int i) {
        this.f207791c.m221994b(5, i);
    }

    /* JADX INFO: renamed from: a */
    public void m221873a(int i, String str) {
        C22438c c22438c;
        if (this.f207790b == null || (c22438c = this.f207789a.get(Integer.valueOf(i))) == null) {
            return;
        }
        c22438c.setVideoFileName(str);
        this.f207790b.addView(c22438c.getVideoControlView(), new FrameLayout.LayoutParams(1, 1));
    }

    /* JADX INFO: renamed from: b */
    public void m221875b(int i) {
        C22438c c22438c = this.f207789a.get(Integer.valueOf(i));
        if (c22438c == null) {
            return;
        }
        c22438c.setKeepRatio(true);
        c22438c.m221903a(true, this.f207791c.m221995c(), this.f207791c.m221996d());
        c22438c.start();
    }

    /* JADX INFO: renamed from: c */
    public void m221876c(int i) {
        C22438c c22438c = this.f207789a.get(Integer.valueOf(i));
        if (c22438c == null) {
            return;
        }
        c22438c.pause();
    }

    /* JADX INFO: renamed from: a */
    public void m221874a(Context context, int i) {
        C22438c c22438c = new C22438c(context, i);
        c22438c.setZOrderOnTop(true);
        c22438c.setEventCallback(this.f207792d);
        this.f207789a.put(Integer.valueOf(i), c22438c);
    }

    /* JADX INFO: renamed from: a */
    public void m221870a(int i) {
        C22438c c22438c = this.f207789a.get(Integer.valueOf(i));
        if (c22438c == null) {
            return;
        }
        C22436a videoControlView = c22438c.getVideoControlView();
        if (videoControlView != null) {
            videoControlView.m221861a();
        }
        this.f207789a.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public void m221869a() {
    }

    /* JADX INFO: renamed from: a */
    public void m221872a(int i, int i2) {
        C22438c c22438c = this.f207789a.get(Integer.valueOf(i));
        if (c22438c == null) {
            return;
        }
        c22438c.seekTo(i2);
    }

    /* JADX INFO: renamed from: a */
    public void m221871a(int i, float f) {
        C22438c c22438c = this.f207789a.get(Integer.valueOf(i));
        if (c22438c == null) {
            return;
        }
        c22438c.setVolume(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m221863a(int i, int i2, int i3) {
        this.f207791c.m221986a(3, i, i2, vdg0.m197997a(i3, ""));
    }
}
