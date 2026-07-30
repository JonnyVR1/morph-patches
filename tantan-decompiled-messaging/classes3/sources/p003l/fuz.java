package p003l;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c3c0;
import l.j760;
import l.l6c0;
import l.qib0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p028v.VDraweeView;
import p028v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class fuz extends dac0<Media> {

    /* JADX INFO: renamed from: c */
    public final Act f3731c;

    /* JADX INFO: renamed from: d */
    public List<Media> f3732d;

    /* JADX INFO: renamed from: e */
    public e30<Media> f3733e;

    public fuz(Act act, e30<Media> e30Var) {
        this.f3731c = act;
        this.f3733e = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m4464L(int i, View view) {
        CoreModule.o.d().Ip(this.f3731c, true, "from_upload_pic", "from_complete_equity_guide");
        zvf0.u("e_invisible_photo_upload", this.f3731c.pageId(), new j760[]{vwb.Y("invisible_photo_location", Integer.valueOf(i + 1)), vwb.Y("need_photo_count", Integer.valueOf(3 - CoreModule.c.e0.na().pictures.size())), vwb.Y("invisible_photo_is_thumbnail", Boolean.TRUE)});
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: C */
    public int mo203C() {
        List<Media> list = this.f3732d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: D */
    public View mo204D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f3731c).inflate(l6c0.P4, viewGroup, false);
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo202A(View view, final Media media, int i, final int i2) {
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(y4c0.Z2);
        AppCompatImageView appCompatImageView = (VImage) view.findViewById(y4c0.W1);
        if (ura.e().d().I4()) {
            appCompatImageView.setImageResource(c3c0.X3);
        }
        User userP9 = CoreModule.c.e0.p9();
        if (m4467K(i2)) {
            qib0.G.P(vDraweeView, media.cover().profileMiddle().formatted(), 2, 32, Color.parseColor("#4c000000"));
            xdl0.E0(view, new View.OnClickListener() { // from class: l.buz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f2508a.m4464L(i2, view2);
                }
            });
            xdl0.M(appCompatImageView, true);
            zvf0.A("e_invisible_photo_upload", this.f3731c.pageId(), new j760[]{vwb.Y("invisible_photo_location", Integer.valueOf(i2 + 1)), vwb.Y("need_photo_count", Integer.valueOf(3 - CoreModule.c.e0.na().pictures.size())), vwb.Y("invisible_photo_is_thumbnail", Boolean.TRUE)});
            return;
        }
        qib0.G.L0(vDraweeView, media.cover().profileMiddle().formatted());
        vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(((Media) media.cover()).url));
        int size = userP9.pictures.size();
        final List<Media> listSubList = this.f3732d;
        if (size <= 2) {
            listSubList = listSubList.subList(0, userP9.pictures.size() - 1);
        }
        xdl0.E0(view, new View.OnClickListener() { // from class: l.cuz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f2811a.m4469N(media, listSubList, view2);
            }
        });
        xdl0.M(appCompatImageView, false);
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        return this.f3732d.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m4467K(int i) {
        if (!ura.e().d().Gi() && !ura.e().d().p0()) {
            return false;
        }
        User userP9 = CoreModule.c.e0.p9();
        return (userP9.pictures.size() == 1 && i >= 0) || (userP9.pictures.size() == 2 && i >= 1);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ boolean m4468M(Media media, int i, int i2, Intent intent) {
        if (!NullChecker.a(this.f3733e)) {
            return false;
        }
        this.f3733e.call(media);
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m4469N(final Media media, List list, View view) {
        CoreBusinessService coreBusinessServiceA = CoreModule.l.a();
        Act act = this.f3731c;
        String str = ((Media) media.cover()).url;
        if (!ura.e().d().Gi() && !ura.e().d().p0()) {
            list = this.f3732d;
        }
        coreBusinessServiceA.Zh(act, str, vwb.Q(list, new w9j() { // from class: l.duz
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return ((Media) ((Media) obj).cover()).url;
            }
        }), new a.a() { // from class: l.euz
            /* JADX INFO: renamed from: a */
            public final boolean m3943a(int i, int i2, Intent intent) {
                return this.f3393a.m4468M(media, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m4470O(List<Media> list) {
        this.f3732d = list;
    }
}
