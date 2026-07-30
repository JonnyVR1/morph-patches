package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class itg extends ptg {
    public itg(Act act, mtg mtgVar, FeedCenterImageView feedCenterImageView) {
        super(act, mtgVar, feedCenterImageView);
    }

    @Override // p153l.ptg
    /* JADX INFO: renamed from: c */
    public void mo142037c(int i, final Moment moment, HashMap<String, Boolean> map) {
        String str;
        final z20<Moment, Integer> z20Var = this.f154063s.f42669E;
        m173768b(this.f154056l, false);
        m173768b(this.f154048d, false);
        m173768b(this.f154055k, false);
        if (j4h.m143420d()) {
            this.f154059o.stopAnimation();
        }
        m173768b(this.f154053i, false);
        m173768b(this.f154054j, true);
        List<Media> list = moment.media;
        if (i == 0) {
            str = "follow";
        } else {
            str = i == 1 ? "nearby" : "";
        }
        qtg.m177929e(moment, list, this.f154054j, str, new a30() { // from class: l.gtg
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f106414a.m142039g(z20Var, moment, obj, obj2, obj3);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m142038f(z20 z20Var, Moment moment, int i, int i2, View view) {
        if (NullChecker.m82486a(z20Var)) {
            z20Var.call(moment, Integer.valueOf(i));
        } else {
            this.f154063s.m65834c0(i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m142039g(final z20 z20Var, final Moment moment, Object obj, Object obj2, Object obj3) {
        final int iIntValue = ((Integer) obj2).intValue();
        final int iIntValue2 = ((Integer) obj3).intValue();
        bnl0.m105509E0((VDraweeView) obj, new View.OnClickListener() { // from class: l.htg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111535a.m142038f(z20Var, moment, iIntValue2, iIntValue, view);
            }
        });
    }
}
