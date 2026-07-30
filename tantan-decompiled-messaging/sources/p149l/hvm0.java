package p149l;

import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveVirtualVoiceCard;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public abstract class hvm0 {

    /* JADX INFO: renamed from: a */
    public int f109669a;

    /* JADX INFO: renamed from: b */
    public BLiveVirtualVoiceCard f109670b;

    /* JADX INFO: renamed from: c */
    public PushMessage f109671c;

    /* JADX INFO: renamed from: d */
    public View f109672d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f109673e;

    /* JADX INFO: renamed from: f */
    public TextView f109674f;

    /* JADX INFO: renamed from: g */
    public VText f109675g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f109676h;

    /* JADX INFO: renamed from: i */
    public TextView f109677i;

    /* JADX INFO: renamed from: j */
    public VImage f109678j;

    /* JADX INFO: renamed from: k */
    public VText f109679k;

    /* JADX INFO: renamed from: l */
    public VText f109680l;

    /* JADX INFO: renamed from: m */
    public VText f109681m;

    /* JADX INFO: renamed from: n */
    public TextView f109682n;

    /* JADX INFO: renamed from: o */
    public VText f109683o;

    public hvm0(View view, BLiveVirtualVoiceCard bLiveVirtualVoiceCard, int i) {
        this.f109672d = view;
        this.f109669a = i;
        this.f109670b = bLiveVirtualVoiceCard;
        m133192a();
        mo133194c();
    }

    /* JADX INFO: renamed from: a */
    public final void m133192a() {
        this.f109673e = (VDraweeView) this.f109672d.findViewById(f5c0.f94990D0);
        this.f109674f = (TextView) this.f109672d.findViewById(f5c0.f95127o2);
        this.f109675g = (VText) this.f109672d.findViewById(f5c0.f95123n2);
        this.f109676h = (VDraweeView) this.f109672d.findViewById(f5c0.f95108k);
        this.f109677i = (TextView) this.f109672d.findViewById(f5c0.f95147t2);
        this.f109678j = (VImage) this.f109672d.findViewById(f5c0.f94982B0);
        this.f109679k = (VText) this.f109672d.findViewById(f5c0.f95143s2);
        this.f109681m = (VText) this.f109672d.findViewById(f5c0.f95061X1);
        this.f109682n = (TextView) this.f109672d.findViewById(f5c0.f95058W1);
        this.f109680l = (VText) this.f109672d.findViewById(f5c0.f95103i2);
        this.f109683o = (VText) this.f109672d.findViewById(f5c0.f95075b2);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo133194c();

    public hvm0(View view, PushMessage pushMessage, int i) {
        this.f109672d = view;
        this.f109671c = pushMessage;
        this.f109669a = i;
        m133192a();
        mo133194c();
    }

    /* JADX INFO: renamed from: b */
    public void m133193b() {
    }
}
