package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.operation.OperationCenterAct;
import com.p1.mobile.putong.data.IntlOperationArticles;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.dac0;
import l.f6c0;
import l.o7r;
import l.u4c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yq50 extends dac0<IntlOperationArticles> {

    /* JADX INFO: renamed from: c */
    public List<IntlOperationArticles> f23034c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public OperationCenterAct f23035d;

    public yq50(OperationCenterAct operationCenterAct) {
        this.f23035d = operationCenterAct;
    }

    /* JADX INFO: renamed from: C */
    public int m26877C() {
        return this.f23034c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m26878D(ViewGroup viewGroup, int i) {
        return o7r.a(this.f23035d).inflate(f6c0.p8, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m26876A(View view, final IntlOperationArticles intlOperationArticles, int i, int i2) {
        VDraweeView vDraweeViewFindViewById = view.findViewById(u4c0.L5);
        view.findViewById(u4c0.Pd).setText(intlOperationArticles.title);
        vDraweeViewFindViewById.setImageURI(intlOperationArticles.cover.url);
        xdl0.E0(view, new View.OnClickListener() { // from class: l.xq50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f22401a.m26881H(intlOperationArticles, view2);
            }
        });
        zvf0.y("e_tantan_story", this.f23035d.pageId(), Collections.singletonMap("intl_story_id", intlOperationArticles.id));
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public IntlOperationArticles getItem(int i) {
        return this.f23034c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m26881H(IntlOperationArticles intlOperationArticles, View view) {
        if (NullChecker.a(intlOperationArticles)) {
            zvf0.s("e_tantan_story", this.f23035d.pageId(), Collections.singletonMap("intl_story_id", intlOperationArticles.id));
            this.f23035d.startActivity(AccessTokenWebViewAct.Z1(this.f23035d, "", intlOperationArticles.jumpUrl));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m26882I(List<IntlOperationArticles> list) {
        this.f23034c.clear();
        this.f23034c.addAll(list);
        notifyDataSetChanged();
    }
}
