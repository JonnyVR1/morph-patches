package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.operation.OperationCenterAct;
import com.p046p1.mobile.putong.data.IntlOperationArticles;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yq50 extends dac0<IntlOperationArticles> {

    /* JADX INFO: renamed from: c */
    public List<IntlOperationArticles> f199526c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public OperationCenterAct f199527d;

    public yq50(OperationCenterAct operationCenterAct) {
        this.f199527d = operationCenterAct;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f199526c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(this.f199527d).inflate(f6c0.f95945p8, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final IntlOperationArticles intlOperationArticles, int i, int i2) {
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(u4c0.f173909L5);
        ((VText) view.findViewById(u4c0.f173985Pd)).setText(intlOperationArticles.title);
        vDraweeView.setImageURI(intlOperationArticles.cover.url);
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.xq50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f193984a.m215710H(intlOperationArticles, view2);
            }
        });
        zvf0.m220403y("e_tantan_story", this.f199527d.pageId(), Collections.singletonMap("intl_story_id", intlOperationArticles.f38762id));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public IntlOperationArticles getItem(int i) {
        return this.f199526c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m215710H(IntlOperationArticles intlOperationArticles, View view) {
        if (NullChecker.m81303a(intlOperationArticles)) {
            zvf0.m220397s("e_tantan_story", this.f199527d.pageId(), Collections.singletonMap("intl_story_id", intlOperationArticles.f38762id));
            this.f199527d.startActivity(AccessTokenWebViewAct.m80150Z1(this.f199527d, "", intlOperationArticles.jumpUrl));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m215711I(List<IntlOperationArticles> list) {
        this.f199526c.clear();
        this.f199526c.addAll(list);
        notifyDataSetChanged();
    }
}
