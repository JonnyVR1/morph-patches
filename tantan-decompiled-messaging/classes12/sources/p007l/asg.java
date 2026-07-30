package p007l;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.live.LiveTagView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import java.util.HashMap;
import l.t100;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class asg {

    /* JADX INFO: renamed from: A */
    public hx60 f5812A;

    /* JADX INFO: renamed from: a */
    public FeedCenterImageView f5813a;

    /* JADX INFO: renamed from: b */
    public View f5814b;

    /* JADX INFO: renamed from: c */
    public VLinear f5815c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f5816d;

    /* JADX INFO: renamed from: e */
    public LiveTagView f5817e;

    /* JADX INFO: renamed from: f */
    public VText f5818f;

    /* JADX INFO: renamed from: g */
    public VText f5819g;

    /* JADX INFO: renamed from: h */
    public VExpandableTextContainer f5820h;

    /* JADX INFO: renamed from: i */
    public VText f5821i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f5822j;

    /* JADX INFO: renamed from: k */
    public VText f5823k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f5824l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f5825m;

    /* JADX INFO: renamed from: n */
    public VText f5826n;

    /* JADX INFO: renamed from: o */
    public AnimEffectPlayer f5827o;

    /* JADX INFO: renamed from: p */
    public VImage f5828p;

    /* JADX INFO: renamed from: q */
    public View f5829q;

    /* JADX INFO: renamed from: r */
    public Act f5830r;

    /* JADX INFO: renamed from: s */
    public FeedCenterImageView f5831s;

    /* JADX INFO: renamed from: t */
    public int f5832t = 9;

    /* JADX INFO: renamed from: u */
    public int f5833u = t100.d(160.0f);

    /* JADX INFO: renamed from: v */
    public int f5834v = t100.d(172.0f);

    /* JADX INFO: renamed from: w */
    public Moment f5835w;

    /* JADX INFO: renamed from: x */
    public String f5836x;

    /* JADX INFO: renamed from: y */
    public boolean f5837y;

    /* JADX INFO: renamed from: z */
    public int f5838z;

    public asg(Act act, xrg xrgVar, FeedCenterImageView feedCenterImageView) {
        this.f5830r = act;
        this.f5831s = feedCenterImageView;
        this.f5835w = feedCenterImageView.f3355i;
        this.f5836x = feedCenterImageView.f3357k;
        this.f5837y = feedCenterImageView.f3362p;
        this.f5838z = feedCenterImageView.f3363q;
        this.f5812A = feedCenterImageView.f3365s;
        this.f5813a = xrgVar.m16823j();
        this.f5814b = xrgVar.m16820g();
        this.f5815c = xrgVar.m16818e();
        this.f5816d = xrgVar.m16833t();
        this.f5817e = xrgVar.m16834u();
        this.f5818f = xrgVar.m16835v();
        this.f5819g = xrgVar.m16836w();
        this.f5820h = xrgVar.m16831r();
        this.f5821i = xrgVar.m16837x();
        this.f5822j = xrgVar.m16826m();
        this.f5823k = xrgVar.m16825l();
        this.f5824l = xrgVar.m16828o();
        this.f5825m = xrgVar.m16830q();
        this.f5826n = xrgVar.m16829p();
        this.f5827o = xrgVar.m16819f();
        this.f5828p = xrgVar.m16827n();
        this.f5829q = xrgVar.m16821h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: a */
    public Dimension m8590a(Picture picture) {
        Dimension dimension;
        int i;
        int i2;
        int iD = (this.f5831s.f3279B * 2) + t100.d(FeedCenterImageView.f3278F);
        if (NullChecker.b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                dimension = new Dimension(iD, iD);
            }
        } else {
            dimension = new Dimension(iD, iD);
        }
        float f = dimension.width / dimension.height;
        if (f > 0.7f) {
            if (f <= 0.83f) {
                i2 = (iD * 3) / 4;
            } else {
                i = f >= 1.2f ? (iD * 3) / 4 : iD;
            }
            return new Dimension(iD, i);
        }
        i2 = (iD * 9) / 16;
        int i3 = i2;
        i = iD;
        iD = i3;
        return new Dimension(iD, i);
    }

    /* JADX INFO: renamed from: b */
    public void m8591b(View view, boolean z) {
        if (NullChecker.a(view)) {
            xdl0.M(view, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo8592c(int i, Moment moment, HashMap<String, Boolean> map) {
        throw null;
    }
}
