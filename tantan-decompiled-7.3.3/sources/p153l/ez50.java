package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.operation.OperationCenterAct;
import com.p051p1.mobile.putong.data.IntlOperationArticles;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ez50 extends jic0<IntlOperationArticles> {

    /* JADX INFO: renamed from: c */
    public List<IntlOperationArticles> f96564c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public OperationCenterAct f96565d;

    public ez50(OperationCenterAct operationCenterAct) {
        this.f96565d = operationCenterAct;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f96564c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(this.f96565d).inflate(kec0.f126118w8, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final IntlOperationArticles intlOperationArticles, int i, int i2) {
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(adc0.f70031N5);
        ((VText) view.findViewById(adc0.f70124Sd)).setText(intlOperationArticles.title);
        vDraweeView.setImageURI(intlOperationArticles.cover.url);
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.dz50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f91324a.m123340H(intlOperationArticles, view2);
            }
        });
        i4g0.m138527y("e_tantan_story", this.f96565d.pageId(), Collections.singletonMap("intl_story_id", intlOperationArticles.f39610id));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public IntlOperationArticles getItem(int i) {
        return this.f96564c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m123340H(IntlOperationArticles intlOperationArticles, View view) {
        if (NullChecker.m82486a(intlOperationArticles)) {
            i4g0.m138521s("e_tantan_story", this.f96565d.pageId(), Collections.singletonMap("intl_story_id", intlOperationArticles.f39610id));
            this.f96565d.startActivity(AccessTokenWebViewAct.m81333a2(this.f96565d, "", intlOperationArticles.jumpUrl));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m123341I(List<IntlOperationArticles> list) {
        this.f96564c.clear();
        this.f96564c.addAll(list);
        notifyDataSetChanged();
    }
}
