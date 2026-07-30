package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterImageView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class trg extends asg {
    public trg(Act act, xrg xrgVar, FeedCenterImageView feedCenterImageView) {
        super(act, xrgVar, feedCenterImageView);
    }

    @Override // p149l.asg
    /* JADX INFO: renamed from: c */
    public void mo98593c(int i, final Moment moment, HashMap<String, Boolean> map) {
        String str;
        final f30<Moment, Integer> f30Var = this.f71441s.f41821E;
        m98592b(this.f71434l, false);
        m98592b(this.f71426d, false);
        m98592b(this.f71433k, false);
        if (u2h.m191495d()) {
            this.f71437o.stopAnimation();
        }
        m98592b(this.f71431i, false);
        m98592b(this.f71432j, true);
        List<Media> list = moment.media;
        if (i == 0) {
            str = "follow";
        } else {
            str = i == 1 ? "nearby" : "";
        }
        bsg.m103714e(moment, list, this.f71432j, str, new g30() { // from class: l.rrg
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f160743a.m190417g(f30Var, moment, obj, obj2, obj3);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m190416f(f30 f30Var, Moment moment, int i, int i2, View view) {
        if (NullChecker.m81303a(f30Var)) {
            f30Var.call(moment, Integer.valueOf(i));
        } else {
            this.f71441s.m64651c0(i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m190417g(final f30 f30Var, final Moment moment, Object obj, Object obj2, Object obj3) {
        final int iIntValue = ((Integer) obj2).intValue();
        final int iIntValue2 = ((Integer) obj3).intValue();
        xdl0.m208329E0((VDraweeView) obj, new View.OnClickListener() { // from class: l.srg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166089a.m190416f(f30Var, moment, iIntValue2, iIntValue, view);
            }
        });
    }
}
