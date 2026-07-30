package com.p051p1.mobile.putong.live.livingroom.archi.frag;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import p153l.AbstractC19518q4;
import p153l.ajt;
import p153l.b4o0;
import p153l.fhw;
import p153l.jlm0;
import p153l.o5c;
import p153l.oo2;
import p153l.r230;
import p153l.szn0;
import p153l.x20;
import p153l.xct;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: z */
    public AbstractC19518q4 f48583z;

    public LiveFrag() {
        creates(new y20() { // from class: l.wfs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188885a.m72971Q4((Bundle) obj);
            }
        }, new x20() { // from class: l.xfs
            @Override // p153l.x20
            public final void call() {
                this.f194089a.m72972S4();
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public static LiveFrag m72970O4(AnchorStartData anchorStartData) {
        LiveFrag liveFrag = new LiveFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LIVE_ANCHOR_START_DATA", anchorStartData);
        liveFrag.setArguments(bundle);
        return liveFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public void m72971Q4(Bundle bundle) {
        this.f48583z.mo102505P3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public void m72972S4() {
        AbstractC19518q4 abstractC19518q4 = this.f48583z;
        if (abstractC19518q4 != null) {
            abstractC19518q4.mo70300n();
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final jlm0 m72973P4(oo2 oo2Var, AnchorStartData anchorStartData) {
        if (!(oo2Var instanceof jlm0)) {
            return new jlm0(new szn0(), new ajt(anchorStartData.anchorSource));
        }
        jlm0 jlm0Var = (jlm0) oo2Var;
        if (oo2Var.m168456H0() != null) {
            fhw.m125605a("[live][voice]", "" + oo2Var.m168456H0().hashCode());
        }
        return jlm0Var;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m72974R4(AnchorStartData anchorStartData) {
        this.f48583z = new b4o0(this, anchorStartData, m72973P4((anchorStartData == null || !anchorStartData.isFromFloatWindow) ? null : o5c.m166095a().m166096b(), anchorStartData));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [l.oo2, l.vp20] */
    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        r230.m179475p("context_square");
        r230.m179475p("context_common");
        r230.m179475p("context_live_activities");
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        AnchorStartData anchorStartData = (AnchorStartData) arguments.getSerializable("LIVE_ANCHOR_START_DATA");
        String str = anchorStartData.anchorSource;
        String str2 = anchorStartData.type;
        if (str2 == null) {
            str2 = "type_normal_live";
        }
        if (str2.equals("type_voice_live")) {
            m72974R4(anchorStartData);
        } else {
            this.f48583z = new xct(this, str, anchorStartData);
        }
        this.f48583z.m213810E2().m202199w(anchorStartData.traceId);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f48583z.mo102503N3();
    }

    /* JADX INFO: renamed from: o */
    public boolean m72975o() {
        return this.f48583z.mo102507o();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f48583z.mo102504O3(i, i2, intent);
    }
}
