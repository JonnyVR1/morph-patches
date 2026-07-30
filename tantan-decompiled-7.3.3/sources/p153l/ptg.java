package p153l;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.live.LiveTagView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import java.util.HashMap;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ptg {

    /* JADX INFO: renamed from: A */
    public n570 f154044A;

    /* JADX INFO: renamed from: a */
    public FeedCenterImageView f154045a;

    /* JADX INFO: renamed from: b */
    public View f154046b;

    /* JADX INFO: renamed from: c */
    public VLinear f154047c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f154048d;

    /* JADX INFO: renamed from: e */
    public LiveTagView f154049e;

    /* JADX INFO: renamed from: f */
    public VText f154050f;

    /* JADX INFO: renamed from: g */
    public VText f154051g;

    /* JADX INFO: renamed from: h */
    public VExpandableTextContainer f154052h;

    /* JADX INFO: renamed from: i */
    public VText f154053i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f154054j;

    /* JADX INFO: renamed from: k */
    public VText f154055k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f154056l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f154057m;

    /* JADX INFO: renamed from: n */
    public VText f154058n;

    /* JADX INFO: renamed from: o */
    public AnimEffectPlayer f154059o;

    /* JADX INFO: renamed from: p */
    public VImage f154060p;

    /* JADX INFO: renamed from: q */
    public View f154061q;

    /* JADX INFO: renamed from: r */
    public Act f154062r;

    /* JADX INFO: renamed from: s */
    public FeedCenterImageView f154063s;

    /* JADX INFO: renamed from: t */
    public int f154064t = 9;

    /* JADX INFO: renamed from: u */
    public int f154065u = qa00.m175859d(160.0f);

    /* JADX INFO: renamed from: v */
    public int f154066v = qa00.m175859d(172.0f);

    /* JADX INFO: renamed from: w */
    public Moment f154067w;

    /* JADX INFO: renamed from: x */
    public String f154068x;

    /* JADX INFO: renamed from: y */
    public boolean f154069y;

    /* JADX INFO: renamed from: z */
    public int f154070z;

    public ptg(Act act, mtg mtgVar, FeedCenterImageView feedCenterImageView) {
        this.f154062r = act;
        this.f154063s = feedCenterImageView;
        this.f154067w = feedCenterImageView.f42742i;
        this.f154068x = feedCenterImageView.f42744k;
        this.f154069y = feedCenterImageView.f42749p;
        this.f154070z = feedCenterImageView.f42750q;
        this.f154044A = feedCenterImageView.f42752s;
        this.f154045a = mtgVar.m160000j();
        this.f154046b = mtgVar.m159997g();
        this.f154047c = mtgVar.m159995e();
        this.f154048d = mtgVar.m160010t();
        this.f154049e = mtgVar.m160011u();
        this.f154050f = mtgVar.m160012v();
        this.f154051g = mtgVar.m160013w();
        this.f154052h = mtgVar.m160008r();
        this.f154053i = mtgVar.m160014x();
        this.f154054j = mtgVar.m160003m();
        this.f154055k = mtgVar.m160002l();
        this.f154056l = mtgVar.m160005o();
        this.f154057m = mtgVar.m160007q();
        this.f154058n = mtgVar.m160006p();
        this.f154059o = mtgVar.m159996f();
        this.f154060p = mtgVar.m160004n();
        this.f154061q = mtgVar.m159998h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: a */
    public Dimension m173767a(Picture picture) {
        Dimension dimension;
        int i;
        int i2;
        int iM175859d = (this.f154063s.f42666B * 2) + qa00.m175859d(FeedCenterImageView.f42665F);
        if (NullChecker.m82487b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                dimension = new Dimension(iM175859d, iM175859d);
            }
        } else {
            dimension = new Dimension(iM175859d, iM175859d);
        }
        float f = dimension.width / dimension.height;
        if (f > 0.7f) {
            if (f <= 0.83f) {
                i2 = (iM175859d * 3) / 4;
            } else {
                i = f >= 1.2f ? (iM175859d * 3) / 4 : iM175859d;
            }
            return new Dimension(iM175859d, i);
        }
        i2 = (iM175859d * 9) / 16;
        int i3 = i2;
        i = iM175859d;
        iM175859d = i3;
        return new Dimension(iM175859d, i);
    }

    /* JADX INFO: renamed from: b */
    public void m173768b(View view, boolean z) {
        if (NullChecker.m82486a(view)) {
            bnl0.m105524M(view, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo142037c(int i, Moment moment, HashMap<String, Boolean> map) {
        throw null;
    }
}
