package p007l;

import android.view.View;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import l.f30;
import l.g30;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class trg extends asg {
    public trg(Act act, xrg xrgVar, FeedCenterImageView feedCenterImageView) {
        super(act, xrgVar, feedCenterImageView);
    }

    @Override // p007l.asg
    /* JADX INFO: renamed from: c */
    public void mo8592c(int i, final Moment moment, HashMap<String, Boolean> map) {
        String str;
        final f30<Moment, Integer> f30Var = this.f5831s.f3282E;
        m8591b(this.f5824l, false);
        m8591b(this.f5816d, false);
        m8591b(this.f5823k, false);
        if (u2h.m14719d()) {
            this.f5827o.stopAnimation();
        }
        m8591b(this.f5821i, false);
        m8591b(this.f5822j, true);
        List<Media> list = moment.media;
        if (i == 0) {
            str = "follow";
        } else {
            str = i == 1 ? "nearby" : "";
        }
        bsg.m9027e(moment, list, this.f5822j, str, new g30() { // from class: l.rrg
            /* JADX INFO: renamed from: a */
            public final void m13952a(Object obj, Object obj2, Object obj3) {
                this.f12719a.m14621g(f30Var, moment, obj, obj2, obj3);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m14620f(f30 f30Var, Moment moment, int i, int i2, View view) {
        if (NullChecker.a(f30Var)) {
            f30Var.call(moment, Integer.valueOf(i));
        } else {
            this.f5831s.m5745c0(i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m14621g(final f30 f30Var, final Moment moment, Object obj, Object obj2, Object obj3) {
        final int iIntValue = ((Integer) obj2).intValue();
        final int iIntValue2 = ((Integer) obj3).intValue();
        xdl0.E0((VDraweeView) obj, new View.OnClickListener() { // from class: l.srg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13039a.m14620f(f30Var, moment, iIntValue2, iIntValue, view);
            }
        });
    }
}
