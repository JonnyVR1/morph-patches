package p149l;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.live.LiveTagView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import java.util.HashMap;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class asg {

    /* JADX INFO: renamed from: A */
    public hx60 f71422A;

    /* JADX INFO: renamed from: a */
    public FeedCenterImageView f71423a;

    /* JADX INFO: renamed from: b */
    public View f71424b;

    /* JADX INFO: renamed from: c */
    public VLinear f71425c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f71426d;

    /* JADX INFO: renamed from: e */
    public LiveTagView f71427e;

    /* JADX INFO: renamed from: f */
    public VText f71428f;

    /* JADX INFO: renamed from: g */
    public VText f71429g;

    /* JADX INFO: renamed from: h */
    public VExpandableTextContainer f71430h;

    /* JADX INFO: renamed from: i */
    public VText f71431i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f71432j;

    /* JADX INFO: renamed from: k */
    public VText f71433k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f71434l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f71435m;

    /* JADX INFO: renamed from: n */
    public VText f71436n;

    /* JADX INFO: renamed from: o */
    public AnimEffectPlayer f71437o;

    /* JADX INFO: renamed from: p */
    public VImage f71438p;

    /* JADX INFO: renamed from: q */
    public View f71439q;

    /* JADX INFO: renamed from: r */
    public Act f71440r;

    /* JADX INFO: renamed from: s */
    public FeedCenterImageView f71441s;

    /* JADX INFO: renamed from: t */
    public int f71442t = 9;

    /* JADX INFO: renamed from: u */
    public int f71443u = t100.m186890d(160.0f);

    /* JADX INFO: renamed from: v */
    public int f71444v = t100.m186890d(172.0f);

    /* JADX INFO: renamed from: w */
    public Moment f71445w;

    /* JADX INFO: renamed from: x */
    public String f71446x;

    /* JADX INFO: renamed from: y */
    public boolean f71447y;

    /* JADX INFO: renamed from: z */
    public int f71448z;

    public asg(Act act, xrg xrgVar, FeedCenterImageView feedCenterImageView) {
        this.f71440r = act;
        this.f71441s = feedCenterImageView;
        this.f71445w = feedCenterImageView.f41894i;
        this.f71446x = feedCenterImageView.f41896k;
        this.f71447y = feedCenterImageView.f41901p;
        this.f71448z = feedCenterImageView.f41902q;
        this.f71422A = feedCenterImageView.f41904s;
        this.f71423a = xrgVar.m210684j();
        this.f71424b = xrgVar.m210681g();
        this.f71425c = xrgVar.m210679e();
        this.f71426d = xrgVar.m210694t();
        this.f71427e = xrgVar.m210695u();
        this.f71428f = xrgVar.m210696v();
        this.f71429g = xrgVar.m210697w();
        this.f71430h = xrgVar.m210692r();
        this.f71431i = xrgVar.m210698x();
        this.f71432j = xrgVar.m210687m();
        this.f71433k = xrgVar.m210686l();
        this.f71434l = xrgVar.m210689o();
        this.f71435m = xrgVar.m210691q();
        this.f71436n = xrgVar.m210690p();
        this.f71437o = xrgVar.m210680f();
        this.f71438p = xrgVar.m210688n();
        this.f71439q = xrgVar.m210682h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: a */
    public Dimension m98591a(Picture picture) {
        Dimension dimension;
        int i;
        int i2;
        int iM186890d = (this.f71441s.f41818B * 2) + t100.m186890d(FeedCenterImageView.f41817F);
        if (NullChecker.m81304b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                dimension = new Dimension(iM186890d, iM186890d);
            }
        } else {
            dimension = new Dimension(iM186890d, iM186890d);
        }
        float f = dimension.width / dimension.height;
        if (f > 0.7f) {
            if (f <= 0.83f) {
                i2 = (iM186890d * 3) / 4;
            } else {
                i = f >= 1.2f ? (iM186890d * 3) / 4 : iM186890d;
            }
            return new Dimension(iM186890d, i);
        }
        i2 = (iM186890d * 9) / 16;
        int i3 = i2;
        i = iM186890d;
        iM186890d = i3;
        return new Dimension(iM186890d, i);
    }

    /* JADX INFO: renamed from: b */
    public void m98592b(View view, boolean z) {
        if (NullChecker.m81303a(view)) {
            xdl0.m208344M(view, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo98593c(int i, Moment moment, HashMap<String, Boolean> map) {
        throw null;
    }
}
