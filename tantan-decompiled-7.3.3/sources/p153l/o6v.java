package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class o6v extends dvs<q6v> {
    public o6v(ner nerVar, nus nusVar, VDraweeView vDraweeView) {
        super(nerVar, nusVar);
        q6v q6vVar = new q6v(vDraweeView);
        this.viewModel = q6vVar;
        mo52715C(q6vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ void m166296S2(String str) {
        ((q6v) this.viewModel).m175615e(TextUtils.equals(str, "tab_voice"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public /* synthetic */ void m166297T2(Boolean bool) {
        ((q6v) this.viewModel).m175616f(bool);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((q6v) this.viewModel).m175618r();
        duringCreated(m160238F2().LiveHomePageEvent.tabSelected().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.l6v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130289a.m166296S2((String) obj);
            }
        }));
        duringCreated(ppi0.m173207l().m173229y()).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.m6v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135033a.m166297T2((Boolean) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomeVoiceSelectTopic.notifySelectRoomSquare().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.n6v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140488a.m166299V2(((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public void m166298U2(View view) {
        evo0.m122805c();
        iqn0.m141677e(getAct(), new AnchorStartData.C11592a().m68752t("top_right").m68743k());
        ((q6v) this.viewModel).m175614c();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m166299V2(boolean z) {
        V v2 = this.viewModel;
        if (z) {
            ((q6v) v2).m175617i();
        } else {
            ((q6v) v2).m175614c();
        }
    }
}
