package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.giftwalllocal.medallabel.MedalLabelPageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class epx implements iam<jpx> {

    /* JADX INFO: renamed from: a */
    public final MedalLabelPageView f95284a;

    /* JADX INFO: renamed from: b */
    public jpx<rwn0, epx> f95285b;

    /* JADX INFO: renamed from: c */
    public tox f95286c;

    public epx(Act act) {
        this.f95284a = MedalLabelPageView.m78171i0(act.inflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m121879f(String str) {
        this.f95285b.m146530e4(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m121880j(String str) {
        if (str.equals("locked")) {
            r1j0.m179420g(this.f95285b.m146526Z3() ? "暂未点亮该勋章，快去收集礼物吧～" : "该用户暂未点亮勋章，快去送她/他礼物吧～");
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f95284a.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(jpx jpxVar) {
        this.f95285b = jpxVar;
    }

    /* JADX INFO: renamed from: e */
    public View m121882e() {
        return this.f95284a;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m121883i(BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        this.f95285b.m146532g4(bLiveVoiceGiftItem);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m121884k(List<BLiveVoiceMedalWallItem> list) {
        this.f95284a.setListData(list);
    }

    /* JADX INFO: renamed from: r */
    public void m121885r() {
        tox toxVar = new tox(this.f95285b, new y20() { // from class: l.bpx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77829a.m121879f((String) obj);
            }
        }, new y20() { // from class: l.cpx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83038a.m121883i((BLiveVoiceGiftItem) obj);
            }
        }, new y20() { // from class: l.dpx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90094a.m121880j((String) obj);
            }
        });
        this.f95286c = toxVar;
        this.f95284a.m78174k0(toxVar);
        this.f95286c.m192099G(new ArrayList());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
