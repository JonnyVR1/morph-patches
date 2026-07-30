package p149l;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes3.dex */
public class fuz extends dac0<Media> {

    /* JADX INFO: renamed from: c */
    public final Act f99371c;

    /* JADX INFO: renamed from: d */
    public List<Media> f99372d;

    /* JADX INFO: renamed from: e */
    public e30<Media> f99373e;

    public fuz(Act act, e30<Media> e30Var) {
        this.f99371c = act;
        this.f99373e = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m123233L(int i, View view) {
        CoreModule.f17557o.m195057d().mo33703Ip(this.f99371c, true, "from_upload_pic", "from_complete_equity_guide");
        zvf0.m220399u("e_invisible_photo_upload", this.f99371c.pageId(), vwb.m200311Y("invisible_photo_location", Integer.valueOf(i + 1)), vwb.m200311Y("need_photo_count", Integer.valueOf(3 - CoreModule.f17545c.f19639e0.m169520na().pictures.size())), vwb.m200311Y("invisible_photo_is_thumbnail", Boolean.TRUE));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        List<Media> list = this.f99372d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f99371c).inflate(l6c0.f126365P4, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final Media media, int i, final int i2) {
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(y4c0.f196084Z2);
        VImage vImage = (VImage) view.findViewById(y4c0.f196065W1);
        if (ura.m195053e().m195057d().mo33699I4()) {
            vImage.setImageResource(c3c0.f78672X3);
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (m123236K(i2)) {
            qib0.f154691G.m102338P(vDraweeView, media.cover().profileMiddle().formatted(), 2, 32, Color.parseColor("#4c000000"));
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.buz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f77386a.m123233L(i2, view2);
                }
            });
            xdl0.m208344M(vImage, true);
            zvf0.m220368A("e_invisible_photo_upload", this.f99371c.pageId(), vwb.m200311Y("invisible_photo_location", Integer.valueOf(i2 + 1)), vwb.m200311Y("need_photo_count", Integer.valueOf(3 - CoreModule.f17545c.f19639e0.m169520na().pictures.size())), vwb.m200311Y("invisible_photo_is_thumbnail", Boolean.TRUE));
            return;
        }
        qib0.f154691G.m102331L0(vDraweeView, media.cover().profileMiddle().formatted());
        vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(media.cover().url));
        int size = userM169527p9.pictures.size();
        final List<Media> listSubList = this.f99372d;
        if (size <= 2) {
            listSubList = listSubList.subList(0, userM169527p9.pictures.size() - 1);
        }
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.cuz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f82610a.m123238N(media, listSubList, view2);
            }
        });
        xdl0.m208344M(vImage, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        return this.f99372d.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m123236K(int i) {
        if (!ura.m195053e().m195057d().mo33692Gi() && !ura.m195053e().m195057d().mo33899p0()) {
            return false;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return (userM169527p9.pictures.size() == 1 && i >= 0) || (userM169527p9.pictures.size() == 2 && i >= 1);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ boolean m123237M(Media media, int i, int i2, Intent intent) {
        if (!NullChecker.m81303a(this.f99373e)) {
            return false;
        }
        this.f99373e.call(media);
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m123238N(final Media media, List list, View view) {
        CoreBusinessService coreBusinessServiceM94651a = CoreModule.f17554l.m94651a();
        Act act = this.f99371c;
        String str = media.cover().url;
        if (!ura.m195053e().m195057d().mo33692Gi() && !ura.m195053e().m195057d().mo33899p0()) {
            list = this.f99372d;
        }
        coreBusinessServiceM94651a.mo33458Zh(act, str, vwb.m200303Q(list, new w9j() { // from class: l.duz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Media) obj).cover().url;
            }
        }), new C4317a.a() { // from class: l.euz
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f93295a.m123237M(media, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m123239O(List<Media> list) {
        this.f99372d = list;
    }
}
