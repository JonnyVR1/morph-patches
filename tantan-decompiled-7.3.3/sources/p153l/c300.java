package p153l;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class c300 extends jic0<Media> {

    /* JADX INFO: renamed from: c */
    public final Act f79556c;

    /* JADX INFO: renamed from: d */
    public List<Media> f79557d;

    /* JADX INFO: renamed from: e */
    public y20<Media> f79558e;

    public c300(Act act, y20<Media> y20Var) {
        this.f79556c = act;
        this.f79558e = y20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m107743L(int i, View view) {
        CoreModule.f18276o.m132214d().mo34706Ip(this.f79556c, true, "from_upload_pic", "from_complete_equity_guide");
        i4g0.m138523u("e_invisible_photo_upload", this.f79556c.pageId(), jyb.m147494Y("invisible_photo_location", Integer.valueOf(i + 1)), jyb.m147494Y("need_photo_count", Integer.valueOf(3 - CoreModule.f18264c.f20381e0.m116593na().pictures.size())), jyb.m147494Y("invisible_photo_is_thumbnail", Boolean.TRUE));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        List<Media> list = this.f79557d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f79556c).inflate(qec0.f156921P4, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final Media media, int i, final int i2) {
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(edc0.f93319Z2);
        VImage vImage = (VImage) view.findViewById(edc0.f93300W1);
        if (gta.m132210e().m132214d().mo34702I4()) {
            vImage.setImageResource(ibc0.f113947X3);
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (m107746K(i2)) {
            uqb0.f180374G.m127122P(vDraweeView, media.cover().profileMiddle().formatted(), 2, 32, Color.parseColor("#4c000000"));
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.y200
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f197164a.m107743L(i2, view2);
                }
            });
            bnl0.m105524M(vImage, true);
            i4g0.m138492A("e_invisible_photo_upload", this.f79556c.pageId(), jyb.m147494Y("invisible_photo_location", Integer.valueOf(i2 + 1)), jyb.m147494Y("need_photo_count", Integer.valueOf(3 - CoreModule.f18264c.f20381e0.m116593na().pictures.size())), jyb.m147494Y("invisible_photo_is_thumbnail", Boolean.TRUE));
            return;
        }
        uqb0.f180374G.m127115L0(vDraweeView, media.cover().profileMiddle().formatted());
        vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(media.cover().url));
        int size = userM116600p9.pictures.size();
        final List<Media> listSubList = this.f79557d;
        if (size <= 2) {
            listSubList = listSubList.subList(0, userM116600p9.pictures.size() - 1);
        }
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.z200
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f202617a.m107748N(media, listSubList, view2);
            }
        });
        bnl0.m105524M(vImage, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        return this.f79557d.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m107746K(int i) {
        if (!gta.m132210e().m132214d().mo34695Gi() && !gta.m132210e().m132214d().mo34902p0()) {
            return false;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return (userM116600p9.pictures.size() == 1 && i >= 0) || (userM116600p9.pictures.size() == 2 && i >= 1);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ boolean m107747M(Media media, int i, int i2, Intent intent) {
        if (!NullChecker.m82486a(this.f79558e)) {
            return false;
        }
        this.f79558e.call(media);
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m107748N(final Media media, List list, View view) {
        CoreBusinessService coreBusinessServiceM143405a = CoreModule.f18273l.m143405a();
        Act act = this.f79556c;
        String str = media.cover().url;
        if (!gta.m132210e().m132214d().mo34695Gi() && !gta.m132210e().m132214d().mo34902p0()) {
            list = this.f79557d;
        }
        coreBusinessServiceM143405a.mo34461Zh(act, str, jyb.m147486Q(list, new qcj() { // from class: l.a300
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Media) obj).cover().url;
            }
        }), new C4468a.a() { // from class: l.b300
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f74692a.m107747M(media, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m107749O(List<Media> list) {
        this.f79557d = list;
    }
}
