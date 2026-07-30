package p153l;

import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveVirtualVoiceCard;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public abstract class l4n0 {

    /* JADX INFO: renamed from: a */
    public int f129990a;

    /* JADX INFO: renamed from: b */
    public BLiveVirtualVoiceCard f129991b;

    /* JADX INFO: renamed from: c */
    public PushMessage f129992c;

    /* JADX INFO: renamed from: d */
    public View f129993d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f129994e;

    /* JADX INFO: renamed from: f */
    public TextView f129995f;

    /* JADX INFO: renamed from: g */
    public VText f129996g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f129997h;

    /* JADX INFO: renamed from: i */
    public TextView f129998i;

    /* JADX INFO: renamed from: j */
    public VImage f129999j;

    /* JADX INFO: renamed from: k */
    public VText f130000k;

    /* JADX INFO: renamed from: l */
    public VText f130001l;

    /* JADX INFO: renamed from: m */
    public VText f130002m;

    /* JADX INFO: renamed from: n */
    public TextView f130003n;

    /* JADX INFO: renamed from: o */
    public VText f130004o;

    public l4n0(View view, BLiveVirtualVoiceCard bLiveVirtualVoiceCard, int i) {
        this.f129993d = view;
        this.f129990a = i;
        this.f129991b = bLiveVirtualVoiceCard;
        m152810a();
        mo152812c();
    }

    /* JADX INFO: renamed from: a */
    public final void m152810a() {
        this.f129994e = (VDraweeView) this.f129993d.findViewById(ldc0.f131447D0);
        this.f129995f = (TextView) this.f129993d.findViewById(ldc0.f131584o2);
        this.f129996g = (VText) this.f129993d.findViewById(ldc0.f131580n2);
        this.f129997h = (VDraweeView) this.f129993d.findViewById(ldc0.f131565k);
        this.f129998i = (TextView) this.f129993d.findViewById(ldc0.f131604t2);
        this.f129999j = (VImage) this.f129993d.findViewById(ldc0.f131439B0);
        this.f130000k = (VText) this.f129993d.findViewById(ldc0.f131600s2);
        this.f130002m = (VText) this.f129993d.findViewById(ldc0.f131518X1);
        this.f130003n = (TextView) this.f129993d.findViewById(ldc0.f131515W1);
        this.f130001l = (VText) this.f129993d.findViewById(ldc0.f131560i2);
        this.f130004o = (VText) this.f129993d.findViewById(ldc0.f131532b2);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo152812c();

    public l4n0(View view, PushMessage pushMessage, int i) {
        this.f129993d = view;
        this.f129992c = pushMessage;
        this.f129990a = i;
        m152810a();
        mo152812c();
    }

    /* JADX INFO: renamed from: b */
    public void m152811b() {
    }
}
